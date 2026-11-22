package com.phancy.mini.core.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.nats.client.support.ApiConstants;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Event.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0002./B\u0007\b\u0012¢\u0006\u0002\u0010\u0002B\u000f\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010(\u001a\u00020)H\u0016J\u0018\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020)H\u0016R\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001e\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\nR\u001e\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\nR\u001b\u0010\u001e\u001a\u00020\u001f8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u001e\u0010$\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\nR\u001e\u0010&\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\n¨\u00060"}, d2 = {"Lcom/phancy/mini/core/api/Event;", "Landroid/os/Parcelable;", "()V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "<set-?>", "", "appId", "getAppId", "()Ljava/lang/String;", "callbackId", "getCallbackId", "embedWebViewId", "getEmbedWebViewId", "from", "getFrom", "", "id", "getId", "()J", "isInterceptCalled", "", "()Z", "setInterceptCalled", "(Z)V", "name", "getName", "pageWebViewId", "getPageWebViewId", RemoteMessageConst.MessageBody.PARAM, "Lcom/alibaba/fastjson/JSONObject;", "getParam", "()Lcom/alibaba/fastjson/JSONObject;", "param$delegate", "Lkotlin/Lazy;", "params", "getParams", "userId", "getUserId", "describeContents", "", "writeToParcel", "", ApiConstants.DEST, "flags", "Builder", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class Event implements Parcelable {
    public static final String FROM_APP = "app";
    public static final String FROM_EMBED = "embed";
    public static final String FROM_PAGE = "page";
    public static final String FROM_SERVICE = "service";
    private String appId;
    private String callbackId;
    private String embedWebViewId;
    private String from;
    private long id;
    private transient boolean isInterceptCalled;
    private String name;
    private String pageWebViewId;

    /* renamed from: param$delegate, reason: from kotlin metadata */
    private final Lazy param;
    private String params;
    private String userId;
    public static final Parcelable.Creator<Event> CREATOR = new Parcelable.Creator<Event>() { // from class: com.phancy.mini.core.api.Event$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Event createFromParcel(Parcel source) {
            Intrinsics.checkNotNullParameter(source, "source");
            return new Event(source, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Event[] newArray(int size) {
            return new Event[size];
        }
    };

    public /* synthetic */ Event(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    public /* synthetic */ Event(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final long getId() {
        return this.id;
    }

    public final String getFrom() {
        return this.from;
    }

    public final String getPageWebViewId() {
        return this.pageWebViewId;
    }

    public final String getEmbedWebViewId() {
        return this.embedWebViewId;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getName() {
        return this.name;
    }

    public final String getParams() {
        return this.params;
    }

    public final String getCallbackId() {
        return this.callbackId;
    }

    public final JSONObject getParam() {
        return (JSONObject) this.param.getValue();
    }

    /* renamed from: isInterceptCalled, reason: from getter */
    public final boolean getIsInterceptCalled() {
        return this.isInterceptCalled;
    }

    public final void setInterceptCalled(boolean z) {
        this.isInterceptCalled = z;
    }

    private Event() {
        this.from = "service";
        this.pageWebViewId = "";
        this.embedWebViewId = "";
        this.appId = "";
        this.userId = "";
        this.name = "";
        this.params = "";
        this.callbackId = "";
        this.param = LazyKt.lazy(new Function0<JSONObject>() { // from class: com.phancy.mini.core.api.Event$param$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final JSONObject invoke() {
                if (Event.this.getParams().length() > 0) {
                    try {
                        JSONObject parseObject = JSONObject.parseObject(Event.this.getParams());
                        return parseObject == null ? new JSONObject() : parseObject;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return new JSONObject();
                    }
                }
                return new JSONObject();
            }
        });
    }

    private Event(Parcel parcel) {
        this.from = "service";
        this.pageWebViewId = "";
        this.embedWebViewId = "";
        this.appId = "";
        this.userId = "";
        this.name = "";
        this.params = "";
        this.callbackId = "";
        this.param = LazyKt.lazy(new Function0<JSONObject>() { // from class: com.phancy.mini.core.api.Event$param$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final JSONObject invoke() {
                if (Event.this.getParams().length() > 0) {
                    try {
                        JSONObject parseObject = JSONObject.parseObject(Event.this.getParams());
                        return parseObject == null ? new JSONObject() : parseObject;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return new JSONObject();
                    }
                }
                return new JSONObject();
            }
        });
        this.id = parcel.readLong();
        String readString = parcel.readString();
        this.from = readString != null ? readString : "service";
        String readString2 = parcel.readString();
        this.pageWebViewId = readString2 == null ? "" : readString2;
        String readString3 = parcel.readString();
        this.embedWebViewId = readString3 == null ? "" : readString3;
        String readString4 = parcel.readString();
        this.appId = readString4 == null ? "" : readString4;
        String readString5 = parcel.readString();
        this.userId = readString5 == null ? "" : readString5;
        String readString6 = parcel.readString();
        this.name = readString6 == null ? "" : readString6;
        String readString7 = parcel.readString();
        this.params = readString7 == null ? "" : readString7;
        String readString8 = parcel.readString();
        this.callbackId = readString8 != null ? readString8 : "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.id);
        dest.writeString(this.from);
        dest.writeString(this.pageWebViewId);
        dest.writeString(this.embedWebViewId);
        dest.writeString(this.appId);
        dest.writeString(this.userId);
        dest.writeString(this.name);
        dest.writeString(this.params);
        dest.writeString(this.callbackId);
    }

    /* compiled from: Event.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0006\u0010\u0007\u001a\u00020\u0004J\u0010\u0010\b\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000b\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\f\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\r\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u000e\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/phancy/mini/core/api/Event$Builder;", "", "()V", "event", "Lcom/phancy/mini/core/api/Event;", "appId", "", "build", "callbackId", "embedWebViewId", "from", "name", "pageWebViewId", "params", "userId", "Companion", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {
        private static final AtomicLong counter = new AtomicLong();
        private final Event event;

        public Builder() {
            Event event = new Event((DefaultConstructorMarker) null);
            this.event = event;
            event.id = counter.incrementAndGet();
        }

        public final Builder appId(String appId) {
            if (appId != null) {
                this.event.appId = appId;
            }
            return this;
        }

        public final Builder userId(String userId) {
            if (userId != null) {
                this.event.userId = userId;
            }
            return this;
        }

        public final Builder name(String name) {
            if (name != null) {
                this.event.name = name;
            }
            return this;
        }

        public final Builder params(String params) {
            if (params != null) {
                this.event.params = params;
            }
            return this;
        }

        public final Builder callbackId(String callbackId) {
            if (callbackId != null) {
                this.event.callbackId = callbackId;
            }
            return this;
        }

        public final Builder from(String from) {
            if (from != null) {
                this.event.from = from;
            }
            return this;
        }

        public final Builder pageWebViewId(String pageWebViewId) {
            if (pageWebViewId != null) {
                this.event.pageWebViewId = pageWebViewId;
            }
            return this;
        }

        public final Builder embedWebViewId(String embedWebViewId) {
            if (embedWebViewId != null) {
                this.event.embedWebViewId = embedWebViewId;
            }
            return this;
        }

        /* renamed from: build, reason: from getter */
        public final Event getEvent() {
            return this.event;
        }
    }
}
