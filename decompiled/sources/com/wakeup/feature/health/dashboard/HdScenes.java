package com.wakeup.feature.health.dashboard;

import android.graphics.Color;
import com.wakeup.feature.health.R;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HdScenes.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HdScenes;", "", "<init>", "()V", "EXAM", "", "RECOVERY", "FATBURN", "SLEEP", "all", "", "Lcom/wakeup/feature/health/dashboard/HdScene;", "getAll", "()Ljava/util/List;", "find", "key", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HdScenes {
    public static final String RECOVERY = "recovery";
    public static final HdScenes INSTANCE = new HdScenes();
    public static final String EXAM = "exam";
    public static final String FATBURN = "fatburn";
    public static final String SLEEP = "sleep";
    private static final List<HdScene> all = CollectionsKt.listOf((Object[]) new HdScene[]{new HdScene(EXAM, "📚", R.string.hd_scene_exam, R.string.hd_scene_exam_item, R.string.hd_scene_exam_desc, R.string.hd_scene_exam_intro, Color.parseColor("#00CEC9"), Color.parseColor("#1A6C5CE7"), Color.parseColor("#146C5CE7"), false, false, CollectionsKt.listOf((Object[]) new HdDim[]{new HdDim("😴", R.string.hd_dim_sleep_quality, "30%"), new HdDim("😰", R.string.hd_dim_stress, "25%"), new HdDim("💓", R.string.hd_dim_hrv, "15%"), new HdDim("🚶", R.string.hd_dim_activity, "15%"), new HdDim("🩸", R.string.hd_dim_spo2, "10%"), new HdDim("🫁", R.string.hd_dim_resp, "5%")}), CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.hd_feat_exam_1), Integer.valueOf(R.string.hd_feat_exam_2), Integer.valueOf(R.string.hd_feat_exam_3), Integer.valueOf(R.string.hd_feat_exam_4)})), new HdScene("recovery", "🔋", R.string.hd_scene_recovery, R.string.hd_scene_recovery_item, R.string.hd_scene_recovery_desc, R.string.hd_scene_recovery_intro, Color.parseColor("#10B981"), Color.parseColor("#1A10B981"), Color.parseColor("#1410B981"), false, false, CollectionsKt.listOf((Object[]) new HdDim[]{new HdDim("💓", R.string.hd_dim_hrv_short, "30%"), new HdDim("😴", R.string.hd_dim_sleep_quality, "25%"), new HdDim("😰", R.string.hd_dim_stress_level, "20%"), new HdDim("❤️", R.string.hd_dim_rest_hr, "15%"), new HdDim("🩸", R.string.hd_dim_spo2, "10%")}), CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.hd_feat_recovery_1), Integer.valueOf(R.string.hd_feat_recovery_2), Integer.valueOf(R.string.hd_feat_recovery_3), Integer.valueOf(R.string.hd_feat_recovery_4)})), new HdScene(FATBURN, "🔥", R.string.hd_scene_fatburn, R.string.hd_scene_fatburn_item, R.string.hd_scene_fatburn_desc, R.string.hd_scene_fatburn_intro, Color.parseColor("#FD79A8"), Color.parseColor("#1AEC4899"), Color.parseColor("#14FD79A8"), false, true, CollectionsKt.listOf((Object[]) new HdDim[]{new HdDim("🔥", R.string.hd_dim_calorie, "30%"), new HdDim("⚖️", R.string.hd_dim_weight, "25%"), new HdDim("🚶", R.string.hd_dim_activity, "20%"), new HdDim("❤️", R.string.hd_dim_hr_zone, "15%"), new HdDim("😴", R.string.hd_dim_sleep, "10%")}), CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.hd_feat_fatburn_1), Integer.valueOf(R.string.hd_feat_fatburn_2), Integer.valueOf(R.string.hd_feat_fatburn_3), Integer.valueOf(R.string.hd_feat_fatburn_4)})), new HdScene(SLEEP, "🌙", R.string.hd_scene_sleep, R.string.hd_scene_sleep_item, R.string.hd_scene_sleep_desc, R.string.hd_scene_sleep_intro, Color.parseColor("#3B82F6"), Color.parseColor("#1A3B82F6"), Color.parseColor("#143B82F6"), true, false, CollectionsKt.listOf((Object[]) new HdDim[]{new HdDim("😴", R.string.hd_dim_sleep_duration, "30%"), new HdDim("🌊", R.string.hd_dim_deep_ratio, "30%"), new HdDim("💓", R.string.hd_dim_night_hrv, "20%"), new HdDim("🫁", R.string.hd_dim_breath_quality, "20%")}), CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.hd_feat_sleep_1), Integer.valueOf(R.string.hd_feat_sleep_2), Integer.valueOf(R.string.hd_feat_sleep_3), Integer.valueOf(R.string.hd_feat_sleep_4)}))});
    public static final int $stable = 8;

    private HdScenes() {
    }

    public final List<HdScene> getAll() {
        return all;
    }

    public final HdScene find(String key) {
        Object obj;
        Iterator<T> it = all.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((HdScene) obj).getKey(), key)) {
                break;
            }
        }
        return (HdScene) obj;
    }
}
