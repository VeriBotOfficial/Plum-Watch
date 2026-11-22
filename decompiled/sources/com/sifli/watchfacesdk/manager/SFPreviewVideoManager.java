package com.sifli.watchfacesdk.manager;

import android.app.Application;
import android.graphics.Bitmap;
import android.media.Image;
import android.os.Handler;
import android.os.Looper;
import com.sifli.siflicore.blecore.SFBLEManager;
import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.shell.SFBleShellCallback;
import com.sifli.siflicore.util.StringUtil;
import com.sifli.watchfacesdk.shell.SFWatchfaceShell;
import com.sifli.watchfacesdk.util.ColorConvertUtil;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.timer.TimerController;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes17.dex */
public class SFPreviewVideoManager implements SFBleShellCallback {
    private static final String TAG = "SFPreviewVideoManager";
    private static SFPreviewVideoManager mInstance;
    private SFPreviewVideoConfiguration configuration;
    private float fps;
    private int frameCount;
    private Handler handler;
    private boolean isLoadingFiles;
    private long lastRecordTime;
    private SFWatchfaceShell watchfaceShell;
    private WeakReference<SFPreviewVideoManagerCallback> weakCallback;
    private ExecutorService executorService = Executors.newFixedThreadPool(1);
    private boolean isStopping = false;

    @Override // com.sifli.siflicore.shell.SFBleShellCallback
    public void bleShellOnProgress(long j, long j2) {
    }

    private SFPreviewVideoManager() {
        SFWatchfaceShell sFWatchfaceShell = SFWatchfaceShell.getInstance();
        this.watchfaceShell = sFWatchfaceShell;
        sFWatchfaceShell.setCallback(this);
        this.handler = new Handler(Looper.getMainLooper());
    }

    public static SFPreviewVideoManager getInstance() {
        if (mInstance == null) {
            mInstance = new SFPreviewVideoManager();
        }
        return mInstance;
    }

    public void setCallback(SFPreviewVideoManagerCallback sFPreviewVideoManagerCallback) {
        this.weakCallback = new WeakReference<>(sFPreviewVideoManagerCallback);
    }

    public void init(Application application) {
        SFLog.i(TAG, "init.version=2.1.1");
        SFBLEManager.getInstance().init(application);
    }

