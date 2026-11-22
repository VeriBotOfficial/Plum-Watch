package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FileToTextBean.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/ai/TextResult;", "", "sentences", "", "Lcom/wakeup/common/network/entity/ai/Sentences;", "words", "Lcom/wakeup/common/network/entity/ai/Words;", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSentences", "()Ljava/util/List;", "getWords", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TextResult {
    private final List<Sentences> sentences;
    private final List<Words> words;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TextResult copy$default(TextResult textResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = textResult.sentences;
        }
        if ((i & 2) != 0) {
            list2 = textResult.words;
        }
        return textResult.copy(list, list2);
    }

    public final List<Sentences> component1() {
        return this.sentences;
    }

    public final List<Words> component2() {
        return this.words;
    }

    public final TextResult copy(List<Sentences> sentences, List<Words> words) {
        Intrinsics.checkNotNullParameter(sentences, "sentences");
        Intrinsics.checkNotNullParameter(words, "words");
        return new TextResult(sentences, words);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextResult)) {
            return false;
        }
        TextResult textResult = (TextResult) other;
        return Intrinsics.areEqual(this.sentences, textResult.sentences) && Intrinsics.areEqual(this.words, textResult.words);
    }

    public int hashCode() {
        return (this.sentences.hashCode() * 31) + this.words.hashCode();
    }

    public String toString() {
        return "TextResult(sentences=" + this.sentences + ", words=" + this.words + Separators.RPAREN;
    }

    public TextResult(List<Sentences> sentences, List<Words> words) {
        Intrinsics.checkNotNullParameter(sentences, "sentences");
        Intrinsics.checkNotNullParameter(words, "words");
        this.sentences = sentences;
        this.words = words;
    }

    public final List<Sentences> getSentences() {
        return this.sentences;
    }

    public final List<Words> getWords() {
        return this.words;
    }
}
