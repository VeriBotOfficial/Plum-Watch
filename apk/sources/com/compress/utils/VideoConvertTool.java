package com.compress.utils;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class VideoConvertTool {
    private static final String TAG = "DialConvertTool_VideoConvertTool";
    private static VideoConvertTool instance;
    private int videoNum = 0;
    private List<String> videoName = new ArrayList();
    private List<Integer> videoIndex = new ArrayList();
    private ByteArrayOutputStream videoData = new ByteArrayOutputStream();

    private VideoConvertTool() {
    }

    public static VideoConvertTool getInstance() {
        if (instance == null) {
            instance = new VideoConvertTool();
        }
        return instance;
    }

    public int convertVideo(String str) throws IOException {
        if (this.videoName.contains(str)) {
            return this.videoIndex.get(this.videoName.indexOf(str)).intValue();
        }
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            FileChannel channel = fileInputStream.getChannel();
            try {
                byte[] bArr = new byte[(int) channel.size()];
                channel.read(ByteBuffer.wrap(bArr));
                int size = this.videoData.size();
                this.videoName.add(str);
                this.videoIndex.add(Integer.valueOf(size));
                this.videoData.write(bArr);
                this.videoNum++;
                int size2 = this.videoData.size();
                Log.i(TAG, "currentIndex: " + size);
                Log.i(TAG, "currentIndex2: " + size2);
                if (channel != null) {
                    channel.close();
                }
                fileInputStream.close();
                return size;
            } catch (Throwable th) {
                if (channel != null) {
                    try {
                        channel.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            try {
                fileInputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public void writeDataToBin(DataOutputStream dataOutputStream) throws IOException {
        Log.i(TAG, "videoData: " + this.videoData.toByteArray().length);
        dataOutputStream.write(this.videoData.toByteArray());
    }
}
