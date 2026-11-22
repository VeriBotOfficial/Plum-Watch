package com.wakeup.feature.plans.ui;

import android.gov.nist.core.Separators;
import com.iflytek.cloud.SpeechEvent;
import com.phancy.mini.core.api.ApiError;
import com.wakeup.feature.plans.model.PlanMessage;
import com.wakeup.module.device.work.BleConnectErrorMapper;
import com.yandex.div.core.timer.TimerController;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlansTestStreamSession.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0011\u001a\u00020\u000bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0013J \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tJ\u0010\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\nH\u0002R\u0012\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006 "}, d2 = {"Lcom/wakeup/feature/plans/ui/PlansTestStreamSession;", "", "<init>", "()V", SpeechEvent.KEY_EVENT_TTS_BUFFER, "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "listeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lkotlin/Function1;", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update;", "", "value", "", "active", "getActive", "()Z", TimerController.RESET_COMMAND, "currentText", "", "appendDelta", "delta", "complete", "message", "Lcom/wakeup/feature/plans/model/PlanMessage;", ApiError.ERROR_MSG_FAIL, "subscribe", "Lkotlin/Function0;", "listener", BleConnectErrorMapper.CODE_NOTIFY, "update", "Update", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PlansTestStreamSession {
    private static volatile boolean active;
    public static final PlansTestStreamSession INSTANCE = new PlansTestStreamSession();
    private static final StringBuilder buffer = new StringBuilder();
    private static final CopyOnWriteArrayList<Function1<Update, Unit>> listeners = new CopyOnWriteArrayList<>();

    private PlansTestStreamSession() {
    }

    /* compiled from: PlansTestStreamSession.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update;", "", "<init>", "()V", "Delta", "Done", "Error", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update$Delta;", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update$Done;", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update$Error;", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Update {
        public /* synthetic */ Update(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: PlansTestStreamSession.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update$Delta;", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update;", "fullText", "", "<init>", "(Ljava/lang/String;)V", "getFullText", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Delta extends Update {
            private final String fullText;

            public static /* synthetic */ Delta copy$default(Delta delta, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = delta.fullText;
                }
                return delta.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getFullText() {
                return this.fullText;
            }

            public final Delta copy(String fullText) {
                Intrinsics.checkNotNullParameter(fullText, "fullText");
                return new Delta(fullText);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Delta) && Intrinsics.areEqual(this.fullText, ((Delta) other).fullText);
            }

            public int hashCode() {
                return this.fullText.hashCode();
            }

            public String toString() {
                return "Delta(fullText=" + this.fullText + Separators.RPAREN;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Delta(String fullText) {
                super(null);
                Intrinsics.checkNotNullParameter(fullText, "fullText");
                this.fullText = fullText;
            }

            public final String getFullText() {
                return this.fullText;
            }
        }

        private Update() {
        }

        /* compiled from: PlansTestStreamSession.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update$Done;", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update;", "message", "Lcom/wakeup/feature/plans/model/PlanMessage;", "<init>", "(Lcom/wakeup/feature/plans/model/PlanMessage;)V", "getMessage", "()Lcom/wakeup/feature/plans/model/PlanMessage;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Done extends Update {
            private final PlanMessage message;

            public static /* synthetic */ Done copy$default(Done done, PlanMessage planMessage, int i, Object obj) {
                if ((i & 1) != 0) {
                    planMessage = done.message;
                }
                return done.copy(planMessage);
            }

            /* renamed from: component1, reason: from getter */
            public final PlanMessage getMessage() {
                return this.message;
            }

            public final Done copy(PlanMessage message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Done(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Done) && Intrinsics.areEqual(this.message, ((Done) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Done(message=" + this.message + Separators.RPAREN;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Done(PlanMessage message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final PlanMessage getMessage() {
                return this.message;
            }
        }

        /* compiled from: PlansTestStreamSession.kt */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update$Error;", "Lcom/wakeup/feature/plans/ui/PlansTestStreamSession$Update;", "message", "", "<init>", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-plans_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error extends Update {
            private final String message;

            public static /* synthetic */ Error copy$default(Error error, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = error.message;
                }
                return error.copy(str);
            }

            /* renamed from: component1, reason: from getter */
            public final String getMessage() {
                return this.message;
            }

            public final Error copy(String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                return new Error(message);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.message, ((Error) other).message);
            }

            public int hashCode() {
                return this.message.hashCode();
            }

            public String toString() {
                return "Error(message=" + this.message + Separators.RPAREN;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Error(String message) {
                super(null);
                Intrinsics.checkNotNullParameter(message, "message");
                this.message = message;
            }

            public final String getMessage() {
                return this.message;
            }
        }
    }

    public final boolean getActive() {
        return active;
    }

    public final void reset() {
        StringBuilder sb = buffer;
        synchronized (sb) {
            sb.setLength(0);
            Unit unit = Unit.INSTANCE;
        }
        active = true;
    }

    public final String currentText() {
        String sb;
        StringBuilder sb2 = buffer;
        synchronized (sb2) {
            sb = sb2.toString();
        }
        Intrinsics.checkNotNullExpressionValue(sb, "synchronized(...)");
        return sb;
    }

    public final void appendDelta(String delta) {
        Intrinsics.checkNotNullParameter(delta, "delta");
        StringBuilder sb = buffer;
        synchronized (sb) {
            sb.append(delta);
            PlansTestStreamSession plansTestStreamSession = INSTANCE;
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            plansTestStreamSession.notify(new Update.Delta(sb2));
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void complete(PlanMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        active = false;
        notify(new Update.Done(message));
    }

    public final void fail(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        active = false;
        notify(new Update.Error(message));
    }

    public final Function0<Unit> subscribe(final Function1<? super Update, Unit> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        listeners.add(listener);
        String currentText = currentText();
        if (currentText.length() > 0) {
            listener.invoke(new Update.Delta(currentText));
        }
        return new Function0() { // from class: com.wakeup.feature.plans.ui.PlansTestStreamSession$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit subscribe$lambda$3;
                subscribe$lambda$3 = PlansTestStreamSession.subscribe$lambda$3(Function1.this);
                return subscribe$lambda$3;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit subscribe$lambda$3(Function1 function1) {
        listeners.remove(function1);
        return Unit.INSTANCE;
    }

    private final void notify(Update update) {
        Iterator<T> it = listeners.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            try {
                Result.Companion companion = Result.INSTANCE;
                function1.invoke(update);
                Result.m14057constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m14057constructorimpl(ResultKt.createFailure(th));
            }
        }
    }
}
