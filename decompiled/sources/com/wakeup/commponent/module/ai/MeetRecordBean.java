package com.wakeup.commponent.module.ai;

import com.chad.library.adapter.base.entity.MultiItemEntity;
import com.wakeup.common.network.entity.ai.AiLanguage;
import java.io.Serializable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetRecordBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b<\u0018\u0000 e2\u00020\u00012\u00020\u0002:\u0001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u001cR\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u001cR\u001a\u0010#\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\r\"\u0004\b%\u0010\u001cR\u001a\u0010&\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u000f\"\u0004\b(\u0010\u0018R\u001c\u0010)\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010/\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\u001a\u00102\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\r\"\u0004\b4\u0010\u001cR\u001a\u00105\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010\r\"\u0004\b7\u0010\u001cR\u001a\u00108\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\r\"\u0004\b:\u0010\u001cR\u001a\u0010;\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\r\"\u0004\b=\u0010\u001cR\u001a\u0010>\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\r\"\u0004\b@\u0010\u001cR\u001a\u0010A\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\r\"\u0004\bC\u0010\u001cR\u001a\u0010D\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\r\"\u0004\bF\u0010\u001cR\u001a\u0010G\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010\r\"\u0004\bI\u0010\u001cR\u001a\u0010J\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\r\"\u0004\bL\u0010\u001cR\u001a\u0010M\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010\r\"\u0004\bO\u0010\u001cR\u001a\u0010P\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\r\"\u0004\bR\u0010\u001cR\u001c\u0010S\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010,\"\u0004\bU\u0010.R\u001c\u0010V\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010,\"\u0004\bX\u0010.R\u001c\u0010Y\u001a\u0004\u0018\u00010*X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010,\"\u0004\b[\u0010.R\u001a\u0010\\\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b]\u0010\u000f\"\u0004\b^\u0010\u0018R\u001a\u0010_\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010\u000f\"\u0004\ba\u0010\u0018R\u001a\u0010b\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bc\u0010\u000f\"\u0004\bd\u0010\u0018¨\u0006f"}, d2 = {"Lcom/wakeup/commponent/module/ai/MeetRecordBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "Ljava/io/Serializable;", "id", "", "source", "", "time", "", "itemType", "<init>", "(Ljava/lang/String;IJI)V", "getId", "()Ljava/lang/String;", "getSource", "()I", "getTime", "()J", "setTime", "(J)V", "getItemType", "translateStatus", "getTranslateStatus", "setTranslateStatus", "(I)V", "audioPath", "getAudioPath", "setAudioPath", "(Ljava/lang/String;)V", "copyAudioPath", "getCopyAudioPath", "setCopyAudioPath", "wavPath", "getWavPath", "setWavPath", "wordPath", "getWordPath", "setWordPath", "audioDuration", "getAudioDuration", "setAudioDuration", "langBefore", "Lcom/wakeup/common/network/entity/ai/AiLanguage;", "getLangBefore", "()Lcom/wakeup/common/network/entity/ai/AiLanguage;", "setLangBefore", "(Lcom/wakeup/common/network/entity/ai/AiLanguage;)V", "langAfter", "getLangAfter", "setLangAfter", "text", "getText", "setText", "summaryText", "getSummaryText", "setSummaryText", "meetTheme", "getMeetTheme", "setMeetTheme", "meetPerson", "getMeetPerson", "setMeetPerson", "meetAddress", "getMeetAddress", "setMeetAddress", "translateText", "getTranslateText", "setTranslateText", "translateSummaryText", "getTranslateSummaryText", "setTranslateSummaryText", "xMindTranslateText", "getXMindTranslateText", "setXMindTranslateText", "exportFileName", "getExportFileName", "setExportFileName", "xMindFileName", "getXMindFileName", "setXMindFileName", "xMindTransFileName", "getXMindTransFileName", "setXMindTransFileName", "summaryLanguage", "getSummaryLanguage", "setSummaryLanguage", "mindLanguage", "getMindLanguage", "setMindLanguage", "oldLanguage", "getOldLanguage", "setOldLanguage", "summaryTextStatus", "getSummaryTextStatus", "setSummaryTextStatus", "mindTextStatus", "getMindTextStatus", "setMindTextStatus", "oldTextStatus", "getOldTextStatus", "setOldTextStatus", "Companion", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MeetRecordBean implements MultiItemEntity, Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int audioDuration;
    private String audioPath;
    private String copyAudioPath;
    private String exportFileName;
    private final String id;
    private final int itemType;
    private AiLanguage langAfter;
    private AiLanguage langBefore;
    private String meetAddress;
    private String meetPerson;
    private String meetTheme;
    private AiLanguage mindLanguage;
    private int mindTextStatus;
    private AiLanguage oldLanguage;
    private int oldTextStatus;
    private final int source;
    private AiLanguage summaryLanguage;
    private String summaryText;
    private int summaryTextStatus;
    private String text;
    private long time;
    private int translateStatus;
    private String translateSummaryText;
    private String translateText;
    private String wavPath;
    private String wordPath;
    private String xMindFileName;
    private String xMindTransFileName;
    private String xMindTranslateText;

    public MeetRecordBean(String id2, int i, long j, int i2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.id = id2;
        this.source = i;
        this.time = j;
        this.itemType = i2;
        this.audioPath = "";
        this.copyAudioPath = "";
        this.wavPath = "";
        this.wordPath = "";
        this.text = "";
        this.summaryText = "";
        this.meetTheme = "";
        this.meetPerson = "";
        this.meetAddress = "";
        this.translateText = "";
        this.translateSummaryText = "";
        this.xMindTranslateText = "";
        this.exportFileName = "";
        this.xMindFileName = "";
        this.xMindTransFileName = "";
    }

    public /* synthetic */ MeetRecordBean(String str, int i, long j, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, (i3 & 4) != 0 ? 0L : j, i2);
    }

    public final String getId() {
        return this.id;
    }

    public final int getSource() {
        return this.source;
    }

    public final long getTime() {
        return this.time;
    }

    public final void setTime(long j) {
        this.time = j;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    /* compiled from: MeetRecordBean.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commponent/module/ai/MeetRecordBean$Companion;", "", "<init>", "()V", "generateId", "", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final String generateId() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }
    }

    public final int getTranslateStatus() {
        return this.translateStatus;
    }

    public final void setTranslateStatus(int i) {
        this.translateStatus = i;
    }

    public final String getAudioPath() {
        return this.audioPath;
    }

    public final void setAudioPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.audioPath = str;
    }

    public final String getCopyAudioPath() {
        return this.copyAudioPath;
    }

    public final void setCopyAudioPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.copyAudioPath = str;
    }

    public final String getWavPath() {
        return this.wavPath;
    }

    public final void setWavPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wavPath = str;
    }

    public final String getWordPath() {
        return this.wordPath;
    }

    public final void setWordPath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.wordPath = str;
    }

    public final int getAudioDuration() {
        return this.audioDuration;
    }

    public final void setAudioDuration(int i) {
        this.audioDuration = i;
    }

    public final AiLanguage getLangBefore() {
        return this.langBefore;
    }

    public final void setLangBefore(AiLanguage aiLanguage) {
        this.langBefore = aiLanguage;
    }

    public final AiLanguage getLangAfter() {
        return this.langAfter;
    }

    public final void setLangAfter(AiLanguage aiLanguage) {
        this.langAfter = aiLanguage;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
    }

    public final String getSummaryText() {
        return this.summaryText;
    }

    public final void setSummaryText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.summaryText = str;
    }

    public final String getMeetTheme() {
        return this.meetTheme;
    }

    public final void setMeetTheme(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.meetTheme = str;
    }

    public final String getMeetPerson() {
        return this.meetPerson;
    }

    public final void setMeetPerson(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.meetPerson = str;
    }

    public final String getMeetAddress() {
        return this.meetAddress;
    }

    public final void setMeetAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.meetAddress = str;
    }

    public final String getTranslateText() {
        return this.translateText;
    }

    public final void setTranslateText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.translateText = str;
    }

    public final String getTranslateSummaryText() {
        return this.translateSummaryText;
    }

    public final void setTranslateSummaryText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.translateSummaryText = str;
    }

    public final String getXMindTranslateText() {
        return this.xMindTranslateText;
    }

    public final void setXMindTranslateText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.xMindTranslateText = str;
    }

    public final String getExportFileName() {
        return this.exportFileName;
    }

    public final void setExportFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.exportFileName = str;
    }

    public final String getXMindFileName() {
        return this.xMindFileName;
    }

    public final void setXMindFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.xMindFileName = str;
    }

    public final String getXMindTransFileName() {
        return this.xMindTransFileName;
    }

    public final void setXMindTransFileName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.xMindTransFileName = str;
    }

    public final AiLanguage getSummaryLanguage() {
        return this.summaryLanguage;
    }

    public final void setSummaryLanguage(AiLanguage aiLanguage) {
        this.summaryLanguage = aiLanguage;
    }

    public final AiLanguage getMindLanguage() {
        return this.mindLanguage;
    }

    public final void setMindLanguage(AiLanguage aiLanguage) {
        this.mindLanguage = aiLanguage;
    }

    public final AiLanguage getOldLanguage() {
        return this.oldLanguage;
    }

    public final void setOldLanguage(AiLanguage aiLanguage) {
        this.oldLanguage = aiLanguage;
    }

    public final int getSummaryTextStatus() {
        return this.summaryTextStatus;
    }

    public final void setSummaryTextStatus(int i) {
        this.summaryTextStatus = i;
    }

    public final int getMindTextStatus() {
        return this.mindTextStatus;
    }

    public final void setMindTextStatus(int i) {
        this.mindTextStatus = i;
    }

    public final int getOldTextStatus() {
        return this.oldTextStatus;
    }

    public final void setOldTextStatus(int i) {
        this.oldTextStatus = i;
    }
}
