package com.wakeup.common.utils;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.blankj.utilcode.util.CloseUtils;
import com.huawei.hms.hmsscankit.ScanUtil;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanAnalyzerOptions;
import com.luck.picture.lib.config.PictureMimeType;
import com.wakeup.common.log.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: classes2.dex */
public class BitmapUtils {
    private static final String TAG = "BitmapUtils";

    public static Bitmap zoomImg(Bitmap bm, int newWidth, int newHeight) {
        if (bm == null) {
            return null;
        }
        int width = bm.getWidth();
        int height = bm.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(newWidth / width, newHeight / height);
        return Bitmap.createBitmap(bm, 0, 0, width, height, matrix, true);
    }

    public static Bitmap getBitmap(String filePath) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inScaled = false;
        try {
            return BitmapFactory.decodeStream(new FileInputStream(filePath), null, options);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap getBitmapRgb(String filePath) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inScaled = false;
        try {
            return BitmapFactory.decodeStream(new FileInputStream(filePath), null, options);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Bitmap scale(final Bitmap src, final int newWidth, final int newHeight) {
        return scale(src, newWidth, newHeight, false);
    }

    public static Bitmap scale(final Bitmap src, int newWidth, int newHeight, final boolean recycle) {
        if (isEmptyBitmap(src)) {
            return null;
        }
        if (newHeight <= 0) {
            newHeight = src.getHeight();
        }
        if (newWidth <= 0) {
            newWidth = src.getWidth();
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(src, newWidth, newHeight, true);
        if (recycle && !src.isRecycled() && createScaledBitmap != src) {
            src.recycle();
        }
        return createScaledBitmap;
    }

    public static Bitmap scaleAndCrop(Bitmap bitmap, int width, int height) {
        if (isEmptyBitmap(bitmap)) {
            return null;
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f = width / 2;
        canvas.drawCircle(f, f, f, paint);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    private static boolean isEmptyBitmap(final Bitmap src) {
        return src == null || src.getWidth() == 0 || src.getHeight() == 0;
    }

    public static List<String> getHexPixels(int[] pixels, int width, int height) {
        ArrayList arrayList = new ArrayList(width * height);
        for (int i : pixels) {
            String hexString = Integer.toHexString((((16711680 & i) >> 19) << 11) + (((65280 & i) >> 10) << 5) + ((i & 255) >> 3));
            if (hexString.length() < 4) {
                while (hexString.length() < 4) {
                    hexString = "0" + hexString;
                }
            }
            arrayList.add(hexString);
        }
        return arrayList;
    }

    public static List<String> getHexPixelsReverse(int[] pixels, int width, int height) {
        ArrayList arrayList = new ArrayList(width * height);
        for (int i = height - 1; i >= 0; i--) {
            for (int i2 = 0; i2 < width; i2++) {
                int i3 = pixels[(i * width) + i2];
                String hexString = Integer.toHexString((((16711680 & i3) >> 19) << 11) + (((65280 & i3) >> 10) << 5) + ((i3 & 255) >> 3));
                if (hexString.length() < 4) {
                    while (hexString.length() < 4) {
                        hexString = "0" + hexString;
                    }
                }
                arrayList.add(hexString);
            }
        }
        return arrayList;
    }

    public static List<String> hexString_16_to_8(List<String> hexPixels) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = hexPixels.iterator();
        while (it.hasNext()) {
            int parseInt = Integer.parseInt(it.next(), 16);
            arrayList.add(Integer.toHexString(parseInt / 256));
            arrayList.add(Integer.toHexString(parseInt % 256));
        }
        return arrayList;
    }

    public static List<String> hexString_16_to_8_reverse(List<String> hexPixels) {
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = hexPixels.iterator();
        while (it.hasNext()) {
            int parseInt = Integer.parseInt(it.next(), 16);
            arrayList.add(Integer.toHexString(parseInt % 256));
            arrayList.add(Integer.toHexString(parseInt / 256));
        }
        return arrayList;
    }

    public static <T> List<List<T>> split(List<T> resList, int count) {
        if (resList == null || count < 1) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = resList.size();
        if (size <= count) {
            arrayList.add(resList);
            return arrayList;
        }
        int i = size / count;
        int i2 = size % count;
        for (int i3 = 0; i3 < i; i3++) {
            ArrayList arrayList2 = new ArrayList();
            for (int i4 = 0; i4 < count; i4++) {
                arrayList2.add(resList.get((i3 * count) + i4));
            }
            arrayList.add(arrayList2);
        }
        if (i2 > 0) {
            ArrayList arrayList3 = new ArrayList();
            for (int i5 = 0; i5 < i2; i5++) {
                arrayList3.add(resList.get((i * count) + i5));
            }
            arrayList.add(arrayList3);
        }
        return arrayList;
    }

    public static Bitmap getLocalVideoBitmap(String localPath) {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(localPath);
                bitmap = mediaMetadataRetriever.getFrameAtTime();
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            bitmap = null;
        }
        return bitmap;
    }

    public static Bitmap getLocalVideoBitmap(AssetFileDescriptor fileDescriptor) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(fileDescriptor.getFileDescriptor(), fileDescriptor.getStartOffset(), fileDescriptor.getLength());
                Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime();
                try {
                    mediaMetadataRetriever.release();
                    return frameAtTime;
                } catch (IOException unused) {
                    return frameAtTime;
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused2) {
                }
                return null;
            }
        } finally {
        }
    }

