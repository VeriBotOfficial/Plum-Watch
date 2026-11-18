package androidx.media3.common.text;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes8.dex */
public final class SpanUtil {
    public static void addOrReplaceSpan(Spannable spannable, Object obj, int r6, int r7, int r8) {
        for (Object obj2 : spannable.getSpans(r6, r7, obj.getClass())) {
            removeIfStartEndAndFlagsMatch(spannable, obj2, r6, r7, r8);
        }
        spannable.setSpan(obj, r6, r7, r8);
    }

    public static void addInheritedRelativeSizeSpan(Spannable spannable, float f, int r7, int r8, int r9) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(r7, r8, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= r7 && spannable.getSpanEnd(relativeSizeSpan) >= r8) {
                f *= relativeSizeSpan.getSizeChange();
            }
            removeIfStartEndAndFlagsMatch(spannable, relativeSizeSpan, r7, r8, r9);
        }
        spannable.setSpan(new RelativeSizeSpan(f), r7, r8, r9);
    }

    private static void removeIfStartEndAndFlagsMatch(Spannable spannable, Object obj, int r3, int r4, int r5) {
        if (spannable.getSpanStart(obj) == r3 && spannable.getSpanEnd(obj) == r4 && spannable.getSpanFlags(obj) == r5) {
            spannable.removeSpan(obj);
        }
    }

    private SpanUtil() {
    }
}
