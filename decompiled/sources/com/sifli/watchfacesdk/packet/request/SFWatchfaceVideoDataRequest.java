package com.sifli.watchfacesdk.packet.request;

import com.sifli.siflicore.error.SFException;
import com.sifli.siflicore.util.ByteUtil;
import java.nio.charset.Charset;

/* loaded from: classes17.dex */
public class SFWatchfaceVideoDataRequest extends SFWatchfaceRequestPacket {
    private int dataType;
    private byte[] fileData;
    private int fileLen;
    private String fileName;
    private int fleNameLen;
    private int index;

    public SFWatchfaceVideoDataRequest(int i, String str, int i2, byte[] bArr) {
        super(15);
        if (i == 0 || i == 1) {
            this.dataType = i;
            this.fileName = str;
            this.fileLen = i2;
            this.fileData = bArr;
            this.index = 1;
            byte[] bArr2 = {(byte) i};
            byte[] intTo2Bytes = ByteUtil.intTo2Bytes(str.length());
            setReservedData(ByteUtil.mergeArrays(ByteUtil.mergeArrays(ByteUtil.mergeArrays(ByteUtil.mergeArrays(ByteUtil.mergeArrays(bArr2, intTo2Bytes), str.getBytes(Charset.defaultCharset())), ByteUtil.intTo4Bytes(i2)), ByteUtil.intTo4Bytes(this.index)), bArr));
            return;
        }
        new SFException(100, "not support data type=" + i + ",please construct by other method");
    }

    public SFWatchfaceVideoDataRequest(int i, int i2, byte[] bArr) {
        super(15);
        this.dataType = i;
        this.index = i2;
        this.fileData = bArr;
        setReservedData(ByteUtil.mergeArrays(ByteUtil.mergeArrays(new byte[]{(byte) i}, ByteUtil.intTo4Bytes(i2)), bArr));
    }
}
