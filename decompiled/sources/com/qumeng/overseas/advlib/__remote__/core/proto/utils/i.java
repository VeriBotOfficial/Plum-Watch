package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* loaded from: classes17.dex */
public class i {
    public static String a(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read == -1) {
                    openFileInput.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString("UTF-8");
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static byte[] a(Context context, String str, int i) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            if (i <= 0) {
                i = 32;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    openFileInput.close();
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
            FileOutputStream openFileOutput = context.openFileOutput(str, 32768);
            openFileOutput.write(str2.getBytes());
            openFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void a(Context context, String str, byte[] bArr) {
        if (bArr == null) {
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput(str, 32768);
            openFileOutput.write(bArr);
            openFileOutput.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
