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

/* JADX INFO: loaded from: classes11.dex */
public class ParcelReader {
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 65262;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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

    private int a(int r3) {
        Integer[] numArr = this.f10312a.get(Integer.valueOf(r3));
        if (numArr == null) {
            throw new ParseException("Field is null:".concat(String.valueOf(numArr)), this.e);
        }
        this.e.setDataPosition(numArr[0].intValue());
        return numArr[1].intValue();
    }

    private void a() {
        int r0 = this.e.readInt();
        int r2 = r0 & 65535;
        int r1 = (r0 & SupportMenu.CATEGORY_MASK) != -65536 ? (r0 >> 16) & 65535 : this.e.readInt();
        if (r2 != d) {
            throw new ParseException("Parse header error, not 65262. Got 0x".concat(String.valueOf(Integer.toHexString(r2))), this.e);
        }
        int r3 = this.e.dataPosition();
        int r4 = r1 + r3;
        if (r4 < r3 || r4 > this.e.dataSize()) {
            throw new ParseException("invalid size, start=" + r3 + " end=" + r4, this.e);
        }
        while (this.e.dataPosition() < r4) {
            int r5 = this.e.readInt();
            int r6 = r5 & 65535;
            int r7 = (r5 & SupportMenu.CATEGORY_MASK) != -65536 ? (r5 >> 16) & 65535 : this.e.readInt();
            int r8 = this.e.dataPosition();
            this.f10312a.put(Integer.valueOf(r6), new Integer[]{Integer.valueOf(r8), Integer.valueOf(r7)});
            this.e.setDataPosition(r8 + r7);
        }
        if (this.e.dataPosition() != r4) {
            throw new ParseException("the dataPosition is not".concat(String.valueOf(r4)), this.e);
        }
    }

    private void a(int r5, int r6) {
        Integer[] numArr = this.f10312a.get(Integer.valueOf(r5));
        if (numArr == null) {
            throw new ParseException("Field is null:".concat(String.valueOf(numArr)), this.e);
        }
        int r7 = numArr[1].intValue();
        if (r7 == r6) {
            return;
        }
        throw new ParseException("the field size is not " + r6 + " got " + r7 + " (0x" + Integer.toHexString(r7) + Separators.RPAREN, this.e);
    }

    private int b(int r4, int r5) {
        Integer[] numArr = this.f10312a.get(Integer.valueOf(r4));
        if (numArr == null) {
            throw new ParseException("Field is null:".concat(String.valueOf(numArr)), this.e);
        }
        this.e.setDataPosition(numArr[0].intValue());
        a(r4, r5);
        return r5;
    }

    public BigDecimal createBigDecimal(int r4, BigDecimal bigDecimal) {
        if (!this.f10312a.containsKey(Integer.valueOf(r4))) {
            return bigDecimal;
        }
        int r5 = a(r4);
        if (r5 == 0) {
            return null;
        }
        int r6 = this.e.dataPosition();
        byte[] bArrCreateByteArray = this.e.createByteArray();
        int r1 = this.e.readInt();
        this.e.setDataPosition(r6 + r5);
        return new BigDecimal(new BigInteger(bArrCreateByteArray), r1);
    }

