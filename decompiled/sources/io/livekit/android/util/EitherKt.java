package io.livekit.android.util;

import androidx.exifinterface.media.ExifInterface;
import io.livekit.android.util.Either;
import kotlin.Metadata;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: Either.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a0\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001\"\u0004\b\u0000\u0010\u0002*\u0012\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0001H\u0000¨\u0006\u0004"}, d2 = {"nullSafe", "Lio/livekit/android/util/Either;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EitherKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <A> Either<A, String> nullSafe(Either<? extends A, String> either) {
        return either == 0 ? new Either.Right(AbstractJsonLexerKt.NULL) : either;
    }
}
