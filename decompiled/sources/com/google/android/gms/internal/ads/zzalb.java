package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
final class zzalb {
    private static final Pattern zzd = Pattern.compile("\\s+");
    private static final zzfxs zze = zzfxs.zzp("auto", "none");
    private static final zzfxs zzf = zzfxs.zzq("dot", TtmlNode.TEXT_EMPHASIS_MARK_SESAME, "circle");
    private static final zzfxs zzg = zzfxs.zzp(TtmlNode.TEXT_EMPHASIS_MARK_FILLED, "open");
    private static final zzfxs zzh = zzfxs.zzq(TtmlNode.ANNOTATION_POSITION_AFTER, TtmlNode.ANNOTATION_POSITION_BEFORE, TtmlNode.ANNOTATION_POSITION_OUTSIDE);
    public final int zza;
    public final int zzb;
    public final int zzc;

    private zzalb(int i, int i2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i3;
    }

    public static zzalb zza(String str) {
        boolean z;
        if (str == null) {
            return null;
        }
        String zza = zzftt.zza(str.trim());
        if (zza.isEmpty()) {
            return null;
        }
        zzfxs zzm = zzfxs.zzm(TextUtils.split(zza, zzd));
        String str2 = (String) zzfxt.zza(zzfzp.zzb(zzh, zzm), TtmlNode.ANNOTATION_POSITION_OUTSIDE);
        int hashCode = str2.hashCode();
        int i = -1;
        int i2 = 0;
        if (hashCode != -1106037339) {
            if (hashCode == 92734940 && str2.equals(TtmlNode.ANNOTATION_POSITION_AFTER)) {
                z = false;
            }
            z = -1;
        } else {
            if (str2.equals(TtmlNode.ANNOTATION_POSITION_OUTSIDE)) {
                z = true;
            }
            z = -1;
        }
        int i3 = z ? !z ? 1 : -2 : 2;
        zzfzn zzb = zzfzp.zzb(zze, zzm);
        if (zzb.isEmpty()) {
            zzfzn zzb2 = zzfzp.zzb(zzg, zzm);
            zzfzn zzb3 = zzfzp.zzb(zzf, zzm);
            if (!zzb2.isEmpty() || !zzb3.isEmpty()) {
                String str3 = (String) zzfxt.zza(zzb2, TtmlNode.TEXT_EMPHASIS_MARK_FILLED);
                int i4 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) zzfxt.zza(zzb3, "circle");
                int hashCode2 = str4.hashCode();
                if (hashCode2 != -905816648) {
                    if (hashCode2 == 99657 && str4.equals("dot")) {
                        i = 0;
                    }
                } else if (str4.equals(TtmlNode.TEXT_EMPHASIS_MARK_SESAME)) {
                    i = 1;
                }
                if (i == 0) {
                    i = 2;
                } else if (i != 1) {
                    i2 = i4;
                    i = 1;
                } else {
                    i = 3;
                }
                i2 = i4;
            }
        } else {
            String str5 = (String) zzb.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i = 0;
            }
        }
        return new zzalb(i, i2, i3);
    }
}
