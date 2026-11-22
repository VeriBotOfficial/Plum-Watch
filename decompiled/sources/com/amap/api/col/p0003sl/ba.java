package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: ConstConfig.java */
/* loaded from: classes11.dex */
public final class ba {

    /* renamed from: a, reason: collision with root package name */
    static byte[] f1572a = null;
    public static boolean b = false;
    public static boolean c = false;
    private static volatile ConcurrentHashMap<String, String> d = new ConcurrentHashMap<>(8);
    public static final Integer e = 1;
    public static final Integer f = 2;
    public static final Integer g = 3;
    public static final Integer h = 4;
    public static final Integer i = 5;

    public static byte[] a() {
        if (f1572a == null) {
            f1572a = f9.a("ADgAJQBdABEAbgAJAHcAFQCMAEEAzQBFARIAIQEzADkBbAA9AakAoQJKATEDewAJA4QADQORABFLWVc1a2NtOXBaQzV2Y3k1VFpYSjJhV05sVFdGdVlXZGxjZz09UVoyVjBVMlZ5ZG1salpRPT1JY0dodmJtVT1VYVhCb2IyNWxjM1ZpYVc1bWJ3PT1NWTI5dExtRnVaSEp2YVdRdWFXNTBaWEp1WVd3dWRHVnNaWEJvYjI1NUxrbFVaV3hsY0dodmJua2tVM1IxWWc9PVFZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsUWFHOXVaVk4xWWtsdVptOGtVM1IxWWc9PUdWRkpCVGxOQlExUkpUMDVmWjJWMFJHVjJhV05sU1dRPUVZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsVVpXeGxjR2h2Ym5rPUlZMjl0TG1GdVpISnZhV1F1YVc1MFpYSnVZV3d1ZEdWc1pYQm9iMjU1TGtsUWFHOXVaVk4xWWtsdVptOD1FSW10bGVTSTZJaVZ6SWl3aWNHeGhkR1p2Y20waU9pSmhibVJ5YjJsa0lpd2laR2wxSWpvaUpYTWlMQ0p3YTJjaU9pSWxjeUlzSW0xdlpHVnNJam9pSlhNaUxDSmhjSEJ1WVcxbElqb2lKWE1pTENKaGNIQjJaWEp6YVc5dUlqb2lKWE1pTENKemVYTjJaWEp6YVc5dUlqb2lKWE1pTEE9PVNJbXRsZVNJNklpVnpJaXdpY0d4aGRHWnZjbTBpT2lKaGJtUnliMmxrSWl3aVpHbDFJam9pSlhNaUxDSnRZV01pT2lJbGN5SXNJblJwWkNJNklpVnpJaXdpZFcxcFpIUWlPaUlsY3lJc0ltMWhiblZtWVdOMGRYSmxJam9pSlhNaUxDSmtaWFpwWTJVaU9pSWxjeUlzSW5OcGJTSTZJaVZ6SWl3aWNHdG5Jam9pSlhNaUxDSnRiMlJsYkNJNklpVnpJaXdpWVhCd2RtVnljMmx2YmlJNklpVnpJaXdpWVhCd2JtRnRaU0k2SWlWeklpd2liMkZwWkNJNklpVnpJaXdpWVdScGRTSTZJaVZ6SWl3aWIzTmZkbVZ5SWpvaUpYTWlMQ0poWVdsa0lqb2lKWE1pSVlXbGtQUT09TWZITmxjbWxoYkQwPVFZVzVrY205cFpGOXBaQT09");
        }
        byte[] bArr = new byte[4];
        System.arraycopy(f1572a, 40, bArr, 0, 4);
        int i2 = ((bArr[0] & 255) * 256) + (bArr[1] & 255);
        int i3 = ((bArr[2] & 255) * 256) + (bArr[3] & 255);
        byte[] bArr2 = new byte[i3];
        System.arraycopy(f1572a, i2, bArr2, 0, i3);
        return bArr2;
    }

    public static void a(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                synchronized (d) {
                    if (d == null) {
                        d = new ConcurrentHashMap<>(8);
                    }
                    if (!d.containsKey(str)) {
                        d.put(str, str2);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        String str2 = "";
        try {
            synchronized (d) {
                if (d != null && d.containsKey(str)) {
                    str2 = d.get(str);
                }
            }
            return str2;
        } catch (Throwable unused) {
            return str2;
        }
    }
}
