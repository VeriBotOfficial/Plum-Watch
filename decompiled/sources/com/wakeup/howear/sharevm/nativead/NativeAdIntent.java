package com.wakeup.howear.sharevm.nativead;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NativeAdIntent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent;", "", "<init>", "()V", "LoadAd", "EnterScenario", "Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent$EnterScenario;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent$LoadAd;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NativeAdIntent {
    public /* synthetic */ NativeAdIntent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private NativeAdIntent() {
    }

    /* compiled from: NativeAdIntent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00032\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent$LoadAd;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent;", "forceRefresh", "", "positionId", "", "<init>", "(ZLjava/lang/String;)V", "getForceRefresh", "()Z", "getPositionId", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class LoadAd extends NativeAdIntent {
        private final boolean forceRefresh;
        private final String positionId;

        public static /* synthetic */ LoadAd copy$default(LoadAd loadAd, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadAd.forceRefresh;
            }
            if ((i & 2) != 0) {
                str = loadAd.positionId;
            }
            return loadAd.copy(z, str);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getForceRefresh() {
            return this.forceRefresh;
        }

        /* renamed from: component2, reason: from getter */
        public final String getPositionId() {
            return this.positionId;
        }

        public final LoadAd copy(boolean forceRefresh, String positionId) {
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            return new LoadAd(forceRefresh, positionId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoadAd)) {
                return false;
            }
            LoadAd loadAd = (LoadAd) other;
            return this.forceRefresh == loadAd.forceRefresh && Intrinsics.areEqual(this.positionId, loadAd.positionId);
        }

        public int hashCode() {
            return (Boolean.hashCode(this.forceRefresh) * 31) + this.positionId.hashCode();
        }

        public String toString() {
            return "LoadAd(forceRefresh=" + this.forceRefresh + ", positionId=" + this.positionId + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LoadAd(boolean z, String positionId) {
            super(null);
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            this.forceRefresh = z;
            this.positionId = positionId;
        }

        public final boolean getForceRefresh() {
            return this.forceRefresh;
        }

        public final String getPositionId() {
            return this.positionId;
        }
    }

    /* compiled from: NativeAdIntent.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent$EnterScenario;", "Lcom/wakeup/howear/sharevm/nativead/NativeAdIntent;", "positionId", "", "scenarioId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getPositionId", "()Ljava/lang/String;", "getScenarioId", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class EnterScenario extends NativeAdIntent {
        private final String positionId;
        private final String scenarioId;

        public static /* synthetic */ EnterScenario copy$default(EnterScenario enterScenario, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = enterScenario.positionId;
            }
            if ((i & 2) != 0) {
                str2 = enterScenario.scenarioId;
            }
            return enterScenario.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getPositionId() {
            return this.positionId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScenarioId() {
            return this.scenarioId;
        }

        public final EnterScenario copy(String positionId, String scenarioId) {
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            Intrinsics.checkNotNullParameter(scenarioId, "scenarioId");
            return new EnterScenario(positionId, scenarioId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EnterScenario)) {
                return false;
            }
            EnterScenario enterScenario = (EnterScenario) other;
            return Intrinsics.areEqual(this.positionId, enterScenario.positionId) && Intrinsics.areEqual(this.scenarioId, enterScenario.scenarioId);
        }

        public int hashCode() {
            return (this.positionId.hashCode() * 31) + this.scenarioId.hashCode();
        }

        public String toString() {
            return "EnterScenario(positionId=" + this.positionId + ", scenarioId=" + this.scenarioId + Separators.RPAREN;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnterScenario(String positionId, String scenarioId) {
            super(null);
            Intrinsics.checkNotNullParameter(positionId, "positionId");
            Intrinsics.checkNotNullParameter(scenarioId, "scenarioId");
            this.positionId = positionId;
            this.scenarioId = scenarioId;
        }

        public final String getPositionId() {
            return this.positionId;
        }

        public final String getScenarioId() {
            return this.scenarioId;
        }
    }
}
