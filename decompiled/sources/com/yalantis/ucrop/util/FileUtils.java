package com.yalantis.ucrop.util;

import android.content.ContentUris;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.MimeTypeMap;
import com.luck.picture.lib.config.PictureMimeType;
import io.agora.utils2.internal.CommonUtility;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;

/* loaded from: classes3.dex */
public class FileUtils {
    public static final String GIF = ".gif";
    public static final String JPEG = ".jpeg";
    private static final String TAG = "FileUtils";
    public static final String WEBP = ".webp";
    private static final SimpleDateFormat sf = new SimpleDateFormat("yyyyMMddHHmmssSSS");

    private FileUtils() {
    }

    public static boolean isContent(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith(CommonUtility.PREFIX_URI);
    }

    public static Uri replaceOutputUri(Context context, boolean z, Uri uri, Uri uri2) {
        String postfixDefaultEmpty;
        try {
            postfixDefaultEmpty = getPostfixDefaultEmpty(context, z, uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(postfixDefaultEmpty)) {
            return uri2;
        }
        String uri3 = isContent(uri2.toString()) ? uri2.toString() : uri2.getPath();
        String replace = uri3.replace(uri3.substring(uri3.lastIndexOf(".")), postfixDefaultEmpty);
        return isContent(replace) ? Uri.parse(replace) : Uri.fromFile(new File(replace));
    }

    public static String getPostfixDefaultJPEG(Context context, boolean z, Uri uri) {
        if (z) {
            String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
            if (isGif(mimeTypeFromMediaContentUri)) {
                return ".gif";
            }
            if (isWebp(mimeTypeFromMediaContentUri)) {
                return ".webp";
            }
            return ".jpeg";
        }
        return ".jpeg";
    }

    public static String getPostfixDefaultEmpty(Context context, boolean z, Uri uri) {
        if (z) {
            String mimeTypeFromMediaContentUri = getMimeTypeFromMediaContentUri(context, uri);
            if (isGif(mimeTypeFromMediaContentUri)) {
                return ".gif";
            }
            if (isWebp(mimeTypeFromMediaContentUri)) {
                return ".webp";
            }
            return "";
        }
        return "";
    }

    public static String getInputPath(Uri uri) {
        return (isContent(uri.toString()) || isHasHttp(uri.toString())) ? uri.toString() : uri.getPath();
    }

    public static boolean isUrlHasVideo(String str) {
        return !TextUtils.isEmpty(str) && str.toLowerCase().endsWith(PictureMimeType.MP4);
    }

    public static boolean isHasVideo(String str) {
        return str != null && str.startsWith("video");
    }

    public static boolean isHasAudio(String str) {
        return str != null && str.startsWith("audio");
    }

    public static boolean isHasHttp(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http") || str.startsWith("https") || str.startsWith("/http") || str.startsWith("/https");
    }

    public static boolean isGif(String str) {
        if (str != null) {
            return str.equals("image/gif") || str.equals("image/GIF");
        }
        return false;
    }

    public static boolean isWebp(String str) {
        if (str != null) {
            return str.equals("image/webp") || str.equals("image/WEBP");
        }
        return false;
    }

    public static String getMimeTypeFromMediaContentUri(Context context, Uri uri) {
        if (uri.getScheme().equals("content")) {
            return context.getContentResolver().getType(uri);
        }
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()).toLowerCase());
    }

    public static String getCreateFileName(String str) {
        return str + sf.format(Long.valueOf(System.currentTimeMillis()));
    }

    public static String getCreateFileName() {
        return sf.format(Long.valueOf(System.currentTimeMillis()));
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r9 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002e, code lost:
    
        if (r9 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0030, code lost:
    
        r9.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0054, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v2 */
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
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L34 java.lang.IllegalArgumentException -> L37
            r6 = 0
            r2 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L34 java.lang.IllegalArgumentException -> L37
            if (r9 == 0) goto L2e
            boolean r10 = r9.moveToFirst()     // Catch: java.lang.IllegalArgumentException -> L2b java.lang.Throwable -> L55
            if (r10 == 0) goto L2e
            int r10 = r9.getColumnIndexOrThrow(r7)     // Catch: java.lang.IllegalArgumentException -> L2b java.lang.Throwable -> L55
            java.lang.String r10 = r9.getString(r10)     // Catch: java.lang.IllegalArgumentException -> L2b java.lang.Throwable -> L55
            if (r9 == 0) goto L2a
            r9.close()
        L2a:
            return r10
        L2b:
            r0 = move-exception
            r10 = r0
            goto L3a
        L2e:
            if (r9 == 0) goto L54
        L30:
            r9.close()
            goto L54
        L34:
            r0 = move-exception
            r10 = r0
            goto L58
        L37:
            r0 = move-exception
            r10 = r0
            r9 = r8
        L3a:
            java.lang.String r11 = "FileUtils"
            java.util.Locale r12 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L55
            java.lang.String r0 = "getDataColumn: _data - [%s]"
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L55
            java.lang.Object[] r10 = new java.lang.Object[]{r10}     // Catch: java.lang.Throwable -> L55
            java.lang.String r10 = java.lang.String.format(r12, r0, r10)     // Catch: java.lang.Throwable -> L55
            android.util.Log.i(r11, r10)     // Catch: java.lang.Throwable -> L55
            if (r9 == 0) goto L54
            goto L30
        L54:
            return r8
        L55:
            r0 = move-exception
            r10 = r0
            r8 = r9
        L58:
            if (r8 == 0) goto L5d
            r8.close()
        L5d:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yalantis.ucrop.util.FileUtils.getDataColumn(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    public static String getPath(Context context, Uri uri) {
        Uri uri2 = null;
        if (DocumentsContract.isDocumentUri(context, uri)) {
            if (isExternalStorageDocument(uri)) {
                String[] split = DocumentsContract.getDocumentId(uri).split(":");
                if ("primary".equalsIgnoreCase(split[0])) {
                    return Environment.getExternalStorageDirectory() + "/" + split[1];
                }
            } else if (isDownloadsDocument(uri)) {
                String documentId = DocumentsContract.getDocumentId(uri);
                if (!TextUtils.isEmpty(documentId)) {
                    try {
                        return getDataColumn(context, ContentUris.withAppendedId(Uri.parse("content://downloads/public_downloads"), Long.valueOf(documentId).longValue()), null, null);
                    } catch (NumberFormatException e) {
                        Log.i(TAG, e.getMessage());
                        return null;
                    }
                }
            } else if (isMediaDocument(uri)) {
                String[] split2 = DocumentsContract.getDocumentId(uri).split(":");
                String str = split2[0];
                if ("image".equals(str)) {
                    uri2 = MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
                } else if ("video".equals(str)) {
                    uri2 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
                } else if ("audio".equals(str)) {
                    uri2 = MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
                }
                return getDataColumn(context, uri2, "_id=?", new String[]{split2[1]});
            }
        } else {
            if ("content".equalsIgnoreCase(uri.getScheme())) {
                if (isGooglePhotosUri(uri)) {
                    return uri.getLastPathSegment();
                }
                return getDataColumn(context, uri, null, null);
            }
            if ("file".equalsIgnoreCase(uri.getScheme())) {
                return uri.getPath();
            }
        }
        return null;
    }

    public static void copyFile(String str, String str2) throws IOException {
        Throwable th;
        FileChannel fileChannel;
        if (str.equalsIgnoreCase(str2)) {
            return;
        }
        FileChannel fileChannel2 = null;
        try {
            FileChannel channel = new FileInputStream(new File(str)).getChannel();
            try {
                fileChannel = new FileOutputStream(new File(str2)).getChannel();
                try {
                    channel.transferTo(0L, channel.size(), fileChannel);
                    if (channel != null) {
                        channel.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel2 = channel;
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                    if (fileChannel != null) {
                        fileChannel.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileChannel = null;
        }
    }

    public static void copyFile(Context context, Uri uri, Uri uri2) throws IOException {
        Throwable th;
        OutputStream outputStream;
        InputStream openInputStream;
        if (uri.equals(uri2)) {
            return;
        }
        InputStream inputStream = null;
        try {
            openInputStream = context.getContentResolver().openInputStream(uri);
        } catch (Throwable th2) {
            th = th2;
            outputStream = null;
        }
        try {
            OutputStream openOutputStream = context.getContentResolver().openOutputStream(uri2);
            if ((openInputStream instanceof FileInputStream) && (openOutputStream instanceof FileOutputStream)) {
                FileChannel channel = ((FileInputStream) openInputStream).getChannel();
                channel.transferTo(0L, channel.size(), ((FileOutputStream) openOutputStream).getChannel());
                if (openInputStream != null) {
                    openInputStream.close();
                }
                if (openOutputStream != null) {
                    openOutputStream.close();
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("The input or output URI don't represent a file. uCrop requires then to represent files in order to work properly.");
        } catch (Throwable th3) {
            th = th3;
            inputStream = openInputStream;
            outputStream = null;
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
                throw th;
            }
            throw th;
        }
    }

    public static boolean writeFileFromIS(InputStream inputStream, OutputStream outputStream) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                bufferedOutputStream = new BufferedOutputStream(outputStream);
            } catch (Exception e) {
                e = e;
                bufferedOutputStream = null;
            } catch (Throwable th) {
                th = th;
                bufferedOutputStream = null;
            }
        } catch (Exception e2) {
            e = e2;
            bufferedOutputStream = null;
        } catch (Throwable th2) {
            th = th2;
            bufferedOutputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                } else {
                    outputStream.flush();
                    BitmapLoadUtils.close(bufferedInputStream);
                    BitmapLoadUtils.close(bufferedOutputStream);
                    return true;
                }
            }
        } catch (Exception e3) {
            e = e3;
            bufferedInputStream2 = bufferedInputStream;
            try {
                e.printStackTrace();
                BitmapLoadUtils.close(bufferedInputStream2);
                BitmapLoadUtils.close(bufferedOutputStream);
                return false;
            } catch (Throwable th3) {
                th = th3;
                BitmapLoadUtils.close(bufferedInputStream2);
                BitmapLoadUtils.close(bufferedOutputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedInputStream2 = bufferedInputStream;
            BitmapLoadUtils.close(bufferedInputStream2);
            BitmapLoadUtils.close(bufferedOutputStream);
            throw th;
        }
    }
}
