package sg.bigo.ads.ad.interstitial.multi_img;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.ViewFlow;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    final ViewGroup f19269a;
    final ViewFlow d;
    final int e;
    private final sg.bigo.ads.ad.interstitial.d h;
    int b = -1;
    int c = -1;
    public boolean f = true;
    float g = Float.MIN_VALUE;

    public a(ViewGroup viewGroup, ViewFlow viewFlow, sg.bigo.ads.ad.interstitial.d dVar, int i) {
        this.f19269a = viewGroup;
        this.d = viewFlow;
        this.h = dVar;
        this.e = i;
    }

    public static void a(ViewGroup viewGroup, BitmapDrawable bitmapDrawable, BitmapDrawable bitmapDrawable2) {
        a(viewGroup, "adview_background_main_tag", bitmapDrawable);
        a(viewGroup, "adview_background_second_tag", bitmapDrawable2);
    }

    public static void a(ViewGroup viewGroup, Object obj, BitmapDrawable bitmapDrawable) {
        ImageView imageView;
        View findViewWithTag = viewGroup.findViewWithTag(obj);
        if (findViewWithTag instanceof ImageView) {
            imageView = (ImageView) findViewWithTag;
        } else {
            Context context = viewGroup.getContext();
            if (context != null) {
                ImageView imageView2 = new ImageView(context);
                imageView2.setTag(obj);
                imageView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                u.a(imageView2, viewGroup, null, 0);
                imageView = imageView2;
            } else {
                imageView = null;
            }
        }
        if (imageView != null) {
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageDrawable(bitmapDrawable);
        }
    }

    public final void a(final int i) {
        if (this.f) {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.interstitial.multi_img.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    a aVar = a.this;
                    int i2 = i;
                    if (i2 == aVar.b && i2 == aVar.c) {
                        aVar.b(i2);
                    }
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void a(sg.bigo.ads.ad.interstitial.multi_img.view.d r3, float r4, int r5) {
        /*
            r2 = this;
            int r0 = r2.b
            if (r5 == r0) goto L5
            goto L60
        L5:
            int r0 = r2.e
            boolean r0 = r3.d(r0)
            if (r0 == 0) goto L10
            int r3 = r3.n
            goto L12
        L10:
            int r3 = r3.o
        L12:
            r2.g = r4
            r1 = 0
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 <= 0) goto L1c
            int r5 = r5 + (-1)
            goto L1e
        L1c:
            int r5 = r5 + 1
        L1e:
            r2.c = r5
            sg.bigo.ads.common.view.ViewFlow r5 = r2.d
            int r1 = r2.c
            android.view.View r5 = r5.a(r1)
            if (r5 == 0) goto L42
            int r1 = sg.bigo.ads.ad.interstitial.multi_img.view.d.e
            java.lang.Object r5 = r5.getTag(r1)
            boolean r1 = r5 instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d
            if (r1 == 0) goto L42
            sg.bigo.ads.ad.interstitial.multi_img.view.d r5 = (sg.bigo.ads.ad.interstitial.multi_img.view.d) r5
            if (r0 == 0) goto L3b
            int r5 = r5.n
            goto L3d
        L3b:
            int r5 = r5.o
        L3d:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            goto L43
        L42:
            r5 = 0
        L43:
            float r4 = java.lang.Math.abs(r4)
            if (r5 != 0) goto L4b
            r5 = r3
            goto L4f
        L4b:
            int r5 = r5.intValue()
        L4f:
            int r3 = sg.bigo.ads.common.w.b.a(r4, r3, r5)
            sg.bigo.ads.ad.interstitial.d r4 = r2.h
            int r3 = r4.a(r3)
            if (r0 == 0) goto L60
            android.view.ViewGroup r4 = r2.f19269a
            r4.setBackgroundColor(r3)
        L60:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.interstitial.multi_img.a.a(sg.bigo.ads.ad.interstitial.multi_img.view.d, float, int):void");
    }

    public final void b(int i) {
        if (this.f) {
            View a2 = this.d.a(i);
            Object tag = a2.getTag(sg.bigo.ads.ad.interstitial.multi_img.view.d.e);
            if (tag instanceof sg.bigo.ads.ad.interstitial.multi_img.view.d) {
                sg.bigo.ads.ad.interstitial.multi_img.view.d dVar = (sg.bigo.ads.ad.interstitial.multi_img.view.d) tag;
                this.b = i;
                this.g = Float.MIN_VALUE;
                this.c = i;
                if (dVar.d(this.e)) {
                    this.f19269a.setBackgroundColor(this.h.a(dVar.n));
                    return;
                }
                if (dVar.c(this.e)) {
                    this.h.a(dVar.o);
                    Bitmap bitmap = dVar.p;
                    int i2 = dVar.f19289q;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(a2.getResources(), bitmap);
                    bitmapDrawable.setAlpha(i2);
                    ViewGroup viewGroup = this.f19269a;
                    if (bitmap == null) {
                        bitmapDrawable = null;
                    }
                    a(viewGroup, bitmapDrawable, (BitmapDrawable) null);
                }
            }
        }
    }
}
