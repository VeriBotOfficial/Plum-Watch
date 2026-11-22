package com.vivo.push.util;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import java.security.PublicKey;
import java.util.HashMap;

/* compiled from: BaseConvertMsgToIntent.java */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    protected String f14155a;
    protected long b;
    protected Context c;
    protected NotifyArriveCallbackByUser d;

    protected abstract int a();

    protected abstract PendingIntent a(Context context, Intent intent);

    protected abstract Intent a(Context context, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser);

    protected static void a(Intent intent, Context context) {
        try {
            String a2 = com.vivo.push.g.b.a().a(context).a("com.vivo.pushservice");
            PublicKey a3 = com.vivo.push.g.b.a().a(context).a();
            if (TextUtils.isEmpty(a2)) {
                a2 = "com.vivo.pushservice";
            }
            intent.putExtra("security_avoid_pull_rsa", a2);
            intent.putExtra("security_avoid_rsa_public_key", a3 == null ? "com.vivo.pushservice" : ab.a(a3));
        } catch (Exception e) {
            t.a("BaseNotifyClickIntentParam", "pushNotificationBySystem encrypt ：" + e.getMessage());
            intent.putExtra("security_avoid_pull_rsa", "com.vivo.pushservice");
            intent.putExtra("security_avoid_rsa_public_key", "com.vivo.pushservice");
        }
    }

    public final long b() {
        return this.b;
    }

    public final Intent a(Context context, String str, long j, InsideNotificationItem insideNotificationItem, NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        this.b = j;
        this.f14155a = str;
        this.c = context;
        this.d = notifyArriveCallbackByUser;
        Intent a2 = a(context, insideNotificationItem, notifyArriveCallbackByUser);
        int a3 = a();
        if (a3 <= 0) {
            return a2;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(com.heytap.mcssdk.constant.b.c, String.valueOf(this.b));
        String a4 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a4)) {
            hashMap.put("remoteAppId", a4);
        }
        hashMap.put("ap", this.f14155a);
        hashMap.put("clientsdkver", String.valueOf(ah.c(this.c, this.f14155a)));
        f.a(a3, (HashMap<String, String>) hashMap);
        return null;
    }

    public static Intent a(Context context, String str, long j, Intent intent, InsideNotificationItem insideNotificationItem) {
        Intent intent2 = new Intent("com.vivo.pushservice.action.RECEIVE");
        intent2.setPackage(context.getPackageName());
        intent2.setClassName(context.getPackageName(), "com.vivo.push.sdk.service.CommandService");
        intent2.putExtra("command_type", "reflect_receiver");
        intent2.putExtras(intent.getExtras());
        a(intent2, context);
        com.vivo.push.b.p pVar = new com.vivo.push.b.p(str, j, insideNotificationItem);
        pVar.b(intent.getAction());
        if (intent.getComponent() != null) {
            pVar.c(intent.getComponent().getPackageName());
            pVar.d(intent.getComponent().getClassName());
        }
        if (intent.getData() != null) {
            pVar.a(intent.getData());
        }
        pVar.b(intent2);
        return intent2;
    }
}
