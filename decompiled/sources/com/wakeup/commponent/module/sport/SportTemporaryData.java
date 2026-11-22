package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportTemporaryData implements Parcelable {
    public static final Parcelable.Creator<SportTemporaryData> CREATOR = new Parcelable.Creator<SportTemporaryData>() { // from class: com.wakeup.commponent.module.sport.SportTemporaryData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportTemporaryData createFromParcel(Parcel parcel) {
            return new SportTemporaryData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportTemporaryData[] newArray(int i) {
            return new SportTemporaryData[i];
        }
    };
    private double currentAltitude;
    private int gpsAccuracy;
    private int heart;
    private int kmDistance;
    private int kmDuration;
    private int mileDistance;
    private int mileDuration;
    private int pace;
    private int pauseDuration;
    private long pauseTimeStamp;
    private float speed;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportTemporaryData() {
        this.currentAltitude = 0.0d;
        this.speed = 0.0f;
        this.pace = 0;
        this.gpsAccuracy = -1;
        this.kmDistance = 0;
        this.kmDuration = 0;
        this.mileDistance = 0;
        this.mileDuration = 0;
        this.pauseDuration = 0;
        this.pauseTimeStamp = 0L;
    }

    protected SportTemporaryData(Parcel parcel) {
        this.currentAltitude = 0.0d;
        this.speed = 0.0f;
        this.pace = 0;
        this.gpsAccuracy = -1;
        this.kmDistance = 0;
        this.kmDuration = 0;
        this.mileDistance = 0;
        this.mileDuration = 0;
        this.pauseDuration = 0;
        this.pauseTimeStamp = 0L;
        this.heart = parcel.readInt();
        this.currentAltitude = parcel.readDouble();
        this.speed = parcel.readFloat();
        this.pace = parcel.readInt();
        this.gpsAccuracy = parcel.readInt();
        this.kmDistance = parcel.readInt();
        this.kmDuration = parcel.readInt();
        this.mileDistance = parcel.readInt();
        this.mileDuration = parcel.readInt();
        this.pauseDuration = parcel.readInt();
        this.pauseTimeStamp = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.heart);
        parcel.writeDouble(this.currentAltitude);
        parcel.writeFloat(this.speed);
        parcel.writeInt(this.pace);
        parcel.writeInt(this.gpsAccuracy);
        parcel.writeInt(this.kmDistance);
        parcel.writeInt(this.kmDuration);
        parcel.writeInt(this.mileDistance);
        parcel.writeInt(this.mileDuration);
        parcel.writeInt(this.pauseDuration);
        parcel.writeLong(this.pauseTimeStamp);
    }

    public int getHeart() {
        return this.heart;
    }

    public void setHeart(int i) {
        this.heart = i;
    }

    public double getCurrentAltitude() {
        return this.currentAltitude;
    }

    public void setCurrentAltitude(double d) {
        this.currentAltitude = d;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public int getPace() {
        return this.pace;
    }

    public void setPace(int i) {
        this.pace = i;
    }

    public int getGpsAccuracy() {
        return this.gpsAccuracy;
    }

    public void setGpsAccuracy(int i) {
        this.gpsAccuracy = i;
    }

    public int getKmDistance() {
        return this.kmDistance;
    }

    public void setKmDistance(int i) {
        this.kmDistance = i;
    }

    public int getKmDuration() {
        return this.kmDuration;
    }

    public void setKmDuration(int i) {
        this.kmDuration = i;
    }

    public int getMileDistance() {
        return this.mileDistance;
    }

    public void setMileDistance(int i) {
        this.mileDistance = i;
    }

    public int getMileDuration() {
        return this.mileDuration;
    }

    public void setMileDuration(int i) {
        this.mileDuration = i;
    }

    public int getPauseDuration() {
        return this.pauseDuration;
    }

    public void setPauseDuration(int i) {
        this.pauseDuration = i;
    }

    public long getPauseTimeStamp() {
        return this.pauseTimeStamp;
    }

    public void setPauseTimeStamp(long j) {
        this.pauseTimeStamp = j;
    }

    public String toString() {
        return "SportTemporaryData{heart=" + this.heart + ", currentAltitude=" + this.currentAltitude + ", speed=" + this.speed + ", pace=" + this.pace + ", gpsAccuracy=" + this.gpsAccuracy + ", kmDistance=" + this.kmDistance + ", kmDuration=" + this.kmDuration + ", mileDistance=" + this.mileDistance + ", mileDuration=" + this.mileDuration + ", pauseDuration=" + this.pauseDuration + ", pauseTimeStamp=" + this.pauseTimeStamp + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("heart", this.heart);
            jSONObject.put("currentAltitude", this.currentAltitude);
            jSONObject.put("speed", this.speed);
            jSONObject.put("pace", this.pace);
            jSONObject.put("gpsAccuracy", this.gpsAccuracy);
            jSONObject.put("kmDistance", this.kmDistance);
            jSONObject.put("kmDuration", this.kmDuration);
            jSONObject.put("mileDistance", this.mileDistance);
            jSONObject.put("mileDuration", this.mileDuration);
            jSONObject.put("pauseDuration", this.pauseDuration);
            jSONObject.put("pauseTimeStamp", this.pauseTimeStamp);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
