package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ba implements Parcelable {
    public static final Parcelable.Creator<ba> CREATOR = new a();
    private final String b;
    private final List<lz0> c;
    private final String d;

    public static final class a implements Parcelable.Creator<ba> {
        @Override // android.os.Parcelable.Creator
        public final ba createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(lz0.CREATOR.createFromParcel(parcel));
            }
            return new ba(readString, parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ba[] newArray(int i) {
            return new ba[i];
        }
    }

    public final String c() {
        return this.b;
    }

    public final String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba)) {
            return false;
        }
        ba baVar = (ba) obj;
        return Intrinsics.areEqual(this.b, baVar.b) && Intrinsics.areEqual(this.c, baVar.c) && Intrinsics.areEqual(this.d, baVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + aa.a(this.c, this.b.hashCode() * 31, 31);
    }

    public final String toString() {
        return "AdUnitIdBiddingSettings(adUnitId=" + this.b + ", mediationNetworks=" + this.c + ", rawData=" + this.d + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.b);
        List<lz0> list = this.c;
        out.writeInt(list.size());
        Iterator<lz0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
        out.writeString(this.d);
    }

    public ba(String adUnitId, String rawData, ArrayList mediationNetworks) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(rawData, "rawData");
        this.b = adUnitId;
        this.c = mediationNetworks;
        this.d = rawData;
    }

    public final String e() {
        return this.b;
    }

    public final List<lz0> f() {
        return this.c;
    }
}
