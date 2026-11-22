package com.wakeup.commonui.temp;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LinearLayoutSpacingItemDecoration.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/wakeup/commonui/temp/LinearLayoutSpacingItemDecoration;", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mSpanCount", "", "type", "rowSpacing", "lineSpacing", "<init>", "(IIII)V", "getType", "()I", "mRowSpacing", "mLineSpacing", "getItemOffsets", "", "outRect", "Landroid/graphics/Rect;", "view", "Landroid/view/View;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "Companion", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LinearLayoutSpacingItemDecoration extends RecyclerView.ItemDecoration {
    public static final int HORIZONTAL_TYPE = 2;
    public static final int VERTICAL_TYPE = 1;
    private final int lineSpacing;
    private final int mLineSpacing;
    private final int mRowSpacing;
    private final int mSpanCount;
    private final int rowSpacing;
    private final int type;

    public /* synthetic */ LinearLayoutSpacingItemDecoration(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }

    public final int getType() {
        return this.type;
    }

    public LinearLayoutSpacingItemDecoration(int i, int i2, int i3, int i4) {
        this.mSpanCount = i;
        this.type = i2;
        this.rowSpacing = i3;
        this.lineSpacing = i4;
        this.mRowSpacing = i3 / 2;
        this.mLineSpacing = i4 / 2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(state, "state");
        int childAdapterPosition = parent.getChildAdapterPosition(view);
        int i = this.type;
        if (i == 1) {
            if (childAdapterPosition == 0) {
                outRect.top = this.mLineSpacing * 2;
            } else {
                outRect.bottom = this.mLineSpacing;
            }
            if (childAdapterPosition == this.mSpanCount - 1) {
                outRect.bottom = this.mLineSpacing * 2;
            } else {
                outRect.top = this.mLineSpacing;
            }
            outRect.left = this.mRowSpacing;
            outRect.right = this.mRowSpacing;
            return;
        }
        if (i != 2) {
            return;
        }
        if (childAdapterPosition == 0) {
            outRect.left = this.mRowSpacing * 2;
        } else {
            outRect.left = this.mRowSpacing;
        }
        if (childAdapterPosition == this.mSpanCount - 1) {
            outRect.right = this.mRowSpacing * 2;
        } else {
            outRect.right = this.mRowSpacing;
        }
        outRect.top = this.mLineSpacing;
        outRect.bottom = this.mLineSpacing;
    }
}
