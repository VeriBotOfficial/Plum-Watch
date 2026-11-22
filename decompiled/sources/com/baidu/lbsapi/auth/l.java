package com.baidu.lbsapi.auth;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Hashtable;

/* loaded from: classes13.dex */
class l extends Handler {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ LBSAuthManager f7497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    l(LBSAuthManager lBSAuthManager, Looper looper) {
        super(looper);
        this.f7497a = lBSAuthManager;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        Hashtable hashtable;
        b.a("handleMessage !!");
        String string = message.getData().getString("listenerKey");
        hashtable = LBSAuthManager.j;
        LBSAuthManagerListener lBSAuthManagerListener = (LBSAuthManagerListener) hashtable.get(string);
        b.a("handleMessage listener = " + lBSAuthManagerListener);
        if (lBSAuthManagerListener != null) {
            lBSAuthManagerListener.onAuthResult(message.what, message.obj.toString());
        }
    }
}
