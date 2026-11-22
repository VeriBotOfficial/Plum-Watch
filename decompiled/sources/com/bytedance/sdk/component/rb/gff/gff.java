package com.bytedance.sdk.component.rb.gff;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import com.bytedance.sdk.component.rb.dgx;
import com.bytedance.sdk.component.rb.hie;
import com.bytedance.sdk.component.rb.jq;
import com.bytedance.sdk.component.rb.tw;
import com.bytedance.sdk.component.rb.ud;
import com.bytedance.sdk.component.rb.ums;
import com.bytedance.sdk.component.rb.xdg;
import com.bytedance.sdk.component.rb.zu;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes13.dex */
public class gff implements jq {
    private boolean ax;
    private ImageView.ScaleType bh;
    private com.bytedance.sdk.component.rb.gff.fxn bx;
    private zu ci;
    private boolean ckl;
    private int dgx;
    private boolean dx;
    Future<?> fxn;
    private String gff;
    private ExecutorService ggo;
    private tw hie;
    private String hm;
    private int iwp;
    private Queue<com.bytedance.sdk.component.rb.rb.jq> je;
    private int jq;
    private bh jz;
    private int ke;
    private String kg;
    private int mve;
    private WeakReference<ImageView> mvp;
    private xdg rb;
    private volatile boolean rlu;
    private int rmu;

    /* renamed from: sg, reason: collision with root package name */
    private Bitmap.Config f9382sg;
    private int tw;
    private final Handler ud;
    private com.bytedance.sdk.component.rb.kg uhw;
    private com.bytedance.sdk.component.rb.sg ums;
    private ud xdg;
    private boolean zn;
    private boolean zu;

    private gff(kg kgVar) {
        this.je = new LinkedBlockingQueue();
        this.ud = new Handler(Looper.getMainLooper());
        this.dx = true;
        this.kg = kgVar.hm;
        this.rb = new fxn(kgVar.fxn);
        this.mvp = new WeakReference<>(kgVar.kg);
        this.bh = kgVar.rb;
        this.f9382sg = kgVar.bh;
        this.tw = kgVar.f9383sg;
        this.jq = kgVar.tw;
        this.dgx = kgVar.jq;
        this.rmu = kgVar.hie;
        this.xdg = kgVar.dgx;
        this.uhw = fxn(kgVar);
        if (!TextUtils.isEmpty(kgVar.gff)) {
            kg(kgVar.gff);
            fxn(kgVar.gff);
        }
        this.zu = kgVar.mvp;
        this.ckl = kgVar.rlu;
        this.jz = kgVar.xdg;
        this.hie = kgVar.rmu;
        this.mve = kgVar.ud;
        this.ke = kgVar.je;
        this.ggo = kgVar.ums;
        this.zn = kgVar.dx;
        this.ax = kgVar.iwp;
        this.ci = kgVar.jz;
        this.je.add(new com.bytedance.sdk.component.rb.rb.gff());
    }

    private com.bytedance.sdk.component.rb.kg fxn(kg kgVar) {
        if (kgVar.ckl != null) {
            return kgVar.ckl;
        }
        if (!TextUtils.isEmpty(kgVar.zu)) {
            return com.bytedance.sdk.component.rb.gff.fxn.fxn.fxn(new File(kgVar.zu));
        }
        return com.bytedance.sdk.component.rb.gff.fxn.fxn.hie();
    }

    public int bh() {
        return this.ke;
    }

    public int sg() {
        return this.mve;
    }

    @Override // com.bytedance.sdk.component.rb.jq
    public String fxn() {
        return this.kg;
    }

    public xdg tw() {
        return this.rb;
    }

    public String jq() {
        return this.hm;
    }

    public void fxn(String str) {
        this.hm = str;
    }

    public String hie() {
        return this.gff;
    }

    @Override // com.bytedance.sdk.component.rb.jq
    public Bitmap.Config rb() {
        return this.f9382sg;
    }

    public void kg(String str) {
        WeakReference<ImageView> weakReference = this.mvp;
        if (weakReference != null && weakReference.get() != null) {
            this.mvp.get().setTag(1094453505, str);
        }
        this.gff = str;
    }

