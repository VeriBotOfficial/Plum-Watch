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

/* JADX INFO: loaded from: classes16.dex */
public final class CameraManager {
    public static final int DEFAULTHEIGHT = 720;
    public static final int DEFAULTWIDTH = 1280;
    public static final int DESIREDPREVIEWFPS = 30;
    public static final float Ratio11 = 1.0f;
    public static final float Ratio169 = 0.5625f;
    public static final float Ratio43 = 0.75f;
    public static CameraManager e;
    public Camera b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6853a = 1;
    public int c = 0;
    public float d = 0.5625f;

    public class b implements Comparator<Camera.Size> {
        public b(CameraManager cameraManager) {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Camera.Size size, Camera.Size size2) {
            return Long.signum((((long) size.width) * ((long) size.height)) - (((long) size2.width) * ((long) size2.height)));
        }
    }

    public static CameraManager getInstance() {
        if (e == null) {
            e = new CameraManager();
        }
        return e;
    }

    public final int a(int r4) {
        int r5;
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        Camera.getCameraInfo(this.f6853a, cameraInfo);
        if (r4 == 1) {
            r5 = 90;
        } else if (r4 != 2) {
            r5 = r4 != 3 ? 0 : 270;
        } else {
            r5 = 180;
        }
        int r2 = cameraInfo.facing;
        int r0 = cameraInfo.orientation;
        return r2 == 1 ? (360 - ((r0 + r5) % 360)) % 360 : ((r0 - r5) + 360) % 360;
    }

    public final Camera.Size a(List<Camera.Size> list, int r9, int r10) {
        int r4;
        Object objMax;
        a(list);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Camera.Size size : list) {
            int r5 = size.height;
            int r6 = (r5 * r9) / r10;
            int r7 = size.width;
            if (r6 == r7) {
                if (r7 < r9 || r5 < r10) {
                    arrayList2.add(size);
                } else {
                    arrayList.add(size);
                }
            }
        }
        if (arrayList.size() > 0) {
            objMax = Collections.min(arrayList, new b());
        } else {
            if (arrayList2.size() <= 0) {
                boolean z = false;
                Camera.Size size2 = list.get(0);
                for (Camera.Size size3 : list) {
                    int r3 = size3.width;
                    if (r3 != r9 || (r4 = size3.height) != r10 || r4 / r3 != this.d) {
                        if (r3 == r9) {
                            if (Math.abs(size2.height - r10) > Math.abs(size3.height - r10) && size3.height / size3.width == this.d) {
                            }
                            z = true;
                        } else if (size3.height == r10) {
                            if (Math.abs(size2.width - r9) > Math.abs(size3.width - r9) && size3.height / size3.width == this.d) {
                            }
                            z = true;
                        } else if (!z && Math.abs(size2.width - r9) > Math.abs(size3.width - r9) && Math.abs(size2.height - r10) > Math.abs(size3.height - r10) && size3.height / size3.width == this.d) {
                            size2 = size3;
                        }
                    }
                    return size3;
                }
                return size2;
            }
            objMax = Collections.max(arrayList2, new b());
        }
        return (Camera.Size) objMax;
    }

    public final void a(Camera camera, int r4, int r5) {
        Camera.Parameters parameters = camera.getParameters();
        Camera.Size sizeA = a(parameters.getSupportedPreviewSizes(), r4, r5);
        parameters.setPreviewSize(sizeA.width, sizeA.height);
        camera.setParameters(parameters);
        Log.d("setPreviewSize", "width = " + sizeA.width + ", height = " + sizeA.height);
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

    public final boolean b(int r5) {
        for (int r1 = 0; r1 < 3; r1++) {
            try {
                this.b = Camera.open(r5);
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

    public boolean chooseFixedPreviewFps(int r11) {
        try {
            Camera camera = this.b;
            if (camera != null) {
                Camera.Parameters parameters = camera.getParameters();
                int[] r3 = new int[2];
                for (int[] r4 : parameters.getSupportedPreviewFpsRange()) {
                    Log.d("CameraManager", "entry: " + r4[0] + " - " + r4[1]);
                    int r5 = r4[0];
                    int r6 = r4[1];
                    if (r5 == r6 && r5 == r11) {
                        parameters.setPreviewFpsRange(r5, r6);
                        return true;
                    }
                    if (r5 >= r3[0] && r6 >= r3[1]) {
                        r3[0] = r5;
                        r3[1] = r6;
                    }
                }
                Log.d("CameraManager", "setting fps: " + r3[0] + " - " + r3[1]);
                parameters.setPreviewFpsRange(r3[0], r3[1]);
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

    public void openCamera(int r4) {
        openCamera(r4, 1280, 720, this.c);
    }

    public void openCamera(int r6, int r7, int r8, int r9) {
        String str;
        Camera camera;
        List<String> supportedAntibanding;
        this.f6853a = r6;
        if (this.b != null) {
            str = "camera already initialized!";
        } else {
            if (b(r6) && (camera = this.b) != null) {
                try {
                    this.c = r9;
                    Camera.Parameters parameters = camera.getParameters();
                    if (parameters.getSupportedFocusModes().contains("continuous-video")) {
                        parameters.setFocusMode("continuous-video");
                    }
                    if (r6 == 0 || !Build.BRAND.contains("Xiaomi")) {
                        parameters.setRecordingHint(true);
                    }
                    if (Build.MODEL.contains("Lenovo K520") && (supportedAntibanding = parameters.getSupportedAntibanding()) != null && supportedAntibanding.contains("50hz")) {
                        parameters.setAntibanding("50hz");
                    }
                    this.b.setParameters(parameters);
                    try {
                        a(this.b, r7, r8);
                    } catch (Exception unused) {
                        Log.e("CameraManager", "setPreviewSize Error");
                    }
                    chooseFixedPreviewFps(30000);
                    this.b.setDisplayOrientation(a(r9));
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

    public void reopenCamera(int r3, int r4) {
        releaseCamera();
        openCamera(this.f6853a, r3, r4, this.c);
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
        Camera.Size previewSize;
        Camera camera = this.b;
        if (camera != null) {
            try {
                previewSize = camera.getParameters().getPreviewSize();
            } catch (Exception e2) {
                e2.printStackTrace();
                previewSize = null;
            }
            if (previewSize != null) {
                int bitsPerPixel = ((previewSize.width * previewSize.height) * ImageFormat.getBitsPerPixel(17)) / 8;
                for (int r0 = 0; r0 < 3; r0++) {
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

    public void switchCamera(int r2, int r3, int r4) {
        if (this.f6853a == r2) {
            return;
        }
        this.f6853a = r2;
        releaseCamera();
        openCamera(r2, r3, r4, this.c);
    }

    public void takePicture(Camera.ShutterCallback shutterCallback, Camera.PictureCallback pictureCallback, Camera.PictureCallback pictureCallback2) {
        Camera camera = this.b;
        if (camera != null) {
            camera.takePicture(shutterCallback, pictureCallback, pictureCallback2);
        }
    }
}
