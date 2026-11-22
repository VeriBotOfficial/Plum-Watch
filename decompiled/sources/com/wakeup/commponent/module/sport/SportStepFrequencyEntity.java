package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportStepFrequencyEntity implements Parcelable {
    public static final Parcelable.Creator<SportStepFrequencyEntity> CREATOR = new Parcelable.Creator<SportStepFrequencyEntity>() { // from class: com.wakeup.commponent.module.sport.SportStepFrequencyEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportStepFrequencyEntity createFromParcel(Parcel parcel) {
            return new SportStepFrequencyEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportStepFrequencyEntity[] newArray(int i) {
            return new SportStepFrequencyEntity[i];
        }
    };
    private transient double anchorDistance;
    private int stepFrequency;
    private long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportStepFrequencyEntity(long j, int i) {
        this.timeStamp = j;
        this.stepFrequency = i;
    }

    protected SportStepFrequencyEntity(Parcel parcel) {
        this.timeStamp = parcel.readLong();
        this.stepFrequency = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timeStamp);
        parcel.writeInt(this.stepFrequency);
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public int getStepFrequency() {
        return this.stepFrequency;
    }

    public void setStepFrequency(int i) {
        this.stepFrequency = i;
    }

    public void setAnchorDistance(double d) {
        this.anchorDistance = d;
    }

    public double getAnchorDistance() {
        return this.anchorDistance;
    }

    public String toString() {
        return "SportStepFrequencyEntity{timeStamp=" + this.timeStamp + ", stepFrequency=" + this.stepFrequency + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("stepFrequency", this.stepFrequency);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
