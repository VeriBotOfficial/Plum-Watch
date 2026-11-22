package com.baidu.sec.privacy.f;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.hispark.crashdump.protocol.ProtocolBytes;
import io.agora.utils2.internal.CommonUtility;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: CUIDV3Util.java */
/* loaded from: classes13.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9033a = a(new byte[]{BuiltinOptions.BatchMatMulOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, 32, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.BatchMatMulOptions, 32, BuiltinOptions.HashtableOptions});
    public static final byte[] b = {34, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.WhileOptions, 28, BuiltinOptions.RankOptions, BuiltinOptions.BitwiseXorOptions, 58, -72, BuiltinOptions.BroadcastToOptions, -79, BuiltinOptions.ArgMaxOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.AddNOptions, -26, -85, BuiltinOptions.BitcastOptions, -100, -25, 25, 17, BuiltinOptions.MatrixDiagOptions, -127, -116, -8, 0, BuiltinOptions.ExpOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, -4, -1, OtaCommandGenerator.CMD_GET_INFO_TLV, -69, -85, 5, BuiltinOptions.ReverseV2Options, -70, -27, -98, -7, BuiltinOptions.NegOptions, BuiltinOptions.BitcastOptions, -74, BuiltinOptions.SelectOptions, -120, BuiltinOptions.BitcastOptions, 20, -14, BuiltinOptions.ResizeNearestNeighborOptions, -107, -69, BuiltinOptions.GeluOptions, -101, -8, -89, -71, BuiltinOptions.DensifyOptions, -124, 9, BuiltinOptions.ShapeOptions, BuiltinOptions.HashtableOptions, -18, -114, 5, -79, 58, 64, OtaCommandGenerator.CMD_GET_INFO_TLV, -51, BuiltinOptions.AbsOptions, -29, BuiltinOptions.BidirectionalSequenceLSTMOptions, -51, 63, -77, -73, BuiltinOptions.Conv3DOptions, BuiltinOptions.PadV2Options, 10, -95, -98, OtaCommandGenerator.CMD_NOTIFY_STATUS, -50, -87, -98, -91, -61, -39, BuiltinOptions.ArgMinOptions, -75, -31, -85, BuiltinOptions.UniqueOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.NegOptions, -25, BuiltinOptions.GreaterEqualOptions, -119, -18, -90, -56, -101, -23, BuiltinOptions.PackOptions, -91, -52, BuiltinOptions.BitcastOptions, BuiltinOptions.GatherNdOptions, 61, -20, BuiltinOptions.UnsortedSegmentMaxOptions, -105, -74, BuiltinOptions.CumsumOptions, -27, BuiltinOptions.RankOptions, 17, -15, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.LeakyReluOptions, -59, BuiltinOptions.SignOptions, -24, BuiltinOptions.NegOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SliceOptions, 11, 11, -127, 9, 12, -57, BuiltinOptions.WhileOptions, -92, -30, -47, -4, BuiltinOptions.HashtableImportOptions, -67, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DequantizeOptions, -91, -73, -75, -25, BuiltinOptions.SquareOptions, -41, TransmissionUnpacked.HD_VAL_MAGIC_LB, -28, -84, -50, BuiltinOptions.ExpOptions, -65, 10, -94, 5, -49, -36, 64, -101, BuiltinOptions.ReverseSequenceOptions, -12, BuiltinOptions.AbsOptions, 35, -44, BuiltinOptions.DepthToSpaceOptions, -53, -28, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.DynamicUpdateSliceOptions, ProtocolBytes.SOF, -6, BuiltinOptions.TileOptions, BuiltinOptions.RankOptions, BuiltinOptions.ArgMaxOptions, -108, -80, BuiltinOptions.HashtableSizeOptions, -71, -30, -9, BuiltinOptions.TransposeConvOptions, -49, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SparseToDenseOptions, -41, 20, -97, 32, -34, -14, BuiltinOptions.LogicalOrOptions, -25, BuiltinOptions.EqualOptions, -97, 35, -37, -122, -122, -80, BuiltinOptions.LessOptions, BuiltinOptions.NotEqualOptions, 0, -9, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.ShapeOptions, BuiltinOptions.MatrixSetDiagOptions, 17, BuiltinOptions.LessOptions, BuiltinOptions.AddNOptions, -49, -73, BuiltinOptions.TileOptions, 9, BuiltinOptions.PowOptions, BuiltinOptions.IfOptions, BuiltinOptions.ScatterNdOptions, -126, BuiltinOptions.WhereOptions, 4, -114, -48, BuiltinOptions.HashtableImportOptions, -57, BuiltinOptions.NonMaxSuppressionV5Options, -31, -102, -71, -87, -76, -77, -52, 58, BuiltinOptions.HashtableOptions, BuiltinOptions.SquareOptions, -103, 35, 5, BuiltinOptions.SelectOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.MaximumMinimumOptions, -58, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.MirrorPadOptions, -21, 4, -59, BuiltinOptions.LessOptions, -3, 35, -36, BuiltinOptions.GreaterOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ArgMaxOptions, OtaCommandGenerator.CMD_GET_INFO, BuiltinOptions.BucketizeOptions, 23};
    public static final byte[] c = {0, -70, BuiltinOptions.NegOptions, -20, -46, -12, -1, -114, BuiltinOptions.ResizeNearestNeighborOptions, -47, BuiltinOptions.RightShiftOptions, -90, 23, -7, -79, -117, -90, BuiltinOptions.AddNOptions, BuiltinOptions.DepthToSpaceOptions, 22, -56, 34, -71, -22, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.CallOnceOptions, -86, -90, -58, -3, BuiltinOptions.LogicalOrOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, BuiltinOptions.IfOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RangeOptions, -24, BuiltinOptions.SelectOptions, -125, 16, 17, OtaCommandGenerator.CMD_OTA_INFO, -42, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.WhileOptions, 61, -90, BuiltinOptions.PadV2Options, -72, -47, BuiltinOptions.FillOptions, BuiltinOptions.PackOptions, -106, -59, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CallOnceOptions, 34, BuiltinOptions.BidirectionalSequenceLSTMOptions, -88, -92, -19, -15, OtaCommandGenerator.CMD_NOTIFY_STATUS, 58, 17, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.DequantizeOptions, -48, 35, -62, 23, -56, -65, -2, BuiltinOptions.PadV2Options, BuiltinOptions.FloorDivOptions, -119, -50, -59, -90, -119, 17, -66, -99, BuiltinOptions.MatrixSetDiagOptions, -71, OtaCommandGenerator.CMD_GET_INFO, -64, 10, -30, -64, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.ExpOptions, BuiltinOptions.RandomOptions, -15, 63, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -54, -54, -76, -6, BuiltinOptions.SplitVOptions, -53, 24, BuiltinOptions.SplitVOptions, ProtocolBytes.SOF, 24, -48, 1, 23, -63, BuiltinOptions.QuantizeOptions, -86, -83, -121, -1, BuiltinOptions.NegOptions, Byte.MAX_VALUE, -46, BuiltinOptions.WhileOptions, 3, BuiltinOptions.MirrorPadOptions, -39, ProtocolBytes.SOF, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, 20, BuiltinOptions.QuantizeOptions};
    public static final byte[] d = {0, -113, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.EqualOptions, -39, -71, -86, -23, -65, -85, -19, -120, BuiltinOptions.ATan2Options, -49, BuiltinOptions.RangeOptions, BuiltinOptions.ReverseV2Options, -74, -13, BuiltinOptions.LessEqualOptions, -59, -98, BuiltinOptions.PackOptions, ProtocolBytes.SOF, BuiltinOptions.ShapeOptions, 24, -24, -22, -60, -106, 31, BuiltinOptions.LogicalAndOptions, -3, BuiltinOptions.NotEqualOptions, 6, -25, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.ReverseV2Options, -87, -60, 24, BuiltinOptions.TileOptions, BuiltinOptions.ArgMinOptions, -72, 9, -25, -62, -82, 28, BuiltinOptions.GatherNdOptions, -101, -89, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.HardSwishOptions, -123, -48, 17, -83, -72, -76, BuiltinOptions.UnsortedSegmentSumOptions, -121, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RangeOptions, -124, BuiltinOptions.Rfft2dOptions, BuiltinOptions.IfOptions, -84, 14, -113, 20, -77, BuiltinOptions.NotEqualOptions, 8, BuiltinOptions.ArgMaxOptions, -94, BuiltinOptions.SelectOptions, -6, BuiltinOptions.MaximumMinimumOptions, 17, 10, 61, BuiltinOptions.SelectV2Options, -87, -109, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.ExpandDimsOptions, 9, OtaCommandGenerator.CMD_OTA_INFO, -2, BuiltinOptions.Rfft2dOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.MatrixDiagOptions, -8, BuiltinOptions.LeakyReluOptions, -35, 32, -127, -100, BuiltinOptions.ShapeOptions, 9, OtaCommandGenerator.CMD_OTA_INFO, 16, BuiltinOptions.ReverseSequenceOptions, -79, -107, -83, -51, 0, 35, 61, -70, BuiltinOptions.CosOptions, -124, -74, BuiltinOptions.LessOptions, 31, -99, BuiltinOptions.SegmentSumOptions, -114, -8, -125, BuiltinOptions.FillOptions, -122, BuiltinOptions.UnsortedSegmentMaxOptions, -105, -100, -20, 4, -76, BuiltinOptions.ExpandDimsOptions, -90, -84, BuiltinOptions.LessEqualOptions, BuiltinOptions.DynamicUpdateSliceOptions, -23, -104, BuiltinOptions.WhileOptions, -30, 61, -80, BuiltinOptions.LessOptions, BuiltinOptions.SelectOptions, -63, 17, -116, -97, -6, -99, -127, -127, -25, BuiltinOptions.TileOptions, -115, -73, OtaCommandGenerator.CMD_GET_INFO_TLV, -73, BuiltinOptions.SliceOptions, -41, -71, -29, BuiltinOptions.RangeOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.SelectOptions, BuiltinOptions.BroadcastToOptions, 9, -104, BuiltinOptions.RandomOptions, 21, BuiltinOptions.ArgMinOptions, 21, -22, 61, BuiltinOptions.HashtableOptions, -117, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.GatherNdOptions, -58, BuiltinOptions.TileOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, -113, Byte.MIN_VALUE, BuiltinOptions.PackOptions, BuiltinOptions.SparseToDenseOptions, -92, -62, -32, -14, BuiltinOptions.RandomOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.CastOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.AbsOptions, 63, -118, BuiltinOptions.PackOptions, 8, BuiltinOptions.PowOptions, -95, -60, BuiltinOptions.UniqueOptions, -28, -31, -116, 26, BuiltinOptions.LessOptions, -93, BuiltinOptions.BitwiseXorOptions, -33, BuiltinOptions.DepthToSpaceOptions, -95, BuiltinOptions.ZerosLikeOptions, -34, BuiltinOptions.LeakyReluOptions, BuiltinOptions.CumsumOptions, -1, 4, OtaCommandGenerator.CMD_NOTIFY_STATUS, BuiltinOptions.LogicalAndOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, -49, 22, 35, -31, BuiltinOptions.MatrixDiagOptions, -44, -121, -58, 8, -23, Byte.MAX_VALUE, BuiltinOptions.ExpOptions, 28, -40, 29, -54, 35, -53, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.PowOptions, 7, BuiltinOptions.BatchMatMulOptions, -8, 34, -29, BuiltinOptions.SquareOptions, -66, BuiltinOptions.FloorModOptions, BuiltinOptions.SquaredDifferenceOptions, 5, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.NonMaxSuppressionV5Options, 28, -42, BuiltinOptions.CallOnceOptions};

    public static int a(int i, int i2) {
        return (i >>> (-i2)) | (i << i2);
    }

    public static String a(Context context) {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream = null;
        try {
            File a2 = com.baidu.sec.privacy.b.b.a(context).a(context.getFilesDir().getParent() + "/.helios/ids/aid/aid.dat");
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                FileInputStream fileInputStream2 = new FileInputStream(a2);
                try {
                    byte[] bArr = new byte[32];
                    while (true) {
                        int read = fileInputStream2.read(bArr);
                        if (read <= 0) {
                            String str = new String(a(ByteBuffer.wrap(byteArrayOutputStream.toByteArray())), "UTF-8");
                            try {
                                fileInputStream2.close();
                                byteArrayOutputStream.close();
                                return str;
                            } catch (Throwable th) {
                                c.a(th);
                                return str;
                            }
                        }
                        byteArrayOutputStream.write(bArr, 0, read);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    try {
                        c.a(th);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th3) {
                                c.a(th3);
                                return "";
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            return "";
                        }
                        byteArrayOutputStream.close();
                        return "";
                    } catch (Throwable th4) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Throwable th5) {
                                c.a(th5);
                                throw th4;
                            }
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
        }
    }

    public static String b(Context context) {
        try {
            IBinder binder = context.getContentResolver().call(Uri.parse(CommonUtility.PREFIX_URI + context.getPackageName() + ".helios.ipc.default"), "_method_get_bridge", "", new Bundle()).getBinder("bridge_binder");
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            obtain.writeInterfaceToken("com.baidu.helios.bridge.multiprocess.IMultiProcessBridge");
            obtain.writeString("aid");
            binder.transact(1, obtain, obtain2, 0);
            obtain2.readException();
            if (obtain2.readInt() != 0) {
                return ((Bundle) Bundle.CREATOR.createFromParcel(obtain2)).getString("id");
            }
        } catch (Throwable th) {
            c.a(th);
        }
        return "";
    }

    public static byte[] a(ByteBuffer byteBuffer) throws GeneralSecurityException {
        if (byteBuffer.remaining() >= 12) {
            byte[] bArr = new byte[12];
            byteBuffer.get(bArr);
            ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
            a(bArr, a(), allocate, byteBuffer);
            return allocate.array();
        }
        throw new GeneralSecurityException("data too short");
    }

    public static void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static void a(byte[] bArr, byte[] bArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i = remaining / 64;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer a2 = a(bArr, bArr2, i3 + 32);
            if (i3 == i) {
                a(byteBuffer, byteBuffer2, a2, remaining % 64);
            } else {
                a(byteBuffer, byteBuffer2, a2, 64);
            }
        }
    }

    public static ByteBuffer a(byte[] bArr, byte[] bArr2, int i) {
        int[] a2 = a(a(bArr), a(bArr2), i);
        int[] iArr = (int[]) a2.clone();
        a(iArr);
        for (int i2 = 0; i2 < a2.length; i2++) {
            a2[i2] = a2[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a2, 0, 16);
        return order;
    }

    public static void a(int[] iArr) {
        for (int i = 0; i < 10; i++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    public static void a(int[] iArr, int i, int i2, int i3, int i4) {
        int i5 = iArr[i] + iArr[i2];
        iArr[i] = i5;
        int a2 = a(i5 ^ iArr[i4], 16);
        iArr[i4] = a2;
        int i6 = iArr[i3] + a2;
        iArr[i3] = i6;
        int a3 = a(iArr[i2] ^ i6, 12);
        iArr[i2] = a3;
        int i7 = iArr[i] + a3;
        iArr[i] = i7;
        int a4 = a(iArr[i4] ^ i7, 8);
        iArr[i4] = a4;
        int i8 = iArr[i3] + a4;
        iArr[i3] = i8;
        iArr[i2] = a(iArr[i2] ^ i8, 7);
    }

    public static byte[] a() {
        return new BigInteger(b).modPow(new BigInteger(c), new BigInteger(d)).toByteArray();
    }

    public static int[] a(int[] iArr, int[] iArr2, int i) {
        if (iArr.length == 3) {
            int[] iArr3 = new int[16];
            a(iArr3, iArr2);
            iArr3[12] = i;
            System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
            return iArr3;
        }
        throw new IllegalArgumentException(String.format("need 96-bit param, but got a %d-bit param", Integer.valueOf(iArr.length * 32)));
    }

    public static int[] a(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    public static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f9033a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }
}
