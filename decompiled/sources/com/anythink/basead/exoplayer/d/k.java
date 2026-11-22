package com.anythink.basead.exoplayer.d;

import android.media.MediaCrypto;

/* loaded from: classes11.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    private final MediaCrypto f2436a;
    private final boolean b;

    private k(MediaCrypto mediaCrypto) {
        this(mediaCrypto, false);
    }

    public k(MediaCrypto mediaCrypto, boolean z) {
        this.f2436a = (MediaCrypto) com.anythink.basead.exoplayer.k.a.a(mediaCrypto);
        this.b = z;
    }

    public final MediaCrypto a() {
        return this.f2436a;
    }

    @Override // com.anythink.basead.exoplayer.d.i
    public final boolean a(String str) {
        return !this.b && this.f2436a.requiresSecureDecoderComponent(str);
    }
}
