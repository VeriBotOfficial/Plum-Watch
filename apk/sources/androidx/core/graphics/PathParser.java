package androidx.core.graphics;

import android.graphics.Path;
import android.util.Log;
import androidx.camera.video.AudioStats;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class PathParser {
    private static final String LOGTAG = "PathParser";

    static float[] copyOfRange(float[] fArr, int r3, int r4) {
        if (r3 > r4) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (r3 < 0 || r3 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int r5 = r4 - r3;
        int r0 = Math.min(r5, length - r3);
        float[] fArr2 = new float[r5];
        System.arraycopy(fArr, r3, fArr2, 0, r0);
        return fArr2;
    }

    public static Path createPathFromPathData(String str) {
        Path path = new Path();
        try {
            PathDataNode.nodesToPath(createNodesFromPathData(str), path);
            return path;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error in parsing " + str, e);
        }
    }

    public static PathDataNode[] createNodesFromPathData(String str) {
        ArrayList arrayList = new ArrayList();
        int r4 = 0;
        int r3 = 1;
        while (r3 < str.length()) {
            int r5 = nextStart(str, r3);
            String strTrim = str.substring(r4, r5).trim();
            if (!strTrim.isEmpty()) {
                addNode(arrayList, strTrim.charAt(0), getFloats(strTrim));
            }
            r4 = r5;
            r3 = r5 + 1;
        }
        if (r3 - r4 == 1 && r4 < str.length()) {
            addNode(arrayList, str.charAt(r4), new float[0]);
        }
        return (PathDataNode[]) arrayList.toArray(new PathDataNode[0]);
    }

    public static PathDataNode[] deepCopyNodes(PathDataNode[] pathDataNodeArr) {
        PathDataNode[] pathDataNodeArr2 = new PathDataNode[pathDataNodeArr.length];
        for (int r1 = 0; r1 < pathDataNodeArr.length; r1++) {
            pathDataNodeArr2[r1] = new PathDataNode(pathDataNodeArr[r1]);
        }
        return pathDataNodeArr2;
    }

    public static boolean canMorph(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        if (pathDataNodeArr == null || pathDataNodeArr2 == null || pathDataNodeArr.length != pathDataNodeArr2.length) {
            return false;
        }
        for (int r1 = 0; r1 < pathDataNodeArr.length; r1++) {
            if (pathDataNodeArr[r1].mType != pathDataNodeArr2[r1].mType || pathDataNodeArr[r1].mParams.length != pathDataNodeArr2[r1].mParams.length) {
                return false;
            }
        }
        return true;
    }

    public static void updateNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2) {
        for (int r1 = 0; r1 < pathDataNodeArr2.length; r1++) {
            pathDataNodeArr[r1].mType = pathDataNodeArr2[r1].mType;
            for (int r2 = 0; r2 < pathDataNodeArr2[r1].mParams.length; r2++) {
                pathDataNodeArr[r1].mParams[r2] = pathDataNodeArr2[r1].mParams[r2];
            }
        }
    }

    private static int nextStart(String str, int r4) {
        while (r4 < str.length()) {
            char cCharAt = str.charAt(r4);
            if (((cCharAt - 'A') * (cCharAt - 'Z') <= 0 || (cCharAt - 'a') * (cCharAt - 'z') <= 0) && cCharAt != 'e' && cCharAt != 'E') {
                return r4;
            }
            r4++;
        }
        return r4;
    }

    private static void addNode(ArrayList<PathDataNode> arrayList, char c, float[] fArr) {
        arrayList.add(new PathDataNode(c, fArr));
    }

    private static class ExtractFloatResult {
        int mEndPosition;
        boolean mEndWithNegOrDot;

        ExtractFloatResult() {
        }
    }

    private static float[] getFloats(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        try {
            float[] fArr = new float[str.length()];
            ExtractFloatResult extractFloatResult = new ExtractFloatResult();
            int length = str.length();
            int r4 = 1;
            int r5 = 0;
            while (r4 < length) {
                extract(str, r4, extractFloatResult);
                int r6 = extractFloatResult.mEndPosition;
                if (r4 < r6) {
                    fArr[r5] = Float.parseFloat(str.substring(r4, r6));
                    r5++;
                }
                r4 = extractFloatResult.mEndWithNegOrDot ? r6 : r6 + 1;
            }
            return copyOfRange(fArr, 0, r5);
        } catch (NumberFormatException e) {
            throw new RuntimeException("error in parsing \"" + str + "\"", e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:21:0x0035  */
    private static void extract(String str, int r9, ExtractFloatResult extractFloatResult) {
        extractFloatResult.mEndWithNegOrDot = false;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (int r1 = r9; r1 < str.length(); r1++) {
            char cCharAt = str.charAt(r1);
            if (cCharAt == ' ') {
                z = false;
                z3 = true;
            } else if (cCharAt != 'E' && cCharAt != 'e') {
                switch (cCharAt) {
                    case ',':
                        z = false;
                        z3 = true;
                        break;
                    case '-':
                        if (r1 == r9 || z) {
                            z = false;
                        } else {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        }
                        break;
                    case '.':
                        if (z2) {
                            extractFloatResult.mEndWithNegOrDot = true;
                            z = false;
                            z3 = true;
                        } else {
                            z = false;
                            z2 = true;
                        }
                        break;
                    default:
                        z = false;
                        break;
                }
            } else {
                z = true;
            }
            if (z3) {
                extractFloatResult.mEndPosition = r1;
            }
        }
        extractFloatResult.mEndPosition = r1;
    }

    public static void interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, float f, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3) {
        if (!interpolatePathDataNodes(pathDataNodeArr, pathDataNodeArr2, pathDataNodeArr3, f)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
    }

    @Deprecated
    public static boolean interpolatePathDataNodes(PathDataNode[] pathDataNodeArr, PathDataNode[] pathDataNodeArr2, PathDataNode[] pathDataNodeArr3, float f) {
        if (pathDataNodeArr.length != pathDataNodeArr2.length || pathDataNodeArr2.length != pathDataNodeArr3.length) {
            throw new IllegalArgumentException("The nodes to be interpolated and resulting nodes must have the same length");
        }
        if (!canMorph(pathDataNodeArr2, pathDataNodeArr3)) {
            return false;
        }
        for (int r1 = 0; r1 < pathDataNodeArr.length; r1++) {
            pathDataNodeArr[r1].interpolatePathDataNode(pathDataNodeArr2[r1], pathDataNodeArr3[r1], f);
        }
        return true;
    }

    public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
        float[] fArr = new float[6];
        char c = 'm';
        for (PathDataNode pathDataNode : pathDataNodeArr) {
            PathDataNode.addCommand(path, fArr, c, pathDataNode.mType, pathDataNode.mParams);
            c = pathDataNode.mType;
        }
    }

    public static class PathDataNode {
        private final float[] mParams;
        private char mType;

        public char getType() {
            return this.mType;
        }

        public float[] getParams() {
            return this.mParams;
        }

        PathDataNode(char c, float[] fArr) {
            this.mType = c;
            this.mParams = fArr;
        }

        PathDataNode(PathDataNode pathDataNode) {
            this.mType = pathDataNode.mType;
            float[] fArr = pathDataNode.mParams;
            this.mParams = PathParser.copyOfRange(fArr, 0, fArr.length);
        }

        @Deprecated
        public static void nodesToPath(PathDataNode[] pathDataNodeArr, Path path) {
            PathParser.nodesToPath(pathDataNodeArr, path);
        }

        public void interpolatePathDataNode(PathDataNode pathDataNode, PathDataNode pathDataNode2, float f) {
            this.mType = pathDataNode.mType;
            int r0 = 0;
            while (true) {
                float[] fArr = pathDataNode.mParams;
                if (r0 >= fArr.length) {
                    return;
                }
                this.mParams[r0] = (fArr[r0] * (1.0f - f)) + (pathDataNode2.mParams[r0] * f);
                r0++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static void addCommand(Path path, float[] fArr, char c, char c2, float[] fArr2) {
            int r6;
            int r19;
            int r24;
            float f;
            float f2;
            float f3;
            float f4;
            float f5;
            float f6;
            float f7;
            float f8;
            char c3 = c2;
            boolean z = false;
            float f9 = fArr[0];
            float f10 = fArr[1];
            float f11 = fArr[2];
            float f12 = fArr[3];
            float f13 = fArr[4];
            float f14 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    r6 = 7;
                    r19 = r6;
                    break;
                case 'C':
                case 'c':
                    r6 = 6;
                    r19 = r6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    r19 = 1;
                    break;
                case 'L':
                case 'M':
                case 'T':
                case 'l':
                case 'm':
                case 't':
                default:
                    r19 = 2;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    r19 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f13, f14);
                    f9 = f13;
                    f11 = f9;
                    f10 = f14;
                    f12 = f10;
                    r19 = 2;
                    break;
            }
            float f15 = f9;
            float f16 = f10;
            float f17 = f13;
            float f18 = f14;
            int r7 = 0;
            char c4 = c;
            while (r7 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 == 'C') {
                        r24 = r7;
                        int r8 = r24 + 2;
                        int r9 = r24 + 3;
                        int r10 = r24 + 4;
                        int r11 = r24 + 5;
                        path.cubicTo(fArr2[r24], fArr2[r24 + 1], fArr2[r8], fArr2[r9], fArr2[r10], fArr2[r11]);
                        f15 = fArr2[r10];
                        float f19 = fArr2[r11];
                        float f20 = fArr2[r8];
                        float f21 = fArr2[r9];
                        f16 = f19;
                        f12 = f21;
                        f11 = f20;
                    } else if (c3 == 'H') {
                        r24 = r7;
                        path.lineTo(fArr2[r24], f16);
                        f15 = fArr2[r24];
                    } else if (c3 == 'Q') {
                        r24 = r7;
                        int r12 = r24 + 1;
                        int r2 = r24 + 2;
                        int r4 = r24 + 3;
                        path.quadTo(fArr2[r24], fArr2[r12], fArr2[r2], fArr2[r4]);
                        float f22 = fArr2[r24];
                        float f23 = fArr2[r12];
                        f15 = fArr2[r2];
                        f16 = fArr2[r4];
                        f11 = f22;
                        f12 = f23;
                    } else if (c3 == 'V') {
                        r24 = r7;
                        path.lineTo(f15, fArr2[r24]);
                        f16 = fArr2[r24];
                    } else if (c3 != 'a') {
                        if (c3 != 'c') {
                            if (c3 == 'h') {
                                path.rLineTo(fArr2[r7], 0.0f);
                                f15 += fArr2[r7];
                            } else if (c3 != 'q') {
                                if (c3 == 'v') {
                                    path.rLineTo(0.0f, fArr2[r7]);
                                    f4 = fArr2[r7];
                                } else if (c3 == 'L') {
                                    int r1 = r7 + 1;
                                    path.lineTo(fArr2[r7], fArr2[r1]);
                                    f15 = fArr2[r7];
                                    f16 = fArr2[r1];
                                } else if (c3 == 'M') {
                                    f15 = fArr2[r7];
                                    f16 = fArr2[r7 + 1];
                                    if (r7 > 0) {
                                        path.lineTo(f15, f16);
                                    } else {
                                        path.moveTo(f15, f16);
                                        r24 = r7;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 'S') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    float f24 = f15;
                                    int r13 = r7 + 1;
                                    int r14 = r7 + 2;
                                    int r15 = r7 + 3;
                                    path.cubicTo(f24, f16, fArr2[r7], fArr2[r13], fArr2[r14], fArr2[r15]);
                                    f = fArr2[r7];
                                    f2 = fArr2[r13];
                                    f15 = fArr2[r14];
                                    f16 = fArr2[r15];
                                    f11 = f;
                                    f12 = f2;
                                } else if (c3 == 'T') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f15 = (f15 * 2.0f) - f11;
                                        f16 = (f16 * 2.0f) - f12;
                                    }
                                    int r3 = r7 + 1;
                                    path.quadTo(f15, f16, fArr2[r7], fArr2[r3]);
                                    r24 = r7;
                                    f12 = f16;
                                    f11 = f15;
                                    f15 = fArr2[r7];
                                    f16 = fArr2[r3];
                                } else if (c3 == 'l') {
                                    int r5 = r7 + 1;
                                    path.rLineTo(fArr2[r7], fArr2[r5]);
                                    f15 += fArr2[r7];
                                    f4 = fArr2[r5];
                                } else if (c3 == 'm') {
                                    float f25 = fArr2[r7];
                                    f15 += f25;
                                    float f26 = fArr2[r7 + 1];
                                    f16 += f26;
                                    if (r7 > 0) {
                                        path.rLineTo(f25, f26);
                                    } else {
                                        path.rMoveTo(f25, f26);
                                        r24 = r7;
                                        f18 = f16;
                                        f17 = f15;
                                    }
                                } else if (c3 == 's') {
                                    if (c4 == 'c' || c4 == 's' || c4 == 'C' || c4 == 'S') {
                                        float f27 = f15 - f11;
                                        f5 = f16 - f12;
                                        f6 = f27;
                                    } else {
                                        f6 = 0.0f;
                                        f5 = 0.0f;
                                    }
                                    int r16 = r7 + 1;
                                    int r17 = r7 + 2;
                                    int r18 = r7 + 3;
                                    path.rCubicTo(f6, f5, fArr2[r7], fArr2[r16], fArr2[r17], fArr2[r18]);
                                    f = fArr2[r7] + f15;
                                    f2 = fArr2[r16] + f16;
                                    f15 += fArr2[r17];
                                    f3 = fArr2[r18];
                                } else if (c3 == 't') {
                                    if (c4 == 'q' || c4 == 't' || c4 == 'Q' || c4 == 'T') {
                                        f7 = f15 - f11;
                                        f8 = f16 - f12;
                                    } else {
                                        f8 = 0.0f;
                                        f7 = 0.0f;
                                    }
                                    int r20 = r7 + 1;
                                    path.rQuadTo(f7, f8, fArr2[r7], fArr2[r20]);
                                    float f28 = f7 + f15;
                                    float f29 = f8 + f16;
                                    f15 += fArr2[r7];
                                    f16 += fArr2[r20];
                                    f12 = f29;
                                    f11 = f28;
                                }
                                f16 += f4;
                            } else {
                                int r21 = r7 + 1;
                                int r22 = r7 + 2;
                                int r23 = r7 + 3;
                                path.rQuadTo(fArr2[r7], fArr2[r21], fArr2[r22], fArr2[r23]);
                                f = fArr2[r7] + f15;
                                f2 = fArr2[r21] + f16;
                                f15 += fArr2[r22];
                                f3 = fArr2[r23];
                            }
                            r24 = r7;
                        } else {
                            int r110 = r7 + 2;
                            int r111 = r7 + 3;
                            int r112 = r7 + 4;
                            int r25 = r7 + 5;
                            path.rCubicTo(fArr2[r7], fArr2[r7 + 1], fArr2[r110], fArr2[r111], fArr2[r112], fArr2[r25]);
                            f = fArr2[r110] + f15;
                            f2 = fArr2[r111] + f16;
                            f15 += fArr2[r112];
                            f3 = fArr2[r25];
                        }
                        f16 += f3;
                        f11 = f;
                        f12 = f2;
                        r24 = r7;
                    } else {
                        int r113 = r7 + 5;
                        int r114 = r7 + 6;
                        r24 = r7;
                        drawArc(path, f15, f16, fArr2[r113] + f15, fArr2[r114] + f16, fArr2[r7], fArr2[r7 + 1], fArr2[r7 + 2], fArr2[r7 + 3] != 0.0f, fArr2[r7 + 4] != 0.0f);
                        f15 += fArr2[r113];
                        f16 += fArr2[r114];
                    }
                    r7 = r24 + r19;
                    c4 = c2;
                    c3 = c4;
                    z = false;
                } else {
                    r24 = r7;
                    int r115 = r24 + 5;
                    int r116 = r24 + 6;
                    drawArc(path, f15, f16, fArr2[r115], fArr2[r116], fArr2[r24], fArr2[r24 + 1], fArr2[r24 + 2], fArr2[r24 + 3] != 0.0f, fArr2[r24 + 4] != 0.0f);
                    f15 = fArr2[r115];
                    f16 = fArr2[r116];
                }
                f12 = f16;
                f11 = f15;
                r7 = r24 + r19;
                c4 = c2;
                c3 = c4;
                z = false;
            }
            fArr[z ? 1 : 0] = f15;
            fArr[1] = f16;
            fArr[2] = f11;
            fArr[3] = f12;
            fArr[4] = f17;
            fArr[5] = f18;
        }

        private static void drawArc(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
            double d;
            double d2;
            double radians = Math.toRadians(f7);
            double dCos = Math.cos(radians);
            double dSin = Math.sin(radians);
            double d3 = f;
            double d4 = d3 * dCos;
            double d5 = f2;
            double d6 = f5;
            double d7 = (d4 + (d5 * dSin)) / d6;
            double d8 = (((double) (-f)) * dSin) + (d5 * dCos);
            double d9 = f6;
            double d10 = d8 / d9;
            double d11 = f4;
            double d12 = ((((double) f3) * dCos) + (d11 * dSin)) / d6;
            double d13 = ((((double) (-f3)) * dSin) + (d11 * dCos)) / d9;
            double d14 = d7 - d12;
            double d15 = d10 - d13;
            double d16 = (d7 + d12) / 2.0d;
            double d17 = (d10 + d13) / 2.0d;
            double d18 = (d14 * d14) + (d15 * d15);
            if (d18 == AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, " Points are coincident");
                return;
            }
            double d19 = (1.0d / d18) - 0.25d;
            if (d19 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                Log.w(PathParser.LOGTAG, "Points are too far apart " + d18);
                float fSqrt = (float) (Math.sqrt(d18) / 1.99999d);
                drawArc(path, f, f2, f3, f4, f5 * fSqrt, f6 * fSqrt, f7, z, z2);
                return;
            }
            double dSqrt = Math.sqrt(d19);
            double d20 = d14 * dSqrt;
            double d21 = dSqrt * d15;
            if (z == z2) {
                d = d16 - d21;
                d2 = d17 + d20;
            } else {
                d = d16 + d21;
                d2 = d17 - d20;
            }
            double dAtan2 = Math.atan2(d10 - d2, d7 - d);
            double dAtan3 = Math.atan2(d13 - d2, d12 - d) - dAtan2;
            if (z2 != (dAtan3 >= AudioStats.AUDIO_AMPLITUDE_NONE)) {
                dAtan3 = dAtan3 > AudioStats.AUDIO_AMPLITUDE_NONE ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
            }
            double d22 = d * d6;
            double d23 = d2 * d9;
            arcToBezier(path, (d22 * dCos) - (d23 * dSin), (d22 * dSin) + (d23 * dCos), d6, d9, d3, d5, radians, dAtan2, dAtan3);
        }

        private static void arcToBezier(Path path, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9) {
            double d10 = d3;
            int r4 = (int) Math.ceil(Math.abs((d9 * 4.0d) / 3.141592653589793d));
            double dCos = Math.cos(d7);
            double dSin = Math.sin(d7);
            double dCos2 = Math.cos(d8);
            double dSin2 = Math.sin(d8);
            double d11 = -d10;
            double d12 = d11 * dCos;
            double d13 = d4 * dSin;
            double d14 = (d12 * dSin2) - (d13 * dCos2);
            double d15 = d11 * dSin;
            double d16 = d4 * dCos;
            double d17 = (dSin2 * d15) + (dCos2 * d16);
            double d18 = d9 / ((double) r4);
            double d19 = d17;
            double d20 = d14;
            int r2 = 0;
            double d21 = d5;
            double d22 = d6;
            double d23 = d8;
            while (r2 < r4) {
                double d24 = d23 + d18;
                double dSin3 = Math.sin(d24);
                double dCos3 = Math.cos(d24);
                double d25 = (d + ((d10 * dCos) * dCos3)) - (d13 * dSin3);
                double d26 = d2 + (d10 * dSin * dCos3) + (d16 * dSin3);
                double d27 = (d12 * dSin3) - (d13 * dCos3);
                double d28 = (dSin3 * d15) + (dCos3 * d16);
                double d29 = d24 - d23;
                double dTan = Math.tan(d29 / 2.0d);
                double dSin4 = (Math.sin(d29) * (Math.sqrt(((dTan * 3.0d) * dTan) + 4.0d) - 1.0d)) / 3.0d;
                double d30 = d21 + (d20 * dSin4);
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) d30, (float) (d22 + (d19 * dSin4)), (float) (d25 - (dSin4 * d27)), (float) (d26 - (dSin4 * d28)), (float) d25, (float) d26);
                r2++;
                d18 = d18;
                dSin = dSin;
                d21 = d25;
                d15 = d15;
                dCos = dCos;
                d23 = d24;
                d19 = d28;
                d20 = d27;
                r4 = r4;
                d22 = d26;
                d10 = d3;
            }
        }
    }

    private PathParser() {
    }
}
