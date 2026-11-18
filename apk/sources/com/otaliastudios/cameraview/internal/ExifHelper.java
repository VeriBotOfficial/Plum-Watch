package com.otaliastudios.cameraview.internal;

/* JADX INFO: loaded from: classes2.dex */
public class ExifHelper {
    public static int getOrientation(int r1) {
        switch (r1) {
            case 1:
            case 2:
            default:
                return 0;
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
        }
    }

    public static int getExifOrientation(int r3) {
        int r0 = (r3 + 360) % 360;
        if (r0 == 0) {
            return 1;
        }
        if (r0 == 90) {
            return 6;
        }
        if (r0 == 180) {
            return 3;
        }
        if (r0 == 270) {
            return 8;
        }
        throw new IllegalArgumentException("Invalid orientation: " + r3);
    }
}
