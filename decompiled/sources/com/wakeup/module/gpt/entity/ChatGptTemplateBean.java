package com.wakeup.module.gpt.entity;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ChatGptTemplateBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/module/gpt/entity/ChatGptTemplateBean;", "", "id", "", "content", "", "<init>", "(ILjava/lang/String;)V", "getId", "()I", "getContent", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ChatGptTemplateBean {
    private final String content;
    private final int id;

    public static /* synthetic */ ChatGptTemplateBean copy$default(ChatGptTemplateBean chatGptTemplateBean, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatGptTemplateBean.id;
        }
        if ((i2 & 2) != 0) {
            str = chatGptTemplateBean.content;
        }
        return chatGptTemplateBean.copy(i, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    public final ChatGptTemplateBean copy(int id2, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new ChatGptTemplateBean(id2, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatGptTemplateBean)) {
            return false;
        }
        ChatGptTemplateBean chatGptTemplateBean = (ChatGptTemplateBean) other;
        return this.id == chatGptTemplateBean.id && Intrinsics.areEqual(this.content, chatGptTemplateBean.content);
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "ChatGptTemplateBean(id=" + this.id + ", content=" + this.content + Separators.RPAREN;
    }

    public ChatGptTemplateBean(int i, String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.id = i;
        this.content = content;
    }

    public final int getId() {
        return this.id;
    }

    public final String getContent() {
        return this.content;
    }
}
