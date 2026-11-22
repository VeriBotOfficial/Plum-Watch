package com.anythink.core.common.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import androidx.core.view.MotionEventCompat;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.lang.reflect.Array;

/* loaded from: classes12.dex */
public final class h {

    public interface a {
        void a();

        void a(Bitmap bitmap);
    }

    public static int[] a(String str) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(String str, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static Bitmap a(FileDescriptor fileDescriptor, int i, int i2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i, i2);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeFileDescriptor(fileDescriptor, null, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static Bitmap a(Context context, int i, int i2, int i3) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeResource(context.getResources(), i, options);
            options.inSampleSize = a(options.outWidth, options.outHeight, i2, i3);
            options.inJustDecodeBounds = false;
            return BitmapFactory.decodeResource(context.getResources(), i, options);
        } catch (OutOfMemoryError e) {
            e.printStackTrace();
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    private static int a(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i3 <= 0 && i4 <= 0) {
            return 1;
        }
        while (i / i5 > i3 && i2 / i5 > i4) {
            i5 *= 2;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00cd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d5 A[Catch: all -> 0x00d8, TRY_LEAVE, TryCatch #15 {all -> 0x00d8, blocks: (B:62:0x00cf, B:64:0x00d5), top: B:61:0x00cf }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(android.content.Context r8, android.graphics.Bitmap r9) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.h.a(android.content.Context, android.graphics.Bitmap):android.graphics.Bitmap");
    }

    public static void a(final Context context, final Bitmap bitmap, final a aVar) {
        com.anythink.core.common.d.t.b();
        com.anythink.core.common.d.t.c(new Runnable() { // from class: com.anythink.core.common.v.h.1
            @Override // java.lang.Runnable
            public final void run() {
                final Bitmap a2 = h.a(context, bitmap);
                com.anythink.core.common.d.t.b().b(new Runnable() { // from class: com.anythink.core.common.v.h.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (aVar == null || a2 == null) {
                            return;
                        }
                        aVar.a(a2);
                    }
                });
            }
        });
    }

    private static Bitmap b(Bitmap bitmap) {
        char c;
        int i;
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int[] iArr6 = new int[173056];
        int i7 = 0;
        for (int i8 = 0; i8 < 173056; i8++) {
            iArr6[i8] = i8 / 676;
        }
        char c2 = 2;
        boolean z = true;
        char c3 = '3';
        int[][] iArr7 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 51, 3);
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            c = c2;
            i = 25;
            if (i9 >= height) {
                break;
            }
            int i12 = i7;
            int i13 = i12;
            int i14 = i13;
            int i15 = i14;
            int i16 = i15;
            int i17 = i16;
            int i18 = i17;
            int i19 = i18;
            boolean z2 = z;
            int i20 = -25;
            int i21 = i19;
            while (i20 <= 25) {
                char c4 = c3;
                int i22 = iArr[i10 + Math.min(i5, Math.max(i20, i7))];
                int[] iArr8 = iArr7[i20 + 25];
                iArr8[i7] = (i22 & 16711680) >> 16;
                iArr8[z2 ? 1 : 0] = (i22 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr8[c] = i22 & 255;
                int abs = 26 - Math.abs(i20);
                int i23 = iArr8[i7];
                i21 += i23 * abs;
                int i24 = iArr8[z2 ? 1 : 0];
                i12 += i24 * abs;
                int i25 = iArr8[c];
                i13 += abs * i25;
                if (i20 > 0) {
                    i17 += i23;
                    i18 += i24;
                    i19 += i25;
                } else {
                    i14 += i23;
                    i15 += i24;
                    i16 += i25;
                }
                i20++;
                c3 = c4;
            }
            char c5 = c3;
            int i26 = i7;
            while (i26 < width) {
                iArr2[i10] = iArr6[i21];
                iArr3[i10] = iArr6[i12];
                iArr4[i10] = iArr6[i13];
                int i27 = i21 - i14;
                int i28 = i12 - i15;
                int i29 = i13 - i16;
                int[] iArr9 = iArr7[(i + 26) % 51];
                int i30 = i14 - iArr9[i7];
                int i31 = i15 - iArr9[z2 ? 1 : 0];
                int i32 = i16 - iArr9[c];
                if (i9 == 0) {
                    i3 = i7;
                    iArr5[i26] = Math.min(i26 + 26, i5);
                } else {
                    i3 = i7;
                }
                int i33 = iArr[i11 + iArr5[i26]];
                int i34 = (i33 & 16711680) >> 16;
                iArr9[i3] = i34;
                int i35 = (i33 & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                iArr9[z2 ? 1 : 0] = i35;
                int i36 = i33 & 255;
                iArr9[c] = i36;
                int i37 = i17 + i34;
                int i38 = i18 + i35;
                int i39 = i19 + i36;
                i21 = i27 + i37;
                i12 = i28 + i38;
                i13 = i29 + i39;
                i = (i + 1) % 51;
                int[] iArr10 = iArr7[i % 51];
                int i40 = iArr10[i3];
                i14 = i30 + i40;
                int i41 = iArr10[z2 ? 1 : 0];
                i15 = i31 + i41;
                int i42 = iArr10[c];
                i16 = i32 + i42;
                i17 = i37 - i40;
                i18 = i38 - i41;
                i19 = i39 - i42;
                i10++;
                i26++;
                i7 = i3;
            }
            i11 += width;
            i9++;
            c2 = c;
            z = z2 ? 1 : 0;
            c3 = c5;
        }
        int i43 = i7;
        boolean z3 = z;
        int i44 = i43;
        while (i44 < width) {
            int i45 = width * (-25);
            int i46 = i44;
            int i47 = -25;
            int i48 = i43;
            int i49 = i48;
            int i50 = i49;
            int i51 = i50;
            int i52 = i51;
            int i53 = i52;
            int i54 = i53;
            int i55 = i54;
            int i56 = i55;
            while (i47 <= i) {
                int i57 = i43;
                int max = Math.max(i57, i45) + i46;
                int[] iArr11 = iArr7[i47 + 25];
                iArr11[i57] = iArr2[max];
                iArr11[z3 ? 1 : 0] = iArr3[max];
                iArr11[c] = iArr4[max];
                int abs2 = 26 - Math.abs(i47);
                i48 += iArr2[max] * abs2;
                i49 += iArr3[max] * abs2;
                i50 += iArr4[max] * abs2;
                if (i47 > 0) {
                    i54 += iArr11[0];
                    i55 += iArr11[z3 ? 1 : 0];
                    i56 += iArr11[c];
                } else {
                    i51 += iArr11[0];
                    i52 += iArr11[z3 ? 1 : 0];
                    i53 += iArr11[c];
                }
                if (i47 < i6) {
                    i45 += width;
                }
                i47++;
                i = 25;
                i43 = 0;
            }
            int i58 = i46;
            int i59 = 25;
            for (int i60 = 0; i60 < height; i60++) {
                iArr[i58] = (iArr[i58] & (-16777216)) | (iArr6[i48] << 16) | (iArr6[i49] << 8) | iArr6[i50];
                int i61 = i48 - i51;
                int i62 = i49 - i52;
                int i63 = i50 - i53;
                int[] iArr12 = iArr7[(i59 + 26) % 51];
                int i64 = i51 - iArr12[0];
                int i65 = i52 - iArr12[z3 ? 1 : 0];
                int i66 = i53 - iArr12[c];
                if (i46 == 0) {
                    i2 = i58;
                    iArr5[i60] = Math.min(i60 + 26, i6) * width;
                } else {
                    i2 = i58;
                }
                int i67 = i46 + iArr5[i60];
                int i68 = iArr2[i67];
                iArr12[0] = i68;
                int i69 = iArr3[i67];
                iArr12[z3 ? 1 : 0] = i69;
                int i70 = iArr4[i67];
                iArr12[c] = i70;
                int i71 = i54 + i68;
                int i72 = i55 + i69;
                int i73 = i56 + i70;
                i48 = i61 + i71;
                i49 = i62 + i72;
                i50 = i63 + i73;
                i59 = (i59 + 1) % 51;
                int[] iArr13 = iArr7[i59];
                int i74 = iArr13[0];
                i51 = i64 + i74;
                int i75 = iArr13[z3 ? 1 : 0];
                i52 = i65 + i75;
                int i76 = iArr13[c];
                i53 = i66 + i76;
                i54 = i71 - i74;
                i55 = i72 - i75;
                i56 = i73 - i76;
                i58 = i2 + width;
            }
            i43 = 0;
            i44 = i46 + 1;
            i = 25;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
        return bitmap;
    }

    public static InputStream a(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                try {
                    byteArrayOutputStream.close();
                } catch (Exception unused) {
                }
                return byteArrayInputStream;
            } catch (Exception unused2) {
                if (byteArrayOutputStream == null) {
                    return null;
                }
                try {
                    byteArrayOutputStream.close();
                    return null;
                } catch (Exception unused3) {
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream2 = byteArrayOutputStream;
                if (byteArrayOutputStream2 != null) {
                    try {
                        byteArrayOutputStream2.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            byteArrayOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
