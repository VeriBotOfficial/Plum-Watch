package com.bykv.vk.openvk.fxn.fxn.kg.gff;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;

/* loaded from: classes13.dex */
public class kg extends com.bykv.vk.openvk.fxn.fxn.kg.gff.fxn {
    private final Object bh;
    private final fxn gff;
    private com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn hm;
    private final MediaPlayer kg;
    private Surface rb;

    /* renamed from: sg, reason: collision with root package name */
    private volatile boolean f9086sg;

    public kg() {
        MediaPlayer mediaPlayer;
        Object obj = new Object();
        this.bh = obj;
        synchronized (obj) {
            mediaPlayer = new MediaPlayer();
            this.kg = mediaPlayer;
        }
        fxn(mediaPlayer);
        try {
            mediaPlayer.setAudioStreamType(3);
        } catch (Throwable unused) {
        }
        this.gff = new fxn(this);
        rmu();
    }

    private void fxn(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        try {
            Class<?> cls = Class.forName("android.media.MediaTimeProvider");
            Class<?> cls2 = Class.forName("android.media.SubtitleController");
            Class<?> cls3 = Class.forName("android.media.SubtitleController$Anchor");
            Object newInstance = cls2.getConstructor(Context.class, cls, Class.forName("android.media.SubtitleController$Listener")).newInstance(com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn(), null, null);
            Field declaredField = cls2.getDeclaredField("mHandler");
            declaredField.setAccessible(true);
            try {
                declaredField.set(newInstance, new Handler());
                declaredField.setAccessible(false);
                mediaPlayer.getClass().getMethod("setSubtitleAnchor", cls2, cls3).invoke(mediaPlayer, newInstance, null);
            } catch (Throwable unused) {
                declaredField.setAccessible(false);
            }
        } catch (Throwable unused2) {
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(SurfaceHolder surfaceHolder) throws Throwable {
        synchronized (this.bh) {
            try {
                if (!this.f9086sg && surfaceHolder != null && surfaceHolder.getSurface() != null && this.fxn) {
                    this.kg.setDisplay(surfaceHolder);
                }
            } catch (Throwable unused) {
            }
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(Surface surface) {
        je();
        this.rb = surface;
        this.kg.setSurface(surface);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.kg kgVar) throws Throwable {
        this.kg.setPlaybackParams(this.kg.getPlaybackParams().setSpeed(kgVar.fxn()));
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public PlaybackParams rb() throws IllegalStateException {
        return this.kg.getPlaybackParams();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(String str) throws Throwable {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (!TextUtils.isEmpty(scheme) && scheme.equalsIgnoreCase("file")) {
            this.kg.setDataSource(parse.getPath());
        } else {
            this.kg.setDataSource(str);
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(FileDescriptor fileDescriptor) throws Throwable {
        this.kg.setDataSource(fileDescriptor);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public synchronized void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.gff gffVar) {
        this.hm = com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn.fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.fxn(), gffVar);
        com.bykv.vk.openvk.fxn.fxn.kg.fxn.kg.gff.fxn(gffVar);
        this.kg.setDataSource(this.hm);
    }

    private void xdg() {
        com.bykv.vk.openvk.fxn.fxn.kg.fxn.fxn fxnVar = this.hm;
        if (fxnVar != null) {
            try {
                fxnVar.close();
            } catch (Throwable unused) {
            }
            this.hm = null;
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void bh() throws Throwable {
        this.kg.start();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void sg() throws Throwable {
        this.kg.stop();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void tw() throws Throwable {
        this.kg.pause();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void jq() {
        MediaPlayer mediaPlayer = this.kg;
        if (mediaPlayer != null) {
            mediaPlayer.prepareAsync();
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void kg(boolean z) throws Throwable {
        this.kg.setScreenOnWhilePlaying(z);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void fxn(long j, int i) throws Throwable {
        if (i == 0) {
            this.kg.seekTo((int) j, 0);
            return;
        }
        if (i == 1) {
            this.kg.seekTo((int) j, 1);
            return;
        }
        if (i == 2) {
            this.kg.seekTo((int) j, 2);
        } else if (i == 3) {
            this.kg.seekTo((int) j, 3);
        } else {
            this.kg.seekTo((int) j);
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public long hie() {
        try {
            return this.kg.getCurrentPosition();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public long dgx() {
        try {
            return this.kg.getDuration();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void mvp() throws Throwable {
        synchronized (this.bh) {
            if (!this.f9086sg) {
                this.kg.release();
                this.f9086sg = true;
                je();
                xdg();
                fxn();
                rmu();
            }
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void rlu() throws Throwable {
        try {
            this.kg.reset();
        } catch (Throwable unused) {
        }
        xdg();
        fxn();
        rmu();
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void gff(boolean z) throws Throwable {
        this.kg.setLooping(z);
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public void hm(boolean z) throws Throwable {
        MediaPlayer mediaPlayer = this.kg;
        if (mediaPlayer == null) {
            return;
        }
        if (z) {
            mediaPlayer.setVolume(0.0f, 0.0f);
        } else {
            mediaPlayer.setVolume(1.0f, 1.0f);
        }
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public int zu() {
        MediaPlayer mediaPlayer = this.kg;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoWidth();
        }
        return 0;
    }

    @Override // com.bykv.vk.openvk.fxn.fxn.kg.gff.gff
    public int ckl() {
        MediaPlayer mediaPlayer = this.kg;
        if (mediaPlayer != null) {
            return mediaPlayer.getVideoHeight();
        }
        return 0;
    }

    private void rmu() {
        this.kg.setOnPreparedListener(this.gff);
        this.kg.setOnBufferingUpdateListener(this.gff);
        this.kg.setOnCompletionListener(this.gff);
        this.kg.setOnSeekCompleteListener(this.gff);
        this.kg.setOnVideoSizeChangedListener(this.gff);
        this.kg.setOnErrorListener(this.gff);
        this.kg.setOnInfoListener(this.gff);
    }

    private static class fxn implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnVideoSizeChangedListener {
        private final WeakReference<kg> fxn;

        public fxn(kg kgVar) {
            this.fxn = new WeakReference<>(kgVar);
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    return kgVar.kg(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                new Object[]{"onError: ", Integer.valueOf(i), Integer.valueOf(i2)};
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    return kgVar.fxn(i, i2);
                }
                return false;
            } catch (Throwable unused) {
                return false;
            }
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    kgVar.fxn(i, i2, 1, 1);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
            try {
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    kgVar.hm();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            try {
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    kgVar.fxn(i);
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            try {
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    kgVar.gff();
                }
            } catch (Throwable unused) {
            }
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                kg kgVar = this.fxn.get();
                if (kgVar != null) {
                    kgVar.kg();
                }
            } catch (Throwable unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        je();
    }

    private void je() {
        try {
            Surface surface = this.rb;
            if (surface != null) {
                surface.release();
                this.rb = null;
            }
        } catch (Throwable unused) {
        }
    }
}
