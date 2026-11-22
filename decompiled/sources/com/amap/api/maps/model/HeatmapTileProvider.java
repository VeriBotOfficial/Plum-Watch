package com.amap.api.maps.model;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.Log;
import androidx.collection.LongSparseArray;
import com.amap.api.col.p0003sl.d4;
import com.amap.api.maps.AMapException;
import com.autonavi.amap.mapcore.DPoint;
import com.autonavi.aps.amapapi.config.Const;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes11.dex */
public class HeatmapTileProvider implements TileProvider {
    public static final Gradient DEFAULT_GRADIENT;
    private static final int[] DEFAULT_GRADIENT_COLORS;
    private static final float[] DEFAULT_GRADIENT_START_POINTS;
    private static final int DEFAULT_MAX_ZOOM = 11;
    private static final int DEFAULT_MIN_ZOOM = 5;
    public static final double DEFAULT_OPACITY = 0.6d;
    public static final int DEFAULT_RADIUS = 12;
    private static final int MAX_RADIUS = 200;
    private static final int MAX_ZOOM_LEVEL = 21;
    private static final int MIN_RADIUS = 10;
    private static final int SCREEN_SIZE = 1280;
    private static final int TILE_DIM = 256;
    private d4 mBounds;
    private int[] mColorMap;
    private Collection<WeightedLatLng> mData;
    private Gradient mGradient;
    private double[] mKernel;
    private double[] mMaxIntensity;
    private double mOpacity;
    private int mRadius;
    private com.amap.api.maps.model.a mTree;

    public static class Builder {
        private Collection<WeightedLatLng> data;
        private int radius = 12;
        private Gradient gradient = HeatmapTileProvider.DEFAULT_GRADIENT;
        private double opacity = 0.6d;

        public HeatmapTileProvider build() {
            Collection<WeightedLatLng> collection = this.data;
            if (collection != null && collection.size() != 0) {
                try {
                    return new HeatmapTileProvider(this);
                } catch (Throwable th) {
                    th.printStackTrace();
                    return null;
                }
            }
            try {
                throw new AMapException("No input points.");
            } catch (AMapException e) {
                Log.e(Const.STR_PUBLIC_TAG, e.getErrorMessage());
                e.printStackTrace();
                return null;
            }
        }

        public Builder data(Collection<LatLng> collection) {
            int i = HeatmapTileProvider.DEFAULT_RADIUS;
            ArrayList arrayList = new ArrayList();
            Iterator<LatLng> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(new WeightedLatLng(it.next()));
            }
            return weightedData(arrayList);
        }

        public Builder gradient(Gradient gradient) {
            this.gradient = gradient;
            return this;
        }

        public Builder radius(int i) {
            this.radius = Math.max(10, Math.min(i, 200));
            return this;
        }

        public Builder transparency(double d) {
            this.opacity = Math.max(0.0d, Math.min(d, 1.0d));
            return this;
        }

