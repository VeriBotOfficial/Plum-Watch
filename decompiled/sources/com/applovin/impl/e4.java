package com.applovin.impl;

import android.view.View;
import com.iab.omid.library.applovin.adsession.FriendlyObstructionPurpose;

/* loaded from: classes12.dex */
public class e4 {

    /* renamed from: a, reason: collision with root package name */
    private final View f6230a;
    private final FriendlyObstructionPurpose b;
    private final String c;

    public e4(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f6230a = view;
        this.b = friendlyObstructionPurpose;
        this.c = str;
    }

    public String a() {
        return this.c;
    }

    public FriendlyObstructionPurpose b() {
        return this.b;
    }

    public View c() {
        return this.f6230a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            e4 e4Var = (e4) obj;
            View view = this.f6230a;
            if (view == null ? e4Var.f6230a != null : !view.equals(e4Var.f6230a)) {
                return false;
            }
            if (this.b != e4Var.b) {
                return false;
            }
            String str = this.c;
            String str2 = e4Var.c;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        View view = this.f6230a;
        int hashCode = (view != null ? view.hashCode() : 0) * 31;
        FriendlyObstructionPurpose friendlyObstructionPurpose = this.b;
        int hashCode2 = (hashCode + (friendlyObstructionPurpose != null ? friendlyObstructionPurpose.hashCode() : 0)) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }
}
