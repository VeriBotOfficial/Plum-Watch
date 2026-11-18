package androidx.constraintlayout.core.motion.utils;

import androidx.camera.video.AudioStats;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes8.dex */
public class HyperSpline {
    double[][] mCtl;
    Cubic[][] mCurve;
    double[] mCurveLength;
    int mDimensionality;
    int mPoints;
    double mTotalLength;

    public HyperSpline(double[][] dArr) {
        setup(dArr);
    }

    public HyperSpline() {
    }

    public void setup(double[][] dArr) {
        int r1;
        int length = dArr[0].length;
        this.mDimensionality = length;
        int length2 = dArr.length;
        this.mPoints = length2;
        this.mCtl = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, length2);
        this.mCurve = new Cubic[this.mDimensionality][];
        for (int r2 = 0; r2 < this.mDimensionality; r2++) {
            for (int r3 = 0; r3 < this.mPoints; r3++) {
                this.mCtl[r2][r3] = dArr[r3][r2];
            }
        }
        int r9 = 0;
        while (true) {
            r1 = this.mDimensionality;
            if (r9 >= r1) {
                break;
            }
            Cubic[][] cubicArr = this.mCurve;
            double[] dArr2 = this.mCtl[r9];
            cubicArr[r9] = calcNaturalCubic(dArr2.length, dArr2);
            r9++;
        }
        this.mCurveLength = new double[this.mPoints - 1];
        this.mTotalLength = AudioStats.AUDIO_AMPLITUDE_NONE;
        Cubic[] cubicArr2 = new Cubic[r1];
        for (int r4 = 0; r4 < this.mCurveLength.length; r4++) {
            for (int r5 = 0; r5 < this.mDimensionality; r5++) {
                cubicArr2[r5] = this.mCurve[r5][r4];
            }
            double d = this.mTotalLength;
            double[] dArr3 = this.mCurveLength;
            double dApproxLength = approxLength(cubicArr2);
            dArr3[r4] = dApproxLength;
            this.mTotalLength = d + dApproxLength;
        }
    }

    public void getVelocity(double d, double[] dArr) {
        double d2 = d * this.mTotalLength;
        int r1 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (r1 >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[r1];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            r1++;
        }
        for (int r0 = 0; r0 < dArr.length; r0++) {
            dArr[r0] = this.mCurve[r0][r1].vel(d2 / this.mCurveLength[r1]);
        }
    }

    public void getPos(double d, double[] dArr) {
        double d2 = d * this.mTotalLength;
        int r1 = 0;
        while (true) {
            double[] dArr2 = this.mCurveLength;
            if (r1 >= dArr2.length - 1) {
                break;
            }
            double d3 = dArr2[r1];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            r1++;
        }
        for (int r0 = 0; r0 < dArr.length; r0++) {
            dArr[r0] = this.mCurve[r0][r1].eval(d2 / this.mCurveLength[r1]);
        }
    }

    public void getPos(double d, float[] fArr) {
        double d2 = d * this.mTotalLength;
        int r1 = 0;
        while (true) {
            double[] dArr = this.mCurveLength;
            if (r1 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[r1];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            r1++;
        }
        for (int r0 = 0; r0 < fArr.length; r0++) {
            fArr[r0] = (float) this.mCurve[r0][r1].eval(d2 / this.mCurveLength[r1]);
        }
    }

    public double getPos(double d, int r8) {
        double[] dArr;
        double d2 = d * this.mTotalLength;
        int r0 = 0;
        while (true) {
            dArr = this.mCurveLength;
            if (r0 >= dArr.length - 1) {
                break;
            }
            double d3 = dArr[r0];
            if (d3 >= d2) {
                break;
            }
            d2 -= d3;
            r0++;
        }
        return this.mCurve[r8][r0].eval(d2 / dArr[r0]);
    }

    public double approxLength(Cubic[] cubicArr) {
        int r11;
        int length = cubicArr.length;
        double[] dArr = new double[cubicArr.length];
        double d = AudioStats.AUDIO_AMPLITUDE_NONE;
        double d2 = 0.0d;
        double dSqrt = 0.0d;
        while (true) {
            r11 = 0;
            if (d2 >= 1.0d) {
                break;
            }
            double d3 = 0.0d;
            while (r11 < cubicArr.length) {
                double d4 = dArr[r11];
                double dEval = cubicArr[r11].eval(d2);
                dArr[r11] = dEval;
                double d5 = d4 - dEval;
                d3 += d5 * d5;
                r11++;
            }
            if (d2 > AudioStats.AUDIO_AMPLITUDE_NONE) {
                dSqrt += Math.sqrt(d3);
            }
            d2 += 0.1d;
        }
        while (r11 < cubicArr.length) {
            double d6 = dArr[r11];
            double dEval2 = cubicArr[r11].eval(1.0d);
            dArr[r11] = dEval2;
            double d7 = d6 - dEval2;
            d += d7 * d7;
            r11++;
        }
        return dSqrt + Math.sqrt(d);
    }

    static Cubic[] calcNaturalCubic(int r23, double[] dArr) {
        double[] dArr2 = new double[r23];
        double[] dArr3 = new double[r23];
        double[] dArr4 = new double[r23];
        int r4 = r23 - 1;
        int r7 = 0;
        dArr2[0] = 0.5d;
        int r5 = 1;
        for (int r6 = 1; r6 < r4; r6++) {
            dArr2[r6] = 1.0d / (4.0d - dArr2[r6 - 1]);
        }
        int r0 = r23 - 2;
        dArr2[r4] = 1.0d / (2.0d - dArr2[r0]);
        dArr3[0] = (dArr[1] - dArr[0]) * 3.0d * dArr2[0];
        while (r5 < r4) {
            int r8 = r5 + 1;
            int r14 = r5 - 1;
            dArr3[r5] = (((dArr[r8] - dArr[r14]) * 3.0d) - dArr3[r14]) * dArr2[r5];
            r5 = r8;
        }
        double d = (((dArr[r4] - dArr[r0]) * 3.0d) - dArr3[r0]) * dArr2[r4];
        dArr3[r4] = d;
        dArr4[r4] = d;
        while (r0 >= 0) {
            dArr4[r0] = dArr3[r0] - (dArr2[r0] * dArr4[r0 + 1]);
            r0--;
        }
        Cubic[] cubicArr = new Cubic[r4];
        while (r7 < r4) {
            double d2 = dArr[r7];
            double d3 = dArr4[r7];
            int r2 = r7 + 1;
            double d4 = dArr[r2];
            double d5 = dArr4[r2];
            cubicArr[r7] = new Cubic((float) d2, d3, (((d4 - d2) * 3.0d) - (d3 * 2.0d)) - d5, ((d2 - d4) * 2.0d) + d3 + d5);
            r7 = r2;
        }
        return cubicArr;
    }

    public static class Cubic {
        double mA;
        double mB;
        double mC;
        double mD;

        public Cubic(double d, double d2, double d3, double d4) {
            this.mA = d;
            this.mB = d2;
            this.mC = d3;
            this.mD = d4;
        }

        public double eval(double d) {
            return (((((this.mD * d) + this.mC) * d) + this.mB) * d) + this.mA;
        }

        public double vel(double d) {
            return (((this.mD * 3.0d * d) + (this.mC * 2.0d)) * d) + this.mB;
        }
    }
}
