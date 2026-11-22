package com.wakeup.feature.health.menstrual.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.storage.model.MenstrualEntity;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.commonui.utils.DrawTextUtils;
import com.wakeup.commonui.utils.UIHelper;
import com.wakeup.commponent.module.health.MenstrualType;
import com.wakeup.commponent.module.health.MenstrualUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MenstrualView.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00072\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0007H\u0014J\u0010\u0010&\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0014J\u0018\u0010)\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0007H\u0002J\u0010\u0010+\u001a\u00020!2\u0006\u0010'\u001a\u00020(H\u0002J&\u0010,\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J&\u00100\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00072\f\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.H\u0002J0\u00101\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u000206H\u0002J0\u00107\u001a\u00020!2\u0006\u0010'\u001a\u00020(2\u0006\u00102\u001a\u00020\u00072\u0006\u00103\u001a\u00020\u00072\u0006\u00104\u001a\u00020\u00072\u0006\u00105\u001a\u000206H\u0002J\u000e\u00108\u001a\u00020!2\u0006\u00109\u001a\u00020\u001eJ\b\u0010:\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;"}, d2 = {"Lcom/wakeup/feature/health/menstrual/view/MenstrualView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bgPaint", "Landroid/graphics/Paint;", "forecastPaint", "forecastBgPaint", "dataPaint", "dataLinePaint", "textPaint", "dotRadius", "dotBaseLine", "lineInterval", "dp4", "dp5", "dp7", "dp8", "dp9", "dp14", "dotInterval", "mViewWidth", "mViewHeight", Const.LBS_FAIL_BD_ENTITY, "Lcom/wakeup/common/storage/model/MenstrualEntity;", "weekNumber", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "drawLineDot", "baseY", "drawDate", "drawLineData", "list", "", "Lcom/wakeup/commponent/module/health/MenstrualType;", "drawDataLine", "drawToday", "cx", "cy", "type", "isForecast", "", "drawNormal", "setData", "menstrualEntity", "getWeek", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MenstrualView extends View {
    public static final int $stable = 8;
    private final Paint bgPaint;
    private final Paint dataLinePaint;
    private final Paint dataPaint;
    private final int dotBaseLine;
    private int dotInterval;
    private final int dotRadius;
    private final int dp14;
    private final int dp4;
    private final int dp5;
    private final int dp7;
    private final int dp8;
    private final int dp9;
    private MenstrualEntity entity;
    private final Paint forecastBgPaint;
    private final Paint forecastPaint;
    private final int lineInterval;
    private int mViewHeight;
    private int mViewWidth;
    private final Paint textPaint;
    private final int weekNumber;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenstrualView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MenstrualView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MenstrualView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MenstrualView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.bgPaint = paint;
        Paint paint2 = new Paint(1);
        this.forecastPaint = paint2;
        Paint paint3 = new Paint(1);
        this.forecastBgPaint = paint3;
        this.dataPaint = new Paint(1);
        Paint paint4 = new Paint(1);
        this.dataLinePaint = paint4;
        Paint paint5 = new Paint(1);
        this.textPaint = paint5;
        this.dotRadius = UIHelper.dp2px(5.0f);
        this.dotBaseLine = UIHelper.dp2px(14.0f);
        this.lineInterval = UIHelper.dp2px(20.0f);
        this.dp4 = UIHelper.dp2px(4.0f);
        this.dp5 = UIHelper.dp2px(5.0f);
        this.dp7 = UIHelper.dp2px(7.0f);
        this.dp8 = UIHelper.dp2px(8.0f);
        this.dp9 = UIHelper.dp2px(9.0f);
        this.dp14 = UIHelper.dp2px(14.0f);
        setLayerType(1, null);
        paint.setColor(Color.parseColor("#F1F3F5"));
        paint.setStrokeWidth(UIHelper.dp2px(2.0f));
        paint4.setStrokeWidth(UIHelper.dp2px(2.0f));
        paint5.setColor(-1);
        paint5.setTextSize(UIHelper.dp2px(8.0f));
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(Color.parseColor("#FD5B7A"));
        paint2.setPathEffect(new DashPathEffect(new float[]{2.0f, 2.0f}, 0.0f));
        paint2.setStrokeWidth(UIHelper.dp2px(1.0f));
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(-1);
        this.weekNumber = getWeek();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mViewWidth = w;
        this.mViewHeight = h;
        this.dotInterval = (w - (this.dp14 * 7)) / 6;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        drawLineDot(canvas, this.dotBaseLine);
        drawLineDot(canvas, this.dotBaseLine + this.lineInterval);
        int i = this.dotBaseLine;
        int i2 = this.lineInterval;
        drawLineDot(canvas, i + i2 + i2);
        drawDate(canvas);
    }

    private final void drawLineDot(Canvas canvas, int baseY) {
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < 8; i3++) {
            int i4 = this.dp8 + ((this.dotInterval + this.dp14) * i3);
            if (i3 == 0) {
                i = i4;
            }
            if (i3 == 6) {
                i2 = i4;
            }
            canvas.drawCircle(i4, baseY, this.dotRadius, this.bgPaint);
        }
        float f = baseY;
        canvas.drawLine(i, f, i2, f, this.bgPaint);
    }

    private final void drawDate(Canvas canvas) {
        if (this.entity == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        long time = MenstrualUtils.getTime(DateUtil.addDay(System.currentTimeMillis(), -this.weekNumber) / 1000) * 1000;
        for (int i = 0; i < 21; i++) {
            arrayList.add(MenstrualUtils.calculationType(DateUtil.addDay(time, i) / 1000, this.entity));
        }
        int i2 = this.dotBaseLine;
        List<MenstrualType> subList = arrayList.subList(0, 7);
        Intrinsics.checkNotNullExpressionValue(subList, "subList(...)");
        drawLineData(canvas, i2, subList);
        int i3 = this.dotBaseLine + this.lineInterval;
        List<MenstrualType> subList2 = arrayList.subList(7, 14);
        Intrinsics.checkNotNullExpressionValue(subList2, "subList(...)");
        drawLineData(canvas, i3, subList2);
        int i4 = this.dotBaseLine;
        int i5 = this.lineInterval;
        List<MenstrualType> subList3 = arrayList.subList(14, 21);
        Intrinsics.checkNotNullExpressionValue(subList3, "subList(...)");
        drawLineData(canvas, i4 + i5 + i5, subList3);
    }

    private final void drawLineData(Canvas canvas, int baseY, List<MenstrualType> list) {
        MenstrualView menstrualView = this;
        drawDataLine(canvas, baseY, list);
        MenstrualEntity menstrualEntity = menstrualView.entity;
        Intrinsics.checkNotNull(menstrualEntity);
        long startTime = menstrualEntity.getStartTime() * 1000;
        MenstrualEntity menstrualEntity2 = menstrualView.entity;
        Intrinsics.checkNotNull(menstrualEntity2);
        long addDay = DateUtil.addDay(startTime, menstrualEntity2.getSeveralDay() - 1) / 1000;
        int i = 0;
        while (i < 7) {
            int i2 = ((menstrualView.dotInterval + menstrualView.dp14) * i) + menstrualView.dp8;
            MenstrualType menstrualType = list.get(i);
            menstrualView.bgPaint.setStyle(Paint.Style.FILL);
            boolean z = menstrualType.getTime() > addDay;
            if (DateUtil.isSameDay((int) menstrualType.getTime(), (int) (System.currentTimeMillis() / 1000))) {
                menstrualView.drawToday(canvas, i2, baseY, menstrualType.getType(), z);
            } else {
                drawNormal(canvas, i2, baseY, menstrualType.getType(), z);
            }
            i++;
            menstrualView = this;
        }
    }

    private final void drawDataLine(Canvas canvas, int baseY, List<MenstrualType> list) {
        ArrayList<Pair> arrayList = new ArrayList();
        int i = 0;
        int i2 = 0;
        int i3 = 3;
        for (int i4 = 0; i4 < 7; i4++) {
            int i5 = this.dp8 + ((this.dotInterval + this.dp14) * i4);
            MenstrualType menstrualType = list.get(i4);
            if (i != 0 || menstrualType.getType() == 3) {
                if (i != 0) {
                    if (menstrualType.getType() == 3) {
                        if (i2 != 0) {
                            arrayList.add(new Pair(Integer.valueOf(i3), new Pair(Integer.valueOf(i), Integer.valueOf(i2))));
                        }
                    } else if (menstrualType.getType() != i3) {
                        if (i2 != 0) {
                            arrayList.add(new Pair(Integer.valueOf(i3), new Pair(Integer.valueOf(i), Integer.valueOf(i2))));
                        }
                        i3 = menstrualType.getType();
                        i2 = 0;
                    } else {
                        if (i4 == 6) {
                            arrayList.add(new Pair(Integer.valueOf(menstrualType.getType()), new Pair(Integer.valueOf(i), Integer.valueOf(i5))));
                        } else {
                            i3 = menstrualType.getType();
                        }
                        i2 = i5;
                    }
                }
            } else {
                i3 = menstrualType.getType();
            }
            i = i5;
        }
        for (Pair pair : arrayList) {
            int intValue = ((Number) pair.getFirst()).intValue();
            int intValue2 = ((Number) ((Pair) pair.getSecond()).getFirst()).intValue();
            int intValue3 = ((Number) ((Pair) pair.getSecond()).getSecond()).intValue();
            if (intValue == 1) {
                this.dataLinePaint.setColor(Color.parseColor("#FFF2F5"));
            } else {
                this.dataLinePaint.setColor(Color.parseColor("#D6EAFF"));
            }
            float f = baseY;
            canvas.drawLine(intValue2, f, intValue3, f, this.dataLinePaint);
        }
    }

    private final void drawToday(Canvas canvas, int cx, int cy, int type, boolean isForecast) {
        if (type == 1) {
            this.textPaint.setColor(isForecast ? Color.parseColor("#FD5B7A") : -1);
            this.dataPaint.setColor(Color.parseColor("#FE9EB1"));
            this.forecastPaint.setColor(Color.parseColor("#FE9EB1"));
        } else if (type == 2) {
            this.textPaint.setColor(-1);
            this.dataPaint.setColor(Color.parseColor("#70B6FE"));
            this.forecastPaint.setColor(Color.parseColor("#70B6FE"));
        } else {
            this.textPaint.setColor(Color.parseColor("#666666"));
            this.dataPaint.setColor(Color.parseColor("#F1F3F5"));
        }
        if (isForecast) {
            int i = this.dp7;
            int i2 = this.dp9;
            canvas.drawRoundRect(cx - i, cy - i2, cx + i, i2 + cy, i, i, this.forecastBgPaint);
        }
        int i3 = this.dp7;
        float f = cx - i3;
        int i4 = this.dp9;
        canvas.drawRoundRect(f, cy - i4, cx + i3, i4 + cy, i3, i3, (isForecast && type == 1) ? this.forecastPaint : this.dataPaint);
        String valueOf = String.valueOf(Calendar.getInstance().get(5));
        canvas.drawText(valueOf, cx - (DrawTextUtils.getTextWidth(valueOf, this.textPaint) / 2), cy + DrawTextUtils.getTextCenterHeight(this.textPaint), this.textPaint);
    }

    private final void drawNormal(Canvas canvas, int cx, int cy, int type, boolean isForecast) {
        if (type == 3) {
            return;
        }
        if (type == 1) {
            int parseColor = Color.parseColor("#FE9EB1");
            this.forecastPaint.setColor(parseColor);
            this.dataPaint.setColor(parseColor);
        } else if (type == 2) {
            int parseColor2 = Color.parseColor("#70B6FE");
            this.forecastPaint.setColor(parseColor2);
            this.dataPaint.setColor(parseColor2);
        }
        if (isForecast) {
            int i = this.dp4;
            int i2 = this.dp5;
            canvas.drawRoundRect(cx - i, cy - i2, cx + i, cy + i2, i, i, this.forecastBgPaint);
        }
        int i3 = this.dp4;
        float f = cx - i3;
        int i4 = this.dp5;
        canvas.drawRoundRect(f, cy - i4, cx + i3, cy + i4, i3, i3, (isForecast && type == 1) ? this.forecastPaint : this.dataPaint);
    }

    public final void setData(MenstrualEntity menstrualEntity) {
        Intrinsics.checkNotNullParameter(menstrualEntity, "menstrualEntity");
        this.entity = menstrualEntity;
        invalidate();
    }

    private final int getWeek() {
        switch (Calendar.getInstance().get(7)) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                return 6;
        }
    }
}
