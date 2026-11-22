package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class na2 implements Parcelable {
    public static final Parcelable.Creator<na2> CREATOR = new a();
    private final b b;
    private final float c;

    public static final class a implements Parcelable.Creator<na2> {
        @Override // android.os.Parcelable.Creator
        public final na2 createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "source");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new na2(parcel.readInt() == -1 ? null : b.values()[parcel.readInt()], parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final na2[] newArray(int i) {
            return new na2[i];
        }

        a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        public static final b b;
        public static final b c;
        public static final b d;
        private static final /* synthetic */ b[] e;

        static {
            b bVar = new b(0, "MILLISECONDS");
            b = bVar;
            b bVar2 = new b(1, "PERCENTS");
            c = bVar2;
            b bVar3 = new b(2, "POSITION");
            d = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            e = bVarArr;
            EnumEntriesKt.enumEntries(bVarArr);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) e.clone();
        }

        private b(int i, String str) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        b bVar = this.b;
        dest.writeInt(bVar != null ? bVar.ordinal() : -1);
        dest.writeFloat(this.c);
    }

    public na2(b bVar, float f) {
        this.b = bVar;
        this.c = f;
    }

    public final b c() {
        return this.b;
    }

    public final float d() {
        return this.c;
    }
}
