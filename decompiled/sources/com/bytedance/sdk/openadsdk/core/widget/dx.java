package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.jz;
import com.bytedance.sdk.openadsdk.utils.wc;

/* loaded from: classes14.dex */
public class dx {
    private boolean bh = false;
    private View fxn;
    private Context gff;
    private com.bytedance.sdk.openadsdk.core.rlu.kg.fxn hm;
    private TextView kg;
    private kg rb;

    /* renamed from: sg, reason: collision with root package name */
    private com.bykv.vk.openvk.fxn.fxn.fxn.gff.kg f9529sg;
    private ViewGroup tw;

    public enum fxn {
        PAUSE_VIDEO,
        RELEASE_VIDEO,
        START_VIDEO
    }

    public interface kg {
        void dgx();

        boolean hie();
    }

    public void fxn(Context context, ViewGroup viewGroup) {
        if (context == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        this.tw = viewGroup;
        this.gff = com.bytedance.sdk.openadsdk.core.rmu.fxn().getApplicationContext();
    }

    private void fxn(Context context, View view, boolean z) {
        ViewGroup.LayoutParams fxn2;
        if (context == null || view == null || this.fxn != null || (fxn2 = fxn(this.tw)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.zu.ckl cklVar = new com.bytedance.sdk.openadsdk.zu.ckl(context);
        this.fxn = cklVar;
        cklVar.setLayoutParams(fxn2);
        this.tw.addView(this.fxn);
        this.kg = (TextView) this.fxn.findViewById(com.bytedance.sdk.openadsdk.utils.xdg.unf);
        View findViewById = this.fxn.findViewById(com.bytedance.sdk.openadsdk.utils.xdg.bz);
        if (z) {
            findViewById.setClickable(true);
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.dx.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view2) {
                    dx.this.gff();
                    if (dx.this.hm != null) {
                        dx.this.hm.fxn(fxn.START_VIDEO, (String) null);
                    }
                }
            });
        } else {
            findViewById.setOnClickListener(null);
            findViewById.setClickable(false);
        }
    }

    private ViewGroup.LayoutParams fxn(ViewGroup viewGroup) {
        if (viewGroup instanceof RelativeLayout) {
            return new RelativeLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof LinearLayout) {
            return new LinearLayout.LayoutParams(-1, -1);
        }
        if (viewGroup instanceof FrameLayout) {
            return new FrameLayout.LayoutParams(-1, -1);
        }
        return null;
    }

    public void fxn(com.bytedance.sdk.openadsdk.core.rlu.kg.fxn fxnVar, kg kgVar) {
        this.rb = kgVar;
        this.hm = fxnVar;
    }

    private void kg() {
        this.f9529sg = null;
    }

    public boolean fxn(int i, com.bykv.vk.openvk.fxn.fxn.fxn.gff.kg kgVar, boolean z) {
        Context context = this.gff;
        if (context == null || kgVar == null) {
            return true;
        }
        fxn(context, this.tw, z);
        this.f9529sg = kgVar;
        if (i == 1 || i == 2) {
            return fxn(i);
        }
        return true;
    }

    private boolean fxn(int i) {
        kg kgVar;
        if (fxn() || this.bh) {
            return true;
        }
        if (this.hm != null && (kgVar = this.rb) != null) {
            if (kgVar.hie()) {
                this.hm.rb(null, null);
            }
            this.hm.fxn(fxn.PAUSE_VIDEO, (String) null);
        }
        fxn(this.f9529sg, true);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gff() {
        if (this.gff == null) {
            return;
        }
        hm();
    }

    public void fxn(boolean z) {
        if (z) {
            kg();
        }
        hm();
    }

    public boolean fxn() {
        View view = this.fxn;
        return view != null && view.getVisibility() == 0;
    }

    private void hm() {
        View view = this.fxn;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    private void fxn(com.bykv.vk.openvk.fxn.fxn.fxn.gff.kg kgVar, boolean z) {
        View view;
        String str;
        View view2;
        if (kgVar == null || (view = this.fxn) == null || this.gff == null || view.getVisibility() == 0) {
            return;
        }
        kg kgVar2 = this.rb;
        if (kgVar2 != null) {
            kgVar2.dgx();
        }
        double ceil = Math.ceil((kgVar.rb() * 1.0d) / 1048576.0d);
        if (z) {
            str = String.format(jz.fxn(this.gff, "tt_video_without_wifi_tips"), Float.valueOf(Double.valueOf(ceil).floatValue()));
        } else {
            str = jz.fxn(this.gff, "tt_video_without_wifi_tips") + jz.fxn(this.gff, "tt_video_bytesize");
        }
        wc.fxn(this.fxn, 0);
        wc.fxn(this.kg, str);
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: ");
        if (!wc.hm(this.fxn) || (view2 = this.fxn) == null) {
            return;
        }
        view2.bringToFront();
        Log.i("VideoTrafficTipLayout", "showTrafficTipCover: bringToFront");
    }
}
