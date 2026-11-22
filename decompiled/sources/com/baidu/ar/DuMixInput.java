package com.baidu.ar;

import android.graphics.SurfaceTexture;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.MirriorType;
import com.baidu.ar.bean.RotationType;

/* loaded from: classes12.dex */
public class DuMixInput {

    /* renamed from: a, reason: collision with root package name */
    public SurfaceTexture f6741a;
    public Texture b;
    public int c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public RotationType h;
    public MirriorType i;
    public boolean j;
    public boolean k;

    public DuMixInput() {
        this.c = 0;
        this.d = 0;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = RotationType.ROTATE_90;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = false;
        this.k = false;
    }

    public DuMixInput(int i, int i2) {
        this.c = 0;
        this.d = 0;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = RotationType.ROTATE_90;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = false;
        this.k = false;
        this.c = i;
        this.d = i2;
    }

    public DuMixInput(SurfaceTexture surfaceTexture, int i, int i2) {
        this.c = 0;
        this.d = 0;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = RotationType.ROTATE_90;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = false;
        this.k = false;
        this.f6741a = surfaceTexture;
        this.c = i;
        this.d = i2;
    }

    public DuMixInput(Texture texture, int i, int i2) {
        this.c = 0;
        this.d = 0;
        this.e = true;
        this.f = true;
        this.g = true;
        this.h = RotationType.ROTATE_90;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = false;
        this.k = false;
        this.b = texture;
        this.c = i;
        this.d = i2;
    }

    public int getInputDegree() {
        return this.h.getDegree();
    }

    public int getInputHeight() {
        return this.d;
    }

    public SurfaceTexture getInputSurface() {
        return this.f6741a;
    }

    public Texture getInputTexture() {
        return this.b;
    }

    public int getInputWidth() {
        return this.c;
    }

    public MirriorType getMirriorType() {
        return this.i;
    }

    public RotationType getRotationType() {
        return this.h;
    }

    public boolean isCameraInput() {
        return this.e;
    }

    public boolean isFitCameraAuto() {
        return this.g;
    }

    public boolean isFrontCamera() {
        return this.f;
    }

    public boolean isSingleFrame() {
        return this.k;
    }

    public boolean isSyncInputContent() {
        return this.j;
    }

    public void setCameraInput(boolean z) {
        this.e = z;
    }

    public void setFitCameraAuto(boolean z) {
        this.g = z;
    }

    public void setFrontCamera(boolean z) {
        this.f = z;
    }

    public void setInputDegree(int i) {
        RotationType rotationType;
        int i2 = ((i % 360) + 360) % 360;
        if (i == 0) {
            rotationType = RotationType.ROTATE_0;
        } else if (i == 90) {
            rotationType = RotationType.ROTATE_90;
        } else if (i == 180) {
            rotationType = RotationType.ROTATE_180;
        } else if (i != 270) {
            return;
        } else {
            rotationType = RotationType.ROTATE_270;
        }
        this.h = rotationType;
    }

    public void setInputHeight(int i) {
        this.d = i;
    }

    public void setInputSurface(SurfaceTexture surfaceTexture) {
        this.f6741a = surfaceTexture;
    }

    public void setInputTexture(Texture texture) {
        this.b = texture;
    }

    public void setInputWidth(int i) {
        this.c = i;
    }

    public void setMirriorType(MirriorType mirriorType) {
        this.i = mirriorType;
    }

    public void setRotationType(RotationType rotationType) {
        this.h = rotationType;
    }

    public void setSingleFrame(boolean z) {
        this.k = z;
        if (z) {
            this.j = true;
            this.e = false;
            this.f = false;
        }
    }

    public void setSyncInputContent(boolean z) {
        this.j = z;
    }
}
