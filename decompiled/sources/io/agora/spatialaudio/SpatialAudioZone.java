package io.agora.spatialaudio;

/* loaded from: classes6.dex */
public class SpatialAudioZone {
    public int zoneSetId = -1;
    public float[] position = {0.0f, 0.0f, 0.0f};
    public float[] forward = {0.0f, 0.0f, 0.0f};
    public float[] right = {0.0f, 0.0f, 0.0f};
    public float[] up = {0.0f, 0.0f, 0.0f};
    public float forwardLength = 0.0f;
    public float rightLength = 0.0f;
    public float upLength = 0.0f;
    public float audioAttenuation = 0.0f;

    public float getAudioAttenuation() {
        return this.audioAttenuation;
    }

    public float[] getForward() {
        return this.forward;
    }

    public float getForwardLength() {
        return this.forwardLength;
    }

    public float[] getPosition() {
        return this.position;
    }

    public float[] getRight() {
        return this.right;
    }

    public float getRightLength() {
        return this.rightLength;
    }

    public float[] getUp() {
        return this.up;
    }

    public float getUpLength() {
        return this.upLength;
    }

    public int getZoneSetId() {
        return this.zoneSetId;
    }
}
