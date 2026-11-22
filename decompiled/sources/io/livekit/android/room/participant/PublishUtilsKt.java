package io.livekit.android.room.participant;

import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: PublishUtils.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0001H\u0000¨\u0006\u0002"}, d2 = {"mimeTypeToVideoCodec", "", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PublishUtilsKt {
    public static final String mimeTypeToVideoCodec(String str) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "<this>");
        List split$default = StringsKt.split$default((CharSequence) str, new String[]{"/"}, false, 0, 6, (Object) null);
        if (str.length() <= 1) {
            split$default = null;
        }
        if (split$default == null || (str2 = (String) split$default.get(1)) == null) {
            return null;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
