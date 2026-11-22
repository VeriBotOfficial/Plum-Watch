package com.wakeup.commonui.chart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.utils.NumberUtils;
import com.wakeup.commonui.R;
import com.wakeup.commonui.chart.data.SleepData;
import com.wakeup.commonui.chart.data.SleepTypeData;
import com.wakeup.commonui.utils.DrawTextUtils;
import com.wakeup.commonui.utils.UIHelper;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import oqml.a;

/* loaded from: classes2.dex */
public class SleepChart extends ViewGroup {
    protected float drawPadding;
    private float drawTextPadding;
    private final String[] emptyDataLabel;
    private String endDayText;
    private String endTimeText;
    private boolean isDrawIndicator;
    private float labelOffset;
    private float labelSpace;
    private float labelWidth;
    private int mAwakeColor;
    private float mConnectLineWidth;
    private SleepData mData;
    private float mDataPaintWidth;
    private int mDeepColor;
    private final MyGestureDetector mDetector;
    private final IndicatorDrawHelp mDrawHelp;
    private float mIndicatorX;
    private List<SleepDrawRecord> mList;
    private final Paint mPaintAwake;
    private final Paint mPaintConnect;
    private final Paint mPaintDeep;
    private final Paint mPaintShallow;
    private final Paint mPaintText;
    private SleepTypeData mSelectData;
    private OnSelectListener mSelectListener;
    private int mShallowColor;
    private int mViewHeight;
    private int mViewWidth;
    private boolean plainBar;
    protected float sleepDrawBottom;
    protected float sleepDrawRadius;
    private final SleepPath sleepPath;
    protected float sleepRectHeight;
    protected float sleepShallowY;
    private String startDayText;
    private String startTimeText;
    private int totalMinute;

    public interface OnSelectListener {
        void onSelect(SleepTypeData sleepTypeData);
    }

