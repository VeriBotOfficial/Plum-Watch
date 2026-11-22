package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.col.p0003sl.ja;
import com.amap.api.col.p0003sl.t4;
import com.amap.api.maps.model.AMapPara;
import com.amap.api.maps.model.BaseOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class PolygonOptions extends BaseOptions implements Parcelable, Cloneable {
    public static final PolygonOptionsCreator CREATOR = new PolygonOptionsCreator();

    /* renamed from: a, reason: collision with root package name */
    String f2054a;
    private float strokeWidth = 10.0f;
    private int strokeColor = -16777216;
    private int fillColor = -16777216;
    private float zIndex = 0.0f;
    private boolean isVisible = true;
    private boolean isUsePolylineStroke = true;
    private AMapPara.LineJoinType lineJoinType = AMapPara.LineJoinType.LineJoinBevel;
    private int nLineCapType = 3;
    private int nLineJoinType = 0;
    private int dottedLineType = -1;
    private PolygonUpdateFlags updateFlags = new PolygonUpdateFlags();
    private final List<LatLng> points = new ArrayList();
    private List<BaseHoleOptions> holeOptions = new ArrayList();

    protected static class PolygonUpdateFlags extends BaseOptions.BaseUpdateFlags {
        protected boolean isPointsUpdated = false;
        protected boolean isHoleOptionsUpdated = false;

        protected PolygonUpdateFlags() {
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
            super.reset();
            this.isPointsUpdated = false;
            this.isHoleOptionsUpdated = false;
        }
    }

    public PolygonOptions() {
        this.type = "PolygonOptions";
    }

    private void a() {
        boolean a2;
        if (this.holeOptions != null) {
            ArrayList arrayList = new ArrayList();
            List<BaseHoleOptions> list = this.holeOptions;
            for (int i = 0; i < list.size(); i++) {
                BaseHoleOptions baseHoleOptions = list.get(i);
                if (baseHoleOptions instanceof PolygonHoleOptions) {
                    PolygonHoleOptions polygonHoleOptions = (PolygonHoleOptions) baseHoleOptions;
                    if (t4.a(getPoints(), polygonHoleOptions) && !t4.b(arrayList, polygonHoleOptions)) {
                        arrayList.add(polygonHoleOptions);
                    }
                } else if (baseHoleOptions instanceof CircleHoleOptions) {
                    CircleHoleOptions circleHoleOptions = (CircleHoleOptions) baseHoleOptions;
                    List<LatLng> points = getPoints();
                    int i2 = t4.b;
                    try {
                        if (!t4.b(points, circleHoleOptions)) {
                            LatLng center = circleHoleOptions.getCenter();
                            if (center != null) {
                                try {
                                    if (arrayList.size() > 0) {
                                        Iterator it = arrayList.iterator();
                                        while (it.hasNext()) {
                                            if (t4.a((BaseHoleOptions) it.next(), center)) {
                                            }
                                        }
                                    }
                                    a2 = t4.a(center, points);
                                } catch (Throwable th) {
                                    ja.a(th, "PolygonDelegateImp", "contains");
                                    th.printStackTrace();
                                }
                                if (a2 && !t4.a(arrayList, circleHoleOptions)) {
                                    arrayList.add(circleHoleOptions);
                                }
                            }
                            a2 = false;
                            if (a2) {
                                arrayList.add(circleHoleOptions);
                            }
                        }
                    } catch (Throwable th2) {
                        ja.a(th2, "PolygonDelegateImp", "isCircleInPolygon");
                        th2.printStackTrace();
                    }
                }
            }
            this.holeOptions.clear();
            this.holeOptions.addAll(arrayList);
            this.updateFlags.isHoleOptionsUpdated = true;
        }
    }

    public PolygonOptions add(LatLng latLng) {
        try {
            this.points.add(latLng);
            this.updateFlags.isPointsUpdated = true;
            a();
            return this;
        } catch (Throwable th) {
            th.printStackTrace();
            return this;
        }
    }

    public PolygonOptions addAll(Iterable<LatLng> iterable) {
        if (iterable != null) {
            try {
                Iterator<LatLng> it = iterable.iterator();
                while (it.hasNext()) {
                    this.points.add(it.next());
                }
                a();
                this.updateFlags.isPointsUpdated = true;
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }

    public PolygonOptions addHoles(BaseHoleOptions... baseHoleOptionsArr) {
        if (baseHoleOptionsArr != null) {
            try {
                this.holeOptions.addAll(Arrays.asList(baseHoleOptionsArr));
                a();
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PolygonOptions fillColor(int i) {
        this.fillColor = i;
        return this;
    }

    public int getFillColor() {
        return this.fillColor;
    }

    public List<BaseHoleOptions> getHoleOptions() {
        return this.holeOptions;
    }

    public AMapPara.LineJoinType getLineJoinType() {
        return this.lineJoinType;
    }

    public List<LatLng> getPoints() {
        return this.points;
    }

    public int getStrokeColor() {
        return this.strokeColor;
    }

    public int getStrokeDottedLineType() {
        return this.dottedLineType;
    }

    public float getStrokeWidth() {
        return this.strokeWidth;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public boolean isUsePolylineStroke() {
        return this.isUsePolylineStroke;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public PolygonOptions lineJoinType(AMapPara.LineJoinType lineJoinType) {
        if (lineJoinType != null) {
            this.lineJoinType = lineJoinType;
            this.nLineJoinType = lineJoinType.getTypeValue();
        }
        return this;
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public void resetUpdateFlags() {
        this.updateFlags.reset();
    }

    public void setHoleOptions(List<BaseHoleOptions> list) {
        try {
            this.holeOptions.clear();
            if (list != null) {
                this.holeOptions.addAll(list);
            }
            a();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void setPoints(List<LatLng> list) {
        try {
            this.points.clear();
            if (list == null) {
                return;
            }
            this.points.addAll(list);
            a();
            this.updateFlags.isPointsUpdated = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public PolygonOptions setStrokeDottedLineType(int i) {
        this.dottedLineType = i;
        return this;
    }

    public PolygonOptions strokeColor(int i) {
        this.strokeColor = i;
        return this;
    }

    public PolygonOptions strokeWidth(float f) {
        this.strokeWidth = f;
        return this;
    }

    public PolygonOptions usePolylineStroke(boolean z) {
        this.isUsePolylineStroke = z;
        return this;
    }

    public PolygonOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.points);
        parcel.writeFloat(this.strokeWidth);
        parcel.writeInt(this.strokeColor);
        parcel.writeInt(this.fillColor);
        parcel.writeFloat(this.zIndex);
        parcel.writeByte(this.isVisible ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f2054a);
        parcel.writeList(this.holeOptions);
        parcel.writeInt(this.lineJoinType.getTypeValue());
        parcel.writeInt(this.dottedLineType);
        parcel.writeByte(this.isUsePolylineStroke ? (byte) 1 : (byte) 0);
    }

    public PolygonOptions zIndex(float f) {
        float f2 = this.zIndex;
        if (f2 != f2) {
            this.updateFlags.zIndexUpdate = true;
        }
        this.zIndex = f;
        return this;
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public PolygonOptions m6881clone() {
        try {
            super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        PolygonOptions polygonOptions = new PolygonOptions();
        polygonOptions.points.addAll(this.points);
        polygonOptions.strokeWidth = this.strokeWidth;
        polygonOptions.strokeColor = this.strokeColor;
        polygonOptions.fillColor = this.fillColor;
        polygonOptions.zIndex = this.zIndex;
        polygonOptions.isVisible = this.isVisible;
        polygonOptions.holeOptions = this.holeOptions;
        polygonOptions.f2054a = this.f2054a;
        polygonOptions.isUsePolylineStroke = this.isUsePolylineStroke;
        polygonOptions.lineJoinType = this.lineJoinType;
        polygonOptions.nLineCapType = this.nLineCapType;
        polygonOptions.nLineJoinType = this.nLineJoinType;
        polygonOptions.dottedLineType = this.dottedLineType;
        polygonOptions.updateFlags = this.updateFlags;
        return polygonOptions;
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public PolygonUpdateFlags getUpdateFlags() {
        return this.updateFlags;
    }

    public PolygonOptions addHoles(Iterable<BaseHoleOptions> iterable) {
        if (iterable != null) {
            try {
                Iterator<BaseHoleOptions> it = iterable.iterator();
                while (it.hasNext()) {
                    this.holeOptions.add(it.next());
                }
                a();
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }

    public PolygonOptions add(LatLng... latLngArr) {
        if (latLngArr != null) {
            try {
                this.points.addAll(Arrays.asList(latLngArr));
                this.updateFlags.isPointsUpdated = true;
                a();
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }
}
