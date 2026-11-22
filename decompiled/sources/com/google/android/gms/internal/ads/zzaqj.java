package com.google.android.gms.internal.ads;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzaqj {
    public static long zza(String str) {
        try {
            return zzd("EEE, dd MMM yyyy HH:mm:ss zzz").parse(str).getTime();
        } catch (ParseException e) {
            if ("0".equals(str) || "-1".equals(str)) {
                zzapy.zzd("Unable to parse dateStr: %s, falling back to 0", str);
                return 0L;
            }
            zzapy.zzc(e, "Unable to parse dateStr: %s, falling back to 0", str);
            return 0L;
        }
    }

    public static zzaov zzb(zzapi zzapiVar) {
        long j;
        boolean z;
        long j2;
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        long currentTimeMillis = System.currentTimeMillis();
        Map map = zzapiVar.zzc;
        if (map == null) {
            return null;
        }
        String str = (String) map.get("Date");
        long zza = str != null ? zza(str) : 0L;
        String str2 = (String) map.get("Cache-Control");
        int i = 0;
        if (str2 != null) {
            String[] split = str2.split(",", 0);
            z = false;
            j2 = 0;
            j3 = 0;
            while (i < split.length) {
                String trim = split[i].trim();
                if (trim.equals("no-cache") || trim.equals("no-store")) {
                    return null;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j3 = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                } else if (trim.startsWith("stale-while-revalidate=")) {
                    j2 = Long.parseLong(trim.substring(23));
                } else if (trim.equals("must-revalidate") || trim.equals("proxy-revalidate")) {
                    z = true;
                }
                i++;
            }
            j = 0;
            i = 1;
        } else {
            j = 0;
            z = false;
            j2 = 0;
            j3 = 0;
        }
        String str3 = (String) map.get("Expires");
        long zza2 = str3 != null ? zza(str3) : j;
        String str4 = (String) map.get("Last-Modified");
        if (str4 != null) {
            j4 = currentTimeMillis;
            j5 = zza(str4);
        } else {
            j4 = currentTimeMillis;
            j5 = j;
        }
        String str5 = (String) map.get("ETag");
        if (i != 0) {
            long j8 = (j3 * 1000) + j4;
            j7 = z ? j8 : (j2 * 1000) + j8;
            j6 = j8;
        } else {
            j6 = (zza <= j || zza2 < zza) ? j : (zza2 - zza) + j4;
            j7 = j6;
        }
        zzaov zzaovVar = new zzaov();
        zzaovVar.zza = zzapiVar.zzb;
        zzaovVar.zzb = str5;
        zzaovVar.zzf = j6;
        zzaovVar.zze = j7;
        zzaovVar.zzc = zza;
        zzaovVar.zzd = j5;
        zzaovVar.zzg = map;
        zzaovVar.zzh = zzapiVar.zzd;
        return zzaovVar;
    }

    static String zzc(long j) {
        return zzd("EEE, dd MMM yyyy HH:mm:ss 'GMT'").format(new Date(j));
    }

    private static SimpleDateFormat zzd(String str) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }
}
