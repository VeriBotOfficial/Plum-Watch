package io.agora.mediaplayer;

import android.content.res.AssetFileDescriptor;
import io.agora.base.internal.ContextUtils;
import io.agora.base.internal.Logging;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes6.dex */
public class AssetsFileReader {
    public static final String PREFIX_ASSETS = "/assets/";
    private static final String TAG = "AssetsFileReader";
    private FileInputStream fileInputStream = null;
    private FileChannel fileChannel = null;
    private AssetFileDescriptor afd = null;
    private long startOffset_ = 0;
    private long length_ = 0;

    public AssetsFileReader() {
        Logging.v(TAG, "constructor");
    }

    public void closeFile() {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel != null) {
            try {
                fileChannel.close();
            } catch (IOException e) {
                e.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step1 error: " + e.getMessage());
            }
            this.fileChannel = null;
        }
        FileInputStream fileInputStream = this.fileInputStream;
        if (fileInputStream != null) {
            try {
                fileInputStream.close();
            } catch (IOException e2) {
                e2.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step2 error: " + e2.getMessage());
            }
            this.fileInputStream = null;
        }
        AssetFileDescriptor assetFileDescriptor = this.afd;
        if (assetFileDescriptor != null) {
            try {
                assetFileDescriptor.close();
            } catch (IOException e3) {
                e3.printStackTrace();
                Logging.e(TAG, "AssetsFileReader closeFile Step3 error: " + e3.getMessage());
            }
            this.afd = null;
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
            Logging.e(TAG, " read error: " + e.getMessage());
            return -2L;
        }
    }

    public long getFileSize() {
        if (this.fileChannel == null) {
            return -2L;
        }
        try {
            return this.length_;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.e(TAG, "getFileSize error:" + e.getMessage());
            return -2L;
        }
    }

    public int open(String assetFilePath) {
        if (this.fileInputStream != null) {
            Logging.e(TAG, "has opened file ");
            return -2;
        }
        try {
            AssetFileDescriptor openFd = ContextUtils.getApplicationContext().getAssets().openFd(assetFilePath.substring(assetFilePath.indexOf("/assets/") + "/assets/".length()));
            this.afd = openFd;
            this.startOffset_ = openFd.getStartOffset();
            this.length_ = this.afd.getLength();
            FileInputStream createInputStream = this.afd.createInputStream();
            this.fileInputStream = createInputStream;
            this.fileChannel = createInputStream.getChannel();
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
            long position = this.fileChannel.position();
            if (position - this.startOffset_ > this.length_) {
                return -1;
            }
            long read = this.fileChannel.read(readByteBuffer);
            long j = (position + read) - this.startOffset_;
            long j2 = this.length_;
            if (j > j2) {
                read -= j - j2;
            }
            return (int) read;
        } catch (IOException e) {
            e.printStackTrace();
            Logging.e(TAG, "AssetsFileReader read error: " + e.getMessage());
            return -2;
        }
    }

    public long seek(long pos) {
        FileChannel fileChannel = this.fileChannel;
        if (fileChannel == null) {
            return -2L;
        }
        try {
            fileChannel.position(this.startOffset_ + pos);
            return pos;
        } catch (Exception e) {
            e.printStackTrace();
            Logging.e(TAG, "AssetsFileReader seek error: " + e.getMessage());
            return -2L;
        }
    }
}
