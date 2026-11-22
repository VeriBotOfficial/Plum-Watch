package io.agora.rtc2.internal;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.Surface;
import android.webkit.URLUtil;
import com.iflytek.cloud.ErrorCode;
import io.agora.base.internal.ContextUtils;
import io.agora.mediaplayer.Constants;
import io.agora.mediaplayer.data.MediaStreamInfo;
import io.agora.utils2.NetUtil;
import io.agora.utils2.internal.Logging;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes6.dex */
public class SimpleMediaPlayerSource {
    private static final int DEQUEUE_OR_DECODE_TIMEOUT_US = 1000;
    private static final int EXTRACTOR_TIMEOUT_MS = 2000;
    private static final List<String> HW_EXCEPTION_MODELS = Arrays.asList("Lenovo S90-u", "CHM-CL00", "CHM-TL00H", "CHM-UL00", "E6533", "HUAWEI CRR-UL00", "HUAWEI MT7-TL00", "HONOR H30-L01", "GN3001", "SCH-I869", "SM-G7509");
    private static final List<String> HW_UNSUPPORTED_MIMES = Arrays.asList("audio/x-ms-wma");
    private static final boolean IS_DEBUG = false;
    private static final String PREFIX_ASSETS = "/assets/";
    private static final String PREFIX_DOCUMENT = "content://";
    private static final String TAG = "SMPS";
    private MediaCodec mAudioDecoder;
    final int mAudioFrameSendInterval;
    ByteBuffer mByteBuffer;
    private MediaExtractorWrapper mExtractor;
    private volatile boolean mIsExtractorEndOfStream;
    ByteBuffer mJitterByteBuffer;
    private final SparseArray<MediaStreamInfoWrapper> mMediaStreamInfoMap = new SparseArray<>();
    private int mBytesPerSample = -1;
    private int mAudioSampleRate = -1;
    private int mAudioChannels = -1;
    private long mDurationMs = -1;
    private long mPlayPositionInMicroseconds = -1;

    private static class MediaExtractorWrapper {
        private final Handler mHandler;
        private final MediaExtractor mMediaExtractor;
        private volatile boolean mPrepared;
        private final String threadName;

