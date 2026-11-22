package com.xmly.businesssdk.player.entity;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PlayerSleepStyle.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "FIFTEEN_MINS", "THIRTY_MINS", "SIXTY_MINS", "NINETY_MINS", "CUSTOM_MINS", "ONE_EPISODE", "TWO_EPISODE", "THREE_EPISODE", "FIVE_EPISODE", DialPromoBanner.NONE, "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public enum PlayerSleepStyle {
    FIFTEEN_MINS(0),
    THIRTY_MINS(1),
    SIXTY_MINS(2),
    NINETY_MINS(3),
    CUSTOM_MINS(4),
    ONE_EPISODE(5),
    TWO_EPISODE(6),
    THREE_EPISODE(7),
    FIVE_EPISODE(8),
    NONE(9);


    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int value;

    /* compiled from: PlayerSleepStyle.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0004¨\u0006\r"}, d2 = {"Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle$Companion;", "", "()V", "fromValue", "Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;", "value", "", "getEpisodes", "style", "getMinutes", "isEpisodeStyle", "", "isTimeStyle", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {

        /* compiled from: PlayerSleepStyle.kt */
        @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[PlayerSleepStyle.values().length];
                try {
                    iArr[PlayerSleepStyle.FIFTEEN_MINS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlayerSleepStyle.THIRTY_MINS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlayerSleepStyle.SIXTY_MINS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PlayerSleepStyle.NINETY_MINS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PlayerSleepStyle.ONE_EPISODE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PlayerSleepStyle.TWO_EPISODE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PlayerSleepStyle.THREE_EPISODE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PlayerSleepStyle.FIVE_EPISODE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PlayerSleepStyle fromValue(int value) {
            PlayerSleepStyle playerSleepStyle;
            PlayerSleepStyle[] values = PlayerSleepStyle.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    playerSleepStyle = null;
                    break;
                }
                playerSleepStyle = values[i];
                if (playerSleepStyle.getValue() == value) {
                    break;
                }
                i++;
            }
            return playerSleepStyle == null ? PlayerSleepStyle.NONE : playerSleepStyle;
        }

        public final int getEpisodes(PlayerSleepStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 5) {
                return 1;
            }
            if (i == 6) {
                return 2;
            }
            if (i != 7) {
                return i != 8 ? 0 : 5;
            }
            return 3;
        }

        public final int getMinutes(PlayerSleepStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            int i = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i == 1) {
                return 15;
            }
            if (i == 2) {
                return 30;
            }
            if (i != 3) {
                return i != 4 ? 0 : 90;
            }
            return 60;
        }

        public final boolean isEpisodeStyle(PlayerSleepStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            return CollectionsKt.listOf((Object[]) new PlayerSleepStyle[]{PlayerSleepStyle.ONE_EPISODE, PlayerSleepStyle.TWO_EPISODE, PlayerSleepStyle.THREE_EPISODE, PlayerSleepStyle.FIVE_EPISODE}).contains(style);
        }

        public final boolean isTimeStyle(PlayerSleepStyle style) {
            Intrinsics.checkNotNullParameter(style, "style");
            return CollectionsKt.listOf((Object[]) new PlayerSleepStyle[]{PlayerSleepStyle.FIFTEEN_MINS, PlayerSleepStyle.THIRTY_MINS, PlayerSleepStyle.SIXTY_MINS, PlayerSleepStyle.NINETY_MINS, PlayerSleepStyle.CUSTOM_MINS}).contains(style);
        }
    }

    PlayerSleepStyle(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }
}
