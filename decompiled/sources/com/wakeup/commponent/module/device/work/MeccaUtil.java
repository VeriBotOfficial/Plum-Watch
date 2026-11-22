package com.wakeup.commponent.module.device.work;

import com.google.android.gms.maps.model.LatLng;
import com.wakeup.commponent.module.sport.util.LocationUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: MeccaUtil.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/commponent/module/device/work/MeccaUtil;", "", "<init>", "()V", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MeccaUtil {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: MeccaUtil.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007¨\u0006\n"}, d2 = {"Lcom/wakeup/commponent/module/device/work/MeccaUtil$Companion;", "", "<init>", "()V", "countMeccaDirectionAngle", "", "longitude", "", "latitude", "countMeccaDistance", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final float countMeccaDirectionAngle(double longitude, double latitude) {
            double radians = Math.toRadians(21.422507d);
            double radians2 = Math.toRadians(latitude);
            double radians3 = Math.toRadians(39.826209d - longitude);
            double degrees = Math.toDegrees(Math.atan2(Math.sin(radians3) * Math.cos(radians), (Math.cos(radians2) * Math.sin(radians)) - ((Math.sin(radians2) * Math.cos(radians)) * Math.cos(radians3))));
            double d = 360;
            return (float) ((degrees + d) % d);
        }

        public final double countMeccaDistance(double longitude, double latitude) {
            LatLng latLng = new LatLng(21.422507d, 39.826209d);
            LatLng latLng2 = new LatLng(latitude, longitude);
            ArrayList arrayList = new ArrayList();
            arrayList.add(latLng);
            arrayList.add(latLng2);
            return LocationUtil.gMapGetDistance(arrayList);
        }
    }
}
