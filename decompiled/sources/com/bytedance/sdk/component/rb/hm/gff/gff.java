package com.bytedance.sdk.component.rb.hm.gff;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
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
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* loaded from: classes13.dex */
public class gff implements jq {
    private ImageView.ScaleType bh;
    private int bx;
    private boolean ckl;
    private int dgx;
    private com.bytedance.sdk.component.rb.sg dx;
    Future<?> fxn;
    private String gff;
    private byte[] ggo;
    private tw hie;
    private String hm;
    private bh iwp;
    private final Handler je;
    private int jq;
    private com.bytedance.sdk.component.rb.kg jz;
    private ExecutorService ke;
    private String kg;
    private boolean mve;
    private WeakReference<ImageView> mvp;
    private xdg rb;
    private volatile boolean rlu;
    private int rmu;

    /* renamed from: sg, reason: collision with root package name */
    private Bitmap.Config f9390sg;
    private int tw;
    private boolean ud;
    private int uhw;
    private int ums;
    private ud xdg;
    private zu zn;
    private boolean zu;

    private gff(kg kgVar) {
        this.je = new Handler(Looper.getMainLooper());
        this.ud = true;
        this.ggo = null;
        this.kg = kgVar.hm;
        this.rb = new fxn(kgVar.fxn);
        this.mvp = new WeakReference<>(kgVar.kg);
        this.bh = kgVar.rb;
        this.f9390sg = kgVar.bh;
        this.tw = kgVar.f9391sg;
        this.jq = kgVar.tw;
        this.dgx = kgVar.jq;
        this.rmu = kgVar.hie;
        this.xdg = kgVar.dgx;
        this.jz = fxn(kgVar);
        if (!TextUtils.isEmpty(kgVar.gff)) {
            kg(kgVar.gff);
            fxn(kgVar.gff);
        }
        this.zu = kgVar.mvp;
        this.ckl = kgVar.rlu;
        this.iwp = kgVar.xdg;
        this.hie = kgVar.rmu;
        this.uhw = kgVar.ud;
        this.bx = kgVar.je;
        this.ke = kgVar.dx;
        this.mve = kgVar.ums;
        this.zn = kgVar.iwp;
    }

    private com.bytedance.sdk.component.rb.kg fxn(kg kgVar) {
        if (kgVar.ckl != null) {
            return kgVar.ckl;
        }
        if (!TextUtils.isEmpty(kgVar.zu)) {
            return com.bytedance.sdk.component.rb.hm.gff.fxn.kg.fxn(new File(kgVar.zu));
        }
        return com.bytedance.sdk.component.rb.hm.gff.fxn.kg.hie();
    }

    public int bh() {
        return this.bx;
    }

