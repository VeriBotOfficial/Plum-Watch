package com.mbridge.msdk.video.module.listener.impl;

/* compiled from: ProxyOnNotifyListener.java */
/* loaded from: classes17.dex */
public class i extends f {

    /* renamed from: a, reason: collision with root package name */
    protected com.mbridge.msdk.video.module.listener.a f12515a;

    public i(com.mbridge.msdk.video.module.listener.a aVar) {
        this.f12515a = aVar;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.f, com.mbridge.msdk.video.module.listener.a
    public void a(int i, Object obj) {
        super.a(i, obj);
        com.mbridge.msdk.video.module.listener.a aVar = this.f12515a;
        if (aVar != null) {
            aVar.a(i, obj);
        }
    }
}
