package com.vivo.push.h;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.gov.nist.javax.sip.parser.TokenTypes;
import android.text.TextUtils;
import android.util.Base64;
import com.vivo.push.model.NotifyArriveCallbackByUser;
import com.vivo.push.sdk.PushMessageCallback;
import com.vivo.push.util.NotifyAdapterUtil;
import java.security.PublicKey;
import java.util.HashMap;

/* compiled from: OnReceiveTask.java */
/* loaded from: classes2.dex */
public abstract class ab extends com.vivo.push.s {
    protected PushMessageCallback b;
    private int c;

    ab(com.vivo.push.v vVar) {
        super(vVar);
        this.c = 0;
    }

    public final void a(PushMessageCallback pushMessageCallback) {
        this.b = pushMessageCallback;
    }

    public final boolean a(PublicKey publicKey, String str, String str2) {
        if (!com.vivo.push.m.a().d()) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify is not support , vertify is ignore");
            return true;
        }
        if (publicKey == null) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify key is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            com.vivo.push.util.t.d("OnVerifyCallBackCommand", "contentTag is null");
            return false;
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                com.vivo.push.util.t.d("OnVerifyCallBackCommand", str.hashCode() + " = " + str2);
                if (!com.vivo.push.util.ab.a(str.getBytes("UTF-8"), publicKey, Base64.decode(str2, 2))) {
                    com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify fail srcDigest is ".concat(String.valueOf(str)));
                    com.vivo.push.util.t.c(this.f14137a, "vertify fail srcDigest is ".concat(String.valueOf(str)));
                    return false;
                }
                com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify id is success");
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify exception");
                return false;
            }
        }
        com.vivo.push.util.t.d("OnVerifyCallBackCommand", "vertify id is null");
        return false;
    }

    public final int b() {
        NotificationManager notificationManager = (NotificationManager) this.f14137a.getSystemService("notification");
        if (notificationManager != null && !notificationManager.areNotificationsEnabled()) {
            return 2104;
        }
        if (notificationManager == null) {
            return 0;
        }
        try {
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel(NotifyAdapterUtil.PRIMARY_CHANNEL);
            if (notificationChannel != null) {
                return notificationChannel.getImportance() == 0 ? 2121 : 0;
            }
            return 0;
        } catch (Exception unused) {
            com.vivo.push.util.t.b("OnVerifyCallBackCommand", "判断通知通道出现系统错误");
            return 0;
        }
    }

    public final int a(NotifyArriveCallbackByUser notifyArriveCallbackByUser) {
        if (notifyArriveCallbackByUser == null) {
            com.vivo.push.util.t.b("OnVerifyCallBackCommand", "pkg name : " + this.f14137a.getPackageName() + " 应用到达回调返回值为空，不做处理");
            com.vivo.push.util.t.b(this.f14137a, "应用到达回调返回值异常，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回正确的对象");
            return 2163;
        }
        if (!notifyArriveCallbackByUser.isIntercept()) {
            return 0;
        }
        com.vivo.push.util.t.b("OnVerifyCallBackCommand", "pkg name : " + this.f14137a.getPackageName() + " 应用主动拦截通知");
        com.vivo.push.util.t.b(this.f14137a, "应用主动拦截通知，导致通知无法展示，如需打开请在onNotificationMessageArrived中返回false");
        return TokenTypes.SERVICE_ROUTE;
    }

    public final HashMap<String, String> a(long j) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(com.heytap.mcssdk.constant.b.c, String.valueOf(j));
        String a2 = com.vivo.push.restructure.a.a().e().a();
        if (!TextUtils.isEmpty(a2)) {
            hashMap.put("remoteAppId", a2);
        }
        hashMap.put("clientsdkver", String.valueOf(com.vivo.push.util.ah.c(this.f14137a, this.f14137a.getPackageName())));
        return hashMap;
    }

    public final int c() {
        return this.c;
    }

    public final void a(int i) {
        this.c = i;
    }
}
