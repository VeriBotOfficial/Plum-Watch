package com.wakeup.feature.sport.trail;

import com.wakeup.feature.sport.R;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: TrailUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/sport/trail/TrailUtils;", "", "<init>", "()V", "getSportTrailImg", "", "sportType", "getSportTypeTrailImg", "getSportTypeTrailWhiteImg", "feature-sport_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrailUtils {
    public static final TrailUtils INSTANCE = new TrailUtils();

    private TrailUtils() {
    }

    @JvmStatic
    public static final int getSportTrailImg(int sportType) {
        if (sportType == 258) {
            return R.drawable.ic_map_sport_s2;
        }
        if (sportType == 259) {
            return R.drawable.ic_map_sport_s1;
        }
        return com.wakeup.commonui.R.drawable.ic_map_sport_s;
    }

    @JvmStatic
    public static final int getSportTypeTrailImg(int sportType) {
        if (sportType == 258) {
            return R.drawable.ic_trail_type_riding;
        }
        if (sportType == 259) {
            return R.drawable.ic_trail_type_step;
        }
        return R.drawable.ic_trail_type_run;
    }

    @JvmStatic
    public static final int getSportTypeTrailWhiteImg(int sportType) {
        if (sportType == 258) {
            return R.drawable.ic_trail_type_riding_white;
        }
        if (sportType == 259) {
            return R.drawable.ic_trail_type_step_white;
        }
        return R.drawable.ic_trail_type_run_white;
    }
}
