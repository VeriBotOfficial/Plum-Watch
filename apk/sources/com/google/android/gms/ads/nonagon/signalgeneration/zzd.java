package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.SharedPreferences;
import com.anythink.expressad.foundation.g.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes15.dex */
public final class zzd {
    private SharedPreferences zza;
    private SharedPreferences.Editor zzb;
    private final Context zzc;
    private final Object zzd = new Object();

    zzd(Context context) {
        this.zzc = context;
    }

    private final void zzk() {
        synchronized (this.zzd) {
            if (this.zza != null) {
                return;
            }
            SharedPreferences sharedPreferences = this.zzc.getSharedPreferences("query_info_shared_prefs", 0);
            this.zza = sharedPreferences;
            this.zzb = sharedPreferences.edit();
        }
    }

    public final int zza() {
        int r1;
        zzk();
        synchronized (this.zzd) {
            r1 = this.zza.getInt("aav", -1);
        }
        return r1;
    }

    public final int zzb() {
        int r1;
        zzk();
        synchronized (this.zzd) {
            r1 = this.zza.getInt(a.M, -1);
        }
        return r1;
    }

    public final String zzc(String str) {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(str, null);
            this.zzb.remove(str).commit();
        }
        return string;
    }

    public final String zzd() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString(a.O, null);
        }
        return string;
    }

    public final String zze() {
        String string;
        zzk();
        synchronized (this.zzd) {
            string = this.zza.getString("pn", null);
        }
        return string;
    }

    public final Map zzf() {
        HashMap map;
        zzk();
        synchronized (this.zzd) {
            Map<String, ?> all = this.zza.getAll();
            map = new HashMap();
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                if ((entry.getValue() instanceof String) && !Objects.equals(entry.getKey(), "pn") && !Objects.equals(entry.getKey(), a.M) && !Objects.equals(entry.getKey(), a.O) && !Objects.equals(entry.getKey(), "aav")) {
                    map.put(entry.getKey(), (String) entry.getValue());
                }
            }
        }
        return map;
    }

    public final void zzg() {
        zzk();
        synchronized (this.zzd) {
            this.zzb.clear().commit();
        }
    }

    public final void zzh(String str, String str2) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString(str, str2).commit();
        }
    }

    public final void zzi(String str, int r5, String str2, int r7) {
        zzk();
        synchronized (this.zzd) {
            this.zzb.putString("pn", str).putInt(a.M, r5).putString(a.O, str2).putInt("aav", r7).commit();
        }
    }

    public final boolean zzj(String str) {
        boolean zContains;
        zzk();
        synchronized (this.zzd) {
            zContains = this.zza.contains(str);
        }
        return zContains;
    }
}
