package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.video.playback.model.VideoAdExtensions;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qn2 implements VideoAdExtensions {

    /* renamed from: a, reason: collision with root package name */
    private final List<u70> f16688a;

    public qn2(List<u70> extensions) {
        Intrinsics.checkNotNullParameter(extensions, "extensions");
        this.f16688a = extensions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qn2) && Intrinsics.areEqual(this.f16688a, ((qn2) obj).f16688a);
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAdExtensions
    public final String get(String type) {
        Object obj;
        Intrinsics.checkNotNullParameter(type, "type");
        Iterator<T> it = this.f16688a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((u70) obj).a(), type)) {
                break;
            }
        }
        u70 u70Var = (u70) obj;
        if (u70Var != null) {
            return u70Var.b();
        }
        return null;
    }

    public final int hashCode() {
        return this.f16688a.hashCode();
    }

    public final String toString() {
        return "YandexVideoAdExtensions(extensions=" + this.f16688a + Separators.RPAREN;
    }
}
