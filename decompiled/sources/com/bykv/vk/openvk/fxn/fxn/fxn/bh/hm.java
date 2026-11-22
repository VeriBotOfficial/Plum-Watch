package com.bykv.vk.openvk.fxn.fxn.fxn.bh;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg;

/* loaded from: classes13.dex */
public class hm extends TextureView implements TextureView.SurfaceTextureListener, kg {
    private fxn fxn;
    private kg.fxn kg;

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public SurfaceHolder getHolder() {
        return null;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public View getView() {
        return this;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public hm(Context context) {
        this(context, null);
    }

    public hm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public void fxn(fxn fxnVar) {
        this.fxn = fxnVar;
        setSurfaceTextureListener(this);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.fxn.bh.kg
    public void fxn(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.TextureView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.TextureView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        fxn fxnVar = this.fxn;
        if (fxnVar != null) {
            fxnVar.fxn(surfaceTexture, i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        fxn fxnVar = this.fxn;
        if (fxnVar != null) {
            return fxnVar.fxn(surfaceTexture);
        }
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    public void setWindowVisibilityChangedListener(kg.fxn fxnVar) {
        this.kg = fxnVar;
    }
}
