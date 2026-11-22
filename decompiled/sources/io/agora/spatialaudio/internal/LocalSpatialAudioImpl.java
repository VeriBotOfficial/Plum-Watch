package io.agora.spatialaudio.internal;

import io.agora.rtc2.RtcConnection;
import io.agora.spatialaudio.ILocalSpatialAudioEngine;
import io.agora.spatialaudio.LocalSpatialAudioConfig;
import io.agora.spatialaudio.RemoteVoicePositionInfo;
import io.agora.spatialaudio.SpatialAudioZone;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.Locale;

/* loaded from: classes6.dex */
public class LocalSpatialAudioImpl extends ILocalSpatialAudioEngine {
    private long mNativeHandle = 0;

    private boolean CheckRemoteVoicePositionInfo(RemoteVoicePositionInfo posInfo) {
        if (posInfo == null || posInfo.position == null || posInfo.position.length != 3) {
            return false;
        }
        if (posInfo.forward != null) {
            return true;
        }
        posInfo.forward = new float[]{0.0f, 0.0f, 0.0f};
        return true;
    }

    static String getChannelId(RtcConnection connection) {
        if (connection != null) {
            return connection.channelId;
        }
        return null;
    }

    static int getUserId(RtcConnection connection) {
        if (connection != null) {
            return connection.localUid;
        }
        return 0;
    }

    private native int nativeClearRemotePositions(long nativeLocalSpatialAudioAndroid);

    private native int nativeClearRemotePositionsEx(long nativeLocalSpatialAudioAndroid, String channelId, int localUid);

    private static native int nativeDestroy(long handle);

    private native int nativeMuteRemoteAudioStream(long nativeLocalSpatialAudioAndroid, int uid, boolean mute);

    private native long nativeObjectInit(LocalSpatialAudioConfig config, long rtcEngine);

    private native int nativeRemoveRemotePosition(long nativeLocalSpatialAudioAndroid, int uid);

    private native int nativeRemoveRemotePositionEx(long nativeLocalSpatialAudioAndroid, int uid, String channelId, int localUid);

    private native int nativeSetParameters(long nativeLocalSpatialAudioAndroid, String param);

    private native int nativeSetPlayerAttenuation(long nativeLocalSpatialAudioAndroid, int playerId, double attenuation, boolean forceSet);

    private native int nativeSetRemoteAudioAttenuation(long nativeLocalSpatialAudioAndroid, int uid, double attenuation, boolean forceSet);

    private native int nativeSetZones(long nativeLocalSpatialAudioAndroid, SpatialAudioZone[] zones);

    private native int nativeUpdatePlayerPositionInfo(long nativeLocalSpatialAudioAndroid, int playerId, RemoteVoicePositionInfo posInfo);

    private native int nativeUpdateRemotePosition(long nativeLocalSpatialAudioAndroid, int uid, float[] position, float[] forward);

    private native int nativeUpdateRemotePositionEx(long nativeLocalSpatialAudioAndroid, int uid, float[] position, float[] forward, String channelId, int localUid);

    private native int nativeUpdateSelfPosition(long nativeLocalSpatialAudioAndroid, float[] position, float[] axisForward, float[] axisRight, float[] axisUp);

