package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* JADX INFO: loaded from: classes12.dex */
public enum zzs {
    DEBUG(3),
    ERROR(6),
    INFO(4),
    VERBOSE(2),
    WARN(5);

    public static zzs zza(int r1) {
        if (r1 == 2) {
            return VERBOSE;
        }
        if (r1 == 3) {
            return DEBUG;
        }
        if (r1 != 5) {
            return r1 != 6 ? INFO : ERROR;
        }
        return WARN;
    }

    zzs(int r3) {
    }
}
