package com.hjq.gson.factory;

import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonToken;

/* loaded from: classes12.dex */
public interface JsonCallback {
    void onTypeException(TypeToken<?> typeToken, String str, JsonToken jsonToken);
}
