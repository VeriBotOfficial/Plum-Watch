package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DivViewGroup.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 )2\u00020\u0001:\u0002)*B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J\b\u0010\u001d\u001a\u00020\u001cH\u0014J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u001e\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0014J \u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J0\u0010&\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010'\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010(\u001a\u00020\u0007H\u0014R*\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0014\u0010\u0015\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u000e¨\u0006+"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup;", "Landroid/view/ViewGroup;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "gravity", "getGravity$annotations", "()V", "getGravity", "()I", "setGravity", "(I)V", "horizontalGravity", "getHorizontalGravity$div_release", "horizontalPaddings", "getHorizontalPaddings$div_release", "verticalGravity", "getVerticalGravity$div_release", "verticalPaddings", "getVerticalPaddings$div_release", "checkLayoutParams", "", "p", "Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "generateLayoutParams", "lp", "measureChild", "", MapBundleKey.OfflineMapKey.OFFLINE_CHILD, "Landroid/view/View;", "parentWidthMeasureSpec", "parentHeightMeasureSpec", "measureChildWithMargins", "widthUsed", "heightUsed", "Companion", "OffsetsHolder", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class DivViewGroup extends ViewGroup {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int gravity;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static /* synthetic */ void getGravity$annotations() {
    }

    public /* synthetic */ DivViewGroup(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DivViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.gravity = 8388659;
        setClipToPadding(false);
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final void setGravity(int i) {
        if (this.gravity == i) {
            return;
        }
        Companion companion = INSTANCE;
        if (companion.toHorizontalGravity(i) == 0) {
            i |= GravityCompat.START;
        }
        if (companion.toVerticalGravity(i) == 0) {
            i |= 48;
        }
        this.gravity = i;
        requestLayout();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        Intrinsics.checkNotNullParameter(child, "child");
        Companion companion = INSTANCE;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        child.measure(companion.getChildMeasureSpec(parentWidthMeasureSpec, getHorizontalPaddings$div_release(), divLayoutParams.width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(parentHeightMeasureSpec, getVerticalPaddings$div_release(), divLayoutParams.height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        Intrinsics.checkNotNullParameter(child, "child");
        Companion companion = INSTANCE;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        child.measure(companion.getChildMeasureSpec(parentWidthMeasureSpec, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release() + widthUsed, divLayoutParams.width, child.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(parentHeightMeasureSpec, getVerticalPaddings$div_release() + divLayoutParams.getVerticalMargins$div_release() + heightUsed, divLayoutParams.height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
    }

    public final int getHorizontalGravity$div_release() {
        return INSTANCE.toHorizontalGravity(this.gravity);
    }

    public final int getVerticalGravity$div_release() {
        return INSTANCE.toVerticalGravity(this.gravity);
    }

    public final int getHorizontalPaddings$div_release() {
        return getPaddingLeft() + getPaddingRight();
    }

    public final int getVerticalPaddings$div_release() {
        return getPaddingTop() + getPaddingBottom();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof DivLayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new DivLayoutParams(getContext(), attrs);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams lp) {
        return lp instanceof DivLayoutParams ? new DivLayoutParams((DivLayoutParams) lp) : lp instanceof ViewGroup.MarginLayoutParams ? new DivLayoutParams((ViewGroup.MarginLayoutParams) lp) : new DivLayoutParams(lp);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new DivLayoutParams(-2, -2);
    }

    /* compiled from: DivViewGroup.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\tJ\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0013J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0015J\u001d\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0002\b\u0017J\f\u0010\u0018\u001a\u00020\t*\u00020\tH\u0007J\f\u0010\u0019\u001a\u00020\t*\u00020\tH\u0007R\u0016\u0010\u0003\u001a\u00020\u0004*\u00020\u00058Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$Companion;", "", "()V", "lp", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "Landroid/view/View;", "getLp", "(Landroid/view/View;)Lcom/yandex/div/internal/widget/DivLayoutParams;", "getChildMeasureSpec", "", "parentMeasureSpec", ViewProps.PADDING, "childDimension", "minSize", "maxSize", "getSpaceAroundPart", "", "freeSpace", "childCount", "getSpaceAroundPart$div_release", "getSpaceBetweenPart", "getSpaceBetweenPart$div_release", "getSpaceEvenlyPart", "getSpaceEvenlyPart$div_release", "toHorizontalGravity", "toVerticalGravity", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getSpaceAroundPart$div_release(float freeSpace, int childCount) {
            return freeSpace / (childCount * 2);
        }

        public final float getSpaceBetweenPart$div_release(float freeSpace, int childCount) {
            if (childCount == 1) {
                return 0.0f;
            }
            return freeSpace / (childCount - 1);
        }

        public final float getSpaceEvenlyPart$div_release(float freeSpace, int childCount) {
            return freeSpace / (childCount + 1);
        }

        public final int toHorizontalGravity(int i) {
            return i & 125829127;
        }

        public final int toVerticalGravity(int i) {
            return i & 1879048304;
        }

        private Companion() {
        }

        public final DivLayoutParams getLp(View view) {
            Intrinsics.checkNotNullParameter(view, "<this>");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            return (DivLayoutParams) layoutParams;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005a, code lost:
        
            r10 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0047, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
        
            if (r12 == Integer.MAX_VALUE) goto L21;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final int getChildMeasureSpec(int r8, int r9, int r10, int r11, int r12) {
            /*
                r7 = this;
                int r0 = android.view.View.MeasureSpec.getMode(r8)
                int r8 = android.view.View.MeasureSpec.getSize(r8)
                int r8 = r8 - r9
                r9 = 0
                int r8 = java.lang.Math.max(r9, r8)
                r1 = -3
                r2 = -2
                r3 = -1
                r4 = 1073741824(0x40000000, float:2.0)
                r5 = 2147483647(0x7fffffff, float:NaN)
                r6 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r0 == r6) goto L4a
                if (r0 == 0) goto L39
                if (r0 == r4) goto L20
                goto L67
            L20:
                if (r10 < 0) goto L25
                if (r10 > r5) goto L25
                goto L4e
            L25:
                if (r10 != r3) goto L29
                r10 = r8
                goto L4e
            L29:
                if (r10 != r2) goto L2e
                if (r12 != r5) goto L5a
                goto L40
            L2e:
                if (r10 != r1) goto L67
                int r8 = java.lang.Math.max(r8, r11)
                int r10 = java.lang.Math.min(r8, r12)
                goto L53
            L39:
                if (r10 < 0) goto L3e
                if (r10 > r5) goto L3e
                goto L4e
            L3e:
                if (r10 != r3) goto L42
            L40:
                r10 = r8
                goto L68
            L42:
                if (r10 != r2) goto L45
                goto L47
            L45:
                if (r10 != r1) goto L67
            L47:
                if (r12 != r5) goto L5a
                goto L40
            L4a:
                if (r10 < 0) goto L50
                if (r10 > r5) goto L50
            L4e:
                r9 = r4
                goto L68
            L50:
                if (r10 != r3) goto L55
                r10 = r8
            L53:
                r9 = r6
                goto L68
            L55:
                if (r10 != r2) goto L5c
                if (r12 != r5) goto L5a
                goto L40
            L5a:
                r10 = r12
                goto L53
            L5c:
                if (r10 != r1) goto L67
                int r8 = java.lang.Math.max(r8, r11)
                int r10 = java.lang.Math.min(r8, r12)
                goto L53
            L67:
                r10 = r9
            L68:
                int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r10, r9)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.internal.widget.DivViewGroup.Companion.getChildMeasureSpec(int, int, int, int, int):int");
        }
    }

    /* compiled from: DivViewGroup.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "", "firstChildOffset", "", "spaceBetweenChildren", "edgeDividerOffset", "", "(Lcom/yandex/div/internal/widget/DivViewGroup;FFI)V", "getEdgeDividerOffset", "()I", "setEdgeDividerOffset", "(I)V", "getFirstChildOffset", "()F", "setFirstChildOffset", "(F)V", "getSpaceBetweenChildren", "setSpaceBetweenChildren", "update", "", "freeSpace", "gravity", "childCount", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class OffsetsHolder {
        private int edgeDividerOffset;
        private float firstChildOffset;
        private float spaceBetweenChildren;

        public OffsetsHolder(float f, float f2, int i) {
            this.firstChildOffset = f;
            this.spaceBetweenChildren = f2;
            this.edgeDividerOffset = i;
        }

        public /* synthetic */ OffsetsHolder(DivViewGroup divViewGroup, float f, float f2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0.0f : f, (i2 & 2) != 0 ? 0.0f : f2, (i2 & 4) != 0 ? 0 : i);
        }

        public final float getFirstChildOffset() {
            return this.firstChildOffset;
        }

        public final void setFirstChildOffset(float f) {
            this.firstChildOffset = f;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public final void setSpaceBetweenChildren(float f) {
            this.spaceBetweenChildren = f;
        }

        public final int getEdgeDividerOffset() {
            return this.edgeDividerOffset;
        }

        public final void setEdgeDividerOffset(int i) {
            this.edgeDividerOffset = i;
        }

        public final void update(float freeSpace, int gravity, int childCount) {
            this.firstChildOffset = 0.0f;
            this.spaceBetweenChildren = 0.0f;
            this.edgeDividerOffset = 0;
            switch (gravity) {
                case 1:
                case 16:
                    this.firstChildOffset = freeSpace / 2;
                    return;
                case 3:
                case 48:
                    return;
                case 5:
                case 80:
                    this.firstChildOffset = freeSpace;
                    return;
                case 16777216:
                case 268435456:
                    float spaceAroundPart$div_release = DivViewGroup.INSTANCE.getSpaceAroundPart$div_release(freeSpace, childCount);
                    this.firstChildOffset = spaceAroundPart$div_release;
                    float f = 2;
                    this.spaceBetweenChildren = spaceAroundPart$div_release * f;
                    this.edgeDividerOffset = (int) (spaceAroundPart$div_release / f);
                    return;
                case 33554432:
                case 536870912:
                    this.spaceBetweenChildren = DivViewGroup.INSTANCE.getSpaceBetweenPart$div_release(freeSpace, childCount);
                    return;
                case 67108864:
                case 1073741824:
                    float spaceEvenlyPart$div_release = DivViewGroup.INSTANCE.getSpaceEvenlyPart$div_release(freeSpace, childCount);
                    this.firstChildOffset = spaceEvenlyPart$div_release;
                    this.spaceBetweenChildren = spaceEvenlyPart$div_release;
                    this.edgeDividerOffset = (int) (spaceEvenlyPart$div_release / 2);
                    return;
                default:
                    throw new IllegalStateException("Invalid gravity is set: " + gravity);
            }
        }
    }
}
