package com.wakeup.feature.device.dial.ring.bean;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes3.dex */
public class MP4Header {
    private int mBitrate;
    private int mChannels;
    private byte[] mDurationMS;
    private int[] mFrameSize;
    private byte[] mHeader;
    private int mMaxFrameSize;
    private byte[] mNumSamples;
    private int mSampleRate;
    private byte[] mTime;
    private int mTotSize;

    public MP4Header(int i, int i2, int[] iArr, int i3) {
        int i4;
        if (iArr == null || iArr.length < 2 || (i4 = iArr[0]) != 2) {
            return;
        }
        this.mSampleRate = i;
        this.mChannels = i2;
        this.mFrameSize = iArr;
        this.mBitrate = i3;
        this.mMaxFrameSize = i4;
        this.mTotSize = i4;
        int i5 = 1;
        while (true) {
            int[] iArr2 = this.mFrameSize;
            if (i5 >= iArr2.length) {
                break;
            }
            int i6 = this.mMaxFrameSize;
            int i7 = iArr2[i5];
            if (i6 < i7) {
                this.mMaxFrameSize = i7;
            }
            this.mTotSize += i7;
            i5++;
        }
        long currentTimeMillis = (System.currentTimeMillis() / 1000) + 2082758400;
        this.mTime = new byte[]{(byte) ((currentTimeMillis >> 24) & 255), (byte) ((currentTimeMillis >> 16) & 255), (byte) ((currentTimeMillis >> 8) & 255), (byte) (currentTimeMillis & 255)};
        long length = iArr.length - 1;
        long j = 1024 * length;
        long j2 = length * 1024000;
        int i8 = this.mSampleRate;
        long j3 = j2 / i8;
        j3 = j2 % ((long) i8) > 0 ? j3 + 1 : j3;
        this.mNumSamples = new byte[]{(byte) ((j >> 26) & 255), (byte) ((j >> 16) & 255), (byte) ((j >> 8) & 255), (byte) (j & 255)};
        this.mDurationMS = new byte[]{(byte) ((j3 >> 26) & 255), (byte) ((j3 >> 16) & 255), (byte) ((j3 >> 8) & 255), (byte) (j3 & 255)};
        setHeader();
    }

    public byte[] getMP4Header() {
        return this.mHeader;
    }

    public static byte[] getMP4Header(int i, int i2, int[] iArr, int i3) {
        return new MP4Header(i, i2, iArr, i3).mHeader;
    }

    public String toString() {
        byte[] bArr = this.mHeader;
        String str = "";
        if (bArr == null) {
            return "";
        }
        int i = 0;
        for (byte b : bArr) {
            boolean z = i > 0 && i % 32 == 0;
            boolean z2 = i > 0 && i % 4 == 0 && !z;
            if (z) {
                str = str + '\n';
            }
            if (z2) {
                str = str + ' ';
            }
            str = str + String.format("%02X", Byte.valueOf(b));
            i++;
        }
        return str;
    }

    private void setHeader() {
        Atom fTYPAtom = getFTYPAtom();
        Atom mOOVAtom = getMOOVAtom();
        Atom atom = new Atom("mdat");
        Atom child = mOOVAtom.getChild("trak.mdia.minf.stbl.stco");
        if (child == null) {
            this.mHeader = null;
            return;
        }
        byte[] data = child.getData();
        int size = fTYPAtom.getSize() + mOOVAtom.getSize() + atom.getSize();
        int length = data.length;
        data[length - 4] = (byte) ((size >> 24) & 255);
        data[length - 3] = (byte) ((size >> 16) & 255);
        data[length - 2] = (byte) ((size >> 8) & 255);
        data[length - 1] = (byte) (size & 255);
        byte[] bArr = new byte[size];
        Atom[] atomArr = {fTYPAtom, mOOVAtom, atom};
        int i = 0;
        for (int i2 = 0; i2 < 3; i2++) {
            byte[] bytes = atomArr[i2].getBytes();
            System.arraycopy(bytes, 0, bArr, i, bytes.length);
            i += bytes.length;
        }
        int i3 = this.mTotSize + 8;
        bArr[i - 8] = (byte) ((i3 >> 24) & 255);
        bArr[i - 7] = (byte) ((i3 >> 16) & 255);
        bArr[i - 6] = (byte) ((i3 >> 8) & 255);
        bArr[i - 5] = (byte) (i3 & 255);
        this.mHeader = bArr;
    }

    private Atom getFTYPAtom() {
        Atom atom = new Atom("ftyp");
        atom.setData(new byte[]{BuiltinOptions.MirrorPadOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.FloorDivOptions, 32, 0, 0, 0, 0, BuiltinOptions.MirrorPadOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.FloorDivOptions, 32, BuiltinOptions.HashtableImportOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.HashtableImportOptions});
        return atom;
    }

