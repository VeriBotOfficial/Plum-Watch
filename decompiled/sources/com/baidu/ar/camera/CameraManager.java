package com.baidu.ar.camera;

import android.graphics.ImageFormat;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Build;
import android.util.Log;
import android.view.SurfaceHolder;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes12.dex */
public final class CameraManager {
    public static final int DEFAULTHEIGHT = 720;
    public static final int DEFAULTWIDTH = 1280;
    public static final int DESIREDPREVIEWFPS = 30;
    public static final float Ratio11 = 1.0f;
    public static final float Ratio169 = 0.5625f;
    public static final float Ratio43 = 0.75f;
    public static CameraManager e;
    public Camera b;

    /* renamed from: a, reason: collision with root package name */
    public int f6853a = 1;
    public int c = 0;
    public float d = 0.5625f;

    public class b implements Comparator<Camera.Size> {
        public b(CameraManager cameraManager) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Long.signum((size.width * size.height) - (size2.width * size2.height));
        }
    }

    public static CameraManager getInstance() {
        if (e == null) {
            e = new CameraManager();
        }
        return e;
    }

    public final int a(int i) {
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f6853a, cameraInfo);
        int i2 = i != 1 ? i != 2 ? i != 3 ? 0 : 270 : 180 : 90;
        int i3 = cameraInfo.facing;
        int i4 = cameraInfo.orientation;
        return i3 == 1 ? (360 - ((i4 + i2) % 360)) % 360 : ((i4 - i2) + 360) % 360;
    }

    public final Camera.Size a(List<Camera.Size> list, int i, int i2) {
        int i3;
        Object max;
        a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Camera.Size size : list) {
            int i4 = size.height;
            int i5 = (i4 * i) / i2;
            int i6 = size.width;
            if (i5 == i6) {
                if (i6 < i || i4 < i2) {
                    arrayList2.add(size);
                } else {
                    arrayList.add(size);
                }
            }
        }
        if (arrayList.size() > 0) {
            max = Collections.min(arrayList, new b());
        } else {
            if (arrayList2.size() <= 0) {
                boolean z = false;
                Camera.Size size2 = list.get(0);
                for (Camera.Size size3 : list) {
                    int i7 = size3.width;
                    if (i7 != i || (i3 = size3.height) != i2 || i3 / i7 != this.d) {
                        if (i7 == i) {
                            if (Math.abs(size2.height - i2) > Math.abs(size3.height - i2) && size3.height / size3.width == this.d) {
                            }
                            z = true;
                        } else if (size3.height == i2) {
                            if (Math.abs(size2.width - i) > Math.abs(size3.width - i) && size3.height / size3.width == this.d) {
                            }
                            z = true;
                        } else if (!z && Math.abs(size2.width - i) > Math.abs(size3.width - i) && Math.abs(size2.height - i2) > Math.abs(size3.height - i2) && size3.height / size3.width == this.d) {
                            size2 = size3;
                        }
                    }
                    return size3;
                }
                return size2;
            }
            max = Collections.max(arrayList2, new b());
        }
        return (Camera.Size) max;
    }

    public final void a(Camera camera, int i, int i2) {
        Camera.Parameters parameters = camera.getParameters();
        Camera.Size a2 = a(parameters.getSupportedPreviewSizes(), i, i2);
        parameters.setPreviewSize(a2.width, a2.height);
        camera.setParameters(parameters);
        Log.d("setPreviewSize", "width = " + a2.width + ", height = " + a2.height);
    }

    public final void a(List<Camera.Size> list) {
        Collections.sort(list, new b());
    }

    public void addCameraCallbackBuffer(byte[] bArr) {
        Camera camera = this.b;
        if (camera != null) {
            camera.addCallbackBuffer(bArr);
        }
    }

    public final boolean b(int i) {
        for (int i2 = 0; i2 < 3; i2++) {
            try {
                this.b = Camera.open(i);
                return true;
            } catch (Exception unused) {
                Log.e("CameraManager", "camera open error!");
                try {
                    Camera camera = this.b;
                    if (camera != null) {
                        camera.release();
                        this.b = null;
                    }
                    Thread.sleep(150L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return false;
    }

    public boolean chooseFixedPreviewFps(int i) {
        try {
            Camera camera = this.b;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                int[] iArr = new int[2];
                for (int[] iArr2 : parameters.getSupportedPreviewFpsRange()) {
                    Log.d("CameraManager", "entry: " + iArr2[0] + " - " + iArr2[1]);
                    int i2 = iArr2[0];
                    int i3 = iArr2[1];
                    if (i2 == i3 && i2 == i) {
                        parameters.setPreviewFpsRange(i2, i3);
                        return true;
                    }
                    if (i2 >= iArr[0] && i3 >= iArr[1]) {
                        iArr[0] = i2;
                        iArr[1] = i3;
                    }
                }
                Log.d("CameraManager", "setting fps: " + iArr[0] + " - " + iArr[1]);
                parameters.setPreviewFpsRange(iArr[0], iArr[1]);
                this.b.setParameters(parameters);
            }
            return false;
        } catch (Exception e2) {
            Log.e("chooseFixedPreviewFps ", e2.getLocalizedMessage());
            return false;
        }
    }

    public int getCameraID() {
        return this.f6853a;
    }

    public Camera.CameraInfo getCameraInfo() {
        if (this.b == null) {
            return null;
        }
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f6853a, cameraInfo);
        return cameraInfo;
    }

    public float getCurrentRatio() {
        return this.d;
    }

    public int getPreviewOrientation() {
        return this.c;
    }

    public void openCamera(int i) {
        openCamera(i, 1280, 720, this.c);
    }

    public void openCamera(int i, int i2, int i3, int i4) {
        String str;
        Camera camera;
        List<String> supportedAntibanding;
        this.f6853a = i;
        if (this.b != null) {
            str = "camera already initialized!";
        } else {
            if (b(i) && (camera = this.b) != null) {
                try {
                    this.c = i4;
                    Camera.Parameters parameters = camera.getParameters();
                    if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    }
                    if (i == 0 || !Build.BRAND.contains("Xiaomi")) {
                        parameters.setRecordingHint(true);
                    }
                    if (Build.MODEL.contains("Lenovo K520") && (supportedAntibanding = parameters.getSupportedAntibanding()) != null && supportedAntibanding.contains("50hz")) {
                        parameters.setAntibanding("50hz");
                    }
                    this.b.setParameters(parameters);
                    try {
                        a(this.b, i2, i3);
                    } catch (Exception unused) {
                        Log.e("CameraManager", "setPreviewSize Error");
                    }
                    chooseFixedPreviewFps(30000);
                    this.b.setDisplayOrientation(a(i4));
                    return;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return;
                }
            }
            str = "Unable to open camera!";
        }
        Log.e("CameraManager", str);
    }

    public void releaseCamera() {
        Camera camera = this.b;
        if (camera != null) {
            camera.stopPreview();
            this.b.setPreviewCallback(null);
            this.b.release();
            this.b = null;
        }
    }

    public void reopenCamera() {
        releaseCamera();
        openCamera(this.f6853a);
    }

    public void reopenCamera(int i, int i2) {
        releaseCamera();
        openCamera(this.f6853a, i, i2, this.c);
    }

    public boolean setCameraFlashMode(String str) {
        try {
            Camera camera = this.b;
            if (camera == null) {
                return false;
            }
            Camera.Parameters parameters = camera.getParameters();
            parameters.setFlashMode(str);
            this.b.setParameters(parameters);
            return true;
        } catch (Exception e2) {
            Log.e("setCameraFlashMode ", e2.getLocalizedMessage());
            return false;
        }
    }

    public void setOnCameraError(Camera.ErrorCallback errorCallback) {
        Camera camera = this.b;
        if (camera != null) {
            camera.setErrorCallback(errorCallback);
        }
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        Camera camera = this.b;
        if (camera != null) {
            camera.setPreviewCallback(previewCallback);
        }
    }

    public void setPreviewSurface(SurfaceTexture surfaceTexture) {
        Camera camera = this.b;
        if (camera != null) {
            try {
                camera.setPreviewTexture(surfaceTexture);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void setPreviewSurface(SurfaceHolder surfaceHolder) {
        Camera camera = this.b;
        if (camera != null) {
            try {
                camera.setPreviewDisplay(surfaceHolder);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }

    public void startPreview() {
        Camera.Size size;
        Camera camera = this.b;
        if (camera != null) {
            try {
                size = camera.getParameters().getPreviewSize();
            } catch (Exception e2) {
                e2.printStackTrace();
                size = null;
            }
            if (size != null) {
                int bitsPerPixel = ((size.width * size.height) * ImageFormat.getBitsPerPixel(17)) / 8;
                for (int i = 0; i < 3; i++) {
                    this.b.addCallbackBuffer(new byte[bitsPerPixel]);
                }
            }
            try {
                this.b.startPreview();
            } catch (Exception unused) {
                Log.e("startPreview camera", "Exception");
            }
        }
    }

    public void stopPreview() {
        Camera camera = this.b;
        if (camera != null) {
            camera.stopPreview();
        }
    }

    public void switchCamera(int i, int i2, int i3) {
        if (this.f6853a == i) {
            return;
        }
        this.f6853a = i;
        releaseCamera();
        openCamera(i, i2, i3, this.c);
    }

    public void takePicture(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2) {
        Camera camera = this.b;
        if (camera != null) {
            camera.takePicture(shutterCallback, pictureCallback, pictureCallback2);
        }
    }
}
