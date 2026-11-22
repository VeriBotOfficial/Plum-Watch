package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes4.dex */
public class dj {
    public static byte[] a(String str, byte[] bArr) {
        byte[] m11894a = az.m11894a(str);
        try {
            a(m11894a);
            return h.a(m11894a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] b(String str, byte[] bArr) {
        byte[] m11894a = az.m11894a(str);
        try {
            a(m11894a);
            return h.b(m11894a, bArr);
        } catch (Exception unused) {
            return null;
        }
    }

    private static void a(byte[] bArr) {
        if (bArr.length >= 2) {
            bArr[0] = BuiltinOptions.DensifyOptions;
            bArr[1] = BuiltinOptions.SegmentSumOptions;
        }
    }

    public static boolean a(Context context, String str, long j) {
        return com.xiaomi.push.service.ah.a(context).a(gl.DCJobMutualSwitch.a(), false) && (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) && !ad.a(context, str, j);
    }
}
