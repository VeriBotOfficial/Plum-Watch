package com.bluetrum.fota.abota;

import com.bluetrum.fota.manager.OtaManager;

/* loaded from: classes13.dex */
public class ABOtaManager extends OtaManager {
    private final EventListener eventListener;

    public interface EventListener extends OtaManager.EventListener {
        void sendOtaData(byte[] bArr);
    }

    public ABOtaManager(EventListener eventListener) {
        super(eventListener);
        this.eventListener = eventListener;
    }

    @Override // com.bluetrum.fota.manager.OtaManager
    protected void btSendData(byte[] bArr) {
        if (this.isUpdatePause) {
            return;
        }
        this.eventListener.sendOtaData(bArr);
    }

    public void nextRun() {
        runDataSend();
    }
}
