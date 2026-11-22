package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ab;
import com.anythink.core.common.n.b.af;
import java.net.ProtocolException;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4093a = 307;
    public static final int b = 308;
    public static final int c = 100;
    public final ab d;
    public final int e;
    public final String f;

    public k(ab abVar, int i, String str) {
        this.d = abVar;
        this.e = i;
        this.f = str;
    }

    private static k a(af afVar) {
        return new k(afVar.b(), afVar.c(), afVar.d());
    }

    public static k a(String str) {
        ab abVar;
        int i;
        String str2;
        if (str.startsWith("HTTP/1.")) {
            i = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                abVar = ab.HTTP_1_0;
            } else if (charAt == 1) {
                abVar = ab.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
            }
        } else if (str.startsWith("ICY ")) {
            abVar = ab.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else {
                if (str.charAt(i2) != ' ') {
                    throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
                }
                str2 = str.substring(i + 4);
            }
            return new k(abVar, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: ".concat(String.valueOf(str)));
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.d == ab.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ').append(this.e);
        if (this.f != null) {
            sb.append(' ').append(this.f);
        }
        return sb.toString();
    }
}
