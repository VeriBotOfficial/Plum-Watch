package com.wakeup.howear.view.newui.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AutoHeightPager.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002J\u0018\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/wakeup/howear/view/newui/adapter/AutoHeightViewPager;", "Landroidx/viewpager/widget/ViewPager;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "lastWidthMeasureSpec", "", Snapshot.CURRENT_HEIGHT, "lastPosition", "isScrolling", "", "setAdapter", "", "adapter", "Landroidx/viewpager/widget/PagerAdapter;", "getViewHeight", "position", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AutoHeightViewPager extends ViewPager {
    private int currentHeight;
    private boolean isScrolling;
    private int lastPosition;
    private int lastWidthMeasureSpec;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoHeightViewPager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ AutoHeightViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoHeightViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() { // from class: com.wakeup.howear.view.newui.adapter.AutoHeightViewPager.1
            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (positionOffset == 0.0f) {
                    AutoHeightViewPager.this.isScrolling = false;
                    AutoHeightViewPager.this.requestLayout();
                    return;
                }
                int i = position >= AutoHeightViewPager.this.lastPosition ? position : position + 1;
                int i2 = position >= AutoHeightViewPager.this.lastPosition ? position + 1 : position;
                int viewHeight = AutoHeightViewPager.this.getViewHeight(i);
                int viewHeight2 = AutoHeightViewPager.this.getViewHeight(i2);
                AutoHeightViewPager autoHeightViewPager = AutoHeightViewPager.this;
                float f = viewHeight;
                float f2 = viewHeight2 - viewHeight;
                if (position < autoHeightViewPager.lastPosition) {
                    positionOffset = 1 - positionOffset;
                }
                autoHeightViewPager.currentHeight = (int) (f + (f2 * positionOffset));
                AutoHeightViewPager.this.isScrolling = true;
                AutoHeightViewPager.this.requestLayout();
            }

            @Override // androidx.viewpager.widget.ViewPager.SimpleOnPageChangeListener, androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int state) {
                if (state == 0) {
                    AutoHeightViewPager autoHeightViewPager = AutoHeightViewPager.this;
                    autoHeightViewPager.lastPosition = autoHeightViewPager.getCurrentItem();
                }
            }
        });
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setAdapter(PagerAdapter adapter) {
        if (adapter != null && !(adapter instanceof AutoHeightPager)) {
            throw new IllegalArgumentException("PagerAdapter must implement AutoHeightPager.".toString());
        }
        super.setAdapter(adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getViewHeight(int position) {
        View view;
        Object adapter = getAdapter();
        AutoHeightPager autoHeightPager = adapter instanceof AutoHeightPager ? (AutoHeightPager) adapter : null;
        if (autoHeightPager == null || (view = autoHeightPager.getView(position)) == null) {
            return 0;
        }
        view.measure(this.lastWidthMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.lastWidthMeasureSpec = widthMeasureSpec;
        if (this.isScrolling) {
            heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.currentHeight, 1073741824);
        } else {
            Integer valueOf = Integer.valueOf(getViewHeight(getCurrentItem()));
            if (valueOf.intValue() <= 0) {
                valueOf = null;
            }
            if (valueOf != null) {
                heightMeasureSpec = View.MeasureSpec.makeMeasureSpec(valueOf.intValue(), 1073741824);
            }
        }
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
