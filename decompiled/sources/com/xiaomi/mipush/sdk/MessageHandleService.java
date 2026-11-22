package com.xiaomi.mipush.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.PushMessageHandler;
import com.xiaomi.push.af;
import com.xiaomi.push.du;
import com.xiaomi.push.ee;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class MessageHandleService extends BaseService {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentLinkedQueue<a> f14366a = new ConcurrentLinkedQueue<>();

    /* renamed from: a, reason: collision with other field name */
    private static ExecutorService f100a = new ThreadPoolExecutor(1, 1, 15, TimeUnit.SECONDS, new LinkedBlockingQueue());

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static void startService(final Context context) {
        final Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) MessageHandleService.class));
        af.a(context).a(new Runnable() { // from class: com.xiaomi.mipush.sdk.MessageHandleService.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    context.startService(intent);
                } catch (Exception e) {
                    com.xiaomi.channel.commonutils.logger.b.m11781a(e.getMessage());
                }
            }
        });
    }

    public static void addJob(Context context, a aVar) {
        if (aVar != null) {
            f14366a.add(aVar);
            b(context);
            startService(context);
        }
    }

    private static void b(final Context context) {
        if (f100a.isShutdown()) {
            return;
        }
        f100a.execute(new Runnable() { // from class: com.xiaomi.mipush.sdk.MessageHandleService.2
            @Override // java.lang.Runnable
            public void run() {
                MessageHandleService.c(context);
            }
        });
    }

    protected static void a(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context) {
        try {
            a(context, f14366a.poll());
        } catch (RuntimeException e) {
            com.xiaomi.channel.commonutils.logger.b.a(e);
        }
    }

    static void a(Context context, a aVar) {
        String[] stringArrayExtra;
        if (aVar == null) {
            return;
        }
        try {
            PushMessageReceiver m11799a = aVar.m11799a();
            Intent a2 = aVar.a();
            int intExtra = a2.getIntExtra("message_type", 1);
            if (intExtra != 1) {
                if (intExtra != 3) {
                    if (intExtra == 5 && PushMessageHelper.ERROR_TYPE_NEED_PERMISSION.equals(a2.getStringExtra(PushMessageHelper.ERROR_TYPE)) && (stringArrayExtra = a2.getStringArrayExtra("error_message")) != null) {
                        com.xiaomi.channel.commonutils.logger.b.e("begin execute onRequirePermissions, lack of necessary permissions");
                        m11799a.onRequirePermissions(context, stringArrayExtra);
                        return;
                    }
                    return;
                }
                MiPushCommandMessage miPushCommandMessage = (MiPushCommandMessage) a2.getSerializableExtra(PushMessageHelper.KEY_COMMAND);
                com.xiaomi.channel.commonutils.logger.b.e("(Local) begin execute onCommandResult, command=" + miPushCommandMessage.getCommand() + ", resultCode=" + miPushCommandMessage.getResultCode() + ", reason=" + miPushCommandMessage.getReason());
                m11799a.onCommandResult(context, miPushCommandMessage);
                if (TextUtils.equals(miPushCommandMessage.getCommand(), ee.COMMAND_REGISTER.f441a)) {
                    m11799a.onReceiveRegisterResult(context, miPushCommandMessage);
                    PushMessageHandler.a(context, miPushCommandMessage);
                    if (miPushCommandMessage.getResultCode() == 0) {
                        f.b(context);
                        return;
                    }
                    return;
                }
                return;
            }
            PushMessageHandler.a a3 = t.a(context).a(a2);
            int intExtra2 = a2.getIntExtra("eventMessageType", -1);
            if (a3 == null) {
                com.xiaomi.channel.commonutils.logger.b.d("MessageHandleService", "no message from raw for receiver");
                return;
            }
            if (!(a3 instanceof MiPushMessage)) {
                if (!(a3 instanceof MiPushCommandMessage)) {
                    com.xiaomi.channel.commonutils.logger.b.d("MessageHandleService", "unknown raw message: " + a3);
                    return;
                }
                MiPushCommandMessage miPushCommandMessage2 = (MiPushCommandMessage) a3;
                com.xiaomi.channel.commonutils.logger.b.d("MessageHandleService", "begin execute onCommandResult, command=" + miPushCommandMessage2.getCommand() + ", resultCode=" + miPushCommandMessage2.getResultCode() + ", reason=" + miPushCommandMessage2.getReason());
                m11799a.onCommandResult(context, miPushCommandMessage2);
                if (TextUtils.equals(miPushCommandMessage2.getCommand(), ee.COMMAND_REGISTER.f441a)) {
                    m11799a.onReceiveRegisterResult(context, miPushCommandMessage2);
                    PushMessageHandler.a(context, miPushCommandMessage2);
                    if (miPushCommandMessage2.getResultCode() == 0) {
                        f.b(context);
                        return;
                    }
                    return;
                }
                return;
            }
            MiPushMessage miPushMessage = (MiPushMessage) a3;
            if (!miPushMessage.isArrivedMessage()) {
                m11799a.onReceiveMessage(context, miPushMessage);
            }
            if (miPushMessage.getPassThrough() == 1) {
                du.a(context.getApplicationContext()).a(context.getPackageName(), a2, 2004, (String) null);
                com.xiaomi.channel.commonutils.logger.b.d("MessageHandleService", "begin execute onReceivePassThroughMessage from " + miPushMessage.getMessageId());
                m11799a.onReceivePassThroughMessage(context, miPushMessage);
            } else {
                if (!miPushMessage.isNotified()) {
                    com.xiaomi.channel.commonutils.logger.b.d("MessageHandleService", "begin execute onNotificationMessageArrived from " + miPushMessage.getMessageId());
                    m11799a.onNotificationMessageArrived(context, miPushMessage);
                    return;
                }
                if (intExtra2 == 1000) {
                    du.a(context.getApplicationContext()).a(context.getPackageName(), a2, 1007, (String) null);
                } else {
                    du.a(context.getApplicationContext()).a(context.getPackageName(), a2, 3007, (String) null);
                }
                com.xiaomi.channel.commonutils.logger.b.d("MessageHandleService", "begin execute onNotificationMessageClicked from\u3000" + miPushMessage.getMessageId());
                m11799a.onNotificationMessageClicked(context, miPushMessage);
            }
        } catch (RuntimeException e) {
            com.xiaomi.channel.commonutils.logger.b.a("MessageHandleService", e);
        }
    }

    @Override // com.xiaomi.mipush.sdk.BaseService, android.app.Service
    public void onStart(Intent intent, int i) {
        super.onStart(intent, i);
    }

    @Override // com.xiaomi.mipush.sdk.BaseService
    /* renamed from: a */
    protected boolean mo11805a() {
        ConcurrentLinkedQueue<a> concurrentLinkedQueue = f14366a;
        return concurrentLinkedQueue != null && concurrentLinkedQueue.size() > 0;
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Intent f14369a;

        /* renamed from: a, reason: collision with other field name */
        private PushMessageReceiver f102a;

        public a(Intent intent, PushMessageReceiver pushMessageReceiver) {
            this.f102a = pushMessageReceiver;
            this.f14369a = intent;
        }

        /* renamed from: a, reason: collision with other method in class */
        public PushMessageReceiver m11799a() {
            return this.f102a;
        }

        public Intent a() {
            return this.f14369a;
        }
    }
}
