package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes13.dex */
public class ke extends LinearLayout {
    private com.bytedance.adsdk.kg.bh bh;
    private TextView fxn;
    private TextView gff;
    private fxn hm;
    private com.bytedance.sdk.component.utils.bx kg;
    private LinearLayout rb;

    /* renamed from: sg, reason: collision with root package name */
    private com.bytedance.sdk.component.adexpress.dynamic.hm.hie f9314sg;

    public interface fxn {
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
    }

    public ke(Context context, View view, com.bytedance.sdk.component.adexpress.dynamic.hm.hie hieVar) {
        super(context);
        this.f9314sg = hieVar;
        fxn(context, view);
    }

    private void fxn(Context context, View view) {
        setClipChildren(false);
        addView(view);
        this.rb = (LinearLayout) findViewById(2097610722);
        this.fxn = (TextView) findViewById(2097610719);
        this.gff = (TextView) findViewById(2097610718);
        com.bytedance.adsdk.kg.bh bhVar = (com.bytedance.adsdk.kg.bh) findViewById(2097610706);
        this.bh = bhVar;
        bhVar.setAnimation("lottie_json/twist_multi_angle.json");
        this.bh.setImageAssetsFolder("images/");
        this.bh.fxn(true);
    }

    public void setShakeText(String str) {
        this.gff.setText(str);
    }

    public LinearLayout getWriggleLayout() {
        return this.rb;
    }

    public View getWriggleProgressIv() {
        return this.bh;
    }

    public TextView getTopTextView() {
        return this.fxn;
    }

    public void setOnShakeViewListener(fxn fxnVar) {
        this.hm = fxnVar;
    }

    public void fxn() {
        postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.bh.ke.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ke.this.bh.fxn();
                } catch (Throwable unused) {
                }
            }
        }, 500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isShown()) {
            if (this.kg == null) {
                this.kg = new com.bytedance.sdk.component.utils.bx(getContext().getApplicationContext(), 2);
            }
            new Object() { // from class: com.bytedance.sdk.component.adexpress.bh.ke.2
            };
            com.bytedance.sdk.component.adexpress.dynamic.hm.hie hieVar = this.f9314sg;
            if (hieVar != null) {
                hieVar.gff();
                this.f9314sg.rb();
                this.f9314sg.bh();
                this.f9314sg.tw();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            com.bytedance.adsdk.kg.bh bhVar = this.bh;
            if (bhVar != null) {
                bhVar.rb();
            }
        } catch (Exception unused) {
        }
    }
}
