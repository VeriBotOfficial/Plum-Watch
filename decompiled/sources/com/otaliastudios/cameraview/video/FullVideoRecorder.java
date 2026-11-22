package com.otaliastudios.cameraview.video;

import android.media.CamcorderProfile;
import android.media.MediaRecorder;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.VideoResult;
import com.otaliastudios.cameraview.controls.Audio;
import com.otaliastudios.cameraview.controls.AudioCodec;
import com.otaliastudios.cameraview.controls.VideoCodec;
import com.otaliastudios.cameraview.internal.DeviceEncoders;
import com.otaliastudios.cameraview.size.Size;
import com.otaliastudios.cameraview.video.VideoRecorder;

/* loaded from: classes17.dex */
public abstract class FullVideoRecorder extends VideoRecorder {
    protected MediaRecorder mMediaRecorder;
    private boolean mMediaRecorderPrepared;
    private CamcorderProfile mProfile;
    private static final String TAG = "FullVideoRecorder";
    protected static final CameraLogger LOG = CameraLogger.create(TAG);

    protected abstract void applyVideoSource(VideoResult.Stub stub, MediaRecorder mediaRecorder);

    protected abstract CamcorderProfile getCamcorderProfile(VideoResult.Stub stub);

    FullVideoRecorder(VideoRecorder.VideoResultListener videoResultListener) {
        super(videoResultListener);
    }

    protected final boolean prepareMediaRecorder(VideoResult.Stub stub) {
        if (this.mMediaRecorderPrepared) {
            return true;
        }
        return prepareMediaRecorder(stub, true);
    }

