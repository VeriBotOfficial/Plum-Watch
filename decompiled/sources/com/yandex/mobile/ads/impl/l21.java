package com.yandex.mobile.ads.impl;

import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class l21 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f16070a = Pattern.compile("(<script)(.*)(src=\"mraid\\.js\")(.*)(<\\/script>)");

    public static boolean a(String htmlResponse) {
        Intrinsics.checkNotNullParameter(htmlResponse, "htmlResponse");
        return f16070a.matcher(htmlResponse).find();
    }
}
