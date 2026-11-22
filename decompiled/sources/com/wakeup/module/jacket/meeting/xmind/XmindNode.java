package com.wakeup.module.jacket.meeting.xmind;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: XmindNode.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/jacket/meeting/xmind/XmindNode;", "Ljava/io/Serializable;", "title", "", DOMConstants.TAG_CHILDREN, "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getChildren", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "feature-jacket_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class XmindNode implements Serializable {
    private final List<XmindNode> children;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ XmindNode copy$default(XmindNode xmindNode, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = xmindNode.title;
        }
        if ((i & 2) != 0) {
            list = xmindNode.children;
        }
        return xmindNode.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<XmindNode> component2() {
        return this.children;
    }

    public final XmindNode copy(String title, List<XmindNode> children) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(children, "children");
        return new XmindNode(title, children);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof XmindNode)) {
            return false;
        }
        XmindNode xmindNode = (XmindNode) other;
        return Intrinsics.areEqual(this.title, xmindNode.title) && Intrinsics.areEqual(this.children, xmindNode.children);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.children.hashCode();
    }

    public String toString() {
        return "XmindNode(title=" + this.title + ", children=" + this.children + Separators.RPAREN;
    }

    public XmindNode(String title, List<XmindNode> children) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(children, "children");
        this.title = title;
        this.children = children;
    }

    public final String getTitle() {
        return this.title;
    }

    public /* synthetic */ XmindNode(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<XmindNode> getChildren() {
        return this.children;
    }
}
