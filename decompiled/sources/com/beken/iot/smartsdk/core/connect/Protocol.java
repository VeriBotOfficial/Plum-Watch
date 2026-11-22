package com.beken.iot.smartsdk.core.connect;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.beken.iot.smartsdk.core.callback.OnNotifyReceiver;
import com.beken.iot.smartsdk.core.callback.OnStateChanged;
import com.beken.iot.smartsdk.core.callback.OnTransmissionReceiver;
import com.beken.iot.smartsdk.core.pack.CommandTransferConst;
import com.beken.iot.smartsdk.core.pack.TransmissionPacked;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.wakeup.module.device.work.BleFailStage;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* compiled from: Protocol.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010-\u001a\u00020.H&J\u0012\u0010/\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101H&J\u0012\u00102\u001a\u00020.2\b\u00100\u001a\u0004\u0018\u000101H&J\u0012\u00103\u001a\u00020.2\b\u00104\u001a\u0004\u0018\u000105H&J\b\u00106\u001a\u00020.H&J\b\u00107\u001a\u00020.H&J\b\u00108\u001a\u00020.H&J\b\u00109\u001a\u00020.H&J\b\u0010:\u001a\u00020.H&J\n\u0010;\u001a\u0004\u0018\u00010\u0004H&J\n\u0010<\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010=\u001a\u00020>H&J\b\u0010?\u001a\u00020.H&J\u001c\u0010@\u001a\u00020.2\b\u0010A\u001a\u0004\u0018\u00010\"2\b\u0010B\u001a\u0004\u0018\u00010CH&J\u001c\u0010D\u001a\u00020.2\b\u0010A\u001a\u0004\u0018\u00010\"2\b\u0010B\u001a\u0004\u0018\u00010CH&J\u0010\u0010E\u001a\u00020.2\u0006\u0010F\u001a\u00020\bH&J\u0012\u0010G\u001a\u00020.2\b\u0010H\u001a\u0004\u0018\u00010IH&J\b\u0010F\u001a\u00020.H&R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\bX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\u0015R\u001a\u0010\u0019\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\n\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0004X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0006\"\u0004\b\u001f\u0010\u0015R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\"0!X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\n\"\u0004\b)\u0010\u001cR\u001a\u0010*\u001a\u00020\bX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\n\"\u0004\b,\u0010\u001c¨\u0006J"}, d2 = {"Lcom/beken/iot/smartsdk/core/connect/Protocol;", "", "()V", "DOORBELL_TCP_SERVICE_NAME", "", "getDOORBELL_TCP_SERVICE_NAME", "()Ljava/lang/String;", "DOORBELL_TCP_SERVICE_TYPE", "", "getDOORBELL_TCP_SERVICE_TYPE", "()I", "DOORBELL_UDP_SERVICE_NAME", "getDOORBELL_UDP_SERVICE_NAME", "DOORBELL_UDP_SERVICE_TYPE", "getDOORBELL_UDP_SERVICE_TYPE", "DOORBELL_UNKNOWN_SERVICE_TYPE", "getDOORBELL_UNKNOWN_SERVICE_TYPE", "TAG", IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, "getIp", "setIp", "(Ljava/lang/String;)V", BodyData.TYPE_JSON, "getJson", "setJson", "port", "getPort", "setPort", "(I)V", "service", "getService", "setService", "serviceStateChangedMap", "", "Lcom/beken/iot/smartsdk/core/callback/OnStateChanged;", "getServiceStateChangedMap", "()Ljava/util/Map;", "setServiceStateChangedMap", "(Ljava/util/Map;)V", "state", "getState", "setState", "type", "getType", "setType", "activeService", "", "audioChannelSend", "packed", "Lcom/beken/iot/smartsdk/core/pack/TransmissionPacked;", "cameraChannelSend", "cmdChannelSend", "commandTransferConst", "Lcom/beken/iot/smartsdk/core/pack/CommandTransferConst;", "cmdTxTest", BleFailStage.CONNECT, "deregisterAudioChannel", "deregisterCameraChannel", "disconnect", "getNetworkInfo", "getStateText", "isSupportedKeepAlive", "", "peripheralDevicesDiscovery", "registerAudioChannel", "onStateChanged", "onTransmissionReceiver", "Lcom/beken/iot/smartsdk/core/callback/OnTransmissionReceiver;", "registerCameraChannel", "setKeepAlive", "timeout", "setOnNotifyReceiver", "onNotifyReceiver", "Lcom/beken/iot/smartsdk/core/callback/OnNotifyReceiver;", "iotsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Protocol {
    private int port;
    private int state;
    private final String DOORBELL_UDP_SERVICE_NAME = "doorbell-udp";
    private final String DOORBELL_TCP_SERVICE_NAME = "doorbell-tcp";
    private final int DOORBELL_UDP_SERVICE_TYPE = 1;
    private final int DOORBELL_TCP_SERVICE_TYPE = 2;
    private final String TAG = "BaseMediaService";
    private String service = "Unknown";
    private String ip = "";
    private String json = "";
    private final int DOORBELL_UNKNOWN_SERVICE_TYPE;
    private int type = this.DOORBELL_UNKNOWN_SERVICE_TYPE;
    private Map<String, OnStateChanged> serviceStateChangedMap = new HashMap();

    public abstract void activeService();

    public abstract void audioChannelSend(TransmissionPacked packed);

    public abstract void cameraChannelSend(TransmissionPacked packed);

    public abstract void cmdChannelSend(CommandTransferConst commandTransferConst);

    public abstract void cmdTxTest();

    public abstract void connect();

    public abstract void deregisterAudioChannel();

    public abstract void deregisterCameraChannel();

    public abstract void disconnect();

    public abstract String getNetworkInfo();

    public abstract boolean isSupportedKeepAlive();

    public abstract void peripheralDevicesDiscovery();

    public abstract void registerAudioChannel(OnStateChanged onStateChanged, OnTransmissionReceiver onTransmissionReceiver);

    public abstract void registerCameraChannel(OnStateChanged onStateChanged, OnTransmissionReceiver onTransmissionReceiver);

    public abstract void setKeepAlive(int timeout);

    public abstract void setOnNotifyReceiver(OnNotifyReceiver onNotifyReceiver);

    public abstract void timeout();

    public final String getDOORBELL_UDP_SERVICE_NAME() {
        return this.DOORBELL_UDP_SERVICE_NAME;
    }

    public final String getDOORBELL_TCP_SERVICE_NAME() {
        return this.DOORBELL_TCP_SERVICE_NAME;
    }

    public final int getDOORBELL_UNKNOWN_SERVICE_TYPE() {
        return this.DOORBELL_UNKNOWN_SERVICE_TYPE;
    }

    public final int getDOORBELL_UDP_SERVICE_TYPE() {
        return this.DOORBELL_UDP_SERVICE_TYPE;
    }

    public final int getDOORBELL_TCP_SERVICE_TYPE() {
        return this.DOORBELL_TCP_SERVICE_TYPE;
    }

    protected final String getService() {
        return this.service;
    }

    protected final void setService(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.service = str;
    }

    protected final int getPort() {
        return this.port;
    }

    protected final void setPort(int i) {
        this.port = i;
    }

    public final String getIp() {
        return this.ip;
    }

    public final void setIp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.ip = str;
    }

    protected final String getJson() {
        return this.json;
    }

    protected final void setJson(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.json = str;
    }

    protected final int getState() {
        return this.state;
    }

    protected final void setState(int i) {
        this.state = i;
    }

    protected final int getType() {
        return this.type;
    }

    protected final void setType(int i) {
        this.type = i;
    }

    protected final Map<String, OnStateChanged> getServiceStateChangedMap() {
        return this.serviceStateChangedMap;
    }

    protected final void setServiceStateChangedMap(Map<String, OnStateChanged> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.serviceStateChangedMap = map;
    }

    public String getStateText() {
        int i = this.state;
        if (i == 0) {
            return NetworkUtil.NETWORK_CLASS_DISCONNECTED;
        }
        if (i == 1) {
            return "connecting";
        }
        if (i == 2) {
            return AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED;
        }
        if (i == 3) {
            return "disconnecting";
        }
        return "unknown";
    }
}
