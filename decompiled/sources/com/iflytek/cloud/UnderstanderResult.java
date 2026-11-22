package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes17.dex */
public class UnderstanderResult implements Parcelable {
    public static final Parcelable.Creator<UnderstanderResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f11093a;

    class a implements Parcelable.Creator<UnderstanderResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnderstanderResult createFromParcel(Parcel parcel) {
            return new UnderstanderResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public UnderstanderResult[] newArray(int i) {
            return new UnderstanderResult[i];
        }
    }

    public UnderstanderResult(Parcel parcel) {
        this.f11093a = "";
        this.f11093a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getResultString() {
        return this.f11093a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11093a);
    }

    public UnderstanderResult(String str) {
        this.f11093a = "";
        if (str != null) {
            this.f11093a = str;
        }
    }
}
