package com.bytedance.sdk.openadsdk.je.fxn;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.rb.dgx;
import com.bytedance.sdk.component.rb.hie;
import com.bytedance.sdk.component.rb.tw;
import com.bytedance.sdk.component.rb.xdg;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.jq.hm;
import com.bytedance.sdk.openadsdk.utils.wc;
import java.util.Map;

/* loaded from: classes14.dex */
public class fxn {

    /* renamed from: com.bytedance.sdk.openadsdk.je.fxn.fxn$fxn, reason: collision with other inner class name */
    public interface InterfaceC0540fxn {
        void fxn(int i, String str, Throwable th);

        void fxn(String str, kg kgVar);
    }

    public void fxn(com.bytedance.sdk.openadsdk.je.fxn fxnVar, final InterfaceC0540fxn interfaceC0540fxn, int i, int i2, ImageView.ScaleType scaleType, String str, final int i3, jz jzVar) {
        hie fxn = hm.fxn(fxnVar.fxn).fxn(fxnVar.kg).fxn(i).kg(i2).rb(wc.rb(rmu.fxn())).hm(wc.gff(rmu.fxn())).kg(str).fxn(scaleType).fxn(!TextUtils.isEmpty(str));
        if (i3 > 0) {
            fxn.gff(2).fxn(new tw() { // from class: com.bytedance.sdk.openadsdk.je.fxn.fxn.1
                @Override // com.bytedance.sdk.component.rb.tw
                public Bitmap fxn(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.hm.fxn.fxn(rmu.fxn(), bitmap, i3);
                }
            });
        } else {
            fxn.gff(1);
        }
        fxn.fxn(new com.bytedance.sdk.openadsdk.jq.kg(jzVar, fxnVar.fxn, new xdg() { // from class: com.bytedance.sdk.openadsdk.je.fxn.fxn.2
            @Override // com.bytedance.sdk.component.rb.xdg
            public void fxn(dgx dgxVar) {
                fxn.this.fxn(dgxVar, interfaceC0540fxn);
            }

            @Override // com.bytedance.sdk.component.rb.xdg
            public void fxn(int i4, String str2, Throwable th) {
                fxn.this.fxn(i4, str2, th, interfaceC0540fxn);
            }
        }));
    }

    protected void fxn(dgx dgxVar, InterfaceC0540fxn interfaceC0540fxn) {
        if (interfaceC0540fxn != null) {
            Object kg = dgxVar.kg();
            int fxn = fxn(dgxVar);
            if (kg instanceof Drawable) {
                interfaceC0540fxn.fxn(dgxVar.fxn(), new kg((Drawable) kg, fxn));
                return;
            }
            if (kg instanceof byte[]) {
                interfaceC0540fxn.fxn(dgxVar.fxn(), new kg((byte[]) kg, fxn));
                return;
            }
            if (kg instanceof Bitmap) {
                interfaceC0540fxn.fxn(dgxVar.fxn(), new kg((Bitmap) kg, dgxVar.gff() instanceof Bitmap ? (Bitmap) dgxVar.gff() : null, fxn));
            } else {
                interfaceC0540fxn.fxn(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int fxn(dgx dgxVar) {
        Object obj;
        Map<String, String> hm = dgxVar.hm();
        if (hm == null || (obj = hm.get("image_size")) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    protected void fxn(int i, String str, Throwable th, InterfaceC0540fxn interfaceC0540fxn) {
        if (interfaceC0540fxn != null) {
            interfaceC0540fxn.fxn(i, str, th);
        }
    }
}
