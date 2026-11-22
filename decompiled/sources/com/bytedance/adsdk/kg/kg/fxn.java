package com.bytedance.adsdk.kg.kg;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bytedance.adsdk.kg.gff;
import com.bytedance.adsdk.kg.gff.sg;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class fxn {
    private final AssetManager hm;
    private gff rb;
    private final sg<String> fxn = new sg<>();
    private final Map<sg<String>, Typeface> kg = new HashMap();
    private final Map<String, Typeface> gff = new HashMap();
    private String bh = ".ttf";

    public fxn(Drawable.Callback callback, gff gffVar) {
        this.rb = gffVar;
        if (!(callback instanceof View)) {
            this.hm = null;
        } else {
            this.hm = ((View) callback).getContext().getAssets();
        }
    }

    public void fxn(gff gffVar) {
        this.rb = gffVar;
    }

    public void fxn(String str) {
        this.bh = str;
    }

    public Typeface fxn(com.bytedance.adsdk.kg.gff.gff gffVar) {
        this.fxn.fxn(gffVar.fxn(), gffVar.gff());
        Typeface typeface = this.kg.get(this.fxn);
        if (typeface != null) {
            return typeface;
        }
        Typeface fxn = fxn(kg(gffVar), gffVar.gff());
        this.kg.put(this.fxn, fxn);
        return fxn;
    }

    private Typeface kg(com.bytedance.adsdk.kg.gff.gff gffVar) {
        Typeface typeface;
        String fxn = gffVar.fxn();
        Typeface typeface2 = this.gff.get(fxn);
        if (typeface2 != null) {
            return typeface2;
        }
        String gff = gffVar.gff();
        String kg = gffVar.kg();
        gff gffVar2 = this.rb;
        if (gffVar2 != null) {
            typeface = gffVar2.fxn(fxn, gff, kg);
            if (typeface == null) {
                typeface = this.rb.fxn(fxn);
            }
        } else {
            typeface = null;
        }
        gff gffVar3 = this.rb;
        if (gffVar3 != null && typeface == null) {
            String kg2 = gffVar3.kg(fxn, gff, kg);
            if (kg2 == null) {
                kg2 = this.rb.kg(fxn);
            }
            if (kg2 != null) {
                try {
                    typeface = Typeface.createFromAsset(this.hm, kg2);
                } catch (Throwable unused) {
                    typeface = Typeface.DEFAULT;
                }
            }
        }
        if (gffVar.hm() != null) {
            return gffVar.hm();
        }
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(this.hm, "fonts/" + fxn + this.bh);
            } catch (Throwable unused2) {
                typeface = Typeface.DEFAULT;
            }
        }
        this.gff.put(fxn, typeface);
        return typeface;
    }

    private Typeface fxn(Typeface typeface, String str) {
        boolean contains = str.contains("Italic");
        boolean contains2 = str.contains("Bold");
        int i = (contains && contains2) ? 3 : contains ? 2 : contains2 ? 1 : 0;
        return typeface.getStyle() == i ? typeface : Typeface.create(typeface, i);
    }
}
