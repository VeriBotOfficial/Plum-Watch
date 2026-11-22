package com.xmly.businesssdk.trace.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.api.ClientProto;
import com.google.gson.annotations.SerializedName;
import com.heytap.mcssdk.constant.b;
import com.umeng.analytics.pro.d;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import com.wakeup.common.burypoint.BuryPointEventType;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.trace.time.TimeProvider;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: TraceEvent.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001cB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u0012\u0010\u0011\u001a\u00020\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\b\u001d\u001e\u001f !\"#$¨\u0006%"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent;", "", "()V", b.k, "", "getEventId", "()Ljava/lang/String;", "metaId", "", "getMetaId", "()I", DOMConstants.TAG_PROPERTIES, "", "getProperties", "()Ljava/util/Map;", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "timestamp", "", "getTimestamp", "()J", "AppStart", "Background", "Click", TypedValues.Custom.NAME, "Exposure", "PageExit", "PageView", "Play", "Lcom/xmly/businesssdk/trace/model/TraceEvent$AppStart;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$Background;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$Click;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$Custom;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$Exposure;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$PageExit;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$PageView;", "Lcom/xmly/businesssdk/trace/model/TraceEvent$Play;", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public abstract class TraceEvent {
    private TraceEvent() {
    }

    public /* synthetic */ TraceEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getEventId();

    public abstract int getMetaId();

    public abstract Map<String, String> getProperties();

    public abstract String getSessionId();

    public abstract long getTimestamp();

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\nHÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$Custom;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", b.k, "", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, DOMConstants.TAG_PROPERTIES, "", "timestamp", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/Map;J)V", "getEventId", "()Ljava/lang/String;", "getMetaId", "()I", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Custom extends TraceEvent {

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ Custom(String str, int i, String str2, Map map, long j, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i, str2, (i2 & 8) != 0 ? MapsKt.emptyMap() : map, (i2 & 16) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j);
        }

        public static /* synthetic */ Custom copy$default(Custom custom, String str, int i, String str2, Map map, long j, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = custom.getEventId();
            }
            if ((i2 & 2) != 0) {
                i = custom.getMetaId();
            }
            if ((i2 & 4) != 0) {
                str2 = custom.getSessionId();
            }
            if ((i2 & 8) != 0) {
                map = custom.getProperties();
            }
            if ((i2 & 16) != 0) {
                j = custom.getTimestamp();
            }
            long j2 = j;
            return custom.copy(str, i, str2, map, j2);
        }

        public final String component1() {
            return getEventId();
        }

        public final int component2() {
            return getMetaId();
        }

        public final String component3() {
            return getSessionId();
        }

        public final Map<String, String> component4() {
            return getProperties();
        }

        public final long component5() {
            return getTimestamp();
        }

        public final Custom copy(String eventId, int metaId, String sessionId, Map<String, String> properties, long timestamp) {
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(properties, "properties");
            return new Custom(eventId, metaId, sessionId, properties, timestamp);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Custom)) {
                return false;
            }
            Custom custom = (Custom) other;
            return Intrinsics.areEqual(getEventId(), custom.getEventId()) && getMetaId() == custom.getMetaId() && Intrinsics.areEqual(getSessionId(), custom.getSessionId()) && Intrinsics.areEqual(getProperties(), custom.getProperties()) && getTimestamp() == custom.getTimestamp();
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + ((((Integer.hashCode(getMetaId()) + (getEventId().hashCode() * 31)) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31)) * 31);
        }

        public String toString() {
            return c.a("Custom(eventId=").append(getEventId()).append(", metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Custom(String eventId, int i, String str, Map<String, String> properties, long j) {
            super(null);
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            Intrinsics.checkNotNullParameter(properties, "properties");
            this.eventId = eventId;
            this.metaId = i;
            this.sessionId = str;
            this.properties = properties;
            this.timestamp = j;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001&BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003JS\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$AppStart;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "startType", "Lcom/xmly/businesssdk/trace/model/TraceEvent$AppStart$StartType;", DOMConstants.TAG_PROPERTIES, "", "timestamp", "", b.k, "(ILjava/lang/String;Lcom/xmly/businesssdk/trace/model/TraceEvent$AppStart$StartType;Ljava/util/Map;JLjava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getMetaId", "()I", "getProperties", "()Ljava/util/Map;", "getSessionId", "getStartType", "()Lcom/xmly/businesssdk/trace/model/TraceEvent$AppStart$StartType;", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "StartType", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class AppStart extends TraceEvent {

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("startType")
        private final StartType startType;

        @SerializedName("timestamp")
        private final long timestamp;

        /* compiled from: TraceEvent.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$AppStart$StartType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "COLD", "HOT", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum StartType {
            COLD("0"),
            HOT("1");

            private final String value;

            StartType(String str) {
                this.value = str;
            }

            public final String getValue() {
                return this.value;
            }
        }

        public /* synthetic */ AppStart(int i, String str, StartType startType, Map map, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? ClientProto.OAUTH_SCOPES_FIELD_NUMBER : i, str, startType, (i2 & 8) != 0 ? MapsKt.emptyMap() : map, (i2 & 16) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i2 & 32) != 0 ? "startUp" : str2);
        }

        public static /* synthetic */ AppStart copy$default(AppStart appStart, int i, String str, StartType startType, Map map, long j, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = appStart.getMetaId();
            }
            if ((i2 & 2) != 0) {
                str = appStart.getSessionId();
            }
            if ((i2 & 4) != 0) {
                startType = appStart.startType;
            }
            if ((i2 & 8) != 0) {
                map = appStart.getProperties();
            }
            if ((i2 & 16) != 0) {
                j = appStart.getTimestamp();
            }
            if ((i2 & 32) != 0) {
                str2 = appStart.getEventId();
            }
            String str3 = str2;
            long j2 = j;
            return appStart.copy(i, str, startType, map, j2, str3);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        /* renamed from: component3, reason: from getter */
        public final StartType getStartType() {
            return this.startType;
        }

        public final Map<String, String> component4() {
            return getProperties();
        }

        public final long component5() {
            return getTimestamp();
        }

        public final String component6() {
            return getEventId();
        }

        public final AppStart copy(int metaId, String sessionId, StartType startType, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(startType, "startType");
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new AppStart(metaId, sessionId, startType, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AppStart)) {
                return false;
            }
            AppStart appStart = (AppStart) other;
            return getMetaId() == appStart.getMetaId() && Intrinsics.areEqual(getSessionId(), appStart.getSessionId()) && this.startType == appStart.startType && Intrinsics.areEqual(getProperties(), appStart.getProperties()) && getTimestamp() == appStart.getTimestamp() && Intrinsics.areEqual(getEventId(), appStart.getEventId());
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        public final StartType getStartType() {
            return this.startType;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + ((this.startType.hashCode() + (((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("AppStart(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", startType=").append(this.startType).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AppStart(int i, String str, StartType startType, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(startType, "startType");
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.startType = startType;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JS\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u000b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$Background;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "duration", DOMConstants.TAG_PROPERTIES, "", "timestamp", "", b.k, "(ILjava/lang/String;ILjava/util/Map;JLjava/lang/String;)V", "getDuration", "()I", "getEventId", "()Ljava/lang/String;", "getMetaId", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Background extends TraceEvent {

        @SerializedName("duration")
        private final int duration;

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ Background(int i, String str, int i2, Map map, long j, String str2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 10548 : i, str, i2, (i3 & 8) != 0 ? MapsKt.emptyMap() : map, (i3 & 16) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i3 & 32) != 0 ? "background" : str2);
        }

        public static /* synthetic */ Background copy$default(Background background, int i, String str, int i2, Map map, long j, String str2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = background.getMetaId();
            }
            if ((i3 & 2) != 0) {
                str = background.getSessionId();
            }
            if ((i3 & 4) != 0) {
                i2 = background.duration;
            }
            if ((i3 & 8) != 0) {
                map = background.getProperties();
            }
            if ((i3 & 16) != 0) {
                j = background.getTimestamp();
            }
            if ((i3 & 32) != 0) {
                str2 = background.getEventId();
            }
            String str3 = str2;
            long j2 = j;
            return background.copy(i, str, i2, map, j2, str3);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        /* renamed from: component3, reason: from getter */
        public final int getDuration() {
            return this.duration;
        }

        public final Map<String, String> component4() {
            return getProperties();
        }

        public final long component5() {
            return getTimestamp();
        }

        public final String component6() {
            return getEventId();
        }

        public final Background copy(int metaId, String sessionId, int duration, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new Background(metaId, sessionId, duration, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Background)) {
                return false;
            }
            Background background = (Background) other;
            return getMetaId() == background.getMetaId() && Intrinsics.areEqual(getSessionId(), background.getSessionId()) && this.duration == background.duration && Intrinsics.areEqual(getProperties(), background.getProperties()) && getTimestamp() == background.getTimestamp() && Intrinsics.areEqual(getEventId(), background.getEventId());
        }

        public final int getDuration() {
            return this.duration;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + com.xmly.businesssdk.config.b.a(this.duration, ((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31, 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("Background(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", duration=").append(this.duration).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Background(int i, String str, int i2, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.duration = i2;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003Ja\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0016\u0010\n\u001a\u00020\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006'"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$Click;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "elementName", "elementType", DOMConstants.TAG_PROPERTIES, "", "timestamp", "", b.k, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;)V", "getElementName", "()Ljava/lang/String;", "getElementType", "getEventId", "getMetaId", "()I", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Click extends TraceEvent {

        @SerializedName("elementName")
        private final String elementName;

        @SerializedName("elementType")
        private final String elementType;

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ Click(int i, String str, String str2, String str3, Map map, long j, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? MapsKt.emptyMap() : map, (i2 & 32) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i2 & 64) != 0 ? "click" : str4);
        }

        public static /* synthetic */ Click copy$default(Click click, int i, String str, String str2, String str3, Map map, long j, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = click.getMetaId();
            }
            if ((i2 & 2) != 0) {
                str = click.getSessionId();
            }
            if ((i2 & 4) != 0) {
                str2 = click.elementName;
            }
            if ((i2 & 8) != 0) {
                str3 = click.elementType;
            }
            if ((i2 & 16) != 0) {
                map = click.getProperties();
            }
            if ((i2 & 32) != 0) {
                j = click.getTimestamp();
            }
            if ((i2 & 64) != 0) {
                str4 = click.getEventId();
            }
            String str5 = str4;
            long j2 = j;
            Map map2 = map;
            String str6 = str2;
            return click.copy(i, str, str6, str3, map2, j2, str5);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        /* renamed from: component3, reason: from getter */
        public final String getElementName() {
            return this.elementName;
        }

        /* renamed from: component4, reason: from getter */
        public final String getElementType() {
            return this.elementType;
        }

        public final Map<String, String> component5() {
            return getProperties();
        }

        public final long component6() {
            return getTimestamp();
        }

        public final String component7() {
            return getEventId();
        }

        public final Click copy(int metaId, String sessionId, String elementName, String elementType, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new Click(metaId, sessionId, elementName, elementType, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Click)) {
                return false;
            }
            Click click = (Click) other;
            return getMetaId() == click.getMetaId() && Intrinsics.areEqual(getSessionId(), click.getSessionId()) && Intrinsics.areEqual(this.elementName, click.elementName) && Intrinsics.areEqual(this.elementType, click.elementType) && Intrinsics.areEqual(getProperties(), click.getProperties()) && getTimestamp() == click.getTimestamp() && Intrinsics.areEqual(getEventId(), click.getEventId());
        }

        public final String getElementName() {
            return this.elementName;
        }

        public final String getElementType() {
            return this.elementType;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31;
            String str = this.elementName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.elementType;
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("Click(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", elementName=").append(this.elementName).append(", elementType=").append(this.elementType).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Click(int i, String str, String str2, String str3, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.elementName = str2;
            this.elementType = str3;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005¢\u0006\u0002\u0010\u000eJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003Jr\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010&J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0003HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0016\u0010\r\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\f8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006-"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$Exposure;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "contentId", "contentType", "position", DOMConstants.TAG_PROPERTIES, "", "timestamp", "", b.k, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;JLjava/lang/String;)V", "getContentId", "()Ljava/lang/String;", "getContentType", "getEventId", "getMetaId", "()I", "getPosition", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/Map;JLjava/lang/String;)Lcom/xmly/businesssdk/trace/model/TraceEvent$Exposure;", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Exposure extends TraceEvent {

        @SerializedName("contentId")
        private final String contentId;

        @SerializedName("contentType")
        private final String contentType;

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName("position")
        private final Integer position;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ Exposure(int i, String str, String str2, String str3, Integer num, Map map, long j, String str4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? MapsKt.emptyMap() : map, (i2 & 64) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i2 & 128) != 0 ? BuryPointEventType.ACTION_TYPE_EXPOSURE : str4);
        }

        public static /* synthetic */ Exposure copy$default(Exposure exposure, int i, String str, String str2, String str3, Integer num, Map map, long j, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = exposure.getMetaId();
            }
            if ((i2 & 2) != 0) {
                str = exposure.getSessionId();
            }
            if ((i2 & 4) != 0) {
                str2 = exposure.contentId;
            }
            if ((i2 & 8) != 0) {
                str3 = exposure.contentType;
            }
            if ((i2 & 16) != 0) {
                num = exposure.position;
            }
            if ((i2 & 32) != 0) {
                map = exposure.getProperties();
            }
            if ((i2 & 64) != 0) {
                j = exposure.getTimestamp();
            }
            if ((i2 & 128) != 0) {
                str4 = exposure.getEventId();
            }
            String str5 = str4;
            long j2 = j;
            Integer num2 = num;
            Map map2 = map;
            return exposure.copy(i, str, str2, str3, num2, map2, j2, str5);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        /* renamed from: component3, reason: from getter */
        public final String getContentId() {
            return this.contentId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContentType() {
            return this.contentType;
        }

        /* renamed from: component5, reason: from getter */
        public final Integer getPosition() {
            return this.position;
        }

        public final Map<String, String> component6() {
            return getProperties();
        }

        public final long component7() {
            return getTimestamp();
        }

        public final String component8() {
            return getEventId();
        }

        public final Exposure copy(int metaId, String sessionId, String contentId, String contentType, Integer position, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new Exposure(metaId, sessionId, contentId, contentType, position, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Exposure)) {
                return false;
            }
            Exposure exposure = (Exposure) other;
            return getMetaId() == exposure.getMetaId() && Intrinsics.areEqual(getSessionId(), exposure.getSessionId()) && Intrinsics.areEqual(this.contentId, exposure.contentId) && Intrinsics.areEqual(this.contentType, exposure.contentType) && Intrinsics.areEqual(this.position, exposure.position) && Intrinsics.areEqual(getProperties(), exposure.getProperties()) && getTimestamp() == exposure.getTimestamp() && Intrinsics.areEqual(getEventId(), exposure.getEventId());
        }

        public final String getContentId() {
            return this.contentId;
        }

        public final String getContentType() {
            return this.contentType;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        public final Integer getPosition() {
            return this.position;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31;
            String str = this.contentId;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.contentType;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.position;
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + ((hashCode3 + (num != null ? num.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("Exposure(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", contentId=").append(this.contentId).append(", contentType=").append(this.contentType).append(", position=").append(this.position).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Exposure(int i, String str, String str2, String str3, Integer num, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.contentId = str2;
            this.contentType = str3;
            this.position = num;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\nHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003Jf\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u0003HÖ\u0001J\t\u0010)\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\f\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0016\u0010\u000b\u001a\u00020\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$PageExit;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "pageName", "duration", "", DOMConstants.TAG_PROPERTIES, "", "timestamp", b.k, "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;JLjava/lang/String;)V", "getDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getEventId", "()Ljava/lang/String;", "getMetaId", "()I", "getPageName", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/Map;JLjava/lang/String;)Lcom/xmly/businesssdk/trace/model/TraceEvent$PageExit;", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PageExit extends TraceEvent {

        @SerializedName("duration")
        private final Long duration;

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName("pageName")
        private final String pageName;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ PageExit(int i, String str, String str2, Long l, Map map, long j, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : l, (i2 & 16) != 0 ? MapsKt.emptyMap() : map, (i2 & 32) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i2 & 64) != 0 ? "pageExit" : str3);
        }

        public static /* synthetic */ PageExit copy$default(PageExit pageExit, int i, String str, String str2, Long l, Map map, long j, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pageExit.getMetaId();
            }
            if ((i2 & 2) != 0) {
                str = pageExit.getSessionId();
            }
            if ((i2 & 4) != 0) {
                str2 = pageExit.pageName;
            }
            if ((i2 & 8) != 0) {
                l = pageExit.duration;
            }
            if ((i2 & 16) != 0) {
                map = pageExit.getProperties();
            }
            if ((i2 & 32) != 0) {
                j = pageExit.getTimestamp();
            }
            if ((i2 & 64) != 0) {
                str3 = pageExit.getEventId();
            }
            String str4 = str3;
            long j2 = j;
            Map map2 = map;
            String str5 = str2;
            return pageExit.copy(i, str, str5, l, map2, j2, str4);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        /* renamed from: component3, reason: from getter */
        public final String getPageName() {
            return this.pageName;
        }

        /* renamed from: component4, reason: from getter */
        public final Long getDuration() {
            return this.duration;
        }

        public final Map<String, String> component5() {
            return getProperties();
        }

        public final long component6() {
            return getTimestamp();
        }

        public final String component7() {
            return getEventId();
        }

        public final PageExit copy(int metaId, String sessionId, String pageName, Long duration, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new PageExit(metaId, sessionId, pageName, duration, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageExit)) {
                return false;
            }
            PageExit pageExit = (PageExit) other;
            return getMetaId() == pageExit.getMetaId() && Intrinsics.areEqual(getSessionId(), pageExit.getSessionId()) && Intrinsics.areEqual(this.pageName, pageExit.pageName) && Intrinsics.areEqual(this.duration, pageExit.duration) && Intrinsics.areEqual(getProperties(), pageExit.getProperties()) && getTimestamp() == pageExit.getTimestamp() && Intrinsics.areEqual(getEventId(), pageExit.getEventId());
        }

        public final Long getDuration() {
            return this.duration;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        public final String getPageName() {
            return this.pageName;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31;
            String str = this.pageName;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            Long l = this.duration;
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("PageExit(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", pageName=").append(this.pageName).append(", duration=").append(this.duration).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageExit(int i, String str, String str2, Long l, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.pageName = str2;
            this.duration = l;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003JU\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!HÖ\u0003J\t\u0010\"\u001a\u00020\u0003HÖ\u0001J\t\u0010#\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u000b\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010\t\u001a\u00020\n8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$PageView;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", "pageName", DOMConstants.TAG_PROPERTIES, "", "timestamp", "", b.k, "(ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;JLjava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getMetaId", "()I", "getPageName", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class PageView extends TraceEvent {

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName("pageName")
        private final String pageName;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ PageView(int i, String str, String str2, Map map, long j, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? MapsKt.emptyMap() : map, (i2 & 16) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i2 & 32) != 0 ? d.ax : str3);
        }

        public static /* synthetic */ PageView copy$default(PageView pageView, int i, String str, String str2, Map map, long j, String str3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = pageView.getMetaId();
            }
            if ((i2 & 2) != 0) {
                str = pageView.getSessionId();
            }
            if ((i2 & 4) != 0) {
                str2 = pageView.pageName;
            }
            if ((i2 & 8) != 0) {
                map = pageView.getProperties();
            }
            if ((i2 & 16) != 0) {
                j = pageView.getTimestamp();
            }
            if ((i2 & 32) != 0) {
                str3 = pageView.getEventId();
            }
            String str4 = str3;
            long j2 = j;
            return pageView.copy(i, str, str2, map, j2, str4);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        /* renamed from: component3, reason: from getter */
        public final String getPageName() {
            return this.pageName;
        }

        public final Map<String, String> component4() {
            return getProperties();
        }

        public final long component5() {
            return getTimestamp();
        }

        public final String component6() {
            return getEventId();
        }

        public final PageView copy(int metaId, String sessionId, String pageName, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new PageView(metaId, sessionId, pageName, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PageView)) {
                return false;
            }
            PageView pageView = (PageView) other;
            return getMetaId() == pageView.getMetaId() && Intrinsics.areEqual(getSessionId(), pageView.getSessionId()) && Intrinsics.areEqual(this.pageName, pageView.pageName) && Intrinsics.areEqual(getProperties(), pageView.getProperties()) && getTimestamp() == pageView.getTimestamp() && Intrinsics.areEqual(getEventId(), pageView.getEventId());
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        public final String getPageName() {
            return this.pageName;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            int hashCode = ((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31;
            String str = this.pageName;
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + ((hashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("PageView(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", pageName=").append(this.pageName).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PageView(int i, String str, String str2, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.pageName = str2;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }

    /* compiled from: TraceEvent.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0016\u0010\n\u001a\u00020\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00078\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, d2 = {"Lcom/xmly/businesssdk/trace/model/TraceEvent$Play;", "Lcom/xmly/businesssdk/trace/model/TraceEvent;", "metaId", "", JsonStorageKeyNames.SESSION_ID_KEY, "", DOMConstants.TAG_PROPERTIES, "", "timestamp", "", b.k, "(ILjava/lang/String;Ljava/util/Map;JLjava/lang/String;)V", "getEventId", "()Ljava/lang/String;", "getMetaId", "()I", "getProperties", "()Ljava/util/Map;", "getSessionId", "getTimestamp", "()J", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Play extends TraceEvent {

        @SerializedName(b.k)
        private final String eventId;

        @SerializedName("metaId")
        private final int metaId;

        @SerializedName(DOMConstants.TAG_PROPERTIES)
        private final Map<String, String> properties;

        @SerializedName(JsonStorageKeyNames.SESSION_ID_KEY)
        private final String sessionId;

        @SerializedName("timestamp")
        private final long timestamp;

        public /* synthetic */ Play(int i, String str, Map map, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 65315 : i, str, (i2 & 4) != 0 ? MapsKt.emptyMap() : map, (i2 & 8) != 0 ? TimeProvider.INSTANCE.currentTimeMillis() : j, (i2 & 16) != 0 ? "play" : str2);
        }

        public static /* synthetic */ Play copy$default(Play play, int i, String str, Map map, long j, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = play.getMetaId();
            }
            if ((i2 & 2) != 0) {
                str = play.getSessionId();
            }
            if ((i2 & 4) != 0) {
                map = play.getProperties();
            }
            if ((i2 & 8) != 0) {
                j = play.getTimestamp();
            }
            if ((i2 & 16) != 0) {
                str2 = play.getEventId();
            }
            String str3 = str2;
            Map map2 = map;
            return play.copy(i, str, map2, j, str3);
        }

        public final int component1() {
            return getMetaId();
        }

        public final String component2() {
            return getSessionId();
        }

        public final Map<String, String> component3() {
            return getProperties();
        }

        public final long component4() {
            return getTimestamp();
        }

        public final String component5() {
            return getEventId();
        }

        public final Play copy(int metaId, String sessionId, Map<String, String> properties, long timestamp, String eventId) {
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            return new Play(metaId, sessionId, properties, timestamp, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Play)) {
                return false;
            }
            Play play = (Play) other;
            return getMetaId() == play.getMetaId() && Intrinsics.areEqual(getSessionId(), play.getSessionId()) && Intrinsics.areEqual(getProperties(), play.getProperties()) && getTimestamp() == play.getTimestamp() && Intrinsics.areEqual(getEventId(), play.getEventId());
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getEventId() {
            return this.eventId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public int getMetaId() {
            return this.metaId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public Map<String, String> getProperties() {
            return this.properties;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public String getSessionId() {
            return this.sessionId;
        }

        @Override // com.xmly.businesssdk.trace.model.TraceEvent
        public long getTimestamp() {
            return this.timestamp;
        }

        public int hashCode() {
            return getEventId().hashCode() + ((Long.hashCode(getTimestamp()) + ((getProperties().hashCode() + (((Integer.hashCode(getMetaId()) * 31) + (getSessionId() == null ? 0 : getSessionId().hashCode())) * 31)) * 31)) * 31);
        }

        public String toString() {
            return c.a("Play(metaId=").append(getMetaId()).append(", sessionId=").append(getSessionId()).append(", properties=").append(getProperties()).append(", timestamp=").append(getTimestamp()).append(", eventId=").append(getEventId()).append(')').toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Play(int i, String str, Map<String, String> properties, long j, String eventId) {
            super(null);
            Intrinsics.checkNotNullParameter(properties, "properties");
            Intrinsics.checkNotNullParameter(eventId, "eventId");
            this.metaId = i;
            this.sessionId = str;
            this.properties = properties;
            this.timestamp = j;
            this.eventId = eventId;
        }
    }
}
