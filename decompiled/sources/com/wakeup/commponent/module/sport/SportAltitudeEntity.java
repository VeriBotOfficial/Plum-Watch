package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportAltitudeEntity implements Parcelable {
    public static final Parcelable.Creator<SportAltitudeEntity> CREATOR = new Parcelable.Creator<SportAltitudeEntity>() { // from class: com.wakeup.commponent.module.sport.SportAltitudeEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportAltitudeEntity createFromParcel(Parcel parcel) {
            return new SportAltitudeEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportAltitudeEntity[] newArray(int i) {
            return new SportAltitudeEntity[i];
        }
    };
    private double altitude;
    private long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportAltitudeEntity(long j, double d) {
        this.timeStamp = j;
        this.altitude = d;
    }

    protected SportAltitudeEntity(Parcel parcel) {
        this.timeStamp = parcel.readLong();
        this.altitude = parcel.readDouble();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timeStamp);
        parcel.writeDouble(this.altitude);
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

    public String toString() {
        return "SportAltitudeEntity{timeStamp=" + this.timeStamp + ", altitude=" + this.altitude + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("altitude", this.altitude);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
