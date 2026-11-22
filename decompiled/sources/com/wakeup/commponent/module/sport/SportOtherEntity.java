package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportOtherEntity implements Parcelable {
    public static final Parcelable.Creator<SportOtherEntity> CREATOR = new Parcelable.Creator<SportOtherEntity>() { // from class: com.wakeup.commponent.module.sport.SportOtherEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportOtherEntity createFromParcel(Parcel parcel) {
            return new SportOtherEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportOtherEntity[] newArray(int i) {
            return new SportOtherEntity[i];
        }
    };
    private double averageAltitude;
    private int averageCadence;
    private int averageHeartRate;
    private int averageKmPace;
    private int averageMilePace;
    private int averagePace;
    private float averageSpeed;
    private String bindDeviceMac;
    private double climb;
    private double decline;
    private float fastSpeed;
    private double highAltitude;
    private int highHeartRate;
    private double lowAltitude;
    private int lowHeartRate;
    private String name;
    private int rapidKmPace;
    private int rapidMilePace;
    private int rapidPace;
    private int repeated;
    private int slowKmPace;
    private int slowMilePace;
    private int slowPace;
    private float slowSpeed;
    private int sourceType;
    private SportTemporaryData sportTemporaryData;
    private long unBindDeviceTime;
    private int unusually;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportOtherEntity() {
        this.sourceType = 1;
    }

    protected SportOtherEntity(Parcel parcel) {
        this.sourceType = 1;
        this.climb = parcel.readDouble();
        this.decline = parcel.readDouble();
        this.name = parcel.readString();
        this.unusually = parcel.readInt();
        this.repeated = parcel.readInt();
        this.fastSpeed = parcel.readFloat();
        this.averageSpeed = parcel.readFloat();
        this.slowSpeed = parcel.readFloat();
        this.highHeartRate = parcel.readInt();
        this.averageHeartRate = parcel.readInt();
        this.lowHeartRate = parcel.readInt();
        this.highAltitude = parcel.readDouble();
        this.averageAltitude = parcel.readDouble();
        this.lowAltitude = parcel.readDouble();
        this.slowKmPace = parcel.readInt();
        this.averageKmPace = parcel.readInt();
        this.rapidKmPace = parcel.readInt();
        this.slowMilePace = parcel.readInt();
        this.rapidMilePace = parcel.readInt();
        this.averageMilePace = parcel.readInt();
        this.slowPace = parcel.readInt();
        this.averagePace = parcel.readInt();
        this.rapidPace = parcel.readInt();
        this.sourceType = parcel.readInt();
        this.averageCadence = parcel.readInt();
        this.sportTemporaryData = (SportTemporaryData) parcel.readParcelable(SportTemporaryData.class.getClassLoader());
        this.bindDeviceMac = parcel.readString();
        this.unBindDeviceTime = parcel.readLong();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.climb);
        parcel.writeDouble(this.decline);
        parcel.writeString(this.name);
        parcel.writeInt(this.unusually);
        parcel.writeInt(this.repeated);
        parcel.writeFloat(this.fastSpeed);
        parcel.writeFloat(this.averageSpeed);
        parcel.writeFloat(this.slowSpeed);
        parcel.writeInt(this.highHeartRate);
        parcel.writeInt(this.averageHeartRate);
        parcel.writeInt(this.lowHeartRate);
        parcel.writeDouble(this.highAltitude);
        parcel.writeDouble(this.averageAltitude);
        parcel.writeDouble(this.lowAltitude);
        parcel.writeInt(this.slowKmPace);
        parcel.writeInt(this.averageKmPace);
        parcel.writeInt(this.rapidKmPace);
        parcel.writeInt(this.slowMilePace);
        parcel.writeInt(this.rapidMilePace);
        parcel.writeInt(this.averageMilePace);
        parcel.writeInt(this.slowPace);
        parcel.writeInt(this.averagePace);
        parcel.writeInt(this.rapidPace);
        parcel.writeInt(this.sourceType);
        parcel.writeInt(this.averageCadence);
        parcel.writeParcelable(this.sportTemporaryData, i);
        parcel.writeString(this.bindDeviceMac);
        parcel.writeLong(this.unBindDeviceTime);
    }

    public double getClimb() {
        return this.climb;
    }

    public void setClimb(double d) {
        this.climb = d;
    }

    public double getDecline() {
        return this.decline;
    }

    public void setDecline(double d) {
        this.decline = d;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public int getUnusually() {
        return this.unusually;
    }

    public void setUnusually(int i) {
        this.unusually = i;
    }

    public float getFastSpeed() {
        return this.fastSpeed;
    }

    public void setFastSpeed(float f) {
        this.fastSpeed = f;
    }

    public float getAverageSpeed() {
        return this.averageSpeed;
    }

    public void setAverageSpeed(float f) {
        this.averageSpeed = f;
    }

    public float getSlowSpeed() {
        return this.slowSpeed;
    }

    public void setSlowSpeed(float f) {
        this.slowSpeed = f;
    }

    public int getHighHeartRate() {
        return this.highHeartRate;
    }

    public void setHighHeartRate(int i) {
        this.highHeartRate = i;
    }

    public int getAverageHeartRate() {
        return this.averageHeartRate;
    }

    public void setAverageHeartRate(int i) {
        this.averageHeartRate = i;
    }

    public int getLowHeartRate() {
        return this.lowHeartRate;
    }

    public void setLowHeartRate(int i) {
        this.lowHeartRate = i;
    }

    public double getHighAltitude() {
        return this.highAltitude;
    }

    public void setHighAltitude(double d) {
        this.highAltitude = d;
    }

    public double getAverageAltitude() {
        return this.averageAltitude;
    }

    public void setAverageAltitude(double d) {
        this.averageAltitude = d;
    }

    public double getLowAltitude() {
        return this.lowAltitude;
    }

    public void setLowAltitude(double d) {
        this.lowAltitude = d;
    }

    public int getSlowKmPace() {
        return this.slowKmPace;
    }

    public void setSlowKmPace(int i) {
        this.slowKmPace = i;
    }

    public int getAverageKmPace() {
        return this.averageKmPace;
    }

    public void setAverageKmPace(int i) {
        this.averageKmPace = i;
    }

    public int getRapidKmPace() {
        return this.rapidKmPace;
    }

    public void setRapidKmPace(int i) {
        this.rapidKmPace = i;
    }

    public int getSlowPace() {
        return this.slowPace;
    }

    public void setSlowPace(int i) {
        this.slowPace = i;
    }

    public int getAveragePace() {
        return this.averagePace;
    }

    public void setAveragePace(int i) {
        this.averagePace = i;
    }

    public int getRapidPace() {
        return this.rapidPace;
    }

    public void setRapidPace(int i) {
        this.rapidPace = i;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public int getAverageCadence() {
        return this.averageCadence;
    }

    public void setAverageCadence(int i) {
        this.averageCadence = i;
    }

    public int getRepeated() {
        return this.repeated;
    }

    public void setRepeated(int i) {
        this.repeated = i;
    }

    public SportTemporaryData getSportTemporaryData() {
        return this.sportTemporaryData;
    }

    public void setSportTemporaryData(SportTemporaryData sportTemporaryData) {
        this.sportTemporaryData = sportTemporaryData;
    }

    public int getSlowMilePace() {
        return this.slowMilePace;
    }

    public void setSlowMilePace(int i) {
        this.slowMilePace = i;
    }

    public int getRapidMilePace() {
        return this.rapidMilePace;
    }

    public void setRapidMilePace(int i) {
        this.rapidMilePace = i;
    }

    public int getAverageMilePace() {
        return this.averageMilePace;
    }

    public void setAverageMilePace(int i) {
        this.averageMilePace = i;
    }

    public String getBindDeviceMac() {
        return this.bindDeviceMac;
    }

    public void setBindDeviceMac(String str) {
        this.bindDeviceMac = str;
    }

    public long getUnBindDeviceTime() {
        return this.unBindDeviceTime;
    }

    public void setUnBindDeviceTime(long j) {
        this.unBindDeviceTime = j;
    }

    public String toString() {
        return "SportOtherEntity{climb=" + this.climb + ", decline=" + this.decline + ", name='" + this.name + "', unusually=" + this.unusually + ", repeated=" + this.repeated + ", fastSpeed=" + this.fastSpeed + ", averageSpeed=" + this.averageSpeed + ", slowSpeed=" + this.slowSpeed + ", highHeartRate=" + this.highHeartRate + ", averageHeartRate=" + this.averageHeartRate + ", lowHeartRate=" + this.lowHeartRate + ", highAltitude=" + this.highAltitude + ", averageAltitude=" + this.averageAltitude + ", lowAltitude=" + this.lowAltitude + ", slowKmPace=" + this.slowKmPace + ", averageKmPace=" + this.averageKmPace + ", rapidKmPace=" + this.rapidKmPace + ", slowMilePace=" + this.slowMilePace + ", rapidMilePace=" + this.rapidMilePace + ", averageMilePace=" + this.averageMilePace + ", slowPace=" + this.slowPace + ", averagePace=" + this.averagePace + ", rapidPace=" + this.rapidPace + ", sourceType=" + this.sourceType + ", averageCadence=" + this.averageCadence + ", sportTemporaryData=" + this.sportTemporaryData + ", bindDeviceMac='" + this.bindDeviceMac + "', unBindDeviceTime=" + this.unBindDeviceTime + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("climb", this.climb);
            jSONObject.put("decline", this.decline);
            jSONObject.put("name", this.name);
            jSONObject.put("unusually", this.unusually);
            jSONObject.put("repeated", this.repeated);
            jSONObject.put("fastSpeed", this.fastSpeed);
            jSONObject.put("averageSpeed", this.averageSpeed);
            jSONObject.put("slowSpeed", this.slowSpeed);
            jSONObject.put("highHeartRate", this.highHeartRate);
            jSONObject.put("averageHeartRate", this.averageHeartRate);
            jSONObject.put("lowHeartRate", this.lowHeartRate);
            jSONObject.put("highAltitude", this.highAltitude);
            jSONObject.put("averageAltitude", this.averageAltitude);
            jSONObject.put("lowAltitude", this.lowAltitude);
            jSONObject.put("slowKmPace", this.slowKmPace);
            jSONObject.put("averageKmPace", this.averageKmPace);
            jSONObject.put("rapidKmPace", this.rapidKmPace);
            jSONObject.put("slowMilePace", this.slowMilePace);
            jSONObject.put("averageMilePace", this.averageMilePace);
            jSONObject.put("rapidMilePace", this.rapidMilePace);
            jSONObject.put("slowPace", this.slowPace);
            jSONObject.put("averagePace", this.averagePace);
            jSONObject.put("rapidPace", this.rapidPace);
            jSONObject.put("sourceType", this.sourceType);
            jSONObject.put("averageCadence", this.averageCadence);
            SportTemporaryData sportTemporaryData = this.sportTemporaryData;
            if (sportTemporaryData != null) {
                jSONObject.put("sportTemporaryData", sportTemporaryData.toJson());
            }
            jSONObject.put("bindDeviceMac", this.bindDeviceMac);
            jSONObject.put("unBindDeviceTime", this.unBindDeviceTime);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
