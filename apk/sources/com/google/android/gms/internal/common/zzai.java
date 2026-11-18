package com.google.android.gms.internal.common;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes12.dex */
public final class zzai {
    static Object[] zza(Object[] objArr, int r3) {
        for (int r0 = 0; r0 < r3; r0++) {
            if (objArr[r0] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(r0).length() + 9);
                sb.append("at index ");
                sb.append(r0);
                throw new NullPointerException(sb.toString());
            }
        }
        return objArr;
    }
}
