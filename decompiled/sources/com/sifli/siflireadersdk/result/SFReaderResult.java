package com.sifli.siflireadersdk.result;

import com.sifli.siflireadersdk.packet.response.SFReaderResponsePacket;
import java.util.ArrayList;

/* loaded from: classes16.dex */
public class SFReaderResult {
    private int requestCommand;
    private SFReaderResponsePacket responsePacket;
    private ArrayList<String> rcvFiles = new ArrayList<>();
    private int responseCommand = 255;

    public SFReaderResult(int i) {
        this.requestCommand = i;
    }

    public int getRequestCommand() {
        return this.requestCommand;
    }

    public int getResponseCommand() {
        return this.responseCommand;
    }

    public void setResponseCommand(int i) {
        this.responseCommand = i;
    }

    public SFReaderResponsePacket getResponsePacket() {
        return this.responsePacket;
    }

    public void setResponsePacket(SFReaderResponsePacket sFReaderResponsePacket) {
        this.responsePacket = sFReaderResponsePacket;
    }

    public ArrayList<String> getRcvFiles() {
        return this.rcvFiles;
    }
}
