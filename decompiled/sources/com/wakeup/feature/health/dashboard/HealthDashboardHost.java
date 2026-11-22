package com.wakeup.feature.health.dashboard;

import kotlin.Metadata;

/* compiled from: HealthDashboardHost.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0018\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0006H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH&¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HealthDashboardHost;", "", "pageBack", "", "openSceneConfirm", "sceneKey", "", "activateScene", "scene", "Lcom/wakeup/feature/health/dashboard/HdScene;", "showSceneSettings", "dark", "", "openSceneSelect", "exitScene", "jump", "type", "applyPageTheme", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface HealthDashboardHost {
    void activateScene(HdScene scene);

    void applyPageTheme(boolean dark);

    void exitScene();

    void jump(String type);

    void openSceneConfirm(String sceneKey);

    void openSceneSelect();

    void pageBack();

    void showSceneSettings(String sceneKey, boolean dark);
}
