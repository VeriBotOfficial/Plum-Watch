package com.anythink.core.common.s.a;

import java.util.LinkedHashSet;
import java.util.Set;

/* loaded from: classes12.dex */
final class k implements com.anythink.core.common.s.a.a.b<Set<String>> {

    /* renamed from: a, reason: collision with root package name */
    static final k f4324a = new k();

    @Override // com.anythink.core.common.s.a.a.b
    public final /* synthetic */ byte[] a(Set<String> set) {
        Set<String> set2 = set;
        if (set2.isEmpty()) {
            return new byte[0];
        }
        int size = set2.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set2) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int b = f.b(str);
                strArr[i2] = str;
                iArr[i2] = b;
                i += ((b >> 7) == 0 ? 1 : (b >> 14) == 0 ? 2 : (b >> 21) == 0 ? 3 : (b >> 28) == 0 ? 4 : 5) + b;
            }
            i2++;
        }
        f fVar = new f(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = fVar.b;
            int i6 = i4;
            while ((i6 & com.alipay.sdk.m.p.a.g) != 0) {
                fVar.f4316a[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            fVar.f4316a[i5] = (byte) i6;
            fVar.b = i5 + 1;
            if (i4 >= 0) {
                fVar.a(strArr[i3]);
            }
        }
        return fVar.f4316a;
    }

    private k() {
    }

    @Override // com.anythink.core.common.s.a.a.b
    public final String a() {
        return "StringSet";
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private static byte[] a2(Set<String> set) {
        if (set.isEmpty()) {
            return new byte[0];
        }
        int size = set.size();
        int[] iArr = new int[size];
        String[] strArr = new String[size];
        int i = 0;
        int i2 = 0;
        for (String str : set) {
            if (str == null) {
                i += 5;
                iArr[i2] = -1;
            } else {
                int b = f.b(str);
                strArr[i2] = str;
                iArr[i2] = b;
                i += ((b >> 7) == 0 ? 1 : (b >> 14) == 0 ? 2 : (b >> 21) == 0 ? 3 : (b >> 28) == 0 ? 4 : 5) + b;
            }
            i2++;
        }
        f fVar = new f(i);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            int i5 = fVar.b;
            int i6 = i4;
            while ((i6 & com.alipay.sdk.m.p.a.g) != 0) {
                fVar.f4316a[i5] = (byte) ((i6 & 127) | 128);
                i6 >>>= 7;
                i5++;
            }
            fVar.f4316a[i5] = (byte) i6;
            fVar.b = i5 + 1;
            if (i4 >= 0) {
                fVar.a(strArr[i3]);
            }
        }
        return fVar.f4316a;
    }

    private static Set<String> b(byte[] bArr, int i, int i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            f fVar = new f(bArr, i);
            int i3 = i + i2;
            while (fVar.b < i3) {
                byte[] bArr2 = fVar.f4316a;
                int i4 = fVar.b;
                fVar.b = i4 + 1;
                int i5 = bArr2[i4];
                if ((i5 >> 7) != 0) {
                    byte[] bArr3 = fVar.f4316a;
                    int i6 = fVar.b;
                    fVar.b = i6 + 1;
                    i5 = (i5 & 127) | (bArr3[i6] << 7);
                    if ((i5 >> 14) != 0) {
                        byte[] bArr4 = fVar.f4316a;
                        int i7 = fVar.b;
                        fVar.b = i7 + 1;
                        i5 = (i5 & 16383) | (bArr4[i7] << 14);
                        if ((i5 >> 21) != 0) {
                            byte[] bArr5 = fVar.f4316a;
                            int i8 = fVar.b;
                            fVar.b = i8 + 1;
                            i5 = (i5 & 2097151) | (bArr5[i8] << 21);
                            if ((i5 >> 28) != 0) {
                                byte[] bArr6 = fVar.f4316a;
                                int i9 = fVar.b;
                                fVar.b = i9 + 1;
                                i5 = (i5 & 268435455) | (bArr6[i9] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(fVar.d(i5));
            }
            if (fVar.b != i3) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }

    @Override // com.anythink.core.common.s.a.a.b
    public final /* synthetic */ Set<String> a(byte[] bArr, int i, int i2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (i2 > 0) {
            f fVar = new f(bArr, i);
            int i3 = i + i2;
            while (fVar.b < i3) {
                byte[] bArr2 = fVar.f4316a;
                int i4 = fVar.b;
                fVar.b = i4 + 1;
                int i5 = bArr2[i4];
                if ((i5 >> 7) != 0) {
                    byte[] bArr3 = fVar.f4316a;
                    int i6 = fVar.b;
                    fVar.b = i6 + 1;
                    i5 = (i5 & 127) | (bArr3[i6] << 7);
                    if ((i5 >> 14) != 0) {
                        byte[] bArr4 = fVar.f4316a;
                        int i7 = fVar.b;
                        fVar.b = i7 + 1;
                        i5 = (i5 & 16383) | (bArr4[i7] << 14);
                        if ((i5 >> 21) != 0) {
                            byte[] bArr5 = fVar.f4316a;
                            int i8 = fVar.b;
                            fVar.b = i8 + 1;
                            i5 = (i5 & 2097151) | (bArr5[i8] << 21);
                            if ((i5 >> 28) != 0) {
                                byte[] bArr6 = fVar.f4316a;
                                int i9 = fVar.b;
                                fVar.b = i9 + 1;
                                i5 = (i5 & 268435455) | (bArr6[i9] << 28);
                            }
                        }
                    }
                }
                linkedHashSet.add(fVar.d(i5));
            }
            if (fVar.b != i3) {
                throw new IllegalArgumentException("Invalid String set");
            }
        }
        return linkedHashSet;
    }
}
