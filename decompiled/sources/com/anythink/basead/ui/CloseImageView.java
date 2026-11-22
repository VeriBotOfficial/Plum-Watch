package com.anythink.basead.ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageView;
import com.anythink.core.common.v.am;

/* loaded from: classes11.dex */
public class CloseImageView extends ImageView implements b {

    /* renamed from: a, reason: collision with root package name */
    private final String f3028a;
    private float b;
    private Rect c;
    private float d;

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3028a = getClass().getSimpleName();
        this.b = 1.0f;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickAreaScaleFactor(float f) {
        this.b = f;
        if (f <= 0.0f) {
            this.b = 1.0f;
        }
        float f2 = this.b;
        if (f2 < 1.0f) {
            post(new Runnable() { // from class: com.anythink.basead.ui.CloseImageView.1
                @Override // java.lang.Runnable
                public final void run() {
                    CloseImageView.this.c = new Rect();
                    CloseImageView closeImageView = CloseImageView.this;
                    closeImageView.getHitRect(closeImageView.c);
                    int width = ((int) (CloseImageView.this.c.width() * (CloseImageView.this.b - 1.0f))) / 2;
                    int height = ((int) (CloseImageView.this.c.height() * (CloseImageView.this.b - 1.0f))) / 2;
                    CloseImageView.this.c.top -= height;
                    CloseImageView.this.c.bottom += height;
                    CloseImageView.this.c.left -= width;
                    CloseImageView.this.c.right += width;
                }
            });
        } else if (f2 > 1.0f) {
            am.a(this, f2);
        }
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        float f = this.b;
        if (f > 1.0f) {
            am.a(this, f);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action;
        Rect rect;
        if (this.b >= 1.0f || (!((action = motionEvent.getAction()) == 0 || action == 5) || (rect = this.c) == null || rect.contains(getLeft() + ((int) motionEvent.getX()), getTop() + ((int) motionEvent.getY())))) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // com.anythink.basead.ui.b
    public void setClickViewAlpha(double d) {
        if (this.d < 1.0f && d >= 0.0d && d <= 1.0d) {
            float f = (float) d;
            try {
                this.d = f;
                setAlpha(f);
            } catch (Throwable unused) {
            }
        }
    }
}
