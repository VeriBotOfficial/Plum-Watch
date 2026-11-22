package com.bytedance.sdk.openadsdk.core.mvp;

import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.mvp.gff.fxn;
import com.bytedance.sdk.openadsdk.core.mvp.kg.gff;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff {
    protected List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> bh;
    protected int fxn;
    protected fxn.EnumC0518fxn gff;
    private String hie;
    protected fxn.kg hm;
    protected int kg;
    private jz mvp;
    protected String rb;

    /* renamed from: sg, reason: collision with root package name */
    protected List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> f9515sg;
    protected String tw;
    private final AtomicBoolean dgx = new AtomicBoolean(false);
    protected String jq = "endcard_click";

    public gff(int i, int i2, fxn.EnumC0518fxn enumC0518fxn, fxn.kg kgVar, String str, List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list, List<com.bytedance.sdk.openadsdk.core.mvp.kg.gff> list2, String str2) {
        this.bh = new ArrayList();
        this.f9515sg = new ArrayList();
        this.fxn = i;
        this.kg = i2;
        this.gff = enumC0518fxn;
        this.hm = kgVar;
        this.rb = str;
        this.bh = list;
        this.f9515sg = list2;
        this.tw = str2;
    }

    public int kg() {
        return this.fxn;
    }

    public int gff() {
        return this.kg;
    }

    public void fxn(long j) {
        com.bytedance.sdk.openadsdk.core.mvp.kg.gff.fxn(null, this.bh, null, j, this.hie, new gff.kg(this.jq, this.mvp), null);
    }

    public void kg(long j) {
        if (this.dgx.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.mvp.kg.gff.kg((jz) null, this.f9515sg, (com.bytedance.sdk.openadsdk.core.mvp.fxn.fxn) null, j, this.hie, (String) null);
        }
    }

    public static float fxn(int i, int i2, int i3, int i4, fxn.kg kgVar, fxn.EnumC0518fxn enumC0518fxn) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return fxn(kgVar, enumC0518fxn) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.mvp.gff$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] iArr = new int[fxn.kg.values().length];
            fxn = iArr;
            try {
                iArr[fxn.kg.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[fxn.kg.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[fxn.kg.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static float fxn(fxn.kg kgVar, fxn.EnumC0518fxn enumC0518fxn) {
        int i = AnonymousClass1.fxn[kgVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (fxn.EnumC0518fxn.JAVASCRIPT.equals(enumC0518fxn)) {
            return 1.0f;
        }
        return fxn.EnumC0518fxn.IMAGE.equals(enumC0518fxn) ? 0.8f : 0.0f;
    }

    public String hm() {
        int i = AnonymousClass1.fxn[this.hm.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.rb;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.fxn + "\" height=\"" + this.kg + "\" src=\"" + this.rb + "\"></iframe>";
        }
        if (this.gff == fxn.EnumC0518fxn.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.rb + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (this.gff == fxn.EnumC0518fxn.JAVASCRIPT) {
            return "<script src=\"" + this.rb + "\"></script>";
        }
        return null;
    }

    public String rb() {
        if (this.hm == fxn.kg.STATIC_RESOURCE && this.gff == fxn.EnumC0518fxn.IMAGE) {
            return this.rb;
        }
        return null;
    }

    public String bh() {
        return this.rb;
    }

    public void fxn(String str) {
        this.hie = str;
    }

    public static gff kg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", fxn.EnumC0518fxn.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", fxn.kg.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new gff.fxn(optJSONArray.optString(i)).fxn());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new gff.fxn(optJSONArray2.optString(i2)).fxn());
        }
        return new gff(optInt, optInt2, fxn.EnumC0518fxn.valueOf(optString), fxn.kg.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    public JSONObject fxn() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.fxn);
        jSONObject.put("height", this.kg);
        jSONObject.put("creativeType", this.gff.toString());
        jSONObject.put("resourceType", this.hm.toString());
        jSONObject.put("contentUrl", this.rb);
        jSONObject.put("clickThroughUri", this.tw);
        jSONObject.put("clickTrackers", com.bytedance.sdk.openadsdk.core.mvp.kg.gff.fxn(this.bh));
        jSONObject.put("creativeViewTrackers", com.bytedance.sdk.openadsdk.core.mvp.kg.gff.fxn(this.f9515sg));
        return jSONObject;
    }

    public void fxn(jz jzVar) {
        this.mvp = jzVar;
    }
}
