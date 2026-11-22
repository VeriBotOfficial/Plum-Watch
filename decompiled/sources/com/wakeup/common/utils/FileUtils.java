package com.wakeup.common.utils;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Log;
import androidx.media3.common.MimeTypes;
import com.blankj.utilcode.util.CollectionUtils;
import com.blankj.utilcode.util.FileIOUtils;
import com.luck.picture.lib.config.PictureMimeType;
import com.wakeup.common.log.LogUtils;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class FileUtils {
    private static final String TAG = "FileUtils";

    static /* synthetic */ void lambda$saveVideoToAlbumBeforeQ$0(String str, Uri uri) {
    }

    public static boolean saveVideoToAlbum(Context context, String videoFile) {
        if (Build.VERSION.SDK_INT < 29) {
            return saveVideoToAlbumBeforeQ(context, videoFile);
        }
        return saveVideoToAlbumAfterQ(context, videoFile, true);
    }

    public static boolean saveImgToAlbum(Context context, String videoFile) {
        if (Build.VERSION.SDK_INT < 29) {
            return saveVideoToAlbumBeforeQ(context, videoFile);
        }
        return saveVideoToAlbumAfterQ(context, videoFile, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9 A[Catch: IOException -> 0x00a5, TRY_LEAVE, TryCatch #1 {IOException -> 0x00a5, blocks: (B:48:0x00a1, B:41:0x00a9), top: B:47:0x00a1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean saveVideoToAlbumBeforeQ(android.content.Context r6, java.lang.String r7) {
        /*
            java.lang.String r0 = android.os.Environment.DIRECTORY_DCIM
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r7)
            java.io.File r7 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r6.getPackageName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = r1.getName()
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r7.<init>(r0, r2)
            r0 = 0
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L84 java.lang.Exception -> L87
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L7c java.lang.Exception -> L80
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
        L44:
            int r4 = r3.read(r2)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            if (r4 <= 0) goto L4e
            r1.write(r2, r0, r4)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            goto L44
        L4e:
            r2 = 1
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.String r7 = r7.getAbsolutePath()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r4[r0] = r7     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r7 = 2
            java.lang.String[] r7 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.String r5 = "video/*"
            r7[r0] = r5     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            java.lang.String r5 = "image/*"
            r7[r2] = r5     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            com.wakeup.common.utils.FileUtils$$ExternalSyntheticLambda0 r5 = new com.wakeup.common.utils.FileUtils$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r5.<init>()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            android.media.MediaScannerConnection.scanFile(r6, r4, r7, r5)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7a
            r3.close()     // Catch: java.io.IOException -> L73
            r1.close()     // Catch: java.io.IOException -> L73
            return r2
        L73:
            r6 = move-exception
            r6.printStackTrace()
            return r2
        L78:
            r6 = move-exception
            goto L7e
        L7a:
            r6 = move-exception
            goto L82
        L7c:
            r6 = move-exception
            r1 = r2
        L7e:
            r2 = r3
            goto L9f
        L80:
            r6 = move-exception
            r1 = r2
        L82:
            r2 = r3
            goto L89
        L84:
            r6 = move-exception
            r1 = r2
            goto L9f
        L87:
            r6 = move-exception
            r1 = r2
        L89:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L9e
            if (r2 == 0) goto L94
            r2.close()     // Catch: java.io.IOException -> L92
            goto L94
        L92:
            r6 = move-exception
            goto L9a
        L94:
            if (r1 == 0) goto L9d
            r1.close()     // Catch: java.io.IOException -> L92
            goto L9d
        L9a:
            r6.printStackTrace()
        L9d:
            return r0
        L9e:
            r6 = move-exception
        L9f:
            if (r2 == 0) goto La7
            r2.close()     // Catch: java.io.IOException -> La5
            goto La7
        La5:
            r7 = move-exception
            goto Lad
        La7:
            if (r1 == 0) goto Lb0
            r1.close()     // Catch: java.io.IOException -> La5
            goto Lb0
        Lad:
            r7.printStackTrace()
        Lb0:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.utils.FileUtils.saveVideoToAlbumBeforeQ(android.content.Context, java.lang.String):boolean");
    }

    private static boolean saveVideoToAlbumAfterQ(Context context, String filePath, boolean isVideo) {
        try {
            ContentResolver contentResolver = context.getContentResolver();
            File file = new File(filePath);
            Uri insert = contentResolver.insert(isVideo ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, getVideoContentValues(context, file, isVideo));
            copyFileAfterQ(context, contentResolver, file, insert);
            context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", insert));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void copyFileAfterQ(Context context, ContentResolver localContentResolver, File tempFile, Uri localUri) throws IOException {
        if (Build.VERSION.SDK_INT < 29 || context.getApplicationInfo().targetSdkVersion < 29) {
            return;
        }
        OutputStream openOutputStream = localContentResolver.openOutputStream(localUri);
        Files.copy(tempFile.toPath(), openOutputStream);
        openOutputStream.close();
    }

    public static ContentValues getVideoContentValues(Context context, File paramFile, boolean isVideo) {
        ContentValues contentValues = new ContentValues();
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("relative_path", Environment.DIRECTORY_DCIM + File.separator + context.getPackageName());
        }
        String name = paramFile.getName();
        contentValues.put("_display_name", name);
        if (isVideo) {
            contentValues.put("mime_type", "video/mp4");
            return contentValues;
        }
        contentValues.put("mime_type", getImageMimeType(name));
        return contentValues;
    }

    private static String getImageMimeType(String fileName) {
        if (TextUtils.isEmpty(fileName)) {
            return "image/png";
        }
        String lowerCase = fileName.toLowerCase();
        if (lowerCase.endsWith(PictureMimeType.JPG) || lowerCase.endsWith(".jpeg")) {
            return "image/jpeg";
        }
        if (lowerCase.endsWith(PictureMimeType.PNG)) {
            return "image/png";
        }
        if (lowerCase.endsWith(".gif")) {
            return "image/gif";
        }
        if (lowerCase.endsWith(".webp")) {
            return "image/webp";
        }
        return lowerCase.endsWith(PictureMimeType.BMP) ? MimeTypes.IMAGE_BMP : "image/png";
    }

    public static void saveFile(String content, String path) {
        saveFile(content, path, true);
    }

    public static void saveFile(String content, String path, boolean isAppend) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path, isAppend);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, "utf-8");
                try {
                    outputStreamWriter.write(content);
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static byte[] fileToByte(String filePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filePath);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read != -1) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    public static String fileToString(String filePath) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine != null) {
                if (!TextUtils.isEmpty(readLine) && !"".equals(readLine)) {
                    sb.append(readLine);
                }
            } else {
                return sb.toString();
            }
        }
    }

    public static ArrayList<String> getAllDataFileName(String filesName) {
        ArrayList<String> arrayList = new ArrayList<>();
        File[] listFiles = new File(filesName).listFiles();
        if (listFiles == null) {
            return null;
        }
        for (File file : listFiles) {
            String name = file.getName();
            LogUtils.i(TAG, "文     件：" + name);
            if (file.isFile()) {
                if (name.endsWith(".bin") || name.endsWith(".zip")) {
                    arrayList.add(name);
                }
            } else if (file.isDirectory() && name.equals("diff")) {
                arrayList.add(name);
            }
        }
        return arrayList;
    }

    public static ArrayList<String> getAllDataFileName2(String filesName) {
        ArrayList<String> arrayList = new ArrayList<>();
        File[] listFiles = new File(filesName).listFiles();
        if (listFiles != null) {
            for (File file : listFiles) {
                String name = file.getName();
                LogUtils.i(TAG, "文     件：" + name);
                if (file.isFile() && (name.endsWith(".up") || name.endsWith(".upex"))) {
                    arrayList.add(name);
                }
            }
        }
        return arrayList;
    }

    public static boolean createFileDir(File dirFile) {
        boolean z = true;
        if (dirFile == null || dirFile.exists()) {
            return true;
        }
        File parentFile = dirFile.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            return createFileDir(parentFile) && createFileDir(dirFile);
        }
        if (!dirFile.mkdirs() && !dirFile.exists()) {
            z = false;
        }
        if (!z) {
            LogUtils.e("FileUtil", "createFileDir fail " + dirFile);
        }
        return z;
    }

    public static String createFileWithBytes(byte[] bytes, String dirPath, String fileName) {
        try {
            File file = new File(dirPath);
            if (!file.exists()) {
                if (!createFileDir(file)) {
                    LogUtils.e(TAG, "createFile dirFile.mkdirs fail");
                    return null;
                }
            } else if (!file.isDirectory()) {
                if (!file.delete()) {
                    LogUtils.e(TAG, "createFile dirFile !isDirectory and delete fail");
                    return null;
                }
                return createFileWithBytes(bytes, dirPath, fileName);
            }
            File file2 = new File(dirPath, fileName);
            if (!file2.exists() && !file2.createNewFile()) {
                LogUtils.e(TAG, "createFile createNewFile fail");
                return null;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(bytes);
            bufferedOutputStream.flush();
            fileOutputStream.close();
            bufferedOutputStream.close();
            return file2.getPath();
        } catch (Exception e) {
            LogUtils.e(TAG, "createFile fail :" + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

    public static boolean delete(String delFile) {
        File file = new File(delFile);
        if (!file.exists()) {
            LogUtils.i(TAG, "删除文件失败:" + delFile + "不存在！");
            return false;
        }
        if (file.isFile()) {
            return deleteSingleFile(delFile);
        }
        return deleteDirectory(delFile);
    }

    public static boolean deleteSingleFile(String filePath$Name) {
        File file = new File(filePath$Name);
        if (file.exists() && file.isFile()) {
            if (file.delete()) {
                LogUtils.i(TAG, "--Method--", "Copy_Delete.deleteSingleFile: 删除单个文件" + filePath$Name + "成功！");
                return true;
            }
            LogUtils.i(TAG, "删除单个文件" + filePath$Name + "失败！");
            return false;
        }
        LogUtils.i(TAG, "删除单个文件失败：" + filePath$Name + "不存在！");
        return false;
    }

    public static boolean deleteDirectory(String filePath) {
        if (!filePath.endsWith(File.separator)) {
            filePath = filePath + File.separator;
        }
        File file = new File(filePath);
        if (!file.exists() || !file.isDirectory()) {
            LogUtils.i(TAG, "删除目录失败：" + filePath + "不存在！");
            return false;
        }
        boolean z = true;
        for (File file2 : file.listFiles()) {
            if (file2.isFile()) {
                z = deleteSingleFile(file2.getAbsolutePath());
                if (!z) {
                    break;
                }
            } else {
                if (file2.isDirectory() && !(z = deleteDirectory(file2.getAbsolutePath()))) {
                    break;
                }
            }
        }
        if (!z) {
            LogUtils.i(TAG, "删除目录失败！");
            return false;
        }
        if (file.delete()) {
            LogUtils.i(TAG, "--Method--", "Copy_Delete.deleteDirectory: 删除目录" + filePath + "成功！");
            return true;
        }
        LogUtils.i(TAG, "删除目录：" + filePath + "失败！");
        return false;
    }

    public static void fileCopyByUri(Context context, Uri srcUri, File destFile) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(srcUri);
            try {
                FileIOUtils.writeFileFromIS(destFile, openInputStream);
                if (openInputStream != null) {
                    openInputStream.close();
                }
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    public static boolean writeFileFromStringLine(final String path, final String content, final boolean append) {
        BufferedWriter bufferedWriter;
        File fileByPath = com.blankj.utilcode.util.FileUtils.getFileByPath(path);
        if (fileByPath == null || content == null) {
            return false;
        }
        if (!com.blankj.utilcode.util.FileUtils.createOrExistsFile(fileByPath)) {
            Log.e("FileIOUtils", "create file <" + fileByPath + "> failed.");
            return false;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            try {
                bufferedWriter = new BufferedWriter(new FileWriter(fileByPath, append));
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(content);
            bufferedWriter.newLine();
            try {
                bufferedWriter.close();
            } catch (IOException unused) {
            }
            return true;
        } catch (IOException e2) {
            e = e2;
            bufferedWriter2 = bufferedWriter;
            e.printStackTrace();
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused2) {
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
    }

    public static String readFileFromStringFirstLine(final String path) {
        BufferedReader bufferedReader;
        File fileByPath = com.blankj.utilcode.util.FileUtils.getFileByPath(path);
        if (fileByPath == null) {
            return "";
        }
        if (!com.blankj.utilcode.util.FileUtils.createOrExistsFile(fileByPath)) {
            Log.e("FileIOUtils", "create file <" + fileByPath + "> failed.");
            return "";
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(fileByPath));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
        }
        try {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                try {
                    bufferedReader.close();
                } catch (IOException unused) {
                }
                return "";
            }
            try {
                bufferedReader.close();
            } catch (IOException unused2) {
            }
            return readLine;
        } catch (IOException e2) {
            e = e2;
            bufferedReader2 = bufferedReader;
            e.printStackTrace();
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused3) {
                }
            }
            return "";
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
    }

    public static List<String> getSoundFileToData(final String path) {
        List<String> readFile2List = FileIOUtils.readFile2List(path);
        if (CollectionUtils.isEmpty(readFile2List)) {
            return null;
        }
        return readFile2List;
    }
}
