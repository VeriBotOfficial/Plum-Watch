package com.sifli.siflireadersdk.task;

import android.util.Log;
import com.sifli.siflireadersdk.blecore.SFCountDownTimer;
import com.sifli.siflireadersdk.error.SFError;
import com.sifli.siflireadersdk.packet.request.SFReaderRequestPacket;
import com.sifli.siflireadersdk.packet.response.SFReaderResponsePacket;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class SFReaderBLETaskBase implements SFCountDownTimer.SFCountDownTimerCallback {
    private static final String TAG = "SFReaderBLETaskBase";
    protected SFReaderBLETaskCallback callback;
    protected long receivedDataLength;
    protected SFReaderRequestPacket sendPacket;
    protected long totalDataLength;
    protected ArrayList<SFReaderResponsePacket> rspPackets = new ArrayList<>();
    private SFCountDownTimer countDownTimer = new SFCountDownTimer(this, "SFReaderBLETask");

    public SFReaderBLETaskBase(SFReaderRequestPacket sFReaderRequestPacket) {
        this.sendPacket = sFReaderRequestPacket;
    }

    public void setCallback(SFReaderBLETaskCallback sFReaderBLETaskCallback) {
        this.callback = sFReaderBLETaskCallback;
    }

    @Override // com.sifli.siflireadersdk.blecore.SFCountDownTimer.SFCountDownTimerCallback
    public void onTimeOut() {
        Log.e(TAG, "onTimeOut");
        if (this.callback != null) {
            this.callback.bleTaskOnTaskCompete(this, false, new SFError(160, "任务超时"));
        }
    }

    public void startTimer() {
        this.countDownTimer.startTimer(20);
    }

    protected void resumeCountDown() {
        this.countDownTimer.setCounDown(10);
    }

    public void stopTimer() {
        this.countDownTimer.stopTimer();
    }

    public void handleRspPacket(SFReaderResponsePacket sFReaderResponsePacket) throws NoSuchMethodException {
        throw new NoSuchMethodException("please implement it in child class");
    }

    public SFReaderResponsePacket firstResponsePacket() {
        if (this.rspPackets.size() > 0) {
            return this.rspPackets.get(0);
        }
        return null;
    }

    public SFReaderRequestPacket getSendPacket() {
        return this.sendPacket;
    }
}
