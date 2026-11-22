package com.otaliastudios.cameraview.metering;

import android.graphics.PointF;
import android.graphics.RectF;
import com.otaliastudios.cameraview.size.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes17.dex */
public class MeteringRegions {
    private static final float BLUR_FACTOR_SIZE = 1.5f;
    static final float BLUR_FACTOR_WEIGHT = 0.1f;
    private static final float POINT_AREA = 0.05f;
    final List<MeteringRegion> mRegions;

    private MeteringRegions(List<MeteringRegion> list) {
        this.mRegions = list;
    }

    public MeteringRegions transform(MeteringTransform meteringTransform) {
        ArrayList arrayList = new ArrayList();
        Iterator<MeteringRegion> it = this.mRegions.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().transform(meteringTransform));
        }
        return new MeteringRegions(arrayList);
    }

    public <T> List<T> get(int i, MeteringTransform<T> meteringTransform) {
        ArrayList arrayList = new ArrayList();
        Collections.sort(this.mRegions);
        for (MeteringRegion meteringRegion : this.mRegions) {
            arrayList.add(meteringTransform.transformMeteringRegion(meteringRegion.mRegion, meteringRegion.mWeight));
        }
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }

    public static MeteringRegions fromPoint(Size size, PointF pointF) {
        return fromPoint(size, pointF, 1000);
    }

    public static MeteringRegions fromPoint(Size size, PointF pointF, int i) {
        return fromArea(size, expand(pointF, size.getWidth() * 0.05f, size.getHeight() * 0.05f), i, true);
    }

    public static MeteringRegions fromArea(Size size, RectF rectF) {
        return fromArea(size, rectF, 1000);
    }

    public static MeteringRegions fromArea(Size size, RectF rectF, int i) {
        return fromArea(size, rectF, i, false);
    }

    public static MeteringRegions fromArea(Size size, RectF rectF, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        PointF pointF = new PointF(rectF.centerX(), rectF.centerY());
        float width = rectF.width();
        float height = rectF.height();
        arrayList.add(new MeteringRegion(rectF, i));
        if (z) {
            arrayList.add(new MeteringRegion(expand(pointF, width * BLUR_FACTOR_SIZE, height * BLUR_FACTOR_SIZE), Math.round(i * 0.1f)));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((MeteringRegion) it.next()).clip(size));
        }
        return new MeteringRegions(arrayList2);
    }

    private static RectF expand(PointF pointF, float f, float f2) {
        float f3 = f / 2.0f;
        float f4 = f2 / 2.0f;
        return new RectF(pointF.x - f3, pointF.y - f4, pointF.x + f3, pointF.y + f4);
    }
}
