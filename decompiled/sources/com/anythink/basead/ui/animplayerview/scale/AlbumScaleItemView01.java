package com.anythink.basead.ui.animplayerview.scale;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.anythink.core.common.v.q;
import java.util.List;

/* loaded from: classes11.dex */
public class AlbumScaleItemView01 extends BaseAlbumScaleItemView {
    private ImageView f;
    private ImageView g;
    private ImageView h;
    private ImageView i;

    public AlbumScaleItemView01(Context context) {
        this(context, null);
    }

    public AlbumScaleItemView01(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumScaleItemView01(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    protected final int a(Context context) {
        return q.a(context, "myoffer_scale_first", "layout");
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView
    public void initView(View view) {
        super.initView(view);
        Context context = getContext();
        this.f = (ImageView) view.findViewById(q.a(context, "iv_left_top", "id"));
        this.g = (ImageView) view.findViewById(q.a(context, "iv_left_bottom", "id"));
        this.h = (ImageView) view.findViewById(q.a(context, "iv_right_top", "id"));
        this.i = (ImageView) view.findViewById(q.a(context, "iv_right_bottom", "id"));
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void setBitmapResources(List<Bitmap> list) {
        if (list == null || list.size() < 4) {
            return;
        }
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.setImageBitmap(list.get(0));
        }
        ImageView imageView2 = this.i;
        if (imageView2 != null) {
            imageView2.setImageBitmap(list.get(1));
        }
        ImageView imageView3 = this.g;
        if (imageView3 != null) {
            imageView3.setImageBitmap(list.get(2));
        }
        ImageView imageView4 = this.f;
        if (imageView4 != null) {
            imageView4.setImageBitmap(list.get(3));
        }
    }

    @Override // com.anythink.basead.ui.animplayerview.scale.BaseAlbumScaleItemView, com.anythink.basead.ui.animplayerview.b
    public void start() {
        if (this.b == null) {
            this.b = new AnimatorSet();
            ImageView imageView = this.f;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, "translationX", 0.0f, -imageView.getX());
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f, "translationY", 0.0f, (float) (-Math.cos(r4.getY())));
            ImageView imageView2 = this.g;
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView2, "translationX", 0.0f, -imageView2.getX());
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(this.g, "translationY", 0.0f, (float) Math.cos(r10.getY()));
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(this.h, "translationX", 0.0f, a() - this.h.getX());
            ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(this.h, "translationY", 0.0f, -((float) Math.cos(r12.getY())));
            ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(this.i, "translationX", 0.0f, a() - this.i.getX());
            ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(this.i, "translationY", 0.0f, (float) Math.cos(b() - this.i.getY()));
            ObjectAnimator ofFloat9 = ObjectAnimator.ofFloat(this, "scaleX", 1.0f, 5.0f);
            ObjectAnimator ofFloat10 = ObjectAnimator.ofFloat(this, "scaleY", 1.0f, 5.0f);
            this.b.setDuration(2500L);
            this.b.setInterpolator(new AccelerateDecelerateInterpolator());
            this.b.playTogether(ofFloat9, ofFloat10, ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat6, ofFloat5, ofFloat7, ofFloat8);
            if (this.e > 0) {
                this.b.setStartDelay(this.e);
            }
        }
        this.b.start();
    }
}
