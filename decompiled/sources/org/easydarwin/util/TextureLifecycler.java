package org.easydarwin.util;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class TextureLifecycler implements LifecycleOwner {
    private LifecycleRegistry mLifecycleRegistry = new LifecycleRegistry(this);
    WeakReference<TextureView> mRef;

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public TextureLifecycler(TextureView textureView) {
        this.mRef = new WeakReference<>(textureView);
        this.mLifecycleRegistry.markState(Lifecycle.State.INITIALIZED);
        if (textureView.isAvailable()) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
        textureView.setSurfaceTextureListener(new TextureView.SurfaceTextureListener() { // from class: org.easydarwin.util.TextureLifecycler.1
            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
                TextureLifecycler.this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
                TextureLifecycler.this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
                TextureLifecycler.this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }

            @Override // android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                TextureLifecycler.this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
                TextureLifecycler.this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
                TextureLifecycler.this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
                return true;
            }
        });
    }
}
