package com.wakeup.feature.translate;

import android.content.Context;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.module.device.translate.TranslateModuleService;
import com.wakeup.commponent.module.translate.TextEntity;
import com.wakeup.feature.translate.common.TranslateHelper;
import com.wakeup.feature.translate.order.TranslateAnalyzer;
import com.wakeup.feature.translate.utils.TranslateDeviceHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslateModuleServiceImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J&\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J&\u0010\u0011\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/translate/TranslateModuleServiceImpl;", "Lcom/wakeup/commponent/module/device/translate/TranslateModuleService;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "init", "", "context", "Landroid/content/Context;", "textTranslate", "languageCode", "callback", "Lcom/wakeup/common/base/BaseCallback;", "Lcom/wakeup/commponent/module/translate/TextEntity;", "startTranslate", "isWorking", "", "feature-translate_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateModuleServiceImpl implements TranslateModuleService {
    private final String TAG = "TranslateModuleServiceImpl";

    public final String getTAG() {
        return this.TAG;
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        LogUtils.i(this.TAG, "init");
        ServiceManager.getDeviceService().addAnalyzer(new TranslateAnalyzer());
        TranslateDeviceHelper.INSTANCE.init();
    }

    @Override // com.wakeup.commponent.module.device.translate.TranslateModuleService
    public void textTranslate(String context, String languageCode, BaseCallback<TextEntity> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TranslateHelper.INSTANCE.textTranslate(context, languageCode, callback);
    }

    @Override // com.wakeup.commponent.module.device.translate.TranslateModuleService
    public void startTranslate(String context, String languageCode, BaseCallback<String> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        TranslateHelper.INSTANCE.startTranslate(context, languageCode, callback);
    }

    @Override // com.wakeup.commponent.module.device.translate.TranslateModuleService
    public boolean isWorking() {
        return TranslateHelper.INSTANCE.isWorking();
    }
}
