package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/ai/FileToTextResultBean2;", "", "fullText", "", "sentencesList", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFullText", "()Ljava/lang/String;", "getSentencesList", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FileToTextResultBean2 {
    private final String fullText;
    private final List<String> sentencesList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileToTextResultBean2 copy$default(FileToTextResultBean2 fileToTextResultBean2, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fileToTextResultBean2.fullText;
        }
        if ((i & 2) != 0) {
            list = fileToTextResultBean2.sentencesList;
        }
        return fileToTextResultBean2.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFullText() {
        return this.fullText;
    }

    public final List<String> component2() {
        return this.sentencesList;
    }

    public final FileToTextResultBean2 copy(String fullText, List<String> sentencesList) {
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(sentencesList, "sentencesList");
        return new FileToTextResultBean2(fullText, sentencesList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileToTextResultBean2)) {
            return false;
        }
        FileToTextResultBean2 fileToTextResultBean2 = (FileToTextResultBean2) other;
        return Intrinsics.areEqual(this.fullText, fileToTextResultBean2.fullText) && Intrinsics.areEqual(this.sentencesList, fileToTextResultBean2.sentencesList);
    }

    public int hashCode() {
        return (this.fullText.hashCode() * 31) + this.sentencesList.hashCode();
    }

    public String toString() {
        return "FileToTextResultBean2(fullText=" + this.fullText + ", sentencesList=" + this.sentencesList + Separators.RPAREN;
    }

    public FileToTextResultBean2(String fullText, List<String> sentencesList) {
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        Intrinsics.checkNotNullParameter(sentencesList, "sentencesList");
        this.fullText = fullText;
        this.sentencesList = sentencesList;
    }

    public final String getFullText() {
        return this.fullText;
    }

    public final List<String> getSentencesList() {
        return this.sentencesList;
    }
}
