package com.wakeup.commponent.module.pay;

import com.amap.api.services.core.AMapException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.opencv.core.Core;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PayResultEnum.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/wakeup/commponent/module/pay/PayResultEnum;", "", "code", "", "errMsg", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getErrMsg", "()Ljava/lang/String;", "P_SUCCESS", "P_FAIL", "P_CANCEL", "P_FAIL_GENERATE_ORDERS", "P_FAIL_SYNC_ORDERS", "P_FAIL_UNKNOWN_MISTAKE", "P_ALI_SUCCESS", "P_ALI_VERIFY", "P_ALI_CANCEL", "P_ALI_NET_ERROR", "P_ALI_REPEAT", "P_PAYPAL_VERIFY", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PayResultEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PayResultEnum[] $VALUES;
    private final int code;
    private final String errMsg;
    public static final PayResultEnum P_SUCCESS = new PayResultEnum("P_SUCCESS", 0, 200, "支付成功");
    public static final PayResultEnum P_FAIL = new PayResultEnum("P_FAIL", 1, -201, "支付失败");
    public static final PayResultEnum P_CANCEL = new PayResultEnum("P_CANCEL", 2, -202, "支付取消");
    public static final PayResultEnum P_FAIL_GENERATE_ORDERS = new PayResultEnum("P_FAIL_GENERATE_ORDERS", 3, -203, "创建订单后台接口异常");
    public static final PayResultEnum P_FAIL_SYNC_ORDERS = new PayResultEnum("P_FAIL_SYNC_ORDERS", 4, Core.StsObjectNotFound, "同步订单后台接口异常");
    public static final PayResultEnum P_FAIL_UNKNOWN_MISTAKE = new PayResultEnum("P_FAIL_UNKNOWN_MISTAKE", 5, Core.StsUnmatchedFormats, AMapException.AMAP_CLIENT_UNKNOWN_ERROR);
    public static final PayResultEnum P_ALI_SUCCESS = new PayResultEnum("P_ALI_SUCCESS", 6, 9000, "阿里支付-支付成功");
    public static final PayResultEnum P_ALI_VERIFY = new PayResultEnum("P_ALI_VERIFY", 7, 8000, "阿里支付-支付结果确认中");
    public static final PayResultEnum P_ALI_CANCEL = new PayResultEnum("P_ALI_CANCEL", 8, 6001, "阿里支付-用户取消");
    public static final PayResultEnum P_ALI_NET_ERROR = new PayResultEnum("P_ALI_NET_ERROR", 9, 6002, "阿里支付-网络异常");
    public static final PayResultEnum P_ALI_REPEAT = new PayResultEnum("P_ALI_REPEAT", 10, 5000, "阿里支付-重复请求");
    public static final PayResultEnum P_PAYPAL_VERIFY = new PayResultEnum("P_PAYPAL_VERIFY", 11, 301, "PayPal支付-支付结果确认中");

    private static final /* synthetic */ PayResultEnum[] $values() {
        return new PayResultEnum[]{P_SUCCESS, P_FAIL, P_CANCEL, P_FAIL_GENERATE_ORDERS, P_FAIL_SYNC_ORDERS, P_FAIL_UNKNOWN_MISTAKE, P_ALI_SUCCESS, P_ALI_VERIFY, P_ALI_CANCEL, P_ALI_NET_ERROR, P_ALI_REPEAT, P_PAYPAL_VERIFY};
    }

    public static EnumEntries<PayResultEnum> getEntries() {
        return $ENTRIES;
    }

    private PayResultEnum(String str, int i, int i2, String str2) {
        this.code = i2;
        this.errMsg = str2;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getErrMsg() {
        return this.errMsg;
    }

    static {
        PayResultEnum[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PayResultEnum valueOf(String str) {
        return (PayResultEnum) Enum.valueOf(PayResultEnum.class, str);
    }

    public static PayResultEnum[] values() {
        return (PayResultEnum[]) $VALUES.clone();
    }
}
