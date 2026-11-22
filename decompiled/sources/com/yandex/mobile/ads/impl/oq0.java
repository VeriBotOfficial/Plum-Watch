package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oq0 implements Parcelable {
    public static final Parcelable.Creator<oq0> CREATOR = new a();
    private final String b;
    private final String c;
    private final boolean d;

    public static final class a implements Parcelable.Creator<oq0> {
        @Override // android.os.Parcelable.Creator
        public final oq0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new oq0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final oq0[] newArray(int i) {
            return new oq0[i];
        }
    }

    public oq0(String apiFramework, String url, boolean z) {
        Intrinsics.checkNotNullParameter(apiFramework, "apiFramework");
        Intrinsics.checkNotNullParameter(url, "url");
        this.b = apiFramework;
        this.c = url;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq0)) {
            return false;
        }
        oq0 oq0Var = (oq0) obj;
        return Intrinsics.areEqual(this.b, oq0Var.b) && Intrinsics.areEqual(this.c, oq0Var.c) && this.d == oq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v3.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "JavaScriptResource(apiFramework=" + this.b + ", url=" + this.c + ", browserOptional=" + this.d + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.b);
        out.writeString(this.c);
        out.writeInt(this.d ? 1 : 0);
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }
}
