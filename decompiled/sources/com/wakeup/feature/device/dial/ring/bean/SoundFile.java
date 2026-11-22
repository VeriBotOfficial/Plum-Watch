package com.wakeup.feature.device.dial.ring.bean;

import android.gov.nist.core.Separators;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaExtractor;
import android.media.MediaFormat;
import android.os.Environment;
import android.view.Surface;
import com.wakeup.common.log.LogUtils;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import java.util.Arrays;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* loaded from: classes3.dex */
public class SoundFile {
    private static final String TAG = "CropRing";
    private int mAvgBitRate;
    private int mChannels;
    private ByteBuffer mDecodedBytes;
    private ShortBuffer mDecodedSamples;
    private int mFileSize;
    private String mFileType;
    private int[] mFrameGains;
    private int[] mFrameLens;
    private int[] mFrameOffsets;
    private int mNumFrames;
    private int mNumSamples;
    private int mSampleRate;
    private ProgressListener mProgressListener = null;
    private File mInputFile = null;

    public interface ProgressListener {
        boolean reportProgress(double d);
    }

    public int getSamplesPerFrame() {
        return 1024;
    }

    public class InvalidInputException extends Exception {
        private static final long serialVersionUID = -2505698991597837165L;

        public InvalidInputException(String str) {
            super(str);
        }
    }

    public static String[] getSupportedExtensions() {
        return new String[]{"mp3", "wav", "3gpp", "3gp", "amr", "aac", "m4a", "ogg"};
    }

    public static boolean isFilenameSupported(String str) {
        for (String str2 : getSupportedExtensions()) {
            if (str.endsWith("." + str2)) {
                return true;
            }
        }
        return false;
    }

    public static SoundFile create(String str, ProgressListener progressListener) throws FileNotFoundException, IOException, InvalidInputException {
        File file = new File(str);
        if (!file.exists()) {
            throw new FileNotFoundException(str);
        }
        String[] split = file.getName().toLowerCase().split("\\.");
        if (split.length < 2 || !Arrays.asList(getSupportedExtensions()).contains(split[split.length - 1])) {
            return null;
        }
        SoundFile soundFile = new SoundFile();
        soundFile.setProgressListener(progressListener);
        soundFile.ReadFile(file);
        return soundFile;
    }

    public String getFiletype() {
        return this.mFileType;
    }

    public int getFileSizeBytes() {
        return this.mFileSize;
    }

    public int getAvgBitrateKbps() {
        return this.mAvgBitRate;
    }

    public int getSampleRate() {
        return this.mSampleRate;
    }

    public int getChannels() {
        return this.mChannels;
    }

    public int getNumSamples() {
        return this.mNumSamples;
    }

    public int getNumFrames() {
        return this.mNumFrames;
    }

    public int[] getFrameGains() {
        return this.mFrameGains;
    }

    public ShortBuffer getSamples() {
        if (this.mDecodedSamples != null) {
            return this.mDecodedSamples.asReadOnlyBuffer();
        }
        return null;
    }

    private SoundFile() {
    }

