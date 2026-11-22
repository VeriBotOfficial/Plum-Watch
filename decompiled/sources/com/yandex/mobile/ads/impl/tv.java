package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes5.dex */
public interface tv extends qv {

    public interface a {
        tv a();
    }

    long a(xv xvVar) throws IOException;

    void a(d72 d72Var);

    void close() throws IOException;

    default Map<String, List<String>> getResponseHeaders() {
        return Collections.emptyMap();
    }

    Uri getUri();
}
