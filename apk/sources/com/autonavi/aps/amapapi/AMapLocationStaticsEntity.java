package com.autonavi.aps.amapapi;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class AMapLocationStaticsEntity implements Parcelable {
    public static final String CONTINUE_LOCATE = "conitue";
    public static final Parcelable.Creator<AMapLocationStaticsEntity> CREATOR = new Parcelable.Creator<AMapLocationStaticsEntity>() { // from class: com.autonavi.aps.amapapi.AMapLocationStaticsEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AMapLocationStaticsEntity createFromParcel(Parcel parcel) {
            AMapLocationStaticsEntity aMapLocationStaticsEntity = new AMapLocationStaticsEntity();
            aMapLocationStaticsEntity.setDNSStaus(parcel.readString());
            aMapLocationStaticsEntity.setDominStatus(parcel.readString());
            aMapLocationStaticsEntity.setLocationType(parcel.readString());
            aMapLocationStaticsEntity.setReason(parcel.readString());
            aMapLocationStaticsEntity.setIP(parcel.readString());
            aMapLocationStaticsEntity.setStartTime(parcel.readLong());
            aMapLocationStaticsEntity.setEndTime(parcel.readLong());
            aMapLocationStaticsEntity.setNetStartTime(parcel.readLong());
            aMapLocationStaticsEntity.setNetEndTime(parcel.readLong());
            aMapLocationStaticsEntity.setStackType(parcel.readString());
            return aMapLocationStaticsEntity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AMapLocationStaticsEntity[] newArray(int r1) {
            return new AMapLocationStaticsEntity[r1];
        }
    };
    public static final String FAIL_STATUS = "FAIL";
    public static final String FIRST_LOCATE = "first";
    public static final String IPV4 = "v4";
    public static final String IPV6 = "v6";
    public static final String STATICS_LOCATE = "statics";
    public static final String SUCCESS_STATUS = "SUCCESS";
    private String e;
    private String f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f6662a = 0;
    private long b = 0;
    private long c = 0;
    private long d = 0;
    private String g = FIRST_LOCATE;
    private String h = "";
    private String i = "";
    private String j = null;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getContinueTime() {
        long j = this.b;
        long j2 = this.f6662a;
        if (j <= j2) {
            return 0L;
        }
        return j - j2;
    }

    public String getDNSStaus() {
        return this.e;
    }

    public String getDominStatus() {
        return this.f;
    }

    public long getEndTime() {
        return this.b;
    }

    public String getIP() {
        return this.j;
    }

    public String getLocationType() {
        return this.g;
    }

    public long getNetEndTime() {
        return this.d;
    }

    public long getNetStartTime() {
        return this.c;
    }

    public long getNetUseTime() {
        long j = this.d - this.c;
        if (j <= 0) {
            return 0L;
        }
        return j;
    }

    public String getReason() {
        return this.h;
    }

    public String getStackType() {
        return this.i;
    }

    public long getStartTime() {
        return this.f6662a;
    }

    public void setDNSStaus(String str) {
        this.e = str;
    }

    public void setDominStatus(String str) {
        this.f = str;
    }

    public void setEndTime(long j) {
        this.b = j;
    }

    public void setIP(String str) {
        this.j = str;
    }

    public void setLocationType(String str) {
        this.g = str;
    }

    public void setNetEndTime(long j) {
        this.d = j;
    }

    public void setNetStartTime(long j) {
        this.c = j;
    }

    public void setReason(String str) {
        this.h = str;
    }

    public void setStackType(String str) {
        this.i = str;
    }

    public void setStartTime(long j) {
        this.f6662a = j;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r4) {
        try {
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.g);
            parcel.writeString(this.h);
            parcel.writeString(this.j);
            parcel.writeLong(this.f6662a);
            parcel.writeLong(this.b);
            parcel.writeLong(this.c);
            parcel.writeLong(this.d);
            parcel.writeString(this.i);
        } catch (Throwable unused) {
        }
    }
}
