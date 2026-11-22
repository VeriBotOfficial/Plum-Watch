package com.bytedance.adsdk.ugeno.jq.kg;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.bytedance.adsdk.ugeno.kg.fxn;

/* loaded from: classes13.dex */
public class kg extends com.bytedance.adsdk.ugeno.kg.fxn<com.bytedance.adsdk.ugeno.jq.kg.fxn> {
    private com.bytedance.adsdk.ugeno.jq.kg.fxn bmc;

    public kg(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.kg.gff
    /* renamed from: gff, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.ugeno.jq.kg.fxn fxn() {
        com.bytedance.adsdk.ugeno.jq.kg.fxn fxnVar = new com.bytedance.adsdk.ugeno.jq.kg.fxn(this.kg);
        this.bmc = fxnVar;
        fxnVar.fxn(this);
        return this.bmc;
    }

    @Override // com.bytedance.adsdk.ugeno.kg.fxn, com.bytedance.adsdk.ugeno.kg.gff
    public void kg() {
        this.bmc.setEventMap(this.an);
        super.kg();
    }

    @Override // com.bytedance.adsdk.ugeno.kg.fxn
    public fxn.C0462fxn hie() {
        return new fxn(this);
    }

    public static class fxn extends fxn.C0462fxn {
        protected int ke;

        public fxn(com.bytedance.adsdk.ugeno.kg.fxn fxnVar) {
            super(fxnVar);
            this.ke = -1;
        }

        @Override // com.bytedance.adsdk.ugeno.kg.fxn.C0462fxn
        public void fxn(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            super.fxn(context, str, str2);
            if (TextUtils.equals(str, "layoutGravity")) {
                this.ke = fxn(str2);
            }
        }

        private int fxn(String str) {
            String[] split;
            if (TextUtils.isEmpty(str) || (split = str.split("\\|")) == null || split.length <= 0) {
                return -1;
            }
            int i = 0;
            for (String str2 : split) {
                i |= kg(str2);
            }
            return i;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int kg(String str) {
            char c;
            str.hashCode();
            switch (str.hashCode()) {
                case -1383228885:
                    if (str.equals("bottom")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -348726240:
                    if (str.equals("center_vertical")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1063616078:
                    if (str.equals("center_horizontal")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    return 80;
                case 1:
                    return 17;
                case 2:
                    return 16;
                case 3:
                    return 48;
                case 4:
                    return 3;
                case 5:
                    return 5;
                case 6:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.kg.fxn.C0462fxn
        /* renamed from: kg, reason: merged with bridge method [inline-methods] */
        public FrameLayout.LayoutParams fxn() {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.fxn, (int) this.kg);
            layoutParams.leftMargin = (int) this.bh;
            layoutParams.rightMargin = (int) this.f9295sg;
            layoutParams.topMargin = (int) this.tw;
            layoutParams.bottomMargin = (int) this.jq;
            layoutParams.gravity = this.ke;
            return layoutParams;
        }
    }
}
