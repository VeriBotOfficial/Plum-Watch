package com.bytedance.adsdk.fxn.kg.rb.fxn;

/* JADX INFO: loaded from: classes15.dex */
public class hm {
    private static Object fxn(int r5, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(r5 < number.intValue());
        }
        if (number instanceof Long) {
            return Boolean.valueOf(((long) r5) < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) r5) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) r5) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object fxn(long j, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(j < ((long) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(j < number.longValue());
        }
        if (number instanceof Float) {
            return Boolean.valueOf(((float) j) < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) j) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object fxn(float f, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(f < ((float) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(f < ((float) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(f < number.floatValue());
        }
        if (number instanceof Double) {
            return Boolean.valueOf(((double) f) < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object fxn(double d, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Boolean.valueOf(d < ((double) number.intValue()));
        }
        if (number instanceof Long) {
            return Boolean.valueOf(d < ((double) number.longValue()));
        }
        if (number instanceof Float) {
            return Boolean.valueOf(d < ((double) number.floatValue()));
        }
        if (number instanceof Double) {
            return Boolean.valueOf(d < number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    public static Object fxn(Object obj, Number number) {
        if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
            return fxn(((Number) obj).intValue(), number);
        }
        if (obj instanceof Long) {
            return fxn(((Long) obj).longValue(), number);
        }
        if (obj instanceof Float) {
            return fxn(((Float) obj).floatValue(), number);
        }
        if (obj instanceof Double) {
            return fxn(((Double) obj).doubleValue(), number);
        }
        if (obj instanceof String) {
            try {
                return fxn(Float.parseFloat((String) obj), number);
            } catch (NumberFormatException unused) {
                throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
            }
        }
        throw new UnsupportedOperationException(obj.getClass().getName() + "This type of addition operation is not supported");
    }
}
