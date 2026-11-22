package com.baidu.mapapi.search.busline;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.search.core.RouteNode;
import com.baidu.mapapi.search.core.RouteStep;
import com.baidu.mapapi.search.core.SearchResult;
import java.util.Date;
import java.util.List;

/* loaded from: classes13.dex */
public class BusLineResult extends SearchResult implements Parcelable {
    public static final Parcelable.Creator<BusLineResult> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f8060a;
    private String b;
    private String c;
    private boolean d;
    private Date e;
    private Date f;
    private String g;
    private List<BusStation> h;
    private List<BusStep> i;
    private float j;
    private float k;
    private int l;
    private String m;
    private int n;
    private int o;
    private String p;

    public static class BusStation extends RouteNode {
        private List<BusSubway> d;
        private List<BusTransfer> e;

        public static class BusSubway {

            /* renamed from: a, reason: collision with root package name */
            private String f8061a;
            private String b;

            public String getBackgroundColor() {
                return this.b;
            }

            public String getName() {
                return this.f8061a;
            }

            public void setBackgroundColor(String str) {
                this.b = str;
            }

            public void setName(String str) {
                this.f8061a = str;
            }
        }

        public static class BusTransfer {

            /* renamed from: a, reason: collision with root package name */
            private String f8062a;
            private String b;

            public String getName() {
                return this.b;
            }

            public String getUid() {
                return this.f8062a;
            }

            public void setName(String str) {
                this.b = str;
            }

            public void setUid(String str) {
                this.f8062a = str;
            }
        }

        public List<BusSubway> getSubways() {
            return this.d;
        }

        public List<BusTransfer> getTransfers() {
            return this.e;
        }

        public void setSubways(List<BusSubway> list) {
            this.d = list;
        }

        public void setTransfers(List<BusTransfer> list) {
            this.e = list;
        }
    }

    public static class BusStep extends RouteStep {
    }

    static class a implements Parcelable.Creator<BusLineResult> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusLineResult[] newArray(int i) {
            return new BusLineResult[i];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BusLineResult createFromParcel(Parcel parcel) {
            return new BusLineResult(parcel);
        }
    }

    public BusLineResult() {
        this.f8060a = null;
        this.b = null;
        this.h = null;
        this.i = null;
        this.p = null;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public float getBasePrice() {
        return this.j;
    }

    public String getBusCompany() {
        return this.f8060a;
    }

    public String getBusLineName() {
        return this.b;
    }

    public int getCityId() {
        return this.n;
    }

    public Date getEndTime() {
        return this.f;
    }

    public int getKindType() {
        return this.o;
    }

    public String getLineDirection() {
        return this.p;
    }

    public int getLineType() {
        return this.l;
    }

    public float getMaxPrice() {
        return this.k;
    }

    public String getRawName() {
        return this.c;
    }

    public Date getStartTime() {
        return this.e;
    }

    public List<BusStation> getStations() {
        return this.h;
    }

    public List<BusStep> getSteps() {
        return this.i;
    }

    public String getTimeTable() {
        return this.m;
    }

    public String getUid() {
        return this.g;
    }

    public boolean isMonthTicket() {
        return this.d;
    }

    public void setBasePrice(float f) {
        this.j = f;
    }

    public void setBusCompany(String str) {
        this.f8060a = str;
    }

    public void setBusLineName(String str) {
        this.b = str;
    }

    public void setCityId(int i) {
        this.n = i;
    }

    public void setEndTime(Date date) {
        this.f = date;
    }

    public void setKindType(int i) {
        this.o = i;
    }

    public void setLineDirection(String str) {
        this.p = str;
    }

    public void setLineType(int i) {
        this.l = i;
    }

    public void setMaxPrice(float f) {
        this.k = f;
    }

    public void setMonthTicket(boolean z) {
        this.d = z;
    }

    public void setRawName(String str) {
        this.c = str;
    }

    public void setStartTime(Date date) {
        this.e = date;
    }

    public void setStations(List<BusStation> list) {
        this.h = list;
    }

    public void setSteps(List<BusStep> list) {
        this.i = list;
    }

    public void setTimeTable(String str) {
        this.m = str;
    }

    public void setUid(String str) {
        this.g = str;
    }

    @Override // com.baidu.mapapi.search.core.SearchResult, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f8060a);
        parcel.writeString(this.b);
        parcel.writeValue(Boolean.valueOf(this.d));
        parcel.writeValue(this.e);
        parcel.writeValue(this.f);
        parcel.writeString(this.g);
        parcel.writeList(this.h);
        parcel.writeList(this.i);
        parcel.writeString(this.c);
        parcel.writeString(this.p);
        parcel.writeFloat(this.k);
        parcel.writeFloat(this.j);
    }

    BusLineResult(Parcel parcel) {
        this.f8060a = null;
        this.b = null;
        this.h = null;
        this.i = null;
        this.p = null;
        this.f8060a = parcel.readString();
        this.b = parcel.readString();
        this.d = ((Boolean) parcel.readValue(Boolean.class.getClassLoader())).booleanValue();
        this.e = (Date) parcel.readValue(Date.class.getClassLoader());
        this.f = (Date) parcel.readValue(Date.class.getClassLoader());
        this.g = parcel.readString();
        this.h = parcel.readArrayList(BusStation.class.getClassLoader());
        this.i = parcel.readArrayList(RouteStep.class.getClassLoader());
        this.c = parcel.readString();
        this.p = parcel.readString();
        this.k = parcel.readFloat();
        this.j = parcel.readFloat();
    }
}
