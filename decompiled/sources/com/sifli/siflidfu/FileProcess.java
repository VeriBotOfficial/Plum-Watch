package com.sifli.siflidfu;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes15.dex */
public class FileProcess {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String TAG = "dfuFileProcess";
    private static String mLogString;

    public static String getmLogString() {
        return mLogString;
    }

    public static ArrayList<OTAFile> getImageFile(ArrayList<DFUImagePath> arrayList, Context context, int i) {
        byte[] openFile;
        ArrayList<OTAFile> arrayList2 = new ArrayList<>();
        mLogString = null;
        Iterator<DFUImagePath> it = arrayList.iterator();
        while (it.hasNext()) {
            DFUImagePath next = it.next();
            String imagePath = next.getImagePath();
            Uri imageUri = next.getImageUri();
            int imageType = next.getImageType();
            if (imageType >= -1) {
                if (imageUri != null) {
                    imagePath = getFilePathFromURI(context, imageUri);
                    Log.d(TAG, "image id " + imageType + ", md5: " + getMD5(imagePath));
                }
                if (imagePath == null) {
                    return null;
                }
                if (i == 0 || imageType == -1) {
                    openFile = openFile(context, imagePath);
                    if (openFile == null) {
                        mLogString += ", id " + imageType + " load fail\n";
                        Log.e(TAG, "id " + imageType + " open fail");
                    }
                } else {
                    openFile = null;
                }
                OTAFile oTAFile = new OTAFile(openFile, imageType);
                oTAFile.setFilePath(imagePath);
                arrayList2.add(oTAFile);
            }
        }
        return arrayList2;
    }

