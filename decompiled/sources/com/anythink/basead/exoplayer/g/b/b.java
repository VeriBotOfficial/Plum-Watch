package com.anythink.basead.exoplayer.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class b extends h {
    public static final Parcelable.Creator<b> CREATOR = new Parcelable.Creator<b>() { // from class: com.anythink.basead.exoplayer.g.b.b.1
        private static b a(Parcel parcel) {
            return new b(parcel);
        }

        private static b[] a(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ b[] newArray(int i) {
            return new b[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2492a;

    public b(String str, byte[] bArr) {
        super(str);
        this.f2492a = bArr;
    }

    b(Parcel parcel) {
        super(parcel.readString());
        this.f2492a = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            b bVar = (b) obj;
            if (this.g.equals(bVar.g) && Arrays.equals(this.f2492a, bVar.f2492a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + Arrays.hashCode(this.f2492a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.g);
        parcel.writeByteArray(this.f2492a);
    }
}
