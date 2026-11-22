package com.phancy.mini.core.task;

import com.facebook.react.bridge.BaseJavaModule;
import com.phancy.mini.MiniSDK;
import com.yandex.div.core.ScrollDirection;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Task.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\b&\u0018\u0000 )*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002)*B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010&\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010(\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u001cH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0016\u001a\u0004\u0018\u00018\u00002\b\u0010\u0015\u001a\u0004\u0018\u00018\u0000@DX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0015\u001a\u0004\u0018\u00010\u001c@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006+"}, d2 = {"Lcom/phancy/mini/core/task/Task;", "V", "Ljava/util/concurrent/Callable;", "()V", BaseJavaModule.METHOD_TYPE_ASYNC, "", "getAsync", "()Z", "name", "", "getName", "()Ljava/lang/String;", "name$delegate", "Lkotlin/Lazy;", "onFinish", "Lkotlin/Function0;", "", "getOnFinish", "()Lkotlin/jvm/functions/Function0;", "setOnFinish", "(Lkotlin/jvm/functions/Function0;)V", "<set-?>", "result", "getResult", "()Ljava/lang/Object;", "setResult", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "Lcom/phancy/mini/core/task/TaskScheduler;", "scheduler", "getScheduler", "()Lcom/phancy/mini/core/task/TaskScheduler;", "state", "Lcom/phancy/mini/core/task/Task$State;", "getState$phancy_mini_sdk_overseasRelease", "()Lcom/phancy/mini/core/task/Task$State;", "setState$phancy_mini_sdk_overseasRelease", "(Lcom/phancy/mini/core/task/Task$State;)V", "finish", "", "init", "Companion", "State", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public abstract class Task<V> implements Callable<V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Task";
    private final boolean async;
    private volatile V result;
    private volatile TaskScheduler scheduler;

    /* renamed from: name$delegate, reason: from kotlin metadata */
    private final Lazy name = LazyKt.lazy(new Function0<String>(this) { // from class: com.phancy.mini.core.task.Task$name$2
        final /* synthetic */ Task<V> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        {
            super(0);
            this.this$0 = this;
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return Task.INSTANCE.nameOf(this.this$0.getClass());
        }
    });
    private volatile State state = State.INIT;
    private volatile Function0<Unit> onFinish = new Function0<Unit>() { // from class: com.phancy.mini.core.task.Task$onFinish$1
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }
    };

    public String getName() {
        return (String) this.name.getValue();
    }

    public boolean getAsync() {
        return this.async;
    }

    /* renamed from: getState$phancy_mini_sdk_overseasRelease, reason: from getter */
    public final State getState() {
        return this.state;
    }

    public final void setState$phancy_mini_sdk_overseasRelease(State state) {
        Intrinsics.checkNotNullParameter(state, "<set-?>");
        this.state = state;
    }

    public final V getResult() {
        return this.result;
    }

    protected final void setResult(V v) {
        this.result = v;
    }

    public final Function0<Unit> getOnFinish() {
        return this.onFinish;
    }

    public final void setOnFinish(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onFinish = function0;
    }

    public final TaskScheduler getScheduler() {
        return this.scheduler;
    }

    public void init(TaskScheduler scheduler) {
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        MiniSDK.d(TAG, "init: " + getName() + ' ' + scheduler);
        this.scheduler = scheduler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void finish(Object result) {
        MiniSDK.d(TAG, "finish: " + getName() + ' ' + result);
        try {
            if (result != 0) {
                this.result = result;
            } else {
                this.result = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.onFinish.invoke();
    }

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0000j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/phancy/mini/core/task/Task$State;", "", "(Ljava/lang/String;I)V", ScrollDirection.NEXT, "INIT", "PREPARED", "SCHEDULED", "FINISHED", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum State {
        INIT,
        PREPARED,
        SCHEDULED,
        FINISHED;

        public final State next() {
            if (this == FINISHED) {
                return this;
            }
            State[] values = values();
            return values[(ordinal() + 1) % values.length];
        }
    }

    /* compiled from: Task.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/phancy/mini/core/task/Task$Companion;", "", "()V", "TAG", "", "nameOf", "clazz", "Ljava/lang/Class;", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String nameOf(Class<?> clazz) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            String simpleName = clazz.getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "clazz.simpleName");
            return simpleName;
        }
    }
}
