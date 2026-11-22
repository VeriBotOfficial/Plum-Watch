package com.wakeup.feature.aimusic.player;

import com.yandex.div.core.ScrollDirection;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PlayMode.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u000f"}, d2 = {"Lcom/wakeup/feature/aimusic/player/PlayMode;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "LIST_LOOP", "RANDOM", "SINGLE", "ORDER", ScrollDirection.NEXT, "toggleOrderSingle", "Companion", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PlayMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PlayMode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;
    public static final PlayMode LIST_LOOP = new PlayMode("LIST_LOOP", 0, 0);
    public static final PlayMode RANDOM = new PlayMode("RANDOM", 1, 1);
    public static final PlayMode SINGLE = new PlayMode("SINGLE", 2, 2);
    public static final PlayMode ORDER = new PlayMode("ORDER", 3, 3);

    private static final /* synthetic */ PlayMode[] $values() {
        return new PlayMode[]{LIST_LOOP, RANDOM, SINGLE, ORDER};
    }

    public static EnumEntries<PlayMode> getEntries() {
        return $ENTRIES;
    }

    private PlayMode(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        PlayMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    public final PlayMode next() {
        PlayMode playMode = LIST_LOOP;
        return this == playMode ? RANDOM : playMode;
    }

    public final PlayMode toggleOrderSingle() {
        PlayMode playMode = SINGLE;
        return this == playMode ? LIST_LOOP : playMode;
    }

    /* compiled from: PlayMode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/feature/aimusic/player/PlayMode$Companion;", "", "<init>", "()V", "from", "Lcom/wakeup/feature/aimusic/player/PlayMode;", "value", "", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlayMode from(int value) {
            PlayMode playMode;
            PlayMode[] values = PlayMode.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    playMode = null;
                    break;
                }
                playMode = values[i];
                if (playMode.getValue() == value) {
                    break;
                }
                i++;
            }
            return playMode == null ? PlayMode.LIST_LOOP : playMode;
        }
    }

    public static PlayMode valueOf(String str) {
        return (PlayMode) Enum.valueOf(PlayMode.class, str);
    }

    public static PlayMode[] values() {
        return (PlayMode[]) $VALUES.clone();
    }
}
