package com.sifli.watchfacesdk.packet.request;

import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.util.ByteUtil;
import java.nio.charset.StandardCharsets;

/* loaded from: classes17.dex */
public class SFWatchfaceFileStartRequest extends SFWatchfaceRequestPacket {
    private static final String TAG = "SFWatchfaceFileStartRequest";
    private int fileLen;
    private String fileName;

    public SFWatchfaceFileStartRequest(int i, String str) {
        super(2);
        SFLog.i(TAG, "fileName=%s", str);
        this.fileLen = i;
        this.fileName = str;
        byte[] intTo4Bytes = ByteUtil.intTo4Bytes(i);
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        setReservedData(ByteUtil.mergeArrays(ByteUtil.mergeArrays(intTo4Bytes, ByteUtil.intTo2Bytes(bytes.length)), bytes));
    }
}
