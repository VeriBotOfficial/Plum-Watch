package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes17.dex */
public class p extends SurfaceView implements MediaController.MediaPlayerControl {
    private static final int e0 = -1;
    private static final int f0 = 0;
    private static final int g0 = 1;
    private static final int h0 = 2;
    private static final int i0 = 3;
    private static final int j0 = 4;
    private static final int k0 = 5;
    private SurfaceHolder A;
    private int B;
    private int C;
    private int D;
    MediaPlayer.OnVideoSizeChangedListener E;
    private int F;
    private int G;
    private MediaController H;
    private MediaPlayer.OnCompletionListener I;
    private MediaPlayer.OnPreparedListener J;
    private int K;
    private MediaPlayer.OnErrorListener L;
    private MediaPlayer.OnInfoListener M;
    private int N;
    private boolean O;
    private boolean P;
    private boolean Q;
    protected int R;
    private Runnable S;
    MediaPlayer.OnPreparedListener T;
    private MediaPlayer.OnCompletionListener U;
    private MediaPlayer.OnInfoListener V;
    private MediaPlayer.OnErrorListener W;
    private MediaPlayer.OnBufferingUpdateListener a0;
    SurfaceHolder.Callback b0;
    private final Runnable c0;
    private final Runnable d0;
    public MediaPlayer t;
    private String u;
    private Uri v;
    private Uri w;
    private Map<String, String> x;
    private int y;
    private int z;

    class a implements MediaPlayer.OnVideoSizeChangedListener {

        /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.p$a$a, reason: collision with other inner class name */
        class RunnableC0838a implements Runnable {
            RunnableC0838a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                p.this.getHolder().setFixedSize(p.this.C, p.this.D);
                p.this.requestLayout();
            }
        }

        a() {
        }

