package org.easydarwin.player;

import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import org.easydarwin.video.EasyPlayerClient;

/* loaded from: classes6.dex */
public class EasyPlayer {
    private static final String LOG_TAG = "EasyPlayer";
    private final ComponentListener componentListener;
    private final String mPath;
    private EasyPlayerClient mRTSPClient;
    private final int mTransport;
    private Surface surface;
    private SurfaceHolder surfaceHolder;
    private TextureView textureView;

    public void create() {
    }

    private static class ComponentListener implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }

        private ComponentListener() {
        }
    }

    public static class EasyPlayerFactory {
        public static final int SETRANSPORT_MODE_UDP = 2;
        public static final int TRANSPORT_MODE_TCP = 1;
        private boolean autoPlayWhenReady;
        private int mTransportMode = 1;
        private Uri mURI;

        public @interface TRANSPORT_MODE {
        }

        public EasyPlayerFactory setUri(Uri uri) {
            if (!"rtsp".equalsIgnoreCase(uri.getScheme())) {
                throw new IllegalArgumentException("only support rtsp stream.");
            }
            this.mURI = uri;
            return this;
        }

        public EasyPlayerFactory setPath(String str) {
            setUri(Uri.parse(str));
            return this;
        }

        public EasyPlayerFactory setAutoPlayWhenReady(boolean z) {
            this.autoPlayWhenReady = z;
            return this;
        }

        public EasyPlayerFactory setTransportMode(int i) {
            this.mTransportMode = i;
            return this;
        }

        public EasyPlayer build() {
            if (this.mURI == null) {
                throw new NullPointerException("uri should not be null!");
            }
            return new EasyPlayer(this.mURI.getPath(), this.mTransportMode);
        }
    }

    private EasyPlayer(String str, int i) {
        this.componentListener = new ComponentListener() { // from class: org.easydarwin.player.EasyPlayer.1
            @Override // org.easydarwin.player.EasyPlayer.ComponentListener, android.view.SurfaceHolder.Callback
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                super.surfaceCreated(surfaceHolder);
                EasyPlayer.this.surface = surfaceHolder.getSurface();
            }

            @Override // org.easydarwin.player.EasyPlayer.ComponentListener, android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                super.surfaceDestroyed(surfaceHolder);
                EasyPlayer.this.surface = null;
            }

            @Override // org.easydarwin.player.EasyPlayer.ComponentListener, android.view.TextureView.SurfaceTextureListener
            public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
                super.onSurfaceTextureAvailable(surfaceTexture, i2, i3);
                EasyPlayer.this.surface = new Surface(surfaceTexture);
            }

            @Override // org.easydarwin.player.EasyPlayer.ComponentListener, android.view.TextureView.SurfaceTextureListener
            public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
                EasyPlayer.this.surface = null;
                return true;
            }
        };
        this.mPath = str;
        this.mTransport = i;
    }

    public void destroy() {
        removeSurfaceCallbacks();
    }

    private void removeSurfaceCallbacks() {
        TextureView textureView = this.textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.componentListener) {
                Log.w(LOG_TAG, "SurfaceTextureListener already unset or replaced.");
            } else {
                this.textureView.setSurfaceTextureListener(null);
            }
            this.textureView = null;
        }
        SurfaceHolder surfaceHolder = this.surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.componentListener);
            this.surfaceHolder = null;
        }
    }

    private void setVideoSurfaceInternal(Surface surface) {
        this.surface = surface;
    }

    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        removeSurfaceCallbacks();
        this.surfaceHolder = surfaceHolder;
        Surface surface = null;
        if (surfaceHolder == null) {
            setVideoSurfaceInternal(null);
            return;
        }
        surfaceHolder.addCallback(this.componentListener);
        Surface surface2 = surfaceHolder.getSurface();
        if (surface2 != null && surface2.isValid()) {
            surface = surface2;
        }
        setVideoSurfaceInternal(surface);
    }

    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        if (surfaceHolder == null || surfaceHolder != this.surfaceHolder) {
            return;
        }
        setVideoSurfaceHolder(null);
    }

    public void setVideoSurfaceView(SurfaceView surfaceView) {
        setVideoSurfaceHolder(surfaceView == null ? null : surfaceView.getHolder());
    }

    public void setVideoTextureView(TextureView textureView) {
        removeSurfaceCallbacks();
        this.textureView = textureView;
        if (textureView == null) {
            setVideoSurfaceInternal(null);
            return;
        }
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w(LOG_TAG, "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.componentListener);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        setVideoSurfaceInternal(surfaceTexture != null ? new Surface(surfaceTexture) : null);
    }
}
