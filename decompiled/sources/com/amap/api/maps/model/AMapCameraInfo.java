package com.amap.api.maps.model;

/* loaded from: classes11.dex */
public class AMapCameraInfo {
    private float aspectRatio;
    private float fov;
    private float positionX;
    private float positionY;
    private float positionZ;
    private float rotate;

    public AMapCameraInfo(float f, float f2, float f3, float f4, float f5, float f6) {
        this.fov = f;
        this.aspectRatio = f2;
        this.rotate = f3;
        this.positionX = f4;
        this.positionY = f5;
        this.positionZ = f6;
    }

    public float getAspectRatio() {
        return this.aspectRatio;
    }

    public float getFov() {
        return this.fov;
    }

    public float getRotate() {
        return this.rotate;
    }

    public float getX() {
        return this.positionX;
    }

    public float getY() {
        return this.positionY;
    }

    public float getZ() {
        return this.positionZ;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[fov:");
        sb.append(this.fov).append(" aspectRatio:");
        sb.append(this.aspectRatio).append(" rotate:");
        sb.append(this.rotate).append(" pos_x:");
        sb.append(this.positionX).append(" pos_y:");
        sb.append(this.positionY).append(" pos_z:");
        sb.append(this.positionZ).append("]");
        return sb.toString();
    }
}
