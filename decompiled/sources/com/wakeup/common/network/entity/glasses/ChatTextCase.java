package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesResult.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/ChatTextCase;", "", "description", "", "recommends", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDescription", "()Ljava/lang/String;", "getRecommends", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ChatTextCase {
    private final String description;
    private final List<String> recommends;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ChatTextCase copy$default(ChatTextCase chatTextCase, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = chatTextCase.description;
        }
        if ((i & 2) != 0) {
            list = chatTextCase.recommends;
        }
        return chatTextCase.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component2() {
        return this.recommends;
    }

    public final ChatTextCase copy(String description, List<String> recommends) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(recommends, "recommends");
        return new ChatTextCase(description, recommends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatTextCase)) {
            return false;
        }
        ChatTextCase chatTextCase = (ChatTextCase) other;
        return Intrinsics.areEqual(this.description, chatTextCase.description) && Intrinsics.areEqual(this.recommends, chatTextCase.recommends);
    }

    public int hashCode() {
        return (this.description.hashCode() * 31) + this.recommends.hashCode();
    }

    public String toString() {
        return "ChatTextCase(description=" + this.description + ", recommends=" + this.recommends + Separators.RPAREN;
    }

    public ChatTextCase(String description, List<String> recommends) {
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(recommends, "recommends");
        this.description = description;
        this.recommends = recommends;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getRecommends() {
        return this.recommends;
    }
}
