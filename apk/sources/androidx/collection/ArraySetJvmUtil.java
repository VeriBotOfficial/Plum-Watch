package androidx.collection;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    static <T> T[] resizeForToArray(T[] tArr, int r2) {
        if (tArr.length < r2) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), r2));
        }
        if (tArr.length > r2) {
            tArr[r2] = null;
        }
        return tArr;
    }
}
