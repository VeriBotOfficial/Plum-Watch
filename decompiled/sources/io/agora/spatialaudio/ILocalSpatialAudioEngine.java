package io.agora.spatialaudio;

import io.agora.rtc2.RtcConnection;
import io.agora.spatialaudio.internal.LocalSpatialAudioImpl;

/* loaded from: classes6.dex */
public abstract class ILocalSpatialAudioEngine extends IBaseSpatialAudioEngine {
    private static ILocalSpatialAudioEngine mInstance;

    public static synchronized ILocalSpatialAudioEngine create() {
        ILocalSpatialAudioEngine iLocalSpatialAudioEngine;
        synchronized (ILocalSpatialAudioEngine.class) {
            if (mInstance == null) {
                mInstance = new LocalSpatialAudioImpl();
            }
            iLocalSpatialAudioEngine = mInstance;
        }
        return iLocalSpatialAudioEngine;
    }

    public static synchronized void destroy() {
        synchronized (ILocalSpatialAudioEngine.class) {
            ILocalSpatialAudioEngine iLocalSpatialAudioEngine = mInstance;
            if (iLocalSpatialAudioEngine == null) {
                return;
            }
            iLocalSpatialAudioEngine.release();
            mInstance = null;
        }
    }

    public abstract int clearRemotePositionsEx(RtcConnection connection);

    public abstract int initialize(LocalSpatialAudioConfig config);

    public abstract int removeRemotePosition(int uid);

    public abstract int removeRemotePositionEx(int uid, RtcConnection connection);

    public abstract int setRemoteAudioAttenuation(int uid, double attenuation, boolean forceSet);

    public abstract int updateRemotePosition(int uid, RemoteVoicePositionInfo posInfo);

    public abstract int updateRemotePositionEx(int uid, RemoteVoicePositionInfo posInfo, RtcConnection connection);
}
