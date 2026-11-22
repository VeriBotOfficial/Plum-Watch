package com.amap.api.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.autonavi.aps.amapapi.utils.CoreUtil;

/* loaded from: classes11.dex */
public class AMapLocationClientOption implements Cloneable, Parcelable {
    private static int F;
    private String A;
    private float B;
    private AMapLocationPurpose C;
    boolean D;
    String E;

    /* renamed from: a, reason: collision with root package name */
    private long f2010a;
    private long b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private AMapLocationMode h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private long p;

    /* renamed from: q, reason: collision with root package name */
    private long f2011q;
    private GeoLanguage r;
    private boolean s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;
    private static AMapLocationProtocol G = AMapLocationProtocol.HTTP;
    public static String APIKEY = "";
    public static final Parcelable.Creator<AMapLocationClientOption> CREATOR = new a();
    public static boolean OPEN_ALWAYS_SCAN_WIFI = true;
    public static long SCAN_WIFI_INTERVAL = 30000;

    public enum AMapLocationMode {
        Battery_Saving,
        Device_Sensors,
        Hight_Accuracy
    }

    public enum AMapLocationProtocol {
        HTTP(0),
        HTTPS(1);


        /* renamed from: a, reason: collision with root package name */
        private int f2013a;

        AMapLocationProtocol(int i) {
            this.f2013a = i;
        }

        public int getValue() {
            return this.f2013a;
        }
    }

    public enum AMapLocationPurpose {
        SignIn,
        Transport,
        Sport
    }

    public enum GeoLanguage {
        DEFAULT,
        ZH,
        EN,
        ES,
        PT,
        FR,
        DE,
        TH,
        JA,
        KO,
        AR,
        TR,
        HE,
        IT,
        RU,
        MS,
        ID,
        VI,
        PL,
        CS,
        UK,
        AZ,
        ZH_HK
    }

    static class a implements Parcelable.Creator<AMapLocationClientOption> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public AMapLocationClientOption createFromParcel(Parcel parcel) {
            return new AMapLocationClientOption(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public AMapLocationClientOption[] newArray(int i) {
            return new AMapLocationClientOption[i];
        }
    }

    public AMapLocationClientOption() {
        this.f2010a = 2000L;
        this.b = CoreUtil.iTo;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = true;
        this.g = true;
        this.h = AMapLocationMode.Hight_Accuracy;
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = false;
        this.o = true;
        this.p = 30000L;
        this.f2011q = 30000L;
        this.r = GeoLanguage.DEFAULT;
        this.s = false;
        this.t = 1500;
        this.u = 21600000;
        this.v = false;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = "";
        this.B = 0.0f;
        this.C = null;
        this.D = false;
        this.E = null;
    }

    public static String getAPIKEY() {
        return APIKEY;
    }

    public static boolean isDownloadCoordinateConvertLibrary() {
        return false;
    }

    public static boolean isOpenAlwaysScanWifi() {
        return OPEN_ALWAYS_SCAN_WIFI;
    }

    public static void setDownloadCoordinateConvertLibrary(boolean z) {
    }

    public static void setLocationProtocol(AMapLocationProtocol aMapLocationProtocol) {
        G = aMapLocationProtocol;
    }

    public static void setOpenAlwaysScanWifi(boolean z) {
        OPEN_ALWAYS_SCAN_WIFI = z;
    }

