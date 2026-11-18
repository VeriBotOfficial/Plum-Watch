package com.alipay.sdk.m.q0;

/* JADX INFO: loaded from: classes7.dex */
public class e {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int[] f1441a;
        public int b;
        public int c;

        public b() {
            this.f1441a = new int[256];
        }
    }

    public static byte[] a(byte[] bArr) {
        b bVarA;
        if (bArr == null || (bVarA = a("QrMgt8GGYI6T52ZY5AnhtxkLzb8egpFn3j5JELI8H6wtACbUnZ5cc3aYTsTRbmkAkRJeYbtx92LPBWm7nBO9UIl7y5i5MQNmUZNf5QENurR5tGyo7yJ2G0MBjWvy6iAtlAbacKP0SwOUeUWx5dsBdyhxa7Id1APtybSdDgicBDuNjI0mlZFUzZSS9dmN8lBD0WTVOMz0pRZbR3cysomRXOO1ghqjJdTcyDIxzpNAEszN8RMGjrzyU7Hjbmwi6YNK")) == null) {
            return null;
        }
        return a(bArr, bVarA);
    }

    public static b a(String str) {
        if (str == null) {
            return null;
        }
        b bVar = new b();
        for (int r3 = 0; r3 < 256; r3++) {
            bVar.f1441a[r3] = r3;
        }
        bVar.b = 0;
        bVar.c = 0;
        int length = 0;
        int r5 = 0;
        for (int r2 = 0; r2 < 256; r2++) {
            try {
                char cCharAt = str.charAt(length);
                int[] r7 = bVar.f1441a;
                int r8 = r7[r2];
                r5 = ((cCharAt + r8) + r5) % 256;
                r7[r2] = r7[r5];
                r7[r5] = r8;
                length = (length + 1) % str.length();
            } catch (Exception unused) {
                return null;
            }
        }
        return bVar;
    }

    public static byte[] a(byte[] bArr, b bVar) {
        if (bArr == null || bVar == null) {
            return null;
        }
        int r0 = bVar.b;
        int r1 = bVar.c;
        for (int r2 = 0; r2 < bArr.length; r2++) {
            r0 = (r0 + 1) % 256;
            int[] r3 = bVar.f1441a;
            int r4 = r3[r0];
            r1 = (r1 + r4) % 256;
            r3[r0] = r3[r1];
            r3[r1] = r4;
            int r5 = (r3[r0] + r4) % 256;
            bArr[r2] = (byte) (r3[r5] ^ bArr[r2]);
        }
        bVar.b = r0;
        bVar.c = r1;
        return bArr;
    }
}
