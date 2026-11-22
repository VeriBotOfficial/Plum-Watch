package com.wakeup.feature.translate.common;

import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.CollectionUtils;
import com.google.gson.Gson;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.NetworkScheduler;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.network.entity.baidu.BaiduTranslate;
import com.wakeup.common.utils.CryptTools;
import com.wakeup.commponent.module.translate.TextEntity;
import com.wakeup.feature.translate.entity.TalkEntity;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: TranslateHelper.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014J$\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00180\u0014J$\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u0014J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/translate/common/TranslateHelper;", "", "<init>", "()V", "TAG", "", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "handler$delegate", "Lkotlin/Lazy;", "isWorking", "", "talkTranslate", "", "content", "languageCode", "isLeft", "callback", "Lcom/wakeup/common/base/BaseCallback;", "Lcom/wakeup/feature/translate/entity/TalkEntity;", "textTranslate", "context", "Lcom/wakeup/commponent/module/translate/TextEntity;", "startTranslate", "feature-translate_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TranslateHelper {
    private static final String TAG = "TranslateHelper";
    private static boolean isWorking;
    public static final TranslateHelper INSTANCE = new TranslateHelper();

    /* renamed from: handler$delegate, reason: from kotlin metadata */
    private static final Lazy handler = LazyKt.lazy(new Function0() { // from class: com.wakeup.feature.translate.common.TranslateHelper$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Handler handler_delegate$lambda$0;
            handler_delegate$lambda$0 = TranslateHelper.handler_delegate$lambda$0();
            return handler_delegate$lambda$0;
        }
    });

    private TranslateHelper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Handler getHandler() {
        return (Handler) handler.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Handler handler_delegate$lambda$0() {
        return new Handler(Looper.getMainLooper());
    }

    public final void talkTranslate(String content, String languageCode, boolean isLeft, final BaseCallback<TalkEntity> callback) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        LanguageDataMgr languageDataMgr = LanguageDataMgr.INSTANCE;
        final TalkEntity talkEntity = new TalkEntity(System.currentTimeMillis() / 1000, content, isLeft, (isLeft ? languageDataMgr.getHomeRight() : languageDataMgr.getHomeLeft()).getLanguageCode());
        getHandler().post(new Runnable() { // from class: com.wakeup.feature.translate.common.TranslateHelper$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                BaseCallback.this.callback(0, talkEntity);
            }
        });
        startTranslate(content, languageCode, new TranslateHelper$talkTranslate$2(talkEntity, callback));
    }

    public final void textTranslate(String context, String languageCode, final BaseCallback<TextEntity> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final TextEntity textEntity = new TextEntity(System.currentTimeMillis() / 1000, context, LanguageDataMgr.INSTANCE.getTextRight().getLanguageCode());
        getHandler().post(new Runnable() { // from class: com.wakeup.feature.translate.common.TranslateHelper$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                BaseCallback.this.callback(0, textEntity);
            }
        });
        startTranslate(context, languageCode, new TranslateHelper$textTranslate$2(textEntity, callback));
    }

    public final void startTranslate(String context, String languageCode, final BaseCallback<String> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(languageCode, "languageCode");
        Intrinsics.checkNotNullParameter(callback, "callback");
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        String str = "https://fanyi-api.baidu.com/api/trans/vip/translate?" + CryptTools.parseMapToPathParam(MapsKt.mapOf(TuplesKt.to("q", context), TuplesKt.to("from", "auto"), TuplesKt.to("to", languageCode), TuplesKt.to("appid", "20231208001904951"), TuplesKt.to(DOMConstants.ATTR_SALT, valueOf), TuplesKt.to("sign", CryptTools.md5Encrypt("20231208001904951" + context + valueOf + "H8xZggYl__HmfswOznuP"))));
        isWorking = true;
        RetrofitManager.INSTANCE.getInstance().getApiOther().textTranslateBaidu(str).compose(NetworkScheduler.INSTANCE.compose()).subscribe(new Observer<BaiduTranslate>() { // from class: com.wakeup.feature.translate.common.TranslateHelper$startTranslate$1
            @Override // io.reactivex.Observer
            public void onSubscribe(Disposable d) {
                Intrinsics.checkNotNullParameter(d, "d");
            }

            @Override // io.reactivex.Observer
            public void onError(Throwable e) {
                Intrinsics.checkNotNullParameter(e, "e");
                LogUtils.i("TranslateHelper", "textTranslateBaidu onError");
                callback.callback(-1, "-1");
            }

            @Override // io.reactivex.Observer
            public void onComplete() {
                TranslateHelper translateHelper = TranslateHelper.INSTANCE;
                TranslateHelper.isWorking = false;
            }

            @Override // io.reactivex.Observer
            public void onNext(BaiduTranslate t) {
                Intrinsics.checkNotNullParameter(t, "t");
                if (!Intrinsics.areEqual(t.getError_code(), "0")) {
                    callback.callback(-1, "-1");
                } else {
                    if (CollectionUtils.isEmpty(t.getTrans_result())) {
                        callback.callback(-1, "-1");
                        return;
                    }
                    LogUtils.i("TranslateHelper", "startTranslate onSuccess: " + new Gson().toJson(t));
                    callback.callback(1, t.getTrans_result().get(0).getDst());
                }
            }
        });
    }

    public final boolean isWorking() {
        return isWorking;
    }
}
