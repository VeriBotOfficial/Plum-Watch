package com.wakeup.commonui.utils;

import android.content.Context;
import android.os.IBinder;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HideKeyboardUtils.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/wakeup/commonui/utils/HideKeyboardUtils;", "", "<init>", "()V", "clearIconWidth", "", "isShouldHideKeyboard", "", "v", "Landroid/view/View;", "event", "Landroid/view/MotionEvent;", "rawOffset", "hideKeyboard", "", "context", "Landroid/content/Context;", "token", "Landroid/os/IBinder;", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class HideKeyboardUtils {
    public static final HideKeyboardUtils INSTANCE = new HideKeyboardUtils();
    private static final int clearIconWidth = 30;

    private HideKeyboardUtils() {
    }

    public static /* synthetic */ boolean isShouldHideKeyboard$default(HideKeyboardUtils hideKeyboardUtils, View view, MotionEvent motionEvent, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return hideKeyboardUtils.isShouldHideKeyboard(view, motionEvent, z);
    }

    public final boolean isShouldHideKeyboard(View v, MotionEvent event, boolean rawOffset) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (!(v instanceof EditText)) {
            return false;
        }
        int[] iArr = {0, 0};
        EditText editText = (EditText) v;
        editText.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return event.getX() <= ((float) i) || event.getX() >= ((float) ((editText.getWidth() + i) + (rawOffset ? 30 : 0))) || event.getY() <= ((float) i2) || event.getY() >= ((float) (editText.getHeight() + i2));
    }

    public final void hideKeyboard(Context context, IBinder token) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (token != null) {
            Object systemService = context.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).hideSoftInputFromWindow(token, 2);
        }
    }
}
