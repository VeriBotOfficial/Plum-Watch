package io.agora.rtc2;

import android.opengl.EGLContext;

/* loaded from: classes6.dex */
public abstract class RtcEngineInternal extends RtcEngineEx {
    public abstract int enableTransportQualityIndication(boolean enabled);

    public abstract String makeQualityReportUrl(String channel, String listenerUid, String speakerUid, int format);

    public abstract int monitorAudioRouteChange(boolean isMonitoring);

    public abstract int setApiCallMode(int syncCallTimeout);

    public abstract int setProfile(String profile, boolean merge);

    public abstract int setTextureId(int id2, EGLContext eglContext, int width, int height, long ts);

    public abstract int setTextureId(int id2, javax.microedition.khronos.egl.EGLContext eglContext, int width, int height, long ts);

    public abstract int updateSharedContext(EGLContext sharedContext);

    public abstract int updateSharedContext(javax.microedition.khronos.egl.EGLContext sharedContext);
}
