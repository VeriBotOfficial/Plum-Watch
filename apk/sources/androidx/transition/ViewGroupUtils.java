package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes7.dex */
class ViewGroupUtils {
    private static Method sGetChildDrawingOrderMethod = null;
    private static boolean sGetChildDrawingOrderMethodFetched = false;
    private static boolean sTryHiddenSuppressLayout = true;

    static void suppressLayout(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.suppressLayout(viewGroup, z);
        } else {
            hiddenSuppressLayout(viewGroup, z);
        }
    }

    private static void hiddenSuppressLayout(ViewGroup viewGroup, boolean z) {
        if (sTryHiddenSuppressLayout) {
            try {
                Api29Impl.suppressLayout(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                sTryHiddenSuppressLayout = false;
            }
        }
    }

    static int getChildDrawingOrder(ViewGroup viewGroup, int r7) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.getChildDrawingOrder(viewGroup, r7);
        }
        if (!sGetChildDrawingOrderMethodFetched) {
            try {
                Method declaredMethod = ViewGroup.class.getDeclaredMethod("getChildDrawingOrder", Integer.TYPE, Integer.TYPE);
                sGetChildDrawingOrderMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            sGetChildDrawingOrderMethodFetched = true;
        }
        Method method = sGetChildDrawingOrderMethod;
        if (method != null) {
            try {
                return ((Integer) method.invoke(viewGroup, Integer.valueOf(viewGroup.getChildCount()), Integer.valueOf(r7))).intValue();
            } catch (IllegalAccessException | InvocationTargetException unused2) {
            }
        }
        return r7;
    }

    private ViewGroupUtils() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void suppressLayout(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }

        static int getChildDrawingOrder(ViewGroup viewGroup, int r1) {
            return viewGroup.getChildDrawingOrder(r1);
        }
    }
}
