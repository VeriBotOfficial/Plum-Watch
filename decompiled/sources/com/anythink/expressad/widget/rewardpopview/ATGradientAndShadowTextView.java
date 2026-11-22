package com.anythink.expressad.widget.rewardpopview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/* loaded from: classes12.dex */
public class ATGradientAndShadowTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    private int f5577a;
    private int b;
    private int c;
    private int d;
    private LinearGradient e;
    public float mShadowDx;
    public float mShadowDy;
    public float mShadowRadius;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f5578a;
        public int b;
        public int c;
        public int d = 40;
        public float e = 3.0f;
        public float f = 1.5f;
        public float g = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context) {
        super(context);
        this.f5577a = -1043;
        this.b = -17041;
        this.c = -1280767;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        a();
    }

    public ATGradientAndShadowTextView(Context context, a aVar) {
        super(context);
        this.f5577a = -1043;
        this.b = -17041;
        this.c = -1280767;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
        if (aVar != null) {
            this.f5577a = aVar.f5578a;
            this.b = aVar.b;
            this.c = aVar.c;
            this.d = aVar.d;
            this.mShadowRadius = aVar.e;
            this.mShadowDx = aVar.f;
            this.mShadowDy = aVar.g;
        }
        a();
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5577a = -1043;
        this.b = -17041;
        this.c = -1280767;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5577a = -1043;
        this.b = -17041;
        this.c = -1280767;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    public ATGradientAndShadowTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f5577a = -1043;
        this.b = -17041;
        this.c = -1280767;
        this.d = 40;
        this.mShadowRadius = 3.0f;
        this.mShadowDx = 1.5f;
        this.mShadowDy = 1.8f;
    }

    private void a() {
        setTextSize(this.d);
        setTypeface(Typeface.defaultFromStyle(3));
        this.e = new LinearGradient(0.0f, 0.0f, 0.0f, getTextSize(), this.f5577a, this.b, Shader.TileMode.CLAMP);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        getPaint().setShader(null);
        getPaint().setShadowLayer(3.0f, 1.5f, 1.8f, this.c);
        super.onDraw(canvas);
        getPaint().clearShadowLayer();
        getPaint().setShader(this.e);
        super.onDraw(canvas);
    }
}
