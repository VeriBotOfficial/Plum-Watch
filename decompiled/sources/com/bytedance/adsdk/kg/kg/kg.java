package com.bytedance.adsdk.kg.kg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.adsdk.kg.bh.bh;
import com.bytedance.adsdk.kg.hie;
import com.bytedance.adsdk.kg.hm;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes13.dex */
public class kg {
    private static final Object fxn = new Object();
    private final String gff;
    private hm hm;
    private final Context kg;
    private final Map<String, hie> rb;

    public kg(Drawable.Callback callback, String str, hm hmVar, Map<String, hie> map) {
        if (!TextUtils.isEmpty(str) && str.charAt(str.length() - 1) != '/') {
            this.gff = str + '/';
        } else {
            this.gff = str;
        }
        this.rb = map;
        fxn(hmVar);
        if (!(callback instanceof View)) {
            this.kg = null;
        } else {
            this.kg = ((View) callback).getContext().getApplicationContext();
        }
    }

    public void fxn(hm hmVar) {
        this.hm = hmVar;
    }

    public Bitmap fxn(String str, Bitmap bitmap) {
        if (bitmap == null) {
            hie hieVar = this.rb.get(str);
            Bitmap dgx = hieVar.dgx();
            hieVar.fxn(null);
            return dgx;
        }
        Bitmap dgx2 = this.rb.get(str).dgx();
        kg(str, bitmap);
        return dgx2;
    }

    public Bitmap fxn(String str) {
        hie hieVar = this.rb.get(str);
        if (hieVar == null) {
            return null;
        }
        Bitmap dgx = hieVar.dgx();
        if (dgx != null) {
            return dgx;
        }
        hm hmVar = this.hm;
        if (hmVar != null) {
            return hmVar.fxn(hieVar);
        }
        Context context = this.kg;
        if (context == null) {
            return null;
        }
        String jq = hieVar.jq();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = true;
        options.inDensity = 160;
        if (jq.startsWith("data:") && jq.indexOf("base64,") > 0) {
            try {
                byte[] decode = Base64.decode(jq.substring(jq.indexOf(44) + 1), 0);
                return kg(str, BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        try {
            if (TextUtils.isEmpty(this.gff)) {
                throw new IllegalStateException("You must set an images folder before loading an image. Set it with LottieComposition#setImagesFolder or LottieDrawable#setImagesFolder");
            }
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(context.getAssets().open(this.gff + jq), null, options);
                if (decodeStream == null) {
                    return null;
                }
                return kg(str, bh.fxn(decodeStream, hieVar.fxn(), hieVar.kg()));
            } catch (IllegalArgumentException unused2) {
                return null;
            }
        } catch (IOException unused3) {
            return null;
        }
    }

    public boolean fxn(Context context) {
        return (context == null && this.kg == null) || this.kg.equals(context);
    }

    private Bitmap kg(String str, Bitmap bitmap) {
        synchronized (fxn) {
            this.rb.get(str).fxn(bitmap);
        }
        return bitmap;
    }
}
