package com.xmly.businesssdk.network.bean;

import com.anythink.core.express.b.a;
import com.xmly.businesssdk.network.bean.Res;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Res.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\"!\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0019\u0010\u0005\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"#\u0010\t\u001a\u0004\u0018\u00010\n\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0019\u0010\r\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\b\"\u0019\u0010\u000f\u001a\u00020\u0006*\u0006\u0012\u0002\b\u00030\u00028F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"data", "T", "Lcom/xmly/businesssdk/network/bean/Res;", "getData", "(Lcom/xmly/businesssdk/network/bean/Res;)Ljava/lang/Object;", "error", "", "getError", "(Lcom/xmly/businesssdk/network/bean/Res;)Z", "errorMsg", "", "getErrorMsg", "(Lcom/xmly/businesssdk/network/bean/Res;)Ljava/lang/String;", a.e, "getLoading", "succeeded", "getSucceeded", "business-sdk_wakeRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class ResKt {
    public static final <T> T getData(Res<? extends T> res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return (T) ((Res.Success) res).getData();
    }

    public static final boolean getError(Res<?> res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return res instanceof Res.Error;
    }

    public static final <T> String getErrorMsg(Res<? extends T> res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return ((Res.Error) res).getThrowable().getMessage();
    }

    public static final boolean getLoading(Res<?> res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return res instanceof Res.Loading;
    }

    public static final boolean getSucceeded(Res<?> res) {
        Intrinsics.checkNotNullParameter(res, "<this>");
        return (res instanceof Res.Success) && ((Res.Success) res).getData() != null;
    }
}
