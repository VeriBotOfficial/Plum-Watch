package com.amap.api.services.route;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.b6;
import com.amap.api.col.p0003sl.n8;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.core.LatLonPoint;
import com.amap.api.services.interfaces.IRouteSearchV2;
import com.amap.api.services.route.RouteSearch;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class RouteSearchV2 {

    /* renamed from: a, reason: collision with root package name */
    private IRouteSearchV2 f2184a;

    public class AlternativeRoute {
        public static final int ALTERNATIVE_ROUTE_ONE = 1;
        public static final int ALTERNATIVE_ROUTE_THREE = 3;
        public static final int ALTERNATIVE_ROUTE_TWO = 2;

        public AlternativeRoute(RouteSearchV2 routeSearchV2) {
        }
    }

    public static class BusMode {
        public static final int BUS_COMFORTABLE = 4;
        public static final int BUS_DEFAULT = 0;
        public static final int BUS_LEASE_CHANGE = 2;
        public static final int BUS_LEASE_WALK = 3;
        public static final int BUS_NO_SUBWAY = 5;
        public static final int BUS_SAVE_MONEY = 1;
        public static final int BUS_SUBWAY = 6;
        public static final int BUS_SUBWAY_FIRST = 7;
        public static final int BUS_WASTE_LESS = 8;
    }

    public static class BusRouteQuery implements Cloneable, Parcelable {
        public static final Parcelable.Creator<BusRouteQuery> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private FromAndTo f2185a;
        private int b;
        private String c;
        private String d;
        private String e;
        private String f;
        private int g;
        private String h;
        private String i;
        private String j;
        private String k;
        private int l;
        private int m;
        private int n;
        private int o;

        static class a implements Parcelable.Creator<BusRouteQuery> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public BusRouteQuery createFromParcel(Parcel parcel) {
                return new BusRouteQuery(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public BusRouteQuery[] newArray(int i) {
                return new BusRouteQuery[i];
            }
        }

        public BusRouteQuery(FromAndTo fromAndTo, int i, String str, int i2) {
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
            this.f2185a = fromAndTo;
            this.b = i;
            this.c = str;
            this.g = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BusRouteQuery busRouteQuery = (BusRouteQuery) obj;
            if (this.b == busRouteQuery.b && this.g == busRouteQuery.g && this.h.equals(busRouteQuery.h) && this.i.equals(busRouteQuery.i) && this.l == busRouteQuery.l && this.m == busRouteQuery.m && this.n == busRouteQuery.n && this.o == busRouteQuery.o && this.f2185a.equals(busRouteQuery.f2185a) && this.c.equals(busRouteQuery.c) && this.d.equals(busRouteQuery.d) && this.e.equals(busRouteQuery.e) && this.f.equals(busRouteQuery.f) && this.j.equals(busRouteQuery.j)) {
                return this.k.equals(busRouteQuery.k);
            }
            return false;
        }

        public String getAd1() {
            return this.j;
        }

        public String getAd2() {
            return this.k;
        }

        public int getAlternativeRoute() {
            return this.l;
        }

        public String getCity() {
            return this.c;
        }

        public String getCityd() {
            return this.d;
        }

        public String getDate() {
            return this.e;
        }

        public String getDestinationPoiId() {
            return this.i;
        }

        public FromAndTo getFromAndTo() {
            return this.f2185a;
        }

        public int getMaxTrans() {
            return this.n;
        }

        public int getMode() {
            return this.b;
        }

        public int getMultiExport() {
            return this.m;
        }

        public int getNightFlag() {
            return this.g;
        }

        public String getOriginPoiId() {
            return this.h;
        }

        public int getShowFields() {
            return this.o;
        }

        public String getTime() {
            return this.f;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.f2185a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l) * 31) + this.m) * 31) + this.n) * 31) + this.o;
        }

        public void setAd1(String str) {
            this.j = str;
        }

        public void setAd2(String str) {
            this.k = str;
        }

        public void setAlternativeRoute(int i) {
            this.l = i;
        }

        public void setCityd(String str) {
            this.d = str;
        }

        public void setDate(String str) {
            this.e = str;
        }

        public void setDestinationPoiId(String str) {
            this.i = str;
        }

        public void setMaxTrans(int i) {
            this.n = i;
        }

        public void setMultiExport(int i) {
            this.m = i;
        }

        public void setOriginPoiId(String str) {
            this.h = str;
        }

        public void setShowFields(int i) {
            this.o = i;
        }

        public void setTime(String str) {
            this.f = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2185a, i);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
            parcel.writeInt(this.g);
            parcel.writeString(this.d);
            parcel.writeInt(this.o);
            parcel.writeString(this.h);
            parcel.writeString(this.i);
            parcel.writeString(this.j);
            parcel.writeString(this.k);
            parcel.writeInt(this.l);
            parcel.writeInt(this.n);
            parcel.writeInt(this.m);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public BusRouteQuery m6902clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "RouteSearchV2", "BusRouteQueryclone");
            }
            BusRouteQuery busRouteQuery = new BusRouteQuery(this.f2185a, this.b, this.c, this.g);
            busRouteQuery.setCityd(this.d);
            busRouteQuery.setShowFields(this.o);
            busRouteQuery.setDate(this.e);
            busRouteQuery.setTime(this.f);
            busRouteQuery.setAd1(this.j);
            busRouteQuery.setAd2(this.k);
            busRouteQuery.setOriginPoiId(this.h);
            busRouteQuery.setDestinationPoiId(this.i);
            busRouteQuery.setMaxTrans(this.n);
            busRouteQuery.setMultiExport(this.m);
            busRouteQuery.setAlternativeRoute(this.l);
            return busRouteQuery;
        }

        public BusRouteQuery(Parcel parcel) {
            this.b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
            this.f2185a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.b = parcel.readInt();
            this.c = parcel.readString();
            this.g = parcel.readInt();
            this.d = parcel.readString();
            this.o = parcel.readInt();
            this.h = parcel.readString();
            this.i = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
            this.n = parcel.readInt();
            this.m = parcel.readInt();
            this.l = parcel.readInt();
            this.j = parcel.readString();
            this.k = parcel.readString();
        }

        public BusRouteQuery() {
            this.b = 0;
            this.g = 0;
            this.l = 5;
            this.m = 0;
            this.n = 4;
            this.o = 1;
        }
    }

    public static class CurveCost {

        /* renamed from: a, reason: collision with root package name */
        private float f2186a;
        private float b;

        public float getAccess() {
            return this.f2186a;
        }

        public float getValue() {
            return this.b;
        }

        public void setAccess(float f) {
            this.f2186a = f;
        }

        public void setValue(float f) {
            this.b = f;
        }
    }

    public static class CustomCostMode {

        /* renamed from: a, reason: collision with root package name */
        private List<SpeedCost> f2187a;
        private CurveCost b;
        private SlopeCost c;
        private float d;
        private TransCost e;
        private float f;
        private PowerTrainLoss g;

        public float getAuxCost() {
            return this.d;
        }

        public CurveCost getCurveCost() {
            return this.b;
        }

        public float getFerryCost() {
            return this.f;
        }

        public PowerTrainLoss getPowerTrainLosses() {
            return this.g;
        }

        public SlopeCost getSlopeCost() {
            return this.c;
        }

        public List<SpeedCost> getSpeedCosts() {
            return this.f2187a;
        }

        public TransCost getTransCost() {
            return this.e;
        }

        public void setAuxCost(float f) {
            this.d = f;
        }

        public void setCurveCost(CurveCost curveCost) {
            this.b = curveCost;
        }

        public void setFerryCost(float f) {
            this.f = f;
        }

        public void setPowerTrainLosses(PowerTrainLoss powerTrainLoss) {
            this.g = powerTrainLoss;
        }

        public void setSlopeCost(SlopeCost slopeCost) {
            this.c = slopeCost;
        }

        public void setSpeedCosts(List<SpeedCost> list) {
            this.f2187a = list;
        }

        public void setTransCost(TransCost transCost) {
            this.e = transCost;
        }

        public String toJson() {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONArray jSONArray = new JSONArray();
                List<SpeedCost> list = this.f2187a;
                if (list != null) {
                    for (SpeedCost speedCost : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("speed", speedCost.getSpeed());
                        jSONObject2.put("value", speedCost.getValue());
                        jSONArray.put(jSONObject2);
                    }
                    jSONObject.put("speed_cost", jSONArray);
                }
                if (this.b != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put(ak.Q, this.b.getAccess());
                    jSONObject3.put("value", this.b.getValue());
                    jSONObject.put("curve_cost", jSONObject3);
                }
                if (this.c != null) {
                    JSONObject jSONObject4 = new JSONObject();
                    jSONObject4.put(MapBundleKey.OfflineMapKey.OFFLINE_UPDATE, this.c.getUp());
                    jSONObject4.put("down", this.c.getDown());
                    jSONObject.put("slope_cost", jSONObject4);
                }
                jSONObject.put("aux_cost", this.d);
                if (this.e != null) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put(ak.Q, this.e.getAccess());
                    jSONObject5.put("decess", this.e.getDecess());
                    jSONObject.put("trans_cost", jSONObject5);
                }
                jSONObject.put("ferry_cost", this.f);
                if (this.g != null) {
                    JSONArray jSONArray2 = new JSONArray();
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("powerdemand", this.g.getPowerDemand());
                    jSONObject6.put("value", this.g.getPowerDemandValue());
                    JSONObject jSONObject7 = new JSONObject();
                    jSONObject7.put("speed", this.g.getSpeed());
                    jSONObject7.put("value", this.g.getSpeedValue());
                    jSONArray2.put(jSONObject6);
                    jSONArray2.put(jSONObject7);
                    jSONObject.put("powertrain_loss", jSONArray2);
                }
                return jSONObject.toString();
            } catch (JSONException e) {
                e.printStackTrace();
                return null;
            }
        }
    }

    public static class DriveRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<DriveRouteQuery> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private FromAndTo f2188a;
        private NewEnergy b;
        private int c;
        private List<LatLonPoint> d;
        private List<List<LatLonPoint>> e;
        private String f;
        private boolean g;
        private int h;
        private String i;
        private int j;

        static class a implements Parcelable.Creator<DriveRouteQuery> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public DriveRouteQuery createFromParcel(Parcel parcel) {
                return new DriveRouteQuery(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public DriveRouteQuery[] newArray(int i) {
                return new DriveRouteQuery[i];
            }
        }

        public DriveRouteQuery(FromAndTo fromAndTo, DrivingStrategy drivingStrategy, List<LatLonPoint> list, List<List<LatLonPoint>> list2, String str) {
            this.c = DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
            this.f2188a = fromAndTo;
            this.c = drivingStrategy.getValue();
            this.d = list;
            this.e = list2;
            this.f = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            DriveRouteQuery driveRouteQuery = (DriveRouteQuery) obj;
            String str = this.f;
            if (str == null) {
                if (driveRouteQuery.f != null) {
                    return false;
                }
            } else if (!str.equals(driveRouteQuery.f)) {
                return false;
            }
            List<List<LatLonPoint>> list = this.e;
            if (list == null) {
                if (driveRouteQuery.e != null) {
                    return false;
                }
            } else if (!list.equals(driveRouteQuery.e)) {
                return false;
            }
            FromAndTo fromAndTo = this.f2188a;
            if (fromAndTo == null) {
                if (driveRouteQuery.f2188a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(driveRouteQuery.f2188a)) {
                return false;
            }
            if (this.c != driveRouteQuery.c) {
                return false;
            }
            List<LatLonPoint> list2 = this.d;
            if (list2 == null) {
                if (driveRouteQuery.d != null) {
                    return false;
                }
            } else if (!list2.equals(driveRouteQuery.d) || this.g != driveRouteQuery.isUseFerry() || this.h != driveRouteQuery.h || this.j != driveRouteQuery.j) {
                return false;
            }
            return true;
        }

        public String getAvoidRoad() {
            return this.f;
        }

        public List<List<LatLonPoint>> getAvoidpolygons() {
            return this.e;
        }

        public String getAvoidpolygonsStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<List<LatLonPoint>> list = this.e;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.e.size(); i++) {
                List<LatLonPoint> list2 = this.e.get(i);
                for (int i2 = 0; i2 < list2.size(); i2++) {
                    LatLonPoint latLonPoint = list2.get(i2);
                    stringBuffer.append(latLonPoint.getLongitude());
                    stringBuffer.append(",");
                    stringBuffer.append(latLonPoint.getLatitude());
                    if (i2 < list2.size() - 1) {
                        stringBuffer.append(";");
                    }
                }
                if (i < this.e.size() - 1) {
                    stringBuffer.append("|");
                }
            }
            return stringBuffer.toString();
        }

        public int getCarType() {
            return this.h;
        }

        public String getExclude() {
            return this.i;
        }

        public FromAndTo getFromAndTo() {
            return this.f2188a;
        }

        public DrivingStrategy getMode() {
            return DrivingStrategy.fromValue(this.c);
        }

        public NewEnergy getNewEnergy() {
            return this.b;
        }

        public List<LatLonPoint> getPassedByPoints() {
            return this.d;
        }

        public String getPassedPointStr() {
            StringBuffer stringBuffer = new StringBuffer();
            List<LatLonPoint> list = this.d;
            if (list == null || list.size() == 0) {
                return null;
            }
            for (int i = 0; i < this.d.size(); i++) {
                LatLonPoint latLonPoint = this.d.get(i);
                stringBuffer.append(latLonPoint.getLongitude());
                stringBuffer.append(",");
                stringBuffer.append(latLonPoint.getLatitude());
                if (i < this.d.size() - 1) {
                    stringBuffer.append(";");
                }
            }
            return stringBuffer.toString();
        }

        public int getShowFields() {
            return this.j;
        }

        public boolean hasAvoidRoad() {
            return !b6.a(getAvoidRoad());
        }

        public boolean hasAvoidpolygons() {
            return !b6.a(getAvoidpolygonsStr());
        }

        public boolean hasPassPoint() {
            return !b6.a(getPassedPointStr());
        }

        public int hashCode() {
            String str = this.f;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            List<List<LatLonPoint>> list = this.e;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            FromAndTo fromAndTo = this.f2188a;
            int hashCode3 = (((hashCode2 + (fromAndTo == null ? 0 : fromAndTo.hashCode())) * 31) + this.c) * 31;
            List<LatLonPoint> list2 = this.d;
            return ((hashCode3 + (list2 != null ? list2.hashCode() : 0)) * 31) + this.h;
        }

        public boolean isUseFerry() {
            return this.g;
        }

        public void setCarType(int i) {
            this.h = i;
        }

        public void setExclude(String str) {
            this.i = str;
        }

        public void setNewEnergy(NewEnergy newEnergy) {
            this.b = newEnergy;
        }

        public void setShowFields(int i) {
            this.j = i;
        }

        public void setUseFerry(boolean z) {
            this.g = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2188a, i);
            parcel.writeInt(this.c);
            parcel.writeTypedList(this.d);
            List<List<LatLonPoint>> list = this.e;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(list.size());
                Iterator<List<LatLonPoint>> it = this.e.iterator();
                while (it.hasNext()) {
                    parcel.writeTypedList(it.next());
                }
            }
            parcel.writeString(this.f);
            parcel.writeInt(this.g ? 1 : 0);
            parcel.writeInt(this.h);
            parcel.writeString(this.i);
            parcel.writeInt(this.j);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public DriveRouteQuery m6903clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "RouteSearchV2", "DriveRouteQueryclone");
            }
            DriveRouteQuery driveRouteQuery = new DriveRouteQuery(this.f2188a, DrivingStrategy.fromValue(this.c), this.d, this.e, this.f);
            driveRouteQuery.setUseFerry(this.g);
            driveRouteQuery.setCarType(this.h);
            driveRouteQuery.setExclude(this.i);
            driveRouteQuery.setShowFields(this.j);
            driveRouteQuery.setNewEnergy(this.b);
            return driveRouteQuery;
        }

        public DriveRouteQuery(Parcel parcel) {
            this.c = DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
            this.f2188a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            this.c = parcel.readInt();
            this.d = parcel.createTypedArrayList(LatLonPoint.CREATOR);
            int readInt = parcel.readInt();
            if (readInt == 0) {
                this.e = null;
            } else {
                this.e = new ArrayList();
            }
            for (int i = 0; i < readInt; i++) {
                this.e.add(parcel.createTypedArrayList(LatLonPoint.CREATOR));
            }
            this.f = parcel.readString();
            this.g = parcel.readInt() == 1;
            this.h = parcel.readInt();
            this.i = parcel.readString();
            this.j = parcel.readInt();
        }

        public DriveRouteQuery() {
            this.c = DrivingStrategy.DEFAULT.getValue();
            this.g = true;
            this.h = 0;
            this.i = null;
            this.j = 1;
        }
    }

    public enum DrivingStrategy {
        DEFAULT(32),
        AVOID_CONGESTION(33),
        HIGHWAY_PRIORITY(34),
        AVOID_HIGHWAY(35),
        LESS_CHARGE(36),
        ROAD_PRIORITY(37),
        SPEED_PRIORITY(38),
        AVOID_CONGESTION_HIGHWAY_PRIORITY(39),
        AVOID_CONGESTION_AVOID_HIGHWAY(40),
        AVOID_CONGESTION_LESS_CHARGE(41),
        LESS_CHARGE_AVOID_HIGHWAY(42),
        AVOID_CONGESTION_LESS_CHARGE_AVOID_HIGHWAY(43),
        AVOID_CONGESTION_ROAD_PRIORITY(44),
        AVOID_CONGESTION_SPEED_PRIORITY(45);


        /* renamed from: a, reason: collision with root package name */
        int f2189a;

        DrivingStrategy(int i) {
            this.f2189a = i;
        }

        public static DrivingStrategy fromValue(int i) {
            return values()[i - 32];
        }

        public int getValue() {
            return this.f2189a;
        }
    }

    public static class FromAndTo implements Cloneable, Parcelable {
        public static final Parcelable.Creator<FromAndTo> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private LatLonPoint f2190a;
        private LatLonPoint b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;

        static class a implements Parcelable.Creator<FromAndTo> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public FromAndTo createFromParcel(Parcel parcel) {
                return new FromAndTo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public FromAndTo[] newArray(int i) {
                return new FromAndTo[i];
            }
        }

        public FromAndTo(LatLonPoint latLonPoint, LatLonPoint latLonPoint2) {
            this.f2190a = latLonPoint;
            this.b = latLonPoint2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            FromAndTo fromAndTo = (FromAndTo) obj;
            String str = this.d;
            if (str == null) {
                if (fromAndTo.d != null) {
                    return false;
                }
            } else if (!str.equals(fromAndTo.d)) {
                return false;
            }
            LatLonPoint latLonPoint = this.f2190a;
            if (latLonPoint == null) {
                if (fromAndTo.f2190a != null) {
                    return false;
                }
            } else if (!latLonPoint.equals(fromAndTo.f2190a)) {
                return false;
            }
            String str2 = this.c;
            if (str2 == null) {
                if (fromAndTo.c != null) {
                    return false;
                }
            } else if (!str2.equals(fromAndTo.c)) {
                return false;
            }
            LatLonPoint latLonPoint2 = this.b;
            if (latLonPoint2 == null) {
                if (fromAndTo.b != null) {
                    return false;
                }
            } else if (!latLonPoint2.equals(fromAndTo.b)) {
                return false;
            }
            String str3 = this.e;
            if (str3 == null) {
                if (fromAndTo.e != null) {
                    return false;
                }
            } else if (!str3.equals(fromAndTo.e)) {
                return false;
            }
            String str4 = this.f;
            if (str4 == null) {
                if (fromAndTo.f != null) {
                    return false;
                }
            } else if (!str4.equals(fromAndTo.f)) {
                return false;
            }
            return true;
        }

        public String getDestinationPoiID() {
            return this.d;
        }

        public String getDestinationType() {
            return this.f;
        }

        public LatLonPoint getFrom() {
            return this.f2190a;
        }

        public String getOriginType() {
            return this.e;
        }

        public String getPlateNumber() {
            return this.g;
        }

        public String getStartPoiID() {
            return this.c;
        }

        public LatLonPoint getTo() {
            return this.b;
        }

        public int hashCode() {
            String str = this.d;
            int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
            LatLonPoint latLonPoint = this.f2190a;
            int hashCode2 = (hashCode + (latLonPoint == null ? 0 : latLonPoint.hashCode())) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            LatLonPoint latLonPoint2 = this.b;
            int hashCode4 = (hashCode3 + (latLonPoint2 == null ? 0 : latLonPoint2.hashCode())) * 31;
            String str3 = this.e;
            int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f;
            return hashCode5 + (str4 != null ? str4.hashCode() : 0);
        }

        public void setDestinationPoiID(String str) {
            this.d = str;
        }

        public void setDestinationType(String str) {
            this.f = str;
        }

        public void setOriginType(String str) {
            this.e = str;
        }

        public void setPlateNumber(String str) {
            this.g = str;
        }

        public void setStartPoiID(String str) {
            this.c = str;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2190a, i);
            parcel.writeParcelable(this.b, i);
            parcel.writeString(this.c);
            parcel.writeString(this.d);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public FromAndTo m6904clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "RouteSearchV2", "FromAndToclone");
            }
            FromAndTo fromAndTo = new FromAndTo(this.f2190a, this.b);
            fromAndTo.setStartPoiID(this.c);
            fromAndTo.setDestinationPoiID(this.d);
            fromAndTo.setOriginType(this.e);
            fromAndTo.setDestinationType(this.f);
            return fromAndTo;
        }

        public FromAndTo(Parcel parcel) {
            this.f2190a = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.b = (LatLonPoint) parcel.readParcelable(LatLonPoint.class.getClassLoader());
            this.c = parcel.readString();
            this.d = parcel.readString();
            this.e = parcel.readString();
            this.f = parcel.readString();
        }

        public FromAndTo() {
        }
    }

    public static class NewEnergy {

        /* renamed from: a, reason: collision with root package name */
        private String f2191a;
        private CustomCostMode b;
        private String i;
        private float c = -1.0f;
        private float d = -1.0f;
        private float e = 1.5f;
        private float f = 100.0f;
        private float g = 0.0f;
        private float h = 0.0f;
        private int j = 0;

        public String buildParam() {
            StringBuilder sb = new StringBuilder();
            if (this.f2191a != null) {
                sb.append("&key=").append(this.f2191a);
            }
            if (this.b != null) {
                sb.append("&custom_cost_mode=").append(this.b.toJson());
            }
            if (this.c > 0.0f) {
                sb.append("&max_vehicle_charge=").append(this.c);
            }
            if (this.d > 0.0f) {
                sb.append("&vehicle_charge=").append(this.d);
            }
            sb.append("&load=").append(this.e);
            sb.append("&leaving_percent=").append(this.f);
            sb.append("&arriving_percent=").append(this.g);
            sb.append("&destination_arriving_percent=").append(this.h);
            if (this.i != null) {
                sb.append("&custom_charging_arguments=").append(this.i);
            }
            if (this.j > 0) {
                sb.append("&waypoints_arriving_percent=").append(this.j);
            }
            return sb.toString();
        }

        public float getArrivingPercent() {
            return this.g;
        }

        public String getCustomChargingArguments() {
            return this.i;
        }

        public CustomCostMode getCustomCostMode() {
            return this.b;
        }

        public float getDestinationArrivingPercent() {
            return this.h;
        }

        public String getKey() {
            return this.f2191a;
        }

        public float getLeavingPercent() {
            return this.f;
        }

        public float getLoad() {
            return this.e;
        }

        public float getMaxVehicleCharge() {
            return this.c;
        }

        public float getVehicleCharge() {
            return this.d;
        }

        public int getWaypointsArrivingPercent() {
            return this.j;
        }

        public void setArrivingPercent(float f) {
            this.g = f;
        }

        public void setCustomChargingArguments(String str) {
            this.i = str;
        }

        public void setCustomCostMode(CustomCostMode customCostMode) {
            this.b = customCostMode;
        }

        public void setDestinationArrivingPercent(float f) {
            this.h = f;
        }

        public void setKey(String str) {
            this.f2191a = str;
        }

        public void setLeavingPercent(float f) {
            this.f = f;
        }

        public void setLoad(float f) {
            this.e = f;
        }

        public void setMaxVehicleCharge(float f) {
            this.c = f;
        }

        public void setVehicleCharge(float f) {
            this.d = f;
        }

        public void setWaypointsArrivingPercent(int i) {
            this.j = i;
        }
    }

    public interface OnRoutePlanSearchListener {
        void onDriveRoutePlanSearched(DriveRoutePlanResult driveRoutePlanResult, int i);
    }

    public interface OnRouteSearchListener {
        void onBusRouteSearched(BusRouteResultV2 busRouteResultV2, int i);

        void onDriveRouteSearched(DriveRouteResultV2 driveRouteResultV2, int i);

        void onRideRouteSearched(RideRouteResultV2 rideRouteResultV2, int i);

        void onWalkRouteSearched(WalkRouteResultV2 walkRouteResultV2, int i);
    }

    public interface OnTruckRouteSearchListener {
        void onTruckRouteSearched(TruckRouteRestult truckRouteRestult, int i);
    }

    public static class PowerTrainLoss {

        /* renamed from: a, reason: collision with root package name */
        private int f2192a;
        private float b;
        private int c;
        private int d;

        public int getPowerDemand() {
            return this.f2192a;
        }

        public float getPowerDemandValue() {
            return this.b;
        }

        public int getSpeed() {
            return this.c;
        }

        public int getSpeedValue() {
            return this.d;
        }

        public void setPowerDemand(int i) {
            this.f2192a = i;
        }

        public void setPowerDemandValue(float f) {
            this.b = f;
        }

        public void setSpeed(int i) {
            this.c = i;
        }

        public void setSpeedValue(int i) {
            this.d = i;
        }
    }

    public static class RideRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<RideRouteQuery> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private FromAndTo f2193a;
        private int b;
        private int c;

        static class a implements Parcelable.Creator<RideRouteQuery> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public RideRouteQuery createFromParcel(Parcel parcel) {
                return new RideRouteQuery(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public RideRouteQuery[] newArray(int i) {
                return new RideRouteQuery[i];
            }
        }

        public RideRouteQuery(FromAndTo fromAndTo) {
            this.b = 1;
            this.c = 1;
            this.f2193a = fromAndTo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            RideRouteQuery rideRouteQuery = (RideRouteQuery) obj;
            FromAndTo fromAndTo = this.f2193a;
            if (fromAndTo == null) {
                if (rideRouteQuery.f2193a != null) {
                    return false;
                }
            } else if (!fromAndTo.equals(rideRouteQuery.f2193a)) {
                return false;
            }
            return this.b == rideRouteQuery.b && this.c == rideRouteQuery.c;
        }

        public int getAlternativeRoute() {
            return this.c;
        }

        public FromAndTo getFromAndTo() {
            return this.f2193a;
        }

        public int getShowFields() {
            return this.b;
        }

        public int hashCode() {
            FromAndTo fromAndTo = this.f2193a;
            return (((((fromAndTo == null ? 0 : fromAndTo.hashCode()) + 31) * 31) + this.b) * 31) + this.c;
        }

        public void setAlternativeRoute(int i) {
            this.c = i;
        }

        public void setShowFields(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2193a, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.b);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public RideRouteQuery m6905clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "RouteSearchV2", "RideRouteQueryclone");
            }
            RideRouteQuery rideRouteQuery = new RideRouteQuery(this.f2193a);
            rideRouteQuery.setShowFields(this.b);
            rideRouteQuery.setAlternativeRoute(this.c);
            return rideRouteQuery;
        }

        public RideRouteQuery(Parcel parcel) {
            this.b = 1;
            this.c = 1;
            this.f2193a = (FromAndTo) parcel.readParcelable(RouteSearch.FromAndTo.class.getClassLoader());
            this.c = parcel.readInt();
            this.b = parcel.readInt();
        }

        public RideRouteQuery() {
            this.b = 1;
            this.c = 1;
        }
    }

    public static class ShowFields {
        public static final int ALL = -1;
        public static final int CHARGE_STATION_INFO = 64;
        public static final int CITIES = 8;
        public static final int COST = 1;
        public static final int ELEC_COSUME_INFO = 32;
        public static final int NAVI = 4;
        public static final int POLINE = 16;
        public static final int TMCS = 2;
    }

    public static class SlopeCost {

        /* renamed from: a, reason: collision with root package name */
        private float f2194a;
        private float b;

        public float getDown() {
            return this.b;
        }

        public float getUp() {
            return this.f2194a;
        }

        public void setDown(float f) {
            this.b = f;
        }

        public void setUp(float f) {
            this.f2194a = f;
        }
    }

    public static class SpeedCost {

        /* renamed from: a, reason: collision with root package name */
        private int f2195a;
        private float b;

        public int getSpeed() {
            return this.f2195a;
        }

        public float getValue() {
            return this.b;
        }

        public void setSpeed(int i) {
            this.f2195a = i;
        }

        public void setValue(float f) {
            this.b = f;
        }
    }

    public static class TransCost {

        /* renamed from: a, reason: collision with root package name */
        private float f2196a;
        private float b;

        public float getAccess() {
            return this.f2196a;
        }

        public float getDecess() {
            return this.b;
        }

        public void setAccess(float f) {
            this.f2196a = f;
        }

        public void setDecess(float f) {
            this.b = f;
        }
    }

    public static class WalkRouteQuery implements Parcelable, Cloneable {
        public static final Parcelable.Creator<WalkRouteQuery> CREATOR = new a();

        /* renamed from: a, reason: collision with root package name */
        private FromAndTo f2197a;
        private int b;
        private boolean c;
        private int d;

        static class a implements Parcelable.Creator<WalkRouteQuery> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public WalkRouteQuery createFromParcel(Parcel parcel) {
                return new WalkRouteQuery(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public WalkRouteQuery[] newArray(int i) {
                return new WalkRouteQuery[i];
            }
        }

        public WalkRouteQuery(FromAndTo fromAndTo) {
            this.b = 1;
            this.c = false;
            this.d = 1;
            this.f2197a = fromAndTo;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            WalkRouteQuery walkRouteQuery = (WalkRouteQuery) obj;
            if (this.b == walkRouteQuery.b && this.c == walkRouteQuery.c && this.d == walkRouteQuery.d) {
                return this.f2197a.equals(walkRouteQuery.f2197a);
            }
            return false;
        }

        public int getAlternativeRoute() {
            return this.d;
        }

        public FromAndTo getFromAndTo() {
            return this.f2197a;
        }

        public int getShowFields() {
            return this.b;
        }

        public int hashCode() {
            return (((((this.f2197a.hashCode() * 31) + this.b) * 31) + (this.c ? 1 : 0)) * 31) + this.d;
        }

        public boolean isIndoor() {
            return this.c;
        }

        public void setAlternativeRoute(int i) {
            this.d = i;
        }

        public void setIndoor(boolean z) {
            this.c = z;
        }

        public void setShowFields(int i) {
            this.b = i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f2197a, i);
            parcel.writeBooleanArray(new boolean[]{this.c});
            parcel.writeInt(this.d);
            parcel.writeInt(this.b);
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public WalkRouteQuery m6906clone() {
            try {
                super.clone();
            } catch (CloneNotSupportedException e) {
                b6.a(e, "RouteSearchV2", "WalkRouteQueryclone");
            }
            WalkRouteQuery walkRouteQuery = new WalkRouteQuery(this.f2197a);
            walkRouteQuery.setShowFields(this.b);
            walkRouteQuery.setIndoor(this.c);
            walkRouteQuery.setAlternativeRoute(this.d);
            return walkRouteQuery;
        }

        public WalkRouteQuery(Parcel parcel) {
            this.b = 1;
            this.c = false;
            this.d = 1;
            this.f2197a = (FromAndTo) parcel.readParcelable(FromAndTo.class.getClassLoader());
            boolean[] zArr = new boolean[1];
            parcel.readBooleanArray(zArr);
            this.c = zArr[0];
            this.d = parcel.readInt();
            this.b = parcel.readInt();
        }

        public WalkRouteQuery() {
            this.b = 1;
            this.c = false;
            this.d = 1;
        }
    }

    public RouteSearchV2(Context context) throws AMapException {
        if (this.f2184a == null) {
            try {
                this.f2184a = new n8(context);
            } catch (Exception e) {
                e.printStackTrace();
                if (e instanceof AMapException) {
                    throw ((AMapException) e);
                }
            }
        }
    }

    public BusRouteResultV2 calculateBusRoute(BusRouteQuery busRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateBusRoute(busRouteQuery);
        }
        return null;
    }

    public void calculateBusRouteAsyn(BusRouteQuery busRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateBusRouteAsyn(busRouteQuery);
        }
    }

    public DriveRouteResultV2 calculateDriveRoute(DriveRouteQuery driveRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateDriveRoute(driveRouteQuery);
        }
        return null;
    }

    public void calculateDriveRouteAsyn(DriveRouteQuery driveRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateDriveRouteAsyn(driveRouteQuery);
        }
    }

    public RideRouteResultV2 calculateRideRoute(RideRouteQuery rideRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateRideRoute(rideRouteQuery);
        }
        return null;
    }

    public void calculateRideRouteAsyn(RideRouteQuery rideRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateRideRouteAsyn(rideRouteQuery);
        }
    }

    public WalkRouteResultV2 calculateWalkRoute(WalkRouteQuery walkRouteQuery) throws AMapException {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            return iRouteSearchV2.calculateWalkRoute(walkRouteQuery);
        }
        return null;
    }

    public void calculateWalkRouteAsyn(WalkRouteQuery walkRouteQuery) {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.calculateWalkRouteAsyn(walkRouteQuery);
        }
    }

    public void setRouteSearchListener(OnRouteSearchListener onRouteSearchListener) {
        IRouteSearchV2 iRouteSearchV2 = this.f2184a;
        if (iRouteSearchV2 != null) {
            iRouteSearchV2.setRouteSearchListener(onRouteSearchListener);
        }
    }
}
