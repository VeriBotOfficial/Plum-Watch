package com.baidu.ar.arplay.core.engine;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import com.baidu.ar.arplay.core.engine.ARPContent;
import com.baidu.ar.arplay.core.engine.ARPDataInteraction;
import com.baidu.ar.arplay.core.engine.engine3d.AbstractARPEngine3D;
import com.baidu.ar.arplay.core.engine.engine3d.IARPEngine3D;
import com.baidu.ar.arplay.core.engine.engine3d.IARPScene;
import com.baidu.ar.arplay.core.engine3d.ARPEngine3D;
import com.baidu.ar.arplay.core.message.ARPMessage;
import com.baidu.ar.arplay.core.renderer.ARPFilter;
import com.baidu.ar.arplay.core.renderer.ARPRenderer;
import com.baidu.ar.arplay.core.renderer.IARPRenderer;
import com.baidu.ar.arplay.util.LogUtil;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class ARPEngine {
    private static final String ENGINE_3D_CLASS_NAME = "com.baidu.ar.arplay.core.engine3d.ARPEngine3D";
    private static final String LOWEST_VERSION_KEY = "compatible_version";
    private static final String TAG = "ARPEngine";
    private static ARPEngine self;
    private ARPDataInteraction mARPDataInteraction;
    private AbstractARPEngine3D mARPEngine3D;
    private ARPEngineParams mARPEngineParams;
    private a mListener;
    public boolean mScenePausedByUser;
    private boolean mIsInitNative = false;
    private volatile boolean mIsEngineCreated = false;
    private boolean mIsPaused = false;
    private ARPContent mARPContent = new ARPContent();
    private ARPFilter mARPFilter = new ARPFilter();
    private ARPRenderer mARPRenderer = new ARPRenderer();

    public interface a {
        void a();
    }

    private ARPEngine() {
        ARPDataInteraction aRPDataInteraction = new ARPDataInteraction();
        this.mARPDataInteraction = aRPDataInteraction;
        this.mARPContent.registerCaseLoadListener(aRPDataInteraction);
        initEngine3DInstance();
    }

    private boolean createApp(int i, int i2, int i3, int i4, float f, String str) {
        LogUtil.b(TAG, "createApp [width*height]: [" + i + "*" + i2 + "]");
        boolean nativeCreateApp = nativeCreateApp(i, i2, i3, i4, f, str);
        this.mIsEngineCreated = true;
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setEngineCreated(this.mIsEngineCreated);
        }
        return nativeCreateApp;
    }

    public static synchronized ARPEngine getInstance() {
        ARPEngine aRPEngine;
        synchronized (ARPEngine.class) {
            if (self == null) {
                self = new ARPEngine();
                LogUtil.b(TAG, "create instance : " + self);
            }
            aRPEngine = self;
        }
        return aRPEngine;
    }

    private void initEngine3DInstance() {
        try {
            Object newInstance = ARPEngine3D.class.newInstance();
            if (newInstance instanceof IARPEngine3D) {
                this.mARPEngine3D = (AbstractARPEngine3D) newInstance;
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
        } catch (InstantiationException e3) {
            e3.printStackTrace();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r0.mIsEngineCreated != false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized boolean isEngineCreated() {
        /*
            java.lang.String r0 = "isEngineCreated : "
            java.lang.Class<com.baidu.ar.arplay.core.engine.ARPEngine> r1 = com.baidu.ar.arplay.core.engine.ARPEngine.class
            monitor-enter(r1)
            java.lang.String r2 = "ARPEngine"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L3c
            com.baidu.ar.arplay.core.engine.ARPEngine r0 = com.baidu.ar.arplay.core.engine.ARPEngine.self     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = " ："
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            com.baidu.ar.arplay.core.engine.ARPEngine r3 = com.baidu.ar.arplay.core.engine.ARPEngine.self     // Catch: java.lang.Throwable -> L3c
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L24
            boolean r3 = r3.mIsEngineCreated     // Catch: java.lang.Throwable -> L3c
            if (r3 == 0) goto L24
            r3 = r4
            goto L25
        L24:
            r3 = r5
        L25:
            java.lang.StringBuilder r0 = r0.append(r3)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            com.baidu.ar.arplay.util.LogUtil.b(r2, r0)     // Catch: java.lang.Throwable -> L3c
            com.baidu.ar.arplay.core.engine.ARPEngine r0 = com.baidu.ar.arplay.core.engine.ARPEngine.self     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L39
            boolean r0 = r0.mIsEngineCreated     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L39
            goto L3a
        L39:
            r4 = r5
        L3a:
            monitor-exit(r1)
            return r4
        L3c:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L3c
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.arplay.core.engine.ARPEngine.isEngineCreated():boolean");
    }

    private native boolean nativeSetup(Object obj, String str);

    public static synchronized void releaseInstance() {
        synchronized (ARPEngine.class) {
            ARPEngine aRPEngine = self;
            if (aRPEngine != null) {
                aRPEngine.destroy();
            }
            LogUtil.b(TAG, "release instance : " + self);
            self = null;
        }
    }

    public void addAlgoType(int[] iArr, int i) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.addAlgoType(iArr, i);
        }
    }

    public String adjustFilterWithCasePathParam(String str) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter == null) {
            return null;
        }
        aRPFilter.adjustFilterWithCasePathParam(str);
        return null;
    }

    public void adjustFilterWithFloatArrayParam(String str, String str2, float[] fArr, long j) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithFloatArrayParam(str, str2, fArr, j);
        }
    }

    public void adjustFilterWithFloatParam(String str, String str2, float f, long j) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithFloatParam(str, str2, f, j);
        }
    }

    public void adjustFilterWithIntParam(String str, String str2, int i, long j) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithIntParam(str, str2, i, j);
        }
    }

    public String adjustFilterWithJsonPathParam(String str) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            return aRPFilter.adjustFilterWithJsonPathParam(str);
        }
        return null;
    }

    public void adjustFilterWithStringParam(String str, String str2, String str3, long j) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.adjustFilterWithStringParam(str, str2, str3, j);
        }
    }

    public void clearARMemory() {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.clearARMemory();
        }
    }

    public void clearAlgoCache() {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.clearAlgoCache();
        }
    }

    public boolean createEngine(ARPEngineParams aRPEngineParams) {
        Throwable th;
        ARPEngine aRPEngine;
        synchronized (this) {
            boolean z = false;
            try {
                try {
                    if (aRPEngineParams == null) {
                        return false;
                    }
                    try {
                        this.mARPEngineParams = aRPEngineParams;
                        if (!this.mIsInitNative) {
                            z = nativeSetup(new WeakReference(this), "6.4.0");
                            this.mIsInitNative = true;
                        }
                        if (this.mIsEngineCreated) {
                            aRPEngine = this;
                        } else {
                            aRPEngine = this;
                            z = aRPEngine.createApp(this.mARPEngineParams.getInputWidth(), this.mARPEngineParams.getInputHeight(), this.mARPEngineParams.getOutputWidth(), this.mARPEngineParams.getOutputHeight(), this.mARPEngineParams.getDensity(), this.mARPEngineParams.getShaderDBPath());
                            ARPDataInteraction aRPDataInteraction = aRPEngine.mARPDataInteraction;
                            if (aRPDataInteraction != null) {
                                aRPDataInteraction.setup();
                            }
                        }
                        AbstractARPEngine3D abstractARPEngine3D = aRPEngine.mARPEngine3D;
                        if (abstractARPEngine3D != null) {
                            abstractARPEngine3D.setIsActiveByARPlayVersionCase(isDriverdByARPVersion());
                        }
                        aRPEngine.mARPContent.setIsFrontCamera(aRPEngine.mARPEngineParams.isIsFrontCamera());
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public synchronized void destroy() {
        LogUtil.b(TAG, "destroy");
        ARPRenderer aRPRenderer = this.mARPRenderer;
        if (aRPRenderer != null) {
            aRPRenderer.destroy();
        }
    }

    public synchronized void destroyEngine() {
        LogUtil.b(TAG, "destroyEngine");
        this.mIsEngineCreated = false;
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.destroy();
        }
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setEngineCreated(this.mIsEngineCreated);
            this.mARPContent.destroy();
        }
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.destroy();
        }
        nativeSetEngineBlendState(0);
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.destroy();
        }
        ARPMessage.getInstance().receiveMsgFromEngine(7, 0, null, 0);
    }

    public void destroyMockAlgoHandle(long j) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.destroyMockAlgoHandle(j);
        }
    }

    public void disableCaseLutTexture() {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.disableCaseLutTexture();
        }
    }

    public void disableFilterByAuthCode(int i) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.disableFilterByAuthCode(i);
        }
    }

    public IARPRenderer getARPRenderer() {
        return this.mARPRenderer;
    }

    public IARPScene getCurrentScene() {
        AbstractARPEngine3D abstractARPEngine3D;
        if (isEngineCanAccess() && (abstractARPEngine3D = this.mARPEngine3D) != null) {
            return abstractARPEngine3D.getCurrentScene();
        }
        return null;
    }

    public float[] getPreviewSize() {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            return aRPContent.getPreviewSize();
        }
        return null;
    }

    public float[] getWindowSize() {
        ARPContent aRPContent = this.mARPContent;
        return aRPContent != null ? aRPContent.getWindowSize() : new float[0];
    }

    public void initDataStore(SharedPreferences sharedPreferences) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.initDataStore(sharedPreferences);
        }
    }

    public void initWorldAxis() {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.initWorldAxis();
        }
    }

    public boolean isAppControllerInterrupt() {
        return nativeIsAppControllerInterrupt();
    }

    public boolean isDriverdByARPVersion() {
        String str;
        Object sharedEnvironmentValue = ARPScriptEnvironment.getInstance().getSharedEnvironmentValue("caseinfo");
        if (sharedEnvironmentValue != null && (sharedEnvironmentValue instanceof HashMap)) {
            HashMap hashMap = (HashMap) sharedEnvironmentValue;
            return (hashMap.get(LOWEST_VERSION_KEY) instanceof String) && (str = (String) hashMap.get(LOWEST_VERSION_KEY)) != "" && str.compareTo("2.0.0") >= 0;
        }
        return false;
    }

    public boolean isEngineCanAccess() {
        return this.mIsEngineCreated && this.mARPContent.isCaseCreated();
    }

    public boolean isPaused() {
        return this.mIsPaused;
    }

    public synchronized int loadCaseWithResPath(String str) {
        ARPRenderer aRPRenderer;
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent == null || (aRPRenderer = this.mARPRenderer) == null) {
            return -1;
        }
        return aRPContent.loadCaseWithResPath(str, aRPRenderer.getCameraPreviewWidth(), this.mARPRenderer.getCameraPreviewHeight());
    }

    public long mockFaceAlgoHandle(long j, float[] fArr) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            return aRPDataInteraction.mockFaceAlgoHandle(j, fArr);
        }
        return -1L;
    }

    public native boolean nativeCreateApp(int i, int i2, int i3, int i4, float f, String str);

    public native void nativeDestroyEngine();

    public native boolean nativeIsAppControllerInterrupt();

    public native void nativeOnPause();

    public native void nativeOnResume();

    public native void nativeSetConfig(String str, String str2);

    public native void nativeSetEngineBlendState(int i);

    public native void nativeSetLocalDeviceGrade(int i);

    public synchronized void onCaseLoadCompleted(Map map) {
        if (map == null) {
            return;
        }
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.setIsActiveByARPlayVersionCase(isDriverdByARPVersion());
        }
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null && aRPContent.checkValid(ARPContent.c.OnCaseLoaded)) {
            ARPRenderer aRPRenderer = this.mARPRenderer;
            if (aRPRenderer != null) {
                aRPRenderer.clearAllAsyncRenderTask();
            }
            this.mARPContent.onCaseLoadCompleted(map);
            a aVar = this.mListener;
            if (aVar != null) {
                aVar.a();
            }
        }
        if (this.mIsPaused) {
            nativeOnPause();
        }
    }

    public void onCaseUnloadCompleted() {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.onCaseUnloadCompleted();
        }
    }

    public void onGestureUpdate(int i, long j, int i2, float f, float f2, float f3, float f4, int i3, float f5, float f6, float f7, float f8, int i4, float f9) {
        ARPDataInteraction aRPDataInteraction;
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.onGestureUpdate(i, j, i2, f, f2, f3, f4, i3, f5, f6, f7, f8, i4, f9);
        }
    }

    public void onGestureUpdateWithScaleFinish(int i, long j, int i2, float f, float f2, float f3, float f4, int i3, float f5, float f6, float f7, float f8, int i4, float f9, boolean z) {
        ARPDataInteraction aRPDataInteraction;
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.onGestureUpdateWithScaleFinish(i, j, i2, f, f2, f3, f4, i3, f5, f6, f7, f8, i4, f9, z);
        }
    }

    public void onTouchUpdate(int i, float f, float f2, float f3, float f4, long j, int i2, float f5) {
        ARPDataInteraction aRPDataInteraction;
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.onTouchUpdate(i, f, f2, f3, f4, j, i2, f5);
        }
    }

    public synchronized void pause() {
        this.mIsPaused = true;
        if (isEngineCanAccess()) {
            nativeOnPause();
        }
        ARPRenderer aRPRenderer = this.mARPRenderer;
        if (aRPRenderer != null) {
            aRPRenderer.pause();
        }
    }

    public synchronized void pauseScene() {
        this.mIsPaused = true;
        if (isEngineCanAccess()) {
            nativeOnPause();
        }
        this.mScenePausedByUser = true;
    }

    public void removeAlgoType(int[] iArr) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.removeAlgoType(iArr);
        }
    }

    public synchronized void resume() {
        if (!this.mScenePausedByUser) {
            resumeScene();
        }
        ARPRenderer aRPRenderer = this.mARPRenderer;
        if (aRPRenderer != null) {
            aRPRenderer.resume();
        }
    }

    public synchronized void resumeScene() {
        this.mIsPaused = false;
        if (isEngineCanAccess()) {
            nativeOnResume();
        }
        this.mScenePausedByUser = false;
    }

    public void sceneRotateToCamera() {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.sceneRotateToCamera();
        }
    }

    public void sceneWorldPositionToOrigin() {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.sceneWorldPositionToOrigin();
        }
    }

    public synchronized void setAlgoDataHandle(long j) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setAlgoDataHandle(j);
        }
    }

    public void setAuthPic(Bitmap bitmap, float[] fArr) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.setAuthPic(bitmap, fArr);
        }
    }

    public void setAvatarGestureConfig() {
        HashMap hashMap = new HashMap();
        hashMap.put("gesture_scroll", "interaction_rotate");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("continuous_mapping", hashMap);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("interactioninfo", hashMap2);
    }

    public void setBlendShape(HashMap<String, Double> hashMap) {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.setBlendShape(hashMap);
        }
    }

    public void setCompletedListener(a aVar) {
        this.mListener = aVar;
    }

    public void setConfig(String str, String str2) {
        LogUtil.b(TAG, "syncServerConfig :" + str2);
        nativeSetConfig(str, str2);
    }

    public void setContext(SoftReference<Context> softReference) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.setContext(softReference);
        }
    }

    public void setEngineBlendState(int i) {
        nativeSetEngineBlendState(i);
    }

    public void setFaceLandMarkFrameAcheMode(int i) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setFaceLandMarkFrameAcheMode(i);
        }
    }

    public synchronized void setHtmlUpdateCallback(ARPDataInteraction.a aVar) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setHtmlUpdateCallback(aVar);
        }
    }

    public void setInteraction(ARPDataInteraction.b bVar) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setInteraction(bVar);
        }
    }

    public void setIsFrontCamera(boolean z) {
        this.mARPContent.setIsFrontCamera(z);
    }

    public void setLocalDeviceGrade(int i) {
        LogUtil.b(TAG, "setLocalDeviceGrade :" + i);
        nativeSetLocalDeviceGrade(i);
    }

    public void setPreviewSize(int i, int i2) {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setPreviewSize(i, i2);
        }
    }

    public void setSkeletionData(HashMap<String, List<Double>> hashMap) {
        AbstractARPEngine3D abstractARPEngine3D = this.mARPEngine3D;
        if (abstractARPEngine3D != null) {
            abstractARPEngine3D.setSkeletionData(hashMap);
        }
    }

    public synchronized void setVideoUpdateCallback(ARPDataInteraction.c cVar) {
        ARPDataInteraction aRPDataInteraction = this.mARPDataInteraction;
        if (aRPDataInteraction != null) {
            aRPDataInteraction.setVideoUpdateCallback(cVar);
        }
    }

    public void setWatermark(String str, Bitmap bitmap, float[] fArr) {
        ARPFilter aRPFilter = this.mARPFilter;
        if (aRPFilter != null) {
            aRPFilter.setWatermark(str, bitmap, fArr);
        }
    }

    public void setWindowSize(int i, int i2) {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null) {
            aRPContent.setWindowSize(i, i2);
        }
    }

    public synchronized void unloadCase() {
        ARPContent aRPContent = this.mARPContent;
        if (aRPContent != null && aRPContent.checkValid(ARPContent.c.UnloadCase)) {
            ARPRenderer aRPRenderer = this.mARPRenderer;
            if (aRPRenderer != null) {
                aRPRenderer.clearAllAsyncRenderTask();
            }
            this.mARPContent.unloadCase();
        }
    }

    public void updateAlgoDataToNode(int i, int i2, byte[] bArr) {
        ARPDataInteraction aRPDataInteraction;
        LogUtil.a(TAG, "updateAlgoDataToNode");
        if (isEngineCanAccess() && (aRPDataInteraction = this.mARPDataInteraction) != null) {
            aRPDataInteraction.updateAlgoDataToNode(i, i2, bArr);
        }
    }

    public void updateNodeUniform(String str, HashMap<String, Object> hashMap) {
        AbstractARPEngine3D abstractARPEngine3D;
        if (!isEngineCanAccess() || isAppControllerInterrupt() || (abstractARPEngine3D = this.mARPEngine3D) == null) {
            return;
        }
        abstractARPEngine3D.updateNodeUniform(str, hashMap);
    }
}
