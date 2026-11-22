package com.sifli.watchfacesdk.task;

import com.sifli.siflicore.error.SFError;
import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.task.SFTaskBase;
import com.sifli.siflicore.util.ByteUtil;
import com.sifli.watchfacesdk.packet.request.SFWatchfaceVideoDataRequest;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceResponsePacket;
import com.sifli.watchfacesdk.packet.response.SFWatchfaceVideoDataResponse;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class SFWatchfaceSendVideoTask extends SFTaskBase {
    private long fileInvervalTime;
    private long makePacketTime;
    private int maxDataLen;
    private long sendFileBeginTIme;
    private long sendFileEndTIme;
    private int sendIndex;
    private long sendPacketEndTIme;
    private long sendPacketStartTIme;
    private int total;
    private SFWatchfaceSendVideoTaskCallback videoTaskCallback;
    private final String TAG = "SFWatchfaceSendVideoTask";
    private String fileName = "preview_video.jpg";
    private boolean taskBusy = false;
    private ArrayList<SFWatchfaceVideoDataRequest> sendPackets = new ArrayList<>();

    public SFWatchfaceSendVideoTask(int i) {
        this.maxDataLen = i;
    }

    public boolean isBusy() {
        return this.taskBusy;
    }

    public int getIndex() {
        return this.sendIndex + 1;
    }

    public void sendVideoFrame(byte[] bArr) {
        if (this.taskBusy) {
            SFLog.w("SFWatchfaceSendVideoTask", "sendVideoFrame,taskBusy = true,ignore.");
            return;
        }
        this.fileName = createFileName();
        SFLog.i("SFWatchfaceSendVideoTask", String.format("sendVideoFrame len=%d,filename=%s", Integer.valueOf(bArr.length), this.fileName));
        this.taskBusy = true;
        long timeNow = timeNow();
        this.sendFileBeginTIme = timeNow;
        makeSendPackets(ByteUtil.appendCRCWithData(bArr, (byte) 0));
        long timeNow2 = timeNow();
        this.sendPacketStartTIme = timeNow();
        long j = timeNow2 - timeNow;
        SFLog.i("SFWatchfaceSendVideoTask", "make packets time= %df", Long.valueOf(j));
        this.makePacketTime = j;
        this.sendIndex = 0;
        sendPacetWithIndex(0);
    }

    public void handleRspPacket(SFWatchfaceResponsePacket sFWatchfaceResponsePacket) {
        SFLog.i("SFWatchfaceSendVideoTask", "handleRspPacket");
        if (sFWatchfaceResponsePacket.getResult() == 8) {
            SFLog.w("SFWatchfaceSendVideoTask", "received remote user abort,result = 8");
            SFError sFError = new SFError(120, "用户终止视频预览");
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, sFError);
                return;
            }
            return;
        }
        if (sFWatchfaceResponsePacket.getCommandType() != 16) {
            SFLog.w("SFWatchfaceSendVideoTask", "received unexpected packet:%s", sFWatchfaceResponsePacket.getClass().getSimpleName());
            return;
        }
        SFWatchfaceVideoDataResponse sFWatchfaceVideoDataResponse = (SFWatchfaceVideoDataResponse) sFWatchfaceResponsePacket;
        if (sFWatchfaceVideoDataResponse.getResult() == 0) {
            long timeNow = timeNow();
            this.sendPacketStartTIme = timeNow;
            SFLog.i("SFWatchfaceSendVideoTask", "packet invertal time = %df", Long.valueOf(timeNow - this.sendPacketEndTIme));
            this.sendIndex++;
            resumeCountDown();
            sendPacetWithIndex(this.sendIndex);
            return;
        }
        if (sFWatchfaceVideoDataResponse.getResult() != 4) {
            SFError makeDevError = SFError.makeDevError(sFWatchfaceVideoDataResponse.getResult());
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, false, makeDevError);
                return;
            }
            return;
        }
        if (sFWatchfaceVideoDataResponse.getExpectIndex() > 0 && sFWatchfaceVideoDataResponse.getExpectIndex() <= this.total) {
            int expectIndex = ((int) sFWatchfaceVideoDataResponse.getExpectIndex()) - 1;
            this.sendIndex = expectIndex;
            sendPacetWithIndex(expectIndex);
        } else {
            int i = this.sendIndex + 1;
            this.sendIndex = i;
            sendPacetWithIndex(i);
        }
    }

    public void clear() {
        this.sendIndex = 0;
        this.sendPackets.clear();
    }

    private void sendPacetWithIndex(int i) {
        SFLog.i("SFWatchfaceSendVideoTask", "sendPacetWithIndex=%d", Integer.valueOf(i));
        if (i < 0) {
            SFLog.i("SFWatchfaceSendVideoTask", "sendPacetWithIndex index out of range.index=%d", Integer.valueOf(i));
        }
        if (i >= this.sendPackets.size()) {
            this.taskBusy = false;
            if (this.callback != null) {
                this.callback.bleTaskOnTaskCompete(this, true, null);
            }
            long timeNow = timeNow();
            this.sendFileEndTIme = timeNow;
            SFLog.i("SFWatchfaceSendVideoTask", "send file cost time=%d", Long.valueOf(timeNow - this.sendFileBeginTIme));
            return;
        }
        long timeNow2 = timeNow();
        byte[] mashal = this.sendPackets.get(i).mashal();
        long timeNow3 = timeNow();
        SFLog.i("SFWatchfaceSendVideoTask", "mashal time=%d", Long.valueOf(timeNow3 - timeNow2));
        SFWatchfaceSendVideoTaskCallback sFWatchfaceSendVideoTaskCallback = this.videoTaskCallback;
        if (sFWatchfaceSendVideoTaskCallback != null) {
            sFWatchfaceSendVideoTaskCallback.sendVideoTask(this, mashal);
            long timeNow4 = timeNow();
            this.sendPacketEndTIme = timeNow4;
            SFLog.i("SFWatchfaceSendVideoTask", "video packet send time=%d,readyTime=%d", Long.valueOf(timeNow4 - this.sendPacketStartTIme), Long.valueOf(timeNow3 - this.sendPacketStartTIme));
        }
    }

    public void updateMaxDataLen(int i) {
        this.maxDataLen = i;
        SFLog.i("SFWatchfaceSendVideoTask", "updateMaxDataLen =%d", Integer.valueOf(i));
    }

    private void makeSendPackets(byte[] bArr) {
        byte[] copyFrom;
        SFLog.i("SFWatchfaceSendVideoTask", "makeSendPackets maxDataLen=%d", Integer.valueOf(this.maxDataLen));
        if (this.maxDataLen <= 0) {
            this.maxDataLen = 5000;
            SFLog.w("SFWatchfaceSendVideoTask", "maxDataLen=0,reset with 5000 instead");
        }
        this.sendPackets.clear();
        int length = bArr.length;
        int i = this.maxDataLen;
        int i2 = 0;
        if (length <= i) {
            this.total = 1;
            this.sendPackets.add(new SFWatchfaceVideoDataRequest(0, this.fileName, bArr.length, bArr));
        } else {
            this.total = (bArr.length / i) + (bArr.length % i > 0 ? 1 : 0);
            int i3 = 1;
            while (i2 < bArr.length) {
                int i4 = this.maxDataLen;
                if (i2 + i4 < bArr.length) {
                    copyFrom = ByteUtil.copyFrom(bArr, i2, i4);
                } else {
                    copyFrom = ByteUtil.copyFrom(bArr, i2, bArr.length - i2);
                }
                if (i3 == 1) {
                    this.sendPackets.add(new SFWatchfaceVideoDataRequest(1, this.fileName, bArr.length, copyFrom));
                } else if (i3 == this.total) {
                    this.sendPackets.add(new SFWatchfaceVideoDataRequest(3, i3, copyFrom));
                } else {
                    this.sendPackets.add(new SFWatchfaceVideoDataRequest(2, i3, copyFrom));
                }
                i3++;
                i2 += this.maxDataLen;
            }
        }
        SFLog.i("SFWatchfaceSendVideoTask", "makeSendPackets done count=%d", Integer.valueOf(this.total));
    }

    private String createFileName() {
        return String.format("priview_video_%d.jpg", Long.valueOf(System.currentTimeMillis()));
    }

    private long timeNow() {
        return System.currentTimeMillis();
    }

    public void setVideoTaskCallback(SFWatchfaceSendVideoTaskCallback sFWatchfaceSendVideoTaskCallback) {
        this.videoTaskCallback = sFWatchfaceSendVideoTaskCallback;
    }
}
