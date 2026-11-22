package com.wakeup.module.jacket.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;

/* loaded from: classes4.dex */
public class BlurBuilder {
    private static final float BITMAP_SCALE = 0.4f;
    private static final float BLUR_RADIUS = 10.0f;

    public static Bitmap blur(Context context, Bitmap bitmap) {
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * 0.4f), Math.round(bitmap.getHeight() * 0.4f), false);
        Bitmap createBitmap = Bitmap.createBitmap(createScaledBitmap);
        RenderScript create = RenderScript.create(context);
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        Allocation createFromBitmap = Allocation.createFromBitmap(create, createScaledBitmap);
        Allocation createFromBitmap2 = Allocation.createFromBitmap(create, createBitmap);
        create2.setRadius(10.0f);
        create2.setInput(createFromBitmap);
        create2.forEach(createFromBitmap2);
        createFromBitmap2.copyTo(createBitmap);
        return createBitmap;
    }
}
