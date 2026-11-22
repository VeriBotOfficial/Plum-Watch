package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fl implements Parcelable {
    public static final Parcelable.Creator<fl> CREATOR = new a();
    private final List<ba> b;
    private final h01 c;

    public static final class a implements Parcelable.Creator<fl> {
        @Override // android.os.Parcelable.Creator
        public final fl createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(ba.CREATOR.createFromParcel(parcel));
            }
            return new fl(arrayList, parcel.readInt() == 0 ? null : h01.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final fl[] newArray(int i) {
            return new fl[i];
        }
    }

    public fl(ArrayList adUnitIdBiddingSettingsList, h01 h01Var) {
        Intrinsics.checkNotNullParameter(adUnitIdBiddingSettingsList, "adUnitIdBiddingSettingsList");
        this.b = adUnitIdBiddingSettingsList;
        this.c = h01Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl)) {
            return false;
        }
        fl flVar = (fl) obj;
        return Intrinsics.areEqual(this.b, flVar.b) && Intrinsics.areEqual(this.c, flVar.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        h01 h01Var = this.c;
        return hashCode + (h01Var == null ? 0 : h01Var.hashCode());
    }

    public final String toString() {
        return "BiddingSettings(adUnitIdBiddingSettingsList=" + this.b + ", mediationPrefetchSettings=" + this.c + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<ba> list = this.b;
        out.writeInt(list.size());
        Iterator<ba> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
        h01 h01Var = this.c;
        if (h01Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            h01Var.writeToParcel(out, i);
        }
    }

    public final List<ba> c() {
        return this.b;
    }

    public final h01 d() {
        return this.c;
    }
}
