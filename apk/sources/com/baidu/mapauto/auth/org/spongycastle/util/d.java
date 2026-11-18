package com.baidu.mapauto.auth.org.spongycastle.util;

import java.security.PrivilegedAction;

/* JADX INFO: loaded from: classes15.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f8308a = 0;

    public class a implements PrivilegedAction<String> {
        @Override // java.security.PrivilegedAction
        public final String run() {
            return System.getProperty("line.separator");
        }
    }

    static {
        try {
        } catch (Exception unused) {
            try {
                String.format("%n", new Object[0]);
            } catch (Exception unused2) {
            }
        }
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int r3 = 0; r3 != length; r3++) {
            cArr[r3] = (char) (bArr[r3] & 255);
        }
        return new String(cArr);
    }
}
