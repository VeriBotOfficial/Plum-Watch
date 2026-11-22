package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import com.baidu.mapapi.search.core.TaxiInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public final class DrivingRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<DrivingRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<DrivingRouteLine> f8157a;
    private List<TaxiInfo> b;
    private TaxiInfo c;
    private SuggestAddrInfo d;

    static class a implements Parcelable.Creator<DrivingRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrivingRouteResult createFromParcel(Parcel parcel) {
            return new DrivingRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DrivingRouteResult[] newArray(int i) {
            return new DrivingRouteResult[i];
        }
    }

    public DrivingRouteResult() {
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public List<DrivingRouteLine> getRouteLines() {
        return this.f8157a;
    }

    public SuggestAddrInfo getSuggestAddrInfo() {
        return this.d;
    }

    @Deprecated
    public TaxiInfo getTaxiInfo() {
        return this.c;
    }

    public List<TaxiInfo> getTaxiInfos() {
        return this.b;
    }

    public void setRouteLines(List<DrivingRouteLine> list) {
        this.f8157a = list;
    }

    public void setSuggestAddrInfo(SuggestAddrInfo suggestAddrInfo) {
        this.d = suggestAddrInfo;
    }

    public void setTaxiInfos(List<TaxiInfo> list) {
        this.b = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f8157a);
        parcel.writeTypedList(this.b);
        parcel.writeParcelable(this.d, 1);
    }

    protected DrivingRouteResult(Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        this.f8157a = arrayList;
        parcel.readTypedList(arrayList, DrivingRouteLine.CREATOR);
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        parcel.readTypedList(arrayList2, TaxiInfo.CREATOR);
        this.d = (SuggestAddrInfo) parcel.readParcelable(SuggestAddrInfo.class.getClassLoader());
    }
}
