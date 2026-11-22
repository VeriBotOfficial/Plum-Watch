package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class lz0 implements Parcelable {
    public static final Parcelable.Creator<lz0> CREATOR = new a();
    private final String b;
    private final Map<String, String> c;
    private final List<String> d;
    private final List<String> e;
    private final List<String> f;
    private final t4 g;
    private final Map<String, String> h;

    public static final class a implements Parcelable.Creator<lz0> {
        @Override // android.os.Parcelable.Creator
        public final lz0 createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
            for (int i = 0; i != readInt; i++) {
                linkedHashMap2.put(parcel.readString(), parcel.readString());
            }
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> createStringArrayList3 = parcel.createStringArrayList();
            t4 createFromParcel = parcel.readInt() == 0 ? null : t4.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int readInt2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                }
            }
            return new lz0(readString, linkedHashMap2, createStringArrayList, createStringArrayList2, createStringArrayList3, createFromParcel, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final lz0[] newArray(int i) {
            return new lz0[i];
        }
    }

    public lz0(String adapter, Map<String, String> networkData, List<String> list, List<String> list2, List<String> list3, t4 t4Var, Map<String, String> map) {
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        this.b = adapter;
        this.c = networkData;
        this.d = list;
        this.e = list2;
        this.f = list3;
        this.g = t4Var;
        this.h = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lz0)) {
            return false;
        }
        lz0 lz0Var = (lz0) obj;
        return Intrinsics.areEqual(this.b, lz0Var.b) && Intrinsics.areEqual(this.c, lz0Var.c) && Intrinsics.areEqual(this.d, lz0Var.d) && Intrinsics.areEqual(this.e, lz0Var.e) && Intrinsics.areEqual(this.f, lz0Var.f) && Intrinsics.areEqual(this.g, lz0Var.g) && Intrinsics.areEqual(this.h, lz0Var.h);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        List<String> list = this.d;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.e;
        int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.f;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        t4 t4Var = this.g;
        int hashCode5 = (hashCode4 + (t4Var == null ? 0 : t4Var.hashCode())) * 31;
        Map<String, String> map = this.h;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "MediationNetwork(adapter=" + this.b + ", networkData=" + this.c + ", impressionTrackingUrls=" + this.d + ", clickTrackingUrls=" + this.e + ", adResponseTrackingUrls=" + this.f + ", adImpressionData=" + this.g + ", biddingInfo=" + this.h + Separators.RPAREN;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeString(this.b);
        Map<String, String> map = this.c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
        out.writeStringList(this.d);
        out.writeStringList(this.e);
        out.writeStringList(this.f);
        t4 t4Var = this.g;
        if (t4Var == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            t4Var.writeToParcel(out, i);
        }
        Map<String, String> map2 = this.h;
        if (map2 == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        out.writeInt(map2.size());
        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
            out.writeString(entry2.getKey());
            out.writeString(entry2.getValue());
        }
    }

    public final String e() {
        return this.b;
    }

    public final Map<String, String> i() {
        return this.c;
    }

    public final List<String> h() {
        return this.d;
    }

    public final List<String> g() {
        return this.e;
    }

    public final List<String> d() {
        return this.f;
    }

    public final t4 c() {
        return this.g;
    }

    public final Map<String, String> f() {
        return this.h;
    }
}
