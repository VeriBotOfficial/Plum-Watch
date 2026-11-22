package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.services.route.RouteSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DriveRoutePlanResult extends RoutePlanResult implements Parcelable {
    public static final Parcelable.Creator<DriveRoutePlanResult> CREATOR = new a();
    private List<DrivePlanPath> c;
    private List<TimeInfo> d;
    private RouteSearch.DrivePlanQuery e;

    static class a implements Parcelable.Creator<DriveRoutePlanResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DriveRoutePlanResult createFromParcel(Parcel parcel) {
            return new DriveRoutePlanResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DriveRoutePlanResult[] newArray(int i) {
            return new DriveRoutePlanResult[i];
        }
    }

    public DriveRoutePlanResult(Parcel parcel) {
        super(parcel);
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.c = parcel.createTypedArrayList(DrivePlanPath.CREATOR);
        this.d = parcel.createTypedArrayList(TimeInfo.CREATOR);
        this.e = (RouteSearch.DrivePlanQuery) parcel.readParcelable(RouteSearch.DrivePlanQuery.class.getClassLoader());
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivePlanPath> getPaths() {
        return this.c;
    }

    public List<TimeInfo> getTimeInfos() {
        return this.d;
    }

    public void setDrivePlanQuery(RouteSearch.DrivePlanQuery drivePlanQuery) {
        this.e = drivePlanQuery;
        RouteSearch.FromAndTo fromAndTo = drivePlanQuery.getFromAndTo();
        if (fromAndTo != null) {
            setStartPos(fromAndTo.getFrom());
            setTargetPos(fromAndTo.getTo());
        }
    }

    public void setPaths(List<DrivePlanPath> list) {
        this.c = list;
    }

    public void setTimeInfos(List<TimeInfo> list) {
        this.d = list;
    }

    @Override // com.amap.api.services.route.RoutePlanResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeTypedList(this.c);
        parcel.writeTypedList(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public DriveRoutePlanResult() {
        this.c = new ArrayList();
        this.d = new ArrayList();
    }
}
