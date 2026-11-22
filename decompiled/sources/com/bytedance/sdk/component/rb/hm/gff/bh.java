package com.bytedance.sdk.component.rb.hm.gff;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.rb.dx;
import com.bytedance.sdk.component.rb.je;
import com.bytedance.sdk.component.rb.rlu;
import com.bytedance.sdk.component.rb.rmu;
import com.bytedance.sdk.component.rb.ums;
import java.io.File;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes13.dex */
public class bh {
    private com.bytedance.sdk.component.rb.hm bh;
    private volatile rmu gff;
    private volatile je hm;
    private Context jq;
    private final rlu kg;

    /* renamed from: sg, reason: collision with root package name */
    private ExecutorService f9388sg;
    private ExecutorService tw;
    private Map<String, List<gff>> fxn = new ConcurrentHashMap();
    private Map<String, com.bytedance.sdk.component.rb.gff> rb = new ConcurrentHashMap();

    public bh(Context context, rlu rluVar) {
        this.kg = (rlu) sg.fxn(rluVar);
        this.jq = context;
        com.bytedance.sdk.component.rb.hm.gff.fxn.kg.fxn(context, rluVar.tw());
    }

    public Context fxn() {
        return this.jq;
    }

    public je kg() {
        return this.hm;
    }

    public Collection<com.bytedance.sdk.component.rb.gff> gff() {
        return this.rb.values();
    }

    public rmu fxn(com.bytedance.sdk.component.rb.kg kgVar) {
        if (kgVar == null) {
            kgVar = com.bytedance.sdk.component.rb.hm.gff.fxn.kg.hie();
        }
        if (this.gff == null) {
            synchronized (com.bytedance.sdk.component.rb.hm.gff.fxn.kg.gff.class) {
                if (this.gff == null) {
                    this.gff = new com.bytedance.sdk.component.rb.hm.gff.fxn.kg.gff(new com.bytedance.sdk.component.rb.hm.gff.fxn.kg.fxn(kgVar.kg(), kgVar.gff()));
                }
            }
        }
        return this.gff;
    }

    public je kg(com.bytedance.sdk.component.rb.kg kgVar) {
        if (kgVar == null) {
            kgVar = com.bytedance.sdk.component.rb.hm.gff.fxn.kg.hie();
        }
        if (this.hm == null) {
            synchronized (com.bytedance.sdk.component.rb.hm.gff.fxn.kg.kg.class) {
                if (this.hm == null) {
                    this.hm = new com.bytedance.sdk.component.rb.hm.gff.fxn.kg.kg(kgVar.kg(), kgVar.hm());
                }
            }
        }
        return this.hm;
    }

    public com.bytedance.sdk.component.rb.gff gff(com.bytedance.sdk.component.rb.kg kgVar) {
        if (kgVar == null) {
            kgVar = com.bytedance.sdk.component.rb.hm.gff.fxn.kg.hie();
        }
        String file = kgVar.tw().toString();
        com.bytedance.sdk.component.rb.gff gffVar = this.rb.get(file);
        if (gffVar != null) {
            return gffVar;
        }
        com.bytedance.sdk.component.rb.gff hm = hm(kgVar);
        this.rb.put(file, hm);
        return hm;
    }

    public com.bytedance.sdk.component.rb.gff fxn(String str) {
        return gff(com.bytedance.sdk.component.rb.hm.gff.fxn.kg.fxn(new File(str)));
    }

    private com.bytedance.sdk.component.rb.gff hm(com.bytedance.sdk.component.rb.kg kgVar) {
        com.bytedance.sdk.component.rb.gff sg2 = this.kg.sg();
        return sg2 != null ? sg2 : new com.bytedance.sdk.component.rb.hm.gff.fxn.fxn.kg(kgVar.tw(), kgVar.fxn());
    }

    public com.bytedance.sdk.component.rb.hm hm() {
        if (this.bh == null) {
            this.bh = hie();
        }
        return this.bh;
    }

    private com.bytedance.sdk.component.rb.hm hie() {
        com.bytedance.sdk.component.rb.hm hm = this.kg.hm();
        return hm == null ? new com.bytedance.sdk.component.rb.kg.fxn() : hm;
    }

    public ExecutorService rb() {
        ExecutorService fxn;
        dx gff = this.kg.gff();
        if (gff != null && (fxn = gff.fxn()) != null) {
            return fxn;
        }
        if (this.f9388sg == null) {
            this.f9388sg = dgx();
        }
        return this.f9388sg;
    }

    public ums bh() {
        rlu rluVar = this.kg;
        if (rluVar != null) {
            return rluVar.jq();
        }
        return null;
    }

    public boolean sg() {
        rlu rluVar = this.kg;
        if (rluVar != null) {
            return rluVar.hie();
        }
        return false;
    }

    public ExecutorService tw() {
        ExecutorService kg;
        dx gff = this.kg.gff();
        if (gff != null && (kg = gff.kg()) != null) {
            return kg;
        }
        if (this.tw == null) {
            this.tw = com.bytedance.sdk.component.rb.hm.fxn.kg.fxn();
        }
        return this.tw;
    }

    private ExecutorService dgx() {
        ExecutorService kg = this.kg.kg();
        return kg != null ? kg : com.bytedance.sdk.component.rb.hm.fxn.kg.fxn();
    }

    public Map<String, List<gff>> jq() {
        return this.fxn;
    }

    public com.bytedance.sdk.component.rb.hm.gff.kg.kg fxn(gff gffVar) {
        ImageView.ScaleType hm = gffVar.hm();
        if (hm == null) {
            hm = com.bytedance.sdk.component.rb.hm.gff.kg.kg.fxn;
        }
        ImageView.ScaleType scaleType = hm;
        Bitmap.Config dgx = gffVar.dgx();
        if (dgx == null) {
            dgx = com.bytedance.sdk.component.rb.hm.gff.kg.kg.kg;
        }
        return new com.bytedance.sdk.component.rb.hm.gff.kg.kg(gffVar.kg(), gffVar.gff(), scaleType, dgx, gffVar.bh(), gffVar.sg());
    }
}
