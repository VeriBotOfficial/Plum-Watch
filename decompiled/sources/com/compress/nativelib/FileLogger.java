package com.compress.nativelib;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Environment;
import android.text.format.Formatter;
import android.util.Log;
import com.luck.picture.lib.config.PictureMimeType;
import com.xmly.businesssdk.network.NetworkConfig;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/* loaded from: classes14.dex */
public class FileLogger {
    private static final int LOG_MAX_SIZE = 10485760;
    private static final String MY_TAG = "LogToFileUtils";
    private static FileLogger instance;
    private static File logFile;
    private static SimpleDateFormat logSDF = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
    private static Context mContext;
    private static String tag;

    public static void init(Context context) {
        File file;
        Log.i(MY_TAG, "init ...");
        if (mContext != null && instance != null && (file = logFile) != null && file.exists()) {
            Log.i(MY_TAG, "LogToFileUtils has been init ...");
            return;
        }
        mContext = context;
        instance = new FileLogger();
        logFile = getLogFile();
        Log.i(MY_TAG, "LogFilePath is: " + logFile.getPath());
        long fileSize = getFileSize(logFile);
        Log.d(MY_TAG, "Log max size is: " + Formatter.formatFileSize(context, NetworkConfig.Cache.SIZE));
        Log.i(MY_TAG, "log now size is: " + Formatter.formatFileSize(context, fileSize));
        CrashHandler.getInstance().init(context);
        if (NetworkConfig.Cache.SIZE < fileSize) {
            resetLogFile();
        }
    }

    public static void write(Object obj) {
        File file;
        if (mContext != null && instance != null && (file = logFile) != null && file.exists()) {
            String str = getFunctionInfo() + " - " + obj.toString();
            Log.i(tag, str);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(logFile, true));
                bufferedWriter.write(str);
                bufferedWriter.write("\r\n");
                bufferedWriter.flush();
                return;
            } catch (Exception e) {
                Log.e(tag, "Write failure !!! " + e.toString());
                return;
            }
        }
        Log.e(MY_TAG, "Initialization failure !!!");
    }

    private static void resetLogFile() {
        Log.i(MY_TAG, "Reset Log File ... ");
        File file = new File(logFile.getParent() + "/lastLog.txt");
        if (file.exists()) {
            file.delete();
        }
        logFile.renameTo(file);
        try {
            logFile.createNewFile();
        } catch (Exception e) {
            Log.e(MY_TAG, "Create log file failure !!! " + e.toString());
        }
    }

    private static long getFileSize(File file) {
        if (!file.exists()) {
            return 0L;
        }
        try {
            return new FileInputStream(file).available();
        } catch (Exception e) {
            Log.e(MY_TAG, e.toString());
            return 0L;
        }
    }

    public static File getLogFile2() {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/logs2.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                Log.e(MY_TAG, "Create log file failure !!! " + e.toString());
            }
        }
        return file2;
    }

    public static File writeBuffer(String str, byte[] bArr, int i, int i2) {
        File bufferFile = getBufferFile(str);
        try {
            new FileOutputStream(bufferFile).write(bArr, 0, i2);
            return bufferFile;
        } catch (IOException e) {
            e.printStackTrace();
            return bufferFile;
        }
    }

    public static void saveBitmap(Bitmap bitmap) {
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(getBufferFile("DecompressedFile")));
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, bufferedOutputStream);
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static File getBitmapFile(String str) {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/" + str + PictureMimeType.PNG);
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                Log.e(MY_TAG, "Create log file failure !!! " + e.toString());
            }
        }
        return file2;
    }

    public static File getBufferFile(String str) {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/" + str + ".bin");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                Log.e(MY_TAG, "Create log file failure !!! " + e.toString());
            }
        }
        return file2;
    }

    public static File getLogFile() {
        File file;
        if (Environment.getExternalStorageState().equals("mounted")) {
            file = new File(mContext.getExternalFilesDir("Log").getPath() + "/");
        } else {
            file = new File(mContext.getFilesDir().getPath() + "/Log/");
        }
        if (!file.exists()) {
            file.mkdir();
        }
        File file2 = new File(file.getPath() + "/logs.txt");
        if (!file2.exists()) {
            try {
                file2.createNewFile();
                return file2;
            } catch (Exception e) {
                Log.e(MY_TAG, "Create log file failure !!! " + e.toString());
            }
        }
        return file2;
    }

    private static String getFunctionInfo() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace == null) {
            return null;
        }
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!stackTraceElement.isNativeMethod() && !stackTraceElement.getClassName().equals(Thread.class.getName()) && !stackTraceElement.getClassName().equals(instance.getClass().getName())) {
                tag = stackTraceElement.getFileName();
                return "[" + logSDF.format(new Date()) + " " + stackTraceElement.getClassName() + " " + stackTraceElement.getMethodName() + " Line:" + stackTraceElement.getLineNumber() + "]";
            }
        }
        return null;
    }
}
