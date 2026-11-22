package com.wakeup.commonui.viewHolder;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HorizontalItemDecoration.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\u0014"}, d2 = {"Lcom/wakeup/commonui/viewHolder/HorizontalItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "spacing", "", "<init>", "(I)V", "start", "getStart", "()I", "setStart", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HorizontalItemDecoration extends RecyclerView.ItemDecoration {
    private final int spacing;
    private int start;

    public HorizontalItemDecoration() {
        this(0, 1, null);
    }

    public /* synthetic */ HorizontalItemDecoration(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public HorizontalItemDecoration(int i) {
        this.spacing = i;
    }

    public final int getStart() {
        return this.start;
    }

    public final void setStart(int i) {
        this.start = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        RecyclerView.Adapter adapter = parent.getAdapter();
        Intrinsics.checkNotNull(adapter);
        int itemCount = adapter.getItemCount() - 1;
        if (childAdapterPosition == 0) {
            outRect.left = this.start;
        } else if (childAdapterPosition == itemCount) {
            outRect.left = this.spacing;
            outRect.right = this.start;
        } else {
            outRect.left = this.spacing;
        }
    }
}
