package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.MessageHandleService;
import com.xiaomi.mipush.sdk.MiPushClient;
import com.xiaomi.push.du;
import com.xiaomi.push.ee;
import com.xiaomi.push.gk;
import com.xiaomi.push.hq;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class PushMessageHandler extends BaseService {

    /* renamed from: a, reason: collision with root package name */
    private static List<MiPushClient.ICallbackResult> f14377a = new ArrayList();
    private static List<MiPushClient.MiPushClientCallback> b = new ArrayList();

    /* renamed from: a, reason: collision with other field name */
    private static ThreadPoolExecutor f115a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    interface a extends Serializable {
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) PushMessageHandler.class));
        try {
            context.startService(intent);
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11782a("PushMessageHandler", e.getMessage());
        }
    }

    public static void a(Context context, Intent intent) {
        com.xiaomi.channel.commonutils.logger.b.m11786b("PushMessageHandler", "addjob PushMessageHandler " + intent);
        if (intent != null) {
            c(context, intent);
            a(context);
        }
    }

    private static void c(final Context context, final Intent intent) {
        if (intent == null || f115a.isShutdown()) {
            com.xiaomi.channel.commonutils.logger.b.d("PushMessageHandler", "-->scheduleJob() fail, case".concat(intent == null ? "0" : "1"));
        } else {
            f115a.execute(new Runnable() { // from class: com.xiaomi.mipush.sdk.PushMessageHandler.1
                @Override // java.lang.Runnable
                public void run() {
                    PushMessageHandler.b(context, intent);
                }
            });
        }
    }

    protected static void a(MiPushClient.MiPushClientCallback miPushClientCallback) {
        synchronized (b) {
            if (!b.contains(miPushClientCallback)) {
                b.add(miPushClientCallback);
            }
        }
    }

    protected static void a(MiPushClient.ICallbackResult iCallbackResult) {
        synchronized (f14377a) {
            if (!f14377a.contains(iCallbackResult)) {
                f14377a.add(iCallbackResult);
            }
        }
    }

    protected static void a() {
        synchronized (b) {
            b.clear();
        }
    }

    protected static void b() {
        synchronized (f14377a) {
            f14377a.clear();
        }
    }

    protected static void b(Context context, Intent intent) {
        ResolveInfo resolveInfo;
        boolean z = false;
        try {
            intent.putExtra("pmh_handle_time", System.currentTimeMillis());
            z = intent.getBooleanExtra("is_clicked_activity_call", false);
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m11782a("PushMessageHandler", "intent unparcel error:" + th);
        }
        try {
            com.xiaomi.channel.commonutils.logger.b.m11783a("PushMessageHandler", "-->onHandleIntent(): action=", intent.getAction());
        } catch (Throwable th2) {
            try {
                com.xiaomi.channel.commonutils.logger.b.a("PushMessageHandler", th2);
                du.a(context).a(context.getPackageName(), intent, "10");
                if (!z) {
                    return;
                }
            } finally {
                if (z) {
                    b(context);
                }
            }
        }
        if ("com.xiaomi.mipush.SEND_TINYDATA".equals(intent.getAction())) {
            gk gkVar = new gk();
            hq.a(gkVar, intent.getByteArrayExtra("mipush_payload"));
            com.xiaomi.channel.commonutils.logger.b.m11786b("PushMessageHandler", "PushMessageHandler.onHandleIntent " + gkVar.d());
            MiTinyDataClient.upload(context, gkVar);
        } else if (1 == PushMessageHelper.getPushMode(context)) {
            if (m11804b()) {
                com.xiaomi.channel.commonutils.logger.b.c("PushMessageHandler", "receive a message before application calling initialize");
                if (z) {
                } else {
                    return;
                }
            } else {
                a a2 = t.a(context).a(intent);
                if (a2 != null) {
                    a(context, a2);
                }
            }
        } else if (!"com.xiaomi.mipush.sdk.SYNC_LOG".equals(intent.getAction())) {
            Intent intent2 = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
            intent2.setPackage(context.getPackageName());
            intent2.putExtras(intent);
            try {
                List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent2, 32);
                if (queryBroadcastReceivers != null) {
                    Iterator<ResolveInfo> it = queryBroadcastReceivers.iterator();
                    while (it.hasNext()) {
                        resolveInfo = it.next();
                        if (resolveInfo.activityInfo != null && resolveInfo.activityInfo.packageName.equals(context.getPackageName()) && PushMessageReceiver.class.isAssignableFrom(com.xiaomi.push.s.a(context, resolveInfo.activityInfo.name))) {
                            break;
                        }
                    }
                }
                resolveInfo = null;
                if (resolveInfo != null) {
                    a(context, intent2, resolveInfo, z);
                } else {
                    com.xiaomi.channel.commonutils.logger.b.c("PushMessageHandler", "cannot find the receiver to handler this message, check your manifest");
                    du.a(context).a(context.getPackageName(), intent, "11");
                }
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a("PushMessageHandler", e);
                du.a(context).a(context.getPackageName(), intent, "9");
            }
        }
        if (!z) {
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setAction("action_clicked_activity_finish");
            context.sendBroadcast(intent, c.a(context));
        } catch (Exception e) {
            com.xiaomi.channel.commonutils.logger.b.m11782a("PushMessageHandler", "callback sync error" + e);
        }
    }

    private static void a(Context context, Intent intent, ResolveInfo resolveInfo, boolean z) {
        try {
            MessageHandleService.a aVar = new MessageHandleService.a(intent, (PushMessageReceiver) com.xiaomi.push.s.a(context, resolveInfo.activityInfo.name).newInstance());
            if (z) {
                MessageHandleService.a(context.getApplicationContext(), aVar);
            } else {
                MessageHandleService.addJob(context.getApplicationContext(), aVar);
            }
            MessageHandleService.a(context, new Intent(context.getApplicationContext(), (Class<?>) MessageHandleService.class));
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.a(th);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public static boolean m11804b() {
        return b.isEmpty();
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
        c(getApplicationContext(), intent);
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a, reason: collision with other method in class */
    protected boolean mo11805a() {
        ThreadPoolExecutor threadPoolExecutor = f115a;
        return (threadPoolExecutor == null || threadPoolExecutor.getQueue() == null || f115a.getQueue().size() <= 0) ? false : true;
    }

    public static void a(Context context, a aVar) {
        if (aVar instanceof MiPushMessage) {
            a(context, (MiPushMessage) aVar);
            return;
        }
        if (aVar instanceof MiPushCommandMessage) {
            MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) aVar;
            String command = miPushCommandMessage.getCommand();
            String str = null;
            if (ee.COMMAND_REGISTER.f441a.equals(command)) {
                List<String> commandArguments = miPushCommandMessage.getCommandArguments();
                if (commandArguments != null && !commandArguments.isEmpty()) {
                    str = commandArguments.get(0);
                }
                a(miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (ee.COMMAND_SET_ALIAS.f441a.equals(command) || ee.COMMAND_UNSET_ALIAS.f441a.equals(command) || ee.COMMAND_SET_ACCEPT_TIME.f441a.equals(command)) {
                a(context, miPushCommandMessage.getCategory(), command, miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), miPushCommandMessage.getCommandArguments());
                return;
            }
            if (ee.COMMAND_SUBSCRIBE_TOPIC.f441a.equals(command)) {
                List<String> commandArguments2 = miPushCommandMessage.getCommandArguments();
                if (commandArguments2 != null && !commandArguments2.isEmpty()) {
                    str = commandArguments2.get(0);
                }
                a(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
                return;
            }
            if (ee.COMMAND_UNSUBSCRIBE_TOPIC.f441a.equals(command)) {
                List<String> commandArguments3 = miPushCommandMessage.getCommandArguments();
                if (commandArguments3 != null && !commandArguments3.isEmpty()) {
                    str = commandArguments3.get(0);
                }
                b(context, miPushCommandMessage.getCategory(), miPushCommandMessage.getResultCode(), miPushCommandMessage.getReason(), str);
            }
        }
    }

    public static void a(Context context, MiPushMessage miPushMessage) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(miPushMessage.getCategory(), miPushClientCallback.getCategory())) {
                    miPushClientCallback.onReceiveMessage(miPushMessage.getContent(), miPushMessage.getAlias(), miPushMessage.getTopic(), miPushMessage.isNotified());
                    miPushClientCallback.onReceiveMessage(miPushMessage);
                }
            }
        }
    }

    public static void a(long j, String str, String str2) {
        synchronized (b) {
            Iterator<MiPushClient.MiPushClientCallback> it = b.iterator();
            while (it.hasNext()) {
                it.next().onInitializeResult(j, str, str2);
            }
        }
    }

    protected static void a(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onSubscribeResult(j, str2, str3);
                }
            }
        }
    }

    protected static void b(Context context, String str, long j, String str2, String str3) {
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    miPushClientCallback.onUnsubscribeResult(j, str2, str3);
                }
            }
        }
    }

    protected static void a(Context context, String str, String str2, long j, String str3, List<String> list) {
        String str4;
        long j2;
        String str5;
        List<String> list2;
        synchronized (b) {
            for (MiPushClient.MiPushClientCallback miPushClientCallback : b) {
                if (a(str, miPushClientCallback.getCategory())) {
                    str4 = str2;
                    j2 = j;
                    str5 = str3;
                    list2 = list;
                    miPushClientCallback.onCommandResult(str4, j2, str5, list2);
                } else {
                    str4 = str2;
                    j2 = j;
                    str5 = str3;
                    list2 = list;
                }
                str2 = str4;
                j = j2;
                str3 = str5;
                list = list2;
            }
        }
    }

    protected static boolean a(String str, String str2) {
        return (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) || TextUtils.equals(str, str2);
    }

    protected static void a(Context context, MiPushCommandMessage miPushCommandMessage) {
        synchronized (f14377a) {
            for (MiPushClient.ICallbackResult iCallbackResult : f14377a) {
                if (iCallbackResult instanceof MiPushClient.UPSRegisterCallBack) {
                    MiPushClient.TokenResult tokenResult = new MiPushClient.TokenResult();
                    if (miPushCommandMessage != null && miPushCommandMessage.getCommandArguments() != null && miPushCommandMessage.getCommandArguments().size() > 0) {
                        tokenResult.setResultCode(miPushCommandMessage.getResultCode());
                        tokenResult.setToken(miPushCommandMessage.getCommandArguments().get(0));
                    }
                    iCallbackResult.onResult(tokenResult);
                }
            }
        }
    }
}
