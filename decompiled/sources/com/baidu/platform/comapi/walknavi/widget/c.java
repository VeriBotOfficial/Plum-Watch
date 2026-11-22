package com.baidu.platform.comapi.walknavi.widget;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import com.baidu.bikenavi.R;
import com.baidu.platform.comapi.bikenavi.setting.BWNaviConst;

/* compiled from: WalkGuidanceInfoView.java */
/* loaded from: classes13.dex */
public class c extends com.baidu.platform.comapi.walknavi.k.f.b {
    private Activity b;
    private ImageView c;
    private TextView d;
    private TextView e;
    private com.baidu.mapapi.walknavi.model.c f;

    public void a(int i, String str) {
        if (i == R.drawable.wn_gps_blue) {
            this.d.setVisibility(8);
            this.e.setVisibility(4);
        } else {
            this.d.setVisibility(0);
        }
        if (BWNaviConst.f8506a) {
            this.c.setImageDrawable(com.baidu.platform.comapi.wnplatform.p.p.a.a(this.b, i));
        } else {
            this.c.setImageResource(i);
        }
        if ((i == R.drawable.wn_start_blue || i == R.drawable.wn_start_white) && "步行导航开始".equals(str)) {
            this.d.setText("步行导航开始");
        } else {
            this.d.setText(str);
        }
    }

    public void a(com.baidu.mapapi.walknavi.model.c cVar) {
        this.f = cVar;
    }
}
