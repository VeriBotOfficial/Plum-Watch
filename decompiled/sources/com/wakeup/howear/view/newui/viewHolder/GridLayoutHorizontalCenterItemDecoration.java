package com.wakeup.howear.view.newui.viewHolder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
public class GridLayoutHorizontalCenterItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacing;
    private final int spacingTop;
    private final int spanCount;

    public GridLayoutHorizontalCenterItemDecoration(int i, int i2, int i3) {
        this.spanCount = i;
        this.spacing = i2;
        this.spacingTop = i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition >= this.spanCount) {
            rect.top = this.spacingTop;
        }
        int i = this.spanCount;
        int i2 = childAdapterPosition % i;
        if (i2 == 0) {
            rect.left = 0;
        } else {
            rect.left = (int) (((i2 * 1.0f) * this.spacing) / i);
        }
        rect.right = (int) (((((r5 - i2) - 1) * 1.0f) * this.spacing) / this.spanCount);
    }
}
