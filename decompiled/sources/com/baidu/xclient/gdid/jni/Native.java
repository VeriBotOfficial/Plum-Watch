package com.baidu.xclient.gdid.jni;

import android.gov.nist.core.Separators;
import com.baidu.xclient.gdid.j.f;

/* loaded from: classes13.dex */
public class Native {

    /* renamed from: a, reason: collision with root package name */
    public static String f9066a = "";

    static {
        try {
            System.loadLibrary("tiny_magic");
        } catch (Throwable th) {
            f9066a = f.b(th).replaceAll(Separators.HT, ";").replaceAll("\n", ";");
            throw th;
        }
    }

    public String a() {
        return f9066a;
    }

    public native byte[] ac(byte[] bArr, byte[] bArr2);

    public native byte[] acn(byte[] bArr, byte[] bArr2);

    public native byte[] dc(byte[] bArr, byte[] bArr2);

    public native byte[] dcn(byte[] bArr, byte[] bArr2);

    public native Object jnictl(int i, Object obj, Object obj2, Object obj3);
}
