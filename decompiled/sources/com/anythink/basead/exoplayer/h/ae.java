package com.anythink.basead.exoplayer.h;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes11.dex */
public final class ae implements Parcelable {
    public static final Parcelable.Creator<ae> CREATOR = new Parcelable.Creator<ae>() { // from class: com.anythink.basead.exoplayer.h.ae.1
        private static ae a(Parcel parcel) {
            return new ae(parcel);
        }

        private static ae[] a(int i) {
            return new ae[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ae[] newArray(int i) {
            return new ae[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ae createFromParcel(Parcel parcel) {
            return new ae(parcel);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final int f2537a;
    private final com.anythink.basead.exoplayer.m[] b;
    private int c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ae(com.anythink.basead.exoplayer.m... mVarArr) {
        com.anythink.basead.exoplayer.k.a.b(true);
        this.b = mVarArr;
        this.f2537a = 1;
    }

    ae(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f2537a = readInt;
        this.b = new com.anythink.basead.exoplayer.m[readInt];
        for (int i = 0; i < this.f2537a; i++) {
            this.b[i] = (com.anythink.basead.exoplayer.m) parcel.readParcelable(com.anythink.basead.exoplayer.m.class.getClassLoader());
        }
    }

    public final com.anythink.basead.exoplayer.m a(int i) {
        return this.b[i];
    }

    public final int a(com.anythink.basead.exoplayer.m mVar) {
        int i = 0;
        while (true) {
            com.anythink.basead.exoplayer.m[] mVarArr = this.b;
            if (i >= mVarArr.length) {
                return -1;
            }
            if (mVar == mVarArr[i]) {
                return i;
            }
            i++;
        }
    }

    public final int hashCode() {
        if (this.c == 0) {
            this.c = Arrays.hashCode(this.b) + 527;
        }
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ae aeVar = (ae) obj;
            if (this.f2537a == aeVar.f2537a && Arrays.equals(this.b, aeVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2537a);
        for (int i2 = 0; i2 < this.f2537a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }
}
