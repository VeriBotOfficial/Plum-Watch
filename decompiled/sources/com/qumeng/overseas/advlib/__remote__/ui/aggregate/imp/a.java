package com.qumeng.overseas.advlib.__remote__.ui.aggregate.imp;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.v;
import com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager.BannerViewPager;
import com.qumeng.overseas.advlib.__remote__.ui.aggregate.viewpager.ViewPagerAdapter;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.b;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.bean.JsonStyleBean;
import com.qumeng.overseas.advlib.__remote__.ui.elements.j;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import com.qumeng.overseas.advlib.ui.banner.ADBanner;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public class a extends oqmj.a {
    private static final String h = "AggregateScrollBannersView";
    private ViewGroup g;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.aggregate.imp.a$a, reason: collision with other inner class name */
    class ViewOnClickListenerC0815a implements View.OnClickListener {
        final /* synthetic */ ICliBundle t;

        ViewOnClickListenerC0815a(ICliBundle iCliBundle) {
            this.t = iCliBundle;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Bundle bundle;
            if (a.this.d != null) {
                ICliBundle iCliBundle = this.t;
                String string = (iCliBundle == null || (bundle = iCliBundle.tbundle) == null) ? "" : bundle.getString("adslotid");
                Bundle bundle2 = new Bundle();
                bundle2.putString("adslot_id", string);
                a.this.d.onAdEvent(2, bundle2);
            }
        }
    }

    public a(Context context, List<ICliBundle> list, String str) {
        super(context, list, str);
    }

    @Override // oqmj.b
    public void a(b.c cVar) {
        b bVar;
        View a2;
        JsonStyleBean a3 = com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.cache.a.a(this.b);
        if (a3 == null || (a2 = (bVar = new b(this.c, null, null)).a(a3)) == null) {
            return;
        }
        cVar.onSuccess(a2);
        View a4 = bVar.a("rootView");
        if (a4 instanceof ViewGroup) {
            this.g = (ViewGroup) a4;
            a(this.f18757a);
        }
    }

    public a(Context context, List<ICliBundle> list, String str, IMultiAdObject.ADStateListener aDStateListener) {
        super(context, list, str, aDStateListener);
    }

    private void a(List<ICliBundle> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(a(list.get(i)));
        }
        String str = "";
        if (!list.isEmpty() && list.get(0).tbundle != null) {
            str = list.get(0).tbundle.getString("exp_feature", "");
        }
        BannerViewPager bannerViewPager = new BannerViewPager(this.c);
        bannerViewPager.setAutoRolling(!v.a(str, j.z));
        bannerViewPager.setAdapter(new ViewPagerAdapter(arrayList));
        this.g.addView(bannerViewPager);
    }

    private View a(ICliBundle iCliBundle) {
        ADBanner aDBanner = new ADBanner(this.c, null);
        aDBanner.UpdateView(iCliBundle);
        ((ImageView) com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.a.a((View) aDBanner, "image_close")).setOnClickListener(new ViewOnClickListenerC0815a(iCliBundle));
        return aDBanner;
    }
}
