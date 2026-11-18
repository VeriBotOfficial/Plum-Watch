package com.bytedance.adsdk.fxn.kg.rb.fxn;

/* JADX INFO: loaded from: classes15.dex */
public class kg {
    private static boolean fxn(int r5, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return r5 == number.intValue();
        }
        if (number instanceof Long) {
            return ((long) r5) == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) r5) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) r5) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean fxn(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return j == ((long) number.intValue());
        }
        if (number instanceof Long) {
            return j == number.longValue();
        }
        if (number instanceof Float) {
            return ((float) j) == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) j) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean fxn(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return f == ((float) number.intValue());
        }
        if (number instanceof Long) {
            return f == ((float) number.longValue());
        }
        if (number instanceof Float) {
            return f == number.floatValue();
        }
        if (number instanceof Double) {
            return ((double) f) == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static boolean fxn(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return d == ((double) number.intValue());
        }
        if (number instanceof Long) {
            return d == ((double) number.longValue());
        }
        if (number instanceof Float) {
            return d == ((double) number.floatValue());
        }
        if (number instanceof Double) {
            return d == number.doubleValue();
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static boolean fxn(Number number, Number number2) {
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
