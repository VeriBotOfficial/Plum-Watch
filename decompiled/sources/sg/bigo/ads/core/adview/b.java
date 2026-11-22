package sg.bigo.ads.core.adview;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.api.core.c;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.view.AdImageView;
import sg.bigo.ads.core.adview.e;
import sg.bigo.ads.core.adview.e.b;

/* loaded from: classes9.dex */
public final class b extends c {
    public b(sg.bigo.ads.api.a<?> aVar) {
        super(aVar);
    }

    public final void a(sg.bigo.ads.api.core.c cVar, final String str) {
        if (cVar == null) {
            return;
        }
        this.f19943a.removeAllViews();
        c.e B = cVar.B();
        AdImageView adImageView = new AdImageView(this.f19943a.getContext());
        adImageView.setIconTag(true);
        String a2 = B != null ? B.a() : "";
        final String b = B != null ? B.b() : "";
        final String d = B != null ? B.d() : "";
        final String e = B != null ? B.e() : "";
        final String g = B != null ? B.g() : "";
        final String h = B != null ? B.h() : "";
        adImageView.setOnClickListener(new View.OnClickListener() { // from class: sg.bigo.ads.core.adview.b.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                sg.bigo.ads.api.a<?> aVar = b.this.f19943a;
                String str2 = b;
                String str3 = str;
                String str4 = d;
                String str5 = e;
                String str6 = g;
                String str7 = h;
                if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && TextUtils.isEmpty(str3) && TextUtils.isEmpty(str6) && TextUtils.isEmpty(str7)) {
                    return;
                }
                e.a aVar2 = new e.a(aVar);
                aVar2.b = str2;
                aVar2.c = str3;
                aVar2.d = str4;
                aVar2.e = str5;
                aVar2.f = str6;
                aVar2.g = str7;
                e eVar = new e(aVar2, (byte) 0);
                Activity a3 = sg.bigo.ads.common.utils.c.a(eVar.f19944a.f19945a);
                if (a3 == null) {
                    sg.bigo.ads.common.t.a.b("Feedback", "Cannot find Activity from container view");
                    return;
                }
                if (e.b) {
                    sg.bigo.ads.common.t.a.b("Feedback", "Feedback dialog is showing. Cannot show again.");
                    return;
                }
                e.b bVar = eVar.new b(a3);
                if (q.a((CharSequence) eVar.f19944a.b) && q.a((CharSequence) eVar.f19944a.c) && q.a((CharSequence) eVar.f19944a.d) && q.a((CharSequence) eVar.f19944a.e) && q.a((CharSequence) eVar.f19944a.f) && q.a((CharSequence) eVar.f19944a.g)) {
                    return;
                }
                bVar.show();
                e.b = true;
            }
        });
        if (TextUtils.isEmpty(a2)) {
            this.f19943a.setVisibility(8);
            return;
        }
        adImageView.a(a2, cVar.al());
        adImageView.setLayoutParams(new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(this.f19943a.getContext(), 16), sg.bigo.ads.common.utils.e.a(this.f19943a.getContext(), 16), 17));
        adImageView.setTag("ad_options_real_view");
        a(adImageView);
    }
}
