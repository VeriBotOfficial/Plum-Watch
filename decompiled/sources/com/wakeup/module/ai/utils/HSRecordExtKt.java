package com.wakeup.module.ai.utils;

import android.text.TextUtils;
import android.text.format.DateUtils;
import com.wakeup.common.base.BaseApplication;
import com.wakeup.common.utils.AudioUtil;
import com.wakeup.common.utils.DateUtil;
import com.wakeup.module.ai.bean.HSRecord;
import com.wakeup.module.ai.bean.TxtStorage;
import com.wakeup.module.ai.msg.HSRecordMgr;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HSRecordExt.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0017\u0010\u0003\u001a\n \u0004*\u0004\u0018\u00010\u00010\u0001*\u00020\u0002¢\u0006\u0002\u0010\u0005\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\n\u0010\n\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u000b\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\f\u001a\u00020\u0001*\u00020\u0002\u001a\u001d\u0010\r\u001a\n \u0004*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0002\u0010\u0005\u001a\u0010\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¨\u0006\u0010"}, d2 = {"getTypeStr", "", "Lcom/wakeup/module/ai/bean/HSRecord;", "getTitle", "kotlin.jvm.PlatformType", "(Lcom/wakeup/module/ai/bean/HSRecord;)Ljava/lang/String;", "getFormatDuration", "formatDuration", "duration", "", "getDesc", "getFormatTime", "getFormatTime2", "getDefTitle", "record", "getBeforeFirstLine", "module-ai_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HSRecordExtKt {
    public static final String getTypeStr(HSRecord hSRecord) {
        Intrinsics.checkNotNullParameter(hSRecord, "<this>");
        int type = hSRecord.getType();
        if (type == 1) {
            return "同听传译";
        }
        if (type == 2) {
            return "现场录音";
        }
        if (type == 3) {
            return "面对面翻译";
        }
        if (type == 4) {
            return "音视频录音";
        }
        if (type == 5) {
            return "会议神器";
        }
        return "";
    }

    public static final String getTitle(HSRecord hSRecord) {
        Intrinsics.checkNotNullParameter(hSRecord, "<this>");
        return !TextUtils.isEmpty(hSRecord.getCustomTitle()) ? hSRecord.getCustomTitle() : getDefTitle(hSRecord);
    }

    public static final String getFormatDuration(HSRecord hSRecord) {
        Intrinsics.checkNotNullParameter(hSRecord, "<this>");
        if (hSRecord.getAudioDuration() != -1) {
            return formatDuration(hSRecord.getAudioDuration());
        }
        hSRecord.setAudioDuration(AudioUtil.INSTANCE.getRecordPcmDuration(hSRecord.getAudioPath()));
        HSRecordMgr.INSTANCE.editRecord(hSRecord);
        return formatDuration(hSRecord.getAudioDuration());
    }

    private static final String formatDuration(long j) {
        if (j < 60) {
            return "<1分钟";
        }
        return (j / 60) + "分钟";
    }

    public static final String getDesc(HSRecord hSRecord) {
        Intrinsics.checkNotNullParameter(hSRecord, "<this>");
        if (!TextUtils.isEmpty(hSRecord.getDescribe())) {
            return hSRecord.getDescribe();
        }
        hSRecord.setDescribe(getBeforeFirstLine(hSRecord));
        HSRecordMgr.INSTANCE.editRecord(hSRecord);
        return hSRecord.getDescribe();
    }

    public static final String getFormatTime(HSRecord hSRecord) {
        Intrinsics.checkNotNullParameter(hSRecord, "<this>");
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        if (DateUtil.isSameDay((int) currentTimeMillis, (int) hSRecord.getCreateTime())) {
            return "今天";
        }
        if (DateUtil.isSameDay((int) (DateUtil.addDay(currentTimeMillis * 1000, -1) / 1000), (int) hSRecord.getCreateTime())) {
            return "昨天";
        }
        String dateUtil = DateUtil.toString(hSRecord.getCreateTime() * 1000, "yyyy/MM/dd");
        Intrinsics.checkNotNullExpressionValue(dateUtil, "toString(...)");
        return dateUtil;
    }

    public static final String getFormatTime2(HSRecord hSRecord) {
        Intrinsics.checkNotNullParameter(hSRecord, "<this>");
        String dateUtil = DateUtil.toString(hSRecord.getCreateTime() * 1000, "yyyy/MM/dd HH:mm:ss");
        Intrinsics.checkNotNullExpressionValue(dateUtil, "toString(...)");
        return dateUtil;
    }

    private static final String getDefTitle(HSRecord hSRecord) {
        return DateUtils.formatDateTime(BaseApplication.getContext(), hSRecord.getCreateTime() * 1000, 21);
    }

    private static final String getBeforeFirstLine(HSRecord hSRecord) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(hSRecord.getBeforeTextPath())));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            TxtStorage.Companion companion = TxtStorage.INSTANCE;
            Intrinsics.checkNotNull(readLine);
            return companion.analysis(readLine);
        } catch (Exception unused) {
            return "";
        }
    }
}
