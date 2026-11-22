package com.baidu.location;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.location.Address;
import com.baidu.location.h.i;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes13.dex */
public final class BDLocation implements Parcelable {
    public static final String BDLOCATION_BD09LL_TO_GCJ02 = "bd09ll2gcj";
    public static final String BDLOCATION_BD09_TO_GCJ02 = "bd092gcj";
    public static final String BDLOCATION_COOR_TYPE_BD09LL = "bd09";
    public static final String BDLOCATION_COOR_TYPE_BD09MC = "bd09mc";
    public static final String BDLOCATION_COOR_TYPE_GCJ02 = "gcj02";
    public static final String BDLOCATION_COOR_TYPE_GCJ03 = "gcj03";
    public static final String BDLOCATION_COOR_TYPE_WGS84 = "wgs84";
    public static final String BDLOCATION_GCJ02_TO_BD09 = "bd09";
    public static final String BDLOCATION_GCJ02_TO_BD09LL = "bd09ll";
    public static final String BDLOCATION_GNSS_PROVIDER_FROM_BAIDU_BEIDOU = "bd_beidou";
    public static final String BDLOCATION_GNSS_PROVIDER_FROM_SYSTEM = "system";
    public static final String BDLOCATION_WGS84_TO_GCJ02 = "gps2gcj";
    public static final Parcelable.Creator<BDLocation> CREATOR = new Parcelable.Creator<BDLocation>() { // from class: com.baidu.location.BDLocation.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BDLocation createFromParcel(Parcel parcel) {
            return new BDLocation(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public BDLocation[] newArray(int i) {
            return new BDLocation[i];
        }
    };
    public static final int GNSS_ACCURACY_BAD = 3;
    public static final int GNSS_ACCURACY_GOOD = 1;
    public static final int GNSS_ACCURACY_MID = 2;
    public static final int GNSS_ACCURACY_UNKNOWN = 0;
    public static final int GPS_ACCURACY_BAD = 3;
    public static final int GPS_ACCURACY_GOOD = 1;
    public static final int GPS_ACCURACY_MID = 2;
    public static final int GPS_ACCURACY_UNKNOWN = 0;
    public static final int GPS_RECTIFY_INDOOR = 1;
    public static final int GPS_RECTIFY_NONE = 0;
    public static final int GPS_RECTIFY_OUTDOOR = 2;
    public static final int INDOOR_LOCATION_NEARBY_SURPPORT_TRUE = 2;
    public static final int INDOOR_LOCATION_SOURCE_BLUETOOTH = 4;
    public static final int INDOOR_LOCATION_SOURCE_MAGNETIC = 2;
    public static final int INDOOR_LOCATION_SOURCE_SMALLCELLSTATION = 8;
    public static final int INDOOR_LOCATION_SOURCE_UNKNOWN = 0;
    public static final int INDOOR_LOCATION_SOURCE_WIFI = 1;
    public static final int INDOOR_LOCATION_SURPPORT_FALSE = 0;
    public static final int INDOOR_LOCATION_SURPPORT_TRUE = 1;
    public static final int INDOOR_NETWORK_STATE_HIGH = 2;
    public static final int INDOOR_NETWORK_STATE_LOW = 0;
    public static final int INDOOR_NETWORK_STATE_MIDDLE = 1;
    public static final int LOCATION_WHERE_IN_CN = 1;
    public static final int LOCATION_WHERE_OUT_CN = 0;
    public static final int LOCATION_WHERE_UNKNOW = 2;
    public static final int MOCK_GNSS_PROBABILITY_HIGH = 3;
    public static final int MOCK_GNSS_PROBABILITY_LOW = 1;
    public static final int MOCK_GNSS_PROBABILITY_MIDDLE = 2;
    public static final int MOCK_GNSS_PROBABILITY_UNKNOW = -1;
    public static final int MOCK_GNSS_PROBABILITY_ZERO = 0;
    public static final int MOCK_GPS_PROBABILITY_HIGH = 3;
    public static final int MOCK_GPS_PROBABILITY_LOW = 1;
    public static final int MOCK_GPS_PROBABILITY_MIDDLE = 2;
    public static final int MOCK_GPS_PROBABILITY_UNKNOW = -1;
    public static final int MOCK_GPS_PROBABILITY_ZERO = 0;
    public static final int OPERATORS_TYPE_MOBILE = 1;
    public static final int OPERATORS_TYPE_TELECOMU = 3;
    public static final int OPERATORS_TYPE_UNICOM = 2;
    public static final int OPERATORS_TYPE_UNKONW = 0;
    public static final int TYPE_BMS_HD_LOCATION = 602;
    public static final int TYPE_CLOSE_LOCATION_SERVICE_SWITCH_FAIL = 69;
    public static final int TYPE_HD_LOCATION = 601;
    public static final int TYPE_LANE_HD_LOCATION = 603;
    public static final int TYPE_NO_PERMISSION_AND_CLOSE_SWITCH_FAIL = 71;
    public static final int TYPE_NO_PERMISSION_LOCATION_FAIL = 70;
    public static final int TypeCacheLocation = 65;
    public static final int TypeCoarseLocation = 160;
    public static final int TypeCriteriaException = 62;
    public static final int TypeGnssLocation = 61;
    public static final int TypeGpsLocation = 61;
    public static final int TypeNetWorkException = 63;
    public static final int TypeNetWorkLocation = 161;
    public static final int TypeNone = 0;
    public static final int TypeOffLineLocation = 66;
    public static final int TypeOffLineLocationFail = 67;
    public static final int TypeOffLineLocationNetworkFail = 68;
    public static final int TypeServerCheckFlowError = 506;
    public static final int TypeServerCheckKeyError = 505;
    public static final int TypeServerDecryptError = 162;
    public static final int TypeServerError = 167;
    public static final int USER_INDDOR_TRUE = 1;
    public static final int USER_INDOOR_FALSE = 0;
    public static final int USER_INDOOR_UNKNOW = -1;
    private String A;
    private String B;
    private String C;
    private double D;
    private boolean E;
    private int F;
    private int G;
    private String H;
    private int I;
    private String J;
    private int K;
    private int L;
    private int M;
    private int N;
    private String O;
    private String P;
    private String Q;
    private int R;
    private List<Poi> S;
    private String T;
    private String U;
    private String V;
    private Bundle W;
    private int X;
    private int Y;
    private long Z;

    /* renamed from: a, reason: collision with root package name */
    private int f7503a;
    private String aa;
    private String ab;
    private double ac;
    private double ad;
    private boolean ae;
    private PoiRegion af;
    private float ag;
    private double ah;

    /* renamed from: ai, reason: collision with root package name */
    private int f7504ai;
    private int aj;
    private BDLocation ak;
    private Bundle al;
    private String am;
    private long an;
    private String b;
    private double c;
    private double d;
    private boolean e;
    private double f;
    private boolean g;
    private float h;
    private boolean i;
    private float j;
    private String k;
    private float l;
    private int m;
    private float n;
    private boolean o;
    private int p;

    /* renamed from: q, reason: collision with root package name */
    private float f7505q;
    private String r;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private boolean y;
    private Address z;

    public BDLocation() {
        this.f7503a = 0;
        this.b = null;
        this.c = Double.MIN_VALUE;
        this.d = Double.MIN_VALUE;
        this.e = false;
        this.f = Double.MIN_VALUE;
        this.g = false;
        this.h = 0.0f;
        this.i = false;
        this.j = 0.0f;
        this.l = 0.0f;
        this.m = -1;
        this.n = 0.0f;
        this.o = false;
        this.p = -1;
        this.f7505q = -1.0f;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.aa = null;
        this.ab = null;
        this.ac = Double.MIN_VALUE;
        this.ad = Double.MIN_VALUE;
        this.ae = false;
        this.af = null;
        this.ag = -1.0f;
        this.ah = -1.0d;
        this.f7504ai = 0;
        this.aj = -1;
        this.al = null;
        this.am = null;
        this.an = -1L;
    }

    private BDLocation(Parcel parcel) {
        this.f7503a = 0;
        this.b = null;
        this.c = Double.MIN_VALUE;
        this.d = Double.MIN_VALUE;
        this.e = false;
        this.f = Double.MIN_VALUE;
        this.g = false;
        this.h = 0.0f;
        this.i = false;
        this.j = 0.0f;
        this.l = 0.0f;
        this.m = -1;
        this.n = 0.0f;
        this.o = false;
        this.p = -1;
        this.f7505q = -1.0f;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.aa = null;
        this.ab = null;
        this.ac = Double.MIN_VALUE;
        this.ad = Double.MIN_VALUE;
        this.ae = false;
        this.af = null;
        this.ag = -1.0f;
        this.ah = -1.0d;
        this.f7504ai = 0;
        this.aj = -1;
        this.al = null;
        this.am = null;
        this.an = -1L;
        this.f7503a = parcel.readInt();
        this.b = parcel.readString();
        this.an = parcel.readLong();
        this.c = parcel.readDouble();
        this.d = parcel.readDouble();
        this.f = parcel.readDouble();
        this.h = parcel.readFloat();
        this.j = parcel.readFloat();
        this.k = parcel.readString();
        this.l = parcel.readFloat();
        this.m = parcel.readInt();
        this.n = parcel.readFloat();
        this.p = parcel.readInt();
        this.f7505q = parcel.readFloat();
        this.A = parcel.readString();
        this.F = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readString();
        this.D = parcel.readDouble();
        this.H = parcel.readString();
        String readString = parcel.readString();
        String readString2 = parcel.readString();
        String readString3 = parcel.readString();
        String readString4 = parcel.readString();
        String readString5 = parcel.readString();
        String readString6 = parcel.readString();
        parcel.readString();
        String readString7 = parcel.readString();
        String readString8 = parcel.readString();
        String readString9 = parcel.readString();
        String readString10 = parcel.readString();
        this.z = new Address.Builder().country(readString7).countryCode(readString8).province(readString).city(readString2).cityCode(readString6).district(readString3).street(readString4).streetNumber(readString5).adcode(readString9).town(readString10).townCode(parcel.readString()).build();
        boolean[] zArr = new boolean[8];
        this.I = parcel.readInt();
        this.J = parcel.readString();
        this.v = parcel.readString();
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.G = parcel.readInt();
        this.T = parcel.readString();
        this.K = parcel.readInt();
        this.L = parcel.readInt();
        this.M = parcel.readInt();
        this.N = parcel.readInt();
        this.O = parcel.readString();
        this.P = parcel.readString();
        this.Q = parcel.readString();
        this.R = parcel.readInt();
        this.X = parcel.readInt();
        this.U = parcel.readString();
        this.Y = parcel.readInt();
        this.V = parcel.readString();
        this.aa = parcel.readString();
        this.ab = parcel.readString();
        this.Z = parcel.readLong();
        this.ac = parcel.readDouble();
        this.ad = parcel.readDouble();
        this.ag = parcel.readFloat();
        this.ah = parcel.readDouble();
        this.f7504ai = parcel.readInt();
        this.aj = parcel.readInt();
        this.r = parcel.readString();
        this.am = parcel.readString();
        this.u = parcel.readString();
        try {
            this.ak = (BDLocation) parcel.readParcelable(BDLocation.class.getClassLoader());
        } catch (Exception e) {
            this.ak = null;
            e.printStackTrace();
        }
        try {
            parcel.readBooleanArray(zArr);
            this.e = zArr[0];
            this.g = zArr[1];
            this.i = zArr[2];
            this.o = zArr[3];
            this.s = zArr[4];
            this.y = zArr[5];
            this.E = zArr[6];
            this.ae = zArr[7];
        } catch (Exception unused) {
        }
        ArrayList arrayList = new ArrayList();
        try {
            parcel.readList(arrayList, Poi.class.getClassLoader());
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (arrayList.size() == 0) {
            this.S = null;
        } else {
            this.S = arrayList;
        }
        try {
            this.W = parcel.readBundle();
        } catch (Exception e3) {
            e3.printStackTrace();
            this.W = new Bundle();
        }
        try {
            this.al = parcel.readBundle();
        } catch (Exception e4) {
            e4.printStackTrace();
            this.al = new Bundle();
        }
        try {
            this.af = (PoiRegion) parcel.readParcelable(PoiRegion.class.getClassLoader());
        } catch (Exception e5) {
            this.af = null;
            e5.printStackTrace();
        }
    }

    public BDLocation(BDLocation bDLocation) {
        this.f7503a = 0;
        ArrayList arrayList = null;
        this.b = null;
        this.c = Double.MIN_VALUE;
        this.d = Double.MIN_VALUE;
        this.e = false;
        this.f = Double.MIN_VALUE;
        this.g = false;
        this.h = 0.0f;
        this.i = false;
        this.j = 0.0f;
        this.l = 0.0f;
        this.m = -1;
        this.n = 0.0f;
        this.o = false;
        this.p = -1;
        this.f7505q = -1.0f;
        this.r = null;
        this.s = false;
        this.t = null;
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = false;
        this.z = new Address.Builder().build();
        this.A = null;
        this.B = null;
        this.C = null;
        this.E = false;
        this.F = 0;
        this.G = 1;
        this.H = null;
        this.J = "";
        this.K = -1;
        this.L = 0;
        this.M = 2;
        this.N = 0;
        this.O = null;
        this.P = null;
        this.Q = null;
        this.R = -1;
        this.S = null;
        this.T = null;
        this.U = null;
        this.V = null;
        this.W = new Bundle();
        this.X = 0;
        this.Y = 0;
        this.Z = 0L;
        this.aa = null;
        this.ab = null;
        this.ac = Double.MIN_VALUE;
        this.ad = Double.MIN_VALUE;
        this.ae = false;
        this.af = null;
        this.ag = -1.0f;
        this.ah = -1.0d;
        this.f7504ai = 0;
        this.aj = -1;
        this.al = null;
        this.am = null;
        this.an = -1L;
        this.f7503a = bDLocation.f7503a;
        this.b = bDLocation.b;
        this.an = bDLocation.an;
        this.c = bDLocation.c;
        this.d = bDLocation.d;
        this.e = bDLocation.e;
        this.f = bDLocation.f;
        this.g = bDLocation.g;
        this.h = bDLocation.h;
        this.i = bDLocation.i;
        this.j = bDLocation.j;
        this.k = bDLocation.k;
        this.l = bDLocation.l;
        this.m = bDLocation.m;
        this.n = bDLocation.n;
        this.o = bDLocation.o;
        this.p = bDLocation.p;
        this.f7505q = bDLocation.f7505q;
        this.r = bDLocation.r;
        this.s = bDLocation.s;
        this.t = bDLocation.t;
        this.y = bDLocation.y;
        this.z = new Address.Builder().country(bDLocation.z.country).countryCode(bDLocation.z.countryCode).province(bDLocation.z.province).city(bDLocation.z.city).cityCode(bDLocation.z.cityCode).district(bDLocation.z.district).street(bDLocation.z.street).streetNumber(bDLocation.z.streetNumber).adcode(bDLocation.z.adcode).town(bDLocation.z.town).townCode(bDLocation.z.townCode).build();
        this.A = bDLocation.A;
        this.B = bDLocation.B;
        this.C = bDLocation.C;
        this.D = bDLocation.D;
        this.G = bDLocation.G;
        this.F = bDLocation.F;
        this.E = bDLocation.E;
        this.H = bDLocation.H;
        this.I = bDLocation.I;
        this.J = bDLocation.J;
        this.v = bDLocation.v;
        this.w = bDLocation.w;
        this.x = bDLocation.x;
        this.K = bDLocation.K;
        this.L = bDLocation.L;
        this.M = bDLocation.L;
        this.N = bDLocation.N;
        this.O = bDLocation.O;
        this.P = bDLocation.P;
        this.Q = bDLocation.Q;
        this.R = bDLocation.R;
        this.X = bDLocation.X;
        this.V = bDLocation.V;
        this.aa = bDLocation.aa;
        this.ab = bDLocation.ab;
        this.ac = bDLocation.ac;
        this.ad = bDLocation.ad;
        this.Z = bDLocation.Z;
        this.ah = bDLocation.ah;
        this.f7504ai = bDLocation.f7504ai;
        this.aj = bDLocation.aj;
        this.ak = bDLocation.ak;
        this.U = bDLocation.U;
        if (bDLocation.S != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < bDLocation.S.size(); i++) {
                Poi poi = bDLocation.S.get(i);
                arrayList.add(new Poi(poi.getId(), poi.getName(), poi.getRank(), poi.getTags(), poi.getAddr()));
            }
        }
        this.S = arrayList;
        this.T = bDLocation.T;
        this.W = bDLocation.W;
        this.Y = bDLocation.Y;
        this.ae = bDLocation.ae;
        this.af = bDLocation.af;
        this.ag = bDLocation.ag;
        this.al = bDLocation.al;
        this.am = bDLocation.am;
        this.u = bDLocation.u;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x04e8 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0501 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0520 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0539 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0552 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x056b A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x057b A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x067d A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0691 A[Catch: Exception -> 0x06a1, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x06a5 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x06b6 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x06c6 A[Catch: Exception -> 0x079c, Error -> 0x079f, TRY_LEAVE, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x06f8 A[Catch: all -> 0x06fb, TRY_LEAVE, TryCatch #15 {all -> 0x06fb, blocks: (B:171:0x06d0, B:173:0x06d6, B:175:0x06dc, B:177:0x06e0, B:179:0x06f8), top: B:170:0x06d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0740 A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0707 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x06ab A[Catch: Exception -> 0x079c, Error -> 0x079f, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x069d A[Catch: Exception -> 0x06a1, Error -> 0x079f, TRY_LEAVE, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0687 A[Catch: Exception -> 0x079c, Error -> 0x079f, TRY_LEAVE, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0494 A[Catch: Exception -> 0x0182, Error -> 0x079f, TRY_LEAVE, TryCatch #12 {Error -> 0x079f, blocks: (B:6:0x00b5, B:8:0x00b7, B:12:0x00ea, B:14:0x0142, B:15:0x014b, B:31:0x0153, B:18:0x015c, B:20:0x0162, B:28:0x016e, B:21:0x0172, B:23:0x0176, B:26:0x017d, B:36:0x018b, B:38:0x01bc, B:39:0x01c3, B:41:0x01c9, B:42:0x01d4, B:44:0x01da, B:45:0x01e1, B:47:0x01e7, B:48:0x01f2, B:51:0x01fc, B:53:0x020a, B:55:0x0216, B:56:0x0219, B:57:0x021b, B:59:0x0223, B:60:0x0236, B:62:0x023c, B:64:0x025a, B:65:0x0265, B:67:0x026b, B:69:0x0274, B:74:0x0281, B:75:0x0283, B:77:0x028b, B:79:0x0297, B:80:0x0299, B:82:0x02a1, B:84:0x02af, B:85:0x02ba, B:87:0x02c2, B:88:0x02cd, B:90:0x02d5, B:91:0x02e0, B:93:0x02e8, B:94:0x02f3, B:96:0x02fb, B:97:0x0306, B:103:0x030f, B:105:0x0317, B:107:0x0323, B:108:0x0325, B:251:0x032d, B:254:0x0338, B:256:0x0340, B:257:0x0348, B:259:0x0350, B:260:0x0358, B:262:0x0360, B:263:0x0368, B:265:0x0370, B:266:0x0378, B:268:0x0380, B:269:0x0388, B:271:0x0390, B:272:0x0398, B:274:0x03a0, B:275:0x03a8, B:277:0x03b2, B:278:0x03bd, B:280:0x03c5, B:281:0x03d0, B:283:0x03d8, B:284:0x03e3, B:286:0x03eb, B:289:0x0494, B:113:0x04e0, B:115:0x04e8, B:117:0x04f6, B:118:0x04f9, B:120:0x0501, B:122:0x050d, B:123:0x0518, B:125:0x0520, B:127:0x052e, B:128:0x0531, B:130:0x0539, B:132:0x0547, B:133:0x054a, B:135:0x0552, B:137:0x0560, B:138:0x0563, B:140:0x056b, B:141:0x0573, B:143:0x057b, B:145:0x0587, B:146:0x058b, B:149:0x0594, B:150:0x059e, B:204:0x05a6, B:206:0x05b4, B:208:0x05c4, B:211:0x05cc, B:212:0x05cf, B:214:0x05d7, B:215:0x05e8, B:217:0x05f0, B:218:0x05f8, B:220:0x0600, B:221:0x0608, B:223:0x0610, B:224:0x0619, B:234:0x0621, B:236:0x0631, B:238:0x063b, B:240:0x063f, B:226:0x064f, B:228:0x0657, B:230:0x0663, B:231:0x0667, B:232:0x066c, B:152:0x0675, B:154:0x067d, B:156:0x068b, B:158:0x0691, B:200:0x069d, B:159:0x06a1, B:161:0x06a5, B:162:0x06ae, B:164:0x06b6, B:165:0x06be, B:167:0x06c6, B:182:0x06fc, B:183:0x06ff, B:185:0x0738, B:187:0x0740, B:198:0x0734, B:199:0x06ab, B:202:0x0687, B:249:0x0672, B:302:0x0401, B:304:0x040c, B:374:0x0413, B:368:0x041d, B:315:0x0429, B:320:0x0434, B:325:0x043e, B:330:0x0448, B:335:0x0452, B:340:0x0460, B:345:0x0481, B:112:0x04da, B:391:0x0759, B:394:0x075e), top: B:5:0x00b5 }] */
    /* JADX WARN: Removed duplicated region for block: B:290:0x04d1  */
    /* JADX WARN: Type inference failed for: r2v129 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public BDLocation(java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1967
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.location.BDLocation.<init>(java.lang.String):void");
    }

    private void a(Boolean bool) {
        this.y = bool.booleanValue();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getAcc() {
        return this.D;
    }

    public String getAdCode() {
        return this.z.adcode;
    }

    public String getAddrStr() {
        return this.z.address;
    }

    public Address getAddress() {
        return this.z;
    }

    public double getAltitude() {
        return this.f;
    }

    public String getBuildingID() {
        return this.B;
    }

    public String getBuildingName() {
        return this.C;
    }

    public String getCity() {
        return this.z.city;
    }

    public String getCityCode() {
        return this.z.cityCode;
    }

    public String getCoorType() {
        return this.r;
    }

    public String getCountry() {
        return this.z.country;
    }

    public String getCountryCode() {
        return this.z.countryCode;
    }

    public long getDelayTime() {
        return this.Z;
    }

    @Deprecated
    public float getDerect() {
        return this.f7505q;
    }

    public float getDirection() {
        return this.f7505q;
    }

    public double getDisToRealLocation() {
        return this.ah;
    }

    public String getDistrict() {
        return this.z.district;
    }

    public Bundle getExtraInfo() {
        return this.al;
    }

    public Location getExtraLocation(String str) {
        Bundle bundle = this.W;
        if (bundle == null) {
            return null;
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (parcelable instanceof Location) {
            return (Location) parcelable;
        }
        return null;
    }

    public String getFloor() {
        return this.A;
    }

    public double[] getFusionLocInfo(String str) {
        return this.W.getDoubleArray(str);
    }

    public int getGnssAccuracyStatus() {
        return this.X;
    }

    public float getGnssBiasProb() {
        return this.ag;
    }

    public int getGnssCheckStatus() {
        return this.Y;
    }

    public String getGnssProvider() {
        return this.am;
    }

    @Deprecated
    public int getGpsAccuracyStatus() {
        return this.X;
    }

    @Deprecated
    public float getGpsBiasProb() {
        return this.ag;
    }

    @Deprecated
    public int getGpsCheckStatus() {
        return this.Y;
    }

    public int getInOutStatus() {
        return this.R;
    }

    public int getIndoorLocationSource() {
        return this.N;
    }

    public int getIndoorLocationSurpport() {
        return this.L;
    }

    public String getIndoorLocationSurpportBuidlingID() {
        return this.P;
    }

    public String getIndoorLocationSurpportBuidlingName() {
        return this.O;
    }

    public int getIndoorNetworkState() {
        return this.M;
    }

    public String getIndoorSurpportPolygon() {
        return this.Q;
    }

    public double getLatitude() {
        return this.c;
    }

    public int getLocType() {
        return this.f7503a;
    }

    public String getLocTypeDescription() {
        return this.T;
    }

    public String getLocationDescribe() {
        return this.v;
    }

    public String getLocationID() {
        return this.U;
    }

    public int getLocationWhere() {
        return this.G;
    }

    public double getLongitude() {
        return this.d;
    }

    public int getMockGnssProbability() {
        return this.aj;
    }

    public int getMockGnssStrategy() {
        return this.f7504ai;
    }

    @Deprecated
    public int getMockGpsProbability() {
        return this.aj;
    }

    @Deprecated
    public int getMockGpsStrategy() {
        return this.f7504ai;
    }

    public String getNetworkLocationType() {
        return this.H;
    }

    public double getNrlLat() {
        return this.ac;
    }

    public double getNrlLon() {
        return this.ad;
    }

    public String getNrlResult() {
        return this.aa;
    }

    @Deprecated
    public int getOperators() {
        return this.I;
    }

    public List<Poi> getPoiList() {
        return this.S;
    }

    public PoiRegion getPoiRegion() {
        return this.af;
    }

    public String getProvince() {
        return this.z.province;
    }

    public float getRadius() {
        return this.j;
    }

    public BDLocation getReallLocation() {
        if (getMockGpsStrategy() > 0) {
            return this.ak;
        }
        return null;
    }

    public String getRetFields(String str) {
        return this.W.getString(str);
    }

    public String getRoadLocString() {
        return this.V;
    }

    public int getSatelliteNumber() {
        this.o = true;
        return this.p;
    }

    @Deprecated
    public String getSemaAptag() {
        return this.v;
    }

    public String getSemanticParams() {
        return this.u;
    }

    public float getSpeed() {
        return this.h;
    }

    public String getStreet() {
        return this.z.street;
    }

    public String getStreetNumber() {
        return this.z.streetNumber;
    }

    public String getTime() {
        return this.b;
    }

    public long getTimeStamp() {
        return this.an;
    }

    public String getTown() {
        return this.z.town;
    }

    public String getTownCode() {
        return this.z.townCode;
    }

    public String getTraffic() {
        return this.k;
    }

    public float getTrafficConfidence() {
        return this.l;
    }

    public float getTrafficSkipProb() {
        return this.n;
    }

    public int getUserIndoorState() {
        return this.K;
    }

    public String getVdrJsonString() {
        Bundle bundle = this.W;
        if (bundle == null || !bundle.containsKey("vdr")) {
            return null;
        }
        return this.W.getString("vdr");
    }

    public String getViaductResult() {
        return this.ab;
    }

    public boolean hasAddr() {
        return this.s;
    }

    public boolean hasAltitude() {
        return this.e;
    }

    public boolean hasRadius() {
        return this.i;
    }

    public boolean hasSateNumber() {
        return this.o;
    }

    public boolean hasSpeed() {
        return this.g;
    }

    public boolean isCellChangeFlag() {
        return this.y;
    }

    public boolean isInIndoorPark() {
        return this.ae;
    }

    public boolean isIndoorLocMode() {
        return this.E;
    }

    public boolean isNrlAvailable() {
        return (this.ad == Double.MIN_VALUE || this.ac == Double.MIN_VALUE) ? false : true;
    }

    public int isParkAvailable() {
        return this.F;
    }

    public int isTrafficStation() {
        return this.m;
    }

    public void setAcc(double d) {
        this.D = d;
    }

    public void setAddr(Address address) {
        if (address != null) {
            this.z = address;
            this.s = true;
        }
    }

    public void setAddrStr(String str) {
        this.t = str;
        this.s = str != null;
    }

    public void setAltitude(double d) {
        if (d < 9999.0d) {
            this.f = d;
            this.e = true;
        }
    }

    public void setBuildingID(String str) {
        this.B = str;
    }

    public void setBuildingName(String str) {
        this.C = str;
    }

    public void setCoorType(String str) {
        this.r = str;
    }

    public void setDelayTime(long j) {
        this.Z = j;
    }

    public void setDirection(float f) {
        this.f7505q = f;
    }

    public void setDisToRealLocation(double d) {
        this.ah = d;
    }

    public void setExtraLocation(String str, Location location) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putParcelable(str, location);
    }

    public void setExtrainfo(Bundle bundle) {
        this.al = bundle == null ? null : new Bundle(bundle);
    }

    public void setFloor(String str) {
        this.A = str;
    }

    public void setFusionLocInfo(String str, double[] dArr) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putDoubleArray(str, dArr);
    }

    public void setGnssAccuracyStatus(int i) {
        this.X = i;
    }

    public void setGnssBiasProb(float f) {
        this.ag = f;
    }

    public void setGnssCheckStatus(int i) {
        this.Y = i;
    }

    public void setGnssProvider(String str) {
        this.am = str;
    }

    @Deprecated
    public void setGpsAccuracyStatus(int i) {
        this.X = i;
    }

    @Deprecated
    public void setGpsBiasProb(float f) {
        this.ag = f;
    }

    @Deprecated
    public void setGpsCheckStatus(int i) {
        this.Y = i;
    }

    public void setInOutStatus(int i) {
        this.R = i;
    }

    public void setIndoorLocMode(boolean z) {
        this.E = z;
    }

    public void setIndoorLocationSource(int i) {
        this.N = i;
    }

    public void setIndoorLocationSurpport(int i) {
        this.L = i;
    }

    public void setIndoorNetworkState(int i) {
        this.M = i;
    }

    public void setIndoorSurpportPolygon(String str) {
        this.Q = str;
    }

    public void setIsInIndoorPark(boolean z) {
        this.ae = z;
    }

    public void setIsTrafficStation(int i) {
        this.m = i;
    }

    public void setLatitude(double d) {
        this.c = d;
    }

    public void setLocType(int i) {
        this.f7503a = i;
        if (i == 66) {
            setLocTypeDescription("Offline location successful!");
            return;
        }
        if (i != 67) {
            if (i == 167) {
                setLocTypeDescription("NetWork location failed because baidu location service can not caculate the location!");
                return;
            }
            if (i == 505) {
                setLocTypeDescription("NetWork location failed because baidu location service check the key is unlegal, please check the key in AndroidManifest.xml !");
                return;
            }
            switch (i) {
                case 61:
                    setLocTypeDescription("GPS location successful!");
                    setUserIndoorState(0);
                    setGnssProvider("system");
                    break;
                case 62:
                    setLocTypeDescription("Location failed beacuse we can not get any loc information!");
                    break;
                case 63:
                    break;
                default:
                    switch (i) {
                        case 69:
                            setLocTypeDescription("Location failed because the location service switch is not on");
                            break;
                        case 70:
                            setLocTypeDescription("Location failed because the location permission is not enabled");
                            break;
                        case 71:
                            setLocTypeDescription("Location failed because the location service switch is not on and the location permission is not enabled");
                            break;
                        default:
                            switch (i) {
                                case 160:
                                    setLocTypeDescription("Coarse location successful");
                                    break;
                                case 161:
                                    setLocTypeDescription("NetWork location successful!");
                                    break;
                                case 162:
                                    setLocTypeDescription("NetWork location failed because baidu location service can not decrypt the request query, please check the so file !");
                                    break;
                                default:
                                    setLocTypeDescription("UnKnown!");
                                    break;
                            }
                    }
            }
            return;
        }
        setLocTypeDescription("Offline location failed, please check the net (wifi/cell)!");
    }

    public void setLocTypeDescription(String str) {
        this.T = str;
    }

    public void setLocationDescribe(String str) {
        this.v = str;
    }

    public void setLocationID(String str) {
        this.U = str;
    }

    public void setLocationWhere(int i) {
        this.G = i;
    }

    public void setLongitude(double d) {
        this.d = d;
    }

    public void setMockGnssProbability(int i) {
        this.aj = i;
    }

    public void setMockGnssStrategy(int i) {
        this.f7504ai = i;
    }

    @Deprecated
    public void setMockGpsProbability(int i) {
        this.aj = i;
    }

    @Deprecated
    public void setMockGpsStrategy(int i) {
        this.f7504ai = i;
    }

    public void setNetworkLocationType(String str) {
        this.H = str;
    }

    public void setNrlData(String str) {
        this.aa = str;
    }

    public void setOperators(int i) {
        this.I = i;
    }

    public void setParkAvailable(int i) {
        this.F = i;
    }

    public void setPoiList(List<Poi> list) {
        this.S = list;
    }

    public void setPoiRegion(PoiRegion poiRegion) {
        this.af = poiRegion;
    }

    public void setRadius(float f) {
        this.j = f;
        this.i = true;
    }

    public void setReallLocation(BDLocation bDLocation) {
        if (getMockGpsStrategy() > 0) {
            this.ak = bDLocation;
        }
    }

    public void setRetFields(String str, String str2) {
        if (this.W == null) {
            this.W = new Bundle();
        }
        this.W.putString(str, str2);
    }

    public void setRoadLocString(float f, float f2, String str, String str2) {
        String str3;
        String format = ((double) f) > 0.001d ? String.format("%.2f", Float.valueOf(f)) : "";
        String format2 = ((double) f2) > 0.001d ? String.format("%.2f", Float.valueOf(f2)) : "";
        if (this.aa != null) {
            str3 = String.format(Locale.US, "%s|%s,%s", this.aa, format, format2);
            if (this.ab != null) {
                str3 = String.format(Locale.US, "%s|%s", str3, this.ab);
            }
        } else {
            str3 = null;
        }
        if (str == null) {
            str = str3;
        } else if (str3 != null) {
            str = String.format(Locale.US, "%s|%s", str3, str);
        }
        if (str2 == null) {
            str2 = str;
        } else if (str != null) {
            str2 = String.format(Locale.US, "%s|%s", str, str2);
        }
        this.V = str2;
    }

    public void setSatelliteNumber(int i) {
        this.p = i;
    }

    public void setSemanticParams(String str) {
        this.u = str;
    }

    public void setSpeed(float f) {
        this.h = f;
        this.g = true;
    }

    public void setTime(String str) {
        this.b = str;
        setLocationID(i.a(str));
    }

    public void setTimeStamp(long j) {
        this.an = j;
    }

    public void setTraffic(String str) {
        this.k = str;
    }

    public void setTrafficConfidence(float f) {
        this.l = f;
    }

    public void setTrafficSkipProb(float f) {
        this.n = f;
    }

    public void setUserIndoorState(int i) {
        this.K = i;
    }

    public void setVdrJsonValue(String str) {
        try {
            if (this.W == null) {
                this.W = new Bundle();
            }
            this.W.putString("vdr", str);
        } catch (Exception unused) {
        }
    }

    public void setViaductData(String str) {
        this.ab = str;
    }

    public String toString() {
        return "&loctype=" + getLocType() + "&lat=" + getLatitude() + "&lon=" + getLongitude() + "&radius=" + getRadius() + "&biasprob=" + getGpsBiasProb() + "&altitude=" + getAltitude() + "&speed=" + getSpeed() + "&time=" + getTimeStamp() + "&extrainfo=" + getExtraInfo();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f7503a);
        parcel.writeString(this.b);
        parcel.writeLong(this.an);
        parcel.writeDouble(this.c);
        parcel.writeDouble(this.d);
        parcel.writeDouble(this.f);
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.j);
        parcel.writeString(this.k);
        parcel.writeFloat(this.l);
        parcel.writeInt(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.p);
        parcel.writeFloat(this.f7505q);
        parcel.writeString(this.A);
        parcel.writeInt(this.F);
        parcel.writeString(this.B);
        parcel.writeString(this.C);
        parcel.writeDouble(this.D);
        parcel.writeString(this.H);
        parcel.writeString(this.z.province);
        parcel.writeString(this.z.city);
        parcel.writeString(this.z.district);
        parcel.writeString(this.z.street);
        parcel.writeString(this.z.streetNumber);
        parcel.writeString(this.z.cityCode);
        parcel.writeString(this.z.address);
        parcel.writeString(this.z.country);
        parcel.writeString(this.z.countryCode);
        parcel.writeString(this.z.adcode);
        parcel.writeString(this.z.town);
        parcel.writeString(this.z.townCode);
        parcel.writeInt(this.I);
        parcel.writeString(this.J);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.G);
        parcel.writeString(this.T);
        parcel.writeInt(this.K);
        parcel.writeInt(this.L);
        parcel.writeInt(this.M);
        parcel.writeInt(this.N);
        parcel.writeString(this.O);
        parcel.writeString(this.P);
        parcel.writeString(this.Q);
        parcel.writeInt(this.R);
        parcel.writeInt(this.X);
        parcel.writeString(this.U);
        parcel.writeInt(this.Y);
        parcel.writeString(this.V);
        parcel.writeString(this.aa);
        parcel.writeString(this.ab);
        parcel.writeLong(this.Z);
        parcel.writeDouble(this.ac);
        parcel.writeDouble(this.ad);
        parcel.writeFloat(this.ag);
        parcel.writeDouble(this.ah);
        parcel.writeInt(this.f7504ai);
        parcel.writeInt(this.aj);
        parcel.writeString(this.r);
        parcel.writeString(this.am);
        parcel.writeString(this.u);
        parcel.writeParcelable(this.ak, i);
        parcel.writeBooleanArray(new boolean[]{this.e, this.g, this.i, this.o, this.s, this.y, this.E, this.ae});
        parcel.writeList(this.S);
        parcel.writeBundle(this.W);
        parcel.writeBundle(this.al);
        parcel.writeParcelable(this.af, i);
    }
}
