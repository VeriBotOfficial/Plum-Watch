package com.google.android.gms.internal.ads;

import android.os.Build;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* loaded from: classes15.dex */
public final class zzfnd {
    protected static final byte[] zza = {61, BuiltinOptions.ATan2Options, 18, 35, 1, -102, -93, -99, -98, OtaCommandGenerator.CMD_OTA_INFO, -29, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.Conv3DOptions, -73, -64, -119, BuiltinOptions.HashtableOptions, -5, BuiltinOptions.SplitVOptions, -74, BuiltinOptions.UnsortedSegmentSumOptions, -12, -34, BuiltinOptions.NonMaxSuppressionV4Options, -25, -62, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.HashtableFindOptions, -113, -103, BuiltinOptions.ResizeNearestNeighborOptions};
    protected static final byte[] zzb = {OtaCommandGenerator.CMD_GET_INFO_TLV, -13, -34, BuiltinOptions.BidirectionalSequenceRNNOptions, -83, BuiltinOptions.PadV2Options, BuiltinOptions.ScatterNdOptions, 21, -44, 16, -54, -125, -28, -57, -125, -127, -7, 17, BuiltinOptions.CumsumOptions, -69, BuiltinOptions.GeluOptions, -121, -79, BuiltinOptions.PadV2Options, -13, BuiltinOptions.UnsortedSegmentMinOptions, 58, BuiltinOptions.ShapeOptions, -29, -108, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.GatherNdOptions};
    private final byte[] zzc = zzb;
    private final byte[] zzd = zza;

    public final boolean zza(File file) throws GeneralSecurityException {
        try {
            X509Certificate[][] zza2 = zzaos.zza(file.getAbsolutePath());
            if (zza2.length != 1) {
                throw new GeneralSecurityException("APK has more than one signature.");
            }
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(zza2[0][0].getEncoded());
            if (Arrays.equals(this.zzd, digest)) {
                return true;
            }
            return !"user".equals(Build.TYPE) && Arrays.equals(this.zzc, digest);
        } catch (zzaoo e) {
            throw new GeneralSecurityException("Package is not signed", e);
        } catch (IOException e2) {
            e = e2;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        } catch (RuntimeException e3) {
            e = e3;
            throw new GeneralSecurityException("Failed to verify signatures", e);
        }
    }
}
