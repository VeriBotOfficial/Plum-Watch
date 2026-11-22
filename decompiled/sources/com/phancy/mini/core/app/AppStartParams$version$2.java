package com.phancy.mini.core.app;

import android.net.Uri;
import com.phancy.mini.utils.LazyValue;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: AppStartParams.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/phancy/mini/utils/LazyValue;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class AppStartParams$version$2 extends Lambda implements Function0<LazyValue<String>> {
    final /* synthetic */ AppStartParams this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AppStartParams$version$2(AppStartParams appStartParams) {
        super(0);
        this.this$0 = appStartParams;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final LazyValue<String> invoke() {
        final AppStartParams appStartParams = this.this$0;
        return new LazyValue<>("", new Callable() { // from class: com.phancy.mini.core.app.AppStartParams$version$2$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String invoke$lambda$1;
                invoke$lambda$1 = AppStartParams$version$2.invoke$lambda$1(AppStartParams.this);
                return invoke$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String invoke$lambda$1(AppStartParams this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Uri startData = this$0.getStartData();
        if (startData != null) {
            return AppStartParams.INSTANCE.getVersion(startData);
        }
        return null;
    }
}
