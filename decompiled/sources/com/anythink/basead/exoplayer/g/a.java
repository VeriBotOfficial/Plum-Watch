package com.anythink.basead.exoplayer.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes11.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        private static a[] a() {
            return new a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int i) {
            return new a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0141a[] f2489a;

    /* renamed from: com.anythink.basead.exoplayer.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0141a extends Parcelable {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public a(InterfaceC0141a... interfaceC0141aArr) {
        this.f2489a = interfaceC0141aArr;
    }

    public a(List<? extends InterfaceC0141a> list) {
        InterfaceC0141a[] interfaceC0141aArr = new InterfaceC0141a[list.size()];
        this.f2489a = interfaceC0141aArr;
        list.toArray(interfaceC0141aArr);
    }

    a(Parcel parcel) {
        this.f2489a = new InterfaceC0141a[parcel.readInt()];
        int i = 0;
        while (true) {
            InterfaceC0141a[] interfaceC0141aArr = this.f2489a;
            if (i >= interfaceC0141aArr.length) {
                return;
            }
            interfaceC0141aArr[i] = (InterfaceC0141a) parcel.readParcelable(InterfaceC0141a.class.getClassLoader());
            i++;
        }
    }

    public final int a() {
        return this.f2489a.length;
    }

    public final InterfaceC0141a a(int i) {
        return this.f2489a[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f2489a, ((a) obj).f2489a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f2489a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2489a.length);
        for (InterfaceC0141a interfaceC0141a : this.f2489a) {
            parcel.writeParcelable(interfaceC0141a, 0);
        }
    }
}
