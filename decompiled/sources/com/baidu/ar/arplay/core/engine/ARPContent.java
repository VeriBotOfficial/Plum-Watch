package com.baidu.ar.arplay.core.engine;

import com.baidu.ar.a9;
import com.baidu.ar.arplay.util.LogUtil;
import com.baidu.ar.t4;
import com.baidu.ar.x0;
import com.baidu.ar.zd;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class ARPContent {
    private d mCaseState = d.EUninit;
    private volatile boolean mIsEngineCreated = false;
    private volatile boolean mIsTempleteCreating = false;
    private volatile boolean mIsTempleteCreated = false;
    private volatile boolean mIsTempleteDestoring = true;
    private volatile boolean mIsTempleteDestoryed = false;
    private long mStartTime = 0;
    private boolean mIsFrontCamera = true;
    private int mPreviewWidth = 0;
    private int mPreviewHeight = 0;
    private int mWindowWidth = 720;
    private int mWindowHeight = 1280;
    private List<b> mCaseLoadListenerList = new ArrayList();

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6772a;

        static {
            int[] iArr = new int[c.values().length];
            f6772a = iArr;
            try {
                iArr[c.LoadCase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6772a[c.UnloadCase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6772a[c.OnCaseLoaded.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6772a[c.OnCaseUnloaded.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void onCaseLoaded(boolean z);
    }

    public enum c {
        LoadCase,
        UnloadCase,
        OnCaseLoaded,
        OnCaseUnloaded
    }

    public enum d {
        EUninit,
        ECreating,
        ECreated,
        EDestroying
    }

    private void releaseComponents() {
        x0.g().h();
        zd.a().b();
        t4.a().d();
        ARPScriptEnvironment.getInstance().release();
    }

    public boolean checkValid(c cVar) {
        d dVar;
        int i = a.f6772a[cVar.ordinal()];
        if (i == 2) {
            return (!this.mIsEngineCreated || (dVar = this.mCaseState) == d.EDestroying || dVar == d.EUninit) ? false : true;
        }
        if (i != 3) {
            return true;
        }
        return this.mIsEngineCreated && this.mCaseState == d.ECreating;
    }

    public void clearAllCaseLoadListener() {
        this.mCaseLoadListenerList.clear();
    }

    public void destroy() {
        this.mCaseState = d.EUninit;
        notifyCaseLoadListener();
        clearAllCaseLoadListener();
        this.mIsEngineCreated = false;
        this.mIsTempleteCreating = false;
        this.mIsTempleteCreated = false;
        this.mIsTempleteDestoring = false;
        this.mIsTempleteDestoryed = false;
        releaseComponents();
    }

    public float[] getPreviewSize() {
        return new float[]{this.mPreviewWidth, this.mPreviewHeight};
    }

    public float[] getWindowSize() {
        return new float[]{this.mWindowWidth, this.mWindowHeight};
    }

    public boolean isCaseCreated() {
        return this.mCaseState == d.ECreated;
    }

    public boolean isEngineCanAccess() {
        return this.mIsEngineCreated && this.mCaseState == d.ECreated;
    }

    public int loadCaseWithResPath(String str, int i, int i2) {
        int i3;
        if (!this.mIsEngineCreated) {
            return -1;
        }
        d dVar = this.mCaseState;
        d dVar2 = d.ECreating;
        if (dVar == dVar2) {
            return -1;
        }
        this.mCaseState = dVar2;
        notifyCaseLoadListener();
        ARPScriptEnvironment.getInstance().setDataPipKV(ARPScriptEnvironment.KEY_DATA_CAMERA_POSITION, Integer.valueOf(this.mIsFrontCamera ? 1 : 0));
        this.mStartTime = System.currentTimeMillis();
        int i4 = this.mPreviewWidth;
        if (i4 > 0) {
            i = i4;
        }
        this.mPreviewWidth = i;
        int i5 = this.mPreviewHeight;
        if (i5 > 0) {
            i2 = i5;
        }
        this.mPreviewHeight = i2;
        int i6 = this.mWindowWidth;
        if (i6 > 0 && (i3 = this.mWindowHeight) > 0) {
            nativeSetWindowSize(i6, i3);
        }
        nativeLoadCase(str, this.mPreviewWidth, this.mPreviewHeight);
        return 0;
    }

    public native void nativeLoadCase(String str, int i, int i2);

    public native void nativeSetPreviewSize(int i, int i2);

    public native void nativeSetWindowSize(int i, int i2);

    public native void nativeUnloadCase();

    public void notifyCaseLoadListener() {
        for (int i = 0; i < this.mCaseLoadListenerList.size(); i++) {
            this.mCaseLoadListenerList.get(i).onCaseLoaded(isCaseCreated());
        }
    }

    public void onCaseLoadCompleted(Map map) {
        if (this.mIsEngineCreated && this.mCaseState == d.ECreating && map != null) {
            int a2 = a9.a(map.get("case_id"), 0);
            LogUtil.b("ARPEngine", "caseId : " + a2);
            LogUtil.b("ARPEngine", "caseId : " + a2 + " cost: " + (System.currentTimeMillis() - this.mStartTime));
            this.mCaseState = d.ECreated;
            notifyCaseLoadListener();
        }
    }

    public void onCaseUnloadCompleted() {
        if (this.mIsEngineCreated && this.mCaseState == d.EDestroying) {
            this.mCaseState = d.EUninit;
        }
    }

    public void registerCaseLoadListener(b bVar) {
        this.mCaseLoadListenerList.add(bVar);
    }

    public void setEngineCreated(boolean z) {
        this.mIsEngineCreated = z;
    }

    public void setIsFrontCamera(boolean z) {
        this.mIsFrontCamera = z;
    }

    public void setPreviewSize(int i, int i2) {
        this.mPreviewWidth = i;
        this.mPreviewHeight = i2;
        if (isEngineCanAccess()) {
            nativeSetPreviewSize(i, i2);
        }
    }

    public void setWindowSize(int i, int i2) {
        this.mWindowWidth = i;
        this.mWindowHeight = i2;
        if (isEngineCanAccess()) {
            nativeSetWindowSize(i, i2);
        }
    }

    public void unloadCase() {
        d dVar;
        d dVar2;
        if (!this.mIsEngineCreated || (dVar = this.mCaseState) == (dVar2 = d.EDestroying) || dVar == d.EUninit) {
            return;
        }
        LogUtil.b("ARPEngine", "unloadCase");
        this.mCaseState = dVar2;
        notifyCaseLoadListener();
        this.mPreviewWidth = 0;
        this.mPreviewHeight = 0;
        nativeUnloadCase();
        releaseComponents();
        LogUtil.b("ARPEngine", "unloadCase finished");
    }

    public void unregisterCaseLoadListener(b bVar) {
        this.mCaseLoadListenerList.remove(bVar);
    }
}
