package com.bluetrum.fota.manager;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bluetrum.fota.log.Logger;
import com.bluetrum.fota.manager.OtaManager;
import com.bluetrum.fota.utils.HexUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Objects;

/* loaded from: classes13.dex */
public abstract class OtaManager {
    private static final int DEFAULT_TIMEOUT = 10000;
    protected static final int DELAY_AFTER_SEND_IDENTIFICATION = 200;
    private static final String TAG = "OtaManager";
    private static final int UNDEFINED_FIRMWARE_VERSION = -1;
    protected boolean allowedUpdate;
    protected OtaDataProvider dataProvider;
    private final EventListener eventListener;
    protected int otaFirmwareVersion = -1;
    protected int deviceFirmwareVersion = -1;
    private int mBlockSize = 4096;
    private int mPacketSize = 240;
    protected boolean isUpdating = false;
    protected boolean isUpdatePause = false;
    protected Boolean isTwsDevice = null;
    protected Boolean isTwsConnected = null;
    public boolean disconnectedDueToDeviceError = false;
    private boolean _needIdentification = true;
    protected boolean sentIdentification = false;
    private final Handler notifyHandler = new Handler(Looper.getMainLooper());
    private final Handler timeoutHandler = new Handler(Looper.getMainLooper());
    protected OtaCommandGenerator commandGenerator = new OtaCommandGenerator();

    public interface EventListener {
        void onOtaContinue();

        void onOtaError(OtaError otaError);

        void onOtaFinish();

        void onOtaPause();

        void onOtaProgress(int i);

        void onOtaReady();

        void onOtaStart();

        void onOtaStop();

        void onReceiveChannel(boolean z);

        void onReceiveIsTWS(boolean z);

        void onReceiveTWSConnected(boolean z);

        void onReceiveVersion(int i);

        void onTWSDisconnected();
    }

    protected abstract void btSendData(byte[] bArr);

    public void init() {
    }

    public OtaManager(EventListener eventListener) {
        this.eventListener = eventListener;
    }

    public void release() {
        this.otaFirmwareVersion = -1;
        this.deviceFirmwareVersion = -1;
        this.allowedUpdate = false;
        this.isUpdating = false;
        this.isUpdatePause = false;
        this.sentIdentification = false;
        cancelTimeout();
        this.commandGenerator.reset();
    }

    public boolean isCompressedData() {
        return this.dataProvider.isCompressedData();
    }

    protected int getPacketSize() {
        return this.mPacketSize;
    }

    public void setPacketSize(int i) {
        this.mPacketSize = i;
    }

    protected int getBlockSize() {
        return this.mBlockSize;
    }

    public void prepareToUpdate() {
        if (needIdentification()) {
            sendOtaIdentification();
        } else {
            getAllInfo();
        }
    }

    public void startOTA() {
        this.isUpdating = true;
        notifyOnStart();
        getOtaInfoVersion();
    }

    public boolean isDeviceReady() {
        Logger.i(TAG, "isDeviceReady: T:" + this.isTwsDevice + ", C:" + this.isTwsConnected);
        Boolean bool = this.isTwsDevice;
        if (bool == null) {
            return false;
        }
        if (bool.booleanValue()) {
            return isTwsConnected();
        }
        return true;
    }

    public boolean isReadyToUpdate() {
        Logger.i(TAG, "isReadyToUpdate: R:" + isDeviceReady() + ", D:" + (this.dataProvider != null));
        return isDeviceReady() && this.dataProvider != null;
    }

    protected boolean canSendNow() {
        return this.allowedUpdate && !this.dataProvider.isBlockSendFinish();
    }

    public void setOtaData(byte[] bArr) {
        OtaDataProvider otaDataProvider = new OtaDataProvider(bArr);
        this.dataProvider = otaDataProvider;
        otaDataProvider.setBlockSize(getBlockSize());
        this.dataProvider.setPacketSize(getPacketSize());
        OtaCommandGenerator otaCommandGenerator = this.commandGenerator;
        if (otaCommandGenerator != null) {
            otaCommandGenerator.setDataProvider(this.dataProvider);
        } else {
            this.commandGenerator = new OtaCommandGenerator(this.dataProvider);
        }
        checkIfReadyToUpdate();
    }

