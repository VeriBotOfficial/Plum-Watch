package com.facebook.ads.redexgen.core;

import com.google.common.base.ElementTypesAreNonnullByDefault;
import com.google.common.base.Strings;
import java.util.Arrays;
import javax.annotation.CheckForNull;
import org.tensorflow.lite.schema.BuiltinOptions;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.jA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2570jA {
    public static byte[] A00;
    public static String[] A01 = {"rIY6scqdx44s0lYhNsVasOWOliCxkCUS", "XG17z2bEBjC2W", "Vem1quc5hPIJuUrE", "UcFFOKOZJEGoXQOYNnqMCDDpRLrphEx7", "nkZ3L4NSKd4uHuOS6chXEBDQJqUE8doa", "6xQ37guYp3oV6tn7J9L0pQx9gviAFZKh", "Tb0XI9b9KZ2bW8CyI06iyuXMMlzfJONe", "u0lWMQq9JRx7ZEcoLF7IwO0fOB8k5dGw"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A04(@CheckForNull T reference) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> T A05(@CheckForNull T reference, @CheckForNull Object errorMessage) {
        if (reference != null) {
            return reference;
        }
        throw new NullPointerException(String.valueOf(errorMessage));
    }

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = copyOfRange[i4];
            String[] strArr = A01;
            if (strArr[0].charAt(16) != strArr[3].charAt(16)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[1] = "4hJwB50Ffda8q";
            strArr2[2] = "BvOy7f3XfmcoPFEY";
            copyOfRange[i4] = (byte) ((b ^ i3) ^ 108);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A00 = new byte[]{35, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SelectOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.LessEqualOptions, 35, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.SelectOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.ReadVariableOptions, 35, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NegOptions, 35, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 35, BuiltinOptions.HashtableImportOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.UnsortedSegmentMaxOptions, 35, BuiltinOptions.ScatterNdOptions, BuiltinOptions.CumsumOptions, 35, BuiltinOptions.SegmentSumOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.AssignVariableOptions, 35, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.HashtableImportOptions, 35, BuiltinOptions.ReadVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.CumsumOptions, 35, BuiltinOptions.PadV2Options, BuiltinOptions.DequantizeOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.NegOptions, BuiltinOptions.PackOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.PackOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SignOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.SignOptions, BuiltinOptions.UnsortedSegmentSumOptions, Byte.MAX_VALUE, BuiltinOptions.Conv3DOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.SignOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.TileOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SelectOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ShapeOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.ATan2Options, BuiltinOptions.SelectV2Options, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SignOptions, BuiltinOptions.RandomOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.DensifyOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ShapeOptions, 63, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ATan2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, 35, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ExpOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.UnsortedSegmentMaxOptions, Byte.MAX_VALUE, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.GeluOptions};
    }

    static {
        A0A();
    }

    public static int A00(int index, int size) {
        return A02(index, size, A06(167, 5, 127));
    }

    public static int A01(int index, int size) {
        return A03(index, size, A06(167, 5, 127));
    }

    public static int A02(int index, int size, String desc) {
        if (index >= 0 && index < size) {
            return index;
        }
        throw new IndexOutOfBoundsException(A08(index, size, desc));
    }

    public static int A03(int index, int size, String desc) {
        if (index >= 0 && index <= size) {
            return index;
        }
        throw new IndexOutOfBoundsException(A09(index, size, desc));
    }

    public static String A07(int start, int end, int size) {
        if (start < 0 || start > size) {
            return A09(start, size, A06(187, 11, 96));
        }
        return (end < 0 || end > size) ? A09(end, size, A06(105, 9, 59)) : Strings.A02(A06(114, 53, 123), new Object[]{Integer.valueOf(end), Integer.valueOf(start)});
    }

    public static String A08(int index, int size, String desc) {
        if (index < 0) {
            return Strings.A02(A06(77, 28, 114), new Object[]{desc, Integer.valueOf(index)});
        }
        if (size >= 0) {
            return Strings.A02(A06(0, 35, 106), new Object[]{desc, Integer.valueOf(index), Integer.valueOf(size)});
        }
        throw new IllegalArgumentException(A06(172, 15, 59) + size);
    }

    public static String A09(int index, int size, String desc) {
        if (index < 0) {
            return Strings.A02(A06(77, 28, 114), new Object[]{desc, Integer.valueOf(index)});
        }
        if (size >= 0) {
            return Strings.A02(A06(35, 42, 111), new Object[]{desc, Integer.valueOf(index), Integer.valueOf(size)});
        }
        throw new IllegalArgumentException(A06(172, 15, 59) + size);
    }

    public static void A0B(int start, int end, int size) {
        if (start >= 0 && end >= start && end <= size) {
        } else {
            throw new IndexOutOfBoundsException(A07(start, end, size));
        }
    }

    public static void A0C(boolean expression) {
        if (expression) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A0D(boolean expression) {
        if (expression) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A0E(@CheckForNull boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalArgumentException(String.valueOf(errorMessage));
        }
    }

    public static void A0F(@CheckForNull boolean expression, Object errorMessage) {
        if (expression) {
        } else {
            throw new IllegalStateException(String.valueOf(errorMessage));
        }
    }

    public static void A0G(boolean expression, String errorMessageTemplate, int p1, int p2) {
        if (!expression) {
            throw new IllegalArgumentException(Strings.A02(errorMessageTemplate, new Object[]{Integer.valueOf(p1), Integer.valueOf(p2)}));
        }
    }

    public static void A0H(boolean expression, String errorMessageTemplate, long p1) {
        if (!expression) {
            throw new IllegalArgumentException(Strings.A02(errorMessageTemplate, new Object[]{Long.valueOf(p1)}));
        }
    }
}
