package com.anythink.basead.exoplayer.e.a;

import android.util.Log;
import com.anythink.basead.exoplayer.e.m;

/* loaded from: classes11.dex */
public final class k {
    private static final String f = "TrackEncryptionBox";

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2466a;
    public final String b;
    public final m.a c;
    public final int d;
    public final byte[] e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L9
            r2 = r1
            goto La
        L9:
            r2 = r0
        La:
            if (r11 != 0) goto Le
            r3 = r1
            goto Lf
        Le:
            r3 = r0
        Lf:
            r2 = r2 ^ r3
            com.anythink.basead.exoplayer.k.a.a(r2)
            r4.f2466a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            com.anythink.basead.exoplayer.e.m$a r5 = new com.anythink.basead.exoplayer.e.m$a
            if (r6 != 0) goto L20
            goto L77
        L20:
            r6.hashCode()
            int r7 = r6.hashCode()
            r11 = 2
            r2 = -1
            switch(r7) {
                case 3046605: goto L4f;
                case 3046671: goto L44;
                case 3049879: goto L39;
                case 3049895: goto L2e;
                default: goto L2c;
            }
        L2c:
            r0 = r2
            goto L58
        L2e:
            java.lang.String r7 = "cens"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L37
            goto L2c
        L37:
            r0 = 3
            goto L58
        L39:
            java.lang.String r7 = "cenc"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L42
            goto L2c
        L42:
            r0 = r11
            goto L58
        L44:
            java.lang.String r7 = "cbcs"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L4d
            goto L2c
        L4d:
            r0 = r1
            goto L58
        L4f:
            java.lang.String r7 = "cbc1"
            boolean r7 = r6.equals(r7)
            if (r7 != 0) goto L58
            goto L2c
        L58:
            switch(r0) {
                case 0: goto L76;
                case 1: goto L76;
                case 2: goto L77;
                case 3: goto L77;
                default: goto L5b;
            }
        L5b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.<init>(r11)
            java.lang.StringBuilder r6 = r7.append(r6)
            java.lang.String r7 = "'. Assuming AES-CTR crypto mode."
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L77
        L76:
            r1 = r11
        L77:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.e.a.k.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals("cbc1")) {
                    c = 0;
                    break;
                }
                break;
            case 3046671:
                if (str.equals("cbcs")) {
                    c = 1;
                    break;
                }
                break;
            case 3049879:
                if (str.equals("cenc")) {
                    c = 2;
                    break;
                }
                break;
            case 3049895:
                if (str.equals("cens")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                return 2;
            default:
                Log.w(f, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
