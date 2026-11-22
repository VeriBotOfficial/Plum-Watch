package com.wakeup.common.utils;

import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CrossMediaPause.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000e\u001a\u00020\r2!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\tJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R/\u0010\u0007\u001a#\u0012\u001f\u0012\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/common/utils/CrossMediaPause;", "", "<init>", "()V", "OWNER_AI_MUSIC", "", "OWNER_NEWS_DAILY", "pausers", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "exceptOwner", "", MiPushClient.COMMAND_REGISTER, "pauser", "requestPlay", "owner", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CrossMediaPause {
    public static final String OWNER_AI_MUSIC = "aimusic";
    public static final String OWNER_NEWS_DAILY = "newsdaily";
    public static final CrossMediaPause INSTANCE = new CrossMediaPause();
    private static final CopyOnWriteArrayList<Function1<String, Unit>> pausers = new CopyOnWriteArrayList<>();

    private CrossMediaPause() {
    }

    public final void register(Function1<? super String, Unit> pauser) {
        Intrinsics.checkNotNullParameter(pauser, "pauser");
        CopyOnWriteArrayList<Function1<String, Unit>> copyOnWriteArrayList = pausers;
        if (copyOnWriteArrayList.contains(pauser)) {
            return;
        }
        copyOnWriteArrayList.add(pauser);
    }

    public final void requestPlay(String owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        Iterator<T> it = pausers.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(owner);
                Result.m14057constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
