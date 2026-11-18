package com.blankj.utilcode.util;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes15.dex */
public class ArrayUtils {
    public static final int INDEX_NOT_FOUND = -1;

    public interface Closure<E> {
        void execute(int r1, E e);
    }

    public static <T> T[] newArray(T... tArr) {
        return tArr;
    }

    public static boolean[] newBooleanArray(boolean... zArr) {
        return zArr;
    }

    public static byte[] newByteArray(byte... bArr) {
        return bArr;
    }

    public static char[] newCharArray(char... cArr) {
        return cArr;
    }

    public static double[] newDoubleArray(double... dArr) {
        return dArr;
    }

    public static float[] newFloatArray(float... fArr) {
        return fArr;
    }

    public static int[] newIntArray(int... r0) {
        return r0;
    }

    public static long[] newLongArray(long... jArr) {
        return jArr;
    }

    public static short[] newShortArray(short... sArr) {
        return sArr;
    }

    private ArrayUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static boolean isEmpty(Object obj) {
        return getLength(obj) == 0;
    }

    public static int getLength(Object obj) {
        if (obj == null) {
            return 0;
        }
        return Array.getLength(obj);
    }

    public static boolean isSameLength(Object obj, Object obj2) {
        return getLength(obj) == getLength(obj2);
    }

    public static Object get(Object obj, int r2) {
        return get(obj, r2, null);
    }

    public static Object get(Object obj, int r1, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        try {
            return Array.get(obj, r1);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public static void set(Object obj, int r1, Object obj2) {
        if (obj == null) {
            return;
        }
        Array.set(obj, r1, obj2);
    }

    public static boolean equals(Object[] objArr, Object[] objArr2) {
        return Arrays.deepEquals(objArr, objArr2);
    }

    public static boolean equals(boolean[] zArr, boolean[] zArr2) {
        return Arrays.equals(zArr, zArr2);
    }

    public static boolean equals(byte[] bArr, byte[] bArr2) {
        return Arrays.equals(bArr, bArr2);
    }

    public static boolean equals(char[] cArr, char[] cArr2) {
        return Arrays.equals(cArr, cArr2);
    }

    public static boolean equals(double[] dArr, double[] dArr2) {
        return Arrays.equals(dArr, dArr2);
    }

    public static boolean equals(float[] fArr, float[] fArr2) {
        return Arrays.equals(fArr, fArr2);
    }

    public static boolean equals(int[] r0, int[] r1) {
        return Arrays.equals(r0, r1);
    }

    public static boolean equals(short[] sArr, short[] sArr2) {
        return Arrays.equals(sArr, sArr2);
    }

    public static <T> void reverse(T[] tArr) {
        if (tArr == null) {
            return;
        }
        int length = tArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            T t = tArr[length];
            tArr[length] = tArr[r1];
            tArr[r1] = t;
            length--;
        }
    }

    public static void reverse(long[] jArr) {
        if (jArr == null) {
            return;
        }
        int length = jArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            long j = jArr[length];
            jArr[length] = jArr[r1];
            jArr[r1] = j;
            length--;
        }
    }

