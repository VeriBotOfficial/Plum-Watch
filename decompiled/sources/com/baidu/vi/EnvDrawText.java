package com.baidu.vi;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;

/* loaded from: classes13.dex */
public class EnvDrawText {
    private static final String DEVICE_VIVOX3L = "vivo X3L";
    private static final int FONT_STYLE_BOLD = 1;
    private static final int FONT_STYLE_ITALIC = 2;
    private static final int FONT_STYLE_NORMAL = 0;
    private static Bitmap defaultFontBmp;
    public static SparseArray<a> fontCache;
    private static Context mContext;
    private static String phonetype;

    /* JADX WARN: Removed duplicated region for block: B:103:0x0288 A[EDGE_INSN: B:103:0x0288->B:104:0x0288 BREAK  A[LOOP:1: B:94:0x0233->B:100:0x026f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0290 A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0210 A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01eb A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01fb A[Catch: all -> 0x02ea, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0200 A[Catch: all -> 0x02ea, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0209 A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x023b A[Catch: all -> 0x02ea, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00de, B:26:0x00e2, B:29:0x00ea, B:31:0x00f2, B:35:0x00f8, B:36:0x00fd, B:38:0x0101, B:40:0x010d, B:41:0x012c, B:43:0x02d1, B:45:0x02d6, B:47:0x02df, B:49:0x02e5, B:52:0x0108, B:54:0x0140, B:55:0x0151, B:57:0x0159, B:61:0x0168, B:64:0x016d, B:66:0x0173, B:69:0x0186, B:71:0x01a0, B:76:0x01e7, B:78:0x01eb, B:81:0x01f3, B:83:0x01fb, B:86:0x0200, B:87:0x0205, B:89:0x0209, B:90:0x0213, B:94:0x0233, B:96:0x023b, B:98:0x0246, B:100:0x026f, B:104:0x0288, B:106:0x0290, B:108:0x029d, B:109:0x02bd, B:112:0x0226, B:113:0x022b, B:114:0x0210), top: B:3:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized int[] drawText(java.lang.String r27, int r28, int r29, int[] r30, int r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.vi.EnvDrawText.drawText(java.lang.String, int, int, int[], int, int, int, int, int):int[]");
    }

    private static Bitmap drawTextAlpha(String str, int i, int i2, int i3) {
        Bitmap bitmap;
        int desiredWidth;
        Bitmap bitmap2;
        Canvas canvas = new Canvas();
        TextPaint textPaint = new TextPaint();
        if (TextUtils.isEmpty(phonetype)) {
            phonetype = Build.MODEL;
        }
        String str2 = phonetype;
        int i4 = 0;
        int i5 = (str2 == null || !str2.equals(DEVICE_VIVOX3L)) ? i2 : 0;
        textPaint.reset();
        textPaint.setSubpixelText(false);
        textPaint.setAntiAlias(false);
        textPaint.setTextSize(i);
        textPaint.setTypeface(getTypeface(i5));
        float f = (i3 * 1.3f) + 0.5f;
        int indexOf = str.indexOf(92, 0);
        if (indexOf == -1) {
            Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
            int desiredWidth2 = (int) (Layout.getDesiredWidth(str, 0, str.length(), textPaint) + f);
            int ceil = (int) Math.ceil(fontMetrics.descent - fontMetrics.ascent);
            if (desiredWidth2 <= 0 || ceil <= 0) {
                bitmap2 = null;
            } else {
                bitmap2 = Bitmap.createBitmap(desiredWidth2, ceil, Bitmap.Config.ALPHA_8);
                if (bitmap2 == null) {
                    return bitmap2;
                }
                bitmap2.eraseColor(0);
                canvas.setBitmap(bitmap2);
            }
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawText(str, f * 0.5f, 0.0f - fontMetrics.ascent, textPaint);
            return bitmap2;
        }
        int i6 = indexOf + 1;
        int desiredWidth3 = (int) (Layout.getDesiredWidth(str.substring(0, indexOf), textPaint) + 0.5d);
        int i7 = 2;
        while (true) {
            int indexOf2 = str.indexOf(92, i6);
            if (indexOf2 <= 0) {
                break;
            }
            int i8 = i7;
            int desiredWidth4 = (int) (Layout.getDesiredWidth(str.substring(i6, indexOf2), textPaint) + 0.5d);
            if (desiredWidth4 > desiredWidth3) {
                desiredWidth3 = desiredWidth4;
            }
            i6 = indexOf2 + 1;
            i7 = i8 + 1;
        }
        int i9 = i7;
        if (i6 != str.length() && (desiredWidth = (int) (Layout.getDesiredWidth(str.substring(i6, str.length()), textPaint) + 0.5d)) > desiredWidth3) {
            desiredWidth3 = desiredWidth;
        }
        Paint.FontMetrics fontMetrics2 = textPaint.getFontMetrics();
        int i10 = desiredWidth3 + i3;
        int ceil2 = ((int) Math.ceil(fontMetrics2.descent - fontMetrics2.ascent)) * i9;
        if (i10 <= 0 || ceil2 <= 0) {
            bitmap = null;
        } else {
            bitmap = Bitmap.createBitmap(i10, ceil2, Bitmap.Config.ALPHA_8);
            if (bitmap == null) {
                return bitmap;
            }
            bitmap.eraseColor(0);
            canvas.setBitmap(bitmap);
        }
        textPaint.setTextAlign(getTextAlignedType(3));
        float f2 = i10 - (f * 0.5f);
        int i11 = 0;
        while (true) {
            int indexOf3 = str.indexOf(92, i4);
            if (indexOf3 <= 0) {
                break;
            }
            String substring = str.substring(i4, indexOf3);
            Layout.getDesiredWidth(substring, textPaint);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawText(substring, f2, (i11 * r10) - fontMetrics2.ascent, textPaint);
            i11++;
            i4 = indexOf3 + 1;
        }
        if (i4 != str.length()) {
            String substring2 = str.substring(i4, str.length());
            Layout.getDesiredWidth(substring2, textPaint);
            textPaint.setStyle(Paint.Style.FILL);
            canvas.drawText(substring2, f2, (i11 * r10) - fontMetrics2.ascent, textPaint);
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3 A[Catch: all -> 0x02c3, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00df, B:26:0x00e3, B:29:0x00eb, B:34:0x00f5, B:35:0x00fa, B:37:0x00fe, B:39:0x010a, B:40:0x0129, B:43:0x0105, B:45:0x013b, B:46:0x014d, B:48:0x0155, B:52:0x0164, B:55:0x0169, B:57:0x016f, B:60:0x0182, B:62:0x019c, B:67:0x01e1, B:69:0x01e5, B:72:0x01ed, B:76:0x01f7, B:77:0x01fc, B:79:0x0200, B:80:0x020a, B:84:0x022c, B:86:0x0232, B:88:0x023d, B:90:0x0262, B:94:0x027a, B:96:0x0282, B:98:0x028f, B:99:0x02af, B:102:0x021d, B:103:0x0222, B:104:0x0207), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f3 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5 A[Catch: all -> 0x02c3, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00df, B:26:0x00e3, B:29:0x00eb, B:34:0x00f5, B:35:0x00fa, B:37:0x00fe, B:39:0x010a, B:40:0x0129, B:43:0x0105, B:45:0x013b, B:46:0x014d, B:48:0x0155, B:52:0x0164, B:55:0x0169, B:57:0x016f, B:60:0x0182, B:62:0x019c, B:67:0x01e1, B:69:0x01e5, B:72:0x01ed, B:76:0x01f7, B:77:0x01fc, B:79:0x0200, B:80:0x020a, B:84:0x022c, B:86:0x0232, B:88:0x023d, B:90:0x0262, B:94:0x027a, B:96:0x0282, B:98:0x028f, B:99:0x02af, B:102:0x021d, B:103:0x0222, B:104:0x0207), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fe A[Catch: all -> 0x02c3, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00df, B:26:0x00e3, B:29:0x00eb, B:34:0x00f5, B:35:0x00fa, B:37:0x00fe, B:39:0x010a, B:40:0x0129, B:43:0x0105, B:45:0x013b, B:46:0x014d, B:48:0x0155, B:52:0x0164, B:55:0x0169, B:57:0x016f, B:60:0x0182, B:62:0x019c, B:67:0x01e1, B:69:0x01e5, B:72:0x01ed, B:76:0x01f7, B:77:0x01fc, B:79:0x0200, B:80:0x020a, B:84:0x022c, B:86:0x0232, B:88:0x023d, B:90:0x0262, B:94:0x027a, B:96:0x0282, B:98:0x028f, B:99:0x02af, B:102:0x021d, B:103:0x0222, B:104:0x0207), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x010a A[Catch: all -> 0x02c3, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00df, B:26:0x00e3, B:29:0x00eb, B:34:0x00f5, B:35:0x00fa, B:37:0x00fe, B:39:0x010a, B:40:0x0129, B:43:0x0105, B:45:0x013b, B:46:0x014d, B:48:0x0155, B:52:0x0164, B:55:0x0169, B:57:0x016f, B:60:0x0182, B:62:0x019c, B:67:0x01e1, B:69:0x01e5, B:72:0x01ed, B:76:0x01f7, B:77:0x01fc, B:79:0x0200, B:80:0x020a, B:84:0x022c, B:86:0x0232, B:88:0x023d, B:90:0x0262, B:94:0x027a, B:96:0x0282, B:98:0x028f, B:99:0x02af, B:102:0x021d, B:103:0x0222, B:104:0x0207), top: B:3:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0105 A[Catch: all -> 0x02c3, TryCatch #0 {, blocks: (B:4:0x0011, B:6:0x0023, B:7:0x0027, B:9:0x002c, B:12:0x0038, B:14:0x0055, B:15:0x0068, B:17:0x0080, B:19:0x00a6, B:24:0x00df, B:26:0x00e3, B:29:0x00eb, B:34:0x00f5, B:35:0x00fa, B:37:0x00fe, B:39:0x010a, B:40:0x0129, B:43:0x0105, B:45:0x013b, B:46:0x014d, B:48:0x0155, B:52:0x0164, B:55:0x0169, B:57:0x016f, B:60:0x0182, B:62:0x019c, B:67:0x01e1, B:69:0x01e5, B:72:0x01ed, B:76:0x01f7, B:77:0x01fc, B:79:0x0200, B:80:0x020a, B:84:0x022c, B:86:0x0232, B:88:0x023d, B:90:0x0262, B:94:0x027a, B:96:0x0282, B:98:0x028f, B:99:0x02af, B:102:0x021d, B:103:0x0222, B:104:0x0207), top: B:3:0x0011 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static synchronized android.graphics.Bitmap drawTextExt(java.lang.String r27, int r28, int r29, int[] r30, int r31, int r32, int r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.vi.EnvDrawText.drawTextExt(java.lang.String, int, int, int[], int, int, int, int, int):android.graphics.Bitmap");
    }

    private static Paint.Align getTextAlignedType(int i) {
        return 1 == i ? Paint.Align.LEFT : 2 == i ? Paint.Align.RIGHT : Paint.Align.CENTER;
    }

    private static Bitmap getTextBitmap() {
        Paint paint = new Paint();
        paint.setSubpixelText(true);
        paint.setAntiAlias(false);
        paint.setTextSize(12.0f);
        paint.setTypeface(Typeface.DEFAULT);
        float measureText = paint.measureText("!");
        float descent = paint.descent() - paint.ascent();
        if (measureText <= 0.0f) {
            measureText = 3.0f;
        }
        if (descent <= 0.0f) {
            descent = 15.0f;
        }
        Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil(measureText), (int) Math.ceil(descent), Bitmap.Config.ALPHA_8);
        createBitmap.eraseColor(0);
        Canvas canvas = new Canvas();
        canvas.setBitmap(createBitmap);
        canvas.drawText("!", 0.0f, 0.0f - paint.ascent(), paint);
        return createBitmap;
    }

    private static short[] getTextSize(String str, int i, int i2) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(i);
        textPaint.setTypeface(getTypeface(i2));
        short[] sArr = new short[length];
        for (int i3 = 0; i3 < length; i3++) {
            sArr[i3] = (short) (Layout.getDesiredWidth(str, 0, r3, textPaint) + 0.5d);
        }
        return sArr;
    }

    private static float[] getTextSizeExt(String str, int i, int i2) {
        if (str.length() == 0) {
            return null;
        }
        Paint paint = new Paint();
        paint.setSubpixelText(true);
        paint.setAntiAlias(true);
        paint.setTextSize(i);
        paint.setTypeface(getTypeface(i2));
        return new float[]{paint.measureText(str), paint.descent() - paint.ascent()};
    }

    private static short[] getTextSizeWithHalo(String str, int i, int i2, int i3) {
        int length = str.length();
        if (length == 0) {
            return null;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setSubpixelText(true);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(i);
        textPaint.setTypeface(getTypeface(i2));
        if (i3 != 0) {
            textPaint.setStrokeWidth(i3);
            textPaint.setStrokeCap(Paint.Cap.ROUND);
            textPaint.setStrokeJoin(Paint.Join.ROUND);
            textPaint.setStyle(Paint.Style.STROKE);
        }
        short[] sArr = new short[length];
        for (int i4 = 0; i4 < length; i4++) {
            sArr[i4] = (short) (Layout.getDesiredWidth(str, 0, r2, textPaint) + 0.5d);
        }
        return sArr;
    }

    private static Typeface getTypeface(int i) {
        Typeface typeface = Typeface.DEFAULT;
        return i != 1 ? i != 2 ? typeface : Typeface.create(typeface, 2) : Typeface.DEFAULT_BOLD;
    }

    private static synchronized boolean isSystemFontChanged() {
        synchronized (EnvDrawText.class) {
            if (defaultFontBmp == null) {
                defaultFontBmp = getTextBitmap();
                return false;
            }
            Bitmap textBitmap = getTextBitmap();
            if (nativeIsBitmapSame(textBitmap, defaultFontBmp)) {
                textBitmap.recycle();
                return false;
            }
            defaultFontBmp.recycle();
            defaultFontBmp = Bitmap.createBitmap(textBitmap);
            textBitmap.recycle();
            return true;
        }
    }

    private static native boolean nativeIsBitmapSame(Bitmap bitmap, Bitmap bitmap2);

    public static synchronized void registFontCache(int i, Typeface typeface) {
        synchronized (EnvDrawText.class) {
            if (i == 0 || typeface == null) {
                return;
            }
            if (fontCache == null) {
                fontCache = new SparseArray<>();
            }
            a aVar = fontCache.get(i);
            if (aVar == null) {
                a aVar2 = new a();
                aVar2.f9050a = typeface;
                aVar2.b++;
                fontCache.put(i, aVar2);
            } else {
                aVar.b++;
            }
        }
    }

    public static synchronized void removeFontCache(int i) {
        synchronized (EnvDrawText.class) {
            a aVar = fontCache.get(i);
            if (aVar == null) {
                return;
            }
            int i2 = aVar.b - 1;
            aVar.b = i2;
            if (i2 == 0) {
                fontCache.remove(i);
            }
        }
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