    private float getTextYOffset(float f, float f2) {
        return 0.0f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public SleepChart(Context context) {
        this(context, null);
    }

    public SleepChart(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public SleepChart(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mDetector = new MyGestureDetector();
        this.mDrawHelp = new IndicatorDrawHelp();
        this.sleepPath = new SleepPath(this);
        this.mAwakeColor = Color.parseColor("#FC8281");
        this.mShallowColor = Color.parseColor("#C54BE4");
        this.mDeepColor = Color.parseColor("#892BE2");
        this.mList = new ArrayList();
        this.isDrawIndicator = true;
        this.emptyDataLabel = new String[]{"20:00", "02:00", "08:00", "14:00", "20:00"};
        this.labelOffset = UIHelper.dp2px(6.0f);
        setBackgroundColor(-1);
        this.drawTextPadding = UIHelper.dp2px(12.0f);
        this.drawPadding = UIHelper.dp2px(24.0f);
        this.sleepRectHeight = UIHelper.dp2px(16.0f);
        this.sleepDrawRadius = UIHelper.dp2px(2.0f);
        this.mConnectLineWidth = UIHelper.dp2px(1.0f);
        this.mDataPaintWidth = UIHelper.dp2px(1.0f);
        this.mDeepColor = ContextCompat.getColor(context, R.color.color_sleep_deep);
        this.mShallowColor = ContextCompat.getColor(context, R.color.color_sleep_shallow);
        this.mAwakeColor = ContextCompat.getColor(context, R.color.color_sleep_wake);
        Paint paint = new Paint(1);
        this.mPaintText = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setTextSize(UIHelper.dp2px(10.0f));
        Paint paint2 = new Paint(1);
        this.mPaintDeep = paint2;
        paint2.setColor(this.mDeepColor);
        paint2.setPathEffect(new CornerPathEffect(this.sleepDrawRadius));
        paint2.setStrokeWidth(this.mDataPaintWidth);
        Paint paint3 = new Paint(1);
        this.mPaintShallow = paint3;
        paint3.setColor(this.mShallowColor);
        paint3.setPathEffect(new CornerPathEffect(this.sleepDrawRadius));
        paint3.setStrokeWidth(this.mDataPaintWidth);
        Paint paint4 = new Paint(1);
        this.mPaintAwake = paint4;
        paint4.setColor(this.mAwakeColor);
        paint4.setPathEffect(new CornerPathEffect(this.sleepDrawRadius));
        paint4.setStrokeWidth(this.mDataPaintWidth);
        Paint paint5 = new Paint(1);
        this.mPaintConnect = paint5;
        paint5.setStrokeWidth(this.mConnectLineWidth);
        Calendar calendar = Calendar.getInstance();
        calendar.set(10, 20);
        calendar.set(12, 0);
        this.startDayText = formatDay(calendar.getTimeInMillis() / 1000);
        this.startTimeText = formatTime(calendar.getTimeInMillis() / 1000);
        calendar.add(5, 1);
        calendar.set(10, 8);
        calendar.set(12, 0);
        this.endDayText = formatDay(calendar.getTimeInMillis() / 1000);
        this.endTimeText = formatTime(calendar.getTimeInMillis() / 1000);
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.mViewWidth = i;
        this.mViewHeight = i2;
        float dp2px = i2 - UIHelper.dp2px(56.0f);
        this.sleepDrawBottom = dp2px;
        this.sleepShallowY = (dp2px / 2.0f) - (this.sleepRectHeight / 2.0f);
        float textWidth = DrawTextUtils.getTextWidth(this.emptyDataLabel[0], this.mPaintText);
        this.labelWidth = textWidth;
        this.labelSpace = (this.mViewWidth - (textWidth * 5.0f)) / 4.0f;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.isDrawIndicator) {
            return super.onTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(this.mDetector.onTouch(motionEvent));
        float x = motionEvent.getX();
        this.mIndicatorX = x;
        float f = this.drawPadding;
        if (x < f) {
            this.mIndicatorX = f;
        } else {
            int i = this.mViewWidth;
            if (x > i - f) {
                this.mIndicatorX = i - f;
            }
        }
        if (motionEvent.getAction() != 0) {
            checkSelected();
        }
        invalidate();
        return true;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawSleep(canvas);
        SleepData sleepData = this.mData;
        if (sleepData == null || CollectionUtils.isEmpty(sleepData.getDataList())) {
            drawEmptyLabel(canvas);
        } else {
            drawText(canvas);
        }
        if (this.isDrawIndicator) {
            this.mDrawHelp.drawIndicatorLine(canvas, 10.0f, this.mViewHeight - UIHelper.dp2px(46.0f), this.mIndicatorX);
        }
    }

    private void drawSleep(Canvas canvas) {
        Canvas canvas2;
        SleepChart sleepChart;
        SleepData sleepData = this.mData;
        if (sleepData != null) {
            List<SleepTypeData> dataList = sleepData.getDataList();
            this.mList.clear();
            if (this.plainBar && dataList.size() == 1) {
                drawSingleSleepBar(canvas, dataList.get(0));
                return;
            }
            ArrayList arrayList = new ArrayList();
            float f = 0.0f;
            for (SleepTypeData sleepTypeData : dataList) {
                float sleepWidth = getSleepWidth(sleepTypeData.getDuration());
                if (sleepWidth < 14.0f) {
                    f += 14.0f - sleepWidth;
                } else {
                    arrayList.add(sleepTypeData);
                }
            }
            float size = arrayList.size() > 0 ? f / arrayList.size() : 0.0f;
            int i = 0;
            float f2 = this.drawPadding;
            while (i < dataList.size()) {
                SleepTypeData sleepTypeData2 = dataList.get(i);
                float sleepWidth2 = getSleepWidth(sleepTypeData2.getDuration());
                float f3 = sleepWidth2 < 14.0f ? 14.0f : sleepWidth2 - size;
                if (i != 0) {
                    f3 += this.mDataPaintWidth;
                }
                float f4 = f3;
                if (sleepTypeData2.getType() == 1) {
                    sleepChart = this;
                    canvas2 = canvas;
                    sleepChart.drawSleepShallow(canvas2, i, dataList, f2, f4);
                } else {
                    canvas2 = canvas;
                    if (sleepTypeData2.getType() == 2) {
                        sleepChart = this;
                        sleepChart.drawSleepDeep(canvas2, i, dataList, f2, f4);
                    } else {
                        sleepChart = this;
                        sleepChart.drawSleepAwake(canvas2, i, dataList, f2, f4);
                    }
                }
                sleepChart.mList.add(new SleepDrawRecord(f2, f2 + f4, sleepTypeData2));
                f2 += f4 - sleepChart.mDataPaintWidth;
                i++;
                canvas = canvas2;
            }
        }
    }

    private void drawSingleSleepBar(Canvas canvas, SleepTypeData sleepTypeData) {
        float f = this.drawPadding;
        float f2 = this.mViewWidth - (f * 2.0f);
        float dp2px = UIHelper.dp2px(32.0f);
        float dp2px2 = UIHelper.dp2px(8.0f);
        float f3 = (this.sleepDrawBottom - dp2px) / 2.0f;
        if (f3 < UIHelper.dp2px(12.0f)) {
            f3 = UIHelper.dp2px(12.0f);
        }
        Paint paint = new Paint(1);
        paint.setColor(Color.parseColor("#8A81F8"));
        float f4 = f2 + f;
        canvas.drawRoundRect(new RectF(f, f3, f4, dp2px + f3), dp2px2, dp2px2, paint);
        this.mList.add(new SleepDrawRecord(f, f4, sleepTypeData));
    }

    private int preDataType(int i, List<SleepTypeData> list) {
        if (i == 0) {
            return -1;
        }
        return list.get(i - 1).getType();
    }

    private int afterDataType(int i, List<SleepTypeData> list) {
        if (i == list.size() - 1) {
            return -1;
        }
        return list.get(i + 1).getType();
    }

    private void drawSleepAwake(Canvas canvas, int i, List<SleepTypeData> list, float f, float f2) {
        float f3;
        LinearGradient linearGradient;
        canvas.drawPath(this.sleepPath.getConvexPath(f, f2, 0.0f), this.mPaintAwake);
        int afterDataType = afterDataType(i, list);
        if (afterDataType == -1) {
            return;
        }
        float f4 = (f + f2) - (this.mConnectLineWidth / 2.0f);
        float f5 = this.sleepRectHeight;
        if (afterDataType == 1) {
            f3 = this.sleepShallowY;
            linearGradient = new LinearGradient(0.0f, f5, 0.0f, f3, this.mAwakeColor, this.mShallowColor, Shader.TileMode.CLAMP);
        } else {
            f3 = this.sleepDrawBottom - f5;
            linearGradient = new LinearGradient(0.0f, f5, 0.0f, f3, this.mAwakeColor, this.mDeepColor, Shader.TileMode.CLAMP);
        }
        this.mPaintConnect.setShader(linearGradient);
        canvas.drawLine(f4, f5, f4, f3, this.mPaintConnect);
    }

    private void drawSleepShallow(Canvas canvas, int i, List<SleepTypeData> list, float f, float f2) {
        Path lowUpPath;
        Path convexPath;
        Path convexPath2;
        Path convexPath3;
        int preDataType = preDataType(i, list);
        int afterDataType = afterDataType(i, list);
        if (preDataType == -1) {
            if (afterDataType == 3) {
                convexPath3 = this.sleepPath.getConcavePath(f, f2, this.sleepShallowY + this.sleepRectHeight);
            } else {
                convexPath3 = this.sleepPath.getConvexPath(f, f2, this.sleepShallowY);
            }
            canvas.drawPath(convexPath3, this.mPaintShallow);
            drawSleepShallowConnectLine(canvas, afterDataType, f, f2);
            return;
        }
        if (afterDataType == -1) {
            if (preDataType == 3) {
                convexPath2 = this.sleepPath.getConcavePath(f, f2, this.sleepShallowY + this.sleepRectHeight);
            } else {
                convexPath2 = this.sleepPath.getConvexPath(f, f2, this.sleepShallowY);
            }
            canvas.drawPath(convexPath2, this.mPaintShallow);
            drawSleepShallowConnectLine(canvas, afterDataType, f, f2);
            return;
        }
        if (preDataType == afterDataType) {
            if (preDataType == 3) {
                convexPath = this.sleepPath.getConcavePath(f, f2, this.sleepShallowY + this.sleepRectHeight);
            } else {
                convexPath = this.sleepPath.getConvexPath(f, f2, this.sleepShallowY);
            }
            canvas.drawPath(convexPath, this.mPaintShallow);
            drawSleepShallowConnectLine(canvas, afterDataType, f, f2);
            return;
        }
        if (preDataType == 3 && afterDataType == 2) {
            lowUpPath = this.sleepPath.getUpLowPath(f, f2, this.sleepShallowY);
        } else {
            lowUpPath = this.sleepPath.getLowUpPath(f, f2, this.sleepShallowY);
        }
        canvas.drawPath(lowUpPath, this.mPaintShallow);
        drawSleepShallowConnectLine(canvas, afterDataType, f, f2);
    }

    private void drawSleepShallowConnectLine(Canvas canvas, int i, float f, float f2) {
        float f3;
        float f4;
        LinearGradient linearGradient;
        if (i == -1) {
            return;
        }
        float f5 = (f + f2) - (this.mConnectLineWidth / 2.0f);
        if (i == 3) {
            f3 = this.sleepShallowY;
            f4 = this.sleepRectHeight;
            linearGradient = new LinearGradient(0.0f, f3, 0.0f, f4, this.mShallowColor, this.mAwakeColor, Shader.TileMode.CLAMP);
        } else {
            float f6 = this.sleepShallowY;
            float f7 = this.sleepRectHeight;
            f3 = f6 + f7;
            f4 = this.sleepDrawBottom - f7;
            linearGradient = new LinearGradient(0.0f, f3, 0.0f, f4, this.mShallowColor, this.mDeepColor, Shader.TileMode.CLAMP);
        }
        this.mPaintConnect.setShader(linearGradient);
        canvas.drawLine(f5, f3, f5, f4, this.mPaintConnect);
    }

    private void drawSleepDeep(Canvas canvas, int i, List<SleepTypeData> list, float f, float f2) {
        LinearGradient linearGradient;
        float f3;
        canvas.drawPath(this.sleepPath.getConcavePath(f, f2, this.sleepDrawBottom), this.mPaintDeep);
        int afterDataType = afterDataType(i, list);
        if (afterDataType == -1) {
            return;
        }
        float f4 = (f + f2) - (this.mConnectLineWidth / 2.0f);
        float f5 = this.sleepDrawBottom;
        float f6 = this.sleepRectHeight;
        float f7 = f5 - f6;
        if (afterDataType == 1) {
            float f8 = this.sleepShallowY + f6;
            linearGradient = new LinearGradient(0.0f, f7, 0.0f, f8, this.mDeepColor, this.mShallowColor, Shader.TileMode.CLAMP);
            f3 = f8;
        } else {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, f7, 0.0f, f6, this.mDeepColor, this.mAwakeColor, Shader.TileMode.CLAMP);
            f7 = f7;
            linearGradient = linearGradient2;
            f3 = f6;
        }
        this.mPaintConnect.setShader(linearGradient);
        canvas.drawLine(f4, f7, f4, f3, this.mPaintConnect);
    }

    private float getSleepWidth(int i) {
        return NumberUtils.formatNumber((i * (this.mViewWidth - (this.drawPadding * 2.0f))) / this.totalMinute, 2);
    }

    private void drawEmptyLabel(Canvas canvas) {
        float f = this.labelWidth / 2.0f;
        float dp2px = this.mViewHeight - UIHelper.dp2px(30.0f);
        float textHeight = DrawTextUtils.getTextHeight(this.mPaintText);
        float f2 = this.drawTextPadding;
        float textYOffset = getTextYOffset(f2, this.labelWidth + f2);
        float f3 = dp2px - textYOffset;
        this.mPaintText.setColor(Color.parseColor(textYOffset > 0.0f ? "#333333" : a.C1008a.f18760a));
        String str = this.startDayText;
        canvas.drawText(str, (this.drawTextPadding + f) - (DrawTextUtils.getTextWidth(str, this.mPaintText) / 2.0f), f3 - textHeight, this.mPaintText);
        int i = this.mViewWidth;
        float f4 = this.drawTextPadding;
        float textYOffset2 = getTextYOffset((i - f4) - this.labelWidth, i - f4);
        float f5 = dp2px - textYOffset2;
        float f6 = this.labelWidth / 2.0f;
        this.mPaintText.setColor(Color.parseColor(textYOffset2 > 0.0f ? "#333333" : a.C1008a.f18760a));
        String str2 = this.endDayText;
        canvas.drawText(str2, ((this.mViewWidth - this.drawTextPadding) - this.labelWidth) + (f6 - (DrawTextUtils.getTextWidth(str2, this.mPaintText) / 2.0f)), f5 - textHeight, this.mPaintText);
        int i2 = 0;
        while (true) {
            if (i2 >= this.emptyDataLabel.length) {
                return;
            }
            float f7 = this.labelSpace;
            float f8 = this.labelWidth;
            float f9 = (f7 + f8) * i2;
            if (i2 == 0) {
                f9 += this.drawTextPadding;
            }
            if (i2 == r1.length - 1) {
                f9 = (this.mViewWidth - f8) - this.drawTextPadding;
            }
            float textYOffset3 = getTextYOffset(f9, f8 + f9);
            this.mPaintText.setColor(Color.parseColor(textYOffset3 > 0.0f ? "#333333" : a.C1008a.f18760a));
            canvas.drawText(this.emptyDataLabel[i2], f9, dp2px - textYOffset3, this.mPaintText);
            i2++;
        }
    }

    private void drawText(Canvas canvas) {
        float f;
        float dp2px = this.mViewHeight - UIHelper.dp2px(30.0f);
        float textHeight = DrawTextUtils.getTextHeight(this.mPaintText);
        float textWidth = DrawTextUtils.getTextWidth(this.startTimeText, this.mPaintText);
        float textWidth2 = DrawTextUtils.getTextWidth(this.endTimeText, this.mPaintText);
        if (this.isDrawIndicator) {
            float f2 = this.drawTextPadding;
            f = getTextYOffset(f2, f2 + textWidth);
        } else {
            f = 0.0f;
        }
        float f3 = dp2px - f;
        if (f > 0.0f) {
            this.mPaintText.setColor(Color.parseColor("#333333"));
        } else {
            this.mPaintText.setColor(Color.parseColor(a.C1008a.f18760a));
        }
        String str = this.startDayText;
        canvas.drawText(str, (this.drawTextPadding + (textWidth / 2.0f)) - (DrawTextUtils.getTextWidth(str, this.mPaintText) / 2.0f), f3 - textHeight, this.mPaintText);
        canvas.drawText(this.startTimeText, this.drawTextPadding, f3, this.mPaintText);
        int i = this.mViewWidth;
        float f4 = this.drawTextPadding;
        float textYOffset = getTextYOffset((i - f4) - textWidth2, i - f4);
        float f5 = dp2px - textYOffset;
        if (textYOffset > 0.0f) {
            this.mPaintText.setColor(Color.parseColor("#333333"));
        } else {
            this.mPaintText.setColor(Color.parseColor(a.C1008a.f18760a));
        }
        String str2 = this.endDayText;
        canvas.drawText(str2, ((this.mViewWidth - this.drawTextPadding) - textWidth2) + ((textWidth2 / 2.0f) - (DrawTextUtils.getTextWidth(str2, this.mPaintText) / 2.0f)), f5 - textHeight, this.mPaintText);
        canvas.drawText(this.endTimeText, (this.mViewWidth - this.drawTextPadding) - textWidth2, f5, this.mPaintText);
    }

    private void checkSelected() {
        OnSelectListener onSelectListener;
        for (SleepDrawRecord sleepDrawRecord : this.mList) {
            if (this.mIndicatorX >= sleepDrawRecord.mStartX && this.mIndicatorX <= sleepDrawRecord.mEndX) {
                if (sleepDrawRecord.mData == this.mSelectData || (onSelectListener = this.mSelectListener) == null) {
                    return;
                }
                onSelectListener.onSelect(sleepDrawRecord.mData);
                this.mSelectData = sleepDrawRecord.mData;
                return;
            }
        }
    }

    public void setPlainBar(boolean z) {
        this.plainBar = z;
    }

    public void setData(SleepData sleepData) {
        this.mData = sleepData;
        initTimeStr(sleepData);
        this.totalMinute = ((int) (this.mData.getEndTime() - this.mData.getStartTime())) / 60;
        this.mIndicatorX = this.mViewWidth - this.drawPadding;
        invalidate();
    }

    public void setDrawIndicator(boolean z) {
        this.isDrawIndicator = z;
    }

    public SleepData getData() {
        return this.mData;
    }

    private void initTimeStr(SleepData sleepData) {
        this.startDayText = formatDay(sleepData.getStartTime());
        this.startTimeText = "入睡 " + formatTime(sleepData.getStartTime());
        this.endDayText = formatDay(sleepData.getEndTime());
        this.endTimeText = "醒来 " + formatTime(sleepData.getEndTime());
    }

    public void setSelectListener(OnSelectListener onSelectListener) {
        this.mSelectListener = onSelectListener;
    }

    public void setIndicatorColor(int i) {
        this.mDrawHelp.setIndicatorColor(i);
    }

    private String formatDay(long j) {
        return new SimpleDateFormat("MM/dd").format(new Date(j * 1000));
    }

    private String formatTime(long j) {
        return new SimpleDateFormat("HH:mm").format(new Date(j * 1000));
    }

    private static final class SleepDrawRecord {
        private final SleepTypeData mData;
        private final float mEndX;
        private final float mStartX;

        private SleepDrawRecord(float f, float f2, SleepTypeData sleepTypeData) {
            this.mStartX = f;
            this.mEndX = f2;
            this.mData = sleepTypeData;
        }
    }
}
