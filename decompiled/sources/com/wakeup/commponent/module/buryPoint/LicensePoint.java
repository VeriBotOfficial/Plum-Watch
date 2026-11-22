package com.wakeup.commponent.module.buryPoint;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LicensePoint.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006\u0017"}, d2 = {"Lcom/wakeup/commponent/module/buryPoint/LicensePoint;", "", "licenseName", "", "licenseId", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getLicenseName", "()Ljava/lang/String;", "getLicenseId", "AI_BEAU_DIAL", "BAIDU_MAP_NAVI", "WEARFIT_AI", "ONE_TRANSLATE", "SIMULTANEOUS_INTERPRETATION", "PHOTO_TRANSLATE", "MEETING", "FACE_TO_FACE_TRANSLATE", "REALTIME_COMMUNICATION", "WECHAT_RELAY", "APP_LLM", "AUDIO_RECORD", "CALL_RECORD", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LicensePoint {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LicensePoint[] $VALUES;
    private final String licenseId;
    private final String licenseName;
    public static final LicensePoint AI_BEAU_DIAL = new LicensePoint("AI_BEAU_DIAL", 0, "AI精美表盘", "aiBeauDial");
    public static final LicensePoint BAIDU_MAP_NAVI = new LicensePoint("BAIDU_MAP_NAVI", 1, "百度导航", "baiduMapNavigation");
    public static final LicensePoint WEARFIT_AI = new LicensePoint("WEARFIT_AI", 2, "Wearfit AI", "wearfitAi");
    public static final LicensePoint ONE_TRANSLATE = new LicensePoint("ONE_TRANSLATE", 3, "一键翻译", "oneClickTranslation");
    public static final LicensePoint SIMULTANEOUS_INTERPRETATION = new LicensePoint("SIMULTANEOUS_INTERPRETATION", 4, "同声传译", "simultaneousInterpretation");
    public static final LicensePoint PHOTO_TRANSLATE = new LicensePoint("PHOTO_TRANSLATE", 5, "拍照翻译", "taPhotoTranslation");
    public static final LicensePoint MEETING = new LicensePoint("MEETING", 6, "会议模式", "conferenceMagicDevice");
    public static final LicensePoint FACE_TO_FACE_TRANSLATE = new LicensePoint("FACE_TO_FACE_TRANSLATE", 7, "面对面翻译", "ftfTranslation");
    public static final LicensePoint REALTIME_COMMUNICATION = new LicensePoint("REALTIME_COMMUNICATION", 8, "实时通讯", "realtimeCommunication");
    public static final LicensePoint WECHAT_RELAY = new LicensePoint("WECHAT_RELAY", 9, "微信回复", "wechatRelay");
    public static final LicensePoint APP_LLM = new LicensePoint("APP_LLM", 10, "AI助手", "AI assistant");
    public static final LicensePoint AUDIO_RECORD = new LicensePoint("AUDIO_RECORD", 11, "录音", "Record");
    public static final LicensePoint CALL_RECORD = new LicensePoint("CALL_RECORD", 12, "通话录音", "Call record");

    private static final /* synthetic */ LicensePoint[] $values() {
        return new LicensePoint[]{AI_BEAU_DIAL, BAIDU_MAP_NAVI, WEARFIT_AI, ONE_TRANSLATE, SIMULTANEOUS_INTERPRETATION, PHOTO_TRANSLATE, MEETING, FACE_TO_FACE_TRANSLATE, REALTIME_COMMUNICATION, WECHAT_RELAY, APP_LLM, AUDIO_RECORD, CALL_RECORD};
    }

    public static EnumEntries<LicensePoint> getEntries() {
        return $ENTRIES;
    }

    private LicensePoint(String str, int i, String str2, String str3) {
        this.licenseName = str2;
        this.licenseId = str3;
    }

    public final String getLicenseId() {
        return this.licenseId;
    }

    public final String getLicenseName() {
        return this.licenseName;
    }

    static {
        LicensePoint[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static LicensePoint valueOf(String str) {
        return (LicensePoint) Enum.valueOf(LicensePoint.class, str);
    }

    public static LicensePoint[] values() {
        return (LicensePoint[]) $VALUES.clone();
    }
}
