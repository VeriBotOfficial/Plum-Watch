package com.wakeup.feature.user.viewmodel;

import com.blankj.utilcode.util.LanguageUtils;
import com.umeng.analytics.AnalyticsConfig;
import com.wakeup.common.base.BaseViewModel;
import com.wakeup.common.network.host.H5Host;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.storage.model.UserModel;
import com.wakeup.common.utils.DateUtil;
import java.util.Calendar;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: ReportHomeViewModel.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¨\u0006\u000b"}, d2 = {"Lcom/wakeup/feature/user/viewmodel/ReportHomeViewModel;", "Lcom/wakeup/common/base/BaseViewModel;", "<init>", "()V", "getReportH5Params", "", "type", "", AnalyticsConfig.RTD_START_TIME, "", "endTime", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class ReportHomeViewModel extends BaseViewModel {
    public final String getReportH5Params(int type, long startTime, long endTime) {
        Calendar calendar = Calendar.getInstance(Locale.getDefault());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(H5Host.getUserReportUrl());
        stringBuffer.append("?token=" + UserDao.getToken());
        stringBuffer.append("&");
        stringBuffer.append("type=" + type);
        stringBuffer.append("&");
        stringBuffer.append("startTime=" + startTime);
        stringBuffer.append("&");
        long j = endTime + 1;
        stringBuffer.append("endTime=" + j);
        stringBuffer.append("&");
        stringBuffer.append("timeZone=" + calendar.getTimeZone().getID());
        stringBuffer.append("&");
        UserModel user = UserDao.getUser();
        stringBuffer.append("targetStep=" + (user != null ? user.getGoalNum() : 10000));
        stringBuffer.append("&");
        long j2 = 1000;
        stringBuffer.append("dayNoStart=" + DateUtil.toString(startTime * j2, "yyyyMMdd"));
        stringBuffer.append("&");
        stringBuffer.append("dayNoEnd=" + DateUtil.toString(j * j2, "yyyyMMdd"));
        stringBuffer.append("&");
        String language = LanguageUtils.getSystemLanguage().getLanguage();
        Intrinsics.checkNotNullExpressionValue(language, "getLanguage(...)");
        stringBuffer.append("locale=".concat(StringsKt.contains$default((CharSequence) language, (CharSequence) "zh", false, 2, (Object) null) ? "zh" : "en"));
        String stringBuffer2 = stringBuffer.toString();
        Intrinsics.checkNotNullExpressionValue(stringBuffer2, "toString(...)");
        return stringBuffer2;
    }
}
