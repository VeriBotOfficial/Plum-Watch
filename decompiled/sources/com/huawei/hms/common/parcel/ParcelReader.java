package com.huawei.hms.common.parcel;

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
import java.util.HashMap;
import java.util.List;

/* loaded from: classes14.dex */
public class ParcelReader {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 65262;

    /* renamed from: a, reason: collision with root package name */
    HashMap<Integer, Integer[]> f10312a = new HashMap<>();
    private Parcel e;

    public class ParseException extends RuntimeException {
        public ParseException(String str, Parcel parcel) {
            super(str);
        }
    }

    public ParcelReader(Parcel parcel) {
        this.e = parcel;
        a();
    }

    private int a(int i) {
        Integer[] numArr = this.f10312a.get(Integer.valueOf(i));
        if (numArr == null) {
            throw new ParseException("Field is null:".concat(String.valueOf(numArr)), this.e);
        }
        this.e.setDataPosition(numArr[0].intValue());
        return numArr[1].intValue();
    }

    private void a() {
        int readInt = this.e.readInt();
        int i = readInt & 65535;
        int readInt2 = (readInt & SupportMenu.CATEGORY_MASK) != -65536 ? (readInt >> 16) & 65535 : this.e.readInt();
        if (i != d) {
            throw new ParseException("Parse header error, not 65262. Got 0x".concat(String.valueOf(Integer.toHexString(i))), this.e);
        }
        int dataPosition = this.e.dataPosition();
        int i2 = readInt2 + dataPosition;
        if (i2 < dataPosition || i2 > this.e.dataSize()) {
            throw new ParseException("invalid size, start=" + dataPosition + " end=" + i2, this.e);
        }
        while (this.e.dataPosition() < i2) {
            int readInt3 = this.e.readInt();
            int i3 = readInt3 & 65535;
            int readInt4 = (readInt3 & SupportMenu.CATEGORY_MASK) != -65536 ? (readInt3 >> 16) & 65535 : this.e.readInt();
            int dataPosition2 = this.e.dataPosition();
            this.f10312a.put(Integer.valueOf(i3), new Integer[]{Integer.valueOf(dataPosition2), Integer.valueOf(readInt4)});
            this.e.setDataPosition(dataPosition2 + readInt4);
        }
        if (this.e.dataPosition() != i2) {
            throw new ParseException("the dataPosition is not".concat(String.valueOf(i2)), this.e);
        }
    }

    private void a(int i, int i2) {
        Integer[] numArr = this.f10312a.get(Integer.valueOf(i));
        if (numArr == null) {
            throw new ParseException("Field is null:".concat(String.valueOf(numArr)), this.e);
        }
        int intValue = numArr[1].intValue();
        if (intValue == i2) {
            return;
        }
        throw new ParseException("the field size is not " + i2 + " got " + intValue + " (0x" + Integer.toHexString(intValue) + Separators.RPAREN, this.e);
    }

    private int b(int i, int i2) {
        Integer[] numArr = this.f10312a.get(Integer.valueOf(i));
        if (numArr == null) {
            throw new ParseException("Field is null:".concat(String.valueOf(numArr)), this.e);
        }
        this.e.setDataPosition(numArr[0].intValue());
        a(i, i2);
        return i2;
    }

