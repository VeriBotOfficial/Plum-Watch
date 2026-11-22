package com.wakeup.commponent.module.device;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.commponent.module.device.headset.HeadsetEQ;
import kotlin.Metadata;
import kotlin.Pair;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: HeadsetService.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0005H&J\u001c\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u000f2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J \u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0007H&J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\nH&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0007H&J\b\u0010\u001c\u001a\u00020\u0003H&¨\u0006\u001d"}, d2 = {"Lcom/wakeup/commponent/module/device/HeadsetService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "connectDevice", "", "mac", "", "productId", "", "disconnectDevice", "isConnected", "", "setPageFlag", "pageFlag", "getCurrentConnectMac", "getBattery", "Lkotlin/Pair;", "findDevice", "isOpen", "sendEQSettings", "eq", "Lcom/wakeup/commponent/module/device/headset/HeadsetEQ;", "sendKeySettings", "isLeft", "type", "function", "sendAutoAnswerSwitch", "setANC", DOMConstants.ATTR_MODE, "sendReset", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HeadsetService extends IProvider {
    void connectDevice(String mac);

    void connectDevice(String mac, int productId);

    void disconnectDevice(String mac);

    void findDevice(boolean isOpen);

    Pair<Integer, Integer> getBattery(String mac);

    String getCurrentConnectMac();

    boolean isConnected(String mac);

    void sendAutoAnswerSwitch(boolean isOpen);

    void sendEQSettings(HeadsetEQ eq);

    void sendKeySettings(boolean isLeft, int type, int function);

    void sendReset();

    void setANC(int mode);

    void setPageFlag(int pageFlag);
}
