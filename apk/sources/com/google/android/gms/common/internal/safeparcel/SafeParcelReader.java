package com.google.android.gms.common.internal.safeparcel;

import android.app.PendingIntent;
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

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes15.dex */
public class SafeParcelReader {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
    public static class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            int r0 = parcel.dataPosition();
            int r6 = parcel.dataSize();
            int length = String.valueOf(str).length();
            StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(r0).length() + 6 + String.valueOf(r6).length());
            sb.append(str);
            sb.append(" Parcel: pos=");
            sb.append(r0);
            sb.append(" size=");
            sb.append(r6);
            super(sb.toString());
        }
    }

    private SafeParcelReader() {
    }

    public static BigDecimal createBigDecimal(Parcel parcel, int r4) {
        int size = readSize(parcel, r4);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        int r2 = parcel.readInt();
        parcel.setDataPosition(r0 + size);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), r2);
    }

    public static BigDecimal[] createBigDecimalArray(Parcel parcel, int r9) {
        int size = readSize(parcel, r9);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[r1];
        for (int r3 = 0; r3 < r1; r3++) {
            byte[] bArrCreateByteArray = parcel.createByteArray();
            bigDecimalArr[r3] = new BigDecimal(new BigInteger(bArrCreateByteArray), parcel.readInt());
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
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(r0 + size);
        return new BigInteger(bArrCreateByteArray);
    }

    public static BigInteger[] createBigIntegerArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int r1 = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[r1];
        for (int r3 = 0; r3 < r1; r3++) {
            bigIntegerArr[r3] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(r0 + size);
        return bigIntegerArr;
    }

    public static boolean[] createBooleanArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        boolean[] zArrCreateBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(r0 + size);
        return zArrCreateBooleanArray;
    }

    public static ArrayList<Boolean> createBooleanList(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Boolean> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
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
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(r0 + size);
        return bundle;
    }

    public static byte[] createByteArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(r0 + size);
        return bArrCreateByteArray;
    }

    public static byte[][] createByteArrayArray(Parcel parcel, int r6) {
        int size = readSize(parcel, r6);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int r1 = parcel.readInt();
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
        int r1 = parcel.readInt();
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
            return null;
        }
        char[] cArrCreateCharArray = parcel.createCharArray();
        parcel.setDataPosition(r0 + size);
        return cArrCreateCharArray;
    }

    public static double[] createDoubleArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        double[] dArrCreateDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(r0 + size);
        return dArrCreateDoubleArray;
    }

    public static ArrayList<Double> createDoubleList(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
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
        SparseArray<Double> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
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
            return null;
        }
        float[] fArrCreateFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(r0 + size);
        return fArrCreateFloatArray;
    }

    public static ArrayList<Float> createFloatList(Parcel parcel, int r6) {
        int size = readSize(parcel, r6);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Float> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
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
        SparseArray<Float> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
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
            return null;
        }
        IBinder[] iBinderArrCreateBinderArray = parcel.createBinderArray();
        parcel.setDataPosition(r0 + size);
        return iBinderArrCreateBinderArray;
    }

    public static ArrayList<IBinder> createIBinderList(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<IBinder> arrayListCreateBinderArrayList = parcel.createBinderArrayList();
        parcel.setDataPosition(r0 + size);
        return arrayListCreateBinderArrayList;
    }

    public static SparseArray<IBinder> createIBinderSparseArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int r1 = parcel.readInt();
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
            return null;
        }
        int[] r1 = parcel.createIntArray();
        parcel.setDataPosition(r0 + size);
        return r1;
    }

    public static ArrayList<Integer> createIntegerList(Parcel parcel, int r6) {
        int size = readSize(parcel, r6);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
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
            return null;
        }
        long[] jArrCreateLongArray = parcel.createLongArray();
        parcel.setDataPosition(r0 + size);
        return jArrCreateLongArray;
    }

    public static ArrayList<Long> createLongList(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<Long> arrayList = new ArrayList<>();
        int r2 = parcel.readInt();
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
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(parcel, r0, size);
        parcel.setDataPosition(r0 + size);
        return parcelObtain;
    }

    public static Parcel[] createParcelArray(Parcel parcel, int r9) {
        int size = readSize(parcel, r9);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int r2 = parcel.readInt();
        Parcel[] parcelArr = new Parcel[r2];
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            if (r5 != 0) {
                int r6 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r6, r5);
                parcelArr[r4] = parcelObtain;
                parcel.setDataPosition(r6 + r5);
            } else {
                parcelArr[r4] = null;
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
        int r2 = parcel.readInt();
        ArrayList<Parcel> arrayList = new ArrayList<>();
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            if (r5 != 0) {
                int r6 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r6, r5);
                arrayList.add(parcelObtain);
                parcel.setDataPosition(r6 + r5);
            } else {
                arrayList.add(null);
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
        int r2 = parcel.readInt();
        SparseArray<Parcel> sparseArray = new SparseArray<>();
        for (int r4 = 0; r4 < r2; r4++) {
            int r5 = parcel.readInt();
            int r6 = parcel.readInt();
            if (r6 != 0) {
                int r7 = parcel.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(parcel, r7, r6);
                sparseArray.append(r5, parcelObtain);
                parcel.setDataPosition(r7 + r6);
            } else {
                sparseArray.append(r5, null);
            }
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static <T extends Parcelable> T createParcelable(Parcel parcel, int r2, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(r0 + size);
        return tCreateFromParcel;
    }

    public static SparseBooleanArray createSparseBooleanArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseBooleanArray sparseBooleanArray = parcel.readSparseBooleanArray();
        parcel.setDataPosition(r0 + size);
        return sparseBooleanArray;
    }

    public static SparseIntArray createSparseIntArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseIntArray sparseIntArray = new SparseIntArray();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseIntArray.append(parcel.readInt(), parcel.readInt());
        }
        parcel.setDataPosition(r0 + size);
        return sparseIntArray;
    }

    public static SparseLongArray createSparseLongArray(Parcel parcel, int r8) {
        int size = readSize(parcel, r8);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseLongArray sparseLongArray = new SparseLongArray();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseLongArray.append(parcel.readInt(), parcel.readLong());
        }
        parcel.setDataPosition(r0 + size);
        return sparseLongArray;
    }

    public static String createString(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(r0 + size);
        return string;
    }

    public static String[] createStringArray(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(r0 + size);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> createStringList(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(r0 + size);
        return arrayListCreateStringArrayList;
    }

    public static SparseArray<String> createStringSparseArray(Parcel parcel, int r7) {
        int size = readSize(parcel, r7);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        SparseArray<String> sparseArray = new SparseArray<>();
        int r2 = parcel.readInt();
        for (int r3 = 0; r3 < r2; r3++) {
            sparseArray.append(parcel.readInt(), parcel.readString());
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static <T> T[] createTypedArray(Parcel parcel, int r2, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(r0 + size);
        return tArr;
    }

    public static <T> ArrayList<T> createTypedList(Parcel parcel, int r2, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(r0 + size);
        return arrayListCreateTypedArrayList;
    }

    public static <T> SparseArray<T> createTypedSparseArray(Parcel parcel, int r8, Parcelable.Creator<T> creator) {
        int size = readSize(parcel, r8);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        int r2 = parcel.readInt();
        SparseArray<T> sparseArray = new SparseArray<>();
        for (int r4 = 0; r4 < r2; r4++) {
            sparseArray.append(parcel.readInt(), parcel.readInt() != 0 ? creator.createFromParcel(parcel) : null);
        }
        parcel.setDataPosition(r0 + size);
        return sparseArray;
    }

    public static void ensureAtEnd(Parcel parcel, int r4) {
        if (parcel.dataPosition() == r4) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(r4).length() + 26);
        sb.append("Overread allowed size end=");
        sb.append(r4);
        throw new ParseException(sb.toString(), parcel);
    }

    public static int getFieldId(int r0) {
        return (char) r0;
    }

    public static boolean readBoolean(Parcel parcel, int r2) {
        zza(parcel, r2, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean readBooleanObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        zzb(parcel, r3, size, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static byte readByte(Parcel parcel, int r2) {
        zza(parcel, r2, 4);
        return (byte) parcel.readInt();
    }

    public static char readChar(Parcel parcel, int r2) {
        zza(parcel, r2, 4);
        return (char) parcel.readInt();
    }

    public static double readDouble(Parcel parcel, int r2) {
        zza(parcel, r2, 8);
        return parcel.readDouble();
    }

    public static Double readDoubleObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        zzb(parcel, r3, size, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float readFloat(Parcel parcel, int r2) {
        zza(parcel, r2, 4);
        return parcel.readFloat();
    }

    public static Float readFloatObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        zzb(parcel, r3, size, 4);
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
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(r0 + size);
        return strongBinder;
    }

    public static int readInt(Parcel parcel, int r2) {
        zza(parcel, r2, 4);
        return parcel.readInt();
    }

    public static Integer readIntegerObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        zzb(parcel, r3, size, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static void readList(Parcel parcel, int r2, List list, ClassLoader classLoader) {
        int size = readSize(parcel, r2);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return;
        }
        parcel.readList(list, classLoader);
        parcel.setDataPosition(r0 + size);
    }

    public static long readLong(Parcel parcel, int r2) {
        zza(parcel, r2, 8);
        return parcel.readLong();
    }

    public static Long readLongObject(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        if (size == 0) {
            return null;
        }
        zzb(parcel, r3, size, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static PendingIntent readPendingIntent(Parcel parcel, int r3) {
        int size = readSize(parcel, r3);
        int r0 = parcel.dataPosition();
        if (size == 0) {
            return null;
        }
        PendingIntent pendingIntentOrNullFromParcel = PendingIntent.readPendingIntentOrNullFromParcel(parcel);
        parcel.setDataPosition(r0 + size);
        return pendingIntentOrNullFromParcel;
    }

    public static short readShort(Parcel parcel, int r2) {
        zza(parcel, r2, 4);
        return (short) parcel.readInt();
    }

    public static int readSize(Parcel parcel, int r3) {
        return (r3 & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (r3 >> 16) : parcel.readInt();
    }

    public static void skipUnknownField(Parcel parcel, int r2) {
        parcel.setDataPosition(parcel.dataPosition() + readSize(parcel, r2));
    }

    public static int validateObjectHeader(Parcel parcel) {
        int header = readHeader(parcel);
        int size = readSize(parcel, header);
        int fieldId = getFieldId(header);
        int r3 = parcel.dataPosition();
        if (fieldId != 20293) {
            String hexString = Integer.toHexString(header);
            String.valueOf(hexString);
            throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(hexString)), parcel);
        }
        int r1 = size + r3;
        if (r1 >= r3 && r1 <= parcel.dataSize()) {
            return r1;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(r3).length() + 32 + String.valueOf(r1).length());
        sb.append("Size read is invalid start=");
        sb.append(r3);
        sb.append(" end=");
        sb.append(r1);
        throw new ParseException(sb.toString(), parcel);
    }

    private static void zza(Parcel parcel, int r6, int r7) {
        int size = readSize(parcel, r6);
        if (size == r7) {
            return;
        }
        String hexString = Integer.toHexString(size);
        int length = String.valueOf(r7).length();
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(size).length() + 4 + String.valueOf(hexString).length() + 1);
        sb.append("Expected size ");
        sb.append(r7);
        sb.append(" got ");
        sb.append(size);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(Separators.RPAREN);
        throw new ParseException(sb.toString(), parcel);
    }

    private static void zzb(Parcel parcel, int r5, int r6, int r7) {
        if (r6 == r7) {
            return;
        }
        String hexString = Integer.toHexString(r6);
        int length = String.valueOf(r7).length();
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(r6).length() + 4 + String.valueOf(hexString).length() + 1);
        sb.append("Expected size ");
        sb.append(r7);
        sb.append(" got ");
        sb.append(r6);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(Separators.RPAREN);
        throw new ParseException(sb.toString(), parcel);
    }
}
