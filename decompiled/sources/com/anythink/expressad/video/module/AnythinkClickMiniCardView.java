package com.anythink.expressad.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.expressad.atsignalcommon.windvane.h;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.video.signal.factory.b;
import com.anythink.expressad.videocommon.b.i;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AnythinkClickMiniCardView extends AnythinkH5EndCardView {
    private static final float A = 0.7f;
    private boolean B;

    public AnythinkClickMiniCardView(Context context) {
        super(context);
        this.B = false;
    }

    public AnythinkClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.B = false;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.module.AnythinkBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f) {
            a(this.p);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    protected final RelativeLayout.LayoutParams b() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    protected final void e() {
        super.e();
        if (this.f) {
            setBackgroundResource(findColor("anythink_reward_minicard_bg"));
            a(this.p);
            setClickable(true);
        }
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView
    protected final String a() {
        if (this.b != null) {
            d.c N = this.b.N();
            r1 = N != null ? N.d() : null;
            if (!TextUtils.isEmpty(r1) && r1.contains(".zip")) {
                String b = i.a().b(r1);
                if (!TextUtils.isEmpty(b)) {
                    return b;
                }
            }
        }
        return r1;
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.f
    public void preLoadData(b bVar) {
        super.preLoadData(bVar);
        setCloseVisible(0);
    }

    @Override // com.anythink.expressad.video.module.AnythinkH5EndCardView, com.anythink.expressad.video.signal.h
    public void webviewshow() {
        if (this.s != null) {
            this.s.post(new Runnable() { // from class: com.anythink.expressad.video.module.AnythinkClickMiniCardView.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str = "";
                    try {
                        try {
                            int[] iArr = new int[2];
                            AnythinkClickMiniCardView.this.s.getLocationOnScreen(iArr);
                            int i = iArr[0];
                            int i2 = iArr[1];
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("startX", v.a(t.b().g(), iArr[0]));
                            jSONObject.put("startY", v.a(t.b().g(), iArr[1]));
                            str = jSONObject.toString();
                        } catch (Throwable th) {
                            th.getMessage();
                        }
                        String encodeToString = Base64.encodeToString(str.toString().getBytes(), 2);
                        h.a();
                        h.a((WebView) AnythinkClickMiniCardView.this.s, "webviewshow", encodeToString);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

    private void a(View view) {
        int f = v.f(this.f5301a);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((f * 0.7f) + 0.5f);
        layoutParams.height = (int) ((v.e(this.f5301a) * 0.7f) + 0.5f);
        view.setLayoutParams(layoutParams);
    }

    public void setAnythinkClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setAnythinkClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.B = true;
        resizeMiniCard(i3, i4);
    }

    public void resizeMiniCard(int i, int i2) {
        View findViewById = ((Activity) this.f5301a).getWindow().findViewById(R.id.content);
        int width = findViewById.getWidth();
        int height = findViewById.getHeight();
        if (i <= 0 || i2 <= 0 || i > width || i2 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.p.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.p.setLayoutParams(layoutParams);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(v.b(getContext(), i));
            gradientDrawable.setColor(-1);
            this.s.setBackground(gradientDrawable);
            this.s.setClipToOutline(true);
        }
    }
}