    public int sg() {
        return this.uhw;
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
        return this.f9390sg;
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
        return this.f9390sg;
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

    public void fxn(boolean z) {
        this.ud = z;
    }

    public boolean rlu() {
        return this.ud;
    }

    public void fxn(byte[] bArr) {
        this.ggo = bArr;
    }

    public byte[] zu() {
        return this.ggo;
    }

    public com.bytedance.sdk.component.rb.sg ckl() {
        return this.dx;
    }

    public int xdg() {
        return this.ums;
    }

    public void fxn(int i) {
        this.ums = i;
    }

    public bh rmu() {
        return this.iwp;
    }

    public com.bytedance.sdk.component.rb.kg je() {
        return this.jz;
    }

    public zu ud() {
        return this.zn;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public jq ums() {
        try {
            if (this.iwp == null) {
                xdg xdgVar = this.rb;
                if (xdgVar != null) {
                    xdgVar.fxn(1005, "not init !", null);
                    return this;
                }
            } else {
                String fxn2 = fxn();
                if (TextUtils.isEmpty(fxn2)) {
                    this.rb.fxn(2000, "url is empty", null);
                    return this;
                }
                ums bh = this.iwp.bh();
                if (!fxn2.startsWith("http://") && !fxn2.startsWith("https://") && bh != null) {
                    bh.fxn(1006, "url is not validate ".concat(String.valueOf(fxn2)));
                }
                ExecutorService rb = this.ke == null ? this.iwp.rb() : null;
                Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.rb.hm.gff.gff.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gff gffVar = gff.this;
                        com.bytedance.sdk.component.rb.hm.gff.fxn fxnVar = new com.bytedance.sdk.component.rb.hm.gff.fxn(gffVar, gffVar.xdg);
                        try {
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(new com.bytedance.sdk.component.rb.hm.kg.kg());
                            arrayList.add(new com.bytedance.sdk.component.rb.hm.kg.rb());
                            arrayList.add(new com.bytedance.sdk.component.rb.hm.kg.fxn());
                            arrayList.add(new com.bytedance.sdk.component.rb.hm.kg.gff());
                            arrayList.add(new com.bytedance.sdk.component.rb.hm.kg.hm());
                            for (int i = 0; i < arrayList.size(); i++) {
                                if (gff.this.rlu) {
                                    fxnVar.fxn(1003, "canceled", null);
                                    return;
                                }
                                com.bytedance.sdk.component.rb.hm.kg.bh bhVar = (com.bytedance.sdk.component.rb.hm.kg.bh) arrayList.get(i);
                                if (gff.this.xdg != null && bhVar != null && !"data_intercept".equals(bhVar.fxn())) {
                                    gff.this.xdg.fxn(bhVar.fxn(), gff.this);
                                }
                                gff gffVar2 = gff.this;
                                boolean fxn3 = bhVar.fxn(gffVar2, gffVar2.xdg, fxnVar);
                                if (gff.this.xdg != null && !"data_intercept".equals(bhVar.fxn())) {
                                    gff.this.xdg.kg(bhVar.fxn(), gff.this);
                                }
                                if (!fxn3) {
                                    return;
                                }
                            }
                        } catch (Throwable th) {
                            fxnVar.fxn(2000, th.getMessage(), th);
                        }
                    }
                };
                if (this.mve) {
                    runnable.run();
                    return this;
                }
                ExecutorService executorService = this.ke;
                if (executorService != null) {
                    this.fxn = executorService.submit(runnable);
                    return this;
                }
                if (rb != null) {
                    this.fxn = rb.submit(runnable);
                    return this;
                }
            }
        } catch (Exception e) {
            Log.e("ImageRequest", e.getMessage());
        }
        return this;
    }

    public String dx() {
        return hie() + mvp();
    }

    public static class kg implements hie {
        private Bitmap.Config bh;
        private com.bytedance.sdk.component.rb.kg ckl;
        private ud dgx;
        private ExecutorService dx;
        private xdg fxn;
        private String gff;
        private String hm;
        private zu iwp;
        private int je;
        private ImageView kg;
        private boolean mvp;
        private ImageView.ScaleType rb;
        private boolean rlu;
        private tw rmu;

        /* renamed from: sg, reason: collision with root package name */
        private int f9391sg;
        private int tw;
        private int ud;
        private boolean ums;
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
            this.f9391sg = i;
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
            return new gff(this).ums();
        }

        @Override // com.bytedance.sdk.component.rb.hie
        public jq fxn(ImageView imageView) {
            this.kg = imageView;
            return new gff(this).ums();
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
            if (imageView != null && gff.this.dgx != 3 && fxn(imageView)) {
                Object kg = dgxVar.kg();
                if (kg instanceof Bitmap) {
                    final Bitmap bitmap = (Bitmap) dgxVar.kg();
                    gff.this.je.post(new Runnable() { // from class: com.bytedance.sdk.component.rb.hm.gff.gff.fxn.1
                        @Override // java.lang.Runnable
                        public void run() {
                            imageView.setImageBitmap(bitmap);
                        }
                    });
                } else if (kg instanceof Drawable) {
                    final Drawable drawable = (Drawable) dgxVar.kg();
                    gff.this.je.post(new Runnable() { // from class: com.bytedance.sdk.component.rb.hm.gff.gff.fxn.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (Build.VERSION.SDK_INT >= 28) {
                                Drawable drawable2 = drawable;
                                if (drawable2 instanceof AnimatedImageDrawable) {
                                    ((AnimatedImageDrawable) drawable2).start();
                                }
                            }
                            imageView.setImageDrawable(drawable);
                        }
                    });
                }
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
                gff.this.je.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.component.rb.hm.gff.gff.fxn.3
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
                gff.this.je.post(new Runnable() { // from class: com.bytedance.sdk.component.rb.hm.gff.gff.fxn.4
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
