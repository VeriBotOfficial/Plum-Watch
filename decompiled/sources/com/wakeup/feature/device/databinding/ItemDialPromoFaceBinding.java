package com.wakeup.feature.device.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.wakeup.feature.device.R;

/* loaded from: classes3.dex */
public final class ItemDialPromoFaceBinding implements ViewBinding {
    public final CardView cvFace;
    public final ImageView ivFaceCheck;
    public final ImageView ivFacePreview;
    private final CardView rootView;
    public final TextView tvFaceName;
    public final TextView tvFaceNewPrice;
    public final TextView tvFaceOldPrice;

    private ItemDialPromoFaceBinding(CardView cardView, CardView cardView2, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        this.rootView = cardView;
        this.cvFace = cardView2;
        this.ivFaceCheck = imageView;
        this.ivFacePreview = imageView2;
        this.tvFaceName = textView;
        this.tvFaceNewPrice = textView2;
        this.tvFaceOldPrice = textView3;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemDialPromoFaceBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemDialPromoFaceBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_dial_promo_face, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemDialPromoFaceBinding bind(View view) {
        CardView cardView = (CardView) view;
        int i = R.id.iv_face_check;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(view, i);
        if (imageView != null) {
            i = R.id.iv_face_preview;
            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(view, i);
            if (imageView2 != null) {
                i = R.id.tv_face_name;
                TextView textView = (TextView) ViewBindings.findChildViewById(view, i);
                if (textView != null) {
                    i = R.id.tv_face_new_price;
                    TextView textView2 = (TextView) ViewBindings.findChildViewById(view, i);
                    if (textView2 != null) {
                        i = R.id.tv_face_old_price;
                        TextView textView3 = (TextView) ViewBindings.findChildViewById(view, i);
                        if (textView3 != null) {
                            return new ItemDialPromoFaceBinding(cardView, cardView, imageView, imageView2, textView, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
