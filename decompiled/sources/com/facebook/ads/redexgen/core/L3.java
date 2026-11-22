package com.facebook.ads.redexgen.core;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class L3 {
    public static byte[] A00;
    public static String[] A01 = {"pXXvlweo53LEBZFO8IULCIdZyckTRG5r", "DuGHfKZCm01", "80fcVnrJERY0uuv61EoOWTfKBWpdgNO", "9CXibrLJZkMktsdeymca", "5EX4ZE8RGyFWDwwd0Tfx6XQfl6R1kt5", "MQihPub9yWY", "FZA8FrqtMtEe7NzfiE56", "M8QLs2sFGOm02m2V5lAOlFR2Pc3pvKwT"};

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{BuiltinOptions.IfOptions, 21, 15, BuiltinOptions.IfOptions, 18, 19, 8, BuiltinOptions.IfOptions, 24, 21, 14, 25, 31, 8, 19, 14, 5, BuiltinOptions.WhileOptions, BuiltinOptions.ExpandDimsOptions, 25, 2, 21, 19, 4, 31, 2, 9, BuiltinOptions.UniqueOptions, BuiltinOptions.WhereOptions, 3, BuiltinOptions.UniqueOptions, 19, 17, 30, BuiltinOptions.ReverseSequenceOptions, 4, BuiltinOptions.UniqueOptions, 18, 21, BuiltinOptions.UniqueOptions, 19, 2, 21, 17, 4, 21, 20, BuiltinOptions.LogicalAndOptions, 9, 9, 20, 9, BuiltinOptions.HardSwishOptions, 9, 30, 24, 9, 30, 26, 15, 30, BuiltinOptions.HardSwishOptions, 1, 30, 9, 20, BuiltinOptions.RankOptions, 8, 18, 1, 30, BuiltinOptions.HardSwishOptions, 29, 18, 23, 30, BuiltinOptions.HardSwishOptions, BuiltinOptions.ATan2Options, BuiltinOptions.MirrorPadOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.MirrorPadOptions, 31, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.LeakyReluOptions, 31, BuiltinOptions.GatherNdOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.LeakyReluOptions, 31, BuiltinOptions.AddNOptions, BuiltinOptions.UniqueOptions, BuiltinOptions.HardSwishOptions, BuiltinOptions.RankOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.RankOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.HardSwishOptions, 31, BuiltinOptions.HardSwishOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.LeakyReluOptions, BuiltinOptions.MatrixSetDiagOptions, 31, BuiltinOptions.LeakyReluOptions, BuiltinOptions.UniqueOptions, 31, BuiltinOptions.GatherNdOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.EqualOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.DynamicUpdateSliceOptions};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static synchronized void A06(File file) throws IOException {
        synchronized (L3.class) {
            if (file.exists()) {
                if (!file.isDirectory()) {
                    throw new IOException(A00(109, 5, 102) + file + A00(0, 18, 15));
                }
            } else if (!file.mkdirs()) {
                throw new IOException(String.format(Locale.US, A00(18, 29, 3), file.getAbsolutePath()));
            }
        }
    }

    static {
        A02();
    }

    public static List<File> A01(File file) {
        LinkedList linkedList = new LinkedList();
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            List<File> asList = Arrays.asList(listFiles);
            Collections.sort(asList, new L2());
            return asList;
        }
        return linkedList;
    }

    public static void A03(File file) throws IOException {
        if (file.exists()) {
            long currentTimeMillis = System.currentTimeMillis();
            if (!file.setLastModified(currentTimeMillis)) {
                A04(file);
                if (file.lastModified() >= currentTimeMillis) {
                } else {
                    throw new IOException(A00(77, 32, 76) + file);
                }
            }
        }
    }

    public static void A04(File file) throws IOException {
        long length = file.length();
        if (length == 0) {
            A05(file);
            String[] strArr = A01;
            if (strArr[7].charAt(10) == strArr[0].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[5] = "fwMIAeZxeVy";
            strArr2[1] = "XGkZ1N2vKGp";
            return;
        }
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, A00(114, 3, 98));
        long size = length - 1;
        randomAccessFile.seek(size);
        byte readByte = randomAccessFile.readByte();
        randomAccessFile.seek(length - 1);
        randomAccessFile.write(readByte);
        randomAccessFile.close();
    }

    public static void A05(File file) throws IOException {
        if (file.delete() && file.createNewFile()) {
        } else {
            throw new IOException(A00(47, 30, 8) + file);
        }
    }
}
