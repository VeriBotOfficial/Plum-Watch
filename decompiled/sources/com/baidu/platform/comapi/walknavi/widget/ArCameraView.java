package com.baidu.platform.comapi.walknavi.widget;

import android.app.Activity;
import android.content.Context;
import android.hardware.Camera;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.Toast;
import com.baidu.platform.comapi.wnplatform.p.h;
import java.util.List;

/* loaded from: classes13.dex */
public class ArCameraView extends SurfaceView implements SurfaceHolder.Callback {
    public static final int WALK_AR_PERMISSION = 3001;

    /* renamed from: a, reason: collision with root package name */
    SurfaceHolder f8825a;
    Camera b;
    private Context c;

    public ArCameraView(Context context) {
        super(context);
        a(context);
    }

    private void a(Context context) {
        try {
            this.c = context;
            SurfaceHolder holder = getHolder();
            this.f8825a = holder;
            holder.addCallback(this);
            this.f8825a.setType(3);
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(com.baidu.platform.comapi.wnplatform.p.q.a.a(), "相机出现错误", 0).show();
        }
    }

    public static int getBackCameraId() {
        try {
            int numberOfCameras = Camera.getNumberOfCameras();
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            for (int i = 0; i < numberOfCameras; i++) {
                Camera.getCameraInfo(i, cameraInfo);
                if (cameraInfo.facing == 0) {
                    return i;
                }
            }
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            Log.d("ARCamera", "GetBackCameraID error!");
            return -1;
        }
    }

    public static boolean setCameraDisplayOrientation(Activity activity, int i, Camera camera) {
        if (i == -1) {
            return false;
        }
        try {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
            int i2 = rotation != 1 ? rotation != 2 ? rotation != 3 ? 0 : 270 : 180 : 90;
            camera.setDisplayOrientation(cameraInfo.facing == 1 ? (360 - ((cameraInfo.orientation + i2) % 360)) % 360 : ((cameraInfo.orientation - i2) + 360) % 360);
            return true;
        } catch (Exception e) {
            Log.d("ARCamera", e.getMessage());
            return false;
        }
    }

    protected Camera.Size getBestPreSize(int i, int i2, List<Camera.Size> list) {
        for (Camera.Size size : list) {
            if (size.width == i && size.height == i2) {
                return size;
            }
        }
        float f = i / i2;
        float f2 = 0.1f;
        Camera.Size size2 = null;
        for (Camera.Size size3 : list) {
            float abs = Math.abs(f - (size3.width / size3.height));
            if (abs < f2) {
                size2 = size3;
                f2 = abs;
            }
        }
        if (size2 == null) {
            double d = Double.MAX_VALUE;
            for (Camera.Size size4 : list) {
                if (Math.abs(size4.height - i2) < d) {
                    d = Math.abs(size4.height - i2);
                    size2 = size4;
                }
            }
        }
        return size2;
    }

    public void pauseCamera() {
        try {
            Camera camera = this.b;
            if (camera != null) {
                camera.stopPreview();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void releaseCamera() {
        try {
            Camera camera = this.b;
            if (camera != null) {
                try {
                    camera.setPreviewCallback(null);
                    this.b.stopPreview();
                } catch (Exception unused) {
                }
                try {
                    this.b.release();
                } catch (Exception unused2) {
                }
                this.b = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void resumeCamera() {
        try {
            Camera camera = this.b;
            if (camera != null) {
                camera.startPreview();
            }
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(com.baidu.platform.comapi.wnplatform.p.q.a.a(), "相机出现错误", 0).show();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (!setCameraDisplayOrientation((Activity) this.c, getBackCameraId(), this.b)) {
            a(90);
        }
        resumeCamera();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        Log.e("CameraView", "surfaceCreated");
        try {
            if (this.b == null) {
                this.b = Camera.open();
            }
            Camera.Parameters parameters = this.b.getParameters();
            Camera.Size bestPreSize = getBestPreSize(h.b(this.c), h.c(this.c), parameters.getSupportedPreviewSizes());
            parameters.setPreviewSize(bestPreSize.width, bestPreSize.height);
            Camera camera = this.b;
            if (camera != null) {
                camera.setParameters(parameters);
                this.b.setPreviewDisplay(surfaceHolder);
            }
            resumeCamera();
        } catch (Exception e) {
            e.printStackTrace();
            Toast.makeText(com.baidu.platform.comapi.wnplatform.p.q.a.a(), "相机出现错误", 0).show();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        Log.e("CameraView", "surfaceDestroyed");
        releaseCamera();
    }

    public ArCameraView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    private void a(int i) {
        try {
            Camera camera = this.b;
            if (camera != null) {
                camera.setDisplayOrientation(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
