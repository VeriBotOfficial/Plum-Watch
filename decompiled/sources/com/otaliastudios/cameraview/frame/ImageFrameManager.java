package com.otaliastudios.cameraview.frame;

import android.media.Image;

/* loaded from: classes17.dex */
public class ImageFrameManager extends FrameManager<Image> {
    public ImageFrameManager(int i) {
        super(i, Image.class);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.otaliastudios.cameraview.frame.FrameManager
    public void onFrameDataReleased(Image image, boolean z) {
        try {
            image.close();
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.otaliastudios.cameraview.frame.FrameManager
    public Image onCloneFrameData(Image image) {
        throw new RuntimeException("Cannot freeze() an Image Frame. Please consider using the frame synchronously in your process() method, which also gives better performance.");
    }
}
