package com.yandex.mobile.ads.impl;

import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class rj2 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16770a;
    private static final String b;
    public static final /* synthetic */ int c = 0;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        String format = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function(%3$s) { \n      return %4$s.%1$s(%2$s, %3$s); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"onAdRender", "document.querySelector('#rtb').offsetHeight", "testTag", "AdPerformActionsJSI"}, 4));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        f16770a = format;
        String format2 = String.format(locale, "<script type='text/javascript'> \nfunction wrapJsFunction_%1$s() { \n  window['%1$s'] = function() { \n      return %2$s.%1$s(); \n  } \n} \n \nwrapJsFunction_%1$s('%1$s'); \n</script> \n", Arrays.copyOf(new Object[]{"getBannerInfo", "AdPerformActionsJSI"}, 2));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        b = format2;
    }

    public static String b() {
        return f16770a;
    }

    public static String a(int i, int i2) {
        return StringsKt.trimIndent("\n\n        <style>ytag.container { width:" + i + "px; height:" + i2 + "px; }</style>\n\n        ");
    }

    public static String a(int i) {
        return "<body style='width:" + i + "px;'>";
    }

    public static String a() {
        return b;
    }
}
