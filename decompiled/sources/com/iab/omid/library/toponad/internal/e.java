package com.iab.omid.library.toponad.internal;

import android.view.View;
import com.iab.omid.library.toponad.adsession.FriendlyObstructionPurpose;

/* loaded from: classes17.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.toponad.weakreference.a f11007a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public e(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f11007a = new com.iab.omid.library.toponad.weakreference.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public String a() {
        return this.d;
    }

    public FriendlyObstructionPurpose b() {
        return this.c;
    }

    public com.iab.omid.library.toponad.weakreference.a c() {
        return this.f11007a;
    }

    public String d() {
        return this.b;
    }
}
