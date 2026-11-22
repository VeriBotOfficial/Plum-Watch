package com.sifli.siflireadersdk.packet.response;

/* loaded from: classes16.dex */
public class SFReaderLogGetSendStartResponsePacket extends SFReaderResponsePacket {
    private long fileLength;

    public SFReaderLogGetSendStartResponsePacket(int i, long j) {
        super(i, 1, j, new byte[0]);
        this.fileLength = j;
    }

    public long getFileLength() {
        return this.fileLength;
    }
}
