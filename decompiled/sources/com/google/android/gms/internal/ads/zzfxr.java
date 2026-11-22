package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzfxr extends zzfxg {

    @CheckForNull
    Object[] zzd;
    private int zze;

    public zzfxr() {
        super(4);
    }

    @Override // com.google.android.gms.internal.ads.zzfxg, com.google.android.gms.internal.ads.zzfxh
    public final /* bridge */ /* synthetic */ zzfxh zzb(Object obj) {
        zzf(obj);
        return this;
    }

    public final zzfxr zzg(Object... objArr) {
        if (this.zzd == null) {
            zzd(objArr, 2);
            return this;
        }
        for (int i = 0; i < 2; i++) {
            zzf(objArr[i]);
        }
        return this;
    }

    zzfxr(int i, boolean z) {
        super(i);
        this.zzd = new Object[zzfxs.zzh(i)];
    }

    public final zzfxr zzh(Iterable iterable) {
        iterable.getClass();
        if (this.zzd == null) {
            super.zzc(iterable);
            return this;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            zzf(it.next());
        }
        return this;
    }

    public final zzfxs zzi() {
        zzfxs zzv;
        boolean zzw;
        int i = this.zzb;
        if (i == 0) {
            return zzfzf.zza;
        }
        if (i == 1) {
            return new zzfzq(Objects.requireNonNull(this.zza[0]));
        }
        if (this.zzd == null || zzfxs.zzh(i) != this.zzd.length) {
            zzv = zzfxs.zzv(this.zzb, this.zza);
            this.zzb = zzv.size();
        } else {
            int i2 = this.zzb;
            Object[] objArr = this.zza;
            zzw = zzfxs.zzw(i2, objArr.length);
            if (zzw) {
                objArr = Arrays.copyOf(objArr, i2);
            }
            zzv = new zzfzf(objArr, this.zze, this.zzd, r6.length - 1, this.zzb);
        }
        this.zzc = true;
        this.zzd = null;
        return zzv;
    }

    public final zzfxr zzf(Object obj) {
        obj.getClass();
        if (this.zzd != null) {
            int zzh = zzfxs.zzh(this.zzb);
            Object[] objArr = this.zzd;
            if (zzh <= objArr.length) {
                Objects.requireNonNull(objArr);
                int length = this.zzd.length - 1;
                int hashCode = obj.hashCode();
                int zza = zzfxf.zza(hashCode);
                while (true) {
                    int i = zza & length;
                    Object[] objArr2 = this.zzd;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zze += hashCode;
                        super.zza(obj);
                        return this;
                    }
                    if (obj2.equals(obj)) {
                        return this;
                    }
                    zza = i + 1;
                }
            }
        }
        this.zzd = null;
        super.zza(obj);
        return this;
    }
}
