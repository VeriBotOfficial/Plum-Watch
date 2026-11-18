package com.bytedance.adsdk.fxn.kg.rb.fxn;

/* JADX INFO: loaded from: classes15.dex */
public class rb {
    private static Object fxn(int r2, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(r2 - number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(((long) r2) - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(r2 - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) r2) - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object fxn(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Long.valueOf(j - ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Long.valueOf(j - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(j - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(j - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object fxn(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Float.valueOf(f - number.intValue());
        }
        if (number instanceof Long) {
            return Float.valueOf(f - number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(f - number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) f) - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object fxn(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Double.valueOf(d - ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Double.valueOf(d - number.longValue());
        }
        if (number instanceof Float) {
            return Double.valueOf(d - ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Double.valueOf(d - number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object fxn(Number number, Number number2) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return fxn(number.intValue(), number2);
        }
        if (number instanceof Long) {
            return fxn(number.longValue(), number2);
        }
        if (number instanceof Float) {
            return fxn(number.floatValue(), number2);
        }
        if (number instanceof Double) {
            return fxn(number.doubleValue(), number2);
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }
}
