package io.livekit.android.util;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.xmind.core.Core;

/* compiled from: FlowDelegate.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002BQ\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012:\b\u0002\u0010\u0004\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u001c\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0096A¢\u0006\u0002\u0010\u001eJ\u001e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u00002\u0006\u0010\"\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010#J\u0016\u0010$\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096A¢\u0006\u0002\u0010%J$\u0010\u0016\u001a\u00028\u00002\b\u0010&\u001a\u0004\u0018\u00010'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)H\u0086\u0002¢\u0006\u0002\u0010*J\t\u0010+\u001a\u00020\nH\u0097\u0001J,\u0010\u0018\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010'2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010\u0015\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020 2\u0006\u0010\u0015\u001a\u00028\u0000H\u0096\u0001¢\u0006\u0002\u0010.R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R@\u0010\u0004\u001a4\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0015\u001a\u00028\u0000X\u0096\u000f¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006/"}, d2 = {"Lio/livekit/android/util/MutableStateFlowDelegate;", "T", "Lkotlinx/coroutines/flow/MutableStateFlow;", "flow", "onSetValue", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "newValue", "oldValue", "", "(Lkotlinx/coroutines/flow/MutableStateFlow;Lkotlin/jvm/functions/Function2;)V", "replayCache", "", "getReplayCache", "()Ljava/util/List;", "subscriptionCount", "Lkotlinx/coroutines/flow/StateFlow;", "", "getSubscriptionCount", "()Lkotlinx/coroutines/flow/StateFlow;", "value", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "compareAndSet", "", "expect", "update", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "thisRef", "", Core.Property, "Lkotlin/reflect/KProperty;", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "resetReplayCache", "(Ljava/lang/Object;Lkotlin/reflect/KProperty;Ljava/lang/Object;)V", "tryEmit", "(Ljava/lang/Object;)Z", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MutableStateFlowDelegate<T> implements MutableStateFlow<T> {
    private final MutableStateFlow<T> flow;
    private final Function2<T, T, Unit> onSetValue;

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, Continuation<?> continuation) {
        return this.flow.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T expect, T update) {
        return this.flow.compareAndSet(expect, update);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, Continuation<? super Unit> continuation) {
        return this.flow.emit(t, continuation);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return this.flow.getReplayCache();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public StateFlow<Integer> getSubscriptionCount() {
        return this.flow.getSubscriptionCount();
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        return this.flow.getValue();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        this.flow.resetReplayCache();
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        this.flow.setValue(t);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T value) {
        return this.flow.tryEmit(value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MutableStateFlowDelegate(MutableStateFlow<T> flow, Function2<? super T, ? super T, Unit> function2) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        this.flow = flow;
        this.onSetValue = function2;
    }

    public /* synthetic */ MutableStateFlowDelegate(MutableStateFlow mutableStateFlow, Function2 function2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(mutableStateFlow, (i & 2) != 0 ? null : function2);
    }

    public final T getValue(Object thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(property, "property");
        if (Intrinsics.areEqual((Object) DelegateAccess.INSTANCE.getDelegateRequested$livekit_android_sdk_release().get(), (Object) true)) {
            DelegateAccess.INSTANCE.getDelegate$livekit_android_sdk_release().set(this);
        }
        return this.flow.getValue();
    }

    public final void setValue(Object thisRef, KProperty<?> property, T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        T value2 = this.flow.getValue();
        this.flow.setValue(value);
        Function2<T, T, Unit> function2 = this.onSetValue;
        if (function2 != null) {
            function2.invoke(value, value2);
        }
    }
}
