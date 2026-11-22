package com.wakeup.feature.sport.manager;

import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;

/* compiled from: SportTrailManager.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010#\u001a\u00020$R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001f¨\u0006%"}, d2 = {"Lcom/wakeup/feature/sport/manager/SportTrailManager;", "", "<init>", "()V", "isShowMapBg", "", "()Z", "setShowMapBg", "(Z)V", "isShowKM", "setShowKM", "showMapType", "", "getShowMapType", "()I", "setShowMapType", "(I)V", "centerLat", "", "getCenterLat", "()D", "setCenterLat", "(D)V", "centerLng", "getCenterLng", "setCenterLng", "zoom", "", "getZoom", "()F", "setZoom", "(F)V", Const.JSON_KEY_BEARING, "getBearing", "setBearing", "resetSportTrail", "", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SportTrailManager {
    private static float bearing;
    private static double centerLat;
    private static double centerLng;
    private static float zoom;
    public static final SportTrailManager INSTANCE = new SportTrailManager();
    private static boolean isShowMapBg = true;
    private static boolean isShowKM = true;
    private static int showMapType = 1;

    private SportTrailManager() {
    }

    public final boolean isShowMapBg() {
        return isShowMapBg;
    }

    public final void setShowMapBg(boolean z) {
        isShowMapBg = z;
    }

    public final boolean isShowKM() {
        return isShowKM;
    }

    public final void setShowKM(boolean z) {
        isShowKM = z;
    }

    public final int getShowMapType() {
        return showMapType;
    }

    public final void setShowMapType(int i) {
        showMapType = i;
    }

    public final double getCenterLat() {
        return centerLat;
    }

    public final void setCenterLat(double d) {
        centerLat = d;
    }

    public final double getCenterLng() {
        return centerLng;
    }

    public final void setCenterLng(double d) {
        centerLng = d;
    }

    public final float getZoom() {
        return zoom;
    }

    public final void setZoom(float f) {
        zoom = f;
    }

    public final float getBearing() {
        return bearing;
    }

    public final void setBearing(float f) {
        bearing = f;
    }

    public final void resetSportTrail() {
        isShowMapBg = true;
        isShowKM = true;
        showMapType = 1;
        centerLat = 0.0d;
        centerLng = 0.0d;
        zoom = 0.0f;
        bearing = 0.0f;
    }
}
