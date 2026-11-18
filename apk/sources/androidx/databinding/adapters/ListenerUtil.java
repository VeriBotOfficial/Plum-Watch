package androidx.databinding.adapters;

import android.util.SparseArray;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class ListenerUtil {
    private static final SparseArray<WeakHashMap<View, WeakReference<?>>> sListeners = new SparseArray<>();

    public static <T> T trackListener(View view, T t, int r3) {
        T t2 = (T) view.getTag(r3);
        view.setTag(r3, t);
        return t2;
    }

    public static <T> T getListener(View view, int r1) {
        return (T) view.getTag(r1);
    }
}
