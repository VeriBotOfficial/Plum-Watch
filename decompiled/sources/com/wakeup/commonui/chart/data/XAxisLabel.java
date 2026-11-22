package com.wakeup.commonui.chart.data;

import com.blankj.utilcode.util.Utils;
import com.facebook.imageutils.JfifUtil;
import com.wakeup.commonui.R;
import com.wakeup.commonui.chart.ChartUtils;
import java.util.ArrayList;
import java.util.Calendar;
import org.joda.time.DateTimeConstants;

/* loaded from: classes2.dex */
public class XAxisLabel {
    private final String mFormatLabel;
    private int mValue;
    public static final XAxisLabel[] DAY_LABELS_MINUTE = {new XAxisLabel("00:00", 0), new XAxisLabel("06:00", 360), new XAxisLabel("12:00", 720), new XAxisLabel("18:00", 1080), new XAxisLabel("00:00", DateTimeConstants.MINUTES_PER_DAY)};
    public static final XAxisLabel[] DAY_LABELS_5_MINUTE = {new XAxisLabel("00:00", 0), new XAxisLabel("06:00", 72), new XAxisLabel("12:00", 144), new XAxisLabel("18:00", JfifUtil.MARKER_SOI), new XAxisLabel("00:00", 288)};
    public static final XAxisLabel[] DAY_LABELS_HALF_HOUR = {new XAxisLabel("00:00", 0), new XAxisLabel("06:00", 12), new XAxisLabel("12:00", 24), new XAxisLabel("18:00", 36), new XAxisLabel("00:00", 48)};
    public static final XAxisLabel[] DAY_LABELS = {new XAxisLabel("00:00", 0), new XAxisLabel("06:00", 6), new XAxisLabel("12:00", 12), new XAxisLabel("18:00", 18), new XAxisLabel("00:00", 24)};
    public static final XAxisLabel[] WEEK_LABELS = {new XAxisLabel(Utils.getApp().getString(R.string.assistant_yi), 1), new XAxisLabel(Utils.getApp().getString(R.string.assistant_er), 2), new XAxisLabel(Utils.getApp().getString(R.string.assistant_san), 3), new XAxisLabel(Utils.getApp().getString(R.string.assistant_si), 4), new XAxisLabel(Utils.getApp().getString(R.string.assistant_wu), 5), new XAxisLabel(Utils.getApp().getString(R.string.assistant_liu), 6), new XAxisLabel(Utils.getApp().getString(R.string.assistant_ri), 7)};
    public static final XAxisLabel[] YEAR_LABELS = {new XAxisLabel("1", 1), new XAxisLabel("2", 2), new XAxisLabel("3", 3), new XAxisLabel("4", 4), new XAxisLabel("5", 5), new XAxisLabel("6", 6), new XAxisLabel("7", 7), new XAxisLabel("8", 8), new XAxisLabel("9", 9), new XAxisLabel("10", 10), new XAxisLabel("11", 11), new XAxisLabel("12", 12)};

    public static XAxisLabel[] getMonthLabels(long j) {
        ArrayList arrayList = new ArrayList();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j * 1000);
        int i = calendar.get(2) + 1;
        calendar.set(5, 1);
        while (calendar.get(2) + 1 == i) {
            if (calendar.get(7) == 2) {
                arrayList.add(new XAxisLabel(ChartUtils.getDayFromTime(calendar.getTimeInMillis() / 1000), calendar.get(5)));
            }
            calendar.add(5, 1);
        }
        return (XAxisLabel[]) arrayList.toArray(new XAxisLabel[0]);
    }

    public XAxisLabel(String str, int i) {
        this.mFormatLabel = str;
        this.mValue = i;
    }

    public String getFormatLabel() {
        return this.mFormatLabel;
    }

    public int getValue() {
        return this.mValue;
    }
}
