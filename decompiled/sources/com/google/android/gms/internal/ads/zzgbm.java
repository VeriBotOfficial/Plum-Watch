package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgax;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
abstract class zzgbm extends zzgax.zzi {
    private static final zzgbi zzbe;
    private static final zzgcq zzbf = new zzgcq(zzgbm.class);
    private volatile int remaining;

    @CheckForNull
    private volatile Set<Throwable> seenExceptions = null;

    static {
        Throwable th;
        zzgbi zzgbkVar;
        zzgbl zzgblVar = null;
        try {
            zzgbkVar = new zzgbj(AtomicReferenceFieldUpdater.newUpdater(zzgbm.class, Set.class, "seenExceptions"), AtomicIntegerFieldUpdater.newUpdater(zzgbm.class, "remaining"));
            th = null;
        } catch (Throwable th2) {
            th = th2;
            zzgbkVar = new zzgbk(zzgblVar);
        }
        zzbe = zzgbkVar;
        if (th != null) {
            zzbf.zza().logp(Level.SEVERE, "com.google.common.util.concurrent.AggregateFutureState", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
    }

    zzgbm(int i) {
        this.remaining = i;
    }

    final int zzA() {
        return zzbe.zza(this);
    }

    final Set zzC() {
        Set<Throwable> set = this.seenExceptions;
        if (set != null) {
            return set;
        }
        Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        zze(newSetFromMap);
        zzbe.zzb(this, null, newSetFromMap);
        return (Set) Objects.requireNonNull(this.seenExceptions);
    }

    final void zzF() {
        this.seenExceptions = null;
    }

    abstract void zze(Set set);
}
