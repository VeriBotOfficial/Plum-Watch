package com.bytedance.sdk.component.rb.hm.gff.kg;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes15.dex */
public class kg {
    public static final ImageView.ScaleType fxn = ImageView.ScaleType.CENTER_INSIDE;
    public static final Bitmap.Config kg = Bitmap.Config.ARGB_4444;
    private final int bh;
    private final Bitmap.Config gff;
    private int hm;
    private int rb;

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    private final int f9393sg;
    private final ImageView.ScaleType tw;
    private final int jq = 1280;
    private final int hie = 83886080;

    private static int fxn(int r4, int r5, int r6, int r7) {
        if (r4 == 0 && r5 == 0) {
            return r6;
        }
        if (r4 == 0) {
            return (int) (((double) r6) * (((double) r5) / ((double) r7)));
        }
        if (r5 == 0) {
            return r4;
        }
        double d = ((double) r7) / ((double) r6);
        double d2 = r5;
        return ((double) r4) * d > d2 ? (int) (d2 / d) : r4;
    }

    public kg(int r2, int r3, ImageView.ScaleType scaleType, Bitmap.Config config, int r6, int r7) {
        this.gff = config;
        this.hm = r2;
        this.rb = r3;
        this.tw = scaleType;
        this.bh = r6;
        this.f9393sg = r7;
        fxn(r2, r3);
    }

    static int fxn(int r4, int r5, int r6, int r7, int r8, int r9) {
        double dMin = Math.min(((double) r4) / ((double) r6), ((double) r5) / ((double) r7));
        if (r8 > 0 && r9 > 0) {
            dMin = Math.max(dMin, Math.min(((double) Math.max(r4, r5)) / ((double) Math.max(r8, r9)), ((double) Math.min(r4, r5)) / ((double) Math.min(r8, r9))));
        }
        return Integer.highestOneBit((int) dMin);
    }

    public Bitmap fxn(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.hm == 0 && this.rb == 0) {
            options.inPreferredConfig = this.gff;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int r4 = options.outWidth;
            int r5 = options.outHeight;
            int r1 = fxn(this.hm, this.rb, r4, r5);
            int r10 = fxn(this.rb, this.hm, r5, r4);
            options.inJustDecodeBounds = false;
            options.inSampleSize = fxn(r4, r5, r1, r10, this.bh, this.f9393sg);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > r1 || bitmapDecodeByteArray.getHeight() > r10)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, r1, r10, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 83886080) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void fxn(int r2, int r3) {
        if (r2 > 1280 && r3 > 1280) {
            if (r2 > r3) {
                this.hm = 1280;
                this.rb = (r3 * 1280) / r2;
                return;
            } else {
                this.hm = (r2 * 1280) / r3;
                this.rb = 1280;
                return;
            }
        }
        if (r2 > 1280) {
            this.hm = 1280;
            this.rb = (r3 * 1280) / r2;
        } else if (r3 > 1280) {
            this.hm = (r2 * 1280) / r3;
            this.rb = 1280;
        }
    }
}
