package com.github.aakira.expandablelayout;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes14.dex */
public class ExpandableSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<ExpandableSavedState> CREATOR = new Parcelable.Creator<ExpandableSavedState>() { // from class: com.github.aakira.expandablelayout.ExpandableSavedState.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ExpandableSavedState createFromParcel(Parcel parcel) {
            return new ExpandableSavedState(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ExpandableSavedState[] newArray(int i) {
            return new ExpandableSavedState[i];
        }
    };
    private int size;
    private float weight;

    ExpandableSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private ExpandableSavedState(Parcel parcel) {
        super(parcel);
        this.size = parcel.readInt();
        this.weight = parcel.readFloat();
    }

    public int getSize() {
        return this.size;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float f) {
        this.weight = f;
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.size);
        parcel.writeFloat(this.weight);
    }
}
