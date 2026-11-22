package io.agora.base.internal.voiceengine;

import android.content.Context;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* loaded from: classes6.dex */
public class HuaweiHardwareEarMonitor implements IHardwareEarMonitor {
    private static final String TAG = "HuaweiHardwareEarMonitor";
    private Context mContext;
    private Class<?> mHwAudioKaraokeFeatureKitClass;
    private Class<?> mHwAudioKitClass;
    private HardwareEarMonitorListener mListener;
    private Class<?> mParamNameClass;
    private AudioKitCallbackImpl mAudioKitCallbackImpl = new AudioKitCallbackImpl();
    private Object mHwAudioKit = null;
    private Object mHwAudioKaraokeFeatureKit = null;
    private volatile boolean mInitialized = false;
    private volatile boolean mIsDestroyed = false;
    private volatile boolean mEarMonitorEnabled = false;

    public HuaweiHardwareEarMonitor(HardwareEarMonitorListener hardwareEarMonitorListener) {
        Logging.d(TAG, ">>ctor");
        this.mListener = hardwareEarMonitorListener;
        this.mContext = ContextUtils.getApplicationContext();
    }

    void setHwAudioKaraokeFeatureKit(Object obj) {
        this.mHwAudioKaraokeFeatureKit = obj;
    }

    InvocationHandler getInvocationHandler() {
        return this.mAudioKitCallbackImpl;
    }

