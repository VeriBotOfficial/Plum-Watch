package com.huawei.hms.common.internal.safeparcel;

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
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    private static void a(Parcel parcel, int r2, int r3) {
        if (r3 < 65535) {
            parcel.writeInt(r2 | (r3 << 16));
        } else {
            parcel.writeInt(r2 | SupportMenu.CATEGORY_MASK);
            parcel.writeInt(r3);
        }
    }

    private static void b(Parcel parcel, int r3) {
        int r0 = parcel.dataPosition();
        parcel.setDataPosition(r3 - 4);
        parcel.writeInt(r0 - r3);
        parcel.setDataPosition(r0);
    }

    public static int beginObjectHeader(Parcel parcel) {
        return a(parcel, 20293);
    }

    public static void finishObjectHeader(Parcel parcel, int r1) {
        b(parcel, r1);
    }

    public static void writeBigDecimal(Parcel parcel, int r1, BigDecimal bigDecimal, boolean z) {
        if (bigDecimal == null) {
            if (z) {
                a(parcel, r1, 0);
            }
        } else {
            int r2 = a(parcel, r1);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            b(parcel, r2);
        }
    }

    public static void writeBigDecimalArray(Parcel parcel, int r3, BigDecimal[] bigDecimalArr, boolean z) {
        if (bigDecimalArr == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int length = bigDecimalArr.length;
        parcel.writeInt(length);
        for (int r0 = 0; r0 < length; r0++) {
            parcel.writeByteArray(bigDecimalArr[r0].unscaledValue().toByteArray());
            parcel.writeInt(bigDecimalArr[r0].scale());
        }
        b(parcel, r4);
    }

    public static void writeBigInteger(Parcel parcel, int r1, BigInteger bigInteger, boolean z) {
        if (bigInteger != null) {
            int r2 = a(parcel, r1);
            parcel.writeByteArray(bigInteger.toByteArray());
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeBigIntegerArray(Parcel parcel, int r3, BigInteger[] bigIntegerArr, boolean z) {
        if (bigIntegerArr == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        parcel.writeInt(bigIntegerArr.length);
        for (BigInteger bigInteger : bigIntegerArr) {
            parcel.writeByteArray(bigInteger.toByteArray());
        }
        b(parcel, r4);
    }

    public static void writeBoolean(Parcel parcel, int r2, boolean z) {
        a(parcel, r2, 4);
        if (z) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void writeBooleanArray(Parcel parcel, int r1, boolean[] zArr, boolean z) {
        if (zArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeBooleanArray(zArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeBooleanList(Parcel parcel, int r3, List<Boolean> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(list.get(r0).booleanValue() ? 1 : 0);
        }
        b(parcel, r4);
    }

    public static void writeBooleanObject(Parcel parcel, int r1, Boolean bool, boolean z) {
        if (bool != null) {
            a(parcel, r1, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeBundle(Parcel parcel, int r1, Bundle bundle, boolean z) {
        if (bundle != null) {
            int r2 = a(parcel, r1);
            parcel.writeBundle(bundle);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeByte(Parcel parcel, int r2, byte b) {
        a(parcel, r2, 4);
        parcel.writeInt(b);
    }

    public static void writeByteArray(Parcel parcel, int r1, byte[] bArr, boolean z) {
        if (bArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeByteArray(bArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeByteArrayArray(Parcel parcel, int r3, byte[][] bArr, boolean z) {
        if (bArr == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        b(parcel, r4);
    }

    public static void writeByteArraySparseArray(Parcel parcel, int r3, SparseArray<byte[]> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeByteArray(sparseArray.valueAt(r0));
        }
        b(parcel, r4);
    }

    public static void writeChar(Parcel parcel, int r2, char c) {
        a(parcel, r2, 4);
        parcel.writeInt(c);
    }

    public static void writeCharArray(Parcel parcel, int r1, char[] cArr, boolean z) {
        if (cArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeCharArray(cArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeDouble(Parcel parcel, int r2, double d) {
        a(parcel, r2, 8);
        parcel.writeDouble(d);
    }

    public static void writeDoubleArray(Parcel parcel, int r1, double[] dArr, boolean z) {
        if (dArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeDoubleArray(dArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeDoubleList(Parcel parcel, int r4, List<Double> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeDouble(list.get(r0).doubleValue());
        }
        b(parcel, r5);
    }

    public static void writeDoubleObject(Parcel parcel, int r1, Double d, boolean z) {
        if (d != null) {
            a(parcel, r1, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeDoubleSparseArray(Parcel parcel, int r4, SparseArray<Double> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeDouble(sparseArray.valueAt(r0).doubleValue());
        }
        b(parcel, r5);
    }

    public static void writeFloat(Parcel parcel, int r2, float f) {
        a(parcel, r2, 4);
        parcel.writeFloat(f);
    }

    public static void writeFloatArray(Parcel parcel, int r1, float[] fArr, boolean z) {
        if (fArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeFloatArray(fArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeFloatList(Parcel parcel, int r3, List<Float> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeFloat(list.get(r0).floatValue());
        }
        b(parcel, r4);
    }

    public static void writeFloatObject(Parcel parcel, int r1, Float f, boolean z) {
        if (f != null) {
            a(parcel, r1, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeFloatSparseArray(Parcel parcel, int r3, SparseArray<Float> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeFloat(sparseArray.valueAt(r0).floatValue());
        }
        b(parcel, r4);
    }

    public static void writeIBinder(Parcel parcel, int r1, IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int r2 = a(parcel, r1);
            parcel.writeStrongBinder(iBinder);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeIBinderArray(Parcel parcel, int r1, IBinder[] iBinderArr, boolean z) {
        if (iBinderArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeBinderArray(iBinderArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeIBinderList(Parcel parcel, int r1, List<IBinder> list, boolean z) {
        if (list != null) {
            int r2 = a(parcel, r1);
            parcel.writeBinderList(list);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeIBinderSparseArray(Parcel parcel, int r3, SparseArray<IBinder> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeStrongBinder(sparseArray.valueAt(r0));
        }
        b(parcel, r4);
    }

    public static void writeInt(Parcel parcel, int r2, int r3) {
        a(parcel, r2, 4);
        parcel.writeInt(r3);
    }

    public static void writeIntArray(Parcel parcel, int r1, int[] r2, boolean z) {
        if (r2 != null) {
            int r3 = a(parcel, r1);
            parcel.writeIntArray(r2);
            b(parcel, r3);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeIntegerList(Parcel parcel, int r3, List<Integer> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(list.get(r0).intValue());
        }
        b(parcel, r4);
    }

    public static void writeIntegerObject(Parcel parcel, int r1, Integer num, boolean z) {
        if (num != null) {
            a(parcel, r1, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeList(Parcel parcel, int r1, List list, boolean z) {
        if (list != null) {
            int r2 = a(parcel, r1);
            parcel.writeList(list);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeLong(Parcel parcel, int r2, long j) {
        a(parcel, r2, 8);
        parcel.writeLong(j);
    }

    public static void writeLongArray(Parcel parcel, int r1, long[] jArr, boolean z) {
        if (jArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeLongArray(jArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeLongList(Parcel parcel, int r4, List<Long> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeLong(list.get(r0).longValue());
        }
        b(parcel, r5);
    }

    public static void writeLongObject(Parcel parcel, int r1, Long l, boolean z) {
        if (l != null) {
            a(parcel, r1, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeParcel(Parcel parcel, int r2, Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int r3 = a(parcel, r2);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            b(parcel, r3);
        } else if (z) {
            a(parcel, r2, 0);
        }
    }

    public static void writeParcelArray(Parcel parcel, int r5, Parcel[] parcelArr, boolean z) {
        if (parcelArr == null) {
            if (z) {
                a(parcel, r5, 0);
                return;
            }
            return;
        }
        int r6 = a(parcel, r5);
        int length = parcelArr.length;
        parcel.writeInt(length);
        for (int r1 = 0; r1 < length; r1++) {
            Parcel parcel2 = parcelArr[r1];
            if (parcel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcel2.dataSize());
                Parcel parcel3 = parcelArr[r1];
                parcel.appendFrom(parcel3, 0, parcel3.dataSize());
            }
        }
        b(parcel, r6);
    }

    public static void writeParcelList(Parcel parcel, int r5, List<Parcel> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r5, 0);
                return;
            }
            return;
        }
        int r6 = a(parcel, r5);
        int size = list.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            Parcel parcel2 = list.get(r1);
            if (parcel2 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcel2.dataSize());
                parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            }
        }
        b(parcel, r6);
    }

    public static void writeParcelSparseArray(Parcel parcel, int r5, SparseArray<Parcel> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r5, 0);
                return;
            }
            return;
        }
        int r6 = a(parcel, r5);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            parcel.writeInt(sparseArray.keyAt(r1));
            Parcel parcelValueAt = sparseArray.valueAt(r1);
            if (parcelValueAt == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(parcelValueAt.dataSize());
                parcel.appendFrom(parcelValueAt, 0, parcelValueAt.dataSize());
            }
        }
        b(parcel, r6);
    }

    public static void writeParcelable(Parcel parcel, int r1, Parcelable parcelable, int r3, boolean z) {
        if (parcelable != null) {
            int r2 = a(parcel, r1);
            parcelable.writeToParcel(parcel, r3);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeShort(Parcel parcel, int r2, short s) {
        a(parcel, r2, 4);
        parcel.writeInt(s);
    }

    public static void writeSparseBooleanArray(Parcel parcel, int r1, SparseBooleanArray sparseBooleanArray, boolean z) {
        if (sparseBooleanArray != null) {
            int r2 = a(parcel, r1);
            parcel.writeSparseBooleanArray(sparseBooleanArray);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeSparseIntArray(Parcel parcel, int r3, SparseIntArray sparseIntArray, boolean z) {
        if (sparseIntArray == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = sparseIntArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseIntArray.keyAt(r0));
            parcel.writeInt(sparseIntArray.valueAt(r0));
        }
        b(parcel, r4);
    }

    public static void writeSparseLongArray(Parcel parcel, int r4, SparseLongArray sparseLongArray, boolean z) {
        if (sparseLongArray == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        int size = sparseLongArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseLongArray.keyAt(r0));
            parcel.writeLong(sparseLongArray.valueAt(r0));
        }
        b(parcel, r5);
    }

    public static void writeString(Parcel parcel, int r1, String str, boolean z) {
        if (str != null) {
            int r2 = a(parcel, r1);
            parcel.writeString(str);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeStringArray(Parcel parcel, int r1, String[] strArr, boolean z) {
        if (strArr != null) {
            int r2 = a(parcel, r1);
            parcel.writeStringArray(strArr);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeStringList(Parcel parcel, int r1, List<String> list, boolean z) {
        if (list != null) {
            int r2 = a(parcel, r1);
            parcel.writeStringList(list);
            b(parcel, r2);
        } else if (z) {
            a(parcel, r1, 0);
        }
    }

    public static void writeStringSparseArray(Parcel parcel, int r3, SparseArray<String> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r3, 0);
                return;
            }
            return;
        }
        int r4 = a(parcel, r3);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r0 = 0; r0 < size; r0++) {
            parcel.writeInt(sparseArray.keyAt(r0));
            parcel.writeString(sparseArray.valueAt(r0));
        }
        b(parcel, r4);
    }

    public static <P extends Parcelable> void writeTypedArray(Parcel parcel, int r4, P[] pArr, int r6, boolean z) {
        if (pArr == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        parcel.writeInt(r5);
        for (P p : pArr) {
            if (p != null) {
                a(parcel, p, r6);
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, r5);
    }

    public static <T extends Parcelable> void writeTypedList(Parcel parcel, int r4, List<T> list, boolean z) {
        if (list == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            T t = list.get(r1);
            if (t != null) {
                a(parcel, t, 0);
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, r5);
    }

    public static <T extends Parcelable> void writeTypedSparseArray(Parcel parcel, int r4, SparseArray<T> sparseArray, boolean z) {
        if (sparseArray == null) {
            if (z) {
                a(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = a(parcel, r4);
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int r1 = 0; r1 < size; r1++) {
            parcel.writeInt(sparseArray.keyAt(r1));
            T tValueAt = sparseArray.valueAt(r1);
            if (tValueAt != null) {
                a(parcel, tValueAt, 0);
            } else {
                parcel.writeInt(0);
            }
        }
        b(parcel, r5);
    }

    private static int a(Parcel parcel, int r2) {
        parcel.writeInt(r2 | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static <P extends Parcelable> void a(Parcel parcel, P p, int r4) {
        int r0 = parcel.dataPosition();
        parcel.writeInt(1);
        int r1 = parcel.dataPosition();
        p.writeToParcel(parcel, r4);
        int r3 = parcel.dataPosition();
        parcel.setDataPosition(r0);
        parcel.writeInt(r3 - r1);
        parcel.setDataPosition(r3);
    }
}