        @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                p.this.C = mediaPlayer.getVideoWidth();
                p.this.D = mediaPlayer.getVideoHeight();
                if (p.this.C == 0 || p.this.D == 0) {
                    return;
                }
                com.qumeng.overseas.advlib.__remote__.utils.j.c().post(new RunnableC0838a());
            } catch (Throwable unused) {
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                p.this.t = new MediaPlayer();
                if (p.this.B != 0) {
                    p pVar = p.this;
                    pVar.t.setAudioSessionId(pVar.B);
                } else {
                    p pVar2 = p.this;
                    pVar2.B = pVar2.t.getAudioSessionId();
                }
                p pVar3 = p.this;
                pVar3.t.setOnPreparedListener(pVar3.T);
                p pVar4 = p.this;
                pVar4.t.setOnVideoSizeChangedListener(pVar4.E);
                p pVar5 = p.this;
                pVar5.t.setOnCompletionListener(pVar5.U);
                p pVar6 = p.this;
                pVar6.t.setOnErrorListener(pVar6.W);
                p pVar7 = p.this;
                pVar7.t.setOnInfoListener(pVar7.V);
                p pVar8 = p.this;
                pVar8.t.setOnBufferingUpdateListener(pVar8.a0);
                p.this.K = 0;
                Uri uri = p.this.v;
                p pVar9 = p.this;
                pVar9.w = pVar9.v;
                try {
                    String scheme = p.this.v != null ? p.this.v.getScheme() : null;
                    if ("http".equals(scheme) || "https".equals(scheme)) {
                        String c = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.c.b().c(p.this.v.toString());
                        if (com.qumeng.overseas.advlib.trdparty.unionset.utils.b.b(c) && !c.equals(p.this.v.toString())) {
                            uri = Uri.parse(c);
                        }
                    }
                } catch (Throwable unused) {
                    uri = p.this.v;
                }
                p.this.v = uri;
                if ("127.0.0.1".equals(uri.getHost())) {
                    com.qumeng.overseas.advlib.__remote__.utils.n.a("VCacheProxy", "[Player] 使用代理播放: " + uri, new Object[0]);
                    p.this.t.setDataSource(uri.toString());
                } else {
                    com.qumeng.overseas.advlib.__remote__.utils.n.a("VCacheProxy", "[Player] 直连播放: " + uri, new Object[0]);
                    p pVar10 = p.this;
                    pVar10.t.setDataSource(pVar10.getContext(), uri, p.this.x);
                }
                p pVar11 = p.this;
                pVar11.t.setDisplay(pVar11.A);
                p.this.t.setAudioStreamType(3);
                p.this.t.setScreenOnWhilePlaying(true);
                p.this.t.prepareAsync();
                p.this.y = 1;
                p.this.a();
            } catch (IOException e) {
                com.qumeng.overseas.advlib.__remote__.utils.n.f(p.this.u, "Unable to open content: " + p.this.v, e);
                p.this.y = -1;
                p.this.z = -1;
                p.this.W.onError(p.this.t, 1, 0);
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(p.class, "IOException_MutedVideoView_openVideo", (Throwable) e);
            } catch (IllegalArgumentException e2) {
                com.qumeng.overseas.advlib.__remote__.utils.n.f(p.this.u, "Unable to open content: " + p.this.v, e2);
                p.this.y = -1;
                p.this.z = -1;
                p.this.W.onError(p.this.t, 1, 0);
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(p.class, "IllegalArgumentException_MutedVideoView_openVideo", (Throwable) e2);
            } catch (IllegalStateException e3) {
                com.qumeng.overseas.advlib.__remote__.utils.n.f(p.this.u, "Unable to open content: " + p.this.v, e3);
                p.this.y = -1;
                p.this.z = -1;
                p.this.W.onError(p.this.t, 1, 0);
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(p.class, "IllegalStateException_MutedVideoView_openVideo", (Throwable) e3);
            } catch (Exception e4) {
                com.qumeng.overseas.advlib.__remote__.utils.n.f(p.this.u, "Unable to open content: " + p.this.v, e4);
                p.this.y = -1;
                p.this.z = -1;
                p.this.W.onError(p.this.t, 1, 0);
                com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(p.class, "exp_MutedVideoView_openVideo", (Throwable) e4);
            }
        }
    }

    class c implements MediaPlayer.OnPreparedListener {
        c() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            try {
                com.qumeng.overseas.advlib.__remote__.utils.n.a(p.this.u, "onPrepared", new Object[0]);
                p.this.y = 2;
                p pVar = p.this;
                pVar.O = pVar.P = pVar.Q = true;
                if (p.this.J != null) {
                    p.this.J.onPrepared(p.this.t);
                }
                if (p.this.H != null) {
                    p.this.H.setEnabled(true);
                }
                p.this.C = mediaPlayer.getVideoWidth();
                p.this.D = mediaPlayer.getVideoHeight();
                int i = p.this.N;
                if (i != 0) {
                    p.this.seekTo(i);
                }
                if (p.this.C == 0 || p.this.D == 0) {
                    if (p.this.z == 3) {
                        p.this.start();
                        return;
                    }
                    return;
                }
                SurfaceHolder holder = p.this.getHolder();
                if (holder != null && (p.this.C != holder.getSurfaceFrame().width() || p.this.D != holder.getSurfaceFrame().height())) {
                    p.this.e();
                }
                if (p.this.F == p.this.C && p.this.G == p.this.D) {
                    if (p.this.z == 3) {
                        p.this.start();
                        if (p.this.H != null) {
                            p.this.H.show();
                            return;
                        }
                        return;
                    }
                    if (p.this.isPlaying()) {
                        return;
                    }
                    if ((i != 0 || p.this.getCurrentPosition() > 0) && p.this.H != null) {
                        p.this.H.show(0);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SurfaceHolder holder = p.this.getHolder();
            if (holder != null) {
                holder.setFixedSize(p.this.C, p.this.D);
            }
        }
    }

    class e implements MediaPlayer.OnCompletionListener {
        e() {
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a(p.this.u, "onCompletion", new Object[0]);
            p.this.y = 5;
            p.this.z = 5;
            if (p.this.H != null) {
                p.this.H.hide();
            }
            if (p.this.I != null) {
                p.this.I.onCompletion(p.this.t);
            }
        }
    }

    class f implements MediaPlayer.OnInfoListener {

        class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            int f13122a = 0;
            final /* synthetic */ String b;

            a(String str) {
                this.b = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean e;
                try {
                    if (p.this.c() && p.this.t != null) {
                        this.f13122a++;
                        if (this.b != null) {
                            try {
                                e = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.c.b().e(this.b);
                            } catch (Throwable unused) {
                            }
                            if (!e && this.f13122a < 6) {
                                com.qumeng.overseas.advlib.__remote__.utils.j.c().postDelayed(this, 500L);
                            }
                            int currentPosition = p.this.t.getCurrentPosition();
                            com.qumeng.overseas.advlib.__remote__.utils.n.a("VCacheProxy", "[Player] pos: " + currentPosition, new Object[0]);
                            p.this.t.seekTo(currentPosition, 3);
                        }
                        e = false;
                        if (!e) {
                            com.qumeng.overseas.advlib.__remote__.utils.j.c().postDelayed(this, 500L);
                        }
                        int currentPosition2 = p.this.t.getCurrentPosition();
                        com.qumeng.overseas.advlib.__remote__.utils.n.a("VCacheProxy", "[Player] pos: " + currentPosition2, new Object[0]);
                        p.this.t.seekTo(currentPosition2, 3);
                    }
                } catch (Throwable unused2) {
                }
            }
        }

        f() {
        }

        @Override // android.media.MediaPlayer.OnInfoListener
        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            try {
                if (i == 701) {
                    if (p.this.v != null && "127.0.0.1".equals(p.this.v.getHost())) {
                        if (p.this.S != null) {
                            com.qumeng.overseas.advlib.__remote__.utils.j.c().removeCallbacks(p.this.S);
                        }
                        p.this.S = new a(p.this.w != null ? p.this.w.toString() : null);
                        com.qumeng.overseas.advlib.__remote__.utils.j.c().postDelayed(p.this.S, 500L);
                    }
                } else if (i == 702 && p.this.S != null) {
                    com.qumeng.overseas.advlib.__remote__.utils.j.c().removeCallbacks(p.this.S);
                    p.this.S = null;
                }
            } catch (Throwable unused) {
            }
            if (p.this.M == null) {
                return true;
            }
            p.this.M.onInfo(mediaPlayer, i, i2);
            return true;
        }
    }

    class g implements MediaPlayer.OnErrorListener {
        g() {
        }

        @Override // android.media.MediaPlayer.OnErrorListener
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            com.qumeng.overseas.advlib.__remote__.utils.n.a(p.this.u, "Error: " + i + "," + i2, new Object[0]);
            try {
                if (p.this.w != null) {
                    if ("127.0.0.1".equals(p.this.v != null ? p.this.v.getHost() : null)) {
                        Uri uri = p.this.w;
                        p.this.w = null;
                        p.this.v = uri;
                        p.this.y = 0;
                        p.this.d();
                        return true;
                    }
                }
            } catch (Throwable unused) {
            }
            p.this.y = -1;
            p.this.z = -1;
            if (p.this.H != null) {
                p.this.H.hide();
            }
            if (p.this.L != null) {
                p.this.L.onError(p.this.t, i, i2);
            }
            return true;
        }
    }

    class h implements MediaPlayer.OnBufferingUpdateListener {
        h() {
        }

        @Override // android.media.MediaPlayer.OnBufferingUpdateListener
        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            p.this.K = i;
            com.qumeng.overseas.advlib.__remote__.utils.n.a(p.this.u, "onBufferingUpdate percent:" + i, new Object[0]);
        }
    }

    class i implements SurfaceHolder.Callback {
        i() {
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            p.this.F = i2;
            p.this.G = i3;
            boolean z = p.this.z == 3;
            boolean z2 = p.this.C == i2 && p.this.D == i3;
            p pVar = p.this;
            if (pVar.t != null && z && z2) {
                if (pVar.N != 0) {
                    p pVar2 = p.this;
                    pVar2.seekTo(pVar2.N);
                }
                p.this.start();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            p.this.A = surfaceHolder;
            p.this.d();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            p.this.A = null;
            if (p.this.H != null) {
                p.this.H.hide();
            }
            if (p.this.y != 1) {
                p.this.h();
            }
        }
    }

    class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MediaPlayer mediaPlayer = p.this.t;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    p.this.t.release();
                    p.this.t = null;
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static class k implements MediaPlayer.OnPreparedListener {
        WeakReference<com.qumeng.overseas.advlib.__remote__.framework.videoplayer.f> t;

        public k(com.qumeng.overseas.advlib.__remote__.framework.videoplayer.f fVar) {
            this.t = new WeakReference<>(fVar);
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            WeakReference<com.qumeng.overseas.advlib.__remote__.framework.videoplayer.f> weakReference = this.t;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.t.get().k();
        }
    }

    public p(Context context) {
        super(context);
        this.t = null;
        this.u = "VideoView";
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.E = new a();
        this.R = 1;
        this.T = new c();
        this.U = new e();
        this.V = new f();
        this.W = new g();
        this.a0 = new h();
        this.b0 = new i();
        this.c0 = new j();
        this.d0 = new b();
        b();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
        return this.O;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
        return this.P;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
        return this.Q;
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
        if (this.B == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.B = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.B;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
        if (this.t != null) {
            return this.K;
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
        if (c()) {
            return this.t.getCurrentPosition();
        }
        return 0;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
        MediaPlayer mediaPlayer;
        if (!c() || (mediaPlayer = this.t) == null) {
            return -1;
        }
        return mediaPlayer.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
        try {
            if (this.t == null || !c()) {
                return false;
            }
            return this.t.isPlaying();
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.c.b().c();
        } catch (Throwable unused) {
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(p.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(p.class.getName());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        MediaPlayer mediaPlayer;
        boolean z = (i2 == 4 || i2 == 24 || i2 == 25 || i2 == 164 || i2 == 82 || i2 == 5 || i2 == 6) ? false : true;
        if (c() && z && this.H != null && (mediaPlayer = this.t) != null) {
            if (i2 == 79 || i2 == 85) {
                if (mediaPlayer.isPlaying()) {
                    pause();
                    this.H.show();
                } else {
                    start();
                    this.H.hide();
                }
                return true;
            }
            if (i2 == 126) {
                if (!mediaPlayer.isPlaying()) {
                    start();
                    this.H.hide();
                }
                return true;
            }
            if (i2 == 86 || i2 == 127) {
                if (mediaPlayer.isPlaying()) {
                    pause();
                    this.H.show();
                }
                return true;
            }
            i();
        }
        return super.onKeyDown(i2, keyEvent);
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r1 > r6) goto L26;
     */
    @Override // android.view.SurfaceView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.C
            int r0 = android.view.View.getDefaultSize(r0, r6)
            int r1 = r5.D
            int r1 = android.view.View.getDefaultSize(r1, r7)
            int r2 = r5.C
            if (r2 <= 0) goto L75
            int r2 = r5.D
            if (r2 <= 0) goto L75
            int r0 = android.view.View.MeasureSpec.getMode(r6)
            int r6 = android.view.View.MeasureSpec.getSize(r6)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            int r7 = android.view.View.MeasureSpec.getSize(r7)
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L3c
            if (r1 != r2) goto L3c
            int r0 = r5.C
            int r1 = r0 * r7
            int r2 = r5.D
            int r3 = r6 * r2
            if (r1 >= r3) goto L37
            int r0 = r1 / r2
            goto L5d
        L37:
            if (r1 <= r3) goto L5a
            int r1 = r3 / r0
            goto L4c
        L3c:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L4e
            int r0 = r5.D
            int r0 = r0 * r6
            int r2 = r5.C
            int r0 = r0 / r2
            if (r1 != r3) goto L4b
            if (r0 <= r7) goto L4b
            goto L5a
        L4b:
            r1 = r0
        L4c:
            r0 = r6
            goto L75
        L4e:
            if (r1 != r2) goto L5f
            int r1 = r5.C
            int r1 = r1 * r7
            int r2 = r5.D
            int r1 = r1 / r2
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
        L5a:
            r0 = r6
            goto L5d
        L5c:
            r0 = r1
        L5d:
            r1 = r7
            goto L75
        L5f:
            int r2 = r5.C
            int r4 = r5.D
            if (r1 != r3) goto L6b
            if (r4 <= r7) goto L6b
            int r1 = r7 * r2
            int r1 = r1 / r4
            goto L6d
        L6b:
            r1 = r2
            r7 = r4
        L6d:
            if (r0 != r3) goto L5c
            if (r1 <= r6) goto L5c
            int r4 = r4 * r6
            int r1 = r4 / r2
            goto L4c
        L75:
            r5.setMeasuredDimension(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.ui.elements.p.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!c() || this.H == null) {
            return false;
        }
        i();
        return false;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!c() || this.H == null) {
            return false;
        }
        i();
        return false;
    }

    public void pause() {
        MediaPlayer mediaPlayer;
        if (c() && (mediaPlayer = this.t) != null && mediaPlayer.isPlaying()) {
            this.t.pause();
            this.y = 4;
        }
        this.z = 4;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i2) {
        if (!c()) {
            this.N = i2;
        } else {
            this.t.seekTo(i2, 3);
            this.N = 0;
        }
    }

    public void setMediaController(MediaController mediaController) {
        MediaController mediaController2 = this.H;
        if (mediaController2 != null) {
            mediaController2.hide();
        }
        this.H = mediaController;
        a();
    }

    public void setOnCompletionListener(MediaPlayer.OnCompletionListener onCompletionListener) {
        this.I = onCompletionListener;
    }

    public void setOnErrorListener(MediaPlayer.OnErrorListener onErrorListener) {
        this.L = onErrorListener;
    }

    public void setOnInfoListener(MediaPlayer.OnInfoListener onInfoListener) {
        this.M = onInfoListener;
    }

    public void setOnPreparedListener(MediaPlayer.OnPreparedListener onPreparedListener) {
        this.J = onPreparedListener;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    public void setVideoURI(Uri uri) {
        a(uri, (Map<String, String>) null);
    }

    public void start() {
        MediaPlayer mediaPlayer;
        if (c() && (mediaPlayer = this.t) != null) {
            mediaPlayer.start();
            this.y = 3;
            MediaPlayer mediaPlayer2 = this.t;
            float f2 = this.R;
            mediaPlayer2.setVolume(f2, f2);
        }
        this.z = 3;
    }

    private void i() {
        try {
            MediaController mediaController = this.H;
            if (mediaController != null) {
                if (mediaController.isShowing()) {
                    this.H.hide();
                } else {
                    this.H.show();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_MutedVideoView_toggleMediaControlsVisiblity", e2.getMessage(), e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.v == null || this.A == null) {
            return;
        }
        if (this.t != null) {
            h();
        }
        com.qumeng.overseas.advlib.__remote__.utils.j.c().removeCallbacks(this.d0);
        com.qumeng.overseas.advlib.__remote__.utils.j.c().post(this.d0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        post(new d());
    }

    private void f() {
        MediaPlayer mediaPlayer = this.t;
        if (mediaPlayer != null) {
            this.y = 0;
            try {
                mediaPlayer.reset();
            } catch (Throwable unused) {
            }
        }
    }

    public void g() {
        d();
    }

    public void h() {
        this.y = 0;
        this.z = 0;
        com.qumeng.overseas.advlib.__remote__.utils.j.c().removeCallbacks(this.c0);
        com.qumeng.overseas.advlib.__remote__.utils.j.c().post(this.c0);
        com.qumeng.overseas.advlib.__remote__.utils.j.c().removeCallbacks(this.d0);
        try {
            if (this.S != null) {
                com.qumeng.overseas.advlib.__remote__.utils.j.c().removeCallbacks(this.S);
                this.S = null;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        try {
            MediaPlayer mediaPlayer = this.t;
            if (mediaPlayer == null) {
                return false;
            }
            if (mediaPlayer.getVideoWidth() <= 0 && this.t.getVideoHeight() <= 0) {
                return false;
            }
            int i2 = this.y;
            return (i2 == -1 || i2 == 0 || i2 == 1) ? false : true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private void b() {
        this.C = 0;
        this.D = 0;
        getHolder().addCallback(this.b0);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        this.y = 0;
        this.z = 0;
    }

    public int a(int i2, int i3) {
        return View.getDefaultSize(i2, i3);
    }

    public void a(Uri uri, Map<String, String> map) {
        this.v = uri;
        this.x = map;
        d();
        requestLayout();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        MediaController mediaController;
        if (this.t == null || (mediaController = this.H) == null) {
            return;
        }
        mediaController.setMediaPlayer(this);
        this.H.setAnchorView(getParent() instanceof View ? (View) getParent() : this);
        this.H.setEnabled(c());
    }

    public p(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.t = null;
        this.u = "VideoView";
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.E = new a();
        this.R = 1;
        this.T = new c();
        this.U = new e();
        this.V = new f();
        this.W = new g();
        this.a0 = new h();
        this.b0 = new i();
        this.c0 = new j();
        this.d0 = new b();
        b();
    }

    public p(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.t = null;
        this.u = "VideoView";
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.E = new a();
        this.R = 1;
        this.T = new c();
        this.U = new e();
        this.V = new f();
        this.W = new g();
        this.a0 = new h();
        this.b0 = new i();
        this.c0 = new j();
        this.d0 = new b();
        b();
    }

    public p(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.t = null;
        this.u = "VideoView";
        this.y = 0;
        this.z = 0;
        this.A = null;
        this.E = new a();
        this.R = 1;
        this.T = new c();
        this.U = new e();
        this.V = new f();
        this.W = new g();
        this.a0 = new h();
        this.b0 = new i();
        this.c0 = new j();
        this.d0 = new b();
        b();
    }
}
