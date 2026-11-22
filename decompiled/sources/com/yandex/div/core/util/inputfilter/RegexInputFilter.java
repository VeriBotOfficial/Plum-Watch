package com.yandex.div.core.util.inputfilter;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: RegexInputFilter.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0003H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/yandex/div/core/util/inputfilter/RegexInputFilter;", "Lcom/yandex/div/core/util/inputfilter/BaseInputFilter;", "pattern", "", "(Ljava/lang/String;)V", "regex", "Lkotlin/text/Regex;", "checkValue", "", "value", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RegexInputFilter implements BaseInputFilter {
    private final Regex regex;

    public RegexInputFilter(String pattern) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.regex = new Regex(pattern);
    }

    @Override // com.yandex.div.core.util.inputfilter.BaseInputFilter
    public boolean checkValue(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.regex.matches(value);
    }
}
