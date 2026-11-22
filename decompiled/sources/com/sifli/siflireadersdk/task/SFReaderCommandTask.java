package com.sifli.siflireadersdk.task;

import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import com.sifli.siflireadersdk.packet.response.SFReaderResponsePacket;

/* loaded from: classes17.dex */
public class SFReaderCommandTask extends SFReaderBLETaskBase {
    public SFReaderCommandTask(SFReaderRequestPacket sFReaderRequestPacket) {
        super(sFReaderRequestPacket);
    }

    @Override // com.sifli.siflireadersdk.task.SFReaderBLETaskBase
    public void handleRspPacket(SFReaderResponsePacket sFReaderResponsePacket) {
        this.rspPackets.add(sFReaderResponsePacket);
        stopTimer();
        if (this.callback != null) {
            this.callback.bleTaskOnTaskCompete(this, true, null);
        }
    }
}
