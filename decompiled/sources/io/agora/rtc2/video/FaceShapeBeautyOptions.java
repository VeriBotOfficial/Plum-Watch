package io.agora.rtc2.video;

/* loaded from: classes6.dex */
public class FaceShapeBeautyOptions {
    public static final int FACE_SHAPE_BEAUTY_STYLE_FEMALE = 0;
    public static final int FACE_SHAPE_BEAUTY_STYLE_MALE = 1;
    public int shapeStyle;
    public int styleIntensity;

    public FaceShapeBeautyOptions() {
        this.shapeStyle = 0;
        this.styleIntensity = 50;
    }

    public FaceShapeBeautyOptions(int style, int intensity) {
        this.shapeStyle = style;
        this.styleIntensity = intensity;
    }
}
