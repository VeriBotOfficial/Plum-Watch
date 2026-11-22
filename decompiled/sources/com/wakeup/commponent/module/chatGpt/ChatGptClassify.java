package com.wakeup.commponent.module.chatGpt;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatGptClassify.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/wakeup/commponent/module/chatGpt/ChatGptClassify;", "", "<init>", "(Ljava/lang/String;I)V", "CLASSIFY_QUESTION", "CLASSIFY_HEALTH", "CLASSIFY_SPORT", "CLASSIFY_DIET", "CLASSIFY_VIDEO_SCRIPT", "CLASSIFY_RED_BOOK", "CLASSIFY_REPORTS", "CLASSIFY_COMMERCE", "CLASSIFY_TITLE", "CLASSIFY_TRAVEL", "CLASSIFY_TIKTOK_SCRIPT", "CLASSIFY_INSTAGRAM", "CLASSIFY_FACEBOOK_WORDS", "CLASSIFY_TRANSLATE", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ChatGptClassify {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatGptClassify[] $VALUES;
    public static final ChatGptClassify CLASSIFY_QUESTION = new ChatGptClassify("CLASSIFY_QUESTION", 0);
    public static final ChatGptClassify CLASSIFY_HEALTH = new ChatGptClassify("CLASSIFY_HEALTH", 1);
    public static final ChatGptClassify CLASSIFY_SPORT = new ChatGptClassify("CLASSIFY_SPORT", 2);
    public static final ChatGptClassify CLASSIFY_DIET = new ChatGptClassify("CLASSIFY_DIET", 3);
    public static final ChatGptClassify CLASSIFY_VIDEO_SCRIPT = new ChatGptClassify("CLASSIFY_VIDEO_SCRIPT", 4);
    public static final ChatGptClassify CLASSIFY_RED_BOOK = new ChatGptClassify("CLASSIFY_RED_BOOK", 5);
    public static final ChatGptClassify CLASSIFY_REPORTS = new ChatGptClassify("CLASSIFY_REPORTS", 6);
    public static final ChatGptClassify CLASSIFY_COMMERCE = new ChatGptClassify("CLASSIFY_COMMERCE", 7);
    public static final ChatGptClassify CLASSIFY_TITLE = new ChatGptClassify("CLASSIFY_TITLE", 8);
    public static final ChatGptClassify CLASSIFY_TRAVEL = new ChatGptClassify("CLASSIFY_TRAVEL", 9);
    public static final ChatGptClassify CLASSIFY_TIKTOK_SCRIPT = new ChatGptClassify("CLASSIFY_TIKTOK_SCRIPT", 10);
    public static final ChatGptClassify CLASSIFY_INSTAGRAM = new ChatGptClassify("CLASSIFY_INSTAGRAM", 11);
    public static final ChatGptClassify CLASSIFY_FACEBOOK_WORDS = new ChatGptClassify("CLASSIFY_FACEBOOK_WORDS", 12);
    public static final ChatGptClassify CLASSIFY_TRANSLATE = new ChatGptClassify("CLASSIFY_TRANSLATE", 13);

    private static final /* synthetic */ ChatGptClassify[] $values() {
        return new ChatGptClassify[]{CLASSIFY_QUESTION, CLASSIFY_HEALTH, CLASSIFY_SPORT, CLASSIFY_DIET, CLASSIFY_VIDEO_SCRIPT, CLASSIFY_RED_BOOK, CLASSIFY_REPORTS, CLASSIFY_COMMERCE, CLASSIFY_TITLE, CLASSIFY_TRAVEL, CLASSIFY_TIKTOK_SCRIPT, CLASSIFY_INSTAGRAM, CLASSIFY_FACEBOOK_WORDS, CLASSIFY_TRANSLATE};
    }

    public static EnumEntries<ChatGptClassify> getEntries() {
        return $ENTRIES;
    }

    private ChatGptClassify(String str, int i) {
    }

    static {
        ChatGptClassify[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static ChatGptClassify valueOf(String str) {
        return (ChatGptClassify) Enum.valueOf(ChatGptClassify.class, str);
    }

    public static ChatGptClassify[] values() {
        return (ChatGptClassify[]) $VALUES.clone();
    }
}
