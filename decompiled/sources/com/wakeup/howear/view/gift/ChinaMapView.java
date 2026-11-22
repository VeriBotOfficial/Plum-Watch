package com.wakeup.howear.view.gift;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.common.dfx.PayFeedbackLogHelper;
import com.wakeup.common.network.entity.gift.CityInfo;
import com.wakeup.feature.plans.ui.PlansLocationHelper;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import oqml.a;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: ChinaMapView.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010$\u001a\u00020%H\u0002J\u0010\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(H\u0002J\u0014\u0010)\u001a\u00020%2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eJ$\u0010+\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020,0\u000b2\u0006\u0010-\u001a\u00020\f2\u0006\u0010.\u001a\u00020\fH\u0002J\u0010\u0010/\u001a\u00020%2\u0006\u00100\u001a\u000201H\u0014R&\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000b0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\n0\u000b0\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lcom/wakeup/howear/view/gift/ChinaMapView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "cityCoords", "", "", "Lkotlin/Pair;", "", "cities", "", "Lcom/wakeup/common/network/entity/gift/CityInfo;", "provincePaths", "Landroid/graphics/Path;", "mapLoaded", "", "minLng", "maxLng", "minLat", "maxLat", "provinceFillPaint", "Landroid/graphics/Paint;", "provinceBorderPaint", "dotCompleted", "dotInProgress", "dotNotStarted", "glowCompleted", "glowInProgress", "textPaint", "subPaint", "bgPaint", "legendPaint", "loadGeoJson", "", "ringToPath", PayFeedbackLogHelper.BIZ_RING, "Lorg/json/JSONArray;", "setCities", "list", "geoToScreen", "", "lng", "lat", "onDraw", "canvas", "Landroid/graphics/Canvas;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ChinaMapView extends View {
    private final Paint bgPaint;
    private List<CityInfo> cities;
    private final Map<String, Pair<Double, Double>> cityCoords;
    private final Paint dotCompleted;
    private final Paint dotInProgress;
    private final Paint dotNotStarted;
    private final Paint glowCompleted;
    private final Paint glowInProgress;
    private final Paint legendPaint;
    private boolean mapLoaded;
    private double maxLat;
    private double maxLng;
    private double minLat;
    private double minLng;
    private final Paint provinceBorderPaint;
    private final Paint provinceFillPaint;
    private List<? extends Pair<? extends Path, String>> provincePaths;
    private final Paint subPaint;
    private final Paint textPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChinaMapView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ ChinaMapView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChinaMapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.cityCoords = MapsKt.mapOf(TuplesKt.to(PlansLocationHelper.DEFAULT_CITY, new Pair(Double.valueOf(116.4d), Double.valueOf(39.9d))), TuplesKt.to("天津", new Pair(Double.valueOf(117.2d), Double.valueOf(39.13d))), TuplesKt.to("上海", new Pair(Double.valueOf(121.47d), Double.valueOf(31.23d))), TuplesKt.to("重庆", new Pair(Double.valueOf(106.55d), Double.valueOf(29.56d))), TuplesKt.to("哈尔滨", new Pair(Double.valueOf(126.63d), Double.valueOf(45.75d))), TuplesKt.to("长春", new Pair(Double.valueOf(125.32d), Double.valueOf(43.88d))), TuplesKt.to("沈阳", new Pair(Double.valueOf(123.43d), Double.valueOf(41.8d))), TuplesKt.to("呼和浩特", new Pair(Double.valueOf(111.75d), Double.valueOf(40.84d))), TuplesKt.to("石家庄", new Pair(Double.valueOf(114.51d), Double.valueOf(38.04d))), TuplesKt.to("太原", new Pair(Double.valueOf(112.55d), Double.valueOf(37.87d))), TuplesKt.to("济南", new Pair(Double.valueOf(117.0d), Double.valueOf(36.67d))), TuplesKt.to("郑州", new Pair(Double.valueOf(113.65d), Double.valueOf(34.76d))), TuplesKt.to("西安", new Pair(Double.valueOf(108.94d), Double.valueOf(34.26d))), TuplesKt.to("兰州", new Pair(Double.valueOf(103.83d), Double.valueOf(36.06d))), TuplesKt.to("银川", new Pair(Double.valueOf(106.27d), Double.valueOf(38.47d))), TuplesKt.to("西宁", new Pair(Double.valueOf(101.78d), Double.valueOf(36.62d))), TuplesKt.to("乌鲁木齐", new Pair(Double.valueOf(87.62d), Double.valueOf(43.83d))), TuplesKt.to("拉萨", new Pair(Double.valueOf(91.11d), Double.valueOf(29.65d))), TuplesKt.to("成都", new Pair(Double.valueOf(104.07d), Double.valueOf(30.57d))), TuplesKt.to("昆明", new Pair(Double.valueOf(102.83d), Double.valueOf(25.02d))), TuplesKt.to("贵阳", new Pair(Double.valueOf(106.71d), Double.valueOf(26.57d))), TuplesKt.to("南宁", new Pair(Double.valueOf(108.37d), Double.valueOf(22.82d))), TuplesKt.to("海口", new Pair(Double.valueOf(110.35d), Double.valueOf(20.02d))), TuplesKt.to("广州", new Pair(Double.valueOf(113.26d), Double.valueOf(23.13d))), TuplesKt.to("长沙", new Pair(Double.valueOf(112.94d), Double.valueOf(28.23d))), TuplesKt.to("武汉", new Pair(Double.valueOf(114.3d), Double.valueOf(30.59d))), TuplesKt.to("南昌", new Pair(Double.valueOf(115.89d), Double.valueOf(28.68d))), TuplesKt.to("合肥", new Pair(Double.valueOf(117.28d), Double.valueOf(31.86d))), TuplesKt.to("南京", new Pair(Double.valueOf(118.8d), Double.valueOf(32.06d))), TuplesKt.to("杭州", new Pair(Double.valueOf(120.15d), Double.valueOf(30.28d))), TuplesKt.to("福州", new Pair(Double.valueOf(119.3d), Double.valueOf(26.08d))), TuplesKt.to("厦门", new Pair(Double.valueOf(118.09d), Double.valueOf(24.48d))));
        this.cities = CollectionsKt.emptyList();
        this.provincePaths = CollectionsKt.emptyList();
        this.minLng = 73.0d;
        this.maxLng = 136.0d;
        this.minLat = 17.0d;
        this.maxLat = 54.0d;
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#EEF1F5"));
        paint.setStyle(Paint.Style.FILL);
        this.provinceFillPaint = paint;
        Paint paint2 = new Paint(1);
        paint2.setColor(Color.parseColor("#C0C8D4"));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(1.2f);
        this.provinceBorderPaint = paint2;
        Paint paint3 = new Paint(1);
        paint3.setColor(Color.parseColor("#4CAF50"));
        paint3.setStyle(Paint.Style.FILL);
        this.dotCompleted = paint3;
        Paint paint4 = new Paint(1);
        paint4.setColor(Color.parseColor("#FF6B35"));
        paint4.setStyle(Paint.Style.FILL);
        this.dotInProgress = paint4;
        Paint paint5 = new Paint(1);
        paint5.setColor(Color.parseColor("#BDBDBD"));
        paint5.setStyle(Paint.Style.FILL);
        this.dotNotStarted = paint5;
        Paint paint6 = new Paint(1);
        paint6.setColor(Color.parseColor("#304CAF50"));
        paint6.setStyle(Paint.Style.FILL);
        this.glowCompleted = paint6;
        Paint paint7 = new Paint(1);
        paint7.setColor(Color.parseColor("#30FF6B35"));
        paint7.setStyle(Paint.Style.FILL);
        this.glowInProgress = paint7;
        Paint paint8 = new Paint(1);
        paint8.setTextSize(24.0f);
        paint8.setTextAlign(Paint.Align.CENTER);
        paint8.setTypeface(Typeface.DEFAULT_BOLD);
        this.textPaint = paint8;
        Paint paint9 = new Paint(1);
        paint9.setTextSize(18.0f);
        paint9.setTextAlign(Paint.Align.CENTER);
        paint9.setColor(Color.parseColor(a.C1008a.f18760a));
        this.subPaint = paint9;
        Paint paint10 = new Paint(1);
        paint10.setColor(Color.parseColor("#FAFAFA"));
        paint10.setStyle(Paint.Style.FILL);
        this.bgPaint = paint10;
        Paint paint11 = new Paint(1);
        paint11.setTextSize(20.0f);
        paint11.setColor(Color.parseColor(a.C1008a.f18760a));
        this.legendPaint = paint11;
        loadGeoJson();
    }

    private final void loadGeoJson() {
        new Thread(new Runnable() { // from class: com.wakeup.howear.view.gift.ChinaMapView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ChinaMapView.loadGeoJson$lambda$11(ChinaMapView.this);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadGeoJson$lambda$11(ChinaMapView chinaMapView) {
        try {
            InputStream open = chinaMapView.getContext().getAssets().open("china.json");
            Intrinsics.checkNotNullExpressionValue(open, "open(...)");
            Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
            JSONArray jSONArray = new JSONObject(TextStreamsKt.readText(inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192))).getJSONArray("features");
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String optString = jSONObject.getJSONObject(DOMConstants.TAG_PROPERTIES).optString("name", "");
                JSONObject jSONObject2 = jSONObject.getJSONObject("geometry");
                String string = jSONObject2.getString("type");
                JSONArray jSONArray2 = jSONObject2.getJSONArray("coordinates");
                ArrayList arrayList2 = new ArrayList();
                if (Intrinsics.areEqual(string, "Polygon")) {
                    JSONArray jSONArray3 = jSONArray2.getJSONArray(0);
                    Intrinsics.checkNotNull(jSONArray3);
                    arrayList2.add(chinaMapView.ringToPath(jSONArray3));
                } else if (Intrinsics.areEqual(string, "MultiPolygon")) {
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONArray jSONArray4 = jSONArray2.getJSONArray(i2).getJSONArray(0);
                        Intrinsics.checkNotNull(jSONArray4);
                        arrayList2.add(chinaMapView.ringToPath(jSONArray4));
                    }
                }
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new Pair((Path) it.next(), optString));
                }
            }
            chinaMapView.provincePaths = arrayList;
            chinaMapView.mapLoaded = true;
            chinaMapView.postInvalidate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final Path ringToPath(JSONArray ring) {
        Path path = new Path();
        int length = ring.length();
        for (int i = 0; i < length; i++) {
            JSONArray jSONArray = ring.getJSONArray(i);
            double d = jSONArray.getDouble(0);
            double d2 = jSONArray.getDouble(1);
            if (i == 0) {
                path.moveTo((float) d, (float) d2);
            } else {
                path.lineTo((float) d, (float) d2);
            }
        }
        path.close();
        return path;
    }

    public final void setCities(List<CityInfo> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.cities = list;
        invalidate();
    }

    private final Pair<Float, Float> geoToScreen(double lng, double lat) {
        float f = 2 * 30.0f;
        float height = (getHeight() - f) - 30.0f;
        double d = this.minLng;
        float width = ((float) (((lng - d) / (this.maxLng - d)) * (getWidth() - f))) + 30.0f;
        double d2 = this.maxLat;
        return new Pair<>(Float.valueOf(width), Float.valueOf(((float) (((d2 - lat) / (d2 - this.minLat)) * height)) + 30.0f));
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Paint paint;
        int parseColor;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawRoundRect(new RectF(0.0f, 0.0f, getWidth(), getHeight()), 20.0f, 20.0f, this.bgPaint);
        if (!this.mapLoaded) {
            return;
        }
        float f = 2 * 30.0f;
        float width = getWidth() - f;
        float height = (getHeight() - f) - 30.0f;
        Matrix matrix = new Matrix();
        double d = width;
        double d2 = height;
        matrix.postScale((float) (d / (this.maxLng - this.minLng)), -((float) (d2 / (this.maxLat - this.minLat))));
        double d3 = 30.0f;
        double d4 = this.minLng;
        float f2 = (float) (d3 - ((d * d4) / (this.maxLng - d4)));
        double d5 = this.maxLat;
        matrix.postTranslate(f2, (float) (d3 + ((d2 * d5) / (d5 - this.minLat))));
        Iterator<? extends Pair<? extends Path, String>> it = this.provincePaths.iterator();
        while (it.hasNext()) {
            Path component1 = it.next().component1();
            Path path = new Path();
            component1.transform(matrix, path);
            canvas.drawPath(path, this.provinceFillPaint);
            canvas.drawPath(path, this.provinceBorderPaint);
        }
        Iterator<CityInfo> it2 = this.cities.iterator();
        while (true) {
            if (it2.hasNext()) {
                CityInfo next = it2.next();
                Pair<Double, Double> pair = this.cityCoords.get(next.getName());
                if (pair != null) {
                    Pair<Float, Float> geoToScreen = geoToScreen(pair.getFirst().doubleValue(), pair.getSecond().doubleValue());
                    float floatValue = geoToScreen.component1().floatValue();
                    float floatValue2 = geoToScreen.component2().floatValue();
                    boolean completed = next.getCompleted();
                    boolean z = next.getChecked_points() > 0;
                    if (completed) {
                        canvas.drawCircle(floatValue, floatValue2, 20.0f, this.glowCompleted);
                    } else if (z) {
                        canvas.drawCircle(floatValue, floatValue2, 20.0f, this.glowInProgress);
                    }
                    if (completed) {
                        paint = this.dotCompleted;
                    } else if (z) {
                        paint = this.dotInProgress;
                    } else {
                        paint = this.dotNotStarted;
                    }
                    canvas.drawCircle(floatValue, floatValue2, (completed || z) ? 10.0f : 6.0f, paint);
                    Paint paint2 = this.textPaint;
                    if (completed) {
                        parseColor = Color.parseColor("#4CAF50");
                    } else if (z) {
                        parseColor = Color.parseColor("#FF6B35");
                    } else {
                        parseColor = Color.parseColor("#AAAAAA");
                    }
                    paint2.setColor(parseColor);
                    canvas.drawText(next.getName(), floatValue, floatValue2 - 18.0f, this.textPaint);
                    canvas.drawText(next.getChecked_points() + "/" + next.getTotal_points(), floatValue, floatValue2 + 28.0f, this.subPaint);
                }
            } else {
                float height2 = getHeight() - 16.0f;
                canvas.drawCircle(24.0f, height2, 5.0f, this.dotCompleted);
                float f3 = 6.0f + height2;
                canvas.drawText("已完成", 38.0f, f3, this.legendPaint);
                canvas.drawCircle(110.0f, height2, 5.0f, this.dotInProgress);
                canvas.drawText("进行中", 124.0f, f3, this.legendPaint);
                canvas.drawCircle(196.0f, height2, 5.0f, this.dotNotStarted);
                canvas.drawText("未开始", 210.0f, f3, this.legendPaint);
                return;
            }
        }
    }
}
