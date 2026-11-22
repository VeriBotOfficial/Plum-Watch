package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.amap.api.maps.model.BaseOptions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class PolylineOptions extends BaseOptions implements Parcelable {
    public static final PolylineOptionsCreator CREATOR = new PolylineOptionsCreator();
    public static final int DOTTEDLINE_TYPE_CIRCLE = 1;
    public static final int DOTTEDLINE_TYPE_SQUARE = 0;

    /* renamed from: a, reason: collision with root package name */
    String f2055a;
    private List<Integer> colorValues;
    private List<Integer> customIndexs;
    private BitmapDescriptor customTexture;
    private List<BitmapDescriptor> customTextureList;
    private BitmapDescriptor eraseTexture;
    private BitmapDescriptor footPrintTexture;
    private int[] jniColorValues;
    private int[] jniCustomIndexes;
    private float width = 10.0f;
    private int color = -16777216;
    private float zIndex = 0.0f;
    private boolean isVisible = true;
    private boolean useEngine = false;
    private boolean reducePoint = true;
    private boolean isUseTexture = true;
    private boolean isGeodesic = false;
    private boolean isDottedLine = false;
    private boolean isGradient = false;
    private float transparency = 1.0f;
    private boolean isAboveMaskLayer = false;
    private int dottedLineType = 0;
    private LineCapType lineCapType = LineCapType.LineCapRound;
    private LineJoinType lineJoinType = LineJoinType.LineJoinBevel;
    private int nLineCapType = 3;
    private int nLineJoinType = 0;
    private float shownRatio = -1.0f;
    private float shownRangeBegin = -1.0f;
    private float shownRangeEnd = -1.0f;
    private float footPrintGap = 100.0f;
    private boolean eraseVisible = false;
    private int eraseColor = -7829368;
    private float shownPolylineRangeBegin = 0.0f;
    private float shownPolylineRangeEnd = 0.0f;
    private boolean showPolylineRangeEnable = false;
    private PolylineUpdateFlags updateFlags = new PolylineUpdateFlags();
    private final List<LatLng> points = new ArrayList();

    public enum LineCapType {
        LineCapButt(0),
        LineCapSquare(1),
        LineCapArrow(2),
        LineCapRound(3);

        private int type;

        LineCapType(int i) {
            this.type = i;
        }

        public int getTypeValue() {
            return this.type;
        }

        public static LineCapType valueOf(int i) {
            return values()[Math.max(0, Math.min(i, 4))];
        }
    }

    public enum LineJoinType {
        LineJoinBevel(0),
        LineJoinMiter(1),
        LineJoinRound(2);

        private int type;

        LineJoinType(int i) {
            this.type = i;
        }

        public int getTypeValue() {
            return this.type;
        }

        public static LineJoinType valueOf(int i) {
            return values()[Math.max(0, Math.min(i, 3))];
        }
    }

    protected static class PolylineUpdateFlags extends BaseOptions.BaseUpdateFlags {
        protected boolean isPointsUpdated = false;
        protected boolean isCustomIndexesUpdated = false;
        protected boolean isCustomTextureListUpdated = false;
        protected boolean isColorValuesUpdated = false;
        protected boolean footPrintBDUpdate = false;
        protected boolean eraseUpdate = false;

        protected PolylineUpdateFlags() {
        }

        @Override // com.amap.api.maps.model.BaseOptions.BaseUpdateFlags
        public void reset() {
            super.reset();
            this.isPointsUpdated = false;
            this.isCustomIndexesUpdated = false;
            this.isCustomTextureListUpdated = false;
            this.isColorValuesUpdated = false;
            this.footPrintBDUpdate = false;
            this.eraseUpdate = false;
        }
    }

    public PolylineOptions() {
        this.type = "PolylineOptions";
    }

    public PolylineOptions aboveMaskLayer(boolean z) {
        this.isAboveMaskLayer = z;
        return this;
    }

    public PolylineOptions add(LatLng latLng) {
        if (latLng != null) {
            try {
                this.points.add(latLng);
                this.updateFlags.isPointsUpdated = true;
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }

    public PolylineOptions addAll(Iterable<LatLng> iterable) {
        if (iterable != null) {
            try {
                Iterator<LatLng> it = iterable.iterator();
                while (it.hasNext()) {
                    this.points.add(it.next());
                }
                this.updateFlags.isPointsUpdated = true;
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }

    public PolylineOptions color(int i) {
        this.color = i;
        return this;
    }

    public PolylineOptions colorValues(List<Integer> list) {
        try {
            this.colorValues = list;
            this.jniColorValues = new int[list.size()];
            int i = 0;
            while (true) {
                int[] iArr = this.jniColorValues;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = list.get(i).intValue();
                i++;
            }
            this.updateFlags.isColorValuesUpdated = true;
        } catch (Throwable unused) {
        }
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public PolylineOptions geodesic(boolean z) {
        this.isGeodesic = z;
        return this;
    }

    public int getColor() {
        return this.color;
    }

    public List<Integer> getColorValues() {
        return this.colorValues;
    }

    public BitmapDescriptor getCustomTexture() {
        return this.customTexture;
    }

    public List<Integer> getCustomTextureIndex() {
        return this.customIndexs;
    }

    public List<BitmapDescriptor> getCustomTextureList() {
        return this.customTextureList;
    }

    public int getDottedLineType() {
        return this.dottedLineType;
    }

    public int getEraseColor() {
        return this.eraseColor;
    }

    public BitmapDescriptor getEraseTexture() {
        return this.eraseTexture;
    }

    public boolean getEraseVisible() {
        return this.eraseVisible;
    }

    public float getFootPrintGap() {
        return this.footPrintGap;
    }

    public BitmapDescriptor getFootPrintTexture() {
        return this.footPrintTexture;
    }

    public LineCapType getLineCapType() {
        return this.lineCapType;
    }

    public LineJoinType getLineJoinType() {
        return this.lineJoinType;
    }

    public List<LatLng> getPoints() {
        return this.points;
    }

    public float getPolylineShownRangeBegin() {
        return this.shownPolylineRangeBegin;
    }

    public float getPolylineShownRangeEnd() {
        return this.shownPolylineRangeEnd;
    }

    public boolean getReducePoint() {
        return this.reducePoint;
    }

    public float getShownRangeBegin() {
        return this.shownRangeBegin;
    }

    public float getShownRangeEnd() {
        return this.shownRangeEnd;
    }

    public float getShownRatio() {
        return this.shownRatio;
    }

    public float getTransparency() {
        return this.transparency;
    }

    public boolean getUseEngine() {
        return this.useEngine;
    }

    public float getWidth() {
        return this.width;
    }

    public float getZIndex() {
        return this.zIndex;
    }

    public boolean isAboveMaskLayer() {
        return this.isAboveMaskLayer;
    }

    public boolean isDottedLine() {
        return this.isDottedLine;
    }

    public boolean isGeodesic() {
        return this.isGeodesic;
    }

    public boolean isShowPolylineRangeEnable() {
        return this.showPolylineRangeEnable;
    }

    public boolean isUseGradient() {
        return this.isGradient;
    }

    public boolean isUseTexture() {
        return this.isUseTexture;
    }

    public boolean isVisible() {
        return this.isVisible;
    }

    public PolylineOptions lineCapType(LineCapType lineCapType) {
        if (lineCapType != null) {
            this.lineCapType = lineCapType;
            this.nLineCapType = lineCapType.getTypeValue();
        }
        return this;
    }

    public PolylineOptions lineJoinType(LineJoinType lineJoinType) {
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

    public PolylineOptions setCustomTexture(BitmapDescriptor bitmapDescriptor) {
        this.customTexture = bitmapDescriptor;
        return this;
    }

    public PolylineOptions setCustomTextureIndex(List<Integer> list) {
        try {
            this.customIndexs = list;
            this.jniCustomIndexes = new int[list.size()];
            int i = 0;
            while (true) {
                int[] iArr = this.jniCustomIndexes;
                if (i >= iArr.length) {
                    break;
                }
                iArr[i] = list.get(i).intValue();
                i++;
            }
            PolylineUpdateFlags polylineUpdateFlags = this.updateFlags;
            polylineUpdateFlags.isCustomIndexesUpdated = true;
            polylineUpdateFlags.isCustomTextureListUpdated = true;
        } catch (Throwable unused) {
        }
        return this;
    }

    public PolylineOptions setCustomTextureList(List<BitmapDescriptor> list) {
        this.customTextureList = list;
        PolylineUpdateFlags polylineUpdateFlags = this.updateFlags;
        polylineUpdateFlags.isCustomTextureListUpdated = true;
        polylineUpdateFlags.isCustomIndexesUpdated = true;
        return this;
    }

    public PolylineOptions setDottedLine(boolean z) {
        this.isDottedLine = z;
        return this;
    }

    public PolylineOptions setDottedLineType(int i) {
        this.dottedLineType = i == 0 ? 0 : 1;
        return this;
    }

    public PolylineOptions setEraseColor(boolean z, int i) {
        this.eraseVisible = z;
        this.eraseColor = i;
        this.updateFlags.eraseUpdate = true;
        return this;
    }

    public PolylineOptions setEraseTexture(boolean z, BitmapDescriptor bitmapDescriptor) {
        this.eraseVisible = z;
        this.eraseTexture = bitmapDescriptor;
        this.updateFlags.eraseUpdate = true;
        return this;
    }

    public PolylineOptions setFootPrintGap(float f) {
        this.footPrintGap = f;
        return this;
    }

    public PolylineOptions setFootPrintTexture(BitmapDescriptor bitmapDescriptor) {
        this.footPrintTexture = bitmapDescriptor;
        this.updateFlags.footPrintBDUpdate = true;
        return this;
    }

    public void setPoints(List<LatLng> list) {
        List<LatLng> list2;
        if (list == null || (list2 = this.points) == list) {
            return;
        }
        try {
            list2.clear();
            this.points.addAll(list);
            this.updateFlags.isPointsUpdated = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public PolylineOptions setPolylineShowRange(float f, float f2) {
        this.shownPolylineRangeBegin = f;
        this.shownPolylineRangeEnd = f2;
        return this;
    }

    public void setReducePoint(boolean z) {
        this.reducePoint = z;
    }

    public PolylineOptions setShownRange(float f, float f2) {
        this.shownRangeBegin = f;
        this.shownRangeEnd = f2;
        showPolylineRangeEnabled(true);
        setPolylineShowRange(f, f2);
        return this;
    }

    public PolylineOptions setShownRatio(float f) {
        this.shownRatio = f;
        setPolylineShowRange(0.0f, f);
        showPolylineRangeEnabled(true);
        return this;
    }

    public void setUseEngine(boolean z) {
        this.useEngine = z;
    }

    public PolylineOptions setUseTexture(boolean z) {
        this.isUseTexture = z;
        return this;
    }

    public PolylineOptions showPolylineRangeEnabled(boolean z) {
        this.showPolylineRangeEnable = z;
        return this;
    }

    public PolylineOptions transparency(float f) {
        this.transparency = f;
        return this;
    }

    public PolylineOptions useGradient(boolean z) {
        this.isGradient = z;
        return this;
    }

    public PolylineOptions visible(boolean z) {
        this.isVisible = z;
        return this;
    }

    public PolylineOptions width(float f) {
        this.width = f;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.points);
        parcel.writeFloat(this.width);
        parcel.writeInt(this.color);
        parcel.writeInt(this.dottedLineType);
        parcel.writeFloat(this.zIndex);
        parcel.writeFloat(this.transparency);
        parcel.writeString(this.f2055a);
        parcel.writeInt(this.lineCapType.getTypeValue());
        parcel.writeInt(this.lineJoinType.getTypeValue());
        parcel.writeBooleanArray(new boolean[]{this.isVisible, this.isDottedLine, this.isGeodesic, this.isGradient, this.isAboveMaskLayer});
        BitmapDescriptor bitmapDescriptor = this.customTexture;
        if (bitmapDescriptor != null) {
            parcel.writeParcelable(bitmapDescriptor, i);
        }
        List<BitmapDescriptor> list = this.customTextureList;
        if (list != null) {
            parcel.writeList(list);
        }
        List<Integer> list2 = this.customIndexs;
        if (list2 != null) {
            parcel.writeList(list2);
        }
        List<Integer> list3 = this.colorValues;
        if (list3 != null) {
            parcel.writeList(list3);
        }
        parcel.writeFloat(this.shownRatio);
    }

    public PolylineOptions zIndex(float f) {
        if (this.zIndex != f) {
            this.updateFlags.zIndexUpdate = true;
        }
        this.zIndex = f;
        return this;
    }

    @Override // com.amap.api.maps.model.BaseOptions
    public PolylineUpdateFlags getUpdateFlags() {
        return this.updateFlags;
    }

    public PolylineOptions add(LatLng... latLngArr) {
        if (latLngArr != null) {
            try {
                this.points.addAll(Arrays.asList(latLngArr));
                this.updateFlags.isPointsUpdated = true;
                return this;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this;
    }
}
