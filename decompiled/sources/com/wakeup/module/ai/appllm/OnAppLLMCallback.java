package com.wakeup.module.ai.appllm;

import com.wakeup.common.Constants;
import com.wakeup.module.ai.appllm.bean.AppLLMChatBean;
import kotlin.Metadata;

/* compiled from: OnAppLLMCallback.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/ai/appllm/OnAppLLMCallback;", "", "onAsrUpdate", "", "text", "", "onUpdate", "onAdd", Constants.BundleKey.BEAN, "Lcom/wakeup/module/ai/appllm/bean/AppLLMChatBean;", "onPlayChange", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface OnAppLLMCallback {
    void onAdd(AppLLMChatBean bean);

    void onAsrUpdate(String text);

    void onPlayChange();

    void onUpdate(String text);
}
