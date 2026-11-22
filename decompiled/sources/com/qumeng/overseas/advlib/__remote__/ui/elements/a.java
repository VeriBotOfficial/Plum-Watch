package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextPaint;
import android.widget.TextView;
import com.qumeng.overseas.advlib.__remote__.framework.imageloader.i;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: com.qumeng.overseas.advlib.__remote__.ui.elements.a$a, reason: collision with other inner class name */
    class C0837a extends com.qumeng.overseas.advlib.__remote__.framework.imageloader.a<Bitmap> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TextView f13103a;
        final /* synthetic */ String b;
        final /* synthetic */ Context c;

        C0837a(TextView textView, String str, Context context) {
            this.f13103a = textView;
            this.b = str;
            this.c = context;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.framework.imageloader.a
        public void onResourceReady(Bitmap bitmap) {
            try {
                TextPaint paint = this.f13103a.getPaint();
                Rect rect = new Rect();
                String str = this.b;
                paint.getTextBounds(str, 0, str.length(), rect);
                int height = rect.height();
                if (height <= 0) {
                    height = (int) (paint.getFontMetrics().descent - paint.getFontMetrics().ascent);
                }
                BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f13103a.getResources(), a.a(bitmap, height));
                bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                this.f13103a.setCompoundDrawables(bitmapDrawable, null, null, null);
                this.f13103a.setCompoundDrawablePadding(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(this.c, 2.0f));
                this.f13103a.setTag("adseyeAdLogo");
            } catch (Throwable unused) {
            }
        }
    }

    public static void a(TextView textView, Context context, String str, String str2) {
        try {
            textView.setCompoundDrawables(null, null, null, null);
            textView.setCompoundDrawablePadding(com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 0.0f));
            i.a c = com.qumeng.overseas.advlib.__remote__.framework.imageloader.l.c();
            c.url(str2);
            c.asBitmap(new C0837a(textView, str, context));
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static Bitmap a(Bitmap bitmap, int i) {
        return Bitmap.createScaledBitmap(bitmap, Math.round(bitmap.getWidth() * (i / bitmap.getHeight())), i, true);
    }
}
