package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public final class B7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C3690y7 f17781a;

    /* JADX WARN: Multi-variable type inference failed */
    public B7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ContentValues fromModel(A7 a7) {
        ContentValues contentValues = new ContentValues();
        Long l = a7.f17763a;
        if (l != null) {
            contentValues.put("id", Long.valueOf(l.longValue()));
        }
        EnumC3728zk enumC3728zk = a7.b;
        if (enumC3728zk != null) {
            contentValues.put("type", Integer.valueOf(enumC3728zk.f18617a));
        }
        String str = a7.c;
        if (str != null) {
            contentValues.put("report_request_parameters", str);
        }
        C3690y7 c3690y7 = this.f17781a;
        contentValues.put("session_description", MessageNano.toByteArray(c3690y7.f18590a.fromModel(a7.d)));
        return contentValues;
    }

    public B7(C3690y7 c3690y7) {
        this.f17781a = c3690y7;
    }

    public /* synthetic */ B7(C3690y7 c3690y7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C3690y7(null, 1, null) : c3690y7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final A7 toModel(ContentValues contentValues) {
        EnumC3728zk enumC3728zk;
        int intValue;
        Long asLong = contentValues.getAsLong("id");
        Integer asInteger = contentValues.getAsInteger("type");
        if (asInteger != null) {
            Integer valueOf = Integer.valueOf(asInteger.intValue());
            enumC3728zk = EnumC3728zk.FOREGROUND;
            if (valueOf != null && (intValue = valueOf.intValue()) != 0 && intValue == 1) {
                enumC3728zk = EnumC3728zk.BACKGROUND;
            }
        } else {
            enumC3728zk = null;
        }
        return new A7(asLong, enumC3728zk, contentValues.getAsString("report_request_parameters"), this.f17781a.toModel(contentValues.getAsByteArray("session_description")));
    }
}
