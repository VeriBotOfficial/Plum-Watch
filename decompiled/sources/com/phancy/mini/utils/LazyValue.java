package com.phancy.mini.utils;

import androidx.core.app.NotificationCompat;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LazyValue.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00028\u0000HÂ\u0003¢\u0006\u0002\u0010\u000bJ\u0011\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005HÂ\u0003J0\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0003\u001a\u00028\u0000X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0012\u0010\b\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0007R\u0011\u0010\t\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/phancy/mini/utils/LazyValue;", "T", "", "defValue", NotificationCompat.CATEGORY_CALL, "Ljava/util/concurrent/Callable;", "(Ljava/lang/Object;Ljava/util/concurrent/Callable;)V", "Ljava/lang/Object;", "v", "value", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "(Ljava/lang/Object;Ljava/util/concurrent/Callable;)Lcom/phancy/mini/utils/LazyValue;", "equals", "", "other", "hashCode", "", "toString", "", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LazyValue<T> {
    private final Callable<T> call;
    private final T defValue;
    private T v;

    private final T component1() {
        return this.defValue;
    }

    private final Callable<T> component2() {
        return this.call;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LazyValue copy$default(LazyValue lazyValue, Object obj, Callable callable, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = lazyValue.defValue;
        }
        if ((i & 2) != 0) {
            callable = lazyValue.call;
        }
        return lazyValue.copy(obj, callable);
    }

    public final LazyValue<T> copy(T defValue, Callable<T> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        return new LazyValue<>(defValue, call);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyValue)) {
            return false;
        }
        LazyValue lazyValue = (LazyValue) other;
        return Intrinsics.areEqual(this.defValue, lazyValue.defValue) && Intrinsics.areEqual(this.call, lazyValue.call);
    }

    public int hashCode() {
        T t = this.defValue;
        return ((t == null ? 0 : t.hashCode()) * 31) + this.call.hashCode();
    }

    public String toString() {
        return "LazyValue(defValue=" + this.defValue + ", call=" + this.call + ')';
    }

    public LazyValue(T t, Callable<T> call) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.defValue = t;
        this.call = call;
    }

    public final T getValue() {
        T t = this.v;
        if (t != null) {
            return t;
        }
        try {
            T call = this.call.call();
            if (call != null) {
                this.v = call;
            } else {
                call = this.defValue;
            }
            return call;
        } catch (Exception e) {
            e.printStackTrace();
            return this.defValue;
        }
    }
}
