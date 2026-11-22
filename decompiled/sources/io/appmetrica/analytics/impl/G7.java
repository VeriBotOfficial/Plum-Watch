package io.appmetrica.analytics.impl;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class G7 {

    /* renamed from: a, reason: collision with root package name */
    public final Pa f17866a;
    public String b = "";

    public G7(Pa pa) {
        this.f17866a = pa;
    }

    public final void a(String str, boolean z) {
        if (str != null) {
            if ((str.length() > 0 ? str : null) == null || Intrinsics.areEqual(this.b, str)) {
                return;
            }
            this.b = str;
            this.f17866a.a(str, z);
        }
    }
}
