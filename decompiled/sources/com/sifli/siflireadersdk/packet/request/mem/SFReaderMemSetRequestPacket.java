package com.sifli.siflireadersdk.packet.request.mem;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import com.sifli.siflireadersdk.util.ByteUtil;
import java.nio.charset.Charset;

/* loaded from: classes16.dex */
public class SFReaderMemSetRequestPacket extends SFReaderRequestPacket {
    private String addrData;
    private int addrLen;
    private String valueData;
    private int valueLen;

    public SFReaderMemSetRequestPacket(String str, String str2) {
        super(38);
        this.addrData = str;
        this.valueData = str2;
        byte[] bytes = str.getBytes(Charset.defaultCharset());
        int length = bytes.length;
        this.addrLen = length;
        byte[] mergeArrays = ByteUtil.mergeArrays(ByteUtil.intTo2Bytes(length), bytes);
        byte[] bytes2 = this.valueData.getBytes(Charset.defaultCharset());
        int length2 = bytes2.length;
        this.valueLen = length2;
        setReservedData(ByteUtil.mergeArrays(mergeArrays, ByteUtil.mergeArrays(ByteUtil.intTo2Bytes(length2), bytes2)));
    }
}
