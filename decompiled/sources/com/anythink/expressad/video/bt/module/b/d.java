package com.anythink.expressad.video.bt.module.b;

/* loaded from: classes12.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f5219a = "H5ShowRewardListener";
    private com.anythink.expressad.video.bt.module.a.b d;
    private String e;

    public d(com.anythink.expressad.video.bt.module.a.b bVar, String str) {
        this.d = bVar;
        this.e = str;
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a() {
        com.anythink.expressad.video.bt.module.a.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.e);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(boolean z, com.anythink.expressad.videocommon.c.c cVar) {
        com.anythink.expressad.video.bt.module.a.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.e, z, cVar);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(String str) {
        com.anythink.expressad.video.bt.module.a.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.e, str);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void a(com.anythink.expressad.foundation.d.d dVar) {
        com.anythink.expressad.video.bt.module.a.b bVar = this.d;
        if (bVar != null) {
            bVar.a(this.e, dVar);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void b() {
        com.anythink.expressad.video.bt.module.a.b bVar = this.d;
        if (bVar != null) {
            bVar.b(this.e);
        }
    }

    @Override // com.anythink.expressad.video.bt.module.b.c, com.anythink.expressad.video.bt.module.b.h
    public final void c() {
        com.anythink.expressad.video.bt.module.a.b bVar = this.d;
        if (bVar != null) {
            bVar.c(this.e);
        }
    }
}
