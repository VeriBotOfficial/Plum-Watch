package com.yandex.android.beacon;

import android.content.Context;
import com.yandex.android.beacon.SendBeaconDb;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SendBeaconDb.kt */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
/* synthetic */ class SendBeaconDb$Companion$factory$1 implements SendBeaconDb.Factory, FunctionAdapter {
    public static final SendBeaconDb$Companion$factory$1 INSTANCE = new SendBeaconDb$Companion$factory$1();

    SendBeaconDb$Companion$factory$1() {
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof SendBeaconDb.Factory) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(2, SendBeaconDb.class, "<init>", "<init>(Landroid/content/Context;Ljava/lang/String;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // com.yandex.android.beacon.SendBeaconDb.Factory
    public final SendBeaconDb create(Context p0, String p1) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        return new SendBeaconDb(p0, p1);
    }
}
