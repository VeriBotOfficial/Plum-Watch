package io.livekit.android.util;

import com.google.protobuf.MessageLite;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: MessageLiteExt.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"toOkioByteString", "Lokio/ByteString;", "Lcom/google/protobuf/MessageLite;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MessageLiteExtKt {
    public static final ByteString toOkioByteString(MessageLite messageLite) {
        Intrinsics.checkNotNullParameter(messageLite, "<this>");
        byte[] byteArray = messageLite.toByteArray();
        ByteString.Companion companion = ByteString.INSTANCE;
        Intrinsics.checkNotNull(byteArray);
        return companion.of(byteArray, 0, byteArray.length);
    }
}
