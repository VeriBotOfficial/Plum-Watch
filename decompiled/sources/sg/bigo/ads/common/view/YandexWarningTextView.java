package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.R;
import sg.bigo.ads.common.utils.e;

/* loaded from: classes9.dex */
public class YandexWarningTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f19771a;
    private int b;
    private float c;
    private int d;
    private int e;
    private float f;
    private boolean g;
    private int h;
    private float i;
    private int j;
    private int k;
    private final int l;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f19771a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        this.l = 1000;
        a(null);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19771a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        this.l = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f19771a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        this.l = 1000;
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.YandexWarningTextView);
            this.f19771a = e.d(getContext(), obtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_maxTextSize, this.f19771a));
            this.b = e.d(getContext(), obtainStyledAttributes.getDimensionPixelSize(R.styleable.YandexWarningTextView_bigo_ad_minTextSize, this.b));
            obtainStyledAttributes.recycle();
        }
        this.j = e.c(getContext());
        this.k = e.b(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        int i = this.e;
        if (i > 2) {
            i = 2;
        }
        canvas.save();
        float f = (this.d * 1.0f) / i;
        float f2 = f / this.f;
        sg.bigo.ads.common.t.a.a("yandexWarn", "onDraw...singleLineHeight:" + f + "...scaleY:" + f2 + "...mPy:" + this.i);
        canvas.scale(1.0f, f2, 0.0f, this.i);
        super.onDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d9 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:5:0x0007, B:10:0x0013, B:11:0x004e, B:13:0x0058, B:16:0x007d, B:18:0x00a6, B:23:0x00af, B:24:0x00d3, B:26:0x00d9, B:28:0x00dd, B:29:0x00df, B:34:0x00b8, B:35:0x00bd, B:41:0x00cf, B:42:0x005e, B:44:0x0065), top: B:4:0x0007 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onSizeChanged(int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.view.YandexWarningTextView.onSizeChanged(int, int, int, int):void");
    }

    public void setIsHorizontal(boolean z) {
        this.g = z;
    }
}
