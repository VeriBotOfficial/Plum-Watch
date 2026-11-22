package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.sdk.openadsdk.core.hm.sg;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class jq {
    public static rlu fxn = null;
    public static final Set<String> kg = new HashSet<String>() { // from class: com.bytedance.sdk.openadsdk.core.jq.1
        {
            add("8025677");
            add("5001121");
        }
    };
    private static boolean rlu = false;
    private String bh;
    private boolean ckl;
    private Integer dgx;
    private boolean gff;
    private Bitmap hie;
    private String hm;
    private volatile ConcurrentHashMap<String, sg.fxn> je;
    private int jq;
    private int mvp;
    private String rb;
    private com.bytedance.sdk.openadsdk.core.rlu.gff.gff rmu;

    /* renamed from: sg, reason: collision with root package name */
    private int f9480sg;
    private String tw;
    private String xdg;
    private String zu;

    public boolean ckl() {
        return true;
    }

    public static void fxn(rlu rluVar) {
        fxn = rluVar;
    }

    public boolean fxn() {
        return this.ckl;
    }

    public void fxn(boolean z) {
        this.ckl = z;
    }

    private jq() {
        this.gff = false;
        this.jq = 0;
        this.hie = null;
        this.dgx = null;
        this.mvp = -1;
        this.je = null;
    }

    public static jq kg() {
        return fxn.fxn;
    }

    private static class fxn {
        private static final jq fxn = new jq();
    }

    public boolean gff() {
        return com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_file", "sdk_activate_init", true);
    }

    public void kg(boolean z) {
        com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_file", "sdk_activate_init", Boolean.valueOf(z));
    }

    public String hm() {
        if (TextUtils.isEmpty(this.hm)) {
            String fxn2 = fxn("app_id", Long.MAX_VALUE);
            if (!TextUtils.isEmpty(fxn2)) {
                this.hm = fxn2;
            }
        }
        return this.hm;
    }

    public static void fxn(int i) {
        if (i >= 0) {
            fxn("domain_index", String.valueOf(i));
        }
    }

    public static int rb() {
        try {
            String fxn2 = fxn("domain_index", Long.MAX_VALUE);
            if (TextUtils.isEmpty(fxn2)) {
                return 0;
            }
            return Integer.valueOf(fxn2).intValue();
        } catch (Throwable th) {
            new Object[]{"getDomainIndex", th.getMessage()};
            return 0;
        }
    }

    public static void kg(int i) {
        if (i >= 0) {
            fxn("config_fail_times", String.valueOf(i));
        }
    }

    public static int bh() {
        try {
            String fxn2 = fxn("config_fail_times", Long.MAX_VALUE);
            if (TextUtils.isEmpty(fxn2)) {
                return 0;
            }
            return Integer.valueOf(fxn2).intValue();
        } catch (Throwable th) {
            new Object[]{"getConfigFailTimes", th.getMessage()};
            return 0;
        }
    }

    public void fxn(String str) {
        hie(str);
        this.hm = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fxn("app_id", str);
        com.bytedance.sdk.openadsdk.core.settings.rlu.jt().hm(7);
    }

    public String sg() {
        String str = this.rb;
        if (str != null) {
            return str;
        }
        String fxn2 = fxn("mediation_info", Long.MAX_VALUE);
        this.rb = fxn2;
        if (fxn2 == null) {
            this.rb = "";
        }
        return this.rb;
    }

    public void kg(String str) {
        this.rb = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        fxn("mediation_info", str);
    }

    public String tw() {
        if (TextUtils.isEmpty(this.bh)) {
            this.bh = fxn(rmu.fxn());
        }
        return this.bh;
    }

    private String fxn(Context context) {
        try {
            PackageManager packageManager = context.getApplicationContext().getPackageManager();
            return (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 128));
        } catch (Throwable unused) {
            return "";
        }
    }

    public void gff(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_icon_id", "icon_id", Integer.valueOf(i));
        }
        this.f9480sg = i;
    }

    public int jq() {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_icon_id", "icon_id", 0);
        }
        return this.f9480sg;
    }

    public int hie() {
        Integer num = this.dgx;
        if (num != null) {
            return num.intValue();
        }
        return com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_privacy", "tt_gdpr", -1);
    }

    public void hm(final int i) {
        if (i == 1) {
            i = 0;
        } else if (i == 0) {
            i = 1;
        }
        if (i == 0 || i == 1 || i == -1) {
            final Integer num = this.dgx;
            if (num == null || num.intValue() != i) {
                this.dgx = Integer.valueOf(i);
                if (!com.bytedance.sdk.openadsdk.utils.yws.bh()) {
                    fxn(num, i);
                } else {
                    zu.kg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jq.2
                        @Override // java.lang.Runnable
                        public void run() {
                            jq.this.fxn(num, i);
                        }
                    });
                }
            }
        }
    }

    public void rb(int i) {
        this.mvp = i;
    }

    public int dgx() {
        return this.mvp;
    }

    public boolean mvp() {
        int i = this.mvp;
        return i < -1 || i > 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(Integer num, int i) {
        if (num != null) {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.rlu.jt().fxn(4, true);
        } else if (com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_privacy", "tt_gdpr", -1) != i) {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_privacy", "tt_gdpr", Integer.valueOf(i));
            com.bytedance.sdk.openadsdk.core.settings.rlu.jt().fxn(4, true);
        }
    }

    public String rlu() {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return com.bytedance.sdk.openadsdk.multipro.hm.hm.kg("sp_global_file", "extra_data", null);
        }
        return this.tw;
    }

    public void gff(final String str) {
        dgx(str);
        if (com.bytedance.sdk.openadsdk.utils.yws.bh()) {
            zu.kg().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jq.3
                @Override // java.lang.Runnable
                public void run() {
                    jq.this.jq(str);
                }
            });
        } else {
            jq(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jq(String str) {
        if (!TextUtils.isEmpty(this.tw)) {
            try {
                HashMap hashMap = new HashMap();
                JSONArray jSONArray = new JSONArray(this.tw);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String optString = optJSONObject.optString("name");
                        if (!TextUtils.isEmpty(optString)) {
                            hashMap.put(optString, optJSONObject);
                        }
                    }
                }
                JSONArray jSONArray2 = new JSONArray(str);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    JSONObject optJSONObject2 = jSONArray2.optJSONObject(i2);
                    if (optJSONObject2 != null) {
                        String optString2 = optJSONObject2.optString("name");
                        String optString3 = optJSONObject2.optString("value");
                        if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                            hashMap.put(optString2, optJSONObject2);
                        }
                    }
                }
                Collection values = hashMap.values();
                JSONArray jSONArray3 = new JSONArray();
                Iterator it = values.iterator();
                while (it.hasNext()) {
                    jSONArray3.put((JSONObject) it.next());
                }
                this.tw = jSONArray3.toString();
            } catch (Throwable th) {
                th.getMessage();
            }
        } else {
            this.tw = str;
        }
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_file", "extra_data", this.tw);
        }
    }

    public void bh(int i) {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_file", "title_bar_theme", Integer.valueOf(i));
        }
        this.jq = i;
    }

    private static void hie(String str) {
        rlu rluVar;
        if (TextUtils.isEmpty(str) && (rluVar = fxn) != null) {
            rluVar.fail(4000, "appid cannot be empty");
        }
        com.bytedance.sdk.component.utils.dx.gff("TTAD.GlobalInfo", "appid cannot be empty");
    }

    private static void dgx(String str) {
        if (TextUtils.isEmpty(str) || str.length() <= 1000) {
            return;
        }
        rlu rluVar = fxn;
        if (rluVar != null) {
            rluVar.fail(4000, "Data is very long, the longest is 1000");
        }
        com.bytedance.sdk.component.utils.dx.gff("TTAD.GlobalInfo", "Data is very long, the longest is 1000");
    }

    public com.bytedance.sdk.openadsdk.core.rlu.gff.gff zu() {
        if (this.rmu == null) {
            this.rmu = new com.bytedance.sdk.openadsdk.core.rlu.gff.gff(10, 8);
        }
        return this.rmu;
    }

    public Bitmap xdg() {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return com.bytedance.sdk.component.utils.hm.fxn(com.bytedance.sdk.openadsdk.multipro.hm.hm.kg("sp_global_file", "pause_icon", null));
        }
        return this.hie;
    }

    public boolean rmu() {
        return kg.contains(this.hm);
    }

    public boolean je() {
        return "5001121".contains(this.hm);
    }

    public boolean ud() {
        return "com.union_test.internationad".equals(com.bytedance.sdk.openadsdk.utils.qhf.bh());
    }

    public String dx() {
        if (!TextUtils.isEmpty(this.xdg)) {
            return this.xdg;
        }
        String fxn2 = com.bytedance.sdk.openadsdk.utils.mvp.fxn();
        this.xdg = fxn2;
        if (!TextUtils.isEmpty(fxn2)) {
            return this.xdg;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        com.bytedance.sdk.openadsdk.utils.mvp.fxn(valueOf);
        this.xdg = valueOf;
        return valueOf;
    }

    private static JSONObject mvp(String str) {
        String kg2 = com.bytedance.sdk.openadsdk.multipro.hm.hm.kg("sp_global_file", str, null);
        if (TextUtils.isEmpty(kg2)) {
            return null;
        }
        try {
            return new JSONObject(kg2);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.dx.gff("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public static void fxn(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("value", str2);
            jSONObject.put("time", System.currentTimeMillis());
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_file", str, jSONObject.toString());
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.dx.gff("TTAD.GlobalInfo", e.getMessage());
        }
    }

    public static String fxn(String str, long j) {
        JSONObject mvp;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            mvp = mvp(str);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.dx.gff("TTAD.GlobalInfo", e.getMessage());
        }
        if (mvp == null) {
            return null;
        }
        if (System.currentTimeMillis() - mvp.getLong("time") <= j) {
            return mvp.getString("value");
        }
        return null;
    }

    public static Pair<String, Long> hm(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject mvp = mvp(str);
            if (mvp == null) {
                return null;
            }
            return new Pair<>(mvp.getString("value"), Long.valueOf(mvp.getLong("time")));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.dx.gff("TTAD.GlobalInfo", e.getMessage());
            return null;
        }
    }

    public sg.fxn rb(String str) {
        try {
            if (this.je == null || str == null) {
                return null;
            }
            return this.je.get(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public void fxn(String str, sg.fxn fxnVar) {
        try {
            if (TextUtils.isEmpty(str) || fxnVar == null) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                com.bytedance.sdk.openadsdk.gff.hie.fxn(6, str, fxnVar);
                return;
            }
            if (this.je == null) {
                synchronized (jq.class) {
                    if (this.je == null) {
                        this.je = new ConcurrentHashMap<>();
                    }
                }
            }
            if (this.je != null) {
                this.je.put(str, fxnVar);
            }
        } catch (Throwable unused) {
        }
    }

    public void bh(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                com.bytedance.sdk.openadsdk.gff.hie.fxn(6, str);
            } else if (this.je != null) {
                this.je.remove(str);
            }
        } catch (Throwable unused) {
        }
    }

    public void ums() {
        try {
            if (this.je == null || this.je.size() != 0) {
                return;
            }
            this.je = null;
        } catch (Throwable th) {
            new Object[]{"removeClickCloseListenerObj()", th.getMessage()};
        }
    }

    public void gff(boolean z) {
        this.gff = z;
    }

    public static boolean iwp() {
        return rlu;
    }

    public static void jz() {
        if (Build.VERSION.SDK_INT == 26 && "MI 6".equals(Build.MODEL)) {
            rlu = true;
        }
    }

    public static boolean sg(String str) {
        return (TextUtils.isEmpty(str) || !com.bytedance.sdk.openadsdk.utils.ke.fxn || str.contains("sp_full_screen_video") || str.contains("sp_reward_video") || str.contains("tt_openad") || str.contains("pag_sp_bad_par")) ? false : true;
    }

    public void tw(String str) {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            com.bytedance.sdk.openadsdk.multipro.hm.hm.fxn("sp_global_file", "adx_id", str);
        }
        this.zu = str;
    }

    public String bx() {
        if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
            return com.bytedance.sdk.openadsdk.multipro.hm.hm.kg("sp_global_file", "adx_id", "");
        }
        return this.zu;
    }
}
