package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class LocationEntity implements Parcelable {
    public static final Parcelable.Creator<LocationEntity> CREATOR = new Parcelable.Creator<LocationEntity>() { // from class: com.wakeup.commponent.module.sport.LocationEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationEntity createFromParcel(Parcel parcel) {
            return new LocationEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationEntity[] newArray(int i) {
            return new LocationEntity[i];
        }
    };
    private float accuracy;
    private double altitude;
    private boolean isKM;
    private boolean isMile;
    private double latitude;
    private double longitude;
    private float speed;
    private long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocationEntity() {
        this.isKM = false;
        this.isMile = false;
    }

    public LocationEntity(double d, double d2, long j, float f, double d3, float f2) {
        this.isKM = false;
        this.isMile = false;
        this.latitude = d;
        this.longitude = d2;
        this.speed = f;
        this.timeStamp = j;
        this.altitude = d3;
        this.accuracy = f2;
    }

    protected LocationEntity(Parcel parcel) {
        this.isKM = false;
        this.isMile = false;
        this.latitude = parcel.readDouble();
        this.longitude = parcel.readDouble();
        this.timeStamp = parcel.readLong();
        this.speed = parcel.readFloat();
        this.altitude = parcel.readDouble();
        this.accuracy = parcel.readFloat();
        this.isKM = parcel.readByte() != 0;
        this.isMile = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.latitude);
        parcel.writeDouble(this.longitude);
        parcel.writeLong(this.timeStamp);
        parcel.writeFloat(this.speed);
        parcel.writeDouble(this.altitude);
        parcel.writeFloat(this.accuracy);
        parcel.writeByte(this.isKM ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isMile ? (byte) 1 : (byte) 0);
    }

    public double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public float getSpeed() {
        return this.speed;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public void setAltitude(double d) {
        this.altitude = d;
    }

    public float getAccuracy() {
        return this.accuracy;
    }

    public void setAccuracy(float f) {
        this.accuracy = f;
    }

    public boolean isKM() {
        return this.isKM;
    }

    public void setKM(boolean z) {
        this.isKM = z;
    }

    public boolean isMile() {
        return this.isMile;
    }

    public void setMile(boolean z) {
        this.isMile = z;
    }

    public String toString() {
        return "LocationEntity{latitude=" + this.latitude + ", longitude=" + this.longitude + ", timeStamp=" + this.timeStamp + ", speed=" + this.speed + ", altitude=" + this.altitude + ", accuracy=" + this.accuracy + ", isKM=" + this.isKM + ", isMile=" + this.isMile + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("latitude", this.latitude);
            jSONObject.put("longitude", this.longitude);
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("speed", this.speed);
            jSONObject.put("altitude", this.altitude);
            jSONObject.put(Const.JSON_KEY_ACCURACY, this.accuracy);
            jSONObject.put("isKM", this.isKM);
            jSONObject.put("isMile", this.isMile);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
