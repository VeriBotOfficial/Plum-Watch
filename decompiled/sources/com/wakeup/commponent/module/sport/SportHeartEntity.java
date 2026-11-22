package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import com.wakeup.common.Constants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class SportHeartEntity implements Parcelable {
    public static final Parcelable.Creator<SportHeartEntity> CREATOR = new Parcelable.Creator<SportHeartEntity>() { // from class: com.wakeup.commponent.module.sport.SportHeartEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportHeartEntity createFromParcel(Parcel parcel) {
            return new SportHeartEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SportHeartEntity[] newArray(int i) {
            return new SportHeartEntity[i];
        }
    };
    private transient double anchorDistance;
    private int heart;
    private long timeStamp;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public SportHeartEntity(long j, int i) {
        this.timeStamp = j;
        this.heart = i;
    }

    protected SportHeartEntity(Parcel parcel) {
        this.timeStamp = parcel.readLong();
        this.heart = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.timeStamp);
        parcel.writeInt(this.heart);
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public void setTimeStamp(long j) {
        this.timeStamp = j;
    }

    public int getHeart() {
        return this.heart;
    }

    public void setHeart(int i) {
        this.heart = i;
    }

    public void setAnchorDistance(double d) {
        this.anchorDistance = d;
    }

    public double getAnchorDistance() {
        return this.anchorDistance;
    }

    public String toString() {
        return "SportHeartEntity{timeStamp=" + this.timeStamp + ", heart=" + this.heart + AbstractJsonLexerKt.END_OBJ;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(Constants.BundleKey.TIMESTAMP, this.timeStamp);
            jSONObject.put("heart", this.heart);
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }
}
