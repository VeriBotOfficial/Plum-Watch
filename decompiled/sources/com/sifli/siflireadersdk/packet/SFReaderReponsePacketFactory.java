package com.sifli.siflireadersdk.packet;

import com.clj.fastble.utils.HexUtil;
import com.sifli.siflireadersdk.error.SFReaderException;
import com.sifli.siflireadersdk.packet.response.SFReaderAudioDumpGetResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderFinishResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderLogGetSendDatatResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderLogGetSendEndResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderLogGetSendStartResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderMemGetResponsePacket;
import com.sifli.siflireadersdk.packet.response.SFReaderResponsePacket;
import com.sifli.siflireadersdk.util.ByteUtil;
import com.sifli.siflireadersdk.util.SFLog;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public final class SFReaderReponsePacketFactory {
    private static final String TAG = "SFReaderReponsePacketFactory";

    public static SFReaderResponsePacket parseReponsePacket(byte[] bArr) throws SFReaderException {
        if (bArr == null || bArr.length < 1) {
            return null;
        }
        byte b = bArr[0];
        if (b == 2) {
            return parseLogGetSendStartResponsePacket(b, bArr);
        }
        if (b == 3) {
            return parseLogGetSendDataResponsePacket(b, bArr);
        }
        if (b == 4) {
            return parseLogGetSendEndResponsePacket(b);
        }
        if (b == 15) {
            return parseFinishResponsePacket(b);
        }
        if (b == 31) {
            return parseAudioGetSendStartResponsePacket(b, bArr);
        }
        if (b != 37) {
            return null;
        }
        return parseMemGetResponsePacket(b, bArr);
    }

    private static SFReaderResponsePacket parseFinishResponsePacket(int i) {
        SFLog.i(TAG, "rcv finish packet");
        return new SFReaderFinishResponsePacket(i);
    }

    private static SFReaderResponsePacket parseLogGetSendStartResponsePacket(int i, byte[] bArr) throws SFReaderException {
        SFLog.i(TAG, "parseLogGetSendStartResponsePacket");
        if (bArr.length < 5) {
            throw new SFReaderException(120, "长度不足");
        }
        byte[] copyFrom = ByteUtil.copyFrom(bArr, 1, 4);
        long parseBytesToInt32 = ByteUtil.parseBytesToInt32(copyFrom);
        SFLog.i(TAG, "all data len=" + parseBytesToInt32 + ",hex=" + HexUtil.encodeHexStr(copyFrom));
        return new SFReaderLogGetSendStartResponsePacket(i, parseBytesToInt32);
    }

    private static SFReaderResponsePacket parseLogGetSendDataResponsePacket(int i, byte[] bArr) throws SFReaderException {
        SFLog.i(TAG, "parseLogGetSendDataResponsePacket");
        if (bArr.length < 5) {
            throw new SFReaderException(120, "长度不足");
        }
        int parseBytesToInt32 = (int) ByteUtil.parseBytesToInt32(ByteUtil.copyFrom(bArr, 1, 4));
        byte[] bArr2 = new byte[0];
        if (bArr.length > 5) {
            bArr2 = ByteUtil.copyFrom(bArr, 5, bArr.length - 5);
        }
        return new SFReaderLogGetSendDatatResponsePacket(i, parseBytesToInt32, bArr2);
    }

    private static SFReaderResponsePacket parseLogGetSendEndResponsePacket(int i) {
        SFLog.i(TAG, "rcv send end packet");
        return new SFReaderLogGetSendEndResponsePacket(i);
    }

    private static SFReaderMemGetResponsePacket parseMemGetResponsePacket(int i, byte[] bArr) throws SFReaderException {
        SFLog.i(TAG, "SFReaderMemGetResponsePacket");
        if (bArr.length != 5) {
            throw new SFReaderException(120, "长度不足");
        }
        return new SFReaderMemGetResponsePacket(i, ByteUtil.copyFrom(bArr, 1, 4));
    }

    private static SFReaderAudioDumpGetResponsePacket parseAudioGetSendStartResponsePacket(int i, byte[] bArr) throws SFReaderException {
        SFLog.i(TAG, "parseAudioGetSendStartResponsePacket");
        if (bArr.length <= 5) {
            throw new SFReaderException(120, "长度不足");
        }
        return new SFReaderAudioDumpGetResponsePacket(ByteUtil.parseBytesToInt32(ByteUtil.copyFrom(bArr, 1, 4)), new String(ByteUtil.copyFrom(bArr, 5, bArr.length - 5), Charset.defaultCharset()));
    }
}