    public BigDecimal[] createBigDecimalArray(int r8, BigDecimal[] bigDecimalArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r8))) {
            return bigDecimalArr;
        }
        int r9 = a(r8);
        if (r9 == 0) {
            return null;
        }
        int r10 = this.e.dataPosition();
        int r0 = this.e.readInt();
        BigDecimal[] bigDecimalArr2 = new BigDecimal[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            byte[] bArrCreateByteArray = this.e.createByteArray();
            bigDecimalArr2[r2] = new BigDecimal(new BigInteger(bArrCreateByteArray), this.e.readInt());
        }
        this.e.setDataPosition(r10 + r9);
        return bigDecimalArr2;
    }

    public BigInteger createBigInteger(int r3, BigInteger bigInteger) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return bigInteger;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        byte[] bArrCreateByteArray = this.e.createByteArray();
        this.e.setDataPosition(r5 + r4);
        return new BigInteger(bArrCreateByteArray);
    }

    public BigInteger[] createBigIntegerArray(int r6, BigInteger[] bigIntegerArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return bigIntegerArr;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        int r0 = this.e.readInt();
        BigInteger[] bigIntegerArr2 = new BigInteger[r0];
        for (int r2 = 0; r2 < r0; r2++) {
            bigIntegerArr2[r2] = new BigInteger(this.e.createByteArray());
        }
        this.e.setDataPosition(r8 + r7);
        return bigIntegerArr2;
    }

    public boolean[] createBooleanArray(int r3, boolean[] zArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return zArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        boolean[] zArrCreateBooleanArray = this.e.createBooleanArray();
        this.e.setDataPosition(r5 + r4);
        return zArrCreateBooleanArray;
    }

    public ArrayList<Boolean> createBooleanList(int r6, ArrayList<Boolean> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return arrayList;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        ArrayList<Boolean> arrayList2 = new ArrayList<>();
        int r1 = this.e.readInt();
        for (int r3 = 0; r3 < r1; r3++) {
            arrayList2.add(Boolean.valueOf(this.e.readInt() != 0));
        }
        this.e.setDataPosition(r8 + r7);
        return arrayList2;
    }

    public byte[] createByteArray(int r3, byte[] bArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return bArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        byte[] bArrCreateByteArray = this.e.createByteArray();
        this.e.setDataPosition(r5 + r4);
        return bArrCreateByteArray;
    }

    public byte[][] createByteArrayArray(int r5, byte[][] bArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r5))) {
            return bArr;
        }
        int r6 = a(r5);
        if (r6 == 0) {
            return null;
        }
        int r7 = this.e.dataPosition();
        int r0 = this.e.readInt();
        byte[][] bArr2 = new byte[r0][];
        for (int r2 = 0; r2 < r0; r2++) {
            bArr2[r2] = this.e.createByteArray();
        }
        this.e.setDataPosition(r7 + r6);
        return bArr2;
    }

    public SparseArray<byte[]> createByteArraySparseArray(int r6, SparseArray<byte[]> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return sparseArray;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        int r0 = this.e.readInt();
        SparseArray<byte[]> sparseArray2 = new SparseArray<>(r0);
        for (int r2 = 0; r2 < r0; r2++) {
            sparseArray2.append(this.e.readInt(), this.e.createByteArray());
        }
        this.e.setDataPosition(r8 + r7);
        return sparseArray2;
    }

    public char[] createCharArray(int r3, char[] cArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return cArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        char[] cArrCreateCharArray = this.e.createCharArray();
        this.e.setDataPosition(r5 + r4);
        return cArrCreateCharArray;
    }

    public double[] createDoubleArray(int r3, double[] dArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return dArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        double[] dArrCreateDoubleArray = this.e.createDoubleArray();
        this.e.setDataPosition(r5 + r4);
        return dArrCreateDoubleArray;
    }

    public ArrayList<Double> createDoubleList(int r6, ArrayList<Double> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return arrayList;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        ArrayList<Double> arrayList2 = new ArrayList<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            arrayList2.add(Double.valueOf(this.e.readDouble()));
        }
        this.e.setDataPosition(r8 + r7);
        return arrayList2;
    }

    public SparseArray<Double> createDoubleSparseArray(int r7, SparseArray<Double> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r7))) {
            return sparseArray;
        }
        int r8 = a(r7);
        if (r8 == 0) {
            return null;
        }
        int r9 = this.e.dataPosition();
        SparseArray<Double> sparseArray2 = new SparseArray<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            sparseArray2.append(this.e.readInt(), Double.valueOf(this.e.readDouble()));
        }
        this.e.setDataPosition(r9 + r8);
        return sparseArray2;
    }

    public float[] createFloatArray(int r3, float[] fArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return fArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        float[] fArrCreateFloatArray = this.e.createFloatArray();
        this.e.setDataPosition(r5 + r4);
        return fArrCreateFloatArray;
    }

    public ArrayList<Float> createFloatList(int r5, ArrayList<Float> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r5))) {
            return arrayList;
        }
        int r6 = a(r5);
        if (r6 == 0) {
            return null;
        }
        int r7 = this.e.dataPosition();
        ArrayList<Float> arrayList2 = new ArrayList<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            arrayList2.add(Float.valueOf(this.e.readFloat()));
        }
        this.e.setDataPosition(r7 + r6);
        return arrayList2;
    }

    public SparseArray<Float> createFloatSparseArray(int r6, SparseArray<Float> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return sparseArray;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        SparseArray<Float> sparseArray2 = new SparseArray<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            sparseArray2.append(this.e.readInt(), Float.valueOf(this.e.readFloat()));
        }
        this.e.setDataPosition(r8 + r7);
        return sparseArray2;
    }

    public IBinder[] createIBinderArray(int r3, IBinder[] iBinderArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return iBinderArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        IBinder[] iBinderArrCreateBinderArray = this.e.createBinderArray();
        this.e.setDataPosition(r5 + r4);
        return iBinderArrCreateBinderArray;
    }

    public ArrayList<IBinder> createIBinderList(int r3, ArrayList<IBinder> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return arrayList;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        ArrayList<IBinder> arrayListCreateBinderArrayList = this.e.createBinderArrayList();
        this.e.setDataPosition(r5 + r4);
        return arrayListCreateBinderArrayList;
    }

    public SparseArray<IBinder> createIBinderSparseArray(int r6, SparseArray<IBinder> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return sparseArray;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        int r0 = this.e.readInt();
        SparseArray<IBinder> sparseArray2 = new SparseArray<>(r0);
        for (int r2 = 0; r2 < r0; r2++) {
            sparseArray2.append(this.e.readInt(), this.e.readStrongBinder());
        }
        this.e.setDataPosition(r8 + r7);
        return sparseArray2;
    }

    public int[] createIntArray(int r3, int[] r4) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return r4;
        }
        int r5 = a(r3);
        if (r5 == 0) {
            return null;
        }
        int r6 = this.e.dataPosition();
        int[] r0 = this.e.createIntArray();
        this.e.setDataPosition(r6 + r5);
        return r0;
    }

    public ArrayList<Integer> createIntegerList(int r5, ArrayList<Integer> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r5))) {
            return arrayList;
        }
        int r6 = a(r5);
        if (r6 == 0) {
            return null;
        }
        int r7 = this.e.dataPosition();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            arrayList2.add(Integer.valueOf(this.e.readInt()));
        }
        this.e.setDataPosition(r7 + r6);
        return arrayList2;
    }

    public long[] createLongArray(int r3, long[] jArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return jArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        long[] jArrCreateLongArray = this.e.createLongArray();
        this.e.setDataPosition(r5 + r4);
        return jArrCreateLongArray;
    }

    public ArrayList<Long> createLongList(int r6, ArrayList<Long> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return arrayList;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        ArrayList<Long> arrayList2 = new ArrayList<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            arrayList2.add(Long.valueOf(this.e.readLong()));
        }
        this.e.setDataPosition(r8 + r7);
        return arrayList2;
    }

    public Parcel createParcel(int r3, Parcel parcel) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return parcel;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.appendFrom(this.e, r5, r4);
        this.e.setDataPosition(r5 + r4);
        return parcelObtain;
    }

    public Parcel[] createParcelArray(int r9, Parcel[] parcelArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r9))) {
            return parcelArr;
        }
        int r10 = a(r9);
        if (r10 == 0) {
            return null;
        }
        int r0 = this.e.dataPosition();
        int r1 = this.e.readInt();
        Parcel[] parcelArr2 = new Parcel[r1];
        for (int r3 = 0; r3 < r1; r3++) {
            int r4 = this.e.readInt();
            if (r4 != 0) {
                int r5 = this.e.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.e, r5, r4);
                parcelArr2[r3] = parcelObtain;
                this.e.setDataPosition(r5 + r4);
            } else {
                parcelArr2[r3] = null;
            }
        }
        this.e.setDataPosition(r0 + r10);
        return parcelArr2;
    }

    public ArrayList<Parcel> createParcelList(int r9, ArrayList<Parcel> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r9))) {
            return arrayList;
        }
        int r10 = a(r9);
        if (r10 == 0) {
            return null;
        }
        int r0 = this.e.dataPosition();
        int r1 = this.e.readInt();
        ArrayList<Parcel> arrayList2 = new ArrayList<>();
        for (int r3 = 0; r3 < r1; r3++) {
            int r4 = this.e.readInt();
            if (r4 != 0) {
                int r5 = this.e.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.e, r5, r4);
                arrayList2.add(parcelObtain);
                this.e.setDataPosition(r5 + r4);
            } else {
                arrayList2.add(null);
            }
        }
        this.e.setDataPosition(r0 + r10);
        return arrayList2;
    }

    public SparseArray<Parcel> createParcelSparseArray(int r10, SparseArray<Parcel> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r10))) {
            return sparseArray;
        }
        int r11 = a(r10);
        if (r11 == 0) {
            return null;
        }
        int r0 = this.e.dataPosition();
        int r1 = this.e.readInt();
        SparseArray<Parcel> sparseArray2 = new SparseArray<>();
        for (int r3 = 0; r3 < r1; r3++) {
            int r4 = this.e.readInt();
            int r5 = this.e.readInt();
            if (r5 != 0) {
                int r6 = this.e.dataPosition();
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.appendFrom(this.e, r6, r5);
                sparseArray2.append(r4, parcelObtain);
                this.e.setDataPosition(r6 + r5);
            } else {
                sparseArray2.append(r4, null);
            }
        }
        this.e.setDataPosition(r0 + r11);
        return sparseArray2;
    }

    public SparseBooleanArray createSparseBooleanArray(int r3, SparseBooleanArray sparseBooleanArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return sparseBooleanArray;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        SparseBooleanArray sparseBooleanArray2 = this.e.readSparseBooleanArray();
        this.e.setDataPosition(r5 + r4);
        return sparseBooleanArray2;
    }

    public SparseIntArray createSparseIntArray(int r6, SparseIntArray sparseIntArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return sparseIntArray;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            sparseIntArray2.append(this.e.readInt(), this.e.readInt());
        }
        this.e.setDataPosition(r8 + r7);
        return sparseIntArray2;
    }

    public SparseLongArray createSparseLongArray(int r7, SparseLongArray sparseLongArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r7))) {
            return sparseLongArray;
        }
        int r8 = a(r7);
        if (r8 == 0) {
            return null;
        }
        int r9 = this.e.dataPosition();
        SparseLongArray sparseLongArray2 = new SparseLongArray();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            sparseLongArray2.append(this.e.readInt(), this.e.readLong());
        }
        this.e.setDataPosition(r9 + r8);
        return sparseLongArray2;
    }

    public String createString(int r3, String str) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return str;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        String string = this.e.readString();
        this.e.setDataPosition(r5 + r4);
        return string;
    }

    public String[] createStringArray(int r3, String[] strArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return strArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        String[] strArrCreateStringArray = this.e.createStringArray();
        this.e.setDataPosition(r5 + r4);
        return strArrCreateStringArray;
    }

    public ArrayList<String> createStringList(int r3, ArrayList<String> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return arrayList;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        ArrayList<String> arrayListCreateStringArrayList = this.e.createStringArrayList();
        this.e.setDataPosition(r5 + r4);
        return arrayListCreateStringArrayList;
    }

    public SparseArray<String> createStringSparseArray(int r6, SparseArray<String> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r6))) {
            return sparseArray;
        }
        int r7 = a(r6);
        if (r7 == 0) {
            return null;
        }
        int r8 = this.e.dataPosition();
        SparseArray<String> sparseArray2 = new SparseArray<>();
        int r1 = this.e.readInt();
        for (int r2 = 0; r2 < r1; r2++) {
            sparseArray2.append(this.e.readInt(), this.e.readString());
        }
        this.e.setDataPosition(r8 + r7);
        return sparseArray2;
    }

    public <T> T[] createTypedArray(int r3, Parcelable.Creator<T> creator, T[] tArr) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return tArr;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        Object[] objArrCreateTypedArray = this.e.createTypedArray(creator);
        this.e.setDataPosition(r5 + r4);
        return (T[]) objArrCreateTypedArray;
    }

    public <T> ArrayList<T> createTypedList(int r3, Parcelable.Creator<T> creator, ArrayList<T> arrayList) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return arrayList;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        ArrayList<T> arrayListCreateTypedArrayList = this.e.createTypedArrayList(creator);
        this.e.setDataPosition(r5 + r4);
        return arrayListCreateTypedArrayList;
    }

    public <T> SparseArray<T> createTypedSparseArray(int r7, Parcelable.Creator<T> creator, SparseArray<T> sparseArray) {
        if (!this.f10312a.containsKey(Integer.valueOf(r7))) {
            return sparseArray;
        }
        int r8 = a(r7);
        if (r8 == 0) {
            return null;
        }
        int r0 = this.e.dataPosition();
        int r1 = this.e.readInt();
        SparseArray<T> sparseArray2 = new SparseArray<>();
        for (int r3 = 0; r3 < r1; r3++) {
            sparseArray2.append(this.e.readInt(), this.e.readInt() != 0 ? creator.createFromParcel(this.e) : null);
        }
        this.e.setDataPosition(r0 + r8);
        return sparseArray2;
    }

    public boolean readBoolean(int r3, boolean z) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return z;
        }
        b(r3, 4);
        return this.e.readInt() != 0;
    }

    public Boolean readBooleanObject(int r3, Boolean bool) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return bool;
        }
        if (a(r3) == 0) {
            return null;
        }
        a(r3, 4);
        int r4 = this.e.readInt();
        if (r4 == 0) {
            return Boolean.FALSE;
        }
        if (r4 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    public Bundle readBundle(int r3, Bundle bundle) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return bundle;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        Bundle bundle2 = this.e.readBundle();
        this.e.setDataPosition(r5 + r4);
        return bundle2;
    }

    public byte readByte(int r3, byte b2) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return b2;
        }
        b(r3, 4);
        return (byte) this.e.readInt();
    }

    public char readChar(int r3, char c2) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return c2;
        }
        b(r3, 4);
        return (char) this.e.readInt();
    }

    public double readDouble(int r3, double d2) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return d2;
        }
        b(r3, 8);
        return this.e.readDouble();
    }

    public Double readDoubleObject(int r3, Double d2) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return d2;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        a(r4, 8);
        return Double.valueOf(this.e.readDouble());
    }

    public float readFloat(int r3, float f) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return f;
        }
        b(r3, 4);
        return this.e.readFloat();
    }

    public Float readFloatObject(int r3, Float f) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return f;
        }
        if (a(r3) == 0) {
            return null;
        }
        a(r3, 4);
        return Float.valueOf(this.e.readFloat());
    }

    public IBinder readIBinder(int r3, IBinder iBinder) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return iBinder;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        IBinder strongBinder = this.e.readStrongBinder();
        this.e.setDataPosition(r5 + r4);
        return strongBinder;
    }

    public int readInt(int r3, int r4) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return r4;
        }
        b(r3, 4);
        return this.e.readInt();
    }

    public Integer readIntegerObject(int r3, Integer num) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return num;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        a(r4, 4);
        return Integer.valueOf(this.e.readInt());
    }

    public void readList(int r3, List list, ClassLoader classLoader) {
        if (this.f10312a.containsKey(Integer.valueOf(r3))) {
            int r4 = a(r3);
            int r0 = this.e.dataPosition();
            if (r4 != 0) {
                this.e.readList(list, classLoader);
                this.e.setDataPosition(r0 + r4);
            }
        }
    }

    public long readLong(int r3, long j) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return j;
        }
        b(r3, 8);
        return this.e.readLong();
    }

    public Long readLongObject(int r3, Long l) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return l;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        a(r4, 8);
        return Long.valueOf(this.e.readLong());
    }

    public <T extends Parcelable> T readParcelable(int r3, Parcelable.Creator<T> creator, T t) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return t;
        }
        int r4 = a(r3);
        if (r4 == 0) {
            return null;
        }
        int r5 = this.e.dataPosition();
        T tCreateFromParcel = creator.createFromParcel(this.e);
        this.e.setDataPosition(r5 + r4);
        return tCreateFromParcel;
    }

    public short readShort(int r3, short s) {
        if (!this.f10312a.containsKey(Integer.valueOf(r3))) {
            return s;
        }
        b(r3, 4);
        return (short) this.e.readInt();
    }
}
