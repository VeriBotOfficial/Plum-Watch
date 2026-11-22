package com.sifli.siflireadersdk.packet.response;

/* loaded from: classes16.dex */
public class SFReaderAudioDumpGetResponsePacket extends SFReaderResponsePacket {
    private long fileLength;
    private String fileName;

    public SFReaderAudioDumpGetResponsePacket(long j, String str) {
        super(31, 1, j, new byte[0]);
        this.fileLength = j;
        this.fileName = str;
    }

    public long getFileLength() {
        return this.fileLength;
    }

    public String getFileName() {
        return this.fileName;
    }
}
