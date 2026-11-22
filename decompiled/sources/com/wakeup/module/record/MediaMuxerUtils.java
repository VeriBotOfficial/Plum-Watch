package com.wakeup.module.record;

import android.media.MediaCodec;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* compiled from: MediaMuxerUtils.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/record/MediaMuxerUtils;", "", "<init>", "()V", "TAG", "", "MAX_SAMPLE_SIZE", "", "muxAudioVideo", "", FirebaseAnalytics.Param.DESTINATION, "Ljava/io/File;", "audioSource", "videoSource", "module-record_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MediaMuxerUtils {
    public static final MediaMuxerUtils INSTANCE = new MediaMuxerUtils();
    private static final int MAX_SAMPLE_SIZE = 1048576;
    private static final String TAG = "MediaMuxerUtils";

    private MediaMuxerUtils() {
    }

    public final boolean muxAudioVideo(File destination, File audioSource, File videoSource) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(audioSource, "audioSource");
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        String path = audioSource.getPath();
        Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
        String path2 = videoSource.getPath();
        Intrinsics.checkNotNullExpressionValue(path2, "getPath(...)");
        return muxAudioVideo(destination, path, path2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean muxAudioVideo(File destination, String audioSource, String videoSource) {
        MediaFormat mediaFormat;
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(audioSource, "audioSource");
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        MediaMuxer mediaMuxer = null;
        MediaFormat mediaFormat2 = null;
        MediaMuxer mediaMuxer2 = null;
        try {
            MediaMuxer mediaMuxer3 = new MediaMuxer(destination.getPath(), 0);
            try {
                MediaExtractor mediaExtractor = new MediaExtractor();
                mediaExtractor.setDataSource(videoSource);
                int trackCount = mediaExtractor.getTrackCount();
                int i = 0;
                while (true) {
                    if (i >= trackCount) {
                        mediaFormat = null;
                        break;
                    }
                    MediaFormat trackFormat = mediaExtractor.getTrackFormat(i);
                    Intrinsics.checkNotNullExpressionValue(trackFormat, "getTrackFormat(...)");
                    String string = trackFormat.getString(IMediaFormat.KEY_MIME);
                    Intrinsics.checkNotNull(string);
                    if (StringsKt.startsWith$default(string, "video/", false, 2, (Object) null)) {
                        mediaExtractor.selectTrack(i);
                        mediaFormat = mediaExtractor.getTrackFormat(i);
                        break;
                    }
                    i++;
                }
                MediaExtractor mediaExtractor2 = new MediaExtractor();
                mediaExtractor2.setDataSource(audioSource);
                int trackCount2 = mediaExtractor2.getTrackCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= trackCount2) {
                        break;
                    }
                    MediaFormat trackFormat2 = mediaExtractor2.getTrackFormat(i2);
                    Intrinsics.checkNotNullExpressionValue(trackFormat2, "getTrackFormat(...)");
                    String string2 = trackFormat2.getString(IMediaFormat.KEY_MIME);
                    Intrinsics.checkNotNull(string2);
                    if (StringsKt.startsWith$default(string2, "audio/", false, 2, (Object) null)) {
                        mediaExtractor2.selectTrack(i2);
                        mediaFormat2 = mediaExtractor2.getTrackFormat(i2);
                        break;
                    }
                    i2++;
                }
                int addTrack = mediaFormat != null ? mediaMuxer3.addTrack(mediaFormat) : -1;
                int addTrack2 = mediaFormat2 != null ? mediaMuxer3.addTrack(mediaFormat2) : -1;
                ByteBuffer allocate = ByteBuffer.allocate(1048576);
                MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                mediaMuxer3.start();
                Object[] objArr = false;
                while (objArr == false) {
                    bufferInfo.offset = 0;
                    bufferInfo.size = mediaExtractor.readSampleData(allocate, 0);
                    if (bufferInfo.size < 0) {
                        bufferInfo.size = 0;
                        objArr = true;
                    } else {
                        bufferInfo.presentationTimeUs = mediaExtractor.getSampleTime();
                        bufferInfo.flags = 1;
                        mediaMuxer3.writeSampleData(addTrack, allocate, bufferInfo);
                        mediaExtractor.advance();
                    }
                }
                ByteBuffer allocate2 = ByteBuffer.allocate(1048576);
                Object[] objArr2 = false;
                while (objArr2 == false) {
                    bufferInfo.offset = 0;
                    bufferInfo.size = mediaExtractor2.readSampleData(allocate2, 0);
                    if (bufferInfo.size < 0) {
                        bufferInfo.size = 0;
                        objArr2 = true;
                    } else {
                        bufferInfo.presentationTimeUs = mediaExtractor2.getSampleTime();
                        bufferInfo.flags = 1;
                        mediaMuxer3.writeSampleData(addTrack2, allocate2, bufferInfo);
                        mediaExtractor2.advance();
                    }
                }
                mediaExtractor.release();
                mediaExtractor2.release();
                try {
                    mediaMuxer3.release();
                } catch (Exception unused) {
                }
                return true;
            } catch (Exception unused2) {
                mediaMuxer2 = mediaMuxer3;
                if (mediaMuxer2 == null) {
                    return false;
                }
                try {
                    mediaMuxer2.release();
                    return false;
                } catch (Exception unused3) {
                    return false;
                }
            } catch (Throwable th) {
                th = th;
                mediaMuxer = mediaMuxer3;
                if (mediaMuxer != null) {
                    try {
                        mediaMuxer.release();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
