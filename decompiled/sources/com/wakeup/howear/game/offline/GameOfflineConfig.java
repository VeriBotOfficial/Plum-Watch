package com.wakeup.howear.game.offline;

import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.wakeup.howear.game.GameCatalog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameOfflineConfig.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/wakeup/howear/game/offline/GameOfflineConfig;", "", "<init>", "()V", "BASE_URL", "", "MAX_UNPACK_BYTES", "", "MAX_UNPACK_ENTRIES", "", "DISK_HEADROOM_FACTOR", "", "MAX_PACKAGE_BYTES", "isRemote", "", AndroidGetAdPlayerContext.KEY_GAME_ID, "MANIFEST_URL", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GameOfflineConfig {
    private static final String BASE_URL = "https://bjcos-material.iwhopodm.com/game";
    public static final double DISK_HEADROOM_FACTOR = 2.5d;
    public static final GameOfflineConfig INSTANCE = new GameOfflineConfig();
    public static final String MANIFEST_URL = "https://bjcos-material.iwhopodm.com/game/manifest-android.json";
    public static final long MAX_PACKAGE_BYTES = 157286400;
    public static final long MAX_UNPACK_BYTES = 314572800;
    public static final int MAX_UNPACK_ENTRIES = 5000;

    private GameOfflineConfig() {
    }

    public final boolean isRemote(String gameId) {
        Intrinsics.checkNotNullParameter(gameId, "gameId");
        return GameCatalog.INSTANCE.isRemote(gameId);
    }
}
