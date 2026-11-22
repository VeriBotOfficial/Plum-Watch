package com.wakeup.feature.search.bean;

import android.gov.nist.core.Separators;
import com.alipay.sdk.m.c0.d;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSearchBean.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\f"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean;", "", "<init>", "()V", "AiSearchHistoryBean", "HistoryParticularBean", "SearchResponse", "WebSiteBean", "SearchListWrapper", "SearchRecord", "SearchHistoryItem", "SearchRecordItem", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AiSearchBean {

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J)\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006 "}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$AiSearchHistoryBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "historyDate", "", "subItem", "itemType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getHistoryDate", "()Ljava/lang/String;", "setHistoryDate", "(Ljava/lang/String;)V", "getSubItem", "setSubItem", "getItemType", "()I", "type", "", "getType", "()Z", "setType", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AiSearchHistoryBean implements MultiItemEntity {
        private String historyDate;
        private final int itemType;
        private String subItem;
        private boolean type;

        public static /* synthetic */ AiSearchHistoryBean copy$default(AiSearchHistoryBean aiSearchHistoryBean, String str, String str2, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aiSearchHistoryBean.historyDate;
            }
            if ((i2 & 2) != 0) {
                str2 = aiSearchHistoryBean.subItem;
            }
            if ((i2 & 4) != 0) {
                i = aiSearchHistoryBean.itemType;
            }
            return aiSearchHistoryBean.copy(str, str2, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHistoryDate() {
            return this.historyDate;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubItem() {
            return this.subItem;
        }

        /* renamed from: component3, reason: from getter */
        public final int getItemType() {
            return this.itemType;
        }

        public final AiSearchHistoryBean copy(String historyDate, String subItem, int itemType) {
            Intrinsics.checkNotNullParameter(subItem, "subItem");
            return new AiSearchHistoryBean(historyDate, subItem, itemType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AiSearchHistoryBean)) {
                return false;
            }
            AiSearchHistoryBean aiSearchHistoryBean = (AiSearchHistoryBean) other;
            return Intrinsics.areEqual(this.historyDate, aiSearchHistoryBean.historyDate) && Intrinsics.areEqual(this.subItem, aiSearchHistoryBean.subItem) && this.itemType == aiSearchHistoryBean.itemType;
        }

        public int hashCode() {
            String str = this.historyDate;
            return ((((str == null ? 0 : str.hashCode()) * 31) + this.subItem.hashCode()) * 31) + Integer.hashCode(this.itemType);
        }

        public String toString() {
            return "AiSearchHistoryBean(historyDate=" + this.historyDate + ", subItem=" + this.subItem + ", itemType=" + this.itemType + Separators.RPAREN;
        }

        public AiSearchHistoryBean(String str, String subItem, int i) {
            Intrinsics.checkNotNullParameter(subItem, "subItem");
            this.historyDate = str;
            this.subItem = subItem;
            this.itemType = i;
        }

        public final String getHistoryDate() {
            return this.historyDate;
        }

        public final void setHistoryDate(String str) {
            this.historyDate = str;
        }

        public final String getSubItem() {
            return this.subItem;
        }

        public final void setSubItem(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.subItem = str;
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return this.itemType;
        }

        public final boolean getType() {
            return this.type;
        }

        public final void setType(boolean z) {
            this.type = z;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J7\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006$"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$HistoryParticularBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "historyTitle", "", "title", "content", "itemType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getHistoryTitle", "()Ljava/lang/String;", "setHistoryTitle", "(Ljava/lang/String;)V", "getTitle", d.p, "getContent", "setContent", "getItemType", "()I", "type", "", "getType", "()Z", "setType", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "toString", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HistoryParticularBean implements MultiItemEntity {
        private String content;
        private String historyTitle;
        private final int itemType;
        private String title;
        private boolean type;

        public static /* synthetic */ HistoryParticularBean copy$default(HistoryParticularBean historyParticularBean, String str, String str2, String str3, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = historyParticularBean.historyTitle;
            }
            if ((i2 & 2) != 0) {
                str2 = historyParticularBean.title;
            }
            if ((i2 & 4) != 0) {
                str3 = historyParticularBean.content;
            }
            if ((i2 & 8) != 0) {
                i = historyParticularBean.itemType;
            }
            return historyParticularBean.copy(str, str2, str3, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getHistoryTitle() {
            return this.historyTitle;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        /* renamed from: component4, reason: from getter */
        public final int getItemType() {
            return this.itemType;
        }

        public final HistoryParticularBean copy(String historyTitle, String title, String content, int itemType) {
            return new HistoryParticularBean(historyTitle, title, content, itemType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HistoryParticularBean)) {
                return false;
            }
            HistoryParticularBean historyParticularBean = (HistoryParticularBean) other;
            return Intrinsics.areEqual(this.historyTitle, historyParticularBean.historyTitle) && Intrinsics.areEqual(this.title, historyParticularBean.title) && Intrinsics.areEqual(this.content, historyParticularBean.content) && this.itemType == historyParticularBean.itemType;
        }

        public int hashCode() {
            String str = this.historyTitle;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.title;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.content;
            return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.itemType);
        }

        public String toString() {
            return "HistoryParticularBean(historyTitle=" + this.historyTitle + ", title=" + this.title + ", content=" + this.content + ", itemType=" + this.itemType + Separators.RPAREN;
        }

        public HistoryParticularBean(String str, String str2, String str3, int i) {
            this.historyTitle = str;
            this.title = str2;
            this.content = str3;
            this.itemType = i;
        }

        public final String getHistoryTitle() {
            return this.historyTitle;
        }

        public final void setHistoryTitle(String str) {
            this.historyTitle = str;
        }

        public final String getTitle() {
            return this.title;
        }

        public final void setTitle(String str) {
            this.title = str;
        }

        public final String getContent() {
            return this.content;
        }

        public final void setContent(String str) {
            this.content = str;
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return this.itemType;
        }

        public final boolean getType() {
            return this.type;
        }

        public final void setType(boolean z) {
            this.type = z;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010'\u001a\u00020\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jr\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u0002022\b\u00103\u001a\u0004\u0018\u000104HÖ\u0003J\t\u00105\u001a\u00020\bHÖ\u0001J\t\u00106\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013¨\u00067"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$SearchResponse;", "Ljava/io/Serializable;", "conversationId", "", "question", "text", "searchEngine", "webNum", "", "webItem", "", "Lcom/wakeup/feature/search/bean/AiSearchBean$WebSiteBean;", "updateType", "status", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "getConversationId", "()Ljava/lang/String;", "setConversationId", "(Ljava/lang/String;)V", "getQuestion", "setQuestion", "getText", "setText", "getSearchEngine", "setSearchEngine", "getWebNum", "()Ljava/lang/Integer;", "setWebNum", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWebItem", "()Ljava/util/List;", "setWebItem", "(Ljava/util/List;)V", "getUpdateType", "setUpdateType", "getStatus", "setStatus", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lcom/wakeup/feature/search/bean/AiSearchBean$SearchResponse;", "equals", "", "other", "", "hashCode", "toString", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchResponse implements Serializable {
        private String conversationId;
        private String question;
        private String searchEngine;
        private String status;
        private String text;
        private String updateType;
        private List<WebSiteBean> webItem;
        private Integer webNum;

        public static /* synthetic */ SearchResponse copy$default(SearchResponse searchResponse, String str, String str2, String str3, String str4, Integer num, List list, String str5, String str6, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchResponse.conversationId;
            }
            if ((i & 2) != 0) {
                str2 = searchResponse.question;
            }
            if ((i & 4) != 0) {
                str3 = searchResponse.text;
            }
            if ((i & 8) != 0) {
                str4 = searchResponse.searchEngine;
            }
            if ((i & 16) != 0) {
                num = searchResponse.webNum;
            }
            if ((i & 32) != 0) {
                list = searchResponse.webItem;
            }
            if ((i & 64) != 0) {
                str5 = searchResponse.updateType;
            }
            if ((i & 128) != 0) {
                str6 = searchResponse.status;
            }
            String str7 = str5;
            String str8 = str6;
            Integer num2 = num;
            List list2 = list;
            return searchResponse.copy(str, str2, str3, str4, num2, list2, str7, str8);
        }

        /* renamed from: component1, reason: from getter */
        public final String getConversationId() {
            return this.conversationId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getQuestion() {
            return this.question;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSearchEngine() {
            return this.searchEngine;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getWebNum() {
            return this.webNum;
        }

        public final List<WebSiteBean> component6() {
            return this.webItem;
        }

        /* renamed from: component7, reason: from getter */
        public final String getUpdateType() {
            return this.updateType;
        }

        /* renamed from: component8, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        public final SearchResponse copy(String conversationId, String question, String text, String searchEngine, Integer webNum, List<WebSiteBean> webItem, String updateType, String status) {
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            return new SearchResponse(conversationId, question, text, searchEngine, webNum, webItem, updateType, status);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchResponse)) {
                return false;
            }
            SearchResponse searchResponse = (SearchResponse) other;
            return Intrinsics.areEqual(this.conversationId, searchResponse.conversationId) && Intrinsics.areEqual(this.question, searchResponse.question) && Intrinsics.areEqual(this.text, searchResponse.text) && Intrinsics.areEqual(this.searchEngine, searchResponse.searchEngine) && Intrinsics.areEqual(this.webNum, searchResponse.webNum) && Intrinsics.areEqual(this.webItem, searchResponse.webItem) && Intrinsics.areEqual(this.updateType, searchResponse.updateType) && Intrinsics.areEqual(this.status, searchResponse.status);
        }

        public int hashCode() {
            int hashCode = this.conversationId.hashCode() * 31;
            String str = this.question;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.searchEngine;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Integer num = this.webNum;
            int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
            List<WebSiteBean> list = this.webItem;
            int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            String str4 = this.updateType;
            int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.status;
            return hashCode7 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            return "SearchResponse(conversationId=" + this.conversationId + ", question=" + this.question + ", text=" + this.text + ", searchEngine=" + this.searchEngine + ", webNum=" + this.webNum + ", webItem=" + this.webItem + ", updateType=" + this.updateType + ", status=" + this.status + Separators.RPAREN;
        }

        public SearchResponse(String conversationId, String str, String str2, String str3, Integer num, List<WebSiteBean> list, String str4, String str5) {
            Intrinsics.checkNotNullParameter(conversationId, "conversationId");
            this.conversationId = conversationId;
            this.question = str;
            this.text = str2;
            this.searchEngine = str3;
            this.webNum = num;
            this.webItem = list;
            this.updateType = str4;
            this.status = str5;
        }

        public final String getConversationId() {
            return this.conversationId;
        }

        public final void setConversationId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.conversationId = str;
        }

        public final String getQuestion() {
            return this.question;
        }

        public final void setQuestion(String str) {
            this.question = str;
        }

        public final String getText() {
            return this.text;
        }

        public final void setText(String str) {
            this.text = str;
        }

        public final String getSearchEngine() {
            return this.searchEngine;
        }

        public final void setSearchEngine(String str) {
            this.searchEngine = str;
        }

        public final Integer getWebNum() {
            return this.webNum;
        }

        public final void setWebNum(Integer num) {
            this.webNum = num;
        }

        public final List<WebSiteBean> getWebItem() {
            return this.webItem;
        }

        public final void setWebItem(List<WebSiteBean> list) {
            this.webItem = list;
        }

        public final String getUpdateType() {
            return this.updateType;
        }

        public final void setUpdateType(String str) {
            this.updateType = str;
        }

        public final String getStatus() {
            return this.status;
        }

        public final void setStatus(String str) {
            this.status = str;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011¨\u0006!"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$WebSiteBean;", "Ljava/io/Serializable;", "siteNum", "", "siteName", "", "siteContent", "siteUrl", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSiteNum", "()I", "setSiteNum", "(I)V", "getSiteName", "()Ljava/lang/String;", "setSiteName", "(Ljava/lang/String;)V", "getSiteContent", "setSiteContent", "getSiteUrl", "setSiteUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WebSiteBean implements Serializable {
        private String siteContent;
        private String siteName;
        private int siteNum;
        private String siteUrl;

        public static /* synthetic */ WebSiteBean copy$default(WebSiteBean webSiteBean, int i, String str, String str2, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = webSiteBean.siteNum;
            }
            if ((i2 & 2) != 0) {
                str = webSiteBean.siteName;
            }
            if ((i2 & 4) != 0) {
                str2 = webSiteBean.siteContent;
            }
            if ((i2 & 8) != 0) {
                str3 = webSiteBean.siteUrl;
            }
            return webSiteBean.copy(i, str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getSiteNum() {
            return this.siteNum;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSiteName() {
            return this.siteName;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSiteContent() {
            return this.siteContent;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSiteUrl() {
            return this.siteUrl;
        }

        public final WebSiteBean copy(int siteNum, String siteName, String siteContent, String siteUrl) {
            Intrinsics.checkNotNullParameter(siteContent, "siteContent");
            Intrinsics.checkNotNullParameter(siteUrl, "siteUrl");
            return new WebSiteBean(siteNum, siteName, siteContent, siteUrl);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebSiteBean)) {
                return false;
            }
            WebSiteBean webSiteBean = (WebSiteBean) other;
            return this.siteNum == webSiteBean.siteNum && Intrinsics.areEqual(this.siteName, webSiteBean.siteName) && Intrinsics.areEqual(this.siteContent, webSiteBean.siteContent) && Intrinsics.areEqual(this.siteUrl, webSiteBean.siteUrl);
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.siteNum) * 31;
            String str = this.siteName;
            return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.siteContent.hashCode()) * 31) + this.siteUrl.hashCode();
        }

        public String toString() {
            return "WebSiteBean(siteNum=" + this.siteNum + ", siteName=" + this.siteName + ", siteContent=" + this.siteContent + ", siteUrl=" + this.siteUrl + Separators.RPAREN;
        }

        public WebSiteBean(int i, String str, String siteContent, String siteUrl) {
            Intrinsics.checkNotNullParameter(siteContent, "siteContent");
            Intrinsics.checkNotNullParameter(siteUrl, "siteUrl");
            this.siteNum = i;
            this.siteName = str;
            this.siteContent = siteContent;
            this.siteUrl = siteUrl;
        }

        public final int getSiteNum() {
            return this.siteNum;
        }

        public final void setSiteNum(int i) {
            this.siteNum = i;
        }

        public final String getSiteName() {
            return this.siteName;
        }

        public final void setSiteName(String str) {
            this.siteName = str;
        }

        public final String getSiteContent() {
            return this.siteContent;
        }

        public final void setSiteContent(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.siteContent = str;
        }

        public final String getSiteUrl() {
            return this.siteUrl;
        }

        public final void setSiteUrl(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.siteUrl = str;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$SearchListWrapper;", "Ljava/io/Serializable;", "searchList", "", "Lcom/wakeup/feature/search/bean/AiSearchBean$SearchResponse;", "<init>", "(Ljava/util/List;)V", "getSearchList", "()Ljava/util/List;", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class SearchListWrapper implements Serializable {
        private final List<SearchResponse> searchList;

        public SearchListWrapper(List<SearchResponse> searchList) {
            Intrinsics.checkNotNullParameter(searchList, "searchList");
            this.searchList = searchList;
        }

        public final List<SearchResponse> getSearchList() {
            return this.searchList;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$SearchRecord;", "", "searchTerm", "", "date", "", "<init>", "(Ljava/lang/String;J)V", "getSearchTerm", "()Ljava/lang/String;", "getDate", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchRecord {
        private final long date;
        private final String searchTerm;

        public static /* synthetic */ SearchRecord copy$default(SearchRecord searchRecord, String str, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchRecord.searchTerm;
            }
            if ((i & 2) != 0) {
                j = searchRecord.date;
            }
            return searchRecord.copy(str, j);
        }

        /* renamed from: component1, reason: from getter */
        public final String getSearchTerm() {
            return this.searchTerm;
        }

        /* renamed from: component2, reason: from getter */
        public final long getDate() {
            return this.date;
        }

        public final SearchRecord copy(String searchTerm, long date) {
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            return new SearchRecord(searchTerm, date);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchRecord)) {
                return false;
            }
            SearchRecord searchRecord = (SearchRecord) other;
            return Intrinsics.areEqual(this.searchTerm, searchRecord.searchTerm) && this.date == searchRecord.date;
        }

        public int hashCode() {
            return (this.searchTerm.hashCode() * 31) + Long.hashCode(this.date);
        }

        public String toString() {
            return "SearchRecord(searchTerm=" + this.searchTerm + ", date=" + this.date + Separators.RPAREN;
        }

        public SearchRecord(String searchTerm, long j) {
            Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
            this.searchTerm = searchTerm;
            this.date = j;
        }

        public final String getSearchTerm() {
            return this.searchTerm;
        }

        public final long getDate() {
            return this.date;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u000eHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$SearchHistoryItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "date", "", "records", "", "Lcom/wakeup/feature/search/bean/AiSearchBean$SearchRecord;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getDate", "()Ljava/lang/String;", "getRecords", "()Ljava/util/List;", "itemType", "", "getItemType", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "Companion", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchHistoryItem implements MultiItemEntity {
        public static final int VIEW_TYPE_DATE = 0;
        public static final int VIEW_TYPE_RECORD = 1;
        private final String date;
        private final List<SearchRecord> records;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SearchHistoryItem copy$default(SearchHistoryItem searchHistoryItem, String str, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                str = searchHistoryItem.date;
            }
            if ((i & 2) != 0) {
                list = searchHistoryItem.records;
            }
            return searchHistoryItem.copy(str, list);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDate() {
            return this.date;
        }

        public final List<SearchRecord> component2() {
            return this.records;
        }

        public final SearchHistoryItem copy(String date, List<SearchRecord> records) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(records, "records");
            return new SearchHistoryItem(date, records);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchHistoryItem)) {
                return false;
            }
            SearchHistoryItem searchHistoryItem = (SearchHistoryItem) other;
            return Intrinsics.areEqual(this.date, searchHistoryItem.date) && Intrinsics.areEqual(this.records, searchHistoryItem.records);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 0;
        }

        public int hashCode() {
            return (this.date.hashCode() * 31) + this.records.hashCode();
        }

        public String toString() {
            return "SearchHistoryItem(date=" + this.date + ", records=" + this.records + Separators.RPAREN;
        }

        public SearchHistoryItem(String date, List<SearchRecord> records) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(records, "records");
            this.date = date;
            this.records = records;
        }

        public final String getDate() {
            return this.date;
        }

        public final List<SearchRecord> getRecords() {
            return this.records;
        }
    }

    /* compiled from: AiSearchBean.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÖ\u0003J\t\u0010\u0012\u001a\u00020\tHÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/search/bean/AiSearchBean$SearchRecordItem;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "record", "Lcom/wakeup/feature/search/bean/AiSearchBean$SearchRecord;", "<init>", "(Lcom/wakeup/feature/search/bean/AiSearchBean$SearchRecord;)V", "getRecord", "()Lcom/wakeup/feature/search/bean/AiSearchBean$SearchRecord;", "itemType", "", "getItemType", "()I", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-search_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SearchRecordItem implements MultiItemEntity {
        private final SearchRecord record;

        public static /* synthetic */ SearchRecordItem copy$default(SearchRecordItem searchRecordItem, SearchRecord searchRecord, int i, Object obj) {
            if ((i & 1) != 0) {
                searchRecord = searchRecordItem.record;
            }
            return searchRecordItem.copy(searchRecord);
        }

        /* renamed from: component1, reason: from getter */
        public final SearchRecord getRecord() {
            return this.record;
        }

        public final SearchRecordItem copy(SearchRecord record) {
            Intrinsics.checkNotNullParameter(record, "record");
            return new SearchRecordItem(record);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchRecordItem) && Intrinsics.areEqual(this.record, ((SearchRecordItem) other).record);
        }

        @Override // com.chad.library.adapter.base.entity.MultiItemEntity
        /* renamed from: getItemType */
        public int getType() {
            return 1;
        }

        public int hashCode() {
            return this.record.hashCode();
        }

        public String toString() {
            return "SearchRecordItem(record=" + this.record + Separators.RPAREN;
        }

        public SearchRecordItem(SearchRecord record) {
            Intrinsics.checkNotNullParameter(record, "record");
            this.record = record;
        }

        public final SearchRecord getRecord() {
            return this.record;
        }
    }
}
