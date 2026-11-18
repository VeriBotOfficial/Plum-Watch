package com.huawei.hms.common.parcel;

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
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ParcelWrite {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f10314a = 65262;
    private Parcel b;

    public ParcelWrite(Parcel parcel) {
        this.b = parcel;
    }

    private int a(int r3) {
        this.b.writeInt(r3 | SupportMenu.CATEGORY_MASK);
        this.b.writeInt(0);
        return this.b.dataPosition();
    }

    private void a(int r3, int r4) {
        if (r4 < 65535) {
            this.b.writeInt(r3 | (r4 << 16));
        } else {
            this.b.writeInt(r3 | SupportMenu.CATEGORY_MASK);
            this.b.writeInt(r4);
        }
    }

    private <T extends Parcelable> void a(T t, int r5) {
        int r0 = this.b.dataPosition();
        this.b.writeInt(1);
        int r1 = this.b.dataPosition();
        t.writeToParcel(this.b, r5);
        int r4 = this.b.dataPosition();
        this.b.setDataPosition(r0);
        this.b.writeInt(r4 - r1);
        this.b.setDataPosition(r4);
    }

    private void b(int r4) {
        int r0 = this.b.dataPosition();
        this.b.setDataPosition(r4 - 4);
        this.b.writeInt(r0 - r4);
        this.b.setDataPosition(r0);
    }

    public int beginObjectHeader() {
        return a(f10314a);
    }

    public void finishObjectHeader(int r1) {
        b(r1);
    }

    public void writeBigDecimal(int r2, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                a(r2, 0);
            }
        } else {
            int r3 = a(r2);
            this.b.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            this.b.writeInt(bigDecimal.scale());
            b(r3);
        }
    }

    public void writeBigDecimalArray(int r4, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int length = bigDecimalArr.length;
        this.b.writeInt(length);
        for (int r0 = 0; r0 < length; r0++) {
            this.b.writeByteArray(bigDecimalArr[r0].unscaledValue().toByteArray());
            this.b.writeInt(bigDecimalArr[r0].scale());
        }
        b(r5);
    }

    public void writeBigInteger(int r1, BigInteger bigInteger, boolean z) {
        if (bigInteger == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeByteArray(bigInteger.toByteArray());
            b(r2);
        }
    }

    public void writeBigIntegerArray(int r4, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        this.b.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            this.b.writeByteArray(bigInteger.toByteArray());
        }
        b(r5);
    }

    public void writeBoolean(int r2, boolean z) {
        a(r2, 4);
        this.b.writeInt(z ? 1 : 0);
    }

    public void writeBooleanArray(int r1, boolean[] zArr, boolean z) {
        if (zArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeBooleanArray(zArr);
            b(r2);
        }
    }

    public void writeBooleanList(int r4, List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = list.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(list.get(r0).booleanValue() ? 1 : 0);
        }
        b(r5);
    }

    public void writeBooleanObject(int r2, Boolean bool) {
        writeBooleanObject(r2, bool, false);
    }

    public void writeBooleanObject(int r1, Boolean bool, boolean z) {
        if (bool != null) {
            a(r1, 4);
            this.b.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            a(r1, 0);
        }
    }

    public void writeBundle(int r1, Bundle bundle, boolean z) {
        if (bundle == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeBundle(bundle);
            b(r2);
        }
    }

    public void writeByte(int r2, byte b) {
        a(r2, 4);
        this.b.writeInt(b);
    }

    public void writeByteArray(int r1, byte[] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeByteArray(bArr);
            b(r2);
        }
    }

    public void writeByteArrayArray(int r4, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        this.b.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            this.b.writeByteArray(bArr2);
        }
        b(r5);
    }

    public void writeByteArraySparseArray(int r4, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseArray.keyAt(r0));
            this.b.writeByteArray(sparseArray.valueAt(r0));
        }
        b(r5);
    }

    public void writeChar(int r2, char c) {
        a(r2, 4);
        this.b.writeInt(c);
    }

    public void writeCharArray(int r1, char[] cArr, boolean z) {
        if (cArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeCharArray(cArr);
            b(r2);
        }
    }

    public void writeDouble(int r2, double d) {
        a(r2, 8);
        this.b.writeDouble(d);
    }

    public void writeDoubleArray(int r1, double[] dArr, boolean z) {
        if (dArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeDoubleArray(dArr);
            b(r2);
        }
    }

    public void writeDoubleList(int r5, List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r5, 0);
                return;
            }
            return;
        }
        int r6 = a(r5);
        int size = list.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeDouble(list.get(r0).doubleValue());
        }
        b(r6);
    }

    public void writeDoubleObject(int r1, Double d, boolean z) {
        if (d != null) {
            a(r1, 8);
            this.b.writeDouble(d.doubleValue());
        } else if (z) {
            a(r1, 0);
        }
    }

    public void writeDoubleSparseArray(int r5, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r5, 0);
                return;
            }
            return;
        }
        int r6 = a(r5);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseArray.keyAt(r0));
            this.b.writeDouble(sparseArray.valueAt(r0).doubleValue());
        }
        b(r6);
    }

    public void writeFloat(int r2, float f) {
        a(r2, 4);
        this.b.writeFloat(f);
    }

    public void writeFloatArray(int r1, float[] fArr, boolean z) {
        if (fArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeFloatArray(fArr);
            b(r2);
        }
    }

    public void writeFloatList(int r4, List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = list.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeFloat(list.get(r0).floatValue());
        }
        b(r5);
    }

    public void writeFloatObject(int r1, Float f, boolean z) {
        if (f != null) {
            a(r1, 4);
            this.b.writeFloat(f.floatValue());
        } else if (z) {
            a(r1, 0);
        }
    }

    public void writeFloatSparseArray(int r4, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseArray.keyAt(r0));
            this.b.writeFloat(sparseArray.valueAt(r0).floatValue());
        }
        b(r5);
    }

    public void writeIBinder(int r1, IBinder iBinder, boolean z) {
        if (iBinder == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeStrongBinder(iBinder);
            b(r2);
        }
    }

    public void writeIBinderArray(int r1, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeBinderArray(iBinderArr);
            b(r2);
        }
    }

    public void writeIBinderList(int r1, List<IBinder> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeBinderList(list);
            b(r2);
        }
    }

    public void writeIBinderSparseArray(int r4, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseArray.keyAt(r0));
            this.b.writeStrongBinder(sparseArray.valueAt(r0));
        }
        b(r5);
    }

    public void writeInt(int r2, int r3) {
        a(r2, 4);
        this.b.writeInt(r3);
    }

    public void writeIntArray(int r1, int[] r2, boolean z) {
        if (r2 == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r3 = a(r1);
            this.b.writeIntArray(r2);
            b(r3);
        }
    }

    public void writeIntegerList(int r4, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = list.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(list.get(r0).intValue());
        }
        b(r5);
    }

    public void writeIntegerObject(int r1, Integer num, boolean z) {
        if (num != null) {
            a(r1, 4);
            this.b.writeInt(num.intValue());
        } else if (z) {
            a(r1, 0);
        }
    }

    public void writeList(int r1, List list, boolean z) {
        if (list == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeList(list);
            b(r2);
        }
    }

    public void writeLong(int r2, long j) {
        a(r2, 8);
        this.b.writeLong(j);
    }

    public void writeLongArray(int r1, long[] jArr, boolean z) {
        if (jArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeLongArray(jArr);
            b(r2);
        }
    }

    public void writeLongList(int r5, List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r5, 0);
                return;
            }
            return;
        }
        int r6 = a(r5);
        int size = list.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeLong(list.get(r0).longValue());
        }
        b(r6);
    }

    public void writeLongObject(int r1, Long l, boolean z) {
        if (l != null) {
            a(r1, 8);
            this.b.writeLong(l.longValue());
        } else if (z) {
            a(r1, 0);
        }
    }

    public void writeParcel(int r3, Parcel parcel, boolean z) {
        if (parcel == null) {
            if (z) {
                a(r3, 0);
            }
        } else {
            int r4 = a(r3);
            this.b.appendFrom(parcel, 0, parcel.dataSize());
            b(r4);
        }
    }

    public void writeParcelArray(int r6, Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                a(r6, 0);
                return;
            }
            return;
        }
        int r7 = a(r6);
        this.b.writeInt(parcelArr.length);
        for (Parcel parcel : parcelArr) {
            if (parcel != null) {
                this.b.writeInt(parcel.dataSize());
                this.b.appendFrom(parcel, 0, parcel.dataSize());
            } else {
                this.b.writeInt(0);
            }
        }
        b(r7);
    }

    public void writeParcelList(int r6, List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r6, 0);
                return;
            }
            return;
        }
        int r7 = a(r6);
        int size = list.size();
        this.b.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            Parcel parcel = list.get(r1);
            if (parcel != null) {
                this.b.writeInt(parcel.dataSize());
                this.b.appendFrom(parcel, 0, parcel.dataSize());
            } else {
                this.b.writeInt(0);
            }
        }
        b(r7);
    }

    public void writeParcelSparseArray(int r6, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r6, 0);
                return;
            }
            return;
        }
        int r7 = a(r6);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            this.b.writeInt(sparseArray.keyAt(r1));
            Parcel parcelValueAt = sparseArray.valueAt(r1);
            if (parcelValueAt != null) {
                this.b.writeInt(parcelValueAt.dataSize());
                this.b.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            } else {
                this.b.writeInt(0);
            }
        }
        b(r7);
    }

    public void writeParcelable(int r1, Parcelable parcelable, int r3, boolean z) {
        if (parcelable == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            parcelable.writeToParcel(this.b, r3);
            b(r2);
        }
    }

    public void writeShort(int r2, short s) {
        a(r2, 4);
        this.b.writeInt(s);
    }

    public void writeSparseBooleanArray(int r1, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeSparseBooleanArray(sparseBooleanArray);
            b(r2);
        }
    }

    public void writeSparseIntArray(int r4, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = sparseIntArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseIntArray.keyAt(r0));
            this.b.writeInt(sparseIntArray.valueAt(r0));
        }
        b(r5);
    }

    public void writeSparseLongArray(int r5, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                a(r5, 0);
                return;
            }
            return;
        }
        int r6 = a(r5);
        int size = sparseLongArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseLongArray.keyAt(r0));
            this.b.writeLong(sparseLongArray.valueAt(r0));
        }
        b(r6);
    }

    public void writeString(int r1, String str, boolean z) {
        if (str == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeString(str);
            b(r2);
        }
    }

    public void writeStringArray(int r1, String[] strArr, boolean z) {
        if (strArr == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeStringArray(strArr);
            b(r2);
        }
    }

    public void writeStringList(int r1, List<String> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r1, 0);
            }
        } else {
            int r2 = a(r1);
            this.b.writeStringList(list);
            b(r2);
        }
    }

    public void writeStringSparseArray(int r4, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            this.b.writeInt(sparseArray.keyAt(r0));
            this.b.writeString(sparseArray.valueAt(r0));
        }
        b(r5);
    }

    public <T extends Parcelable> void writeTypedArray(int r4, T[] tArr, int r6, boolean z) {
        if (tArr == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        this.b.writeInt(tArr.length);
        for (T t : tArr) {
            if (t == null) {
                this.b.writeInt(0);
            } else {
                a(t, r6);
            }
        }
        b(r5);
    }

    public <T extends Parcelable> void writeTypedList(int r4, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                a(r4, 0);
                return;
            }
            return;
        }
        int r5 = a(r4);
        int size = list.size();
        this.b.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            T t = list.get(r1);
            if (t == null) {
                this.b.writeInt(0);
            } else {
                a(t, 0);
            }
        }
        b(r5);
    }

    public <T extends Parcelable> void writeTypedSparseArray(int r5, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(r5, 0);
                return;
            }
            return;
        }
        int r6 = a(r5);
        int size = sparseArray.size();
        this.b.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            this.b.writeInt(sparseArray.keyAt(r1));
            T tValueAt = sparseArray.valueAt(r1);
            if (tValueAt == null) {
                this.b.writeInt(0);
            } else {
                a(tValueAt, 0);
            }
        }
        b(r6);
    }
}
