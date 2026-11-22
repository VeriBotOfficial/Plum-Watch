package com.xmly.businesssdk.trace.model;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;
import org.xmind.core.style.IStyle;

/* compiled from: TraceEvent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007J\u0018\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\u0001J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/xmly/businesssdk/trace/model/EventPropertiesBuilder;", "", "()V", DOMConstants.TAG_PROPERTIES, "", "", "build", "", "put", "key", "value", "putAll", IStyle.MAP, "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final class EventPropertiesBuilder {
    private final Map<String, String> properties = new LinkedHashMap();

    public final Map<String, String> build() {
        return MapsKt.toMap(this.properties);
    }

    public final EventPropertiesBuilder put(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.properties.put(key, value);
        return this;
    }

    public final EventPropertiesBuilder putAll(Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.properties.putAll(map);
        return this;
    }

    public final EventPropertiesBuilder put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (value != null) {
            this.properties.put(key, value.toString());
        }
        return this;
    }
}
