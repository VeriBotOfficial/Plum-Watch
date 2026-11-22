package sg.bigo.ads.common.view.a;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import sg.bigo.ads.common.view.a.d;

/* loaded from: classes9.dex */
public final class a extends sg.bigo.ads.common.i.a {
    public b b;

    @Override // sg.bigo.ads.common.i.a, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f19642a;
        if (drawable == null) {
            return;
        }
        if ((drawable instanceof d.a) && ((d.a) drawable).f19777a.e) {
            return;
        }
        if (this.b == null) {
            super.draw(canvas);
            return;
        }
        Path path = new Path();
        float[] fArr = new float[8];
        Rect rect = new Rect();
        this.b.a(fArr);
        this.b.a(rect);
        Rect bounds = getBounds();
        Rect rect2 = new Rect(rect.left, rect.top, bounds.width() - rect.right, bounds.height() - rect.bottom);
        path.addRoundRect(new RectF(rect2), fArr, Path.Direction.CW);
        canvas.clipPath(path);
        super.draw(canvas);
        Drawable e = this.b.e();
        if (e != null) {
            e.setBounds(rect2);
            e.draw(canvas);
        }
    }
}
