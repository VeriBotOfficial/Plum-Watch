package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* loaded from: classes15.dex */
final class zzfze extends zzfxq {
    static final zzfxq zza = new zzfze(null, new Object[0], 0);
    final transient Object[] zzb;

    @CheckForNull
    private final transient Object zzc;
    private final transient int zzd;

    private zzfze(@CheckForNull Object obj, Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01be  */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static com.google.android.gms.internal.ads.zzfze zzj(int r19, java.lang.Object[] r20, com.google.android.gms.internal.ads.zzfxp r21) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfze.zzj(int, java.lang.Object[], com.google.android.gms.internal.ads.zzfxp):com.google.android.gms.internal.ads.zzfze");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a1 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.zzfxq, java.util.Map
    @javax.annotation.CheckForNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(@javax.annotation.CheckForNull java.lang.Object r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L6
        L3:
            r10 = r0
            goto L9e
        L6:
            int r1 = r9.zzd
            java.lang.Object[] r2 = r9.zzb
            r3 = 1
            if (r1 != r3) goto L22
            r1 = 0
            r1 = r2[r1]
            java.lang.Object r1 = java.util.Objects.requireNonNull(r1)
            boolean r10 = r1.equals(r10)
            if (r10 == 0) goto L3
            r10 = r2[r3]
            java.lang.Object r10 = java.util.Objects.requireNonNull(r10)
            goto L9e
        L22:
            java.lang.Object r1 = r9.zzc
            if (r1 != 0) goto L27
            goto L3
        L27:
            boolean r4 = r1 instanceof byte[]
            r5 = -1
            if (r4 == 0) goto L53
            r4 = r1
            byte[] r4 = (byte[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxf.zza(r1)
        L3a:
            r1 = r1 & r6
            r5 = r4[r1]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L43
            goto L3
        L43:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L50
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9e
        L50:
            int r1 = r1 + 1
            goto L3a
        L53:
            boolean r4 = r1 instanceof short[]
            if (r4 == 0) goto L7f
            r4 = r1
            short[] r4 = (short[]) r4
            int r1 = r4.length
            int r6 = r1 + (-1)
            int r1 = r10.hashCode()
            int r1 = com.google.android.gms.internal.ads.zzfxf.zza(r1)
        L65:
            r1 = r1 & r6
            short r5 = r4[r1]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L6f
            goto L3
        L6f:
            r7 = r2[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L7c
            r10 = r5 ^ 1
            r10 = r2[r10]
            goto L9e
        L7c:
            int r1 = r1 + 1
            goto L65
        L7f:
            int[] r1 = (int[]) r1
            int r4 = r1.length
            int r4 = r4 + r5
            int r6 = r10.hashCode()
            int r6 = com.google.android.gms.internal.ads.zzfxf.zza(r6)
        L8b:
            r6 = r6 & r4
            r7 = r1[r6]
            if (r7 != r5) goto L92
            goto L3
        L92:
            r8 = r2[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto La2
            r10 = r7 ^ 1
            r10 = r2[r10]
        L9e:
            if (r10 != 0) goto La1
            return r0
        La1:
            return r10
        La2:
            int r6 = r6 + 1
            goto L8b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfze.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final zzfxi zza() {
        return new zzfzd(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final zzfxs zzf() {
        return new zzfzb(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzfxq
    final zzfxs zzg() {
        return new zzfzc(this, new zzfzd(this.zzb, 0, this.zzd));
    }
}
