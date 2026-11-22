package io.livekit.android.e2ee;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: KeyProvider.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\u0012\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u0013"}, d2 = {"Lio/livekit/android/e2ee/KeyInfo;", "", "participantId", "", "keyIndex", "", "key", "(Ljava/lang/String;ILjava/lang/String;)V", "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "getKeyIndex", "()I", "setKeyIndex", "(I)V", "getParticipantId", "setParticipantId", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class KeyInfo {
    private String key;
    private int keyIndex;
    private String participantId;

    public KeyInfo(String participantId, int i, String key) {
        Intrinsics.checkNotNullParameter(participantId, "participantId");
        Intrinsics.checkNotNullParameter(key, "key");
        this.participantId = participantId;
        this.keyIndex = i;
        this.key = key;
    }

    public final String getKey() {
        return this.key;
    }

    public final int getKeyIndex() {
        return this.keyIndex;
    }

    public final String getParticipantId() {
        return this.participantId;
    }

    public final void setKey(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.key = str;
    }

    public final void setKeyIndex(int i) {
        this.keyIndex = i;
    }

    public final void setParticipantId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.participantId = str;
    }

    public String toString() {
        return "KeyInfo(participantId='" + this.participantId + "', keyIndex=" + this.keyIndex + ')';
    }
}
