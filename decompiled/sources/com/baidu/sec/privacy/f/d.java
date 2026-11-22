package com.baidu.sec.privacy.f;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import java.io.File;
import java.security.MessageDigest;
import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.json.JSONArray;
import org.json.JSONObject;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: CuidV2.java */
/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static int f9035a;
    public final Context b;
    public PublicKey c;

    /* compiled from: CuidV2.java */
    public class a implements Comparator<c> {
        public a(d dVar) {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            int i = cVar2.c - cVar.c;
            if (i == 0) {
                boolean z = cVar.b;
                if (z && cVar2.b) {
                    return 0;
                }
                if (z) {
                    return -1;
                }
                if (cVar2.b) {
                    return 1;
                }
            }
            return i;
        }
    }

    /* compiled from: CuidV2.java */
    public static class b {
        public static byte[] a(byte[] bArr) {
            return a(bArr, bArr.length);
        }

        public static byte[] a(byte[] bArr, int i) {
            byte b;
            int i2;
            int i3 = (i / 4) * 3;
            if (i3 == 0) {
                return new byte[0];
            }
            byte[] bArr2 = new byte[i3];
            int i4 = i;
            int i5 = 0;
            while (true) {
                byte b2 = bArr[i4 - 1];
                b = 10;
                if (b2 != 10 && b2 != 13 && b2 != 32 && b2 != 9) {
                    if (b2 != 61) {
                        break;
                    }
                    i5++;
                }
                i4--;
            }
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            while (i6 < i4) {
                byte b3 = bArr[i6];
                if (b3 != b && b3 != 13 && b3 != 32 && b3 != 9) {
                    if (b3 >= 65 && b3 <= 90) {
                        i2 = b3 - 65;
                    } else if (b3 >= 97 && b3 <= 122) {
                        i2 = b3 - 71;
                    } else if (b3 >= 48 && b3 <= 57) {
                        i2 = b3 + 4;
                    } else if (b3 == 43) {
                        i2 = 62;
                    } else {
                        if (b3 != 47) {
                            return null;
                        }
                        i2 = 63;
                    }
                    i8 = ((byte) i2) | (i8 << 6);
                    if (i9 % 4 == 3) {
                        bArr2[i7] = (byte) ((16711680 & i8) >> 16);
                        int i10 = i7 + 2;
                        bArr2[i7 + 1] = (byte) ((65280 & i8) >> 8);
                        i7 += 3;
                        bArr2[i10] = (byte) (i8 & 255);
                    }
                    i9++;
                }
                i6++;
                b = 10;
            }
            if (i5 > 0) {
                int i11 = i8 << (i5 * 6);
                int i12 = i7 + 1;
                bArr2[i7] = (byte) ((i11 & 16711680) >> 16);
                if (i5 == 1) {
                    i7 += 2;
                    bArr2[i12] = (byte) ((i11 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
                } else {
                    i7 = i12;
                }
            }
            byte[] bArr3 = new byte[i7];
            System.arraycopy(bArr2, 0, bArr3, 0, i7);
            return bArr3;
        }
    }

    /* compiled from: CuidV2.java */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public ApplicationInfo f9036a;
        public boolean b;
        public int c;
        public boolean d;

        public /* synthetic */ c(a aVar) {
            this();
        }

        public c() {
            this.c = 0;
            this.d = false;
            this.b = false;
        }
    }

    /* compiled from: CuidV2.java */
    /* renamed from: com.baidu.sec.privacy.f.d$d, reason: collision with other inner class name */
    public static class C0439d {

        /* renamed from: a, reason: collision with root package name */
        public String f9037a;
        public String b;
        public int c = 0;

        public static boolean a(int i) {
            return i >= 14;
        }

        public static boolean b(String str) {
            return TextUtils.isEmpty(str);
        }

        public boolean c() {
            return b(this.b);
        }

        public static C0439d a(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> keys = jSONObject.keys();
                String str2 = "0";
                String str3 = "0";
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!d.d("ZGV2aWNlaWQ=").equals(next) && !d.d("dmVy").equals(next)) {
                        str3 = jSONObject.optString(next, "0");
                    }
                }
                String string = jSONObject.getString(d.d("ZGV2aWNlaWQ="));
                jSONObject.getInt(d.d("dmVy"));
                int length = TextUtils.isEmpty(str3) ? 0 : str3.length();
                if (!TextUtils.isEmpty(string)) {
                    C0439d c0439d = new C0439d();
                    c0439d.f9037a = string;
                    c0439d.c = length;
                    if (length >= 14) {
                        return c0439d;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        str2 = str3;
                    }
                    c0439d.b = str2;
                    return c0439d;
                }
            } catch (Exception e) {
                com.baidu.sec.privacy.f.c.a(e);
            }
            return null;
        }

        public boolean b() {
            return a(this.c);
        }

        public static C0439d b(String str, String str2) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            C0439d c0439d = new C0439d();
            c0439d.f9037a = str;
            int length = TextUtils.isEmpty(str2) ? 0 : str2.length();
            c0439d.c = length;
            if (length >= 14) {
                return c0439d;
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "0";
            }
            c0439d.b = str2;
            return c0439d;
        }

        public String a() {
            String str = this.b;
            if (TextUtils.isEmpty(str)) {
                str = "0";
            }
            return this.f9037a + "|" + str;
        }
    }

    /* compiled from: CuidV2.java */
    public static final class e {
        public static byte[] a() {
            return new byte[]{BuiltinOptions.SliceOptions, -126, 3, BuiltinOptions.DensifyOptions, BuiltinOptions.SliceOptions, -126, 2, BuiltinOptions.LeakyReluOptions, OtaCommandGenerator.CMD_OTA_INFO, 3, 2, 1, 2, 2, 4, BuiltinOptions.Conv3DOptions, -93, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SliceOptions, 13, 6, 9, BuiltinOptions.NegOptions, -122, BuiltinOptions.FloorModOptions, -122, -9, 13, 1, 1, 11, 5, 0, BuiltinOptions.SliceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.TransposeConvOptions, 11, BuiltinOptions.SliceOptions, 9, 6, 3, BuiltinOptions.WhereOptions, 4, 6, 19, 2, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.TransposeConvOptions, 16, BuiltinOptions.SliceOptions, 14, 6, 3, BuiltinOptions.WhereOptions, 4, 8, 19, 7, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.TransposeConvOptions, 16, BuiltinOptions.SliceOptions, 14, 6, 3, BuiltinOptions.WhereOptions, 4, 7, 19, 7, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.TransposeConvOptions, 14, BuiltinOptions.SliceOptions, 12, 6, 3, BuiltinOptions.WhereOptions, 4, 10, 19, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.TransposeConvOptions, 14, BuiltinOptions.SliceOptions, 12, 6, 3, BuiltinOptions.WhereOptions, 4, 11, 19, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.TransposeConvOptions, 14, BuiltinOptions.SliceOptions, 12, 6, 3, BuiltinOptions.WhereOptions, 4, 3, 19, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, 32, 23, 13, BuiltinOptions.TransposeConvOptions, BuiltinOptions.EqualOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.MatrixSetDiagOptions, 24, 15, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SliceOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.TileOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.TileOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.SliceOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.TransposeConvOptions, 11, BuiltinOptions.SliceOptions, 9, 6, 3, BuiltinOptions.WhereOptions, 4, 6, 19, 2, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.TransposeConvOptions, 16, BuiltinOptions.SliceOptions, 14, 6, 3, BuiltinOptions.WhereOptions, 4, 8, 19, 7, BuiltinOptions.SelectV2Options, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.TransposeConvOptions, 16, BuiltinOptions.SliceOptions, 14, 6, 3, BuiltinOptions.WhereOptions, 4, 7, 19, 7, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.TransposeConvOptions, 14, BuiltinOptions.SliceOptions, 12, 6, 3, BuiltinOptions.WhereOptions, 4, 10, 19, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.TransposeConvOptions, 14, BuiltinOptions.SliceOptions, 12, 6, 3, BuiltinOptions.WhereOptions, 4, 11, 19, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.TransposeConvOptions, 14, BuiltinOptions.SliceOptions, 12, 6, 3, BuiltinOptions.WhereOptions, 4, 3, 19, 5, BuiltinOptions.SelectV2Options, BuiltinOptions.ScatterNdOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, -126, 1, 34, BuiltinOptions.SliceOptions, 13, 6, 9, BuiltinOptions.NegOptions, -122, BuiltinOptions.FloorModOptions, -122, -9, 13, 1, 1, 1, 5, 0, 3, -126, 1, 15, 0, BuiltinOptions.SliceOptions, -126, 1, 10, 2, -126, 1, 1, 0, -86, -91, -2, -41, Byte.MAX_VALUE, BuiltinOptions.CastOptions, -25, -33, BuiltinOptions.WhileOptions, BuiltinOptions.TileOptions, -73, 32, ProtocolBytes.SOF, 61, BuiltinOptions.HashtableFindOptions, BuiltinOptions.CastOptions, BuiltinOptions.RightShiftOptions, 14, -125, BuiltinOptions.BitwiseXorOptions, -55, -29, 34, -60, BuiltinOptions.CosOptions, -67, -46, BuiltinOptions.BitwiseXorOptions, -93, -67, -27, BuiltinOptions.ScatterNdOptions, BuiltinOptions.NotEqualOptions, 35, 0, -6, BuiltinOptions.GatherNdOptions, BuiltinOptions.ZerosLikeOptions, -116, BuiltinOptions.PadV2Options, -24, 26, BuiltinOptions.MatrixDiagOptions, -5, BuiltinOptions.ExpOptions, 27, -105, BuiltinOptions.TransposeConvOptions, BuiltinOptions.SquaredDifferenceOptions, -70, -32, BuiltinOptions.Rfft2dOptions, -48, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.CumsumOptions, OtaCommandGenerator.CMD_GET_INFO, ProtocolBytes.SOF, BuiltinOptions.WhileOptions, -103, -18, 17, BuiltinOptions.ShapeOptions, BuiltinOptions.ReverseV2Options, -34, -80, -76, -13, -84, 6, BuiltinOptions.HardSwishOptions, 10, BuiltinOptions.SliceOptions, -56, -1, BuiltinOptions.GreaterEqualOptions, 9, 23, 34, 6, BuiltinOptions.CallOnceOptions, 35, -51, 29, BuiltinOptions.BidirectionalSequenceRNNOptions, -19, -51, 20, -39, TransmissionUnpacked.HD_VAL_MAGIC_LB, -97, BuiltinOptions.LeakyReluOptions, 23, -124, -101, -71, -75, -107, -88, -13, -71, BuiltinOptions.UniqueOptions, BuiltinOptions.MatrixSetDiagOptions, -76, -119, BuiltinOptions.TileOptions, -80, BuiltinOptions.UnsortedSegmentProdOptions, Byte.MIN_VALUE, -12, -108, BuiltinOptions.SelectV2Options, -29, -27, BuiltinOptions.LogicalOrOptions, -119, -74, BuiltinOptions.HashtableSizeOptions, 61, BuiltinOptions.TileOptions, -22, BuiltinOptions.EqualOptions, BuiltinOptions.SquareOptions, -99, -45, -25, BuiltinOptions.VarHandleOptions, -121, 25, -72, Byte.MAX_VALUE, 3, BuiltinOptions.TileOptions, -100, BuiltinOptions.ArgMinOptions, -90, BuiltinOptions.GeluOptions, -59, -117, BuiltinOptions.ResizeNearestNeighborOptions, -71, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.PackOptions, 19, -8, -109, BuiltinOptions.ExpOptions, -14, BuiltinOptions.SquaredDifferenceOptions, -105, -127, -23, 5, BuiltinOptions.DensifyOptions, -82, 22, -99, BuiltinOptions.TileOptions, BuiltinOptions.AbsOptions, -26, BuiltinOptions.MirrorPadOptions, -52, -29, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.NegOptions, -76, 20, 2, BuiltinOptions.GeluOptions, BuiltinOptions.VarHandleOptions, -76, 2, -78, -90, -54, BuiltinOptions.ReverseV2Options, BuiltinOptions.BucketizeOptions, BuiltinOptions.AddNOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.BitcastOptions, -83, BuiltinOptions.NonMaxSuppressionV5Options, 20, -40, -118, BuiltinOptions.Rfft2dOptions, BuiltinOptions.MatrixSetDiagOptions, -70, BuiltinOptions.UnsortedSegmentMinOptions, -33, OtaCommandGenerator.CMD_GET_INFO_TLV, 12, -15, BuiltinOptions.DequantizeOptions, 34, -125, -116, BuiltinOptions.BidirectionalSequenceLSTMOptions, -54, -103, -109, -124, 26, BuiltinOptions.DepthToSpaceOptions, -89, -98, -11, -66, BuiltinOptions.QuantizeOptions, BuiltinOptions.SliceOptions, PSSSigner.TRAILER_IMPLICIT, -51, BuiltinOptions.HashtableOptions, -60, 12, BuiltinOptions.RandomOptions, -71, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.TransposeConvOptions, -31, -65, BuiltinOptions.AssignVariableOptions, -99, 3, -90, BuiltinOptions.SplitVOptions, -88, -38, -87, -25, -38, BuiltinOptions.LessOptions, BuiltinOptions.HashtableSizeOptions, -25, 29, BuiltinOptions.TransposeConvOptions, BuiltinOptions.BitcastOptions, -76, -91, BuiltinOptions.MirrorPadOptions, -11, -90, BuiltinOptions.RandomOptions, -63, BuiltinOptions.UnsortedSegmentProdOptions, -22, -5, -124, 19, 22, -74, -75, BuiltinOptions.AbsOptions, 28, BuiltinOptions.SelectOptions, -69, 2, 3, 1, 0, 1, -93, BuiltinOptions.ExpOptions, BuiltinOptions.SliceOptions, 31, BuiltinOptions.SliceOptions, 29, 6, 3, BuiltinOptions.WhereOptions, 29, 14, 4, 22, 4, 20, -41, -108, BuiltinOptions.ExpOptions, -126, -103, 35, BuiltinOptions.BucketizeOptions, -83, BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableSizeOptions, -39, BuiltinOptions.HashtableSizeOptions, -125, -118, -69, BuiltinOptions.ReverseSequenceOptions, -103, 30, 12, -53, BuiltinOptions.SliceOptions, 13, 6, 9, BuiltinOptions.NegOptions, -122, BuiltinOptions.FloorModOptions, -122, -9, 13, 1, 1, 11, 5, 0, 3, -126, 1, 1, 0, 0, -117, 0, -28, BuiltinOptions.TileOptions, 26, -4, -15, BuiltinOptions.RankOptions, Byte.MAX_VALUE, 14, -101, -48, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, -53, -72, -22, 4, -83, BuiltinOptions.TransposeConvOptions, BuiltinOptions.Conv3DOptions, -15, -44, -116, -105, 19, BuiltinOptions.FloorDivOptions, -32, BuiltinOptions.FloorDivOptions, BuiltinOptions.IfOptions, 21, BuiltinOptions.TileOptions, 61, -21, -74, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HardSwishOptions, 64, BuiltinOptions.LeakyReluOptions, -72, -48, BuiltinOptions.CumsumOptions, 17, -120, -23, PSSSigner.TRAILER_IMPLICIT, BuiltinOptions.TileOptions, 23, -104, BuiltinOptions.HashtableOptions, BuiltinOptions.FloorDivOptions, -30, BuiltinOptions.HashtableImportOptions, -6, BuiltinOptions.LessEqualOptions, -44, -46, -73, -54, -55, 63, BuiltinOptions.MirrorPadOptions, -54, -11, -51, 27, -1, BuiltinOptions.RandomOptions, BuiltinOptions.RankOptions, -80, 28, -89, 29, -20, BuiltinOptions.TransposeConvOptions, -8, BuiltinOptions.ArgMinOptions, -7, -30, 61, -108, -6, -60, BuiltinOptions.AssignVariableOptions, BuiltinOptions.GreaterEqualOptions, -32, -93, 19, -62, -89, BuiltinOptions.Conv3DOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.NonMaxSuppressionV5Options, -48, BuiltinOptions.MatrixSetDiagOptions, -59, BuiltinOptions.LessEqualOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.VarHandleOptions, -88, BuiltinOptions.TileOptions, -39, BuiltinOptions.ArgMaxOptions, -36, -113, BuiltinOptions.RankOptions, -92, 25, 30, BuiltinOptions.DepthToSpaceOptions, -13, -15, -57, BuiltinOptions.PackOptions, -21, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.BroadcastToOptions, -50, -3, -121, -90, TransmissionUnpacked.HD_VAL_MAGIC_LB, 61, BuiltinOptions.Rfft2dOptions, -3, BuiltinOptions.ArgMinOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.TileOptions, -3, -31, BuiltinOptions.Rfft2dOptions, -12, 19, BuiltinOptions.MirrorPadOptions, -82, -120, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.HashtableFindOptions, -63, -126, BuiltinOptions.LessEqualOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, 14, -56, 21, BuiltinOptions.SelectOptions, 63, -104, -7, BuiltinOptions.AssignVariableOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SegmentSumOptions, -9, -12, -101, BuiltinOptions.HashtableOptions, -77, -64, BuiltinOptions.HardSwishOptions, -104, -61, 0, -7, -72, -19, BuiltinOptions.LeakyReluOptions, 12, BuiltinOptions.VarHandleOptions, Byte.MAX_VALUE, -115, -46, -99, OtaCommandGenerator.CMD_GET_INFO, -93, -67, -42, -66, 32, BuiltinOptions.ReverseV2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HashtableImportOptions, -57, 10, 19, -49, -44, BuiltinOptions.PackOptions, 21, 31, -61, -59, BuiltinOptions.GatherNdOptions, -14, BuiltinOptions.PadV2Options, BuiltinOptions.RangeOptions, -88, BuiltinOptions.UnsortedSegmentMinOptions, -58, -46, BuiltinOptions.LessEqualOptions, BuiltinOptions.SquareOptions, BuiltinOptions.LessOptions, -2, -70, -6, -42, BuiltinOptions.CallOnceOptions, 8, 4, BuiltinOptions.QuantizeOptions, BuiltinOptions.HashtableSizeOptions, -122, BuiltinOptions.FillOptions, -86, BuiltinOptions.LogicalAndOptions, PSSSigner.TRAILER_IMPLICIT, 13, -117, 35, -52, -6, BuiltinOptions.Conv3DOptions, -91, BuiltinOptions.HardSwishOptions, -62, -56, -26, -41, -109, BuiltinOptions.FillOptions, -102, TransmissionUnpacked.HD_VAL_MAGIC_LB, -29, BuiltinOptions.AssignVariableOptions, BuiltinOptions.PadV2Options, -126, -127, BuiltinOptions.ATan2Options, -47, -30, OtaCommandGenerator.CMD_OTA_INFO, -2, BuiltinOptions.AbsOptions, BuiltinOptions.GreaterOptions, -92, -38, -124, -102, BuiltinOptions.RangeOptions, -105, -66, 5, -85, -7, BuiltinOptions.PowOptions};
        }
    }

    /* compiled from: CuidV2.java */
    public static final class f {
        public static byte[] a(byte[] bArr) {
            try {
                return MessageDigest.getInstance("SHA-1").digest(bArr);
            } catch (Exception e) {
                d.b(e);
                return new byte[0];
            }
        }
    }

    static {
        new String(b.a(new byte[]{BuiltinOptions.MirrorPadOptions, BuiltinOptions.ATan2Options, BuiltinOptions.FloorDivOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.CosOptions, BuiltinOptions.RangeOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.FillOptions, BuiltinOptions.RangeOptions, 61})).concat(new String(b.a(new byte[]{BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.AddNOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.RangeOptions, 61})));
    }

    public d(Context context) {
        this.b = context.getApplicationContext();
        c();
    }

    public static String b(Context context) {
        C0439d a2 = a(context);
        return a2 != null ? a2.a() : "";
    }

    public static void b(Throwable th) {
    }

    public static String d(String str) {
        return new String(b.a(str.getBytes()));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r4 = this;
            r0 = 0
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            byte[] r2 = com.baidu.sec.privacy.f.d.e.a()     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L25 java.lang.Exception -> L27
            java.lang.String r0 = "X.509"
            java.security.cert.CertificateFactory r0 = java.security.cert.CertificateFactory.getInstance(r0)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            java.security.cert.Certificate r0 = r0.generateCertificate(r1)     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            java.security.PublicKey r0 = r0.getPublicKey()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r4.c = r0     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.close()     // Catch: java.lang.Exception -> L31
            return
        L1e:
            r0 = move-exception
            goto L3a
        L20:
            r0 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L28
        L25:
            r1 = move-exception
            goto L3d
        L27:
            r1 = move-exception
        L28:
            b(r1)     // Catch: java.lang.Throwable -> L36
            if (r0 == 0) goto L35
            r0.close()     // Catch: java.lang.Exception -> L31
            goto L35
        L31:
            r0 = move-exception
            b(r0)
        L35:
            return
        L36:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
        L3a:
            r3 = r1
            r1 = r0
            r0 = r3
        L3d:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            b(r0)
        L47:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.sec.privacy.f.d.c():void");
    }

    public final String e(String str) {
        return "0";
    }

    public final String f(String str) {
        try {
            return Settings.System.getString(this.b.getContentResolver(), str);
        } catch (Exception e2) {
            b(e2);
            return null;
        }
    }

    public static String a(byte[] bArr) {
        if (bArr != null) {
            String str = "";
            for (byte b2 : bArr) {
                String hexString = Integer.toHexString(b2 & 255);
                if (hexString.length() == 1) {
                    str = str + "0" + hexString;
                } else {
                    str = str + hexString;
                }
            }
            return str.toLowerCase();
        }
        throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
    }

    public final boolean b(String str) {
        return this.b.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }

    public final C0439d b() {
        return C0439d.b(f("com.baidu.deviceid"), f("bd_setting_i"));
    }

    public final String[] a(Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = a(f.a(signatureArr[i].toByteArray()));
        }
        return strArr;
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(2, publicKey);
        return cipher.doFinal(bArr);
    }

    public final List<c> a(Intent intent, boolean z) {
        byte[] a2;
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = this.b.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null) {
                    try {
                        ActivityInfo activityInfo2 = resolveInfo.activityInfo;
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(activityInfo2.packageName, activityInfo2.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString("galaxy_data");
                            if (!TextUtils.isEmpty(string)) {
                                byte[] a3 = b.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(a3));
                                c cVar = new c(null);
                                cVar.c = jSONObject.getInt("priority");
                                cVar.f9036a = resolveInfo.activityInfo.applicationInfo;
                                if (this.b.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    cVar.b = true;
                                }
                                if (z) {
                                    String string2 = bundle.getString("galaxy_sf");
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        int length = jSONArray.length();
                                        String[] strArr = new String[length];
                                        for (int i = 0; i < length; i++) {
                                            strArr[i] = jSONArray.getString(i);
                                        }
                                        if (a(strArr, a(packageInfo.signatures)) && (a2 = a(b.a(string2.getBytes()), this.c)) != null && Arrays.equals(a2, f.a(a3))) {
                                            cVar.d = true;
                                        }
                                    }
                                }
                                arrayList.add(cVar);
                            }
                        }
                    } catch (Exception e2) {
                        b(e2);
                    }
                }
            }
        }
        Collections.sort(arrayList, new a(this));
        return arrayList;
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return "";
    }

    public final boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r5) {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r5 = 8192(0x2000, float:1.148E-41)
            char[] r5 = new char[r5]     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            java.io.CharArrayWriter r2 = new java.io.CharArrayWriter     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            r2.<init>()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
        Lf:
            int r3 = r1.read(r5)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            if (r3 <= 0) goto L1a
            r4 = 0
            r2.write(r5, r4, r3)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            goto Lf
        L1a:
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            r1.close()     // Catch: java.lang.Exception -> L22
            return r5
        L22:
            r0 = move-exception
            b(r0)
            return r5
        L27:
            r5 = move-exception
            goto L2d
        L29:
            r5 = move-exception
            goto L3d
        L2b:
            r5 = move-exception
            r1 = r0
        L2d:
            b(r5)     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.lang.Exception -> L36
            goto L3a
        L36:
            r5 = move-exception
            b(r5)
        L3a:
            return r0
        L3b:
            r5 = move-exception
            r0 = r1
        L3d:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.lang.Exception -> L43
            goto L47
        L43:
            r0 = move-exception
            b(r0)
        L47:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.sec.privacy.f.d.a(java.io.File):java.lang.String");
    }

    public static C0439d a(Context context) {
        return new d(context).a();
    }

    public final C0439d a() {
        List<c> a2 = a(new Intent("com.baidu.intent.action.GALAXY").setPackage(this.b.getPackageName()), true);
        boolean z = false;
        if (a2 == null || a2.size() == 0) {
            for (int i = 0; i < 3; i++) {
            }
        } else {
            boolean z2 = a2.get(0).d;
            if (!z2) {
                for (int i2 = 0; i2 < 3; i2++) {
                }
            }
            z = z2;
        }
        File file = new File(this.b.getFilesDir(), com.baidu.bbalbscesium.f.g);
        C0439d a3 = file.exists() ? C0439d.a(c(a(file))) : null;
        if (a3 == null) {
            f9035a |= 16;
            List<c> a4 = a(new Intent("com.baidu.intent.action.GALAXY"), z);
            if (a4 != null) {
                File filesDir = this.b.getFilesDir();
                String name = "files".equals(filesDir.getName()) ? "files" : filesDir.getName();
                for (c cVar : a4) {
                    if (!cVar.b) {
                        File file2 = new File(new File(cVar.f9036a.dataDir, name), com.baidu.bbalbscesium.f.g);
                        if (file2.exists() && (a3 = C0439d.a(c(a(file2)))) != null) {
                            break;
                        }
                    }
                }
            }
        }
        if (a3 == null) {
            a3 = C0439d.a(c(f("com.baidu.deviceid.v2")));
        }
        boolean b2 = b("android.permission.READ_EXTERNAL_STORAGE");
        if (a3 == null && b2) {
            f9035a |= 2;
        }
        if (a3 == null) {
            f9035a |= 8;
            a3 = b();
        }
        if (a3 == null && b2) {
            f9035a |= 1;
            e("");
        }
        a(a3);
        return a3;
    }

    public final boolean a(C0439d c0439d) {
        if (c0439d == null) {
            return false;
        }
        if (c0439d.b()) {
            c0439d.b = "O";
            return true;
        }
        if (!c0439d.c()) {
            return false;
        }
        c0439d.b = "0";
        return true;
    }
}
