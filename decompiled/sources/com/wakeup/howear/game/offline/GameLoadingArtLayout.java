package com.wakeup.howear.game.offline;

import kotlin.Metadata;
import kotlin.ranges.RangesKt;

/* compiled from: GameLoadingArtLayout.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/wakeup/howear/game/offline/GameLoadingArtLayout;", "", "<init>", "()V", "calculate", "Lcom/wakeup/howear/game/offline/GameLoadingArtGeometry;", "viewWidth", "", "viewHeight", "imageWidth", "imageHeight", "maxCropFraction", "", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GameLoadingArtLayout {
    public static final GameLoadingArtLayout INSTANCE = new GameLoadingArtLayout();

    private GameLoadingArtLayout() {
    }

    public final GameLoadingArtGeometry calculate(int viewWidth, int viewHeight, int imageWidth, int imageHeight, float maxCropFraction) {
        if (viewWidth <= 0 || viewHeight <= 0 || imageWidth <= 0 || imageHeight <= 0) {
            return null;
        }
        float f = viewWidth;
        float f2 = imageWidth;
        float f3 = f / f2;
        float f4 = viewHeight;
        float f5 = imageHeight;
        float f6 = f4 / f5;
        float min = Math.min(Math.max(f3, f6), Math.min(f3, f6) / (1.0f - RangesKt.coerceIn(maxCropFraction, 0.0f, 0.45f)));
        float f7 = f2 * min;
        float f8 = f5 * min;
        return new GameLoadingArtGeometry(min, (f - f7) / 2.0f, (f4 - f8) / 2.0f, f7, f8);
    }
}
