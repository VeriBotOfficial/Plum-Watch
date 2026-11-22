package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class t22 {

    /* renamed from: a, reason: collision with root package name */
    public final mm1 f16926a;
    public final int b;
    public final String c;

    public static final class a {
        public static t22 a(String statusLine) throws IOException {
            mm1 mm1Var;
            int i;
            String str;
            Intrinsics.checkNotNullParameter(statusLine, "statusLine");
            if (StringsKt.startsWith$default(statusLine, "HTTP/1.", false, 2, (Object) null)) {
                i = 9;
                if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                int charAt = statusLine.charAt(7) - '0';
                if (charAt == 0) {
                    mm1Var = mm1.d;
                } else {
                    if (charAt != 1) {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    mm1Var = mm1.e;
                }
            } else {
                if (!StringsKt.startsWith$default(statusLine, "ICY ", false, 2, (Object) null)) {
                    throw new ProtocolException("Unexpected status line: " + statusLine);
                }
                mm1Var = mm1.d;
                i = 4;
            }
            int i2 = i + 3;
            if (statusLine.length() < i2) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
            try {
                String substring = statusLine.substring(i, i2);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                int parseInt = Integer.parseInt(substring);
                if (statusLine.length() <= i2) {
                    str = "";
                } else {
                    if (statusLine.charAt(i2) != ' ') {
                        throw new ProtocolException("Unexpected status line: " + statusLine);
                    }
                    str = statusLine.substring(i + 4);
                    Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
                }
                return new t22(mm1Var, parseInt, str);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + statusLine);
            }
        }
    }

    public t22(mm1 protocol, int i, String message) {
        Intrinsics.checkNotNullParameter(protocol, "protocol");
        Intrinsics.checkNotNullParameter(message, "message");
        this.f16926a = protocol;
        this.b = i;
        this.c = message;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.f16926a == mm1.d) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ').append(this.b);
        sb.append(' ').append(this.c);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
