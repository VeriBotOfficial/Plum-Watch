package com.baidu.ar;

/* JADX INFO: loaded from: classes16.dex */
public enum ARType {
    TRACK_2D(0),
    LBS(1),
    GAME(2),
    UDT(3),
    NPC(4),
    VO(5),
    ON_DEVICE_IR(6),
    CLOUD_IR(7),
    IMU(8),
    FACE(10),
    VPAS(11),
    MARKER(12),
    TRACK_3D(13),
    DIGITAL(14),
    OBR(15);

    private int mTypeValue;

    ARType(int r3) {
        this.mTypeValue = r3;
    }

    public static ARType valueOf(int r5) {
        for (ARType aRType : values()) {
            if (aRType.getTypeValue() == r5) {
                return aRType;
            }
        }
        return null;
    }

    public int getTypeValue() {
        return this.mTypeValue;
    }
}
