package com.google.android.gms.internal.consent_sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* JADX INFO: loaded from: classes12.dex */
abstract class zzdc implements Iterator {
    private Object zza;
    private int zzb = 2;

    protected zzdc() {
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.zzb = 2;
        Object obj = this.zza;
        this.zza = null;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    protected abstract Object zza();

    protected final Object zzb() {
        this.zzb = 3;
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int r0 = this.zzb;
        if (r0 == 4) {
            throw new IllegalStateException();
        }
        int r2 = r0 - 1;
        if (r0 == 0) {
            throw null;
        }
        if (r2 == 0) {
            return true;
        }
        if (r2 != 2) {
            this.zzb = 4;
            this.zza = zza();
            if (this.zzb != 3) {
                this.zzb = 1;
                return true;
            }
        }
        return false;
    }
}
