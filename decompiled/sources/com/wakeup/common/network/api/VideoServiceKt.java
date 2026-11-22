package com.wakeup.common.network.api;

import androidx.webkit.internal.AssetHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: VideoService.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0004¨\u0006\u0005"}, d2 = {"toStringPart", "Lokhttp3/RequestBody;", "", "toIntPart", "", "common_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoServiceKt {
    public static final RequestBody toStringPart(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return RequestBody.INSTANCE.create(str, MediaType.INSTANCE.parse(AssetHelper.DEFAULT_MIME_TYPE));
    }

    public static final RequestBody toIntPart(int i) {
        return RequestBody.INSTANCE.create(String.valueOf(i), MediaType.INSTANCE.parse(AssetHelper.DEFAULT_MIME_TYPE));
    }
}
