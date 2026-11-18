package androidx.core.math;

/* JADX INFO: loaded from: classes8.dex */
public class MathUtils {
    public static double clamp(double d, double d2, double d3) {
        if (d < d2) {
            return d2;
        }
        return d > d3 ? d3 : d;
    }

    public static float clamp(float f, float f2, float f3) {
        if (f < f2) {
            return f2;
        }
        return f > f3 ? f3 : f;
    }

    public static int clamp(int r0, int r1, int r2) {
        if (r0 < r1) {
            return r1;
        }
        return r0 > r2 ? r2 : r0;
    }

    public static long clamp(long j, long j2, long j3) {
        if (j < j2) {
            return j2;
        }
        return j > j3 ? j3 : j;
    }

    private MathUtils() {
    }

    public static int addExact(int r4, int r5) {
        int r0 = r4 + r5;
        if ((r4 >= 0) == (r5 >= 0)) {
            if ((r4 >= 0) != (r0 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return r0;
    }

    public static long addExact(long j, long j2) {
        long j3 = j + j2;
        if ((j >= 0) == (j2 >= 0)) {
            if ((j >= 0) != (j3 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    public static int subtractExact(int r4, int r5) {
        int r0 = r4 - r5;
        if ((r4 < 0) != (r5 < 0)) {
            if ((r4 < 0) != (r0 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return r0;
    }

    public static long subtractExact(long j, long j2) {
        long j3 = j - j2;
        if ((j < 0) != (j2 < 0)) {
            if ((j < 0) != (j3 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j3;
    }

    public static int multiplyExact(int r2, int r3) {
        int r0 = r2 * r3;
        if (r2 == 0 || r3 == 0 || (r0 / r2 == r3 && r0 / r3 == r2)) {
            return r0;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long multiplyExact(long j, long j2) {
        long j3 = j * j2;
        if (j == 0 || j2 == 0 || (j3 / j == j2 && j3 / j2 == j)) {
            return j3;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int incrementExact(int r1) {
        if (r1 != Integer.MAX_VALUE) {
            return r1 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long incrementExact(long j) {
        if (j != Long.MAX_VALUE) {
            return j + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int decrementExact(int r1) {
        if (r1 != Integer.MIN_VALUE) {
            return r1 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long decrementExact(long j) {
        if (j != Long.MIN_VALUE) {
            return j - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int negateExact(int r1) {
        if (r1 != Integer.MIN_VALUE) {
            return -r1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long negateExact(long j) {
        if (j != Long.MIN_VALUE) {
            return -j;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int toIntExact(long j) {
        if (j > 2147483647L || j < -2147483648L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j;
    }
}
