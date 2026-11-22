package io.livekit.android.room.types;

import io.livekit.android.util.LKLog;
import io.livekit.android.util.LoggingLevel;
import java.util.Collection;
import java.util.Date;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import livekit.LivekitModels;

/* compiled from: TranscriptionSegment.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a$\u0010\u0003\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b\u001a\u0014\u0010\t\u001a\u00020\u0001*\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"merge", "Lio/livekit/android/room/types/TranscriptionSegment;", "newSegment", "mergeNewSegments", "", "", "", "newSegments", "", "toSDKType", "Llivekit/LivekitModels$TranscriptionSegment;", "firstReceivedTime", "", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TranscriptionSegmentKt {
    public static final TranscriptionSegment merge(TranscriptionSegment transcriptionSegment, TranscriptionSegment newSegment) {
        LKLog.Logger logger;
        Intrinsics.checkNotNullParameter(newSegment, "newSegment");
        if (transcriptionSegment == null) {
            return newSegment;
        }
        if (!Intrinsics.areEqual(transcriptionSegment.getId(), newSegment.getId())) {
            return transcriptionSegment;
        }
        if (transcriptionSegment.getFinal()) {
            LKLog.Companion companion = LKLog.INSTANCE;
            LoggingLevel loggingLevel = LoggingLevel.DEBUG;
            if (loggingLevel.compareTo(LKLog.INSTANCE.getLoggingLevel()) >= 0 && (logger = companion.getLogger()) != null) {
                logger.log(loggingLevel, null, "new segment for " + transcriptionSegment.getId() + " overwriting final segment?");
            }
        }
        return transcriptionSegment.copy(transcriptionSegment.getId(), newSegment.getText(), newSegment.getLanguage(), newSegment.getFinal(), transcriptionSegment.getFirstReceivedTime(), newSegment.getLastReceivedTime());
    }

    public static final void mergeNewSegments(Map<String, TranscriptionSegment> map, Collection<TranscriptionSegment> newSegments) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(newSegments, "newSegments");
        for (TranscriptionSegment transcriptionSegment : newSegments) {
            map.put(transcriptionSegment.getId(), merge(map.get(transcriptionSegment.getId()), transcriptionSegment));
        }
    }

    public static /* synthetic */ TranscriptionSegment toSDKType$default(LivekitModels.TranscriptionSegment transcriptionSegment, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = new Date().getTime();
        }
        return toSDKType(transcriptionSegment, j);
    }

    public static final TranscriptionSegment toSDKType(LivekitModels.TranscriptionSegment transcriptionSegment, long j) {
        Intrinsics.checkNotNullParameter(transcriptionSegment, "<this>");
        String id2 = transcriptionSegment.getId();
        Intrinsics.checkNotNullExpressionValue(id2, "getId(...)");
        String text = transcriptionSegment.getText();
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        String language = transcriptionSegment.getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        return new TranscriptionSegment(id2, text, language, transcriptionSegment.getFinal(), j, 0L, 32, null);
    }
}
