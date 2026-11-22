package com.yandex.mobile.ads.impl;

import android.view.TextureView;
import com.yandex.mobile.ads.impl.hi1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i70 implements sa1 {

    /* renamed from: a, reason: collision with root package name */
    private final n60 f15785a;
    private final ax0 b;
    private final mf2 c;
    private final ra1 d;
    private final wf2 e;
    private final a f;
    private final z60 g;
    private kb1 h;
    private yc2 i;
    private boolean j;
    private boolean k;

    private final class a implements hi1.b {

        /* renamed from: a, reason: collision with root package name */
        private boolean f15786a;
        private boolean b;
        private boolean c;

        @Override // com.yandex.mobile.ads.impl.hi1.b
        public final void b(m60 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f15786a = false;
            i70.this.g.b();
            i70.this.f15785a.stop();
            i70.this.c.a(error.getMessage());
            yc2 yc2Var = i70.this.i;
            rc2 rc2Var = i70.this.h;
            if (yc2Var == null || rc2Var == null) {
                return;
            }
            i70.this.d.getClass();
            yc2Var.a(rc2Var, ra1.a(error));
        }

        @Override // com.yandex.mobile.ads.impl.hi1.b
        public final void onPlaybackStateChanged(int i) {
            if (i == 2) {
                this.b = true;
                yc2 yc2Var = i70.this.i;
                rc2 rc2Var = i70.this.h;
                if (yc2Var == null || rc2Var == null) {
                    return;
                }
                yc2Var.f(rc2Var);
                return;
            }
            if (i != 3) {
                if (i != 4) {
                    return;
                }
                this.f15786a = false;
                yc2 yc2Var2 = i70.this.i;
                rc2 rc2Var2 = i70.this.h;
                if (yc2Var2 == null || rc2Var2 == null) {
                    return;
                }
                yc2Var2.a(rc2Var2);
                return;
            }
            i70.this.g.b();
            yc2 yc2Var3 = i70.this.i;
            rc2 rc2Var3 = i70.this.h;
            if (yc2Var3 != null && rc2Var3 != null) {
                yc2Var3.d(rc2Var3);
            }
            if (this.b) {
                this.b = false;
                yc2 yc2Var4 = i70.this.i;
                rc2 rc2Var4 = i70.this.h;
                if (yc2Var4 == null || rc2Var4 == null) {
                    return;
                }
                yc2Var4.c(rc2Var4);
            }
        }

        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.hi1.b
        public final void onIsPlayingChanged(boolean z) {
            if (z) {
                if (!this.f15786a) {
                    yc2 yc2Var = i70.this.i;
                    rc2 rc2Var = i70.this.h;
                    if (yc2Var == null || rc2Var == null) {
                        return;
                    }
                    this.f15786a = true;
                    yc2Var.h(rc2Var);
                    return;
                }
                if (this.c) {
                    this.c = false;
                    yc2 yc2Var2 = i70.this.i;
                    rc2 rc2Var2 = i70.this.h;
                    if (yc2Var2 == null || rc2Var2 == null) {
                        return;
                    }
                    yc2Var2.g(rc2Var2);
                    return;
                }
                return;
            }
            if (this.b) {
                return;
            }
            this.c = true;
            yc2 yc2Var3 = i70.this.i;
            rc2 rc2Var3 = i70.this.h;
            if (yc2Var3 == null || rc2Var3 == null) {
                return;
            }
            yc2Var3.b(rc2Var3);
        }
    }

    public i70(n60 exoPlayer, ax0 mediaSourceProvider, mf2 playerEventsReporter, ra1 videoAdPlayerErrorConverter, wf2 videoScaleController) {
        Intrinsics.checkNotNullParameter(exoPlayer, "exoPlayer");
        Intrinsics.checkNotNullParameter(mediaSourceProvider, "mediaSourceProvider");
        Intrinsics.checkNotNullParameter(playerEventsReporter, "playerEventsReporter");
        Intrinsics.checkNotNullParameter(videoAdPlayerErrorConverter, "videoAdPlayerErrorConverter");
        Intrinsics.checkNotNullParameter(videoScaleController, "videoScaleController");
        this.f15785a = exoPlayer;
        this.b = mediaSourceProvider;
        this.c = playerEventsReporter;
        this.d = videoAdPlayerErrorConverter;
        this.e = videoScaleController;
        a aVar = new a();
        this.f = aVar;
        this.g = new z60(aVar);
        exoPlayer.b(aVar);
        exoPlayer.b(videoScaleController);
        e6.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void pauseAd() {
        if (this.j) {
            return;
        }
        this.f15785a.setPlayWhenReady(false);
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void resumeAd() {
        if (this.j || this.k) {
            return;
        }
        this.f15785a.setPlayWhenReady(true);
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void setVolume(float f) {
        if (this.j) {
            return;
        }
        this.f15785a.setVolume(f);
        yc2 yc2Var = this.i;
        kb1 kb1Var = this.h;
        if (yc2Var == null || kb1Var == null) {
            return;
        }
        yc2Var.a(kb1Var, f);
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void a(xc2 error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.j) {
            return;
        }
        this.j = true;
        this.k = false;
        this.g.b();
        this.f15785a.setVideoTextureView(null);
        this.e.a((TextureView) null);
        this.f15785a.a(this.f);
        this.f15785a.a(this.e);
        this.f15785a.release();
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void c() {
        if (!this.j) {
            this.f15785a.setPlayWhenReady(true);
        }
        if (this.k) {
            pauseAd();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void a(kb1 playbackInfo) {
        Intrinsics.checkNotNullParameter(playbackInfo, "playbackInfo");
        this.h = playbackInfo;
        if (this.j) {
            return;
        }
        gm1 a2 = this.b.a(playbackInfo);
        this.f15785a.setPlayWhenReady(false);
        this.f15785a.a(a2);
        this.f15785a.prepare();
        this.g.a();
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final float getVolume() {
        return this.f15785a.getVolume();
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final boolean e() {
        return this.j;
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final long getAdPosition() {
        return this.f15785a.getCurrentPosition();
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final boolean isPlayingAd() {
        return ((rk) this.f15785a).b();
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final long b() {
        return this.f15785a.getDuration();
    }

    @Override // com.yandex.mobile.ads.impl.ic0
    public final void f() {
        this.k = true;
        pauseAd();
    }

    @Override // com.yandex.mobile.ads.impl.ic0
    public final void d() {
        this.k = false;
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void a(yc2 yc2Var) {
        this.i = yc2Var;
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void a(TextureView textureView) {
        if (this.j) {
            return;
        }
        this.e.a(textureView);
        this.f15785a.setVideoTextureView(textureView);
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void a(yf2 yf2Var) {
        if (this.j) {
            return;
        }
        this.e.a(yf2Var);
    }

    @Override // com.yandex.mobile.ads.impl.sa1
    public final void a() {
        if (this.j) {
            return;
        }
        yc2 yc2Var = this.i;
        kb1 kb1Var = this.h;
        if (yc2Var != null && kb1Var != null) {
            yc2Var.e(kb1Var);
        }
        this.j = true;
        this.k = false;
        this.g.b();
        this.f15785a.setVideoTextureView(null);
        this.e.a((TextureView) null);
        this.f15785a.a(this.f);
        this.f15785a.a(this.e);
        this.f15785a.release();
    }
}
