package io.agora.mediaplayer;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes6.dex */
public class ContentFileReader {
    private static final String TAG = "ContentFileReader";
    private FileInputStream fileInputStream = null;
    private FileChannel fileChannel = null;
    private ParcelFileDescriptor pfd = null;

    public ContentFileReader() {
        Logging.v(TAG, "constructor");
    }

    public void closeFile() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
                Logging.e(TAG, "closeFile Step1 error: " + e.getMessage());
            }
            this.fileChannel = null;
        }
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
                Logging.e(TAG, "ContentFileReader closeFile Step2 error: " + e2.getMessage());
            }
            this.fileInputStream = null;
        }
        ParcelFileDescriptor parcelFileDescriptor = this.pfd;
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (IOException e3) {
                e3.printStackTrace();
                Logging.e(TAG, "ContentFileReader closeFile Step3 error: " + e3.getMessage());
            }
            this.pfd = null;
        }
    }

    public long getCurrentPosition() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            return fileChannel.position();
        } catch (Exception e) {
            e.printStackTrace();
            Logging.e(TAG, "AssetsFileReader read error: " + e.getMessage());
            return -2L;
        }
    }

    public long getFileSize() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            return fileChannel.size();
        } catch (Exception e) {
            e.printStackTrace();
            Logging.e(TAG, "getFileSize error:" + e.getMessage());
            return -2L;
        }
    }

    public int open(String url) {
        Uri parse = Uri.parse(url);
        if (this.fileInputStream != null) {
            Logging.e(TAG, "has opened file ");
            return -2;
        }
        try {
            this.pfd = ContextUtils.getApplicationContext().getContentResolver().openFileDescriptor(parse, "r");
            FileInputStream fileInputStream = new FileInputStream(this.pfd.getFileDescriptor());
            this.fileInputStream = fileInputStream;
            this.fileChannel = fileInputStream.getChannel();
            return 0;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.e(TAG, "open error:" + e.getMessage());
            closeFile();
            return -3;
        }
    }

    public int read(ByteBuffer readByteBuffer) {
        if (this.fileChannel == null) {
            return -2;
        }
        readByteBuffer.clear();
        try {
            return this.fileChannel.read(readByteBuffer);
        } catch (IOException e) {
            e.printStackTrace();
            Logging.e(TAG, "ContentFileReader read error: " + e.getMessage());
            return -2;
        }
    }

    public long seek(long pos) {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            fileChannel.position(pos);
            return pos;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.e(TAG, "seek error: " + e.getMessage());
            return -2L;
        }
    }
}
