package com.bytedance.sdk.openadsdk.dx;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.core.common.d.j;
import com.anythink.expressad.foundation.g.a;
import com.hjq.permissions.Permission;
import com.iflytek.cloud.SpeechConstant;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class tw {
    private int afz;
    private JSONObject an;
    private boolean asy;
    private boolean au;
    private long ax;
    private Context bfa;
    private WebView bgy;
    private final String bh;
    private String bmc;
    private boolean bx;
    private volatile boolean bz;
    private long ci;
    private float cj;
    private kg ckl;
    private String ctw;
    private int deg;
    private Runnable dgx;
    private JSONObject dpn;
    private String dx;
    private String ei;
    private gff fa;
    private String fe;
    private String fqm;
    private int fqt;
    private int fsb;
    public final String fxn;
    private long gaw;
    private int gb;
    public final String gff;
    private long ggo;
    private List<JSONObject> gq;
    private com.bytedance.sdk.openadsdk.dx.fxn gs;
    private int hb;
    private Runnable hie;
    public final String hm;
    private String hx;
    private String ib;
    private int ibh;
    private WeakReference<View> ig;
    private long ij;
    private long ils;
    private int iqs;
    private boolean iwp;
    private boolean izz;
    private int jch;
    private boolean je;
    private int jg;
    private Runnable jq;
    private float jt;
    private boolean jz;
    private long ke;
    private String kee;
    public final String kg;
    private int kwc;
    private int kwn;
    private boolean ln;
    private int lu;
    private String lz;
    private bh mcr;
    private boolean mq;
    private long mve;
    private final Handler mvp;
    private fxn ncz;
    private boolean np;
    private boolean nu;
    private int on;
    private String oot;
    private float oox;
    private int op;
    private int opx;
    private boolean pek;
    private boolean pfi;
    private int pjf;
    private int ps;
    private long qhf;
    private long qn;
    private String qu;
    private int qx;
    public final String rb;
    private boolean rhk;
    private Runnable rlu;
    private boolean rmu;
    private int rns;
    private String rp;
    private int rrd;
    private long rz;

    /* renamed from: sg, reason: collision with root package name */
    private final String f9546sg;
    private long swx;
    private String ta;
    private final Handler tw;
    private Set<String> ud;
    private String uhw;
    private boolean ul;
    private String um;
    private String ums;
    private volatile boolean unf;
    private int uws;
    private Map<String, String> uz;
    private ViewTreeObserver.OnGlobalLayoutListener vd;
    private JSONObject vkm;
    private JSONObject vts;
    private String wc;
    private boolean xdg;
    private boolean xga;
    private int xtn;
    private int yup;
    private long yws;
    private String yx;
    private int zc;
    private String zk;
    private int zn;
    private Runnable zu;
    private int zz;

    public enum fxn {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    static /* synthetic */ int mvp(tw twVar) {
        int i = twVar.ps;
        twVar.ps = i + 1;
        return i;
    }

    static /* synthetic */ int rlu(tw twVar) {
        int i = twVar.deg;
        twVar.deg = i + 1;
        return i;
    }

    private tw(Context context, WebView webView, gff gffVar, com.bytedance.sdk.openadsdk.dx.fxn fxnVar, fxn fxnVar2) {
        this.bh = "playable_stuck_check_ping";
        this.f9546sg = "playable_apply_media_permission_callback";
        this.tw = new Handler(Looper.getMainLooper());
        this.mvp = new Handler(Looper.getMainLooper());
        this.xdg = true;
        this.rmu = true;
        this.je = true;
        this.fxn = "PL_sdk_playable_global_viewable";
        this.kg = "PL_sdk_page_screen_blank";
        this.gff = "PL_sdk_playable_destroy_analyze_summary";
        this.hm = "PL_sdk_playable_hardware_dialog_cancel";
        this.rb = "PL_sdk_playable_hardware_dialog_setting";
        this.ud = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.dx = null;
        this.ums = "embeded_ad";
        this.iwp = true;
        this.jz = true;
        this.bx = false;
        this.uhw = "";
        this.ke = 10L;
        this.mve = 10L;
        this.zn = 700;
        this.ggo = 0L;
        this.ax = 0L;
        this.ci = -1L;
        this.rz = -1L;
        this.ils = -1L;
        this.ij = -1L;
        this.yws = -1L;
        this.swx = -1L;
        this.qhf = -1L;
        this.wc = "";
        this.zk = "";
        this.ei = "";
        this.kee = "";
        this.ps = 0;
        this.deg = 0;
        this.np = false;
        this.pjf = 0;
        this.xtn = -1;
        this.fsb = 0;
        this.kwc = 0;
        this.fqt = 0;
        this.fe = null;
        this.ln = false;
        this.kwn = 0;
        this.hb = 0;
        this.zz = 0;
        this.uws = 0;
        this.qn = 0L;
        this.gaw = 0L;
        this.afz = -2;
        this.rns = 0;
        this.ibh = 0;
        this.rrd = 0;
        this.dpn = new JSONObject();
        this.uz = new HashMap();
        this.an = new JSONObject();
        this.bmc = "";
        this.oox = 0.0f;
        this.jt = 0.0f;
        this.mq = false;
        this.pek = false;
        this.asy = false;
        this.gq = new ArrayList();
        this.xga = true;
        this.unf = true;
        this.bz = true;
        this.vd = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.dx.tw.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) tw.this.ig.get();
                    if (view == null) {
                        return;
                    }
                    tw.this.kg(view);
                } catch (Throwable th) {
                    sg.fxn("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.yup = -1;
        this.afz = 0;
        this.ncz = fxnVar2;
        this.bgy = webView;
        jq.fxn(webView);
        fxn(webView);
        fxn(context, gffVar, fxnVar);
    }

    private tw(Context context, int i, gff gffVar, com.bytedance.sdk.openadsdk.dx.fxn fxnVar) {
        this.bh = "playable_stuck_check_ping";
        this.f9546sg = "playable_apply_media_permission_callback";
        this.tw = new Handler(Looper.getMainLooper());
        this.mvp = new Handler(Looper.getMainLooper());
        this.xdg = true;
        this.rmu = true;
        this.je = true;
        this.fxn = "PL_sdk_playable_global_viewable";
        this.kg = "PL_sdk_page_screen_blank";
        this.gff = "PL_sdk_playable_destroy_analyze_summary";
        this.hm = "PL_sdk_playable_hardware_dialog_cancel";
        this.rb = "PL_sdk_playable_hardware_dialog_setting";
        this.ud = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.dx = null;
        this.ums = "embeded_ad";
        this.iwp = true;
        this.jz = true;
        this.bx = false;
        this.uhw = "";
        this.ke = 10L;
        this.mve = 10L;
        this.zn = 700;
        this.ggo = 0L;
        this.ax = 0L;
        this.ci = -1L;
        this.rz = -1L;
        this.ils = -1L;
        this.ij = -1L;
        this.yws = -1L;
        this.swx = -1L;
        this.qhf = -1L;
        this.wc = "";
        this.zk = "";
        this.ei = "";
        this.kee = "";
        this.ps = 0;
        this.deg = 0;
        this.np = false;
        this.pjf = 0;
        this.xtn = -1;
        this.fsb = 0;
        this.kwc = 0;
        this.fqt = 0;
        this.fe = null;
        this.ln = false;
        this.kwn = 0;
        this.hb = 0;
        this.zz = 0;
        this.uws = 0;
        this.qn = 0L;
        this.gaw = 0L;
        this.afz = -2;
        this.rns = 0;
        this.ibh = 0;
        this.rrd = 0;
        this.dpn = new JSONObject();
        this.uz = new HashMap();
        this.an = new JSONObject();
        this.bmc = "";
        this.oox = 0.0f;
        this.jt = 0.0f;
        this.mq = false;
        this.pek = false;
        this.asy = false;
        this.gq = new ArrayList();
        this.xga = true;
        this.unf = true;
        this.bz = true;
        this.vd = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.dx.tw.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                try {
                    View view = (View) tw.this.ig.get();
                    if (view == null) {
                        return;
                    }
                    tw.this.kg(view);
                } catch (Throwable th) {
                    sg.fxn("PlayablePlugin", "onSizeChanged error", th);
                }
            }
        };
        this.yup = -1;
        this.afz = i;
        this.ncz = fxn.LAND_PAGE;
        fxn(context, gffVar, fxnVar);
    }

    private void fxn(Context context, gff gffVar, com.bytedance.sdk.openadsdk.dx.fxn fxnVar) {
        this.dx = UUID.randomUUID().toString();
        this.bfa = context;
        this.gs = fxnVar;
        this.fa = gffVar;
        hie.fxn(fxnVar);
        this.mcr = new bh(this);
        zk();
        if (this.bgy == null) {
            this.yup = 4;
            this.tw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.4
                @Override // java.lang.Runnable
                public void run() {
                    tw.this.fxn(5, "webview is null");
                }
            });
        }
    }

    private void zk() {
        this.ckl = new kg(this, this.zn);
        this.jq = new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.5
            @Override // java.lang.Runnable
            public void run() {
                if (tw.this.iwp) {
                    tw.this.iwp = false;
                    tw.this.tw.removeCallbacks(tw.this.hie);
                    tw.this.fxn(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.hie = new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.6
            @Override // java.lang.Runnable
            public void run() {
                if (tw.this.iwp) {
                    tw.this.iwp = false;
                    tw.this.unf = false;
                    tw.this.tw.removeCallbacks(tw.this.jq);
                    tw.this.fxn(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.rlu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.7
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                if (tw.this.bgy != null) {
                    tw.this.bgy.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.dx.tw.7.1
                        @Override // android.webkit.ValueCallback
                        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            if (tw.this.ckl != null) {
                                tw.this.ckl.fxn(System.currentTimeMillis());
                            }
                        }
                    });
                }
                if (tw.this.mvp != null) {
                    tw.this.mvp.postDelayed(this, 500L);
                }
            }
        };
        this.zu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.8
            @Override // java.lang.Runnable
            public void run() {
                System.currentTimeMillis();
                tw.this.fxn("playable_stuck_check_ping", new JSONObject());
                if (tw.this.mvp != null) {
                    tw.this.mvp.postDelayed(this, 500L);
                }
            }
        };
        this.dgx = new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.9
            @Override // java.lang.Runnable
            public void run() {
                if (tw.this.gaw <= 0) {
                    tw.this.kg(1, "Clicking on the hot zone causes the program to freeze.");
                } else {
                    if (tw.this.gaw - tw.this.qn <= tw.this.zn) {
                        tw.this.rz();
                        tw.this.qn = 0L;
                        tw.this.gaw = 0L;
                        return;
                    }
                    tw.this.kg(1, "Clicking on the hot zone causes the program to freeze.");
                }
            }
        };
    }

    private boolean mvp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public void fxn(View view) {
        if (view == null) {
            return;
        }
        try {
            this.ig = new WeakReference<>(view);
            kg(view);
            view.getViewTreeObserver().addOnGlobalLayoutListener(this.vd);
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "setViewForScreenSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kg(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.ibh == view.getWidth() && this.rrd == view.getHeight()) {
                return;
            }
            this.ibh = view.getWidth();
            this.rrd = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.ibh);
            jSONObject.put("height", this.rrd);
            fxn("resize", jSONObject);
            this.dpn = jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "resetViewDataJsonByView error", th);
        }
    }

    public Context fxn() {
        return this.bfa;
    }

    public tw fxn(String str, String str2) {
        this.uz.put(str, str2);
        return this;
    }

    public Map<String, String> kg() {
        return this.uz;
    }

    public tw fxn(String str) {
        this.lz = str;
        return this;
    }

    public tw kg(String str) {
        this.yx = str;
        return this;
    }

    public JSONObject gff() {
        return this.vkm;
    }

    public tw gff(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.vkm = jSONObject;
            return this;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "setPlayableStyle error", th);
            return this;
        }
    }

    public String hm() {
        return this.yx;
    }

    public String rb() {
        return this.lz;
    }

    public tw hm(String str) {
        this.oot = str;
        return this;
    }

    public String bh() {
        return this.oot;
    }

    public tw rb(String str) {
        this.ib = str;
        return this;
    }

    public String sg() {
        return this.ib;
    }

    public tw fxn(boolean z) {
        this.nu = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.nu);
            fxn("volumeChange", jSONObject);
            return this;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "setIsMute error", th);
            return this;
        }
    }

    public boolean tw() {
        return this.nu;
    }

    public tw kg(boolean z) {
        this.ul = z;
        return this;
    }

    public tw fxn(long j) {
        if (j <= 0) {
            this.ke = 10L;
            return this;
        }
        this.ke = j;
        return this;
    }

    public tw kg(long j) {
        if (j <= 0) {
            this.mve = 10L;
            return this;
        }
        this.mve = j;
        return this;
    }

    public void fxn(int i) {
        this.yup = i;
    }

    public tw gff(boolean z) {
        if (this.yup != -1 && this.rhk != z) {
            this.rhk = z;
            JSONObject jSONObject = new JSONObject();
            try {
                if (!this.rhk) {
                    jSONObject.put("playable_background_show_type", this.hb);
                }
            } catch (JSONException unused) {
            }
            gff(this.rhk ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
            if (this.rz == -1 && this.rhk) {
                this.rz = System.currentTimeMillis();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put(j.w.E, this.yup == 1 ? 1 : 2);
                    int i = this.yup;
                    if (i != -1) {
                        jSONObject2.put("webview_state", i);
                    }
                } catch (JSONException unused2) {
                }
                gff("PL_sdk_page_show", jSONObject2);
            }
            if (this.rz != -1 && !this.rhk && !this.mq) {
                this.mq = true;
            }
            if (this.rhk) {
                this.ci = System.currentTimeMillis();
            } else if (this.ci != -1) {
                this.ggo += System.currentTimeMillis() - this.ci;
                this.ci = -1L;
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("viewStatus", this.rhk);
                fxn("viewableChange", jSONObject3);
            } catch (Throwable th) {
                sg.fxn("PlayablePlugin", "setViewable error", th);
            }
            if (this.rhk) {
                rz();
            } else {
                ils();
            }
        }
        return this;
    }

    public boolean jq() {
        return this.rhk;
    }

    public tw hm(boolean z) {
        this.izz = z;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.izz);
            fxn("change_playable_click", jSONObject);
            return this;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "setPlayableClick error", th);
            return this;
        }
    }

    public JSONObject hie() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.izz);
            return jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "getPlayableClickStatus error", th);
            return new JSONObject();
        }
    }

    public Set<String> dgx() {
        return this.mcr.fxn();
    }

    public JSONObject mvp() {
        try {
            boolean fxn2 = rb.fxn(this.bfa, Permission.RECORD_AUDIO);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", fxn2);
            return jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject rlu() {
        try {
            boolean fxn2 = rb.fxn(this.bfa, Permission.CAMERA);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", fxn2);
            return jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public JSONObject zu() {
        boolean fxn2;
        boolean fxn3;
        try {
            boolean z = true;
            if (Build.VERSION.SDK_INT >= 33) {
                fxn2 = rb.fxn(this.bfa, "android.permission.READ_MEDIA_IMAGES");
                fxn3 = true;
            } else {
                fxn2 = rb.fxn(this.bfa, "android.permission.READ_EXTERNAL_STORAGE");
                fxn3 = rb.fxn(this.bfa, "android.permission.WRITE_EXTERNAL_STORAGE");
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", fxn2);
            jSONObject.put("isHasWrite", fxn3);
            if (!fxn2 || !fxn3) {
                z = false;
            }
            jSONObject.put("result", z);
            return jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "getCameraPermission error", th);
            return new JSONObject();
        }
    }

    public void fxn(JSONObject jSONObject) {
        com.bytedance.sdk.openadsdk.dx.fxn fxnVar = this.gs;
        if (fxnVar == null || fxnVar.kg(jSONObject) || jSONObject == null) {
            return;
        }
        String optString = jSONObject.optString("resource_base64");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        int optInt = jSONObject.optInt("resource_type", -1);
        String optString2 = jSONObject.optString("resource_name", "playable_media");
        if (optInt == 1) {
            kg(optString2, optString);
        }
    }

    public void kg(JSONObject jSONObject) {
        if (this.gs != null) {
            try {
                jSONObject.optBoolean("isPrevent", false);
            } catch (Exception unused) {
            }
        }
    }

    public JSONObject ckl() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.ncz.ordinal());
            jSONObject.put("safe_area_top_height", this.oox);
            jSONObject.put("safe_area_bottom_height", this.jt);
            jSONObject.put("playable_enter_from", this.kwc);
            jSONObject.put("playable_retry_count", this.fsb);
            jSONObject.put("playable_card_session", this.wc);
            jSONObject.put("playable_video_session", this.zk);
            jSONObject.put("playable_network_type", xdg());
            jSONObject.put("aweme_id", this.kee);
            return jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "playableInfo error", th);
            return new JSONObject();
        }
    }

    public void fxn(String str, JSONObject jSONObject) {
        if (this.au) {
            if (!sg.fxn() || jSONObject == null) {
                return;
            }
            jSONObject.toString();
            return;
        }
        if (sg.fxn() && jSONObject != null) {
            jSONObject.toString();
        }
        gff gffVar = this.fa;
        if (gffVar != null) {
            gffVar.fxn(str, jSONObject);
        }
    }

    public void kg(String str, String str2) {
        Bitmap fxn2;
        if (TextUtils.isEmpty(str2) || (fxn2 = rb.fxn(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.bfa.getContentResolver(), fxn2, str, "");
    }

    public String xdg() {
        com.bytedance.sdk.openadsdk.dx.fxn fxnVar;
        if (TextUtils.isEmpty(this.ei) && (fxnVar = this.gs) != null) {
            this.ei = fxnVar.fxn().toString();
        }
        return this.ei;
    }

    public com.bytedance.sdk.openadsdk.dx.fxn rmu() {
        return this.gs;
    }

    public JSONObject je() {
        if (this.dpn.isNull("width")) {
            View view = this.ig.get();
            if (view == null) {
                return this.dpn;
            }
            kg(view);
        }
        return this.dpn;
    }

    public JSONObject ud() {
        return this.an;
    }

    public tw gff(JSONObject jSONObject) {
        this.an = jSONObject;
        return this;
    }

    public tw bh(String str) {
        this.ums = str;
        return this;
    }

    public tw sg(String str) {
        Uri parse;
        String scheme;
        int indexOf;
        String decode;
        this.bmc = str;
        try {
            parse = Uri.parse(str);
            scheme = parse.getScheme();
        } catch (Throwable unused) {
        }
        if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
            String host = parse.getHost();
            if (!"webview".equalsIgnoreCase(host) && (host == null || !host.contains("webview"))) {
                if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                    if (this.afz == -1) {
                        kg(2);
                    } else {
                        kg(1);
                    }
                }
                this.qu = str;
                return this;
            }
            kg(0);
            String queryParameter = parse.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter) && (decode = Uri.decode(queryParameter)) != null) {
                int indexOf2 = decode.indexOf(Separators.QUESTION);
                str = indexOf2 != -1 ? decode.substring(0, indexOf2) : decode;
            }
            this.qu = str;
            return this;
        }
        kg(0);
        if (str != null && (indexOf = str.indexOf(Separators.QUESTION)) != -1) {
            str = str.substring(0, indexOf);
        }
        this.qu = str;
        return this;
    }

    public tw kg(int i) {
        this.afz = i;
        return this;
    }

    public tw fxn(float f) {
        this.cj = f;
        return this;
    }

    public JSONObject dx() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.cj);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.op);
            jSONObject2.put("height", this.zc);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("x", this.jch);
            jSONObject3.put("y", this.qx);
            jSONObject3.put("width", this.lu);
            jSONObject3.put("height", this.opx);
            jSONObject.put("webview", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("x", this.on);
            jSONObject4.put("y", this.jg);
            jSONObject4.put("width", this.gb);
            jSONObject4.put("height", this.iqs);
            jSONObject.put("visible", jSONObject4);
            return jSONObject;
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "getViewport error", th);
            return jSONObject;
        }
    }

    public void ums() {
        com.bytedance.sdk.openadsdk.dx.fxn fxnVar = this.gs;
        if (fxnVar != null) {
            fxnVar.kg();
        }
    }

    public void iwp() {
        com.bytedance.sdk.openadsdk.dx.fxn fxnVar = this.gs;
        if (fxnVar != null) {
            fxnVar.gff();
        }
    }

    public void jz() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.yws > 0) {
                jSONObject.put("playable_material_interactable_duration", System.currentTimeMillis() - this.yws);
            } else {
                jSONObject.put("playable_material_interactable_duration", 0L);
            }
            if (this.ils > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.ils;
                this.qhf = currentTimeMillis;
                jSONObject.put("playable_material_interactable_load_duration", currentTimeMillis);
            } else {
                jSONObject.put("playable_material_interactable_load_duration", 0L);
            }
            gff("PL_sdk_material_interactable", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void hm(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.fe = jSONObject.optString("section");
        }
    }

    public void bx() {
        this.xtn = 2;
    }

    public void uhw() {
        this.ln = true;
    }

    public void ke() {
        if (this.gs != null) {
            fxn fxnVar = fxn.FEED_AWEME;
        }
    }

    public void mve() {
        if (this.gs != null) {
            fxn fxnVar = fxn.FEED_AWEME;
        }
    }

    public void rb(JSONObject jSONObject) {
        this.vts = jSONObject;
        this.fqt++;
        ils();
        this.tw.removeCallbacks(this.dgx);
        if (this.jz) {
            this.swx = System.currentTimeMillis();
            this.qn = System.currentTimeMillis();
            this.gaw = 0L;
            int i = this.afz;
            if (i == 0) {
                WebView webView = this.bgy;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.dx.tw.10
                        @Override // android.webkit.ValueCallback
                        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
                        public void onReceiveValue(String str) {
                            tw.this.gaw = System.currentTimeMillis();
                        }
                    });
                }
            } else if (i == 1 || i == 2) {
                fxn("playable_stuck_check_ping", new JSONObject());
            }
            this.tw.postDelayed(this.dgx, this.zn);
        }
    }

    public void zn() {
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.yws > 0) {
                jSONObject.put("playable_material_first_frame_show_duration", System.currentTimeMillis() - this.yws);
            } else {
                jSONObject.put("playable_material_first_frame_show_duration", 0L);
            }
            if (this.ils > 0) {
                jSONObject.put("playable_material_first_frame_load_duration", System.currentTimeMillis() - this.ils);
            } else {
                jSONObject.put("playable_material_first_frame_load_duration", 0L);
            }
            gff("PL_sdk_material_first_frame_show", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void bh(JSONObject jSONObject) {
        kg(2, jSONObject != null ? jSONObject.optString("error_msg", "The material directly invokes the exception pocket mask on the client") : "The material directly invokes the exception pocket mask on the client");
    }

    public void ggo() {
        kg kgVar;
        this.gaw = System.currentTimeMillis();
        int i = this.afz;
        if ((i == 1 || i == 2) && (kgVar = this.ckl) != null) {
            kgVar.fxn(System.currentTimeMillis());
        }
    }

    public JSONObject sg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        if (optInt == 1) {
            return mvp();
        }
        if (optInt != 2) {
            return optInt != 3 ? jSONObject2 : zu();
        }
        return rlu();
    }

    public JSONObject tw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int optInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (optInt == 1) {
                jSONObject2.put("result", rb.kg(this.bfa, Permission.RECORD_AUDIO));
            } else {
                if (optInt == 2) {
                    jSONObject2.put("result", rb.kg(this.bfa, Permission.CAMERA));
                    return jSONObject2;
                }
                if (optInt == 3) {
                    jSONObject2.put("result", rb.fxn(this.bfa));
                    return jSONObject2;
                }
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    public void tw(String str) {
        this.rns = 1;
        JSONObject jSONObject = new JSONObject();
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.ils = currentTimeMillis;
            long j = this.rz;
            jSONObject.put("playable_page_show_duration", j != -1 ? currentTimeMillis - j : 0L);
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "reportUrlLoadStart error", th);
        }
        gff("PL_sdk_html_load_start", jSONObject);
        this.unf = true;
        this.bz = true;
        if (this.xga) {
            ax();
            this.unf = false;
            this.bz = false;
        }
        if (this.rmu) {
            try {
                StringBuffer stringBuffer = new StringBuffer();
                StringBuffer stringBuffer2 = new StringBuffer();
                StringBuffer stringBuffer3 = new StringBuffer();
                if (rb.fxn(this.bfa, rb.mvp)) {
                    stringBuffer.append("Microphone_");
                    stringBuffer2.append("1");
                    if (rb.kg(this.bfa, Permission.RECORD_AUDIO)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (rb.fxn(this.bfa, rb.dgx)) {
                    stringBuffer.append("Magetometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (rb.fxn(this.bfa, rb.hie)) {
                    stringBuffer.append("Accelerometer_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (rb.fxn(this.bfa, rb.jq)) {
                    stringBuffer.append("Gyro_");
                    stringBuffer2.append("1");
                    stringBuffer3.append("1");
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (rb.fxn(this.bfa, rb.tw)) {
                    stringBuffer.append("Camera_");
                    stringBuffer2.append("1");
                    if (rb.kg(this.bfa, Permission.CAMERA)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                if (rb.fxn(this.bfa, rb.f9545sg)) {
                    stringBuffer.append("Photo");
                    stringBuffer2.append("1");
                    if (rb.fxn(this.bfa)) {
                        stringBuffer3.append("1");
                    } else {
                        stringBuffer3.append("0");
                    }
                } else {
                    stringBuffer2.append("0");
                    stringBuffer3.append("0");
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_available_hardware_name", stringBuffer.toString());
                jSONObject2.put("playable_available_hardware_code", stringBuffer2.toString());
                jSONObject2.put("playable_available_hardware_auth_code", stringBuffer3.toString());
                gff("PL_sdk_hardware_detect", jSONObject2);
                this.rmu = false;
            } catch (Throwable th2) {
                sg.fxn("PlayablePlugin", "Hardware detect error", th2);
            }
        }
    }

    public void ax() {
        int i;
        int i2 = this.afz;
        if (i2 == 0 || i2 == 1 || i2 == 2) {
            if (this.unf) {
                this.tw.postDelayed(this.jq, this.ke * 1000);
            }
            if ((this.bz && mvp(this.qu)) || (i = this.afz) == 1 || i == 2) {
                this.tw.postDelayed(this.hie, this.mve * 1000);
            }
        }
    }

    public void jq(String str) {
        WebView webView;
        boolean z = this.rns == -1;
        this.rns = 2;
        if (!z) {
            this.fqm = str;
            JSONObject jSONObject = new JSONObject();
            try {
                long currentTimeMillis = System.currentTimeMillis();
                this.ij = currentTimeMillis;
                long j = this.ils;
                jSONObject.put("playable_html_load_start_duration", j != -1 ? currentTimeMillis - j : 0L);
                jSONObject.put("playable_has_show", swx());
            } catch (Throwable th) {
                sg.fxn("PlayablePlugin", "reportUrlLoadFinish error", th);
            }
            gff("PL_sdk_html_load_finish", jSONObject);
        }
        this.unf = false;
        this.tw.removeCallbacks(this.jq);
        try {
            if (this.afz == 0) {
                if (this.xdg && (webView = this.bgy) != null) {
                    this.xdg = false;
                    webView.evaluateJavascript(qhf(), new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.dx.tw.11
                        @Override // android.webkit.ValueCallback
                        public /* bridge */ /* synthetic */ void onReceiveValue(String str2) {
                        }
                    });
                }
                rz();
            }
        } catch (Throwable th2) {
            sg.fxn("PlayablePlugin", "crashMonitor error", th2);
        }
    }

    public void ci() {
        this.bz = false;
        this.tw.removeCallbacks(this.hie);
        try {
            JSONObject jSONObject = new JSONObject();
            if (this.ils > 0) {
                jSONObject.put("playable_jssdk_load_success_duration", System.currentTimeMillis() - this.ils);
            } else {
                jSONObject.put("playable_jssdk_load_success_duration", 0L);
            }
            gff("PL_sdk_jssdk_load_success", jSONObject);
        } catch (JSONException unused) {
        }
    }

    public void jq(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean optBoolean = jSONObject.optBoolean("success", true);
            if (optBoolean) {
                this.rns = 3;
                rz();
            } else {
                this.rns = -2;
            }
            if (optBoolean || !this.iwp) {
                return;
            }
            this.iwp = false;
            this.unf = false;
            this.bz = false;
            this.tw.removeCallbacks(this.jq);
            this.tw.removeCallbacks(this.hie);
            fxn(4, "CaseRenderFail");
        }
    }

    private void gff(int i, String str) {
        com.bytedance.sdk.openadsdk.dx.fxn fxnVar = this.gs;
        if (fxnVar != null) {
            fxnVar.fxn(i, str);
        }
    }

    protected void fxn(int i, String str) {
        ils();
        gff(i, str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "reportRenderFatal error", th);
        }
        gff("PL_sdk_global_faild", jSONObject);
    }

    public void kg(int i, String str) {
        this.xtn = i;
        if (this.vts == null) {
            this.vts = new JSONObject();
        }
        try {
            this.vts.put("playable_stuck_type", i);
            this.vts.put("playable_stuck_reason", str);
            if (this.swx > 0) {
                this.vts.put("playable_stuck_duration", System.currentTimeMillis() - this.swx);
            } else {
                this.vts.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        gff("PL_sdk_page_stuck", this.vts);
        ils();
        if (this.gs == null || i != 2) {
            return;
        }
        this.vts = new JSONObject();
    }

    protected void kg(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        rb(str, jSONObject);
    }

    private String gff(String str, String str2) {
        String queryParameter;
        String queryParameter2;
        if (TextUtils.isEmpty(this.hx) && !TextUtils.isEmpty(this.bmc)) {
            Uri parse = Uri.parse(this.bmc);
            String host = parse.getHost();
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter = parse.getQueryParameter("surl");
                queryParameter2 = parse.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
                queryParameter2 = "";
            }
            Uri.Builder appendQueryParameter = new Uri.Builder().scheme(parse.getScheme()).authority(host).appendQueryParameter("surl", queryParameter);
            if (!TextUtils.isEmpty(queryParameter2)) {
                appendQueryParameter.appendQueryParameter("playable_hash", queryParameter2);
            }
            this.hx = appendQueryParameter.toString();
        }
        return this.hx;
    }

    private String hm(String str, String str2) {
        String format = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.qu = format;
        return format;
    }

    private void ei() {
        String str;
        if (this.an == null || (str = this.qu) == null || str.contains("/cid_")) {
            return;
        }
        String optString = this.an.optString("cid");
        if (TextUtils.isEmpty(optString)) {
            return;
        }
        String host = Uri.parse(this.qu).getHost();
        if (TextUtils.isEmpty(host)) {
            this.qu += "/cid_" + optString;
        } else {
            this.qu = this.qu.replace(host, host + "/cid_" + optString);
        }
    }

    private void rb(String str, JSONObject jSONObject) {
        try {
            int i = this.afz;
            if (i == 0) {
                if (this.ncz != fxn.LAND_PAGE && !mvp(this.qu)) {
                    ei();
                }
                jSONObject.put("playable_url", this.qu);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", gff(this.um, this.ta));
                    }
                }
                jSONObject.put("playable_url", hm(this.ctw, this.rp));
            }
            jSONObject.put("playable_render_type", this.afz);
            if (this.gs != null) {
                if (this.afz == 0 && (this.ncz != fxn.LAND_PAGE || mvp(this.qu))) {
                    this.gs.fxn(jSONObject);
                } else if (this.afz != 0) {
                    this.gs.fxn(jSONObject);
                }
            }
        } catch (JSONException unused) {
        }
    }

    public void gff(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.np && this.deg > 0) {
                this.np = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.pfi ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.rhk);
            jSONObject.put("playable_session_id", this.dx);
            int i = this.afz;
            if (i == 0) {
                if (this.ncz != fxn.LAND_PAGE && !mvp(this.qu)) {
                    ei();
                }
                jSONObject.put("playable_url", this.qu);
            } else {
                if (i != 3 && i != 4) {
                    if (i == 1 || i == 2) {
                        jSONObject.put("playable_url", gff(this.um, this.ta));
                    }
                }
                jSONObject.put("playable_url", hm(this.ctw, this.rp));
            }
            jSONObject.put("playable_full_url", this.bmc);
            jSONObject.put("playable_replay_count", this.pjf);
            jSONObject.put("playable_is_prerender", this.ul);
            jSONObject.put("playable_is_preload", this.np);
            jSONObject.put("playable_render_type", this.afz);
            jSONObject.put("playable_scenes_type", this.ncz.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.um) ? "" : this.um);
            if (!TextUtils.isEmpty(this.ta)) {
                str2 = this.ta;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.ctw);
            jSONObject.put("playable_minigamelite_schema", this.rp);
            jSONObject.put("playable_is_debug", this.pek);
            jSONObject.put("playable_retry_count", this.fsb);
            jSONObject.put("playable_enter_from", this.kwc);
            jSONObject.put("playable_sequence", this.fqt);
            jSONObject.put("playable_current_section", this.fe);
            jSONObject.put("is_playable_finish", this.ln);
            jSONObject.put("playable_card_session", this.wc);
            jSONObject.put("playable_video_session", this.zk);
            jSONObject.put("playable_network_type", xdg());
            jSONObject.put("playable_lynx_version", this.uhw);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.ums);
            jSONObject2.put(a.W, 4);
            jSONObject2.put(SpeechConstant.ISE_CATEGORY, "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.an.opt("cid"));
            jSONObject2.put("log_extra", this.an.opt("log_extra"));
            int i2 = this.afz;
            if (i2 != -1 && i2 != -2) {
                if (this.gs != null) {
                    List<JSONObject> list = this.gq;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.gq.iterator();
                        while (it.hasNext()) {
                            JSONObject optJSONObject = it.next().optJSONObject("adExtraData");
                            if (optJSONObject != null) {
                                optJSONObject.put("playable_render_type", this.afz);
                                optJSONObject.put("playable_url", this.qu);
                            }
                            this.gs.fxn(optJSONObject);
                        }
                        this.gq.clear();
                    }
                    if (this.afz == 0 && (this.ncz != fxn.LAND_PAGE || mvp(this.qu))) {
                        this.gs.fxn(jSONObject);
                        return;
                    } else {
                        if (this.afz != 0) {
                            this.gs.fxn(jSONObject);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.gq == null) {
                this.gq = new ArrayList();
            }
            this.gq.add(jSONObject2);
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "reportEvent error", th);
        }
    }

    public void hie(String str) {
        this.tw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.2
            @Override // java.lang.Runnable
            public void run() {
                tw.mvp(tw.this);
            }
        });
    }

    public void dgx(String str) {
        this.tw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.dx.tw.3
            @Override // java.lang.Runnable
            public void run() {
                tw.rlu(tw.this);
            }
        });
    }

    public void rz() {
        if (this.jz) {
            this.swx = System.currentTimeMillis();
            if (this.ncz == fxn.FEED_AWEME) {
                if (this.rhk && this.rns == 3) {
                    kg kgVar = this.ckl;
                    if (kgVar != null && kgVar.kg()) {
                        kee();
                        return;
                    } else {
                        if (this.ckl == null) {
                            this.ckl = new kg(this, this.zn);
                            kee();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.rhk && this.rns == 2) {
                kg kgVar2 = this.ckl;
                if (kgVar2 != null && kgVar2.kg()) {
                    kee();
                } else if (this.ckl == null) {
                    this.ckl = new kg(this, this.zn);
                    kee();
                }
            }
        }
    }

    private void kee() {
        Runnable runnable;
        Runnable runnable2;
        this.ckl.fxn(System.currentTimeMillis());
        Handler handler = this.mvp;
        if (handler != null) {
            int i = this.afz;
            if (i == 0 && (runnable2 = this.rlu) != null) {
                handler.post(runnable2);
            } else if ((i == 1 || i == 2) && (runnable = this.zu) != null) {
                handler.post(runnable);
            }
            this.ckl.fxn(500);
        }
    }

    public void ils() {
        try {
            kg kgVar = this.ckl;
            if (kgVar != null) {
                kgVar.fxn();
            }
            Handler handler = this.mvp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            new StringBuilder("The stuttering detection has been paused due to a crash.-- ").append(th);
        }
    }

    public void ij() {
        this.ibh = 0;
        this.rrd = 0;
        this.cj = 0.0f;
        this.op = 0;
        this.zc = 0;
        this.qx = 0;
        this.jch = 0;
        this.lu = 0;
        this.opx = 0;
        this.jg = 0;
        this.on = 0;
        this.gb = 0;
        this.iqs = 0;
    }

    public void yws() {
        if (this.asy) {
            return;
        }
        this.asy = true;
        this.ax = 0L;
        this.rmu = true;
        ij();
        try {
            View view = this.ig.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.vd);
            }
        } catch (Throwable unused) {
        }
        try {
            this.mcr.kg();
        } catch (Throwable unused2) {
        }
        try {
            kg kgVar = this.ckl;
            if (kgVar != null) {
                kgVar.fxn();
                this.ckl = null;
            }
            Handler handler = this.mvp;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th) {
            new StringBuilder("crash -- ").append(th);
        }
        try {
            if (!TextUtils.isEmpty(this.qu)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.ps);
                jSONObject.put("playable_hit_times", this.deg);
                int i = this.ps;
                if (i > 0) {
                    jSONObject.put("playable_hit_ratio", this.deg / (i * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                gff("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.qu)) {
                if (this.ci != -1) {
                    this.ggo += System.currentTimeMillis() - this.ci;
                    this.ci = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.ggo);
                gff("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.unf = false;
        this.bz = false;
        this.tw.removeCallbacks(this.jq);
        this.tw.removeCallbacks(this.hie);
        this.tw.removeCallbacksAndMessages(null);
    }

    public void fxn(int i, String str, String str2) {
        this.rns = -1;
        this.fqm = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", swx());
        } catch (Throwable th) {
            sg.fxn("PlayablePlugin", "onWebReceivedError error", th);
        }
        gff("PL_sdk_html_load_error", jSONObject);
        if (this.iwp) {
            this.iwp = false;
            this.unf = false;
            this.bz = false;
            this.tw.removeCallbacks(this.jq);
            this.tw.removeCallbacks(this.hie);
            fxn(1, "ContainerLoadFail");
        }
    }

    public int swx() {
        return (this.rz == -1 || !this.rhk) ? 1 : 2;
    }

    public void fxn(boolean z, String str, int i) {
        if (z) {
            this.rns = -1;
            this.fqm = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", swx());
            } catch (Throwable th) {
                sg.fxn("PlayablePlugin", "onWebReceivedHttpError error", th);
            }
            gff("PL_sdk_html_load_error", jSONObject);
            if (this.iwp) {
                this.iwp = false;
                this.unf = false;
                this.bz = false;
                this.tw.removeCallbacks(this.jq);
                this.tw.removeCallbacks(this.hie);
                fxn(1, "ContainerLoadFail");
            }
        }
    }

    public String qhf() {
        return "function playable_callJS(){return \"Android call the JS method is callJS\";}";
    }

    public int wc() {
        return this.yup;
    }

    public JSONObject hm(String str, JSONObject jSONObject) {
        System.currentTimeMillis();
        if (sg.fxn() && jSONObject != null) {
            jSONObject.toString();
        }
        JSONObject fxn2 = this.mcr.fxn(str, jSONObject);
        if (sg.fxn()) {
            System.currentTimeMillis();
            if (fxn2 != null) {
                fxn2.toString();
            }
        }
        return fxn2;
    }

    public tw rb(boolean z) {
        this.xga = z;
        return this;
    }

    public void bh(boolean z) {
        this.pfi = z;
    }

    public void sg(boolean z) {
        this.au = z;
    }

    public static tw fxn(Context context, WebView webView, gff gffVar, com.bytedance.sdk.openadsdk.dx.fxn fxnVar) {
        if (gffVar == null || fxnVar == null) {
            return null;
        }
        if (webView == null) {
            return new tw(context, 0, gffVar, fxnVar);
        }
        return new tw(context, webView, gffVar, fxnVar, fxn.LAND_PAGE);
    }
}
