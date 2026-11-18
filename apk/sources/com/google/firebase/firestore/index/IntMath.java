package com.google.firebase.firestore.index;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
public final class IntMath {
    public static int divide(int r5, int r6, RoundingMode roundingMode) {
        if (r6 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int r0 = r5 / r6;
        int r1 = r5 - (r6 * r0);
        if (r1 == 0) {
            return r0;
        }
        int r7 = ((r5 ^ r6) >> 31) | 1;
        switch (AnonymousClass1.$SwitchMap$java$math$RoundingMode[roundingMode.ordinal()]) {
            case 1:
            case 2:
                return r0;
            case 3:
                break;
            case 4:
                if (r7 <= 0) {
                    return r0;
                }
                break;
            case 5:
                if (r7 >= 0) {
                    return r0;
                }
                break;
            case 6:
            case 7:
            case 8:
                int r2 = Math.abs(r1);
                int r3 = r2 - (Math.abs(r6) - r2);
                if (r3 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (!((roundingMode == RoundingMode.HALF_EVEN) & ((r0 & 1) != 0))) {
                            return r0;
                        }
                    }
                } else if (r3 <= 0) {
                    return r0;
                }
            default:
                throw new AssertionError();
        }
        return r0 + r7;
    }

    /* JADX INFO: renamed from: com.google.firebase.firestore.index.IntMath$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$java$math$RoundingMode;

        static {
            int[] r0 = new int[RoundingMode.values().length];
            $SwitchMap$java$math$RoundingMode = r0;
            try {
                r0[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.UP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.CEILING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_DOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$java$math$RoundingMode[RoundingMode.HALF_UP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private IntMath() {
    }
}
