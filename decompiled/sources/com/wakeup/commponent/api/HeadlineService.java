package com.wakeup.commponent.api;

import android.content.Context;
import android.view.View;
import com.alibaba.android.arouter.facade.template.IProvider;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: HeadlineService.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/wakeup/commponent/api/HeadlineService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "getHomeView", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearHeadlinesNotify", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface HeadlineService extends IProvider {
    void clearHeadlinesNotify();

    Object getHomeView(Context context, Continuation<? super View> continuation);
}
