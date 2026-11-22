package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferLang.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/wakeup/common/network/entity/ai/TransferLang;", "", "<init>", "()V", "Request", "Response", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TransferLang {
    public static final TransferLang INSTANCE = new TransferLang();

    private TransferLang() {
    }

    /* compiled from: TransferLang.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/ai/TransferLang$Request;", "", "fromLanguageId", "", "toLanguageId", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getFromLanguageId", "()Ljava/lang/String;", "setFromLanguageId", "(Ljava/lang/String;)V", "getToLanguageId", "setToLanguageId", "getText", "setText", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Request {
        private String fromLanguageId;
        private String text;
        private String toLanguageId;

        public Request() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Request copy$default(Request request, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = request.fromLanguageId;
            }
            if ((i & 2) != 0) {
                str2 = request.toLanguageId;
            }
            if ((i & 4) != 0) {
                str3 = request.text;
            }
            return request.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getFromLanguageId() {
            return this.fromLanguageId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getToLanguageId() {
            return this.toLanguageId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        public final Request copy(String fromLanguageId, String toLanguageId, String text) {
            Intrinsics.checkNotNullParameter(fromLanguageId, "fromLanguageId");
            Intrinsics.checkNotNullParameter(toLanguageId, "toLanguageId");
            Intrinsics.checkNotNullParameter(text, "text");
            return new Request(fromLanguageId, toLanguageId, text);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return Intrinsics.areEqual(this.fromLanguageId, request.fromLanguageId) && Intrinsics.areEqual(this.toLanguageId, request.toLanguageId) && Intrinsics.areEqual(this.text, request.text);
        }

        public int hashCode() {
            return (((this.fromLanguageId.hashCode() * 31) + this.toLanguageId.hashCode()) * 31) + this.text.hashCode();
        }

        public String toString() {
            return "Request(fromLanguageId=" + this.fromLanguageId + ", toLanguageId=" + this.toLanguageId + ", text=" + this.text + Separators.RPAREN;
        }

        public Request(String fromLanguageId, String toLanguageId, String text) {
            Intrinsics.checkNotNullParameter(fromLanguageId, "fromLanguageId");
            Intrinsics.checkNotNullParameter(toLanguageId, "toLanguageId");
            Intrinsics.checkNotNullParameter(text, "text");
            this.fromLanguageId = fromLanguageId;
            this.toLanguageId = toLanguageId;
            this.text = text;
        }

        public /* synthetic */ Request(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3);
        }

        public final String getFromLanguageId() {
            return this.fromLanguageId;
        }

        public final void setFromLanguageId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.fromLanguageId = str;
        }

        public final String getToLanguageId() {
            return this.toLanguageId;
        }

        public final void setToLanguageId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.toLanguageId = str;
        }

        public final String getText() {
            return this.text;
        }

        public final void setText(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.text = str;
        }
    }

    /* compiled from: TransferLang.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/wakeup/common/network/entity/ai/TransferLang$Response;", "", "<init>", "()V", h.A, "", "getRequestId", "()Ljava/lang/String;", "sourceLanguage", "getSourceLanguage", "sourceContent", "getSourceContent", "transLanguage", "getTransLanguage", "transContent", "getTransContent", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Response {
        private final String requestId = "";
        private final String sourceLanguage = "";
        private final String sourceContent = "";
        private final String transLanguage = "";
        private final String transContent = "";

        public final String getRequestId() {
            return this.requestId;
        }

        public final String getSourceLanguage() {
            return this.sourceLanguage;
        }

        public final String getSourceContent() {
            return this.sourceContent;
        }

        public final String getTransLanguage() {
            return this.transLanguage;
        }

        public final String getTransContent() {
            return this.transContent;
        }
    }
}
