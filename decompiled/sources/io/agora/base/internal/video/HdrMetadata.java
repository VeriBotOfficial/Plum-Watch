package io.agora.base.internal.video;

/* loaded from: classes6.dex */
public class HdrMetadata {
    private int luma_bit_depth;
    private int max_content_light_level = 0;
    private int max_frame_average_light_level = 0;
    private int profile;

    HdrMetadata(int i, int i2) {
        this.profile = i;
        this.luma_bit_depth = i2;
    }

    public int getMax_content_light_level() {
        return this.max_content_light_level;
    }

    public void setMax_content_light_level(int i) {
        this.max_content_light_level = i;
    }

    public int getMax_frame_average_light_level() {
        return this.max_frame_average_light_level;
    }

    public void setMax_frame_average_light_level(int i) {
        this.max_frame_average_light_level = i;
    }

    public int getProfile() {
        return this.profile;
    }

    public void setProfile(int i) {
        this.profile = i;
    }

    public int getLuma_bit_depth() {
        return this.luma_bit_depth;
    }

    public void setLuma_bit_depth(int i) {
        this.luma_bit_depth = i;
    }
}
