package com.huawei.hms.common.internal.safeparcel;

import android.gov.nist.core.Separators;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.util.SparseLongArray;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SafeParcelReader {

    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(new StringBuffer(String.valueOf(str).length() + 41).append(str).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
        }
    }

    private SafeParcelReader() {
    }

    private static void a(Parcel parcel, int r4, int r5, int r6) {
        if (r5 == r6) {
            return;
        }
        String hexString = Integer.toHexString(r5);
        throw new ParseException(new StringBuilder(hexString.length() + 46).append("Expected size ").append(r6).append(" got ").append(r5).append(" (0x").append(hexString).append(Separators.RPAREN).toString(), parcel);
    }

    private static boolean a(int r2, int r3) {
        long j = ((long) r2) + ((long) r3);
        return j > 2147483647L || j < -2147483648L;
    }

    private static void b(Parcel parcel, int r5, int r6) {
        int size = readSize(parcel, r5);
        if (size == r6) {
            return;
        }
        String hexString = Integer.toHexString(size);
        throw new ParseException(new StringBuilder(hexString.length() + 46).append("Expected size ").append(r6).append(" got ").append(size).append(" (0x").append(hexString).append(Separators.RPAREN).toString(), parcel);
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int r4) {
        int size = readSize(parcel, r4);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int r2 = parcel.readInt();
        parcel.setDataPosition(size + r0);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), r2);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int r8) {
        int size = readSize(parcel, r8);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new BigDecimal[0];
        }
        a(parcel, size, r0);
        int r2 = parcel.readInt();
        a(parcel, r2);
        BigDecimal[] bigDecimalArr = new BigDecimal[r2];
        for (int r1 = 0; r1 < r2; r1++) {
            bigDecimalArr[r1] = new BigDecimal(new BigInteger(parcel.createByteArray()), parcel.readInt());
        }
        parcel.setDataPosition(r0 + size);
        return bigDecimalArr;
    }

    public static BigInteger createBigInteger(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(size + r0);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new BigInteger[0];
        }
        a(parcel, size, r0);
        int r2 = parcel.readInt();
        a(parcel, r2);
        BigInteger[] bigIntegerArr = new BigInteger[r2];
        for (int r1 = 0; r1 < r2; r1++) {
            bigIntegerArr[r1] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(r0 + size);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new boolean[0];
        }
        a(parcel, size, r0);
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(size + r0);
        return zArrCreateBooleanArray;
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r4 = 0; r4 < r2; r4++) {
            arrayList.add(Boolean.valueOf(parcel.readInt() != 0));
        }
        parcel.setDataPosition(r0 + size);
        return arrayList;
    }

    public static Bundle createBundle(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(size + r0);
        return bundle;
    }

    public static byte[] createByteArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new byte[0];
        }
        a(parcel, size, r0);
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(size + r0);
        return bArrCreateByteArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int r6) {
        int size = readSize(parcel, r6);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        int r1 = parcel.readInt();
        a(parcel, r1);
        byte[][] bArr = new byte[r1][];
        for (int r3 = 0; r3 < r1; r3++) {
            bArr[r3] = parcel.createByteArray();
        }
        parcel.setDataPosition(r0 + size);
        return bArr;
    }

    public static SparseArray<byte[]> createByteArraySparseArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        int r1 = parcel.readInt();
        a(parcel, r1);
        SparseArray<byte[]> sparseArray = new SparseArray<>(r1);
        for (int r3 = 0; r3 < r1; r3++) {
            sparseArray.append(parcel.readInt(), parcel.createByteArray());
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static char[] createCharArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new char[0];
        }
        a(parcel, size, r0);
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(size + r0);
        return cArrCreateCharArray;
    }

    public static double[] createDoubleArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new double[0];
        }
        a(parcel, size, r0);
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(size + r0);
        return dArrCreateDoubleArray;
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<Double> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(r0 + size);
        return arrayList;
    }

    public static SparseArray<Double> createDoubleSparseArray(Parcel parcel, int r8) {
        int size = readSize(parcel, r8);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        SparseArray<Double> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static float[] createFloatArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new float[0];
        }
        a(parcel, size, r0);
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(size + r0);
        return fArrCreateFloatArray;
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int r6) {
        int size = readSize(parcel, r6);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<Float> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(r0 + size);
        return arrayList;
    }

    public static SparseArray<Float> createFloatSparseArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        SparseArray<Float> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), Float.valueOf(parcel.readFloat()));
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static IBinder[] createIBinderArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new IBinder[0];
        }
        a(parcel, size, r0);
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(size + r0);
        return iBinderArrCreateBinderArray;
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(size + r0);
        return arrayListCreateBinderArrayList;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        int r1 = parcel.readInt();
        a(parcel, r1);
        SparseArray<IBinder> sparseArray = new SparseArray<>(r1);
        for (int r3 = 0; r3 < r1; r3++) {
            sparseArray.append(parcel.readInt(), parcel.readStrongBinder());
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static int[] createIntArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new int[0];
        }
        a(parcel, size, r0);
        int[] r1 = parcel.createIntArray();
        parcel.setDataPosition(size + r0);
        return r1;
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int r6) {
        int size = readSize(parcel, r6);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(r0 + size);
        return arrayList;
    }

    public static long[] createLongArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new long[0];
        }
        a(parcel, size, r0);
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(size + r0);
        return jArrCreateLongArray;
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<Long> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            arrayList.add(Long.valueOf(parcel.readLong()));
        }
        parcel.setDataPosition(r0 + size);
        return arrayList;
    }

    public static Parcel createParcel(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, r0, size);
        parcel.setDataPosition(size + r0);
        return parcelObtain;
    }

    public static Parcel[] createParcelArray(Parcel parcel, int r8) {
        int size = readSize(parcel, r8);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new Parcel[0];
        }
        a(parcel, size, r0);
        int r2 = parcel.readInt();
        a(parcel, r2);
        Parcel[] parcelArr = new Parcel[r2];
        for (int r1 = 0; r1 < r2; r1++) {
            int r4 = parcel.readInt();
            if (r4 == 0) {
                parcelArr[r1] = null;
            } else {
                int r5 = parcel.dataPosition();
                a(parcel, r4, r5);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r5, r4);
                parcelArr[r1] = parcelObtain;
                parcel.setDataPosition(r4 + r5);
            }
        }
        parcel.setDataPosition(r0 + size);
        return parcelArr;
    }

    public static ArrayList<Parcel> createParcelList(Parcel parcel, int r9) {
        int size = readSize(parcel, r9);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        int r2 = parcel.readInt();
        a(parcel, r2);
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            if (r5 == 0) {
                arrayList.add(null);
            } else {
                int r6 = parcel.dataPosition();
                a(parcel, r5, r6);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r6, r5);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(r5 + r6);
            }
        }
        parcel.setDataPosition(r0 + size);
        return arrayList;
    }

    public static SparseArray<Parcel> createParcelSparseArray(Parcel parcel, int r10) {
        int size = readSize(parcel, r10);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        int r2 = parcel.readInt();
        a(parcel, r2);
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            int r6 = parcel.readInt();
            if (r6 == 0) {
                sparseArray.append(r5, null);
            } else {
                int r7 = parcel.dataPosition();
                a(parcel, r6, r7);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r7, r6);
                sparseArray.append(r5, parcelObtain);
                parcel.setDataPosition(r7 + r6);
            }
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static <P extends Parcelable> P createParcelable(Parcel parcel, int r2, Parcelable.Creator<P> creator) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        P pCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(size + r0);
        return pCreateFromParcel;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(size + r0);
        return sparseBooleanArray;
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        SparseIntArray sparseIntArray = new SparseIntArray();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(r0 + size);
        return sparseIntArray;
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int r8) {
        if (parcel == null) {
            return null;
        }
        int size = readSize(parcel, r8);
        int r1 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r1);
        SparseLongArray sparseLongArray = new SparseLongArray();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(r1 + size);
        return sparseLongArray;
    }

    public static String createString(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        String string = parcel.readString();
        parcel.setDataPosition(size + r0);
        return string;
    }

    public static String[] createStringArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return new String[0];
        }
        a(parcel, size, r0);
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(size + r0);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> createStringList(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(size + r0);
        return arrayListCreateStringArrayList;
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        SparseArray<String> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        a(parcel, r2);
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static <C> C[] createTypedArray(Parcel parcel, int r2, Parcelable.Creator<C> creator) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return creator.newArray(0);
        }
        a(parcel, size, r0);
        C[] cArr = (C[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(size + r0);
        return cArr;
    }

    public static <C> ArrayList<C> createTypedList(Parcel parcel, int r2, Parcelable.Creator<C> creator) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        ArrayList<C> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(size + r0);
        return arrayListCreateTypedArrayList;
    }

    public static <C> SparseArray<C> createTypedSparseArray(Parcel parcel, int r8, Parcelable.Creator<C> creator) {
        int size = readSize(parcel, r8);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        int r2 = parcel.readInt();
        a(parcel, r2);
        SparseArray<C> sparseArray = new SparseArray<>();
        for (int r4 = 0; r4 < r2; r4++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static void ensureAtEnd(Parcel parcel, int r4) {
        if (parcel.dataPosition() != r4) {
            throw new ParseException("Overread allowed size end=" + r4, parcel);
        }
    }

    public static int getFieldId(int r1) {
        return r1 & 65535;
    }

    public static boolean readBoolean(Parcel parcel, int r2) {
        b(parcel, r2, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean readBooleanObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return Boolean.FALSE;
        }
        a(parcel, r3, size, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(Parcel parcel, int r2) {
        b(parcel, r2, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(Parcel parcel, int r2) {
        b(parcel, r2, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int r2) {
        b(parcel, r2, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        a(parcel, r3, size, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(Parcel parcel, int r2) {
        b(parcel, r2, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        a(parcel, r3, size, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int readHeader(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder readIBinder(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        a(parcel, size, r0);
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(size + r0);
        return strongBinder;
    }

    public static int readInt(Parcel parcel, int r2) {
        b(parcel, r2, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        a(parcel, r3, size, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(Parcel parcel, int r2, List list, ClassLoader classLoader) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size != 0) {
            a(parcel, size, r0);
            parcel.readList(list, classLoader);
            parcel.setDataPosition(size + r0);
        }
    }

    public static long readLong(Parcel parcel, int r2) {
        b(parcel, r2, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        a(parcel, r3, size, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short readShort(Parcel parcel, int r2) {
        b(parcel, r2, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(Parcel parcel, int r3) {
        return (r3 & SupportMenu.CATEGORY_MASK) != -65536 ? (r3 >> 16) & 65535 : parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int r2) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        a(parcel, size, r0);
        parcel.setDataPosition(size + r0);
    }

    public static int validateObjectHeader(Parcel parcel) {
        int header = readHeader(parcel);
        int size = readSize(parcel, header);
        int r2 = parcel.dataPosition();
        if (getFieldId(header) != 20293) {
            String hexString = Integer.toHexString(header);
            throw new ParseException(hexString.length() != 0 ? "Expected object header. Got 0x".concat(hexString) : "Expected object header. Got 0x", parcel);
        }
        int r1 = size + r2;
        if (r1 < r2 || r1 > parcel.dataSize()) {
            throw new ParseException("invalid start=" + r2 + " end=" + r1, parcel);
        }
        return r1;
    }

    private static void a(Parcel parcel, int r1, int r2) {
        if (r1 < 0 || a(r1, r2)) {
            throw new ParseException("dataPosition cannot be beyond integer scope", parcel);
        }
    }

    private static void a(Parcel parcel, int r2) {
        if (r2 > 1024) {
            throw new ParseException("arraySize cannot be beyond 65535", parcel);
        }
    }
}
