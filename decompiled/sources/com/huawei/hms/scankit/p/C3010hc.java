package com.huawei.hms.scankit.p;

import com.baidu.mapapi.UIMsg;
import java.util.Arrays;

/* compiled from: HighLevelEncoder.java */
/* renamed from: com.huawei.hms.scankit.p.hc, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3010hc {
    private static char a(char c, int i) {
        int i2 = c + ((i * 149) % 253) + 1;
        if (i2 > 254) {
            i2 += UIMsg.m_AppUI.V_WM_LISTLISTUPDATE;
        }
        return (char) i2;
    }

    static boolean b(char c) {
        return c >= '0' && c <= '9';
    }

    static boolean c(char c) {
        return c >= 128 && c <= 255;
    }

    private static boolean d(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean e(char c) {
        return c >= ' ' && c <= '^';
    }

    private static boolean f(char c) {
        if (c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'a' && c <= 'z';
        }
        return true;
    }

    private static boolean g(char c) {
        if (i(c) || c == ' ') {
            return true;
        }
        if (c < '0' || c > '9') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    private static boolean h(char c) {
        return false;
    }

    private static boolean i(char c) {
        return c == '\r' || c == '*' || c == '>';
    }

    public static String a(String str, EnumC3018jc enumC3018jc, Mb mb, Mb mb2) {
        int i = 0;
        InterfaceC2998ec[] interfaceC2998ecArr = {new Zb(), new C2982ac(), new C3022kc(), new C3026lc(), new C2994dc(), new _b()};
        C3002fc c3002fc = new C3002fc(str);
        c3002fc.a(enumC3018jc);
        c3002fc.a(mb, mb2);
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            c3002fc.a((char) 236);
            c3002fc.a(2);
            c3002fc.f += 7;
        } else if (str.startsWith("[)>\u001e06\u001d") && str.endsWith("\u001e\u0004")) {
            c3002fc.a((char) 237);
            c3002fc.a(2);
            c3002fc.f += 7;
        }
        while (c3002fc.h()) {
            if (i >= 0 && i < 6) {
                interfaceC2998ecArr[i].a(c3002fc);
            }
            if (c3002fc.e() >= 0) {
                i = c3002fc.e();
                c3002fc.i();
            }
        }
        int a2 = c3002fc.a();
        c3002fc.k();
        int a3 = c3002fc.g().a();
        if (a2 < a3 && i != 0 && i != 5 && i != 4) {
            c3002fc.a((char) 254);
        }
        StringBuilder b = c3002fc.b();
        if (b.length() < a3) {
            b.append((char) 129);
        }
        while (b.length() < a3) {
            b.append(a((char) 129, b.length() + 1));
        }
        return c3002fc.b().toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:118:0x0200, code lost:
    
        return 5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int a(java.lang.CharSequence r20, int r21, int r22) {
        /*
            Method dump skipped, instructions count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.scankit.p.C3010hc.a(java.lang.CharSequence, int, int):int");
    }

    private static int a(float[] fArr, int[] iArr, int i, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        for (int i2 = 0; i2 < 6; i2++) {
            int ceil = (int) Math.ceil(fArr[i2]);
            iArr[i2] = ceil;
            if (i > ceil) {
                Arrays.fill(bArr, (byte) 0);
                i = ceil;
            }
            if (i == ceil) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    private static int a(byte[] bArr) {
        int i = 0;
        for (int i2 = 0; i2 < 6; i2++) {
            i += bArr[i2];
        }
        return i;
    }

    public static int a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        if (i < length) {
            char charAt = charSequence.charAt(i);
            while (b(charAt) && i < length) {
                i2++;
                i++;
                if (i < length) {
                    charAt = charSequence.charAt(i);
                }
            }
        }
        return i2;
    }

    static void a(char c) {
        String hexString = Integer.toHexString(c);
        throw new IllegalArgumentException("Illegal character: " + c + " (0x" + ("0000".substring(0, 4 - hexString.length()) + hexString) + ')');
    }
}
