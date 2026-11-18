package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RecognizerResult implements Parcelable {
    public static final Parcelable.Creator<RecognizerResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11077a;

    class a implements Parcelable.Creator<RecognizerResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecognizerResult createFromParcel(Parcel parcel) {
            return new RecognizerResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecognizerResult[] newArray(int r1) {
            return new RecognizerResult[r1];
        }
    }

    public RecognizerResult(Parcel parcel) {
        this.f11077a = "";
        this.f11077a = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getResultString() {
        return this.f11077a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f11077a);
    }

    public RecognizerResult(String str) {
        this.f11077a = "";
        if (str != null) {
            this.f11077a = str;
        }
    }
}
