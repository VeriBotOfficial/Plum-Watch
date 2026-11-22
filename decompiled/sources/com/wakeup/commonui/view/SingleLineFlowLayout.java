package com.wakeup.commonui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class SingleLineFlowLayout extends ViewGroup {
    private static final String TAG = "FlowLayout";
    public boolean alignRight;
    public boolean countMore;
    private final List<Integer> mLineHeight;
    private final List<List<View>> mLineViews;
    public int position;

    public SingleLineFlowLayout(Context context) {
        super(context);
        this.mLineViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.position = -1;
    }

    public SingleLineFlowLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mLineViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.position = -1;
    }

    public SingleLineFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mLineViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.position = -1;
    }

    public SingleLineFlowLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.mLineViews = new ArrayList();
        this.mLineHeight = new ArrayList();
        this.position = -1;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int max;
        int i4;
        int i5 = i;
        int i6 = i2;
        super.onMeasure(i, i2);
        this.mLineViews.clear();
        this.mLineHeight.clear();
        int mode = View.MeasureSpec.getMode(i5);
        int size = (View.MeasureSpec.getSize(i5) - getPaddingLeft()) - getPaddingRight();
        int mode2 = View.MeasureSpec.getMode(i6);
        int size2 = View.MeasureSpec.getSize(i6) + getPaddingTop() + getPaddingBottom();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            ArrayList arrayList = new ArrayList();
            int i7 = size;
            size2 = paddingTop;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (i8 < getChildCount()) {
                View childAt = getChildAt(i8);
                measureChild(childAt, i5, i6);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                int i13 = size2;
                int i14 = i9 + measuredWidth;
                int i15 = i7;
                int i16 = i9;
                if (i14 > size) {
                    String str = (String) childAt.getTag();
                    if (str != null && str.equals("More")) {
                        max = Math.max(i11, measuredHeight);
                    } else {
                        removeViews(i8, (getChildCount() - 1) - i8);
                        View childAt2 = getChildAt(i8);
                        String str2 = (String) childAt2.getTag();
                        if (str2 == null || !str2.equals("More")) {
                            max = Math.max(i11, measuredHeight);
                            childAt = childAt2;
                        } else {
                            measureChild(childAt2, i5, i6);
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) childAt2.getLayoutParams();
                            int measuredWidth2 = childAt2.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin;
                            int measuredHeight2 = childAt2.getMeasuredHeight() + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                            if (i16 + measuredWidth2 > size) {
                                int i17 = i8 - 1;
                                arrayList.remove(getChildAt(i17));
                                removeViewAt(i17);
                                i4 = i16 - i10;
                            } else {
                                i4 = i16;
                            }
                            if (i8 - 1 > 0 && i4 + measuredWidth2 > size) {
                                i4 = ((i4 - i12) - marginLayoutParams2.leftMargin) - marginLayoutParams2.rightMargin;
                                int i18 = i8 - 2;
                                arrayList.remove(getChildAt(i18));
                                removeViewAt(i18);
                            }
                            i9 = i4 + measuredWidth2;
                            int max2 = Math.max(i11, measuredHeight2);
                            if (this.alignRight) {
                                int i19 = marginLayoutParams2.rightMargin;
                                marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, 0, marginLayoutParams2.bottomMargin);
                                childAt2.setLayoutParams(marginLayoutParams2);
                                marginLayoutParams2 = (ViewGroup.MarginLayoutParams) getChildAt(0).getLayoutParams();
                                marginLayoutParams2.setMargins(((marginLayoutParams2.leftMargin + size) - i9) + i19, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                                getChildAt(0).setLayoutParams(marginLayoutParams2);
                            } else {
                                marginLayoutParams2.setMargins(size - i9, marginLayoutParams2.topMargin, 0, marginLayoutParams2.bottomMargin);
                                childAt2.setLayoutParams(marginLayoutParams2);
                            }
                            arrayList.add(childAt2);
                            marginLayoutParams = marginLayoutParams2;
                            childAt = childAt2;
                            measuredWidth = measuredWidth2;
                            max = max2;
                            i11 = max;
                        }
                    }
                    i9 = i16;
                    i11 = max;
                } else {
                    if (i8 <= 1) {
                        i10 = i12;
                    }
                    int max3 = Math.max(i11, measuredHeight);
                    String str3 = (String) childAt.getTag();
                    if (str3 != null && str3.equals("More")) {
                        if (this.countMore) {
                            arrayList.add(childAt);
                        }
                    } else {
                        arrayList.add(childAt);
                    }
                    i11 = max3;
                    i9 = i14;
                    i12 = i10;
                    i10 = measuredWidth;
                }
                if (i8 >= getChildCount() - 1) {
                    if (this.alignRight) {
                        int i20 = marginLayoutParams.rightMargin;
                        marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, 0, marginLayoutParams.bottomMargin);
                        childAt.setLayoutParams(marginLayoutParams);
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) getChildAt(0).getLayoutParams();
                        marginLayoutParams3.setMargins(((marginLayoutParams3.leftMargin + size) - i9) + i20, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                        getChildAt(0).setLayoutParams(marginLayoutParams3);
                    }
                    this.mLineViews.add(arrayList);
                    i3 = Math.max(measuredWidth, size);
                    size2 = i13 + i11;
                    this.mLineHeight.add(Integer.valueOf(i11));
                } else {
                    size2 = i13;
                    i3 = i15;
                }
                i8++;
                i6 = i2;
                i7 = i3;
                i5 = i;
            }
            size = i7;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth;
        int i5;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.mLineViews.size();
        for (int i6 = 0; i6 < size; i6++) {
            int intValue = this.mLineHeight.get(i6).intValue();
            List<View> list = this.mLineViews.get(i6);
            int size2 = list.size();
            int i7 = 0;
            while (i7 < size2) {
                View view = list.get(i7);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int i8 = (i7 == 0 ? 0 : marginLayoutParams.leftMargin) + paddingLeft;
                if (this.alignRight) {
                    i8 = marginLayoutParams.leftMargin + paddingLeft;
                }
                int i9 = marginLayoutParams.topMargin + paddingTop;
                view.layout(i8, i9, view.getMeasuredWidth() + i8, view.getMeasuredHeight() + i9);
                if (this.alignRight) {
                    measuredWidth = view.getMeasuredWidth() + marginLayoutParams.leftMargin;
                    i5 = marginLayoutParams.rightMargin;
                } else {
                    measuredWidth = view.getMeasuredWidth() + (i7 == 0 ? 0 : marginLayoutParams.leftMargin);
                    i5 = marginLayoutParams.rightMargin;
                }
                paddingLeft += measuredWidth + i5;
                i7++;
            }
            paddingLeft = getPaddingLeft();
            paddingTop += intValue;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }
}