    private void setProgressListener(ProgressListener progressListener) {
        this.mProgressListener = progressListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ReadFile(File file) throws FileNotFoundException, IOException, InvalidInputException {
        String str;
        boolean z;
        int i;
        ByteBuffer[] byteBufferArr;
        MediaCodec.BufferInfo bufferInfo;
        long j;
        int i2;
        MediaFormat mediaFormat;
        String str2;
        int i3;
        int i4;
        byte[] bArr;
        ByteBuffer byteBuffer;
        boolean z2;
        MediaExtractor mediaExtractor = new MediaExtractor();
        this.mInputFile = file;
        String[] split = file.getPath().split("\\.");
        boolean z3 = true;
        this.mFileType = split[split.length - 1];
        this.mFileSize = (int) this.mInputFile.length();
        mediaExtractor.setDataSource(this.mInputFile.getPath());
        int trackCount = mediaExtractor.getTrackCount();
        int i5 = 0;
        MediaFormat mediaFormat2 = null;
        int i6 = 0;
        while (true) {
            str = IMediaFormat.KEY_MIME;
            if (i6 >= trackCount) {
                break;
            }
            mediaFormat2 = mediaExtractor.getTrackFormat(i6);
            if (mediaFormat2.getString(IMediaFormat.KEY_MIME).startsWith("audio/")) {
                mediaExtractor.selectTrack(i6);
                break;
            }
            i6++;
        }
        if (i6 == trackCount) {
            throw new InvalidInputException("No audio track found in " + this.mInputFile);
        }
        this.mChannels = mediaFormat2.getInteger("channel-count");
        this.mSampleRate = mediaFormat2.getInteger("sample-rate");
        int i7 = (int) (((mediaFormat2.getLong("durationUs") / 1000000.0f) * this.mSampleRate) + 0.5f);
        MediaCodec createDecoderByType = MediaCodec.createDecoderByType(mediaFormat2.getString(IMediaFormat.KEY_MIME));
        createDecoderByType.configure(mediaFormat2, (Surface) null, (MediaCrypto) null, 0);
        createDecoderByType.start();
        ByteBuffer[] inputBuffers = createDecoderByType.getInputBuffers();
        ByteBuffer[] outputBuffers = createDecoderByType.getOutputBuffers();
        MediaCodec.BufferInfo bufferInfo2 = new MediaCodec.BufferInfo();
        this.mDecodedBytes = ByteBuffer.allocate(1048576);
        Boolean bool = true;
        byte[] bArr2 = null;
        boolean z4 = false;
        int i8 = 0;
        ByteBuffer[] byteBufferArr2 = outputBuffers;
        int i9 = 0;
        while (true) {
            int i10 = i9;
            int dequeueInputBuffer = createDecoderByType.dequeueInputBuffer(100L);
            if (z4 || dequeueInputBuffer < 0) {
                z = z3;
                i = i5;
                byteBufferArr = inputBuffers;
                bufferInfo = bufferInfo2;
                j = 100;
                i2 = i10;
            } else {
                z = z3;
                int readSampleData = mediaExtractor.readSampleData(inputBuffers[dequeueInputBuffer], i5);
                if (bool.booleanValue() && mediaFormat2.getString(str).equals("audio/mp4a-latm") && readSampleData == 2) {
                    mediaExtractor.advance();
                    i8 += readSampleData;
                    z2 = i5;
                    byteBufferArr = inputBuffers;
                    bufferInfo = bufferInfo2;
                    i2 = i10;
                    j = 100;
                } else if (readSampleData < 0) {
                    i2 = i10;
                    z2 = i5;
                    byteBufferArr = inputBuffers;
                    bufferInfo = bufferInfo2;
                    j = 100;
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, 0, -1L, 4);
                    z4 = z;
                } else {
                    z2 = i5;
                    byteBufferArr = inputBuffers;
                    bufferInfo = bufferInfo2;
                    j = 100;
                    i2 = i10;
                    createDecoderByType.queueInputBuffer(dequeueInputBuffer, 0, readSampleData, mediaExtractor.getSampleTime(), 0);
                    mediaExtractor.advance();
                    int i11 = i8 + readSampleData;
                    ProgressListener progressListener = this.mProgressListener;
                    if (progressListener != null && !progressListener.reportProgress(i11 / this.mFileSize)) {
                        mediaExtractor.release();
                        createDecoderByType.stop();
                        createDecoderByType.release();
                        return;
                    }
                    i8 = i11;
                }
                bool = Boolean.valueOf(z2);
                i = z2;
            }
            int i12 = i8;
            int dequeueOutputBuffer = createDecoderByType.dequeueOutputBuffer(bufferInfo, j);
            if (dequeueOutputBuffer < 0 || bufferInfo.size <= 0) {
                mediaFormat = mediaFormat2;
                str2 = str;
                i3 = i;
                if (dequeueOutputBuffer == -3) {
                    byteBufferArr2 = createDecoderByType.getOutputBuffers();
                }
            } else {
                if (i2 < bufferInfo.size) {
                    i2 = bufferInfo.size;
                    bArr = new byte[i2];
                } else {
                    bArr = bArr2;
                }
                byteBufferArr2[dequeueOutputBuffer].get(bArr, i, bufferInfo.size);
                byteBufferArr2[dequeueOutputBuffer].clear();
                if (this.mDecodedBytes.remaining() < bufferInfo.size) {
                    int position = this.mDecodedBytes.position();
                    mediaFormat = mediaFormat2;
                    str2 = str;
                    int i13 = (int) (position * ((this.mFileSize * 1.0d) / i12) * 1.2d);
                    if (i13 - position < bufferInfo.size + 5242880) {
                        i13 = bufferInfo.size + position + 5242880;
                    }
                    int i14 = 10;
                    while (true) {
                        if (i14 <= 0) {
                            byteBuffer = null;
                            break;
                        } else {
                            try {
                                byteBuffer = ByteBuffer.allocate(i13);
                                break;
                            } catch (OutOfMemoryError unused) {
                                i14--;
                            }
                        }
                    }
                    if (i14 == 0) {
                        i3 = 0;
                        break;
                    }
                    this.mDecodedBytes.rewind();
                    byteBuffer.put(this.mDecodedBytes);
                    this.mDecodedBytes = byteBuffer;
                    byteBuffer.position(position);
                } else {
                    mediaFormat = mediaFormat2;
                    str2 = str;
                }
                i3 = 0;
                this.mDecodedBytes.put(bArr, 0, bufferInfo.size);
                createDecoderByType.releaseOutputBuffer(dequeueOutputBuffer, false);
                bArr2 = bArr;
            }
            if ((bufferInfo.flags & 4) != 0 || this.mDecodedBytes.position() / (this.mChannels * 2) >= i7) {
                break;
            }
            bufferInfo2 = bufferInfo;
            i5 = i3;
            str = str2;
            inputBuffers = byteBufferArr;
            mediaFormat2 = mediaFormat;
            i8 = i12;
            i9 = i2;
            z3 = z;
        }
        this.mNumSamples = this.mDecodedBytes.position() / (this.mChannels * 2);
        this.mDecodedBytes.rewind();
        this.mDecodedBytes.order(ByteOrder.LITTLE_ENDIAN);
        this.mDecodedSamples = this.mDecodedBytes.asShortBuffer();
        this.mAvgBitRate = (int) (((this.mFileSize * 8) * (this.mSampleRate / this.mNumSamples)) / 1000.0f);
        mediaExtractor.release();
        createDecoderByType.stop();
        createDecoderByType.release();
        this.mNumFrames = this.mNumSamples / getSamplesPerFrame();
        if (this.mNumSamples % getSamplesPerFrame() != 0) {
            this.mNumFrames++;
        }
        int i15 = this.mNumFrames;
        this.mFrameGains = new int[i15];
        this.mFrameLens = new int[i15];
        this.mFrameOffsets = new int[i15];
        int samplesPerFrame = (int) (((this.mAvgBitRate * 1000) / 8) * (getSamplesPerFrame() / this.mSampleRate));
        for (int i16 = i3; i16 < this.mNumFrames; i16++) {
            int i17 = -1;
            for (int i18 = i3; i18 < getSamplesPerFrame(); i18++) {
                int i19 = i3;
                int i20 = i19;
                while (true) {
                    i4 = this.mChannels;
                    if (i19 >= i4) {
                        break;
                    }
                    if (this.mDecodedSamples.remaining() > 0) {
                        i20 += Math.abs((int) this.mDecodedSamples.get());
                    }
                    i19++;
                }
                int i21 = i20 / i4;
                if (i17 < i21) {
                    i17 = i21;
                }
            }
            this.mFrameGains[i16] = (int) Math.sqrt(i17);
            this.mFrameLens[i16] = samplesPerFrame;
            this.mFrameOffsets[i16] = (int) (((this.mAvgBitRate * 1000) / 8) * i16 * (getSamplesPerFrame() / this.mSampleRate));
        }
        this.mDecodedSamples.rewind();
    }

