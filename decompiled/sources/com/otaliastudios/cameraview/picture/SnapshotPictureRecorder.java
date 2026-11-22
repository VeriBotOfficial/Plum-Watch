package com.otaliastudios.cameraview.picture;

import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.PictureResult;
import com.otaliastudios.cameraview.picture.PictureRecorder;

/* loaded from: classes17.dex */
public abstract class SnapshotPictureRecorder extends PictureRecorder {
    private static final String TAG = "SnapshotPictureRecorder";
    protected static final CameraLogger LOG = CameraLogger.create(TAG);

    public SnapshotPictureRecorder(PictureResult.Stub stub, PictureRecorder.PictureResultListener pictureResultListener) {
        super(stub, pictureResultListener);
    }
}
