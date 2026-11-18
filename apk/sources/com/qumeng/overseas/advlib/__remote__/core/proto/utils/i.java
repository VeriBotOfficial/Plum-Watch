package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes2.dex */
public class i {
    public static String a(Context context, String str) {
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int r1 = fileInputStreamOpenFileInput.read(bArr);
                if (r1 == -1) {
                    fileInputStreamOpenFileInput.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, r1);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Context context, String str, int r4) {
        try {
            FileInputStream fileInputStreamOpenFileInput = context.openFileInput(str);
            if (r4 <= 0) {
                r4 = 32;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(r4);
            byte[] bArr = new byte[1024];
            while (true) {
                int r0 = fileInputStreamOpenFileInput.read(bArr);
                if (r0 != -1) {
                    byteArrayOutputStream.write(bArr, 0, r0);
                } else {
                    fileInputStreamOpenFileInput.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void a(Context context, String str, String str2) {
        if (str2 == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 32768);
            fileOutputStreamOpenFileOutput.write(str2.getBytes());
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(str, 32768);
            fileOutputStreamOpenFileOutput.write(bArr);
            fileOutputStreamOpenFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
