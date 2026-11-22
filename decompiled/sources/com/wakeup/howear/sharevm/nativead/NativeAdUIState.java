package com.wakeup.howear.sharevm.nativead;

import android.gov.nist.core.Separators;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdUIState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdUIState;", "", "itemStates", "", "", "Lcom/wakeup/howear/sharevm/nativead/NativeAdItemUIState;", "<init>", "(Ljava/util/Map;)V", "getItemStates", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NativeAdUIState {
    private final Map<String, NativeAdItemUIState> itemStates;

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdUIState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeAdUIState copy$default(NativeAdUIState nativeAdUIState, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = nativeAdUIState.itemStates;
        }
        return nativeAdUIState.copy(map);
    }

    public final Map<String, NativeAdItemUIState> component1() {
        return this.itemStates;
    }

    public final NativeAdUIState copy(Map<String, ? extends NativeAdItemUIState> itemStates) {
        Intrinsics.checkNotNullParameter(itemStates, "itemStates");
        return new NativeAdUIState(itemStates);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NativeAdUIState) && Intrinsics.areEqual(this.itemStates, ((NativeAdUIState) other).itemStates);
    }

    public int hashCode() {
        return this.itemStates.hashCode();
    }

    public String toString() {
        return "NativeAdUIState(itemStates=" + this.itemStates + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdUIState(Map<String, ? extends NativeAdItemUIState> itemStates) {
        Intrinsics.checkNotNullParameter(itemStates, "itemStates");
        this.itemStates = itemStates;
    }

    public /* synthetic */ NativeAdUIState(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MapsKt.emptyMap() : map);
    }

    public final Map<String, NativeAdItemUIState> getItemStates() {
        return this.itemStates;
    }
}
