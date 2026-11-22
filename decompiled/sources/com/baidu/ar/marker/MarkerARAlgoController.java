package com.baidu.ar.marker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.baidu.ar.algo.FrameType;
import com.baidu.ar.cd;
import com.baidu.ar.la;
import com.baidu.ar.marker.MarkerARAlgoJniClient;
import com.baidu.ar.marker.model.TranslationPrior;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public class MarkerARAlgoController implements IMarkerTracker {
    private IMarkerDataProvider iMarkerDataProvider;
    private boolean mActiveIsRunning;
    private boolean mAlgoIsRunning;
    private String mConfigFilePath;
    private TrackerType mCurrentTrackerType;
    private int mFrameFps;
    private int mInputHeight;
    private int mInputWidth;
    private a mMarkerARAlgoHandler;
    private MarkerARAlgoJniClient mMarkerARAlgoJniClient;
    private HandlerThread mMarkerThread;
    private float[] mNativeCameraIntrinsic;
    private la mPreviewInfo;
    private float[] mRemoteCameraIntrinsic;
    private TranslationPrior mTranslationPrior;
    private float[] mDefaultCameraIntrinsic = {1095.9f, 0.0f, 719.122f, 0.0f, 1095.8f, 548.474f, 0.0f, 0.0f, 1.0f};
    private float[] mCameraIntrinsicForOdometry = {1200.0f, 0.0f, 640.0f, 0.0f, 1200.0f, 360.0f, 0.0f, 0.0f, 1.0f};
    private float[] mCameraDistort = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
    private double[] mMagnets = {-1.0d, -1.0d, -1.0d};
    private int mTrackerState = 0;
    private String mConfigFileName = "config.txt";
    private String mConfigFileDir = "algoDir";

    public static class a extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<MarkerARAlgoController> f7085a;

        public a(MarkerARAlgoController markerARAlgoController, Looper looper) {
            super(looper);
            this.f7085a = new WeakReference<>(markerARAlgoController);
        }

        public void a() {
            if (this.f7085a.get() != null) {
                this.f7085a.clear();
                this.f7085a = null;
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<MarkerARAlgoController> weakReference = this.f7085a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            super.handleMessage(message);
            int i = message.what;
            if (i == 0) {
                this.f7085a.get().updateFrameToAlgo((cd) message.obj);
                return;
            }
            if (i == 1) {
                this.f7085a.get().getAlgoClient().receivProtoBuf((byte[]) message.obj);
            } else if (i != 2) {
                if (i != 3) {
                    return;
                }
                this.f7085a.get().release();
            } else {
                TranslationPrior translationPrior = (TranslationPrior) message.obj;
                this.f7085a.get().mTranslationPrior = new TranslationPrior(translationPrior);
            }
        }
    }

    public MarkerARAlgoController(int i, int i2, float[] fArr, String str, int i3, String str2) {
        this.mFrameFps = 30;
        if (fArr != null && fArr.length > 0) {
            this.mRemoteCameraIntrinsic = fArr;
        }
        this.mFrameFps = i3;
        this.mInputWidth = i;
        this.mInputHeight = i2;
        this.mPreviewInfo = la.a(i, i2);
        writerAlgoConfigFile(str2, str);
        initHandleLooper();
    }

    private int createQuerierSystem(String str, TrackerType trackerType, int i) {
        int createQuerierSystem = getAlgoClient().createQuerierSystem(this.mInputWidth, this.mInputHeight, this.mDefaultCameraIntrinsic, this.mPreviewInfo.b(), WorkType.WORK_NAVIGATION.getValue(), trackerType, str, i);
        setAlgoState(createQuerierSystem == 0);
        return createQuerierSystem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MarkerARAlgoJniClient getAlgoClient() {
        if (this.mMarkerARAlgoJniClient == null) {
            this.mMarkerARAlgoJniClient = new MarkerARAlgoJniClient();
        }
        return this.mMarkerARAlgoJniClient;
    }

    private void initHandleLooper() {
        if (this.mMarkerThread == null) {
            HandlerThread handlerThread = new HandlerThread("MarkerARAlgoController");
            this.mMarkerThread = handlerThread;
            handlerThread.start();
        }
        this.mMarkerARAlgoHandler = new a(this, this.mMarkerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void release() {
        a aVar = this.mMarkerARAlgoHandler;
        if (aVar != null) {
            aVar.a();
            this.mMarkerARAlgoHandler.getLooper().quit();
            this.mMarkerThread.quit();
            this.mMarkerARAlgoHandler = null;
            this.mMarkerThread = null;
            getAlgoClient().release();
        }
        JniTransDataCalback.setMarkerDataProvider(null);
    }

    private void setActiveIsRunning(boolean z) {
        this.mActiveIsRunning = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateFrameToAlgo(cd cdVar) {
        queryFrame(cdVar.e(), cdVar);
        double[] dArr = new double[14];
        int locationPoint = getLocationPoint(dArr);
        IMarkerDataProvider iMarkerDataProvider = this.iMarkerDataProvider;
        if (iMarkerDataProvider != null) {
            iMarkerDataProvider.setLocationPoints(locationPoint, dArr);
            this.iMarkerDataProvider.setVpasState(getAlgoClient().getVpasSuccessCount(), getAlgoClient().getFinalStepCount(), getAlgoClient().getStepLength());
        }
        cdVar.a();
    }

    private void writerAlgoConfigFile(String str, String str2) {
        FileWriter fileWriter;
        StringBuilder append = new StringBuilder().append(str);
        String str3 = File.separator;
        this.mConfigFilePath = append.append(str3).append(this.mConfigFileDir).toString();
        File file = new File(this.mConfigFilePath + str3 + this.mConfigFileName);
        File parentFile = file.getParentFile();
        if (!parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileWriter fileWriter2 = null;
        try {
            try {
                try {
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    fileWriter = new FileWriter(file);
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
                fileWriter = fileWriter2;
            }
            try {
                if (TextUtils.isEmpty(str2)) {
                    str2 = "1";
                }
                fileWriter.write(str2);
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e2) {
                e = e2;
                fileWriter2 = fileWriter;
                e.printStackTrace();
                if (fileWriter2 != null) {
                    fileWriter2.close();
                }
            } catch (Throwable th2) {
                th = th2;
                if (fileWriter != null) {
                    try {
                        fileWriter.close();
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (IOException e4) {
            e4.printStackTrace();
        }
    }

    public boolean algoIsReady() {
        return this.mAlgoIsRunning;
    }

    public int chooseFloor(int i) {
        return getAlgoClient().chooseMap(i);
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void chooseMap(int i) {
        getAlgoClient().chooseMap(i);
    }

    public String getAlgoSoVersion() {
        getAlgoClient();
        return MarkerARAlgoJniClient.getVersion();
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public boolean getAlgoState() {
        return algoIsReady();
    }

    public int getLocationPoint(double[] dArr) {
        if (isActive()) {
            return getAlgoClient().getLocationPoint(dArr);
        }
        return -1;
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public int init(TrackerType trackerType) {
        this.mCurrentTrackerType = trackerType;
        onActiveResume();
        return createQuerierSystem(this.mConfigFilePath, trackerType, this.mFrameFps);
    }

    public boolean isActive() {
        return this.mActiveIsRunning;
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void loadAlgoSo(MarkerARAlgoJniClient.a aVar) {
        getAlgoClient().setOnAlgoSoLoadedComplteCallback(aVar);
        getAlgoClient().loadSoLibs();
    }

    public void onActivePause() {
        setActiveIsRunning(false);
    }

    public void onActiveResume() {
        setActiveIsRunning(true);
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void onTrack(byte[] bArr, int i, int i2, float[] fArr, float[] fArr2) {
        if (fArr == null || fArr.length <= 0 || this.mMarkerARAlgoHandler == null) {
            return;
        }
        TrackerType trackerType = this.mCurrentTrackerType;
        TrackerType trackerType2 = TrackerType.STEP_ODOMETRY_ANDROID;
        if (trackerType == trackerType2) {
            fArr = new float[]{fArr[0], fArr[1], fArr[2], fArr[4], fArr[5], fArr[6], fArr[8], fArr[9], fArr[10], 0.0f, 0.0f, 0.0f};
        }
        cd cdVar = new cd();
        cdVar.a(bArr);
        cdVar.c(this.mInputWidth);
        cdVar.a(this.mInputHeight);
        cdVar.d(fArr2);
        cdVar.b(1);
        cdVar.b(fArr);
        cdVar.e(fArr);
        cdVar.a(FrameType.TYPE_YUV);
        cdVar.a(System.currentTimeMillis());
        cdVar.a(this.mTrackerState == 0 ? TrackerStatus.TRACKING_STATUS_NORMAL : TrackerStatus.TRACKING_STATUS_LIMITED_UNKNOWN);
        float[] fArr3 = this.mRemoteCameraIntrinsic;
        if (fArr3 == null || this.mNativeCameraIntrinsic != null) {
            cdVar.c(this.mNativeCameraIntrinsic);
        } else {
            cdVar.c(fArr3);
        }
        if (this.mCurrentTrackerType == trackerType2) {
            cdVar.c(this.mCameraIntrinsicForOdometry);
        }
        cdVar.a(this.mCameraDistort);
        cdVar.a(this.mMagnets);
        cdVar.a(this.mTranslationPrior);
        Message message = new Message();
        message.what = 0;
        message.obj = cdVar;
        this.mMarkerARAlgoHandler.sendMessage(message);
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void onTrackPause() {
        onActivePause();
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void onTrackRelease() {
        if (this.mMarkerARAlgoHandler != null) {
            Message message = new Message();
            message.what = 3;
            this.mMarkerARAlgoHandler.sendMessage(message);
        }
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void onTrackReset() {
        getAlgoClient().reset();
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void onTrackResume() {
        onActiveResume();
    }

    public boolean queryFrame(byte[] bArr, cd cdVar) {
        return getAlgoClient().trackFrameBytes(bArr, cdVar);
    }

    public void setAlgoState(boolean z) {
        this.mAlgoIsRunning = z;
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void setCameraParams(float[] fArr, float[] fArr2, int i, double[] dArr) {
        this.mNativeCameraIntrinsic = fArr;
        this.mCameraDistort = fArr2;
        this.mTrackerState = i;
        if (dArr != null) {
            this.mMagnets = dArr;
        }
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void setDataProvider(IMarkerDataProvider iMarkerDataProvider) {
        this.iMarkerDataProvider = iMarkerDataProvider;
        JniTransDataCalback.setMarkerDataProvider(iMarkerDataProvider);
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void transProtoDataJNIFromServer(byte[] bArr) {
        if (this.mMarkerARAlgoHandler != null) {
            Message message = new Message();
            message.what = 1;
            message.obj = bArr;
            this.mMarkerARAlgoHandler.sendMessage(message);
        }
    }

    @Override // com.baidu.ar.marker.IMarkerTracker
    public void updateTranslationPrior(TranslationPrior translationPrior) {
        this.mTranslationPrior = new TranslationPrior(translationPrior);
    }
}
