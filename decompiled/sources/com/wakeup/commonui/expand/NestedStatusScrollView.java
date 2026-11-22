package com.wakeup.commonui.expand;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes2.dex */
public class NestedStatusScrollView extends NestedScrollView implements NestedScrollView.OnScrollChangeListener {
    private AddScrollChangeListener addScrollChangeListener;
    private boolean bottom;
    private final Handler handler;
    private boolean isStart;
    private int lastScrollY;
    private long lastTime;

    /* renamed from: top, reason: collision with root package name */
    private boolean f14281top;
    public int totalHeight;
    public int viewHeight;

    public interface AddScrollChangeListener {
        void onScrollChange(int i, int i2, int i3, int i4);

        void onScrollState(ScrollState scrollState);
    }

    public enum ScrollState {
        DRAG,
        SCROLLING,
        IDLE
    }

    public NestedStatusScrollView(Context context) {
        this(context, null);
    }

    public NestedStatusScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NestedStatusScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.totalHeight = 0;
        this.viewHeight = 0;
        this.isStart = false;
        this.bottom = false;
        this.f14281top = false;
        setOnScrollChangeListener(this);
        this.handler = new Handler(context.getMainLooper());
    }

    @Override // androidx.core.widget.NestedScrollView.OnScrollChangeListener
    public void onScrollChange(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        AddScrollChangeListener addScrollChangeListener = this.addScrollChangeListener;
        if (addScrollChangeListener != null) {
            addScrollChangeListener.onScrollChange(i, i2, i3, i4);
        }
        int i5 = this.totalHeight;
        int i6 = this.viewHeight;
        this.bottom = i5 > i6 && i5 - i6 == i2;
        this.f14281top = getScrollY() <= 0;
    }

    @Override // androidx.core.widget.NestedScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.totalHeight = 0;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            this.totalHeight += getChildAt(i3).getMeasuredHeight();
        }
        this.viewHeight = getHeight();
    }

    public boolean isBottom() {
        return this.bottom;
    }

    public boolean isTop() {
        return this.f14281top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0010, code lost:
    
        if (r0 != 4) goto L17;
     */
    @Override // androidx.core.widget.NestedScrollView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            int r0 = r4.getAction()
            if (r0 == 0) goto L19
            r1 = 1
            if (r0 == r1) goto L13
            r2 = 2
            if (r0 == r2) goto L19
            r2 = 3
            if (r0 == r2) goto L13
            r2 = 4
            if (r0 == r2) goto L13
            goto L25
        L13:
            r3.isStart = r1
            r3.start()
            goto L25
        L19:
            r0 = 0
            r3.isStart = r0
            com.wakeup.commonui.expand.NestedStatusScrollView$AddScrollChangeListener r0 = r3.addScrollChangeListener
            if (r0 == 0) goto L25
            com.wakeup.commonui.expand.NestedStatusScrollView$ScrollState r1 = com.wakeup.commonui.expand.NestedStatusScrollView.ScrollState.DRAG
            r0.onScrollState(r1)
        L25:
            boolean r4 = super.onTouchEvent(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.expand.NestedStatusScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private void start() {
        new Thread(new Runnable() { // from class: com.wakeup.commonui.expand.NestedStatusScrollView.1
            @Override // java.lang.Runnable
            public void run() {
                while (NestedStatusScrollView.this.isStart) {
                    if (System.currentTimeMillis() - NestedStatusScrollView.this.lastTime > 50) {
                        int scrollY = NestedStatusScrollView.this.getScrollY();
                        NestedStatusScrollView.this.lastTime = System.currentTimeMillis();
                        if (scrollY - NestedStatusScrollView.this.lastScrollY == 0) {
                            NestedStatusScrollView.this.isStart = false;
                            NestedStatusScrollView.this.handler.post(new Runnable() { // from class: com.wakeup.commonui.expand.NestedStatusScrollView.1.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (NestedStatusScrollView.this.addScrollChangeListener != null) {
                                        NestedStatusScrollView.this.addScrollChangeListener.onScrollState(ScrollState.IDLE);
                                    }
                                }
                            });
                        } else {
                            NestedStatusScrollView.this.handler.post(new Runnable() { // from class: com.wakeup.commonui.expand.NestedStatusScrollView.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    if (!NestedStatusScrollView.this.isStart || NestedStatusScrollView.this.addScrollChangeListener == null) {
                                        return;
                                    }
                                    NestedStatusScrollView.this.addScrollChangeListener.onScrollState(ScrollState.SCROLLING);
                                }
                            });
                        }
                        NestedStatusScrollView.this.lastScrollY = scrollY;
                    }
                }
            }
        }).start();
    }

    public NestedStatusScrollView addScrollChangeListener(AddScrollChangeListener addScrollChangeListener) {
        this.addScrollChangeListener = addScrollChangeListener;
        return this;
    }
}
