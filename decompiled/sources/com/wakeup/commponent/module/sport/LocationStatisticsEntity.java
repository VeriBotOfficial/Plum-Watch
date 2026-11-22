package com.wakeup.commponent.module.sport;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes2.dex */
public class LocationStatisticsEntity implements Parcelable {
    public static final Parcelable.Creator<LocationStatisticsEntity> CREATOR = new Parcelable.Creator<LocationStatisticsEntity>() { // from class: com.wakeup.commponent.module.sport.LocationStatisticsEntity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationStatisticsEntity createFromParcel(Parcel parcel) {
            return new LocationStatisticsEntity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public LocationStatisticsEntity[] newArray(int i) {
            return new LocationStatisticsEntity[i];
        }
    };
    private List<LocationEntity> mStatisticsList;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LocationStatisticsEntity(List<LocationEntity> list) {
        this.mStatisticsList = list;
    }

    protected LocationStatisticsEntity(Parcel parcel) {
        this.mStatisticsList = parcel.createTypedArrayList(LocationEntity.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.mStatisticsList);
    }

    public List<LocationEntity> getStatisticsList() {
        return this.mStatisticsList;
    }

    public void setStatisticsList(List<LocationEntity> list) {
        this.mStatisticsList = list;
    }

    public String toString() {
        return this.mStatisticsList.toString();
    }
}
