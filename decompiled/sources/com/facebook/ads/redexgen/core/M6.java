package com.facebook.ads.redexgen.core;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import org.tensorflow.lite.schema.BuiltinOptions;

@MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* loaded from: assets/audience_network.dex */
public final class M6 {
    public static byte[] A06;
    public static String[] A07 = {"1eaMPdLcC8DbZCkn0iIyVPFCZSdDAanS", "Exaxr4PlErBkBzdiwoicKn", "2BC", "jQaYCx7PV0mXn8Zj7H8rC7xxlui6spsC", "wp2nCKHDQcjkZqDMhhhKbFGW7G", "lMJ", "SjVm96go47njO9ADG8uLls", "QdN"};
    public M5 A00;
    public M5 A01;
    public final SparseArray<String> A02;
    public final SparseBooleanArray A03;
    public final SparseBooleanArray A04;
    public final HashMap<String, M4> A05;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 51);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A06 = new byte[]{20, 16, 6, BuiltinOptions.ATan2Options, 22, 23, 22, BuiltinOptions.ATan2Options, 5, 30, 22, 6, BuiltinOptions.NonMaxSuppressionV5Options, 5, 20, 17, 17, 28, 27, 18, 32, BuiltinOptions.ExpOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.VarHandleOptions, BuiltinOptions.PadV2Options, BuiltinOptions.BitwiseXorOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.RightShiftOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.PadV2Options, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.AssignVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.PadV2Options, Byte.MAX_VALUE, BuiltinOptions.BitwiseXorOptions, Byte.MAX_VALUE, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.ZerosLikeOptions, Byte.MAX_VALUE, BuiltinOptions.BucketizeOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.RandomOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.DynamicUpdateSliceOptions};
    }

    static {
        A07();
    }

    public M6(InterfaceC12294m interfaceC12294m, File file, byte[] bArr, boolean z, boolean z2) {
        C3M.A08((interfaceC12294m == null && file == null) ? false : true);
        this.A05 = new HashMap<>();
        this.A02 = new SparseArray<>();
        this.A04 = new SparseBooleanArray();
        this.A03 = new SparseBooleanArray();
        C2555iu c2555iu = interfaceC12294m != null ? new C2555iu(interfaceC12294m) : null;
        M5 databaseStorage = file != null ? new C2554it(new File(file, A04(42, 24, 47)), bArr, z) : null;
        if (c2555iu == null || (databaseStorage != null && z2)) {
            M5 legacyStorage = (M5) AbstractC12174a.A0f(databaseStorage);
            this.A01 = legacyStorage;
            this.A00 = c2555iu;
        } else {
            this.A01 = c2555iu;
            this.A00 = databaseStorage;
        }
    }

    public static int A00(SparseArray<String> idToKey) {
        int id2;
        int size = idToKey.size();
        if (size == 0) {
            id2 = 0;
        } else {
            int size2 = size - 1;
            id2 = idToKey.keyAt(size2) + 1;
        }
        if (id2 < 0) {
            id2 = 0;
            while (id2 < size) {
                int size3 = idToKey.keyAt(id2);
                if (id2 != size3) {
                    break;
                }
                id2++;
            }
        }
        return id2;
    }

    private M4 A01(String str) {
        int A00 = A00(this.A02);
        M4 m4 = new M4(A00, str);
        this.A05.put(str, m4);
        this.A02.put(A00, str);
        this.A03.put(A00, true);
        this.A01.AFa(m4);
        return m4;
    }

    public static C2553is A02(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int nextBytesToRead = 0; nextBytesToRead < readInt; nextBytesToRead++) {
            String readUTF = dataInputStream.readUTF();
            int bytesRead = dataInputStream.readInt();
            if (bytesRead >= 0) {
                int valueSize = 0;
                int i = Math.min(bytesRead, BmLocated.ALIGN_RIGHT_BOTTOM);
                byte[] bArr = AbstractC12174a.A07;
                while (valueSize != bytesRead) {
                    int size = valueSize + i;
                    bArr = Arrays.copyOf(bArr, size);
                    dataInputStream.readFully(bArr, valueSize, i);
                    valueSize += i;
                    int size2 = bytesRead - valueSize;
                    i = Math.min(size2, BmLocated.ALIGN_RIGHT_BOTTOM);
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(A04(22, 20, 56) + bytesRead);
            }
        }
        return new C2553is(hashMap);
    }

    public static Cipher A05() throws NoSuchPaddingException, NoSuchAlgorithmException {
        int i = AbstractC12174a.A02;
        String A04 = A04(0, 20, 102);
        if (i == 18) {
            try {
                return Cipher.getInstance(A04, A04(20, 2, 81));
            } catch (Throwable unused) {
            }
        }
        Cipher cipher = Cipher.getInstance(A04);
        String[] strArr = A07;
        if (strArr[6].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[6] = "EBBbD5OLh9DYDBrMigQNtJ";
        strArr2[1] = "xQSZ94mu2vygjBv0Ab9r12";
        return cipher;
    }

    public static void A08(C2553is c2553is, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> A062 = c2553is.A06();
        dataOutputStream.writeInt(A062.size());
        for (Map.Entry<String, byte[]> entry : A062) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public static boolean A0A(String str) {
        return str.startsWith(A04(42, 24, 47));
    }

    public final int A0B(String str) {
        return A0D(str).A01;
    }

    public final M4 A0C(String str) {
        return this.A05.get(str);
    }

    public final M4 A0D(String str) {
        M4 cachedContent = this.A05.get(str);
        return cachedContent == null ? A01(str) : cachedContent;
    }

    public final C2553is A0E(String str) {
        M4 cachedContent = A0C(str);
        return cachedContent != null ? cachedContent.A03() : C2553is.A03;
    }

    public final String A0F(int i) {
        return this.A02.get(i);
    }

    public final Collection<M4> A0G() {
        return Collections.unmodifiableCollection(this.A05.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0H() {
        AbstractC2939pg A0N = AbstractC1371Al.A07(this.A05.keySet()).A0N();
        while (true) {
            boolean hasNext = A0N.hasNext();
            String[] strArr = A07;
            if (strArr[7].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "jpVmrDDiLa6KSoRZ9DaLqT";
            strArr2[1] = "R0FMfILNqJLoUgBryCIaQS";
            if (hasNext) {
                A0K((String) A0N.next());
            } else {
                return;
            }
        }
    }

    public final void A0I() throws IOException {
        this.A01.AJY(this.A05);
        int size = this.A04.size();
        for (int i = 0; i < size; i++) {
            SparseArray<String> sparseArray = this.A02;
            int removedIdCount = this.A04.keyAt(i);
            sparseArray.remove(removedIdCount);
        }
        this.A04.clear();
        this.A03.clear();
    }

    public final void A0J(long j) throws IOException {
        this.A01.AA7(j);
        if (this.A00 != null) {
            this.A00.AA7(j);
        }
        if (!this.A01.A6K() && this.A00 != null && this.A00.A6K()) {
            this.A00.AAj(this.A05, this.A02);
            this.A01.AJX(this.A05);
        } else {
            this.A01.AAj(this.A05, this.A02);
        }
        if (this.A00 != null) {
            M5 m5 = this.A00;
            String[] strArr = A07;
            if (strArr[6].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[6] = "sHyLaDKMqWdH53QwNCQNuy";
            strArr2[1] = "kZIq1iKkwSA0yGMJ22HAvZ";
            m5.A5h();
            this.A00 = null;
        }
    }

    public final void A0K(String str) {
        M4 m4 = this.A05.get(str);
        if (m4 != null && m4.A09() && m4.A0A()) {
            this.A05.remove(str);
            int i = m4.A01;
            boolean z = this.A03.get(i);
            this.A01.AEv(m4, z);
            if (z) {
                this.A02.remove(i);
                this.A03.delete(i);
            } else {
                this.A02.put(i, null);
                this.A04.put(i, true);
            }
        }
    }

    public final void A0L(String str, M9 m9) {
        M4 A0D = A0D(str);
        if (A0D.A0E(m9)) {
            this.A01.AFa(A0D);
        }
    }
}
