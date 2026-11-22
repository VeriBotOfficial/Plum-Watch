package io.livekit.android.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UrlUtils.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0003"}, d2 = {"toHttpUrl", "", "toWebsocketUrl", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UrlUtilsKt {
    public static final String toWebsocketUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, "http", false, 2, (Object) null) ? StringsKt.replaceFirst$default(str, "http", "ws", false, 4, (Object) null) : str;
    }

    public static final String toHttpUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return StringsKt.startsWith$default(str, "ws", false, 2, (Object) null) ? StringsKt.replaceFirst$default(str, "ws", "http", false, 4, (Object) null) : str;
    }
}
