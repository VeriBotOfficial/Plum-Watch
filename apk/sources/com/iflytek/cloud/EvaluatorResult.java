package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class EvaluatorResult implements Parcelable {
    public static final Parcelable.Creator<EvaluatorResult> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f11069a;

    class a implements Parcelable.Creator<EvaluatorResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EvaluatorResult createFromParcel(Parcel parcel) {
            return new EvaluatorResult(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public EvaluatorResult[] newArray(int r1) {
            return new EvaluatorResult[r1];
        }
    }

    /* synthetic */ EvaluatorResult(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getResultString() {
        return this.f11069a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f11069a);
    }

    private EvaluatorResult(Parcel parcel) {
        this.f11069a = "";
        this.f11069a = parcel.readString();
    }

    public EvaluatorResult(String str) {
        this.f11069a = "";
        if (str != null) {
            this.f11069a = str;
        }
    }
}
