package com.iflytek.speech;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class RecognizerResult implements Parcelable {
    public static final Parcelable.Creator<RecognizerResult> CREATOR = new Parcelable.Creator<RecognizerResult>() { // from class: com.iflytek.speech.RecognizerResult.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognizerResult createFromParcel(Parcel parcel) {
            return new RecognizerResult(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public RecognizerResult[] newArray(int r1) {
            return new RecognizerResult[r1];
        }
    };
    private String json;

    public RecognizerResult(Parcel parcel) {
        this.json = "";
        this.json = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getResultString() {
        return this.json;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.json);
    }

    public RecognizerResult(String str) {
        this.json = "";
        if (str != null) {
            this.json = str;
        }
    }
}
