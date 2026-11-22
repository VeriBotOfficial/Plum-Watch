package com.baidu.ar;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class dd implements Parcelable {
    public static final Parcelable.Creator<dd> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    public String f6883a;
    public float[] b;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public dd[] newArray(int i) {
            return new dd[i];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            dd ddVar = new dd();
            ddVar.a(parcel.readString());
            ddVar.a(parcel.createFloatArray());
            return ddVar;
        }
    }

    public void a(String str) {
        this.f6883a = str;
    }

    public void a(float[] fArr) {
        this.b = fArr;
    }

    public float[] a() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f6883a);
        parcel.writeFloatArray(this.b);
    }
}
