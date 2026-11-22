package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes17.dex */
public class IdentityResult implements Parcelable {
    public static final Parcelable.Creator<IdentityResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f11074a;

    class a implements Parcelable.Creator<IdentityResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IdentityResult createFromParcel(Parcel parcel) {
            return new IdentityResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IdentityResult[] newArray(int i) {
            return new IdentityResult[i];
        }
    }

    /* synthetic */ IdentityResult(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getResultString() {
        return this.f11074a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11074a);
    }

    public IdentityResult(String str) {
        this.f11074a = "";
        if (str != null) {
            this.f11074a = str;
        }
    }

    private IdentityResult(Parcel parcel) {
        this.f11074a = "";
        this.f11074a = parcel.readString();
    }
}
