package com.bytedance.sdk.component.adexpress.fxn.kg;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.fxn.gff.fxn;
import com.bytedance.sdk.component.utils.ums;
import java.io.File;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes13.dex */
public class rb extends gff {
    private static File fxn;
    private static volatile rb kg;
    private AtomicBoolean gff = new AtomicBoolean(true);
    private AtomicBoolean hm = new AtomicBoolean(false);
    private boolean rb = false;
    private AtomicBoolean bh = new AtomicBoolean(false);

    /* renamed from: sg, reason: collision with root package name */
    private AtomicInteger f9341sg = new AtomicInteger(0);
    private AtomicLong tw = new AtomicLong();

    public static rb kg() {
        if (kg == null) {
            synchronized (rb.class) {
                if (kg == null) {
                    kg = new rb();
                }
            }
        }
        return kg;
    }

    private rb() {
        hie();
    }

    public void gff() {
        hie();
    }

    private void hie() {
        com.bytedance.sdk.component.adexpress.hm.hm.kg(new com.bytedance.sdk.component.tw.tw("init") { // from class: com.bytedance.sdk.component.adexpress.fxn.kg.rb.1
            @Override // java.lang.Runnable
            public void run() {
                tw.fxn();
                rb.this.gff.set(false);
                rb.this.hm();
                rb.this.sg();
                if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff() == null || !ums.fxn(com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().kg()) || com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff() == null) {
                    return;
                }
                com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().hm();
            }
        }, 10);
    }

    public void hm() {
        com.bytedance.sdk.component.adexpress.fxn.gff.fxn kg2 = tw.kg();
        if (kg2 == null || !kg2.tw()) {
            return;
        }
        boolean fxn2 = fxn(kg2);
        if (!fxn2) {
            tw.hm();
        }
        this.rb = fxn2;
    }

    public boolean fxn(com.bytedance.sdk.component.adexpress.fxn.gff.fxn fxnVar) {
        if (fxnVar == null) {
            return false;
        }
        return fxn(fxnVar.fxn()) || fxn(fxnVar.rb()) || fxn(fxnVar.bh());
    }

    public boolean rb() {
        return this.rb;
    }

    public com.bytedance.sdk.component.adexpress.fxn.gff.fxn bh() {
        return tw.kg();
    }

    @Override // com.bytedance.sdk.component.adexpress.fxn.kg.gff
    public File fxn() {
        return tw();
    }

    public void sg() {
        fxn(false);
    }

    public void fxn(boolean z) {
        List<fxn.C0474fxn> list;
        boolean z2;
        if (this.gff.get()) {
            return;
        }
        try {
            if (this.hm.get()) {
                if (z) {
                    this.f9341sg.getAndIncrement();
                    return;
                }
                return;
            }
            boolean z3 = true;
            this.hm.set(true);
            com.bytedance.sdk.component.adexpress.fxn.gff.fxn rb = com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().rb();
            com.bytedance.sdk.component.adexpress.fxn.gff.fxn kg2 = tw.kg();
            if (rb != null && rb.tw()) {
                if (!tw.kg(rb)) {
                    this.hm.set(false);
                    this.tw.set(System.currentTimeMillis());
                    return;
                }
                if (com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff() != null) {
                    com.bytedance.sdk.component.adexpress.fxn.fxn.fxn.fxn().gff().gff().post(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.fxn.kg.rb.2
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.adexpress.rb.rb.fxn().kg();
                        }
                    });
                }
                tw.fxn(rb);
                boolean fxn2 = (rb.rb() == null || TextUtils.isEmpty(rb.rb().fxn())) ? false : fxn(rb.rb().fxn());
                if (rb.fxn().size() != 0) {
                    list = fxn(rb, kg2);
                    z2 = list != null;
                } else {
                    list = null;
                    z2 = fxn2;
                }
                if (!fxn2) {
                    List<fxn.C0474fxn> kg3 = kg(rb, kg2);
                    if (list == null || kg3 == null) {
                        list = kg3;
                    } else {
                        list.addAll(kg3);
                    }
                    if (kg3 == null) {
                        z3 = false;
                    }
                    if (kg3 == null) {
                        this.hm.set(false);
                    }
                    z2 = z3;
                }
                if (z2 && fxn(rb)) {
                    tw.fxn(rb);
                    tw.gff();
                    kg(list);
                }
                hm();
                this.hm.set(false);
                this.tw.set(System.currentTimeMillis());
                dgx();
                return;
            }
            this.hm.set(false);
            fxn(109);
        } catch (Throwable unused) {
        }
    }

    private void dgx() {
        if (this.f9341sg.getAndSet(0) <= 0 || System.currentTimeMillis() - this.tw.get() <= 600000) {
            return;
        }
        sg();
    }

    public static File tw() {
        if (fxn == null) {
            try {
                File file = new File(new File(hm.fxn(), "tt_tmpl_pkg"), "template");
                file.mkdirs();
                fxn = file;
            } catch (Throwable unused) {
            }
        }
        return fxn;
    }

    public void kg(boolean z) {
        this.bh.set(z);
    }

    public void jq() {
        this.bh.set(true);
        this.rb = false;
        this.hm.set(false);
    }
}
