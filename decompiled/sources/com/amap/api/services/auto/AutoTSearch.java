package com.amap.api.services.auto;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.a8;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IAutoTSearch;

/* loaded from: classes11.dex */
public class AutoTSearch {

    /* renamed from: a, reason: collision with root package name */
    private IAutoTSearch f2080a;

    public static class FilterBox implements Cloneable, Parcelable {
        public static final Parcelable.Creator<FilterBox> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private String f2081a;
        private String b;
        private String c;
        private String d;
        private String e;

        static class a implements Parcelable.Creator<FilterBox> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public FilterBox createFromParcel(Parcel parcel) {
                return new FilterBox(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public FilterBox[] newArray(int i) {
                return new FilterBox[i];
            }
        }

        public FilterBox() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getCheckedLevel() {
            return this.b;
        }

        public String getClassifyV2Data() {
            return this.c;
        }

        public String getClassifyV2Level2Data() {
            return this.d;
        }

        public String getClassifyV2Level3Data() {
            return this.e;
        }

        public String getRetainState() {
            return this.f2081a;
        }

        public void setCheckedLevel(String str) {
            this.b = str;
        }

        public void setClassifyV2Data(String str) {
            this.c = str;
        }

        public void setClassifyV2Level2Data(String str) {
            this.d = str;
        }

        public void setClassifyV2Level3Data(String str) {
            this.e = str;
        }

        public void setRetainState(String str) {
            this.f2081a = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2081a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
        }

        protected FilterBox(Parcel parcel) {
            this.f2081a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public FilterBox m6883clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            FilterBox filterBox = new FilterBox();
            filterBox.setRetainState(this.f2081a);
            filterBox.setCheckedLevel(this.b);
            filterBox.setClassifyV2Data(this.c);
            filterBox.setClassifyV2Level2Data(this.d);
            filterBox.setClassifyV2Level3Data(this.e);
            return filterBox;
        }
    }

    public interface OnChargeStationListener {
        void onChargeStationSearched(AutoTChargeStationResult autoTChargeStationResult, int i);
    }

    public static class Query implements Cloneable, Parcelable {
        public static final Parcelable.Creator<Query> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private String f2082a;
        private String b;
        private String c;
        private String d;
        private String e;
        private int f;
        private int g;
        private boolean h;
        private String i;
        private int j;
        private LatLonPoint k;
        private String l;
        private String m;
        private FilterBox n;
        private String o;
        private String p;

        static class a implements Parcelable.Creator<Query> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public Query createFromParcel(Parcel parcel) {
                return new Query(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public Query[] newArray(int i) {
                return new Query[i];
            }
        }

        public Query() {
            this.h = false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String getAccessKey() {
            return this.o;
        }

        public String getAdCode() {
            return this.f2082a;
        }

        public String getCity() {
            return this.b;
        }

        public String getDataType() {
            return this.c;
        }

        public FilterBox getFilterBox() {
            return this.n;
        }

        public String getGeoObj() {
            return this.d;
        }

        public String getKeywords() {
            return this.e;
        }

        public LatLonPoint getLatLonPoint() {
            return this.k;
        }

        public int getPageNum() {
            return this.f;
        }

        public int getPageSize() {
            return this.g;
        }

        public String getQueryType() {
            return this.i;
        }

        public int getRange() {
            return this.j;
        }

        public String getSecretKey() {
            return this.p;
        }

        public String getUserCity() {
            return this.m;
        }

        public String getUserLoc() {
            return this.l;
        }

        public boolean isQii() {
            return this.h;
        }

        public void setAccessKey(String str) {
            this.o = str;
        }

        public void setAdCode(String str) {
            this.f2082a = str;
        }

        public void setCity(String str) {
            this.b = str;
        }

        public void setDataType(String str) {
            this.c = str;
        }

        public void setFilterBox(FilterBox filterBox) {
            this.n = filterBox;
        }

        public void setGeoObj(String str) {
            this.d = str;
        }

        public void setKeywords(String str) {
            this.e = str;
        }

        public void setLatLonPoint(LatLonPoint latLonPoint) {
            this.k = latLonPoint;
        }

        public void setPageNum(int i) {
            this.f = i;
        }

        public void setPageSize(int i) {
            this.g = i;
        }

        public void setQii(boolean z) {
            this.h = z;
        }

        public void setQueryType(String str) {
            this.i = str;
        }

        public void setRange(int i) {
            this.j = i;
        }

        public void setSecretKey(String str) {
            this.p = str;
        }

        public void setUserCity(String str) {
            this.m = str;
        }

        public void setUserLoc(String str) {
            this.l = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f2082a);
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
            parcel.writeByte(this.h ? (byte) 1 : (byte) 0);
            parcel.writeString(this.i);
            parcel.writeInt(this.j);
            parcel.writeParcelable(this.k, i);
            parcel.writeString(this.l);
            parcel.writeString(this.m);
            parcel.writeParcelable(this.n, i);
            parcel.writeString(this.o);
            parcel.writeString(this.p);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Query m6884clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
            Query query = new Query();
            query.setAdCode(this.f2082a);
            query.setCity(this.b);
            query.setDataType(this.c);
            query.setGeoObj(this.d);
            query.setKeywords(this.e);
            query.setPageNum(this.f);
            query.setPageSize(this.g);
            query.setQii(this.h);
            query.setQueryType(this.i);
            query.setRange(this.j);
            query.setLatLonPoint(this.k);
            query.setUserLoc(this.l);
            query.setUserCity(this.m);
            query.setAccessKey(this.o);
            query.setSecretKey(this.p);
            query.setFilterBox(this.n);
            return query;
        }

        protected Query(Parcel parcel) {
            this.h = false;
            this.f2082a = parcel.readString();
            this.b = parcel.readString();
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readByte() != 0;
            this.i = parcel.readString();
            this.j = parcel.readInt();
            this.k = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.l = parcel.readString();
            this.m = parcel.readString();
            this.n = (FilterBox) parcel.readParcelable(FilterBox.class.getClassLoader());
            this.o = parcel.readString();
            this.p = parcel.readString();
        }
    }

    public AutoTSearch(Context context) throws AMapException {
        if (this.f2080a == null) {
            try {
                this.f2080a = new a8(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public AutoTChargeStationResult searchChargeStation() throws AMapException {
        IAutoTSearch iAutoTSearch = this.f2080a;
        if (iAutoTSearch == null) {
            return null;
        }
        return iAutoTSearch.searchChargeStation();
    }

    public void searchChargeStationAsync() throws AMapException {
        IAutoTSearch iAutoTSearch = this.f2080a;
        if (iAutoTSearch == null) {
            return;
        }
        iAutoTSearch.searchChargeStationAsync();
    }

    public void setChargeStationListener(OnChargeStationListener onChargeStationListener) {
        IAutoTSearch iAutoTSearch = this.f2080a;
        if (iAutoTSearch == null || onChargeStationListener == null) {
            return;
        }
        iAutoTSearch.setChargeStationListener(onChargeStationListener);
    }

    public void setQuery(Query query) {
        IAutoTSearch iAutoTSearch = this.f2080a;
        if (iAutoTSearch == null) {
            return;
        }
        iAutoTSearch.setQuery(query);
    }
}
