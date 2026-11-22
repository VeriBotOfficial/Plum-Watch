package com.wakeup.common.temp;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.wakeup.common.base.BaseApplication;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes2.dex */
public class Tools {
    public static String getFilePathFromURI(Context context, Uri contentUri) {
        File externalFilesDir = context.getExternalFilesDir(null);
        String fileName = getFileName(contentUri);
        if (TextUtils.isEmpty(fileName)) {
            return null;
        }
        File file = new File(externalFilesDir + File.separator + fileName);
        copyFile(context, contentUri, file);
        return file.getAbsolutePath();
    }

    public static String getFileName(Uri uri) {
        String path;
        int lastIndexOf;
        if (uri == null || (lastIndexOf = (path = uri.getPath()).lastIndexOf(47)) == -1) {
            return null;
        }
        return path.substring(lastIndexOf + 1);
    }

    public static String getFileNameByUri(Uri uri) {
        if (uri == null) {
            return null;
        }
        String str = "";
        if (Objects.equals(uri.getScheme(), "content")) {
            Cursor query = BaseApplication.getContext().getContentResolver().query(uri, null, null, null, null);
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndex("_display_name"));
                    }
                } finally {
                    query.close();
                }
            }
        }
        return str;
    }

    public static void copyFile(Context context, Uri srcUri, File dstFile) {
        try {
            InputStream openInputStream = context.getContentResolver().openInputStream(srcUri);
            if (openInputStream == null) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(dstFile);
            copyStream(openInputStream, fileOutputStream);
            openInputStream.close();
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static int copyStream(InputStream input, OutputStream output) throws Exception, IOException {
        byte[] bArr = new byte[2048];
        BufferedInputStream bufferedInputStream = new BufferedInputStream(input, 2048);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(output, 2048);
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
        } catch (IOException unused) {
        }
        try {
            bufferedInputStream.close();
        } catch (IOException unused2) {
        }
        return i;
    }
}