    @Override // com.bytedance.sdk.component.rb.jq
    public ImageView.ScaleType hm() {
        return this.bh;
    }

    public Bitmap.Config dgx() {
        return this.f9382sg;
    }

    @Override // com.bytedance.sdk.component.rb.jq
    public int kg() {
        return this.tw;
    }

    @Override // com.bytedance.sdk.component.rb.jq
    public int gff() {
        return this.jq;
    }

    public int mvp() {
        return this.dgx;
    }

    public boolean rlu() {
        return this.zu;
    }

    public boolean zu() {
        return this.ckl;
    }

    public void fxn(boolean z) {
        this.dx = z;
    }

    public boolean ckl() {
        return this.dx;
    }

    public com.bytedance.sdk.component.rb.sg xdg() {
        return this.ums;
    }

    public void fxn(com.bytedance.sdk.component.rb.sg sgVar) {
        this.ums = sgVar;
    }

    public int rmu() {
        return this.iwp;
    }

    public void fxn(int i) {
        this.iwp = i;
    }

    public void fxn(com.bytedance.sdk.component.rb.gff.fxn fxnVar) {
        this.bx = fxnVar;
    }

    public bh je() {
        return this.jz;
    }

    public com.bytedance.sdk.component.rb.kg ud() {
        return this.uhw;
    }

    public boolean fxn(com.bytedance.sdk.component.rb.rb.jq jqVar) {
        if (this.rlu) {
            return false;
        }
        return this.je.add(jqVar);
    }

    public boolean dx() {
        return this.zn;
    }

