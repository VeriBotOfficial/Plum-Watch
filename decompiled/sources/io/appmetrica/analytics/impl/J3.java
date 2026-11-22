package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class J3 implements L5 {
    @Override // kotlin.jvm.functions.Function1
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Map<String, String> invoke(ContentValues contentValues) {
        String asString = contentValues.getAsString("clids");
        HashMap c = AbstractC3395mb.c(asString);
        if (AbstractC3306im.a(c)) {
            return c;
        }
        Vi.a("Passed clids (" + asString + ") are invalid.", new Object[0]);
        return null;
    }
}
