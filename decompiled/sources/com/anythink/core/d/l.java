package com.anythink.core.d;

import android.text.TextUtils;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.api.ATAdRequest;
import com.anythink.core.api.ATInitMediation;
import com.anythink.core.api.ATRewardInfo;
import com.anythink.core.common.d.j;
import com.anythink.core.common.d.v;
import com.anythink.core.common.h.ad;
import com.anythink.core.common.h.ai;
import com.anythink.core.common.h.ap;
import com.anythink.core.common.h.ay;
import com.anythink.core.common.h.ba;
import com.anythink.core.common.h.bk;
import com.anythink.core.common.h.bt;
import com.anythink.core.common.h.bv;
import com.anythink.core.common.h.x;
import com.anythink.core.common.h.y;
import com.autonavi.aps.amapapi.config.Const;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.umeng.analytics.pro.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeConstants;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class l extends e {

    /* renamed from: a, reason: collision with root package name */
    public static final String f4520a = "Placement";
    public static final int b = 0;
    public static final int c = 1;
    public static final int e = 2;
    public static final int f = 1;
    public static final int g = 2;
    public static final int h = 3;
    private long A;
    private long B;
    private long C;
    private int D;
    private String E;
    private bt F;
    private int G;
    private String H;
    private int I;
    private int J;
    private String K;
    private Map<String, Object> L;
    private Map<String, ATRewardInfo> M;
    private ATRewardInfo N;
    private String O;
    private String P;
    private long Q;
    private String R;
    private long S;
    private int T;
    private long U;
    private int V;
    private List<ay> W;
    private ba X;
    private long Y;
    private double Z;
    private int aA;
    private int aB;
    private int aD;
    private double[][] aH;
    private int aJ;
    private f aK;
    private boolean aM;
    private int aN;
    private int aO;
    private int aP;
    private long aQ;
    private long aR;
    private long aS;
    private int aT;
    private int aU;
    private JSONArray aV;
    private JSONArray aW;
    private JSONArray aX;
    private JSONArray aY;
    private JSONArray aZ;
    private String aa;
    private List<String> ab;
    private String ac;
    private String ad;
    private String ae;
    private String af;
    private long ag;
    private String ah;

    /* renamed from: ai, reason: collision with root package name */
    private String f4521ai;
    private double aj;
    private long ak;
    private long al;
    private long am;
    private long an;
    private int ao;
    private int ap;
    private int aq;
    private long ar;
    private JSONObject as;
    private JSONObject at;
    private String au;
    private String av;
    private int aw;
    private int ax;
    private List<Integer> ay;
    private int az;
    private int bA;
    private ai bB;
    private List<String> bC;
    private JSONObject bD;
    private JSONObject bH;
    private long bJ;
    private int bK;
    private int bM;
    private String bN;
    private String bO;
    private long bP;
    private double bQ;
    private int bR;
    private int bS;
    private int bT;
    private int bU;
    private JSONObject bV;
    private JSONArray ba;
    private JSONArray bb;
    private JSONArray bc;
    private JSONArray bd;
    private JSONArray be;
    private JSONArray bf;
    private JSONArray bg;
    private long bh;
    private int bi;
    private int bj;
    private int bk;
    private List<Integer> bl;
    private int bn;
    private String bo;
    private int bp;
    private int bq;
    private int[] br;
    private Boolean bt;
    private int bu;
    private String bv;
    private ap bw;
    private int bx;
    private int by;
    private int bz;
    ATAdRequest i;
    private String j;
    private long k;
    private long l;
    private int m;
    private int n;
    private int o;
    private long p;

    /* renamed from: q, reason: collision with root package name */
    private long f4522q;
    private long r;
    private int s;
    private int t;
    private int u;
    private int v;
    private List<bv> w;
    private Map<String, bv> x;
    private int y;
    private int z;
    private int aC = 0;
    private int aE = 10;
    private int aF = 10;
    private int aG = 2;
    private int aI = 1;
    private com.anythink.core.common.h.q aL = new com.anythink.core.common.h.q();
    private int bm = 2;
    private int bs = 2;
    private int bE = 1;
    private int bF = 10000;
    private int bG = 3000;
    private int bI = 1;
    private int bL = 2;

    public static class a {
        public static final String A = "req_w_time";
        public static final String B = "wf_loadts";
        public static final String C = "req_ug_type";
        public static final String D = "req_ug_numsp";
        public static final String E = "bf_ldf_rf_sw";
        public static final String F = "hb_start_time";
        public static final String G = "dsp_list";
        public static final String H = "bid_floor";
        public static final String I = "max_unit_ids";
        public static final String J = "xdb_list";
        public static final String K = "s2s_bd_max";
        public static final String L = "req_merge";
        public static final String M = "exclude_id_max";
        public static final String N = "install_id_max";
        public static final String O = "install_ids";
        public static final String P = "exclude_ids";
        public static final String Q = "is_test";
        public static final String R = "gsp_rates";
        public static final String S = "adx_ext";
        public static final String T = "wf_id";
        public static final String U = "sysh_mtg_sw";
        public static final String V = "mid_gdt_sw";
        public static final String W = "lm_lrqf_interval_sws";
        public static final String X = "wf_lscb_type";
        public static final String Y = "reqid_pg_sw";
        public static final String Z = "sr_sw";

        /* renamed from: a, reason: collision with root package name */
        public static final String f4523a = "hb_bid_timeout";
        public static final String aA = "unique_id";
        public static final String aB = "e_key_data";
        public static final String aC = "c_pub_key";
        public static final String aD = "s_id";
        public static final String aE = "c_id";
        public static final String aF = "sp_sdk_pri_timeout";
        public static final String aG = "dn_c2shb_list";
        public static final String aH = "dn_s2shb_list";
        public static final String aI = "bid_wait_other_time";
        public static final String aJ = "h_s_t_auto_sdk_to_time";
        public static final String aK = "ps_ct_out_cus";
        public static final String aL = "autoload_t";
        public static final String aM = "ads_lg_st";
        public static final String aN = "rotation_num";
        public static final String aO = "rotation_inter";
        public static final String aP = "rotation_cache_ts";
        public static final String aQ = "adx_id_b_sw";
        public static final String aR = "addr_st";
        public static final String aS = "i_r_sw";
        private static final String aT = "ps_id_timeout";
        private static final String aU = "ps_ct";
        private static final String aV = "ps_ct_out";
        private static final String aW = "pucs";
        private static final String aX = "ad_delivery_sw";
        private static final String aY = "req_ug_num";
        private static final String aZ = "unit_caps_d";
        public static final String aa = "p_c";
        public static final String ab = "has_1st_rl";
        public static final String ac = "updateTime";
        public static final String ad = "upd_type";
        public static final String ae = "upd_th";
        public static final String af = "value_n";
        public static final String ag = "bid_value_n";
        public static final String ah = "sto_stg";

        /* renamed from: ai, reason: collision with root package name */
        public static final String f4524ai = "lf_rt_itr";
        public static final String aj = "wf2_mode_sw";
        public static final String ak = "wf2_req_ug_type";
        public static final String al = "wf2_mode_req_num";
        public static final String am = "am_est_num";
        public static final String an = "share_pl_id";
        public static final String ao = "s2s_sw";
        public static final String ap = "bd_req_bid_sw";
        public static final String aq = "bn_template_id";
        public static final String ar = "mix_click_type";
        public static final String as = "auto_refresh_type";
        public static final String at = "wf_sw";
        public static final String au = "wf_obj";
        public static final String av = "pl_wf_st_type";
        public static final String aw = "presetwf_reload_sw";
        public static final String ax = "wf2_nf_sw";
        public static final String ay = "ps_ct_max";
        public static final String az = "adx_dsp";
        public static final String b = "addr_bid";
        private static final String bA = "sc_list";
        private static final String bB = "rw_n";
        private static final String bC = "rw_num";
        private static final String bD = "reward";
        private static final String bE = "currency";
        private static final String bF = "cc";
        private static final String bG = "exch_r";
        private static final String bH = "acct_cy";
        private static final String bI = "req_ug_type_v2";
        private static final String bJ = "device_perf_sw";
        private static final String bK = "max_cached_num";
        private static final String bL = "wf_req_wait_t";
        private static final String bM = "c2s_req_wait_t";
        private static final String bN = "s2s_req_wait_t";
        private static final String bO = "auto_req_type";
        private static final String bP = "auto_refresh_type_v2";
        private static final String ba = "unit_caps_h";
        private static final String bb = "unit_pacing";
        private static final String bc = "wifi_auto_sw";
        private static final String bd = "show_type";
        private static final String be = "refresh";
        private static final String bf = "ug_list";
        private static final String bg = "ol_list";
        private static final String bh = "gro_id";
        private static final String bi = "hb_list";
        private static final String bj = "s2shb_list";
        private static final String bk = "format";
        private static final String bl = "auto_refresh";
        private static final String bm = "auto_refresh_time";
        private static final String bn = "s_t";
        private static final String bo = "l_s_t";
        private static final String bp = "ra";
        private static final String bq = "asid";
        private static final String br = "tp_ps";
        private static final String bs = "t_g_id";
        private static final String bt = "s_id";
        private static final String bu = "u_n_f_sw";
        private static final String bv = "m_o";
        private static final String bw = "m_o_s";
        private static final String bx = "m_o_ks";
        private static final String by = "p_m_o";
        private static final String bz = "callback";
        public static final String c = "load_fail_wtime";
        public static final String d = "load_cap";
        public static final String e = "load_cap_time";
        public static final String f = "cached_offers_num";
        public static final String g = "adx_list";
        public static final String h = "adx_st";
        public static final String i = "ilrd";
        public static final String j = "hb_list";
        public static final String k = "inh_list";
        public static final String l = "fbhb_bid_wtime";
        public static final String m = "burl_nt_firm";
        public static final String n = "wf_bid_addr";
        public static final String o = "ss_data";
        public static final String p = "cn_addr_bid";

        /* renamed from: q, reason: collision with root package name */
        public static final String f4525q = "cn_wf_bid_addr";
        public static final String r = "byuid_wt";
        public static final String s = "addr_bks";
        public static final String t = "addr_subbks";
        public static final String u = "s2sbks_list";
        public static final String v = "exch_rate_c2u";
        public static final String w = "doffer_list";
        public static final String x = "bottom_list";
        public static final String y = "bottom_reqts";
        public static final String z = "cb_w_time";
    }

    public final int a() {
        return this.aN;
    }

    private void c(int i) {
        this.aN = i;
    }

    public final int b() {
        return this.aO;
    }

    private void d(int i) {
        this.aO = i;
    }

    public final int c() {
        return this.aP;
    }

    private void e(int i) {
        this.aP = i;
    }

    public final long d() {
        return this.aQ;
    }

    private void a(long j) {
        this.aQ = j;
    }

    public final long e() {
        return this.aR;
    }

    private void b(long j) {
        this.aR = j;
    }

    public final long f() {
        return this.aS;
    }

    private void c(long j) {
        this.aS = j;
    }

    public final int g() {
        return this.aT;
    }

    private void f(int i) {
        this.aT = i;
    }

    public final int h() {
        return this.aU;
    }

    private void g(int i) {
        this.aU = i;
    }

    private l(String str) {
        this.j = str;
    }

    public final String i() {
        return this.j;
    }

    public final f j() {
        return this.aK;
    }

    private void a(f fVar) {
        this.aK = fVar;
    }

    public final int k() {
        return this.aJ;
    }

    private void h(int i) {
        this.aJ = i;
    }

    public final int l() {
        return this.aB;
    }

    private void i(int i) {
        this.aB = i;
    }

    public final List<Integer> m() {
        return this.bl;
    }

    private void a(List<Integer> list) {
        this.bl = list;
    }

    public final int n() {
        return this.bj;
    }

    private void j(int i) {
        this.bj = i;
    }

    public final int o() {
        return this.bk;
    }

    private void k(int i) {
        this.bk = i;
    }

    public final int p() {
        return this.bi;
    }

    private void l(int i) {
        this.bi = i;
    }

    public final long r() {
        return this.bh;
    }

    private void d(long j) {
        this.bh = j;
    }

    public final ATAdRequest s() {
        return this.i;
    }

    public final void a(ATAdRequest aTAdRequest) {
        this.i = aTAdRequest;
    }

    private static l b(String str, JSONObject jSONObject) {
        long optLong;
        l lVar;
        JSONArray optJSONArray;
        int length;
        l lVar2 = null;
        if (jSONObject == null) {
            return null;
        }
        try {
            l lVar3 = new l(str);
            lVar3.bJ = System.currentTimeMillis();
            lVar3.b(jSONObject);
            lVar3.c(jSONObject);
            lVar3.d(jSONObject);
            if (jSONObject.isNull("ps_ct")) {
                lVar3.k = 0L;
            } else {
                lVar3.k = jSONObject.optLong("ps_ct");
            }
            if (jSONObject.isNull("ps_ct_out")) {
                lVar3.l = 0L;
            } else {
                lVar3.l = jSONObject.optLong("ps_ct_out");
            }
            if (jSONObject.isNull("pucs")) {
                lVar3.m = 1;
            } else {
                lVar3.m = jSONObject.optInt("pucs");
            }
            if (jSONObject.isNull("ad_delivery_sw")) {
                lVar3.n = 1;
            } else {
                lVar3.n = jSONObject.optInt("ad_delivery_sw");
            }
            if (!jSONObject.isNull("req_ug_num")) {
                int optInt = jSONObject.optInt("req_ug_num", 1);
                if (optInt <= 0) {
                    optInt = 1;
                }
                lVar3.o = optInt;
            } else {
                lVar3.o = 1;
            }
            if (jSONObject.isNull("unit_caps_d")) {
                lVar3.p = -1L;
            } else {
                lVar3.p = jSONObject.optLong("unit_caps_d");
            }
            if (jSONObject.isNull("unit_caps_h")) {
                lVar3.f4522q = -1L;
            } else {
                lVar3.f4522q = jSONObject.optLong("unit_caps_h");
            }
            if (jSONObject.isNull("unit_pacing")) {
                lVar3.r = -1L;
            } else {
                lVar3.r = jSONObject.optLong("unit_pacing");
            }
            if (jSONObject.isNull("wifi_auto_sw")) {
                lVar3.s = 0;
            } else {
                lVar3.s = jSONObject.optInt("wifi_auto_sw");
            }
            if (jSONObject.isNull(CampaignEx.KEY_SHOW_TYPE)) {
                lVar3.t = 0;
            } else {
                lVar3.t = jSONObject.optInt(CampaignEx.KEY_SHOW_TYPE);
            }
            if (jSONObject.isNull("refresh")) {
                lVar3.u = 0;
            } else {
                lVar3.u = jSONObject.optInt("refresh");
            }
            if (jSONObject.isNull("gro_id")) {
                lVar3.v = 0;
            } else {
                lVar3.v = jSONObject.optInt("gro_id");
            }
            if (jSONObject.isNull("format")) {
                lVar3.y = 0;
            } else {
                lVar3.y = jSONObject.optInt("format");
            }
            if (jSONObject.isNull("auto_refresh")) {
                lVar3.z = 0;
            } else {
                lVar3.z = jSONObject.optInt("auto_refresh");
            }
            if (jSONObject.isNull("auto_refresh_time")) {
                lVar3.A = 0L;
            } else {
                lVar3.A = jSONObject.optLong("auto_refresh_time");
            }
            if (jSONObject.isNull("s_t")) {
                lVar3.B = 900000L;
            } else {
                lVar3.B = jSONObject.optLong("s_t");
            }
            if (jSONObject.isNull(com.anythink.core.common.k.N)) {
                lVar3.C = 1800000L;
            } else {
                lVar3.C = jSONObject.optLong(com.anythink.core.common.k.N);
            }
            if (jSONObject.isNull("ra")) {
                lVar3.D = -1;
            } else {
                lVar3.D = jSONObject.optInt("ra");
            }
            if (jSONObject.isNull("asid")) {
                lVar3.E = "";
            } else {
                lVar3.E = jSONObject.optString("asid");
            }
            if (!jSONObject.isNull("tp_ps")) {
                try {
                    bt btVar = new bt();
                    JSONObject optJSONObject = jSONObject.optJSONObject("tp_ps");
                    btVar.f3886a = optJSONObject.optInt("pucs") == 1;
                    btVar.b = optJSONObject.optLong("apdt");
                    btVar.c = optJSONObject.optInt("aprn");
                    btVar.d = optJSONObject.optInt("puas") == 1;
                    btVar.e = optJSONObject.optLong("cdt");
                    btVar.f = optJSONObject.optInt("ski_swt") == 1;
                    btVar.g = optJSONObject.optInt("aut_swt") == 1;
                    lVar3.F = btVar;
                } catch (Exception unused) {
                }
            } else {
                lVar3.F = null;
            }
            if (jSONObject.isNull("ug_list")) {
                lVar3.aV = new JSONArray();
            } else {
                lVar3.aV = jSONObject.optJSONArray("ug_list");
            }
            if (jSONObject.isNull("ol_list")) {
                lVar3.aW = new JSONArray();
            } else {
                lVar3.aW = jSONObject.optJSONArray("ol_list");
            }
            if (jSONObject.isNull("s2shb_list")) {
                lVar3.aX = new JSONArray();
            } else {
                lVar3.aX = jSONObject.optJSONArray("s2shb_list");
            }
            if (jSONObject.isNull(a.g)) {
                lVar3.aY = new JSONArray();
            } else {
                lVar3.aY = jSONObject.optJSONArray(a.g);
            }
            if (jSONObject.isNull(a.j)) {
                lVar3.aZ = new JSONArray();
            } else {
                lVar3.aZ = jSONObject.optJSONArray(a.j);
            }
            if (jSONObject.isNull(a.k)) {
                lVar3.ba = new JSONArray();
            } else {
                lVar3.ba = jSONObject.optJSONArray(a.k);
            }
            if (jSONObject.isNull(a.u)) {
                lVar3.bb = new JSONArray();
            } else {
                lVar3.bb = jSONObject.optJSONArray(a.u);
            }
            if (jSONObject.isNull(a.w)) {
                lVar3.bc = new JSONArray();
            } else {
                lVar3.bc = jSONObject.optJSONArray(a.w);
            }
            if (!jSONObject.isNull(a.ac)) {
                optLong = jSONObject.optLong(a.ac);
                lVar3.bP = optLong;
            } else {
                lVar3.bP = 0L;
                optLong = 0;
            }
            if (jSONObject.isNull("t_g_id")) {
                lVar3.G = -1;
            } else {
                lVar3.G = jSONObject.optInt("t_g_id");
            }
            if (jSONObject.isNull(a.aD)) {
                lVar3.H = "";
            } else {
                lVar3.H = jSONObject.optString(a.aD);
            }
            if (jSONObject.isNull("u_n_f_sw")) {
                lVar3.I = 0;
            } else {
                lVar3.I = jSONObject.optInt("u_n_f_sw");
            }
            if (!jSONObject.isNull("m_o_s")) {
                lVar3.X = ba.u(jSONObject.optString("m_o_s"));
            }
            if (jSONObject.isNull("m_o")) {
                lVar3.W = null;
            } else {
                lVar3.W = a(jSONObject.optString("m_o"), jSONObject.optString("m_o_ks"), optLong, lVar3.X);
            }
            if (jSONObject.isNull("p_m_o")) {
                lVar3.J = 0;
            } else {
                lVar3.J = jSONObject.optInt("p_m_o");
            }
            if (!jSONObject.isNull(com.anythink.core.common.m.s.b)) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString(com.anythink.core.common.m.s.b));
                HashMap hashMap = new HashMap();
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.opt(next));
                }
                lVar3.L = hashMap;
            } else {
                lVar3.L = null;
            }
            if (!jSONObject.isNull("callback")) {
                JSONObject jSONObject3 = new JSONObject(jSONObject.optString("callback"));
                if (!jSONObject3.isNull("sc_list")) {
                    JSONObject jSONObject4 = new JSONObject(jSONObject3.optString("sc_list"));
                    HashMap hashMap2 = new HashMap();
                    Iterator<String> keys2 = jSONObject4.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        JSONObject jSONObject5 = new JSONObject(jSONObject4.optString(next2));
                        ATRewardInfo aTRewardInfo = new ATRewardInfo();
                        try {
                            aTRewardInfo.rewardName = jSONObject5.optString("rw_n");
                            aTRewardInfo.rewardNumber = jSONObject5.optInt("rw_num");
                            hashMap2.put(next2, aTRewardInfo);
                            lVar2 = null;
                        } catch (Exception unused2) {
                            return null;
                        }
                    }
                    lVar3.M = hashMap2;
                }
                if (!jSONObject3.isNull("reward")) {
                    JSONObject jSONObject6 = new JSONObject(jSONObject3.optString("reward"));
                    ATRewardInfo aTRewardInfo2 = new ATRewardInfo();
                    if (!jSONObject6.isNull("rw_n")) {
                        aTRewardInfo2.rewardName = jSONObject6.optString("rw_n");
                    }
                    if (!jSONObject6.isNull("rw_num")) {
                        aTRewardInfo2.rewardNumber = jSONObject6.optInt("rw_num");
                    }
                    lVar3.N = aTRewardInfo2;
                }
                if (!jSONObject3.isNull("currency")) {
                    lVar3.O = jSONObject3.optString("currency");
                }
                if (!jSONObject3.isNull(com.anythink.expressad.f.a.b.h)) {
                    lVar3.P = jSONObject3.optString(com.anythink.expressad.f.a.b.h);
                }
                if (!jSONObject3.isNull("exch_r")) {
                    lVar3.Z = jSONObject3.optDouble("exch_r", 0.0d);
                }
                if (!jSONObject3.isNull("acct_cy")) {
                    lVar3.aa = jSONObject3.optString("acct_cy");
                }
            }
            if (jSONObject.isNull(a.f4523a)) {
                lVar3.Q = 10000L;
            } else {
                lVar3.Q = jSONObject.optLong(a.f4523a);
            }
            if (jSONObject.isNull(a.b)) {
                lVar3.R = "";
            } else {
                lVar3.R = jSONObject.optString(a.b);
            }
            if (jSONObject.isNull(a.c)) {
                lVar3.S = 10000L;
            } else {
                lVar3.S = jSONObject.optLong(a.c);
            }
            if (jSONObject.isNull(a.d)) {
                lVar3.T = -1;
            } else {
                lVar3.T = jSONObject.optInt(a.d);
            }
            if (jSONObject.isNull(a.e)) {
                lVar3.U = 900000L;
            } else {
                lVar3.U = jSONObject.optLong(a.e);
            }
            if (!jSONObject.isNull(a.f)) {
                int optInt2 = jSONObject.optInt(a.f, 1);
                if (optInt2 <= 0) {
                    optInt2 = 1;
                }
                lVar3.V = optInt2;
            } else {
                lVar3.V = 2;
            }
            if (jSONObject.isNull(a.i)) {
                lVar = null;
                try {
                    lVar3.bN = null;
                } catch (Exception unused3) {
                    return lVar;
                }
            } else {
                lVar3.bN = jSONObject.optString(a.i);
            }
            if (jSONObject.isNull(a.h)) {
                lVar3.bO = "";
            } else {
                lVar3.bO = jSONObject.optString(a.h);
            }
            if (jSONObject.isNull(a.l)) {
                lVar3.Y = Const.L_SAME_TOAST;
            } else {
                lVar3.Y = jSONObject.optLong(a.l);
            }
            if (!jSONObject.isNull(a.m)) {
                JSONArray optJSONArray2 = jSONObject.optJSONArray(a.m);
                ArrayList arrayList = new ArrayList(3);
                for (int i = 0; i < optJSONArray2.length(); i++) {
                    arrayList.add(optJSONArray2.optString(i));
                }
                lVar3.ab = arrayList;
            } else {
                lVar3.ab = null;
            }
            if (jSONObject.isNull(a.n)) {
                lVar3.ac = "";
            } else {
                lVar3.ac = jSONObject.optString(a.n);
            }
            if (jSONObject.isNull(a.o)) {
                lVar3.ad = "";
            } else {
                lVar3.ad = jSONObject.optString(a.o);
            }
            if (jSONObject.isNull(a.p)) {
                lVar3.ae = "";
            } else {
                lVar3.ae = jSONObject.optString(a.p);
            }
            if (jSONObject.isNull(a.f4525q)) {
                lVar3.af = "";
            } else {
                lVar3.af = jSONObject.optString(a.f4525q);
            }
            if (jSONObject.isNull(a.r)) {
                lVar3.ag = 500L;
            } else {
                lVar3.ag = jSONObject.optLong(a.r);
            }
            if (jSONObject.isNull(a.s)) {
                lVar3.ah = "";
            } else {
                lVar3.ah = jSONObject.optString(a.s);
            }
            if (jSONObject.isNull(a.t)) {
                lVar3.f4521ai = "";
            } else {
                lVar3.f4521ai = jSONObject.optString(a.t);
            }
            if (jSONObject.isNull(a.v)) {
                lVar3.aj = 0.1614d;
            } else {
                lVar3.aj = jSONObject.optDouble(a.v);
            }
            if (jSONObject.isNull(a.x)) {
                lVar3.be = new JSONArray();
            } else {
                lVar3.be = jSONObject.optJSONArray(a.x);
            }
            if (jSONObject.isNull(a.y)) {
                lVar3.ak = 1000L;
            } else {
                lVar3.ak = jSONObject.optLong(a.y);
            }
            if (jSONObject.isNull(a.z)) {
                lVar3.al = 0L;
            } else {
                lVar3.al = jSONObject.optLong(a.z);
            }
            if (jSONObject.isNull(a.A)) {
                lVar3.am = 2000L;
            } else {
                lVar3.am = jSONObject.optLong(a.A);
            }
            if (jSONObject.isNull(a.B)) {
                lVar3.an = -1L;
            } else {
                lVar3.an = jSONObject.optLong(a.B);
            }
            if (!jSONObject.isNull(a.C)) {
                int optInt3 = jSONObject.optInt(a.C);
                if (optInt3 != 1 && optInt3 != 2) {
                    new StringBuilder("requestUnitGroupType error: ").append(optInt3);
                    optInt3 = 1;
                }
                lVar3.ao = optInt3;
            } else {
                lVar3.ao = 1;
            }
            if (jSONObject.isNull(a.D)) {
                lVar3.ap = 1;
            } else {
                lVar3.ap = jSONObject.optInt(a.D);
            }
            if (jSONObject.isNull(a.E)) {
                lVar3.aq = 2;
            } else {
                lVar3.aq = jSONObject.optInt(a.E);
            }
            if (jSONObject.isNull(a.F)) {
                lVar3.ar = 2000L;
            } else {
                lVar3.ar = jSONObject.optLong(a.F);
            }
            if (jSONObject.isNull(a.G)) {
                lVar3.bd = new JSONArray();
            } else {
                lVar3.bd = jSONObject.optJSONArray(a.G);
            }
            if (jSONObject.isNull("bid_floor")) {
                lVar3.bQ = 0.0d;
            } else {
                lVar3.bQ = jSONObject.optDouble("bid_floor");
            }
            if (jSONObject.isNull(a.I)) {
                lVar3.as = null;
            } else {
                lVar3.as = jSONObject.optJSONObject(a.I);
            }
            if (jSONObject.isNull(a.K)) {
                lVar3.bR = 0;
            } else {
                lVar3.bR = jSONObject.optInt(a.K);
            }
            if (jSONObject.isNull(a.L)) {
                lVar3.bS = 2;
            } else {
                lVar3.bS = jSONObject.optInt(a.L);
            }
            if (jSONObject.isNull(a.M)) {
                lVar3.bU = 0;
            } else {
                lVar3.bU = jSONObject.optInt(a.M);
            }
            if (jSONObject.isNull(a.N)) {
                lVar3.bT = 0;
            } else {
                lVar3.bT = jSONObject.optInt(a.N);
            }
            if (jSONObject.isNull("is_test")) {
                lVar3.bM = 2;
            } else {
                lVar3.bM = jSONObject.optInt("is_test");
            }
            lVar3.at = jSONObject.optJSONObject(a.R);
            if (jSONObject.isNull(a.S)) {
                lVar3.au = "";
            } else {
                lVar3.au = jSONObject.optString(a.S);
            }
            if (jSONObject.isNull(a.T)) {
                lVar3.av = "";
            } else {
                lVar3.av = jSONObject.optString(a.T);
            }
            if (!jSONObject.isNull(a.U)) {
                lVar3.aw = jSONObject.optInt(a.U);
            } else {
                lVar3.aw = 2;
            }
            if (!jSONObject.isNull(a.V)) {
                lVar3.ax = jSONObject.optInt(a.V);
            } else {
                lVar3.ax = 1;
            }
            if (!jSONObject.isNull(a.W)) {
                ArrayList arrayList2 = new ArrayList(3);
                JSONArray optJSONArray3 = jSONObject.optJSONArray(a.W);
                if (optJSONArray3 != null) {
                    int length2 = optJSONArray3.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i2)));
                    }
                }
                lVar3.ay = arrayList2;
            } else {
                lVar3.ay = new ArrayList(1);
            }
            if (jSONObject.isNull(a.X)) {
                lVar3.az = 2;
            } else {
                lVar3.az = jSONObject.optInt(a.X);
            }
            if (!jSONObject.isNull(a.Y)) {
                lVar3.aA = jSONObject.optInt(a.Y);
            } else {
                lVar3.aA = 1;
            }
            if (jSONObject.isNull(a.Z)) {
                lVar3.aB = 2;
            } else {
                lVar3.aB = jSONObject.optInt(a.Z);
            }
            if (!jSONObject.isNull(a.aa)) {
                lVar3.bV = jSONObject.optJSONObject(a.aa);
            }
            if (!jSONObject.isNull(a.ab)) {
                lVar3.aD = jSONObject.optInt(a.ab);
            }
            if (!jSONObject.isNull(a.af)) {
                lVar3.aE = jSONObject.optInt(a.af);
            }
            if (!jSONObject.isNull(a.ag)) {
                lVar3.aF = jSONObject.optInt(a.ag);
            }
            if (!jSONObject.isNull(a.ad)) {
                lVar3.aG = jSONObject.optInt(a.ad);
            }
            if (!jSONObject.isNull(a.ae)) {
                try {
                    JSONArray optJSONArray4 = jSONObject.optJSONArray(a.ae);
                    if (optJSONArray4 != null) {
                        double[][] dArr = new double[optJSONArray4.length()][];
                        for (int i3 = 0; i3 < optJSONArray4.length(); i3++) {
                            Object obj = optJSONArray4.get(i3);
                            if (obj instanceof JSONArray) {
                                JSONArray jSONArray = (JSONArray) obj;
                                dArr[i3] = new double[]{Double.parseDouble(String.valueOf(jSONArray.get(0))), Double.parseDouble(String.valueOf(jSONArray.get(1)))};
                            }
                        }
                        lVar3.aH = dArr;
                    }
                } catch (Exception unused4) {
                }
            }
            if (!jSONObject.isNull(a.ah)) {
                lVar3.aI = jSONObject.optInt(a.ah);
            }
            lVar3.bh = jSONObject.optLong(a.f4524ai, 2000L);
            lVar3.bi = jSONObject.optInt(a.aj, 2);
            int optInt4 = jSONObject.optInt(a.ak, 1);
            if (optInt4 != 1 && optInt4 != 2) {
                new StringBuilder("filledLoadRequestType error: ").append(optInt4);
                optInt4 = 1;
            }
            lVar3.bj = optInt4;
            int optInt5 = jSONObject.optInt(a.al, 1);
            if (optInt5 <= 0) {
                optInt5 = 1;
            }
            lVar3.bk = optInt5;
            lVar3.bn = jSONObject.optInt(a.am, 0);
            lVar3.bo = jSONObject.optString(a.an, "");
            lVar3.bp = jSONObject.optInt("s2s_sw", 2);
            JSONArray optJSONArray5 = jSONObject.optJSONArray(a.ap);
            if (optJSONArray5 != null && (length = optJSONArray5.length()) > 0) {
                ArrayList arrayList3 = new ArrayList();
                for (int i4 = 0; i4 < length; i4++) {
                    Object obj2 = optJSONArray5.get(i4);
                    if (obj2 instanceof Integer) {
                        arrayList3.add((Integer) obj2);
                    }
                }
                lVar3.bl = arrayList3;
            }
            lVar3.bq = jSONObject.optInt(a.aq, 1);
            int[] iArr = {1, 2, 3, 4, 5};
            if (!jSONObject.isNull(a.ar) && (optJSONArray = jSONObject.optJSONArray(a.ar)) != null && optJSONArray.length() > 0) {
                try {
                    iArr = new int[optJSONArray.length()];
                    for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                        iArr[i5] = optJSONArray.getInt(i5);
                    }
                } catch (Exception unused5) {
                    iArr = new int[]{1, 2, 3, 4, 5};
                }
            }
            lVar3.br = iArr;
            lVar3.aJ = jSONObject.optInt(a.as, 1);
            if (jSONObject.optInt(a.at, 2) == 1) {
                lVar3.aK = f.a(jSONObject.optString(a.au));
            } else {
                lVar = null;
                lVar3.aK = null;
            }
            lVar3.aC = jSONObject.optInt(a.av, 0);
            lVar3.bs = jSONObject.optInt(a.aw, 2);
            lVar3.bm = jSONObject.optInt(a.ax);
            lVar3.bu = jSONObject.optInt(a.ay, DateTimeConstants.MILLIS_PER_WEEK);
            lVar3.bv = jSONObject.optString(a.az);
            JSONObject optJSONObject2 = jSONObject.optJSONObject(a.aB);
            if (optJSONObject2 != null && optJSONObject2.length() > 0) {
                ap apVar = new ap();
                apVar.a(jSONObject.optString("unique_id"));
                apVar.c(optJSONObject2.optString(a.aC));
                apVar.a(optJSONObject2.optInt(a.aD));
                apVar.b(optJSONObject2.optInt(a.aE));
                lVar3.bw = apVar;
            }
            com.anythink.core.common.v.t.a(lVar3.aj);
            lVar3.bx = jSONObject.optInt(a.aF, -1);
            JSONArray optJSONArray6 = jSONObject.optJSONArray(a.aG);
            if (optJSONArray6 == null) {
                optJSONArray6 = new JSONArray();
            }
            lVar3.bf = optJSONArray6;
            JSONArray optJSONArray7 = jSONObject.optJSONArray(a.aH);
            if (optJSONArray7 == null) {
                optJSONArray7 = new JSONArray();
            }
            lVar3.bg = optJSONArray7;
            lVar3.by = jSONObject.optInt(a.aI, -1);
            lVar3.bz = jSONObject.optInt(a.aJ, -1);
            lVar3.bA = jSONObject.optInt(a.aK, 2000);
            lVar3.bB = ai.a(jSONObject);
            lVar3.bC = com.anythink.core.common.v.q.b(jSONObject.optJSONArray(a.aL));
            JSONObject optJSONObject3 = jSONObject.optJSONObject(a.aM);
            if (optJSONObject3 != null) {
                lVar3.bD = optJSONObject3;
            }
            lVar3.bE = jSONObject.optInt(a.aN, 1);
            lVar3.bF = jSONObject.optInt(a.aO, 10000);
            lVar3.bG = jSONObject.optInt(a.aP, 3000);
            lVar3.bL = jSONObject.optInt(a.aQ, 2);
            JSONObject optJSONObject4 = jSONObject.optJSONObject(a.aR);
            if (optJSONObject4 != null) {
                lVar3.bH = optJSONObject4;
            }
            lVar3.bI = jSONObject.optInt(a.aS, 2);
            lVar3.aN = jSONObject.optInt("req_ug_type_v2", -1);
            lVar3.aO = jSONObject.optInt("device_perf_sw", 0);
            lVar3.aP = jSONObject.optInt("max_cached_num", -1);
            lVar3.aQ = jSONObject.optLong("wf_req_wait_t", 0L);
            lVar3.aR = jSONObject.optLong("c2s_req_wait_t", 0L);
            lVar3.aS = jSONObject.optLong("s2s_req_wait_t", 0L);
            lVar3.aT = jSONObject.optInt("auto_req_type", -1);
            lVar3.aU = jSONObject.optInt("auto_refresh_type_v2", -1);
            return lVar3;
        } catch (Exception unused6) {
            return lVar2;
        }
    }

    public final int t() {
        return this.bn;
    }

    private void m(int i) {
        this.bn = i;
    }

    public final String u() {
        return this.bo;
    }

    private void c(String str) {
        this.bo = str;
    }

    public final int v() {
        return this.bp;
    }

    private void n(int i) {
        this.bp = i;
    }

    private void a(Map<String, bv> map) {
        this.x = map;
    }

    public final Map<String, bv> w() {
        return this.x;
    }

    public final bv a(String str) {
        Map<String, bv> map = this.x;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }

    public final List<bv> x() {
        return this.w;
    }

    private void b(List<bv> list) {
        this.w = list;
    }

    public final int y() {
        return this.az;
    }

    private void o(int i) {
        this.az = i;
    }

    public final List<Integer> z() {
        return this.ay;
    }

    private void c(List<Integer> list) {
        this.ay = list;
    }

    public final String A() {
        return this.av;
    }

    private void d(String str) {
        this.av = str;
    }

    public final String B() {
        return this.au;
    }

    private void e(String str) {
        this.au = str;
    }

    public final JSONObject C() {
        return this.at;
    }

    private void a(JSONObject jSONObject) {
        this.at = jSONObject;
    }

    private JSONObject bK() {
        return this.as;
    }

    private void e(JSONObject jSONObject) {
        this.as = jSONObject;
    }

    public final int D() {
        return this.bM;
    }

    private void p(int i) {
        this.bM = i;
    }

    public final long E() {
        return this.ar;
    }

    private void e(long j) {
        this.ar = j;
    }

    public final int F() {
        return this.aq;
    }

    private void q(int i) {
        this.aq = i;
    }

    private void r(int i) {
        this.ao = i;
    }

    private void s(int i) {
        this.ap = i;
    }

    public final int H() {
        int i = this.ao;
        if (i == 1) {
            return this.o;
        }
        if (i != 2) {
            return 1;
        }
        return this.ap;
    }

    public final long I() {
        return this.an;
    }

    private void f(long j) {
        this.an = j;
    }

    public final JSONArray J() {
        return this.be;
    }

    private void a(JSONArray jSONArray) {
        this.be = jSONArray;
    }

    public final long K() {
        return this.ak;
    }

    private void g(long j) {
        this.ak = j;
    }

    public final double L() {
        return this.aj;
    }

    private void a(double d) {
        this.aj = d;
    }

    public final String M() {
        return this.ah;
    }

    private void f(String str) {
        this.ah = str;
    }

    public final String N() {
        return this.f4521ai;
    }

    private void g(String str) {
        this.f4521ai = str;
    }

    public final JSONArray O() {
        return this.bb;
    }

    private void b(JSONArray jSONArray) {
        this.bb = jSONArray;
    }

    public final long P() {
        return this.ag;
    }

    private void h(long j) {
        this.ag = j;
    }

    public final String Q() {
        return this.ad;
    }

    private void h(String str) {
        this.ad = str;
    }

    public final String R() {
        return this.ac;
    }

    private void i(String str) {
        this.ac = str;
    }

    public final List<String> S() {
        return this.ab;
    }

    private void d(List<String> list) {
        this.ab = list;
    }

    public final double T() {
        return this.Z;
    }

    private void b(double d) {
        this.Z = d;
    }

    public final String U() {
        return this.aa;
    }

    private void j(String str) {
        this.aa = str;
    }

    public final long V() {
        return this.Y;
    }

    private void i(long j) {
        this.Y = j;
    }

    public final JSONArray W() {
        return this.ba;
    }

    private void c(JSONArray jSONArray) {
        this.ba = jSONArray;
    }

    public final String X() {
        return this.bN;
    }

    private void k(String str) {
        this.bN = str;
    }

    private String bL() {
        return this.bO;
    }

    private void l(String str) {
        this.bO = str;
    }

    public final JSONArray Y() {
        return this.aY;
    }

    private void d(JSONArray jSONArray) {
        this.aY = jSONArray;
    }

    private void a(ba baVar) {
        this.X = baVar;
    }

    public final ba Z() {
        return this.X;
    }

    public final List<ay> aa() {
        return this.W;
    }

    private void e(List<ay> list) {
        this.W = list;
    }

    private String bM() {
        return this.R;
    }

    private void m(String str) {
        this.R = str;
    }

    public final long ab() {
        return this.Q;
    }

    private void j(long j) {
        this.Q = j;
    }

    public final Map<String, ATRewardInfo> ac() {
        return this.M;
    }

    public final String ad() {
        return this.O;
    }

    private void n(String str) {
        this.O = str;
    }

    public final String ae() {
        return this.P;
    }

    private void o(String str) {
        this.P = str;
    }

    private void b(Map<String, ATRewardInfo> map) {
        this.M = map;
    }

    public final ATRewardInfo af() {
        return this.N;
    }

    private void a(ATRewardInfo aTRewardInfo) {
        this.N = aTRewardInfo;
    }

    public final Map<String, Object> ag() {
        return this.L;
    }

    private void c(Map<String, Object> map) {
        this.L = map;
    }

    public final int ah() {
        return this.J;
    }

    private void t(int i) {
        this.J = i;
    }

    public final int ai() {
        return this.G;
    }

    private void u(int i) {
        this.G = i;
    }

    public final String aj() {
        return this.H;
    }

    private void p(String str) {
        this.H = str;
    }

    public final int ak() {
        return this.I;
    }

    private void v(int i) {
        this.I = i;
    }

    public final long al() {
        return this.B;
    }

    private void k(long j) {
        this.B = j;
    }

    public final long am() {
        return this.C;
    }

    private void l(long j) {
        this.C = j;
    }

    private int bN() {
        return this.D;
    }

    private void w(int i) {
        this.D = i;
    }

    public final String an() {
        return this.E;
    }

    private void q(String str) {
        this.E = str;
    }

    public final int ao() {
        return this.z;
    }

    private void x(int i) {
        this.z = i;
    }

    public final long ap() {
        return this.A;
    }

    private void m(long j) {
        this.A = j;
    }

    public final int aq() {
        return this.y;
    }

    private void y(int i) {
        this.y = i;
    }

    public final long ar() {
        return this.k;
    }

    private void n(long j) {
        this.k = j;
    }

    public final long as() {
        return this.l;
    }

    private void o(long j) {
        this.l = j;
    }

    public final int at() {
        return this.m;
    }

    private void z(int i) {
        this.m = i;
    }

    private int bO() {
        return this.n;
    }

    private void A(int i) {
        this.n = i;
    }

    public final int au() {
        return this.o;
    }

    private void B(int i) {
        this.o = i;
    }

    public final long av() {
        return this.p;
    }

    private void p(long j) {
        this.p = j;
    }

    public final long aw() {
        return this.f4522q;
    }

    private void q(long j) {
        this.f4522q = j;
    }

    public final long ax() {
        return this.r;
    }

    private void r(long j) {
        this.r = j;
    }

    private int bP() {
        return this.s;
    }

    private void C(int i) {
        this.s = i;
    }

    private int bQ() {
        return this.t;
    }

    private void D(int i) {
        this.t = i;
    }

    private int bR() {
        return this.u;
    }

    private void E(int i) {
        this.u = i;
    }

    public final int ay() {
        return this.v;
    }

    private void F(int i) {
        this.v = i;
    }

    private bt bS() {
        return this.F;
    }

    private void a(bt btVar) {
        this.F = btVar;
    }

    public final JSONArray az() {
        return this.aV;
    }

    private void e(JSONArray jSONArray) {
        this.aV = jSONArray;
    }

    public final JSONArray aA() {
        return this.aW;
    }

    private void f(JSONArray jSONArray) {
        this.aW = jSONArray;
    }

    public final JSONArray aB() {
        return this.aX;
    }

    private void g(JSONArray jSONArray) {
        this.aX = jSONArray;
    }

    public final JSONArray aC() {
        return this.aZ;
    }

    private void h(JSONArray jSONArray) {
        this.aZ = jSONArray;
    }

    private long bT() {
        return this.bP;
    }

    private void s(long j) {
        this.bP = j;
    }

    public final long aD() {
        return this.S;
    }

    private void t(long j) {
        this.S = j;
    }

    public final int aE() {
        return this.T;
    }

    private void G(int i) {
        this.T = i;
    }

    public final long aF() {
        return this.U;
    }

    private void u(long j) {
        this.U = j;
    }

    public final int aG() {
        return this.V;
    }

    private void H(int i) {
        this.V = i;
    }

    private String bU() {
        return this.ae;
    }

    private void r(String str) {
        this.ae = str;
    }

    public final String aH() {
        return this.af;
    }

    private void s(String str) {
        this.af = str;
    }

    public final JSONArray aI() {
        return this.bc;
    }

    private void i(JSONArray jSONArray) {
        this.bc = jSONArray;
    }

    private long bV() {
        return this.al;
    }

    private void v(long j) {
        this.al = j;
    }

    private long bW() {
        return this.am;
    }

    private void w(long j) {
        this.am = j;
    }

    public final JSONArray aJ() {
        return this.bd;
    }

    private void j(JSONArray jSONArray) {
        this.bd = jSONArray;
    }

    public final int aK() {
        return this.bS;
    }

    private void I(int i) {
        this.bS = i;
    }

    public final int aL() {
        return this.bR;
    }

    private void J(int i) {
        this.bR = i;
    }

    public final double aM() {
        return this.bQ;
    }

    private void c(double d) {
        this.bQ = d;
    }

    public final int aN() {
        return this.bT;
    }

    private void K(int i) {
        this.bT = i;
    }

    public final int aO() {
        return this.bU;
    }

    private void L(int i) {
        this.bU = i;
    }

    public final int aP() {
        return this.aw;
    }

    private void M(int i) {
        this.aw = i;
    }

    private int bX() {
        return this.ax;
    }

    private void N(int i) {
        this.ax = i;
    }

    private int bY() {
        return this.aA;
    }

    private void O(int i) {
        this.aA = i;
    }

    public final JSONObject aQ() {
        return this.bV;
    }

    private void f(JSONObject jSONObject) {
        this.bV = jSONObject;
    }

    public final boolean aR() {
        return this.aC == 1;
    }

    public final boolean aS() {
        return this.aD == 1;
    }

    private void P(int i) {
        this.aD = i;
    }

    public final boolean aT() {
        return this.aC == 2;
    }

    public final boolean aU() {
        return this.aC == 0;
    }

    public final int aV() {
        return this.aE;
    }

    private void Q(int i) {
        this.aE = i;
    }

    public final int aW() {
        return this.aF;
    }

    private void R(int i) {
        this.aF = i;
    }

    public final int aX() {
        return this.aG;
    }

    private void S(int i) {
        this.aG = i;
    }

    private void a(double[][] dArr) {
        this.aH = dArr;
    }

    public final double[][] aY() {
        return this.aH;
    }

    public final int aZ() {
        return this.aC;
    }

    public final void a(int i) {
        this.aC = i;
    }

    public final int bc() {
        return this.aI;
    }

    private void T(int i) {
        this.aI = i;
    }

    public final int bd() {
        return this.bq;
    }

    private void U(int i) {
        this.bq = i;
    }

    private int[] bZ() {
        return this.br;
    }

    private void a(int[] iArr) {
        this.br = iArr;
    }

    private void V(int i) {
        this.bs = i;
    }

    public final boolean be() {
        return this.bs == 1;
    }

    public final com.anythink.core.common.h.q bf() {
        return this.aL;
    }

    public final boolean bg() {
        return this.bi == 1;
    }

    private int ca() {
        return this.bm;
    }

    private void W(int i) {
        this.bm = i;
    }

    public final boolean bh() {
        return this.bm == 1;
    }

    public static l a(String str, JSONObject jSONObject) {
        l b2 = b(str, jSONObject);
        if (b2 != null) {
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            ArrayList arrayList = new ArrayList();
            u.a(b2, concurrentHashMap, arrayList);
            b2.w = arrayList;
            b2.x = concurrentHashMap;
        }
        return b2;
    }

    public final ap bi() {
        return this.bw;
    }

    public final boolean bj() {
        return this.n == 1;
    }

    private static List<ay> a(String str, String str2, long j, ba baVar) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                ay ayVar = new ay();
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                ayVar.k(optJSONObject.optString("o_id"));
                ayVar.l(optJSONObject.optString(a.aE));
                ayVar.m(optJSONObject.optString(ak.aH));
                ayVar.x(optJSONObject.optString("p_g"));
                ayVar.n(optJSONObject.optString("d"));
                ayVar.o(optJSONObject.optString("ic_u"));
                ayVar.p(optJSONObject.optString("im_u"));
                ayVar.q(optJSONObject.optString("f_i_u"));
                ayVar.r(optJSONObject.optString("a_c_u"));
                ayVar.s(optJSONObject.optString("c_t"));
                ayVar.t(optJSONObject.optString("v_u"));
                ayVar.h(optJSONObject.optInt("l_t"));
                ayVar.u(optJSONObject.optString("p_u"));
                ayVar.v(optJSONObject.optString(CmcdConfiguration.KEY_DEADLINE));
                ayVar.w(optJSONObject.optString("c_u"));
                ayVar.aa(optJSONObject.optString("ip_u"));
                ayVar.ab(optJSONObject.optString("t_u"));
                ayVar.ac(optJSONObject.optString("t_u_25"));
                ayVar.ad(optJSONObject.optString("t_u_50"));
                ayVar.ae(optJSONObject.optString("t_u_75"));
                ayVar.af(optJSONObject.optString("t_u_100"));
                ayVar.ag(optJSONObject.optString("s_e_c_t_u"));
                ayVar.ah(optJSONObject.optString("c_t_u"));
                ayVar.ai(optJSONObject.optString("ip_n_u"));
                ayVar.aj(optJSONObject.optString("c_n_u"));
                ayVar.c = optJSONObject.optInt("o_a_d_c");
                ayVar.d = optJSONObject.optLong("o_a_p");
                ayVar.b(j);
                ayVar.g(optJSONObject.optInt("unit_type"));
                ayVar.a(optJSONObject.optInt("c_m"));
                ayVar.b(optJSONObject.optString("ext_h_pic"));
                ayVar.X(optJSONObject.optString("ext_big_h_pic"));
                ayVar.Y(optJSONObject.optString("ext_rect_h_pic"));
                ayVar.Z(optJSONObject.optString("ext_home_h_pic"));
                ayVar.a(str2);
                ayVar.z(optJSONObject.optString("pub"));
                ayVar.A(optJSONObject.optString("app_vc"));
                ayVar.B(optJSONObject.optString("pvc"));
                ayVar.C(optJSONObject.optString(Const.SP_KEY_PER_UPLOAD_MXSIZE));
                ayVar.c((y) baVar);
                arrayList.add(ayVar);
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return arrayList;
    }

    public final ay b(String str) {
        List<ay> list = this.W;
        if (list == null) {
            return null;
        }
        for (ay ayVar : list) {
            if (ayVar.r() == null) {
                ayVar.c((y) this.X);
            }
            if (TextUtils.equals(str, ayVar.v()) && !ayVar.a2(this.X)) {
                return ayVar;
            }
        }
        return null;
    }

    public final boolean bk() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.bP > this.k;
    }

    public final boolean bl() {
        System.currentTimeMillis();
        return System.currentTimeMillis() - this.bP > ((long) this.bu);
    }

    public final Map<String, Object> a(String str, String str2, bv bvVar, ATAdRequest aTAdRequest) {
        String str3;
        com.anythink.core.common.h.q qVar;
        ad R;
        Map<String, Object> l = bvVar.l();
        boolean b2 = com.anythink.core.common.v.p.b();
        b b3 = d.a(com.anythink.core.common.d.t.b().g()).b(com.anythink.core.common.d.t.b().p());
        if (!TextUtils.isEmpty(bvVar.E())) {
            l.put("payload", bvVar.E());
            if (bvVar.R() != null && !TextUtils.isEmpty(bvVar.R().r())) {
                l.put(j.w.c, bvVar.R().r());
            }
        }
        if (!TextUtils.isEmpty(bvVar.W())) {
            l.put("custom_inhouse_bid_result", bvVar.W());
        }
        boolean z = false;
        l.put(j.w.d, Boolean.valueOf(b3.B() == 3));
        if (b3.C() == 2 && b2) {
            z = true;
        }
        l.put(j.w.e, Boolean.valueOf(z));
        l.put(j.w.f, Boolean.valueOf(v.a(com.anythink.core.common.d.t.b().g()).b(bvVar.g())));
        if (bvVar.g() == 66 && bvVar.R() != null) {
            int a2 = bvVar.R().a(this.y);
            if (a2 >= 0) {
                l.put("ad_type", Integer.valueOf(a2));
            } else {
                l.put("ad_type", Integer.valueOf(bvVar.ae()));
            }
        } else {
            l.put("ad_type", Integer.valueOf(bvVar.ae()));
        }
        if (this.ax == 1) {
            l.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.MEDIATION_WF_ID, str + "_" + this.G + "_" + this.v + "_" + str2);
        }
        l.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.STACK_INFO, com.anythink.core.common.u.a().f(str));
        if (bvVar.g() == 28 && (R = bvVar.R()) != null) {
            l.put(j.w.m, Double.valueOf(com.anythink.core.common.v.p.a(bvVar) * R.l));
        }
        String m = com.anythink.core.common.v.m.m();
        if (!TextUtils.isEmpty(m)) {
            l.put(ATAdConst.KEY.WECHAT_APPID, m);
        }
        if (bvVar.g() == 35 || bvVar.q() == 3 || bvVar.q() == 4 || bvVar.q() == 7) {
            x xVar = new x();
            xVar.f3937a = bvVar.E();
            xVar.f = bvVar.g();
            xVar.c = bvVar.z();
            xVar.d = str2;
            xVar.b = str;
            xVar.h = this.G;
            xVar.i = this.v;
            xVar.j = this.y;
            xVar.g = bvVar.h();
            if (aTAdRequest != null) {
                xVar.u = aTAdRequest.getChannelSource();
            }
            xVar.v = bvVar.k();
            ad R2 = bvVar.R();
            if (R2 != null) {
                xVar.k = R2.a(this.y);
                xVar.s = R2.x();
                xVar.t = R2.getOriginRequestId();
            } else {
                xVar.k = -1;
            }
            xVar.l = R2 != null ? R2.g : "";
            if (R2 == null) {
                str3 = "";
            } else {
                str3 = R2.h;
            }
            xVar.m = str3;
            if (bvVar.g() == 35) {
                xVar.o = this.X;
            } else {
                xVar.o = bk.u(this.bO);
            }
            if (xVar.o != null) {
                xVar.o.s(this.y);
            }
            xVar.n = R2 != null ? R2.f : 0L;
            if (TextUtils.equals(String.valueOf(this.y), "0")) {
                xVar.p = TextUtils.equals(ATInitMediation.getStringFromMap(l, MBridgeConstans.PROPERTIES_LAYOUT_TYPE, ""), "1");
                xVar.f3938q = b3.aW();
            }
            xVar.r = this.bv;
            l.put(j.w.f3704a, xVar);
        }
        if (bvVar.g() == 50 && this.aA == 1) {
            l.put(j.w.o, str2);
        }
        ATAdConst.CURRENCY currency = ATAdConst.CURRENCY.RMB;
        if (TextUtils.equals(bvVar.au(), j.C0192j.f3689a)) {
            currency = ATAdConst.CURRENCY.USD;
        }
        l.put(j.w.p, currency);
        if (bvVar.g() == 2) {
            l.put(j.w.r, bvVar.aD());
            l.put(j.w.G, Integer.valueOf(b3.aF()));
            l.put(j.w.H, bvVar.z());
            if (bvVar.aN() == 1 && (qVar = this.aL) != null) {
                l.put(j.w.t, Boolean.valueOf(qVar.a()));
                if (this.aL.a() || this.aL.b) {
                    l.put(j.w.s, str2);
                }
            }
        }
        if (bvVar.ae() == 0) {
            l.put(a.aq, Integer.valueOf(this.bq));
            if (bvVar.aF() == null) {
                l.put(a.ar, this.br);
            } else {
                l.put(a.ar, bvVar.aF());
            }
            l.put("nw_firm_id", Integer.valueOf(bvVar.g()));
        }
        JSONObject ac = b3.ac();
        if (ac != null) {
            try {
                String string = ac.getString(String.valueOf(bvVar.g()));
                if (!TextUtils.isEmpty(string)) {
                    l.put("network_ext", string);
                }
            } catch (Exception unused) {
            }
        }
        JSONArray aI = bvVar.aI();
        if (aI != null && aI.length() > 0) {
            l.put("web_content_urls", aI);
        }
        int aJ = bvVar.aJ();
        if (aJ > 0) {
            l.put(com.anythink.core.common.k.az, Integer.valueOf(aJ));
        }
        l.put("ad_s_reqf_mode", Integer.valueOf(bvVar.aK()));
        l.put("ad_format", Integer.valueOf(this.y));
        l.put(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.GM_REFRESH_KEY, Boolean.valueOf(b3.aC()));
        if (bvVar.g() == 8) {
            l.put(j.w.y, Integer.valueOf(bvVar.aT()));
        }
        if (bvVar.g() == 39) {
            l.put(j.w.I, Long.valueOf(bvVar.ba()));
            l.put(j.w.J, Integer.valueOf(bvVar.bd()));
        }
        if (bvVar.g() == 77) {
            l.put(j.w.s, str2);
        }
        if (bvVar.g() == 22) {
            l.put(j.w.K, Integer.valueOf(bvVar.al()));
        }
        return l;
    }

    public final boolean bm() {
        return !TextUtils.isEmpty(this.bo);
    }

    public final Boolean bn() {
        return this.bt;
    }

    public final void a(Boolean bool) {
        this.bt = bool;
    }

    public final int bo() {
        return this.bu;
    }

    private void X(int i) {
        this.bu = i;
    }

    public final String bp() {
        return this.bv;
    }

    private void t(String str) {
        this.bv = str;
    }

    private void a(ap apVar) {
        this.bw = apVar;
    }

    public final int bq() {
        return this.bx;
    }

    private void Y(int i) {
        this.bx = i;
    }

    public final boolean br() {
        return this.aM;
    }

    public final void bs() {
        this.aM = true;
    }

    public final JSONArray bt() {
        return this.bf;
    }

    private void k(JSONArray jSONArray) {
        this.bf = jSONArray;
    }

    public final JSONArray bu() {
        return this.bg;
    }

    private void l(JSONArray jSONArray) {
        this.bg = jSONArray;
    }

    public final int bv() {
        return this.by;
    }

    private void Z(int i) {
        this.by = i;
    }

    public final int bw() {
        return this.bz;
    }

    private void aa(int i) {
        this.bz = i;
    }

    public final int bx() {
        return this.bA;
    }

    private void ab(int i) {
        this.bA = i;
    }

    public final ai by() {
        return this.bB;
    }

    private void a(ai aiVar) {
        this.bB = aiVar;
    }

    public final List<String> bz() {
        return this.bC;
    }

    private void f(List<String> list) {
        this.bC = list;
    }

    public final JSONObject bA() {
        return this.bD;
    }

    private void g(JSONObject jSONObject) {
        this.bD = jSONObject;
    }

    public final int bB() {
        return this.bE;
    }

    private void ac(int i) {
        this.bE = i;
    }

    public final int bC() {
        return this.bF;
    }

    private void ad(int i) {
        this.bF = i;
    }

    public final int bD() {
        return this.bG;
    }

    private void ae(int i) {
        this.bG = i;
    }

    public final int bE() {
        return this.bL;
    }

    private void af(int i) {
        this.bL = i;
    }

    public final JSONObject bF() {
        return this.bH;
    }

    private void h(JSONObject jSONObject) {
        this.bH = jSONObject;
    }

    public final int bG() {
        return this.bI;
    }

    private void ag(int i) {
        this.bI = i;
    }

    public final long bH() {
        return this.bJ;
    }

    public final int bI() {
        return this.bK;
    }

    public final void b(int i) {
        this.bK = i;
    }

    public final boolean bJ() {
        int i = this.bK;
        return i == 2 || i == 5;
    }

    public final int q() {
        return this.bi == 1 ? 2 : 1;
    }

    public final int G() {
        int i = this.aN;
        if (i != -1 && this.aO == 1) {
            this.ao = i;
        }
        return this.ao;
    }

    private bv cb() {
        List<bv> a2 = u.a(this, this.aY);
        if (a2.size() > 0) {
            return a2.get(0);
        }
        return null;
    }

    private boolean a(l lVar) {
        if (lVar == null) {
            return true;
        }
        return (TextUtils.equals(this.E, lVar.E) || ba()) ? false : true;
    }
}
