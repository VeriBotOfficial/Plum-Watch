package com.apm.insight.i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.o;
import com.phancy.mini.api.file.FileSystemManager;
import java.util.UUID;

/* compiled from: DeviceUuidFactory.java */
/* loaded from: classes12.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile UUID f6037a = null;
    private static String b = "";

    public static synchronized String a(Context context) {
        String str;
        synchronized (a.class) {
            if (TextUtils.isEmpty(b)) {
                new a(context);
                UUID uuid = f6037a;
                if (uuid != null) {
                    b = uuid.toString();
                }
            }
            str = b;
        }
        return str;
    }

    private a(Context context) {
        String str;
        if (f6037a == null) {
            synchronized (a.class) {
                if (f6037a == null) {
                    String c = o.a().c();
                    if (c != null) {
                        f6037a = UUID.fromString(c);
                    } else {
                        try {
                            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            str = null;
                        }
                        try {
                            if (str != null) {
                                f6037a = UUID.nameUUIDFromBytes(str.getBytes(FileSystemManager.ENCODING_UTF8));
                            } else {
                                f6037a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            o.a().b(f6037a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }
}
