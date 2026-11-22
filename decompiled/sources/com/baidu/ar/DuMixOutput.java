package com.baidu.ar;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.bean.MirriorType;
import com.baidu.ar.bean.RotationType;
import com.baidu.ar.bean.ScaleType;
import com.baidu.ar.bean.Watermark;

/* loaded from: classes12.dex */
public class DuMixOutput {

    /* renamed from: a, reason: collision with root package name */
    public Object f6742a;
    public boolean b;
    public int c;
    public int d;
    public ScaleType e;
    public boolean f;
    public int g;
    public RotationType h;
    public MirriorType i;
    public int j;
    public Watermark k;

    public DuMixOutput() {
        this.f6742a = null;
        this.b = false;
        this.e = ScaleType.CENTER_CROP;
        this.f = true;
        this.g = 1;
        this.h = RotationType.ROTATE_0;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = 0;
    }

    public DuMixOutput(int i, int i2) {
        this.f6742a = null;
        this.b = false;
        this.e = ScaleType.CENTER_CROP;
        this.f = true;
        this.g = 1;
        this.h = RotationType.ROTATE_0;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = 0;
        this.c = i;
        this.d = i2;
    }

    public DuMixOutput(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f6742a = null;
        this.b = false;
        this.e = ScaleType.CENTER_CROP;
        this.f = true;
        this.g = 1;
        this.h = RotationType.ROTATE_0;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = 0;
        this.f6742a = surfaceTexture;
        this.c = i;
        this.d = i2;
    }

    public DuMixOutput(Surface surface, int i, int i2) {
        this.f6742a = null;
        this.b = false;
        this.e = ScaleType.CENTER_CROP;
        this.f = true;
        this.g = 1;
        this.h = RotationType.ROTATE_0;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = 0;
        this.f6742a = surface;
        this.c = i;
        this.d = i2;
    }

    public DuMixOutput(SurfaceHolder surfaceHolder, int i, int i2) {
        this.f6742a = null;
        this.b = false;
        this.e = ScaleType.CENTER_CROP;
        this.f = true;
        this.g = 1;
        this.h = RotationType.ROTATE_0;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = 0;
        this.f6742a = surfaceHolder;
        this.c = i;
        this.d = i2;
    }

    public DuMixOutput(Texture texture, int i, int i2) {
        this.f6742a = null;
        this.b = false;
        this.e = ScaleType.CENTER_CROP;
        this.f = true;
        this.g = 1;
        this.h = RotationType.ROTATE_0;
        this.i = MirriorType.NO_MIRRIOR;
        this.j = 0;
        this.f6742a = texture;
        this.c = i;
        this.d = i2;
    }

    public MirriorType getMirriorType() {
        return this.i;
    }

    public int getOutputFPS() {
        return this.j;
    }

    public int getOutputHeight() {
        return this.d;
    }

    public Object getOutputSurface() {
        return this.f6742a;
    }

    public Texture getOutputTexture() {
        Object obj = this.f6742a;
        if (obj == null || !(obj instanceof Texture)) {
            return null;
        }
        return (Texture) obj;
    }

    public int getOutputWidth() {
        return this.c;
    }

    public RotationType getRotationType() {
        return this.h;
    }

    public ScaleType getScaleType() {
        return this.e;
    }

    public int getScreenOrientation() {
        return this.g;
    }

    public Watermark getWatermark() {
        return this.k;
    }

    public boolean isFitScreenAuto() {
        return this.f;
    }

    public boolean isNeedDetach() {
        return this.b;
    }

    public void setFitScreenAuto(boolean z) {
        this.f = z;
    }

    public void setMirriorType(MirriorType mirriorType) {
        this.i = mirriorType;
    }

    public void setNeedDetach(boolean z) {
        this.b = z;
    }

    public void setOutputFPS(int i) {
        this.j = i;
    }

    public void setOutputHeight(int i) {
        this.d = i;
    }

    public void setOutputSurface(SurfaceTexture surfaceTexture) {
        this.f6742a = surfaceTexture;
    }

    public void setOutputSurface(Surface surface) {
        this.f6742a = surface;
    }

    public void setOutputSurface(SurfaceHolder surfaceHolder) {
        this.f6742a = surfaceHolder;
    }

    public void setOutputTexture(Texture texture) {
        this.f6742a = texture;
    }

    public void setOutputWidth(int i) {
        this.c = i;
    }

    public void setRotationType(RotationType rotationType) {
        this.h = rotationType;
    }

    public void setScaleType(ScaleType scaleType) {
        this.e = scaleType;
    }

    public void setScreenOrientation(int i) {
        this.g = i;
    }

    public void setWatermark(Watermark watermark) {
        this.k = watermark;
    }
}
