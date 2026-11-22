package com.iflytek.cloud;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes17.dex */
public class WakeuperResult implements Parcelable {
    public static final Parcelable.Creator<WakeuperResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f11096a;
    private byte[] b;

    class a implements Parcelable.Creator<WakeuperResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WakeuperResult createFromParcel(Parcel parcel) {
            return new WakeuperResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WakeuperResult[] newArray(int i) {
            return new WakeuperResult[i];
        }
    }

    public WakeuperResult(String str, byte[] bArr) {
        this(str);
        this.b = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public byte[] getBuffer() {
        return this.b;
    }

    public String getResultString() {
        return this.f11096a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f11096a);
    }

    public WakeuperResult(Parcel parcel) {
        this.f11096a = "";
        this.b = null;
        this.f11096a = parcel.readString();
    }

    public WakeuperResult(String str) {
        this.f11096a = "";
        this.b = null;
        if (str != null) {
            this.f11096a = str;
        }
    }
}
