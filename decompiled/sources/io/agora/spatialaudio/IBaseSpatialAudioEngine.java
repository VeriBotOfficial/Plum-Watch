package io.agora.spatialaudio;

import io.agora.rtc2.RtcConnection;

/* loaded from: classes6.dex */
public abstract class IBaseSpatialAudioEngine {
    public abstract int clearRemotePositions();

    public abstract int muteAllRemoteAudioStreams(boolean mute);

    public abstract int muteLocalAudioStream(boolean mute);

    public abstract int muteRemoteAudioStream(int uid, boolean mute);

    protected abstract int release();

    public abstract int setAudioRecvRange(float range);

    public abstract int setDistanceUnit(float unit);

    public abstract int setMaxAudioRecvCount(int maxCount);

    public abstract int setPlayerAttenuation(int playerId, double attenuation, boolean forceSet);

    public abstract int setZones(SpatialAudioZone[] zones);

    public abstract int updatePlayerPositionInfo(int playerId, RemoteVoicePositionInfo positionInfo);

    public abstract int updateSelfPosition(float[] position, float[] axisForward, float[] axisRight, float[] axisUp);

    public abstract int updateSelfPositionEx(float[] position, float[] axisForward, float[] axisRight, float[] axisUp, RtcConnection connection);
}