    public static void setScanWifiInterval(long j) {
        SCAN_WIFI_INTERVAL = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAuuid() {
        return this.A;
    }

    public boolean getCacheCallBack() {
        return this.s;
    }

    public int getCacheCallBackTime() {
        return this.t;
    }

    public int getCacheTimeOut() {
        return this.u;
    }

    public float getDeviceModeDistanceFilter() {
        return this.B;
    }

    public GeoLanguage getGeoLanguage() {
        return this.r;
    }

    public long getGpsFirstTimeout() {
        return this.f2011q;
    }

    public long getHttpTimeOut() {
        return this.b;
    }

    public long getInterval() {
        return this.f2010a;
    }

    public long getLastLocationLifeCycle() {
        return this.p;
    }

    public AMapLocationMode getLocationMode() {
        return this.h;
    }

    public AMapLocationProtocol getLocationProtocol() {
        return G;
    }

    public AMapLocationPurpose getLocationPurpose() {
        return this.C;
    }

    public long getScanWifiInterval() {
        return SCAN_WIFI_INTERVAL;
    }

    public boolean isBeidouFirst() {
        return this.v;
    }

    public boolean isGpsFirst() {
        return this.j;
    }

    public boolean isKillProcess() {
        return this.i;
    }

    public boolean isLBSLocationEnable() {
        return this.z;
    }

    public boolean isLocationCacheEnable() {
        return this.l;
    }

    public boolean isMockEnable() {
        return this.d;
    }

    public boolean isNeedAddress() {
        return this.e;
    }

    public boolean isNoLocReqCgiEnable() {
        return this.x;
    }

    public boolean isOffset() {
        return this.k;
    }

    public boolean isOnceLocation() {
        return this.c;
    }

    public boolean isOnceLocationLatest() {
        return this.m;
    }

    public boolean isSelfStartServiceEnable() {
        return this.w;
    }

    public boolean isSensorEnable() {
        return this.n;
    }

    public boolean isSysNetworkLocEnable() {
        return this.y;
    }

    public boolean isWifiActiveScan() {
        return this.f;
    }

    public boolean isWifiScan() {
        return this.o;
    }

    public void setAuuid(String str) {
        this.A = str;
    }

    public AMapLocationClientOption setBeidouFirst(boolean z) {
        this.v = z;
        return this;
    }

    public void setCacheCallBack(boolean z) {
        this.s = z;
    }

    public void setCacheCallBackTime(int i) {
        this.t = i;
    }

    public void setCacheTimeOut(int i) {
        this.u = i;
    }

    public AMapLocationClientOption setDeviceModeDistanceFilter(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        this.B = f;
        return this;
    }

    public AMapLocationClientOption setGeoLanguage(GeoLanguage geoLanguage) {
        this.r = geoLanguage;
        return this;
    }

    public AMapLocationClientOption setGpsFirst(boolean z) {
        this.j = z;
        return this;
    }

    public AMapLocationClientOption setGpsFirstTimeout(long j) {
        if (j < 5000) {
            j = 5000;
        }
        if (j > 30000) {
            j = 30000;
        }
        this.f2011q = j;
        return this;
    }

    public AMapLocationClientOption setHttpTimeOut(long j) {
        this.b = j;
        return this;
    }

    public AMapLocationClientOption setInterval(long j) {
        if (j <= 800) {
            j = 800;
        }
        this.f2010a = j;
        return this;
    }

    public AMapLocationClientOption setKillProcess(boolean z) {
        this.i = z;
        return this;
    }

    public void setLBSLocationEnable(boolean z) {
        this.z = z;
    }

    public AMapLocationClientOption setLastLocationLifeCycle(long j) {
        this.p = j;
        return this;
    }

    public AMapLocationClientOption setLocationCacheEnable(boolean z) {
        this.l = z;
        return this;
    }

    public AMapLocationClientOption setLocationMode(AMapLocationMode aMapLocationMode) {
        this.h = aMapLocationMode;
        return this;
    }

    public AMapLocationClientOption setLocationPurpose(AMapLocationPurpose aMapLocationPurpose) {
        this.C = aMapLocationPurpose;
        if (aMapLocationPurpose != null) {
            int ordinal = aMapLocationPurpose.ordinal();
            if (ordinal == 0) {
                this.h = AMapLocationMode.Hight_Accuracy;
                this.c = true;
                this.m = true;
                this.d = false;
                this.o = true;
                this.w = true;
                this.x = true;
                this.y = true;
                int i = F;
                if ((i & 1) == 0) {
                    this.D = true;
                    F = i | 1;
                    this.E = "signin";
                }
            } else {
                if (ordinal == 1) {
                    int i2 = F;
                    if ((i2 & 2) == 0) {
                        this.D = true;
                        F = i2 | 2;
                        this.E = "transport";
                    }
                    this.h = AMapLocationMode.Hight_Accuracy;
                    this.c = false;
                    this.m = false;
                    this.j = true;
                    this.v = false;
                    this.w = true;
                    this.x = true;
                    this.y = true;
                    this.d = false;
                    return this;
                }
                if (ordinal == 2) {
                    int i3 = F;
                    if ((i3 & 4) == 0) {
                        this.D = true;
                        F = i3 | 4;
                        this.E = "sport";
                    }
                    this.h = AMapLocationMode.Hight_Accuracy;
                    this.c = false;
                    this.m = false;
                    this.j = true;
                    this.v = false;
                    this.w = true;
                    this.x = true;
                    this.y = true;
                    this.d = false;
                    return this;
                }
            }
        }
        return this;
    }

    public AMapLocationClientOption setMockEnable(boolean z) {
        this.d = z;
        return this;
    }

    public AMapLocationClientOption setNeedAddress(boolean z) {
        this.e = z;
        return this;
    }

    public void setNoLocReqCgiEnable(boolean z) {
        this.x = z;
    }

    public AMapLocationClientOption setOffset(boolean z) {
        this.k = z;
        return this;
    }

    public AMapLocationClientOption setOnceLocation(boolean z) {
        this.c = z;
        return this;
    }

    public AMapLocationClientOption setOnceLocationLatest(boolean z) {
        this.m = z;
        return this;
    }

    public void setSelfStartServiceEnable(boolean z) {
        this.w = z;
    }

    public AMapLocationClientOption setSensorEnable(boolean z) {
        this.n = z;
        return this;
    }

    public void setSysNetworkLocEnable(boolean z) {
        this.y = z;
    }

    public AMapLocationClientOption setWifiScan(boolean z) {
        this.o = z;
        if (z) {
            this.f = this.g;
            return this;
        }
        this.f = false;
        return this;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("interval:");
        sb.append(String.valueOf(this.f2010a)).append("#isOnceLocation:");
        sb.append(String.valueOf(this.c)).append("#locationMode:");
        sb.append(String.valueOf(this.h)).append("#locationProtocol:");
        sb.append(String.valueOf(G)).append("#isMockEnable:");
        sb.append(String.valueOf(this.d)).append("#isKillProcess:");
        sb.append(String.valueOf(this.i)).append("#isGpsFirst:");
        sb.append(String.valueOf(this.j)).append("#isBeidouFirst:");
        sb.append(String.valueOf(this.v)).append("#isSelfStartServiceEnable:");
        sb.append(String.valueOf(this.w)).append("#noLocReqCgiEnable:");
        sb.append(String.valueOf(this.x)).append("#sysNetworkLocEnable:");
        sb.append(String.valueOf(this.y)).append("#isLBSLocationEnable:");
        sb.append(String.valueOf(this.z)).append("#isNeedAddress:");
        sb.append(String.valueOf(this.e)).append("#isWifiActiveScan:");
        sb.append(String.valueOf(this.f)).append("#wifiScan:");
        sb.append(String.valueOf(this.o)).append("#httpTimeOut:");
        sb.append(String.valueOf(this.b)).append("#isLocationCacheEnable:");
        sb.append(String.valueOf(this.l)).append("#isOnceLocationLatest:");
        sb.append(String.valueOf(this.m)).append("#sensorEnable:");
        sb.append(String.valueOf(this.n)).append("#geoLanguage:");
        sb.append(String.valueOf(this.r)).append("#locationPurpose:");
        sb.append(String.valueOf(this.C)).append("#callback:");
        sb.append(String.valueOf(this.s)).append("#time:");
        sb.append(String.valueOf(this.t)).append("#auuid:");
        sb.append(String.valueOf(this.A)).append("#");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2010a);
        parcel.writeLong(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
        AMapLocationMode aMapLocationMode = this.h;
        parcel.writeInt(aMapLocationMode == null ? -1 : aMapLocationMode.ordinal());
        parcel.writeByte(this.i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.v ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.w ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.x ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.y ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.z ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.n ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.o ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.p);
        parcel.writeInt(G == null ? -1 : getLocationProtocol().ordinal());
        GeoLanguage geoLanguage = this.r;
        parcel.writeInt(geoLanguage == null ? -1 : geoLanguage.ordinal());
        parcel.writeFloat(this.B);
        AMapLocationPurpose aMapLocationPurpose = this.C;
        parcel.writeInt(aMapLocationPurpose != null ? aMapLocationPurpose.ordinal() : -1);
        parcel.writeInt(OPEN_ALWAYS_SCAN_WIFI ? 1 : 0);
        parcel.writeLong(this.f2011q);
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public AMapLocationClientOption m6870clone() {
        try {
            super.clone();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        AMapLocationClientOption aMapLocationClientOption = new AMapLocationClientOption();
        aMapLocationClientOption.f2010a = this.f2010a;
        aMapLocationClientOption.c = this.c;
        aMapLocationClientOption.h = this.h;
        aMapLocationClientOption.d = this.d;
        aMapLocationClientOption.i = this.i;
        aMapLocationClientOption.j = this.j;
        aMapLocationClientOption.e = this.e;
        aMapLocationClientOption.f = this.f;
        aMapLocationClientOption.b = this.b;
        aMapLocationClientOption.k = this.k;
        aMapLocationClientOption.l = this.l;
        aMapLocationClientOption.m = this.m;
        aMapLocationClientOption.n = isSensorEnable();
        aMapLocationClientOption.o = isWifiScan();
        aMapLocationClientOption.p = this.p;
        setLocationProtocol(getLocationProtocol());
        aMapLocationClientOption.r = this.r;
        setDownloadCoordinateConvertLibrary(isDownloadCoordinateConvertLibrary());
        aMapLocationClientOption.B = this.B;
        aMapLocationClientOption.C = this.C;
        setOpenAlwaysScanWifi(isOpenAlwaysScanWifi());
        setScanWifiInterval(getScanWifiInterval());
        aMapLocationClientOption.f2011q = this.f2011q;
        aMapLocationClientOption.u = getCacheTimeOut();
        aMapLocationClientOption.s = getCacheCallBack();
        aMapLocationClientOption.t = getCacheCallBackTime();
        aMapLocationClientOption.w = isSelfStartServiceEnable();
        aMapLocationClientOption.x = isNoLocReqCgiEnable();
        aMapLocationClientOption.y = isSysNetworkLocEnable();
        aMapLocationClientOption.z = isLBSLocationEnable();
        aMapLocationClientOption.A = this.A;
        return aMapLocationClientOption;
    }

    protected AMapLocationClientOption(Parcel parcel) {
        this.f2010a = 2000L;
        this.b = CoreUtil.iTo;
        this.c = false;
        this.d = true;
        this.e = false;
        this.f = true;
        this.g = true;
        AMapLocationMode aMapLocationMode = AMapLocationMode.Hight_Accuracy;
        this.h = aMapLocationMode;
        this.i = false;
        this.j = false;
        this.k = true;
        this.l = true;
        this.m = false;
        this.n = false;
        this.o = true;
        this.p = 30000L;
        this.f2011q = 30000L;
        GeoLanguage geoLanguage = GeoLanguage.DEFAULT;
        this.r = geoLanguage;
        this.s = false;
        this.t = 1500;
        this.u = 21600000;
        this.v = false;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = "";
        this.B = 0.0f;
        this.C = null;
        this.D = false;
        this.E = null;
        this.f2010a = parcel.readLong();
        this.b = parcel.readLong();
        this.c = parcel.readByte() != 0;
        this.d = parcel.readByte() != 0;
        this.e = parcel.readByte() != 0;
        this.f = parcel.readByte() != 0;
        this.g = parcel.readByte() != 0;
        int readInt = parcel.readInt();
        this.h = readInt != -1 ? AMapLocationMode.values()[readInt] : aMapLocationMode;
        this.i = parcel.readByte() != 0;
        this.j = parcel.readByte() != 0;
        this.v = parcel.readByte() != 0;
        this.w = parcel.readByte() != 0;
        this.x = parcel.readByte() != 0;
        this.y = parcel.readByte() != 0;
        this.z = parcel.readByte() != 0;
        this.k = parcel.readByte() != 0;
        this.l = parcel.readByte() != 0;
        this.m = parcel.readByte() != 0;
        this.n = parcel.readByte() != 0;
        this.o = parcel.readByte() != 0;
        this.p = parcel.readLong();
        int readInt2 = parcel.readInt();
        G = readInt2 == -1 ? AMapLocationProtocol.HTTP : AMapLocationProtocol.values()[readInt2];
        int readInt3 = parcel.readInt();
        this.r = readInt3 != -1 ? GeoLanguage.values()[readInt3] : geoLanguage;
        this.B = parcel.readFloat();
        int readInt4 = parcel.readInt();
        this.C = readInt4 != -1 ? AMapLocationPurpose.values()[readInt4] : null;
        OPEN_ALWAYS_SCAN_WIFI = parcel.readByte() != 0;
        this.f2011q = parcel.readLong();
    }
}
