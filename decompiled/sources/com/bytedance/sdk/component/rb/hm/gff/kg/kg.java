package com.bytedance.sdk.component.rb.hm.gff.kg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* loaded from: classes13.dex */
public class kg {
    public static final ImageView.ScaleType fxn = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config kg = Bitmap.Config.ARGB_4444;
    private final int bh;
    private final Bitmap.Config gff;
    private int hm;
    private int rb;

    /* renamed from: sg, reason: collision with root package name */
    private final int f9393sg;
    private final ImageView.ScaleType tw;
    private final int jq = 1280;
    private final int hie = 83886080;

    private static int fxn(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (i == 0) {
            return (int) (i3 * (i2 / i4));
        }
        if (i2 == 0) {
            return i;
        }
        double d = i4 / i3;
        double d2 = i2;
        return ((double) i) * d > d2 ? (int) (d2 / d) : i;
    }

    public kg(int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, int i3, int i4) {
        this.gff = config;
        this.hm = i;
        this.rb = i2;
        this.tw = scaleType;
        this.bh = i3;
        this.f9393sg = i4;
        fxn(i, i2);
    }

    static int fxn(int i, int i2, int i3, int i4, int i5, int i6) {
        double min = Math.min(i / i3, i2 / i4);
        if (i5 > 0 && i6 > 0) {
            min = Math.max(min, Math.min(Math.max(i, i2) / Math.max(i5, i6), Math.min(i, i2) / Math.min(i5, i6)));
        }
        return Integer.highestOneBit((int) min);
    }

    public Bitmap fxn(byte[] bArr) {
        Bitmap decodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.hm == 0 && this.rb == 0) {
            options.inPreferredConfig = this.gff;
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int fxn2 = fxn(this.hm, this.rb, i, i2);
            int fxn3 = fxn(this.rb, this.hm, i2, i);
            options.inJustDecodeBounds = false;
            options.inSampleSize = fxn(i, i2, fxn2, fxn3, this.bh, this.f9393sg);
            decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > fxn2 || decodeByteArray.getHeight() > fxn3)) {
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(decodeByteArray, fxn2, fxn3, true);
                if (createScaledBitmap != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                decodeByteArray = createScaledBitmap;
            }
        }
        if (decodeByteArray != null && decodeByteArray.getByteCount() > 83886080) {
            int width = decodeByteArray.getWidth() / 2;
            int height = decodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(decodeByteArray, width, height, true);
                if (createScaledBitmap2 != decodeByteArray) {
                    decodeByteArray.recycle();
                }
                return createScaledBitmap2;
            }
        }
        return decodeByteArray;
    }

    private void fxn(int i, int i2) {
        if (i > 1280 && i2 > 1280) {
            if (i > i2) {
                this.hm = 1280;
                this.rb = (i2 * 1280) / i;
                return;
            } else {
                this.hm = (i * 1280) / i2;
                this.rb = 1280;
                return;
            }
        }
        if (i > 1280) {
            this.hm = 1280;
            this.rb = (i2 * 1280) / i;
        } else if (i2 > 1280) {
            this.hm = (i * 1280) / i2;
            this.rb = 1280;
        }
    }
}
