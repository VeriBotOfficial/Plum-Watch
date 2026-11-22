package com.beken.iot.smartsdk.core.data;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.beken.iot.smartsdk.core.log.BKSmartLog;
import com.beken.iot.smartsdk.core.utils.ContextHolder;
import com.beken.iot.smartsdk.core.utils.DateUtil;
import com.luck.picture.lib.config.PictureMimeType;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes13.dex */
public class IotDumpFile {
    public static final String BIZ_AUDIO_DOWN_DECODED_STREAM = "audio_down_decoded_stream";
    public static final String BIZ_AUDIO_DOWN_ORIGINAL_STREAM = "audio_down_original_stream";
    public static final String BIZ_AUDIO_DOWN_UNPACKED_STREAM = "audio_down_unpacked_stream";
    public static final String BIZ_AUDIO_UP_ENCODED_STREAM = "audio_up_encoded_stream";
    public static final String BIZ_AUDIO_UP_ORIGINAL_STREAM = "audio_up_original_stream";
    public static final String BIZ_AUDIO_UP_PACKED_STREAM = "audio_up_packed_stream";
    public static final String BIZ_VIDEO_ALL = "video_all";
    public static final String BIZ_VIDEO_BAD = "video_bad";
    public static final String BIZ_VIDEO_COMPLETE = "video_complete";
    public static final int FMT_BIN = 0;
    public static final int FMT_G711A = 5;
    public static final int FMT_G711U = 6;
    public static final int FMT_H264 = 3;
    public static final int FMT_MJPEG = 2;
    public static final int FMT_PCM = 4;
    public static final int FMT_TXT = 1;
    public static final String ROOT_DIR = "armino_iot";
    private static final String TAG = "IotDumpFile";
    private String bizType;
    private final int fileType;
    private String fileName = null;
    private WriteThread writeThread = null;
    private final ArrayBlockingQueue<byte[]> writeQueue = new ArrayBlockingQueue<>(5000);

    public IotDumpFile(String str, int i) {
        this.bizType = "unknown";
        this.bizType = str;
        this.fileType = i;
    }

    public boolean open() {
        File externalStorageDirectory = getExternalStorageDirectory(ContextHolder.context);
        if (externalStorageDirectory == null) {
            return false;
        }
        String str = externalStorageDirectory.getAbsolutePath() + File.separator + ROOT_DIR + File.separator + DateUtil.INSTANCE.getDay();
        checkDir(str);
        printD("open: folderPath " + str);
        this.fileName = str + File.separator + this.bizType + "_" + getTime() + getFileType();
        printD("open: fileName " + this.fileName);
        WriteThread writeThread = new WriteThread(this.fileName);
        this.writeThread = writeThread;
        writeThread.start();
        return true;
    }

    private File getExternalStorageDirectory(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return context.getExternalFilesDir(null);
        }
        return Environment.getExternalStorageDirectory();
    }

    public void writeAppend(byte[] bArr) {
        this.writeQueue.offer(bArr);
    }

    public void close() {
        WriteThread writeThread = this.writeThread;
        if (writeThread != null) {
            writeThread.close();
        }
    }

    private String getFileType() {
        switch (this.fileType) {
            case 0:
                return ".bin";
            case 1:
                return ".txt";
            case 2:
                return PictureMimeType.JPG;
            case 3:
                return ".h264";
            case 4:
                return ".pcm";
            case 5:
                return ".g711a";
            case 6:
                return ".g711u";
            default:
                return ".unknown";
        }
    }

    private String getTime() {
        return new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss_SS").format(new Date());
    }

    private boolean checkDir(String str) {
        File file = new File(str);
        if (file.exists()) {
            printD(file.getName() + " exists");
            if (!file.isDirectory()) {
                printD(file.getName() + " not folder, delete it and create folder");
                file.delete();
                file.mkdirs();
            }
        } else {
            printD("create: " + file.getName());
            file.mkdirs();
        }
        return file.exists();
    }

    private void printD(String str) {
        BKSmartLog.INSTANCE.d(TAG, str);
    }

    class WriteThread extends Thread {
        private final String fileName;
        private boolean isRunning = true;

        public WriteThread(String str) {
            this.fileName = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            FileOutputStream fileOutputStream;
            try {
                fileOutputStream = new FileOutputStream(new File(this.fileName), true);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                fileOutputStream = null;
            }
            while (fileOutputStream != null && this.isRunning) {
                try {
                    fileOutputStream.write((byte[]) IotDumpFile.this.writeQueue.take());
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }

        public void close() {
            this.isRunning = false;
        }
    }
}
