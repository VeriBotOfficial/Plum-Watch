package com.anythink.basead.exoplayer.g;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new Parcelable.Creator<a>() { // from class: com.anythink.basead.exoplayer.g.a.1
        private static a a(Parcel parcel) {
            return new a(parcel);
        }

        private static a[] a() {
            return new a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ a[] newArray(int r1) {
            return new a[0];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0228a[] f2489a;

    /* JADX INFO: renamed from: com.anythink.basead.exoplayer.g.a$a, reason: collision with other inner class name */
    public interface InterfaceC0228a extends Parcelable {
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public a(InterfaceC0228a... interfaceC0228aArr) {
        this.f2489a = interfaceC0228aArr;
    }

    public a(List<? extends InterfaceC0228a> list) {
        InterfaceC0228a[] interfaceC0228aArr = new InterfaceC0228a[list.size()];
        this.f2489a = interfaceC0228aArr;
        list.toArray(interfaceC0228aArr);
    }

    a(Parcel parcel) {
        this.f2489a = new InterfaceC0228a[parcel.readInt()];
        int r0 = 0;
        while (true) {
            InterfaceC0228a[] interfaceC0228aArr = this.f2489a;
            if (r0 >= interfaceC0228aArr.length) {
                return;
            }
            interfaceC0228aArr[r0] = (InterfaceC0228a) parcel.readParcelable(InterfaceC0228a.class.getClassLoader());
            r0++;
        }
    }

    public final int a() {
        return this.f2489a.length;
    }

    public final InterfaceC0228a a(int r2) {
        return this.f2489a[r2];
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
    public final void writeToParcel(Parcel parcel, int r6) {
        parcel.writeInt(this.f2489a.length);
        for (InterfaceC0228a interfaceC0228a : this.f2489a) {
            parcel.writeParcelable(interfaceC0228a, 0);
        }
    }
}
