package com.xmly.businesssdk.trace.uploader.formatter;

import com.xmly.businesssdk.config.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventFormatter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/xmly/businesssdk/trace/uploader/formatter/FormattedData;", "", "globalJson", "", "eventData", "(Ljava/lang/String;Ljava/lang/String;)V", "getEventData", "()Ljava/lang/String;", "getGlobalJson", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FormattedData {
    private final String eventData;
    private final String globalJson;

    public FormattedData(String globalJson, String eventData) {
        Intrinsics.checkNotNullParameter(globalJson, "globalJson");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.globalJson = globalJson;
        this.eventData = eventData;
    }

    public static /* synthetic */ FormattedData copy$default(FormattedData formattedData, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = formattedData.globalJson;
        }
        if ((i & 2) != 0) {
            str2 = formattedData.eventData;
        }
        return formattedData.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getGlobalJson() {
        return this.globalJson;
    }

    /* renamed from: component2, reason: from getter */
    public final String getEventData() {
        return this.eventData;
    }

    public final FormattedData copy(String globalJson, String eventData) {
        Intrinsics.checkNotNullParameter(globalJson, "globalJson");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        return new FormattedData(globalJson, eventData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormattedData)) {
            return false;
        }
        FormattedData formattedData = (FormattedData) other;
        return Intrinsics.areEqual(this.globalJson, formattedData.globalJson) && Intrinsics.areEqual(this.eventData, formattedData.eventData);
    }

    public final String getEventData() {
        return this.eventData;
    }

    public final String getGlobalJson() {
        return this.globalJson;
    }

    public int hashCode() {
        return this.eventData.hashCode() + (this.globalJson.hashCode() * 31);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("FormattedData(globalJson=").append(this.globalJson).append(", eventData="), this.eventData, ')');
    }
}
