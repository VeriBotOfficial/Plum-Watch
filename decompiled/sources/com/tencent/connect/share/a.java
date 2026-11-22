package com.tencent.connect.share;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.luck.picture.lib.config.PictureMimeType;
import com.tencent.connect.common.Constants;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.d;
import com.tencent.open.utils.g;
import com.tencent.open.utils.m;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public static final void a(final Context context, final String str, final d dVar) {
        SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage()");
        if (TextUtils.isEmpty(str)) {
            dVar.a(1, (String) null);
        } else if (!m.a()) {
            dVar.a(2, (String) null);
        } else {
            final Handler handler = new Handler(context.getMainLooper()) { // from class: com.tencent.connect.share.a.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    int i = message.what;
                    if (i == 101) {
                        dVar.a(0, (ArrayList<String>) message.obj);
                    } else if (i == 102) {
                        dVar.a(message.arg1, (String) null);
                    } else {
                        super.handleMessage(message);
                    }
                }
            };
            new Thread(new Runnable() { // from class: com.tencent.connect.share.a.2
                @Override // java.lang.Runnable
                public void run() {
                    String absolutePath;
                    String str2;
                    try {
                        Bitmap a2 = a.a(str, 840);
                        if (a2 != null) {
                            File a3 = g.a("Images");
                            String str3 = null;
                            if (a3 != null) {
                                str2 = a3.getAbsolutePath() + File.separator + Constants.QQ_SHARE_TEMP_DIR + File.separator;
                                absolutePath = null;
                            } else {
                                File d = g.d();
                                if (d == null) {
                                    SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() getCacheDir = null,return error");
                                    Message obtainMessage = handler.obtainMessage();
                                    obtainMessage.arg1 = 102;
                                    handler.sendMessage(obtainMessage);
                                    return;
                                }
                                absolutePath = d.getAbsolutePath();
                                String str4 = absolutePath + File.separator + Constants.QQ_SHARE_TEMP_DIR + File.separator;
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() use cache dir=" + str4);
                                str2 = str4;
                            }
                            String str5 = "share2qq_temp" + m.g(str) + PictureMimeType.JPG;
                            String str6 = str;
                            if (a.b(str6, 840, 840)) {
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() out of bound,compress!");
                                String a4 = a.a(a2, str2, str5);
                                if (!TextUtils.isEmpty(a4)) {
                                    str6 = a4;
                                }
                            } else {
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() not out of bound,not compress!");
                            }
                            boolean m = m.m(str6);
                            SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() check file isAppSpecificDir=" + m);
                            ArrayList arrayList = new ArrayList(2);
                            if (m) {
                                str3 = str6;
                            } else if (TextUtils.isEmpty(absolutePath)) {
                                String str7 = str2 + str5;
                                boolean a5 = m.a(context, str6, str7);
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() sd permission not denied. copy to app sepcific:" + str7 + ",isSuccess=" + a5);
                                if (a5) {
                                    str3 = str7;
                                }
                            }
                            arrayList.add(str6);
                            arrayList.add(str3);
                            if (arrayList.size() >= 2 && (arrayList.get(0) != null || arrayList.get(1) != null)) {
                                StringBuilder sb = new StringBuilder("scaleCompressImage() return success ! destFilePath=[");
                                sb.append((String) arrayList.get(0)).append(",").append((String) arrayList.get(1)).append("]");
                                SLog.i("openSDK_LOG.AsynScaleCompressImage", sb.toString());
                                Message obtainMessage2 = handler.obtainMessage(101);
                                obtainMessage2.obj = arrayList;
                                handler.sendMessage(obtainMessage2);
                                return;
                            }
                        }
                    } catch (Exception e) {
                        SLog.e("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage runnable exception e:", e);
                    }
                    SLog.d("openSDK_LOG.AsynScaleCompressImage", "scaleCompressImage() return failed!");
                    Message obtainMessage3 = handler.obtainMessage(102);
                    obtainMessage3.arg1 = 3;
                    handler.sendMessage(obtainMessage3);
                }
            }).start();
        }
    }

    private static Bitmap a(Bitmap bitmap, int i) {
        Matrix matrix = new Matrix();
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width <= height) {
            width = height;
        }
        float f = i / width;
        matrix.postScale(f, f);
        return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    protected static final String a(Bitmap bitmap, String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        String stringBuffer = new StringBuffer(str).append(str2).toString();
        File file2 = new File(stringBuffer);
        if (file2.exists()) {
            file2.delete();
        }
        if (bitmap == null) {
            return null;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 80, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            bitmap.recycle();
            return stringBuffer;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b(String str, int i, int i2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            BitmapFactory.decodeFile(str, options);
        } catch (OutOfMemoryError e) {
            SLog.e("openSDK_LOG.AsynScaleCompressImage", "isBitMapNeedToCompress exception:", e);
        }
        int i3 = options.outWidth;
        int i4 = options.outHeight;
        if (options.mCancel || options.outWidth == -1 || options.outHeight == -1) {
            return false;
        }
        int i5 = i3 > i4 ? i3 : i4;
        if (i3 >= i4) {
            i3 = i4;
        }
        SLog.d("openSDK_LOG.AsynScaleCompressImage", "longSide=" + i5 + "shortSide=" + i3);
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return i5 > i2 || i3 > i;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap a(java.lang.String r7, int r8) {
        /*
            java.lang.String r0 = "openSDK_LOG.AsynScaleCompressImage"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r3 = 1
            r1.inJustDecodeBounds = r3
            android.graphics.BitmapFactory.decodeFile(r7, r1)     // Catch: java.lang.OutOfMemoryError -> L17
            goto L1e
        L17:
            r3 = move-exception
            java.lang.String r4 = "scaleBitmap exception1:"
            com.tencent.open.log.SLog.e(r0, r4, r3)
        L1e:
            int r3 = r1.outWidth
            int r4 = r1.outHeight
            boolean r5 = r1.mCancel
            if (r5 != 0) goto L72
            int r5 = r1.outWidth
            r6 = -1
            if (r5 == r6) goto L72
            int r5 = r1.outHeight
            if (r5 != r6) goto L30
            goto L72
        L30:
            if (r3 <= r4) goto L33
            goto L34
        L33:
            r3 = r4
        L34:
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.RGB_565
            r1.inPreferredConfig = r4
            if (r3 <= r8) goto L42
            int r3 = r8 * r8
            int r3 = a(r1, r6, r3)
            r1.inSampleSize = r3
        L42:
            r3 = 0
            r1.inJustDecodeBounds = r3
            android.graphics.Bitmap r7 = android.graphics.BitmapFactory.decodeFile(r7, r1)     // Catch: java.lang.OutOfMemoryError -> L4a java.lang.Exception -> L52
            goto L5a
        L4a:
            r7 = move-exception
            java.lang.String r3 = "scaleBitmap OutOfMemoryError:"
            com.tencent.open.log.SLog.e(r0, r3, r7)
            goto L59
        L52:
            r7 = move-exception
            java.lang.String r3 = "scaleBitmap exception2:"
            com.tencent.open.log.SLog.e(r0, r3, r7)
        L59:
            r7 = r2
        L5a:
            if (r7 != 0) goto L63
            java.lang.String r7 = "scaleBitmap return null"
            com.tencent.open.log.SLog.e(r0, r7)
            return r2
        L63:
            int r0 = r1.outWidth
            int r1 = r1.outHeight
            if (r0 <= r1) goto L6a
            goto L6b
        L6a:
            r0 = r1
        L6b:
            if (r0 <= r8) goto L71
            android.graphics.Bitmap r7 = a(r7, r8)
        L71:
            return r7
        L72:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.connect.share.a.a(java.lang.String, int):android.graphics.Bitmap");
    }

    public static final int a(BitmapFactory.Options options, int i, int i2) {
        int b = b(options, i, i2);
        if (b > 8) {
            return ((b + 7) / 8) * 8;
        }
        int i3 = 1;
        while (i3 < b) {
            i3 <<= 1;
        }
        return i3;
    }

    private static int b(BitmapFactory.Options options, int i, int i2) {
        int min;
        double d = options.outWidth;
        double d2 = options.outHeight;
        int ceil = i2 == -1 ? 1 : (int) Math.ceil(Math.sqrt((d * d2) / i2));
        if (i == -1) {
            min = 128;
        } else {
            double d3 = i;
            min = (int) Math.min(Math.floor(d / d3), Math.floor(d2 / d3));
        }
        if (min >= ceil) {
            if (i2 == -1 && i == -1) {
                return 1;
            }
            if (i != -1) {
                return min;
            }
        }
        return ceil;
    }
}
