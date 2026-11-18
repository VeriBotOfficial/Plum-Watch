package com.hihonor.push.sdk;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

/* JADX INFO: loaded from: classes7.dex */
public class g0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Messenger f10137a;
    public Bundle b;
    public Context c;

    @Override // android.content.ServiceConnection
    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.i("MessengerSrvConnection", "onServiceConnected");
        this.f10137a = new Messenger(iBinder);
        Message messageObtain = Message.obtain();
        messageObtain.setData(this.b);
        try {
            this.f10137a.send(messageObtain);
        } catch (Exception e) {
            Log.e("MessengerSrvConnection", "message sending failed. " + e.getMessage());
        }
        Log.i("MessengerSrvConnection", "start unbind service.");
        try {
            this.c.unbindService(this);
            Log.i("MessengerSrvConnection", "unbind service end.");
        } catch (Exception unused) {
            Log.e("MessengerSrvConnection", "unbind service failed.");
        }
    }

    @Override // android.content.ServiceConnection
    public void onServiceDisconnected(ComponentName componentName) {
        Log.i("MessengerSrvConnection", "onServiceDisconnected");
        this.f10137a = null;
        this.b = null;
        this.c = null;
    }
}
