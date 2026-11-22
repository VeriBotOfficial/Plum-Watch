package com.otaliastudios.cameraview.internal;

/* loaded from: classes17.dex */
public class ExifHelper {
    public static int getOrientation(int i) {
        switch (i) {
        }
        return 0;
    }

    public static int getExifOrientation(int i) {
        int i2 = (i + 360) % 360;
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 90) {
            return 6;
        }
        if (i2 == 180) {
            return 3;
        }
        if (i2 == 270) {
            return 8;
        }
        throw new IllegalArgumentException("Invalid orientation: " + i);
    }
}
