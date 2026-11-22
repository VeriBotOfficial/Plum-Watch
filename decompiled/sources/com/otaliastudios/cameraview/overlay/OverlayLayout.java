package com.otaliastudios.cameraview.overlay;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.R;
import com.otaliastudios.cameraview.overlay.Overlay;

/* loaded from: classes17.dex */
public class OverlayLayout extends FrameLayout implements Overlay {
    Overlay.Target currentTarget;
    private boolean mHardwareCanvasEnabled;
    private static final String TAG = "OverlayLayout";
    private static final CameraLogger LOG = CameraLogger.create(TAG);

    public OverlayLayout(Context context) {
        super(context);
        this.currentTarget = Overlay.Target.PREVIEW;
        setWillNotDraw(false);
    }

    public boolean isOverlay(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return false;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.CameraView_Layout);
        boolean z = obtainStyledAttributes.hasValue(R.styleable.CameraView_Layout_layout_drawOnPreview) || obtainStyledAttributes.hasValue(R.styleable.CameraView_Layout_layout_drawOnPictureSnapshot) || obtainStyledAttributes.hasValue(R.styleable.CameraView_Layout_layout_drawOnVideoSnapshot);
        obtainStyledAttributes.recycle();
        return z;
    }

    public boolean isOverlay(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        LOG.i("normal draw called.");
        if (drawsOn(Overlay.Target.PREVIEW)) {
            drawOn(Overlay.Target.PREVIEW, canvas);
        }
    }

    @Override // com.otaliastudios.cameraview.overlay.Overlay
    public boolean drawsOn(Overlay.Target target) {
        for (int i = 0; i < getChildCount(); i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).drawsOn(target)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.otaliastudios.cameraview.overlay.Overlay
    public void setHardwareCanvasEnabled(boolean z) {
        this.mHardwareCanvasEnabled = z;
    }

    @Override // com.otaliastudios.cameraview.overlay.Overlay
    public boolean getHardwareCanvasEnabled() {
        return this.mHardwareCanvasEnabled;
    }

    @Override // com.otaliastudios.cameraview.overlay.Overlay
    public void drawOn(Overlay.Target target, Canvas canvas) {
        synchronized (this) {
            this.currentTarget = target;
            int i = AnonymousClass1.$SwitchMap$com$otaliastudios$cameraview$overlay$Overlay$Target[target.ordinal()];
            if (i == 1) {
                super.draw(canvas);
            } else if (i == 2 || i == 3) {
                canvas.save();
                float width = canvas.getWidth() / getWidth();
                float height = canvas.getHeight() / getHeight();
                LOG.v("draw", "target:", target, "canvas:", canvas.getWidth() + "x" + canvas.getHeight(), "view:", getWidth() + "x" + getHeight(), "widthScale:", Float.valueOf(width), "heightScale:", Float.valueOf(height), "hardwareCanvasMode:", Boolean.valueOf(this.mHardwareCanvasEnabled));
                canvas.scale(width, height);
                dispatchDraw(canvas);
                canvas.restore();
            }
        }
    }

    /* renamed from: com.otaliastudios.cameraview.overlay.OverlayLayout$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$otaliastudios$cameraview$overlay$Overlay$Target;

        static {
            int[] iArr = new int[Overlay.Target.values().length];
            $SwitchMap$com$otaliastudios$cameraview$overlay$Overlay$Target = iArr;
            try {
                iArr[Overlay.Target.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$overlay$Overlay$Target[Overlay.Target.VIDEO_SNAPSHOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$otaliastudios$cameraview$overlay$Overlay$Target[Overlay.Target.PICTURE_SNAPSHOT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.drawsOn(this.currentTarget)) {
            LOG.v("Performing drawing for view:", view.getClass().getSimpleName(), "target:", this.currentTarget, "params:", layoutParams);
            return doDrawChild(canvas, view, j);
        }
        LOG.v("Skipping drawing for view:", view.getClass().getSimpleName(), "target:", this.currentTarget, "params:", layoutParams);
        return false;
    }

    boolean doDrawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        public boolean drawOnPictureSnapshot;
        public boolean drawOnPreview;
        public boolean drawOnVideoSnapshot;

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.drawOnPreview = false;
            this.drawOnPictureSnapshot = false;
            this.drawOnVideoSnapshot = false;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.drawOnPreview = false;
            this.drawOnPictureSnapshot = false;
            this.drawOnVideoSnapshot = false;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CameraView_Layout);
            try {
                this.drawOnPreview = obtainStyledAttributes.getBoolean(R.styleable.CameraView_Layout_layout_drawOnPreview, false);
                this.drawOnPictureSnapshot = obtainStyledAttributes.getBoolean(R.styleable.CameraView_Layout_layout_drawOnPictureSnapshot, false);
                this.drawOnVideoSnapshot = obtainStyledAttributes.getBoolean(R.styleable.CameraView_Layout_layout_drawOnVideoSnapshot, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }

        boolean drawsOn(Overlay.Target target) {
            if (target == Overlay.Target.PREVIEW && this.drawOnPreview) {
                return true;
            }
            if (target == Overlay.Target.VIDEO_SNAPSHOT && this.drawOnVideoSnapshot) {
                return true;
            }
            return target == Overlay.Target.PICTURE_SNAPSHOT && this.drawOnPictureSnapshot;
        }

        public String toString() {
            return getClass().getName() + "[drawOnPreview:" + this.drawOnPreview + ",drawOnPictureSnapshot:" + this.drawOnPictureSnapshot + ",drawOnVideoSnapshot:" + this.drawOnVideoSnapshot + "]";
        }
    }
}
