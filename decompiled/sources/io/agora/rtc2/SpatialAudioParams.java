package io.agora.rtc2;

/* loaded from: classes6.dex */
public class SpatialAudioParams {
    public Boolean enable_air_absorb;
    public Boolean enable_blur;
    public Boolean enable_doppler;
    public Double speaker_attenuation;
    public Double speaker_azimuth;
    public Double speaker_distance;
    public Double speaker_elevation;
    public Integer speaker_orientation;

    public Boolean getAirAbsorbFlag() {
        return this.enable_air_absorb;
    }

    public Boolean getBlurFlag() {
        return this.enable_blur;
    }

    public Boolean getDopplerFlag() {
        return this.enable_doppler;
    }

    public Double getSpeakerAttenuation() {
        return this.speaker_attenuation;
    }

    public Double getSpeakerAzimuth() {
        return this.speaker_azimuth;
    }

    public Double getSpeakerDistance() {
        return this.speaker_distance;
    }

    public Double getSpeakerElevation() {
        return this.speaker_elevation;
    }

    public Integer getSpeakerOrientation() {
        return this.speaker_orientation;
    }
}
