package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.b6;
import com.amap.api.col.p0003sl.e8;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IDistanceSearch;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class DistanceSearch {
    public static final String EXTENSIONS_ALL = "all";
    public static final String EXTENSIONS_BASE = "base";
    public static final int TYPE_DISTANCE = 0;
    public static final int TYPE_DRIVING_DISTANCE = 1;
    public static final int TYPE_WALK_DISTANCE = 3;

    /* renamed from: a, reason: collision with root package name */
    private IDistanceSearch f2158a;

    public static class DistanceQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DistanceQuery> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private int f2159a;
        private List<LatLonPoint> b;
        private LatLonPoint c;
        private String d;
        private int e;

        static class a implements Parcelable.Creator<DistanceQuery> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public DistanceQuery createFromParcel(Parcel parcel) {
                return new DistanceQuery(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public DistanceQuery[] newArray(int i) {
                return new DistanceQuery[i];
            }
        }

        public DistanceQuery() {
            this.f2159a = 1;
            this.b = new ArrayList();
            this.d = "base";
            this.e = 4;
        }

        public void addOrigins(LatLonPoint... latLonPointArr) {
            for (LatLonPoint latLonPoint : latLonPointArr) {
                if (latLonPoint != null) {
                    this.b.add(latLonPoint);
                }
            }
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public LatLonPoint getDestination() {
            return this.c;
        }

        public String getExtensions() {
            return this.d;
        }

        public int getMode() {
            return this.e;
        }

        public List<LatLonPoint> getOrigins() {
            return this.b;
        }

        public int getType() {
            return this.f2159a;
        }

        public void setDestination(LatLonPoint latLonPoint) {
            this.c = latLonPoint;
        }

        public void setExtensions(String str) {
            this.d = str;
        }

        public void setMode(int i) {
            this.e = i;
        }

        public void setOrigins(List<LatLonPoint> list) {
            if (list != null) {
                this.b = list;
            }
        }

        public void setType(int i) {
            this.f2159a = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f2159a);
            parcel.writeTypedList(this.b);
            parcel.writeParcelable(this.c, i);
            parcel.writeString(this.d);
            parcel.writeInt(this.e);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DistanceQuery m6894clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "DistanceSearch", "DistanceQueryclone");
            }
            DistanceQuery distanceQuery = new DistanceQuery();
            distanceQuery.setType(this.f2159a);
            distanceQuery.setOrigins(this.b);
            distanceQuery.setDestination(this.c);
            distanceQuery.setExtensions(this.d);
            distanceQuery.setMode(this.e);
            return distanceQuery;
        }

        protected DistanceQuery(Parcel parcel) {
            this.f2159a = 1;
            this.b = new ArrayList();
            this.d = "base";
            this.e = 4;
            this.f2159a = parcel.readInt();
            this.b = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            this.c = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.d = parcel.readString();
            this.e = parcel.readInt();
        }
    }

    public interface OnDistanceSearchListener {
        void onDistanceSearched(DistanceResult distanceResult, int i);
    }

    public DistanceSearch(Context context) throws AMapException {
        if (this.f2158a == null) {
            try {
                this.f2158a = new e8(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public DistanceResult calculateRouteDistance(DistanceQuery distanceQuery) throws AMapException {
        IDistanceSearch iDistanceSearch = this.f2158a;
        if (iDistanceSearch != null) {
            return iDistanceSearch.calculateRouteDistance(distanceQuery);
        }
        return null;
    }

    public void calculateRouteDistanceAsyn(DistanceQuery distanceQuery) {
        IDistanceSearch iDistanceSearch = this.f2158a;
        if (iDistanceSearch != null) {
            iDistanceSearch.calculateRouteDistanceAsyn(distanceQuery);
        }
    }

    public void setDistanceSearchListener(OnDistanceSearchListener onDistanceSearchListener) {
        IDistanceSearch iDistanceSearch = this.f2158a;
        if (iDistanceSearch != null) {
            iDistanceSearch.setDistanceSearchListener(onDistanceSearchListener);
        }
    }
}
