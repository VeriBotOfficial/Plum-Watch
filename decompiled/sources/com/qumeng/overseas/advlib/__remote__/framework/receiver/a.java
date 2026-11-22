package com.qumeng.overseas.advlib.__remote__.framework.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.qumeng.overseas.advlib.__remote__.core.ICliFactory;
import com.qumeng.overseas.advlib.__remote__.core.proto.request.Device;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.h;
import com.qumeng.overseas.advlib.__remote__.utils.d;
import java.io.Serializable;
import java.util.Map;

/* loaded from: classes17.dex */
public class a extends BroadcastReceiver {
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    private static a f;

    /* renamed from: a, reason: collision with root package name */
    private volatile Intent f12982a = null;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.receiver.a$a, reason: collision with other inner class name */
    class C0806a implements Device.a {
        C0806a() {
        }

        @Override // com.qumeng.overseas.advlib.__remote__.core.proto.request.Device.a
        public Map<String, Serializable> onGrabbingData() {
            return new h.b().append("battery_percent", Float.valueOf(a.this.a())).append("charge_state", Integer.valueOf(a.this.c())).getMap();
        }
    }

    private boolean a(int i) {
        return i == 2;
    }

    public static a b() {
        return f;
    }

    public int c() {
        Intent intent = this.f12982a;
        if (intent == null) {
            return 0;
        }
        if (!a(intent.getIntExtra("status", 0))) {
            return 1;
        }
        int intExtra = intent.getIntExtra("plugged", -1);
        if (intExtra != 1) {
            return intExtra != 2 ? 0 : 3;
        }
        return 2;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !"android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
            return;
        }
        this.f12982a = intent;
    }

    public static a a(Context context) {
        if (f == null) {
            synchronized (a.class) {
                if (f == null) {
                    IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                    f = new a();
                    if (ICliFactory.isMainProcess) {
                        try {
                            f.f12982a = d.a(context.getApplicationContext(), f, intentFilter, 2);
                        } catch (Throwable unused) {
                        }
                    }
                }
            }
        }
        return f;
    }

    public static void b(Context context) {
        a a2;
        if (f != null || (a2 = a(context)) == null) {
            return;
        }
        Device.putExtraDeviceInfoCallback(a2.new C0806a());
    }

    public float a() {
        if (this.f12982a == null) {
            return 0.0f;
        }
        return r0.getIntExtra("level", -1) / r0.getIntExtra("scale", -1);
    }
}