    public zu ums() {
        return this.ci;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jq jz() {
        try {
            if (this.jz == null) {
                xdg xdgVar = this.rb;
                if (xdgVar != null) {
                    xdgVar.fxn(1005, "not init !", null);
                    return this;
                }
            } else {
                String fxn2 = fxn();
                if (TextUtils.isEmpty(fxn2)) {
                    xdg xdgVar2 = this.rb;
                    if (xdgVar2 != null) {
                        xdgVar2.fxn(2000, "url is empty", null);
                        return this;
                    }
                } else {
                    ums rb = this.jz.rb();
                    if (!fxn2.startsWith("http://") && !fxn2.startsWith("https://") && rb != null) {
                        rb.fxn(1006, "url is not validate ".concat(String.valueOf(fxn2)));
                    }
                    ExecutorService sg2 = this.ggo == null ? this.jz.sg() : null;
                    Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.rb.gff.gff.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.bytedance.sdk.component.rb.rb.jq jqVar;
                            while (!gff.this.rlu && (jqVar = (com.bytedance.sdk.component.rb.rb.jq) gff.this.je.poll()) != null) {
                                try {
                                    if (gff.this.xdg != null) {
                                        gff.this.xdg.fxn(jqVar.fxn(), gff.this);
                                    }
                                    jqVar.fxn(gff.this);
                                    if (gff.this.xdg != null) {
                                        gff.this.xdg.kg(jqVar.fxn(), gff.this);
                                    }
                                } catch (Throwable th) {
                                    gff.this.fxn(2000, th.getMessage(), th);
                                    if (gff.this.xdg != null) {
                                        gff.this.xdg.kg("exception", gff.this);
                                        return;
                                    }
                                    return;
                                }
                            }
                            if (gff.this.rlu) {
                                gff.this.fxn(1003, "canceled", null);
                            }
                        }
                    };
                    if (this.ax) {
                        runnable.run();
                        return this;
                    }
                    ExecutorService executorService = this.ggo;
                    if (executorService != null) {
                        this.fxn = executorService.submit(runnable);
                        return this;
                    }
                    if (sg2 != null) {
                        this.fxn = sg2.submit(runnable);
                        return this;
                    }
                }
            }
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fxn(int i, String str, Throwable th) {
        new com.bytedance.sdk.component.rb.rb.tw(i, str, th).fxn(this);
        this.je.clear();
    }

    public String iwp() {
        return hie() + mvp();
    }

    public static class kg implements hie {
        private Bitmap.Config bh;
        private com.bytedance.sdk.component.rb.kg ckl;
        private ud dgx;
        private boolean dx;
        private xdg fxn;
        private String gff;
        private String hm;
        private boolean iwp;
        private int je;
        private zu jz;
        private ImageView kg;
        private boolean mvp;
        private ImageView.ScaleType rb;
        private boolean rlu;
        private tw rmu;

        /* renamed from: sg, reason: collision with root package name */
        private int f9383sg;
        private int tw;
        private int ud;
        private ExecutorService ums;
        private bh xdg;
        private String zu;
        private int jq = 1;
        private int hie = 5;

        public kg(bh bhVar) {
            this.xdg = bhVar;
        }

        public hie gff(String str) {
            this.hm = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(String str) {
            this.gff = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(ImageView.ScaleType scaleType) {
            this.rb = scaleType;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(Bitmap.Config config) {
            this.bh = config;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(int i) {
            this.f9383sg = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie kg(int i) {
            this.tw = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie gff(int i) {
            this.jq = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(ud udVar) {
            this.dgx = udVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(boolean z) {
            this.rlu = z;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie kg(String str) {
            this.zu = str;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public jq fxn(xdg xdgVar, int i) {
            this.hie = i;
            return fxn(xdgVar);
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public jq fxn(xdg xdgVar) {
            this.fxn = xdgVar;
            return new gff(this).jz();
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public jq fxn(ImageView imageView) {
            this.kg = imageView;
            return new gff(this).jz();
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie fxn(tw twVar) {
            this.rmu = twVar;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie hm(int i) {
            this.je = i;
            return this;
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public hie rb(int i) {
            this.ud = i;
            return this;
        }
    }

    private class fxn implements xdg {
        private xdg kg;

        public fxn(xdg xdgVar) {
            this.kg = xdgVar;
        }

        @Override // com.bytedance.sdk.component.rb.xdg
        public void fxn(final dgx dgxVar) {
            final ImageView imageView = (ImageView) gff.this.mvp.get();
            if (imageView != null && gff.this.dgx != 3 && fxn(imageView) && (dgxVar.kg() instanceof Bitmap)) {
                final Bitmap bitmap = (Bitmap) dgxVar.kg();
                gff.this.ud.post(new Runnable() { // from class: com.bytedance.sdk.component.rb.gff.gff.fxn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView.setImageBitmap(bitmap);
                    }
                });
            }
            try {
                if (gff.this.hie != null && (dgxVar.kg() instanceof Bitmap)) {
                    tw twVar = gff.this.hie;
                    Bitmap bitmap2 = (Bitmap) dgxVar.kg();
                    Bitmap bitmap3 = bitmap2;
                    Bitmap fxn = twVar.fxn(bitmap2);
                    if (fxn != null) {
                        dgxVar.fxn(fxn);
                    }
                }
            } catch (Throwable unused) {
            }
            if (gff.this.rmu == 5) {
                gff.this.ud.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.rb.gff.gff.fxn.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fxn.this.kg != null) {
                            fxn.this.kg.fxn(dgxVar);
                        }
                    }
                });
                return;
            }
            xdg xdgVar = this.kg;
            if (xdgVar != null) {
                xdgVar.fxn(dgxVar);
            }
        }

        private boolean fxn(ImageView imageView) {
            Object tag;
            return (imageView == null || (tag = imageView.getTag(1094453505)) == null || !tag.equals(gff.this.gff)) ? false : true;
        }

        @Override // com.bytedance.sdk.component.rb.xdg
        public void fxn(final int i, final String str, final Throwable th) {
            if (gff.this.rmu == 5) {
                gff.this.ud.post(new Runnable() { // from class: com.bytedance.sdk.component.rb.gff.gff.fxn.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (fxn.this.kg != null) {
                            fxn.this.kg.fxn(i, str, th);
                        }
                    }
                });
                return;
            }
            xdg xdgVar = this.kg;
            if (xdgVar != null) {
                xdgVar.fxn(i, str, th);
            }
        }
    }
}
