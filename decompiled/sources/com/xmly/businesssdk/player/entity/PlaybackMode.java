package com.xmly.businesssdk.player.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public enum PlaybackMode implements Parcelable {
    NORMAL(0),
    SHUFFLE(1),
    SINGLE_REPEAT(2),
    LIST_COMPLETE(3),
    REVERSE(4);

    public static final Parcelable.Creator<PlaybackMode> CREATOR = new Parcelable.Creator<PlaybackMode>() { // from class: com.xmly.businesssdk.player.entity.PlaybackMode.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackMode createFromParcel(Parcel parcel) {
            return PlaybackMode.values()[parcel.readInt()];
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackMode[] newArray(int i) {
            return new PlaybackMode[i];
        }
    };
    private final int mValue;

    PlaybackMode(int i) {
        this.mValue = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }
}
