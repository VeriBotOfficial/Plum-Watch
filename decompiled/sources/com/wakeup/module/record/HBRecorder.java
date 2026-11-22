package com.wakeup.module.record;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.ResultReceiver;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.huawei.hms.api.HuaweiApiAvailability;
import java.io.File;
import java.util.Iterator;

/* loaded from: classes4.dex */
public class HBRecorder implements MyListener {
    private final Context context;
    private String fileName;
    private final HBRecorderListener hbRecorderListener;
    private int mScreenDensity;
    private int mScreenHeight;
    private int mScreenWidth;
    Uri mUri;
    private FileObserver observer;
    private int orientation;
    private String outputPath;
    private int resultCode;
    Intent service;
    boolean wasOnErrorCalled = false;
    boolean isPaused = false;
    boolean isMaxDurationSet = false;
    int maxDuration = 0;
    boolean mWasUriSet = false;
    Countdown countDown = null;
    private boolean isAudioEnabled = true;
    private boolean isVideoHDEnabled = true;
    private Handler mHandler = new Handler(Looper.getMainLooper());
    private int audioBitrate = 0;
    private int audioSamplingRate = 0;
    private String audioSource = "MIC";
    private String videoEncoder = "DEFAULT";
    private boolean enableCustomSettings = false;
    private int videoFrameRate = 30;
    private int videoBitrate = HuaweiApiAvailability.HMS_VERSION_CODE_KIT_UPDATE;
    private String outputFormat = "DEFAULT";
    private long maxFileSize = 0;

    public HBRecorder(Context context, HBRecorderListener hBRecorderListener) {
        this.context = context.getApplicationContext();
        this.hbRecorderListener = hBRecorderListener;
        setScreenDensity();
    }

    public void setOrientationHint(int i) {
        this.orientation = i;
    }

    public void setOutputPath(String str) {
        this.outputPath = str;
    }

    public void setOutputUri(Uri uri) {
        this.mWasUriSet = true;
        this.mUri = uri;
    }

    public void setMaxDuration(int i) {
        this.isMaxDurationSet = true;
        this.maxDuration = i * 1000;
    }

    public void setMaxFileSize(long j) {
        this.maxFileSize = j;
    }

    public boolean wasUriSet() {
        return this.mWasUriSet;
    }

    public void setAudioBitrate(int i) {
        this.audioBitrate = i;
    }

    public void setAudioSamplingRate(int i) {
        this.audioSamplingRate = i;
    }

    public void isAudioEnabled(boolean z) {
        this.isAudioEnabled = z;
    }

    public void setAudioSource(String str) {
        this.audioSource = str;
    }

    public void recordHDVideo(boolean z) {
        this.isVideoHDEnabled = z;
    }

    public void setVideoEncoder(String str) {
        this.videoEncoder = str;
    }

    public void enableCustomSettings() {
        this.enableCustomSettings = true;
    }

    public void setVideoFrameRate(int i) {
        this.videoFrameRate = i;
    }

    public void setVideoBitrate(int i) {
        this.videoBitrate = i;
    }

    public void setOutputFormat(String str) {
        this.outputFormat = str;
    }

    private void setScreenDensity() {
        this.mScreenDensity = Resources.getSystem().getDisplayMetrics().densityDpi;
    }

    public int getDefaultWidth() {
        HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
        hBRecorderCodecInfo.setContext(this.context);
        return hBRecorderCodecInfo.getMaxSupportedWidth();
    }

    public int getDefaultHeight() {
        HBRecorderCodecInfo hBRecorderCodecInfo = new HBRecorderCodecInfo();
        hBRecorderCodecInfo.setContext(this.context);
        return hBRecorderCodecInfo.getMaxSupportedHeight();
    }

    public void setScreenDimensions(int i, int i2) {
        this.mScreenHeight = i;
        this.mScreenWidth = i2;
    }

    public String getFilePath() {
        return ScreenRecordService.getFilePath();
    }

    public String getFileName() {
        return ScreenRecordService.getFileName();
    }

    public void setFileName(String str) {
        this.fileName = str;
    }

    public void startScreenRecording(Intent intent, int i) {
        this.resultCode = i;
        startService(intent);
    }

    public void stopScreenRecording() {
        this.context.stopService(new Intent(this.context, (Class<?>) ScreenRecordService.class));
    }

    public void pauseScreenRecording() {
        Intent intent = this.service;
        if (intent != null) {
            this.isPaused = true;
            intent.setAction("pause");
            this.context.startService(this.service);
        }
    }

    public void resumeScreenRecording() {
        Intent intent = this.service;
        if (intent != null) {
            this.isPaused = false;
            intent.setAction("resume");
            this.context.startService(this.service);
        }
    }

    public boolean isRecordingPaused() {
        return this.isPaused;
    }

