package com.yandex.mobile.ads.impl;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.CharsKt;

/* loaded from: classes5.dex */
public final class rr1 {

    /* renamed from: a, reason: collision with root package name */
    private final DecimalFormat f16793a;

    public final String a(String value) throws t61 {
        Intrinsics.checkNotNullParameter(value, "value");
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < value.length(); i++) {
                char charAt = value.charAt(i);
                if (!CharsKt.isWhitespace(charAt)) {
                    sb.append(charAt);
                }
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            String format = this.f16793a.format(Long.parseLong(sb2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        } catch (NumberFormatException e) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(String.format("Could not parse review count value. Review Count value is %s", Arrays.copyOf(new Object[]{value}, 1)), "format(...)");
            Object[] args = {e};
            int i2 = sp0.b;
            Intrinsics.checkNotNullParameter(args, "args");
            throw new t61("Native Ad json has not required attributes");
        }
    }

    public rr1() {
        DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.US);
        decimalFormatSymbols.setGroupingSeparator(' ');
        this.f16793a = new DecimalFormat("#,###,###", decimalFormatSymbols);
    }
}
