package com.wakeup.commonui.progress;

import android.animation.Animator;
import android.animation.FloatEvaluator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.BV.LinearGradient.LinearGradientManager;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.react.uimanager.ViewProps;
import com.wakeup.commonui.R;
import com.wakeup.commonui.progress.CircularProgressView;
import com.yandex.div.core.ScrollDirection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;

/* compiled from: CircularProgressView.kt */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u009a\u00012\u00020\u0001:\u0004\u0099\u0001\u009a\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010h\u001a\u00020i2\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0002J\u000e\u0010j\u001a\u00020i2\u0006\u0010k\u001a\u00020\u0007J\u000e\u0010l\u001a\u00020i2\u0006\u0010W\u001a\u00020\u0007J\u0012\u0010m\u001a\u00020i2\b\b\u0001\u0010n\u001a\u00020\u0007H\u0007J\u0010\u0010l\u001a\u00020i2\u0006\u0010W\u001a\u00020oH\u0007J\u0012\u0010p\u001a\u00020i2\b\b\u0001\u0010n\u001a\u00020\u0007H\u0007J\u0010\u0010[\u001a\u00020i2\u0006\u0010W\u001a\u00020oH\u0007J$\u0010q\u001a\u00020i2\b\b\u0001\u0010r\u001a\u0002002\u0006\u0010s\u001a\u0002022\b\b\u0002\u0010t\u001a\u00020\u001eH\u0007J\u0012\u0010u\u001a\u0002002\b\b\u0001\u0010r\u001a\u000200H\u0002J\u0012\u0010v\u001a\u00020i2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0012\u0010w\u001a\u00020i2\b\b\u0001\u0010n\u001a\u00020\u0007H\u0007J\u0010\u0010x\u001a\u00020i2\u0006\u0010W\u001a\u00020oH\u0007J\u000e\u0010y\u001a\u00020i2\u0006\u0010d\u001a\u00020\u000bJ\u0018\u0010z\u001a\u00020i2\u0006\u0010{\u001a\u00020\u000b2\u0006\u0010|\u001a\u00020\u001eH\u0002J%\u0010}\u001a\u00020i2\u0006\u0010#\u001a\u00020\u000b2\b\b\u0002\u0010~\u001a\u00020\u001e2\t\b\u0002\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J%\u0010}\u001a\u00020i2\r\u0010 \u001a\t\u0012\u0004\u0012\u00020\u000b0\u0081\u00012\u000e\u0010\u0082\u0001\u001a\t\u0012\u0004\u0012\u00020\u00070\u0081\u0001J\u001e\u0010\u0083\u0001\u001a\u00020i2\b\b\u0002\u0010~\u001a\u00020\u001e2\t\b\u0002\u0010\u007f\u001a\u00030\u0080\u0001H\u0007J\u0012\u0010\u0084\u0001\u001a\u00020i2\t\u0010\u0085\u0001\u001a\u0004\u0018\u00010,J\t\u0010\u0086\u0001\u001a\u00020iH\u0002J*\u0010}\u001a\u00020i2\u0006\u0010#\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020\u001e2\u0007\u0010\u007f\u001a\u00030\u0080\u00012\u0007\u0010\u0087\u0001\u001a\u00020\u001eH\u0002J\u0011\u0010\u0088\u0001\u001a\u00020i2\u0006\u0010d\u001a\u00020\u000bH\u0002J0\u0010\u0089\u0001\u001a\u00020\u001c2\b\u0010\u008a\u0001\u001a\u00030\u008b\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u007f\u001a\u00030\u0080\u00012\b\u0010\u008d\u0001\u001a\u00030\u008e\u0001H\u0002J\u001a\u0010\u008f\u0001\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0007\u0010\u0090\u0001\u001a\u00020\u000bH\u0002J\u001b\u0010\u0091\u0001\u001a\u00020i2\u0007\u0010\u0092\u0001\u001a\u00020\u00072\u0007\u0010\u0093\u0001\u001a\u00020\u0007H\u0014J\u0013\u0010\u0094\u0001\u001a\u00020i2\b\u0010\u0095\u0001\u001a\u00030\u0096\u0001H\u0014J\u0012\u0010\u0097\u0001\u001a\u00020\u00072\u0007\u0010\u0098\u0001\u001a\u00020\u000bH\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0013X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00160!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00105\u001a\u000206X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001a\u0010@\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010=\"\u0004\bB\u0010?R\u001c\u0010C\u001a\u0004\u0018\u00010DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010J\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR$\u0010N\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010K\"\u0004\bO\u0010MR$\u0010P\u001a\u00020\u001e2\u0006\u0010I\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010K\"\u0004\bQ\u0010MR$\u0010S\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010K\"\u0004\bT\u0010MR$\u0010U\u001a\u00020\u001e2\u0006\u0010R\u001a\u00020\u001e@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010K\"\u0004\bV\u0010MR$\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010Z\"\u0004\b_\u0010\\R$\u0010a\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010Z\"\u0004\bc\u0010\\R$\u0010e\u001a\u00020\u00072\u0006\u0010d\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010Z\"\u0004\bg\u0010\\¨\u0006\u009b\u0001"}, d2 = {"Lcom/wakeup/commonui/progress/CircularProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defaultViewPadding", "", "defaultShadowPadding", "defaultStrokeThickness", "defaultThumbSize", "defaultMaxWidth", "valuesToDrawList", "", "progressRectF", "Landroid/graphics/RectF;", "shadowRectF", "backgroundPaint", "Landroid/graphics/Paint;", "progressPaint", "shadowPaint", "shadowThumbPaint", "thumbPaint", "progressAnimator", "Landroid/animation/ValueAnimator;", "multipleArcsEnabled", "", "progressListTotal", "progressList", "Ljava/util/ArrayList;", "progressPaintList", "progress", "progressThumbSizeRate", "progressIconThickness", "progressStrokeThickness", "lastValidRawMeasuredDim", "lastValidStrokeThickness", "lastValidThumbSize", "lastValidThumbSizeRate", "progressInterpolator", "Landroid/animation/TimeInterpolator;", "shader", "Landroid/graphics/Shader;", "shaderColors", "", "shaderPositions", "", "initShader", "sizeChanged", "progressThumbScaleType", "Lcom/wakeup/commonui/progress/ProgressThumbScaleType;", "getProgressThumbScaleType", "()Lcom/wakeup/commonui/progress/ProgressThumbScaleType;", "setProgressThumbScaleType", "(Lcom/wakeup/commonui/progress/ProgressThumbScaleType;)V", "progressMaxThumbSizeRate", "getProgressMaxThumbSizeRate", "()F", "setProgressMaxThumbSizeRate", "(F)V", "progressThumbSize", "getProgressThumbSize", "setProgressThumbSize", "actionCallback", "Lcom/wakeup/commonui/progress/CircularProgressView$CircularProgressViewActionCallback;", "getActionCallback", "()Lcom/wakeup/commonui/progress/CircularProgressView$CircularProgressViewActionCallback;", "setActionCallback", "(Lcom/wakeup/commonui/progress/CircularProgressView$CircularProgressViewActionCallback;)V", ViewProps.ENABLED, "isBackgroundAlphaEnabled", "()Z", "setBackgroundAlphaEnabled", "(Z)V", "isReverseEnabled", "setReverseEnabled", "isProgressRounded", "setProgressRounded", "enable", "isShadowEnabled", "setShadowEnabled", "isProgressThumbEnabled", "setProgressThumbEnabled", "color", "progressColor", "getProgressColor", "()I", "setProgressColor", "(I)V", "progressBackgroundColor", "getProgressBackgroundColor", "setProgressBackgroundColor", "angle", "startingAngle", "getStartingAngle", "setStartingAngle", "value", AppLovinMediationProvider.MAX, "getMax", "setMax", "setupAttr", "", "setSize", "size", "setColor", "setColorResource", "resId", "Landroid/graphics/Color;", "setProgressColorResource", "setProgressColors", LinearGradientManager.PROP_COLORS, "positions", "duplicateFirst", "duplicateFirstColor", "setShader", "setShadowColorResource", "setBackgroundColor", "setProgressStrokeThickness", "setThickness", "thickness", "requestLayout", "setProgress", "animate", "duration", "", "", "progressColorList", "resetProgress", "setAnimationInterpolator", "interpolator", "resetBackgroundPaint", "clockwise", "setProgressValue", "getAnimator", "current", "", ScrollDirection.NEXT, "updateListener", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "adjustAlpha", "factor", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "dpToPx", "dp", "CircularProgressViewActionCallback", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CircularProgressView extends View {
    private static final float ANGLE_OFFSET_FOR_MULTIPLE_ARC_PROGRESS = 6.0f;
    private static final int DEFAULT_ANIMATION_MILLIS = 1000;
    private static final float DEFAULT_BACKGROUND_ALPHA = 0.3f;
    private static final int DEFAULT_MAX = 100;
    private static final float DEFAULT_MAXIMUM_THUMB_SIZE_RATE = 2.0f;
    private static final int DEFAULT_MAX_WIDTH_DP = 100;
    private static final int DEFAULT_PROGRESS_COLOR = -16777216;
    private static final float DEFAULT_SHADOW_PADDING_DP = 5.0f;
    private static final int DEFAULT_STARTING_ANGLE = 270;
    private static final float DEFAULT_STROKE_THICKNESS_DP = 10.0f;
    private static final float DEFAULT_THUMB_SIZE_DP = 10.0f;
    private static final float DEFAULT_VIEW_PADDING_DP = 10.0f;
    private CircularProgressViewActionCallback actionCallback;
    private Paint backgroundPaint;
    private final int defaultMaxWidth;
    private final float defaultShadowPadding;
    private final float defaultStrokeThickness;
    private final float defaultThumbSize;
    private final float defaultViewPadding;
    private boolean initShader;
    private boolean isBackgroundAlphaEnabled;
    private boolean isProgressRounded;
    private boolean isProgressThumbEnabled;
    private boolean isReverseEnabled;
    private boolean isShadowEnabled;
    private float lastValidRawMeasuredDim;
    private float lastValidStrokeThickness;
    private float lastValidThumbSize;
    private float lastValidThumbSizeRate;
    private int max;
    private boolean multipleArcsEnabled;
    private float progress;
    private ValueAnimator progressAnimator;
    private int progressBackgroundColor;
    private int progressColor;
    private float progressIconThickness;
    private TimeInterpolator progressInterpolator;
    private ArrayList<Float> progressList;
    private float progressListTotal;
    private float progressMaxThumbSizeRate;
    private Paint progressPaint;
    private ArrayList<Paint> progressPaintList;
    private RectF progressRectF;
    private float progressStrokeThickness;
    private ProgressThumbScaleType progressThumbScaleType;
    private float progressThumbSize;
    private float progressThumbSizeRate;
    private Shader shader;
    private int[] shaderColors;
    private float[] shaderPositions;
    private Paint shadowPaint;
    private RectF shadowRectF;
    private Paint shadowThumbPaint;
    private boolean sizeChanged;
    private int startingAngle;
    private Paint thumbPaint;
    private final List<Float> valuesToDrawList;
    private static final TimeInterpolator DEFAULT_INTERPOLATOR = new DecelerateInterpolator();

    /* compiled from: CircularProgressView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/wakeup/commonui/progress/CircularProgressView$CircularProgressViewActionCallback;", "", "onProgressChanged", "", "progress", "", "onAnimationFinished", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CircularProgressViewActionCallback {
        void onAnimationFinished(float progress);

        void onProgressChanged(float progress);
    }

    /* compiled from: CircularProgressView.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProgressThumbScaleType.values().length];
            try {
                iArr[ProgressThumbScaleType.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProgressThumbScaleType.RATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void resetProgress() {
        resetProgress$default(this, false, 0L, 3, null);
    }

    public final void resetProgress(boolean z) {
        resetProgress$default(this, z, 0L, 2, null);
    }

    public final void setProgress(float f) {
        setProgress$default(this, f, false, 0L, 6, null);
    }

    public final void setProgress(float f, boolean z) {
        setProgress$default(this, f, z, 0L, 4, null);
    }

    public final void setProgressColors(int[] colors, float[] positions) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(positions, "positions");
        setProgressColors$default(this, colors, positions, false, 4, null);
    }

    public /* synthetic */ CircularProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.defaultViewPadding = dpToPx(10.0f);
        this.defaultShadowPadding = dpToPx(5.0f);
        float dpToPx = dpToPx(10.0f);
        this.defaultStrokeThickness = dpToPx;
        float dpToPx2 = dpToPx(10.0f);
        this.defaultThumbSize = dpToPx2;
        this.defaultMaxWidth = dpToPx(100.0f);
        this.valuesToDrawList = new ArrayList();
        this.progressList = new ArrayList<>();
        this.progressPaintList = new ArrayList<>();
        this.progressThumbSizeRate = 2.0f;
        this.progressStrokeThickness = dpToPx;
        this.lastValidStrokeThickness = dpToPx;
        this.lastValidThumbSize = dpToPx2;
        this.lastValidThumbSizeRate = 2.0f;
        this.progressInterpolator = DEFAULT_INTERPOLATOR;
        this.shaderColors = new int[0];
        this.shaderPositions = new float[0];
        this.progressThumbScaleType = ProgressThumbScaleType.AUTO;
        this.progressMaxThumbSizeRate = 2.0f;
        this.progressThumbSize = dpToPx2;
        this.isShadowEnabled = true;
        this.progressColor = -16777216;
        this.progressBackgroundColor = -16777216;
        this.startingAngle = 270;
        this.max = 100;
        setupAttr(context, attributeSet);
    }

    public final ProgressThumbScaleType getProgressThumbScaleType() {
        return this.progressThumbScaleType;
    }

    public final void setProgressThumbScaleType(ProgressThumbScaleType progressThumbScaleType) {
        Intrinsics.checkNotNullParameter(progressThumbScaleType, "<set-?>");
        this.progressThumbScaleType = progressThumbScaleType;
    }

    public final float getProgressMaxThumbSizeRate() {
        return this.progressMaxThumbSizeRate;
    }

    public final void setProgressMaxThumbSizeRate(float f) {
        this.progressMaxThumbSizeRate = f;
    }

    public final float getProgressThumbSize() {
        return this.progressThumbSize;
    }

    public final void setProgressThumbSize(float f) {
        this.progressThumbSize = f;
    }

    public final CircularProgressViewActionCallback getActionCallback() {
        return this.actionCallback;
    }

    public final void setActionCallback(CircularProgressViewActionCallback circularProgressViewActionCallback) {
        this.actionCallback = circularProgressViewActionCallback;
    }

    /* renamed from: isBackgroundAlphaEnabled, reason: from getter */
    public final boolean getIsBackgroundAlphaEnabled() {
        return this.isBackgroundAlphaEnabled;
    }

    public final void setBackgroundAlphaEnabled(boolean z) {
        this.isBackgroundAlphaEnabled = z;
        resetBackgroundPaint();
        invalidate();
    }

    /* renamed from: isReverseEnabled, reason: from getter */
    public final boolean getIsReverseEnabled() {
        return this.isReverseEnabled;
    }

    public final void setReverseEnabled(boolean z) {
        this.isReverseEnabled = z;
        invalidate();
    }

    /* renamed from: isProgressRounded, reason: from getter */
    public final boolean getIsProgressRounded() {
        return this.isProgressRounded;
    }

    public final void setProgressRounded(boolean z) {
        this.isProgressRounded = z;
        Paint paint = this.progressPaint;
        Paint paint2 = null;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
            paint = null;
        }
        paint.setStrokeCap(this.isProgressRounded ? Paint.Cap.ROUND : Paint.Cap.SQUARE);
        Paint paint3 = this.shadowPaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowPaint");
            paint3 = null;
        }
        Paint paint4 = this.progressPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
        } else {
            paint2 = paint4;
        }
        paint3.setStrokeCap(paint2.getStrokeCap());
        invalidate();
    }

    /* renamed from: isShadowEnabled, reason: from getter */
    public final boolean getIsShadowEnabled() {
        return this.isShadowEnabled;
    }

    public final void setShadowEnabled(boolean z) {
        this.isShadowEnabled = z;
        invalidate();
    }

    /* renamed from: isProgressThumbEnabled, reason: from getter */
    public final boolean getIsProgressThumbEnabled() {
        return this.isProgressThumbEnabled;
    }

    public final void setProgressThumbEnabled(boolean z) {
        this.isProgressThumbEnabled = z;
        invalidate();
        requestLayout();
    }

    public final int getProgressColor() {
        return this.progressColor;
    }

    public final void setProgressColor(int i) {
        this.progressColor = i;
        if (i == -1) {
            setProgressBackgroundColor(i);
        }
        Paint paint = this.progressPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
            paint = null;
        }
        paint.setColor(i);
        setShader(null);
        invalidate();
    }

    public final int getProgressBackgroundColor() {
        return this.progressBackgroundColor;
    }

    public final void setProgressBackgroundColor(int i) {
        this.progressBackgroundColor = i;
        resetBackgroundPaint();
        invalidate();
    }

    public final int getStartingAngle() {
        return this.startingAngle;
    }

    public final void setStartingAngle(int i) {
        this.startingAngle = i;
        invalidate();
    }

    public final int getMax() {
        return this.max;
    }

    public final void setMax(int i) {
        this.max = i;
        invalidate();
    }

    private final void setupAttr(Context context, AttributeSet attrs) {
        this.progressRectF = new RectF();
        this.shadowRectF = new RectF();
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        paint.setStyle(Paint.Style.STROKE);
        Paint paint2 = new Paint(1);
        this.progressPaint = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        Paint paint3 = new Paint(1);
        this.shadowPaint = paint3;
        paint3.setStyle(Paint.Style.STROKE);
        Paint paint4 = new Paint(1);
        this.shadowThumbPaint = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint(1);
        this.thumbPaint = paint5;
        paint5.setStyle(Paint.Style.FILL);
        if (attrs != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, R.styleable.CircularProgressView, 0, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                setMax(obtainStyledAttributes.getInt(R.styleable.CircularProgressView_max2, 100));
                setShadowEnabled(obtainStyledAttributes.getBoolean(R.styleable.CircularProgressView_shadow, true));
                setProgressThumbEnabled(obtainStyledAttributes.getBoolean(R.styleable.CircularProgressView_progressThumb, false));
                this.progressThumbScaleType = ProgressThumbScaleType.values()[obtainStyledAttributes.getInteger(R.styleable.CircularProgressView_progressThumbScaleType, 0)];
                this.progressMaxThumbSizeRate = obtainStyledAttributes.getFloat(R.styleable.CircularProgressView_progressThumbSizeMaxRate, 2.0f);
                setStartingAngle(obtainStyledAttributes.getInteger(R.styleable.CircularProgressView_startingAngle, 270));
                this.progress = obtainStyledAttributes.getFloat(R.styleable.CircularProgressView_progress, 0.0f);
                this.progressStrokeThickness = obtainStyledAttributes.getDimension(R.styleable.CircularProgressView_progressBarThickness, this.defaultStrokeThickness);
                this.progressThumbSize = obtainStyledAttributes.getDimension(R.styleable.CircularProgressView_progressThumbSize, this.defaultThumbSize);
                this.progressThumbSizeRate = obtainStyledAttributes.getFloat(R.styleable.CircularProgressView_progressThumbSizeRate2, 2.0f);
                setProgressColor(obtainStyledAttributes.getInt(R.styleable.CircularProgressView_progressBarColor2, -16777216));
                setProgressRounded(obtainStyledAttributes.getBoolean(R.styleable.CircularProgressView_progressBarRounded, false));
                setProgressBackgroundColor(obtainStyledAttributes.getInt(R.styleable.CircularProgressView_progressBackgroundColor, this.progressColor));
                setBackgroundAlphaEnabled(obtainStyledAttributes.getBoolean(R.styleable.CircularProgressView_progressBackgroundAlphaEnabled, true));
                setReverseEnabled(obtainStyledAttributes.getBoolean(R.styleable.CircularProgressView_reverse, false));
                int resourceId = obtainStyledAttributes.getResourceId(R.styleable.CircularProgressView_progressBarColorArray, -1);
                boolean z = obtainStyledAttributes.getBoolean(R.styleable.CircularProgressView_duplicateFirstColorInArray, false);
                if (resourceId != -1) {
                    int[] intArray = obtainStyledAttributes.getResources().getIntArray(resourceId);
                    this.shaderColors = intArray;
                    if (z) {
                        this.shaderColors = duplicateFirstColor(intArray);
                    }
                    this.initShader = true;
                }
                int resourceId2 = obtainStyledAttributes.getResourceId(R.styleable.CircularProgressView_progressBarColorArrayPositions, -1);
                if (resourceId2 != -1) {
                    TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId2);
                    Intrinsics.checkNotNullExpressionValue(obtainTypedArray, "obtainTypedArray(...)");
                    this.shaderPositions = new float[obtainTypedArray.length()];
                    int length = obtainTypedArray.length();
                    for (int i = 0; i < length; i++) {
                        this.shaderPositions[i] = obtainTypedArray.getFloat(i, 0.0f);
                    }
                    obtainTypedArray.recycle();
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        resetBackgroundPaint();
        Paint paint6 = this.progressPaint;
        Paint paint7 = null;
        if (paint6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
            paint6 = null;
        }
        paint6.setColor(this.progressColor);
        setShader(this.shader);
        Paint paint8 = this.progressPaint;
        if (paint8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
            paint8 = null;
        }
        paint8.setStrokeCap(this.isProgressRounded ? Paint.Cap.ROUND : Paint.Cap.SQUARE);
        Paint paint9 = this.shadowPaint;
        if (paint9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowPaint");
            paint9 = null;
        }
        paint9.setColor(adjustAlpha(-16777216, 0.2f));
        Paint paint10 = this.shadowPaint;
        if (paint10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowPaint");
            paint10 = null;
        }
        Paint paint11 = this.progressPaint;
        if (paint11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
        } else {
            paint7 = paint11;
        }
        paint10.setStrokeCap(paint7.getStrokeCap());
        setThickness(this.progressStrokeThickness, false);
    }

    public final void setSize(int size) {
        getLayoutParams().height = size;
        this.sizeChanged = true;
        requestLayout();
    }

    public final void setColor(int color) {
        setProgressColor(color);
        setProgressBackgroundColor(color);
    }

    public final void setColorResource(int resId) {
        setColor(getContext().getColor(resId));
    }

    public final void setColor(Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        setColor(color.toArgb());
    }

    public final void setProgressColorResource(int resId) {
        setProgressColor(getContext().getColor(resId));
    }

    public final void setProgressColor(Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        setProgressColor(color.toArgb());
    }

    public static /* synthetic */ void setProgressColors$default(CircularProgressView circularProgressView, int[] iArr, float[] fArr, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        circularProgressView.setProgressColors(iArr, fArr, z);
    }

    public final void setProgressColors(int[] colors, float[] positions, boolean duplicateFirst) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(positions, "positions");
        this.shaderColors = duplicateFirst ? duplicateFirstColor(colors) : colors;
        this.shaderPositions = positions;
        RectF rectF = this.progressRectF;
        RectF rectF2 = null;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
            rectF = null;
        }
        float centerX = rectF.centerX();
        RectF rectF3 = this.progressRectF;
        if (rectF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
        } else {
            rectF2 = rectF3;
        }
        setShader(new SweepGradient(centerX, rectF2.centerY(), colors, positions));
        invalidate();
    }

    private final int[] duplicateFirstColor(int[] colors) {
        int[] copyOf = Arrays.copyOf(colors, colors.length + 1);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        copyOf[colors.length] = colors[0];
        return copyOf;
    }

    private final void setShader(Shader shader) {
        Paint paint = this.progressPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
            paint = null;
        }
        paint.setShader(shader);
    }

    public final void setShadowColorResource(int resId) {
        setBackgroundColor(getContext().getColor(resId));
    }

    public final void setBackgroundColor(Color color) {
        Intrinsics.checkNotNullParameter(color, "color");
        setBackgroundColor(color.toArgb());
    }

    public final void setProgressStrokeThickness(float value) {
        setThickness(value, true);
    }

    private final void setThickness(float thickness, boolean requestLayout) {
        this.progressStrokeThickness = thickness;
        this.progressIconThickness = thickness / 2;
        Paint paint = this.backgroundPaint;
        Paint paint2 = null;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundPaint");
            paint = null;
        }
        paint.setStrokeWidth(this.progressStrokeThickness);
        Paint paint3 = this.progressPaint;
        if (paint3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressPaint");
            paint3 = null;
        }
        paint3.setStrokeWidth(this.progressStrokeThickness);
        Iterator<Paint> it = this.progressPaintList.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            Paint next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "next(...)");
            next.setStrokeWidth(this.progressStrokeThickness);
        }
        Paint paint4 = this.shadowPaint;
        if (paint4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowPaint");
        } else {
            paint2 = paint4;
        }
        paint2.setStrokeWidth(this.progressStrokeThickness);
        if (requestLayout) {
            requestLayout();
        }
    }

    public static /* synthetic */ void setProgress$default(CircularProgressView circularProgressView, float f, boolean z, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            j = 1000;
        }
        circularProgressView.setProgress(f, z, j);
    }

    public final void setProgress(float progress, boolean animate, long duration) {
        setProgress(progress, animate, duration, true);
    }

    public final void setProgress(List<Float> progressList, List<Integer> progressColorList) throws RuntimeException {
        Intrinsics.checkNotNullParameter(progressList, "progressList");
        Intrinsics.checkNotNullParameter(progressColorList, "progressColorList");
        setProgressRounded(false);
        this.progressListTotal = 0.0f;
        this.progress = 0.0f;
        Iterator<Float> it = progressList.iterator();
        while (it.hasNext()) {
            float floatValue = this.progressListTotal + it.next().floatValue();
            this.progressListTotal = floatValue;
            if (floatValue > this.max) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Progress entities sum (%s) is greater than max value (%s)", Arrays.copyOf(new Object[]{Float.valueOf(this.progressListTotal), Integer.valueOf(this.max)}, 2));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                throw new RuntimeException(format);
            }
        }
        this.multipleArcsEnabled = true;
        List<Float> list = progressList;
        this.progressList = new ArrayList<>(list);
        this.progressPaintList = new ArrayList<>();
        int size = list.size();
        int i = 0;
        while (i < size) {
            Paint paint = new Paint(1);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(i < progressColorList.size() ? progressColorList.get(i).intValue() : 0);
            this.progressPaintList.add(paint);
            i++;
        }
        setThickness(this.progressStrokeThickness, false);
        invalidate();
    }

    public static /* synthetic */ void resetProgress$default(CircularProgressView circularProgressView, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            j = 1000;
        }
        circularProgressView.resetProgress(z, j);
    }

    public final void resetProgress(boolean animate, long duration) {
        setProgress(0.0f, animate, duration, false);
    }

    public final void setAnimationInterpolator(TimeInterpolator interpolator) {
        if (interpolator == null) {
            interpolator = DEFAULT_INTERPOLATOR;
        }
        this.progressInterpolator = interpolator;
    }

    private final void resetBackgroundPaint() {
        int i;
        Paint paint = this.backgroundPaint;
        if (paint == null) {
            Intrinsics.throwUninitializedPropertyAccessException("backgroundPaint");
            paint = null;
        }
        if (this.isBackgroundAlphaEnabled) {
            i = adjustAlpha(this.progressBackgroundColor, DEFAULT_BACKGROUND_ALPHA);
        } else {
            i = this.progressBackgroundColor;
        }
        paint.setColor(i);
    }

    private final void setProgress(final float progress, boolean animate, long duration, boolean clockwise) {
        this.multipleArcsEnabled = false;
        if (animate) {
            ValueAnimator valueAnimator = this.progressAnimator;
            ValueAnimator valueAnimator2 = null;
            if (valueAnimator != null) {
                if (valueAnimator == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("progressAnimator");
                    valueAnimator = null;
                }
                valueAnimator.cancel();
            }
            ValueAnimator animator = getAnimator(this.progress, clockwise ? progress : 0.0d, duration, new ValueAnimator.AnimatorUpdateListener() { // from class: com.wakeup.commonui.progress.CircularProgressView$$ExternalSyntheticLambda0
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    CircularProgressView.setProgress$lambda$1(CircularProgressView.this, progress, valueAnimator3);
                }
            });
            this.progressAnimator = animator;
            if (animator == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressAnimator");
                animator = null;
            }
            animator.addListener(new Animator.AnimatorListener() { // from class: com.wakeup.commonui.progress.CircularProgressView$setProgress$2
                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationCancel(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationStart(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                }

                @Override // android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animation) {
                    Intrinsics.checkNotNullParameter(animation, "animation");
                    CircularProgressView.CircularProgressViewActionCallback actionCallback = CircularProgressView.this.getActionCallback();
                    if (actionCallback != null) {
                        actionCallback.onAnimationFinished(progress);
                    }
                }
            });
            ValueAnimator valueAnimator3 = this.progressAnimator;
            if (valueAnimator3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressAnimator");
            } else {
                valueAnimator2 = valueAnimator3;
            }
            valueAnimator2.start();
            return;
        }
        setProgressValue(progress);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setProgress$lambda$1(CircularProgressView circularProgressView, float f, ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullParameter(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        circularProgressView.setProgressValue(((Float) animatedValue).floatValue());
        CircularProgressViewActionCallback circularProgressViewActionCallback = circularProgressView.actionCallback;
        if (circularProgressViewActionCallback != null) {
            circularProgressViewActionCallback.onProgressChanged(f);
        }
    }

    private final void setProgressValue(float value) {
        this.progress = value;
        invalidate();
    }

    private final ValueAnimator getAnimator(double current, double next, long duration, ValueAnimator.AnimatorUpdateListener updateListener) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(this.progressInterpolator);
        valueAnimator.setDuration(duration);
        valueAnimator.setObjectValues(Double.valueOf(current), Double.valueOf(next));
        valueAnimator.setEvaluator(new FloatEvaluator() { // from class: com.wakeup.commonui.progress.CircularProgressView$getAnimator$1$1
            public final int evaluate(float fraction, float startValue, float endValue) {
                return MathKt.roundToInt(startValue + ((endValue - startValue) * fraction));
            }
        });
        valueAnimator.addUpdateListener(updateListener);
        return valueAnimator;
    }

    private final int adjustAlpha(int color, float factor) {
        return Color.argb(MathKt.roundToInt(Color.alpha(color) * factor), Color.red(color), Color.green(color), Color.blue(color));
    }

    @Override // android.view.View
    protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        float f;
        int max = Math.max(Math.min(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getMode(heightMeasureSpec) != 0 ? View.MeasureSpec.getSize(heightMeasureSpec) : this.defaultMaxWidth), 0);
        float f2 = this.progressStrokeThickness;
        int i = WhenMappings.$EnumSwitchMapping$0[this.progressThumbScaleType.ordinal()];
        if (i == 1) {
            f = this.progressThumbSize;
        } else if (i == 2) {
            f = (this.progressStrokeThickness / 2) * this.progressThumbSizeRate;
        } else {
            f = this.progressStrokeThickness;
        }
        if (this.isProgressThumbEnabled && this.progressThumbScaleType != ProgressThumbScaleType.AUTO) {
            float f3 = 2;
            float f4 = f * f3;
            float f5 = this.progressStrokeThickness;
            f2 = f4 > f5 ? f2 + (f - f5) : f5 / f3;
        }
        float max2 = Math.max(f2, 0.0f) + this.defaultViewPadding;
        RectF rectF = this.progressRectF;
        RectF rectF2 = null;
        if (rectF == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
            rectF = null;
        }
        float f6 = max;
        float f7 = f6 - max2;
        rectF.set(max2, max2, f7, f7);
        RectF rectF3 = this.progressRectF;
        if (rectF3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
            rectF3 = null;
        }
        if (rectF3.width() <= Math.max(f2, f)) {
            float f8 = this.lastValidRawMeasuredDim;
            RectF rectF4 = this.progressRectF;
            if (rectF4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
                rectF4 = null;
            }
            float f9 = f6 - f8;
            rectF4.set(f8, f8, f9, f9);
            setThickness(this.lastValidStrokeThickness, false);
            this.progressThumbSize = this.lastValidThumbSize;
            this.progressThumbSizeRate = Math.max(Math.min(this.lastValidThumbSizeRate, this.progressMaxThumbSizeRate), 0.0f);
        } else {
            this.lastValidRawMeasuredDim = max2;
            this.lastValidStrokeThickness = this.progressStrokeThickness;
            this.lastValidThumbSize = this.progressThumbSize;
            this.lastValidThumbSizeRate = this.progressThumbSizeRate;
        }
        RectF rectF5 = this.shadowRectF;
        if (rectF5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("shadowRectF");
            rectF5 = null;
        }
        RectF rectF6 = this.progressRectF;
        if (rectF6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
            rectF6 = null;
        }
        float f10 = rectF6.left;
        float f11 = this.defaultShadowPadding;
        RectF rectF7 = this.progressRectF;
        if (rectF7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
            rectF7 = null;
        }
        float f12 = f11 + rectF7.top;
        RectF rectF8 = this.progressRectF;
        if (rectF8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
            rectF8 = null;
        }
        float f13 = rectF8.right;
        float f14 = this.defaultShadowPadding;
        RectF rectF9 = this.progressRectF;
        if (rectF9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("progressRectF");
        } else {
            rectF2 = rectF9;
        }
        rectF5.set(f10, f12, f13, f14 + rectF2.bottom);
        setMeasuredDimension(max, max);
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x006c, code lost:
    
        if ((r5 * r3) > r21.progressStrokeThickness) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e9 A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0016, B:8:0x002c, B:9:0x0033, B:10:0x0040, B:12:0x0055, B:13:0x005b, B:14:0x008d, B:16:0x0095, B:18:0x009a, B:19:0x009f, B:21:0x00a8, B:23:0x00ab, B:25:0x00af, B:27:0x00cd, B:28:0x00d4, B:30:0x00d8, B:31:0x00df, B:34:0x00f0, B:36:0x00f4, B:37:0x00fb, B:38:0x0111, B:40:0x0116, B:41:0x011d, B:43:0x0127, B:44:0x012e, B:46:0x0137, B:47:0x013e, B:48:0x0147, B:50:0x014b, B:51:0x0152, B:53:0x0156, B:54:0x015f, B:55:0x016c, B:57:0x0170, B:59:0x0179, B:60:0x0180, B:62:0x0188, B:63:0x018f, B:66:0x019b, B:68:0x01dd, B:70:0x01e9, B:72:0x01ed, B:74:0x01f1, B:75:0x01f8, B:77:0x01fc, B:78:0x0202, B:79:0x0205, B:81:0x021d, B:83:0x0221, B:86:0x0229, B:88:0x022d, B:89:0x0234, B:91:0x0250, B:93:0x0254, B:95:0x026e, B:96:0x0275, B:99:0x028f, B:101:0x0293, B:102:0x029a, B:103:0x02b0, B:105:0x02b5, B:106:0x02bc, B:108:0x02c6, B:109:0x02cd, B:111:0x02d6, B:112:0x02dd, B:115:0x02a0, B:117:0x02a4, B:118:0x02ab, B:127:0x01a4, B:129:0x01a8, B:131:0x01b1, B:132:0x01b8, B:134:0x01c0, B:135:0x01c7, B:138:0x01d3, B:140:0x0101, B:142:0x0105, B:143:0x010c, B:145:0x009d, B:147:0x005e, B:149:0x0064, B:154:0x0089, B:156:0x0070, B:158:0x0076, B:162:0x0037), top: B:3:0x0005 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected synchronized void onDraw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.progress.CircularProgressView.onDraw(android.graphics.Canvas):void");
    }

    private final int dpToPx(float dp) {
        return (int) Math.ceil(dp * Resources.getSystem().getDisplayMetrics().density);
    }
}
