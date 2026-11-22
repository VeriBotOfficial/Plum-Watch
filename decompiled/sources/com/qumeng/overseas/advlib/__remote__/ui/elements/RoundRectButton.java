package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.internal.view.SupportMenu;
import com.qumeng.overseas.advlib.R;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;

/* loaded from: classes17.dex */
public class RoundRectButton extends ExTextView {
    public static final String P = "ad_tag_style";
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private Paint F;
    private int G;
    private AdsObject H;
    private int I;
    private int J;
    private int K;
    private RectF L;
    private Paint M;
    private LinearGradient N;
    private int O;
    protected float t;
    private c u;
    private Paint v;
    private float w;
    private float x;
    private int y;
    private int z;

    class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13101a;

        a(String str) {
            this.f13101a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            RoundRectButton.this.setText(RoundRectButton.this.getContext().getResources().getString(R.string.qm_oversea_download_now) + " " + this.f13101a);
        }
    }

    interface c {
        void selected(boolean z);
    }

    public RoundRectButton(Context context) {
        super(context);
        this.t = 0.0f;
        this.w = 0.2f;
        this.x = 0.6f;
        this.y = SupportMenu.CATEGORY_MASK;
        this.z = -16711936;
        this.A = -16777216;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = -1;
        this.G = 0;
        this.I = 0;
        this.J = 2;
        this.K = 0;
        a(context);
    }

    private void b(Canvas canvas) {
        this.M.reset();
        this.M.setAntiAlias(true);
        this.M.setDither(true);
        this.M.setStrokeWidth(this.J);
        this.M.setStyle(Paint.Style.FILL);
        this.M.setColor(Color.parseColor("#D4D4D4"));
        int height = getHeight();
        int width = getWidth();
        if (this.L == null) {
            float f = this.x;
            float f2 = this.x;
            this.L = new RectF(f, com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f) + f, width - f2, height - f2);
        }
        RectF rectF = this.L;
        float f3 = height;
        float f4 = this.x;
        float f5 = this.w;
        canvas.drawRoundRect(rectF, (f3 - f4) * f5, (f3 - (f4 * 2.0f)) * f5, this.M);
    }

    private void c(Canvas canvas) {
        this.M.reset();
        this.M.setAntiAlias(true);
        this.M.setDither(true);
        this.M.setStrokeWidth(this.J);
        this.M.setStyle(Paint.Style.FILL);
        this.M.setColor(this.E);
        int height = getHeight();
        int width = getWidth();
        if (this.L == null) {
            float f = this.x;
            float f2 = this.x;
            this.L = new RectF(f, com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f) + f, width - f2, height - f2);
        }
        RectF rectF = this.L;
        float f3 = height;
        float f4 = this.x;
        float f5 = this.w;
        canvas.drawRoundRect(rectF, (f3 - f4) * f5, (f3 - (f4 * 2.0f)) * f5, this.M);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultTextColor(int i) {
        this.A = i;
    }

    protected int getBoardColor() {
        int i = this.O;
        return i == 0 ? Color.parseColor("#FFDB00") : i;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        if (isPressed() && this.E != -1 && this.K == 0) {
            c(canvas);
            super.onDraw(canvas);
            return;
        }
        if (this.K == 1) {
            if (this.D == 0) {
                a(canvas);
            } else {
                b(canvas);
            }
        }
        canvas.save();
        int width = getWidth();
        int height = getHeight();
        if (this.B != -1 && this.C != -1 && isEnabled() && this.v.getStyle() == Paint.Style.FILL) {
            if (this.N == null) {
                this.N = new LinearGradient(0.0f, 0.0f, width, 0.0f, new int[]{this.B, this.C}, (float[]) null, Shader.TileMode.CLAMP);
            }
            this.v.setShader(this.N);
        }
        AdsObject adsObject = this.H;
        String str = adsObject != null ? (String) adsObject.getStash(P, "") : "";
        String obj = getText().toString();
        if ("qukan_tag_style".equals(str)) {
            if ("广告".equals(obj)) {
                setTextColor(Color.parseColor("#B1BEB9"));
                this.v.setStyle(Paint.Style.FILL);
                this.v.setColor(com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(0.9f, Color.parseColor("#B1BEB9")));
            } else if ("淘宝精选".equals(obj)) {
                setTextColor(Color.parseColor("#FF6161"));
                this.v.setStyle(Paint.Style.FILL);
                this.v.setColor(Color.parseColor("#FFEFEF"));
            } else if ("视频".equals(obj)) {
                setTextColor(Color.parseColor("#5D9FEE"));
                this.v.setStyle(Paint.Style.FILL);
                this.v.setColor(com.qumeng.overseas.advlib.__remote__.core.proto.utils.c.a(0.9f, Color.parseColor("#5D9FEE")));
            }
            int a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 4.0f);
            int a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f);
            setPadding(a2, a3, a2, a3);
        }
        if (this.L == null) {
            AdsObject adsObject2 = this.H;
            if (adsObject2 == null || TextUtils.isEmpty(adsObject2.getLogoUrl()) || !obj.startsWith("广告")) {
                float f = this.x;
                float f2 = this.x;
                this.L = new RectF(f, com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f) + f, width - f2, height - f2);
            } else {
                Rect rect = new Rect();
                this.v.getTextBounds(obj, 0, obj.length(), rect);
                int height2 = rect.height() + com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 4.0f);
                float f3 = this.x;
                float f4 = width + height2;
                float f5 = this.x;
                this.L = new RectF(f3, com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f) + f3, f4 - f5, height - f5);
            }
        }
        if (this.K == 1) {
            float f6 = this.x;
            canvas.clipRect(new RectF(f6, com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f) + f6, (getMeasuredWidth() - 2) * this.t, height - this.x));
        }
        RectF rectF = this.L;
        float f7 = height;
        float f8 = this.x;
        float f9 = this.w;
        canvas.drawRoundRect(rectF, (f7 - f8) * f9, (f7 - (f8 * 2.0f)) * f9, this.v);
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 && isEnabled()) {
                postInvalidate();
            }
        } else if (isEnabled()) {
            postInvalidate();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setADObject(AdsObject adsObject) {
        this.H = adsObject;
    }

    public void setBgProgress(float f) {
        this.t = f;
    }

    public void setBoardColor(int i) {
        this.O = i;
    }

    public void setDisableColor(int i) {
        this.G = i;
    }

    public void setDisableTextColor(int i) {
        this.I = i;
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z) {
        if (z) {
            this.v.setColor(this.z);
            setTextColor(this.A);
        } else {
            int i = this.I;
            if (i != 0) {
                setTextColor(i);
            }
            int i2 = this.G;
            if (i2 == 0) {
                this.v.setColor(Color.parseColor("#E6E6E6"));
            } else {
                this.v.setColor(i2);
            }
        }
        super.setEnabled(z);
    }

    public void setFillColor(int i) {
        this.z = i;
        this.v.setColor(i);
        this.v.setStyle(Paint.Style.FILL);
    }

    public void setPressedColor(int i) {
        this.E = i;
    }

    public void setProgress(float f) {
        this.t = f;
        post(new a(Math.ceil(this.t * 100.0f) + Separators.PERCENT));
    }

    public void setProgressColor(int i) {
        Paint paint = new Paint();
        this.F = paint;
        paint.setStyle(Paint.Style.FILL);
        this.F.setAntiAlias(true);
        this.F.setColor(i);
    }

    public void setProgressContentType(int i) {
        this.D = i;
    }

    public void setProgressType(int i) {
        this.K = i;
    }

    public void setRadius(float f) {
        this.w = f;
    }

    @Override // android.widget.TextView, android.view.View
    public void setSelected(boolean z) {
        if (z) {
            this.v.setStyle(Paint.Style.FILL);
            this.v.setColor(this.z);
            setTextColor(-1);
        } else {
            this.v.setStyle(Paint.Style.STROKE);
            this.v.setColor(this.y);
            int i = this.I;
            if (i != 0) {
                setTextColor(i);
            } else {
                setTextColor(this.A);
            }
        }
        c cVar = this.u;
        if (cVar != null) {
            cVar.selected(z);
        }
        super.setSelected(z);
    }

    public void setSelectedListener(c cVar) {
        this.u = cVar;
    }

    public void setStrokenColor(int i) {
        this.y = i;
        this.v.setColor(i);
    }

    public void setStrokenWidth(float f) {
        this.x = f;
        this.v.setStrokeWidth(f);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private RoundRectButton f13102a;

        public b(Context context) {
            this.f13102a = new RoundRectButton(context);
        }

        public b adObject(AdsObject adsObject) {
            this.f13102a.setADObject(adsObject);
            return this;
        }

        public b boardColor(int i) {
            this.f13102a.setBoardColor(i);
            return this;
        }

        public RoundRectButton build() {
            return this.f13102a;
        }

        public b disableTextColor(int i) {
            this.f13102a.setDisableTextColor(i);
            return this;
        }

        public b fillColor(int i) {
            this.f13102a.setFillColor(i);
            return this;
        }

        public b gradient(int i, int i2) {
            this.f13102a.a(i, i2);
            return this;
        }

        public b padding(int i, int i2, int i3, int i4) {
            this.f13102a.setPadding(i, i2, i3, i4);
            return this;
        }

        public b pressedColor(int i) {
            this.f13102a.setPressedColor(i);
            return this;
        }

        public b progressContentType(int i) {
            this.f13102a.setProgressContentType(i);
            return this;
        }

        public b radius(float f) {
            this.f13102a.setRadius(f);
            return this;
        }

        public b strokenColor(int i) {
            this.f13102a.setStrokenColor(i);
            return this;
        }

        public b strokenWidth(float f) {
            this.f13102a.setStrokenWidth(f);
            return this;
        }

        public b style(Paint.Style style) {
            this.f13102a.a(style);
            return this;
        }

        public b text(CharSequence charSequence) {
            this.f13102a.setText(charSequence);
            return this;
        }

        public b textColor(int i) {
            this.f13102a.setStrokenColor(i);
            this.f13102a.setTextColor(i);
            this.f13102a.setDefaultTextColor(i);
            return this;
        }

        public b textSize(float f) {
            this.f13102a.setTextSize(f);
            return this;
        }

        public b(RoundRectButton roundRectButton) {
            this.f13102a = roundRectButton;
        }
    }

    public void a(Paint.Style style) {
        this.v.setStyle(style);
    }

    private void a(Context context) {
        this.M = new Paint();
        Paint paint = new Paint();
        this.v = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.v.setAntiAlias(true);
        this.v.setStrokeWidth(this.x);
        this.v.setColor(this.y);
        setTextSize(10.0f);
        int a2 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 2.0f);
        int a3 = com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(context, 1.0f);
        setPadding(a2, a3, a2, a3);
    }

    public void a(int i, int i2) {
        this.B = i;
        this.C = i2;
    }

    private void a(Canvas canvas) {
        this.M.reset();
        this.M.setAntiAlias(true);
        this.M.setDither(true);
        this.M.setStrokeWidth(this.J);
        this.M.setStyle(Paint.Style.STROKE);
        this.M.setColor(getBoardColor());
        int height = getHeight();
        int width = getWidth();
        if (this.L == null) {
            float f = this.x;
            float f2 = this.x;
            this.L = new RectF(f, com.qumeng.overseas.advlib.__remote__.core.proto.utils.s.a(getContext(), 1.0f) + f, width - f2, height - f2);
        }
        RectF rectF = this.L;
        float f3 = height;
        float f4 = this.x;
        float f5 = this.w;
        canvas.drawRoundRect(rectF, (f3 - f4) * f5, (f3 - (f4 * 2.0f)) * f5, this.M);
    }

    public RoundRectButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.t = 0.0f;
        this.w = 0.2f;
        this.x = 0.6f;
        this.y = SupportMenu.CATEGORY_MASK;
        this.z = -16711936;
        this.A = -16777216;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = -1;
        this.G = 0;
        this.I = 0;
        this.J = 2;
        this.K = 0;
        a(context);
    }

    public RoundRectButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.t = 0.0f;
        this.w = 0.2f;
        this.x = 0.6f;
        this.y = SupportMenu.CATEGORY_MASK;
        this.z = -16711936;
        this.A = -16777216;
        this.B = -1;
        this.C = -1;
        this.D = 0;
        this.E = -1;
        this.G = 0;
        this.I = 0;
        this.J = 2;
        this.K = 0;
        a(context);
    }
}
