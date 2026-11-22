package com.wakeup.module.gpt.utils;

import android.graphics.Color;
import com.wakeup.common.utils.StringUtils;
import com.wakeup.commonui.R;
import com.wakeup.commponent.module.chatGpt.ChatGptClassify;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/module/gpt/utils/CommonUtils;", "", "<init>", "()V", "Companion", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommonUtils {
    public static final int ANSWER_MAX_LENGTH = 300;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int QUESTION_MAX_LENGTH = 30;

    @JvmStatic
    public static final int getClassifyColor(ChatGptClassify chatGptClassify) {
        return INSTANCE.getClassifyColor(chatGptClassify);
    }

    @JvmStatic
    public static final String getClassifyStr(ChatGptClassify chatGptClassify) {
        return INSTANCE.getClassifyStr(chatGptClassify);
    }

    /* compiled from: CommonUtils.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/module/gpt/utils/CommonUtils$Companion;", "", "<init>", "()V", "QUESTION_MAX_LENGTH", "", "ANSWER_MAX_LENGTH", "getClassifyStr", "", "classify", "Lcom/wakeup/commponent/module/chatGpt/ChatGptClassify;", "getClassifyColor", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: CommonUtils.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ChatGptClassify.values().length];
                try {
                    iArr[ChatGptClassify.CLASSIFY_HEALTH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_SPORT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_DIET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_VIDEO_SCRIPT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_RED_BOOK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_REPORTS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_COMMERCE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_TITLE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_TRAVEL.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_TIKTOK_SCRIPT.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_INSTAGRAM.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_FACEBOOK_WORDS.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ChatGptClassify.CLASSIFY_TRANSLATE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final String getClassifyStr(ChatGptClassify classify) {
            Intrinsics.checkNotNullParameter(classify, "classify");
            switch (WhenMappings.$EnumSwitchMapping$0[classify.ordinal()]) {
                case 1:
                    String string = StringUtils.getString(R.string.chat_gpt_health_title);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    return string;
                case 2:
                    String string2 = StringUtils.getString(R.string.gpt_create_sport_plan);
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                    return string2;
                case 3:
                    String string3 = StringUtils.getString(R.string.chat_gpt_health_diet);
                    Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                    return string3;
                case 4:
                    String string4 = StringUtils.getString(R.string.chat_gpt_short_video_script);
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    return string4;
                case 5:
                    String string5 = StringUtils.getString(R.string.chat_gpt_red_book_style);
                    Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                    return string5;
                case 6:
                    String string6 = StringUtils.getString(R.string.chat_gpt_weekly_daily_week);
                    Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                    return string6;
                case 7:
                    String string7 = StringUtils.getString(R.string.chat_gpt_ecommerce);
                    Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                    return string7;
                case 8:
                    String string8 = StringUtils.getString(R.string.chat_gpt_title_home);
                    Intrinsics.checkNotNullExpressionValue(string8, "getString(...)");
                    return string8;
                case 9:
                    String string9 = StringUtils.getString(R.string.chat_gpt_travel);
                    Intrinsics.checkNotNullExpressionValue(string9, "getString(...)");
                    return string9;
                case 10:
                    String string10 = StringUtils.getString(R.string.chat_gpt_tiktok_script);
                    Intrinsics.checkNotNullExpressionValue(string10, "getString(...)");
                    return string10;
                case 11:
                    String string11 = StringUtils.getString(R.string.chat_gpt_instagram_style);
                    Intrinsics.checkNotNullExpressionValue(string11, "getString(...)");
                    return string11;
                case 12:
                    String string12 = StringUtils.getString(R.string.chat_gpt_facebook_ecommerce);
                    Intrinsics.checkNotNullExpressionValue(string12, "getString(...)");
                    return string12;
                case 13:
                    String string13 = StringUtils.getString(R.string.language_smart_translation);
                    Intrinsics.checkNotNullExpressionValue(string13, "getString(...)");
                    return string13;
                default:
                    String string14 = StringUtils.getString(R.string.chat_gpt_free_title);
                    Intrinsics.checkNotNullExpressionValue(string14, "getString(...)");
                    return string14;
            }
        }

        @JvmStatic
        public final int getClassifyColor(ChatGptClassify classify) {
            Intrinsics.checkNotNullParameter(classify, "classify");
            switch (WhenMappings.$EnumSwitchMapping$0[classify.ordinal()]) {
                case 1:
                    return Color.parseColor("#920EFF");
                case 2:
                    return Color.parseColor("#004DFF");
                case 3:
                    return Color.parseColor("#4DC594");
                case 4:
                case 10:
                    return Color.parseColor("#C8439C");
                case 5:
                case 11:
                    return Color.parseColor("#FF1900");
                case 6:
                    return Color.parseColor("#409C8A");
                case 7:
                case 12:
                    return Color.parseColor("#FFC45B");
                case 8:
                    return Color.parseColor("#60C939");
                case 9:
                    return Color.parseColor("#A086FF");
                default:
                    return Color.parseColor("#FF7300");
            }
        }
    }
}
