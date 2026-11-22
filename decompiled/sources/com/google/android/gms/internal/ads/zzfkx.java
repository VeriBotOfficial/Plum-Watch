package com.google.android.gms.internal.ads;

import com.anythink.core.express.b.a;
import com.google.firebase.ktx.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public enum zzfkx {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED(BuildConfig.VERSION_NAME),
    LOADED("loaded"),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE(a.c),
    AUDIBLE("audible"),
    OTHER("other");

    private final String zzj;

    zzfkx(String str) {
        this.zzj = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzj;
    }
}
