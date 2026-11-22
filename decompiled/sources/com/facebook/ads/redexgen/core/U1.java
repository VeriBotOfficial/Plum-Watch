package com.facebook.ads.redexgen.core;

import com.alibaba.fastjson.asm.Opcodes;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import org.apache.commons.net.ftp.FTPReply;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: assets/audience_network.dex */
public final class U1 implements Closeable {
    public static byte[] A03;
    public static String[] A04 = {"eAEkEYRVeXrfS58a4k5WuKPwy8inSFa", "kCWvHOIytqFj1LqyoQQyp7", "68j8lTajfoiD43mqP1eMjl4G9M", "TuTeUuVTuzlBunCet0oFaCexHHLwVmnb", "nTNwkbliDK7ulO", "oDpWF45gCEuTtB4s", "WYN7gIj7AgnNZEOK", "71vjkKoJ6BpaE0wznNMgre6CgC3xNcNz"};
    public final C1862Tr A01;
    public final Deque<U0> A02 = new LinkedList();
    public boolean A00 = false;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 100);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-37, 7, 13, 4, -4, -72, 6, 7, 12, -72, -7, -4, -4, -72, 10, -3, -5, 7, 10, -4, -72, 12, 7, -72, 6, -3, 15, 4, 17, -72, -7, -4, -4, -3, -4, -72, -2, 1, 4, -3, 30, BuiltinOptions.ArgMinOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, 61, BuiltinOptions.LogicalOrOptions, -8, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -8, BuiltinOptions.LogicalOrOptions, 61, BuiltinOptions.FillOptions, 61, BuiltinOptions.SquaredDifferenceOptions, 61, -8, BuiltinOptions.LogicalAndOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FillOptions, 61, -8, -1, -3, BuiltinOptions.LeakyReluOptions, -1, -73, -46, -38, -35, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, OtaCommandGenerator.CMD_GET_INFO, -27, -32, OtaCommandGenerator.CMD_GET_INFO, -35, -38, -28, -27, OtaCommandGenerator.CMD_GET_INFO, -41, -38, -35, -42, TransmissionUnpacked.HD_VAL_MAGIC_LB, OtaCommandGenerator.CMD_GET_INFO, -38, -33, OtaCommandGenerator.CMD_GET_INFO, TransmissionUnpacked.HD_VAL_MAGIC_LB, -38, -29, -42, -44, -27, -32, -29, -22, OtaCommandGenerator.CMD_GET_INFO, -104, -106, -28, -104, -31, -4, 4, 7, 0, -1, -69, 15, 10, -69, 7, 10, -4, -1, -69, 1, 4, 7, 0, -69, -62, -64, 14, -62, -57, -69, 14, 6, 4, 11, 11, 4, 9, 2, -69, -4, 7, 7, -69, 11, 13, 0, 17, 4, 10, 16, 14, -69, 1, 4, 7, 0, 14, -69, 16, 9, 15, 4, 7, -69, -64, -1, -37, -4, -5, -70, TransmissionUnpacked.HD_VAL_MAGIC_HB, -4, -5, 1, -10, -12, 2, -4, 2, 0, -83, -5, -18, -6, -14, -15, -83, -13, -10, -7, -14, -83, -10, -5, -83, -7, -4, -12, -12, -10, -5, -12, -83, -15, -10, -1, -14, TransmissionUnpacked.HD_VAL_MAGIC_HB, 1, -4, -1, 6, -57, -83, -78, -15, -71, -83, -6, -10, -5, -83, -10, 0, -83, -78, -15, TransmissionUnpacked.HD_VAL_MAGIC_LB, -24, -26, -14, -11, -25, -55, -20, -17, -24, -42, -24, -12, -8, -24, -15, -26, -24, -93, -28, -17, -11, -24, -28, -25, -4, -93, -26, -17, -14, -10, -24, -25, BuiltinOptions.SelectOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ReverseV2Options, BuiltinOptions.FloorModOptions, -6, 64, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, 63, -6, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, -6, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.RangeOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.FloorDivOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.FloorDivOptions, -6, BuiltinOptions.LogicalAndOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.SquaredDifferenceOptions, 63, 61, BuiltinOptions.AbsOptions, BuiltinOptions.RangeOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.GatherNdOptions, 20, -6, 1, -1, BuiltinOptions.MirrorPadOptions, 1};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized int A09() throws IOException {
        int i;
        if (this.A00) {
            throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
        }
        i = 0;
        Iterator<U0> it = this.A02.iterator();
        while (it.hasNext()) {
            i += it.next().A01();
        }
        return i;
    }

    static {
        A03();
    }

    public U1(C1862Tr c1862Tr, InterfaceC1870Tz interfaceC1870Tz) throws IOException {
        this.A01 = c1862Tr;
        A05(c1862Tr, interfaceC1870Tz);
        if (this.A02.isEmpty()) {
            A00();
        }
    }

    private U0 A00() throws IOException {
        int i = -1;
        if (!this.A02.isEmpty()) {
            i = this.A02.getLast().A00();
        }
        int i2 = i + 1;
        this.A02.add(new U0(i2, new C1868Tx(new File(this.A01.A05(), A01(i2)))));
        return this.A02.getLast();
    }

    public static String A01(int i) {
        return Integer.toString(i);
    }

    private void A04(int i, File file) throws IOException {
        C1868Tx c1868Tx = new C1868Tx(file);
        c1868Tx.A05();
        this.A02.addFirst(new U0(i, c1868Tx));
    }

    private void A05(C1862Tr c1862Tr, InterfaceC1870Tz interfaceC1870Tz) throws IOException {
        File[] listFiles = c1862Tr.A05().listFiles();
        if (listFiles != null) {
            HashMap hashMap = new HashMap();
            HashSet hashSet = new HashSet();
            int i = -1;
            for (File file : listFiles) {
                try {
                    int parseInt = Integer.parseInt(file.getName());
                    hashMap.put(Integer.valueOf(parseInt), file);
                    if (parseInt > i) {
                        i = parseInt;
                    }
                } catch (NumberFormatException unused) {
                    hashSet.add(file);
                    interfaceC1870Tz.AHs(String.format(Locale.US, A02(260, 39, 118), file.getCanonicalPath()));
                }
            }
            boolean isEmpty = hashMap.isEmpty();
            if (A04[0].length() != 31) {
                throw new RuntimeException();
            }
            A04[7] = "dQtFqGLzpKOzaVLFdcsStellVtbbzgLH";
            if (!isEmpty) {
                int i2 = i;
                while (hashMap.containsKey(Integer.valueOf(i2 - 1))) {
                    i2--;
                }
                Iterator it = new HashSet(hashMap.keySet()).iterator();
                while (it.hasNext()) {
                    int intValue = ((Integer) it.next()).intValue();
                    if (intValue < i2) {
                        interfaceC1870Tz.AHs(String.format(Locale.US, A02(Opcodes.IF_ACMPNE, 61, 41), Integer.valueOf(intValue), Integer.valueOf(i2)));
                        hashSet.add((File) hashMap.remove(Integer.valueOf(intValue)));
                    }
                }
                while (i >= i2) {
                    File file2 = (File) hashMap.get(Integer.valueOf(i));
                    try {
                        A04(i, file2);
                        hashMap.remove(Integer.valueOf(i));
                        i--;
                    } catch (IOException e) {
                        interfaceC1870Tz.AHt(String.format(Locale.US, A02(104, 62, 55), file2.getCanonicalPath(), Integer.valueOf(i)), e);
                        hashSet.addAll(hashMap.values());
                    }
                }
            }
            for (Object obj : hashSet) {
                String[] strArr = A04;
                if (strArr[2].length() == strArr[1].length()) {
                    throw new RuntimeException();
                }
                A04[4] = "c1qN9eBQiEQB2i";
                File file3 = (File) obj;
                if (!file3.delete()) {
                    Locale locale = Locale.US;
                    String canonicalPath = file3.getCanonicalPath();
                    Object[] objArr = new Object[1];
                    if (A04[7].charAt(19) != 'm') {
                        A04[7] = "thOmxL8vB3eH9n9jjORGQQ6LKF6RMw2U";
                        objArr[0] = canonicalPath;
                        interfaceC1870Tz.AHs(String.format(locale, A02(40, 26, 116), objArr));
                    } else {
                        A04[7] = "xgRJlHLuW2qx7z7dN03x9GIdgxBOKXSD";
                        objArr[0] = canonicalPath;
                        interfaceC1870Tz.AHs(String.format(locale, A02(38, 20, 82), objArr));
                    }
                }
            }
            return;
        }
        IOException e2 = new IOException(String.format(Locale.US, A02(66, 38, 13), c1862Tr.A05().getCanonicalPath()));
        throw e2;
    }

    public final synchronized int A06() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return -1;
            }
            return this.A02.getFirst().A00();
        }
        throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
    }

    public final synchronized int A07() throws IOException {
        if (!this.A00) {
            if (this.A02.isEmpty()) {
                return 0;
            }
            return this.A02.getFirst().A01();
        }
        throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
    }

    public final synchronized int A08() throws IOException {
        if (!this.A00) {
        } else {
            throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
        }
        return this.A02.size();
    }

    public final synchronized C1860Tp A0A(int i, int i2, byte[] bArr, int i3, int[] iArr, int i4) throws IOException {
        if (!this.A00) {
            for (U0 file : this.A02) {
                if (file.A00() == i) {
                    return new C1860Tp(i, file.A02(i2, bArr, i3, iArr, i4));
                }
            }
            return new C1860Tp(-1, new C1859To(EnumC1858Tn.A05, -1, -1, 0));
        }
        throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
    }

    public final synchronized void A0B() throws IOException {
        if (!this.A00) {
            Iterator<U0> it = this.A02.iterator();
            while (it.hasNext()) {
                it.next().A04();
            }
            this.A02.clear();
            A00();
        } else {
            throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
        }
    }

    public final synchronized void A0C(byte[] bArr) throws IOException {
        if (!this.A00) {
            if ((this.A02.isEmpty() || !this.A02.getLast().A05(bArr)) && !A00().A05(bArr)) {
                throw new IOException(A02(0, 40, 52));
            }
        } else {
            throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
        }
    }

    public final synchronized boolean A0D() throws IOException {
        if (!this.A00) {
            if (this.A02.size() <= 1) {
                return false;
            }
            U0 first = this.A02.getFirst();
            this.A02.removeFirst();
            first.A04();
            return true;
        }
        throw new IOException(A02(FTPReply.ENTERING_PASSIVE_MODE, 33, 31));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A00) {
            return;
        }
        this.A00 = true;
        Iterator<U0> it = this.A02.iterator();
        while (it.hasNext()) {
            it.next().A03();
        }
    }
}
