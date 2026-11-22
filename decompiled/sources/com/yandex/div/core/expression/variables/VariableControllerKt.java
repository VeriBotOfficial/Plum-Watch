package com.yandex.div.core.expression.variables;

import android.net.Uri;
import com.yandex.div.evaluable.types.Url;
import kotlin.Metadata;

/* compiled from: VariableController.kt */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u001a\u0010\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0001H\u0000¨\u0006\u0002"}, d2 = {"wrapVariableValue", "", "div_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VariableControllerKt {
    public static final Object wrapVariableValue(Object obj) {
        return obj instanceof Uri ? Url.m12678boximpl(Url.m12679constructorimpl(obj.toString())) : obj;
    }
}
