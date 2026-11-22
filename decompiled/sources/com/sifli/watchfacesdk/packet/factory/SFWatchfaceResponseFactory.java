package com.sifli.watchfacesdk.packet.factory;

import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.util.ByteUtil;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceEntireEndResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceEntireStartResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceFileDataResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceFileEndResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceFileStartResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceLoseCheckReqResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceSpaceResponse;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceVideoDataResponse;

/* loaded from: classes17.dex */
public class SFWatchfaceResponseFactory {
    public static SFWatchfaceResponseResult parseResponseWithData(byte[] bArr) {
        if (bArr.length < 2) {
            SFWatchfaceResponseResult sFWatchfaceResponseResult = new SFWatchfaceResponseResult();
            sFWatchfaceResponseResult.setSuccess(false);
            sFWatchfaceResponseResult.setError(new SFError(110, "Insufficient data length"));
            return sFWatchfaceResponseResult;
        }
        byte b = bArr[0];
        if (b == 1) {
            return parseEntireStartResponse(bArr);
        }
        if (b == 3) {
            return parseFileStartResponse(bArr);
        }
        if (b == 5) {
            return parseFileDataResponse(bArr);
        }
        if (b == 7) {
            return parseFileEndResponse(bArr);
        }
        if (b == 14) {
            return parseSpaceResponse(bArr);
        }
        if (b == 16) {
            return parseVideoDataResponse(bArr);
        }
        if (b == 9) {
            return parseEntireEndResponse(bArr);
        }
        if (b == 10) {
            return parseLostCheck(bArr);
        }
        SFWatchfaceResponseResult sFWatchfaceResponseResult2 = new SFWatchfaceResponseResult();
        sFWatchfaceResponseResult2.setSuccess(false);
        sFWatchfaceResponseResult2.setError(new SFError(110, "unkown respnose command type=" + ((int) b)));
        return sFWatchfaceResponseResult2;
    }

    private static SFWatchfaceResponseResult parseEntireStartResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("entire start response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceEntireStartResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2)), bArr.length >= 6 ? ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 4, 2)) : 0, bArr.length >= 8 ? ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 6, 2)) : 0, bArr.length >= 10 ? ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 8, 2)) : 0, bArr.length >= 14 ? ByteUtil.parseBytesToInt32(ByteUtil.copyFrom(bArr, 10, 4)) : 0L), null);
    }

    private static SFWatchfaceResponseResult parseVideoDataResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("video data response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceVideoDataResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2)), bArr.length >= 8 ? ByteUtil.parseBytesToInt32(ByteUtil.copyFrom(bArr, 4, 4)) : -1L), null);
    }

    private static SFWatchfaceResponseResult parseEntireEndResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("entire end response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceEntireEndResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2))), null);
    }

    private static SFWatchfaceResponseResult parseLostCheck(byte[] bArr) {
        if (bArr.length < 8) {
            return new SFWatchfaceResponseResult(false, null, makeError("entire end response less than 8 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceLoseCheckReqResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2)), ByteUtil.parseBytesToInt32(ByteUtil.copyFrom(bArr, 4, 4))), null);
    }

    private static SFWatchfaceResponseResult parseSpaceResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("file space response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceSpaceResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2))), null);
    }

    private static SFWatchfaceResponseResult parseFileStartResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("file start response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceFileStartResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2))), null);
    }

    private static SFWatchfaceResponseResult parseFileDataResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("file data response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceFileDataResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2)), bArr.length >= 8 ? ByteUtil.parseBytesToInt32(ByteUtil.copyFrom(bArr, 4, 4)) : -1L), null);
    }

    private static SFWatchfaceResponseResult parseFileEndResponse(byte[] bArr) {
        if (bArr.length < 4) {
            return new SFWatchfaceResponseResult(false, null, makeError("file end response less than 4 bytes"));
        }
        return new SFWatchfaceResponseResult(true, new SFWatchfaceFileEndResponse(ByteUtil.parseBytesToInt16(ByteUtil.copyFrom(bArr, 2, 2))), null);
    }

    private static SFError makeError(String str) {
        return new SFError(110, str);
    }
}
