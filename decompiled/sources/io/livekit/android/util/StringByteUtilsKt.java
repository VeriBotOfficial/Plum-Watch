package io.livekit.android.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import okio.ByteString;

/* compiled from: StringByteUtils.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\u0014\u0010\u0003\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0001H\u0000¨\u0006\u0005"}, d2 = {"byteLength", "", "", "truncateBytes", "maxBytes", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StringByteUtilsKt {
    public static final int byteLength(String str) {
        if (str == null) {
            return 0;
        }
        return ByteString.INSTANCE.encodeString(str, Charsets.UTF_8).size();
    }

    public static final String truncateBytes(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (byteLength(str) <= i) {
            return str;
        }
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = ((i2 + length) + 1) / 2;
            String substring = str.substring(0, i3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (byteLength(substring) <= i) {
                i2 = i3;
            } else {
                length = i3 - 1;
            }
        }
        String substring2 = str.substring(0, i2);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        return substring2;
    }
}
