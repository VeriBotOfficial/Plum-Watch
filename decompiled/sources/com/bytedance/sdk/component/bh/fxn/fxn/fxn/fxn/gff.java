package com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.bh.fxn.tw;
import com.bytedance.sdk.component.utils.dx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes13.dex */
public abstract class gff {
    private static int gff = 20;
    private final Context fxn;
    private boolean rb;
    private boolean tw;
    protected final List<com.bytedance.sdk.component.bh.fxn.hm.fxn> kg = new ArrayList();
    private final List<com.bytedance.sdk.component.bh.fxn.hm.fxn> hm = new ArrayList();
    private boolean bh = false;

    /* renamed from: sg, reason: collision with root package name */
    private volatile boolean f9352sg = false;
    private final Runnable jq = new Runnable() { // from class: com.bytedance.sdk.component.bh.fxn.fxn.fxn.fxn.gff.1
        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            synchronized (gff.this) {
                gff.this.f9352sg = false;
                if (gff.this.kg.isEmpty()) {
                    gff.this.bh = false;
                    return;
                }
                if (gff.this.rb) {
                    Iterator<com.bytedance.sdk.component.bh.fxn.hm.fxn> it = gff.this.kg.iterator();
                    while (it.hasNext()) {
                        gff.this.hm.add(it.next());
                    }
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(gff.this.kg);
                }
                gff.this.kg.clear();
                gff.this.bh = false;
                if (arrayList != null) {
                    gff.this.hm(arrayList);
                    return;
                }
                gff gffVar = gff.this;
                gffVar.hm(gffVar.hm);
                gff.this.hm.clear();
            }
        }
    };

    protected long bh() {
        return 10000L;
    }

    public abstract String kg();

    public gff(Context context) {
        this.tw = true;
        this.fxn = context;
        try {
            com.bytedance.sdk.component.bh.fxn.rb xdg = tw.sg().xdg();
            if (xdg != null) {
                this.tw = xdg.xdg();
                this.rb = xdg.rmu();
                gff = xdg.je();
            }
            dx.fxn("DBInsertMemRepo", "enableOpt:" + this.tw + ",BATCH_SIZE:" + gff, Boolean.valueOf(this.rb));
        } catch (Throwable unused) {
        }
    }

    private void fxn() {
        if (!this.bh) {
            com.bytedance.sdk.component.bh.fxn.sg.fxn.fxn().postDelayed(this.jq, this.rb ? bh() : com.bytedance.sdk.component.bh.fxn.sg.fxn.kg());
            this.bh = true;
        }
        if (this.tw && this.kg.size() >= gff && !this.f9352sg) {
            com.bytedance.sdk.component.bh.fxn.sg.fxn.fxn().removeCallbacks(this.jq);
            com.bytedance.sdk.component.bh.fxn.sg.fxn.fxn().post(this.jq);
            this.bh = true;
            this.f9352sg = true;
        }
    }

    protected synchronized void gff(List<String> list) {
        if (list != null) {
            if (!list.isEmpty()) {
                try {
                    Iterator<com.bytedance.sdk.component.bh.fxn.hm.fxn> it = this.kg.iterator();
                    while (it.hasNext()) {
                        com.bytedance.sdk.component.bh.fxn.hm.fxn next = it.next();
                        if (next != null) {
                            String gff2 = next.gff();
                            if (!TextUtils.isEmpty(gff2) && list.contains(gff2)) {
                                it.remove();
                            }
                        }
                    }
                } catch (Throwable th) {
                    new StringBuilder().append(kg()).append("deleteMemList: ");
                    th.getMessage();
                }
            }
        }
    }

    public synchronized void fxn(com.bytedance.sdk.component.bh.fxn.hm.fxn fxnVar) {
        if (fxnVar.sg() != null && !TextUtils.isEmpty(fxnVar.gff())) {
            this.kg.add(fxnVar);
            fxn();
        }
    }

    public Context rb() {
        return this.fxn;
    }

    public void hm(List<com.bytedance.sdk.component.bh.fxn.hm.fxn> list) {
        com.bytedance.sdk.component.bh.fxn.fxn.fxn.gff.fxn(rb(), kg(), list);
    }
}
