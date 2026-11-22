package ai.onnxruntime;

import java.util.EnumSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public interface OrtFlags {
    int getValue();

    static <E extends Enum<E> & OrtFlags> int aggregateToInt(EnumSet<E> enumSet) {
        Iterator it = enumSet.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((OrtFlags) it.next()).getValue();
        }
        return i;
    }
}
