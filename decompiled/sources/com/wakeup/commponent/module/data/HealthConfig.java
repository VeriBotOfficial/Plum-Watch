package com.wakeup.commponent.module.data;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class HealthConfig implements Parcelable {
    public static final Parcelable.Creator<HealthConfig> CREATOR = new Parcelable.Creator<HealthConfig>() { // from class: com.wakeup.commponent.module.data.HealthConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HealthConfig createFromParcel(Parcel parcel) {
            return new HealthConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public HealthConfig[] newArray(int i) {
            return new HealthConfig[i];
        }
    };
    private long endTime;
    private boolean isDesc;
    private boolean isQueryOss;
    private boolean isStatistics;
    private int limit;
    private int limitDay;
    private String mac;
    private long startTime;
    private int type;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HealthConfig() {
        this.mac = "";
        this.isStatistics = false;
        this.isQueryOss = true;
        this.limit = 0;
        this.limitDay = 0;
    }

    protected HealthConfig(Parcel parcel) {
        this.mac = "";
        this.isStatistics = false;
        this.isQueryOss = true;
        this.limit = 0;
        this.limitDay = 0;
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.type = parcel.readInt();
        this.mac = parcel.readString();
        this.isDesc = parcel.readByte() != 0;
        this.isStatistics = parcel.readByte() != 0;
        this.limit = parcel.readInt();
        this.limitDay = parcel.readInt();
        this.isQueryOss = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(this.type);
        parcel.writeInt(this.limitDay);
        parcel.writeString(this.mac);
        parcel.writeByte(this.isDesc ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isStatistics ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.limit);
        parcel.writeByte(this.isQueryOss ? (byte) 1 : (byte) 0);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }

    public int getType() {
        return this.type;
    }

    public int getLimitDay() {
        return this.limitDay;
    }

    public String getMac() {
        return this.mac;
    }

    public boolean isDesc() {
        return this.isDesc;
    }

    public boolean isStatistics() {
        return this.isStatistics;
    }

    public int getLimit() {
        return this.limit;
    }

    public boolean isQueryOss() {
        return this.isQueryOss;
    }

    public static class Builder {
        private long endTime;
        private long startTime;
        private final int type;
        private String mac = "";
        private boolean isStatistics = false;
        private int limit = 0;
        private int limitDay = 0;
        private boolean isQueryOss = true;
        private boolean isDesc = true;

        public Builder(int i) {
            this.type = i;
        }

        public Builder(int i, long j, long j2) {
            this.startTime = j;
            this.endTime = j2;
            this.type = i;
        }

        public Builder setLimitDay(int i) {
            this.limitDay = i;
            return this;
        }

        public Builder setIsDesc(boolean z) {
            this.isDesc = z;
            return this;
        }

        public Builder setMac(String str) {
            this.mac = str;
            return this;
        }

        public Builder setStartTime(long j) {
            this.startTime = j;
            return this;
        }

        public Builder setEndTime(long j) {
            this.endTime = j;
            return this;
        }

        public Builder setStatistics(boolean z) {
            this.isStatistics = z;
            return this;
        }

        public Builder setLimit(int i) {
            this.limit = i;
            return this;
        }

        public Builder setQueryOss(boolean z) {
            this.isQueryOss = z;
            return this;
        }

        public HealthConfig build() {
            HealthConfig healthConfig = new HealthConfig();
            healthConfig.startTime = this.startTime;
            healthConfig.endTime = this.endTime;
            healthConfig.type = this.type;
            healthConfig.limitDay = this.limitDay;
            healthConfig.mac = this.mac;
            healthConfig.isDesc = this.isDesc;
            healthConfig.isStatistics = this.isStatistics;
            healthConfig.limit = this.limit;
            healthConfig.isQueryOss = this.isQueryOss;
            return healthConfig;
        }
    }
}
