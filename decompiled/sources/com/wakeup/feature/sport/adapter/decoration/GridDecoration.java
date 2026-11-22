package com.wakeup.feature.sport.adapter.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.wakeup.commonui.utils.UIHelper;

/* loaded from: classes3.dex */
public class GridDecoration extends RecyclerView.ItemDecoration {
    private final int itemHeight = UIHelper.dp2px(80.0f);
    private final int itemWidth;

    public GridDecoration(Context context) {
        this.itemWidth = (UIHelper.getWindowWidth(context) - UIHelper.dp2px(24.0f)) / 3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = this.itemWidth;
        layoutParams.height = this.itemHeight;
    }
}
