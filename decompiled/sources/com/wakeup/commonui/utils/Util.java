package com.wakeup.commonui.utils;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.widget.Toast;
import androidx.documentfile.provider.DocumentFile;
import com.alipay.sdk.m.p.a;
import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.hjq.permissions.Permission;
import com.tencent.open.log.SLog;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.permissions.PermissionsManager;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Objects;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import kotlin.text.Typography;

/* loaded from: classes2.dex */
public class Util {
    public static String ACTION_OPEN_DOCUMENT = "android.intent.action.OPEN_DOCUMENT";
    public static int Build_VERSION_KITKAT = 19;
    private static final String PATH_DOCUMENT = "document";
    private static final String TAG = "SDK_Sample.Util";
    private static final String hexString = "0123456789ABCDEF";
    private static Dialog mProgressDialog;
    private static Toast mToast;

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b : bArr) {
            String hexString2 = Integer.toHexString(b & 255);
            if (hexString2.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString2);
        }
        return sb.toString();
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (charToByte(charArray[i2 + 1]) | (charToByte(charArray[i2]) << 4));
        }
        return bArr;
    }

    private static byte charToByte(char c) {
        return (byte) hexString.indexOf(c);
    }

    public static String toHexString(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        if (bytes == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bytes.length * 2);
        for (int i = 0; i < bytes.length; i++) {
            sb.append(hexString.charAt((bytes[i] & TransmissionUnpacked.HD_VAL_MAGIC_HB) >> 4));
            sb.append(hexString.charAt(bytes[i] & 15));
        }
        return sb.toString();
    }

    public static String hexToString(String str) {
        if ("0x".equals(str.substring(0, 2))) {
            str = str.substring(2);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            try {
                bArr[i] = (byte) (Integer.parseInt(str.substring(i2, i2 + 2), 16) & 255);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        try {
            return new String(bArr, StandardCharsets.UTF_8);
        } catch (Exception e2) {
            e2.printStackTrace();
            return str;
        }
    }

    public static byte[] bmpToByteArray(Bitmap bitmap, boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        if (z) {
            bitmap.recycle();
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Exception e) {
            e.printStackTrace();
            return byteArray;
        }
    }

    public static byte[] getHtmlByteArray(String str) {
        InputStream inputStream = null;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (httpURLConnection.getResponseCode() == 200) {
                inputStream = httpURLConnection.getInputStream();
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        return inputStreamToByte(inputStream);
    }

    public static byte[] inputStreamToByte(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = inputStream.read();
                if (read != -1) {
                    byteArrayOutputStream.write(read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    return byteArray;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] readFromFile(String str, int i, int i2) {
        byte[] bArr = null;
        if (str == null) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            Log.i(TAG, "readFromFile: file not found");
            return null;
        }
        if (i2 == -1) {
            i2 = (int) file.length();
        }
        int i3 = i + i2;
        Log.d(TAG, "readFromFile : offset = " + i + " len = " + i2 + " offset + len = " + i3);
        if (i < 0) {
            Log.e(TAG, "readFromFile invalid offset:" + i);
            return null;
        }
        if (i2 <= 0) {
            Log.e(TAG, "readFromFile invalid len:" + i2);
            return null;
        }
        if (i3 > ((int) file.length())) {
            Log.e(TAG, "readFromFile invalid file len:" + file.length());
            return null;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            bArr = new byte[i2];
            randomAccessFile.seek(i);
            randomAccessFile.readFully(bArr);
            randomAccessFile.close();
            return bArr;
        } catch (Exception e) {
            Log.e(TAG, "readFromFile : errMsg = " + e.getMessage());
            e.printStackTrace();
            return bArr;
        }
    }

    public static int computeSampleSize(BitmapFactory.Options options, int i, int i2) {
        int computeInitialSampleSize = computeInitialSampleSize(options, i, i2);
        if (computeInitialSampleSize > 8) {
            return ((computeInitialSampleSize + 7) / 8) * 8;
        }
        int i3 = 1;
        while (i3 < computeInitialSampleSize) {
            i3 <<= 1;
        }
        return i3;
    }

    private static int computeInitialSampleSize(BitmapFactory.Options options, int i, int i2) {
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

    public static Bitmap readBitmap(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str + "test.jpg"));
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inSampleSize = 8;
            options.inPurgeable = true;
            options.inInputShareable = true;
            return BitmapFactory.decodeStream(fileInputStream, null, options);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }

    public static final void showResultDialog(Context context, String str, String str2) {
        if (str == null) {
            return;
        }
        String replace = str.replace(",", "\n");
        Log.d("Util", replace);
        new AlertDialog.Builder(context).setTitle(str2).setMessage(replace).setNegativeButton("知道了", (DialogInterface.OnClickListener) null).create().show();
    }

    public static final void showProgressDialog(Context context, String str, String str2) {
        dismissDialog();
        if (TextUtils.isEmpty(str)) {
            str = "请稍候";
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = "正在加载...";
        }
        mProgressDialog = ProgressDialog.show(context, str, str2);
    }

    public static AlertDialog showConfirmCancelDialog(Context context, String str, String str2, DialogInterface.OnClickListener onClickListener) {
        AlertDialog create = new AlertDialog.Builder(context).setMessage(str2).setPositiveButton("确认", onClickListener).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create();
        create.setCanceledOnTouchOutside(false);
        create.show();
        return create;
    }

    public static final void dismissDialog() {
        Dialog dialog = mProgressDialog;
        if (dialog != null) {
            dialog.dismiss();
            mProgressDialog = null;
        }
    }

    public static final void toastMessage(final Activity activity, final String str, String str2) {
        if ("w".equals(str2)) {
            Log.w("sdkDemo", str);
        } else if ("e".equals(str2)) {
            Log.e("sdkDemo", str);
        } else {
            Log.d("sdkDemo", str);
        }
        activity.runOnUiThread(new Runnable() { // from class: com.wakeup.commonui.utils.Util.1
            @Override // java.lang.Runnable
            public void run() {
                if (Util.mToast != null) {
                    Util.mToast.cancel();
                    Util.mToast = null;
                }
                Util.mToast = Toast.makeText(activity, str, 0);
                Util.mToast.show();
            }
        });
    }

    public static final void toastMessage(Activity activity, String str) {
        toastMessage(activity, str, null);
    }

    public static Bitmap getbitmap(String str) {
        SLog.i(TAG, "getbitmap:" + str);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoInput(true);
            httpURLConnection.connect();
            InputStream inputStream = httpURLConnection.getInputStream();
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
            inputStream.close();
            SLog.i(TAG, "image download finished." + str);
            return decodeStream;
        } catch (IOException e) {
            SLog.e(TAG, "getbitmap IOException : " + e.getMessage());
            return null;
        } catch (OutOfMemoryError e2) {
            SLog.e(TAG, "getBitmap outOfMemoryError : " + e2.getMessage());
            return null;
        }
    }

    public static void release() {
        mProgressDialog = null;
        mToast = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static String getPath(Context context, Uri uri, String str) {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        FileOutputStream fileOutputStream2;
        InputStream inputStream2;
        Uri uri2 = null;
        r6 = 0;
        ?? r6 = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            ?? isDocumentUri = isDocumentUri(context, uri);
            try {
                if (isDocumentUri != 0) {
                    try {
                        isDocumentUri = context.getContentResolver().openInputStream(uri);
                        try {
                            DocumentFile fromSingleUri = DocumentFile.fromSingleUri(context, uri);
                            if (fromSingleUri == null) {
                                if (isDocumentUri != 0) {
                                    try {
                                        isDocumentUri.close();
                                        return null;
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        Log.e(TAG, "inputStream close exception : " + e.getMessage());
                                    }
                                }
                                return null;
                            }
                            String path = fromSingleUri.getUri().getPath();
                            String name = fromSingleUri.getName();
                            LogUtils.d(TAG, "path = " + path + " ; name = " + name);
                            File file = new File(str + name);
                            if (!((File) Objects.requireNonNull(file.getParentFile())).exists() && !file.getParentFile().mkdirs()) {
                                LogUtils.e(TAG, "android q create dirs fail");
                            }
                            if (!file.createNewFile()) {
                                Log.e(TAG, "android q create new file fail");
                            }
                            FileOutputStream fileOutputStream3 = new FileOutputStream(file);
                            try {
                                if (isDocumentUri == 0) {
                                    Log.e(TAG, "getInputStream from uri is null");
                                    try {
                                        fileOutputStream3.close();
                                    } catch (IOException e2) {
                                        e2.printStackTrace();
                                        Log.e(TAG, "fileOutputStream close exception : " + e2.getMessage());
                                    }
                                    if (isDocumentUri != 0) {
                                        try {
                                            isDocumentUri.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                            Log.e(TAG, "inputStream close exception : " + e3.getMessage());
                                        }
                                    }
                                    return null;
                                }
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = isDocumentUri.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream3.write(bArr, 0, read);
                                }
                                String absolutePath = file.getAbsolutePath();
                                try {
                                    fileOutputStream3.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                    Log.e(TAG, "fileOutputStream close exception : " + e4.getMessage());
                                }
                                if (isDocumentUri != 0) {
                                    try {
                                        isDocumentUri.close();
                                    } catch (IOException e5) {
                                        e5.printStackTrace();
                                        Log.e(TAG, "inputStream close exception : " + e5.getMessage());
                                    }
                                }
                                return absolutePath;
                            } catch (FileNotFoundException e6) {
                                fileOutputStream2 = fileOutputStream3;
                                e = e6;
                                inputStream2 = isDocumentUri;
                                e.printStackTrace();
                                Log.e(TAG, "getInputStream from uri FileNotFoundException : " + e.getMessage());
                                if (fileOutputStream2 != null) {
                                    try {
                                        fileOutputStream2.close();
                                    } catch (IOException e7) {
                                        e7.printStackTrace();
                                        Log.e(TAG, "fileOutputStream close exception : " + e7.getMessage());
                                    }
                                }
                                if (inputStream2 != null) {
                                    try {
                                        inputStream2.close();
                                    } catch (IOException e8) {
                                        e8.printStackTrace();
                                        Log.e(TAG, "inputStream close exception : " + e8.getMessage());
                                    }
                                }
                                return null;
                            } catch (Exception e9) {
                                fileOutputStream = fileOutputStream3;
                                e = e9;
                                inputStream = isDocumentUri;
                                e.printStackTrace();
                                Log.e(TAG, "getInputStream from uri IOException : " + e.getMessage());
                                if (fileOutputStream != null) {
                                    try {
                                        fileOutputStream.close();
                                    } catch (IOException e10) {
                                        e10.printStackTrace();
                                        Log.e(TAG, "fileOutputStream close exception : " + e10.getMessage());
                                    }
                                }
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e11) {
                                        e11.printStackTrace();
                                        Log.e(TAG, "inputStream close exception : " + e11.getMessage());
                                    }
                                }
                                return null;
                            } catch (Throwable th) {
                                r6 = fileOutputStream3;
                                th = th;
                                if (r6 != 0) {
                                    try {
                                        r6.close();
                                    } catch (IOException e12) {
                                        e12.printStackTrace();
                                        Log.e(TAG, "fileOutputStream close exception : " + e12.getMessage());
                                    }
                                }
                                if (isDocumentUri == 0) {
                                    throw th;
                                }
                                try {
                                    isDocumentUri.close();
                                    throw th;
                                } catch (IOException e13) {
                                    e13.printStackTrace();
                                    Log.e(TAG, "inputStream close exception : " + e13.getMessage());
                                    throw th;
                                }
                            }
                        } catch (FileNotFoundException e14) {
                            e = e14;
                            fileOutputStream2 = null;
                            inputStream2 = isDocumentUri;
                        } catch (Exception e15) {
                            e = e15;
                            fileOutputStream = null;
                            inputStream = isDocumentUri;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (FileNotFoundException e16) {
                        e = e16;
                        fileOutputStream2 = null;
                        inputStream2 = null;
                    } catch (Exception e17) {
                        e = e17;
                        fileOutputStream = null;
                        inputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        isDocumentUri = 0;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                r6 = uri;
            }
        }
        if (isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else {
                if (isDownloadsDocument(uri)) {
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.parseLong(getDocumentId(uri))), null, null);
                    } catch (NumberFormatException e18) {
                        SLog.e(TAG, "getPath: exception", e18);
                        return getDataColumn(context, uri, null, null);
                    }
                }
                if (isMediaDocument(uri)) {
                    String[] split2 = getDocumentId(uri).split(":");
                    String str2 = split2[0];
                    if ("image".equals(str2)) {
                        uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                    } else if ("video".equals(str2)) {
                        uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                    } else if ("audio".equals(str2)) {
                        uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                    }
                    return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
                }
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                return isGooglePhotosUri(uri) ? uri.getLastPathSegment() : getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    private static boolean isDocumentUri(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return false;
        }
        return PATH_DOCUMENT.equals(pathSegments.get(0));
    }

    private static String getDocumentId(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            throw new IllegalArgumentException("Not a document: " + uri);
        }
        if (!PATH_DOCUMENT.equals(pathSegments.get(0))) {
            throw new IllegalArgumentException("Not a document: " + uri);
        }
        return pathSegments.get(1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0042, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r9 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0045, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getDataColumn(android.content.Context r9, android.net.Uri r10, java.lang.String r11, java.lang.String[] r12) {
        /*
            r0 = 1
            java.lang.String[] r3 = new java.lang.String[r0]
            r0 = 0
            java.lang.String r7 = "_data"
            r3[r0] = r7
            r8 = 0
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            if (r9 == 0) goto L2e
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L46
            if (r10 == 0) goto L2e
            int r10 = r9.getColumnIndexOrThrow(r7)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L46
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.Exception -> L2b java.lang.Throwable -> L46
            if (r9 == 0) goto L2a
            r9.close()
        L2a:
            return r10
        L2b:
            r0 = move-exception
            r10 = r0
            goto L3a
        L2e:
            if (r9 == 0) goto L45
        L30:
            r9.close()
            goto L45
        L34:
            r0 = move-exception
            r10 = r0
            goto L49
        L37:
            r0 = move-exception
            r10 = r0
            r9 = r8
        L3a:
            java.lang.String r11 = "openSDK_LOG"
            java.lang.String r12 = "getDataColumn excption:"
            com.tencent.open.log.SLog.e(r11, r12, r10)     // Catch: java.lang.Throwable -> L46
            if (r9 == 0) goto L45
            goto L30
        L45:
            return r8
        L46:
            r0 = move-exception
            r10 = r0
            r8 = r9
        L49:
            if (r8 == 0) goto L4e
            r8.close()
        L4e:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commonui.utils.Util.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static boolean isExternalStorageDocument(Uri uri) {
        return "com.android.externalstorage.documents".equals(uri.getAuthority());
    }

    public static boolean isDownloadsDocument(Uri uri) {
        return "com.android.providers.downloads.documents".equals(uri.getAuthority());
    }

    public static boolean isMediaDocument(Uri uri) {
        return "com.android.providers.media.documents".equals(uri.getAuthority());
    }

    public static boolean isGooglePhotosUri(Uri uri) {
        return "com.google.android.apps.photos.content".equals(uri.getAuthority());
    }

    public static boolean isTargetApiAboveQ(Context context) {
        return context != null && context.getApplicationInfo().targetSdkVersion >= 29 && Build.VERSION.SDK_INT >= 29 && !isExternalStorageLegacy();
    }

    private static boolean isExternalStorageLegacy() {
        try {
            return ((Boolean) Environment.class.getMethod("isExternalStorageLegacy", new Class[0]).invoke(Environment.class, new Object[0])).booleanValue();
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    public static String hmacSha1(String str, String str2) throws NoSuchAlgorithmException, InvalidKeyException {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return "";
        }
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "HmacSHA1");
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(secretKeySpec);
        return Base64.encodeToString(mac.doFinal(str.getBytes()), 0);
    }

    public static String addParameter(String str, String str2, String str3) {
        StringBuilder sb;
        StringBuilder append;
        int indexOf = str.indexOf(63);
        int indexOf2 = str.indexOf(35);
        String str4 = (indexOf != -1 ? Typography.amp : '?') + encodeUrl(str2) + a.h + encodeUrl(str3);
        if (indexOf2 == -1) {
            sb = new StringBuilder();
            append = sb.append(str).append(str4);
        } else {
            sb = new StringBuilder();
            append = sb.append(str.substring(0, indexOf2)).append(str4).append(str.substring(indexOf2));
        }
        return append.toString();
    }

    public static String encodeUrl(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int parseIntValue(String str, int i) {
        try {
            return Integer.parseInt(str);
        } catch (Exception e) {
            SLog.e(TAG, "Exception", e);
            return i;
        }
    }

    public static boolean isTelephonyCalling(Context context) {
        try {
            if (!PermissionsManager.checkPermission(Permission.READ_PHONE_STATE)) {
                return false;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (2 != telephonyManager.getCallState()) {
                if (1 != telephonyManager.getCallState()) {
                    return false;
                }
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
