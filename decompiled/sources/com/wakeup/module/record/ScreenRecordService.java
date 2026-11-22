package com.wakeup.module.record;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.hardware.display.VirtualDisplay;
import android.media.MediaRecorder;
import android.media.projection.MediaProjection;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.ResultReceiver;
import android.util.Log;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.luck.picture.lib.config.PictureMimeType;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes4.dex */
public class ScreenRecordService extends Service {
    public static final String BUNDLED_LISTENER = "listener";
    private static final String TAG = "ScreenRecordService";
    private static String fileName;
    private static String filePath;
    private int audioBitrate;
    private int audioSamplingRate;
    private int audioSourceAsInt;
    private boolean isAudioEnabled;
    private boolean isCustomSettingsEnabled;
    private boolean isVideoHD;
    private Intent mIntent;
    private MediaProjection mMediaProjection;
    private MediaRecorder mMediaRecorder;
    private int mResultCode;
    private Intent mResultData;
    private int mScreenDensity;
    private int mScreenHeight;
    private int mScreenWidth;
    private VirtualDisplay mVirtualDisplay;
    private String name;
    private int orientationHint;
    private int outputFormatAsInt;
    private String path;
    private int videoBitrate;
    private int videoEncoderAsInt;
    private int videoFrameRate;
    private long maxFileSize = 0;
    private boolean hasMaxFileBeenReached = false;
    private Uri returnedUri = null;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    public static String getFilePath() {
        return filePath;
    }

    public static String getFileName() {
        return fileName;
    }

