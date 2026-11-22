package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.C2967a;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: Code128Reader.java */
/* loaded from: classes14.dex */
public final class P extends Y {

    /* renamed from: a, reason: collision with root package name */
    public static final int[][] f10588a = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};

    private static boolean a(C3070x c3070x, int i, int i2) {
        return c3070x.a(i, i2, false, false);
    }

    private static float b(C3070x c3070x, int[] iArr, int i) {
        int[] iArr2 = new int[7];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        for (int i2 : iArr) {
            i += i2;
        }
        boolean z = true;
        int i3 = 0;
        while (z && i < c3070x.d()) {
            if (c3070x.a(i)) {
                i3++;
                i++;
            } else {
                iArr2[6] = i3;
                z = false;
            }
        }
        int[][] iArr3 = f10588a;
        return Y.a(iArr2, iArr3[iArr3.length - 1], 0.7f);
    }

    private int[] c(StringBuilder sb, int[] iArr) throws C2967a {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = iArr[0];
        int i9 = 1;
        if (iArr[1] == 1) {
            i = 1;
        } else {
            i = 1;
            i9 = 0;
        }
        if (iArr[2] == i) {
            i2 = i;
        } else {
            i2 = i;
            i = 0;
        }
        int i10 = iArr[3] == i2 ? i2 : 0;
        int i11 = iArr[4];
        if (iArr[5] == i2) {
            i3 = i11;
            i4 = i2;
        } else {
            i3 = i11;
            i4 = 0;
        }
        int i12 = iArr[6] == i2 ? i2 : 0;
        if (i8 >= 100) {
            int i13 = i8 == 106 ? i10 : 0;
            if (i8 != 106) {
                switch (i8) {
                    case 100:
                        i6 = i12;
                        i7 = i13;
                        i5 = 100;
                        return new int[]{i8, i9, i, i7, i5, i4, i6};
                    case 101:
                        i5 = 101;
                        i6 = i12;
                        break;
                    case 102:
                        i7 = i13;
                        break;
                    default:
                        throw C2967a.a();
                }
            } else {
                i5 = i3;
                i6 = i2;
            }
            i7 = i13;
            return new int[]{i8, i9, i, i7, i5, i4, i6};
        }
        if (i8 < 10) {
            sb.append('0');
        }
        sb.append(i8);
        i7 = i10;
        i5 = i3;
        i6 = i12;
        return new int[]{i8, i9, i, i7, i5, i4, i6};
    }

    private static int[] a(C3070x c3070x) throws C2967a {
        int d = c3070x.d();
        int b = c3070x.b(0);
        int[] iArr = new int[6];
        boolean z = false;
        int i = 0;
        int i2 = b;
        while (b < d) {
            if (c3070x.a(b) != z) {
                iArr[i] = iArr[i] + 1;
            } else {
                if (i == 5) {
                    int i3 = -1;
                    float f = 0.25f;
                    for (int i4 = 103; i4 <= 105; i4++) {
                        float a2 = Y.a(iArr, f10588a[i4], 0.7f);
                        if (a2 < f) {
                            i3 = i4;
                            f = a2;
                        }
                    }
                    if (i3 >= 0) {
                        return new int[]{i2, b, i3};
                    }
                    i2 += iArr[0] + iArr[1];
                    int i5 = i - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i5);
                    iArr[i5] = 0;
                    iArr[i] = 0;
                    i--;
                } else {
                    i++;
                }
                iArr[i] = 1;
                z = !z;
            }
            b++;
        }
        throw C2967a.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] b(StringBuilder sb, int[] iArr) throws C2967a {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1] == 1 ? 1 : 0;
        int i9 = iArr[2] == 1 ? 1 : 0;
        int i10 = iArr[3] == 1 ? 1 : 0;
        int i11 = iArr[4];
        int i12 = iArr[5] == 1 ? 1 : 0;
        int i13 = iArr[6] == 1 ? 1 : 0;
        if (i6 >= 96) {
            if (i6 != 106) {
                i10 = 0;
            }
            if (i6 != 106) {
                switch (i6) {
                    case 96:
                    case 97:
                    case 102:
                        i7 = i8;
                        break;
                    case 98:
                        i = i13;
                        i5 = 1;
                        i7 = i8;
                        i2 = i9;
                        i3 = i10;
                        i4 = 101;
                        break;
                    case 99:
                        i11 = 99;
                        i7 = i8;
                        break;
                    case 100:
                        if (i9 == 0 && i8 != 0) {
                            i2 = 1;
                            i3 = i10;
                            i4 = i11;
                            i5 = i12;
                            i = i13;
                            i7 = 0;
                            break;
                        } else if (i9 != 0 && i8 != 0) {
                            i7 = 0;
                            i2 = 0;
                            i3 = i10;
                            i4 = i11;
                            i5 = i12;
                            i = i13;
                            break;
                        }
                        break;
                    case 101:
                        i7 = i8;
                        i2 = i9;
                        i3 = i10;
                        i5 = i12;
                        i4 = 101;
                        i = i13;
                        break;
                    default:
                        throw C2967a.a();
                }
            } else {
                int i14 = i12;
                i = 1;
                i7 = i8;
                i2 = i9;
                i3 = i10;
                i4 = i11;
                i5 = i14;
            }
            return new int[]{i6, i7, i2, i3, i4, i5, i};
        }
        if (i8 == i9) {
            sb.append((char) (i6 + 32));
        } else {
            sb.append((char) (i6 + 160));
        }
        i7 = 0;
        i2 = i9;
        i3 = i10;
        i4 = i11;
        i5 = i12;
        i = i13;
        return new int[]{i6, i7, i2, i3, i4, i5, i};
    }

    private static int a(C3070x c3070x, int[] iArr, int i) throws C2967a {
        float a2;
        Y.a(c3070x, i, iArr);
        float f = 0.25f;
        int i2 = -1;
        int i3 = 0;
        while (true) {
            int[][] iArr2 = f10588a;
            if (i3 >= iArr2.length) {
                break;
            }
            int[] iArr3 = iArr2[i3];
            if (i3 == iArr2.length - 1) {
                a2 = b(c3070x, iArr, i);
            } else {
                a2 = Y.a(iArr, iArr3, 0.7f);
            }
            if (a2 < f) {
                i2 = i3;
                f = a2;
            }
            i3++;
        }
        if (i2 >= 0) {
            return i2;
        }
        throw C2967a.a();
    }

    @Override // com.huawei.hms.scankit.p.Y
    public com.huawei.hms.scankit.aiscan.common.x a(int i, C3070x c3070x, Map<EnumC2970d, ?> map) throws C2967a {
        C3070x c3070x2;
        int[] a2 = a(c3070x);
        int i2 = a2[0];
        int i3 = i2 - (((a2[1] - i2) / 11) * 10);
        if (i3 <= 0 || i3 >= i2) {
            c3070x2 = c3070x;
        } else {
            c3070x2 = c3070x;
            if (!a(c3070x2, i3, i2)) {
                throw C2967a.a();
            }
        }
        int i4 = a2[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i4));
        int i5 = i4 == 103 ? 101 : i4 == 104 ? 100 : i4 == 105 ? 99 : 0;
        if (i5 != 0) {
            int i6 = i5;
            StringBuilder sb = new StringBuilder(20);
            int[] iArr = new int[7];
            iArr[6] = i6;
            a(sb, a2, iArr, i4, c3070x2, arrayList);
            int i7 = iArr[0];
            int i8 = iArr[1];
            int i9 = iArr[2];
            int i10 = iArr[3];
            int i11 = iArr[4];
            boolean z = iArr[5] == 1;
            int i12 = iArr[6];
            int i13 = i8 - i7;
            if ((i10 - (i11 * i9)) % 103 == i9) {
                int length = sb.length();
                if (length != 0) {
                    if (length > 0 && z) {
                        if (i12 == 99) {
                            sb.delete(length - 2, length);
                        } else {
                            sb.delete(length - 1, length);
                        }
                    }
                    float f = a2[0];
                    float f2 = i7 + ((i13 * 13) / 11);
                    int size = arrayList.size();
                    byte[] bArr = new byte[size];
                    for (int i14 = 0; i14 < size; i14++) {
                        bArr[i14] = arrayList.get(i14).byteValue();
                    }
                    float f3 = i;
                    return new com.huawei.hms.scankit.aiscan.common.x(sb.toString(), bArr, new com.huawei.hms.scankit.aiscan.common.z[]{new com.huawei.hms.scankit.aiscan.common.z(f, f3), new com.huawei.hms.scankit.aiscan.common.z(f2, f3)}, BarcodeFormat.CODE_128);
                }
                throw C2967a.a();
            }
            throw C2967a.a();
        }
        throw C2967a.a();
    }

    private void a(StringBuilder sb, int[] iArr, int[] iArr2, int i, C3070x c3070x, List<Byte> list) throws C2967a {
        int i2;
        int i3 = 0;
        int i4 = iArr[0];
        int i5 = 1;
        int i6 = iArr[1];
        int i7 = 6;
        int[] iArr3 = new int[6];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        int i16 = iArr2[6];
        int i17 = i6;
        int i18 = i4;
        int i19 = i;
        while (i8 == 0) {
            int i20 = i3;
            int a2 = a(c3070x, iArr3, i17);
            int i21 = i5;
            list.add(Byte.valueOf((byte) a2));
            if (a2 != 106) {
                i10++;
                i19 += i10 * a2;
                i15 = i21;
            }
            int i22 = i17;
            for (int i23 = i20; i23 < i7; i23++) {
                i22 += iArr3[i23];
            }
            if (a2 != 105) {
                int[] iArr4 = new int[7];
                iArr4[i20] = a2;
                iArr4[i21] = i11;
                iArr4[2] = i12;
                iArr4[3] = i15;
                iArr4[4] = i16;
                iArr4[5] = i20;
                iArr4[i7] = i8;
                if (i16 == 101) {
                    iArr4 = a(sb, iArr4);
                } else if (i16 == 100) {
                    iArr4 = b(sb, iArr4);
                } else if (i16 == 99) {
                    iArr4 = c(sb, iArr4);
                }
                int i24 = iArr4[i20];
                int i25 = iArr4[i21] == i21 ? i21 : i20;
                i12 = iArr4[2] == i21 ? i21 : i20;
                int i26 = iArr4[3] == i21 ? i21 : i20;
                int i27 = i7;
                int i28 = iArr4[5] == i21 ? i21 : i20;
                i8 = iArr4[i27] == i21 ? 1 : i20;
                if (i13 != 0) {
                    i2 = iArr4[4] == 101 ? 100 : 101;
                } else {
                    i2 = iArr4[4];
                }
                int i29 = i14;
                i14 = i24;
                i16 = i2;
                i9 = i29;
                i13 = i28;
                i11 = i25;
                i3 = i20;
                i7 = i27;
                i5 = 1;
                i15 = i26;
                i18 = i17;
                i17 = i22;
            } else {
                throw C2967a.a();
            }
        }
        iArr2[i3] = i18;
        iArr2[1] = i17;
        iArr2[2] = i9;
        iArr2[3] = i19;
        iArr2[4] = i10;
        iArr2[5] = i15;
        iArr2[i7] = i16;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int[] a(StringBuilder sb, int[] iArr) throws C2967a {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = iArr[0];
        int i7 = 1;
        int i8 = iArr[1] == 1 ? 1 : 0;
        int i9 = iArr[2] == 1 ? 1 : 0;
        int i10 = iArr[3] == 1 ? 1 : 0;
        int i11 = iArr[4];
        int i12 = iArr[5] == 1 ? 1 : 0;
        int i13 = iArr[6] == 1 ? 1 : 0;
        if (i6 < 64) {
            if (i8 == i9) {
                sb.append((char) (i6 + 32));
            } else {
                sb.append((char) (i6 + 160));
            }
        } else {
            if (i6 >= 96) {
                if (i6 != 106) {
                    i10 = 0;
                }
                if (i6 != 106) {
                    switch (i6) {
                        case 96:
                        case 97:
                        case 102:
                            i7 = i8;
                            i2 = i9;
                            i3 = i10;
                            i4 = i11;
                            i5 = i12;
                            i = i13;
                            break;
                        case 98:
                            i = i13;
                            i5 = 1;
                            i7 = i8;
                            i2 = i9;
                            i3 = i10;
                            i4 = 100;
                            break;
                        case 99:
                            i11 = 99;
                            i7 = i8;
                            i2 = i9;
                            i3 = i10;
                            i4 = i11;
                            i5 = i12;
                            i = i13;
                            break;
                        case 100:
                            i7 = i8;
                            i2 = i9;
                            i3 = i10;
                            i5 = i12;
                            i4 = 100;
                            i = i13;
                            break;
                        case 101:
                            if (i9 == 0 && i8 != 0) {
                                i2 = 1;
                                i3 = i10;
                                i4 = i11;
                                i5 = i12;
                                i = i13;
                                i7 = 0;
                                break;
                            } else {
                                if (i9 != 0 && i8 != 0) {
                                    i7 = 0;
                                    i2 = 0;
                                    i3 = i10;
                                    i4 = i11;
                                    i5 = i12;
                                    i = i13;
                                    break;
                                }
                                i2 = i9;
                                i3 = i10;
                                i4 = i11;
                                i5 = i12;
                                i = i13;
                            }
                        default:
                            throw C2967a.a();
                    }
                } else {
                    int i14 = i12;
                    i = 1;
                    i7 = i8;
                    i2 = i9;
                    i3 = i10;
                    i4 = i11;
                    i5 = i14;
                }
                return new int[]{i6, i7, i2, i3, i4, i5, i};
            }
            if (i8 == i9) {
                sb.append((char) (i6 - 64));
            } else {
                sb.append((char) (i6 + 64));
            }
        }
        i7 = 0;
        i2 = i9;
        i3 = i10;
        i4 = i11;
        i5 = i12;
        i = i13;
        return new int[]{i6, i7, i2, i3, i4, i5, i};
    }
}
