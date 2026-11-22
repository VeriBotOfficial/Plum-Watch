package com.otaliastudios.cameraview.markers;

import android.content.res.TypedArray;
import com.otaliastudios.cameraview.R;

/* loaded from: classes17.dex */
public class MarkerParser {
    private AutoFocusMarker autoFocusMarker;

    public MarkerParser(TypedArray typedArray) {
        this.autoFocusMarker = null;
        String string = typedArray.getString(R.styleable.CameraView_cameraAutoFocusMarker);
        if (string != null) {
            try {
                this.autoFocusMarker = (AutoFocusMarker) Class.forName(string).newInstance();
            } catch (Exception unused) {
            }
        }
    }

    public AutoFocusMarker getAutoFocusMarker() {
        return this.autoFocusMarker;
    }
}
