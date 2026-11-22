package com.wakeup.module.device.whatsapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.temp.BleUtil;
import com.wakeup.commponent.module.device.BleOrderAnalyzer;
import com.wakeup.commponent.module.device.EventType;
import com.wakeup.module.device.work.DeviceEventMgr;
import io.nats.client.support.ApiConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: WhatsAppAnalyzer.kt */
@Metadata(d1 = {"\u0000=\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\b\u0003*\u0001\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u001e\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/device/whatsapp/WhatsAppAnalyzer;", "Lcom/wakeup/commponent/module/device/BleOrderAnalyzer;", "<init>", "()V", "TAG", "", "QR_WHAT", "", "CANCAL_LOGIN_WAHT", "AVATAR_WHAT", "LOGOUT_WHAT", "LOGIN_STATE", "WHAT_DELAY_TIME", "", "mHandler", "com/wakeup/module/device/whatsapp/WhatsAppAnalyzer$mHandler$1", "Lcom/wakeup/module/device/whatsapp/WhatsAppAnalyzer$mHandler$1;", "analyzeOrder", "", "mac", ApiConstants.BYTES, "", "datas", "", "deviceWechatReplyState", "handleWsMsg", "module-device_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WhatsAppAnalyzer implements BleOrderAnalyzer {
    private final WhatsAppAnalyzer$mHandler$1 mHandler;
    private final String TAG = "WhatsAppAnalyzer";
    private final int QR_WHAT = 1001;
    private final int CANCAL_LOGIN_WAHT = 1002;
    private final int AVATAR_WHAT = 1003;
    private final int LOGOUT_WHAT = 1004;
    private final int LOGIN_STATE = 1005;
    private final long WHAT_DELAY_TIME = 500;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.wakeup.module.device.whatsapp.WhatsAppAnalyzer$mHandler$1] */
    public WhatsAppAnalyzer() {
        final Looper mainLooper = Looper.getMainLooper();
        this.mHandler = new Handler(mainLooper) { // from class: com.wakeup.module.device.whatsapp.WhatsAppAnalyzer$mHandler$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                int i;
                int i2;
                int i3;
                int i4;
                int i5;
                Intrinsics.checkNotNullParameter(msg, "msg");
                super.handleMessage(msg);
                int i6 = msg.what;
                i = WhatsAppAnalyzer.this.QR_WHAT;
                if (i6 == i) {
                    DeviceEventMgr.send(EventType.TYPE_WHATSAPP, 1);
                    return;
                }
                i2 = WhatsAppAnalyzer.this.CANCAL_LOGIN_WAHT;
                if (i6 == i2) {
                    DeviceEventMgr.send(EventType.TYPE_WHATSAPP, 3);
                    return;
                }
                i3 = WhatsAppAnalyzer.this.AVATAR_WHAT;
                if (i6 == i3) {
                    DeviceEventMgr.send(EventType.TYPE_WHATSAPP, 4);
                    return;
                }
                i4 = WhatsAppAnalyzer.this.LOGOUT_WHAT;
                if (i6 == i4) {
                    DeviceEventMgr.send(EventType.TYPE_WHATSAPP, 5);
                    return;
                }
                i5 = WhatsAppAnalyzer.this.LOGIN_STATE;
                if (i6 == i5) {
                    WhatsAppAnalyzer.this.deviceWechatReplyState();
                }
            }
        };
    }

    @Override // com.wakeup.commponent.module.device.BleOrderAnalyzer
    public void analyzeOrder(String mac, byte[] bytes, List<Integer> datas) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(datas, "datas");
        if (datas.size() >= 6 && datas.get(0).intValue() == 234 && datas.get(4).intValue() == 71) {
            int intValue = datas.get(5).intValue();
            if (intValue == 3) {
                Message obtain = Message.obtain();
                obtain.what = this.LOGIN_STATE;
                removeMessages(this.LOGIN_STATE);
                sendMessageDelayed(obtain, this.WHAT_DELAY_TIME);
                return;
            }
            if (intValue == 4) {
                Message obtain2 = Message.obtain();
                obtain2.what = this.QR_WHAT;
                removeMessages(this.QR_WHAT);
                sendMessageDelayed(obtain2, this.WHAT_DELAY_TIME);
                return;
            }
            if (intValue == 6) {
                Message obtain3 = Message.obtain();
                obtain3.what = this.AVATAR_WHAT;
                removeMessages(this.AVATAR_WHAT);
                sendMessageDelayed(obtain3, this.WHAT_DELAY_TIME);
                return;
            }
            if (intValue == 7) {
                Message obtain4 = Message.obtain();
                obtain4.what = this.CANCAL_LOGIN_WAHT;
                removeMessages(this.CANCAL_LOGIN_WAHT);
                sendMessageDelayed(obtain4, this.WHAT_DELAY_TIME);
                return;
            }
            if (intValue == 8) {
                Message obtain5 = Message.obtain();
                obtain5.what = this.LOGOUT_WHAT;
                removeMessages(this.LOGOUT_WHAT);
                sendMessageDelayed(obtain5, this.WHAT_DELAY_TIME);
                return;
            }
            if (intValue != 13) {
                return;
            }
            try {
                handleWsMsg(bytes, datas);
            } catch (Exception e) {
                LogUtils.e(this.TAG, "handleWsMsg error: ", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deviceWechatReplyState() {
        LogUtils.i(this.TAG, "deviceWechatReplyState");
        DeviceEventMgr.send(EventType.TYPE_WHATSAPP, 0);
    }

    private final void handleWsMsg(byte[] bytes, List<Integer> datas) {
        if (bytes.length < 7) {
            LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 wxIdLen");
            return;
        }
        int intValue = datas.get(6).intValue();
        int i = intValue + 7;
        if (bytes.length < i) {
            LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 wxId");
            return;
        }
        byte[] subBytes = BleUtil.subBytes(bytes, 7, intValue);
        Intrinsics.checkNotNullExpressionValue(subBytes, "subBytes(...)");
        String str = new String(subBytes, Charsets.UTF_8);
        if (bytes.length <= i) {
            LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 type");
            return;
        }
        int intValue2 = datas.get(i).intValue();
        int i2 = intValue + 8;
        if (bytes.length <= i2) {
            LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 nameLen");
            return;
        }
        int intValue3 = datas.get(i2).intValue();
        int i3 = intValue + 9;
        int i4 = i3 + intValue3;
        if (bytes.length < i4) {
            LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 name");
            return;
        }
        byte[] subBytes2 = BleUtil.subBytes(bytes, i3, intValue3);
        Intrinsics.checkNotNullExpressionValue(subBytes2, "subBytes(...)");
        String str2 = new String(subBytes2, Charsets.UTF_8);
        Bundle bundle = new Bundle();
        bundle.putString("title", str2);
        bundle.putString("toChatId", str);
        bundle.putInt("msgType", intValue2);
        LogUtils.i(this.TAG, "获取回复内容:  map = " + bundle + " ; ");
        if (intValue2 == 1 || intValue2 == 3) {
            int i5 = i4 + 2;
            if (bytes.length < i5) {
                LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 msgLen");
                return;
            }
            short byte2Short = BleUtil.byte2Short(BleUtil.subBytes(bytes, i4, 2));
            if (bytes.length < i5 + byte2Short) {
                LogUtils.e(this.TAG, "handleWsMsg: bytes 数组长度不足，无法解析 msg, 预期长度: " + ((int) byte2Short) + ", 实际剩余: " + (bytes.length - i5));
                return;
            } else {
                byte[] subBytes3 = BleUtil.subBytes(bytes, i5, byte2Short);
                Intrinsics.checkNotNullExpressionValue(subBytes3, "subBytes(...)");
                String str3 = new String(subBytes3, Charsets.UTF_8);
                LogUtils.i(this.TAG, "handleWsMsg msg: ".concat(str3));
                bundle.putString("content", str3);
            }
        }
        LogUtils.i(this.TAG, "获取回复内容:  map = " + bundle + " ; msgType = " + intValue2);
        DeviceEventMgr.send(EventType.TYPE_WHATSAPP, 2, bundle);
    }
}
