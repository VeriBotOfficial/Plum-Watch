package com.mbridge.msdk.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;

/* JADX INFO: loaded from: classes2.dex */
public class FeedbackRadioGroup extends RadioGroup {
    public FeedbackRadioGroup(Context context) {
        super(context);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int r10, int r11, int r12, int r13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredHeight = 0;
        for (int r0 = 0; r0 < childCount; r0++) {
            View childAt = getChildAt(r0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams.leftMargin + paddingLeft + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin + getPaddingRight() > r12 - r10) {
                paddingLeft = getPaddingLeft();
                paddingTop += measuredHeight;
                measuredHeight = getChildAt(r0).getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
            } else {
                measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
            }
            int r4 = marginLayoutParams.leftMargin + paddingLeft;
            int r5 = marginLayoutParams.topMargin + paddingTop;
            childAt.layout(r4, r5, childAt.getMeasuredWidth() + r4, childAt.getMeasuredHeight() + r5);
            paddingLeft += marginLayoutParams.leftMargin + childAt.getMeasuredWidth() + marginLayoutParams.rightMargin;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int r18, int r19) {
        int r9;
        int size = View.MeasureSpec.getSize(r18);
        int mode = View.MeasureSpec.getMode(r18);
        int size2 = View.MeasureSpec.getSize(r19);
        int mode2 = View.MeasureSpec.getMode(r19);
        measureChildren(r18, r19);
        int childCount = getChildCount();
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r10 = 0;
        int measuredHeight = 0;
        while (r6 < childCount) {
            View childAt = getChildAt(r6);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            int r14 = r10 + measuredWidth;
            if (getPaddingLeft() + r14 + getPaddingRight() > size) {
                r9 = Math.max(r10, r8);
                r7 += measuredHeight;
                measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                Log.v("FeedbackRadioGroup", "maxHeight:" + r7 + "---maxWidth:" + r9);
            } else {
                measuredHeight = Math.max(measuredHeight, childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
                measuredWidth = r14;
                r9 = r8;
            }
            if (r6 == childCount - 1) {
                r7 += measuredHeight;
                r8 = Math.max(measuredWidth, r8);
            } else {
                r8 = r9;
            }
            r6++;
            r10 = measuredWidth;
        }
        int paddingLeft = r8 + getPaddingLeft() + getPaddingRight();
        int paddingTop = r7 + getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824) {
            size = paddingLeft;
        }
        if (mode2 != 1073741824) {
            size2 = paddingTop;
        }
        setMeasuredDimension(size, size2);
    }

    public FeedbackRadioGroup(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