    private Atom getMOOVAtom() {
        Atom atom = new Atom("moov");
        atom.addChild(getMVHDAtom());
        atom.addChild(getTRAKAtom());
        return atom;
    }

    private Atom getMVHDAtom() {
        Atom atom = new Atom("mvhd", (byte) 0, 0);
        byte[] bArr = this.mTime;
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte[] bArr2 = this.mDurationMS;
        atom.setData(new byte[]{b, b2, b3, b4, b, b2, b3, b4, 0, 0, 3, -24, bArr2[0], bArr2[1], bArr2[2], bArr2[3], 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2});
        return atom;
    }

    private Atom getTRAKAtom() {
        Atom atom = new Atom("trak");
        atom.addChild(getTKHDAtom());
        atom.addChild(getMDIAAtom());
        return atom;
    }

    private Atom getTKHDAtom() {
        Atom atom = new Atom("tkhd", (byte) 0, 7);
        byte[] bArr = this.mTime;
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        byte[] bArr2 = this.mDurationMS;
        atom.setData(new byte[]{b, b2, b3, b4, b, b2, b3, b4, 0, 0, 0, 1, 0, 0, 0, 0, bArr2[0], bArr2[1], bArr2[2], bArr2[3], 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        return atom;
    }

    private Atom getMDIAAtom() {
        Atom atom = new Atom("mdia");
        atom.addChild(getMDHDAtom());
        atom.addChild(getHDLRAtom());
        atom.addChild(getMINFAtom());
        return atom;
    }

    private Atom getMDHDAtom() {
        Atom atom = new Atom("mdhd", (byte) 0, 0);
        byte[] bArr = this.mTime;
        byte b = bArr[0];
        byte b2 = bArr[1];
        byte b3 = bArr[2];
        byte b4 = bArr[3];
        int i = this.mSampleRate;
        byte[] bArr2 = this.mNumSamples;
        atom.setData(new byte[]{b, b2, b3, b4, b, b2, b3, b4, (byte) (i >> 24), (byte) (i >> 16), (byte) (i >> 8), (byte) i, bArr2[0], bArr2[1], bArr2[2], bArr2[3], 0, 0, 0, 0});
        return atom;
    }

    private Atom getHDLRAtom() {
        Atom atom = new Atom("hdlr", (byte) 0, 0);
        atom.setData(new byte[]{0, 0, 0, 0, BuiltinOptions.BucketizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, BuiltinOptions.GatherNdOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.BatchMatMulOptions, 0});
        return atom;
    }

    private Atom getMINFAtom() {
        Atom atom = new Atom("minf");
        atom.addChild(getSMHDAtom());
        atom.addChild(getDINFAtom());
        atom.addChild(getSTBLAtom());
        return atom;
    }

    private Atom getSMHDAtom() {
        Atom atom = new Atom("smhd", (byte) 0, 0);
        atom.setData(new byte[]{0, 0, 0, 0});
        return atom;
    }

    private Atom getDINFAtom() {
        Atom atom = new Atom("dinf");
        atom.addChild(getDREFAtom());
        return atom;
    }

    private Atom getDREFAtom() {
        Atom atom = new Atom("dref", (byte) 0, 0);
        byte[] bytes = getURLAtom().getBytes();
        byte[] bArr = new byte[bytes.length + 4];
        bArr[3] = 1;
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        atom.setData(bArr);
        return atom;
    }

    private Atom getURLAtom() {
        return new Atom("url ", (byte) 0, 1);
    }

    private Atom getSTBLAtom() {
        Atom atom = new Atom("stbl");
        atom.addChild(getSTSDAtom());
        atom.addChild(getSTTSAtom());
        atom.addChild(getSTSCAtom());
        atom.addChild(getSTSZAtom());
        atom.addChild(getSTCOAtom());
        return atom;
    }

    private Atom getSTSDAtom() {
        Atom atom = new Atom("stsd", (byte) 0, 0);
        byte[] bytes = getMP4AAtom().getBytes();
        byte[] bArr = new byte[bytes.length + 4];
        bArr[3] = 1;
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        atom.setData(bArr);
        return atom;
    }

    private Atom getMP4AAtom() {
        Atom atom = new Atom("mp4a");
        int i = this.mChannels;
        int i2 = this.mSampleRate;
        byte[] bArr = {0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, (byte) (i >> 8), (byte) i, 0, 16, 0, 0, 0, 0, (byte) (i2 >> 8), (byte) i2, 0, 0};
        byte[] bytes = getESDSAtom().getBytes();
        byte[] bArr2 = new byte[bytes.length + 28];
        System.arraycopy(bArr, 0, bArr2, 0, 28);
        System.arraycopy(bytes, 0, bArr2, 28, bytes.length);
        atom.setData(bArr2);
        return atom;
    }

    private Atom getESDSAtom() {
        Atom atom = new Atom("esds", (byte) 0, 0);
        atom.setData(getESDescriptor());
        return atom;
    }

    private byte[] getESDescriptor() {
        char c;
        int[] iArr = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, PcmAudioUtil.PCM_BYTES_PER_SEC, ErrorCode.ERROR_TTS_INVALID_PARA, 22050, 16000, ErrorCode.MSP_ERROR_HTTP_BASE, 11025, 8000, 7350};
        byte[] bArr = {3, 25, 0, 0, 0};
        byte[] bArr2 = {4, 17, 64, 21};
        byte[] bArr3 = new byte[4];
        bArr3[0] = 5;
        char c2 = 2;
        bArr3[1] = 2;
        bArr3[2] = 16;
        bArr3[3] = 0;
        byte[] bArr4 = {6, 1, 2};
        int i = 768;
        while (i < this.mMaxFrameSize * 2) {
            i += 256;
        }
        int i2 = bArr2[1];
        int i3 = i2 + 2;
        byte[] bArr5 = new byte[i3];
        System.arraycopy(bArr2, 0, bArr5, 0, 4);
        bArr5[4] = (byte) ((i >> 16) & 255);
        bArr5[5] = (byte) ((i >> 8) & 255);
        bArr5[6] = (byte) (i & 255);
        int i4 = this.mBitrate;
        bArr5[7] = (byte) ((i4 >> 24) & 255);
        bArr5[8] = (byte) ((i4 >> 16) & 255);
        bArr5[9] = (byte) ((i4 >> 8) & 255);
        bArr5[10] = (byte) (i4 & 255);
        bArr5[11] = (byte) ((i4 >> 24) & 255);
        bArr5[12] = (byte) ((i4 >> 16) & 255);
        bArr5[13] = (byte) ((i4 >> 8) & 255);
        bArr5[14] = (byte) (i4 & 255);
        int i5 = 0;
        while (true) {
            if (i5 >= 13) {
                c = c2;
                break;
            }
            c = c2;
            if (iArr[i5] == this.mSampleRate) {
                break;
            }
            i5++;
            c2 = c;
        }
        if (i5 == 13) {
            i5 = 4;
        }
        bArr3[c] = (byte) (bArr3[c] | ((byte) ((i5 >> 1) & 7)));
        bArr3[3] = (byte) (bArr3[3] | ((byte) (((i5 & 1) << 7) | ((this.mChannels & 15) << 3))));
        System.arraycopy(bArr3, 0, bArr5, 15, 4);
        byte[] bArr6 = new byte[bArr[1] + 2];
        System.arraycopy(bArr, 0, bArr6, 0, 5);
        System.arraycopy(bArr5, 0, bArr6, 5, i3);
        System.arraycopy(bArr4, 0, bArr6, i2 + 7, 3);
        return bArr6;
    }

    private Atom getSTTSAtom() {
        Atom atom = new Atom("stts", (byte) 0, 0);
        int length = this.mFrameSize.length - 1;
        atom.setData(new byte[]{0, 0, 0, 2, 0, 0, 0, 1, 0, 0, 0, 0, (byte) ((length >> 24) & 255), (byte) ((length >> 16) & 255), (byte) ((length >> 8) & 255), (byte) (length & 255), 0, 0, 4, 0});
        return atom;
    }

    private Atom getSTSCAtom() {
        Atom atom = new Atom("stsc", (byte) 0, 0);
        int length = this.mFrameSize.length;
        atom.setData(new byte[]{0, 0, 0, 1, 0, 0, 0, 1, (byte) ((length >> 24) & 255), (byte) ((length >> 16) & 255), (byte) ((length >> 8) & 255), (byte) (length & 255), 0, 0, 0, 1});
        return atom;
    }

    private Atom getSTSZAtom() {
        Atom atom = new Atom("stsz", (byte) 0, 0);
        int[] iArr = this.mFrameSize;
        int length = iArr.length;
        int i = 8;
        byte[] bArr = new byte[(length * 4) + 8];
        bArr[0] = 0;
        bArr[1] = 0;
        bArr[2] = 0;
        bArr[3] = 0;
        bArr[4] = (byte) ((length >> 24) & 255);
        bArr[5] = (byte) ((length >> 16) & 255);
        bArr[6] = (byte) ((length >> 8) & 255);
        bArr[7] = (byte) (length & 255);
        for (int i2 : iArr) {
            bArr[i] = (byte) ((i2 >> 24) & 255);
            bArr[i + 1] = (byte) ((i2 >> 16) & 255);
            int i3 = i + 3;
            bArr[i + 2] = (byte) ((i2 >> 8) & 255);
            i += 4;
            bArr[i3] = (byte) (i2 & 255);
        }
        atom.setData(bArr);
        return atom;
    }

    private Atom getSTCOAtom() {
        Atom atom = new Atom("stco", (byte) 0, 0);
        atom.setData(new byte[]{0, 0, 0, 1, 0, 0, 0, 0});
        return atom;
    }
}
