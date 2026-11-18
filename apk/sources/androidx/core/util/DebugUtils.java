package androidx.core.util;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes8.dex */
public class DebugUtils {
    public static void buildShortClassTag(Object obj, StringBuilder sb) {
        int r1;
        if (obj == null) {
            sb.append(AbstractJsonLexerKt.NULL);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if ((simpleName == null || simpleName.length() <= 0) && (r1 = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(r1 + 1);
        }
        sb.append(simpleName);
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    private DebugUtils() {
    }
}
