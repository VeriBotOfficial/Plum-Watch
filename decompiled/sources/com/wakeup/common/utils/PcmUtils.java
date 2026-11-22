package com.wakeup.common.utils;

import androidx.exifinterface.media.ExifInterface;
import com.anythink.core.d.n;
import com.blankj.utilcode.util.CloseUtils;
import com.wakeup.common.log.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.math.linearalgebra.Matrix;

/* compiled from: PcmUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/common/utils/PcmUtils;", "", "<init>", "()V", "TAG", "", "pcmToWav", "", "src", "target", "WaveHeader", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PcmUtils {
    public static final PcmUtils INSTANCE = new PcmUtils();
    private static final String TAG = "PcmUtils";

    private PcmUtils() {
    }

    public final boolean pcmToWav(String src, String target) {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        Intrinsics.checkNotNullParameter(src, "src");
        Intrinsics.checkNotNullParameter(target, "target");
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(src);
                try {
                    fileOutputStream = new FileOutputStream(target);
                } catch (Exception e) {
                    e = e;
                    fileOutputStream = null;
                } catch (Throwable th) {
                    th = th;
                    fileOutputStream = null;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
            fileOutputStream = null;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[4096];
            int i = 0;
            for (int read = fileInputStream.read(bArr); read != -1; read = fileInputStream.read(bArr)) {
                i += read;
            }
            WaveHeader waveHeader = new WaveHeader();
            waveHeader.setFileLength(i + 36);
            waveHeader.setFmtHdrLeth(16);
            waveHeader.setBitsPerSample((short) 16);
            waveHeader.setChannels((short) 1);
            waveHeader.setFormatTag((short) 1);
            waveHeader.setSamplesPerSec(16000);
            waveHeader.setBlockAlign((short) ((waveHeader.getChannels() * waveHeader.getBitsPerSample()) / 8));
            waveHeader.setAvgBytesPerSec(waveHeader.getBlockAlign() * waveHeader.getSamplesPerSec());
            waveHeader.setDataHdrLeth(i);
            byte[] header = waveHeader.getHeader();
            fileOutputStream.write(header, 0, header.length);
            fileInputStream2 = new FileInputStream(src);
            try {
                for (int read2 = fileInputStream2.read(bArr); read2 != -1; read2 = fileInputStream2.read(bArr)) {
                    fileOutputStream.write(bArr, 0, read2);
                }
                fileOutputStream.flush();
                CloseUtils.closeIO(fileInputStream2);
                CloseUtils.closeIO(fileOutputStream);
                return true;
            } catch (Exception e3) {
                e = e3;
                LogUtils.w(TAG, "pcmToWav error: " + e.getMessage());
                CloseUtils.closeIO(fileInputStream2);
                CloseUtils.closeIO(fileOutputStream);
                return false;
            }
        } catch (Exception e4) {
            e = e4;
            fileInputStream2 = fileInputStream;
            LogUtils.w(TAG, "pcmToWav error: " + e.getMessage());
            CloseUtils.closeIO(fileInputStream2);
            CloseUtils.closeIO(fileOutputStream);
            return false;
        } catch (Throwable th4) {
            th = th4;
            fileInputStream2 = fileInputStream;
            CloseUtils.closeIO(fileInputStream2);
            CloseUtils.closeIO(fileOutputStream);
            throw th;
        }
    }

    /* compiled from: PcmUtils.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\n\n\u0002\b\u001a\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020\tH\u0002J\u0018\u0010<\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010=\u001a\u00020\tH\u0002J\u0018\u0010>\u001a\u0002082\u0006\u00109\u001a\u00020:2\u0006\u0010?\u001a\u00020\u0005H\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u001a\u0010!\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000b\"\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010\rR\u001a\u0010'\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001b\"\u0004\b)\u0010\u001dR\u001a\u0010*\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001b\"\u0004\b,\u0010\u001dR\u001a\u0010-\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0007\"\u0004\b/\u0010\u0011R\u001a\u00100\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u000b\"\u0004\b2\u0010\rR\u0011\u00103\u001a\u0002048F¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006@"}, d2 = {"Lcom/wakeup/common/utils/PcmUtils$WaveHeader;", "", "<init>", "()V", "fileID", "", "getFileID", "()[C", "fileLength", "", "getFileLength", "()I", "setFileLength", "(I)V", "wavTag", "getWavTag", "setWavTag", "([C)V", "FmtHdrID", "getFmtHdrID", "setFmtHdrID", "FmtHdrLeth", "getFmtHdrLeth", "setFmtHdrLeth", "FormatTag", "", "getFormatTag", "()S", "setFormatTag", "(S)V", "Channels", "getChannels", "setChannels", "SamplesPerSec", "getSamplesPerSec", "setSamplesPerSec", "AvgBytesPerSec", "getAvgBytesPerSec", "setAvgBytesPerSec", "BlockAlign", "getBlockAlign", "setBlockAlign", ExifInterface.TAG_BITS_PER_SAMPLE, "getBitsPerSample", "setBitsPerSample", "DataHdrID", "getDataHdrID", "setDataHdrID", "DataHdrLeth", "getDataHdrLeth", "setDataHdrLeth", "header", "", "getHeader", "()[B", "WriteShort", "", "bos", "Ljava/io/ByteArrayOutputStream;", "s", "WriteInt", n.f4527a, "WriteChar", "id", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class WaveHeader {
        private int AvgBytesPerSec;
        private short BitsPerSample;
        private short BlockAlign;
        private short Channels;
        private int DataHdrLeth;
        private int FmtHdrLeth;
        private short FormatTag;
        private int SamplesPerSec;
        private int fileLength;
        private final char[] fileID = {Matrix.MATRIX_TYPE_RANDOM_REGULAR, 'I', 'F', 'F'};
        private char[] wavTag = {'W', 'A', 'V', 'E'};
        private char[] FmtHdrID = {'f', 'm', 't', ' '};
        private char[] DataHdrID = {'d', 'a', 't', 'a'};

        public final char[] getFileID() {
            return this.fileID;
        }

        public final int getFileLength() {
            return this.fileLength;
        }

        public final void setFileLength(int i) {
            this.fileLength = i;
        }

        public final char[] getWavTag() {
            return this.wavTag;
        }

        public final void setWavTag(char[] cArr) {
            Intrinsics.checkNotNullParameter(cArr, "<set-?>");
            this.wavTag = cArr;
        }

        public final char[] getFmtHdrID() {
            return this.FmtHdrID;
        }

        public final void setFmtHdrID(char[] cArr) {
            Intrinsics.checkNotNullParameter(cArr, "<set-?>");
            this.FmtHdrID = cArr;
        }

        public final int getFmtHdrLeth() {
            return this.FmtHdrLeth;
        }

        public final void setFmtHdrLeth(int i) {
            this.FmtHdrLeth = i;
        }

        public final short getFormatTag() {
            return this.FormatTag;
        }

        public final void setFormatTag(short s) {
            this.FormatTag = s;
        }

        public final short getChannels() {
            return this.Channels;
        }

        public final void setChannels(short s) {
            this.Channels = s;
        }

        public final int getSamplesPerSec() {
            return this.SamplesPerSec;
        }

        public final void setSamplesPerSec(int i) {
            this.SamplesPerSec = i;
        }

        public final int getAvgBytesPerSec() {
            return this.AvgBytesPerSec;
        }

        public final void setAvgBytesPerSec(int i) {
            this.AvgBytesPerSec = i;
        }

        public final short getBlockAlign() {
            return this.BlockAlign;
        }

        public final void setBlockAlign(short s) {
            this.BlockAlign = s;
        }

        public final short getBitsPerSample() {
            return this.BitsPerSample;
        }

        public final void setBitsPerSample(short s) {
            this.BitsPerSample = s;
        }

        public final char[] getDataHdrID() {
            return this.DataHdrID;
        }

        public final void setDataHdrID(char[] cArr) {
            Intrinsics.checkNotNullParameter(cArr, "<set-?>");
            this.DataHdrID = cArr;
        }

        public final int getDataHdrLeth() {
            return this.DataHdrLeth;
        }

        public final void setDataHdrLeth(int i) {
            this.DataHdrLeth = i;
        }

        public final byte[] getHeader() throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            WriteChar(byteArrayOutputStream, this.fileID);
            WriteInt(byteArrayOutputStream, this.fileLength);
            WriteChar(byteArrayOutputStream, this.wavTag);
            WriteChar(byteArrayOutputStream, this.FmtHdrID);
            WriteInt(byteArrayOutputStream, this.FmtHdrLeth);
            WriteShort(byteArrayOutputStream, this.FormatTag);
            WriteShort(byteArrayOutputStream, this.Channels);
            WriteInt(byteArrayOutputStream, this.SamplesPerSec);
            WriteInt(byteArrayOutputStream, this.AvgBytesPerSec);
            WriteShort(byteArrayOutputStream, this.BlockAlign);
            WriteShort(byteArrayOutputStream, this.BitsPerSample);
            WriteChar(byteArrayOutputStream, this.DataHdrID);
            WriteInt(byteArrayOutputStream, this.DataHdrLeth);
            byteArrayOutputStream.flush();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            Intrinsics.checkNotNull(byteArray);
            return byteArray;
        }

        private final void WriteShort(ByteArrayOutputStream bos, int s) throws IOException {
            bos.write(new byte[]{(byte) ((s << 24) >> 24), (byte) ((s << 16) >> 24)});
        }

        private final void WriteInt(ByteArrayOutputStream bos, int n) throws IOException {
            bos.write(new byte[]{(byte) ((n << 24) >> 24), (byte) ((n << 16) >> 24), (byte) ((n << 8) >> 24), (byte) (n >> 24)});
        }

        private final void WriteChar(ByteArrayOutputStream bos, char[] id2) {
            for (char c : id2) {
                bos.write(c);
            }
        }
    }
}
