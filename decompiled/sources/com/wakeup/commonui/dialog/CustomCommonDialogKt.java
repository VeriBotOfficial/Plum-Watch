package com.wakeup.commonui.dialog;

import android.view.Window;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CustomCommonDialog.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0005"}, d2 = {"adjustMargin", "Lcom/wakeup/commonui/dialog/CustomCommonDialog;", ViewProps.MARGIN_VERTICAL, "", ViewProps.MARGIN_HORIZONTAL, "commonui_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CustomCommonDialogKt {
    public static /* synthetic */ CustomCommonDialog adjustMargin$default(CustomCommonDialog customCommonDialog, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        return adjustMargin(customCommonDialog, i, i2);
    }

    public static final CustomCommonDialog adjustMargin(CustomCommonDialog customCommonDialog, int i, int i2) {
        Intrinsics.checkNotNullParameter(customCommonDialog, "<this>");
        Window window = customCommonDialog.getWindow();
        if (window != null) {
            window.getAttributes().width -= i2 * 2;
            window.getAttributes().height -= i * 2;
        }
        return customCommonDialog;
    }
}
