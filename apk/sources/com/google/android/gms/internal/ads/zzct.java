package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzct {
    public static void zza(Spannable spannable, float f, int r7, int r8, int r9) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(r7, r8, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= r7 && spannable.getSpanEnd(relativeSizeSpan) >= r8) {
                f *= relativeSizeSpan.getSizeChange();
            }
            zzc(spannable, relativeSizeSpan, r7, r8, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f), r7, r8, 33);
    }

    public static void zzb(Spannable spannable, Object obj, int r6, int r7, int r8) {
        for (Object obj2 : spannable.getSpans(r6, r7, obj.getClass())) {
            zzc(spannable, obj2, r6, r7, 33);
        }
        spannable.setSpan(obj, r6, r7, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int r2, int r3, int r4) {
        if (spannable.getSpanStart(obj) == r2 && spannable.getSpanEnd(obj) == r3 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
