package com.baidu.mapapi.search.route;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes13.dex */
public class IntegralRouteResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<IntegralRouteResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private List<WalkingRouteLine> f8161a;
    private List<IndoorRouteLine> b;

    static class a implements Parcelable.Creator<IntegralRouteResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntegralRouteResult createFromParcel(Parcel parcel) {
            return new IntegralRouteResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntegralRouteResult[] newArray(int i) {
            return new IntegralRouteResult[i];
        }
    }

    public IntegralRouteResult() {
    }

    public List<IndoorRouteLine> getIndoorRouteLines() {
        return this.b;
    }

    public List<WalkingRouteLine> getRouteLines() {
        return this.f8161a;
    }

    public void setIndoorRouteLines(List<IndoorRouteLine> list) {
        this.b = list;
    }

    public void setRouteLines(List<WalkingRouteLine> list) {
        this.f8161a = list;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeList(this.f8161a);
        parcel.writeTypedList(this.b);
    }

    protected IntegralRouteResult(Parcel parcel) {
        super(parcel);
        ArrayList arrayList = new ArrayList();
        this.f8161a = arrayList;
        parcel.readList(arrayList, WalkingRouteLine.class.getClassLoader());
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        parcel.readList(arrayList2, IndoorRouteLine.class.getClassLoader());
    }
}
