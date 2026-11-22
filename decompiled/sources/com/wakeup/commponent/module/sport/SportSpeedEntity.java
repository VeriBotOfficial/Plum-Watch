package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportSpeedEntity implements Parcelable {
    public static final Parcelable.Creator<SportSpeedEntity> CREATOR = new Parcelable.Creator<SportSpeedEntity>() { // from class: com.wakeup.commponent.module.sport.SportSpeedEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportSpeedEntity createFromParcel(Parcel parcel) {
            return new SportSpeedEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportSpeedEntity[] newArray(int i) {
            return new SportSpeedEntity[i];
        }
    };
    private transient double anchorDistance;
    private int distance;
    private int duration;
    private long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportSpeedEntity(long j, int i, int i2) {
        this.timeStamp = j;
        this.duration = i;
        this.distance = i2;
    }

    protected SportSpeedEntity(Parcel parcel) {
        this.timeStamp = parcel.readLong();
        this.duration = parcel.readInt();
        this.distance = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
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

    public void setAnchorDistance(double d) {
        this.anchorDistance = d;
    }

    public double getAnchorDistance() {
        return this.anchorDistance;
    }

    public String toString() {
        return "SportSpeedEntity{timeStamp=" + this.timeStamp + ", duration=" + this.duration + ", distance=" + this.distance + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("duration", this.duration);
            jSONObject.put("distance", this.distance);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
