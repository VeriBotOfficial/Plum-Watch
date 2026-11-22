package com.bytedance.sdk.component.rb.hm.gff;

import com.alipay.sdk.m.y.k;
import com.bytedance.sdk.component.rb.dgx;
import com.bytedance.sdk.component.rb.ud;
import com.bytedance.sdk.component.rb.xdg;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes13.dex */
public class fxn<T> {
    private gff fxn;
    private ud kg;

    public fxn(gff gffVar, ud udVar) {
        this.fxn = gffVar;
        this.kg = udVar;
    }

    public void fxn(dgx<T> dgxVar) {
        try {
            ud udVar = this.kg;
            if (udVar != null) {
                udVar.fxn("success", this.fxn);
            }
            String dx = this.fxn.dx();
            Map<String, List<gff>> jq = this.fxn.rmu().jq();
            List<gff> list = jq.get(dx);
            if (list == null) {
                xdg tw = this.fxn.tw();
                if (tw != null) {
                    new StringBuilder("not repeat request listener is ").append(tw);
                    this.fxn.hie();
                    tw.fxn(dgxVar);
                }
            } else {
                synchronized (list) {
                    list.size();
                    for (gff gffVar : list) {
                        xdg tw2 = gffVar.tw();
                        if (tw2 != null) {
                            new StringBuilder("repeat request listener is ").append(tw2).append(" key is ");
                            gffVar.hie();
                            tw2.fxn(dgxVar);
                        }
                    }
                    list.clear();
                    jq.remove(dx);
                }
            }
            ud udVar2 = this.kg;
            if (udVar2 != null) {
                udVar2.kg("success", this.fxn);
            }
        } catch (Throwable unused) {
        }
    }

    public void fxn(int i, String str, Throwable th) {
        try {
            ud udVar = this.kg;
            if (udVar != null) {
                udVar.fxn(k.j, this.fxn);
            }
            String dx = this.fxn.dx();
            Map<String, List<gff>> jq = this.fxn.rmu().jq();
            List<gff> list = jq.get(dx);
            if (list == null) {
                xdg tw = this.fxn.tw();
                if (tw != null) {
                    tw.fxn(i, str, th);
                }
            } else {
                synchronized (list) {
                    Iterator<gff> it = list.iterator();
                    while (it.hasNext()) {
                        xdg tw2 = it.next().tw();
                        if (tw2 != null) {
                            new StringBuilder("repeat request listener is ").append(tw2);
                            tw2.fxn(i, str, th);
                        }
                    }
                    list.clear();
                    jq.remove(dx);
                }
            }
            ud udVar2 = this.kg;
            if (udVar2 != null) {
                udVar2.kg(k.j, this.fxn);
            }
        } catch (Throwable unused) {
        }
    }
}
