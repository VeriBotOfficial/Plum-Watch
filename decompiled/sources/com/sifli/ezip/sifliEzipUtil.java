package com.sifli.ezip;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public class sifliEzipUtil {
    private static final String TAG = "ezip-util";
    private static final int US_OF_S = 1000000;
    private static final String VERSION = "2.5.5";

    private static native byte[] gzipWithDataNDK(byte[] bArr, long j);

    private static native byte[] png2EzipNDK(byte[] bArr, long j, String str, int i, int i2);

    private static native byte[] png2EzipSequenceWithTypeNDK(byte[] bArr, int[] iArr, String str, int i, int i2, int i3, int i4);

    private static native byte[] png2EzipWithTypeNDK(byte[] bArr, long j, String str, int i, int i2, int i3);

    private static native void setLvglVersionNDK(int i);

    static {
        System.loadLibrary("ezip");
    }

    private static byte[] pngToEzip(byte[] bArr, String str, int i, int i2) {
        return png2EzipNDK(bArr, bArr.length, str, i, i2);
    }

    public static synchronized byte[] pngToEzip(byte[] bArr, String str, int i, int i2, int i3) {
        synchronized (sifliEzipUtil.class) {
            Log.d(TAG, "2.5.5, color " + i + ", bin " + i2 + ", board " + i3);
            if (!SFBoardType.isValidBoardType(i3)) {
                Log.i(TAG, "pngToEzipSequence board type is invalid.");
                return null;
            }
            boolean isPngData = FileValidator.isPngData(bArr);
            boolean isGifData = FileValidator.isGifData(bArr);
            if (!isPngData && !isGifData) {
                Log.e(TAG, "pngToEzip only support PNG or GIF");
                return null;
            }
            return png2EzipWithTypeNDK(bArr, bArr.length, str, i, i2, i3);
        }
    }

    public static synchronized byte[] pngToEzipSequence(ArrayList<byte[]> arrayList, String str, int i, int i2, int i3, int i4) {
        synchronized (sifliEzipUtil.class) {
            if (arrayList == null) {
                return null;
            }
            if (!SFBoardType.isValidBoardType(i3)) {
                Log.i(TAG, "pngToEzipSequence board type is invalid.");
                return null;
            }
            if (!FileValidator.isPngData(arrayList)) {
                Log.e(TAG, "pngToEzipSequence only support PNG");
                return null;
            }
            int size = arrayList.size();
            Log.d(TAG, "2.5.5 color " + i + ", bin " + i2 + ", board " + i3 + ",pic number " + size);
            int[] iArr = new int[size];
            Iterator<byte[]> it = arrayList.iterator();
            int i5 = 0;
            int i6 = 0;
            while (it.hasNext()) {
                byte[] next = it.next();
                iArr[i6] = next.length;
                i5 += next.length;
                i6++;
            }
            byte[] bArr = new byte[i5];
            Iterator<byte[]> it2 = arrayList.iterator();
            int i7 = 0;
            while (it2.hasNext()) {
                byte[] next2 = it2.next();
                System.arraycopy(next2, 0, bArr, i7, next2.length);
                i7 += next2.length;
            }
            return png2EzipSequenceWithTypeNDK(bArr, iArr, str, i, i2, i3, i4);
        }
    }

    public static void setLvglVersion(int i) {
        Log.i(TAG, "setLvglVersion " + i);
        setLvglVersionNDK(i);
    }

    public static synchronized byte[] gzipWithData(byte[] bArr) {
        synchronized (sifliEzipUtil.class) {
            if (bArr == null) {
                return null;
            }
            Log.i(TAG, "gzipWithData " + bArr.length);
            return gzipWithDataNDK(bArr, bArr.length);
        }
    }

    private static void mp4ToGif(String str, String str2, int i, int i2, int i3, int i4, int i5) {
        List<Bitmap> mp4ToGifGetBitmaps = mp4ToGifGetBitmaps(str, i, i2, i3, i4, i5);
        gifEncoder gifencoder = new gifEncoder();
        gifencoder.init(mp4ToGifGetBitmaps.get(0));
        gifencoder.start(str2);
        for (int i6 = 1; i6 < mp4ToGifGetBitmaps.size(); i6++) {
            gifencoder.addFrame(mp4ToGifGetBitmaps.get(i6));
        }
        gifencoder.finish();
    }

    private static List<Bitmap> mp4ToGifGetBitmaps(String str, int i, int i2, int i3, int i4, int i5) {
        ArrayList arrayList = new ArrayList();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(str);
        double d = 1000000 / i;
        for (double d2 = i2 * 1000000; d2 < i3 * 1000000; d2 += d) {
            Bitmap frameAtTime = mediaMetadataRetriever.getFrameAtTime((long) d2, 3);
            if (frameAtTime != null) {
                arrayList.add(Bitmap.createScaledBitmap(frameAtTime, i4 > 0 ? i4 : frameAtTime.getWidth(), i5 > 0 ? i5 : frameAtTime.getHeight(), true));
            }
        }
        return arrayList;
    }

    private static void jpgToPng(String str, String str2) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str2));
            try {
                if (decodeFile.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream)) {
                    bufferedOutputStream.flush();
                }
                bufferedOutputStream.close();
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
