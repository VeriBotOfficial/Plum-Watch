package com.google.android.gms.internal.ads;

import com.alipay.sdk.m.p.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
public abstract class zzfxq implements Map, Serializable {

    @CheckForNull
    private transient zzfxs zza;

    @CheckForNull
    private transient zzfxs zzb;

    @CheckForNull
    private transient zzfxi zzc;

    zzfxq() {
    }

    public static zzfxq zzc(Map map) {
        Set entrySet = map.entrySet();
        zzfxp zzfxpVar = new zzfxp(entrySet instanceof Collection ? entrySet.size() : 4);
        zzfxpVar.zzb(entrySet);
        return zzfxpVar.zzc();
    }

    public static zzfxq zzd() {
        return zzfze.zza;
    }

    public static zzfxq zze(Object obj, Object obj2) {
        zzfwk.zzb("dialog_not_shown_reason", obj2);
        return zzfze.zzj(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(@CheckForNull Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(@CheckForNull Object obj) {
        return zzfyk.zzb(this, obj);
    }

    @Override // java.util.Map
    @CheckForNull
    public abstract Object get(@CheckForNull Object obj);

    @Override // java.util.Map
    @CheckForNull
    public final Object getOrDefault(@CheckForNull Object obj, @CheckForNull Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzfzp.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final Object remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        zzfwk.zza(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append(a.h);
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    abstract zzfxi zza();

    @Override // java.util.Map
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzfxi values() {
        zzfxi zzfxiVar = this.zzc;
        if (zzfxiVar != null) {
            return zzfxiVar;
        }
        zzfxi zza = zza();
        this.zzc = zza;
        return zza;
    }

    abstract zzfxs zzf();

    abstract zzfxs zzg();

    @Override // java.util.Map
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzfxs entrySet() {
        zzfxs zzfxsVar = this.zza;
        if (zzfxsVar != null) {
            return zzfxsVar;
        }
        zzfxs zzf = zzf();
        this.zza = zzf;
        return zzf;
    }

    @Override // java.util.Map
    /* renamed from: zzi, reason: merged with bridge method [inline-methods] */
    public final zzfxs keySet() {
        zzfxs zzfxsVar = this.zzb;
        if (zzfxsVar != null) {
            return zzfxsVar;
        }
        zzfxs zzg = zzg();
        this.zzb = zzg;
        return zzg;
    }
}
