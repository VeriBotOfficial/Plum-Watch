package com.anythink.basead.k;

import com.iab.omid.library.toponad.adsession.media.InteractionType;
import com.iab.omid.library.toponad.adsession.media.MediaEvents;

/* loaded from: classes11.dex */
public final class d implements com.anythink.basead.j.d {

    /* renamed from: a, reason: collision with root package name */
    MediaEvents f2830a;
    private a b = a.UNKNOWN;

    public d(MediaEvents mediaEvents) {
        this.f2830a = mediaEvents;
    }

    @Override // com.anythink.basead.j.d
    public final void a(float f, float f2) {
        if (this.f2830a == null || a.START == this.b || a.START.ordinal() <= this.b.ordinal()) {
            return;
        }
        this.f2830a.start(f, f2);
        this.b = a.START;
    }

    @Override // com.anythink.basead.j.d
    public final void a() {
        if (this.f2830a == null || a.FIRST == this.b || a.FIRST.ordinal() <= this.b.ordinal()) {
            return;
        }
        this.f2830a.firstQuartile();
        this.b = a.FIRST;
    }

    @Override // com.anythink.basead.j.d
    public final void b() {
        if (this.f2830a == null || a.SECOND == this.b || a.SECOND.ordinal() <= this.b.ordinal()) {
            return;
        }
        this.f2830a.midpoint();
        this.b = a.SECOND;
    }

    @Override // com.anythink.basead.j.d
    public final void c() {
        if (this.f2830a == null || a.THIRD == this.b || a.THIRD.ordinal() <= this.b.ordinal()) {
            return;
        }
        this.f2830a.thirdQuartile();
        this.b = a.THIRD;
    }

    @Override // com.anythink.basead.j.d
    public final void d() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void e() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.pause();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void f() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.resume();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void g() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void h() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void i() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.skipped();
        }
    }

    @Override // com.anythink.basead.j.d
    public final void a(float f) {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.volumeChange(f);
        }
    }

    @Override // com.anythink.basead.j.d
    public final void j() {
        MediaEvents mediaEvents = this.f2830a;
        if (mediaEvents != null) {
            mediaEvents.adUserInteraction(InteractionType.CLICK);
        }
    }

    public enum a {
        UNKNOWN,
        START,
        FIRST,
        SECOND,
        THIRD;

        private static /* synthetic */ a[] a() {
            return new a[]{UNKNOWN, START, FIRST, SECOND, THIRD};
        }
    }
}