    private class AudioKitCallbackImpl implements InvocationHandler {
        private AudioKitCallbackImpl() {
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            try {
                if ("onResult".equals(method.getName())) {
                    int intValue = ((Integer) objArr[0]).intValue();
                    Logging.d(HuaweiHardwareEarMonitor.TAG, "onResult: " + intValue);
                    if (HuaweiHardwareEarMonitor.this.mIsDestroyed) {
                        Logging.d(HuaweiHardwareEarMonitor.TAG, "ignore result after destroy");
                        if (intValue == 0 || intValue == 1000) {
                            HuaweiHardwareEarMonitor.this.destroyImpl();
                            return obj;
                        }
                    } else {
                        if (intValue == 0) {
                            if (HuaweiHardwareEarMonitor.this.mListener != null) {
                                HuaweiHardwareEarMonitor.this.mListener.onInitResult(0);
                            }
                            Logging.d(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: HwAudioKit init success");
                            return obj;
                        }
                        if (intValue != 2) {
                            if (intValue != 1000) {
                                Logging.e(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: onResult error number " + intValue);
                                return obj;
                            }
                            boolean isHardwareEarMonitorSupported = HuaweiHardwareEarMonitor.this.isHardwareEarMonitorSupported();
                            if (HuaweiHardwareEarMonitor.this.mListener != null) {
                                HuaweiHardwareEarMonitor.this.mListener.onKaraokeSupport(isHardwareEarMonitorSupported);
                            }
                            Logging.d(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: Karaoke feature created");
                            return obj;
                        }
                        Logging.d(HuaweiHardwareEarMonitor.TAG, "IAudioKitCallback: HwAudioKit not installed");
                        if (HuaweiHardwareEarMonitor.this.mListener != null) {
                            HuaweiHardwareEarMonitor.this.mListener.onInitResult(2);
                            return obj;
                        }
                    }
                }
            } catch (Exception e) {
                Logging.e(HuaweiHardwareEarMonitor.TAG, "AudioKitCallbackImpl invoke failed ", e);
            }
            return obj;
        }
    }

    @Override // io.agora.base.internal.voiceengine.IHardwareEarMonitor
    public void initialize() {
        String str = TAG;
        Logging.d(str, "HwAudioKit initialize");
        if (this.mContext == null) {
            Logging.e(str, "mContext is null!");
            return;
        }
        if (this.mInitialized) {
            Logging.w(str, "already initialized, ignore");
            return;
        }
        try {
            this.mHwAudioKaraokeFeatureKitClass = Class.forName("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit");
            this.mHwAudioKitClass = Class.forName("com.huawei.multimedia.audiokit.interfaces.HwAudioKit");
            Class<?> cls = Class.forName("com.huawei.multimedia.audiokit.interfaces.IAudioKitCallback");
            Class<?> cls2 = Class.forName("com.huawei.multimedia.audiokit.interfaces.HwAudioKit$FeatureType");
            this.mParamNameClass = Class.forName("com.huawei.multimedia.audiokit.interfaces.HwAudioKaraokeFeatureKit$ParameName");
            this.mHwAudioKit = this.mHwAudioKitClass.getConstructor(Context.class, cls).newInstance(this.mContext, Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, this.mAudioKitCallbackImpl));
            this.mHwAudioKitClass.getDeclaredMethod(MobileAdsBridgeBase.initializeMethodName, new Class[0]).invoke(this.mHwAudioKit, new Object[0]);
            this.mHwAudioKaraokeFeatureKit = this.mHwAudioKitClass.getDeclaredMethod("createFeature", cls2).invoke(this.mHwAudioKit, cls2.getEnumConstants()[0]);
            this.mInitialized = true;
            Logging.d(str, "HwAudioKit initialize success");
        } catch (Exception unused) {
            Logging.e(TAG, "HwAudioKit initialize failed");
        }
    }

    @Override // io.agora.base.internal.voiceengine.IHardwareEarMonitor
    public boolean isHardwareEarMonitorSupported() {
        String str = TAG;
        Logging.d(str, ">>isHardwareEarMonitorSupported");
        try {
            boolean booleanValue = ((Boolean) this.mHwAudioKaraokeFeatureKitClass.getDeclaredMethod("isKaraokeFeatureSupport", new Class[0]).invoke(this.mHwAudioKaraokeFeatureKit, new Object[0])).booleanValue();
            Logging.d(str, "Karaoke earmonitor is" + (booleanValue ? " " : "not ") + "support ");
            return booleanValue;
        } catch (Exception e) {
            Logging.e(TAG, "isHardwareEarMonitorSupported false ", e);
            return false;
        }
    }

    @Override // io.agora.base.internal.voiceengine.IHardwareEarMonitor
    public int setHardwareEarMonitorVolume(int i) {
        if (!this.mEarMonitorEnabled) {
            return -7;
        }
        String str = TAG;
        Logging.d(str, ">>setHardwareEarMonitorVolume " + i);
        if (i < 0) {
            i = 0;
        } else if (i > 100) {
            i = 100;
        }
        try {
            int intValue = ((Integer) this.mHwAudioKaraokeFeatureKitClass.getDeclaredMethod("setParameter", this.mParamNameClass, Integer.TYPE).invoke(this.mHwAudioKaraokeFeatureKit, this.mParamNameClass.getEnumConstants()[1], Integer.valueOf(i))).intValue();
            Logging.d(str, "setParameter ret " + intValue);
            return intValue != 0 ? -1 : 0;
        } catch (Exception e) {
            Logging.e(TAG, "setHardwareEarMonitorVolume failed ", e);
            return -1;
        }
    }

    @Override // io.agora.base.internal.voiceengine.IHardwareEarMonitor
    public int enableHardwareEarMonitor(boolean z) {
        String str = TAG;
        Logging.d(str, ">>enableHardwareEarMonitor " + z);
        try {
            int intValue = ((Integer) this.mHwAudioKaraokeFeatureKitClass.getDeclaredMethod("enableKaraokeFeature", Boolean.TYPE).invoke(this.mHwAudioKaraokeFeatureKit, Boolean.valueOf(z))).intValue();
            if (intValue != 0) {
                Logging.e(str, "enableKaraokeFeature failed ret " + intValue);
                return -1;
            }
            this.mEarMonitorEnabled = z;
            if (this.mEarMonitorEnabled) {
                Logging.d(str, "latency: " + ((Integer) this.mHwAudioKaraokeFeatureKitClass.getDeclaredMethod("getKaraokeLatency", new Class[0]).invoke(this.mHwAudioKaraokeFeatureKit, new Object[0])).intValue());
            }
            return 0;
        } catch (Exception e) {
            Logging.e(TAG, "enableHardwareEarMonitor failed ", e);
            return -1;
        }
    }

    @Override // io.agora.base.internal.voiceengine.IHardwareEarMonitor
    public void destroy() {
        Logging.d(TAG, "karaoke kit destroy");
        this.mListener = null;
        if (this.mInitialized) {
            this.mInitialized = false;
            this.mIsDestroyed = true;
            destroyImpl();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void destroyImpl() {
        try {
            this.mHwAudioKaraokeFeatureKitClass.getDeclaredMethod("destroy", new Class[0]).invoke(this.mHwAudioKaraokeFeatureKit, new Object[0]);
            this.mHwAudioKitClass.getDeclaredMethod("destroy", new Class[0]).invoke(this.mHwAudioKit, new Object[0]);
            Logging.d(TAG, "karaoke kit destroy call.");
        } catch (Exception e) {
            Logging.e(TAG, "destroy failed ", e);
        }
    }
}
