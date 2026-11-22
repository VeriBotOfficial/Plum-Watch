package sg.bigo.ads.ad.interstitial.e;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.Space;
import java.util.ArrayList;
import java.util.List;
import sg.bigo.ads.R;
import sg.bigo.ads.api.NativeAd;

/* loaded from: classes7.dex */
public class e extends d {
    public e(sg.bigo.ads.ad.interstitial.e.b.a aVar, List<NativeAd> list, sg.bigo.ads.ad.interstitial.e.a.b bVar) {
        super(aVar, list, bVar);
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    protected final b a() {
        return new b(sg.bigo.ads.common.utils.e.a(this.d, 8), this.h, this.g);
    }

    @Override // sg.bigo.ads.ad.interstitial.e.d
    protected final List<View> b(a aVar) {
        c();
        this.f19224a.setOrientation(0);
        int size = this.b.size();
        if (size == 0) {
            return new ArrayList();
        }
        if (size == 1) {
            this.f = true;
            View a2 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_des_style1, this.f19224a, false);
            ArrayList arrayList = new ArrayList();
            arrayList.add(a2);
            a(16, 10, 16, 14);
            this.f19224a.addView(a2, new LinearLayout.LayoutParams(-1, sg.bigo.ads.common.utils.e.a(this.d, 60)));
            return arrayList;
        }
        if (size == 2) {
            View a3 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1, this.f19224a, false);
            View a4 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_cta_style1, this.f19224a, false);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(a3);
            arrayList2.add(a4);
            a(16, 12, 16, 12);
            int a5 = sg.bigo.ads.common.utils.e.a(this.d, 60);
            this.f19224a.addView(a3, new LinearLayout.LayoutParams(0, a5, 1.0f));
            this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(this.d, 15), a5));
            this.f19224a.addView(a4, new LinearLayout.LayoutParams(0, a5, 1.0f));
            return arrayList2;
        }
        if (size == 3) {
            View a6 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
            View a7 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
            View a8 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
            ArrayList arrayList3 = new ArrayList();
            arrayList3.add(a6);
            arrayList3.add(a7);
            arrayList3.add(a8);
            a(0, 12, 0, 8);
            int a9 = sg.bigo.ads.common.utils.e.a(this.d, 72);
            this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f19224a.addView(a6, new LinearLayout.LayoutParams(a9, -2));
            this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f19224a.addView(a7, new LinearLayout.LayoutParams(a9, -2));
            this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            this.f19224a.addView(a8, new LinearLayout.LayoutParams(a9, -2));
            this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
            return arrayList3;
        }
        View a10 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
        View a11 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
        View a12 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
        View a13 = sg.bigo.ads.common.utils.a.a(this.d, R.layout.bigo_ad_layout_interstitial_icon_item_style, this.f19224a, false);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(a10);
        arrayList4.add(a11);
        arrayList4.add(a12);
        arrayList4.add(a13);
        a(0, 12, 0, 8);
        int a14 = sg.bigo.ads.common.utils.e.a(this.d, 72);
        this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        this.f19224a.addView(a10, new LinearLayout.LayoutParams(a14, -2));
        this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        this.f19224a.addView(a11, new LinearLayout.LayoutParams(a14, -2));
        this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        this.f19224a.addView(a12, new LinearLayout.LayoutParams(a14, -2));
        this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        this.f19224a.addView(a13, new LinearLayout.LayoutParams(a14, -2));
        this.f19224a.addView(new Space(this.d), new LinearLayout.LayoutParams(0, 60, 1.0f));
        return arrayList4;
    }
}
