package com.autonavi.aps.amapapi.utils;

import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes12.dex */
public class Storage {

    /* renamed from: a, reason: collision with root package name */
    private static Storage f6708a;
    static Byte[] b = new Byte[0];

    private Storage() {
    }

    public static Storage getInstance() {
        synchronized (b) {
            if (f6708a == null) {
                f6708a = new Storage();
            }
        }
        return f6708a;
    }

    public void writeLog(String str) {
    }

    public void writeLog(String str, String str2) {
        if (Utils.extMemAvl()) {
            StringBuilder sb = new StringBuilder();
            if (str.contains(Const.STR_KML)) {
                str = ((Const.STR_KML + File.separator) + Utils.formatUTC(0L, "yyyyMMdd") + ".") + Const.STR_KML;
            }
            sb.append(DebugUtils.getWPath()).append(str);
            String sb2 = sb.toString();
            File file = new File(sb2);
            File parentFile = file.getParentFile();
            if (parentFile.exists() || parentFile.mkdirs()) {
                try {
                    sb.delete(0, sb.length());
                } catch (Throwable th) {
                    th.printStackTrace();
                }
                if (file.exists() || file.createNewFile()) {
                    if (!str.contains(Const.STR_KML)) {
                        sb.append(Utils.formatUTC(0L, null)).append("#");
                        sb.append(CoreUtil.strAppname).append("#");
                    }
                    sb.append(str2).append("\r\n");
                    String sb3 = sb.toString();
                    FileOutputStream fileOutputStream = new FileOutputStream(sb2, true);
                    DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                    dataOutputStream.write(sb3.getBytes("UTF-8"));
                    dataOutputStream.flush();
                    dataOutputStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    sb.delete(0, sb.length());
                }
            }
        }
    }

    public void writeLog(Context context, String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getExternalFilesDir("debug").getAbsolutePath()).append(File.separator).append(str);
        String sb2 = sb.toString();
        File file = new File(sb2);
        File parentFile = file.getParentFile();
        if (parentFile.exists() || parentFile.mkdirs()) {
            try {
                sb.delete(0, sb.length());
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (file.exists() || file.createNewFile()) {
                if (!str.contains(Const.STR_KML)) {
                    sb.append(Utils.formatUTC(0L, null)).append("#");
                    sb.append(CoreUtil.strAppname).append("#");
                }
                sb.append(str2).append("\r\n");
                String sb3 = sb.toString();
                FileOutputStream fileOutputStream = new FileOutputStream(sb2, true);
                DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                dataOutputStream.write(sb3.getBytes("UTF-8"));
                dataOutputStream.flush();
                dataOutputStream.close();
                fileOutputStream.flush();
                fileOutputStream.close();
                sb.delete(0, sb.length());
            }
        }
    }
}
