package com.xiaomi.push;

import android.util.Log;
import java.io.File;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    private static final HashMap<String, String> f14827a;

    static {
        HashMap<String, String> hashMap = new HashMap<>();
        f14827a = hashMap;
        hashMap.put("FFD8FF", "jpg");
        hashMap.put("89504E47", "png");
        hashMap.put("47494638", "gif");
        hashMap.put("474946", "gif");
        hashMap.put("424D", "bmp");
    }

    public static long a(File file) {
        long length;
        long j = 0;
        try {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    length = a(listFiles[i]);
                } else {
                    length = listFiles[i].length();
                }
                j += length;
            }
            return j;
        } catch (Exception e) {
            Log.e("FileUtils", "Get folder size error: " + e.getMessage());
            return j;
        }
    }

    /* renamed from: a, reason: collision with other method in class */
    public static boolean m12498a(File file) {
        long length;
        if (file == null) {
            return false;
        }
        try {
            if (!file.exists()) {
                return true;
            }
            if (file.isDirectory()) {
                length = a(file);
            } else {
                length = file.length();
            }
            return length < 104857600;
        } catch (Exception e) {
            Log.e("FileUtils", "Check if internal file can be written error :" + e.getMessage());
            return false;
        }
    }
}
