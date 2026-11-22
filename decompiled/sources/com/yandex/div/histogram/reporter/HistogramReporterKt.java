package com.yandex.div.histogram.reporter;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: HistogramReporter.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u000328\u0010\u0005\u001a4\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0015\u0012\u0013\u0018\u00010\u0003¢\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0006H\u0082\b¨\u0006\u000b"}, d2 = {"withComponentHistogram", "", "baseHistogramName", "", "componentName", "block", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "histogram", "component", "div-histogram_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HistogramReporterKt {
    private static final void withComponentHistogram(String str, String str2, Function2<? super String, ? super String, Unit> function2) {
        function2.invoke(str, null);
        if (str2 != null) {
            function2.invoke(str2 + '.' + str, str2);
        }
    }
}
