package com.xmly.businesssdk.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class GsonHelper {
    private static Gson gsonInstance;

    public static <T> T fromJson(String str, Class<T> cls) {
        try {
            return (T) getGson().fromJson(str, (Class) cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> List<T> fromJsonArray(String str, Class<T> cls) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator<JsonElement> it = new JsonParser().parse(str).getAsJsonArray().iterator();
            while (it.hasNext()) {
                arrayList.add(getGson().fromJson(it.next(), (Class) cls));
            }
            return arrayList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T fromJsonObject(String str, Class<T> cls) {
        try {
            return (T) getGson().fromJson((JsonElement) new JsonParser().parse(str).getAsJsonObject(), (Class) cls);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Gson getGson() {
        Gson gson = gsonInstance;
        if (gson != null) {
            return gson;
        }
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapterFactory(new BundleTypeAdapterFactory());
        Gson create = gsonBuilder.create();
        gsonInstance = create;
        return create;
    }

    public static String toJson(Object obj) {
        try {
            return getGson().toJson(obj);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