    public void WriteFile(File file, int i, int i2) throws IOException {
        WriteFile(file, (i * getSamplesPerFrame()) / this.mSampleRate, ((i + i2) * getSamplesPerFrame()) / this.mSampleRate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d9 A[EDGE_INSN: B:57:0x01d9->B:58:0x01d9 BREAK  A[LOOP:0: B:8:0x0076->B:17:0x0076], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01cb  */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.nio.ByteBuffer] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.media.MediaCodec] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void WriteFile(java.io.File r31, float r32, float r33) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.device.dial.ring.bean.SoundFile.WriteFile(java.io.File, float, float):void");
    }

    private void swapLeftRightChannels(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            return;
        }
        for (int i = 0; i < bArr.length; i += 4) {
            int i2 = i + 1;
            byte[] bArr2 = {bArr[i], bArr[i2]};
            int i3 = i + 2;
            int i4 = i + 3;
            byte[] bArr3 = {bArr[i3], bArr[i4]};
            bArr[i] = bArr3[0];
            bArr[i2] = bArr3[1];
            bArr[i3] = bArr2[0];
            bArr[i4] = bArr2[1];
        }
    }

    public void WriteWAVFile(File file, int i, int i2) throws IOException {
        WriteWAVFile(file, (i * getSamplesPerFrame()) / this.mSampleRate, ((i + i2) * getSamplesPerFrame()) / this.mSampleRate);
    }

    public void WriteWAVFile(File file, float f, float f2) throws IOException {
        int i = this.mSampleRate;
        int i2 = ((int) (i * f)) * 2 * this.mChannels;
        int i3 = (int) ((f2 - f) * i);
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        fileOutputStream.write(WAVHeader.getWAVHeader(this.mSampleRate, this.mChannels, i3));
        int i4 = this.mChannels * 2048;
        byte[] bArr = new byte[i4];
        this.mDecodedBytes.position(i2);
        int i5 = i3 * this.mChannels * 2;
        while (i5 >= i4) {
            if (this.mDecodedBytes.remaining() < i4) {
                for (int remaining = this.mDecodedBytes.remaining(); remaining < i4; remaining++) {
                    bArr[remaining] = 0;
                }
                ByteBuffer byteBuffer = this.mDecodedBytes;
                byteBuffer.get(bArr, 0, byteBuffer.remaining());
            } else {
                this.mDecodedBytes.get(bArr);
            }
            if (this.mChannels == 2) {
                swapLeftRightChannels(bArr);
            }
            fileOutputStream.write(bArr);
            i5 -= i4;
        }
        if (i5 > 0) {
            if (this.mDecodedBytes.remaining() < i5) {
                for (int remaining2 = this.mDecodedBytes.remaining(); remaining2 < i5; remaining2++) {
                    bArr[remaining2] = 0;
                }
                ByteBuffer byteBuffer2 = this.mDecodedBytes;
                byteBuffer2.get(bArr, 0, byteBuffer2.remaining());
            } else {
                this.mDecodedBytes.get(bArr, 0, i5);
            }
            if (this.mChannels == 2) {
                swapLeftRightChannels(bArr);
            }
            fileOutputStream.write(bArr, 0, i5);
        }
        fileOutputStream.close();
    }

    private void DumpSamples(String str) {
        BufferedWriter bufferedWriter;
        IOException e;
        String path = Environment.getExternalStorageDirectory().getPath();
        if (!path.endsWith("/")) {
            path = path + "/";
        }
        String str2 = path + "media/audio/debug/";
        File file = new File(str2);
        file.mkdirs();
        if (file.isDirectory()) {
            path = str2;
        }
        if (str == null || str.isEmpty()) {
            str = "samples.tsv";
        }
        File file2 = new File(path + str);
        this.mDecodedSamples.rewind();
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(file2));
            for (int i = 0; i < this.mNumSamples; i++) {
                try {
                    String f = Float.toString(i / this.mSampleRate);
                    for (int i2 = 0; i2 < this.mChannels; i2++) {
                        f = f + Separators.HT + ((int) this.mDecodedSamples.get());
                    }
                    bufferedWriter.write(f + "\n");
                } catch (IOException e2) {
                    e = e2;
                    LogUtils.w(TAG, "Failed to create the sample TSV file.");
                    LogUtils.w(TAG, getStackTrace(e));
                    bufferedWriter.close();
                    this.mDecodedSamples.rewind();
                }
            }
        } catch (IOException e3) {
            bufferedWriter = null;
            e = e3;
        }
        try {
            bufferedWriter.close();
        } catch (Exception e4) {
            LogUtils.w(TAG, "Failed to close sample TSV file.");
            LogUtils.w(TAG, getStackTrace(e4));
        }
        this.mDecodedSamples.rewind();
    }

    private void DumpSamples() {
        DumpSamples(null);
    }

    private String getStackTrace(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }
}