    @Override // com.sifli.siflicore.shell.SFBleShellCallback
    public void bleShellOnStatusChanged(final int i) {
        final SFPreviewVideoManagerCallback managerCallback = getManagerCallback();
        if (managerCallback != null) {
            this.handler.post(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.1
                @Override // java.lang.Runnable
                public void run() {
                    managerCallback.updateManagerState(SFPreviewVideoManager.this, i);
                }
            });
        }
    }

    @Override // com.sifli.siflicore.shell.SFBleShellCallback
    public void bleShellComplete(boolean z, final SFError sFError) {
        SFLog.i(TAG, "bleShellComplete success=%s,error=%s", Boolean.valueOf(z), sFError);
        final SFPreviewVideoManagerCallback managerCallback = getManagerCallback();
        if (managerCallback != null) {
            this.handler.post(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.2
                @Override // java.lang.Runnable
                public void run() {
                    managerCallback.completeWithError(SFPreviewVideoManager.this, sFError);
                }
            });
        }
    }

    public void setUseHighSpeedMode(boolean z) {
        SFWatchfaceShell sFWatchfaceShell = this.watchfaceShell;
        if (sFWatchfaceShell != null) {
            sFWatchfaceShell.setUseHighSpeedMode(z);
        }
    }

    public boolean isBusy() {
        return this.isLoadingFiles || this.watchfaceShell.isBusy() || this.isStopping;
    }

    private boolean isWorking() {
        return this.isLoadingFiles || this.watchfaceShell.isBusy();
    }

    public int getStatus() {
        return this.watchfaceShell.getShellStatus();
    }

    public void startPreviewVideo(SFPreviewVideoConfiguration sFPreviewVideoConfiguration, final String str) {
        if (sFPreviewVideoConfiguration == null || StringUtil.isNullOrEmpty(str)) {
            callBackInvalidParam("invalid parameters.configuration is null or mac is null");
            return;
        }
        if (isBusy()) {
            SFLog.w(TAG, "startPreviewVideo is busy!");
            return;
        }
        SFLog.i(TAG, "startPriviewVideo width=%s height=%s,jpeg quality=%.1f,mac=%s", Integer.valueOf(sFPreviewVideoConfiguration.getWatchScreenWidth()), Integer.valueOf(sFPreviewVideoConfiguration.getWatchScreenHeight()), Float.valueOf(sFPreviewVideoConfiguration.getJpegQuality()), str);
        this.isLoadingFiles = true;
        this.frameCount = 0;
        this.lastRecordTime = 0L;
        if (sFPreviewVideoConfiguration.getJpegQuality() < 0.0f || sFPreviewVideoConfiguration.getJpegQuality() > 1.0f) {
            callBackInvalidParam("invalid parameters.jpegQuality should between 0-1 float");
        } else {
            this.configuration = sFPreviewVideoConfiguration;
            this.handler.postDelayed(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.3
                @Override // java.lang.Runnable
                public void run() {
                    SFPreviewVideoManager.this.watchfaceShell.startPreviewVideoTaskWithMac(str);
                    SFPreviewVideoManager.this.isLoadingFiles = false;
                }
            }, 1000L);
        }
    }

    public void previewVideoSample(Image image) {
        if (this.configuration == null) {
            return;
        }
        if (image.getFormat() != 35) {
            SFLog.e(TAG, "only support ImageFormat.YUV_420_888");
        } else if (this.watchfaceShell.canSendVideoData()) {
            makeBuffer(image);
        }
    }

    public void setRotation(int i) {
        this.configuration.setRotation(i);
    }

    public void setMirroredHorizontally(boolean z) {
        this.configuration.setMirroredHorizontally(z);
    }

    public void endPreviewVideo() {
        SFLog.i(TAG, "endPreviewVideo");
        this.watchfaceShell.previewVideoEntireEnd();
    }

    public void stop() {
        SFLog.i(TAG, TimerController.STOP_COMMAND);
        if (this.isStopping) {
            SFLog.i(TAG, "isStopping = true,return");
            return;
        }
        this.isStopping = true;
        if (!isWorking()) {
            this.watchfaceShell.stop();
            this.isStopping = false;
        } else {
            this.watchfaceShell.previewVideoEntireEnd();
            this.handler.postDelayed(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.4
                @Override // java.lang.Runnable
                public void run() {
                    SFPreviewVideoManager.this.watchfaceShell.stop();
                    SFPreviewVideoManager.this.isStopping = false;
                }
            }, 1000L);
        }
    }

    private SFPreviewVideoManagerCallback getManagerCallback() {
        WeakReference<SFPreviewVideoManagerCallback> weakReference = this.weakCallback;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    private void setFps(final float f) {
        this.fps = f;
        final SFPreviewVideoManagerCallback managerCallback = getManagerCallback();
        if (managerCallback != null) {
            this.handler.post(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.5
                @Override // java.lang.Runnable
                public void run() {
                    managerCallback.onFps(SFPreviewVideoManager.this, f);
                }
            });
        }
    }

    private void callBackInvalidParam(String str) {
        this.isLoadingFiles = false;
        final SFPreviewVideoManagerCallback managerCallback = getManagerCallback();
        final SFError sFError = new SFError(15, str);
        if (managerCallback != null) {
            this.handler.post(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.6
                @Override // java.lang.Runnable
                public void run() {
                    managerCallback.completeWithError(SFPreviewVideoManager.this, sFError);
                }
            });
        }
    }

    private long timeNow() {
        return System.currentTimeMillis();
    }

    private void computeFps() {
        this.frameCount++;
        long timeNow = timeNow();
        if (this.lastRecordTime == 0) {
            this.lastRecordTime = timeNow;
        }
        if (timeNow - this.lastRecordTime > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            this.frameCount = 0;
            this.lastRecordTime = 0L;
        }
        if (timeNow > this.lastRecordTime) {
            setFps(this.frameCount / ((timeNow - r2) / 1000));
            SFLog.d(TAG, "send sample.fps=%.1f,fc=%d,time=%d", Float.valueOf(this.fps), Integer.valueOf(this.frameCount), Long.valueOf(timeNow - this.lastRecordTime));
        }
    }

    private void makeBuffer(Image image) {
        final int width = image.getWidth();
        final int height = image.getHeight();
        long timeNow = timeNow();
        final byte[] bArr = new byte[((width * height) * 3) / 2];
        ColorConvertUtil.getI420FromImage(image, bArr);
        SFLog.i(TAG, "makeBuffer sample->yuv time=%d", Long.valueOf(timeNow() - timeNow));
        this.executorService.execute(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.7
            @Override // java.lang.Runnable
            public void run() {
                SFPreviewVideoManager.this.makeJpgBuffer(width, height, bArr);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeJpgBuffer(int i, int i2, byte[] bArr) {
        if (!this.watchfaceShell.canSendVideoData()) {
            SFLog.i(TAG, "makeJpgBuffer buffer is full,return");
            return;
        }
        SFLog.i(TAG, "makeBuffer");
        long timeNow = timeNow();
        int jpegQuality = (int) (this.configuration.getJpegQuality() * 100.0f);
        Bitmap aspectToSize = ColorConvertUtil.aspectToSize(ColorConvertUtil.yuv420pToBitmap(bArr, i, i2), this.configuration.getWatchScreenWidth(), this.configuration.getWatchScreenHeight(), this.configuration.getRotation(), this.configuration.isMirroredHorizontally());
        int width = aspectToSize.getWidth();
        int height = aspectToSize.getHeight();
        final byte[] makeYCbCrJpg = ColorConvertUtil.makeYCbCrJpg(aspectToSize, jpegQuality);
        SFLog.d(TAG, "make buffer jpgData bytes=%d,time=%d,size=%d,%d", Integer.valueOf(makeYCbCrJpg != null ? makeYCbCrJpg.length : 0), Long.valueOf(timeNow() - timeNow), Integer.valueOf(width), Integer.valueOf(height));
        sendBuffer(makeYCbCrJpg);
        final SFPreviewVideoManagerCallback managerCallback = getManagerCallback();
        if (managerCallback != null) {
            this.handler.post(new Runnable() { // from class: com.sifli.watchfacesdk.manager.SFPreviewVideoManager.8
                @Override // java.lang.Runnable
                public void run() {
                    managerCallback.onImageMake(makeYCbCrJpg);
                }
            });
        }
    }

    private void sendBuffer(byte[] bArr) {
        SFLog.i(TAG, "start send jpgBuffer...");
        if (this.watchfaceShell.canSendVideoData()) {
            this.watchfaceShell.sendVideoData(bArr);
            computeFps();
        } else {
            SFLog.w(TAG, "warning!!!,buffer was made,but not been send");
        }
    }
}
