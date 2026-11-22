package com.wakeup.common.common.constants.publishlist;

import com.wakeup.howear.view.home.feedvideo.HomepageFeedVideoFragmentKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PublisherListConstants.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/wakeup/common/common/constants/publishlist/PublisherListItemTypes;", "", "value", "", "displayName", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "getDisplayName", "RECOMMEND", "FOLLOW_RECOMMEND", "FOLLOW_PUBLISHER", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PublisherListItemTypes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PublisherListItemTypes[] $VALUES;
    private final String displayName;
    private final String value;
    public static final PublisherListItemTypes RECOMMEND = new PublisherListItemTypes("RECOMMEND", 0, HomepageFeedVideoFragmentKt.TYPE_HOME_FEED_RECOMMEND, "近日最火");
    public static final PublisherListItemTypes FOLLOW_RECOMMEND = new PublisherListItemTypes("FOLLOW_RECOMMEND", 1, "follow_recommend", "推荐关注");
    public static final PublisherListItemTypes FOLLOW_PUBLISHER = new PublisherListItemTypes("FOLLOW_PUBLISHER", 2, HomepageFeedVideoFragmentKt.TYPE_HOME_FEED_FOLLOW, "");

    private static final /* synthetic */ PublisherListItemTypes[] $values() {
        return new PublisherListItemTypes[]{RECOMMEND, FOLLOW_RECOMMEND, FOLLOW_PUBLISHER};
    }

    public static EnumEntries<PublisherListItemTypes> getEntries() {
        return $ENTRIES;
    }

    private PublisherListItemTypes(String str, int i, String str2, String str3) {
        this.value = str2;
        this.displayName = str3;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        PublisherListItemTypes[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static PublisherListItemTypes valueOf(String str) {
        return (PublisherListItemTypes) Enum.valueOf(PublisherListItemTypes.class, str);
    }

    public static PublisherListItemTypes[] values() {
        return (PublisherListItemTypes[]) $VALUES.clone();
    }
}
