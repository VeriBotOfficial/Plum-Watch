package com.bytedance.sdk.openadsdk.xdg;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.dx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn implements Comparable<fxn> {
    private int gff;
    private final String kg;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private int f9578sg;
    private long zu;
    private final ArrayList<Long> fxn = new ArrayList<>();
    private final ArrayList<Long> hm = new ArrayList<>();
    private final ArrayList<Long> bh = new ArrayList<>();
    private final ArrayList<Long> tw = new ArrayList<>();
    private final HashMap<String, kg> jq = new HashMap<>();
    private int hie = 0;
    private int dgx = 0;
    private final HashMap<String, kg> mvp = new HashMap<>();
    private int rlu = 0;
    private final ArrayList<String> ckl = new ArrayList<>();

    public fxn(String str) {
        this.kg = str;
    }

    public void fxn(String str, String str2) {
        kg kgVar;
        kg kgVar2;
        kg kgVar3;
        kg kgVar4;
        kg kgVar5;
        kg kgVar6;
        str.hashCode();
        switch (str) {
            case "landingContinue":
                if (!TextUtils.isEmpty(str2) && (kgVar = this.mvp.get(str2)) != null) {
                    kgVar.hm(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingPause":
                if (!TextUtils.isEmpty(str2) && (kgVar2 = this.mvp.get(str2)) != null) {
                    kgVar2.gff(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingStart":
                if (!TextUtils.isEmpty(str2) && this.mvp.get(str2) == null) {
                    kg kgVar7 = new kg();
                    this.mvp.put(str2, kgVar7);
                    kgVar7.fxn(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_over":
            case "feed_break":
            case "videoForceBreak":
            case "play_error":
                if (!TextUtils.isEmpty(str2) && (kgVar3 = this.jq.get(str2)) != null && kgVar3.fxn() != kg.rb) {
                    kgVar3.kg(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().ckl()) {
                        this.hie = (int) (this.hie + kgVar3.fxn(this.zu, SystemClock.elapsedRealtime()));
                        break;
                    }
                }
                break;
            case "feed_play":
                this.bh.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().tw()) {
                    this.f9578sg++;
                }
                if (!TextUtils.isEmpty(str2) && this.jq.get(str2) == null) {
                    kg kgVar8 = new kg();
                    this.jq.put(str2, kgVar8);
                    kgVar8.fxn(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "show":
                this.fxn.add(Long.valueOf(SystemClock.elapsedRealtime()));
                if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().bh()) {
                    this.gff++;
                    break;
                }
                break;
            case "click":
                if (!this.ckl.contains(str2)) {
                    if (this.ckl.size() > 50) {
                        this.ckl.subList(0, 25).clear();
                    }
                    this.ckl.add(str2);
                    this.hm.add(Long.valueOf(SystemClock.elapsedRealtime()));
                    if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().sg()) {
                        this.rb++;
                        break;
                    }
                }
                break;
            case "feed_continue":
                if (!TextUtils.isEmpty(str2) && (kgVar4 = this.jq.get(str2)) != null) {
                    kgVar4.hm(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "feed_pause":
                if (!TextUtils.isEmpty(str2) && (kgVar5 = this.jq.get(str2)) != null) {
                    kgVar5.gff(SystemClock.elapsedRealtime());
                    break;
                }
                break;
            case "landingFinish":
                if (!TextUtils.isEmpty(str2) && (kgVar6 = this.mvp.get(str2)) != null && kgVar6.fxn() != kg.rb) {
                    kgVar6.kg(SystemClock.elapsedRealtime());
                    if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().zu()) {
                        this.rlu = (int) (this.rlu + kgVar6.fxn(this.zu, SystemClock.elapsedRealtime()));
                        break;
                    }
                }
                break;
            case "videoPercent30":
                if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().rmu()) {
                    this.dgx++;
                    break;
                }
                break;
            case "dislike":
                this.tw.add(Long.valueOf(SystemClock.elapsedRealtime()));
                break;
        }
    }

    public JSONObject fxn(JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            fxn(jSONObject2, jSONObject);
            kg(jSONObject2, jSONObject);
            return jSONObject2;
        } catch (Throwable th) {
            dx.gff(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }

    private void fxn(String str, JSONObject jSONObject, ArrayList<Long> arrayList, int[] iArr, long j, JSONObject jSONObject2) throws JSONException {
        int size = arrayList.size() - 1;
        int i = 0;
        for (int i2 : iArr) {
            long j2 = j - (i2 * 60000);
            while (size >= 0 && arrayList.get(size).longValue() >= j2) {
                i++;
                size--;
            }
            if (i != 0) {
                jSONObject.put(str + i2, i);
                int optInt = jSONObject2.optInt(str + i2) + i;
                if (optInt != 0) {
                    jSONObject2.put(str + i2, optInt);
                }
            }
        }
        while (size >= 0) {
            arrayList.remove(0);
            size--;
        }
    }

    private void fxn(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        fxn("show_c_", jSONObject, this.fxn, com.bytedance.sdk.openadsdk.bh.fxn.fxn().jq(), elapsedRealtime, jSONObject2);
        fxn("click_c_", jSONObject, this.hm, com.bytedance.sdk.openadsdk.bh.fxn.fxn().hie(), elapsedRealtime, jSONObject2);
        fxn("v_play_c_", jSONObject, this.bh, com.bytedance.sdk.openadsdk.bh.fxn.fxn().dgx(), elapsedRealtime, jSONObject2);
        fxn("dislike_c_", jSONObject, this.tw, com.bytedance.sdk.openadsdk.bh.fxn.fxn().xdg(), elapsedRealtime, jSONObject2);
        if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().bh() && (i3 = this.gff) != 0) {
            jSONObject.put("show_c_s", i3);
            int optInt = jSONObject2.optInt("show_c_s") + this.gff;
            if (optInt != 0) {
                jSONObject2.put("show_c_s", optInt);
            }
        }
        if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().sg() && (i2 = this.rb) != 0) {
            jSONObject.put("click_c_s", i2);
            int optInt2 = jSONObject2.optInt("click_c_s") + this.rb;
            if (optInt2 != 0) {
                jSONObject2.put("click_c_s", optInt2);
            }
        }
        if (!com.bytedance.sdk.openadsdk.bh.fxn.fxn().tw() || (i = this.f9578sg) == 0) {
            return;
        }
        jSONObject.put("v_play_c_s", i);
        int optInt3 = jSONObject2.optInt("v_play_c_s") + this.f9578sg;
        if (optInt3 != 0) {
            jSONObject2.put("v_play_c_s", optInt3);
        }
    }

    private void kg(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        int i;
        int i2;
        int i3;
        int[] iArr;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        int[] mvp = com.bytedance.sdk.openadsdk.bh.fxn.fxn().mvp();
        if (mvp != null) {
            int i4 = 0;
            while (i4 < mvp.length) {
                int i5 = mvp[i4];
                long j = 60000;
                long j2 = elapsedRealtime - (i5 * 60000);
                Iterator<String> it = this.mvp.keySet().iterator();
                long j3 = 0;
                while (it.hasNext()) {
                    long j4 = j;
                    String next = it.next();
                    Iterator<String> it2 = it;
                    kg kgVar = this.mvp.get(next);
                    if (kgVar != null) {
                        long fxn = kgVar.fxn(j2, elapsedRealtime);
                        j3 += fxn;
                        if (fxn <= 0 && i4 == mvp.length - 1) {
                            hashSet.add(next);
                        }
                    }
                    it = it2;
                    j = j4;
                }
                if (j3 != 0) {
                    jSONObject.put("lp_stay_t_".concat(String.valueOf(i5)), j3);
                    iArr = mvp;
                    long optInt = jSONObject2.optInt("lp_stay_t_".concat(String.valueOf(i5))) + j3;
                    if (optInt != 0) {
                        jSONObject2.put("lp_stay_t_".concat(String.valueOf(i5)), optInt);
                    }
                } else {
                    iArr = mvp;
                }
                i4++;
                mvp = iArr;
            }
        }
        int[] rlu = com.bytedance.sdk.openadsdk.bh.fxn.fxn().rlu();
        if (rlu != null) {
            int i6 = 0;
            while (i6 < rlu.length) {
                int i7 = rlu[i6];
                long j5 = elapsedRealtime - (i7 * 60000);
                long j6 = 0;
                int i8 = 0;
                for (String str : this.jq.keySet()) {
                    HashSet hashSet3 = hashSet;
                    int i9 = i7;
                    kg kgVar2 = this.jq.get(str);
                    if (kgVar2 != null) {
                        long fxn2 = kgVar2.fxn(j5, elapsedRealtime);
                        j6 += fxn2;
                        if (fxn2 > 20000) {
                            i8++;
                        }
                        if (fxn2 <= 0 && i6 == rlu.length - 1) {
                            hashSet2.add(str);
                        }
                    }
                    i7 = i9;
                    hashSet = hashSet3;
                }
                HashSet hashSet4 = hashSet;
                int i10 = i7;
                if (j6 != 0) {
                    jSONObject.put("v_stay_t_".concat(String.valueOf(i10)), j6);
                    long optInt2 = jSONObject2.optInt("v_stay_t_".concat(String.valueOf(i10))) + j6;
                    if (optInt2 != 0) {
                        jSONObject2.put("v_stay_t_".concat(String.valueOf(i10)), optInt2);
                    }
                }
                if (i8 != 0) {
                    jSONObject.put("v_20s_play_c_".concat(String.valueOf(i10)), i8);
                    int optInt3 = jSONObject2.optInt("v_20s_play_c_".concat(String.valueOf(i10))) + i8;
                    if (optInt3 != 0) {
                        jSONObject2.put("v_20s_play_c_".concat(String.valueOf(i10)), optInt3);
                    }
                }
                i6++;
                hashSet = hashSet4;
            }
        }
        HashSet hashSet5 = hashSet;
        if (!hashSet5.isEmpty()) {
            Iterator it3 = hashSet5.iterator();
            while (it3.hasNext()) {
                this.mvp.remove((String) it3.next());
            }
        }
        if (!hashSet2.isEmpty()) {
            Iterator it4 = hashSet2.iterator();
            while (it4.hasNext()) {
                this.jq.remove((String) it4.next());
            }
        }
        if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().ckl() && (i3 = this.hie) != 0) {
            jSONObject.put("v_stay_t_s", i3);
            int optInt4 = jSONObject2.optInt("v_stay_t_s") + this.hie;
            if (optInt4 != 0) {
                jSONObject2.put("v_stay_t_s", optInt4);
            }
        }
        if (com.bytedance.sdk.openadsdk.bh.fxn.fxn().zu() && (i2 = this.rlu) != 0) {
            jSONObject.put("lp_stay_t_s", i2);
            int optInt5 = jSONObject2.optInt("lp_stay_t_s") + this.rlu;
            if (optInt5 != 0) {
                jSONObject2.put("lp_stay_t_s", optInt5);
            }
        }
        if (!com.bytedance.sdk.openadsdk.bh.fxn.fxn().rmu() || (i = this.dgx) == 0) {
            return;
        }
        jSONObject.put("v_30p_play_c_s", i);
        int optInt6 = jSONObject2.optInt("v_30p_play_c_s") + this.dgx;
        if (optInt6 != 0) {
            jSONObject2.put("v_30p_play_c_s", optInt6);
        }
    }

    public void fxn() {
        this.zu = SystemClock.elapsedRealtime();
        this.dgx = 0;
        this.rb = 0;
        this.gff = 0;
        this.rlu = 0;
        this.hie = 0;
        this.f9578sg = 0;
    }

    public String kg() {
        return this.kg;
    }

    @Override // java.lang.Comparable
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public int compareTo(fxn fxnVar) {
        return fxnVar.gff - this.gff;
    }
}
