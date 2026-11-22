package com.qumeng.overseas.advlib.__remote__.ui.incite.interaction;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* loaded from: classes17.dex */
public class a extends FrameLayout {
    private List<ImageView> t;
    private int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.incite.interaction.a$a, reason: collision with other inner class name */
    class C0843a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f13166a;

        C0843a(View view) {
            this.f13166a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.removeView(this.f13166a);
            animator.removeListener(this);
        }
    }

    public a(Context context) {
        super(context);
        this.t = new ArrayList();
        this.u = s.a(100.0f);
        this.v = 3;
        this.w = 3;
        this.x = 8000;
        this.y = s.a(80.0f);
        this.z = s.a(180.0f);
    }

    public void a(Bitmap bitmap) {
        removeAllViews();
        this.t.clear();
        setLayerType(2, null);
        int c = (s.c(getContext()) + this.y) / 4;
        int i = this.u * (-4);
        for (int i2 = 0; i2 < 3; i2++) {
            int nextInt = new Random().nextInt(3);
            int i3 = 0;
            while (i3 < 3) {
                ImageView imageView = new ImageView(getContext());
                int nextInt2 = (this.u * (new Random().nextInt(3) + 8)) / 10;
                imageView.setLayoutParams(new FrameLayout.LayoutParams(nextInt2, nextInt2));
                int i4 = i3 + 1;
                imageView.setX(((i4 * c) - (nextInt2 / 2)) - (this.y / 2));
                imageView.setY(i + (i2 * ((this.u / 4.0f) + this.z)));
                imageView.setImageBitmap(bitmap);
                addView(imageView);
                this.t.add(imageView);
                a(imageView, 8000);
                if (i3 == nextInt) {
                    a(imageView);
                }
                i3 = i4;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = new ArrayList();
        this.u = s.a(100.0f);
        this.v = 3;
        this.w = 3;
        this.x = 8000;
        this.y = s.a(80.0f);
        this.z = s.a(180.0f);
    }

    public void a(View view, int i) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, view.getY(), (int) (s.b(getContext()) + (this.u * 4) + view.getY())));
        ofPropertyValuesHolder.setDuration((int) (i * ((Math.random() * 0.08d) + 0.92d)));
        ofPropertyValuesHolder.addListener(new C0843a(view));
        ofPropertyValuesHolder.start();
    }

    private void a(ImageView imageView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ROTATION, 0.0f, -15.0f, 15.0f, -15.0f);
        ofFloat.setDuration(800L);
        ofFloat.setRepeatMode(2);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        ofFloat.setRepeatCount(-1);
        ofFloat.start();
    }

    private void a() {
        List<ImageView> list = this.t;
        if (list != null) {
            Iterator<ImageView> it = list.iterator();
            while (it.hasNext()) {
                it.next().clearAnimation();
            }
        }
    }
}
