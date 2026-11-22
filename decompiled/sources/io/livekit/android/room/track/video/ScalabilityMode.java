package io.livekit.android.room.track.video;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: ScalabilityMode.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lio/livekit/android/room/track/video/ScalabilityMode;", "", "spatial", "", "temporal", DOMConstants.TAG_SUFFIX, "", "(IILjava/lang/String;)V", "getSpatial", "()I", "getSuffix", "()Ljava/lang/String;", "getTemporal", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ScalabilityMode {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Regex REGEX = new Regex("L(\\d)T(\\d)(h|_KEY|_KEY_SHIFT)?");
    private final int spatial;
    private final String suffix;
    private final int temporal;

    public static /* synthetic */ ScalabilityMode copy$default(ScalabilityMode scalabilityMode, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = scalabilityMode.spatial;
        }
        if ((i3 & 2) != 0) {
            i2 = scalabilityMode.temporal;
        }
        if ((i3 & 4) != 0) {
            str = scalabilityMode.suffix;
        }
        return scalabilityMode.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSpatial() {
        return this.spatial;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTemporal() {
        return this.temporal;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSuffix() {
        return this.suffix;
    }

    public final ScalabilityMode copy(int spatial, int temporal, String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        return new ScalabilityMode(spatial, temporal, suffix);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScalabilityMode)) {
            return false;
        }
        ScalabilityMode scalabilityMode = (ScalabilityMode) other;
        return this.spatial == scalabilityMode.spatial && this.temporal == scalabilityMode.temporal && Intrinsics.areEqual(this.suffix, scalabilityMode.suffix);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.spatial) * 31) + Integer.hashCode(this.temporal)) * 31) + this.suffix.hashCode();
    }

    public String toString() {
        return "ScalabilityMode(spatial=" + this.spatial + ", temporal=" + this.temporal + ", suffix=" + this.suffix + ')';
    }

    /* compiled from: ScalabilityMode.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/livekit/android/room/track/video/ScalabilityMode$Companion;", "", "()V", "REGEX", "Lkotlin/text/Regex;", "parseFromString", "Lio/livekit/android/room/track/video/ScalabilityMode;", DOMConstants.ATTR_MODE, "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ScalabilityMode parseFromString(String mode) {
            Intrinsics.checkNotNullParameter(mode, "mode");
            MatchResult matchEntire = ScalabilityMode.REGEX.matchEntire(mode);
            if (matchEntire == null) {
                throw new IllegalArgumentException("can't parse scalability mode: " + mode);
            }
            MatchResult.Destructured destructured = matchEntire.getDestructured();
            return new ScalabilityMode(Integer.parseInt(destructured.getMatch().getGroupValues().get(1)), Integer.parseInt(destructured.getMatch().getGroupValues().get(2)), destructured.getMatch().getGroupValues().get(3));
        }
    }

    public ScalabilityMode(int i, int i2, String suffix) {
        Intrinsics.checkNotNullParameter(suffix, "suffix");
        this.spatial = i;
        this.temporal = i2;
        this.suffix = suffix;
    }

    public final int getSpatial() {
        return this.spatial;
    }

    public final String getSuffix() {
        return this.suffix;
    }

    public final int getTemporal() {
        return this.temporal;
    }
}
