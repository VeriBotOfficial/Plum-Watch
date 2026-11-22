package com.anythink.expressad.foundation.d;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.basead.c.b;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.foundation.h.y;
import com.anythink.expressad.foundation.h.z;
import java.io.Serializable;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class d extends j implements com.anythink.expressad.g.b, Serializable {
    public static final String A = "encrypt_p";
    public static final String B = "view_com_time";
    public static final String C = "adspace_t";
    public static final String D = "cbd";
    public static final String E = "vst";
    public static final int F = -2;
    public static final int G = -2;
    public static final int H = 1;
    public static final String I = "id";
    public static final String J = "unitId";
    public static final String K = "title";
    public static final String L = "desc";
    public static final String M = "package_name";
    public static final String N = "icon_url";
    public static final String O = "image_url";
    public static final String P = "image_size";
    public static final String Q = "app_size";
    public static final String R = "impression_url";
    public static final String S = "click_url";
    public static final String T = "wtick";
    public static final String U = "deep_link";
    public static final String V = "user_activation";
    public static final String W = "notice_url";
    public static final String X = "template";
    public static final String Y = "ad_source_id";
    public static final String Z = "fca";

    /* renamed from: a, reason: collision with root package name */
    public static final String f4776a = "d";
    public static final String aA = "c_toi";
    public static final int aB = 2;
    public static final String aC = "5";
    public static final String aD = "rtins_type";
    public static final String aE = "ad_url_list";
    public static final String aF = "retarget_offer";
    public static final String aG = "flb";
    public static final String aH = "flb_skiptime";
    public static final String aI = "vctn_t";
    public static final String aJ = "vck_t";
    public static final String aK = "rs_ignc_r";
    public static final String aL = "privacy_url";
    public static final String aM = "show_privacy_btn";
    public static final String aN = "aab";
    public static final int aO = 1;
    public static final int aP = 2;
    public static final String aQ = "rw_pl";
    public static final String aR = "jm_pd";
    public static final String aT = "oc_type";
    public static final String aU = "oc_time";
    public static final String aV = "t_list";
    public static final String aW = "adchoice";
    public static final String aX = "omid";
    public static final String aY = "ia_icon";
    public static final String aZ = "ia_rst";
    public static final String aa = "fcb";
    public static final String ab = "click_mode";
    public static final String ac = "landing_type";
    public static final String ad = "link_type";
    public static final String ae = "rating";
    public static final String af = "number_rating";
    public static final String ag = "ctatext";
    public static final String ah = "c_ct";

    /* renamed from: ai, reason: collision with root package name */
    public static final String f4777ai = "video_url";
    public static final String aj = "video_length";
    public static final String ak = "video_size";
    public static final String al = "video_resolution";
    public static final String am = "watch_mile";
    public static final String an = "endcard_click_result";
    public static final String ao = "ctype";
    public static final String ap = "adv_imp";
    public static final String aq = "t_imp";
    public static final String ar = "sec";
    public static final String as = "url";
    public static final String at = "guidelines";
    public static final String au = "offer_type";
    public static final String av = "reward_amount";
    public static final String aw = "reward_name";
    public static final String ax = "use_skip_time";
    public static final String ay = "prog_bar";
    public static final String az = "md5_file";
    public static final String b = "ad_tpl_url";
    public static final int bA = 4;
    public static final int bB = 1;
    public static final int bC = 2;
    public static final int bD = 3;
    public static final int bE = 1;
    public static final int bF = 2;
    public static final int bG = 1;
    public static final int bH = 2;
    public static final int bI = 3;
    public static final int bJ = 4;
    public static final int bK = 8;
    public static final int bL = 9;
    public static final int bM = 12;
    public static final int bN = 0;
    public static final int bO = 0;
    public static final String bP = "video_end_type";
    public static final int bQ = 1;
    public static final int bR = 2;
    public static final int bS = 3;
    public static final int bT = 4;
    public static final int bU = 5;
    public static final int bV = 100;
    public static final int bW = 2;
    public static final String bY = "ready_rate";
    public static final String bZ = "tmp_ids";
    public static final String ba = "ia_url";
    public static final String bb = "ia_ori";
    public static final String bc = "ad_type";
    public static final String bd = "ia_ext1";
    public static final String be = "ia_ext2";
    public static final String bf = "is_download_zip";
    public static final String bg = "ia_cache";
    public static final String bh = "imp_ua";
    public static final String bi = "c_ua";
    public static final int bj = 1;
    public static final int bk = 1;
    public static final String bl = "iex";
    public static final String bm = "ts";
    public static final String bn = "nv_t2";
    public static final String bo = "impression_t2";
    public static final String bp = "gif_url";
    public static final String bq = "dropout_track";
    public static final String br = "plycmpt_track";
    public static final String bs = "aks";
    public static final String bt = "k";
    public static final String bu = "q";
    public static final String bv = "r";
    public static final String bw = "al";
    public static final String bx = "mp";
    public static final String by = "pv_urls";
    public static final int bz = 3;
    public static final String c = "ad_html";
    public static final int cA = 0;
    public static final String ca = "ext_data";
    public static final String cb = "endcard_url";
    public static final String cc = "playable_ads_without_video";
    public static final int cd = 1;
    public static final int ce = 2;
    public static final String cf = "impression";
    public static final String cg = "start";
    public static final String ch = "first_quartile";
    public static final String ci = "midpoint";
    public static final String cj = "third_quartile";
    public static final String ck = "complete";
    public static final String cl = "mute";
    public static final String cm = "unmute";
    public static final String cn = "click";
    public static final String co = "pause";
    public static final String cp = "resume";
    public static final String cq = "error";
    public static final String cr = "endcard";
    public static final String cs = "close";
    public static final String ct = "video_click";
    public static final String cu = "endcard_show";
    public static final String cv = "play_percentage";
    public static final String cw = "ad_tracking";
    public static final String cx = "rv";
    public static final int cy = -1;
    public static final int cz = 1;
    public static final String d = "cmpt=1";
    public static final String e = "tp_offer";
    private static final long em = 1;
    public static final String f = "fac";
    private static final int fq = 100;
    public static final String g = "at_cd_rate";
    public static final String h = "imp_report_type";
    public static final String i = "at_ac_b";
    public static final String j = "plct";
    public static final String k = "plctb";
    public static final String l = "banner_url";
    public static final String m = "banner_html";
    public static final String n = "creative_id";
    public static final String o = "vid_crtv_id";
    public static final String p = "ec_crtv_id";

    /* renamed from: q, reason: collision with root package name */
    public static final String f4778q = "local_rid";
    public static final String r = "ec_temp_id";
    public static final String s = "mraid";
    public static final String t = "mraid_src";
    public static final String u = "timestamp";
    public static final String v = "hb";
    public static final String w = "maitve";
    public static final String x = "maitve_src";
    public static final String y = "vcn";
    public static final String z = "token_r";
    public r aS;
    private boolean dG;
    private int dQ;
    private int dR;
    private int dS;
    private int dT;
    private int dU;
    private int dV;
    private String dW;
    private int dX;
    private String dY;
    private int dZ;

    /* renamed from: do, reason: not valid java name */
    private List<String> f58do;
    private long dp;
    private int dv;
    private int eA;
    private String eB;
    private String eC;
    private String eD;
    private String eE;
    private String eF;
    private int eG;
    private boolean eH;
    private boolean eJ;
    private int eK;
    private int eM;
    private String eN;
    private int eO;
    private int eP;
    private String eQ;
    private int eR;
    private int eS;
    private int eT;
    private String eU;
    private int eV;
    private String eW;
    private String eX;
    private int eY;
    private String eZ;
    private int ea;
    private String eb;
    private String ec;
    private int ed;
    private String ee;
    private a ef;
    private int eh;
    private String ei;
    private String eo;
    private int ey;
    private int ez;
    private p fB;
    private String fC;
    private String fD;
    private int fE;
    private long fF;
    private String fG;
    private String fH;
    private int fI;
    private String fJ;
    private int fK;
    private b fL;
    private c fM;
    private com.anythink.expressad.b.a.b fN;
    private int fQ;
    private ArrayList<Integer> fS;
    private com.anythink.expressad.foundation.d.a fW;
    private String fZ;
    private int fa;
    private String fb;
    private HashMap<String, String> fc;
    private String fd;
    private String fe;
    private String ff;
    private String fg;
    private String fh;
    private boolean fi;
    private String fk;
    private boolean fl;
    private boolean fm;
    private int fo;
    private String fr;
    private String ft;
    private String fu;
    private int fv;
    private String fw;
    private String fz;
    private int gb;
    private int gd;
    private int ge;
    private int dk = 1;
    private String dl = "";
    private String dm = "";
    private boolean dn = false;
    private int dq = 0;
    private int dr = 0;
    private int ds = 0;
    private int dt = 0;
    private int du = 0;
    private int dw = -2;
    private int dx = -2;
    private long dy = 0;
    private long dz = 0;
    private String dA = "";
    private String dB = "";
    private long dC = 0;
    private long dD = 0;
    private long dE = 0;
    private long dF = 0;
    private int dH = 0;
    private int dI = 0;
    private String dJ = "";
    private boolean dK = false;
    private int dL = 0;
    private boolean dM = false;
    private String dN = "";
    private int dO = 0;
    private int dP = -1;
    private int eg = 0;
    private String ej = "";
    private int ek = 1;
    private int el = 1;
    private int en = 6;
    private int ep = -1;
    private String eq = "";
    private String er = "";
    private String es = "";
    private int et = 0;
    private String eu = "";
    private boolean ev = false;
    private String ew = "";
    private String ex = "";
    private boolean eI = false;
    private String eL = "";
    private String fj = "";
    private int fn = 2;
    public String bX = "";
    private int fp = -1;
    private int fs = 1;
    private int fx = 0;
    private int fy = 2;
    private int fA = 1;
    private boolean fO = false;
    private String fP = null;
    private String fR = "";
    private int fT = 2;
    private int fU = 1;
    private int fV = -1;
    private boolean fX = false;
    private boolean fY = false;
    public boolean cB = false;
    private int ga = 0;
    public boolean cC = false;
    private int gc = 0;
    private int gf = j.g.b.f3686a;
    private int gg = 1;

    public static final class b implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public boolean f4781a = false;
        public boolean b = false;
        public boolean c = false;
        public boolean d = false;
        public boolean e = false;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public Map<Integer, String> l;
    }

    private int br() {
        return this.ds;
    }

    public final void a(int i2) {
        this.ds = i2;
    }

    private int bs() {
        return this.dt;
    }

    public final void b(int i2) {
        this.dt = i2;
    }

    public final int a() {
        return this.du;
    }

    private void u(int i2) {
        this.du = i2;
    }

    private int bt() {
        return this.dq;
    }

    private void v(int i2) {
        this.dq = i2;
    }

    private int bu() {
        return this.dr;
    }

    private void w(int i2) {
        this.dr = i2;
    }

    public final String b() {
        return this.dl;
    }

    public final void a(String str) {
        this.dl = str;
        boolean e2 = v.e(str);
        int g2 = v.g(str);
        if (e2) {
            this.dK = true;
            z(g2);
        }
    }

    public final String c() {
        return this.dm;
    }

    public final void b(String str) {
        this.dm = str;
    }

    public final void a(List<String> list) {
        this.f58do = list;
    }

    public final List<String> d() {
        return this.f58do;
    }

    private int bv() {
        return this.dk;
    }

    public final int e() {
        return this.dv;
    }

    private void x(int i2) {
        this.dv = i2;
    }

    public final int f() {
        return this.dw;
    }

    private void y(int i2) {
        this.dw = i2;
    }

    public final int g() {
        return this.dx;
    }

    public final void c(int i2) {
        this.dx = i2;
    }

    private void D(String str) {
        this.dN = str;
    }

    public final String h() {
        return this.dN;
    }

    public final int i() {
        return this.dO;
    }

    public final void d(int i2) {
        this.dO = i2;
    }

    private String bw() {
        return this.dJ;
    }

    public final void c(String str) {
        this.dJ = str;
    }

    private int bx() {
        int i2 = this.dI;
        if (i2 == 1) {
            return i2;
        }
        return 0;
    }

    public final void e(int i2) {
        this.dI = i2;
    }

    private int by() {
        int i2 = this.dH;
        if (i2 > 0) {
            return i2;
        }
        return 1;
    }

    public final void f(int i2) {
        this.dH = i2;
    }

    public final boolean j() {
        return this.dK;
    }

    private void bz() {
        this.dK = true;
    }

    public final int k() {
        return this.dL;
    }

    private void z(int i2) {
        this.dL = v.a(i2);
    }

    public final boolean l() {
        return this.dM;
    }

    public final void m() {
        this.dM = true;
    }

    public final int n() {
        return this.dP;
    }

    public final void g(int i2) {
        this.dP = i2;
    }

    public final long o() {
        return this.dy;
    }

    private void b(long j2) {
        this.dy = j2;
    }

    private long bA() {
        return this.dz;
    }

    private void c(long j2) {
        this.dz = j2;
    }

    public final String p() {
        return this.dA;
    }

    public final void d(String str) {
        this.dA = z.d(str);
    }

    public final String q() {
        return this.dB;
    }

    public final void e(String str) {
        this.dB = str;
    }

    public final long r() {
        return this.dC;
    }

    private void d(long j2) {
        this.dC = j2;
    }

    private long bB() {
        return this.dD;
    }

    private void e(long j2) {
        this.dD = j2;
    }

    private long bC() {
        return this.dE;
    }

    private void f(long j2) {
        this.dE = j2;
    }

    public final long s() {
        return this.dF;
    }

    private void g(long j2) {
        this.dF = j2;
    }

    public final boolean t() {
        return this.dG;
    }

    public final void a(boolean z2) {
        this.dG = z2;
    }

    public final int u() {
        return this.dQ;
    }

    private void A(int i2) {
        this.dQ = i2;
    }

    public final int v() {
        return this.dR;
    }

    private void B(int i2) {
        this.dR = i2;
    }

    public final a w() {
        return this.ef;
    }

    private void a(a aVar) {
        this.ef = aVar;
    }

    private r bD() {
        return this.aS;
    }

    private void a(r rVar) {
        this.aS = rVar;
    }

    private int bE() {
        return this.eg;
    }

    private void C(int i2) {
        this.eg = i2;
    }

    private int bF() {
        return this.eh;
    }

    private void D(int i2) {
        this.eh = i2;
    }

    private String bG() {
        return this.ei;
    }

    private void E(String str) {
        this.ei = str;
    }

    private String bH() {
        return this.ee;
    }

    private void F(String str) {
        this.ee = str;
    }

    private int bI() {
        return this.ed;
    }

    private void E(int i2) {
        this.ed = i2;
    }

    private String bJ() {
        return this.ej;
    }

    public final int x() {
        return this.ea;
    }

    public final void h(int i2) {
        this.ea = i2;
    }

    private String bK() {
        return this.eb;
    }

    public final void f(String str) {
        this.eb = str;
    }

    private String bL() {
        return this.ec;
    }

    public final void g(String str) {
        this.ec = str;
    }

    private String bM() {
        return this.dW;
    }

    public final void h(String str) {
        this.dW = str;
    }

    private int bN() {
        return this.dX;
    }

    public final void i(int i2) {
        this.dX = i2;
    }

    private String bO() {
        return this.dY;
    }

    public final void i(String str) {
        this.dY = str;
    }

    private int bP() {
        return this.dZ;
    }

    public final void j(int i2) {
        this.dZ = i2;
    }

    private int bQ() {
        return this.dV;
    }

    private void F(int i2) {
        this.dV = i2;
    }

    private int bR() {
        return this.dS;
    }

    private int bS() {
        return this.dT;
    }

    private void G(int i2) {
        this.dT = i2;
    }

    private int bT() {
        return this.dU;
    }

    private void H(int i2) {
        this.dU = i2;
    }

    private void I(int i2) {
        this.dS = i2;
    }

    public final int y() {
        return this.en;
    }

    private void J(int i2) {
        this.en = i2;
    }

    public final String z() {
        return this.eo;
    }

    private void G(String str) {
        this.eo = str;
    }

    private int bU() {
        return this.eT;
    }

    public final void k(int i2) {
        this.eT = i2;
    }

    public final HashMap<String, String> A() {
        return this.fc;
    }

    private void a(HashMap<String, String> hashMap) {
        this.fc = hashMap;
    }

    private String bV() {
        return this.fd;
    }

    private void H(String str) {
        this.fd = str;
    }

    private String bW() {
        return this.fe;
    }

    private void I(String str) {
        this.fe = str;
    }

    private String bX() {
        return this.ff;
    }

    private void J(String str) {
        this.ff = str;
    }

    private String bY() {
        return this.fg;
    }

    private void K(String str) {
        this.fg = str;
    }

    private String bZ() {
        return this.fh;
    }

    private void L(String str) {
        this.fh = str;
    }

    public final boolean B() {
        return this.fi;
    }

    private void d(boolean z2) {
        this.fi = z2;
    }

    public final String C() {
        return this.fj;
    }

    private void M(String str) {
        this.fj = str;
    }

    public final int D() {
        return this.fo;
    }

    private void K(int i2) {
        this.fo = i2;
    }

    public final int E() {
        return this.ek;
    }

    private void L(int i2) {
        this.ek = i2;
    }

    public final int F() {
        return this.el;
    }

    private void M(int i2) {
        this.el = i2;
    }

    private String ca() {
        return this.bX;
    }

    private void N(String str) {
        this.bX = str;
    }

    public final int G() {
        return this.fn;
    }

    private void N(int i2) {
        this.fn = i2;
    }

    public final String H() {
        return this.fk;
    }

    public final void j(String str) {
        this.fk = str;
    }

    public final boolean I() {
        return this.fl;
    }

    public final void b(boolean z2) {
        this.fl = z2;
    }

    public final String J() {
        if (!TextUtils.isEmpty(this.fz)) {
            return this.fz + "&n_logo=0";
        }
        return this.fz;
    }

    public final void k(String str) {
        c cVar;
        this.fz = str;
        if (TextUtils.isEmpty(this.ft) && (((cVar = this.fM) == null || TextUtils.isEmpty(cVar.k)) && !TextUtils.isEmpty(str) && str.contains("cmpt=1"))) {
            this.fu = str;
        }
        this.fY = v.d(str);
        b(str, "endcard_url");
    }

    public final int K() {
        return this.fA;
    }

    private void O(int i2) {
        this.fA = i2;
    }

    public final String L() {
        return this.fD;
    }

    public final void l(String str) {
        this.fD = str;
    }

    private String cb() {
        return this.fC;
    }

    private void O(String str) {
        this.fC = str;
    }

    public final p M() {
        return this.fB;
    }

    private void a(p pVar) {
        this.fB = pVar;
    }

    private String cc() {
        return this.fb;
    }

    private void P(String str) {
        this.fb = str;
    }

    private String cd() {
        return this.fG;
    }

    private void Q(String str) {
        this.fG = str;
    }

    private String ce() {
        return this.fH;
    }

    private void R(String str) {
        this.fH = str;
    }

    private int cf() {
        return this.fE;
    }

    private void P(int i2) {
        this.fE = i2;
    }

    private long cg() {
        return this.fF;
    }

    private void h(long j2) {
        this.fF = j2;
    }

    private b ch() {
        return this.fL;
    }

    private void a(b bVar) {
        this.fL = bVar;
    }

    public final c N() {
        return this.fM;
    }

    private void a(c cVar) {
        this.fM = cVar;
        if (cVar == null || TextUtils.isEmpty(cVar.e())) {
            return;
        }
        if (TextUtils.isEmpty(this.ft) && cVar.e().contains("cmpt=1")) {
            this.fu = cVar.e();
        }
        boolean e2 = v.e(cVar.e());
        int g2 = v.g(cVar.e());
        if (e2) {
            this.dK = true;
            z(g2);
        }
        b(cVar.e(), "template_url");
    }

    private void b(String str, String str2) {
        JSONObject jSONObject;
        try {
            int b2 = v.b(str, "admf");
            if (b2 == 0) {
                return;
            }
            if (TextUtils.isEmpty(this.ej)) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(this.ej);
            }
            int b3 = v.b(str, "admftm");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("admf", b2);
            jSONObject2.put("admftm", b3);
            jSONObject.put(str2, jSONObject2);
            this.ej = jSONObject.toString();
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public final int O() {
        return this.fK;
    }

    private void Q(int i2) {
        this.fK = i2;
    }

    private int ci() {
        return this.fa;
    }

    private void R(int i2) {
        this.fa = i2;
    }

    private String cj() {
        return this.eU;
    }

    private void S(String str) {
        this.eU = str;
    }

    public final int P() {
        return this.eV;
    }

    private void S(int i2) {
        this.eV = i2;
    }

    private String ck() {
        return this.eW;
    }

    public final void m(String str) {
        this.eW = str;
    }

    public final String Q() {
        return this.eX;
    }

    public final void n(String str) {
        this.eX = z.d(str);
    }

    private int cl() {
        return this.eY;
    }

    private void T(int i2) {
        this.eY = i2;
    }

    private String cm() {
        return this.eZ;
    }

    private void T(String str) {
        this.eZ = str;
    }

    public final int R() {
        return this.eS;
    }

    private void U(int i2) {
        this.eS = i2;
    }

    @Override // com.anythink.expressad.out.k
    public final void o(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.eS != 2) {
                str = "Learn more";
            } else {
                str = "Install";
            }
        }
        super.o(str);
    }

    private int cn() {
        return this.eP;
    }

    private void V(int i2) {
        this.eP = i2;
    }

    private String co() {
        return this.eQ;
    }

    private void U(String str) {
        this.eQ = str;
    }

    public final Map<Integer, String> S() {
        return ag(this.eQ);
    }

    private int cp() {
        return this.eR;
    }

    private void W(int i2) {
        this.eR = i2;
    }

    public final String T() {
        return this.eL;
    }

    private void V(String str) {
        this.eL = str;
    }

    public final int U() {
        return this.eM;
    }

    private void X(int i2) {
        this.eM = i2;
    }

    public final String V() {
        return this.eN;
    }

    private void W(String str) {
        this.eN = str;
    }

    private int cq() {
        return this.eO;
    }

    private void Y(int i2) {
        this.eO = i2;
    }

    private int cr() {
        return this.eK;
    }

    private void Z(int i2) {
        this.eK = i2;
    }

    private boolean cs() {
        return this.eI;
    }

    private void e(boolean z2) {
        this.eI = z2;
    }

    public final void c(boolean z2) {
        this.eH = z2;
    }

    public final boolean W() {
        return this.eH;
    }

    public final boolean X() {
        return this.eJ;
    }

    public final void Y() {
        this.eJ = true;
    }

    private int ct() {
        return this.eG;
    }

    private void aa(int i2) {
        this.eG = i2;
    }

    public final int Z() {
        return this.fy;
    }

    private void ab(int i2) {
        this.fy = i2;
    }

    public final String aa() {
        try {
            if (!TextUtils.isEmpty(this.eD)) {
                return this.eD;
            }
            if (TextUtils.isEmpty(this.ew)) {
                return null;
            }
            Uri parse = Uri.parse(this.ew);
            if (parse != null) {
                this.eD = parse.getQueryParameter("k");
            }
            return this.eD;
        } catch (Exception unused) {
            return null;
        }
    }

    private void X(String str) {
        this.eD = str;
    }

    public static String ab() {
        return "";
    }

    private void Y(String str) {
        this.eE = str;
    }

    public final String ac() {
        try {
            if (!TextUtils.isEmpty(this.eF)) {
                return this.eF;
            }
            if (!TextUtils.isEmpty(this.er)) {
                Uri parse = Uri.parse(this.er);
                if (parse != null) {
                    this.eF = parse.getQueryParameter("k");
                }
                return this.eF;
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private void Z(String str) {
        this.eF = str;
    }

    public final String ad() {
        return this.eB;
    }

    private void aa(String str) {
        this.eB = str;
    }

    public final String ae() {
        return this.eC;
    }

    private void ab(String str) {
        this.eC = str;
    }

    private int cu() {
        return this.ez;
    }

    private void ac(int i2) {
        this.ez = i2;
    }

    private int cv() {
        return this.eA;
    }

    private void ad(int i2) {
        this.eA = i2;
    }

    private int cw() {
        return this.ep;
    }

    private void ae(int i2) {
        this.ep = i2;
    }

    public final String af() {
        return this.es;
    }

    public final void p(String str) {
        this.es = str;
    }

    public final int ag() {
        return this.et;
    }

    private void af(int i2) {
        this.et = i2;
    }

    public final String ah() {
        return this.eu;
    }

    public final void q(String str) {
        this.eu = str;
    }

    private void f(boolean z2) {
        this.ev = z2;
    }

    private boolean cx() {
        return this.ev;
    }

    public final String ai() {
        try {
            String a2 = v.a(this.eq, "&tun=", new StringBuilder().append(com.anythink.expressad.foundation.h.n.k()).toString());
            this.eq = a2;
            return a2;
        } catch (Exception e2) {
            e2.getMessage();
            return this.eq;
        }
    }

    private void ac(String str) {
        this.eq = str;
    }

    public final String aj() {
        try {
            String a2 = v.a(this.er, "&tun=", new StringBuilder().append(com.anythink.expressad.foundation.h.n.k()).toString());
            this.er = a2;
            return a2;
        } catch (Exception e2) {
            e2.getMessage();
            return this.er;
        }
    }

    public final void r(String str) {
        this.er = str;
    }

    public final String ak() {
        try {
            String a2 = v.a(this.ew, "&tun=", new StringBuilder().append(com.anythink.expressad.foundation.h.n.k()).toString());
            this.ew = a2;
            return a2;
        } catch (Exception e2) {
            e2.getMessage();
            return this.ew;
        }
    }

    private void ad(String str) {
        this.ew = str;
    }

    @Override // com.anythink.expressad.foundation.d.j
    public final com.anythink.expressad.b.a.b al() {
        return this.fN;
    }

    @Override // com.anythink.expressad.foundation.d.j
    public final void a(com.anythink.expressad.b.a.b bVar) {
        this.fN = bVar;
    }

    private int cy() {
        return this.ey;
    }

    private void ag(int i2) {
        this.ey = i2;
    }

    private String cz() {
        return this.ex;
    }

    private void ae(String str) {
        this.ex = str;
    }

    public final String am() {
        if (!TextUtils.isEmpty(aj())) {
            try {
                URL url = new URL(aj());
                return url.getProtocol() + "://" + url.getHost();
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
        return "";
    }

    public static d a(JSONObject jSONObject) {
        d dVar = new d();
        dVar.w(jSONObject.optString("campaignid"));
        dVar.x(jSONObject.optString("packageName"));
        dVar.y(jSONObject.optString("title"));
        dVar.o(jSONObject.optString(b.a.k));
        dVar.z(jSONObject.optString("desc"));
        dVar.eq = jSONObject.optString("impression_url");
        dVar.B(jSONObject.optString("image_url"));
        dVar.dy = jSONObject.optLong("plct");
        dVar.dz = jSONObject.optLong("plctb");
        dVar.dm = jSONObject.optString("ad_html");
        dVar.a(jSONObject.optString("ad_tpl_url"));
        dVar.d(jSONObject.optString("banner_url"));
        dVar.dB = jSONObject.optString("banner_html");
        dVar.dC = jSONObject.optInt("creative_id");
        dVar.dD = jSONObject.optLong("vid_crtv_id");
        dVar.dE = jSONObject.optLong("ec_crtv_id");
        dVar.dF = jSONObject.optLong("ec_temp_id");
        return dVar;
    }

    private static boolean a(d dVar, String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (com.anythink.expressad.foundation.b.a.c().i() == 2 && "1".equals(Uri.parse(str).getQueryParameter("dpwgl"))) {
            return true;
        }
        dVar.k(str);
        return false;
    }

    public static d b(JSONObject jSONObject) {
        ArrayList arrayList;
        d dVar = null;
        if (jSONObject != null) {
            try {
                d dVar2 = new d();
                try {
                    dVar2.w(jSONObject.optString("id"));
                    dVar2.y(jSONObject.optString("title"));
                    dVar2.z(jSONObject.optString("desc"));
                    dVar2.x(jSONObject.optString("package_name"));
                    dVar2.eT = jSONObject.optInt("rtins_type");
                    dVar2.A(jSONObject.optString("icon_url"));
                    dVar2.B(jSONObject.optString("image_url"));
                    dVar2.C(jSONObject.optString("app_size"));
                    dVar2.ex = jSONObject.optString("image_size");
                    dVar2.eq = jSONObject.optString("impression_url");
                    dVar2.es = jSONObject.optString("click_url");
                    dVar2.aS = r.a(jSONObject.optString("rw_pl"));
                    dVar2.et = jSONObject.optInt("wtick");
                    dVar2.eu = jSONObject.optString("deep_link");
                    dVar2.ev = jSONObject.optBoolean("user_activation", false);
                    dVar2.er = jSONObject.optString("notice_url");
                    dVar2.ey = jSONObject.optInt("template");
                    dVar2.s(jSONObject.optInt("ad_source_id", 1));
                    dVar2.ez = jSONObject.optInt("fca");
                    dVar2.eA = jSONObject.optInt("fcb");
                    dVar2.fo = jSONObject.optInt("endcard_click_result");
                    if (!TextUtils.isEmpty(jSONObject.optString("rating"))) {
                        dVar2.a(Double.parseDouble(jSONObject.optString("rating", "0")));
                    }
                    if (!TextUtils.isEmpty(jSONObject.optString("number_rating"))) {
                        dVar2.r(jSONObject.optInt("number_rating", 333333));
                    }
                    dVar2.eB = jSONObject.optString("click_mode");
                    dVar2.eC = jSONObject.optString("landing_type");
                    dVar2.eS = jSONObject.optInt("link_type", 4);
                    dVar2.eG = jSONObject.optInt("c_ct");
                    dVar2.o(jSONObject.optString("ctatext"));
                    dVar2.fb = jSONObject.optString("ad_url_list");
                    dVar2.fK = jSONObject.optInt("retarget_offer", 2);
                    dVar2.eL = jSONObject.optString("video_url");
                    dVar2.t(jSONObject.optInt("video_length"));
                    dVar2.eM = jSONObject.optInt("video_size");
                    dVar2.eN = jSONObject.optString("video_resolution");
                    dVar2.eO = jSONObject.optInt("watch_mile");
                    dVar2.a(System.currentTimeMillis());
                    dVar2.eP = jSONObject.optInt("ctype");
                    dVar2.eQ = jSONObject.optString("adv_imp");
                    dVar2.eR = jSONObject.optInt("t_imp");
                    dVar2.eW = jSONObject.optString("html_url");
                    dVar2.n(jSONObject.optString("end_screen_url"));
                    dVar2.eU = jSONObject.optString("guidelines");
                    dVar2.eV = jSONObject.optInt("offer_type");
                    dVar2.eZ = jSONObject.optString("reward_name");
                    dVar2.eY = jSONObject.optInt("reward_amount");
                    dVar2.gd = jSONObject.optInt("use_skip_time", 0);
                    dVar2.ge = jSONObject.optInt("prog_bar", 0);
                    try {
                        String optString = jSONObject.optString("ad_tracking");
                        if (!TextUtils.isEmpty(optString)) {
                            dVar2.fC = optString;
                            dVar2.fB = af(optString);
                        }
                    } catch (Exception unused) {
                    }
                    try {
                        dVar2.fp = jSONObject.optInt("ready_rate", -1);
                        JSONObject optJSONObject = jSONObject.optJSONObject("ext_data");
                        if (optJSONObject != null) {
                            dVar2.fr = optJSONObject.toString();
                        }
                        dVar2.fv = jSONObject.optInt("mof_tplid");
                        dVar2.s(jSONObject.optString("mof_template_url"));
                        dVar2.fs = jSONObject.optInt("nscpt");
                        new JSONArray();
                        JSONArray optJSONArray = jSONObject.optJSONArray("pv_urls");
                        if (optJSONArray == null || optJSONArray.length() <= 0) {
                            arrayList = null;
                        } else {
                            arrayList = new ArrayList(optJSONArray.length());
                            for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                                arrayList.add(optJSONArray.optString(i2));
                            }
                        }
                        dVar2.f58do = arrayList;
                        JSONObject optJSONObject2 = jSONObject.optJSONObject("req_ext_data");
                        if (optJSONObject2 != null) {
                            dVar2.fw = optJSONObject2.toString();
                        }
                    } catch (Exception unused2) {
                    }
                    dVar2.fn = jSONObject.optInt("video_end_type", 2);
                    if (a(dVar2, jSONObject.optString("endcard_url"))) {
                        return null;
                    }
                    dVar2.fA = jSONObject.optInt("playable_ads_without_video", 1);
                    dVar2.bX = "";
                    if (jSONObject.has("nv_t2")) {
                        dVar2.en = jSONObject.optInt("nv_t2");
                    }
                    if (jSONObject.has("gif_url")) {
                        dVar2.eo = jSONObject.optString("gif_url");
                    }
                    dVar2.a(c.a(jSONObject.optJSONObject("rv")));
                    dVar2.fy = jSONObject.optInt("c_toi", 2);
                    dVar2.ek = jSONObject.optInt("imp_ua", 1);
                    dVar2.el = jSONObject.optInt("c_ua", 1);
                    dVar2.dS = jSONObject.optInt("jm_pd");
                    dVar2.dW = jSONObject.optString("ia_icon");
                    dVar2.dX = jSONObject.optInt("ia_rst");
                    dVar2.dY = jSONObject.optString("ia_url");
                    dVar2.dZ = jSONObject.optInt("ia_ori");
                    dVar2.ea = jSONObject.optInt("ad_type");
                    dVar2.dq = jSONObject.optInt("tp_offer");
                    dVar2.dr = jSONObject.optInt("fac");
                    dVar2.eb = jSONObject.optString("ia_ext1");
                    dVar2.ec = jSONObject.optString("ia_ext2");
                    dVar2.ed = jSONObject.optInt("is_download_zip");
                    dVar2.ee = jSONObject.optString("ia_cache");
                    dVar2.eh = jSONObject.optInt("oc_time");
                    dVar2.eg = jSONObject.optInt("oc_type");
                    dVar2.ei = jSONObject.optString("t_list");
                    dVar2.ef = a.b(jSONObject.optString("adchoice", ""));
                    dVar2.dy = jSONObject.optLong("plct");
                    dVar2.dz = jSONObject.optLong("plctb");
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("omid");
                    if (optJSONArray2 == null) {
                        if (!TextUtils.isEmpty(jSONObject.optString("omid"))) {
                            dVar2.fP = jSONObject.optString("omid");
                        } else {
                            dVar2.fP = null;
                        }
                    } else {
                        dVar2.fP = optJSONArray2.toString();
                    }
                    dVar2.dC = jSONObject.optInt("creative_id");
                    dVar2.dD = jSONObject.optLong("vid_crtv_id");
                    dVar2.dE = jSONObject.optLong("ec_crtv_id");
                    dVar2.dF = jSONObject.optLong("ec_temp_id");
                    dVar2.eE = jSONObject.optString("local_rid", "");
                    String optString2 = jSONObject.optString("cam_tpl_url");
                    Uri parse = Uri.parse(optString2);
                    if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(".zip") || parse.getPath().endsWith(".ZIP"))) {
                        dVar2.a(optString2);
                    } else {
                        dVar2.d(optString2);
                    }
                    dVar2.dB = jSONObject.optString("cam_html");
                    dVar2.dm = jSONObject.optString("cam_html");
                    dVar2.fD = jSONObject.optString("unitId");
                    String optString3 = jSONObject.optString("mraid");
                    if (TextUtils.isEmpty(optString3)) {
                        optString3 = jSONObject.optString("mraid_src");
                    }
                    if (TextUtils.isEmpty(optString3)) {
                        if (!TextUtils.isEmpty(dVar2.dm) && !dVar2.dm.contains("<MBTPLMARK>")) {
                            dVar2.fl = true;
                        } else {
                            dVar2.fl = false;
                        }
                    } else {
                        dVar2.fl = true;
                        dVar2.fk = optString3;
                    }
                    try {
                        String optString4 = jSONObject.optString("only_impression_url");
                        if (!TextUtils.isEmpty(optString4)) {
                            dVar2.ew = optString4;
                            Uri parse2 = Uri.parse(optString4);
                            if (parse2 != null) {
                                dVar2.eD = parse2.getQueryParameter("k");
                            }
                        }
                        String optString5 = jSONObject.optString("notice_url");
                        if (!TextUtils.isEmpty(optString5)) {
                            dVar2.er = optString5;
                            Uri parse3 = Uri.parse(optString5);
                            if (parse3 != null) {
                                dVar2.eF = parse3.getQueryParameter("k");
                            }
                        }
                    } catch (Exception unused3) {
                    }
                    dVar2.fi = jSONObject.optBoolean("hb", false);
                    dVar2.fI = jSONObject.optInt("maitve");
                    dVar2.fJ = jSONObject.optString("maitve_src");
                    dVar2.dQ = jSONObject.optInt("flb");
                    dVar2.dR = jSONObject.optInt("flb_skiptime");
                    dVar2.dw = jSONObject.optInt("cbd", -2);
                    dVar2.dx = jSONObject.optInt("vst", -2);
                    dVar2.dv = jSONObject.optInt("adspace_t", 1);
                    dVar = a(jSONObject, dVar2);
                    dVar.dH = jSONObject.optInt("vcn");
                    dVar.dI = jSONObject.optInt("token_r");
                    dVar.dJ = jSONObject.optString("encrypt_p");
                    dVar.dO = jSONObject.optInt("view_com_time");
                    dVar.ak(jSONObject.optInt("vck_t", 2));
                    dVar.al(jSONObject.optInt("vctn_t", 1));
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("rs_ignc_r");
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList2 = new ArrayList<>();
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            arrayList2.add(Integer.valueOf(optJSONArray3.optInt(i3)));
                        }
                        if (arrayList2.size() > 0) {
                            dVar.fS = arrayList2;
                        }
                    }
                    if (jSONObject.has("aab")) {
                        dVar.fW = com.anythink.expressad.foundation.d.a.a(jSONObject.getString("aab"));
                    }
                    try {
                        dVar.dN = jSONObject.optString("privacy_url", "");
                        dVar.du = jSONObject.optInt("show_privacy_btn", 0);
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    dVar.gb = jSONObject.optInt(g, 0);
                    dVar.aq(jSONObject.optInt("imp_report_type", 0));
                    dVar.gf = jSONObject.optInt("tk_tcp_port", j.g.b.f3686a);
                    dVar.gg = jSONObject.optInt(i, 1);
                    return dVar;
                } catch (Exception e3) {
                    e = e3;
                    dVar = dVar2;
                    e.printStackTrace();
                    return dVar;
                }
            } catch (Exception e4) {
                e = e4;
                e.printStackTrace();
                return dVar;
            }
        }
        return dVar;
    }

    private static JSONObject c(JSONObject jSONObject) {
        JSONArray optJSONArray;
        try {
            if (jSONObject.has("tmp_ids") && (optJSONArray = jSONObject.optJSONArray("tmp_ids")) != null && optJSONArray.length() > 0) {
                jSONObject.remove("tmp_ids");
                for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                    JSONObject a2 = com.anythink.expressad.foundation.c.a.a.a().a(optJSONArray.getString(i2));
                    if (a2 != null) {
                        Iterator<String> keys = a2.keys();
                        while (keys.hasNext()) {
                            String next = keys.next();
                            jSONObject.put(next, a2.opt(next));
                        }
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    private static d a(JSONObject jSONObject, String str, String str2, String str3, boolean z2, e eVar) {
        return a(jSONObject, str, str2, str3, z2, eVar, "");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.String] */
    public static d a(JSONObject jSONObject, String str, String str2, String str3, boolean z2, e eVar, String str4) {
        d dVar;
        d dVar2;
        ?? r14;
        JSONObject c2 = c(jSONObject);
        if (c2 == null) {
            return null;
        }
        try {
            d dVar3 = new d();
            try {
                String optString = c2.optString("aks");
                if (TextUtils.isEmpty(optString)) {
                    dVar2 = null;
                } else {
                    JSONObject jSONObject2 = new JSONObject(optString);
                    Iterator<String> keys = jSONObject2.keys();
                    HashMap<String, String> hashMap = new HashMap<>();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        hashMap.put(next, jSONObject2.optString(next));
                    }
                    dVar2 = null;
                    dVar3.fc = hashMap;
                }
                if (!TextUtils.isEmpty(str4)) {
                    dVar3.fj = str4;
                    dVar3.fi = true;
                }
                try {
                    dVar3.fp = c2.optInt("ready_rate", -1);
                    JSONObject optJSONObject = c2.optJSONObject("ext_data");
                    if (optJSONObject != null) {
                        dVar3.fr = optJSONObject.toString();
                    }
                    dVar3.fv = c2.optInt("mof_tplid");
                    dVar3.s(c2.optString("mof_template_url"));
                    dVar3.fs = c2.optInt("nscpt");
                    new JSONArray();
                    JSONArray optJSONArray = c2.optJSONArray("pv_urls");
                    if (optJSONArray == null || optJSONArray.length() <= 0) {
                        r14 = dVar2;
                    } else {
                        r14 = new ArrayList(optJSONArray.length());
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            r14.add(optJSONArray.optString(i2));
                        }
                    }
                    dVar3.f58do = r14;
                    JSONObject optJSONObject2 = c2.optJSONObject("req_ext_data");
                    if (optJSONObject2 != null) {
                        dVar3.fw = optJSONObject2.toString();
                    }
                } catch (Exception unused) {
                }
                dVar3.w(c2.optString("id"));
                dVar3.y(c2.optString("title"));
                dVar3.fD = c2.optString("unitId", "");
                dVar3.z(c2.optString("desc"));
                dVar3.x(c2.optString("package_name"));
                dVar3.eT = c2.optInt("rtins_type");
                dVar3.A(c2.optString("icon_url"));
                dVar3.B(c2.optString("image_url"));
                dVar3.C(c2.optString("app_size"));
                dVar3.ex = c2.optString("image_size");
                dVar3.eq = a(eVar, dVar3, c2.optString("impression_url"));
                dVar3.es = a(eVar, dVar3, c2.optString("click_url"));
                dVar3.aS = r.a(c2.optString("rw_pl"));
                dVar3.et = c2.optInt("wtick");
                dVar3.eu = a(eVar, dVar3, c2.optString("deep_link"));
                dVar3.ev = c2.optBoolean("user_activation", false);
                dVar3.er = a(eVar, dVar3, c2.optString("notice_url"));
                dVar3.ey = c2.optInt("template");
                dVar3.s(c2.optInt("ad_source_id", 1));
                dVar3.ez = c2.optInt("fca");
                dVar3.eA = c2.optInt("fcb");
                dVar3.fo = c2.optInt("endcard_click_result");
                if (!TextUtils.isEmpty(c2.optString("rating"))) {
                    dVar3.a(Double.parseDouble(c2.optString("rating", "0")));
                }
                if (!TextUtils.isEmpty(c2.optString("number_rating"))) {
                    dVar3.r(c2.optInt("number_rating", 333333));
                }
                dVar3.eB = c2.optString("click_mode");
                dVar3.eC = c2.optString("landing_type");
                dVar3.eS = c2.optInt("link_type", 4);
                dVar3.eG = c2.optInt("c_ct");
                dVar3.o(c2.optString("ctatext"));
                dVar3.fb = c2.optString("ad_url_list");
                dVar3.fK = c2.optInt("retarget_offer", 2);
                dVar3.gd = c2.optInt("use_skip_time", 0);
                dVar3.ge = c2.optInt("prog_bar", 0);
                String optString2 = c2.optString("video_url");
                if (!TextUtils.isEmpty(optString2)) {
                    if (z2) {
                        dVar3.eL = optString2;
                    } else {
                        dVar3.eL = com.anythink.core.express.a.a.b(optString2);
                    }
                }
                dVar3.dO = c2.optInt("view_com_time");
                dVar3.t(c2.optInt("video_length"));
                dVar3.eM = c2.optInt("video_size");
                dVar3.eN = c2.optString("video_resolution");
                dVar3.eO = c2.optInt("watch_mile");
                dVar3.a(System.currentTimeMillis());
                dVar3.ew = a(eVar, dVar3, str);
                dVar3.eP = c2.optInt("ctype");
                dVar3.eQ = c2.optString("adv_imp");
                dVar3.eR = c2.optInt("t_imp");
                dVar3.eW = str2;
                dVar3.n(str3);
                dVar3.eU = c2.optString("guidelines");
                dVar3.eV = c2.optInt("offer_type");
                dVar3.eZ = c2.optString("reward_name");
                dVar3.eY = c2.optInt("reward_amount");
                try {
                    String a2 = a(eVar, dVar3, c2.optString("ad_tracking"));
                    if (!TextUtils.isEmpty(a2)) {
                        dVar3.fC = a2;
                        dVar3.fB = af(a2);
                    }
                } catch (Exception unused2) {
                }
                dVar3.fn = c2.optInt("video_end_type", 2);
                if (a(dVar3, c2.optString("endcard_url"))) {
                    return dVar2;
                }
                dVar3.fA = c2.optInt("playable_ads_without_video", 1);
                dVar3.bX = "";
                if (c2.has("nv_t2")) {
                    dVar3.en = c2.optInt("nv_t2");
                }
                if (c2.has("gif_url")) {
                    dVar3.eo = c2.optString("gif_url");
                }
                dVar3.a(c.a(c2.optJSONObject("rv")));
                dVar3.fy = c2.optInt("c_toi", 2);
                dVar3.ek = c2.optInt("imp_ua", 1);
                dVar3.el = c2.optInt("c_ua", 1);
                dVar3.dS = c2.optInt("jm_pd");
                dVar3.dW = c2.optString("ia_icon");
                dVar3.dX = c2.optInt("ia_rst");
                dVar3.dY = c2.optString("ia_url");
                dVar3.dZ = c2.optInt("ia_ori");
                dVar3.ea = eVar.d();
                dVar3.dq = c2.optInt("tp_offer");
                dVar3.dr = c2.optInt("fac");
                dVar3.eb = c2.optString("ia_ext1");
                dVar3.ec = c2.optString("ia_ext2");
                dVar3.ed = c2.optInt("is_download_zip");
                dVar3.ee = c2.optString("ia_cache");
                dVar3.eh = c2.optInt("oc_time");
                dVar3.eg = c2.optInt("oc_type");
                dVar3.ei = c2.optString("t_list");
                dVar3.ef = a.b(c2.optString("adchoice", ""));
                dVar3.dy = c2.optLong("plct");
                dVar3.dz = c2.optLong("plctb");
                dVar3.dC = c2.optLong("creative_id");
                dVar3.dD = c2.optLong("vid_crtv_id");
                dVar3.dE = c2.optLong("ec_crtv_id");
                dVar3.dF = c2.optLong("ec_temp_id");
                String optString3 = c2.optString("cam_tpl_url");
                Uri parse = Uri.parse(optString3);
                if (!TextUtils.isEmpty(parse.getPath()) && (parse.getPath().endsWith(".zip") || parse.getPath().endsWith(".ZIP"))) {
                    dVar3.a(optString3);
                } else {
                    dVar3.d(optString3);
                }
                dVar3.dB = c2.optString("cam_html");
                dVar3.dm = c2.optString("cam_html");
                String optString4 = c2.optString("mraid");
                if (TextUtils.isEmpty(optString4)) {
                    if (!TextUtils.isEmpty(dVar3.dm) && !dVar3.dm.contains("<MBTPLMARK>")) {
                        dVar3.fl = true;
                    } else {
                        dVar3.fl = false;
                    }
                } else {
                    dVar3.fl = true;
                    dVar3.fk = optString4;
                }
                JSONArray optJSONArray2 = c2.optJSONArray("omid");
                if (optJSONArray2 == null) {
                    if (!TextUtils.isEmpty(c2.optString("omid"))) {
                        dVar3.fP = c2.optString("omid");
                    } else {
                        dVar3.fP = dVar2;
                    }
                } else {
                    dVar3.fP = optJSONArray2.toString();
                }
                dVar3.fI = c2.optInt("maitve");
                dVar3.fJ = c2.optString("maitve_src");
                dVar3.dQ = c2.optInt("flb");
                dVar3.dw = c2.optInt("cbd", -2);
                dVar3.dx = c2.optInt("vst", -2);
                dVar3.dv = c2.optInt("adspace_t", 1);
                dVar3.dR = c2.optInt("flb_skiptime");
                d b2 = b(c2, dVar3);
                try {
                    try {
                        b2.eq = v.a(com.anythink.core.common.d.t.b().g(), b2.bi(), b2.ai());
                    } catch (Exception e2) {
                        e2.getMessage();
                    }
                    b2.ak(c2.optInt("vck_t", 2));
                    b2.al(c2.optInt("vctn_t", 1));
                    JSONArray optJSONArray3 = c2.optJSONArray("rs_ignc_r");
                    if (optJSONArray3 != null && optJSONArray3.length() > 0) {
                        ArrayList<Integer> arrayList = new ArrayList<>();
                        for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                            arrayList.add(Integer.valueOf(optJSONArray3.optInt(i3)));
                        }
                        if (arrayList.size() > 0) {
                            b2.fS = arrayList;
                        }
                    }
                    if (c2.has("aab")) {
                        b2.fW = com.anythink.expressad.foundation.d.a.a(c2.getString("aab"));
                    }
                    try {
                        b2.dN = c2.optString("privacy_url", "");
                        b2.du = c2.optInt("show_privacy_btn", 0);
                    } catch (Exception e3) {
                        e3.getMessage();
                    }
                    b2.gb = c2.optInt(g, 0);
                    b2.aq(c2.optInt("imp_report_type", 0));
                    b2.gf = c2.optInt("tk_tcp_port", j.g.b.f3686a);
                    b2.gg = c2.optInt(i, 1);
                    return b2;
                } catch (Exception e4) {
                    e = e4;
                    dVar = b2;
                    e.printStackTrace();
                    return dVar;
                }
            } catch (Exception e5) {
                e = e5;
                dVar = dVar3;
            }
        } catch (Exception e6) {
            e = e6;
            dVar = null;
        }
    }

    private static p af(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONObject jSONObject = new JSONObject(str);
                p pVar = new p();
                pVar.r(a(jSONObject.optJSONArray("impression")));
                pVar.g(a(jSONObject.optJSONArray("start")));
                pVar.h(a(jSONObject.optJSONArray("first_quartile")));
                pVar.i(a(jSONObject.optJSONArray("midpoint")));
                pVar.j(a(jSONObject.optJSONArray("third_quartile")));
                pVar.k(a(jSONObject.optJSONArray("complete")));
                pVar.a(b(jSONObject.optJSONArray("play_percentage")));
                pVar.l(a(jSONObject.optJSONArray("mute")));
                pVar.m(a(jSONObject.optJSONArray("unmute")));
                pVar.n(a(jSONObject.optJSONArray("click")));
                pVar.o(a(jSONObject.optJSONArray("pause")));
                pVar.p(a(jSONObject.optJSONArray("resume")));
                pVar.q(a(jSONObject.optJSONArray("error")));
                pVar.s(a(jSONObject.optJSONArray("endcard")));
                pVar.u(a(jSONObject.optJSONArray("close")));
                pVar.t(a(jSONObject.optJSONArray("endcard_show")));
                pVar.v(a(jSONObject.optJSONArray("video_click")));
                pVar.f(a(jSONObject.optJSONArray("impression_t2")));
                pVar.d(a(jSONObject.optJSONArray("dropout_track")));
                pVar.e(a(jSONObject.optJSONArray("plycmpt_track")));
                pVar.a(a(jSONObject.optJSONArray(j.cZ)));
                pVar.b(a(jSONObject.optJSONArray(j.da)));
                pVar.c(a(jSONObject.optJSONArray(j.db)));
                return pVar;
            }
        } catch (JSONException unused) {
        }
        return null;
    }

    private static p a(JSONObject jSONObject, p pVar) {
        pVar.a(a(jSONObject.optJSONArray(j.cZ)));
        pVar.b(a(jSONObject.optJSONArray(j.da)));
        pVar.c(a(jSONObject.optJSONArray(j.db)));
        return pVar;
    }

    private static String[] a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        String[] strArr = new String[jSONArray.length()];
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            strArr[i2] = jSONArray.optString(i2);
        }
        return strArr;
    }

    private static Map<Integer, String> ag(String str) {
        HashMap hashMap = null;
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                if (jSONArray.length() > 0) {
                    HashMap hashMap2 = new HashMap();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        try {
                            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                            int optInt = optJSONObject.optInt("sec");
                            hashMap2.put(Integer.valueOf(optInt), optJSONObject.optString("url"));
                        } catch (Exception e2) {
                            e = e2;
                            hashMap = hashMap2;
                            e.printStackTrace();
                            return hashMap;
                        }
                    }
                    return hashMap2;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return hashMap;
    }

    public static JSONArray b(List<d> list) {
        JSONArray jSONArray = null;
        if (list != null) {
            try {
                if (list.size() > 0) {
                    JSONArray jSONArray2 = new JSONArray();
                    try {
                        Iterator<d> it = list.iterator();
                        while (it.hasNext()) {
                            try {
                                jSONArray2.put(a(it.next()));
                            } catch (Throwable th) {
                                th.printStackTrace();
                            }
                        }
                        return jSONArray2;
                    } catch (Exception e2) {
                        e = e2;
                        jSONArray = jSONArray2;
                        e.printStackTrace();
                        return jSONArray;
                    }
                }
            } catch (Exception e3) {
                e = e3;
            }
        }
        return jSONArray;
    }

    public static JSONObject a(d dVar, boolean z2, boolean z3) {
        JSONObject a2 = a(dVar);
        a2.put("isReady", z2);
        a2.put("expired", z3);
        return a2;
    }

    public static JSONObject a(d dVar) {
        c cVar;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", dVar.bh());
        jSONObject.put("flb", dVar.dQ);
        jSONObject.put("flb_skiptime", dVar.dR);
        jSONObject.put("adspace_t", dVar.dv);
        jSONObject.put("vst", dVar.dx);
        jSONObject.put("cbd", dVar.dw);
        if (!TextUtils.isEmpty(dVar.fD)) {
            jSONObject.put("unitId", dVar.fD);
        }
        if (!TextUtils.isEmpty(dVar.fr)) {
            try {
                jSONObject.put("ext_data", new JSONObject(dVar.fr));
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(dVar.fw)) {
            try {
                jSONObject.put("req_ext_data", new JSONObject(dVar.fw));
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
        List<String> list = dVar.f58do;
        if (list != null && list.size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator<String> it = dVar.f58do.iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("pv_urls", jSONArray);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty(dVar.ft)) {
            jSONObject.put("mof_tplid", dVar.fv);
            jSONObject.put("mof_template_url", dVar.ft);
            jSONObject.put("nscpt", dVar.fs);
        }
        jSONObject.put("ready_rate", dVar.fp);
        jSONObject.put("title", dVar.bj());
        jSONObject.put("desc", dVar.bk());
        jSONObject.put("package_name", dVar.bi());
        jSONObject.put("rtins_type", dVar.eT);
        jSONObject.put("icon_url", dVar.bl());
        jSONObject.put("image_url", dVar.bm());
        jSONObject.put("app_size", dVar.bp());
        jSONObject.put("image_size", dVar.ex);
        jSONObject.put("impression_url", dVar.ai());
        jSONObject.put("click_url", dVar.es);
        r rVar = dVar.aS;
        if (rVar != null) {
            jSONObject.put("rw_pl", rVar.c());
        }
        jSONObject.put("wtick", dVar.et);
        jSONObject.put("deep_link", dVar.eu);
        jSONObject.put("user_activation", dVar.ev);
        jSONObject.put("notice_url", dVar.aj());
        jSONObject.put("template", dVar.ey);
        jSONObject.put("ad_source_id", dVar.bn());
        jSONObject.put("fca", dVar.ez);
        jSONObject.put("fcb", dVar.eA);
        jSONObject.put("rating", new StringBuilder().append(dVar.bf()).toString());
        jSONObject.put("number_rating", dVar.bg());
        jSONObject.put("click_mode", dVar.eB);
        jSONObject.put("landing_type", dVar.eC);
        jSONObject.put("link_type", dVar.eS);
        jSONObject.put("c_ct", dVar.eG);
        jSONObject.put("ctatext", dVar.dj);
        jSONObject.put("endcard_click_result", dVar.fo);
        jSONObject.put("retarget_offer", dVar.fK);
        jSONObject.put("video_url", dVar.eL);
        jSONObject.put("video_length", dVar.bq());
        jSONObject.put("video_size", dVar.eM);
        jSONObject.put("video_resolution", dVar.eN);
        jSONObject.put("watch_mile", dVar.eO);
        jSONObject.put("ad_url_list", dVar.fb);
        jSONObject.put("only_impression_url", dVar.ak());
        jSONObject.put("ctype", dVar.eP);
        jSONObject.put("t_imp", dVar.eR);
        jSONObject.put("adv_imp", dVar.eQ);
        jSONObject.put("html_url", dVar.eW);
        jSONObject.put("end_screen_url", dVar.eX);
        jSONObject.put("guidelines", dVar.eU);
        jSONObject.put("offer_type", dVar.eV);
        jSONObject.put("reward_amount", dVar.eY);
        jSONObject.put("reward_name", dVar.eZ);
        jSONObject.put("gif_url", dVar.eo);
        if (y.b(dVar.fC)) {
            jSONObject.put("ad_tracking", new JSONObject(dVar.fC));
        }
        jSONObject.put("video_end_type", dVar.fn);
        jSONObject.put("endcard_url", dVar.J());
        jSONObject.put("playable_ads_without_video", dVar.fA);
        if (dVar != null && (cVar = dVar.fM) != null && y.b(cVar.a())) {
            jSONObject.put("rv", new JSONObject(dVar.fM.a()));
        }
        jSONObject.put("md5_file", dVar.bX);
        jSONObject.put("c_toi", dVar.fy);
        jSONObject.put("c_ua", dVar.el);
        jSONObject.put("imp_ua", dVar.ek);
        jSONObject.put("jm_pd", dVar.dS);
        jSONObject.put("ia_icon", dVar.dW);
        jSONObject.put("ia_rst", dVar.dX);
        jSONObject.put("ia_url", dVar.dY);
        jSONObject.put("ia_ori", dVar.dZ);
        jSONObject.put("ad_type", dVar.ea);
        jSONObject.put("ia_ext1", dVar.eb);
        jSONObject.put("ia_ext2", dVar.ec);
        jSONObject.put("is_download_zip", dVar.ed);
        jSONObject.put("ia_cache", dVar.ee);
        jSONObject.put("oc_type", dVar.eg);
        jSONObject.put("oc_time", dVar.eh);
        jSONObject.put("t_list", dVar.ei);
        a aVar = dVar.ef;
        if (aVar != null) {
            jSONObject.put("adchoice", new JSONObject(aVar.a()));
        }
        jSONObject.put("plct", dVar.dy);
        jSONObject.put("plctb", dVar.dz);
        jSONObject.put("omid", dVar.fP);
        jSONObject.put("creative_id", dVar.dC);
        jSONObject.put("cam_html", dVar.dB);
        String str = dVar.dA;
        if (str == null) {
            str = dVar.dl;
        }
        jSONObject.put("cam_tpl_url", str);
        jSONObject.put("mraid", dVar.fk);
        jSONObject.put("mraid_src", dVar.fk);
        jSONObject.put("timestamp", dVar.bo());
        jSONObject.put("hb", dVar.fi);
        jSONObject.put("maitve", dVar.fI);
        jSONObject.put("maitve_src", dVar.fJ);
        int i2 = dVar.dH;
        if (i2 <= 0) {
            i2 = 1;
        }
        jSONObject.put("vcn", i2);
        int i3 = dVar.dI;
        if (i3 != 1) {
            i3 = 0;
        }
        jSONObject.put("token_r", i3);
        jSONObject.put("encrypt_p", dVar.dJ);
        jSONObject.put("view_com_time", dVar.dO);
        jSONObject.put("rs_ignc_r", dVar.fS);
        jSONObject.put("vck_t", dVar.fT);
        jSONObject.put("vctn_t", dVar.fU);
        jSONObject.put("tp_offer", dVar.dq);
        jSONObject.put("fac", dVar.dr);
        jSONObject.put("local_rid", "");
        jSONObject.put("privacy_url", dVar.dN);
        jSONObject.put("show_privacy_btn", dVar.du);
        try {
            jSONObject.put("misk_spt", com.anythink.core.common.o.a().c());
            com.anythink.core.common.o.a();
            jSONObject.put("misk_spt_det", com.anythink.core.common.o.b());
        } catch (JSONException unused) {
        }
        com.anythink.expressad.foundation.d.a aVar2 = dVar.fW;
        if (aVar2 != null) {
            jSONObject.put("aab", aVar2.a());
        }
        jSONObject.put("vid_crtv_id", dVar.dD);
        jSONObject.put("ec_crtv_id", dVar.dE);
        jSONObject.put("ec_temp_id", dVar.dF);
        jSONObject.put("local_rid", "");
        jSONObject.put(g, dVar.gb);
        jSONObject.put("imp_report_type", dVar.gc);
        jSONObject.put(i, dVar.gg);
        if (dVar == null) {
            return jSONObject;
        }
        jSONObject.put(j.cL, dVar.be());
        jSONObject.put(j.cM, dVar.bd());
        jSONObject.put("adv_id", dVar.bc());
        jSONObject.put("ttc_type", dVar.bb());
        jSONObject.put(j.cR, dVar.ba());
        jSONObject.put("gh_id", dVar.aV());
        jSONObject.put("gh_path", com.anythink.core.express.a.a.a(dVar.aW()));
        jSONObject.put("bind_id", dVar.aX());
        jSONObject.put(j.cE, dVar.aQ());
        jSONObject.put(j.cF, dVar.aP());
        if (dVar.aO() != null) {
            jSONObject.put(j.cG, dVar.aO().g());
        }
        jSONObject.put(j.cV, dVar.aY());
        jSONObject.put(j.cW, dVar.aZ());
        jSONObject.put("nv_t2", dVar.en);
        jSONObject.put(j.cI, dVar.aS());
        jSONObject.put(j.cH, dVar.aR());
        jSONObject.put(j.cJ, dVar.aT());
        jSONObject.put(j.cK, dVar.aU());
        return jSONObject;
    }

    private static List<Map<Integer, String>> b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    String string = jSONArray.getString(i2);
                    if (!TextUtils.isEmpty(string)) {
                        JSONObject jSONObject = new JSONObject(string);
                        HashMap hashMap = new HashMap();
                        int i3 = jSONObject.getInt("rate");
                        hashMap.put(Integer.valueOf(i3), jSONObject.getString("url"));
                        arrayList.add(hashMap);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return arrayList;
    }

    public final boolean ao() {
        return this.fm;
    }

    public final void ap() {
        this.fm = true;
    }

    public final int aq() {
        return this.fp;
    }

    private void ah(int i2) {
        this.fp = i2;
    }

    private String cA() {
        return this.fr;
    }

    private void ah(String str) {
        this.fr = str;
    }

    public final int ar() {
        return this.fs;
    }

    public final void l(int i2) {
        this.fs = i2;
    }

    public final String as() {
        return this.ft;
    }

    public final void s(String str) {
        this.ft = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.fu = str;
        boolean e2 = v.e(str);
        int g2 = v.g(str);
        if (e2) {
            this.dK = true;
            z(g2);
        }
        this.fX = v.d(str);
    }

    private void ai(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.equals(this.ft) || !this.dK) {
            boolean e2 = v.e(str);
            int g2 = v.g(str);
            if (e2) {
                this.dK = true;
                z(g2);
            }
        }
    }

    public final String at() {
        return this.fu;
    }

    private void aj(String str) {
        this.fu = str;
    }

    public final int au() {
        return this.fv;
    }

    public final void m(int i2) {
        this.fv = i2;
    }

    private String cB() {
        return this.fw;
    }

    public final void t(String str) {
        this.fw = str;
    }

    private void ai(int i2) {
        this.dk = i2;
    }

    public final boolean av() {
        return this.dn;
    }

    public final void aw() {
        this.dn = true;
    }

    public final int ax() {
        return this.fx;
    }

    public final void n(int i2) {
        this.fx = i2;
    }

    private int cC() {
        return this.fI;
    }

    private void aj(int i2) {
        this.fI = i2;
    }

    private String cD() {
        return this.fJ;
    }

    private void ak(String str) {
        this.fJ = str;
    }

    public static final class c implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4782a = "video_template";
        public static final String b = "template_url";
        public static final String c = "orientation";
        public static final String d = "paused_url";
        public static final String e = "image";
        private static final int f = 1;
        private String g;
        private int h;
        private int i;
        private String j;
        private String k;
        private List<a> l;

        public static final class a implements Serializable {

            /* renamed from: a, reason: collision with root package name */
            public String f4783a;
            public List<String> b = new ArrayList();
        }

        private c(String str) {
            this.g = str;
        }

        public final String a() {
            return this.g;
        }

        private void b(String str) {
            this.g = str;
        }

        public final int b() {
            return this.h;
        }

        private void a(int i) {
            this.h = i;
        }

        public final int c() {
            return this.i;
        }

        private void b(int i) {
            this.i = i;
        }

        public final String d() {
            return this.j;
        }

        private void c(String str) {
            this.j = str;
        }

        public final String e() {
            return this.k;
        }

        public final void a(String str) {
            this.k = z.d(str);
        }

        public final List<a> f() {
            return this.l;
        }

        private void a(List<a> list) {
            this.l = list;
        }

        private static c d(String str) {
            try {
                if (y.b(str)) {
                    return a(new JSONObject(str));
                }
                return null;
            } catch (Throwable unused) {
                return null;
            }
        }

        public static c a(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            try {
                if (!y.b(jSONObject.toString())) {
                    return null;
                }
                c cVar = new c(jSONObject.toString());
                cVar.h = jSONObject.optInt(f4782a, 1);
                cVar.a(jSONObject.optString("template_url"));
                cVar.i = jSONObject.optInt("orientation");
                cVar.j = jSONObject.optString(d);
                JSONObject optJSONObject = jSONObject.optJSONObject("image");
                if (optJSONObject != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys != null && keys.hasNext()) {
                        String next = keys.next();
                        List<String> a2 = v.a(optJSONObject.optJSONArray(next));
                        if (a2 != null && a2.size() > 0) {
                            a aVar = new a();
                            aVar.f4783a = next;
                            aVar.b.addAll(a2);
                            arrayList.add(aVar);
                        }
                    }
                    cVar.l = arrayList;
                }
                return cVar;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public final boolean ay() {
        return this.fO;
    }

    public final void az() {
        this.fO = true;
    }

    public static final class a implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4779a = "ad_logo_link";
        public static final String b = "adchoice_link";
        public static final String c = "adchoice_icon";
        public static final String d = "adchoice_size";
        public static final String e = "platform_name";
        public static final String f = "platform_logo";
        public static final String g = "adv_name";
        public static final String h = "adv_logo";
        private String i = "";
        private String j = "";
        private String k = "";
        private String l = "";
        private String m = "";
        private String n = "";
        private String o = "";
        private String p = "";

        /* renamed from: q, reason: collision with root package name */
        private int f4780q = 0;
        private int r = 0;
        private String s = "";

        private int e() {
            return this.f4780q;
        }

        private void a(int i) {
            this.f4780q = i;
        }

        private int f() {
            return this.r;
        }

        private void b(int i) {
            this.r = i;
        }

        private void c(String str) {
            this.s = str;
        }

        public final String a() {
            return this.s;
        }

        private String g() {
            return this.i;
        }

        private void d(String str) {
            this.i = str;
        }

        public final String b() {
            return this.j;
        }

        public final void a(String str) {
            this.j = str;
        }

        public final String c() {
            return this.k;
        }

        private void e(String str) {
            this.k = str;
        }

        public final String d() {
            return this.l;
        }

        private void f(String str) {
            this.l = str;
        }

        private String h() {
            return this.m;
        }

        private void g(String str) {
            this.m = str;
        }

        private String i() {
            return this.n;
        }

        private void h(String str) {
            this.n = str;
        }

        private String j() {
            return this.o;
        }

        private void i(String str) {
            this.o = str;
        }

        private String k() {
            return this.p;
        }

        private void j(String str) {
            this.p = str;
        }

        public static a b(String str) {
            try {
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                return a(new JSONObject(str));
            } catch (Exception e2) {
                if (com.anythink.expressad.a.f4564a) {
                    e2.printStackTrace();
                }
                return null;
            } catch (Throwable th) {
                if (com.anythink.expressad.a.f4564a) {
                    th.printStackTrace();
                }
                return null;
            }
        }

        private static a a(JSONObject jSONObject) {
            a aVar = null;
            try {
                a aVar2 = new a();
                try {
                    aVar2.k = jSONObject.optString("adchoice_icon");
                    aVar2.j = jSONObject.optString("adchoice_link");
                    String optString = jSONObject.optString("adchoice_size");
                    aVar2.l = optString;
                    aVar2.i = jSONObject.optString(f4779a);
                    aVar2.p = jSONObject.optString(h);
                    aVar2.o = jSONObject.optString(g);
                    aVar2.n = jSONObject.optString("platform_logo");
                    aVar2.m = jSONObject.optString("platform_name");
                    aVar2.r = k(optString);
                    aVar2.f4780q = l(optString);
                    aVar2.s = jSONObject.toString();
                    return aVar2;
                } catch (Exception e2) {
                    e = e2;
                    aVar = aVar2;
                    if (com.anythink.expressad.a.f4564a) {
                        e.printStackTrace();
                    }
                    return aVar;
                } catch (Throwable th) {
                    th = th;
                    aVar = aVar2;
                    if (com.anythink.expressad.a.f4564a) {
                        th.printStackTrace();
                    }
                    return aVar;
                }
            } catch (Exception e3) {
                e = e3;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        private boolean l() {
            return (TextUtils.isEmpty(this.j) || TextUtils.isEmpty(this.l) || TextUtils.isEmpty(this.k)) ? false : true;
        }

        private static int k(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 1) {
                    return Integer.parseInt(split[1]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }

        private static int l(String str) {
            String[] split;
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            try {
                if (str.contains("x") && (split = str.split("x")) != null && split.length > 0) {
                    return Integer.parseInt(split[0]);
                }
            } catch (NumberFormatException | Exception unused) {
            }
            return 0;
        }
    }

    private boolean i(long j2) {
        long currentTimeMillis = System.currentTimeMillis();
        return this.dy > 0 ? bo() + (this.dy * 1000) >= currentTimeMillis : bo() + j2 >= currentTimeMillis;
    }

    private String cE() {
        return this.fP;
    }

    private void al(String str) {
        this.fP = str;
    }

    public final boolean aA() {
        return (TextUtils.isEmpty(this.fP) || TextUtils.isEmpty(com.anythink.expressad.a.x)) ? false : true;
    }

    public final int aB() {
        return this.fQ;
    }

    public final void o(int i2) {
        this.fQ = i2;
    }

    private String cF() {
        return this.fR;
    }

    private void am(String str) {
        this.fR = str;
    }

    public final boolean aC() {
        return super.b(this);
    }

    private long cG() {
        return this.dp;
    }

    private void j(long j2) {
        this.dp = j2;
    }

    public final com.anythink.expressad.foundation.d.a aD() {
        return this.fW;
    }

    private void a(com.anythink.expressad.foundation.d.a aVar) {
        this.fW = aVar;
    }

    public final ArrayList<Integer> aE() {
        return this.fS;
    }

    private void a(ArrayList<Integer> arrayList) {
        this.fS = arrayList;
    }

    private void an(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] split = str.split(",");
        if (split.length > 0) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (String str2 : split) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str2)));
            }
            this.fS = arrayList;
        }
    }

    private int cI() {
        return this.fT;
    }

    private void ak(int i2) {
        if (i2 > 2 || i2 <= 0) {
            this.fT = 2;
        } else {
            this.fT = i2;
        }
    }

    public final int aF() {
        return this.fU;
    }

    private void al(int i2) {
        if (i2 > 2 || i2 <= 0) {
            this.fU = 1;
        } else {
            this.fU = i2;
        }
    }

    private int cJ() {
        return this.fV;
    }

    private void am(int i2) {
        this.fV = i2;
    }

    private void g(boolean z2) {
        this.fX = z2;
    }

    public final boolean aG() {
        return this.fX;
    }

    private void h(boolean z2) {
        this.fY = z2;
    }

    private boolean cK() {
        return this.fY;
    }

    public final String aH() {
        return this.fZ;
    }

    public final void u(String str) {
        this.fZ = str;
    }

    public final int aI() {
        return this.ga;
    }

    public final void p(int i2) {
        this.ga = i2;
    }

    private int cL() {
        return this.gb;
    }

    private void an(int i2) {
        this.gb = i2;
    }

    public final int aJ() {
        return this.gd;
    }

    private void ao(int i2) {
        this.gd = i2;
    }

    public final int aK() {
        return this.ge;
    }

    private void ap(int i2) {
        this.ge = i2;
    }

    public final int aL() {
        return this.gc;
    }

    private void aq(int i2) {
        this.gc = i2;
        if (i2 == 1) {
            int i3 = this.ea;
            if (i3 == 296 || i3 == 42) {
                String ai2 = ai();
                String ak2 = ak();
                if (!TextUtils.isEmpty(ai2) && !ai2.contains("imp_report_type")) {
                    this.eq = ai2 + "&imp_report_type=" + i2;
                }
                if (TextUtils.isEmpty(ak2) || ak2.contains("imp_report_type")) {
                    return;
                }
                this.ew = ak2 + "&imp_report_type=" + i2;
            }
        }
    }

    public final int aM() {
        return this.gf;
    }

    private void ar(int i2) {
        this.gf = i2;
    }

    public final boolean aN() {
        return this.gg == 1;
    }

    public final void q(int i2) {
        this.gg = i2;
    }

    public final List<String> an() {
        Exception e2;
        ArrayList arrayList;
        String str = this.fb;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(str);
            arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                try {
                    arrayList.add(jSONArray.optString(i2));
                } catch (Exception e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e4) {
            e2 = e4;
            arrayList = null;
        }
    }

    public final boolean a(long j2, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.dy <= 0 ? bo() + j2 >= currentTimeMillis : bo() + (this.dy * 1000) >= currentTimeMillis) {
            return false;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        return this.dz > 0 ? bo() + (this.dz * 1000) >= currentTimeMillis2 : bo() + j3 >= currentTimeMillis2;
    }

    private String cH() {
        ArrayList<Integer> arrayList = this.fS;
        if (arrayList != null && arrayList.size() > 0) {
            StringBuilder sb = new StringBuilder();
            try {
                Iterator<Integer> it = this.fS.iterator();
                while (it.hasNext()) {
                    sb.append(it.next()).append(",");
                }
                if (sb.length() > 0) {
                    sb.delete(sb.length() - 1, sb.length());
                }
                if (!TextUtils.isEmpty(sb)) {
                    return sb.toString();
                }
                return "";
            } catch (Throwable th) {
                th.getMessage();
                return "";
            }
        }
        return "";
    }
}
