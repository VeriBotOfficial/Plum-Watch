package com.wakeup.commonui.view;

import android.graphics.Rect;
import android.view.View;
import android.widget.PopupWindow;
import com.wakeup.commonui.utils.UIHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: PopupWindowHelper.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/wakeup/commonui/view/PopupWindowHelper;", "", "<init>", "()V", "showBelowOrAbove", "", "anchor", "Landroid/view/View;", "popupWindow", "Landroid/widget/PopupWindow;", "parent", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PopupWindowHelper {
    public static final PopupWindowHelper INSTANCE = new PopupWindowHelper();

    private PopupWindowHelper() {
    }

    public final void showBelowOrAbove(View anchor, PopupWindow popupWindow, View parent) {
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Intrinsics.checkNotNullParameter(popupWindow, "popupWindow");
        Intrinsics.checkNotNullParameter(parent, "parent");
        popupWindow.getContentView().measure(View.MeasureSpec.makeMeasureSpec(popupWindow.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = popupWindow.getContentView().getMeasuredHeight();
        int width = popupWindow.getWidth();
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        int height = anchor.getHeight();
        Rect rect = new Rect();
        parent.getWindowVisibleDisplayFrame(rect);
        int i3 = height + i2;
        if ((rect.bottom - rect.top) - (i3 - rect.top) < measuredHeight) {
            i3 = i2 - measuredHeight;
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(i3, 0);
        int i4 = parent.getResources().getDisplayMetrics().widthPixels;
        if (i + width > i4) {
            i = i4 - width;
        }
        if (i < 0) {
            i = 0;
        }
        popupWindow.showAtLocation(anchor, 0, i - UIHelper.dp2px(20.0f), coerceAtLeast);
    }
}
