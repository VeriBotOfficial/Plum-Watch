package com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.secmtp.sdk.nativead.api.ATNativeImageView;
import com.secmtp.sdk.nativead.api.ATNativeMaterial;

/* loaded from: classes17.dex */
public class a {
    private a() {
    }

    protected static Pair<Integer, Integer> a(ATNativeMaterial aTNativeMaterial) {
        if (aTNativeMaterial == null) {
            return Pair.create(-1, -1);
        }
        int videoWidth = aTNativeMaterial.getVideoWidth();
        int videoHeight = aTNativeMaterial.getVideoHeight();
        if (videoWidth > 0 && videoHeight > 0) {
            return Pair.create(Integer.valueOf(videoWidth), Integer.valueOf(videoHeight));
        }
        int mainImageWidth = aTNativeMaterial.getMainImageWidth();
        int mainImageHeight = aTNativeMaterial.getMainImageHeight();
        return (mainImageWidth <= 0 || mainImageHeight <= 0) ? Pair.create(-1, -1) : Pair.create(Integer.valueOf(mainImageWidth), Integer.valueOf(mainImageHeight));
    }

    protected static View b(Context context, ATNativeMaterial aTNativeMaterial) {
        if (aTNativeMaterial == null) {
            return null;
        }
        View adLogoView = aTNativeMaterial.getAdLogoView();
        if (adLogoView != null) {
            return adLogoView;
        }
        Bitmap adLogo = aTNativeMaterial.getAdLogo();
        Context a2 = context == null ? com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a() : context.getApplicationContext();
        if (adLogo != null) {
            ImageView imageView = new ImageView(a2);
            imageView.setImageBitmap(adLogo);
            return imageView;
        }
        String adChoiceIconUrl = aTNativeMaterial.getAdChoiceIconUrl();
        if (TextUtils.isEmpty(adChoiceIconUrl)) {
            return null;
        }
        ATNativeImageView aTNativeImageView = new ATNativeImageView(a2);
        aTNativeImageView.setImage(adChoiceIconUrl);
        return aTNativeImageView;
    }

    public static View a(Context context, ATNativeMaterial aTNativeMaterial) {
        Context applicationContext;
        if (aTNativeMaterial == null) {
            return null;
        }
        View adIconView = aTNativeMaterial.getAdIconView();
        if (adIconView != null) {
            return adIconView;
        }
        if (context == null) {
            applicationContext = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a();
        } else {
            applicationContext = context.getApplicationContext();
        }
        String iconImageUrl = aTNativeMaterial.getIconImageUrl();
        if (TextUtils.isEmpty(iconImageUrl)) {
            return null;
        }
        ATNativeImageView aTNativeImageView = new ATNativeImageView(applicationContext);
        aTNativeImageView.setImage(iconImageUrl);
        return aTNativeImageView;
    }

    public static View a(Context context, ATNativeMaterial aTNativeMaterial, ViewGroup viewGroup) {
        Context applicationContext;
        if (aTNativeMaterial == null) {
            return null;
        }
        View adMediaView = aTNativeMaterial.getAdMediaView(new Object[]{viewGroup});
        if (adMediaView != null) {
            return adMediaView;
        }
        String mainImageUrl = aTNativeMaterial.getMainImageUrl();
        if (TextUtils.isEmpty(mainImageUrl)) {
            return null;
        }
        if (context == null) {
            applicationContext = com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a();
        } else {
            applicationContext = context.getApplicationContext();
        }
        ATNativeImageView aTNativeImageView = new ATNativeImageView(applicationContext);
        aTNativeImageView.setImage(mainImageUrl);
        aTNativeImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return aTNativeImageView;
    }
}
