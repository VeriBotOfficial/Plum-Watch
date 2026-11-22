package com.wakeup.feature.translate.common;

import android.os.Handler;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.commponent.module.translate.TextEntity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TranslateHelper.kt */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"com/wakeup/feature/translate/common/TranslateHelper$textTranslate$2", "Lcom/wakeup/common/base/BaseCallback;", "", "callback", "", "code", "", "str", "feature-translate_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateHelper$textTranslate$2 extends BaseCallback<String> {
    final /* synthetic */ BaseCallback<TextEntity> $callback;
    final /* synthetic */ TextEntity $entity;

    TranslateHelper$textTranslate$2(TextEntity textEntity, BaseCallback<TextEntity> baseCallback) {
        this.$entity = textEntity;
        this.$callback = baseCallback;
    }

    @Override // com.wakeup.common.base.BaseCallback
    public void callback(final int code, String str) {
        Handler handler;
        Intrinsics.checkNotNullParameter(str, "str");
        this.$entity.setAfterStr(str);
        handler = TranslateHelper.INSTANCE.getHandler();
        final BaseCallback<TextEntity> baseCallback = this.$callback;
        final TextEntity textEntity = this.$entity;
        handler.post(new Runnable() { // from class: com.wakeup.feature.translate.common.TranslateHelper$textTranslate$2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseCallback.this.callback(code, textEntity);
            }
        });
    }
}
