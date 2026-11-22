package com.otaliastudios.cameraview.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.otaliastudios.cameraview.controls.Grid;

/* loaded from: classes17.dex */
public class GridLinesLayout extends View {
    public static final int DEFAULT_COLOR = Color.argb(160, 255, 255, 255);
    private static final float GOLDEN_RATIO_INV = 0.618034f;
    DrawCallback callback;
    private int gridColor;
    private Grid gridMode;
    private ColorDrawable horiz;
    private ColorDrawable vert;
    private final float width;

    interface DrawCallback {
        void onDraw(int i);
    }

    public GridLinesLayout(Context context) {
        this(context, null);
    }

    public GridLinesLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gridColor = DEFAULT_COLOR;
        this.horiz = new ColorDrawable(this.gridColor);
        this.vert = new ColorDrawable(this.gridColor);
        this.width = TypedValue.applyDimension(1, 0.9f, context.getResources().getDisplayMetrics());
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.horiz.setBounds(i, 0, i3, (int) this.width);
        this.vert.setBounds(0, i2, (int) this.width, i4);
    }

    public Grid getGridMode() {
        return this.gridMode;
    }

    public void setGridMode(Grid grid) {
        this.gridMode = grid;
        postInvalidate();
    }

    public int getGridColor() {
        return this.gridColor;
    }

    public void setGridColor(int i) {
        this.gridColor = i;
        this.horiz.setColor(i);
        this.vert.setColor(i);
        postInvalidate();
    }

    /* renamed from: com.otaliastudios.cameraview.internal.GridLinesLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$otaliastudios$cameraview$controls$Grid;

        static {
            int[] iArr = new int[Grid.values().length];
            $SwitchMap$com$otaliastudios$cameraview$controls$Grid = iArr;
            try {
                iArr[Grid.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$controls$Grid[Grid.DRAW_3X3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$controls$Grid[Grid.DRAW_PHI.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$controls$Grid[Grid.DRAW_4X4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private int getLineCount() {
        int i = AnonymousClass1.$SwitchMap$com$otaliastudios$cameraview$controls$Grid[this.gridMode.ordinal()];
        if (i == 2 || i == 3) {
            return 2;
        }
        return i != 4 ? 0 : 3;
    }

    private float getLinePosition(int i) {
        int lineCount = getLineCount();
        if (this.gridMode != Grid.DRAW_PHI) {
            return (1.0f / (lineCount + 1)) * (i + 1.0f);
        }
        if (i == 1) {
            return 0.38196602f;
        }
        return GOLDEN_RATIO_INV;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int lineCount = getLineCount();
        for (int i = 0; i < lineCount; i++) {
            float linePosition = getLinePosition(i);
            canvas.translate(0.0f, getHeight() * linePosition);
            this.horiz.draw(canvas);
            float f = -linePosition;
            canvas.translate(0.0f, getHeight() * f);
            canvas.translate(linePosition * getWidth(), 0.0f);
            this.vert.draw(canvas);
            canvas.translate(f * getWidth(), 0.0f);
        }
        DrawCallback drawCallback = this.callback;
        if (drawCallback != null) {
            drawCallback.onDraw(lineCount);
        }
    }
}
