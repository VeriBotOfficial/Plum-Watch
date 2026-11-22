package com.baidu.location.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.LocationClientOption;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.HashMap;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class a {
    private static String B = "BDLocConfigManager";
    public int A;
    private SharedPreferences C;
    private long D;
    private String E;
    private C0341a F;
    private boolean G;
    private String H;
    private String I;
    private String J;
    private Context K;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7518a;
    public int b;
    public double c;
    public int d;
    public int e;
    public double f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public double[] m;
    public int n;
    public int o;
    public int p;

    /* renamed from: q, reason: collision with root package name */
    public int f7519q;
    public int r;
    public float s;
    public float t;
    public int u;
    public int[] v;
    public int[] w;
    public int x;
    public int y;
    public int z;

    /* renamed from: com.baidu.location.b.a$a, reason: collision with other inner class name */
    class C0341a extends com.baidu.location.h.g {

        /* renamed from: a, reason: collision with root package name */
        String f7520a = null;
        boolean b = false;

        public C0341a() {
            this.el = new HashMap();
        }

        public void a(String str) {
            if (this.b) {
                return;
            }
            this.b = true;
            this.f7520a = str;
            e(com.baidu.location.h.d.g);
        }

        @Override // com.baidu.location.h.g
        public void a(boolean z) {
            if (z && this.ej != null) {
                try {
                    new JSONObject(this.ej);
                    if (a.this.C != null) {
                        SharedPreferences.Editor edit = a.this.C.edit();
                        edit.putString(a.B + "_newConfig", Base64.encodeToString(com.baidu.location.h.i.a(this.ej.getBytes()), 0));
                        edit.apply();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (this.el != null) {
                this.el.clear();
            }
            this.b = false;
        }

        @Override // com.baidu.location.h.g
        public void b() {
            this.ei = 2;
            String encode = Jni.encode(this.f7520a);
            this.f7520a = null;
            this.el.put(DownloadCommon.DOWNLOAD_REPORT_QUERY_TIMEOUT, "conf");
            this.el.put(HiAnalyticsConstant.Direction.REQUEST, encode);
        }
    }

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f7521a = new a();
    }

    private a() {
        this.C = null;
        this.f7518a = false;
        this.b = 16;
        this.D = 300L;
        this.c = 0.75d;
        this.d = 0;
        this.e = 1;
        this.f = -0.10000000149011612d;
        this.g = 0;
        this.h = 1;
        this.i = 1;
        this.j = 10;
        this.k = 3;
        this.l = 40;
        this.n = 1;
        this.o = 0;
        this.p = 1;
        this.f7519q = 1;
        this.r = 0;
        this.s = 0.2f;
        this.t = 0.8f;
        this.u = 0;
        this.v = null;
        this.w = null;
        this.x = 8;
        this.y = 4000;
        this.z = 1;
        this.A = 1;
        this.E = null;
        this.F = null;
        this.G = false;
        this.H = null;
        this.I = null;
        this.J = null;
        this.K = null;
    }

    public static a a() {
        return b.f7521a;
    }

    private void a(LocationClientOption locationClientOption) {
        String str = "&ver=" + com.baidu.location.h.i.y + "&usr=" + c() + "&app=" + this.H + "&prod=" + locationClientOption.prodName + "&newwf=1";
        String str2 = Build.VERSION.RELEASE;
        if (str2 != null && str2.length() > 6) {
            str2 = str2.substring(0, 6);
        }
        String str3 = str + "&sv=" + str2;
        String b2 = com.baidu.location.h.i.b("ro.miui.ui.version.name");
        if (!TextUtils.isEmpty(b2)) {
            str3 = str3 + "&miui=" + b2;
        }
        String j = com.baidu.location.h.i.j();
        if (!TextUtils.isEmpty(j)) {
            str3 = str3 + "&mtk=" + j;
        }
        SharedPreferences a2 = s.a(this.K);
        String string = a2 != null ? a2.getString("mapcity", null) : null;
        if (!TextUtils.isEmpty(string)) {
            str3 = str3 + "&city=" + string;
        }
        String str4 = (str3 + "&sdk=9.671") + "&stp=1";
        String string2 = this.C.getString(B + "_loc", null);
        if (!TextUtils.isEmpty(string2)) {
            try {
                str4 = str4 + "&loc=" + new String(Base64.decode(string2, 0), "UTF-8");
            } catch (Exception unused) {
            }
        }
        String str5 = str4 + "&cnloc=" + l.a().b();
        if (this.F == null) {
            this.F = new C0341a();
        }
        this.F.a(str5);
    }

    private void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("is_check_Per") && jSONObject.getInt("is_check_Per") > 0) {
                this.f7518a = true;
            }
            if (jSONObject.has("wfnum")) {
                this.b = jSONObject.getInt("wfnum");
            }
            if (jSONObject.has("freq")) {
                this.D = jSONObject.getLong("freq");
            }
            if (jSONObject.has("wfsm")) {
                this.c = jSONObject.getDouble("wfsm");
            }
            if (jSONObject.has("idmoc")) {
                this.d = jSONObject.getInt("idmoc");
            }
            if (jSONObject.has("gnmcrm")) {
                this.f = jSONObject.getDouble("gnmcrm");
            }
            if (jSONObject.has("gnmcon")) {
                this.g = jSONObject.getInt("gnmcon");
            }
            if (jSONObject.has("lpcs")) {
                this.e = jSONObject.getInt("lpcs");
            }
            if (jSONObject.has("iupl")) {
                this.h = jSONObject.getInt("iupl");
            }
            if (jSONObject.has("opetco")) {
                this.i = jSONObject.getInt("opetco");
            }
            if (jSONObject.has("ct")) {
                this.j = jSONObject.getInt("ct");
            }
            if (jSONObject.has("suci")) {
                this.k = jSONObject.getInt("suci");
            }
            if (jSONObject.has("smn")) {
                this.l = jSONObject.getInt("smn");
            }
            if (jSONObject.has("bcar")) {
                a(jSONObject);
            }
            if (jSONObject.has("ums")) {
                this.n = jSONObject.getInt("ums");
            }
            if (jSONObject.has("hpdts")) {
                this.o = jSONObject.getInt("hpdts");
            }
            if (jSONObject.has("oldts")) {
                this.p = jSONObject.getInt("oldts");
            }
            if (jSONObject.has("nlp_loc_coarse")) {
                this.f7519q = jSONObject.optInt("nlp_loc_coarse");
            }
            if (jSONObject.has("new_loc_cache_switch")) {
                this.r = jSONObject.optInt("new_loc_cache_switch");
            }
            if (jSONObject.has("nc_same_rate")) {
                this.s = (float) jSONObject.optDouble("nc_same_rate", 0.8d);
            }
            if (jSONObject.has("cl_str_change_rate")) {
                this.t = (float) jSONObject.optDouble("cl_str_change_rate", 0.2d);
            }
            if (jSONObject.has("cl_list_switch")) {
                this.u = jSONObject.optInt("cl_list_switch", 0);
            }
            if (jSONObject.has("cl_str_switch")) {
                String[] split = jSONObject.optString("cl_str_switch", "").split(",");
                this.v = new int[split.length];
                int i = 0;
                for (String str2 : split) {
                    this.v[i] = 0;
                    if (str2.length() > 0) {
                        try {
                            this.v[i] = Integer.parseInt(str2);
                        } catch (Throwable unused) {
                        }
                    }
                    i++;
                }
            }
            if (jSONObject.has("cl_common_switch")) {
                String[] split2 = jSONObject.optString("cl_common_switch", "").split(",");
                this.w = new int[split2.length];
                int i2 = 0;
                for (String str3 : split2) {
                    this.w[i2] = 0;
                    if (str3.length() > 0) {
                        try {
                            this.w[i2] = Integer.parseInt(str3);
                        } catch (Throwable unused2) {
                        }
                    }
                    i2++;
                }
            }
            if (jSONObject.has("cell_number")) {
                this.x = jSONObject.optInt("cell_number", 10);
            }
            if (jSONObject.has("loc_str_length")) {
                this.y = jSONObject.optInt("loc_str_length", 4000);
            }
            if (jSONObject.has("loc_to_foreground")) {
                this.z = jSONObject.optInt("loc_to_foreground", 1);
            }
            if (jSONObject.has("hils")) {
                this.A = jSONObject.optInt("hils", 1);
            }
            this.E = str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String c() {
        return "v9.671|" + this.I + "|" + Build.MODEL + "&cu=" + this.I + "&mb=" + Build.MODEL;
    }

    public synchronized void a(double d, double d2, String str) {
        SharedPreferences sharedPreferences;
        if (this.J == null && str != null) {
            try {
                if (str.equals("bd09") || str.equals("wgs84mc")) {
                    double[] coorEncrypt = Jni.coorEncrypt(d2, d, BDLocation.BDLOCATION_BD09_TO_GCJ02);
                    double d3 = coorEncrypt[1];
                    double d4 = coorEncrypt[0];
                    d = d3;
                    d2 = d4;
                }
                String format = String.format(Locale.US, "%.5f|%.5f", Double.valueOf(d2), Double.valueOf(d));
                this.J = format;
                String encodeToString = Base64.encodeToString(format.getBytes("UTF-8"), 0);
                if (encodeToString != null && (sharedPreferences = this.C) != null) {
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.putString(B + "_loc", encodeToString);
                    edit.apply();
                }
            } catch (Exception unused) {
                this.J = null;
            }
        }
    }

    public synchronized void a(Context context, LocationClientOption locationClientOption, String str) {
        if (!this.G && context != null) {
            this.G = true;
            this.K = context;
            if (locationClientOption == null) {
                locationClientOption = new LocationClientOption();
            }
            this.H = context.getPackageName();
            l.a().a(this.K);
            try {
                this.I = LBSAuthManager.getInstance(context).getCUID();
            } catch (Throwable unused) {
                this.I = null;
            }
            if (this.C == null) {
                this.C = context.getSharedPreferences(B + "BDLocConfig", 0);
            }
            SharedPreferences sharedPreferences = this.C;
            if (sharedPreferences != null) {
                long j = sharedPreferences.getLong(B + "_lastCheckTime", 0L);
                String string = this.C.getString(B + "_config", "");
                String string2 = this.C.getString(B + "_newConfig", "");
                if (!TextUtils.isEmpty(string2)) {
                    a(new String(com.baidu.location.h.i.b(Base64.decode(string2, 0))));
                } else if (!TextUtils.isEmpty(string)) {
                    a(string);
                    SharedPreferences.Editor edit = this.C.edit();
                    edit.remove(B + "_config");
                    edit.apply();
                }
                if (Math.abs((System.currentTimeMillis() / 1000) - j) > this.D) {
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    SharedPreferences.Editor edit2 = this.C.edit();
                    edit2.putLong(B + "_lastCheckTime", currentTimeMillis);
                    edit2.apply();
                    a(locationClientOption);
                }
            }
        }
    }

    public void a(JSONObject jSONObject) {
        JSONArray jSONArray;
        if (jSONObject != null) {
            double[] dArr = this.m;
            if (dArr != null && dArr.length > 0) {
                this.m = null;
            }
            try {
                if (!jSONObject.has("bcar") || (jSONArray = jSONObject.getJSONArray("bcar")) == null || jSONArray.length() <= 0) {
                    return;
                }
                if (this.m == null) {
                    this.m = new double[jSONArray.length() * 4];
                }
                int i = 0;
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    this.m[i] = jSONArray.getJSONObject(i2).getDouble("x1");
                    this.m[i + 1] = jSONArray.getJSONObject(i2).getDouble("y1");
                    int i3 = i + 3;
                    this.m[i + 2] = jSONArray.getJSONObject(i2).getDouble("x2");
                    i += 4;
                    this.m[i3] = jSONArray.getJSONObject(i2).getDouble("y2");
                }
            } catch (Exception unused) {
            }
        }
    }
}
