package io.agora.meta.internal;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.meta.EnterSceneConfig;
import io.agora.meta.ILocalUserAvatar;
import io.agora.meta.IMetaScene;
import io.agora.meta.IMetaSceneEventHandler;
import io.agora.meta.SceneDisplayConfig;
import io.agora.rtc2.video.AgoraVideoFrame;
import io.agora.utils2.internal.Logging;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes6.dex */
public class MetaSceneImpl extends IMetaScene {
    private static final String TAG = "MetaSceneImpl";
    private final AtomicBoolean mIsDestroying = new AtomicBoolean(false);
    private final ILocalUserAvatar mLocalUserAvatar;
    private long mNativeHandle;

    MetaSceneImpl(long nativeHandle) {
        this.mNativeHandle = 0L;
        this.mNativeHandle = nativeHandle;
        this.mLocalUserAvatar = new LocalUserAvatarImpl(nativeGetLocalUserAvatar(this.mNativeHandle));
    }

    private native int nativeAddEventHandler(long nativeMetaSceneAndroid, Object handler);

    private native int nativeAddSceneView(long nativeMetaSceneAndroid, TextureView view, SceneDisplayConfig config);

    private static native int nativeDestroy(long handle);

    private native int nativeEnableFaceCapture(long nativeMetaSceneAndroid, boolean enable);

    private native int nativeEnableSceneVideoCapture(long nativeMetaSceneAndroid, TextureView view, boolean enable);

    private native int nativeEnableVideoDisplay(long nativeMetaSceneAndroid, String displayId, boolean enable);

    private native int nativeEnterScene(long nativeMetaSceneAndroid, EnterSceneConfig config);

    private native long nativeGetLocalUserAvatar(long nativeMetaSceneAndroid);

    private native int nativeLeaveScene(long nativeMetaSceneAndroid);

    private native int nativePushAgoraVideoFrameToDisplay(long nativeMetaSceneAndroid, String displayId, int format, byte[] buf, int stride, int height, long timestamp);

    private native int nativePushVideoFrameToDisplay(long nativeMetaSceneAndroid, String displayId, VideoFrame frame);

    private native int nativeRemoveEventHandler(long nativeMetaSceneAndroid, Object handler);

    private native int nativeRemoveSceneView(long nativeMetaSceneAndroid, TextureView view);

    private native int nativeSendSceneMessage(long nativeMetaSceneAndroid, byte[] message);

    private native int nativeSetSceneParameters(long nativeMetaSceneAndroid, String jsonParam);

    @Override // io.agora.meta.IMetaScene
    public int addEventHandler(IMetaSceneEventHandler eventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(addEventHandler)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (addEventHandler)");
                return -7;
            }
            return nativeAddEventHandler(j, eventHandler);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int addSceneView(TextureView view, SceneDisplayConfig config) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(addSceneView)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (addSceneView)");
                return -7;
            }
            return nativeAddSceneView(j, view, config);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableFaceCapture(boolean enable) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enableFaceCapture)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enableFaceCapture)");
                return -7;
            }
            return nativeEnableFaceCapture(j, enable);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableSceneVideoCapture(TextureView view, boolean enable) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enableSceneVideoCapture)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enableSceneVideoCapture)");
                return -7;
            }
            return nativeEnableSceneVideoCapture(j, view, enable);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enableVideoDisplay(String displayId, boolean enable) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enableVideoDisplay)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enableVideoDisplay)");
                return -7;
            }
            return nativeEnableVideoDisplay(j, displayId, enable);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int enterScene(EnterSceneConfig config) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(enterScene)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (enterScene)");
                return -7;
            }
            return nativeEnterScene(j, config);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public ILocalUserAvatar getLocalUserAvatar() {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(getLocalUserAvatar)");
            return null;
        }
        synchronized (this) {
            if (this.mNativeHandle == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (getLocalUserAvatar)");
                return null;
            }
            return this.mLocalUserAvatar;
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int leaveScene() {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(leaveScene)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (leaveScene)");
                return -7;
            }
            return nativeLeaveScene(j);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int pushVideoFrameToDisplay(String displayId, VideoFrame frame) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(pushVideoFrameToDisplay(VideoFrame))");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (pushVideoFrameToDisplay)");
                return -7;
            }
            return nativePushVideoFrameToDisplay(j, displayId, frame);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int pushVideoFrameToDisplay(String displayId, AgoraVideoFrame frame) {
        Throwable th;
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(pushVideoFrameToDisplay(AgoraVideoFrame))");
            return -8;
        }
        synchronized (this) {
            try {
                try {
                    long j = this.mNativeHandle;
                    if (j != 0) {
                        return nativePushAgoraVideoFrameToDisplay(j, displayId, frame.format, frame.buf, frame.stride, frame.height, frame.timeStamp);
                    }
                    try {
                        Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (pushVideoFrameToDisplay)");
                        return -7;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int release() {
        if (this.mNativeHandle != 0) {
            this.mIsDestroying.set(true);
            nativeDestroy(this.mNativeHandle);
            this.mNativeHandle = 0L;
            this.mIsDestroying.set(false);
        }
        return 0;
    }

    @Override // io.agora.meta.IMetaScene
    public int removeEventHandler(IMetaSceneEventHandler eventHandler) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(removeEventHandler)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (removeEventHandler)");
                return -7;
            }
            return nativeRemoveEventHandler(j, eventHandler);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int removeSceneView(TextureView view) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(removeSceneView)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (removeSceneView)");
                return -7;
            }
            return nativeRemoveSceneView(j, view);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int sendSceneMessage(byte[] message) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(sendSceneMessage)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (sendSceneMessage)");
                return -7;
            }
            return nativeSendSceneMessage(j, message);
        }
    }

    @Override // io.agora.meta.IMetaScene
    public int setSceneParameters(String jsonParam) {
        if (this.mIsDestroying.get()) {
            Logging.e(TAG, "MetaScene is destroying(setSceneParameters)");
            return -8;
        }
        synchronized (this) {
            long j = this.mNativeHandle;
            if (j == 0) {
                Logging.e(TAG, "MetaScene does not initialize or it may be destroyed (setSceneParameters)");
                return -7;
            }
            return nativeSetSceneParameters(j, jsonParam);
        }
    }
}
