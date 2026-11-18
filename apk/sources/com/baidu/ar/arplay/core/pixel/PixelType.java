package com.baidu.ar.arplay.core.pixel;

/* JADX INFO: loaded from: classes16.dex */
public enum PixelType {
    RGBA(0),
    BGRA(1),
    BGR(2),
    NV12(3),
    NV21(4),
    I420(5),
    YV12(6),
    GRAY(7),
    RGB(8),
    RED(9),
    GREEN(10),
    BLUE(11),
    ALPHA(12);

    private final int value;

    PixelType(int r3) {
        this.value = r3;
    }

    public static PixelType valueOf(int r3) {
        PixelType pixelType = RGBA;
        if (r3 == pixelType.getValue()) {
            return pixelType;
        }
        PixelType pixelType2 = BGRA;
        if (r3 == pixelType2.getValue()) {
            return pixelType2;
        }
        PixelType pixelType3 = BGR;
        if (r3 == pixelType3.getValue()) {
            return pixelType3;
        }
        PixelType pixelType4 = NV12;
        if (r3 == pixelType4.getValue()) {
            return pixelType4;
        }
        PixelType pixelType5 = NV21;
        if (r3 == pixelType5.getValue()) {
            return pixelType5;
        }
        PixelType pixelType6 = I420;
        if (r3 == pixelType6.getValue()) {
            return pixelType6;
        }
        PixelType pixelType7 = YV12;
        if (r3 == pixelType7.getValue()) {
            return pixelType7;
        }
        PixelType pixelType8 = GRAY;
        if (r3 == pixelType8.getValue()) {
            return pixelType8;
        }
        PixelType pixelType9 = RGB;
        if (r3 == pixelType9.getValue()) {
            return pixelType9;
        }
        PixelType pixelType10 = RED;
        if (r3 == pixelType10.getValue()) {
            return pixelType10;
        }
        PixelType pixelType11 = GREEN;
        if (r3 == pixelType11.getValue()) {
            return pixelType11;
        }
        PixelType pixelType12 = BLUE;
        if (r3 == pixelType12.getValue()) {
            return pixelType12;
        }
        PixelType pixelType13 = ALPHA;
        return r3 == pixelType13.getValue() ? pixelType13 : pixelType;
    }

    public int getValue() {
        return this.value;
    }
}