    public boolean isBusyRecording() {
        ActivityManager activityManager = (ActivityManager) this.context.getSystemService(Const.STR_PROCESS_TAG);
        if (activityManager == null) {
            return false;
        }
        Iterator<ActivityManager.RunningServiceInfo> it = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();
        while (it.hasNext()) {
            if (ScreenRecordService.class.getName().equals(it.next().service.getClassName())) {
                return true;
            }
        }
        return false;
    }

    private void startService(Intent intent) {
        try {
            if (!this.mWasUriSet) {
                if (this.outputPath != null) {
                    this.observer = new FileObserver(new File(this.outputPath).getParent(), this);
                } else {
                    this.observer = new FileObserver(String.valueOf(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES)), this);
                }
                this.observer.startWatching();
            }
            Intent intent2 = new Intent(this.context, (Class<?>) ScreenRecordService.class);
            this.service = intent2;
            if (this.mWasUriSet) {
                intent2.putExtra("mUri", this.mUri.toString());
            }
            this.service.putExtra("code", this.resultCode);
            this.service.putExtra("data", intent);
            this.service.putExtra("audio", this.isAudioEnabled);
            this.service.putExtra("width", this.mScreenWidth);
            this.service.putExtra("height", this.mScreenHeight);
            this.service.putExtra("density", this.mScreenDensity);
            this.service.putExtra("quality", this.isVideoHDEnabled);
            this.service.putExtra("path", this.outputPath);
            this.service.putExtra("fileName", this.fileName);
            this.service.putExtra("orientation", this.orientation);
            this.service.putExtra("audioBitrate", this.audioBitrate);
            this.service.putExtra("audioSamplingRate", this.audioSamplingRate);
            this.service.putExtra("enableCustomSettings", this.enableCustomSettings);
            this.service.putExtra("audioSource", this.audioSource);
            this.service.putExtra("videoEncoder", this.videoEncoder);
            this.service.putExtra("videoFrameRate", this.videoFrameRate);
            this.service.putExtra("videoBitrate", this.videoBitrate);
            this.service.putExtra("outputFormat", this.outputFormat);
            this.service.putExtra("listener", new ResultReceiver(new Handler()) { // from class: com.wakeup.module.record.HBRecorder.1
                @Override // android.os.ResultReceiver
                protected void onReceiveResult(int i, Bundle bundle) {
                    super.onReceiveResult(i, bundle);
                    if (i == -1) {
                        String string = bundle.getString("errorReason");
                        String string2 = bundle.getString(Constants.ON_COMPLETE_KEY);
                        int i2 = bundle.getInt(Constants.ON_START_KEY);
                        int i3 = bundle.getInt("error");
                        if (string != null) {
                            HBRecorder.this.stopCountDown();
                            if (!HBRecorder.this.mWasUriSet) {
                                HBRecorder.this.observer.stopWatching();
                            }
                            HBRecorder.this.wasOnErrorCalled = true;
                            if (i3 > 0) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnError(i3, string);
                            } else {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnError(100, string);
                            }
                            try {
                                HBRecorder.this.context.stopService(new Intent(HBRecorder.this.context, (Class<?>) ScreenRecordService.class));
                                return;
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        if (string2 != null) {
                            HBRecorder.this.stopCountDown();
                            if (HBRecorder.this.mWasUriSet && !HBRecorder.this.wasOnErrorCalled) {
                                HBRecorder.this.hbRecorderListener.HBRecorderOnComplete();
                            }
                            HBRecorder.this.wasOnErrorCalled = false;
                            return;
                        }
                        if (i2 != 0) {
                            HBRecorder.this.hbRecorderListener.HBRecorderOnStart();
                            if (HBRecorder.this.isMaxDurationSet) {
                                HBRecorder.this.startCountdown();
                            }
                        }
                    }
                }
            });
            this.service.putExtra(Constants.MAX_FILE_SIZE_KEY, this.maxFileSize);
            this.context.startService(this.service);
        } catch (Exception e) {
            this.hbRecorderListener.HBRecorderOnError(0, Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startCountdown() {
        Countdown countdown = new Countdown(this.maxDuration, 1000L, 0L) { // from class: com.wakeup.module.record.HBRecorder.2
            @Override // com.wakeup.module.record.Countdown
            public void onStopCalled() {
            }

            @Override // com.wakeup.module.record.Countdown
            public void onTick(long j) {
            }

            @Override // com.wakeup.module.record.Countdown
            public void onFinished() {
                onTick(0L);
                HBRecorder.this.mHandler.post(new Runnable() { // from class: com.wakeup.module.record.HBRecorder.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            HBRecorder.this.stopScreenRecording();
                            HBRecorder.this.observer.stopWatching();
                            HBRecorder.this.hbRecorderListener.HBRecorderOnComplete();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        };
        this.countDown = countdown;
        countdown.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopCountDown() {
        Countdown countdown = this.countDown;
        if (countdown != null) {
            countdown.stop();
        }
    }

    @Override // com.wakeup.module.record.MyListener
    public void callback() {
        this.observer.stopWatching();
        this.hbRecorderListener.HBRecorderOnComplete();
    }
}