    public BigDecimal createBigDecimal(int i, BigDecimal bigDecimal) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bigDecimal;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        byte[] createByteArray = this.e.createByteArray();
        int readInt = this.e.readInt();
        this.e.setDataPosition(dataPosition + a2);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    public BigDecimal[] createBigDecimalArray(int i, BigDecimal[] bigDecimalArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bigDecimalArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        BigDecimal[] bigDecimalArr2 = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = this.e.createByteArray();
            bigDecimalArr2[i2] = new BigDecimal(new BigInteger(createByteArray), this.e.readInt());
        }
        this.e.setDataPosition(dataPosition + a2);
        return bigDecimalArr2;
    }

    public BigInteger createBigInteger(int i, BigInteger bigInteger) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bigInteger;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        byte[] createByteArray = this.e.createByteArray();
        this.e.setDataPosition(dataPosition + a2);
        return new BigInteger(createByteArray);
    }

    public BigInteger[] createBigIntegerArray(int i, BigInteger[] bigIntegerArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bigIntegerArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        BigInteger[] bigIntegerArr2 = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr2[i2] = new BigInteger(this.e.createByteArray());
        }
        this.e.setDataPosition(dataPosition + a2);
        return bigIntegerArr2;
    }

    public boolean[] createBooleanArray(int i, boolean[] zArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return zArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        boolean[] createBooleanArray = this.e.createBooleanArray();
        this.e.setDataPosition(dataPosition + a2);
        return createBooleanArray;
    }

    public ArrayList<Boolean> createBooleanList(int i, ArrayList<Boolean> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Boolean.valueOf(this.e.readInt() != 0));
        }
        this.e.setDataPosition(dataPosition + a2);
        return arrayList2;
    }

    public byte[] createByteArray(int i, byte[] bArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        byte[] createByteArray = this.e.createByteArray();
        this.e.setDataPosition(dataPosition + a2);
        return createByteArray;
    }

    public byte[][] createByteArrayArray(int i, byte[][] bArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        byte[][] bArr2 = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr2[i2] = this.e.createByteArray();
        }
        this.e.setDataPosition(dataPosition + a2);
        return bArr2;
    }

    public SparseArray<byte[]> createByteArraySparseArray(int i, SparseArray<byte[]> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        SparseArray<byte[]> sparseArray2 = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.e.readInt(), this.e.createByteArray());
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public char[] createCharArray(int i, char[] cArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return cArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        char[] createCharArray = this.e.createCharArray();
        this.e.setDataPosition(dataPosition + a2);
        return createCharArray;
    }

    public double[] createDoubleArray(int i, double[] dArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return dArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        double[] createDoubleArray = this.e.createDoubleArray();
        this.e.setDataPosition(dataPosition + a2);
        return createDoubleArray;
    }

    public ArrayList<Double> createDoubleList(int i, ArrayList<Double> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Double.valueOf(this.e.readDouble()));
        }
        this.e.setDataPosition(dataPosition + a2);
        return arrayList2;
    }

    public SparseArray<Double> createDoubleSparseArray(int i, SparseArray<Double> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        SparseArray<Double> sparseArray2 = new SparseArray<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.e.readInt(), Double.valueOf(this.e.readDouble()));
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public float[] createFloatArray(int i, float[] fArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return fArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        float[] createFloatArray = this.e.createFloatArray();
        this.e.setDataPosition(dataPosition + a2);
        return createFloatArray;
    }

    public ArrayList<Float> createFloatList(int i, ArrayList<Float> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Float.valueOf(this.e.readFloat()));
        }
        this.e.setDataPosition(dataPosition + a2);
        return arrayList2;
    }

    public SparseArray<Float> createFloatSparseArray(int i, SparseArray<Float> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        SparseArray<Float> sparseArray2 = new SparseArray<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.e.readInt(), Float.valueOf(this.e.readFloat()));
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public IBinder[] createIBinderArray(int i, IBinder[] iBinderArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return iBinderArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        IBinder[] createBinderArray = this.e.createBinderArray();
        this.e.setDataPosition(dataPosition + a2);
        return createBinderArray;
    }

    public ArrayList<IBinder> createIBinderList(int i, ArrayList<IBinder> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<IBinder> createBinderArrayList = this.e.createBinderArrayList();
        this.e.setDataPosition(dataPosition + a2);
        return createBinderArrayList;
    }

    public SparseArray<IBinder> createIBinderSparseArray(int i, SparseArray<IBinder> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        SparseArray<IBinder> sparseArray2 = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.e.readInt(), this.e.readStrongBinder());
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public int[] createIntArray(int i, int[] iArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return iArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int[] createIntArray = this.e.createIntArray();
        this.e.setDataPosition(dataPosition + a2);
        return createIntArray;
    }

    public ArrayList<Integer> createIntegerList(int i, ArrayList<Integer> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Integer.valueOf(this.e.readInt()));
        }
        this.e.setDataPosition(dataPosition + a2);
        return arrayList2;
    }

    public long[] createLongArray(int i, long[] jArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return jArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        long[] createLongArray = this.e.createLongArray();
        this.e.setDataPosition(dataPosition + a2);
        return createLongArray;
    }

    public ArrayList<Long> createLongList(int i, ArrayList<Long> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList2.add(Long.valueOf(this.e.readLong()));
        }
        this.e.setDataPosition(dataPosition + a2);
        return arrayList2;
    }

    public Parcel createParcel(int i, Parcel parcel) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return parcel;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(this.e, dataPosition, a2);
        this.e.setDataPosition(dataPosition + a2);
        return obtain;
    }

    public Parcel[] createParcelArray(int i, Parcel[] parcelArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return parcelArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        Parcel[] parcelArr2 = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = this.e.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = this.e.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(this.e, dataPosition2, readInt2);
                parcelArr2[i2] = obtain;
                this.e.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr2[i2] = null;
            }
        }
        this.e.setDataPosition(dataPosition + a2);
        return parcelArr2;
    }

    public ArrayList<Parcel> createParcelList(int i, ArrayList<Parcel> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        ArrayList<Parcel> arrayList2 = new ArrayList<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = this.e.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = this.e.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(this.e, dataPosition2, readInt2);
                arrayList2.add(obtain);
                this.e.setDataPosition(dataPosition2 + readInt2);
            } else {
                arrayList2.add(null);
            }
        }
        this.e.setDataPosition(dataPosition + a2);
        return arrayList2;
    }

    public SparseArray<Parcel> createParcelSparseArray(int i, SparseArray<Parcel> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        SparseArray<Parcel> sparseArray2 = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = this.e.readInt();
            int readInt3 = this.e.readInt();
            if (readInt3 != 0) {
                int dataPosition2 = this.e.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(this.e, dataPosition2, readInt3);
                sparseArray2.append(readInt2, obtain);
                this.e.setDataPosition(dataPosition2 + readInt3);
            } else {
                sparseArray2.append(readInt2, null);
            }
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public SparseBooleanArray createSparseBooleanArray(int i, SparseBooleanArray sparseBooleanArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseBooleanArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        SparseBooleanArray readSparseBooleanArray = this.e.readSparseBooleanArray();
        this.e.setDataPosition(dataPosition + a2);
        return readSparseBooleanArray;
    }

    public SparseIntArray createSparseIntArray(int i, SparseIntArray sparseIntArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseIntArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseIntArray2.append(this.e.readInt(), this.e.readInt());
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseIntArray2;
    }

    public SparseLongArray createSparseLongArray(int i, SparseLongArray sparseLongArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseLongArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        SparseLongArray sparseLongArray2 = new SparseLongArray();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseLongArray2.append(this.e.readInt(), this.e.readLong());
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseLongArray2;
    }

    public String createString(int i, String str) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return str;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        String readString = this.e.readString();
        this.e.setDataPosition(dataPosition + a2);
        return readString;
    }

    public String[] createStringArray(int i, String[] strArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return strArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        String[] createStringArray = this.e.createStringArray();
        this.e.setDataPosition(dataPosition + a2);
        return createStringArray;
    }

    public ArrayList<String> createStringList(int i, ArrayList<String> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<String> createStringArrayList = this.e.createStringArrayList();
        this.e.setDataPosition(dataPosition + a2);
        return createStringArrayList;
    }

    public SparseArray<String> createStringSparseArray(int i, SparseArray<String> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        int readInt = this.e.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.e.readInt(), this.e.readString());
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public <T> T[] createTypedArray(int i, Parcelable.Creator<T> creator, T[] tArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return tArr;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        Object[] createTypedArray = this.e.createTypedArray(creator);
        this.e.setDataPosition(dataPosition + a2);
        return (T[]) createTypedArray;
    }

    public <T> ArrayList<T> createTypedList(int i, Parcelable.Creator<T> creator, ArrayList<T> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return arrayList;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        ArrayList<T> createTypedArrayList = this.e.createTypedArrayList(creator);
        this.e.setDataPosition(dataPosition + a2);
        return createTypedArrayList;
    }

    public <T> SparseArray<T> createTypedSparseArray(int i, Parcelable.Creator<T> creator, SparseArray<T> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return sparseArray;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        int readInt = this.e.readInt();
        SparseArray<T> sparseArray2 = new SparseArray<>();
        for (int i2 = 0; i2 < readInt; i2++) {
            sparseArray2.append(this.e.readInt(), this.e.readInt() != 0 ? creator.createFromParcel(this.e) : null);
        }
        this.e.setDataPosition(dataPosition + a2);
        return sparseArray2;
    }

    public boolean readBoolean(int i, boolean z) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return z;
        }
        b(i, 4);
        return this.e.readInt() != 0;
    }

    public Boolean readBooleanObject(int i, Boolean bool) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bool;
        }
        if (a(i) == 0) {
            return null;
        }
        a(i, 4);
        int readInt = this.e.readInt();
        if (readInt == 0) {
            return Boolean.FALSE;
        }
        if (readInt != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public Bundle readBundle(int i, Bundle bundle) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return bundle;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        Bundle readBundle = this.e.readBundle();
        this.e.setDataPosition(dataPosition + a2);
        return readBundle;
    }

    public byte readByte(int i, byte b2) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return b2;
        }
        b(i, 4);
        return (byte) this.e.readInt();
    }

    public char readChar(int i, char c2) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return c2;
        }
        b(i, 4);
        return (char) this.e.readInt();
    }

    public double readDouble(int i, double d2) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return d2;
        }
        b(i, 8);
        return this.e.readDouble();
    }

    public Double readDoubleObject(int i, Double d2) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return d2;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        a(a2, 8);
        return Double.valueOf(this.e.readDouble());
    }

    public float readFloat(int i, float f) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return f;
        }
        b(i, 4);
        return this.e.readFloat();
    }

    public Float readFloatObject(int i, Float f) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return f;
        }
        if (a(i) == 0) {
            return null;
        }
        a(i, 4);
        return Float.valueOf(this.e.readFloat());
    }

    public IBinder readIBinder(int i, IBinder iBinder) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return iBinder;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        IBinder readStrongBinder = this.e.readStrongBinder();
        this.e.setDataPosition(dataPosition + a2);
        return readStrongBinder;
    }

    public int readInt(int i, int i2) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return i2;
        }
        b(i, 4);
        return this.e.readInt();
    }

    public Integer readIntegerObject(int i, Integer num) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return num;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        a(a2, 4);
        return Integer.valueOf(this.e.readInt());
    }

    public void readList(int i, List list, ClassLoader classLoader) {
        if (this.f10312a.containsKey(Integer.valueOf(i))) {
            int a2 = a(i);
            int dataPosition = this.e.dataPosition();
            if (a2 != 0) {
                this.e.readList(list, classLoader);
                this.e.setDataPosition(dataPosition + a2);
            }
        }
    }

    public long readLong(int i, long j) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return j;
        }
        b(i, 8);
        return this.e.readLong();
    }

    public Long readLongObject(int i, Long l) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return l;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        a(a2, 8);
        return Long.valueOf(this.e.readLong());
    }

    public <T extends Parcelable> T readParcelable(int i, Parcelable.Creator<T> creator, T t) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return t;
        }
        int a2 = a(i);
        if (a2 == 0) {
            return null;
        }
        int dataPosition = this.e.dataPosition();
        T createFromParcel = creator.createFromParcel(this.e);
        this.e.setDataPosition(dataPosition + a2);
        return createFromParcel;
    }

    public short readShort(int i, short s) {
        if (!this.f10312a.containsKey(Integer.valueOf(i))) {
            return s;
        }
        b(i, 4);
        return (short) this.e.readInt();
    }
}
