package com.otaliastudios.cameraview.filter;

import android.content.res.TypedArray;
import com.otaliastudios.cameraview.R;

/* loaded from: classes17.dex */
public class FilterParser {
    private Filter filter;

    public FilterParser(TypedArray typedArray) {
        this.filter = null;
        try {
            this.filter = (Filter) Class.forName(typedArray.getString(R.styleable.CameraView_cameraFilter)).newInstance();
        } catch (Exception unused) {
            this.filter = new NoFilter();
        }
    }

    public Filter getFilter() {
        return this.filter;
    }
}
