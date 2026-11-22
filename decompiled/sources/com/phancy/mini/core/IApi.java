package com.phancy.mini.core;

import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.phancy.mini.core.api.Event;
import kotlin.Metadata;

/* compiled from: IApi.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦\u0002J!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH¦\u0002J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\r"}, d2 = {"Lcom/phancy/mini/core/IApi;", "Lcom/phancy/mini/core/ILifecycle;", "invoke", "", "event", "Lcom/phancy/mini/core/api/Event;", RemoteMessageConst.MessageBody.PARAM, "Lcom/alibaba/fastjson/JSONObject;", "callback", "Lcom/phancy/mini/core/IApiCallback;", "", "shouldInterceptEvent", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface IApi extends ILifecycle {
    void invoke(Event event, JSONObject param, IApiCallback callback);

    void invoke(String event, JSONObject param, IApiCallback callback);

    boolean shouldInterceptEvent(Event event, JSONObject param, IApiCallback callback);
}
