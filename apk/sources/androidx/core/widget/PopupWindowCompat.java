package androidx.core.widget;

import android.view.View;
import android.widget.PopupWindow;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes8.dex */
public final class PopupWindowCompat {
    private static final String TAG = "PopupWindowCompatApi21";
    private static Method sGetWindowLayoutTypeMethod;
    private static boolean sGetWindowLayoutTypeMethodAttempted;
    private static Field sOverlapAnchorField;
    private static boolean sOverlapAnchorFieldAttempted;
    private static Method sSetWindowLayoutTypeMethod;
    private static boolean sSetWindowLayoutTypeMethodAttempted;

    private PopupWindowCompat() {
    }

    public static void showAsDropDown(PopupWindow popupWindow, View view, int r2, int r3, int r4) {
        popupWindow.showAsDropDown(view, r2, r3, r4);
    }

    public static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
        Api23Impl.setOverlapAnchor(popupWindow, z);
    }

    public static boolean getOverlapAnchor(PopupWindow popupWindow) {
        return Api23Impl.getOverlapAnchor(popupWindow);
    }

    public static void setWindowLayoutType(PopupWindow popupWindow, int r1) {
        Api23Impl.setWindowLayoutType(popupWindow, r1);
    }

    public static int getWindowLayoutType(PopupWindow popupWindow) {
        return Api23Impl.getWindowLayoutType(popupWindow);
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setOverlapAnchor(PopupWindow popupWindow, boolean z) {
            popupWindow.setOverlapAnchor(z);
        }

        static boolean getOverlapAnchor(PopupWindow popupWindow) {
            return popupWindow.getOverlapAnchor();
        }

        static void setWindowLayoutType(PopupWindow popupWindow, int r1) {
            popupWindow.setWindowLayoutType(r1);
        }

        static int getWindowLayoutType(PopupWindow popupWindow) {
            return popupWindow.getWindowLayoutType();
        }
    }
}
