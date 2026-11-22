package com.bytedance.sdk.component.adexpress.dynamic.hm;

import com.alibaba.fastjson.parser.JSONLexer;
import com.anythink.expressad.foundation.d.t;
import com.facebook.react.uimanager.ViewProps;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import oqml.a;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes13.dex */
public class bh {
    private int afz;
    private boolean an;
    private String ax;
    private String bfa;
    private String bgy;
    private float bh;
    private JSONObject bmc;
    private String bx;
    private String ci;
    private boolean cj;
    private String ckl;
    private boolean deg;
    private double dgx;
    private int dpn;
    private String dx;
    private int ei;
    private int fa;
    private boolean fe;
    private boolean fqm;
    private boolean fqt;
    private String fsb;
    private float fxn;
    private int gaw;
    private boolean gb;
    private float gff;
    private double ggo;
    private int gs;
    private JSONObject hb;
    private float hie;
    private float hm;
    private double hx;
    private boolean ib;
    private List<fxn> ibh;
    private boolean ig;
    private String ij;
    private String ils;
    private String iqs;
    private String iwp;
    private String izz;
    private int jch;
    private String je;
    private String jg;
    private float jq;
    private String jt;
    private String jz;
    private int ke;
    private double kee;
    private float kg;
    private boolean kwc;
    private String kwn;
    private boolean ln;
    private int lu;
    private int lz;
    private int mcr;
    private int mq;
    private int mve;
    private double mvp;
    private int ncz;
    private int np;
    private int nu;
    private int on;
    private boolean oot;
    private int oox;
    private JSONObject op;
    private int opx;
    private long pek = -1;
    private boolean pjf;
    private int ps;
    private int qhf;
    private int qn;
    private int qu;
    private int qx;
    private boolean rb;
    private int rhk;
    private String rlu;
    private String rmu;
    private int rns;
    private int rrd;
    private String rz;

    /* renamed from: sg, reason: collision with root package name */
    private float f9331sg;
    private int swx;
    private String ta;
    private float tw;
    private String ud;
    private boolean uhw;
    private String ul;
    private String um;
    private String ums;
    private boolean uws;
    private boolean uz;
    private JSONObject vkm;
    private int vts;
    private int wc;
    private String xdg;
    private int xtn;
    private boolean yws;
    private int yx;
    private int zc;
    private int zk;
    private double zn;
    private String zu;
    private int zz;