        public Builder weightedData(Collection<WeightedLatLng> collection) {
            this.data = collection;
            return this;
        }
    }

    private void a(Gradient gradient) {
        this.mGradient = gradient;
        this.mColorMap = gradient.generateColorMap(this.mOpacity);
    }

    private void b(Collection<WeightedLatLng> collection) {
        try {
            ArrayList arrayList = new ArrayList();
            for (WeightedLatLng weightedLatLng : collection) {
                double d = weightedLatLng.latLng.latitude;
                if (d < 85.0d && d > -85.0d) {
                    arrayList.add(weightedLatLng);
                }
            }
            this.mData = arrayList;
            d4 a2 = a(arrayList);
            this.mBounds = a2;
            this.mTree = new com.amap.api.maps.model.a(a2);
            Iterator<WeightedLatLng> it = this.mData.iterator();
            while (it.hasNext()) {
                this.mTree.a(it.next());
            }
            this.mMaxIntensity = a(this.mRadius);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // com.amap.api.maps.model.TileProvider
    public Tile getTile(int i, int i2, int i3) {
        double d;
        int i4;
        int i5;
        double pow = 1.0d / Math.pow(2.0d, i3);
        double d2 = (this.mRadius * pow) / 256.0d;
        double d3 = ((d2 * 2.0d) + pow) / ((r10 * 2) + 256);
        double d4 = (i * pow) - d2;
        int i6 = 1;
        double d5 = ((i + 1) * pow) + d2;
        double d6 = (i2 * pow) - d2;
        double d7 = ((i2 + 1) * pow) + d2;
        Collection<WeightedLatLng> arrayList = new ArrayList<>();
        if (d4 < 0.0d) {
            arrayList = this.mTree.a(new d4(d4 + 1.0d, 1.0d, d6, d7));
            d = -1.0d;
        } else if (d5 > 1.0d) {
            arrayList = this.mTree.a(new d4(0.0d, d5 - 1.0d, d6, d7));
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        d4 d4Var = new d4(d4, d5, d6, d7);
        d4 d4Var2 = this.mBounds;
        if (!d4Var.a(new d4(d4Var2.f1599a - d2, d4Var2.c + d2, d4Var2.b - d2, d4Var2.d + d2))) {
            return TileProvider.NO_TILE;
        }
        ArrayList arrayList2 = (ArrayList) this.mTree.a(d4Var);
        if (arrayList2.isEmpty()) {
            return TileProvider.NO_TILE;
        }
        int i7 = (this.mRadius * 2) + 256;
        int i8 = 0;
        double[][] dArr = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, i7);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            WeightedLatLng weightedLatLng = (WeightedLatLng) it.next();
            DPoint point = weightedLatLng.getPoint();
            int i9 = i6;
            double d8 = d;
            int i10 = (int) ((point.x - d4) / d3);
            int i11 = (int) ((point.y - d6) / d3);
            double[] dArr2 = dArr[i10];
            dArr2[i11] = dArr2[i11] + weightedLatLng.intensity;
            i8 = i8;
            i6 = i9;
            d = d8;
        }
        int i12 = i6;
        double d9 = d;
        int i13 = i8;
        for (WeightedLatLng weightedLatLng2 : arrayList) {
            DPoint point2 = weightedLatLng2.getPoint();
            int i14 = (int) (((point2.x + d9) - d4) / d3);
            int i15 = (int) ((point2.y - d6) / d3);
            double[] dArr3 = dArr[i14];
            dArr3[i15] = dArr3[i15] + weightedLatLng2.intensity;
            i13 = i13;
        }
        int i16 = i13;
        double[] dArr4 = this.mKernel;
        int floor = (int) Math.floor(dArr4.length / 2.0d);
        int length = dArr.length;
        int i17 = length - (floor * 2);
        int i18 = floor + i17;
        int i19 = i18 - 1;
        int[] iArr = new int[2];
        iArr[i12] = length;
        iArr[i16] = length;
        double[][] dArr5 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr);
        for (int i20 = i16; i20 < length; i20++) {
            int i21 = i16;
            while (i21 < length) {
                double d10 = dArr[i20][i21];
                if (d10 != 0.0d) {
                    i4 = i16;
                    int i22 = i20 + floor;
                    if (i19 < i22) {
                        i22 = i19;
                    }
                    int i23 = i22 + i12;
                    i5 = i12;
                    int i24 = i20 - floor;
                    for (int i25 = floor > i24 ? floor : i24; i25 < i23; i25++) {
                        double[] dArr6 = dArr5[i25];
                        dArr6[i21] = dArr6[i21] + (dArr4[i25 - i24] * d10);
                    }
                } else {
                    i4 = i16;
                    i5 = i12;
                }
                i21++;
                i16 = i4;
                i12 = i5;
            }
        }
        int i26 = i16;
        int[] iArr2 = new int[2];
        iArr2[i12] = i17;
        iArr2[i26] = i17;
        double[][] dArr7 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iArr2);
        for (int i27 = floor; i27 < i18; i27++) {
            for (int i28 = i26; i28 < length; i28++) {
                double d11 = dArr5[i27][i28];
                if (d11 != 0.0d) {
                    int i29 = i28 + floor;
                    if (i19 < i29) {
                        i29 = i19;
                    }
                    int i30 = i29 + 1;
                    int i31 = i28 - floor;
                    for (int i32 = floor > i31 ? floor : i31; i32 < i30; i32++) {
                        double[] dArr8 = dArr7[i27 - floor];
                        int i33 = i32 - floor;
                        dArr8[i33] = dArr8[i33] + (dArr4[i32 - i31] * d11);
                    }
                }
            }
        }
        int[] iArr3 = this.mColorMap;
        double d12 = this.mMaxIntensity[i3];
        int i34 = iArr3[iArr3.length - 1];
        double length2 = (iArr3.length - 1) / d12;
        int length3 = dArr7.length;
        int[] iArr4 = new int[length3 * length3];
        for (int i35 = i26; i35 < length3; i35++) {
            for (int i36 = i26; i36 < length3; i36++) {
                double d13 = dArr7[i36][i35];
                int i37 = (i35 * length3) + i36;
                int i38 = (int) (d13 * length2);
                if (d13 == 0.0d) {
                    iArr4[i37] = i26;
                } else if (i38 < iArr3.length) {
                    iArr4[i37] = iArr3[i38];
                } else {
                    iArr4[i37] = i34;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(length3, length3, Bitmap.Config.ARGB_8888);
        createBitmap.setPixels(iArr4, 0, length3, 0, 0, length3, length3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return Tile.obtain(256, 256, byteArrayOutputStream.toByteArray());
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileHeight() {
        return 256;
    }

    @Override // com.amap.api.maps.model.TileProvider
    public int getTileWidth() {
        return 256;
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        DEFAULT_GRADIENT_COLORS = iArr;
        float[] fArr = {0.2f, 1.0f};
        DEFAULT_GRADIENT_START_POINTS = fArr;
        DEFAULT_GRADIENT = new Gradient(iArr, fArr);
    }

    private HeatmapTileProvider(Builder builder) {
        this.mData = builder.data;
        this.mRadius = builder.radius;
        Gradient gradient = builder.gradient;
        this.mGradient = gradient;
        if (gradient == null || !gradient.isAvailable()) {
            this.mGradient = DEFAULT_GRADIENT;
        }
        this.mOpacity = builder.opacity;
        int i = this.mRadius;
        this.mKernel = a(i, i / 3.0d);
        a(this.mGradient);
        b(this.mData);
    }

    private double[] a(int i) {
        int i2;
        int i3 = 21;
        double[] dArr = new double[21];
        int i4 = 5;
        while (true) {
            if (i4 >= 11) {
                break;
            }
            Collection<WeightedLatLng> collection = this.mData;
            d4 d4Var = this.mBounds;
            int pow = (int) (Math.pow(2.0d, i4) * 1280.0d);
            double d = d4Var.f1599a;
            double d2 = d4Var.c;
            double d3 = d4Var.b;
            double d4 = d2 - d;
            double d5 = d4Var.d - d3;
            if (d4 <= d5) {
                d4 = d5;
            }
            double d6 = ((int) ((pow / (i * 2)) + 0.5d)) / d4;
            LongSparseArray longSparseArray = new LongSparseArray();
            Iterator<WeightedLatLng> it = collection.iterator();
            double d7 = 0.0d;
            while (it.hasNext()) {
                WeightedLatLng next = it.next();
                double d8 = next.getPoint().x;
                int i5 = i4;
                int i6 = (int) ((next.getPoint().y - d3) * d6);
                long j = (int) ((d8 - d) * d6);
                LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
                if (longSparseArray2 == null) {
                    longSparseArray2 = new LongSparseArray();
                    longSparseArray.put(j, longSparseArray2);
                }
                long j2 = i6;
                Double d9 = (Double) longSparseArray2.get(j2);
                if (d9 == null) {
                    d9 = Double.valueOf(0.0d);
                }
                double d10 = d6;
                Iterator<WeightedLatLng> it2 = it;
                Double valueOf = Double.valueOf(d9.doubleValue() + next.intensity);
                longSparseArray2.put(j2, valueOf);
                if (valueOf.doubleValue() > d7) {
                    d7 = valueOf.doubleValue();
                }
                it = it2;
                i4 = i5;
                d6 = d10;
            }
            int i7 = i4;
            dArr[i7] = d7;
            if (i7 == 5) {
                for (int i8 = 0; i8 < i7; i8++) {
                    dArr[i8] = dArr[i7];
                }
            }
            i4 = i7 + 1;
            i3 = 21;
        }
        for (i2 = 11; i2 < i3; i2++) {
            dArr[i2] = dArr[10];
        }
        return dArr;
    }

    static d4 a(Collection<WeightedLatLng> collection) {
        Iterator<WeightedLatLng> it = collection.iterator();
        WeightedLatLng next = it.next();
        double d = next.getPoint().x;
        double d2 = next.getPoint().x;
        double d3 = d;
        double d4 = d2;
        double d5 = next.getPoint().y;
        double d6 = next.getPoint().y;
        while (it.hasNext()) {
            WeightedLatLng next2 = it.next();
            double d7 = next2.getPoint().x;
            double d8 = next2.getPoint().y;
            if (d7 < d3) {
                d3 = d7;
            }
            if (d7 > d4) {
                d4 = d7;
            }
            if (d8 < d5) {
                d5 = d8;
            }
            if (d8 > d6) {
                d6 = d8;
            }
        }
        return new d4(d3, d4, d5, d6);
    }

    static double[] a(int i, double d) {
        double[] dArr = new double[(i * 2) + 1];
        for (int i2 = -i; i2 <= i; i2++) {
            dArr[i2 + i] = Math.exp(((-i2) * i2) / ((2.0d * d) * d));
        }
        return dArr;
    }
}
