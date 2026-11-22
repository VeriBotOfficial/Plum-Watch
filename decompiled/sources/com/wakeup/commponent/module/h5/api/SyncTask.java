package com.wakeup.commponent.module.h5.api;

import android.gov.nist.core.Separators;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthDashboardDataSyncService.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u001c\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J$\u0010\u0013\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u001e\b\u0002\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR)\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/wakeup/commponent/module/h5/api/SyncTask;", "", "name", "", "desc", NotificationCompat.CATEGORY_CALL, "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getName", "()Ljava/lang/String;", "getDesc", "getCall", "()Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function1;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lcom/wakeup/commponent/module/h5/api/SyncTask;", "equals", "", "other", "hashCode", "", "toString", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* data */ class SyncTask {
    private final Function1<Continuation<? super Unit>, Object> call;
    private final String desc;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SyncTask copy$default(SyncTask syncTask, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = syncTask.name;
        }
        if ((i & 2) != 0) {
            str2 = syncTask.desc;
        }
        if ((i & 4) != 0) {
            function1 = syncTask.call;
        }
        return syncTask.copy(str, str2, function1);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final Function1<Continuation<? super Unit>, Object> component3() {
        return this.call;
    }

    public final SyncTask copy(String name, String desc, Function1<? super Continuation<? super Unit>, ? extends Object> call) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(call, "call");
        return new SyncTask(name, desc, call);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SyncTask)) {
            return false;
        }
        SyncTask syncTask = (SyncTask) other;
        return Intrinsics.areEqual(this.name, syncTask.name) && Intrinsics.areEqual(this.desc, syncTask.desc) && Intrinsics.areEqual(this.call, syncTask.call);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.desc.hashCode()) * 31) + this.call.hashCode();
    }

    public String toString() {
        return "SyncTask(name=" + this.name + ", desc=" + this.desc + ", call=" + this.call + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SyncTask(String name, String desc, Function1<? super Continuation<? super Unit>, ? extends Object> call) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(call, "call");
        this.name = name;
        this.desc = desc;
        this.call = call;
    }

    public final Function1<Continuation<? super Unit>, Object> getCall() {
        return this.call;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getName() {
        return this.name;
    }
}
