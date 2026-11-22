package com.amap.api.location;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.amap.api.location.AMapLocationClientOption;
import com.autonavi.aps.amapapi.config.Const;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import com.autonavi.aps.amapapi.utils.Utils;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class AMapLocation extends Location implements Cloneable, Parcelable {
    public static final String COORD_TYPE_GCJ02 = "GCJ02";
    public static final String COORD_TYPE_WGS84 = "WGS84";
    public static final Parcelable.Creator<AMapLocation> CREATOR = new a();
    public static final int ERROR_CODE_AIRPLANEMODE_WIFIOFF = 18;
    public static final int ERROR_CODE_FAILURE_AUTH = 7;
    public static final int ERROR_CODE_FAILURE_CELL = 11;
    public static final int ERROR_CODE_FAILURE_COARSE_LOCATION = 20;
    public static final int ERROR_CODE_FAILURE_CONNECTION = 4;
    public static final int ERROR_CODE_FAILURE_INIT = 9;
    public static final int ERROR_CODE_FAILURE_LOCATION = 6;
    public static final int ERROR_CODE_FAILURE_LOCATION_PARAMETER = 3;
    public static final int ERROR_CODE_FAILURE_LOCATION_PERMISSION = 12;
    public static final int ERROR_CODE_FAILURE_NOENOUGHSATELLITES = 14;
    public static final int ERROR_CODE_FAILURE_NOWIFIANDAP = 13;
    public static final int ERROR_CODE_FAILURE_PARSER = 5;
    public static final int ERROR_CODE_FAILURE_SIMULATION_LOCATION = 15;
    public static final int ERROR_CODE_FAILURE_WIFI_INFO = 2;
    public static final int ERROR_CODE_INVALID_PARAMETER = 1;
    public static final int ERROR_CODE_NOCGI_WIFIOFF = 19;
    public static final int ERROR_CODE_NO_COMPENSATION_CACHE = 33;
    public static final int ERROR_CODE_SERVICE_FAIL = 10;
    public static final int ERROR_CODE_UNKNOWN = 8;
    public static final int GPS_ACCURACY_BAD = 0;
    public static final int GPS_ACCURACY_GOOD = 1;
    public static final int GPS_ACCURACY_UNKNOWN = -1;
    public static final String LBS_REAL_LOCATION_TYPE = "realLocationType";
    public static final int LOCATION_COMPENSATION = 10;
    public static final int LOCATION_SUCCESS = 0;
    public static final int LOCATION_TYPE_AMAP = 7;
    public static final int LOCATION_TYPE_CELL = 6;
    public static final int LOCATION_TYPE_COARSE_LOCATION = 11;
    public static final int LOCATION_TYPE_FAST = 3;
    public static final int LOCATION_TYPE_FIX_CACHE = 4;
    public static final int LOCATION_TYPE_GPS = 1;
    public static final int LOCATION_TYPE_LAST_LOCATION_CACHE = 9;
    public static final int LOCATION_TYPE_NETWORK = 12;
    public static final int LOCATION_TYPE_OFFLINE = 8;
    public static final int LOCATION_TYPE_SAME_REQ = 2;
    public static final int LOCATION_TYPE_WIFI = 5;
    public static final int TRUSTED_LEVEL_BAD = 4;
    public static final int TRUSTED_LEVEL_HIGH = 1;
    public static final int TRUSTED_LEVEL_LOW = 3;
    public static final int TRUSTED_LEVEL_NORMAL = 2;
    private int A;
    private boolean B;
    private String C;
    private boolean D;
    private int E;
    private String F;
    private int G;
    private int H;
    private int I;
    private int J;
    private long K;
    private long L;
    private String M;
    private int N;
    private boolean O;
    private int P;
    private int Q;
    private String R;
    private boolean S;
    private boolean T;
    private int U;
    private String V;
    private HashMap<String, Object> W;
    private boolean X;
    private String Y;
    private float Z;

    /* renamed from: a, reason: collision with root package name */
    private String f2007a;
    private float a0;
    private String b;
    private float b0;
    private String c;
    AMapLocationQualityReport c0;
    private String d;
    private String e;
    private String f;
    protected String floor;
    private String g;
    private String h;
    private String i;
    private String j;
    private String k;
    private boolean l;
    private int m;
    protected String mPoiid;
    private String n;
    private String o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private double f2008q;
    private double r;
    private double s;
    private float t;
    private float u;
    private Bundle v;
    private String w;
    private int x;
    private String y;
    private String z;

    static class a implements Parcelable.Creator<AMapLocation> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public AMapLocation createFromParcel(Parcel parcel) {
            AMapLocation aMapLocation = new AMapLocation((Location) Location.CREATOR.createFromParcel(parcel));
            aMapLocation.e = parcel.readString();
            aMapLocation.f = parcel.readString();
            aMapLocation.y = parcel.readString();
            aMapLocation.mPoiid = parcel.readString();
            aMapLocation.b = parcel.readString();
            aMapLocation.d = parcel.readString();
            aMapLocation.h = parcel.readString();
            aMapLocation.c = parcel.readString();
            aMapLocation.m = parcel.readInt();
            aMapLocation.n = parcel.readString();
            aMapLocation.floor = parcel.readString();
            aMapLocation.z = parcel.readString();
            aMapLocation.D = parcel.readInt() != 0;
            aMapLocation.l = parcel.readInt() != 0;
            aMapLocation.f2008q = parcel.readDouble();
            aMapLocation.o = parcel.readString();
            aMapLocation.p = parcel.readInt();
            aMapLocation.r = parcel.readDouble();
            aMapLocation.B = parcel.readInt() != 0;
            aMapLocation.k = parcel.readString();
            aMapLocation.g = parcel.readString();
            aMapLocation.f2007a = parcel.readString();
            aMapLocation.i = parcel.readString();
            aMapLocation.x = parcel.readInt();
            aMapLocation.A = parcel.readInt();
            aMapLocation.j = parcel.readString();
            aMapLocation.C = parcel.readString();
            aMapLocation.F = parcel.readString();
            aMapLocation.E = parcel.readInt();
            aMapLocation.G = parcel.readInt();
            aMapLocation.H = parcel.readInt();
            aMapLocation.I = parcel.readInt();
            aMapLocation.J = parcel.readInt();
            aMapLocation.K = parcel.readLong();
            aMapLocation.L = parcel.readLong();
            aMapLocation.M = parcel.readString();
            aMapLocation.Y = parcel.readString();
            aMapLocation.X = parcel.readInt() != 0;
            aMapLocation.N = parcel.readInt();
            aMapLocation.O = parcel.readInt() != 0;
            aMapLocation.P = parcel.readInt();
            aMapLocation.Q = parcel.readInt();
            aMapLocation.R = parcel.readString();
            aMapLocation.S = parcel.readInt() != 0;
            aMapLocation.T = parcel.readInt() != 0;
            aMapLocation.U = parcel.readInt();
            aMapLocation.V = parcel.readString();
            return aMapLocation;
        }

        @Override // android.os.Parcelable.Creator
        public AMapLocation[] newArray(int i) {
            return new AMapLocation[i];
        }
    }

    public AMapLocation(String str) {
        super(str);
        this.f2007a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = true;
        this.m = 0;
        this.n = "success";
        this.o = "";
        this.p = 0;
        this.f2008q = 0.0d;
        this.r = 0.0d;
        this.s = 0.0d;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = null;
        this.x = 0;
        this.y = "";
        this.mPoiid = "";
        this.floor = "";
        this.z = "";
        this.A = -1;
        this.B = false;
        this.C = "";
        this.D = false;
        this.E = -1;
        this.F = "GCJ02";
        this.G = 1;
        this.P = -1;
        this.Q = -1;
        this.X = false;
        this.Y = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
        this.c0 = new AMapLocationQualityReport();
        this.w = str;
    }

    public synchronized void clearOptAttrs() {
        try {
            HashMap<String, Object> hashMap = this.W;
            if (hashMap != null) {
                hashMap.clear();
            }
        } catch (Exception unused) {
        }
    }

    public synchronized HashMap<String, Object> cloneOptAttrs() {
        HashMap<String, Object> hashMap;
        hashMap = this.W;
        return (hashMap == null || hashMap.size() <= 0) ? null : new HashMap<>(this.W);
    }

    @Override // android.location.Location, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.location.Location
    public float getAccuracy() {
        return super.getAccuracy();
    }

    public String getAdCode() {
        return this.e;
    }

    public String getAddress() {
        return this.f;
    }

    @Override // android.location.Location
    public double getAltitude() {
        return this.s;
    }

    public String getAoiName() {
        return this.y;
    }

    @Override // android.location.Location
    public float getBearing() {
        return this.u;
    }

    @Override // android.location.Location
    public float getBearingAccuracyDegrees() {
        return this.b0;
    }

    public String getBuildingId() {
        return this.mPoiid;
    }

    public String getCity() {
        return this.b;
    }

    public String getCityCode() {
        return this.d;
    }

    public int getConScenario() {
        return this.H;
    }

    public int getCoord() {
        return this.E;
    }

    public String getCoordType() {
        return this.F;
    }

    public String getCountry() {
        return this.h;
    }

    public String getDescription() {
        return this.C;
    }

    public int getDiagnosisType() {
        return this.N;
    }

    public String getDistrict() {
        return this.c;
    }

    public int getErrorCode() {
        return this.m;
    }

    public String getErrorInfo() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.n);
        if (this.m != 0) {
            sb.append(" 请到http://lbs.amap.com/api/android-location-sdk/guide/utilities/errorcode/查看错误码说明");
            sb.append(",错误详细信息:" + this.o);
        }
        return sb.toString();
    }

    @Override // android.location.Location
    public Bundle getExtras() {
        return this.v;
    }

    public String getFloor() {
        return this.floor;
    }

    public String getFloorName() {
        return this.z;
    }

    public String getGeoLanguage() {
        return this.Y;
    }

    public int getGpsAccuracyStatus() {
        return this.A;
    }

    public int getIod() {
        return this.P;
    }

    public int getIodConfidence() {
        return this.Q;
    }

    @Override // android.location.Location
    public double getLatitude() {
        return this.f2008q;
    }

    public String getLocationDetail() {
        return this.o;
    }

    public AMapLocationQualityReport getLocationQualityReport() {
        return this.c0;
    }

    public long getLocationTickTime() {
        return this.L;
    }

    public int getLocationType() {
        return this.p;
    }

    public long getLocationUtcTime() {
        return this.K;
    }

    @Override // android.location.Location
    public double getLongitude() {
        return this.r;
    }

    public synchronized Object getOptAttr(String str) {
        HashMap<String, Object> hashMap = this.W;
        if (hashMap != null && hashMap.get(str) != null) {
            try {
                return this.W.get(str);
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public synchronized boolean getOptAttrBoolean(String str, boolean z) {
        if (has(str)) {
            try {
                Object obj = this.W.get(str);
                if (obj != null) {
                    return Boolean.parseBoolean(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        return z;
    }

    public synchronized double getOptAttrDouble(String str, double d) {
        if (has(str)) {
            try {
                Object obj = this.W.get(str);
                if (obj != null) {
                    return Double.parseDouble(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public synchronized float getOptAttrFloat(String str, float f) {
        if (has(str)) {
            try {
                Object obj = this.W.get(str);
                if (obj != null) {
                    return Float.parseFloat(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        return f;
    }

    public synchronized int getOptAttrInt(String str, int i) {
        if (has(str)) {
            try {
                Object obj = this.W.get(str);
                if (obj != null) {
                    return Integer.parseInt(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        return i;
    }

    public synchronized long getOptAttrLong(String str, long j) {
        if (has(str)) {
            try {
                Object obj = this.W.get(str);
                if (obj != null) {
                    return Long.parseLong(obj.toString());
                }
            } catch (Exception unused) {
            }
        }
        return j;
    }

    public synchronized String getOptAttrString(String str, String str2) {
        if (has(str)) {
            try {
                return (String) this.W.get(str);
            } catch (Exception unused) {
            }
        }
        return str2;
    }

    public String getOptContent() {
        return this.V;
    }

    public String getPoiName() {
        return this.g;
    }

    public int getPriority() {
        return this.U;
    }

    @Override // android.location.Location
    public String getProvider() {
        return this.w;
    }

    public String getProvince() {
        return this.f2007a;
    }

    public String getRoad() {
        return this.i;
    }

    public int getSatellites() {
        return this.x;
    }

    public String getSemantics() {
        return this.R;
    }

    public String getSource() {
        return this.M;
    }

    @Override // android.location.Location
    public float getSpeed() {
        return this.t;
    }

    @Override // android.location.Location
    public float getSpeedAccuracyMetersPerSecond() {
        return this.a0;
    }

    public String getStreet() {
        return this.j;
    }

    public String getStreetNum() {
        return this.k;
    }

    public int getSubType() {
        return this.J;
    }

    public int getTrustedLevel() {
        return this.G;
    }

    public int getType() {
        return this.I;
    }

    @Override // android.location.Location
    public float getVerticalAccuracyMeters() {
        return this.Z;
    }

    public synchronized boolean has(String str) {
        boolean z;
        HashMap<String, Object> hashMap = this.W;
        if (hashMap != null) {
            z = hashMap.get(str) != null;
        }
        return z;
    }

    public boolean isCoorCanUseInMap() {
        return this.T;
    }

    public boolean isDim() {
        return this.O;
    }

    public boolean isFixLastLocation() {
        return this.D;
    }

    @Override // android.location.Location
    public boolean isMock() {
        return this.B;
    }

    public boolean isOffset() {
        return this.l;
    }

    public boolean isReversegeo() {
        return this.X;
    }

    public boolean isSpeedKmh() {
        return this.S;
    }

    public synchronized void putOptAttr(String str, Object obj) {
        if (this.W == null) {
            this.W = new HashMap<>();
        }
        this.W.put(str, obj);
    }

    public synchronized void removeOptAttr(String str) {
        try {
            HashMap<String, Object> hashMap = this.W;
            if (hashMap != null) {
                hashMap.remove(str);
            }
        } catch (Exception unused) {
        }
    }

    public void setAMapErrorCode(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int amapErrorCode2OpenErrorCode = Utils.amapErrorCode2OpenErrorCode(str, i);
        this.m = amapErrorCode2OpenErrorCode;
        this.n = Utils.getLocErrorInfo(amapErrorCode2OpenErrorCode);
    }

    public void setAdCode(String str) {
        this.e = str;
    }

    public void setAddress(String str) {
        this.f = str;
    }

    @Override // android.location.Location
    public void setAltitude(double d) {
        super.setAltitude(d);
        this.s = d;
    }

    public void setAoiName(String str) {
        this.y = str;
    }

    @Override // android.location.Location
    public void setBearing(float f) {
        super.setBearing(f);
        while (f < 0.0f) {
            f += 360.0f;
        }
        while (f >= 360.0f) {
            f -= 360.0f;
        }
        this.u = f;
    }

    @Override // android.location.Location
    public void setBearingAccuracyDegrees(float f) {
        this.b0 = f;
    }

    public void setBuildingId(String str) {
        this.mPoiid = str;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setCityCode(String str) {
        this.d = str;
    }

    public void setConScenario(int i) {
        this.H = i;
    }

    public void setCoorCanUseInMap(boolean z) {
        this.T = z;
    }

    public void setCoord(int i) {
        this.E = i;
    }

    public void setCoordType(String str) {
        this.F = str;
    }

    public void setCountry(String str) {
        this.h = str;
    }

    public void setDescription(String str) {
        this.C = str;
    }

    public void setDiagnosisType(int i) {
        this.N = i;
    }

    public void setDim(boolean z) {
        this.O = z;
    }

    public void setDistrict(String str) {
        this.c = str;
    }

    public void setErrorCode(int i) {
        if (this.m != 0) {
            return;
        }
        this.n = Utils.getLocErrorInfo(i);
        this.m = i;
    }

    public void setErrorInfo(String str) {
        this.n = str;
    }

    @Override // android.location.Location
    public void setExtras(Bundle bundle) {
        super.setExtras(bundle);
        this.v = bundle == null ? null : new Bundle(bundle);
    }

    public void setFixLastLocation(boolean z) {
        this.D = z;
    }

    public void setFloor(String str) {
        if (!TextUtils.isEmpty(str)) {
            str = str.replace(TokenNames.F, "");
            try {
                Integer.parseInt(str);
            } catch (Throwable th) {
                CoreUtil.reportError(th, "AmapLoc", "setFloor");
                str = null;
            }
        }
        this.floor = str;
    }

    public void setFloorName(String str) {
        this.z = str;
    }

    public void setGeoLanguage(String str) {
        this.Y = str;
    }

    public void setGpsAccuracyStatus(int i) {
        this.A = i;
    }

    public void setIod(int i) {
        this.P = i;
    }

    public void setIodConfidence(int i) {
        this.Q = i;
    }

    @Override // android.location.Location
    public void setLatitude(double d) {
        this.f2008q = d;
    }

    public void setLocationDetail(String str) {
        this.o = str;
    }

    public void setLocationQualityReport(AMapLocationQualityReport aMapLocationQualityReport) {
        if (aMapLocationQualityReport == null) {
            return;
        }
        this.c0 = aMapLocationQualityReport;
    }

    public void setLocationTickTime(long j) {
        this.L = j;
    }

    public void setLocationType(int i) {
        this.p = i;
    }

    public void setLocationUtcTime(long j) {
        this.K = j;
    }

    @Override // android.location.Location
    public void setLongitude(double d) {
        this.r = d;
    }

    @Override // android.location.Location
    public void setMock(boolean z) {
        this.B = z;
    }

    public void setNumber(String str) {
        this.k = str;
    }

    public void setOffset(boolean z) {
        this.l = z;
    }

    public void setOptAttrs(HashMap<String, Object> hashMap) {
        this.W = hashMap;
    }

    public void setOptContent(String str) {
        this.V = str;
    }

    public void setPoiName(String str) {
        this.g = str;
    }

    public void setPriority(int i) {
        this.U = i;
    }

    @Override // android.location.Location
    public void setProvider(String str) {
        super.setProvider(str);
        this.w = str;
    }

    public void setProvince(String str) {
        this.f2007a = str;
    }

    public void setReversegeo(boolean z) {
        this.X = z;
    }

    public void setRoad(String str) {
        this.i = str;
    }

    public void setSatellites(int i) {
        this.x = i;
    }

    public void setSemantics(String str) {
        this.R = str;
    }

    public void setSource(String str) {
        this.M = str;
    }

    @Override // android.location.Location
    public void setSpeed(float f) {
        super.setSpeed(f);
        this.t = f;
    }

    @Override // android.location.Location
    public void setSpeedAccuracyMetersPerSecond(float f) {
        this.a0 = f;
    }

    public void setSpeedKmh(boolean z) {
        this.S = z;
    }

    public void setStreet(String str) {
        this.j = str;
    }

    public void setSubType(int i) {
        this.J = i;
    }

    public void setTrustedLevel(int i) {
        this.G = i;
    }

    public void setType(int i) {
        this.I = i;
    }

    @Override // android.location.Location
    public void setVerticalAccuracyMeters(float f) {
        this.Z = f;
    }

    public JSONObject toJson(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            if (i == 1) {
                try {
                    jSONObject.put("altitude", getAltitude());
                    jSONObject.put("speed", getSpeed());
                    jSONObject.put(Const.JSON_KEY_BEARING, getBearing());
                } catch (Throwable unused) {
                }
                jSONObject.put(Const.JSON_KEY_CITYCODE, this.d);
                jSONObject.put(Const.JSON_KEY_ADCODE, this.e);
                jSONObject.put("country", this.h);
                jSONObject.put("province", this.f2007a);
                jSONObject.put("city", this.b);
                jSONObject.put("district", this.c);
                jSONObject.put(Const.JSON_KEY_ROAD, this.i);
                jSONObject.put(Const.JSON_KEY_STREET, this.j);
                jSONObject.put("number", this.k);
                jSONObject.put("poiname", this.g);
                jSONObject.put("errorCode", this.m);
                jSONObject.put("errorInfo", this.n);
                jSONObject.put("locationType", this.p);
                jSONObject.put(Const.JSON_KEY_LOCATIONDETAIL, this.o);
                jSONObject.put(Const.JSON_KEY_AOINAME, this.y);
                jSONObject.put(Const.JSON_KEY_ADDRESS, this.f);
                jSONObject.put(Const.JSON_KEY_POIID, this.mPoiid);
                jSONObject.put(Const.JSON_KEY_FLOOR, this.floor);
                jSONObject.put("floorName", this.z);
                jSONObject.put("description", this.C);
            } else if (i != 2) {
                if (i != 3) {
                    return jSONObject;
                }
                jSONObject.put("provider", getProvider());
                jSONObject.put("lon", getLongitude());
                jSONObject.put("lat", getLatitude());
                jSONObject.put(Const.JSON_KEY_ACCURACY, getAccuracy());
                jSONObject.put(Const.JSON_KEY_ISOFFSET, this.l);
                jSONObject.put("isFixLastLocation", this.D);
                jSONObject.put(Const.JSON_KEY_COORD, this.E);
                jSONObject.put("coordType", this.F);
                return jSONObject;
            }
            jSONObject.put("time", getTime());
            jSONObject.put("provider", getProvider());
            jSONObject.put("lon", getLongitude());
            jSONObject.put("lat", getLatitude());
            jSONObject.put(Const.JSON_KEY_ACCURACY, getAccuracy());
            jSONObject.put(Const.JSON_KEY_ISOFFSET, this.l);
            jSONObject.put("isFixLastLocation", this.D);
            jSONObject.put(Const.JSON_KEY_COORD, this.E);
            jSONObject.put("coordType", this.F);
            return jSONObject;
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AmapLoc", "toStr");
            return null;
        }
    }

    public String toStr() {
        return toStr(1);
    }

    @Override // android.location.Location
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        try {
            stringBuffer.append("latitude=" + this.f2008q + "#");
            stringBuffer.append("longitude=" + this.r + "#");
            stringBuffer.append("province=" + this.f2007a + "#");
            stringBuffer.append("coord=" + this.E + "#");
            stringBuffer.append("coordType=" + this.F + "#");
            stringBuffer.append("city=" + this.b + "#");
            stringBuffer.append("district=" + this.c + "#");
            stringBuffer.append("cityCode=" + this.d + "#");
            stringBuffer.append("adCode=" + this.e + "#");
            stringBuffer.append("address=" + this.f + "#");
            stringBuffer.append("country=" + this.h + "#");
            stringBuffer.append("road=" + this.i + "#");
            stringBuffer.append("poiName=" + this.g + "#");
            stringBuffer.append("street=" + this.j + "#");
            stringBuffer.append("streetNum=" + this.k + "#");
            stringBuffer.append("aoiName=" + this.y + "#");
            stringBuffer.append("poiid=" + this.mPoiid + "#");
            stringBuffer.append("floor=" + this.floor + "#");
            stringBuffer.append("floorName=" + this.z + "#");
            stringBuffer.append("errorCode=" + this.m + "#");
            stringBuffer.append("errorInfo=" + this.n + "#");
            stringBuffer.append("locationDetail=" + this.o + "#");
            stringBuffer.append("description=" + this.C + "#");
            stringBuffer.append("locationType=" + this.p + "#");
            stringBuffer.append("conScenario=" + this.H);
            stringBuffer.append("mType=" + this.I);
            stringBuffer.append("mSubType=" + this.J);
            stringBuffer.append("mLocationUtcTime=" + this.K);
            stringBuffer.append("mLocationTickTime=" + this.L);
            stringBuffer.append("mSource=" + this.M);
            stringBuffer.append("isReversegeo=" + this.X);
            stringBuffer.append("geoLanguage=" + this.Y);
            stringBuffer.append("mDiagnosisType=" + this.N);
            stringBuffer.append("mDim=" + this.O);
            stringBuffer.append("mIod=" + this.P);
            stringBuffer.append("mIodConfidence=" + this.Q);
            stringBuffer.append("mSemantics=" + this.R);
            stringBuffer.append("mSpeedKmh=" + this.S);
            stringBuffer.append("mCoorCanUseInMap=" + this.T);
            stringBuffer.append("mPriority=" + this.U);
            stringBuffer.append("mOptContent=" + this.V);
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    @Override // android.location.Location, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        try {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.e);
            parcel.writeString(this.f);
            parcel.writeString(this.y);
            parcel.writeString(this.mPoiid);
            parcel.writeString(this.b);
            parcel.writeString(this.d);
            parcel.writeString(this.h);
            parcel.writeString(this.c);
            parcel.writeInt(this.m);
            parcel.writeString(this.n);
            parcel.writeString(this.floor);
            parcel.writeString(this.z);
            parcel.writeInt(this.D ? 1 : 0);
            parcel.writeInt(this.l ? 1 : 0);
            parcel.writeDouble(this.f2008q);
            parcel.writeString(this.o);
            parcel.writeInt(this.p);
            parcel.writeDouble(this.r);
            parcel.writeInt(this.B ? 1 : 0);
            parcel.writeString(this.k);
            parcel.writeString(this.g);
            parcel.writeString(this.f2007a);
            parcel.writeString(this.i);
            parcel.writeInt(this.x);
            parcel.writeInt(this.A);
            parcel.writeString(this.j);
            parcel.writeString(this.C);
            parcel.writeString(this.F);
            parcel.writeInt(this.E);
            parcel.writeInt(this.G);
            parcel.writeInt(this.H);
            parcel.writeInt(this.I);
            parcel.writeInt(this.J);
            parcel.writeLong(this.K);
            parcel.writeLong(this.L);
            parcel.writeString(this.M);
            parcel.writeString(this.Y);
            parcel.writeInt(this.X ? 1 : 0);
            parcel.writeInt(this.N);
            parcel.writeInt(this.O ? 1 : 0);
            parcel.writeInt(this.P);
            parcel.writeInt(this.Q);
            parcel.writeString(this.R);
            parcel.writeInt(this.S ? 1 : 0);
            parcel.writeInt(this.T ? 1 : 0);
            parcel.writeInt(this.U);
            parcel.writeString(this.V);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapLocation", "writeToParcel");
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AMapLocation m6869clone() {
        try {
            super.clone();
        } catch (Throwable unused) {
        }
        AMapLocation aMapLocation = new AMapLocation(this);
        try {
            aMapLocation.setLatitude(this.f2008q);
            aMapLocation.setLongitude(this.r);
            aMapLocation.setAdCode(this.e);
            aMapLocation.setAddress(this.f);
            aMapLocation.setAoiName(this.y);
            aMapLocation.setBuildingId(this.mPoiid);
            aMapLocation.setCity(this.b);
            aMapLocation.setCityCode(this.d);
            aMapLocation.setCountry(this.h);
            aMapLocation.setDistrict(this.c);
            aMapLocation.setErrorCode(this.m);
            aMapLocation.setErrorInfo(this.n);
            aMapLocation.setFloor(this.floor);
            aMapLocation.setFloorName(this.z);
            aMapLocation.setFixLastLocation(this.D);
            aMapLocation.setOffset(this.l);
            aMapLocation.setLocationDetail(this.o);
            aMapLocation.setLocationType(this.p);
            aMapLocation.setMock(this.B);
            aMapLocation.setNumber(this.k);
            aMapLocation.setPoiName(this.g);
            aMapLocation.setProvince(this.f2007a);
            aMapLocation.setRoad(this.i);
            aMapLocation.setSatellites(this.x);
            aMapLocation.setGpsAccuracyStatus(this.A);
            aMapLocation.setStreet(this.j);
            aMapLocation.setDescription(this.C);
            aMapLocation.setExtras(getExtras());
            AMapLocationQualityReport aMapLocationQualityReport = this.c0;
            if (aMapLocationQualityReport != null) {
                aMapLocation.setLocationQualityReport(aMapLocationQualityReport.m6871clone());
            }
            aMapLocation.setCoord(this.E);
            aMapLocation.setCoordType(this.F);
            aMapLocation.setTrustedLevel(this.G);
            aMapLocation.setConScenario(this.H);
            aMapLocation.setType(this.I);
            aMapLocation.setSubType(this.J);
            aMapLocation.setLocationUtcTime(this.K);
            aMapLocation.setLocationTickTime(this.L);
            aMapLocation.setSource(this.M);
            aMapLocation.setReversegeo(this.X);
            aMapLocation.setGeoLanguage(this.Y);
            aMapLocation.setDiagnosisType(this.N);
            aMapLocation.setDim(this.O);
            aMapLocation.setIod(this.P);
            aMapLocation.setIodConfidence(this.Q);
            aMapLocation.setSemantics(this.R);
            aMapLocation.setSpeedKmh(this.S);
            aMapLocation.setCoorCanUseInMap(this.T);
            aMapLocation.setPriority(this.U);
            aMapLocation.setOptContent(this.V);
            aMapLocation.setOptAttrs(cloneOptAttrs());
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapLocation", "clone");
        }
        return aMapLocation;
    }

    public void setCoord(String str) {
        if (TextUtils.isEmpty(str)) {
            this.E = -1;
        } else if (str.equals("0")) {
            this.E = 0;
        } else if (str.equals("1")) {
            this.E = 1;
        } else {
            this.E = -1;
        }
        if (this.E == 0) {
            this.F = "WGS84";
        } else {
            this.F = "GCJ02";
        }
    }

    public String toStr(int i) {
        JSONObject jSONObject;
        try {
            jSONObject = toJson(i);
        } catch (Throwable th) {
            CoreUtil.reportError(th, "AMapLocation", "toStr part2");
            jSONObject = null;
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public AMapLocation(Location location) {
        super(location);
        this.f2007a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = "";
        this.f = "";
        this.g = "";
        this.h = "";
        this.i = "";
        this.j = "";
        this.k = "";
        this.l = true;
        this.m = 0;
        this.n = "success";
        this.o = "";
        this.p = 0;
        this.f2008q = 0.0d;
        this.r = 0.0d;
        this.s = 0.0d;
        this.t = 0.0f;
        this.u = 0.0f;
        this.v = null;
        this.x = 0;
        this.y = "";
        this.mPoiid = "";
        this.floor = "";
        this.z = "";
        this.A = -1;
        this.B = false;
        this.C = "";
        this.D = false;
        this.E = -1;
        this.F = "GCJ02";
        this.G = 1;
        this.P = -1;
        this.Q = -1;
        this.X = false;
        this.Y = String.valueOf(AMapLocationClientOption.GeoLanguage.DEFAULT);
        this.c0 = new AMapLocationQualityReport();
        this.f2008q = location.getLatitude();
        this.r = location.getLongitude();
        this.s = location.getAltitude();
        this.u = location.getBearing();
        this.t = location.getSpeed();
        this.w = location.getProvider();
        this.v = location.getExtras() != null ? new Bundle(location.getExtras()) : null;
    }
}
