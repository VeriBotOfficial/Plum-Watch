package com.wakeup.module.glasses.handler;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.facebook.react.uimanager.ViewProps;
import com.tencent.connect.share.QzonePublish;
import com.wakeup.common.log.LogUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: VideoFrameExtractor.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\nH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/module/glasses/handler/VideoFrameExtractor;", "", "<init>", "()V", "TAG", "", "extractFrame", "Landroid/graphics/Bitmap;", QzonePublish.PUBLISH_TO_QZONE_VIDEO_PATH, "position", "", ViewProps.MAX_WIDTH, "compressFrame", "frame", "bitmapToJpeg", "", "bitmap", "quality", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class VideoFrameExtractor {
    public static final VideoFrameExtractor INSTANCE = new VideoFrameExtractor();
    private static final String TAG = "FrameExtractor";

    private VideoFrameExtractor() {
    }

    public static /* synthetic */ Bitmap extractFrame$default(VideoFrameExtractor videoFrameExtractor, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            i2 = 360;
        }
        return videoFrameExtractor.extractFrame(str, i, i2);
    }

    public final Bitmap extractFrame(String videoPath, int position, int maxWidth) {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(videoPath, "videoPath");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(videoPath);
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime(RangesKt.coerceAtMost(position * 1000000, ((extractMetadata == null || (longOrNull = StringsKt.toLongOrNull(extractMetadata)) == null) ? 0L : longOrNull.longValue()) * 1000), 3);
            return frameAtTime != null ? INSTANCE.compressFrame(frameAtTime, maxWidth) : null;
        } catch (Exception e) {
            LogUtils.e(TAG, "MediaMetadataRetriever failed to extract frame at " + position + ": " + e.getMessage());
            return null;
        } finally {
            mediaMetadataRetriever.release();
        }
    }

    private final Bitmap compressFrame(Bitmap frame, int maxWidth) {
        if (frame.getWidth() <= maxWidth) {
            return frame;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(frame, maxWidth, (int) (maxWidth * (frame.getHeight() / frame.getWidth())), true);
        Intrinsics.checkNotNullExpressionValue(createScaledBitmap, "createScaledBitmap(...)");
        return createScaledBitmap;
    }

    static /* synthetic */ byte[] bitmapToJpeg$default(VideoFrameExtractor videoFrameExtractor, Bitmap bitmap, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 80;
        }
        return videoFrameExtractor.bitmapToJpeg(bitmap, i);
    }

    private final byte[] bitmapToJpeg(Bitmap bitmap, int quality) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            bitmap.compress(Bitmap.CompressFormat.JPEG, quality, byteArrayOutputStream2);
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            CloseableKt.closeFinally(byteArrayOutputStream, null);
            Intrinsics.checkNotNullExpressionValue(byteArray, "use(...)");
            return byteArray;
        } finally {
        }
    }
}
