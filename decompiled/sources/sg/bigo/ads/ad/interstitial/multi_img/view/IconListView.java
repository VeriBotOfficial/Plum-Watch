package sg.bigo.ads.ad.interstitial.multi_img.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.f;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes7.dex */
public class IconListView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19279a;
    private List<a> b;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f19280a;
        public final View b;
        public boolean c;
        public final LinearLayout d;
        public final TextView e;
        public final ImageView f;
        public final LinearLayout g;
        public final TextView h;
        public final ImageView i;
        public final f.a j;
        public final String k;

        public a(Context context, f.a aVar, String str, boolean z) {
            this.f19280a = context;
            View a2 = sg.bigo.ads.common.utils.a.a(context, R.layout.bigo_ad_layout_ic_item, null, false);
            this.b = a2;
            this.c = z;
            LinearLayout linearLayout = (LinearLayout) a2.findViewById(R.id.bigo_ad_ic_title_layout);
            this.d = linearLayout;
            this.e = (TextView) a2.findViewById(R.id.bigo_ad_ic_title_txt);
            this.f = (ImageView) a2.findViewById(R.id.bigo_ad_ic_title_iv);
            linearLayout.setTag(26);
            LinearLayout linearLayout2 = (LinearLayout) a2.findViewById(R.id.bigo_ad_ic_desc_layout);
            this.g = linearLayout2;
            this.h = (TextView) a2.findViewById(R.id.bigo_ad_ic_desc_txt);
            this.i = (ImageView) a2.findViewById(R.id.bigo_ad_ic_desc_iv);
            linearLayout2.setTag(26);
            this.j = aVar;
            this.k = str;
            a();
        }

        public void a() {
            if (this.j.r == 0) {
                this.e.setVisibility(8);
            } else {
                this.e.setVisibility(0);
                this.e.setText(this.j.r);
                if (this.c) {
                    this.e.setTextColor(-1);
                }
            }
            if (this.j.s == 0) {
                this.f.setVisibility(8);
            } else {
                this.f.setVisibility(0);
                this.f.setImageResource(this.j.s);
            }
            if (this.j.t == 0) {
                this.h.setVisibility(8);
            } else {
                this.h.setVisibility(0);
                this.h.setText(this.j.t);
                if (this.c) {
                    this.h.setTextColor(q.b("#9AFFFFFF", -1));
                }
            }
            if (this.j.u == 0) {
                this.i.setVisibility(8);
            } else {
                this.i.setVisibility(0);
                this.i.setImageResource(this.j.u);
            }
        }
    }

    public static class b extends a {
        public b(Context context, f.a aVar, String str, boolean z) {
            super(context, aVar, str, z);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.e.setVisibility(0);
            this.e.setText(sg.bigo.ads.common.utils.a.a(this.f19280a, this.j.r, sg.bigo.ads.ad.b.f.a(this.k)));
            if (this.c) {
                this.e.setTextColor(-1);
            }
            this.f.setVisibility(8);
            this.h.setVisibility(0);
            this.h.setText(this.j.t);
            if (this.c) {
                this.h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.i.setVisibility(8);
        }
    }

    public static class c extends a {
        public c(Context context, f.a aVar, String str, boolean z) {
            super(context, aVar, str, z);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.e.setVisibility(8);
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.s);
            this.h.setVisibility(0);
            this.h.setText(this.j.t);
            if (this.c) {
                this.h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.i.setVisibility(0);
            this.i.setImageResource(this.j.u);
        }
    }

    public static class d extends a {
        public d(Context context, f.a aVar, String str, boolean z) {
            super(context, aVar, str, z);
        }

        @Override // sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a
        public final void a() {
            this.e.setVisibility(0);
            this.e.setText(sg.bigo.ads.common.utils.a.a(this.f19280a, this.j.r, sg.bigo.ads.ad.b.f.c(this.k)));
            if (this.c) {
                this.e.setTextColor(-1);
            }
            this.f.setVisibility(0);
            this.f.setImageResource(this.j.s);
            this.h.setVisibility(0);
            this.h.setText(sg.bigo.ads.ad.b.f.b(this.k) + " " + sg.bigo.ads.common.utils.a.a(this.f19280a, this.j.t, new Object[0]));
            if (this.c) {
                this.h.setTextColor(q.b("#9AFFFFFF", -1));
            }
            this.i.setVisibility(8);
        }
    }

    public IconListView(Context context) {
        this(context, null);
    }

    public IconListView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IconListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19279a = false;
        setOrientation(0);
        setGravity(17);
    }

    private List<a> a(Context context, int i, String str) {
        c cVar;
        ArrayList arrayList = new ArrayList();
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            List<f.a> a2 = f.a.a(i);
            Random random = new Random();
            while (!a2.isEmpty()) {
                arrayList.add(new a(context, a2.remove(random.nextInt(a2.size())), str, this.f19279a));
            }
            return arrayList;
        }
        if (this.f19279a) {
            arrayList.add(new d(context, f.a.STAR_WHITE, str, this.f19279a));
            arrayList.add(new b(context, f.a.DOWNLOAD_NUM_WHITE, str, this.f19279a));
            cVar = new c(context, f.a.Everyone_WHITE, str, this.f19279a);
        } else {
            arrayList.add(new d(context, f.a.STAR, str, this.f19279a));
            arrayList.add(new b(context, f.a.DOWNLOAD_NUM, str, this.f19279a));
            cVar = new c(context, f.a.Everyone, str, this.f19279a);
        }
        arrayList.add(cVar);
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x003c, code lost:
    
        if (r8.f19279a != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0049, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0046, code lost:
    
        if (r8.f19279a != false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(sg.bigo.ads.ad.interstitial.f r9) {
        /*
            r8 = this;
            r8.removeAllViews()
            if (r9 != 0) goto L7
            goto L9b
        L7:
            android.content.Context r0 = r8.getContext()
            int r1 = r9.f19225a
            r2 = 0
            r3 = 1
            if (r1 == r3) goto L51
            r4 = 4
            r5 = 2
            if (r1 == r5) goto L3f
            r6 = 3
            r7 = 8
            if (r1 == r6) goto L2e
            if (r1 == r4) goto L1e
            goto L9b
        L1e:
            boolean r1 = r9.d
            if (r1 == 0) goto L9b
            boolean r1 = r8.f19279a
            if (r1 == 0) goto L27
            r5 = r7
        L27:
            java.lang.String r9 = r9.c
            java.util.List r9 = r8.a(r0, r5, r9)
            goto L5b
        L2e:
            boolean r1 = r9.d
            if (r1 == 0) goto L3a
            boolean r1 = r8.f19279a
            if (r1 == 0) goto L38
            r4 = r7
            goto L4a
        L38:
            r4 = r5
            goto L4a
        L3a:
            boolean r1 = r8.f19279a
            if (r1 == 0) goto L49
            goto L4a
        L3f:
            boolean r1 = r9.d
            if (r1 == 0) goto L44
            goto L55
        L44:
            boolean r1 = r8.f19279a
            if (r1 == 0) goto L49
            goto L4a
        L49:
            r4 = r3
        L4a:
            java.lang.String r9 = r9.c
            java.util.List r9 = r8.a(r0, r4, r9)
            goto L5b
        L51:
            boolean r1 = r9.d
            if (r1 == 0) goto L9b
        L55:
            java.lang.String r9 = r9.c
            java.util.List r9 = r8.a(r0, r2, r9)
        L5b:
            r8.b = r9
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r9 = r8.b
            boolean r9 = sg.bigo.ads.common.utils.k.a(r9)
            if (r9 == 0) goto L66
            goto L9b
        L66:
            r9 = r2
        L67:
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r0 = r8.b
            int r0 = r0.size()
            if (r9 >= r0) goto L9b
            if (r9 <= 0) goto L81
            android.content.Context r0 = r8.getContext()
            boolean r1 = r8.f19279a
            if (r1 == 0) goto L7c
            int r1 = sg.bigo.ads.R.layout.bigo_ad_layout_space
            goto L7e
        L7c:
            int r1 = sg.bigo.ads.R.layout.bigo_ad_layout_space_black
        L7e:
            sg.bigo.ads.common.utils.a.a(r0, r1, r8, r3)
        L81:
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r1 = -2
            r0.<init>(r2, r1)
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.weight = r1
            java.util.List<sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a> r1 = r8.b
            java.lang.Object r1 = r1.get(r9)
            sg.bigo.ads.ad.interstitial.multi_img.view.IconListView$a r1 = (sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a) r1
            android.view.View r1 = r1.b
            r8.addView(r1, r0)
            int r9 = r9 + 1
            goto L67
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.view.IconListView.a(sg.bigo.ads.ad.interstitial.f):void");
    }

    public List<a> getItems() {
        return this.b;
    }

    public void setThemeWhite(boolean z) {
        this.f19279a = z;
    }
}
