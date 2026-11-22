package com.yandex.div.core.dagger;

import com.yandex.div.histogram.reporter.HistogramReporter;
import javax.inject.Provider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DivKitHistogramsModule.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
/* synthetic */ class DivKitHistogramsModule$provideDivParsingHistogramReporter$1 extends FunctionReferenceImpl implements Function0<HistogramReporter> {
    DivKitHistogramsModule$provideDivParsingHistogramReporter$1(Object obj) {
        super(0, obj, Provider.class, "get", "get()Ljava/lang/Object;", 0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final HistogramReporter invoke() {
        return (HistogramReporter) ((Provider) this.receiver).get();
    }
}