    @Override // android.app.Service
    public int onStartCommand(final Intent intent, int i, int i2) {
        if (intent != null && intent.getAction() != null) {
            if (intent.getAction().equals("pause")) {
                pauseRecording();
            } else if (intent.getAction().equals("resume")) {
                resumeRecording();
            }
        } else {
            this.hasMaxFileBeenReached = false;
            this.mIntent = intent;
            this.maxFileSize = intent.getLongExtra(Constants.MAX_FILE_SIZE_KEY, 0L);
            this.orientationHint = intent.getIntExtra("orientation", 400);
            this.mResultCode = intent.getIntExtra("code", -1);
            this.mResultData = (Intent) intent.getParcelableExtra("data");
            this.mScreenWidth = intent.getIntExtra("width", 0);
            this.mScreenHeight = intent.getIntExtra("height", 0);
            if (intent.getStringExtra("mUri") != null) {
                this.returnedUri = Uri.parse(intent.getStringExtra("mUri"));
            }
            if (this.mScreenHeight == 0 || this.mScreenWidth == 0) {
                HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
                hBRecorderCodecInfo.setContext(this);
                this.mScreenHeight = hBRecorderCodecInfo.getMaxSupportedHeight();
                this.mScreenWidth = hBRecorderCodecInfo.getMaxSupportedWidth();
            }
            this.mScreenDensity = intent.getIntExtra("density", 1);
            this.isVideoHD = intent.getBooleanExtra("quality", true);
            this.isAudioEnabled = intent.getBooleanExtra("audio", true);
            this.path = intent.getStringExtra("path");
            this.name = intent.getStringExtra("fileName");
            String stringExtra = intent.getStringExtra("audioSource");
            String stringExtra2 = intent.getStringExtra("videoEncoder");
            this.videoFrameRate = intent.getIntExtra("videoFrameRate", 30);
            this.videoBitrate = intent.getIntExtra("videoBitrate", HuaweiApiAvailability.HMS_VERSION_CODE_KIT_UPDATE);
            if (stringExtra != null) {
                setAudioSourceAsInt(stringExtra);
            }
            if (stringExtra2 != null) {
                setvideoEncoderAsInt(stringExtra2);
            }
            filePath = this.name;
            this.audioBitrate = intent.getIntExtra("audioBitrate", 128000);
            this.audioSamplingRate = intent.getIntExtra("audioSamplingRate", 44100);
            String stringExtra3 = intent.getStringExtra("outputFormat");
            if (stringExtra3 != null) {
                setOutputFormatAsInt(stringExtra3);
            }
            this.isCustomSettingsEnabled = intent.getBooleanExtra("enableCustomSettings", false);
            if (this.audioBitrate == 0) {
                this.audioBitrate = 128000;
            }
            if (this.audioSamplingRate == 0) {
                this.audioSamplingRate = 44100;
            }
            createForegroundNotification();
            if (this.returnedUri == null && this.path == null) {
                this.path = String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES));
            }
            try {
                initRecorder();
            } catch (Exception e) {
                ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle = new Bundle();
                bundle.putString("errorReason", Log.getStackTraceString(e));
                if (resultReceiver != null) {
                    resultReceiver.send(-1, bundle);
                }
            }
            try {
                initMediaProjection();
            } catch (Exception e2) {
                ResultReceiver resultReceiver2 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle2 = new Bundle();
                bundle2.putString("errorReason", Log.getStackTraceString(e2));
                if (resultReceiver2 != null) {
                    resultReceiver2.send(-1, bundle2);
                }
            }
            try {
                initVirtualDisplay();
            } catch (Exception e3) {
                ResultReceiver resultReceiver3 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle3 = new Bundle();
                bundle3.putString("errorReason", Log.getStackTraceString(e3));
                if (resultReceiver3 != null) {
                    resultReceiver3.send(-1, bundle3);
                }
            }
            this.mMediaRecorder.setOnErrorListener(new MediaRecorder.OnErrorListener() { // from class: com.wakeup.module.record.ScreenRecordService.1
                @Override // android.media.MediaRecorder.OnErrorListener
                public void onError(MediaRecorder mediaRecorder, int i3, int i4) {
                    if (i3 == 268435556 && ScreenRecordService.this.hasMaxFileBeenReached) {
                        return;
                    }
                    ResultReceiver resultReceiver4 = (ResultReceiver) intent.getParcelableExtra("listener");
                    Bundle bundle4 = new Bundle();
                    bundle4.putInt("error", 38);
                    bundle4.putString("errorReason", String.valueOf(i3));
                    if (resultReceiver4 != null) {
                        resultReceiver4.send(-1, bundle4);
                    }
                }
            });
            this.mMediaRecorder.setOnInfoListener(new MediaRecorder.OnInfoListener() { // from class: com.wakeup.module.record.ScreenRecordService.2
                @Override // android.media.MediaRecorder.OnInfoListener
                public void onInfo(MediaRecorder mediaRecorder, int i3, int i4) {
                    if (i3 == 801) {
                        ScreenRecordService.this.hasMaxFileBeenReached = true;
                        Log.i(ScreenRecordService.TAG, String.format(Locale.US, "onInfoListen what : %d | extra %d", Integer.valueOf(i3), Integer.valueOf(i4)));
                        ResultReceiver resultReceiver4 = (ResultReceiver) intent.getParcelableExtra("listener");
                        Bundle bundle4 = new Bundle();
                        bundle4.putInt("error", 48);
                        bundle4.putString("errorReason", ScreenRecordService.this.getString(com.wakeup.commonui.R.string.max_file_reached));
                        if (resultReceiver4 != null) {
                            resultReceiver4.send(-1, bundle4);
                        }
                    }
                }
            });
            try {
                this.mMediaRecorder.start();
                ResultReceiver resultReceiver4 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle4 = new Bundle();
                bundle4.putInt(Constants.ON_START_KEY, 111);
                if (resultReceiver4 != null) {
                    resultReceiver4.send(-1, bundle4);
                }
            } catch (Exception e4) {
                ResultReceiver resultReceiver5 = (ResultReceiver) intent.getParcelableExtra("listener");
                Bundle bundle5 = new Bundle();
                bundle5.putInt("error", 38);
                bundle5.putString("errorReason", Log.getStackTraceString(e4));
                if (resultReceiver5 != null) {
                    resultReceiver5.send(-1, bundle5);
                }
            }
        }
        return 1;
    }

    private void pauseRecording() {
        this.mMediaRecorder.pause();
    }

    private void resumeRecording() {
        this.mMediaRecorder.resume();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void setOutputFormatAsInt(String str) {
        char c;
        switch (str.hashCode()) {
            case -2032180703:
                if (str.equals("DEFAULT")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -2014514182:
                if (str.equals("MPEG_4")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -813934554:
                if (str.equals("MPEG_2_TS")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 78191:
                if (str.equals("OGG")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 2660249:
                if (str.equals("WEBM")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1179611262:
                if (str.equals("AAC_ADTS")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1228866118:
                if (str.equals("THREE_GPP")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1934542573:
                if (str.equals("AMR_NB")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1934542852:
                if (str.equals("AMR_WB")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                this.outputFormatAsInt = 0;
                break;
            case 1:
                this.outputFormatAsInt = 1;
                break;
            case 2:
                this.outputFormatAsInt = 3;
                break;
            case 3:
                this.outputFormatAsInt = 4;
                break;
            case 4:
                this.outputFormatAsInt = 6;
                break;
            case 5:
                this.outputFormatAsInt = 8;
                break;
            case 6:
                this.outputFormatAsInt = 9;
                break;
            case 7:
                this.outputFormatAsInt = 11;
                break;
            default:
                this.outputFormatAsInt = 2;
                break;
        }
    }

    private void setvideoEncoderAsInt(String str) {
        str.hashCode();
        switch (str) {
            case "DEFAULT":
                this.videoEncoderAsInt = 0;
                break;
            case "MPEG_4_SP":
                this.videoEncoderAsInt = 3;
                break;
            case "VP8":
                this.videoEncoderAsInt = 4;
                break;
            case "H263":
                this.videoEncoderAsInt = 1;
                break;
            case "H264":
                this.videoEncoderAsInt = 2;
                break;
            case "HEVC":
                this.videoEncoderAsInt = 5;
                break;
        }
    }

    private void setAudioSourceAsInt(String str) {
        str.hashCode();
        switch (str) {
            case "DEFAULT":
                this.audioSourceAsInt = 0;
                break;
            case "VOICE_PERFORMANCE":
                this.audioSourceAsInt = 10;
                break;
            case "VOICE_CALL":
                this.audioSourceAsInt = 4;
                break;
            case "MIC":
                this.audioSourceAsInt = 1;
                break;
            case "VOICE_DOWNLINK":
                this.audioSourceAsInt = 3;
                break;
            case "CAMCODER":
                this.audioSourceAsInt = 5;
                break;
            case "VOICE_RECOGNITION":
                this.audioSourceAsInt = 6;
                break;
            case "VOICE_UPLINK":
                this.audioSourceAsInt = 2;
                break;
            case "UNPROCESSED":
                this.audioSourceAsInt = 9;
                break;
            case "VOICE_COMMUNICATION":
                this.audioSourceAsInt = 7;
                break;
            case "REMOTE_SUBMIX":
                this.audioSourceAsInt = 8;
                break;
        }
    }

    private void initMediaProjection() {
        this.mMediaProjection = ((MediaProjectionManager) Objects.requireNonNull(getSystemService("media_projection"))).getMediaProjection(this.mResultCode, this.mResultData);
    }

    private void initRecorder() throws Exception {
        String str;
        String replace = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss", Locale.getDefault()).format((Date) new java.sql.Date(System.currentTimeMillis())).replace(" ", "");
        if (this.isVideoHD) {
            str = "HD";
        } else {
            str = "SD";
        }
        if (this.name == null) {
            this.name = str + replace;
        }
        filePath = this.path + "/" + this.name + PictureMimeType.MP4;
        fileName = this.name + PictureMimeType.MP4;
        MediaRecorder mediaRecorder = new MediaRecorder();
        this.mMediaRecorder = mediaRecorder;
        if (this.isAudioEnabled) {
            mediaRecorder.setAudioSource(this.audioSourceAsInt);
        }
        this.mMediaRecorder.setVideoSource(2);
        this.mMediaRecorder.setOutputFormat(this.outputFormatAsInt);
        int i = this.orientationHint;
        if (i != 400) {
            this.mMediaRecorder.setOrientationHint(i);
        }
        if (this.isAudioEnabled) {
            this.mMediaRecorder.setAudioEncoder(3);
            this.mMediaRecorder.setAudioEncodingBitRate(this.audioBitrate);
            this.mMediaRecorder.setAudioSamplingRate(this.audioSamplingRate);
        }
        this.mMediaRecorder.setVideoEncoder(this.videoEncoderAsInt);
        if (this.returnedUri != null) {
            try {
                this.mMediaRecorder.setOutputFile(((ParcelFileDescriptor) Objects.requireNonNull(getContentResolver().openFileDescriptor(this.returnedUri, "rw"))).getFileDescriptor());
            } catch (Exception e) {
                ResultReceiver resultReceiver = (ResultReceiver) this.mIntent.getParcelableExtra("listener");
                Bundle bundle = new Bundle();
                bundle.putString("errorReason", Log.getStackTraceString(e));
                if (resultReceiver != null) {
                    resultReceiver.send(-1, bundle);
                }
            }
        } else {
            this.mMediaRecorder.setOutputFile(filePath);
        }
        this.mMediaRecorder.setVideoSize(this.mScreenWidth, this.mScreenHeight);
        if (!this.isCustomSettingsEnabled) {
            if (!this.isVideoHD) {
                this.mMediaRecorder.setVideoEncodingBitRate(12000000);
                this.mMediaRecorder.setVideoFrameRate(30);
            } else {
                this.mMediaRecorder.setVideoEncodingBitRate(this.mScreenWidth * 5 * this.mScreenHeight);
                this.mMediaRecorder.setVideoFrameRate(60);
            }
        } else {
            this.mMediaRecorder.setVideoEncodingBitRate(this.videoBitrate);
            this.mMediaRecorder.setVideoFrameRate(this.videoFrameRate);
        }
        long j = this.maxFileSize;
        if (j > 0) {
            this.mMediaRecorder.setMaxFileSize(j);
        }
        try {
            this.mMediaRecorder.prepare();
        } catch (Exception unused) {
            if (this.videoEncoderAsInt == 5) {
                this.videoEncoderAsInt = 0;
                initRecorder();
            }
        }
    }

    private void initVirtualDisplay() {
        this.mVirtualDisplay = this.mMediaProjection.createVirtualDisplay(TAG, this.mScreenWidth, this.mScreenHeight, this.mScreenDensity, 16, this.mMediaRecorder.getSurface(), null, null);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        resetAll();
        callOnComplete();
    }

    private void createForegroundNotification() {
        NotificationManager notificationManager = (NotificationManager) getSystemService("notification");
        Bundle bundle = new Bundle();
        bundle.putBoolean("isClear", true);
        NotificationChannel notificationChannel = new NotificationChannel("102", "record", 4);
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        notificationChannel.setSound(null, null);
        notificationChannel.setImportance(2);
        notificationManager.createNotificationChannel(notificationChannel);
        startForeground(102, new Notification.Builder(this, "102").setExtras(bundle).setSmallIcon(com.wakeup.commonui.R.mipmap.ic_logo_small).setPriority(-1).setOngoing(true).setContentText("ScreenRecord").build());
    }

    private void callOnComplete() {
        Intent intent = this.mIntent;
        if (intent != null) {
            ResultReceiver resultReceiver = (ResultReceiver) intent.getParcelableExtra("listener");
            Bundle bundle = new Bundle();
            bundle.putString(Constants.ON_COMPLETE_KEY, Constants.ON_COMPLETE);
            if (resultReceiver != null) {
                resultReceiver.send(-1, bundle);
            }
        }
    }

    private void resetAll() {
        stopForeground(true);
        VirtualDisplay virtualDisplay = this.mVirtualDisplay;
        if (virtualDisplay != null) {
            virtualDisplay.release();
            this.mVirtualDisplay = null;
        }
        MediaRecorder mediaRecorder = this.mMediaRecorder;
        if (mediaRecorder != null) {
            mediaRecorder.setOnErrorListener(null);
            this.mMediaRecorder.reset();
        }
        MediaProjection mediaProjection = this.mMediaProjection;
        if (mediaProjection != null) {
            mediaProjection.stop();
            this.mMediaProjection = null;
        }
    }
}
