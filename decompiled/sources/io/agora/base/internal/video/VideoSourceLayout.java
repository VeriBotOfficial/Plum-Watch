package io.agora.base.internal.video;

/* loaded from: classes6.dex */
public class VideoSourceLayout {
    private int cropped_height;
    private int cropped_width;
    private int cropped_x;
    private int cropped_y;
    private int dest_height;
    private int dest_width;
    private boolean mirror_x;
    private boolean mirror_y;
    private int position_x;
    private int position_y;
    private int rotation;
    private String source_id;
    private VideoSourceType videoSourceType;
    private int z_order;

    enum VideoSourceType {
        UNKNOWN,
        STREAM,
        PIC,
        GIF,
        CANVAS
    }

    public VideoSourceLayout(String source_id, int position_x, int position_y, int cropped_x, int cropped_y, int cropped_width, int cropped_height, int dest_width, int dest_height, int z_order, boolean mirror_x, boolean mirror_y, int rotation, int videoSourceType) {
        this.videoSourceType = VideoSourceType.UNKNOWN;
        this.source_id = source_id;
        this.position_x = position_x;
        this.position_y = position_y;
        this.cropped_x = cropped_x;
        this.cropped_y = cropped_y;
        this.cropped_width = cropped_width;
        this.cropped_height = cropped_height;
        this.dest_width = dest_width;
        this.dest_height = dest_height;
        this.mirror_x = mirror_x;
        this.mirror_y = mirror_y;
        this.rotation = rotation;
        this.z_order = z_order;
        this.videoSourceType = VideoSourceType.values()[videoSourceType];
    }

    public int getCroppedHeight() {
        return this.cropped_height;
    }

    public int getCroppedWidth() {
        return this.cropped_width;
    }

    public int getCroppedX() {
        return this.cropped_x;
    }

    public int getCroppedY() {
        return this.cropped_y;
    }

    public int getDestHeight() {
        return this.dest_height;
    }

    public int getDestWidth() {
        return this.dest_width;
    }

    public int getPositionX() {
        return this.position_x;
    }

    public int getPositionY() {
        return this.position_y;
    }

    public int getRotation() {
        return this.rotation;
    }

    public String getSourceId() {
        return this.source_id;
    }

    public VideoSourceType getVideoSourceType() {
        return this.videoSourceType;
    }

    public int getZorder() {
        return this.z_order;
    }

    public boolean isMirrorX() {
        return this.mirror_x;
    }

    public boolean isMirrorY() {
        return this.mirror_y;
    }
}
