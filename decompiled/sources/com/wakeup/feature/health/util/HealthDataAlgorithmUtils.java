package com.wakeup.feature.health.util;

import android.content.Context;
import com.wakeup.common.Constants;
import com.wakeup.commonui.R;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: HealthDataAlgorithmUtils.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\b2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J0\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012J0\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00182\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012R.\u0010\u0004\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0007\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\b0\u00060\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\tR\u001c\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u001c\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00050\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/feature/health/util/HealthDataAlgorithmUtils;", "", "<init>", "()V", "sleepDayScopeArray", "", "", "", "Lkotlin/Pair;", "[Ljava/util/Map;", "sleepWeekScopeArray", "[[Ljava/lang/Integer;", "sleepWeekPercentArray", "sleepMonthScopeArray", "sleepMonthPercentArray", "getSleepDayScore", "sleepDuration", Constants.BundleKey.TIMESTAMP, "", "getSleepDayCopyWriting", "", "context", "Landroid/content/Context;", "getSleepWeekScoreAndCopyWriting", "Lkotlin/Triple;", "getSleepMonthScore", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthDataAlgorithmUtils {
    public static final HealthDataAlgorithmUtils INSTANCE = new HealthDataAlgorithmUtils();
    private static final Map<Integer, Pair<Integer, Integer>>[] sleepDayScopeArray = {MapsKt.mapOf(TuplesKt.to(2, new Pair(60, 48)), TuplesKt.to(3, new Pair(58, 46)), TuplesKt.to(4, new Pair(59, 43)), TuplesKt.to(5, new Pair(57, 42)), TuplesKt.to(6, new Pair(54, 41)), TuplesKt.to(7, new Pair(58, 44)), TuplesKt.to(7, new Pair(60, 46))), MapsKt.mapOf(TuplesKt.to(2, new Pair(63, 48)), TuplesKt.to(3, new Pair(62, 50)), TuplesKt.to(4, new Pair(65, 49)), TuplesKt.to(5, new Pair(61, 52)), TuplesKt.to(6, new Pair(64, 51)), TuplesKt.to(7, new Pair(65, 52)), TuplesKt.to(7, new Pair(63, 49))), MapsKt.mapOf(TuplesKt.to(2, new Pair(67, 53)), TuplesKt.to(3, new Pair(69, 52)), TuplesKt.to(4, new Pair(66, 55)), TuplesKt.to(5, new Pair(68, 54)), TuplesKt.to(6, new Pair(70, 56)), TuplesKt.to(7, new Pair(66, 55)), TuplesKt.to(7, new Pair(68, 53))), MapsKt.mapOf(TuplesKt.to(2, new Pair(75, 57)), TuplesKt.to(3, new Pair(73, 59)), TuplesKt.to(4, new Pair(72, 60)), TuplesKt.to(5, new Pair(74, 58)), TuplesKt.to(6, new Pair(71, 56)), TuplesKt.to(7, new Pair(73, 56)), TuplesKt.to(7, new Pair(75, 60))), MapsKt.mapOf(TuplesKt.to(2, new Pair(76, 61)), TuplesKt.to(3, new Pair(78, 62)), TuplesKt.to(4, new Pair(77, 60)), TuplesKt.to(5, new Pair(80, 63)), TuplesKt.to(6, new Pair(79, 64)), TuplesKt.to(7, new Pair(78, 63)), TuplesKt.to(7, new Pair(76, 64))), MapsKt.mapOf(TuplesKt.to(2, new Pair(88, 61)), TuplesKt.to(3, new Pair(86, 62)), TuplesKt.to(4, new Pair(85, 60)), TuplesKt.to(5, new Pair(83, 63)), TuplesKt.to(6, new Pair(90, 64)), TuplesKt.to(7, new Pair(84, 68)), TuplesKt.to(7, new Pair(89, 72))), MapsKt.mapOf(TuplesKt.to(2, new Pair(85, 66)), TuplesKt.to(3, new Pair(84, 65)), TuplesKt.to(4, new Pair(82, 67)), TuplesKt.to(5, new Pair(81, 64)), TuplesKt.to(6, new Pair(83, 68)), TuplesKt.to(7, new Pair(83, 66)), TuplesKt.to(7, new Pair(85, 65))), MapsKt.mapOf(TuplesKt.to(2, new Pair(75, 57)), TuplesKt.to(3, new Pair(73, 59)), TuplesKt.to(4, new Pair(72, 60)), TuplesKt.to(5, new Pair(74, 58)), TuplesKt.to(6, new Pair(71, 56)), TuplesKt.to(7, new Pair(73, 56)), TuplesKt.to(7, new Pair(75, 60)))};
    private static final Integer[][] sleepWeekScopeArray = {new Integer[]{51, 59, 53, 52, 60, 54, 57, 55, 56, 58, 50}, new Integer[]{61, 60, 62, 64, 63}, new Integer[]{66, 70, 67, 69, 68}, new Integer[]{75, 73, 74, 71, 72}, new Integer[]{76, 78, 77, 80, 79}, new Integer[]{89, 87, 88, 90, 81, 83, 82, 84, 86, 85}, new Integer[]{82, 81, 85, 83, 84}, new Integer[]{73, 72, 74, 71, 75}};
    private static final Integer[][] sleepWeekPercentArray = {new Integer[]{42, 41, 40, 43, 46, 47, 46, 48, 44}, new Integer[]{50, 52, 51, 49, 48}, new Integer[]{50, 52, 51, 49, 48}, new Integer[]{58, 60, 56, 59, 57}, new Integer[]{61, 60, 63, 62, 64}, new Integer[]{72, 70, 71, 68, 67, 69, 66, 64, 65}, new Integer[]{68, 66, 67, 64, 65}, new Integer[]{58, 60, 56, 59, 57}};
    private static final Integer[][] sleepMonthScopeArray = {new Integer[]{50, 53, 52, 54, 51, 56, 58, 57, 58, 60, 59, 50}, new Integer[]{62, 61, 64, 65, 61, 63, 65, 64, 61, 63, 62, 64}, new Integer[]{68, 66, 67, 70, 68, 66, 69, 66, 69, 70, 68, 66}, new Integer[]{71, 73, 74, 71, 73, 71, 75, 74, 73, 75, 71, 74}, new Integer[]{78, 77, 76, 79, 80, 76, 78, 79, 76, 77, 80, 77}, new Integer[]{89, 88, 87, 83, 85, 82, 86, 90, 87, 86, 84, 81}, new Integer[]{81, 82, 83, 84, 85, 81, 82, 83, 84, 85, 81, 82}, new Integer[]{72, 71, 73, 76, 75, 74, 72, 75, 74, 72, 71, 74}};
    private static final Integer[][] sleepMonthPercentArray = {new Integer[]{42, 41, 43, 45, 44, 46, 47, 43, 48, 40, 46, 40}, new Integer[]{52, 50, 48, 51, 49, 50, 49, 51, 48, 50, 49, 52}, new Integer[]{52, 56, 54, 53, 54, 52, 56, 53, 55, 56, 54, 55}, new Integer[]{58, 55, 56, 59, 57, 60, 57, 57, 59, 58, 56, 60}, new Integer[]{60, 63, 64, 62, 60, 61, 60, 64, 63, 62, 60, 64}, new Integer[]{65, 66, 68, 64, 66, 72, 71, 70, 67, 69, 66, 72}, new Integer[]{64, 66, 65, 66, 68, 64, 65, 66, 67, 66, 64, 68}, new Integer[]{56, 57, 60, 58, 59, 57, 59, 60, 57, 58, 59, 56}};
    public static final int $stable = 8;

    private HealthDataAlgorithmUtils() {
    }

    public final Pair<Integer, Integer> getSleepDayScore(int sleepDuration, long timeStamp) {
        Pair<Integer, Integer> pair;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        int i = calendar.get(4);
        if (sleepDuration <= 0) {
            pair = new Pair<>(0, 0);
        } else if (sleepDuration < 360) {
            pair = sleepDayScopeArray[0].get(Integer.valueOf(i));
        } else if (sleepDuration < 360 || sleepDuration >= 390.0d) {
            double d = sleepDuration;
            if (d >= 390.0d && sleepDuration < 420) {
                pair = sleepDayScopeArray[2].get(Integer.valueOf(i));
            } else if (sleepDuration >= 420 && d < 450.0d) {
                pair = sleepDayScopeArray[3].get(Integer.valueOf(i));
            } else if (d >= 450.0d && sleepDuration < 480) {
                pair = sleepDayScopeArray[4].get(Integer.valueOf(i));
            } else if ((sleepDuration >= 480 && d < 510.0d) || (d >= 510.0d && sleepDuration < 540)) {
                pair = sleepDayScopeArray[5].get(Integer.valueOf(i));
            } else if (sleepDuration >= 540 && sleepDuration < 600) {
                pair = sleepDayScopeArray[6].get(Integer.valueOf(i));
            } else {
                pair = sleepDuration > 600 ? sleepDayScopeArray[7].get(Integer.valueOf(i)) : null;
            }
        } else {
            pair = sleepDayScopeArray[1].get(Integer.valueOf(i));
        }
        return pair == null ? new Pair<>(50, 40) : pair;
    }

    public final Pair<String, String> getSleepDayCopyWriting(Context context, int sleepDuration, long timeStamp) {
        String string;
        Intrinsics.checkNotNullParameter(context, "context");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(timeStamp * 1000);
        int i = calendar.get(7);
        int i2 = calendar.get(11);
        int i3 = calendar.get(12);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        String str = "";
        switch (i) {
            case 1:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_3, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_10, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            case 2:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_1, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_5, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            case 3:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_2, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_6, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            case 4:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_3, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_7, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            case 5:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_4, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_8, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            case 6:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_1, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_7, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            case 7:
                if (i2 >= 0 && i2 < 13) {
                    string = context.getString(R.string.sleep_short_describe_2, format);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                } else {
                    string = context.getString(R.string.sleep_short_describe_9, Integer.valueOf(sleepDuration / 60), Integer.valueOf(sleepDuration % 60));
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    break;
                }
            default:
                string = "";
                break;
        }
        if (sleepDuration < 360) {
            str = context.getString(R.string.sleep_long_describe_1);
        } else if (sleepDuration < 360 || sleepDuration >= 390.0d) {
            double d = sleepDuration;
            if (d >= 390.0d && sleepDuration < 420) {
                str = context.getString(R.string.sleep_long_describe_3);
            } else if (sleepDuration >= 420 && d < 450.0d) {
                str = context.getString(R.string.sleep_long_describe_4);
            } else if (d >= 450.0d && sleepDuration < 480) {
                str = context.getString(R.string.sleep_long_describe_5);
            } else if (sleepDuration >= 480 && d < 510.0d) {
                str = context.getString(R.string.sleep_long_describe_6);
            } else if (d >= 510.0d && sleepDuration < 540) {
                str = context.getString(R.string.sleep_long_describe_7);
            } else if (sleepDuration >= 540 && sleepDuration < 600) {
                str = context.getString(R.string.sleep_long_describe_8);
            } else if (sleepDuration > 600) {
                str = context.getString(R.string.sleep_long_describe_9);
            }
        } else {
            str = context.getString(R.string.sleep_long_describe_2);
        }
        return new Pair<>(string, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.String> getSleepWeekScoreAndCopyWriting(android.content.Context r11, int r12, long r13) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r1
            long r13 = r13 * r1
            r0.setTimeInMillis(r13)
            r13 = 3
            int r14 = r0.get(r13)
            r0 = 2
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r3 = 360(0x168, float:5.04E-43)
            if (r12 >= r3) goto L22
        L1f:
            r13 = r1
            goto L78
        L22:
            r4 = 4645568568748933120(0x4078600000000000, double:390.0)
            if (r12 < r3) goto L31
            double r6 = (double) r12
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L31
            r13 = 1
        L2f:
            r1 = r13
            goto L78
        L31:
            double r6 = (double) r12
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r4 = 420(0x1a4, float:5.89E-43)
            if (r3 < 0) goto L3c
            if (r12 >= r4) goto L3c
            r13 = r0
            goto L2f
        L3c:
            r8 = 4646624099911598080(0x407c200000000000, double:450.0)
            if (r12 < r4) goto L48
            int r3 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r3 >= 0) goto L48
        L47:
            goto L2f
        L48:
            int r13 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            r3 = 480(0x1e0, float:6.73E-43)
            if (r13 < 0) goto L52
            if (r12 >= r3) goto L52
            r13 = 4
            goto L2f
        L52:
            r4 = 4647679631074263040(0x407fe00000000000, double:510.0)
            r13 = 5
            if (r12 < r3) goto L5f
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r3 >= 0) goto L5f
            goto L47
        L5f:
            int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r4 = 6
            r5 = 540(0x21c, float:7.57E-43)
            if (r3 < 0) goto L6a
            if (r12 >= r5) goto L6a
            r1 = r4
            goto L78
        L6a:
            r13 = 7
            r3 = 600(0x258, float:8.41E-43)
            if (r12 < r5) goto L74
            if (r12 >= r3) goto L74
            r1 = r13
            r13 = r4
            goto L78
        L74:
            if (r12 <= r3) goto L1f
            r1 = 8
        L78:
            java.lang.Integer[][] r3 = com.wakeup.feature.health.util.HealthDataAlgorithmUtils.sleepWeekScopeArray
            r3 = r3[r13]
            int r4 = r3.length
            int r4 = r14 % r4
            r3 = r3[r4]
            int r3 = r3.intValue()
            java.lang.Integer[][] r4 = com.wakeup.feature.health.util.HealthDataAlgorithmUtils.sleepWeekPercentArray
            r13 = r4[r13]
            int r4 = r13.length
            int r14 = r14 % r4
            r13 = r13[r14]
            int r13 = r13.intValue()
            int r1 = r1 % r0
            if (r1 != 0) goto L97
            int r14 = com.wakeup.commonui.R.string.sleep_long_describe_10
            goto L99
        L97:
            int r14 = com.wakeup.commonui.R.string.sleep_long_describe_11
        L99:
            java.lang.String r11 = r11.getString(r14)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            if (r12 > 0) goto La8
            kotlin.Triple r12 = new kotlin.Triple
            r12.<init>(r2, r2, r11)
            return r12
        La8:
            kotlin.Triple r12 = new kotlin.Triple
            java.lang.Integer r14 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r12.<init>(r14, r13, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.health.util.HealthDataAlgorithmUtils.getSleepWeekScoreAndCopyWriting(android.content.Context, int, long):kotlin.Triple");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Triple<java.lang.Integer, java.lang.Integer, java.lang.String> getSleepMonthScore(android.content.Context r11, int r12, long r13) {
        /*
            r10 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            r1 = 1000(0x3e8, float:1.401E-42)
            long r1 = (long) r1
            long r13 = r13 * r1
            r0.setTimeInMillis(r13)
            r13 = 2
            int r14 = r0.get(r13)
            r0 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 360(0x168, float:5.04E-43)
            if (r12 >= r2) goto L21
        L1e:
            r2 = r0
            goto L7b
        L21:
            r3 = 4645568568748933120(0x4078600000000000, double:390.0)
            if (r12 < r2) goto L2f
            double r5 = (double) r12
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L2f
            r0 = 1
            goto L1e
        L2f:
            double r5 = (double) r12
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r3 = 420(0x1a4, float:5.89E-43)
            if (r2 < 0) goto L3a
            if (r12 >= r3) goto L3a
            r0 = r13
            goto L1e
        L3a:
            r7 = 4646624099911598080(0x407c200000000000, double:450.0)
            if (r12 < r3) goto L47
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto L47
            r0 = 3
            goto L1e
        L47:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r3 = 480(0x1e0, float:6.73E-43)
            if (r2 < 0) goto L51
            if (r12 >= r3) goto L51
            r0 = 4
            goto L1e
        L51:
            r7 = 4647679631074263040(0x407fe00000000000, double:510.0)
            r2 = 5
            if (r12 < r3) goto L5f
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 >= 0) goto L5f
            r0 = r2
            goto L7b
        L5f:
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r4 = 6
            r5 = 540(0x21c, float:7.57E-43)
            if (r3 < 0) goto L6b
            if (r12 >= r5) goto L6b
            r0 = r2
            r2 = r4
            goto L7b
        L6b:
            r2 = 7
            r3 = 600(0x258, float:8.41E-43)
            if (r12 < r5) goto L74
            if (r12 >= r3) goto L74
            r0 = r4
            goto L7b
        L74:
            if (r12 <= r3) goto L1e
            r0 = 8
            r9 = r2
            r2 = r0
            r0 = r9
        L7b:
            java.lang.Integer[][] r3 = com.wakeup.feature.health.util.HealthDataAlgorithmUtils.sleepMonthScopeArray
            r3 = r3[r0]
            int r4 = r3.length
            int r4 = r14 % r4
            r3 = r3[r4]
            int r3 = r3.intValue()
            java.lang.Integer[][] r4 = com.wakeup.feature.health.util.HealthDataAlgorithmUtils.sleepMonthPercentArray
            r0 = r4[r0]
            int r4 = r0.length
            int r14 = r14 % r4
            r14 = r0[r14]
            int r14 = r14.intValue()
            int r2 = r2 % r13
            if (r2 != 0) goto L9a
            int r13 = com.wakeup.commonui.R.string.sleep_long_describe_10
            goto L9c
        L9a:
            int r13 = com.wakeup.commonui.R.string.sleep_long_describe_11
        L9c:
            java.lang.String r11 = r11.getString(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            if (r12 > 0) goto Lab
            kotlin.Triple r12 = new kotlin.Triple
            r12.<init>(r1, r1, r11)
            return r12
        Lab:
            kotlin.Triple r12 = new kotlin.Triple
            java.lang.Integer r13 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.<init>(r13, r14, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.feature.health.util.HealthDataAlgorithmUtils.getSleepMonthScore(android.content.Context, int, long):kotlin.Triple");
    }
}
