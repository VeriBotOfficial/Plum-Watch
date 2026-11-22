package com.baidu.mapapi.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes13.dex */
public final class BitmapDescriptor {

    /* renamed from: a, reason: collision with root package name */
    Bitmap f7895a;
    private Bundle b;

    BitmapDescriptor(Bitmap bitmap) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f7895a = a(bitmap, bitmap.getWidth(), bitmap.getHeight());
    }

    private Bitmap a(Bitmap bitmap, int i, int i2) {
        if (bitmap == null || bitmap.isRecycled()) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    byte[] b() {
        ByteBuffer allocate = ByteBuffer.allocate(this.f7895a.getWidth() * this.f7895a.getHeight() * 4);
        this.f7895a.copyPixelsToBuffer(allocate);
        return allocate.array();
    }

    public void clearCache() {
        Bundle bundle = this.b;
        if (bundle != null) {
            bundle.clear();
            this.b = null;
        }
    }

    public Bitmap getBitmap() {
        return this.f7895a;
    }

    public void recycle() {
        Bitmap bitmap = this.f7895a;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f7895a.recycle();
        this.f7895a = null;
    }

    Bundle a() {
        MessageDigest messageDigest;
        if (this.f7895a != null) {
            if (this.b == null) {
                Bundle bundle = new Bundle();
                bundle.putInt("image_width", this.f7895a.getWidth());
                bundle.putInt("image_height", this.f7895a.getHeight());
                byte[] b = b();
                bundle.putByteArray("image_data", b);
                try {
                    messageDigest = MessageDigest.getInstance("MD5");
                } catch (NoSuchAlgorithmException e) {
                    e.printStackTrace();
                    messageDigest = null;
                }
                if (messageDigest != null) {
                    messageDigest.update(b, 0, b.length);
                    byte[] digest = messageDigest.digest();
                    StringBuilder sb = new StringBuilder("");
                    for (byte b2 : digest) {
                        sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
                    }
                    bundle.putString("image_hashcode", sb.toString());
                }
                this.b = bundle;
            }
            return this.b;
        }
        throw new IllegalStateException("BDMapSDKException: the bitmap has been recycled! you can not use it again");
    }
}
