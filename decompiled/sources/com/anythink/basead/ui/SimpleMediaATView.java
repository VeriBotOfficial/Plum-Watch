package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.anythink.core.common.h.w;
import com.anythink.core.common.res.b;
import com.anythink.core.common.res.e;
import com.anythink.core.common.v.am;
import com.anythink.core.common.v.h;
import com.anythink.core.common.v.q;

/* loaded from: classes11.dex */
public class SimpleMediaATView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    ImageView f3117a;
    ImageView b;
    private int c;
    private int d;
    private int e;
    private Bitmap f;

    public SimpleMediaATView(Context context) {
        this(context, null);
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleMediaATView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void initView(w wVar) {
        LayoutInflater.from(getContext()).inflate(q.a(getContext(), "myoffer_simple_media_ad_view", "layout"), this);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.e = max;
        this.c = max;
        this.d = max;
        this.b = (ImageView) findViewById(q.a(getContext(), "myoffer_simple_background", "id"));
        ImageView imageView = (ImageView) findViewById(q.a(getContext(), "myoffer_simple_main_image", "id"));
        this.f3117a = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        String B = wVar.B();
        try {
            com.anythink.core.common.res.b.a(getContext()).a(new e(1, B), new AnonymousClass1(B));
        } catch (Throwable unused) {
        }
    }

    /* renamed from: com.anythink.basead.ui.SimpleMediaATView$1, reason: invalid class name */
    final class AnonymousClass1 implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f3118a;

        @Override // com.anythink.core.common.res.b.a
        public final void onFail(String str, String str2) {
        }

        AnonymousClass1(String str) {
            this.f3118a = str;
        }

        @Override // com.anythink.core.common.res.b.a
        public final void onSuccess(String str, final Bitmap bitmap) {
            if (TextUtils.equals(str, this.f3118a)) {
                SimpleMediaATView.this.post(new Runnable() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        SimpleMediaATView.this.f = bitmap;
                        SimpleMediaATView.this.a(bitmap);
                        SimpleMediaATView.this.f3117a.setImageBitmap(bitmap);
                        SimpleMediaATView.this.f3117a.setVisibility(0);
                        h.a(SimpleMediaATView.this.getContext(), bitmap, new h.a() { // from class: com.anythink.basead.ui.SimpleMediaATView.1.1.1
                            @Override // com.anythink.core.common.v.h.a
                            public final void a() {
                            }

                            @Override // com.anythink.core.common.v.h.a
                            public final void a(Bitmap bitmap2) {
                                SimpleMediaATView.this.b.setImageBitmap(bitmap2);
                                SimpleMediaATView.this.b.setVisibility(0);
                            }
                        });
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bitmap bitmap) {
        int i;
        int i2;
        int[] a2 = am.a(this.c, this.d, bitmap.getWidth() / bitmap.getHeight());
        ViewGroup.LayoutParams layoutParams = this.f3117a.getLayoutParams();
        layoutParams.width = a2[0];
        layoutParams.height = a2[1];
        this.f3117a.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (layoutParams2 != null) {
            if (layoutParams2.width == -2) {
                i = a2[0];
            } else {
                i = this.c;
            }
            if (layoutParams2.height == -2) {
                i2 = a2[1];
            } else {
                i2 = this.d;
            }
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                View childAt = getChildAt(i3);
                if (!childAt.equals(this.f3117a)) {
                    if (childAt != null) {
                        ViewGroup.LayoutParams layoutParams3 = childAt.getLayoutParams();
                        layoutParams3.width = i;
                        childAt.setLayoutParams(layoutParams3);
                    }
                    if (childAt != null) {
                        ViewGroup.LayoutParams layoutParams4 = childAt.getLayoutParams();
                        layoutParams4.height = i2;
                        childAt.setLayoutParams(layoutParams4);
                    }
                }
            }
        }
    }

    private static void a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    private static void b(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setLayoutParams(android.view.ViewGroup.LayoutParams r6) {
        /*
            r5 = this;
            super.setLayoutParams(r6)
            int r0 = r6.width
            r1 = 1
            r2 = -2
            r3 = -1
            if (r0 == r3) goto L1b
            int r0 = r6.width
            if (r0 != r2) goto Lf
            goto L1b
        Lf:
            int r0 = r5.c
            int r4 = r6.width
            if (r0 == r4) goto L1f
            int r0 = r6.width
            r5.c = r0
            r0 = r1
            goto L20
        L1b:
            int r0 = r5.e
            r5.c = r0
        L1f:
            r0 = 0
        L20:
            int r4 = r6.height
            if (r4 == r3) goto L34
            int r3 = r6.height
            if (r3 != r2) goto L29
            goto L34
        L29:
            int r2 = r5.d
            int r3 = r6.height
            if (r2 == r3) goto L38
            int r6 = r6.height
            r5.d = r6
            goto L39
        L34:
            int r6 = r5.e
            r5.d = r6
        L38:
            r1 = r0
        L39:
            android.graphics.Bitmap r6 = r5.f
            if (r6 == 0) goto L42
            if (r1 == 0) goto L42
            r5.a(r6)
        L42:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.SimpleMediaATView.setLayoutParams(android.view.ViewGroup$LayoutParams):void");
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        boolean z;
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        Bitmap bitmap = this.f;
        if (bitmap == null) {
            if (size != 0 && size < this.c) {
                this.c = size;
            }
            if (size2 == 0 || size2 >= this.d) {
                return;
            }
            this.d = size2;
            return;
        }
        boolean z2 = true;
        if (size == 0 || size >= this.c) {
            z = false;
        } else {
            this.c = size;
            z = true;
        }
        if (size2 == 0 || size2 >= this.d) {
            z2 = z;
        } else {
            this.d = size2;
        }
        if (z2) {
            a(bitmap);
        }
    }
}
