package com.baidu.location.indoor;

import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.xiaomi.mipush.sdk.Constants;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Random;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class b {
    private double A;
    private boolean B;
    private double C;
    private boolean D;
    private boolean E;
    private int F;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private int L;
    private String M;
    private String N;
    private int Q;
    private String R;
    private int S;

    /* renamed from: a, reason: collision with root package name */
    public String f7734a;
    public String b;
    public double c;
    public double d;
    public double e;
    public double f;
    public String g;
    public String[] h;
    public String i;
    public String j;
    public int k;
    public String l;
    public String m;
    public C0355b n;
    private String[] o;
    private String[] p;

    /* renamed from: q, reason: collision with root package name */
    private double f7735q;
    private double r;
    private int s;
    private long t;
    private int u;
    private int v;
    private String w;
    private String x;
    private String y;
    private int z = 8;
    private double[] O = null;
    private double[] P = null;

    public enum a {
        UNKNOWN(0),
        NORMAL(1),
        AUTH(2),
        BIG_RECT(4),
        RING_RECT(8),
        AOA_RECT(16);

        private int g;

        a(int i) {
            this.g = i;
        }

        public int a() {
            return this.g;
        }
    }

    /* renamed from: com.baidu.location.indoor.b$b, reason: collision with other inner class name */
    public class C0355b {

        /* renamed from: a, reason: collision with root package name */
        public String f7737a;
        public String b;
        public String c;
        public String d;
        public String e;

        public C0355b() {
        }

        public void a(String str) {
            this.f7737a = str;
        }

        public void b(String str) {
            this.b = str;
        }

        public void c(String str) {
            this.c = str;
        }

        public void d(String str) {
            this.d = str;
        }

        public void e(String str) {
            this.e = str;
        }

        public String toString() {
            return "OfflineFileInfo{fileUrl='" + this.f7737a + "', zipMd5='" + this.b + "', modleMd5='" + this.c + "', dataMd5='" + this.d + "', dictMd5='" + this.e + "'}";
        }
    }

    public b(JSONObject jSONObject) {
        String string;
        String[] split;
        JSONObject optJSONObject;
        this.s = 100;
        this.t = 2500L;
        this.u = 20;
        this.v = 0;
        this.w = "default";
        this.x = "default";
        this.y = "0|0";
        this.A = 1.0d;
        this.B = true;
        this.C = 0.0d;
        this.D = false;
        this.E = false;
        this.F = 2;
        this.G = 0;
        this.H = 0;
        this.I = 0;
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = "";
        this.N = "";
        this.Q = 0;
        this.S = 0;
        if (jSONObject != null) {
            try {
                if (jSONObject.has("rect_type")) {
                    this.H = jSONObject.optInt("rect_type");
                    if (jSONObject.has("aoa_device_path")) {
                        this.R = jSONObject.getString("aoa_device_path");
                    }
                    if ((this.H & a.AUTH.a()) == a.AUTH.a()) {
                        this.I = 1;
                    } else {
                        this.I = 0;
                    }
                    if ((this.H & a.BIG_RECT.a()) == a.BIG_RECT.a()) {
                        this.J = 1;
                    } else {
                        this.J = 0;
                    }
                    if ((this.H & a.RING_RECT.a()) == a.RING_RECT.a()) {
                        this.K = 1;
                    } else {
                        this.K = 0;
                    }
                    a.NORMAL.a();
                    a.NORMAL.a();
                }
                if ((this.H & a.AOA_RECT.a()) == a.AOA_RECT.a()) {
                    this.v = 1;
                } else {
                    this.v = 0;
                }
                if (jSONObject.has("bldg")) {
                    this.f7734a = jSONObject.optString("bldg");
                }
                if (jSONObject.has("bid")) {
                    this.b = jSONObject.optString("bid");
                }
                if (jSONObject.has("inout_points")) {
                    this.l = jSONObject.optString("inout_points");
                }
                if (jSONObject.has("off_ble_ver")) {
                    this.m = jSONObject.optString("off_ble_ver");
                }
                if (jSONObject.has("max_scan_num")) {
                    this.s = jSONObject.optInt("max_scan_num");
                }
                if (jSONObject.has("scan_time_interval")) {
                    this.t = jSONObject.optInt("scan_time_interval");
                }
                if (jSONObject.has("offloc_top_count")) {
                    this.u = jSONObject.optInt("offloc_top_count");
                }
                if (jSONObject.has("scenario_detector")) {
                    this.w = jSONObject.optString("scenario_detector");
                }
                if (jSONObject.has("passageway_info")) {
                    this.x = jSONObject.optString("passageway_info");
                }
                if (jSONObject.has("offloc_parameter")) {
                    this.y = jSONObject.optString("offloc_parameter");
                }
                if (jSONObject.has(CommonUrlParts.UUID)) {
                    this.g = jSONObject.getString(CommonUrlParts.UUID).replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                }
                if (jSONObject.has("uuids")) {
                    String string2 = jSONObject.getString("uuids");
                    if (!"".equals(string2)) {
                        if (string2.contains("|")) {
                            String[] split2 = string2.split("\\|");
                            for (int i = 0; i < split2.length; i++) {
                                split2[i] = split2[i].replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toUpperCase();
                            }
                            this.h = split2;
                        } else {
                            this.h = new String[]{string2.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toUpperCase()};
                        }
                    }
                }
                if (jSONObject.has("encrypt_uuids")) {
                    String optString = jSONObject.optString("encrypt_uuids");
                    if (!"".equals(optString)) {
                        if (optString.contains("|")) {
                            String[] split3 = optString.split("\\|");
                            for (int i2 = 0; i2 < split3.length; i2++) {
                                split3[i2] = split3[i2].replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toUpperCase();
                            }
                            this.o = split3;
                        } else {
                            this.o = new String[]{optString.replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "").toUpperCase()};
                        }
                    }
                }
                a(this.h, this.o);
                if (jSONObject.has("support_types")) {
                    this.i = jSONObject.optString("support_types");
                }
                if (jSONObject.has("conf_type")) {
                    this.j = jSONObject.optString("conf_type");
                }
                if (jSONObject.has("offline_data_mode")) {
                    this.F = jSONObject.optInt("offline_data_mode");
                }
                if (jSONObject.has("algo_rects")) {
                    this.N = jSONObject.optString("algo_rects");
                    if ("zqxfbsd".equals(this.f7734a)) {
                        a(this.N);
                    }
                }
                if (jSONObject.has("is_need_walk_navi_link")) {
                    this.Q = jSONObject.optInt("is_need_walk_navi_link");
                }
                String str = "indoor_file_info_v2";
                String str2 = "is_support_off_ble_v2";
                int i3 = this.F;
                if (i3 == 2) {
                    str = "indoor_file_info_v2";
                    str2 = "is_support_off_ble_v2";
                } else if (i3 == 3) {
                    str = "indoor_file_info_v3";
                    str2 = "is_support_off_ble_v3";
                }
                if (jSONObject.has(str2)) {
                    this.k = jSONObject.optInt(str2);
                }
                if (!jSONObject.has(str) || (optJSONObject = jSONObject.optJSONArray(str).optJSONObject(0)) == null) {
                    this.E = false;
                } else {
                    this.n = new C0355b();
                    this.E = true;
                    if (optJSONObject.has("file_path")) {
                        this.n.a(optJSONObject.optString("file_path"));
                    } else {
                        this.E = false;
                    }
                    if (optJSONObject.has("zip_md5")) {
                        this.n.b(optJSONObject.optString("zip_md5"));
                    } else {
                        this.E = false;
                    }
                    if (optJSONObject.has("model_md5")) {
                        this.n.c(optJSONObject.optString("model_md5"));
                    } else {
                        this.E = false;
                    }
                    if (optJSONObject.has("data_md5")) {
                        this.n.d(optJSONObject.optString("data_md5"));
                    } else {
                        this.E = false;
                    }
                    if (optJSONObject.has("dict_md5")) {
                        this.n.e(optJSONObject.optString("dict_md5"));
                    } else {
                        this.E = false;
                    }
                }
                if (jSONObject.has("rect") && (string = jSONObject.getString("rect")) != null && string.contains(",") && (split = string.split(",")) != null && split.length >= 4) {
                    this.c = Double.valueOf(split[1]).doubleValue();
                    this.e = Double.valueOf(split[0]).doubleValue();
                    this.d = Double.valueOf(split[3]).doubleValue();
                    double doubleValue = Double.valueOf(split[2]).doubleValue();
                    this.f = doubleValue;
                    double d = this.c;
                    this.f7735q = (this.e + d) / 2.0d;
                    double d2 = this.d;
                    this.r = (doubleValue + d2) / 2.0d;
                    double[] coorEncrypt = Jni.coorEncrypt(d, d2, BDLocation.BDLOCATION_WGS84_TO_GCJ02);
                    this.c = coorEncrypt[0];
                    this.d = coorEncrypt[1];
                    double[] coorEncrypt2 = Jni.coorEncrypt(this.e, this.f, BDLocation.BDLOCATION_WGS84_TO_GCJ02);
                    this.e = coorEncrypt2[0];
                    this.f = coorEncrypt2[1];
                }
                if (jSONObject.has("indoor_log_rate")) {
                    this.A = jSONObject.optDouble("indoor_log_rate");
                    if (new Random().nextDouble() <= this.A) {
                        this.B = true;
                    } else {
                        this.B = false;
                    }
                }
                if (jSONObject.has("sensor_log_rate")) {
                    this.C = jSONObject.optDouble("sensor_log_rate");
                    if (new Random().nextDouble() <= this.C) {
                        this.D = true;
                    } else {
                        this.D = false;
                    }
                }
                if (jSONObject.has("is_support_poi_data")) {
                    this.G = jSONObject.optInt("is_support_poi_data");
                }
                if (jSONObject.has("is_use_bms")) {
                    this.L = jSONObject.optInt("is_use_bms");
                }
                if (jSONObject.has("new_indoorloc_param")) {
                    this.M = jSONObject.optString("new_indoorloc_param");
                }
                if (jSONObject.has("is_support_reverse")) {
                    this.S = jSONObject.optInt("is_support_reverse");
                }
            } catch (Exception unused) {
            }
        }
    }

    private void a(String str) {
        if (str != null) {
            try {
                String[] split = str.split(";");
                if (split.length >= 3) {
                    int parseInt = Integer.parseInt(split[0]);
                    String str2 = split[2];
                    if (parseInt != 3 || str2 == null) {
                        return;
                    }
                    String[] split2 = str2.split(",");
                    if (split2.length >= 8) {
                        double parseDouble = Double.parseDouble(split2[0]);
                        double parseDouble2 = Double.parseDouble(split2[1]);
                        double parseDouble3 = Double.parseDouble(split2[2]);
                        double parseDouble4 = Double.parseDouble(split2[3]);
                        double parseDouble5 = Double.parseDouble(split2[4]);
                        double parseDouble6 = Double.parseDouble(split2[5]);
                        double parseDouble7 = Double.parseDouble(split2[6]);
                        double parseDouble8 = Double.parseDouble(split2[7]);
                        this.O = new double[]{parseDouble, parseDouble3, parseDouble5, parseDouble7};
                        this.P = new double[]{parseDouble2, parseDouble4, parseDouble6, parseDouble8};
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    private void a(String[] strArr, String[] strArr2) {
        int length = (strArr == null || strArr.length <= 0) ? 0 : strArr.length;
        int length2 = (strArr2 == null || strArr2.length <= 0) ? 0 : strArr2.length;
        String[] strArr3 = new String[length + length2];
        this.p = strArr3;
        if (strArr != null) {
            System.arraycopy(strArr, 0, strArr3, 0, length);
        }
        if (strArr2 != null) {
            System.arraycopy(strArr2, 0, this.p, length, length2);
        }
    }

    public int a() {
        return this.s;
    }

    public String[] b() {
        return this.o;
    }

    public String[] c() {
        return this.p;
    }

    public int d() {
        return this.J;
    }

    public String toString() {
        return "BlePdrEffectArea{bldg='" + this.f7734a + "', bid='" + this.b + "', lon0=" + this.c + ", lat0=" + this.d + ", lon1=" + this.e + ", lat1=" + this.f + ", uuid='" + this.g + "', uuids=" + Arrays.toString(this.h) + ", encryptUuids=" + Arrays.toString(this.o) + ", allUuids=" + Arrays.toString(this.p) + ", supportTypes='" + this.i + "', confType='" + this.j + "', isSupportOffBle=" + this.k + ", inoutPoints='" + this.l + "', offBleVer='" + this.m + "', offline_data_mode=" + this.F + ", offlineFileInfo=" + this.n + ", middlelon=" + this.f7735q + ", middlelat=" + this.r + ", bleNumlimit=" + this.s + ", conf='" + this.w + "', passageWayInfo='" + this.x + "', offLocParameter='" + this.y + "', mThrYaw=" + this.z + ", mIndoorLogRate=" + this.A + ", isIndoorLogReport=" + this.B + ", mIndoorSensorLogRate=" + this.C + ", isIndoorSensorLogReport=" + this.D + ", isOfflineServerDataValid=" + this.E + ", isNeedCompanyAuth=" + this.I + ", rectType=" + this.H + ", isBigRect=" + this.J + ", isRingRect=" + this.K + ", isUseBMS=" + this.L + ", isSupportPoiData=" + this.G + ", algoRects=" + this.N + ", isNeedWalkNaviLink=" + this.Q + ", newIndoorLocParams=" + this.M + ", scanTimeInterval=" + this.t + ", offlocTopCount=" + this.u + ", isSupportReverse=" + this.S + AbstractJsonLexerKt.END_OBJ;
    }
}
