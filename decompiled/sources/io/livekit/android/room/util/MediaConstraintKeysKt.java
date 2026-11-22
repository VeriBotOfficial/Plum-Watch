package io.livekit.android.room.util;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.MediaConstraints;

/* compiled from: MediaConstraintKeys.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0001¨\u0006\u0004"}, d2 = {"findConstraint", "", "Llivekit/org/webrtc/MediaConstraints;", "key", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MediaConstraintKeysKt {
    public static final String findConstraint(MediaConstraints mediaConstraints, String key) {
        Object obj;
        Object obj2;
        String value;
        Intrinsics.checkNotNullParameter(mediaConstraints, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        List<MediaConstraints.KeyValuePair> mandatory = mediaConstraints.mandatory;
        Intrinsics.checkNotNullExpressionValue(mandatory, "mandatory");
        Iterator<T> it = mandatory.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((MediaConstraints.KeyValuePair) obj).getKey(), key)) {
                break;
            }
        }
        MediaConstraints.KeyValuePair keyValuePair = (MediaConstraints.KeyValuePair) obj;
        if (keyValuePair != null && (value = keyValuePair.getValue()) != null) {
            return value;
        }
        List<MediaConstraints.KeyValuePair> optional = mediaConstraints.optional;
        Intrinsics.checkNotNullExpressionValue(optional, "optional");
        Iterator<T> it2 = optional.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((MediaConstraints.KeyValuePair) obj2).getKey(), key)) {
                break;
            }
        }
        MediaConstraints.KeyValuePair keyValuePair2 = (MediaConstraints.KeyValuePair) obj2;
        if (keyValuePair2 != null) {
            return keyValuePair2.getValue();
        }
        return null;
    }
}
