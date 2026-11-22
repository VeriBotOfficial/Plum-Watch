package org.opencv.android;

import android.app.Activity;
import com.hjq.permissions.Permission;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes7.dex */
public class CameraActivity extends Activity {
    private static final int CAMERA_PERMISSION_REQUEST_CODE = 200;

    protected List<? extends CameraBridgeViewBase> getCameraViewList() {
        return new ArrayList();
    }

    protected void onCameraPermissionGranted() {
        List<? extends CameraBridgeViewBase> cameraViewList = getCameraViewList();
        if (cameraViewList == null) {
            return;
        }
        for (CameraBridgeViewBase cameraBridgeViewBase : cameraViewList) {
            if (cameraBridgeViewBase != null) {
                cameraBridgeViewBase.setCameraPermissionGranted();
            }
        }
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (checkSelfPermission(Permission.CAMERA) != 0) {
            requestPermissions(new String[]{Permission.CAMERA}, 200);
        } else {
            onCameraPermissionGranted();
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 200 && iArr.length > 0 && iArr[0] == 0) {
            onCameraPermissionGranted();
        }
        super.onRequestPermissionsResult(i, strArr, iArr);
    }
}
