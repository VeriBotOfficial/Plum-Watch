package com.bytedance.sdk.component.bh.fxn.bh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.tw;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class gff implements kg {
    private final Context fxn;
    private final rb kg;

    public gff(Context context, rb rbVar) {
        this.fxn = context;
        this.kg = rbVar;
    }

    public Context fxn() {
        Context context = this.fxn;
        return context == null ? tw.sg().bh() : context;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.kg
    public void fxn(String str, List<String> list, boolean z, Map<String, String> map, int i, String str2) {
        com.bytedance.sdk.component.bh.fxn.rb xdg = tw.sg().xdg();
        if (xdg == null || tw.sg().bh() == null || xdg.hm() == null || !xdg.gff() || list == null || list.size() == 0) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            xdg.hm().execute(new fxn(new hm(UUID.randomUUID().toString() + "_" + System.currentTimeMillis(), it.next(), z, i, str2), str, map));
        }
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.kg
    public Runnable fxn(final hm hmVar, final String str, final Map<String, String> map) {
        if (hmVar == null || TextUtils.isEmpty(hmVar.fxn())) {
            return null;
        }
        return new Runnable() { // from class: com.bytedance.sdk.component.bh.fxn.bh.gff.1
            @Override // java.lang.Runnable
            public void run() {
                if (gff.this.kg.fxn(hmVar.fxn()) != null) {
                    new fxn(hmVar, str, map).run();
                }
            }
        };
    }

    @Override // com.bytedance.sdk.component.bh.fxn.bh.kg
    public void fxn(final String str, final boolean z) {
        com.bytedance.sdk.component.bh.fxn.rb xdg = tw.sg().xdg();
        if (xdg == null || tw.sg().bh() == null || !xdg.gff()) {
            return;
        }
        com.bytedance.sdk.component.bh.fxn.rb.rb rbVar = new com.bytedance.sdk.component.bh.fxn.rb.rb("trackFailedUrls") { // from class: com.bytedance.sdk.component.bh.fxn.bh.gff.2
            @Override // java.lang.Runnable
            public void run() {
                gff.this.fxn(gff.this.kg.fxn(), str, z);
            }
        };
        rbVar.fxn(1);
        if (xdg.hm() != null) {
            xdg.hm().execute(rbVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(List<hm> list, String str, boolean z) {
        String str2;
        if (list == null || list.size() == 0) {
            return;
        }
        com.bytedance.sdk.component.bh.fxn.rb xdg = tw.sg().xdg();
        for (hm hmVar : list) {
            if (xdg == null || xdg.hm() == null) {
                str2 = str;
            } else {
                hmVar.fxn(z);
                str2 = str;
                xdg.hm().execute(new fxn(hmVar, str2, null));
            }
            str = str2;
        }
    }

    private class fxn extends com.bytedance.sdk.component.bh.fxn.rb.rb {
        private final String gff;
        private final Map<String, String> hm;
        private final hm kg;

        private fxn(hm hmVar, String str, Map<String, String> map) {
            super("AdsStats");
            this.kg = hmVar;
            this.gff = str;
            this.hm = map;
        }

        private String gff(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            if (str.contains("{TS}") || str.contains("__TS__")) {
                long currentTimeMillis = System.currentTimeMillis();
                str = str.replace("{TS}", String.valueOf(currentTimeMillis)).replace("__TS__", String.valueOf(currentTimeMillis));
            }
            return ((str.contains("{UID}") || str.contains("__UID__")) && !TextUtils.isEmpty(this.gff)) ? str.replace("{UID}", this.gff).replace("__UID__", this.gff) : str;
        }

        boolean fxn(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.startsWith("http://") || str.startsWith("https://");
        }

        String kg(String str) {
            if (TextUtils.isEmpty(str)) {
                return str;
            }
            try {
                return str.replace("[ss_random]", String.valueOf(gff.gff().nextLong())).replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return str;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bytedance.sdk.component.bh.fxn.rb.hm hmVar;
            com.bytedance.sdk.component.bh.fxn.rb xdg = tw.sg().xdg();
            if (xdg == null || tw.sg().bh() == null || !xdg.gff() || !fxn(this.kg.kg())) {
                return;
            }
            if (this.kg.hm() >= xdg.gff(this.kg.bh())) {
                gff.this.kg.gff(this.kg);
                return;
            }
            try {
                xdg.rlu();
                if (this.kg.dgx()) {
                    gff.this.kg.fxn(this.kg);
                }
                if (xdg.fxn(gff.this.fxn())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    String kg = this.kg.kg();
                    if (xdg.bh() == 0) {
                        kg = gff(this.kg.kg());
                        if (this.kg.gff()) {
                            kg = kg(kg);
                        }
                    }
                    com.bytedance.sdk.component.bh.fxn.rb.gff hie = xdg.hie();
                    if (hie == null) {
                        return;
                    }
                    hie.fxn("User-Agent", xdg.jq());
                    hie.fxn("csj_client_source_from", "1");
                    if (this.hm != null) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, String> entry : this.hm.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        hie.fxn("csj_extra_info", jSONObject.toString());
                    }
                    hie.fxn(kg);
                    try {
                        hmVar = hie.fxn();
                        try {
                            xdg.fxn(hmVar.fxn());
                        } catch (Throwable unused) {
                        }
                    } catch (Throwable unused2) {
                        hmVar = null;
                    }
                    hm hmVar2 = this.kg;
                    hmVar2.fxn(hmVar2.hm() + 1);
                    if (hmVar != null && hmVar.fxn()) {
                        gff.this.kg.gff(this.kg);
                        this.kg.kg();
                        xdg.fxn(true, 200, System.currentTimeMillis() - currentTimeMillis, this.kg);
                        return;
                    }
                    if (hmVar != null) {
                        this.kg.kg(hmVar.kg());
                        this.kg.gff(hmVar.gff());
                    }
                    if (hmVar != null && hmVar.kg() == 8848) {
                        hmVar.gff();
                        gff.this.kg.gff(this.kg);
                    } else {
                        this.kg.kg();
                        if (this.kg.hm() >= xdg.gff(this.kg.bh())) {
                            gff.this.kg.gff(this.kg);
                            this.kg.kg();
                        } else {
                            gff.this.kg.kg(this.kg);
                        }
                    }
                    xdg.fxn(false, this.kg.tw(), System.currentTimeMillis() - currentTimeMillis, this.kg);
                }
            } catch (Throwable unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Random gff() {
        try {
            return SecureRandom.getInstanceStrong();
        } catch (Throwable unused) {
            return new SecureRandom();
        }
    }
}
