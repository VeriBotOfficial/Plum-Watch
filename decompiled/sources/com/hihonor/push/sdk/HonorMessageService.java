package com.hihonor.push.sdk;

import android.app.Service;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import android.util.Log;
import com.anythink.core.common.e.a;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;

/* loaded from: classes11.dex */
public abstract class HonorMessageService extends Service {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final b f10118a;
    public final Messenger b;

    public class a implements l0<HonorPushDataMsg> {
        public a() {
        }

        @Override // com.hihonor.push.sdk.l0
        public void a(v0<HonorPushDataMsg> v0Var) {
            Exception exc;
            String str;
            String str2;
            if (v0Var.c()) {
                HonorPushDataMsg b = v0Var.b();
                if (b == null) {
                    Log.i("HonorMessageService", "parse remote data failed.");
                    return;
                } else {
                    Log.i("HonorMessageService", "onMessageReceived. msgId is " + b.getMsgId());
                    HonorMessageService.this.onMessageReceived(b);
                    return;
                }
            }
            synchronized (v0Var.f10163a) {
                exc = v0Var.d;
            }
            if (exc instanceof JSONException) {
                str = "HonorMessageService";
                str2 = "parse remote json data message error.";
            } else {
                str = "HonorMessageService";
                str2 = "parse remote data message error.";
            }
            Log.e(str, str2);
        }
    }

    public static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final WeakReference<HonorMessageService> f10120a;

        public b(Looper looper, HonorMessageService honorMessageService) {
            super(looper);
            this.f10120a = new WeakReference<>(honorMessageService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            HonorMessageService honorMessageService = this.f10120a.get();
            if (honorMessageService == null) {
                Log.w("HonorMessageService", "service is null for release");
                return;
            }
            Log.i("HonorMessageService", "handle message for broadcast.");
            Bundle data = message.getData();
            if (data != null) {
                Intent intent = new Intent();
                intent.putExtras(data);
                int i = HonorMessageService.c;
                honorMessageService.a(intent);
            }
        }
    }

    public HonorMessageService() {
        b bVar = new b(Looper.getMainLooper(), this);
        this.f10118a = bVar;
        this.b = new Messenger(bVar);
    }

    public final void a(Intent intent) {
        try {
            if (TextUtils.equals(intent.getStringExtra(a.C0193a.b), "down_msg_receive_token")) {
                String stringExtra = intent.getStringExtra("push_token");
                k kVar = k.b;
                if (!TextUtils.equals(stringExtra, kVar.b(getApplicationContext()))) {
                    kVar.a(getApplicationContext(), stringExtra);
                }
                Log.i("HonorMessageService", "onNewToken");
                onNewToken(stringExtra);
            } else {
                b(intent);
            }
            Log.i("HonorMessageService", "dispatch message end.");
        } catch (Exception e) {
            Log.e("HonorMessageService", "dispatch message error. " + e.getMessage());
        }
    }

    public final void b(Intent intent) {
        Log.i("HonorMessageService", "parse remote data start.");
        p0 p0Var = new p0(intent);
        ExecutorService executorService = n0.c.b;
        m0 m0Var = new m0();
        try {
            executorService.execute(new u0(m0Var, p0Var));
        } catch (Exception e) {
            m0Var.a(e);
        }
        v0<TResult> v0Var = m0Var.f10145a;
        a aVar = new a();
        v0Var.getClass();
        v0Var.a(new s0(n0.c.f10147a, aVar));
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.b.getBinder();
    }

    public void onMessageReceived(HonorPushDataMsg honorPushDataMsg) {
    }

    public void onNewToken(String str) {
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        Log.i("HonorMessageService", "handle message for service.");
        a(intent);
        return 2;
    }
}