    private boolean prepareMediaRecorder(VideoResult.Stub stub, boolean z) {
        int i;
        String str;
        LOG.i("prepareMediaRecorder:", "Preparing on thread", Thread.currentThread());
        this.mMediaRecorder = new MediaRecorder();
        this.mProfile = getCamcorderProfile(stub);
        applyVideoSource(stub, this.mMediaRecorder);
        if (stub.audio == Audio.ON) {
            i = this.mProfile.audioChannels;
        } else if (stub.audio == Audio.MONO) {
            i = 1;
        } else {
            i = stub.audio == Audio.STEREO ? 2 : 0;
        }
        boolean z2 = i > 0;
        if (z2) {
            this.mMediaRecorder.setAudioSource(0);
        }
        if (stub.videoCodec == VideoCodec.H_264) {
            this.mProfile.videoCodec = 2;
            this.mProfile.fileFormat = 2;
        } else if (stub.videoCodec == VideoCodec.H_263) {
            this.mProfile.videoCodec = 1;
            this.mProfile.fileFormat = 2;
        }
        if (stub.audioCodec == AudioCodec.AAC) {
            this.mProfile.audioCodec = 3;
        } else if (stub.audioCodec == AudioCodec.HE_AAC) {
            this.mProfile.audioCodec = 4;
        } else if (stub.audioCodec == AudioCodec.AAC_ELD) {
            this.mProfile.audioCodec = 5;
        }
        this.mMediaRecorder.setOutputFormat(this.mProfile.fileFormat);
        if (stub.videoFrameRate <= 0) {
            stub.videoFrameRate = this.mProfile.videoFrameRate;
        }
        if (stub.videoBitRate <= 0) {
            stub.videoBitRate = this.mProfile.videoBitRate;
        }
        if (stub.audioBitRate <= 0 && z2) {
            stub.audioBitRate = this.mProfile.audioBitRate;
        }
        if (z) {
            String str2 = "audio/3gpp";
            switch (this.mProfile.audioCodec) {
                case 2:
                    str2 = "audio/amr-wb";
                    break;
                case 3:
                case 4:
                case 5:
                    str2 = "audio/mp4a-latm";
                    break;
                case 6:
                    str2 = "audio/vorbis";
                    break;
            }
            String str3 = str2;
            int i2 = this.mProfile.videoCodec;
            if (i2 != 1) {
                str = "video/avc";
                if (i2 != 2) {
                    if (i2 == 3) {
                        str = "video/mp4v-es";
                    } else if (i2 == 4) {
                        str = "video/x-vnd.on2.vp8";
                    } else if (i2 == 5) {
                        str = "video/hevc";
                    }
                }
            } else {
                str = "video/3gpp";
            }
            String str4 = str;
            boolean z3 = stub.rotation % 180 != 0;
            if (z3) {
                stub.size = stub.size.flip();
            }
            boolean z4 = false;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            Size size = null;
            while (!z4) {
                LOG.i("prepareMediaRecorder:", "Checking DeviceEncoders...", "videoOffset:", Integer.valueOf(i6), "audioOffset:", Integer.valueOf(i7));
                try {
                    int i8 = i5;
                    DeviceEncoders deviceEncoders = new DeviceEncoders(0, str4, str3, i6, i7);
                    String str5 = str4;
                    String str6 = str3;
                    try {
                        size = deviceEncoders.getSupportedVideoSize(stub.size);
                        i3 = deviceEncoders.getSupportedVideoBitRate(stub.videoBitRate);
                        i8 = deviceEncoders.getSupportedVideoFrameRate(size, stub.videoFrameRate);
                        deviceEncoders.tryConfigureVideo(str5, size, i8, i3);
                        if (z2) {
                            i4 = deviceEncoders.getSupportedAudioBitRate(stub.audioBitRate);
                            deviceEncoders.tryConfigureAudio(str6, i4, this.mProfile.audioSampleRate, i);
                        }
                        i5 = i8;
                        z4 = true;
                    } catch (DeviceEncoders.AudioException e) {
                        i5 = i8;
                        LOG.i("prepareMediaRecorder:", "Got AudioException:", e.getMessage());
                        i7++;
                    } catch (DeviceEncoders.VideoException e2) {
                        i5 = i8;
                        LOG.i("prepareMediaRecorder:", "Got VideoException:", e2.getMessage());
                        i6++;
                    }
                    str4 = str5;
                    str3 = str6;
                } catch (RuntimeException unused) {
                    LOG.w("prepareMediaRecorder:", "Could not respect encoders parameters.", "Trying again without checking encoders.");
                    return prepareMediaRecorder(stub, false);
                }
            }
            stub.size = size;
            stub.videoBitRate = i3;
            stub.audioBitRate = i4;
            stub.videoFrameRate = i5;
            if (z3) {
                stub.size = stub.size.flip();
            }
        }
        boolean z5 = stub.rotation % 180 != 0;
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        Size size2 = stub.size;
        mediaRecorder.setVideoSize(z5 ? size2.getHeight() : size2.getWidth(), z5 ? stub.size.getWidth() : stub.size.getHeight());
        this.mMediaRecorder.setVideoFrameRate(stub.videoFrameRate);
        this.mMediaRecorder.setVideoEncoder(this.mProfile.videoCodec);
        this.mMediaRecorder.setVideoEncodingBitRate(stub.videoBitRate);
        if (z2) {
            this.mMediaRecorder.setAudioChannels(i);
            this.mMediaRecorder.setAudioSamplingRate(this.mProfile.audioSampleRate);
            this.mMediaRecorder.setAudioEncoder(this.mProfile.audioCodec);
            this.mMediaRecorder.setAudioEncodingBitRate(stub.audioBitRate);
        }
        if (stub.location != null) {
            this.mMediaRecorder.setLocation((float) stub.location.getLatitude(), (float) stub.location.getLongitude());
        }
        if (stub.file != null) {
            this.mMediaRecorder.setOutputFile(stub.file.getAbsolutePath());
        } else if (stub.fileDescriptor != null) {
            this.mMediaRecorder.setOutputFile(stub.fileDescriptor);
        } else {
            throw new IllegalStateException("file and fileDescriptor are both null.");
        }
        this.mMediaRecorder.setOrientationHint(stub.rotation);
        this.mMediaRecorder.setMaxFileSize(stub.maxSize <= 0 ? stub.maxSize : Math.round(stub.maxSize / 0.9d));
        LOG.i("prepareMediaRecorder:", "Increased max size from", Long.valueOf(stub.maxSize), "to", Long.valueOf(Math.round(stub.maxSize / 0.9d)));
        this.mMediaRecorder.setMaxDuration(stub.maxDuration);
        this.mMediaRecorder.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: com.otaliastudios.cameraview.video.FullVideoRecorder.1
            @Override // android.media.MediaRecorder.OnInfoListener
            public void onInfo(MediaRecorder mediaRecorder2, int i9, int i10) {
                FullVideoRecorder.LOG.i("OnInfoListener:", "Received info", Integer.valueOf(i9), Integer.valueOf(i10), "Thread: ", Thread.currentThread());
                switch (i9) {
                    case 800:
                        FullVideoRecorder.this.mResult.endReason = 2;
                        break;
                    case 801:
                    case 802:
                        FullVideoRecorder.this.mResult.endReason = 1;
                        break;
                    default:
                        return;
                }
                FullVideoRecorder.LOG.i("OnInfoListener:", "Stopping");
                FullVideoRecorder.this.stop(false);
            }
        });
        this.mMediaRecorder.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: com.otaliastudios.cameraview.video.FullVideoRecorder.2
            @Override // android.media.MediaRecorder.OnErrorListener
            public void onError(MediaRecorder mediaRecorder2, int i9, int i10) {
                FullVideoRecorder.LOG.e("OnErrorListener: got error", Integer.valueOf(i9), Integer.valueOf(i10), ". Stopping.");
                FullVideoRecorder.this.mResult = null;
                FullVideoRecorder.this.mError = new RuntimeException("MediaRecorder error: " + i9 + " " + i10);
                FullVideoRecorder.LOG.i("OnErrorListener:", "Stopping");
                FullVideoRecorder.this.stop(false);
            }
        });
        try {
            this.mMediaRecorder.prepare();
            this.mMediaRecorderPrepared = true;
            this.mError = null;
            return true;
        } catch (Exception e3) {
            LOG.w("prepareMediaRecorder:", "Error while preparing media recorder.", e3);
            this.mMediaRecorderPrepared = false;
            this.mError = e3;
            return false;
        }
    }

    @Override // com.otaliastudios.cameraview.video.VideoRecorder
    protected void onStart() {
        if (!prepareMediaRecorder(this.mResult)) {
            this.mResult = null;
            stop(false);
            return;
        }
        try {
            this.mMediaRecorder.start();
            dispatchVideoRecordingStart();
        } catch (Exception e) {
            LOG.w("start:", "Error while starting media recorder.", e);
            this.mResult = null;
            this.mError = e;
            stop(false);
        }
    }

    @Override // com.otaliastudios.cameraview.video.VideoRecorder
    protected void onStop(boolean z) {
        if (this.mMediaRecorder != null) {
            dispatchVideoRecordingEnd();
            try {
                CameraLogger cameraLogger = LOG;
                cameraLogger.i("stop:", "Stopping MediaRecorder...");
                this.mMediaRecorder.stop();
                cameraLogger.i("stop:", "Stopped MediaRecorder.");
            } catch (Exception e) {
                this.mResult = null;
                if (this.mError == null) {
                    LOG.w("stop:", "Error while closing media recorder.", e);
                    this.mError = e;
                }
            }
            try {
                CameraLogger cameraLogger2 = LOG;
                cameraLogger2.i("stop:", "Releasing MediaRecorder...");
                this.mMediaRecorder.release();
                cameraLogger2.i("stop:", "Released MediaRecorder.");
            } catch (Exception e2) {
                this.mResult = null;
                if (this.mError == null) {
                    LOG.w("stop:", "Error while releasing media recorder.", e2);
                    this.mError = e2;
                }
            }
        }
        this.mProfile = null;
        this.mMediaRecorder = null;
        this.mMediaRecorderPrepared = false;
        dispatchResult();
    }
}
