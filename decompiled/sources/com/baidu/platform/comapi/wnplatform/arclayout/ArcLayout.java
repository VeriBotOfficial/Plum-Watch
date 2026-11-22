package com.baidu.platform.comapi.wnplatform.arclayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.util.AttributeSet;
import com.baidu.bikenavi.R;
import com.baidu.platform.comapi.wnplatform.arclayout.b.b;

/* loaded from: classes13.dex */
public class ArcLayout extends com.baidu.platform.comapi.wnplatform.arclayout.a {
    public static final int CROP_INSIDE = 1;
    public static final int CROP_OUTSIDE = 2;
    public static final int POSITION_BOTTOM = 1;
    public static final int POSITION_LEFT = 3;
    public static final int POSITION_RIGHT = 4;
    public static final int POSITION_TOP = 2;
    private int arcHeight;
    private int arcPosition;
    private int cropDirection;

    class a implements b.a {
        a() {
        }

        @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.b.a
        public Path a(int i, int i2) {
            Path path = new Path();
            boolean z = ArcLayout.this.cropDirection == 1;
            int i3 = ArcLayout.this.arcPosition;
            if (i3 == 1) {
                if (!z) {
                    path.moveTo(0.0f, 0.0f);
                    path.lineTo(0.0f, i2 - ArcLayout.this.arcHeight);
                    float f = i;
                    path.quadTo(i / 2, ArcLayout.this.arcHeight + i2, f, i2 - ArcLayout.this.arcHeight);
                    path.lineTo(f, 0.0f);
                    path.close();
                    return path;
                }
                path.moveTo(0.0f, 0.0f);
                float f2 = i2;
                path.lineTo(0.0f, f2);
                float f3 = i;
                path.quadTo(i / 2, i2 - (ArcLayout.this.arcHeight * 2), f3, f2);
                path.lineTo(f3, 0.0f);
                path.close();
                return path;
            }
            if (i3 != 2) {
                if (i3 == 3) {
                    if (!z) {
                        float f4 = i;
                        path.moveTo(f4, 0.0f);
                        path.lineTo(ArcLayout.this.arcHeight, 0.0f);
                        float f5 = i2;
                        path.quadTo(-ArcLayout.this.arcHeight, i2 / 2, ArcLayout.this.arcHeight, f5);
                        path.lineTo(f4, f5);
                        path.close();
                        return path;
                    }
                    float f6 = i;
                    path.moveTo(f6, 0.0f);
                    path.lineTo(0.0f, 0.0f);
                    float f7 = i2 / 2;
                    float f8 = i2;
                    path.quadTo(ArcLayout.this.arcHeight * 2, f7, 0.0f, f8);
                    path.lineTo(f6, f8);
                    path.close();
                    return path;
                }
                if (i3 == 4) {
                    if (!z) {
                        path.moveTo(0.0f, 0.0f);
                        path.lineTo(i - ArcLayout.this.arcHeight, 0.0f);
                        float f9 = i2;
                        path.quadTo(ArcLayout.this.arcHeight + i, i2 / 2, i - ArcLayout.this.arcHeight, f9);
                        path.lineTo(0.0f, f9);
                        path.close();
                        return path;
                    }
                    path.moveTo(0.0f, 0.0f);
                    float f10 = i;
                    path.lineTo(f10, 0.0f);
                    float f11 = i2 / 2;
                    float f12 = i2;
                    path.quadTo(i - (ArcLayout.this.arcHeight * 2), f11, f10, f12);
                    path.lineTo(0.0f, f12);
                    path.close();
                    return path;
                }
            } else if (!z) {
                path.moveTo(0.0f, ArcLayout.this.arcHeight);
                float f13 = i;
                path.quadTo(i / 2, -ArcLayout.this.arcHeight, f13, ArcLayout.this.arcHeight);
                float f14 = i2;
                path.lineTo(f13, f14);
                path.lineTo(0.0f, f14);
                path.close();
            }
            return path;
        }

        @Override // com.baidu.platform.comapi.wnplatform.arclayout.b.b.a
        public boolean a() {
            return false;
        }
    }

    public ArcLayout(Context context) {
        super(context);
        this.arcPosition = 2;
        this.cropDirection = 1;
        this.arcHeight = 0;
        init(context, null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ArcLayout);
            this.arcHeight = obtainStyledAttributes.getDimensionPixelSize(R.styleable.ArcLayout_arc_height, this.arcHeight);
            this.arcPosition = obtainStyledAttributes.getInteger(R.styleable.ArcLayout_arc_position, this.arcPosition);
            this.cropDirection = obtainStyledAttributes.getInteger(R.styleable.ArcLayout_arc_cropDirection, this.cropDirection);
            obtainStyledAttributes.recycle();
        }
        super.setClipPathCreator(new a());
    }

    public ArcLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.arcPosition = 2;
        this.cropDirection = 1;
        this.arcHeight = 0;
        init(context, attributeSet);
    }

    public ArcLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.arcPosition = 2;
        this.cropDirection = 1;
        this.arcHeight = 0;
        init(context, attributeSet);
    }
}
