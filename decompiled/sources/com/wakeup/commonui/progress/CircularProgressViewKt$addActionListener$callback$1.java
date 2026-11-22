package com.wakeup.commonui.progress;

import com.wakeup.commonui.progress.CircularProgressView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: CircularProgressView.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/wakeup/commonui/progress/CircularProgressViewKt$addActionListener$callback$1", "Lcom/wakeup/commonui/progress/CircularProgressView$CircularProgressViewActionCallback;", "onProgressChanged", "", "progress", "", "onAnimationFinished", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes2.dex */
public final class CircularProgressViewKt$addActionListener$callback$1 implements CircularProgressView.CircularProgressViewActionCallback {
    final /* synthetic */ Function1<Float, Unit> $onAnimationFinished;
    final /* synthetic */ Function1<Float, Unit> $onProgressChanged;

    /* JADX WARN: Multi-variable type inference failed */
    public CircularProgressViewKt$addActionListener$callback$1(Function1<? super Float, Unit> function1, Function1<? super Float, Unit> function12) {
        this.$onProgressChanged = function1;
        this.$onAnimationFinished = function12;
    }

    @Override // com.wakeup.commonui.progress.CircularProgressView.CircularProgressViewActionCallback
    public void onProgressChanged(float progress) {
        this.$onProgressChanged.invoke(Float.valueOf(progress));
    }

    @Override // com.wakeup.commonui.progress.CircularProgressView.CircularProgressViewActionCallback
    public void onAnimationFinished(float progress) {
        this.$onAnimationFinished.invoke(Float.valueOf(progress));
    }
}