    public static bh fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        bh bhVar = new bh();
        bhVar.kg(jSONObject.optString("adType", "embeded"));
        bhVar.ckl(jSONObject.optString("clickArea", t.aD));
        bhVar.xdg(jSONObject.optString("clickTigger", "click"));
        bhVar.gff(jSONObject.optString("fontFamily", "PingFangSC"));
        bhVar.hm(jSONObject.optString("textAlign", "left"));
        bhVar.rb(jSONObject.optString("color", a.C1008a.f18760a));
        bhVar.bh(jSONObject.optString("bgColor", "transparent"));
        bhVar.sg(jSONObject.optString("bgImgUrl", ""));
        bhVar.mve(jSONObject.optString("bgImgData", ""));
        bhVar.tw(jSONObject.optString(ViewProps.BORDER_COLOR, "#000000"));
        bhVar.jq(jSONObject.optString("borderStyle", "solid"));
        bhVar.hie(jSONObject.optString("heightMode", "auto"));
        bhVar.dgx(jSONObject.optString("widthMode", "fixed"));
        bhVar.mvp(jSONObject.optString("interactText", ""));
        bhVar.gff(jSONObject.optBoolean("isShowBgControl", false));
        bhVar.rlu(jSONObject.optString("interactBgColor", ""));
        JSONObject optJSONObject = jSONObject.optJSONObject("interactPosition");
        if (optJSONObject != null) {
            bhVar.sg(optJSONObject.optInt(ViewProps.TRANSLATE_Y, 0));
            bhVar.tw(optJSONObject.optInt(ViewProps.TRANSLATE_X, 0));
            bhVar.hm(optJSONObject.optDouble("scaleX", 0.0d));
            bhVar.rb(optJSONObject.optDouble("scaleY", 0.0d));
        }
        bhVar.zu(jSONObject.optString("interactType", ""));
        bhVar.rb(jSONObject.optInt("interactSlideDirection", -1));
        bhVar.rmu(jSONObject.optString("justifyHorizontal", "space-around"));
        bhVar.je(jSONObject.optString("justifyVertical", "flex-start"));
        bhVar.kg(jSONObject.optDouble("timingStart"));
        bhVar.gff(jSONObject.optDouble("timingEnd"));
        bhVar.hm((float) jSONObject.optDouble("width", 0.0d));
        bhVar.gff((float) jSONObject.optDouble("height", 0.0d));
        bhVar.fxn((float) jSONObject.optDouble("borderRadius", 0.0d));
        bhVar.kg((float) jSONObject.optDouble("borderSize", 0.0d));
        bhVar.kg(jSONObject.optBoolean("interactValidate", false));
        bhVar.jq((float) jSONObject.optDouble("fontSize", 0.0d));
        bhVar.rb((float) jSONObject.optDouble(ViewProps.PADDING_BOTTOM, 0.0d));
        bhVar.bh((float) jSONObject.optDouble(ViewProps.PADDING_LEFT, 0.0d));
        bhVar.sg((float) jSONObject.optDouble(ViewProps.PADDING_RIGHT, 0.0d));
        bhVar.tw((float) jSONObject.optDouble(ViewProps.PADDING_TOP, 0.0d));
        bhVar.hm(jSONObject.optBoolean("lineFeed", false));
        bhVar.jq(jSONObject.optInt("lineCount", 0));
        bhVar.bh(jSONObject.optDouble(ViewProps.LINE_HEIGHT, 1.2d));
        bhVar.zu(jSONObject.optInt(ViewProps.LETTER_SPACING, 0));
        bhVar.rb(jSONObject.optBoolean("isDataFixed", false));
        bhVar.ckl(jSONObject.optInt("fontWeight"));
        bhVar.bh(jSONObject.optBoolean("lineLimit"));
        bhVar.xdg(jSONObject.optInt("position"));
        bhVar.ud(jSONObject.optString(DOMConstants.ATTR_ALIGN));
        bhVar.sg(jSONObject.optBoolean("useLeft"));
        bhVar.tw(jSONObject.optBoolean("useRight"));
        bhVar.jq(jSONObject.optBoolean("useTop"));
        bhVar.hie(jSONObject.optBoolean("useBottom"));
        bhVar.dx(jSONObject.optString("data"));
        bhVar.kg(jSONObject.optJSONObject("i18n"));
        bhVar.mvp(jSONObject.optInt(ViewProps.MARGIN_LEFT));
        bhVar.rlu(jSONObject.optInt(ViewProps.MARGIN_RIGHT));
        bhVar.hie(jSONObject.optInt(ViewProps.MARGIN_TOP));
        bhVar.dgx(jSONObject.optInt(ViewProps.MARGIN_BOTTOM));
        bhVar.rmu(jSONObject.optInt("tagMaxCount"));
        bhVar.dgx(jSONObject.optBoolean("allowTextFlow"));
        bhVar.je(jSONObject.optInt("textFlowType"));
        bhVar.ud(jSONObject.optInt("textFlowDuration"));
        bhVar.dx(jSONObject.optInt("left"));
        bhVar.ums(jSONObject.optInt("right"));
        bhVar.iwp(jSONObject.optInt("top"));
        bhVar.jz(jSONObject.optInt("bottom"));
        bhVar.ums(jSONObject.optString(ViewProps.ALIGN_ITEMS, "flex-start"));
        bhVar.iwp(jSONObject.optString(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, ""));
        bhVar.fxn(jSONObject.optBoolean("loop", false));
        bhVar.bx(jSONObject.optInt(ViewProps.Z_INDEX));
        bhVar.ggo(jSONObject.optInt("interactVisibleTime"));
        bhVar.uhw(jSONObject.optInt("interactHiddenTime"));
        bhVar.rlu(jSONObject.optBoolean("interactEnableMask"));
        bhVar.zu(jSONObject.optBoolean("interactWontHide"));
        bhVar.fxn(jSONObject.optString("bgGradient"));
        bhVar.ci(jSONObject.optInt("areaType"));
        bhVar.rz(jSONObject.optInt("interactSlideThreshold", 0));
        bhVar.yws(jSONObject.optInt("interactBottomDistance", com.bytedance.sdk.component.adexpress.hm.kg() ? 0 : 120));
        bhVar.je(jSONObject.optBoolean("openPlayableLandingPage", false));
        bhVar.gff(jSONObject.optJSONObject("video"));
        bhVar.hm(jSONObject.optJSONObject("image"));
        bhVar.ils(jSONObject.optInt("borderShadowExtent"));
        bhVar.ckl(jSONObject.optBoolean("bgGauseBlur"));
        bhVar.ij(jSONObject.optInt("bgGauseBlurRadius"));
        bhVar.xdg(jSONObject.optBoolean("showTimeProgress", false));
        bhVar.rmu(jSONObject.optBoolean("showPlayButton", false));
        bhVar.fxn(jSONObject.optDouble("bgColorCg", 0.0d));
        bhVar.bh(jSONObject.optInt("bgMaterialCenterCalcColor", 0));
        bhVar.kg(jSONObject.optInt("borderTopLeftRadius", 0));
        bhVar.fxn(jSONObject.optInt("borderTopRightRadius", 0));
        bhVar.hm(jSONObject.optInt("borderBottomLeftRadius", 0));
        bhVar.gff(jSONObject.optInt("borderBottomRightRadius", 0));
        bhVar.rb(jSONObject.optJSONObject("interactI18n"));
        bhVar.bx(jSONObject.optString("imageObjectFit"));
        bhVar.uhw(jSONObject.optString("interactTitle"));
        bhVar.ax(jSONObject.optInt("interactTextPositionTop"));
        bhVar.jz(jSONObject.optString("imageLottieTosPath"));
        bhVar.mvp(jSONObject.optBoolean("animationsLoop"));
        bhVar.ke(jSONObject.optInt("lottieAppNameMaxLength"));
        bhVar.zn(jSONObject.optInt("lottieAdDescMaxLength"));
        bhVar.mve(jSONObject.optInt("lottieAdTitleMaxLength"));
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("animations");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                    fxn fxnVar = new fxn();
                    fxnVar.gff(jSONObject2.optString("animationType"));
                    fxnVar.fxn(jSONObject2.optDouble("animationDuration"));
                    fxnVar.kg(jSONObject2.optDouble("animationScaleX"));
                    fxnVar.gff(jSONObject2.optDouble("animationScaleY"));
                    fxnVar.hm(jSONObject2.optString("animationTimeFunction"));
                    fxnVar.hm(jSONObject2.optDouble("animationDelay"));
                    fxnVar.bh(jSONObject2.optInt("animationIterationCount"));
                    fxnVar.rb(jSONObject2.optString("animationDirection"));
                    fxnVar.rb(jSONObject2.optDouble("animationInterval"));
                    fxnVar.fxn(jSONObject2.optInt("animationBorderWidth"));
                    fxnVar.fxn(jSONObject2.optLong("key"));
                    fxnVar.kg(jSONObject2.optInt("animationEffectWidth"));
                    fxnVar.gff(jSONObject2.optInt("animationSwing", 1));
                    fxnVar.hm(jSONObject2.optInt("animationTranslateX"));
                    fxnVar.rb(jSONObject2.optInt("animationTranslateY"));
                    fxnVar.kg(jSONObject2.optString("animationRippleBackgroundColor"));
                    fxnVar.fxn(jSONObject2.optString("animationScaleDirection"));
                    fxnVar.sg(jSONObject2.optInt("animationFadeStart"));
                    fxnVar.tw(jSONObject2.optInt("animationFadeEnd"));
                    fxnVar.bh(jSONObject2.optString("animationFillMode"));
                    fxnVar.jq(jSONObject2.optInt("animationBounceHeight"));
                    if (bhVar.ud() > 0.0d) {
                        fxnVar.hm(fxnVar.zu() + bhVar.ud());
                    }
                    arrayList.add(fxnVar);
                }
                bhVar.fxn(arrayList);
            }
            if (jSONObject.has("triggerSlideMinDistance")) {
                bhVar.ke(jSONObject.optString("triggerSlideDirection", "0"));
                bhVar.fxn(jSONObject.optLong("triggerSlideMinDistance", 0L));
            }
        } catch (Exception unused) {
        }
        return bhVar;
    }

    public boolean fxn() {
        return this.ig;
    }

    public void fxn(boolean z) {
        this.ig = z;
    }

    public int kg() {
        return this.qx;
    }

    public void fxn(int i) {
        this.qx = i;
    }

    public int gff() {
        return this.jch;
    }

    public void kg(int i) {
        this.jch = i;
    }

    public int hm() {
        return this.lu;
    }

    public void gff(int i) {
        this.lu = i;
    }

    public int rb() {
        return this.opx;
    }

    public void hm(int i) {
        this.opx = i;
    }

    public JSONObject bh() {
        return this.op;
    }

    public int sg() {
        return this.oox;
    }

    public void rb(int i) {
        this.oox = i;
    }

    public double tw() {
        return this.hx;
    }

    public void fxn(double d) {
        this.hx = d;
    }

    public int jq() {
        return this.zc;
    }

    public void bh(int i) {
        this.zc = i;
    }

    public String hie() {
        return this.ta;
    }

    public void fxn(String str) {
        this.ta = str;
    }

    public float dgx() {
        return this.fxn;
    }

    public void fxn(float f) {
        this.fxn = f;
    }

    public float mvp() {
        return this.kg;
    }

    public void kg(float f) {
        this.kg = f;
    }

    public void gff(float f) {
        this.gff = f;
    }

    public void hm(float f) {
        this.hm = f;
    }

    public boolean rlu() {
        return this.rb;
    }

    public void kg(boolean z) {
        this.rb = z;
    }

    public float zu() {
        return this.bh;
    }

    public void rb(float f) {
        this.bh = f;
    }

    public float ckl() {
        return this.f9331sg;
    }

    public void bh(float f) {
        this.f9331sg = f;
    }

    public float xdg() {
        return this.tw;
    }

    public void sg(float f) {
        this.tw = f;
    }

    public float rmu() {
        return this.jq;
    }

    public void tw(float f) {
        this.jq = f;
    }

    public float je() {
        return this.hie;
    }

    public void jq(float f) {
        this.hie = f;
    }

    public double ud() {
        return this.dgx;
    }

    public void kg(double d) {
        this.dgx = d;
    }

    public double dx() {
        return this.mvp;
    }

    public void gff(double d) {
        this.mvp = d;
    }

    public void kg(String str) {
        this.rlu = str;
    }

    public void gff(String str) {
        this.zu = str;
    }

    public String ums() {
        return this.ckl;
    }

    public void hm(String str) {
        this.ckl = str;
    }

    public String iwp() {
        return this.xdg;
    }

    public void rb(String str) {
        this.xdg = str;
    }

    public String jz() {
        return this.rmu;
    }

    public void bh(String str) {
        this.rmu = str;
    }

    public void sg(String str) {
        this.je = str;
    }

    public String bx() {
        return this.je;
    }

    private void mve(String str) {
        this.um = str;
    }

    public String uhw() {
        return this.um;
    }

    public String ke() {
        return this.ud;
    }

    public void tw(String str) {
        this.ud = str;
    }

    public void jq(String str) {
        this.dx = str;
    }

    public String mve() {
        return this.ums;
    }

    public void hie(String str) {
        this.ums = str;
    }

    public String zn() {
        return this.iwp;
    }

    public void dgx(String str) {
        this.iwp = str;
    }

    public String ggo() {
        return this.jz;
    }

    public void mvp(String str) {
        this.jz = str;
    }

    public String ax() {
        return this.bx;
    }

    public void rlu(String str) {
        this.bx = str;
    }

    public boolean ci() {
        return this.uhw;
    }

    public void gff(boolean z) {
        this.uhw = z;
    }

    public int rz() {
        return this.ke;
    }

    public void sg(int i) {
        this.ke = i;
    }

    public int ils() {
        return this.mve;
    }

    public void tw(int i) {
        this.mve = i;
    }

    public double ij() {
        return this.zn;
    }

    public void hm(double d) {
        this.zn = d;
    }

    public double yws() {
        return this.ggo;
    }

    public void rb(double d) {
        this.ggo = d;
    }

    public String swx() {
        return this.ax;
    }

    public void zu(String str) {
        this.ax = str;
    }

    public String qhf() {
        return this.ci;
    }

    public void ckl(String str) {
        this.ci = str;
    }

    public String wc() {
        return this.rz;
    }

    public void xdg(String str) {
        this.rz = str;
    }

    public String zk() {
        return this.ils;
    }

    public void rmu(String str) {
        this.ils = str;
    }

    public String ei() {
        return this.ij;
    }

    public void je(String str) {
        this.ij = str;
    }

    public boolean kee() {
        return this.yws;
    }

    public void hm(boolean z) {
        this.yws = z;
    }

    public void jq(int i) {
        this.swx = i;
    }

    public int ps() {
        return this.swx;
    }

    public int deg() {
        return this.qhf;
    }

    public void hie(int i) {
        this.qhf = i;
    }

    public int np() {
        return this.wc;
    }

    public void dgx(int i) {
        this.wc = i;
    }

    public int pjf() {
        return this.zk;
    }

    public void mvp(int i) {
        this.zk = i;
    }

    public int xtn() {
        return this.ei;
    }

    public void rlu(int i) {
        this.ei = i;
    }

    public double fsb() {
        return this.kee;
    }

    public void bh(double d) {
        this.kee = d;
    }

    public int kwc() {
        return this.ps;
    }

    public void zu(int i) {
        this.ps = i;
    }

    public boolean fqt() {
        return this.deg;
    }

    public void rb(boolean z) {
        this.deg = z;
    }

    public int fe() {
        return this.np;
    }

    public void ckl(int i) {
        this.np = i;
    }

    public boolean ln() {
        return this.pjf;
    }

    public void bh(boolean z) {
        this.pjf = z;
    }

    public int kwn() {
        return this.xtn;
    }

    public void xdg(int i) {
        this.xtn = i;
    }

    public String hb() {
        return this.fsb;
    }

    public void ud(String str) {
        this.fsb = str;
    }

    public boolean zz() {
        return this.kwc;
    }

    public void sg(boolean z) {
        this.kwc = z;
    }

    public boolean uws() {
        return this.fqt;
    }

    public void tw(boolean z) {
        this.fqt = z;
    }

    public boolean qn() {
        return this.fe;
    }

    public void jq(boolean z) {
        this.fe = z;
    }

    public boolean gaw() {
        return this.ln;
    }

    public void hie(boolean z) {
        this.ln = z;
    }

    public String vts() {
        return this.kwn;
    }

    public void dx(String str) {
        this.kwn = str;
    }

    public void kg(JSONObject jSONObject) {
        this.hb = jSONObject;
    }

    public JSONObject afz() {
        return this.hb;
    }

    public int rns() {
        return this.zz;
    }

    public void rmu(int i) {
        this.zz = i;
    }

    public boolean ncz() {
        return this.uws;
    }

    public void dgx(boolean z) {
        this.uws = z;
    }

    public int bfa() {
        return this.qn;
    }

    public void je(int i) {
        this.qn = i;
    }

    public int bgy() {
        return this.gaw;
    }

    public void ud(int i) {
        this.gaw = i;
    }

    public int ig() {
        return this.vts;
    }

    public void dx(int i) {
        this.vts = i;
    }

    public int mcr() {
        return this.afz;
    }

    public void ums(int i) {
        this.afz = i;
    }

    public int gs() {
        return this.rns;
    }

    public void iwp(int i) {
        this.rns = i;
    }

    public int fa() {
        return this.ncz;
    }

    public void jz(int i) {
        this.ncz = i;
    }

    public String ibh() {
        return this.bfa;
    }

    public void ums(String str) {
        this.bfa = str;
    }

    public String rrd() {
        return this.bgy;
    }

    public void iwp(String str) {
        this.bgy = str;
    }

    public int dpn() {
        return this.mcr;
    }

    public void bx(int i) {
        this.mcr = i;
    }

    public int lz() {
        return this.gs;
    }

    public void uhw(int i) {
        this.gs = i;
    }

    public String yx() {
        return this.iqs;
    }

    public void jz(String str) {
        this.iqs = str;
    }

    public boolean oot() {
        return this.ib;
    }

    public void mvp(boolean z) {
        this.ib = z;
    }

    public int uz() {
        return this.nu;
    }

    public void ke(int i) {
        this.nu = i;
    }

    public int an() {
        return this.rhk;
    }

    public void mve(int i) {
        this.rhk = i;
    }

    public int qu() {
        return this.mq;
    }

    public void zn(int i) {
        this.mq = i;
    }

    public boolean fqm() {
        return this.gb;
    }

    public void rlu(boolean z) {
        this.gb = z;
    }

    public int hx() {
        return this.fa;
    }

    public void ggo(int i) {
        this.fa = i;
    }

    public void zu(boolean z) {
        this.cj = z;
    }

    public boolean bmc() {
        return this.cj;
    }

    public void bx(String str) {
        this.jg = str;
    }

    public String vkm() {
        return this.jg;
    }

    public void ax(int i) {
        this.on = i;
    }

    public int oox() {
        return this.on;
    }

    public List<fxn> jt() {
        return this.ibh;
    }

    public int cj() {
        List<fxn> list = this.ibh;
        if (list == null) {
            return 0;
        }
        for (fxn fxnVar : list) {
            if ("translate".equals(fxnVar.jq()) && fxnVar.sg() < 0) {
                return -fxnVar.sg();
            }
        }
        return 0;
    }

    public void fxn(List<fxn> list) {
        this.ibh = list;
    }

    public int op() {
        return this.rrd;
    }

    public void ci(int i) {
        this.rrd = i;
    }

    public int zc() {
        return this.dpn;
    }

    public void rz(int i) {
        this.dpn = i;
    }

    public int qx() {
        return this.lz;
    }

    public void ils(int i) {
        this.lz = i;
    }

    public boolean jch() {
        return this.oot;
    }

    public void ckl(boolean z) {
        this.oot = z;
    }

    public int lu() {
        return this.yx;
    }

    public void ij(int i) {
        this.yx = i;
    }

    public boolean opx() {
        return this.uz;
    }

    public void xdg(boolean z) {
        this.uz = z;
    }

    public boolean jg() {
        return this.an;
    }

    public void rmu(boolean z) {
        this.an = z;
    }

    public int on() {
        return this.qu;
    }

    public void yws(int i) {
        this.qu = i;
    }

    public String gb() {
        return this.jt;
    }

    public boolean iqs() {
        return this.fqm;
    }

    public void je(boolean z) {
        this.fqm = z;
    }

    public void gff(JSONObject jSONObject) {
        this.bmc = jSONObject;
    }

    public JSONObject ib() {
        return this.vkm;
    }

    public void hm(JSONObject jSONObject) {
        this.vkm = jSONObject;
    }

    public void rb(JSONObject jSONObject) {
        this.op = jSONObject;
    }

    public String nu() {
        return this.izz;
    }

    public void uhw(String str) {
        this.izz = str;
    }

    public void rhk() {
        fxn(this, this.bmc);
    }

    public void mq() {
        fxn(this, this.vkm);
    }

    public String izz() {
        return this.ul;
    }

    public void ke(String str) {
        this.ul = str;
    }

    public long ul() {
        return this.pek;
    }

    public void fxn(long j) {
        this.pek = j;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void fxn(bh bhVar, JSONObject jSONObject) {
        if (bhVar == null || jSONObject == null) {
            return;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            next.hashCode();
            char c = 65535;
            switch (next.hashCode()) {
                case -2067713583:
                    if (next.equals("isShowBgControl")) {
                        c = 0;
                        break;
                    }
                    break;
                case -1965619659:
                    if (next.equals("clickArea")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1912831834:
                    if (next.equals("triggerSlideDirection")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1885934767:
                    if (next.equals("bgImgUrl")) {
                        c = 3;
                        break;
                    }
                    break;
                case -1822062213:
                    if (next.equals("lineCount")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1821293778:
                    if (next.equals("openPlayableLandingPage")) {
                        c = 5;
                        break;
                    }
                    break;
                case -1813937113:
                    if (next.equals("lineLimit")) {
                        c = 6;
                        break;
                    }
                    break;
                case -1578250488:
                    if (next.equals("interactBgColor")) {
                        c = 7;
                        break;
                    }
                    break;
                case -1501175880:
                    if (next.equals(ViewProps.PADDING_LEFT)) {
                        c = '\b';
                        break;
                    }
                    break;
                case -1422965251:
                    if (next.equals("adType")) {
                        c = '\t';
                        break;
                    }
                    break;
                case -1383228885:
                    if (next.equals("bottom")) {
                        c = '\n';
                        break;
                    }
                    break;
                case -1224696685:
                    if (next.equals("fontFamily")) {
                        c = 11;
                        break;
                    }
                    break;
                case -1221029593:
                    if (next.equals("height")) {
                        c = '\f';
                        break;
                    }
                    break;
                case -1065511464:
                    if (next.equals("textAlign")) {
                        c = '\r';
                        break;
                    }
                    break;
                case -1063257157:
                    if (next.equals(ViewProps.ALIGN_ITEMS)) {
                        c = 14;
                        break;
                    }
                    break;
                case -1046708884:
                    if (next.equals("interactValidate")) {
                        c = 15;
                        break;
                    }
                    break;
                case -1044792121:
                    if (next.equals(ViewProps.MARGIN_TOP)) {
                        c = 16;
                        break;
                    }
                    break;
                case -1019884910:
                    if (next.equals("useBottom")) {
                        c = 17;
                        break;
                    }
                    break;
                case -1005195314:
                    if (next.equals("triggerSlideMinDistance")) {
                        c = 18;
                        break;
                    }
                    break;
                case -962590849:
                    if (next.equals(HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION)) {
                        c = 19;
                        break;
                    }
                    break;
                case -912366651:
                    if (next.equals("tagMaxCount")) {
                        c = 20;
                        break;
                    }
                    break;
                case -848877971:
                    if (next.equals("interactHiddenTime")) {
                        c = 21;
                        break;
                    }
                    break;
                case -836058546:
                    if (next.equals("useTop")) {
                        c = 22;
                        break;
                    }
                    break;
                case -734428249:
                    if (next.equals("fontWeight")) {
                        c = 23;
                        break;
                    }
                    break;
                case -731417480:
                    if (next.equals(ViewProps.Z_INDEX)) {
                        c = 24;
                        break;
                    }
                    break;
                case -709393864:
                    if (next.equals("timingStart")) {
                        c = 25;
                        break;
                    }
                    break;
                case -515807685:
                    if (next.equals(ViewProps.LINE_HEIGHT)) {
                        c = JSONLexer.EOI;
                        break;
                    }
                    break;
                case -321658193:
                    if (next.equals("textFlowDuration")) {
                        c = 27;
                        break;
                    }
                    break;
                case -295409451:
                    if (next.equals("useRight")) {
                        c = 28;
                        break;
                    }
                    break;
                case -289173127:
                    if (next.equals(ViewProps.MARGIN_BOTTOM)) {
                        c = 29;
                        break;
                    }
                    break;
                case -204859874:
                    if (next.equals("bgColor")) {
                        c = 30;
                        break;
                    }
                    break;
                case -148259282:
                    if (next.equals("useLeft")) {
                        c = 31;
                        break;
                    }
                    break;
                case -51738487:
                    if (next.equals("widthMode")) {
                        c = ' ';
                        break;
                    }
                    break;
                case 115029:
                    if (next.equals("top")) {
                        c = '!';
                        break;
                    }
                    break;
                case 3076010:
                    if (next.equals("data")) {
                        c = '\"';
                        break;
                    }
                    break;
                case 3317767:
                    if (next.equals("left")) {
                        c = '#';
                        break;
                    }
                    break;
                case 3327652:
                    if (next.equals("loop")) {
                        c = Typography.dollar;
                        break;
                    }
                    break;
                case 90130308:
                    if (next.equals(ViewProps.PADDING_TOP)) {
                        c = '%';
                        break;
                    }
                    break;
                case 92903173:
                    if (next.equals(DOMConstants.ATTR_ALIGN)) {
                        c = Typography.amp;
                        break;
                    }
                    break;
                case 94842723:
                    if (next.equals("color")) {
                        c = '\'';
                        break;
                    }
                    break;
                case 108511772:
                    if (next.equals("right")) {
                        c = '(';
                        break;
                    }
                    break;
                case 113126854:
                    if (next.equals("width")) {
                        c = ')';
                        break;
                    }
                    break;
                case 164611121:
                    if (next.equals("timingEnd")) {
                        c = '*';
                        break;
                    }
                    break;
                case 202355100:
                    if (next.equals(ViewProps.PADDING_BOTTOM)) {
                        c = '+';
                        break;
                    }
                    break;
                case 247204452:
                    if (next.equals("allowTextFlow")) {
                        c = AbstractJsonLexerKt.COMMA;
                        break;
                    }
                    break;
                case 302841174:
                    if (next.equals("interactWontHide")) {
                        c = '-';
                        break;
                    }
                    break;
                case 365601008:
                    if (next.equals("fontSize")) {
                        c = '.';
                        break;
                    }
                    break;
                case 428975654:
                    if (next.equals("justifyVertical")) {
                        c = '/';
                        break;
                    }
                    break;
                case 439444041:
                    if (next.equals("interactVisibleTime")) {
                        c = '0';
                        break;
                    }
                    break;
                case 713848971:
                    if (next.equals(ViewProps.PADDING_RIGHT)) {
                        c = '1';
                        break;
                    }
                    break;
                case 722830999:
                    if (next.equals(ViewProps.BORDER_COLOR)) {
                        c = '2';
                        break;
                    }
                    break;
                case 737768677:
                    if (next.equals("borderStyle")) {
                        c = '3';
                        break;
                    }
                    break;
                case 747804969:
                    if (next.equals("position")) {
                        c = '4';
                        break;
                    }
                    break;
                case 791643104:
                    if (next.equals("isDataFixed")) {
                        c = '5';
                        break;
                    }
                    break;
                case 975087886:
                    if (next.equals(ViewProps.MARGIN_RIGHT)) {
                        c = '6';
                        break;
                    }
                    break;
                case 1110826708:
                    if (next.equals("justifyHorizontal")) {
                        c = '7';
                        break;
                    }
                    break;
                case 1122368895:
                    if (next.equals("interactPosition")) {
                        c = '8';
                        break;
                    }
                    break;
                case 1188229042:
                    if (next.equals("lineFeed")) {
                        c = '9';
                        break;
                    }
                    break;
                case 1332036739:
                    if (next.equals("interactText")) {
                        c = AbstractJsonLexerKt.COLON;
                        break;
                    }
                    break;
                case 1332055696:
                    if (next.equals("interactType")) {
                        c = ';';
                        break;
                    }
                    break;
                case 1349188574:
                    if (next.equals("borderRadius")) {
                        c = Typography.less;
                        break;
                    }
                    break;
                case 1360828714:
                    if (next.equals("clickTigger")) {
                        c = com.alipay.sdk.m.p.a.h;
                        break;
                    }
                    break;
                case 1490178922:
                    if (next.equals("heightMode")) {
                        c = Typography.greater;
                        break;
                    }
                    break;
                case 1761274325:
                    if (next.equals("textFlowType")) {
                        c = '?';
                        break;
                    }
                    break;
                case 1824903757:
                    if (next.equals("borderSize")) {
                        c = '@';
                        break;
                    }
                    break;
                case 1970934485:
                    if (next.equals(ViewProps.MARGIN_LEFT)) {
                        c = 'A';
                        break;
                    }
                    break;
                case 2111078717:
                    if (next.equals(ViewProps.LETTER_SPACING)) {
                        c = 'B';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    bhVar.gff(jSONObject.optBoolean(next, false));
                    break;
                case 1:
                    bhVar.ckl(jSONObject.optString(next));
                    break;
                case 2:
                    bhVar.ke(jSONObject.optString(next));
                    break;
                case 3:
                    bhVar.sg(jSONObject.optString(next));
                    break;
                case 4:
                    bhVar.jq(jSONObject.optInt(next));
                    break;
                case 5:
                    bhVar.je(jSONObject.optBoolean(next));
                    break;
                case 6:
                    bhVar.bh(jSONObject.optBoolean(next));
                    break;
                case 7:
                    bhVar.rlu(jSONObject.optString(next));
                    break;
                case '\b':
                    bhVar.bh((float) jSONObject.optDouble(next));
                    break;
                case '\t':
                    bhVar.kg(jSONObject.optString(next));
                    break;
                case '\n':
                    bhVar.jz(jSONObject.optInt(next));
                    break;
                case 11:
                    bhVar.gff(jSONObject.optString(next));
                    break;
                case '\f':
                    bhVar.gff((float) jSONObject.optDouble(next));
                    break;
                case '\r':
                    bhVar.hm(jSONObject.optString(next));
                    break;
                case 14:
                    bhVar.ums(jSONObject.optString(next));
                    break;
                case 15:
                    bhVar.kg(jSONObject.optBoolean(next));
                    break;
                case 16:
                    bhVar.hie(jSONObject.optInt(next));
                    break;
                case 17:
                    bhVar.hie(jSONObject.optBoolean(next));
                    break;
                case 18:
                    bhVar.fxn(jSONObject.optLong(next));
                    break;
                case 19:
                    bhVar.iwp(jSONObject.optString(next));
                    break;
                case 20:
                    bhVar.rmu(jSONObject.optInt(next));
                    break;
                case 21:
                    bhVar.uhw(jSONObject.optInt(next));
                    break;
                case 22:
                    bhVar.jq(jSONObject.optBoolean(next));
                    break;
                case 23:
                    bhVar.ckl(jSONObject.optInt(next));
                    break;
                case 24:
                    bhVar.bx(jSONObject.optInt(next));
                    break;
                case 25:
                    bhVar.kg(jSONObject.optDouble(next));
                    break;
                case 26:
                    bhVar.bh(jSONObject.optDouble(next));
                    break;
                case 27:
                    bhVar.ud(jSONObject.optInt(next));
                    break;
                case 28:
                    bhVar.tw(jSONObject.optBoolean(next));
                    break;
                case 29:
                    bhVar.dgx(jSONObject.optInt(next));
                    break;
                case 30:
                    bhVar.bh(jSONObject.optString(next));
                    break;
                case 31:
                    bhVar.sg(jSONObject.optBoolean(next));
                    break;
                case ' ':
                    bhVar.dgx(jSONObject.optString(next));
                    break;
                case '!':
                    bhVar.iwp(jSONObject.optInt(next));
                    break;
                case '\"':
                    bhVar.dx(jSONObject.optString(next));
                    break;
                case '#':
                    bhVar.dx(jSONObject.optInt(next));
                    break;
                case '$':
                    bhVar.fxn(jSONObject.optBoolean(next));
                    break;
                case '%':
                    bhVar.tw((float) jSONObject.optDouble(next));
                    break;
                case '&':
                    bhVar.ud(jSONObject.optString(next));
                    break;
                case '\'':
                    bhVar.rb(jSONObject.optString(next));
                    break;
                case '(':
                    bhVar.ums(jSONObject.optInt(next));
                    break;
                case ')':
                    bhVar.hm((float) jSONObject.optDouble(next));
                    break;
                case '*':
                    bhVar.gff(jSONObject.optDouble(next));
                    break;
                case '+':
                    bhVar.rb((float) jSONObject.optDouble(next));
                    break;
                case ',':
                    bhVar.dgx(jSONObject.optBoolean(next));
                    break;
                case '-':
                    bhVar.zu(jSONObject.optBoolean(next));
                    break;
                case '.':
                    bhVar.jq((float) jSONObject.optDouble(next));
                    break;
                case '/':
                    bhVar.je(jSONObject.optString(next));
                    break;
                case '0':
                    bhVar.ggo(jSONObject.optInt(next));
                    break;
                case '1':
                    bhVar.sg((float) jSONObject.optDouble(next));
                    break;
                case '2':
                    bhVar.tw(jSONObject.optString(next));
                    break;
                case '3':
                    bhVar.jq(jSONObject.optString(next));
                    break;
                case '4':
                    bhVar.xdg(jSONObject.optInt(next));
                    break;
                case '5':
                    bhVar.rb(jSONObject.optBoolean(next));
                    break;
                case '6':
                    bhVar.rlu(jSONObject.optInt(next));
                    break;
                case '7':
                    bhVar.rmu(jSONObject.optString(next));
                    break;
                case '8':
                    JSONObject optJSONObject = jSONObject.optJSONObject(next);
                    if (optJSONObject == null) {
                        break;
                    } else {
                        bhVar.sg(optJSONObject.optInt(ViewProps.TRANSLATE_Y, 0));
                        bhVar.tw(optJSONObject.optInt(ViewProps.TRANSLATE_X, 0));
                        bhVar.hm(optJSONObject.optDouble("scaleX", 0.0d));
                        bhVar.rb(optJSONObject.optDouble("scaleY", 0.0d));
                        break;
                    }
                case '9':
                    bhVar.hm(jSONObject.optBoolean(next));
                    break;
                case ':':
                    bhVar.mvp(jSONObject.optString(next));
                    break;
                case ';':
                    bhVar.zu(jSONObject.optString(next));
                    break;
                case '<':
                    bhVar.fxn((float) jSONObject.optDouble(next));
                    break;
                case '=':
                    bhVar.xdg(jSONObject.optString(next));
                    break;
                case '>':
                    bhVar.hie(jSONObject.optString(next));
                    break;
                case '?':
                    bhVar.je(jSONObject.optInt(next));
                    break;
                case '@':
                    bhVar.kg((float) jSONObject.optDouble(next));
                    break;
                case 'A':
                    bhVar.mvp(jSONObject.optInt(next));
                    break;
                case 'B':
                    bhVar.zu(jSONObject.optInt(next));
                    break;
            }
        }
    }
}
