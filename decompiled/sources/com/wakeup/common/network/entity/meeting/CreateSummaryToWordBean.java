package com.wakeup.common.network.entity.meeting;

import android.gov.nist.core.Separators;
import com.tiktok.appevents.contents.TTContentsEventConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MeetingBean.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/meeting/CreateSummaryToWordBean;", "", "fileName", "", TTContentsEventConstants.Params.EVENT_PROPERTY_CONTENTS, "", "Lcom/wakeup/common/network/entity/meeting/Content;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getFileName", "()Ljava/lang/String;", "getContents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CreateSummaryToWordBean {
    private final List<Content> contents;
    private final String fileName;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CreateSummaryToWordBean copy$default(CreateSummaryToWordBean createSummaryToWordBean, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = createSummaryToWordBean.fileName;
        }
        if ((i & 2) != 0) {
            list = createSummaryToWordBean.contents;
        }
        return createSummaryToWordBean.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    public final List<Content> component2() {
        return this.contents;
    }

    public final CreateSummaryToWordBean copy(String fileName, List<Content> contents) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(contents, "contents");
        return new CreateSummaryToWordBean(fileName, contents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateSummaryToWordBean)) {
            return false;
        }
        CreateSummaryToWordBean createSummaryToWordBean = (CreateSummaryToWordBean) other;
        return Intrinsics.areEqual(this.fileName, createSummaryToWordBean.fileName) && Intrinsics.areEqual(this.contents, createSummaryToWordBean.contents);
    }

    public int hashCode() {
        return (this.fileName.hashCode() * 31) + this.contents.hashCode();
    }

    public String toString() {
        return "CreateSummaryToWordBean(fileName=" + this.fileName + ", contents=" + this.contents + Separators.RPAREN;
    }

    public CreateSummaryToWordBean(String fileName, List<Content> contents) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(contents, "contents");
        this.fileName = fileName;
        this.contents = contents;
    }

    public final String getFileName() {
        return this.fileName;
    }

    public final List<Content> getContents() {
        return this.contents;
    }
}
