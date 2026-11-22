package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportPaceEntity implements Parcelable {
    public static final Parcelable.Creator<SportPaceEntity> CREATOR = new Parcelable.Creator<SportPaceEntity>() { // from class: com.wakeup.commponent.module.sport.SportPaceEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportPaceEntity createFromParcel(Parcel parcel) {
            return new SportPaceEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportPaceEntity[] newArray(int i) {
            return new SportPaceEntity[i];
        }
    };
    private int distance;
    private int duration;
    private boolean isMile;
    private long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportPaceEntity(long j, int i, int i2) {
        this.isMile = false;
        this.timeStamp = j;
        this.duration = i;
        this.distance = i2;
    }

    public SportPaceEntity(boolean z, long j, int i, int i2) {
        this.isMile = z;
        this.timeStamp = j;
        this.duration = i;
        this.distance = i2;
    }

    protected SportPaceEntity(Parcel parcel) {
        this.isMile = parcel.readByte() != 0;
        this.timeStamp = parcel.readLong();
        this.duration = parcel.readInt();
        this.distance = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isMile ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.timeStamp);
        parcel.writeInt(this.duration);
        parcel.writeInt(this.distance);
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public int getDuration() {
        return this.duration;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public int getDistance() {
        return this.distance;
    }

    public void setDistance(int i) {
        this.distance = i;
    }

    public String toString() {
        return "SportPaceEntity{isMile=" + this.isMile + ", timeStamp=" + this.timeStamp + ", duration=" + this.duration + ", distance=" + this.distance + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean isMile() {
        return this.isMile;
    }

    public void setMile(boolean z) {
        this.isMile = z;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("duration", this.duration);
            jSONObject.put("distance", this.distance);
            jSONObject.put("isMile", this.isMile);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
