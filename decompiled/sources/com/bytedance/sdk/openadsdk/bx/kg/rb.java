package com.bytedance.sdk.openadsdk.bx.kg;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.ggo;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.utils.qhf;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class rb {
    private static final Map<Integer, kg> fxn = new ConcurrentHashMap();

    public static void fxn(View view, jz jzVar, fxn fxnVar) {
        if (view == null || jzVar == null || jzVar.yd()) {
            return;
        }
        boolean gff = gff(jzVar);
        if (ggo.kg(jzVar) && fxnVar != null) {
            fxnVar.fxn = -1;
        }
        fxn(fxn(view, jzVar, gff, fxnVar));
    }

    private static boolean gff(jz jzVar) {
        if (jzVar == null) {
            return false;
        }
        String fxn2 = qhf.fxn(jzVar);
        return ((!"open_ad".equals(fxn2) && !"fullscreen_interstitial_ad".equals(fxn2) && !"rewarded_video".equals(fxn2)) || ggo.kg(jzVar) || jzVar.fe() == 5 || jzVar.fe() == 33 || !jz.rb(jzVar) || jzVar.zc() == null) ? false : true;
    }

    private static kg fxn(View view, jz jzVar, boolean z, fxn fxnVar) {
        if (view == null || jzVar == null || jzVar.gq() == null) {
            return null;
        }
        Integer kg = kg(jzVar);
        Map<Integer, kg> map = fxn;
        if (map.containsKey(kg)) {
            kg kgVar = map.get(kg);
            if (kgVar != null) {
                kgVar.fxn(view);
            }
            return kgVar;
        }
        kg fxn2 = kg.fxn(z, kg, view, jzVar, fxnVar);
        map.put(kg, fxn2);
        return fxn2;
    }

    private static void fxn(kg kgVar) {
        if (kgVar == null) {
            return;
        }
        kgVar.fxn();
    }

    public static void fxn(jz jzVar, int i) {
        if (jzVar == null || jzVar.gq() == null) {
            return;
        }
        fxn(fxn.get(kg(jzVar)), i);
    }

    public static void fxn(kg kgVar, int i) {
        if (kgVar == null) {
            return;
        }
        kgVar.fxn(i);
    }

    public static void fxn(jz jzVar) {
        if (jzVar == null || jzVar.gq() == null) {
            return;
        }
        Integer kg = kg(jzVar);
        Map<Integer, kg> map = fxn;
        kg kgVar = map.get(kg);
        if (kgVar != null) {
            kgVar.hie();
        }
        kg(kg);
        if (map.size() <= 0) {
            sg.fxn();
        }
    }

    public static kg fxn(Integer num) {
        return fxn.get(num);
    }

    public static void kg(Integer num) {
        fxn.remove(num);
    }

    public static Integer kg(jz jzVar) {
        return Integer.valueOf((jzVar.etc() + jzVar.gq()).hashCode());
    }

    public static class fxn {
        public int fxn;
        public int kg = -1;

        public fxn(int i) {
            this.fxn = i;
        }
    }
}
