package com.bytedance.adsdk.ugeno.yoga.kg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.fxn;
import com.bytedance.adsdk.ugeno.kg.fxn;
import com.bytedance.adsdk.ugeno.sg.tw;
import com.bytedance.adsdk.ugeno.yoga.bh;
import com.bytedance.adsdk.ugeno.yoga.hie;
import com.bytedance.adsdk.ugeno.yoga.hm;
import com.bytedance.adsdk.ugeno.yoga.kg.gff;
import com.bytedance.adsdk.ugeno.yoga.rb;
import com.bytedance.adsdk.ugeno.yoga.rlu;
import com.bytedance.adsdk.ugeno.yoga.zu;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public class fxn extends com.bytedance.adsdk.ugeno.kg.fxn<gff> {
    private rb bmc;
    private com.bytedance.adsdk.ugeno.yoga.fxn cj;
    private com.bytedance.adsdk.ugeno.yoga.fxn jt;
    private bh oox;
    private hie op;
    private zu vkm;

    public fxn(Context context) {
        super(context);
        this.bmc = rb.ROW;
        this.vkm = zu.NO_WRAP;
        this.oox = bh.FLEX_START;
        this.jt = com.bytedance.adsdk.ugeno.yoga.fxn.STRETCH;
        this.cj = com.bytedance.adsdk.ugeno.yoga.fxn.STRETCH;
    }

    @Override // com.bytedance.adsdk.ugeno.kg.gff
    /* renamed from: gff, reason: merged with bridge method [inline-methods] */
    public gff fxn() {
        gff gffVar = new gff(this.kg);
        gffVar.fxn(this);
        this.op = gffVar.getYogaNode();
        return gffVar;
    }

    @Override // com.bytedance.adsdk.ugeno.kg.gff
    protected void zn() {
        if (this.ei) {
            com.bytedance.adsdk.ugeno.rb.fxn().kg().fxn(this.jq, this.qhf, new fxn.InterfaceC0456fxn() { // from class: com.bytedance.adsdk.ugeno.yoga.kg.fxn.1
                @Override // com.bytedance.adsdk.ugeno.fxn.InterfaceC0456fxn
                public void fxn(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (fxn.this.uz != null) {
                            com.bytedance.adsdk.ugeno.core.bh unused = fxn.this.uz;
                            String unused2 = fxn.this.qhf;
                            return;
                        }
                        return;
                    }
                    if (fxn.this.uz != null) {
                        com.bytedance.adsdk.ugeno.core.bh unused3 = fxn.this.uz;
                        String unused4 = fxn.this.qhf;
                    }
                    final Bitmap fxn = tw.fxn(fxn.this.kg, bitmap, (int) fxn.this.zk);
                    if (fxn != null) {
                        tw.fxn(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.kg.fxn.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                fxn.this.fxn(new BitmapDrawable(fxn));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.jq.hm.fxn fxnVar = new com.bytedance.adsdk.ugeno.jq.hm.fxn(this.kg);
        com.bytedance.adsdk.ugeno.rb.fxn().kg().fxn(this.jq, this.qhf, fxnVar, this.rb.getWidth(), this.rb.getHeight(), new fxn.InterfaceC0456fxn() { // from class: com.bytedance.adsdk.ugeno.yoga.kg.fxn.2
            @Override // com.bytedance.adsdk.ugeno.fxn.InterfaceC0456fxn
            public void fxn(Bitmap bitmap) {
                if (bitmap == null) {
                    if (fxn.this.uz != null) {
                        com.bytedance.adsdk.ugeno.core.bh unused = fxn.this.uz;
                        String unused2 = fxn.this.qhf;
                        return;
                    }
                    return;
                }
                if (fxn.this.uz != null) {
                    com.bytedance.adsdk.ugeno.core.bh unused3 = fxn.this.uz;
                    String unused4 = fxn.this.qhf;
                }
            }
        });
        if (!this.kee || this.wc == ImageView.ScaleType.FIT_XY) {
            fxnVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            fxnVar.setScaleType(this.wc);
        }
        fxnVar.setCornerRadius(this.ps);
        gff.fxn fxnVar2 = new gff.fxn(-1, -1);
        fxnVar2.bh(rlu.ABSOLUTE.fxn());
        if (this.rb instanceof gff) {
            ((gff) this.rb).addView(fxnVar, 0, fxnVar2);
            fxn(fxnVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kg.gff
    protected void fxn(Drawable drawable) {
        com.bytedance.adsdk.ugeno.jq.hm.fxn fxnVar = new com.bytedance.adsdk.ugeno.jq.hm.fxn(this.kg);
        fxnVar.setImageDrawable(drawable);
        if (!this.kee || this.wc == ImageView.ScaleType.FIT_XY) {
            fxnVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            fxnVar.setScaleType(this.wc);
        }
        fxnVar.setCornerRadius(this.ps);
        gff.fxn fxnVar2 = new gff.fxn(-1, -1);
        fxnVar2.bh(rlu.ABSOLUTE.fxn());
        if (this.rb instanceof gff) {
            ((gff) this.rb).addView(fxnVar, 0, fxnVar2);
            fxn(fxnVar);
        }
    }

    private void fxn(final com.bytedance.adsdk.ugeno.jq.hm.fxn fxnVar) {
        this.rb.post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.kg.fxn.3
            @Override // java.lang.Runnable
            public void run() {
                hie fxn;
                if (fxn.this.rb == null || (fxn = ((gff) fxn.this.rb).fxn(fxnVar)) == null) {
                    return;
                }
                fxn.hm(fxn.this.rb.getWidth());
                fxn.bh(fxn.this.rb.getHeight());
                fxnVar.setCornerRadius(fxn.this.ps);
                fxn.this.rb.requestLayout();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.kg.fxn, com.bytedance.adsdk.ugeno.kg.gff
    public void kg() {
        super.kg();
        this.op.fxn(this.bmc);
        this.op.fxn(this.vkm);
        this.op.fxn(this.oox);
        this.op.fxn(this.jt);
        this.op.gff(this.cj);
        this.op.fxn(true);
    }

    @Override // com.bytedance.adsdk.ugeno.kg.gff
    protected void zu() {
        if (this.ci) {
            this.op.kg(hm.ALL, this.ke);
        }
        if (this.rz) {
            this.op.kg(hm.LEFT, this.mve);
        }
        if (this.ils) {
            this.op.kg(hm.RIGHT, this.zn);
        }
        if (this.ij) {
            this.op.kg(hm.TOP, this.ggo);
        }
        if (this.yws) {
            this.op.kg(hm.BOTTOM, this.ax);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kg.fxn
    public void fxn(com.bytedance.adsdk.ugeno.kg.gff gffVar) {
        super.fxn(gffVar);
    }

    @Override // com.bytedance.adsdk.ugeno.kg.fxn
    public void fxn(com.bytedance.adsdk.ugeno.kg.gff gffVar, ViewGroup.LayoutParams layoutParams) {
        if (gffVar == null) {
            return;
        }
        this.fxn.add(gffVar);
        View dgx = gffVar.dgx();
        if (dgx != null) {
            ((gff) this.rb).addView(dgx, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.kg.fxn
    /* renamed from: hm, reason: merged with bridge method [inline-methods] */
    public C0466fxn hie() {
        return new C0466fxn(this);
    }

    @Override // com.bytedance.adsdk.ugeno.kg.gff
    public void fxn(String str, String str2) {
        super.fxn(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.jt = com.bytedance.adsdk.ugeno.yoga.fxn.fxn(str2);
                break;
            case "flexDirection":
                this.bmc = rb.fxn(str2);
                break;
            case "alignContent":
                this.cj = com.bytedance.adsdk.ugeno.yoga.fxn.fxn(str2);
                break;
            case "flexWrap":
                this.vkm = zu.fxn(str2);
                break;
            case "justifyContent":
                this.oox = bh.fxn(str2);
                break;
        }
    }

    public rb fqt() {
        return this.bmc;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.kg.fxn$fxn, reason: collision with other inner class name */
    public static class C0466fxn extends fxn.C0462fxn {
        public float ax;
        public int ci;
        private boolean ei;
        public int ggo;
        public int ij;
        public int ils;
        public int ke;
        private boolean kee;
        public float mve;
        private boolean ps;
        private boolean qhf;
        public int rz;
        public float swx;
        private boolean wc;
        public int yws;
        private boolean zk;
        public float zn;

        public C0466fxn(com.bytedance.adsdk.ugeno.kg.fxn fxnVar) {
            super(fxnVar);
            this.ke = 1;
            this.mve = 0.0f;
            this.zn = 1.0f;
            this.ggo = com.bytedance.adsdk.ugeno.yoga.fxn.AUTO.fxn();
            this.ax = -1.0f;
            this.ci = rlu.RELATIVE.fxn();
        }

        @Override // com.bytedance.adsdk.ugeno.kg.fxn.C0462fxn
        public void fxn(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.fxn(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.qhf = true;
                    float fxn = com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, -1.0f);
                    this.ax = fxn;
                    this.ax = tw.fxn(context, fxn);
                    break;
                case "bottom":
                    this.zk = true;
                    this.ils = (int) tw.fxn(context, com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 0));
                    break;
                case "top":
                    this.wc = true;
                    this.rz = (int) tw.fxn(context, com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 0));
                    break;
                case "left":
                    this.ei = true;
                    this.ij = (int) tw.fxn(context, com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 0));
                    break;
                case "order":
                    this.ke = com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 1);
                    break;
                case "ratio":
                    this.ps = true;
                    this.swx = com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 0.0f);
                    break;
                case "right":
                    this.kee = true;
                    this.yws = (int) tw.fxn(context, com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 0));
                    break;
                case "position":
                    this.ci = rlu.fxn(str2).fxn();
                    break;
                case "flexShrink":
                    this.zn = com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.mve = com.bytedance.adsdk.ugeno.sg.gff.fxn(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.ggo = com.bytedance.adsdk.ugeno.yoga.fxn.fxn(str2).fxn();
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.kg.fxn.C0462fxn
        /* renamed from: kg, reason: merged with bridge method [inline-methods] */
        public gff.fxn fxn() {
            hm();
            gff.fxn fxnVar = new gff.fxn((int) this.fxn, (int) this.kg);
            fxnVar.mvp((int) (this.dx ? this.bh : this.rb));
            fxnVar.zu((int) (this.ums ? this.f9295sg : this.rb));
            fxnVar.dgx((int) (this.iwp ? this.tw : this.rb));
            fxnVar.rlu((int) (this.jz ? this.jq : this.rb));
            fxnVar.fxn(this.ke);
            fxnVar.rb(this.ggo);
            fxnVar.kg(this.mve);
            fxnVar.gff(this.zn);
            fxnVar.xdg(this.gff);
            fxnVar.rmu(this.hm);
            if (this.qhf) {
                fxnVar.hm(this.ax);
            }
            fxnVar.bh(this.ci);
            if (this.wc) {
                fxnVar.sg(this.rz);
            }
            if (this.zk) {
                fxnVar.jq(this.ils);
            }
            if (this.ei) {
                fxnVar.tw(this.ij);
            }
            if (this.kee) {
                fxnVar.hie(this.yws);
            }
            if (this.ps && gff()) {
                float f = this.swx;
                if (f > 0.0f) {
                    fxnVar.ckl(f);
                    fxnVar.gff(0.0f);
                    fxnVar.kg(0.0f);
                }
            }
            return fxnVar;
        }

        public boolean gff() {
            if (this.fxn == -1.0f && this.kg == -1.0f) {
                return false;
            }
            return this.fxn == -2.0f || this.kg == -2.0f;
        }

        private void hm() {
            if (this.uhw instanceof fxn) {
                if (((fxn) this.uhw).fqt() == rb.ROW && this.uhw.yws() == -2 && this.fxn == -1.0f && !this.uhw.ps()) {
                    this.fxn = -2.0f;
                    this.zn = 1.0f;
                    this.mve = 1.0f;
                    this.qhf = true;
                    this.ax = -1.0f;
                }
                if (((fxn) this.uhw).fqt() == rb.COLUMN && this.uhw.swx() == -2 && this.kg == -1.0f && !this.uhw.ps()) {
                    this.kg = -2.0f;
                    this.zn = 1.0f;
                    this.mve = 1.0f;
                    this.qhf = true;
                    this.ax = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.kg.fxn.C0462fxn
        public String toString() {
            return "LayoutParams{mOrder=" + this.ke + ", mFlexGrow=" + this.mve + ", mFlexShrink=" + this.zn + ", mAlignSelf=" + this.ggo + ", mFlexBasis=" + this.ax + ", mPosition=" + this.ci + ", mTop=" + this.rz + ", mBottom=" + this.ils + ", mLeft=" + this.ij + ", mRight=" + this.yws + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
