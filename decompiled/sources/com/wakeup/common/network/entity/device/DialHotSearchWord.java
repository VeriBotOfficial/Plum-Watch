package com.wakeup.common.network.entity.device;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialHotSearchWord.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/wakeup/common/network/entity/device/DialHotSearchWord;", "Ljava/io/Serializable;", "id", "", "word", "", "isHot", "", Constants.SORT, "<init>", "(ILjava/lang/String;ZI)V", "getId", "()I", "getWord", "()Ljava/lang/String;", "()Z", "getSort", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialHotSearchWord implements Serializable {
    private final int id;
    private final boolean isHot;
    private final int sort;
    private final String word;

    public DialHotSearchWord() {
        this(0, null, false, 0, 15, null);
    }

    public static /* synthetic */ DialHotSearchWord copy$default(DialHotSearchWord dialHotSearchWord, int i, String str, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dialHotSearchWord.id;
        }
        if ((i3 & 2) != 0) {
            str = dialHotSearchWord.word;
        }
        if ((i3 & 4) != 0) {
            z = dialHotSearchWord.isHot;
        }
        if ((i3 & 8) != 0) {
            i2 = dialHotSearchWord.sort;
        }
        return dialHotSearchWord.copy(i, str, z, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWord() {
        return this.word;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsHot() {
        return this.isHot;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final DialHotSearchWord copy(int id2, String word, boolean isHot, int sort) {
        Intrinsics.checkNotNullParameter(word, "word");
        return new DialHotSearchWord(id2, word, isHot, sort);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialHotSearchWord)) {
            return false;
        }
        DialHotSearchWord dialHotSearchWord = (DialHotSearchWord) other;
        return this.id == dialHotSearchWord.id && Intrinsics.areEqual(this.word, dialHotSearchWord.word) && this.isHot == dialHotSearchWord.isHot && this.sort == dialHotSearchWord.sort;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.word.hashCode()) * 31) + Boolean.hashCode(this.isHot)) * 31) + Integer.hashCode(this.sort);
    }

    public String toString() {
        return "DialHotSearchWord(id=" + this.id + ", word=" + this.word + ", isHot=" + this.isHot + ", sort=" + this.sort + Separators.RPAREN;
    }

    public DialHotSearchWord(int i, String word, boolean z, int i2) {
        Intrinsics.checkNotNullParameter(word, "word");
        this.id = i;
        this.word = word;
        this.isHot = z;
        this.sort = i2;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ DialHotSearchWord(int i, String str, boolean z, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? "" : str, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? 0 : i2);
    }

    public final String getWord() {
        return this.word;
    }

    public final boolean isHot() {
        return this.isHot;
    }

    public final int getSort() {
        return this.sort;
    }
}