    private native int nativeUpdateSelfPositionEx(long nativeLocalSpatialAudioAndroid, float[] position, float[] axisForward, float[] axisRight, float[] axisUp, String channelID, int uid);

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int clearRemotePositions() {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeClearRemotePositions(j);
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int clearRemotePositionsEx(RtcConnection connection) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeClearRemotePositionsEx(j, getChannelId(connection), getUserId(connection));
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int initialize(LocalSpatialAudioConfig config) {
        if (config.mRtcEngine == null) {
            return -2;
        }
        long nativeObjectInit = nativeObjectInit(config, config.mRtcEngine.getNativeHandle());
        this.mNativeHandle = nativeObjectInit;
        return nativeObjectInit == 0 ? -7 : 0;
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int muteAllRemoteAudioStreams(boolean mute) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetParameters(j, String.format(Locale.US, "{\"rtc.local_spatial_audio.mute_all_remote_audio_streams\":%s}", mute ? MediaConstraintKeys.TRUE : "false"));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int muteLocalAudioStream(boolean mute) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetParameters(j, String.format(Locale.US, "{\"rtc.local_spatial_audio.mute_local_stream\":%s}", mute ? MediaConstraintKeys.TRUE : "false"));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int muteRemoteAudioStream(int uid, boolean mute) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeMuteRemoteAudioStream(j, uid, mute);
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int release() {
        long j = this.mNativeHandle;
        if (j == 0) {
            return 0;
        }
        nativeDestroy(j);
        this.mNativeHandle = 0L;
        return 0;
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int removeRemotePosition(int uid) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeRemoveRemotePosition(j, uid);
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int removeRemotePositionEx(int uid, RtcConnection connection) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeRemoveRemotePositionEx(j, uid, getChannelId(connection), getUserId(connection));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setAudioRecvRange(float range) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetParameters(j, String.format(Locale.US, "{\"rtc.local_spatial_audio.hear_range\":%f}", Float.valueOf(range)));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setDistanceUnit(float unit) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetParameters(j, String.format(Locale.US, "{\"rtc.local_spatial_audio.distance_unit\":%f}", Float.valueOf(unit)));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setMaxAudioRecvCount(int maxCount) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetParameters(j, String.format(Locale.US, "{\"rtc.local_spatial_audio.max_hear_count\":%d}", Integer.valueOf(maxCount)));
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setPlayerAttenuation(int playerId, double attenuation, boolean forceSet) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetPlayerAttenuation(j, playerId, attenuation, forceSet);
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int setRemoteAudioAttenuation(int uid, double attenuation, boolean forceSet) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        return nativeSetRemoteAudioAttenuation(j, uid, attenuation, forceSet);
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int setZones(SpatialAudioZone[] zones) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        if (zones == null || zones.length <= 0) {
            return nativeSetZones(j, null);
        }
        for (int i = 0; i < zones.length; i++) {
            SpatialAudioZone spatialAudioZone = zones[i];
            if (spatialAudioZone == null || spatialAudioZone.position == null || zones[i].position.length != 3 || zones[i].forward == null || zones[i].forward.length != 3 || zones[i].right == null || zones[i].right.length != 3 || zones[i].up == null || zones[i].up.length != 3) {
                return -2;
            }
        }
        return nativeSetZones(this.mNativeHandle, zones);
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int updatePlayerPositionInfo(int playerId, RemoteVoicePositionInfo positionInfo) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        if (positionInfo == null || positionInfo.position == null || positionInfo.position.length != 3) {
            return -2;
        }
        if (positionInfo.forward == null || positionInfo.forward.length == 3) {
            return nativeUpdatePlayerPositionInfo(this.mNativeHandle, playerId, positionInfo);
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int updateRemotePosition(int uid, RemoteVoicePositionInfo posInfo) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        if (CheckRemoteVoicePositionInfo(posInfo)) {
            return nativeUpdateRemotePosition(this.mNativeHandle, uid, posInfo.position, posInfo.forward);
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.ILocalSpatialAudioEngine
    public int updateRemotePositionEx(int uid, RemoteVoicePositionInfo posInfo, RtcConnection connection) {
        if (0 == this.mNativeHandle) {
            return -7;
        }
        if (CheckRemoteVoicePositionInfo(posInfo)) {
            return nativeUpdateRemotePositionEx(this.mNativeHandle, uid, posInfo.position, posInfo.forward, getChannelId(connection), getUserId(connection));
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int updateSelfPosition(float[] position, float[] axisForward, float[] axisRight, float[] axisUp) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        if (position.length == 3 && axisForward.length == 3 && axisRight.length == 3 && axisUp.length == 3) {
            return nativeUpdateSelfPosition(j, position, axisForward, axisRight, axisUp);
        }
        return -2;
    }

    @Override // io.agora.spatialaudio.IBaseSpatialAudioEngine
    public int updateSelfPositionEx(float[] position, float[] axisForward, float[] axisRight, float[] axisUp, RtcConnection connection) {
        long j = this.mNativeHandle;
        if (0 == j) {
            return -7;
        }
        if (position.length == 3 && axisForward.length == 3 && axisRight.length == 3 && axisUp.length == 3) {
            return nativeUpdateSelfPositionEx(j, position, axisForward, axisRight, axisUp, getChannelId(connection), getUserId(connection));
        }
        return -2;
    }
}