        MediaExtractorWrapper() {
            String str = "MediaExtractor-" + new Random().nextInt();
            this.threadName = str;
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper());
            this.mMediaExtractor = new MediaExtractor();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean setDataSource(final String url) throws InterruptedException {
            Logging.d(SimpleMediaPlayerSource.TAG, "setDataSource()");
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            final boolean startsWith = url.startsWith("/assets/");
            final boolean startsWith2 = url.startsWith("content://");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.SimpleMediaPlayerSource.MediaExtractorWrapper.1
                @Override // java.lang.Runnable
                public void run() {
                    Logging.d(SimpleMediaPlayerSource.TAG, "setDataSource in thread " + MediaExtractorWrapper.this.threadName + "  url: " + url);
                    try {
                        Context applicationContext = ContextUtils.getApplicationContext();
                        if (startsWith && applicationContext != null) {
                            AssetFileDescriptor openFd = applicationContext.getAssets().openFd(url.substring("/assets/".length()));
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                        } else if (!startsWith2 || applicationContext == null) {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(url);
                        } else {
                            MediaExtractorWrapper.this.mMediaExtractor.setDataSource(applicationContext.getContentResolver().openFileDescriptor(Uri.parse(url), "r").getFileDescriptor());
                        }
                        MediaExtractorWrapper.this.mPrepared = true;
                    } catch (Exception e) {
                        Logging.w(SimpleMediaPlayerSource.TAG, "setDataSource fail: " + e.toString());
                    }
                    countDownLatch.countDown();
                }
            });
            countDownLatch.await(2000L, TimeUnit.MILLISECONDS);
            Logging.d(SimpleMediaPlayerSource.TAG, "setDataSource complete");
            return this.mPrepared;
        }

        void advance() {
            checkPrepared();
            this.mMediaExtractor.advance();
        }

        void checkPrepared() {
            if (!this.mPrepared) {
                throw new IllegalStateException("mMediaExtractor hasn't prepared");
            }
        }

        long getSampleTime() {
            checkPrepared();
            return this.mMediaExtractor.getSampleTime();
        }

        int getTrackCount() {
            checkPrepared();
            return this.mMediaExtractor.getTrackCount();
        }

        MediaFormat getTrackFormat(int index) {
            checkPrepared();
            return this.mMediaExtractor.getTrackFormat(index);
        }

        int readSampleData(ByteBuffer byteBuf, int offset) {
            checkPrepared();
            return this.mMediaExtractor.readSampleData(byteBuf, offset);
        }

        void release() {
            Logging.d(SimpleMediaPlayerSource.TAG, "release()");
            this.mHandler.post(new Runnable() { // from class: io.agora.rtc2.internal.SimpleMediaPlayerSource.MediaExtractorWrapper.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (MediaExtractorWrapper.this.mMediaExtractor != null) {
                            MediaExtractorWrapper.this.mMediaExtractor.release();
                        }
                    } catch (Exception e) {
                        Logging.e(SimpleMediaPlayerSource.TAG, "release media extractor exception.", e);
                    }
                    MediaExtractorWrapper.this.mHandler.getLooper().quit();
                    Logging.d(SimpleMediaPlayerSource.TAG, "mediaExtractor released in thread " + MediaExtractorWrapper.this.threadName);
                }
            });
        }

        void seekTo(long timeUs, int mode) {
            checkPrepared();
            this.mMediaExtractor.seekTo(timeUs, mode);
        }

        void selectTrack(int index) {
            checkPrepared();
            this.mMediaExtractor.selectTrack(index);
        }

        void unselectTrack(int index) {
            checkPrepared();
            this.mMediaExtractor.unselectTrack(index);
        }
    }

    protected static class MediaStreamInfoWrapper extends MediaStreamInfo {
        private MediaFormat format;

        public MediaStreamInfoWrapper(MediaFormat format) {
            this.format = format;
        }

        public MediaFormat getFormat() {
            return this.format;
        }
    }

    @interface PlayerError {
        public static final int PLAYER_REASON_CODEC_NOT_SUPPORTED = -7;
        public static final int PLAYER_REASON_INTERNAL = -2;
        public static final int PLAYER_REASON_INTERRUPTED = -13;
        public static final int PLAYER_REASON_INVALID_ARGUMENTS = -1;
        public static final int PLAYER_REASON_INVALID_CONNECTION_STATE = -11;
        public static final int PLAYER_REASON_INVALID_MEDIA_SOURCE = -4;
        public static final int PLAYER_REASON_INVALID_STATE = -9;
        public static final int PLAYER_REASON_NONE = 0;
        public static final int PLAYER_REASON_NO_RESOURCE = -3;
        public static final int PLAYER_REASON_OBJ_NOT_INITIALIZED = -6;
        public static final int PLAYER_REASON_SRC_BUFFER_UNDERFLOW = -12;
        public static final int PLAYER_REASON_UNKNOWN_STREAM_TYPE = -5;
        public static final int PLAYER_REASON_URL_NOT_FOUND = -10;
        public static final int PLAYER_REASON_VIDEO_RENDER_FAILED = -8;
    }

    static class SMPSIntervalData {
        private ByteBuffer byteBuffer = null;
        private boolean isEndOfStream = false;
        private boolean isError = false;

        SMPSIntervalData() {
        }

        public ByteBuffer getByteBuffer() {
            return this.byteBuffer;
        }

        public boolean isEndOfStream() {
            return this.isEndOfStream;
        }

        public boolean isError() {
            return this.isError;
        }
    }

    public SimpleMediaPlayerSource(int audioFrameSendInterval) {
        if (audioFrameSendInterval <= 0) {
            throw new IllegalArgumentException("interval illegal");
        }
        this.mAudioFrameSendInterval = audioFrameSendInterval;
        reset();
    }

    private boolean acquireFrames(ByteBuffer bufferToBeFilledWith) {
        String str;
        if (!this.mIsExtractorEndOfStream) {
            int dequeueInputBuffer = this.mAudioDecoder.dequeueInputBuffer(1000L);
            if (dequeueInputBuffer < 0) {
                Logging.w(TAG, "wait for next available input buffer timeout");
            } else {
                int readSampleData = this.mExtractor.readSampleData(this.mAudioDecoder.getInputBuffers()[dequeueInputBuffer], 0);
                if (readSampleData < 0) {
                    Logging.w(TAG, "no more samples are available");
                    this.mAudioDecoder.queueInputBuffer(dequeueInputBuffer, 0, 0, 0L, 4);
                    this.mIsExtractorEndOfStream = true;
                } else {
                    long sampleTime = this.mExtractor.getSampleTime();
                    this.mPlayPositionInMicroseconds = sampleTime;
                    this.mAudioDecoder.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, sampleTime, 0);
                    this.mExtractor.advance();
                }
            }
        }
        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
        int dequeueOutputBuffer = this.mAudioDecoder.dequeueOutputBuffer(bufferInfo, 1000L);
        if (dequeueOutputBuffer < 0) {
            if (dequeueOutputBuffer == -3) {
                str = "output buffers changed";
            } else {
                if (dequeueOutputBuffer != -2) {
                    if (dequeueOutputBuffer == -1) {
                        str = "info try again later";
                    }
                    return true;
                }
                str = "output format changed";
            }
            Logging.d(TAG, str);
            return true;
        }
        ByteBuffer byteBuffer = this.mAudioDecoder.getOutputBuffers()[dequeueOutputBuffer];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        bufferToBeFilledWith.put(byteBuffer);
        this.mAudioDecoder.releaseOutputBuffer(dequeueOutputBuffer, false);
        if ((bufferInfo.flags & 4) == 0) {
            return true;
        }
        Logging.w(TAG, "OutputBuffer BUFFER_FLAG_END_OF_STREAM");
        return false;
    }

    private boolean checkMimeTypeSupported(MediaExtractorWrapper extractor) {
        int trackCount = extractor.getTrackCount();
        for (int i = 0; i < trackCount; i++) {
            String string = extractor.getTrackFormat(i).getString(IMediaFormat.KEY_MIME);
            if (string.startsWith("audio") && HW_UNSUPPORTED_MIMES.contains(string)) {
                return false;
            }
        }
        return true;
    }

    private static int findAudioTrackAndFillStreamInfo(SparseArray<MediaStreamInfoWrapper> info, MediaExtractorWrapper extractor, String url) {
        int i;
        MediaStreamInfoWrapper mediaStreamInfoWrapper;
        int trackCount = extractor.getTrackCount();
        Logging.d(TAG, "track count : " + trackCount);
        int i2 = -1;
        for (int i3 = 0; i3 < trackCount; i3++) {
            MediaFormat trackFormat = extractor.getTrackFormat(i3);
            String string = trackFormat.getString(IMediaFormat.KEY_MIME);
            Logging.d(TAG, "track : " + i3 + " type : " + string);
            if (string.startsWith("audio")) {
                mediaStreamInfoWrapper = getAudioTrackInfo(trackFormat);
                i = i3;
            } else if (string.startsWith("video")) {
                MediaStreamInfoWrapper videoTrackInfo = getVideoTrackInfo(trackFormat);
                i = i2;
                mediaStreamInfoWrapper = videoTrackInfo;
            }
            if (mediaStreamInfoWrapper.getDuration() == 0 && !url.startsWith("http")) {
                mediaStreamInfoWrapper.setDuration(getLocalFileDuration(url));
            }
            info.put(i3, mediaStreamInfoWrapper);
            i2 = i;
        }
        return i2;
    }

    protected static MediaStreamInfoWrapper getAudioTrackInfo(MediaFormat format) {
        MediaStreamInfoWrapper mediaStreamInfoWrapper = new MediaStreamInfoWrapper(format);
        mediaStreamInfoWrapper.setMediaStreamType(Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_AUDIO));
        if (format.containsKey(IMediaFormat.KEY_MIME)) {
            mediaStreamInfoWrapper.setCodecName(format.getString(IMediaFormat.KEY_MIME));
        }
        if (format.containsKey("language")) {
            mediaStreamInfoWrapper.setLanguage(format.getString("language"));
        }
        if (format.containsKey("sample-rate")) {
            int integer = format.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = ErrorCode.MSP_ERROR_LOGIN_SUCCESS;
            }
            mediaStreamInfoWrapper.setAudioSampleRate(integer);
        }
        if (format.containsKey("channel-count")) {
            mediaStreamInfoWrapper.setAudioChannels(format.getInteger("channel-count"));
        }
        if (format.containsKey("durationUs")) {
            mediaStreamInfoWrapper.setDuration(format.getLong("durationUs") / 1000);
        }
        int integer2 = format.containsKey("pcm-encoding") ? format.getInteger("pcm-encoding") : 2;
        if (integer2 == 2) {
            mediaStreamInfoWrapper.setAudioBytesPerSample(2);
            return mediaStreamInfoWrapper;
        }
        if (integer2 == 3) {
            mediaStreamInfoWrapper.setAudioBytesPerSample(1);
            return mediaStreamInfoWrapper;
        }
        if (integer2 != 4) {
            return mediaStreamInfoWrapper;
        }
        mediaStreamInfoWrapper.setAudioBytesPerSample(4);
        return mediaStreamInfoWrapper;
    }

    private static long getLocalFileDuration(String url) {
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(url);
            return Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
    }

    private static int getMaxOutputBufferSize(MediaCodec audioDecoder) {
        int i = 0;
        for (ByteBuffer byteBuffer : audioDecoder.getOutputBuffers()) {
            i = Math.max(byteBuffer.capacity(), i);
        }
        return i;
    }

    private static MediaStreamInfoWrapper getVideoTrackInfo(MediaFormat format) {
        MediaStreamInfoWrapper mediaStreamInfoWrapper = new MediaStreamInfoWrapper(format);
        mediaStreamInfoWrapper.setMediaStreamType(Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_VIDEO));
        if (format.containsKey(IMediaFormat.KEY_MIME)) {
            mediaStreamInfoWrapper.setCodecName(format.getString(IMediaFormat.KEY_MIME));
        }
        if (format.containsKey("language")) {
            mediaStreamInfoWrapper.setLanguage(format.getString("language"));
        }
        if (format.containsKey("height")) {
            mediaStreamInfoWrapper.setVideoHeight(format.getInteger("height"));
        }
        if (format.containsKey("width")) {
            mediaStreamInfoWrapper.setVideoWidth(format.getInteger("width"));
        }
        if (format.containsKey("durationUs")) {
            mediaStreamInfoWrapper.setDuration(format.getLong("durationUs") / 1000);
        }
        return mediaStreamInfoWrapper;
    }

    private int openImpl(String url, long startPos) throws Throwable {
        String str;
        MediaExtractorWrapper mediaExtractorWrapper = new MediaExtractorWrapper();
        this.mExtractor = mediaExtractorWrapper;
        if (mediaExtractorWrapper.setDataSource(url) && checkMimeTypeSupported(this.mExtractor)) {
            this.mMediaStreamInfoMap.clear();
            int findAudioTrackAndFillStreamInfo = findAudioTrackAndFillStreamInfo(this.mMediaStreamInfoMap, this.mExtractor, url);
            MediaStreamInfoWrapper mediaStreamInfoWrapper = this.mMediaStreamInfoMap.get(findAudioTrackAndFillStreamInfo);
            if (mediaStreamInfoWrapper == null) {
                str = "Failed to find audio track";
            } else {
                MediaFormat format = mediaStreamInfoWrapper.getFormat();
                this.mDurationMs = mediaStreamInfoWrapper.getDuration();
                this.mAudioChannels = mediaStreamInfoWrapper.getAudioChannels();
                this.mAudioSampleRate = mediaStreamInfoWrapper.getAudioSampleRate();
                this.mBytesPerSample = mediaStreamInfoWrapper.getAudioBytesPerSample();
                Logging.d(TAG, "DurationMs: " + this.mDurationMs + ", AudioChannels: " + this.mAudioChannels + ", AudioSampleRate: " + this.mAudioSampleRate + ", BytesPerSample: " + this.mBytesPerSample);
                if (this.mBytesPerSample == 0) {
                    str = "Failed to check bytesPerSample";
                } else {
                    this.mExtractor.selectTrack(findAudioTrackAndFillStreamInfo);
                    MediaCodec createDecoderByType = MediaCodec.createDecoderByType(format.getString(IMediaFormat.KEY_MIME));
                    this.mAudioDecoder = createDecoderByType;
                    createDecoderByType.configure(format, (Surface) null, (MediaCrypto) null, 0);
                    this.mAudioDecoder.start();
                    ByteBuffer allocate = ByteBuffer.allocate(getMaxOutputBufferSize(this.mAudioDecoder) * 2);
                    this.mJitterByteBuffer = allocate;
                    allocate.flip();
                    int i = this.mAudioSampleRate / (1000 / this.mAudioFrameSendInterval);
                    int i2 = this.mBytesPerSample * i * this.mAudioChannels;
                    this.mByteBuffer = ByteBuffer.allocateDirect(i2);
                    Logging.d(TAG, " samplesPerChannel: " + i + ", bytesPerInterval: " + i2);
                    if (this.mByteBuffer.hasArray()) {
                        if (startPos > 0) {
                            this.mExtractor.seekTo(startPos * 1000, 2);
                        }
                        return 0;
                    }
                    str = "ByteBuffer does not have backing array.";
                }
            }
            Logging.e(TAG, str);
        } else {
            Logging.w(TAG, "Failed to setDataSource");
        }
        reset();
        return -2;
    }

    private void reset() {
        Logging.d(TAG, "reset()");
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper != null) {
            mediaExtractorWrapper.release();
            this.mExtractor = null;
        }
        MediaCodec mediaCodec = this.mAudioDecoder;
        if (mediaCodec != null) {
            try {
                mediaCodec.stop();
            } catch (Exception e) {
                Logging.e(TAG, "Media decoder stop failed", e);
            }
            try {
                this.mAudioDecoder.release();
            } catch (Exception e2) {
                Logging.e(TAG, "Media decoder release failed", e2);
            }
            this.mAudioDecoder = null;
        }
        ByteBuffer byteBuffer = this.mJitterByteBuffer;
        if (byteBuffer != null) {
            byteBuffer.clear();
            this.mJitterByteBuffer = null;
        }
        ByteBuffer byteBuffer2 = this.mByteBuffer;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
            this.mByteBuffer = null;
        }
        this.mMediaStreamInfoMap.clear();
        this.mAudioSampleRate = -1;
        this.mAudioChannels = -1;
        this.mBytesPerSample = -1;
        this.mDurationMs = -1L;
        this.mIsExtractorEndOfStream = false;
    }

    private int selectAudioTrackWithPos(int audioTrackIndex, long startPos) {
        String str;
        int trackCount = this.mExtractor.getTrackCount();
        Logging.i(TAG, "selectAudioTrackWithPos audioTrackIndex: " + audioTrackIndex + ", startPos: " + startPos + " ms, TrackCount: " + trackCount);
        MediaStreamInfoWrapper mediaStreamInfoWrapper = this.mMediaStreamInfoMap.get(audioTrackIndex);
        if (mediaStreamInfoWrapper == null || mediaStreamInfoWrapper.getMediaStreamType() != Constants.MediaStreamType.getValue(Constants.MediaStreamType.STREAM_TYPE_AUDIO)) {
            str = "Failed to find audio track";
        } else {
            for (int i = 0; i < trackCount; i++) {
                this.mExtractor.unselectTrack(i);
            }
            this.mDurationMs = mediaStreamInfoWrapper.getDuration();
            this.mAudioChannels = mediaStreamInfoWrapper.getAudioChannels();
            this.mAudioSampleRate = mediaStreamInfoWrapper.getAudioSampleRate();
            this.mBytesPerSample = mediaStreamInfoWrapper.getAudioBytesPerSample();
            Logging.i(TAG, "DurationMs: " + this.mDurationMs + ", AudioChannels: " + this.mAudioChannels + ", AudioSampleRate: " + this.mAudioSampleRate + ", BytesPerSample: " + this.mBytesPerSample);
            if (this.mBytesPerSample != 0) {
                this.mExtractor.selectTrack(audioTrackIndex);
                if (startPos > 0) {
                    this.mExtractor.seekTo(startPos * 1000, 2);
                }
                return 0;
            }
            str = "Failed to check bytesPerSample";
        }
        Logging.e(TAG, str);
        reset();
        return -2;
    }

    public SMPSIntervalData acquireIntervalData() {
        SMPSIntervalData sMPSIntervalData = new SMPSIntervalData();
        ByteBuffer byteBuffer = this.mByteBuffer;
        if (byteBuffer == null) {
            Logging.d(TAG, "Failed to acquireIntervalData, invalidate frame buffer");
            sMPSIntervalData.isError = true;
            return sMPSIntervalData;
        }
        try {
            byteBuffer.clear();
            int capacity = this.mByteBuffer.capacity();
            if (this.mJitterByteBuffer.remaining() < capacity) {
                this.mJitterByteBuffer.compact();
                sMPSIntervalData.isEndOfStream = !acquireFrames(this.mJitterByteBuffer);
                this.mJitterByteBuffer.flip();
            }
            if (this.mJitterByteBuffer.remaining() >= capacity) {
                this.mByteBuffer.put(this.mJitterByteBuffer.array(), this.mJitterByteBuffer.arrayOffset() + this.mJitterByteBuffer.position(), capacity);
                this.mByteBuffer.flip();
                ByteBuffer byteBuffer2 = this.mJitterByteBuffer;
                byteBuffer2.position(byteBuffer2.position() + capacity);
                sMPSIntervalData.byteBuffer = this.mByteBuffer;
                return sMPSIntervalData;
            }
        } catch (Throwable th) {
            Logging.e(TAG, "Failed to acquireIntervalData", th);
            sMPSIntervalData.isError = true;
        }
        return sMPSIntervalData;
    }

    public boolean checkFormatInfoChanged() {
        try {
            MediaFormat outputFormat = this.mAudioDecoder.getOutputFormat();
            int integer = outputFormat.getInteger("sample-rate");
            if (integer == 22050) {
                integer = 22000;
            } else if (integer == 11025) {
                integer = ErrorCode.MSP_ERROR_LOGIN_SUCCESS;
            }
            int integer2 = outputFormat.getInteger("channel-count");
            r0 = (this.mAudioSampleRate == integer && this.mAudioChannels == integer2) ? false : true;
            if (r0) {
                this.mAudioSampleRate = integer;
                this.mAudioChannels = integer2;
                ByteBuffer byteBuffer = this.mByteBuffer;
                if (byteBuffer != null) {
                    byteBuffer.clear();
                    this.mByteBuffer = null;
                }
                this.mByteBuffer = ByteBuffer.allocateDirect((this.mAudioSampleRate / (1000 / this.mAudioFrameSendInterval)) * this.mBytesPerSample * this.mAudioChannels);
            }
            return r0;
        } catch (Exception e) {
            Logging.e(TAG, "Error when checking file's new format");
            e.printStackTrace();
            return r0;
        }
    }

    public void dispose() {
        reset();
    }

    public int getAudioChannels() {
        return this.mAudioChannels;
    }

    public int getAudioSampleRate() {
        return this.mAudioSampleRate;
    }

    public int getBytesPerSample() {
        return this.mBytesPerSample;
    }

    public long getDuration() {
        return this.mDurationMs;
    }

    public long getPlayPosition() {
        if (this.mExtractor != null) {
            return this.mPlayPositionInMicroseconds / 1000;
        }
        return -1L;
    }

    public int getStreamCount() {
        return this.mMediaStreamInfoMap.size();
    }

    public MediaStreamInfo getStreamInfo(int index) {
        return this.mMediaStreamInfoMap.get(index);
    }

    public int open(String url, long startPos) {
        Logging.d(TAG, "open() url, startPos: " + startPos);
        if (HW_EXCEPTION_MODELS.contains(Build.MODEL)) {
            Logging.w(TAG, "Not support for " + Build.MODEL);
            return -1;
        }
        if (TextUtils.isEmpty(url)) {
            Logging.w(TAG, "Fail to open, empty url");
            return -1;
        }
        reset();
        if (URLUtil.isNetworkUrl(url) && ((url = NetUtil.getEncodedUrl(url)) == null || !NetUtil.testNetworkUrlAvailable(url))) {
            Logging.w(TAG, "Fail to open, 404 for url");
            return -2;
        }
        try {
            return openImpl(url, startPos);
        } catch (Throwable unused) {
            Logging.w(TAG, "Failed to open");
            reset();
            return -2;
        }
    }

    public int seek(long positionMs) {
        Logging.d(TAG, "seek() " + positionMs);
        long duration = getDuration();
        if (positionMs >= duration) {
            positionMs = duration;
        }
        long j = 1000 * positionMs;
        this.mPlayPositionInMicroseconds = j;
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            return -1;
        }
        mediaExtractorWrapper.seekTo(j, 1);
        if (this.mAudioDecoder != null && positionMs == 0 && this.mIsExtractorEndOfStream) {
            this.mIsExtractorEndOfStream = false;
            this.mAudioDecoder.flush();
        }
        return 0;
    }

    public int selectAudioTrack(int index) {
        MediaExtractorWrapper mediaExtractorWrapper = this.mExtractor;
        if (mediaExtractorWrapper == null) {
            Logging.e(TAG, "null extractor");
            return -1;
        }
        try {
            return selectAudioTrackWithPos(index, mediaExtractorWrapper.getSampleTime() / 1000);
        } catch (Exception e) {
            Logging.e(TAG, "selectAudioTrackWithPos failed:", e);
            return -1;
        }
    }
}