    public static Bitmap getNetVideoBitmap(String videoUrl) {
        Bitmap bitmap;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(videoUrl, new HashMap());
                bitmap = mediaMetadataRetriever.getFrameAtTime();
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (IOException unused) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                mediaMetadataRetriever.release();
            } catch (IOException unused2) {
            }
            bitmap = null;
        }
        return bitmap;
    }

    public static Bitmap bitmapRoundedCorners(Bitmap bitmap, int corners) {
        try {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Paint paint = new Paint();
            Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
            RectF rectF = new RectF(new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()));
            paint.setAntiAlias(true);
            canvas.drawARGB(0, 0, 0, 0);
            paint.setColor(-1);
            float f = corners;
            canvas.drawRoundRect(rectF, f, f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), rect, paint);
            return createBitmap;
        } catch (Exception unused) {
            return bitmap;
        }
    }

    public static Bitmap getCircleBitmap(Bitmap srcBitmap) {
        int width = srcBitmap.getWidth();
        int height = srcBitmap.getHeight();
        int min = Math.min(width, height);
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawOval(new RectF(0.0f, 0.0f, width, height), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(srcBitmap, (min - width) / 2, (min - height) / 2, paint);
        srcBitmap.recycle();
        return createBitmap;
    }

    public static Bitmap getCircleBitmap2(Bitmap srcBitmap) {
        int min = Math.min(srcBitmap.getWidth(), srcBitmap.getHeight());
        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        float f = min;
        canvas.drawOval(new RectF(0.0f, 0.0f, f, f), paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(srcBitmap, (min - r0) / 2, (min - r1) / 2, paint);
        srcBitmap.recycle();
        return createBitmap;
    }

    public static File saveBitmap(Bitmap bitmap, String picName) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            LogUtils.d("xxx", "saveBitmap: 1return");
            return null;
        }
        try {
            File file = new File(AppPath.getAppImageCache(), picName);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            LogUtils.d(TAG, "saveBitmap: " + file.getAbsolutePath());
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            LogUtils.d("xxx", "saveBitmap: 2return");
            return null;
        }
    }

    public static File saveBitmap2(Bitmap bitmap, String picName, int quality) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            LogUtils.d("xxx", "saveBitmap: 1return");
            return null;
        }
        try {
            File file = new File(AppPath.getAppImageCache(), picName);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, quality, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            LogUtils.d(TAG, "saveBitmap: " + file.getAbsolutePath());
            return file;
        } catch (IOException e) {
            e.printStackTrace();
            LogUtils.d("xxx", "saveBitmap: 2return");
            return null;
        }
    }

    public static void saveBitmapJpg(Bitmap bitmap, String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            LogUtils.e(TAG, "saveBitmapJpg error: ", e);
        }
    }

    public static void saveBitmapPng(Bitmap bitmap, String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Exception e) {
            LogUtils.e(TAG, "saveBitmapJpg error: ", e);
        }
    }

    public static String analysisQr(Uri data, Context context) {
        if (data == null) {
            LogUtils.i(TAG, "analysisQr:data is null");
            return null;
        }
        try {
            HmsScan[] decodeWithBitmap = ScanUtil.decodeWithBitmap(context, MediaStore.Images.Media.getBitmap(context.getContentResolver(), data), new HmsScanAnalyzerOptions.Creator().setHmsScanTypes(HmsScan.QRCODE_SCAN_TYPE, HmsScan.DATAMATRIX_SCAN_TYPE).setPhotoMode(true).create());
            if (decodeWithBitmap == null || decodeWithBitmap.length <= 0) {
                LogUtils.i(TAG, "hmsScans is null:");
                return null;
            }
            return decodeWithBitmap[0].originalValue;
        } catch (Exception e) {
            e.printStackTrace();
            LogUtils.e(TAG, "analysisQr==Exception:" + e);
            return null;
        }
    }

    public static Bitmap base64ToBitmap(String base64Data) {
        byte[] decode = android.util.Base64.decode(base64Data, 0);
        return BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static void saveBitmap(Context context, Bitmap bitmap, String picName) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", picName + PictureMimeType.PNG);
            contentValues.put("mime_type", "image/png");
            contentValues.put("relative_path", Environment.DIRECTORY_PICTURES);
            Uri insert = context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (TextUtils.isEmpty(insert.toString())) {
                ToastUtils.showToast("Save failed");
                return;
            }
            if (bitmap.compress(Bitmap.CompressFormat.PNG, 100, context.getContentResolver().openOutputStream(insert))) {
                ToastUtils.showToast("Saving succeeded");
            } else {
                ToastUtils.showToast("Save failed");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bitmap cropBitmap(Bitmap srcBitmap, int newWeight, int newHeight) {
        int width = srcBitmap.getWidth();
        int height = srcBitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(newWeight, newHeight, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(srcBitmap, (newWeight - width) / 2, (newHeight - height) / 2, new Paint());
        srcBitmap.recycle();
        return createBitmap;
    }

    public static Bitmap cropNaviBitmap(Bitmap srcBitmap, int width, int height) {
        int width2 = srcBitmap.getWidth();
        int height2 = srcBitmap.getHeight();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawBitmap(srcBitmap, (width - width2) / 2, height - height2, new Paint());
        srcBitmap.recycle();
        return createBitmap;
    }

    public static List<String> getBmpHead(int w, int h) {
        ArrayList arrayList = new ArrayList();
        int i = w * h * 2;
        int i2 = i + 2;
        int i3 = i + 72;
        int[] iArr = {66, 77, i3 & 255, (i3 >> 8) & 255, (i3 >> 16) & 255, (i3 >> 25) & 255, 0, 0, 0, 0, 70, 0, 0, 0, 56, 0, 0, 0, w & 255, (w >> 8) & 255, (w >> 16) & 255, (w >> 25) & 255, h & 255, (h >> 8) & 255, (h >> 16) & 255, (h >> 25) & 255, 1, 0, 16, 0, 3, 0, 0, 0, i2 & 255, (i2 >> 8) & 255, (i2 >> 16) & 255, (i2 >> 25) & 255, 18, 11, 0, 0, 18, 11, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, TelnetCommand.EL, 0, 0, 224, 7, 0, 0, 31, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for (int i4 = 0; i4 < 72; i4++) {
            arrayList.add(Integer.toHexString(iArr[i4]));
        }
        return arrayList;
    }

    public static Bitmap mirrorBitmap(Bitmap inputBitmap) {
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(inputBitmap, 0, 0, inputBitmap.getWidth(), inputBitmap.getHeight(), matrix, false);
    }

    public static byte[] compressImageToSize(String imagePath, int maxSize, int qualityStep) {
        Bitmap decodeFile = BitmapFactory.decodeFile(imagePath);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 100;
        do {
            byteArrayOutputStream.reset();
            decodeFile.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            i -= qualityStep;
            if (byteArrayOutputStream.toByteArray().length <= maxSize) {
                break;
            }
        } while (i > qualityStep);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        CloseUtils.closeIO(byteArrayOutputStream);
        return byteArray;
    }

    public static Bitmap setAlpha(Bitmap inputBitmap, int alpha) {
        Bitmap createBitmap = Bitmap.createBitmap(inputBitmap.getWidth(), inputBitmap.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAlpha(alpha);
        canvas.drawBitmap(inputBitmap, 0.0f, 0.0f, paint);
        return createBitmap;
    }

    public static boolean convertJpgToPng(String jpgFilePath, String pngFilePath) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            Bitmap decodeFile = BitmapFactory.decodeFile(jpgFilePath, options);
            if (decodeFile == null) {
                return false;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(pngFilePath));
            boolean compress = decodeFile.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.close();
            decodeFile.recycle();
            return compress;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void jpgToPng(File jpgFile, File pngFile) {
        try {
            Bitmap decodeFile = BitmapFactory.decodeFile(jpgFile.getAbsolutePath());
            FileOutputStream fileOutputStream = new FileOutputStream(pngFile);
            decodeFile.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            decodeFile.recycle();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Bitmap rotateBitmap(Bitmap source, float degrees) {
        if (source == null) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.postRotate(degrees);
        return Bitmap.createBitmap(source, 0, 0, source.getWidth(), source.getHeight(), matrix, true);
    }
}
