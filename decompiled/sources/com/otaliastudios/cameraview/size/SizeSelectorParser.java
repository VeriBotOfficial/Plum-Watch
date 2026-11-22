package com.otaliastudios.cameraview.size;

import android.content.res.TypedArray;
import com.otaliastudios.cameraview.R;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class SizeSelectorParser {
    private SizeSelector pictureSizeSelector;
    private SizeSelector videoSizeSelector;

    public SizeSelectorParser(TypedArray typedArray) {
        SizeSelector biggest;
        SizeSelector biggest2;
        ArrayList arrayList = new ArrayList(3);
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeMinWidth)) {
            arrayList.add(SizeSelectors.minWidth(typedArray.getInteger(R.styleable.CameraView_cameraPictureSizeMinWidth, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeMaxWidth)) {
            arrayList.add(SizeSelectors.maxWidth(typedArray.getInteger(R.styleable.CameraView_cameraPictureSizeMaxWidth, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeMinHeight)) {
            arrayList.add(SizeSelectors.minHeight(typedArray.getInteger(R.styleable.CameraView_cameraPictureSizeMinHeight, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeMaxHeight)) {
            arrayList.add(SizeSelectors.maxHeight(typedArray.getInteger(R.styleable.CameraView_cameraPictureSizeMaxHeight, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeMinArea)) {
            arrayList.add(SizeSelectors.minArea(typedArray.getInteger(R.styleable.CameraView_cameraPictureSizeMinArea, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeMaxArea)) {
            arrayList.add(SizeSelectors.maxArea(typedArray.getInteger(R.styleable.CameraView_cameraPictureSizeMaxArea, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraPictureSizeAspectRatio)) {
            arrayList.add(SizeSelectors.aspectRatio(AspectRatio.parse(typedArray.getString(R.styleable.CameraView_cameraPictureSizeAspectRatio)), 0.0f));
        }
        if (typedArray.getBoolean(R.styleable.CameraView_cameraPictureSizeSmallest, false)) {
            arrayList.add(SizeSelectors.smallest());
        }
        if (typedArray.getBoolean(R.styleable.CameraView_cameraPictureSizeBiggest, false)) {
            arrayList.add(SizeSelectors.biggest());
        }
        if (!arrayList.isEmpty()) {
            biggest = SizeSelectors.and((SizeSelector[]) arrayList.toArray(new SizeSelector[0]));
        } else {
            biggest = SizeSelectors.biggest();
        }
        this.pictureSizeSelector = biggest;
        ArrayList arrayList2 = new ArrayList(3);
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeMinWidth)) {
            arrayList2.add(SizeSelectors.minWidth(typedArray.getInteger(R.styleable.CameraView_cameraVideoSizeMinWidth, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeMaxWidth)) {
            arrayList2.add(SizeSelectors.maxWidth(typedArray.getInteger(R.styleable.CameraView_cameraVideoSizeMaxWidth, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeMinHeight)) {
            arrayList2.add(SizeSelectors.minHeight(typedArray.getInteger(R.styleable.CameraView_cameraVideoSizeMinHeight, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeMaxHeight)) {
            arrayList2.add(SizeSelectors.maxHeight(typedArray.getInteger(R.styleable.CameraView_cameraVideoSizeMaxHeight, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeMinArea)) {
            arrayList2.add(SizeSelectors.minArea(typedArray.getInteger(R.styleable.CameraView_cameraVideoSizeMinArea, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeMaxArea)) {
            arrayList2.add(SizeSelectors.maxArea(typedArray.getInteger(R.styleable.CameraView_cameraVideoSizeMaxArea, 0)));
        }
        if (typedArray.hasValue(R.styleable.CameraView_cameraVideoSizeAspectRatio)) {
            arrayList2.add(SizeSelectors.aspectRatio(AspectRatio.parse(typedArray.getString(R.styleable.CameraView_cameraVideoSizeAspectRatio)), 0.0f));
        }
        if (typedArray.getBoolean(R.styleable.CameraView_cameraVideoSizeSmallest, false)) {
            arrayList2.add(SizeSelectors.smallest());
        }
        if (typedArray.getBoolean(R.styleable.CameraView_cameraVideoSizeBiggest, false)) {
            arrayList2.add(SizeSelectors.biggest());
        }
        if (!arrayList2.isEmpty()) {
            biggest2 = SizeSelectors.and((SizeSelector[]) arrayList2.toArray(new SizeSelector[0]));
        } else {
            biggest2 = SizeSelectors.biggest();
        }
        this.videoSizeSelector = biggest2;
    }

    public SizeSelector getPictureSizeSelector() {
        return this.pictureSizeSelector;
    }

    public SizeSelector getVideoSizeSelector() {
        return this.videoSizeSelector;
    }
}
