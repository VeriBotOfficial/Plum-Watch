package com.sifli.watchfacelibrary;

import android.text.TextUtils;
import android.util.Log;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Objects;

/* loaded from: classes17.dex */
public class FileProcess {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TAG = "WF-FileProcess";

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
        throw new UnsupportedOperationException("Method not decompiled: com.sifli.watchfacelibrary.FileProcess.unzipFolder(java.lang.String, java.lang.String):void");
    }

    public static byte[] openFile(String str) {
        byte[] bArr = new byte[0];
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.ISO_8859_1);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = bufferedReader.read();
                if (read != -1) {
                    byteArrayOutputStream.write(read);
                } else {
                    bArr = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    bufferedReader.close();
                    inputStreamReader.close();
                    fileInputStream.close();
                    return bArr;
                }
            }
        } catch (FileNotFoundException unused) {
            Log.e(TAG, str + " doesn't found!");
            return null;
        } catch (IOException e) {
            Log.e(TAG, str + " read exception, " + e.getMessage());
            e.printStackTrace();
            return bArr;
        }
    }
}
