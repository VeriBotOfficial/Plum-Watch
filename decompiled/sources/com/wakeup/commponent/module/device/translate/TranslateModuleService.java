package com.wakeup.commponent.module.device.translate;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commponent.module.translate.TextEntity;
import kotlin.Metadata;

/* compiled from: TranslateModuleService.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J&\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH&J&\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/wakeup/commponent/module/device/translate/TranslateModuleService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "textTranslate", "", "context", "", "languageCode", "callback", "Lcom/wakeup/common/base/BaseCallback;", "Lcom/wakeup/commponent/module/translate/TextEntity;", "startTranslate", "isWorking", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface TranslateModuleService extends IProvider {
    boolean isWorking();

    void startTranslate(String context, String languageCode, BaseCallback<String> callback);

    void textTranslate(String context, String languageCode, BaseCallback<TextEntity> callback);
}
