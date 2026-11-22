package com.baidu.ar;

import android.app.Activity;
import android.util.Log;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.i1;
import com.huawei.hiar.ARCameraIntrinsics;
import com.huawei.hiar.ARConfigBase;
import com.huawei.hiar.ARFrame;
import com.huawei.hiar.ARPose;
import com.huawei.hiar.ARSession;
import com.huawei.hiar.ARWorldTrackingConfig;
import java.util.LinkedList;

/* loaded from: classes12.dex */
public class e extends i1 {
    public Activity b;
    public ARSession c;
    public boolean e;
    public float[] d = {1095.9f, 0.0f, 719.122f, 0.0f, 1095.8f, 548.474f, 0.0f, 0.0f, 1.0f};
    public boolean f = true;

    public e(Activity activity) {
        new LinkedList();
        this.b = activity;
    }

    @Override // com.baidu.ar.i1
    public void a() {
        double d;
        double d2;
        super.a();
        ARSession aRSession = this.c;
        if (aRSession == null) {
            return;
        }
        ARFrame update = aRSession.update();
        ARPose pose = update.getCamera().getPose();
        ARCameraIntrinsics cameraImageIntrinsics = update.getCamera().getCameraImageIntrinsics();
        float[] principalPoint = cameraImageIntrinsics.getPrincipalPoint();
        float[] focalLength = cameraImageIntrinsics.getFocalLength();
        float[] fArr = a(focalLength) ? new float[]{focalLength[1], 0.0f, principalPoint[1], 0.0f, focalLength[0], principalPoint[0], 0.0f, 0.0f, 1.0f} : this.e ? this.d : null;
        if (fArr != null) {
            d = 180.0d;
            d2 = fArr[2] / fArr[0];
        } else {
            d = 180.0d;
            float[] fArr2 = this.d;
            d2 = fArr2[2] / fArr2[0];
        }
        double atan = ((Math.atan(d2) * 2.0d) / 3.141592653589793d) * d;
        Log.e("AREngineAbility", "fov:" + atan);
        float[] fArr3 = new float[16];
        pose.toMatrix(fArr3, 0);
        float[] fArr4 = {fArr3[0], fArr3[4], fArr3[8], fArr3[1], fArr3[5], fArr3[9], fArr3[2], fArr3[6], fArr3[10], fArr3[12], fArr3[13], fArr3[14]};
        i1.a aVar = this.f6976a;
        if (aVar != null) {
            aVar.a(0, fArr, (float) atan, fArr4, fArr3);
        }
    }

    @Override // com.baidu.ar.b7
    public void a(Texture texture) {
        ARSession aRSession = this.c;
        if (aRSession != null) {
            aRSession.setCameraTextureName(texture.getId());
        }
    }

    @Override // com.baidu.ar.i1
    public boolean a(boolean z) {
        try {
            this.e = z;
            this.c = new ARSession(this.b);
            ARWorldTrackingConfig aRWorldTrackingConfig = new ARWorldTrackingConfig(this.c);
            aRWorldTrackingConfig.setFocusMode(z ? ARConfigBase.FocusMode.FIXED_FOCUS : ARConfigBase.FocusMode.AUTO_FOCUS);
            aRWorldTrackingConfig.setSemanticMode(1);
            this.c.configure(aRWorldTrackingConfig);
            return true;
        } catch (Exception e) {
            Log.e("AREngineAbility", "create ARSession error!!!");
            e.printStackTrace();
            ARSession aRSession = this.c;
            if (aRSession == null) {
                return false;
            }
            aRSession.stop();
            this.c = null;
            return false;
        }
    }

    public final boolean a(float[] fArr) {
        for (float f : fArr) {
            if (f == 0.0f) {
                return false;
            }
        }
        return true;
    }

    @Override // com.baidu.ar.i1
    public boolean b() {
        try {
            this.f = false;
            this.c.pause();
            this.c.stop();
            this.c = null;
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return super.b();
        }
    }

    @Override // com.baidu.ar.i1
    public void c() {
        ARSession aRSession = this.c;
        if (aRSession != null) {
            aRSession.stop();
            this.c = null;
        }
    }

    @Override // com.baidu.ar.i1
    public boolean d() {
        if (!this.f) {
            a(this.e);
            this.f = true;
        }
        ARSession aRSession = this.c;
        if (aRSession == null) {
            return super.d();
        }
        aRSession.resume();
        return true;
    }
}