    public static ArrayList<OTAFile> getNandResFiles(String str, ArrayList<OTAFile> arrayList, String str2, Context context) {
        File[] listFiles;
        File file = new File(str);
        if (!file.exists() || (listFiles = file.listFiles()) == null) {
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.isFile()) {
                String absolutePath = file2.getAbsolutePath();
                arrayList.add(new OTAFile(absolutePath.substring(str2.length()), openFile(context, absolutePath), file2.getName()));
            } else if (file2.isDirectory()) {
                getNandResFiles(file2.getAbsolutePath(), arrayList, str2, context);
            }
        }
        return arrayList;
    }

    public static int getFileBlockCount(ArrayList<OTAFile> arrayList, int i) {
        int fileLength;
        Iterator<OTAFile> it = arrayList.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            OTAFile next = it.next();
            next.getFileLength();
            if (next.getFileLength() % i == 0) {
                fileLength = next.getFileLength() / i;
            } else {
                fileLength = (next.getFileLength() / i) + 1;
            }
            i2 += fileLength;
        }
        return i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LoadListFile(java.util.ArrayList<com.sifli.siflidfu.OTAFile> r10, android.content.Context r11) {
        /*
            java.lang.String r0 = "temp_list.txt"
            java.util.Iterator r1 = r10.iterator()
        L6:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()
            com.sifli.siflidfu.OTAFile r2 = (com.sifli.siflidfu.OTAFile) r2
            java.lang.String r3 = r2.getFileName()
            java.lang.String r4 = "ota_file_list_order.txt"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L6
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r1 = "dfuFileProcess"
            r3 = 0
            if (r2 != 0) goto L2b
            java.lang.String r10 = "fail to find list file"
            android.util.Log.e(r1, r10)
            return r3
        L2b:
            r4 = 1
            r2.setFileIndex(r4)
            java.io.FileOutputStream r5 = r11.openFileOutput(r0, r3)     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            byte[] r2 = r2.getFileData()     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            r5.write(r2)     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            r5.close()     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            java.io.FileInputStream r11 = r11.openFileInput(r0)     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            java.io.DataInputStream r0 = new java.io.DataInputStream     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            r0.<init>(r11)     // Catch: java.io.IOException -> L8a java.io.FileNotFoundException -> L90
            r2 = 2
            r5 = r4
        L48:
            java.lang.String r6 = r0.readLine()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            if (r6 == 0) goto L7f
            java.lang.String r7 = "/"
            int r7 = r6.lastIndexOf(r7)     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            r8 = -1
            if (r7 == r8) goto L7c
            int r7 = r7 + 1
            java.lang.String r6 = r6.substring(r7)     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            java.util.Iterator r7 = r10.iterator()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
        L61:
            boolean r8 = r7.hasNext()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            if (r8 == 0) goto L7c
            java.lang.Object r8 = r7.next()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            com.sifli.siflidfu.OTAFile r8 = (com.sifli.siflidfu.OTAFile) r8     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            java.lang.String r9 = r8.getFileName()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            boolean r9 = r9.equals(r6)     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            if (r9 == 0) goto L61
            r8.setFileIndex(r2)     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            int r5 = r5 + 1
        L7c:
            int r2 = r2 + 1
            goto L48
        L7f:
            r0.close()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            r11.close()     // Catch: java.io.IOException -> L86 java.io.FileNotFoundException -> L88
            goto L95
        L86:
            r11 = move-exception
            goto L8c
        L88:
            r11 = move-exception
            goto L92
        L8a:
            r11 = move-exception
            r5 = r4
        L8c:
            r11.printStackTrace()
            goto L95
        L90:
            r11 = move-exception
            r5 = r4
        L92:
            r11.printStackTrace()
        L95:
            int r11 = r10.size()
            if (r11 == r5) goto Lbc
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "list file process error, size "
            r11.<init>(r0)
            int r10 = r10.size()
            java.lang.StringBuilder r10 = r11.append(r10)
            java.lang.String r11 = ", count "
            java.lang.StringBuilder r10 = r10.append(r11)
            java.lang.StringBuilder r10 = r10.append(r5)
            java.lang.String r10 = r10.toString()
            android.util.Log.e(r1, r10)
            return r3
        Lbc:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.siflidfu.FileProcess.LoadListFile(java.util.ArrayList, android.content.Context):boolean");
    }

    public static String getFilePathFromURI(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.equals("file")) {
            return uri.getPath();
        }
        if (scheme.equals("content")) {
            File externalFilesDir = context.getExternalFilesDir(null);
            String fileName = getFileName(uri);
            if (TextUtils.isEmpty(fileName)) {
                return null;
            }
            File file = new File(externalFilesDir + File.separator + fileName);
            copyFile(context, uri, file);
            return file.getAbsolutePath();
        }
        throw new InvalidParameterException("不支持的Uri类型:" + scheme);
    }

    public static String getFileName(Uri uri) {
        String path;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    public static void copyFile(Context context, Uri uri, File file) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(uri);
            if (openInputStream == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            copyStream(openInputStream, fileOutputStream);
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int copyStream(InputStream inputStream, OutputStream outputStream) throws Exception, IOException {
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 2048);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream, 2048);
        int i = 0;
        while (true) {
            try {
                int read = bufferedInputStream.read(bArr, 0, 2048);
                if (read == -1) {
                    break;
                }
                bufferedOutputStream.write(bArr, 0, read);
                i += read;
            } finally {
            }
        }
        bufferedOutputStream.flush();
        try {
            bufferedOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, "out close error", e);
        }
        try {
            bufferedInputStream.close();
        } catch (IOException e2) {
            Log.e(TAG, "in close error", e2);
        }
        return i;
    }

    public static int getFileSize(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            int available = fileInputStream.available();
            fileInputStream.close();
            return available;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] openFilePartly(Context context, String str, int i, int i2) {
        File file = new File(str);
        byte[] bArr = new byte[i2];
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.skip(i);
            fileInputStream.read(bArr, 0, i2);
            fileInputStream.close();
            return bArr;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getMD5(String str) {
        int i;
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bArr = new byte[1024];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            for (byte b : messageDigest.digest()) {
                stringBuffer.append(Integer.toString((b & 255) + 256, 16).substring(1));
            }
            return stringBuffer.toString().toLowerCase();
        } catch (IOException | NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] openFile(Context context, String str) {
        File file = new File(str);
        context.getResources().getAssets();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.ISO_8859_1);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedReader.read();
                if (read != -1) {
                    byteArrayOutputStream.write(read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return byteArray;
                }
            }
        } catch (FileNotFoundException unused) {
            Log.e(TAG, str + " doesn't found!");
            mLogString += str + " doesn't found!";
            return null;
        } catch (IOException e) {
            Log.e(TAG, str + " read exception, " + e.getMessage());
            mLogString += str + " read exception, " + e.getMessage();
            e.printStackTrace();
            return null;
        }
    }

    public static void deleteFolderFile(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                deleteFolderFile(file2.getAbsolutePath(), true);
            }
        }
        if (z) {
            if (!file.isDirectory()) {
                file.delete();
            } else if (((File[]) Objects.requireNonNull(file.listFiles())).length == 0) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d7, code lost:
    
        throw new java.lang.SecurityException("zip path have traversal characters path");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.zip.ZipInputStream] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.zip.ZipInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void unzipFolder(java.lang.String r6, java.lang.String r7) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.siflidfu.FileProcess.unzipFolder(java.lang.String, java.lang.String):void");
    }
}
