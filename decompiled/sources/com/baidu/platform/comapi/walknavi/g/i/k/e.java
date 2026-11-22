package com.baidu.platform.comapi.walknavi.g.i.k;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* compiled from: DeviceUuidFactory.java */
/* loaded from: classes13.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    protected static UUID f8745a;

    public e(Context context) {
        try {
            if (f8745a != null || context == null) {
                return;
            }
            synchronized (e.class) {
                if (f8745a == null) {
                    SharedPreferences sharedPreferences = context.getSharedPreferences("bd_plugin_ar_device_id.xml", 0);
                    String string = sharedPreferences.getString("device_id", null);
                    if (string != null) {
                        f8745a = UUID.fromString(string);
                    } else {
                        f8745a = UUID.randomUUID();
                        sharedPreferences.edit().putString("device_id", f8745a.toString()).commit();
                    }
                }
            }
        } catch (Exception e) {
            a.a("DeviceUuidFactory exception: " + e.getMessage());
        }
    }

    public UUID a() {
        return f8745a;
    }
}
