package com.danikula.videocache.headers;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes14.dex */
public class EmptyHeadersInjector implements HeaderInjector {
    @Override // com.danikula.videocache.headers.HeaderInjector
    public Map<String, String> addHeaders(String str) {
        return new HashMap();
    }
}
