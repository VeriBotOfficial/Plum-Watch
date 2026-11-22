package com.wakeup.common.network.entity.baidu;

import com.baidu.mapapi.SDKInitializer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduTranslate.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/BaiduTranslate;", "", "<init>", "()V", SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, "", "getError_code", "()Ljava/lang/String;", "setError_code", "(Ljava/lang/String;)V", "error_msg", "getError_msg", "from", "getFrom", "to", "getTo", "trans_result", "", "Lcom/wakeup/common/network/entity/baidu/BaiduText;", "getTrans_result", "()Ljava/util/List;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BaiduTranslate {
    private String error_code = "0";
    private final String error_msg = "";
    private final String from = "";
    private final String to = "";
    private final List<BaiduText> trans_result = CollectionsKt.emptyList();

    public final String getError_code() {
        return this.error_code;
    }

    public final void setError_code(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.error_code = str;
    }

    public final String getError_msg() {
        return this.error_msg;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getTo() {
        return this.to;
    }

    public final List<BaiduText> getTrans_result() {
        return this.trans_result;
    }
}
