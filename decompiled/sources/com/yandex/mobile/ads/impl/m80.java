package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class m80 implements Parcelable {
    public static final Parcelable.Creator<m80> CREATOR = new a();
    private final String b;
    private final long c;

    public static final class a implements Parcelable.Creator<m80> {
        @Override // android.os.Parcelable.Creator
        public final m80 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new m80(parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final m80[] newArray(int i) {
            return new m80[i];
        }
    }

    public m80(String url, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.b = url;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m80)) {
            return false;
        }
        m80 m80Var = (m80) obj;
        return Intrinsics.areEqual(this.b, m80Var.b) && this.c == m80Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "FalseClick(url=" + this.b + ", interval=" + this.c + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.b);
        out.writeLong(this.c);
    }

    public final long c() {
        return this.c;
    }

    public final String d() {
        return this.b;
    }
}
