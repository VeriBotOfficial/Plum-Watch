package com.otaliastudios.cameraview.internal;

import android.graphics.Rect;
import com.otaliastudios.cameraview.size.AspectRatio;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
public class CropHelper {
    public static Rect computeCrop(Size size, AspectRatio aspectRatio) {
        int round;
        int width = size.getWidth();
        int height = size.getHeight();
        int i = 0;
        if (aspectRatio.matches(size, 5.0E-4f)) {
            return new Rect(0, 0, width, height);
        }
        if (AspectRatio.of(width, height).toFloat() > aspectRatio.toFloat()) {
            int round2 = Math.round(height * aspectRatio.toFloat());
            i = Math.round((width - round2) / 2.0f);
            round = 0;
            width = round2;
        } else {
            int round3 = Math.round(width / aspectRatio.toFloat());
            round = Math.round((height - round3) / 2.0f);
            height = round3;
        }
        return new Rect(i, round, width + i, height + round);
    }
}
