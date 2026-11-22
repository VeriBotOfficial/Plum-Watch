package com.yandex.div.histogram;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: HistogramConfiguration.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 extends FunctionReferenceImpl implements Function0<DefaultTaskExecutor> {
    public static final HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1 INSTANCE = new HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1();

    HistogramConfiguration$DefaultHistogramConfiguration$taskExecutorProvider$1() {
        super(0, DefaultTaskExecutor.class, "<init>", "<init>()V", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final DefaultTaskExecutor invoke() {
        return new DefaultTaskExecutor();
    }
}
