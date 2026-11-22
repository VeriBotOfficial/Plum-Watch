package com.sifli.watchfacesdk.task;

import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.task.SFTaskBase;
import com.sifli.watchfacesdk.packet.request.SFWatchfaceRequestPacket;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceResponsePacket;

/* loaded from: classes17.dex */
public class SFWatchfaceCommandTask extends SFTaskBase {
    private final String TAG = "SFWatchfaceCommandTask";
    private SFWatchfaceRequestPacket requestPacket;
    private SFWatchfaceResponsePacket responsePacket;

    public static boolean isCmdPairWithReqCmd(int i, int i2) {
        if (i == 0 && i2 == 1) {
            return true;
        }
        if (i == 2 && i2 == 3) {
            return true;
        }
        if (i == 4 && i2 == 5) {
            return true;
        }
        if (i == 6 && i2 == 7) {
            return true;
        }
        if (i == 8 && i2 == 9) {
            return true;
        }
        if (i == 15 && i2 == 16) {
            return true;
        }
        return i == 13 && i2 == 14;
    }

    public SFWatchfaceCommandTask(SFWatchfaceRequestPacket sFWatchfaceRequestPacket) {
        this.requestPacket = sFWatchfaceRequestPacket;
    }

    public void handleRspPacket(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFLog.i("SFWatchfaceCommandTask", "handleRspPacket");
        if (Boolean.valueOf(isCmdPairWithReqCmd(this.requestPacket.getCommandType(), sFWatchfaceResponsePacket.getCommandType())).booleanValue()) {
            boolean z = sFWatchfaceResponsePacket.getResult() == 0;
            this.responsePacket = sFWatchfaceResponsePacket;
            SFError makeDevError = !z ? SFError.makeDevError(sFWatchfaceResponsePacket.getResult()) : null;
            stopTimer();
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, z, makeDevError);
                return;
            }
            return;
        }
        SFLog.w("SFWatchfaceCommandTask", "cmd not unpair req=%d,rsp=%d", Integer.valueOf(this.requestPacket.getCommandType()), Integer.valueOf(sFWatchfaceResponsePacket.getCommandType()));
    }

    public SFWatchfaceRequestPacket getRequestPacket() {
        return this.requestPacket;
    }

    public SFWatchfaceResponsePacket getResponsePacket() {
        return this.responsePacket;
    }
}
