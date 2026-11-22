package com.iab.omid.library.bigosg.b;

import android.view.View;
import com.iab.omid.library.bigosg.adsession.FriendlyObstructionPurpose;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private final com.iab.omid.library.bigosg.e.a f10902a;
    private final String b;
    private final FriendlyObstructionPurpose c;
    private final String d;

    public c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f10902a = new com.iab.omid.library.bigosg.e.a(view);
        this.b = view.getClass().getCanonicalName();
        this.c = friendlyObstructionPurpose;
        this.d = str;
    }

    public com.iab.omid.library.bigosg.e.a a() {
        return this.f10902a;
    }

    public String b() {
        return this.b;
    }

    public FriendlyObstructionPurpose c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }
}
