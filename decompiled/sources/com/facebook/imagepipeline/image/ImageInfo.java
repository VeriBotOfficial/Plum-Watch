package com.facebook.imagepipeline.image;

/* loaded from: classes14.dex */
public interface ImageInfo extends HasImageMetadata {
    int getHeight();

    QualityInfo getQualityInfo();

    default int getSizeInBytes() {
        return 0;
    }

    int getWidth();
}