    public static void reverse(int[] r4) {
        if (r4 == null) {
            return;
        }
        int length = r4.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            int r2 = r4[length];
            r4[length] = r4[r1];
            r4[r1] = r2;
            length--;
        }
    }

    public static void reverse(short[] sArr) {
        if (sArr == null) {
            return;
        }
        int length = sArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            short s = sArr[length];
            sArr[length] = sArr[r1];
            sArr[r1] = s;
            length--;
        }
    }

    public static void reverse(char[] cArr) {
        if (cArr == null) {
            return;
        }
        int length = cArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            char c = cArr[length];
            cArr[length] = cArr[r1];
            cArr[r1] = c;
            length--;
        }
    }

    public static void reverse(byte[] bArr) {
        if (bArr == null) {
            return;
        }
        int length = bArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            byte b = bArr[length];
            bArr[length] = bArr[r1];
            bArr[r1] = b;
            length--;
        }
    }

    public static void reverse(double[] dArr) {
        if (dArr == null) {
            return;
        }
        int length = dArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            double d = dArr[length];
            dArr[length] = dArr[r1];
            dArr[r1] = d;
            length--;
        }
    }

    public static void reverse(float[] fArr) {
        if (fArr == null) {
            return;
        }
        int length = fArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            float f = fArr[length];
            fArr[length] = fArr[r1];
            fArr[r1] = f;
            length--;
        }
    }

    public static void reverse(boolean[] zArr) {
        if (zArr == null) {
            return;
        }
        int length = zArr.length - 1;
        for (int r1 = 0; length > r1; r1++) {
            boolean z = zArr[length];
            zArr[length] = zArr[r1];
            zArr[r1] = z;
            length--;
        }
    }

    public static <T> T[] copy(T[] tArr) {
        if (tArr == null) {
            return null;
        }
        return (T[]) subArray(tArr, 0, tArr.length);
    }

    public static long[] copy(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        return subArray(jArr, 0, jArr.length);
    }

    public static int[] copy(int[] r2) {
        if (r2 == null) {
            return null;
        }
        return subArray(r2, 0, r2.length);
    }

    public static short[] copy(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        return subArray(sArr, 0, sArr.length);
    }

    public static char[] copy(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return subArray(cArr, 0, cArr.length);
    }

    public static byte[] copy(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return subArray(bArr, 0, bArr.length);
    }

    public static double[] copy(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        return subArray(dArr, 0, dArr.length);
    }

    public static float[] copy(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        return subArray(fArr, 0, fArr.length);
    }

    public static boolean[] copy(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        return subArray(zArr, 0, zArr.length);
    }

    private static Object realCopy(Object obj) {
        if (obj == null) {
            return null;
        }
        return realSubArray(obj, 0, getLength(obj));
    }

    public static <T> T[] subArray(T[] tArr, int r1, int r2) {
        return (T[]) ((Object[]) realSubArray(tArr, r1, r2));
    }

    public static long[] subArray(long[] jArr, int r1, int r2) {
        return (long[]) realSubArray(jArr, r1, r2);
    }

    public static int[] subArray(int[] r0, int r1, int r2) {
        return (int[]) realSubArray(r0, r1, r2);
    }

    public static short[] subArray(short[] sArr, int r1, int r2) {
        return (short[]) realSubArray(sArr, r1, r2);
    }

    public static char[] subArray(char[] cArr, int r1, int r2) {
        return (char[]) realSubArray(cArr, r1, r2);
    }

    public static byte[] subArray(byte[] bArr, int r1, int r2) {
        return (byte[]) realSubArray(bArr, r1, r2);
    }

    public static double[] subArray(double[] dArr, int r1, int r2) {
        return (double[]) realSubArray(dArr, r1, r2);
    }

    public static float[] subArray(float[] fArr, int r1, int r2) {
        return (float[]) realSubArray(fArr, r1, r2);
    }

    public static boolean[] subArray(boolean[] zArr, int r1, int r2) {
        return (boolean[]) realSubArray(zArr, r1, r2);
    }

    private static Object realSubArray(Object obj, int r3, int r4) {
        if (obj == null) {
            return null;
        }
        if (r3 < 0) {
            r3 = 0;
        }
        int length = getLength(obj);
        if (r4 > length) {
            r4 = length;
        }
        int r5 = r4 - r3;
        Class<?> componentType = obj.getClass().getComponentType();
        if (r5 <= 0) {
            return Array.newInstance(componentType, 0);
        }
        Object objNewInstance = Array.newInstance(componentType, r5);
        System.arraycopy(obj, r3, objNewInstance, 0, r5);
        return objNewInstance;
    }

    public static <T> T[] add(T[] tArr, T t) {
        Class<?> cls;
        if (tArr != null) {
            cls = tArr.getClass();
        } else {
            cls = t != null ? t.getClass() : Object.class;
        }
        return (T[]) ((Object[]) realAddOne(tArr, t, cls));
    }

    public static boolean[] add(boolean[] zArr, boolean z) {
        return (boolean[]) realAddOne(zArr, Boolean.valueOf(z), Boolean.TYPE);
    }

    public static byte[] add(byte[] bArr, byte b) {
        return (byte[]) realAddOne(bArr, Byte.valueOf(b), Byte.TYPE);
    }

    public static char[] add(char[] cArr, char c) {
        return (char[]) realAddOne(cArr, Character.valueOf(c), Character.TYPE);
    }

    public static double[] add(double[] dArr, double d) {
        return (double[]) realAddOne(dArr, Double.valueOf(d), Double.TYPE);
    }

    public static float[] add(float[] fArr, float f) {
        return (float[]) realAddOne(fArr, Float.valueOf(f), Float.TYPE);
    }

    public static int[] add(int[] r1, int r2) {
        return (int[]) realAddOne(r1, Integer.valueOf(r2), Integer.TYPE);
    }

    public static long[] add(long[] jArr, long j) {
        return (long[]) realAddOne(jArr, Long.valueOf(j), Long.TYPE);
    }

    public static short[] add(short[] sArr, short s) {
        return (short[]) realAddOne(sArr, Short.valueOf(s), Short.TYPE);
    }

    private static Object realAddOne(Object obj, Object obj2, Class cls) {
        Object objNewInstance;
        int r0 = 0;
        if (obj != null) {
            int length = getLength(obj);
            objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + 1);
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            r0 = length;
        } else {
            objNewInstance = Array.newInstance((Class<?>) cls, 1);
        }
        Array.set(objNewInstance, r0, obj2);
        return objNewInstance;
    }

    public static <T> T[] add(T[] tArr, T[] tArr2) {
        return (T[]) ((Object[]) realAddArr(tArr, tArr2));
    }

    public static boolean[] add(boolean[] zArr, boolean[] zArr2) {
        return (boolean[]) realAddArr(zArr, zArr2);
    }

    public static char[] add(char[] cArr, char[] cArr2) {
        return (char[]) realAddArr(cArr, cArr2);
    }

    public static byte[] add(byte[] bArr, byte[] bArr2) {
        return (byte[]) realAddArr(bArr, bArr2);
    }

    public static short[] add(short[] sArr, short[] sArr2) {
        return (short[]) realAddArr(sArr, sArr2);
    }

    public static int[] add(int[] r0, int[] r1) {
        return (int[]) realAddArr(r0, r1);
    }

    public static long[] add(long[] jArr, long[] jArr2) {
        return (long[]) realAddArr(jArr, jArr2);
    }

    public static float[] add(float[] fArr, float[] fArr2) {
        return (float[]) realAddArr(fArr, fArr2);
    }

    public static double[] add(double[] dArr, double[] dArr2) {
        return (double[]) realAddArr(dArr, dArr2);
    }

    private static Object realAddArr(Object obj, Object obj2) {
        if (obj == null && obj2 == null) {
            return null;
        }
        if (obj == null) {
            return realCopy(obj2);
        }
        if (obj2 == null) {
            return realCopy(obj);
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        System.arraycopy(obj, 0, objNewInstance, 0, length);
        System.arraycopy(obj2, 0, objNewInstance, length, length2);
        return objNewInstance;
    }

    public static <T> T[] add(T[] tArr, int r2, T[] tArr2) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else {
            if (tArr2 == null) {
                return null;
            }
            componentType = tArr2.getClass().getComponentType();
        }
        return (T[]) ((Object[]) realAddArr(tArr, r2, tArr2, componentType));
    }

    public static boolean[] add(boolean[] zArr, int r2, boolean[] zArr2) {
        Object objRealAddArr = realAddArr(zArr, r2, zArr2, Boolean.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (boolean[]) objRealAddArr;
    }

    public static char[] add(char[] cArr, int r2, char[] cArr2) {
        Object objRealAddArr = realAddArr(cArr, r2, cArr2, Character.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (char[]) objRealAddArr;
    }

    public static byte[] add(byte[] bArr, int r2, byte[] bArr2) {
        Object objRealAddArr = realAddArr(bArr, r2, bArr2, Byte.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (byte[]) objRealAddArr;
    }

    public static short[] add(short[] sArr, int r2, short[] sArr2) {
        Object objRealAddArr = realAddArr(sArr, r2, sArr2, Short.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (short[]) objRealAddArr;
    }

    public static int[] add(int[] r1, int r2, int[] r3) {
        Object objRealAddArr = realAddArr(r1, r2, r3, Integer.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (int[]) objRealAddArr;
    }

    public static long[] add(long[] jArr, int r2, long[] jArr2) {
        Object objRealAddArr = realAddArr(jArr, r2, jArr2, Long.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (long[]) objRealAddArr;
    }

    public static float[] add(float[] fArr, int r2, float[] fArr2) {
        Object objRealAddArr = realAddArr(fArr, r2, fArr2, Float.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (float[]) objRealAddArr;
    }

    public static double[] add(double[] dArr, int r2, double[] dArr2) {
        Object objRealAddArr = realAddArr(dArr, r2, dArr2, Double.TYPE);
        if (objRealAddArr == null) {
            return null;
        }
        return (double[]) objRealAddArr;
    }

    private static Object realAddArr(Object obj, int r4, Object obj2, Class cls) {
        if (obj == null && obj2 == null) {
            return null;
        }
        int length = getLength(obj);
        int length2 = getLength(obj2);
        if (length == 0) {
            if (r4 != 0) {
                throw new IndexOutOfBoundsException("Index: " + r4 + ", array1 Length: 0");
            }
            return realCopy(obj2);
        }
        if (length2 == 0) {
            return realCopy(obj);
        }
        if (r4 > length || r4 < 0) {
            throw new IndexOutOfBoundsException("Index: " + r4 + ", array1 Length: " + length);
        }
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), length + length2);
        if (r4 == length) {
            System.arraycopy(obj, 0, objNewInstance, 0, length);
            System.arraycopy(obj2, 0, objNewInstance, length, length2);
        } else if (r4 == 0) {
            System.arraycopy(obj2, 0, objNewInstance, 0, length2);
            System.arraycopy(obj, 0, objNewInstance, length2, length);
        } else {
            System.arraycopy(obj, 0, objNewInstance, 0, r4);
            System.arraycopy(obj2, 0, objNewInstance, r4, length2);
            System.arraycopy(obj, r4, objNewInstance, length2 + r4, length - r4);
        }
        return objNewInstance;
    }

    public static <T> T[] add(T[] tArr, int r2, T t) {
        Class<?> componentType;
        if (tArr != null) {
            componentType = tArr.getClass().getComponentType();
        } else if (t != null) {
            componentType = t.getClass();
        } else {
            return (T[]) new Object[]{null};
        }
        return (T[]) ((Object[]) realAdd(tArr, r2, t, componentType));
    }

    public static boolean[] add(boolean[] zArr, int r2, boolean z) {
        return (boolean[]) realAdd(zArr, r2, Boolean.valueOf(z), Boolean.TYPE);
    }

    public static char[] add(char[] cArr, int r2, char c) {
        return (char[]) realAdd(cArr, r2, Character.valueOf(c), Character.TYPE);
    }

    public static byte[] add(byte[] bArr, int r2, byte b) {
        return (byte[]) realAdd(bArr, r2, Byte.valueOf(b), Byte.TYPE);
    }

    public static short[] add(short[] sArr, int r2, short s) {
        return (short[]) realAdd(sArr, r2, Short.valueOf(s), Short.TYPE);
    }

    public static int[] add(int[] r1, int r2, int r3) {
        return (int[]) realAdd(r1, r2, Integer.valueOf(r3), Integer.TYPE);
    }

    public static long[] add(long[] jArr, int r1, long j) {
        return (long[]) realAdd(jArr, r1, Long.valueOf(j), Long.TYPE);
    }

    public static float[] add(float[] fArr, int r2, float f) {
        return (float[]) realAdd(fArr, r2, Float.valueOf(f), Float.TYPE);
    }

    public static double[] add(double[] dArr, int r1, double d) {
        return (double[]) realAdd(dArr, r1, Double.valueOf(d), Double.TYPE);
    }

    private static Object realAdd(Object obj, int r4, Object obj2, Class cls) {
        if (obj == null) {
            if (r4 != 0) {
                throw new IndexOutOfBoundsException("Index: " + r4 + ", Length: 0");
            }
            Object objNewInstance = Array.newInstance((Class<?>) cls, 1);
            Array.set(objNewInstance, 0, obj2);
            return objNewInstance;
        }
        int length = Array.getLength(obj);
        if (r4 > length || r4 < 0) {
            throw new IndexOutOfBoundsException("Index: " + r4 + ", Length: " + length);
        }
        Object objNewInstance2 = Array.newInstance((Class<?>) cls, length + 1);
        System.arraycopy(obj, 0, objNewInstance2, 0, r4);
        Array.set(objNewInstance2, r4, obj2);
        if (r4 < length) {
            System.arraycopy(obj, r4, objNewInstance2, r4 + 1, length - r4);
        }
        return objNewInstance2;
    }

    public static Object[] remove(Object[] objArr, int r1) {
        if (objArr == null) {
            return null;
        }
        return (Object[]) remove((Object) objArr, r1);
    }

    public static Object[] removeElement(Object[] objArr, Object obj) {
        int r2 = indexOf(objArr, obj);
        if (r2 == -1) {
            return copy(objArr);
        }
        return remove(objArr, r2);
    }

    public static boolean[] remove(boolean[] zArr, int r1) {
        if (zArr == null) {
            return null;
        }
        return (boolean[]) remove((Object) zArr, r1);
    }

    public static boolean[] removeElement(boolean[] zArr, boolean z) {
        int r2 = indexOf(zArr, z);
        if (r2 == -1) {
            return copy(zArr);
        }
        return remove(zArr, r2);
    }

    public static byte[] remove(byte[] bArr, int r1) {
        if (bArr == null) {
            return null;
        }
        return (byte[]) remove((Object) bArr, r1);
    }

    public static byte[] removeElement(byte[] bArr, byte b) {
        int r2 = indexOf(bArr, b);
        if (r2 == -1) {
            return copy(bArr);
        }
        return remove(bArr, r2);
    }

    public static char[] remove(char[] cArr, int r1) {
        if (cArr == null) {
            return null;
        }
        return (char[]) remove((Object) cArr, r1);
    }

    public static char[] removeElement(char[] cArr, char c) {
        int r2 = indexOf(cArr, c);
        if (r2 == -1) {
            return copy(cArr);
        }
        return remove(cArr, r2);
    }

    public static double[] remove(double[] dArr, int r1) {
        if (dArr == null) {
            return null;
        }
        return (double[]) remove((Object) dArr, r1);
    }

    public static double[] removeElement(double[] dArr, double d) {
        int r1 = indexOf(dArr, d);
        if (r1 == -1) {
            return copy(dArr);
        }
        return remove(dArr, r1);
    }

    public static float[] remove(float[] fArr, int r1) {
        if (fArr == null) {
            return null;
        }
        return (float[]) remove((Object) fArr, r1);
    }

    public static float[] removeElement(float[] fArr, float f) {
        int r2 = indexOf(fArr, f);
        if (r2 == -1) {
            return copy(fArr);
        }
        return remove(fArr, r2);
    }

    public static int[] remove(int[] r0, int r1) {
        if (r0 == null) {
            return null;
        }
        return (int[]) remove((Object) r0, r1);
    }

    public static int[] removeElement(int[] r1, int r2) {
        int r3 = indexOf(r1, r2);
        if (r3 == -1) {
            return copy(r1);
        }
        return remove(r1, r3);
    }

    public static long[] remove(long[] jArr, int r1) {
        if (jArr == null) {
            return null;
        }
        return (long[]) remove((Object) jArr, r1);
    }

    public static long[] removeElement(long[] jArr, long j) {
        int r1 = indexOf(jArr, j);
        if (r1 == -1) {
            return copy(jArr);
        }
        return remove(jArr, r1);
    }

    public static short[] remove(short[] sArr, int r1) {
        if (sArr == null) {
            return null;
        }
        return (short[]) remove((Object) sArr, r1);
    }

    public static short[] removeElement(short[] sArr, short s) {
        int r2 = indexOf(sArr, s);
        if (r2 == -1) {
            return copy(sArr);
        }
        return remove(sArr, r2);
    }

    private static Object remove(Object obj, int r5) {
        int length = getLength(obj);
        if (r5 < 0 || r5 >= length) {
            throw new IndexOutOfBoundsException("Index: " + r5 + ", Length: " + length);
        }
        int r2 = length - 1;
        Object objNewInstance = Array.newInstance(obj.getClass().getComponentType(), r2);
        System.arraycopy(obj, 0, objNewInstance, 0, r5);
        if (r5 < r2) {
            System.arraycopy(obj, r5 + 1, objNewInstance, r5, (length - r5) - 1);
        }
        return objNewInstance;
    }

    public static int indexOf(Object[] objArr, Object obj) {
        return indexOf(objArr, obj, 0);
    }

    public static int indexOf(Object[] objArr, Object obj, int r4) {
        if (objArr == null) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        if (obj == null) {
            while (r4 < objArr.length) {
                if (objArr[r4] == null) {
                    return r4;
                }
                r4++;
            }
        } else {
            while (r4 < objArr.length) {
                if (obj.equals(objArr[r4])) {
                    return r4;
                }
                r4++;
            }
        }
        return -1;
    }

    public static int lastIndexOf(Object[] objArr, Object obj) {
        return lastIndexOf(objArr, obj, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(Object[] objArr, Object obj, int r4) {
        if (objArr == null || r4 < 0) {
            return -1;
        }
        if (r4 >= objArr.length) {
            r4 = objArr.length - 1;
        }
        if (obj == null) {
            while (r4 >= 0) {
                if (objArr[r4] == null) {
                    return r4;
                }
                r4--;
            }
        } else {
            while (r4 >= 0) {
                if (obj.equals(objArr[r4])) {
                    return r4;
                }
                r4--;
            }
        }
        return -1;
    }

    public static boolean contains(Object[] objArr, Object obj) {
        return indexOf(objArr, obj) != -1;
    }

    public static int indexOf(long[] jArr, long j) {
        return indexOf(jArr, j, 0);
    }

    public static int indexOf(long[] jArr, long j, int r6) {
        if (jArr == null) {
            return -1;
        }
        if (r6 < 0) {
            r6 = 0;
        }
        while (r6 < jArr.length) {
            if (j == jArr[r6]) {
                return r6;
            }
            r6++;
        }
        return -1;
    }

    public static int lastIndexOf(long[] jArr, long j) {
        return lastIndexOf(jArr, j, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(long[] jArr, long j, int r6) {
        if (jArr == null || r6 < 0) {
            return -1;
        }
        if (r6 >= jArr.length) {
            r6 = jArr.length - 1;
        }
        while (r6 >= 0) {
            if (j == jArr[r6]) {
                return r6;
            }
            r6--;
        }
        return -1;
    }

    public static boolean contains(long[] jArr, long j) {
        return indexOf(jArr, j) != -1;
    }

    public static int indexOf(int[] r1, int r2) {
        return indexOf(r1, r2, 0);
    }

    public static int indexOf(int[] r2, int r3, int r4) {
        if (r2 == null) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < r2.length) {
            if (r3 == r2[r4]) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    public static int lastIndexOf(int[] r1, int r2) {
        return lastIndexOf(r1, r2, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(int[] r2, int r3, int r4) {
        if (r2 == null || r4 < 0) {
            return -1;
        }
        if (r4 >= r2.length) {
            r4 = r2.length - 1;
        }
        while (r4 >= 0) {
            if (r3 == r2[r4]) {
                return r4;
            }
            r4--;
        }
        return -1;
    }

    public static boolean contains(int[] r0, int r1) {
        return indexOf(r0, r1) != -1;
    }

    public static int indexOf(short[] sArr, short s) {
        return indexOf(sArr, s, 0);
    }

    public static int indexOf(short[] sArr, short s, int r4) {
        if (sArr == null) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < sArr.length) {
            if (s == sArr[r4]) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    public static int lastIndexOf(short[] sArr, short s) {
        return lastIndexOf(sArr, s, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(short[] sArr, short s, int r4) {
        if (sArr == null || r4 < 0) {
            return -1;
        }
        if (r4 >= sArr.length) {
            r4 = sArr.length - 1;
        }
        while (r4 >= 0) {
            if (s == sArr[r4]) {
                return r4;
            }
            r4--;
        }
        return -1;
    }

    public static boolean contains(short[] sArr, short s) {
        return indexOf(sArr, s) != -1;
    }

    public static int indexOf(char[] cArr, char c) {
        return indexOf(cArr, c, 0);
    }

    public static int indexOf(char[] cArr, char c, int r4) {
        if (cArr == null) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < cArr.length) {
            if (c == cArr[r4]) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    public static int lastIndexOf(char[] cArr, char c) {
        return lastIndexOf(cArr, c, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(char[] cArr, char c, int r4) {
        if (cArr == null || r4 < 0) {
            return -1;
        }
        if (r4 >= cArr.length) {
            r4 = cArr.length - 1;
        }
        while (r4 >= 0) {
            if (c == cArr[r4]) {
                return r4;
            }
            r4--;
        }
        return -1;
    }

    public static boolean contains(char[] cArr, char c) {
        return indexOf(cArr, c) != -1;
    }

    public static int indexOf(byte[] bArr, byte b) {
        return indexOf(bArr, b, 0);
    }

    public static int indexOf(byte[] bArr, byte b, int r4) {
        if (bArr == null) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < bArr.length) {
            if (b == bArr[r4]) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    public static int lastIndexOf(byte[] bArr, byte b) {
        return lastIndexOf(bArr, b, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(byte[] bArr, byte b, int r4) {
        if (bArr == null || r4 < 0) {
            return -1;
        }
        if (r4 >= bArr.length) {
            r4 = bArr.length - 1;
        }
        while (r4 >= 0) {
            if (b == bArr[r4]) {
                return r4;
            }
            r4--;
        }
        return -1;
    }

    public static boolean contains(byte[] bArr, byte b) {
        return indexOf(bArr, b) != -1;
    }

    public static int indexOf(double[] dArr, double d) {
        return indexOf(dArr, d, 0);
    }

    public static int indexOf(double[] dArr, double d, double d2) {
        return indexOf(dArr, d, 0, d2);
    }

    public static int indexOf(double[] dArr, double d, int r7) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (r7 < 0) {
            r7 = 0;
        }
        while (r7 < dArr.length) {
            if (d == dArr[r7]) {
                return r7;
            }
            r7++;
        }
        return -1;
    }

    public static int indexOf(double[] dArr, double d, int r7, double d2) {
        if (isEmpty(dArr)) {
            return -1;
        }
        if (r7 < 0) {
            r7 = 0;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (r7 < dArr.length) {
            double d5 = dArr[r7];
            if (d5 >= d3 && d5 <= d4) {
                return r7;
            }
            r7++;
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d) {
        return lastIndexOf(dArr, d, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(double[] dArr, double d, double d2) {
        return lastIndexOf(dArr, d, Integer.MAX_VALUE, d2);
    }

    public static int lastIndexOf(double[] dArr, double d, int r7) {
        if (isEmpty(dArr) || r7 < 0) {
            return -1;
        }
        if (r7 >= dArr.length) {
            r7 = dArr.length - 1;
        }
        while (r7 >= 0) {
            if (d == dArr[r7]) {
                return r7;
            }
            r7--;
        }
        return -1;
    }

    public static int lastIndexOf(double[] dArr, double d, int r7, double d2) {
        if (isEmpty(dArr) || r7 < 0) {
            return -1;
        }
        if (r7 >= dArr.length) {
            r7 = dArr.length - 1;
        }
        double d3 = d - d2;
        double d4 = d + d2;
        while (r7 >= 0) {
            double d5 = dArr[r7];
            if (d5 >= d3 && d5 <= d4) {
                return r7;
            }
            r7--;
        }
        return -1;
    }

    public static boolean contains(double[] dArr, double d) {
        return indexOf(dArr, d) != -1;
    }

    public static boolean contains(double[] dArr, double d, double d2) {
        return indexOf(dArr, d, 0, d2) != -1;
    }

    public static int indexOf(float[] fArr, float f) {
        return indexOf(fArr, f, 0);
    }

    public static int indexOf(float[] fArr, float f, int r4) {
        if (isEmpty(fArr)) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < fArr.length) {
            if (f == fArr[r4]) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    public static int lastIndexOf(float[] fArr, float f) {
        return lastIndexOf(fArr, f, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(float[] fArr, float f, int r4) {
        if (isEmpty(fArr) || r4 < 0) {
            return -1;
        }
        if (r4 >= fArr.length) {
            r4 = fArr.length - 1;
        }
        while (r4 >= 0) {
            if (f == fArr[r4]) {
                return r4;
            }
            r4--;
        }
        return -1;
    }

    public static boolean contains(float[] fArr, float f) {
        return indexOf(fArr, f) != -1;
    }

    public static int indexOf(boolean[] zArr, boolean z) {
        return indexOf(zArr, z, 0);
    }

    public static int indexOf(boolean[] zArr, boolean z, int r4) {
        if (isEmpty(zArr)) {
            return -1;
        }
        if (r4 < 0) {
            r4 = 0;
        }
        while (r4 < zArr.length) {
            if (z == zArr[r4]) {
                return r4;
            }
            r4++;
        }
        return -1;
    }

    public static int lastIndexOf(boolean[] zArr, boolean z) {
        return lastIndexOf(zArr, z, Integer.MAX_VALUE);
    }

    public static int lastIndexOf(boolean[] zArr, boolean z, int r4) {
        if (isEmpty(zArr) || r4 < 0) {
            return -1;
        }
        if (r4 >= zArr.length) {
            r4 = zArr.length - 1;
        }
        while (r4 >= 0) {
            if (z == zArr[r4]) {
                return r4;
            }
            r4--;
        }
        return -1;
    }

    public static boolean contains(boolean[] zArr, boolean z) {
        return indexOf(zArr, z) != -1;
    }

    public static char[] toPrimitive(Character[] chArr) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int r1 = 0; r1 < chArr.length; r1++) {
            cArr[r1] = chArr[r1].charValue();
        }
        return cArr;
    }

    public static char[] toPrimitive(Character[] chArr, char c) {
        if (chArr == null) {
            return null;
        }
        if (chArr.length == 0) {
            return new char[0];
        }
        char[] cArr = new char[chArr.length];
        for (int r1 = 0; r1 < chArr.length; r1++) {
            Character ch = chArr[r1];
            cArr[r1] = ch == null ? c : ch.charValue();
        }
        return cArr;
    }

    public static Character[] toObject(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        if (cArr.length == 0) {
            return new Character[0];
        }
        Character[] chArr = new Character[cArr.length];
        for (int r1 = 0; r1 < cArr.length; r1++) {
            chArr[r1] = new Character(cArr[r1]);
        }
        return chArr;
    }

    public static long[] toPrimitive(Long[] lArr) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int r1 = 0; r1 < lArr.length; r1++) {
            jArr[r1] = lArr[r1].longValue();
        }
        return jArr;
    }

    public static long[] toPrimitive(Long[] lArr, long j) {
        if (lArr == null) {
            return null;
        }
        if (lArr.length == 0) {
            return new long[0];
        }
        long[] jArr = new long[lArr.length];
        for (int r1 = 0; r1 < lArr.length; r1++) {
            Long l = lArr[r1];
            jArr[r1] = l == null ? j : l.longValue();
        }
        return jArr;
    }

    public static Long[] toObject(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        if (jArr.length == 0) {
            return new Long[0];
        }
        Long[] lArr = new Long[jArr.length];
        for (int r1 = 0; r1 < jArr.length; r1++) {
            lArr[r1] = new Long(jArr[r1]);
        }
        return lArr;
    }

    public static int[] toPrimitive(Integer[] numArr) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] r0 = new int[numArr.length];
        for (int r1 = 0; r1 < numArr.length; r1++) {
            r0[r1] = numArr[r1].intValue();
        }
        return r0;
    }

    public static int[] toPrimitive(Integer[] numArr, int r4) {
        if (numArr == null) {
            return null;
        }
        if (numArr.length == 0) {
            return new int[0];
        }
        int[] r0 = new int[numArr.length];
        for (int r1 = 0; r1 < numArr.length; r1++) {
            Integer num = numArr[r1];
            r0[r1] = num == null ? r4 : num.intValue();
        }
        return r0;
    }

    public static Integer[] toObject(int[] r4) {
        if (r4 == null) {
            return null;
        }
        if (r4.length == 0) {
            return new Integer[0];
        }
        Integer[] numArr = new Integer[r4.length];
        for (int r1 = 0; r1 < r4.length; r1++) {
            numArr[r1] = new Integer(r4[r1]);
        }
        return numArr;
    }

    public static short[] toPrimitive(Short[] shArr) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int r1 = 0; r1 < shArr.length; r1++) {
            sArr[r1] = shArr[r1].shortValue();
        }
        return sArr;
    }

    public static short[] toPrimitive(Short[] shArr, short s) {
        if (shArr == null) {
            return null;
        }
        if (shArr.length == 0) {
            return new short[0];
        }
        short[] sArr = new short[shArr.length];
        for (int r1 = 0; r1 < shArr.length; r1++) {
            Short sh = shArr[r1];
            sArr[r1] = sh == null ? s : sh.shortValue();
        }
        return sArr;
    }

    public static Short[] toObject(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        if (sArr.length == 0) {
            return new Short[0];
        }
        Short[] shArr = new Short[sArr.length];
        for (int r1 = 0; r1 < sArr.length; r1++) {
            shArr[r1] = new Short(sArr[r1]);
        }
        return shArr;
    }

    public static byte[] toPrimitive(Byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int r1 = 0; r1 < bArr.length; r1++) {
            bArr2[r1] = bArr[r1].byteValue();
        }
        return bArr2;
    }

    public static byte[] toPrimitive(Byte[] bArr, byte b) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new byte[0];
        }
        byte[] bArr2 = new byte[bArr.length];
        for (int r1 = 0; r1 < bArr.length; r1++) {
            Byte b2 = bArr[r1];
            bArr2[r1] = b2 == null ? b : b2.byteValue();
        }
        return bArr2;
    }

    public static Byte[] toObject(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return new Byte[0];
        }
        Byte[] bArr2 = new Byte[bArr.length];
        for (int r1 = 0; r1 < bArr.length; r1++) {
            bArr2[r1] = new Byte(bArr[r1]);
        }
        return bArr2;
    }

    public static double[] toPrimitive(Double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int r1 = 0; r1 < dArr.length; r1++) {
            dArr2[r1] = dArr[r1].doubleValue();
        }
        return dArr2;
    }

    public static double[] toPrimitive(Double[] dArr, double d) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new double[0];
        }
        double[] dArr2 = new double[dArr.length];
        for (int r1 = 0; r1 < dArr.length; r1++) {
            Double d2 = dArr[r1];
            dArr2[r1] = d2 == null ? d : d2.doubleValue();
        }
        return dArr2;
    }

    public static Double[] toObject(double[] dArr) {
        if (dArr == null) {
            return null;
        }
        if (dArr.length == 0) {
            return new Double[0];
        }
        Double[] dArr2 = new Double[dArr.length];
        for (int r1 = 0; r1 < dArr.length; r1++) {
            dArr2[r1] = new Double(dArr[r1]);
        }
        return dArr2;
    }

    public static float[] toPrimitive(Float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int r1 = 0; r1 < fArr.length; r1++) {
            fArr2[r1] = fArr[r1].floatValue();
        }
        return fArr2;
    }

    public static float[] toPrimitive(Float[] fArr, float f) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new float[0];
        }
        float[] fArr2 = new float[fArr.length];
        for (int r1 = 0; r1 < fArr.length; r1++) {
            Float f2 = fArr[r1];
            fArr2[r1] = f2 == null ? f : f2.floatValue();
        }
        return fArr2;
    }

    public static Float[] toObject(float[] fArr) {
        if (fArr == null) {
            return null;
        }
        if (fArr.length == 0) {
            return new Float[0];
        }
        Float[] fArr2 = new Float[fArr.length];
        for (int r1 = 0; r1 < fArr.length; r1++) {
            fArr2[r1] = new Float(fArr[r1]);
        }
        return fArr2;
    }

    public static boolean[] toPrimitive(Boolean[] boolArr) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int r1 = 0; r1 < boolArr.length; r1++) {
            zArr[r1] = boolArr[r1].booleanValue();
        }
        return zArr;
    }

    public static boolean[] toPrimitive(Boolean[] boolArr, boolean z) {
        if (boolArr == null) {
            return null;
        }
        if (boolArr.length == 0) {
            return new boolean[0];
        }
        boolean[] zArr = new boolean[boolArr.length];
        for (int r1 = 0; r1 < boolArr.length; r1++) {
            Boolean bool = boolArr[r1];
            zArr[r1] = bool == null ? z : bool.booleanValue();
        }
        return zArr;
    }

    public static Boolean[] toObject(boolean[] zArr) {
        if (zArr == null) {
            return null;
        }
        if (zArr.length == 0) {
            return new Boolean[0];
        }
        Boolean[] boolArr = new Boolean[zArr.length];
        for (int r1 = 0; r1 < zArr.length; r1++) {
            boolArr[r1] = zArr[r1] ? Boolean.TRUE : Boolean.FALSE;
        }
        return boolArr;
    }

    public static <T> List<T> asList(T... tArr) {
        if (tArr == null || tArr.length == 0) {
            return Collections.emptyList();
        }
        return Arrays.asList(tArr);
    }

    public static <T> List<T> asUnmodifiableList(T... tArr) {
        return Collections.unmodifiableList(asList(tArr));
    }

    public static <T> List<T> asArrayList(T... tArr) {
        ArrayList arrayList = new ArrayList();
        if (tArr != null && tArr.length != 0) {
            arrayList.addAll(Arrays.asList(tArr));
        }
        return arrayList;
    }

    public static <T> List<T> asLinkedList(T... tArr) {
        LinkedList linkedList = new LinkedList();
        if (tArr != null && tArr.length != 0) {
            linkedList.addAll(Arrays.asList(tArr));
        }
        return linkedList;
    }

    public static <T> void sort(T[] tArr, Comparator<? super T> comparator) {
        if (tArr == null || tArr.length < 2) {
            return;
        }
        Arrays.sort(tArr, comparator);
    }

    public static void sort(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        Arrays.sort(bArr);
    }

    public static void sort(char[] cArr) {
        if (cArr == null || cArr.length < 2) {
            return;
        }
        Arrays.sort(cArr);
    }

    public static void sort(double[] dArr) {
        if (dArr == null || dArr.length < 2) {
            return;
        }
        Arrays.sort(dArr);
    }

    public static void sort(float[] fArr) {
        if (fArr == null || fArr.length < 2) {
            return;
        }
        Arrays.sort(fArr);
    }

    public static void sort(int[] r2) {
        if (r2 == null || r2.length < 2) {
            return;
        }
        Arrays.sort(r2);
    }

    public static void sort(long[] jArr) {
        if (jArr == null || jArr.length < 2) {
            return;
        }
        Arrays.sort(jArr);
    }

    public static void sort(short[] sArr) {
        if (sArr == null || sArr.length < 2) {
            return;
        }
        Arrays.sort(sArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> void forAllDo(Object obj, Closure<E> closure) {
        if (obj == null || closure == 0) {
            return;
        }
        int r1 = 0;
        if (obj instanceof Object[]) {
            Object[] objArr = (Object[]) obj;
            int length = objArr.length;
            while (r1 < length) {
                closure.execute(r1, objArr[r1]);
                r1++;
            }
            return;
        }
        if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length2 = zArr.length;
            while (r1 < length2) {
                closure.execute(r1, zArr[r1] ? Boolean.TRUE : Boolean.FALSE);
                r1++;
            }
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length3 = bArr.length;
            while (r1 < length3) {
                closure.execute(r1, Byte.valueOf(bArr[r1]));
                r1++;
            }
            return;
        }
        if (obj instanceof char[]) {
            char[] cArr = (char[]) obj;
            int length4 = cArr.length;
            while (r1 < length4) {
                closure.execute(r1, Character.valueOf(cArr[r1]));
                r1++;
            }
            return;
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length5 = sArr.length;
            while (r1 < length5) {
                closure.execute(r1, Short.valueOf(sArr[r1]));
                r1++;
            }
            return;
        }
        if (obj instanceof int[]) {
            int[] r4 = (int[]) obj;
            int length6 = r4.length;
            while (r1 < length6) {
                closure.execute(r1, Integer.valueOf(r4[r1]));
                r1++;
            }
            return;
        }
        if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length7 = jArr.length;
            while (r1 < length7) {
                closure.execute(r1, Long.valueOf(jArr[r1]));
                r1++;
            }
            return;
        }
        if (obj instanceof float[]) {
            float[] fArr = (float[]) obj;
            int length8 = fArr.length;
            while (r1 < length8) {
                closure.execute(r1, Float.valueOf(fArr[r1]));
                r1++;
            }
            return;
        }
        if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length9 = dArr.length;
            while (r1 < length9) {
                closure.execute(r1, Double.valueOf(dArr[r1]));
                r1++;
            }
            return;
        }
        throw new IllegalArgumentException("Not an array: " + obj.getClass());
    }

    public static String toString(Object obj) {
        if (obj == null) {
            return AbstractJsonLexerKt.NULL;
        }
        if (obj instanceof Object[]) {
            return Arrays.deepToString((Object[]) obj);
        }
        if (obj instanceof boolean[]) {
            return Arrays.toString((boolean[]) obj);
        }
        if (obj instanceof byte[]) {
            return Arrays.toString((byte[]) obj);
        }
        if (obj instanceof char[]) {
            return Arrays.toString((char[]) obj);
        }
        if (obj instanceof double[]) {
            return Arrays.toString((double[]) obj);
        }
        if (obj instanceof float[]) {
            return Arrays.toString((float[]) obj);
        }
        if (obj instanceof int[]) {
            return Arrays.toString((int[]) obj);
        }
        if (obj instanceof long[]) {
            return Arrays.toString((long[]) obj);
        }
        if (obj instanceof short[]) {
            return Arrays.toString((short[]) obj);
        }
        throw new IllegalArgumentException("Array has incompatible type: " + obj.getClass());
    }
}
