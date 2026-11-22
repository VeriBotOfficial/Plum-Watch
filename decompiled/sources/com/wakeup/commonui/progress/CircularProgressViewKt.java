package com.wakeup.commonui.progress;

import com.wakeup.commonui.progress.CircularProgressView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CircularProgressView.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001aZ\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"addActionListener", "Lcom/wakeup/commonui/progress/CircularProgressView$CircularProgressViewActionCallback;", "Lcom/wakeup/commonui/progress/CircularProgressView;", "onProgressChanged", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "progress", "", "onAnimationFinished", "commonui_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CircularProgressViewKt {
    public static /* synthetic */ CircularProgressView.CircularProgressViewActionCallback addActionListener$default(CircularProgressView circularProgressView, Function1 onProgressChanged, Function1 onAnimationFinished, int i, Object obj) {
        if ((i & 1) != 0) {
            onProgressChanged = new Function1<Float, Unit>() { // from class: com.wakeup.commonui.progress.CircularProgressViewKt$addActionListener$1
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            };
        }
        if ((i & 2) != 0) {
            onAnimationFinished = new Function1<Float, Unit>() { // from class: com.wakeup.commonui.progress.CircularProgressViewKt$addActionListener$2
                public final void invoke(float f) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Float f) {
                    invoke(f.floatValue());
                    return Unit.INSTANCE;
                }
            };
        }
        Intrinsics.checkNotNullParameter(circularProgressView, "<this>");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        Intrinsics.checkNotNullParameter(onAnimationFinished, "onAnimationFinished");
        CircularProgressViewKt$addActionListener$callback$1 circularProgressViewKt$addActionListener$callback$1 = new CircularProgressViewKt$addActionListener$callback$1(onProgressChanged, onAnimationFinished);
        circularProgressView.setActionCallback(circularProgressViewKt$addActionListener$callback$1);
        return circularProgressViewKt$addActionListener$callback$1;
    }

    public static final CircularProgressView.CircularProgressViewActionCallback addActionListener(CircularProgressView circularProgressView, Function1<? super Float, Unit> onProgressChanged, Function1<? super Float, Unit> onAnimationFinished) {
        Intrinsics.checkNotNullParameter(circularProgressView, "<this>");
        Intrinsics.checkNotNullParameter(onProgressChanged, "onProgressChanged");
        Intrinsics.checkNotNullParameter(onAnimationFinished, "onAnimationFinished");
        CircularProgressViewKt$addActionListener$callback$1 circularProgressViewKt$addActionListener$callback$1 = new CircularProgressViewKt$addActionListener$callback$1(onProgressChanged, onAnimationFinished);
        circularProgressView.setActionCallback(circularProgressViewKt$addActionListener$callback$1);
        return circularProgressViewKt$addActionListener$callback$1;
    }
}
