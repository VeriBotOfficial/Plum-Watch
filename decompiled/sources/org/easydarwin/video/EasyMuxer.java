package org.easydarwin.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.luck.picture.lib.config.PictureMimeType;
import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;

/* loaded from: classes6.dex */
public class EasyMuxer {
    private static final String TAG = "EasyMuxer";
    public static final boolean VERBOSE = true;
    private final long durationMillis;
    private boolean hasAudio;
    private int index;
    private MediaFormat mAudioFormat;
    private final String mFilePath;
    private MediaMuxer mMuxer;
    private MediaFormat mVideoFormat;
    private int mVideoTrackIndex = -1;
    private int mAudioTrackIndex = -1;
    private long mBeginMillis = 0;
    private long video_stample = 0;
    private long audio_stample = 0;

    public EasyMuxer(String str, boolean z, long j) {
        this.index = 0;
        if (TextUtils.isEmpty(str)) {
            throw new InvalidParameterException("path should not be empty!");
        }
        str = str.toLowerCase().endsWith(PictureMimeType.MP4) ? str.substring(0, str.toLowerCase().lastIndexOf(PictureMimeType.MP4)) : str;
        this.mFilePath = str;
        this.hasAudio = z;
        this.durationMillis = j;
        try {
            try {
                StringBuilder append = new StringBuilder().append(str).append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                int i = this.index;
                this.index = i + 1;
                this.mMuxer = new MediaMuxer(append.append(i).append(PictureMimeType.MP4).toString(), 0);
            } catch (IOException e) {
                e.printStackTrace();
                this.mMuxer = null;
            }
        } catch (Throwable th) {
            this.mMuxer = null;
            throw th;
        }
    }

    public synchronized void addTrack(MediaFormat mediaFormat, boolean z) {
        if (this.mAudioTrackIndex != -1 && this.mVideoTrackIndex != -1) {
            throw new RuntimeException("already add all tracks");
        }
        int addTrack = this.mMuxer.addTrack(mediaFormat);
        String str = TAG;
        Log.i(str, String.format("addTrack %s result %d", z ? "video" : "audio", Integer.valueOf(addTrack)));
        if (z) {
            this.mVideoFormat = mediaFormat;
            this.mVideoTrackIndex = addTrack;
            if (this.mAudioTrackIndex != -1 || !this.hasAudio) {
                Log.i(str, "both audio and video added,and muxer is started");
                this.mMuxer.start();
            }
        } else {
            this.mAudioFormat = mediaFormat;
            this.mAudioTrackIndex = addTrack;
            if (this.mVideoTrackIndex != -1) {
                this.mMuxer.start();
            }
        }
    }

    public synchronized void pumpStream(ByteBuffer byteBuffer, MediaCodec.BufferInfo bufferInfo, boolean z) {
        if (this.mMuxer == null) {
            Log.w(TAG, "muxer is null!");
        }
        if (this.mVideoTrackIndex == -1) {
            Log.i(TAG, String.format("pumpStream [%s] but muxer is not start.ignore..", z ? "video" : "audio"));
            return;
        }
        if (this.mAudioTrackIndex == -1 && this.hasAudio) {
            Log.i(TAG, String.format("pumpStream [%s] but muxer is not start.ignore..", z ? "video" : "audio"));
            return;
        }
        if (z && this.mBeginMillis == 0 && (bufferInfo.flags & 1) == 0) {
            Log.i(TAG, String.format("pumpStream [%s] but key frame not GOTTEN.ignore..", z ? "video" : "audio"));
            return;
        }
        if (!z && this.mBeginMillis == 0) {
            Log.i(TAG, String.format("pumpStream [%s] but video frame not GOTTEN.ignore..", z ? "video" : "audio"));
            return;
        }
        if (z && this.mBeginMillis == 0) {
            this.mBeginMillis = SystemClock.elapsedRealtime();
        }
        if ((bufferInfo.flags & 2) == 0 && bufferInfo.size != 0) {
            if (z && this.mVideoTrackIndex == -1) {
                throw new InvalidParameterException("muxer hasn't started");
            }
            byteBuffer.position(bufferInfo.offset);
            byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
            String str = TAG;
            Log.d(str, String.format("sent %s [" + bufferInfo.size + "] with timestamp:[%d] to muxer", z ? "video" : "audio", Long.valueOf(bufferInfo.presentationTimeUs / 1000)));
            if (z) {
                if (this.video_stample == 0) {
                    this.video_stample = bufferInfo.presentationTimeUs;
                } else {
                    if (bufferInfo.presentationTimeUs - this.video_stample <= 0) {
                        Log.w(str, "video timestample goback, ignore!");
                        return;
                    }
                    this.video_stample = bufferInfo.presentationTimeUs;
                }
            } else if (this.audio_stample == 0) {
                this.audio_stample = bufferInfo.presentationTimeUs;
            } else {
                if (bufferInfo.presentationTimeUs - this.audio_stample <= 0) {
                    Log.w(str, "audio timestample goback, ignore!");
                    return;
                }
                this.audio_stample = bufferInfo.presentationTimeUs;
            }
            this.mMuxer.writeSampleData(z ? this.mVideoTrackIndex : this.mAudioTrackIndex, byteBuffer, bufferInfo);
        }
        if ((bufferInfo.flags & 4) != 0) {
            Log.i(TAG, "BUFFER_FLAG_END_OF_STREAM received");
        }
        if (SystemClock.elapsedRealtime() - this.mBeginMillis >= this.durationMillis && z && (bufferInfo.flags & 1) != 0) {
            Log.i(TAG, String.format("record file reach expiration.create new file:" + this.index, new Object[0]));
            try {
                this.mMuxer.stop();
                this.mMuxer.release();
            } catch (Exception e) {
                e.printStackTrace();
            }
            this.mMuxer = null;
            this.mAudioTrackIndex = -1;
            this.mVideoTrackIndex = -1;
            try {
                StringBuilder append = new StringBuilder().append(this.mFilePath).append(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
                int i = this.index;
                this.index = i + 1;
                this.mMuxer = new MediaMuxer(append.append(i).append(PictureMimeType.MP4).toString(), 0);
                addTrack(this.mVideoFormat, true);
                MediaFormat mediaFormat = this.mAudioFormat;
                if (mediaFormat != null) {
                    addTrack(mediaFormat, false);
                }
                this.mBeginMillis = 0L;
                pumpStream(byteBuffer, bufferInfo, z);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public synchronized void release() {
        if (this.mMuxer != null) {
            if (this.mVideoTrackIndex != -1 && (this.mAudioTrackIndex != -1 || !this.hasAudio)) {
                Log.i(TAG, String.format("muxer is started. now it will be stoped.", new Object[0]));
                try {
                    this.mMuxer.stop();
                    this.mMuxer.release();
                } catch (IllegalStateException e) {
                    e.printStackTrace();
                }
            }
            this.mMuxer = null;
        }
        this.mBeginMillis = 0L;
    }
}
