package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class hz0 implements Parcelable {
    public static final Parcelable.Creator<hz0> CREATOR = new a();
    private final List<lz0> b;
    private Map<String, String> c;

    public static final class a implements Parcelable.Creator<hz0> {
        @Override // android.os.Parcelable.Creator
        public final hz0 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(lz0.CREATOR.createFromParcel(parcel));
            }
            int readInt2 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
            for (int i2 = 0; i2 != readInt2; i2++) {
                linkedHashMap.put(parcel.readString(), parcel.readString());
            }
            return new hz0(arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final hz0[] newArray(int i) {
            return new hz0[i];
        }
    }

    public hz0(ArrayList mediationNetworks, Map passbackParameters) {
        Intrinsics.checkNotNullParameter(mediationNetworks, "mediationNetworks");
        Intrinsics.checkNotNullParameter(passbackParameters, "passbackParameters");
        this.b = mediationNetworks;
        this.c = passbackParameters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel out, int i) {
        Intrinsics.checkNotNullParameter(out, "out");
        List<lz0> list = this.b;
        out.writeInt(list.size());
        Iterator<lz0> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(out, i);
        }
        Map<String, String> map = this.c;
        out.writeInt(map.size());
        for (Map.Entry<String, String> entry : map.entrySet()) {
            out.writeString(entry.getKey());
            out.writeString(entry.getValue());
        }
    }

    public final List<lz0> c() {
        return this.b;
    }

    public final Map<String, String> d() {
        return this.c;
    }
}
