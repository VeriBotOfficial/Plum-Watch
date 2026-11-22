package com.qumeng.overseas.advlib.__remote__.ui.elements.qukan;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.s;

/* loaded from: classes17.dex */
public class MistBlurBgImageView extends BlurBgImageView {
    private int t;
    private float u;

    public MistBlurBgImageView(Context context) {
        super(context);
        this.t = -1;
        this.u = 0.0f;
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.qukan.BlurBgImageView
    public Bitmap a(Bitmap bitmap, int i, boolean z) {
        return super.a(Bitmap.createBitmap(bitmap, bitmap.getWidth() / 4, bitmap.getHeight() / 4, bitmap.getWidth() / 2, bitmap.getHeight() / 2), i, z);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean a2 = a(canvas);
        super.draw(canvas);
        if (a2) {
            canvas.restore();
        }
    }

    public void setExcludeCorner(int i) {
        this.t = i;
    }

    public void setRadius(float f) {
        this.u = f;
    }

    private boolean a(Canvas canvas) {
        Path path = new Path();
        float a2 = s.a(getContext(), this.u);
        if (a2 <= 0.0f) {
            return false;
        }
        int i = this.t;
        float f = i == 0 ? a2 : 0.0f;
        path.addRoundRect(new RectF((int) (0.0f - f), -(i == 3 ? a2 : 0.0f), (int) (getWidth() + (i == 1 ? a2 : 0.0f)), getHeight() + (i == 2 ? a2 : 0.0f)), a2, a2, Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        return true;
    }
}
