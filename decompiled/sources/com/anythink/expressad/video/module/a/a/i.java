package com.anythink.expressad.video.module.a.a;

/* loaded from: classes12.dex */
public class i extends f {
    protected com.anythink.expressad.video.module.a.a X;

    public i(com.anythink.expressad.video.module.a.a aVar) {
        this.X = aVar;
    }

    @Override // com.anythink.expressad.video.module.a.a.f, com.anythink.expressad.video.module.a.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.anythink.expressad.video.module.a.a aVar = this.X;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