    public boolean isUpdating() {
        return this.isUpdating;
    }

    public boolean isTwsDevice() {
        Boolean bool = this.isTwsDevice;
        return bool != null && bool.booleanValue();
    }

    public boolean isTwsConnected() {
        Boolean bool = this.isTwsConnected;
        return bool != null && bool.booleanValue();
    }

    protected void checkIfReadyToUpdate() {
        boolean isReadyToUpdate = isReadyToUpdate();
        Logger.i(TAG, "checkIfReadyToUpdate: " + isReadyToUpdate);
        if (isReadyToUpdate) {
            notifyOnReady();
        }
    }

    protected void notifyOnReady() {
        Handler handler = this.notifyHandler;
        final EventListener eventListener = this.eventListener;
        Objects.requireNonNull(eventListener);
        handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.EventListener.this.onOtaReady();
            }
        });
    }

    protected void notifyOnStart() {
        Handler handler = this.notifyHandler;
        final EventListener eventListener = this.eventListener;
        Objects.requireNonNull(eventListener);
        handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.EventListener.this.onOtaStart();
            }
        });
    }

    /* renamed from: lambda$notifyOnProgress$0$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7240lambda$notifyOnProgress$0$combluetrumfotamanagerOtaManager(int i) {
        this.eventListener.onOtaProgress(i);
    }

    protected void notifyOnProgress(final int i) {
        this.notifyHandler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7240lambda$notifyOnProgress$0$combluetrumfotamanagerOtaManager(i);
            }
        });
    }

    protected void notifyOnStop() {
        if (!this.disconnectedDueToDeviceError) {
            Handler handler = this.notifyHandler;
            final EventListener eventListener = this.eventListener;
            Objects.requireNonNull(eventListener);
            handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    OtaManager.EventListener.this.onOtaStop();
                }
            });
        }
        this.disconnectedDueToDeviceError = false;
    }

    protected void notifyOnFinish() {
        Handler handler = this.notifyHandler;
        final EventListener eventListener = this.eventListener;
        Objects.requireNonNull(eventListener);
        handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.EventListener.this.onOtaFinish();
            }
        });
    }

    protected void notifyOnPause() {
        Handler handler = this.notifyHandler;
        final EventListener eventListener = this.eventListener;
        Objects.requireNonNull(eventListener);
        handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.EventListener.this.onOtaPause();
            }
        });
    }

    protected void notifyOnContinue() {
        Handler handler = this.notifyHandler;
        final EventListener eventListener = this.eventListener;
        Objects.requireNonNull(eventListener);
        handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.EventListener.this.onOtaContinue();
            }
        });
    }

    protected void notifyOnError(final OtaError otaError) {
        this.disconnectedDueToDeviceError = true;
        this.notifyHandler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7239lambda$notifyOnError$1$combluetrumfotamanagerOtaManager(otaError);
            }
        });
        release();
    }

    /* renamed from: lambda$notifyOnError$1$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7239lambda$notifyOnError$1$combluetrumfotamanagerOtaManager(OtaError otaError) {
        this.eventListener.onOtaError(otaError);
    }

    protected void notifyTWSDisconnected() {
        Handler handler = this.notifyHandler;
        final EventListener eventListener = this.eventListener;
        Objects.requireNonNull(eventListener);
        handler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.EventListener.this.onTWSDisconnected();
            }
        });
    }

    /* renamed from: lambda$notifyOnReceiveVersion$2$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7244xae681c53(int i) {
        this.eventListener.onReceiveVersion(i);
    }

    protected void notifyOnReceiveVersion(final int i) {
        this.notifyHandler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda13
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7244xae681c53(i);
            }
        });
    }

    /* renamed from: lambda$notifyOnReceiveIsTWS$3$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7242x7fdafcc4(boolean z) {
        this.eventListener.onReceiveIsTWS(z);
    }

    protected void notifyOnReceiveIsTWS(final boolean z) {
        this.notifyHandler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7242x7fdafcc4(z);
            }
        });
    }

    /* renamed from: lambda$notifyOnReceiveTWSConnected$4$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7243x5f099c74(boolean z) {
        this.eventListener.onReceiveTWSConnected(z);
    }

    protected void notifyOnReceiveTWSConnected(final boolean z) {
        this.notifyHandler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7243x5f099c74(z);
            }
        });
    }

    /* renamed from: lambda$notifyOnReceiveChannel$5$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7241x6ae507a5(boolean z) {
        this.eventListener.onReceiveChannel(z);
    }

    protected void notifyOnReceiveChannel(final boolean z) {
        this.notifyHandler.post(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7241x6ae507a5(z);
            }
        });
    }

    protected void getOtaInfoVersion() {
        btSendData(this.commandGenerator.cmdGetInfoVersion());
    }

    protected void getOtaInfoUpdate(int i) {
        OtaDataProvider otaDataProvider = this.dataProvider;
        if (otaDataProvider != null) {
            btSendData(this.commandGenerator.cmdGetInfoUpdate(i, otaDataProvider.getHash()));
        }
    }

    protected void sendOtaIdentification() {
        btSendData(this.commandGenerator.cmdOtaIdentification());
    }

    protected void getAllInfo() {
        btSendData(this.commandGenerator.cmdGetAllInfo());
    }

    protected void sendOtaStart() {
        btSendData(this.commandGenerator.cmdStartSend());
        notifyOnProgress(this.dataProvider.getProgress());
    }

    protected void sendOtaData() {
        btSendData(this.commandGenerator.cmdSendData());
        notifyOnProgress(this.dataProvider.getProgress());
    }

    protected void sendOtaDataOnce() {
        sendOtaData();
    }

    protected void runDataSend() {
        if (!needIdentification() || this.sentIdentification) {
            if (canSendNow()) {
                sendOtaDataOnce();
                return;
            }
            OtaDataProvider otaDataProvider = this.dataProvider;
            if (otaDataProvider == null || !otaDataProvider.isBlockSendFinish()) {
                return;
            }
            this.timeoutHandler.postDelayed(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    OtaManager.this.handleTimeout();
                }
            }, 10000L);
            return;
        }
        HandlerThread handlerThread = new HandlerThread("Get All Info");
        handlerThread.start();
        new Handler(handlerThread.getLooper()).postDelayed(new Runnable() { // from class: com.bluetrum.fota.manager.OtaManager$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                OtaManager.this.m7245lambda$runDataSend$6$combluetrumfotamanagerOtaManager();
            }
        }, 200L);
    }

    /* renamed from: lambda$runDataSend$6$com-bluetrum-fota-manager-OtaManager, reason: not valid java name */
    /* synthetic */ void m7245lambda$runDataSend$6$combluetrumfotamanagerOtaManager() {
        this.sentIdentification = true;
        getAllInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleTimeout() {
        if (this.isUpdatePause) {
            return;
        }
        Logger.e(TAG, "Timed out while waiting for response");
        notifyOnError(OtaError.TIMEOUT_RECEIVE_RESPONSE);
    }

    private void cancelTimeout() {
        this.timeoutHandler.removeCallbacksAndMessages(null);
    }

    public boolean processData(byte[] bArr) {
        if (bArr.length < 3) {
            Logger.w(TAG, "The length of received data less than 3");
            return false;
        }
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        byte b = wrap.get();
        wrap.get();
        switch (b) {
            case -112:
                processNotifyStatus(wrap.get());
                break;
            case -111:
                byte b2 = wrap.get();
                byte[] bArr2 = new byte[wrap.remaining()];
                wrap.get(bArr2, 0, wrap.remaining());
                processGetInfo(b2, bArr2);
                break;
            case -110:
                byte[] bArr3 = new byte[wrap.remaining()];
                wrap.get(bArr3, 0, wrap.remaining());
                processGetInfoTLV(bArr3);
                break;
        }
        return false;
    }

    protected void processNotifyStatus(byte b) {
        if (b == Byte.MIN_VALUE) {
            cancelTimeout();
            this.isUpdating = false;
            this.isTwsConnected = false;
            notifyTWSDisconnected();
            notifyOnReceiveTWSConnected(this.isTwsConnected.booleanValue());
            return;
        }
        if (b == -3) {
            cancelTimeout();
            this.allowedUpdate = false;
            this.isUpdating = false;
            this.isUpdatePause = true;
            notifyOnPause();
            return;
        }
        if (b == -2) {
            notifyOnContinue();
            this.isUpdating = true;
            this.isUpdatePause = false;
            getOtaInfoVersion();
            return;
        }
        if (b == -1) {
            cancelTimeout();
            notifyOnFinish();
            release();
        } else {
            if (b == 0) {
                cancelTimeout();
                if (this.isUpdatePause || this.dataProvider.isAllDataSent()) {
                    return;
                }
                sendOtaStart();
                return;
            }
            OtaError.REPORT_FROM_DEVICE.setDeviceErrorCode(b);
            cancelTimeout();
            notifyOnError(OtaError.REPORT_FROM_DEVICE);
        }
    }

    protected void processGetInfo(byte b, byte[] bArr) {
        processInfo(b, bArr);
        if (b == 1) {
            getOtaInfoUpdate(this.otaFirmwareVersion);
            return;
        }
        if (b != 2) {
            return;
        }
        if (this.allowedUpdate) {
            sendOtaStart();
        } else {
            cancelTimeout();
            notifyOnError(OtaError.REFUSED_BY_DEVICE);
        }
    }

    private void processGetInfoTLV(byte[] bArr) {
        while (bArr.length > 2) {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            byte b = wrap.get();
            byte[] bArr2 = new byte[wrap.get()];
            wrap.get(bArr2);
            processInfo(b, bArr2);
            if (!wrap.hasRemaining()) {
                break;
            }
            byte[] bArr3 = new byte[wrap.remaining()];
            wrap.get(bArr3);
            bArr = bArr3;
        }
        checkIfReadyToUpdate();
    }

    private void processInfo(byte b, byte[] bArr) {
        String str = TAG;
        Logger.d(str, "processInfo: " + ((int) b) + " -> " + HexUtils.bytesToHex(bArr));
        if (b == 1) {
            if (bArr.length == 2) {
                short s = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort();
                notifyOnReceiveVersion(s);
                this.deviceFirmwareVersion = s;
                return;
            }
            return;
        }
        if (b == 2) {
            if (bArr.length == 11) {
                ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
                int i = order.getInt();
                this.dataProvider.setStartAddress(i);
                Logger.d(str, "startAddress = " + i);
                int i2 = order.getInt();
                this.mBlockSize = i2;
                this.dataProvider.setBlockSize(i2);
                Logger.d(str, "blockSize = " + i2);
                short s2 = order.getShort();
                this.mPacketSize = s2;
                this.dataProvider.setPacketSize(s2);
                Logger.d(str, "packetSize = " + ((int) s2));
                this.allowedUpdate = order.get() == 1;
                Logger.d(str, "allowedUpdate = " + this.allowedUpdate);
                return;
            }
            return;
        }
        if (b == 3) {
            if (bArr.length == 2) {
                this.isTwsDevice = Boolean.valueOf((ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort() & 1) != 0);
                Logger.d(str, "isTWS: " + this.isTwsDevice);
                notifyOnReceiveIsTWS(this.isTwsDevice.booleanValue());
                return;
            }
            return;
        }
        if (b == 4) {
            if (bArr.length == 2) {
                this.isTwsConnected = Boolean.valueOf((ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort() & 1) != 0);
                Logger.d(str, "isTwsConnected: " + this.isTwsConnected);
                notifyOnReceiveTWSConnected(this.isTwsConnected.booleanValue());
                return;
            }
            return;
        }
        if (b == 6 && bArr.length == 1) {
            byte b2 = bArr[0];
            if (b2 == 1) {
                Logger.d(str, "Channel: Left");
                notifyOnReceiveChannel(true);
            } else if (b2 == 0) {
                Logger.d(str, "Channel: Right");
                notifyOnReceiveChannel(false);
            }
        }
    }

    public boolean needIdentification() {
        return this._needIdentification;
    }

    public void setNeedIdentification(boolean z) {
        this._needIdentification = z;
    }

    public void setOtaFirmwareVersion(int i) {
        this.otaFirmwareVersion = i;
    }
}
