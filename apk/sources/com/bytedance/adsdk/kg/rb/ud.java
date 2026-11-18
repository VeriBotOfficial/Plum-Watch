package com.bytedance.adsdk.kg.rb;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
class ud {
    static int fxn(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int r0 = (int) (jsonReader.nextDouble() * 255.0d);
        int r1 = (int) (jsonReader.nextDouble() * 255.0d);
        int r2 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, r0, r1, r2);
    }

    static List<PointF> fxn(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(kg(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.kg.rb.ud$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] fxn;

        static {
            int[] r0 = new int[JsonToken.values().length];
            fxn = r0;
            try {
                r0[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                fxn[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                fxn[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static PointF kg(JsonReader jsonReader, float f) throws IOException {
        int r0 = AnonymousClass1.fxn[jsonReader.peek().ordinal()];
        if (r0 == 1) {
            return gff(jsonReader, f);
        }
        if (r0 == 2) {
            return hm(jsonReader, f);
        }
        if (r0 == 3) {
            return rb(jsonReader, f);
        }
        throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
    }

    private static PointF gff(JsonReader jsonReader, float f) throws IOException {
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF hm(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float fNextDouble = (float) jsonReader.nextDouble();
        float fNextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(fNextDouble * f, fNextDouble2 * f);
    }

    private static PointF rb(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float fKg = 0.0f;
        float fKg2 = 0.0f;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.hashCode();
            if (strNextName.equals("x")) {
                fKg = kg(jsonReader);
            } else if (strNextName.equals("y")) {
                fKg2 = kg(jsonReader);
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return new PointF(fKg * f, fKg2 * f);
    }

    static float kg(JsonReader jsonReader) throws IOException {
        JsonToken jsonTokenPeek = jsonReader.peek();
        int r1 = AnonymousClass1.fxn[jsonTokenPeek.ordinal()];
        if (r1 == 1) {
            return (float) jsonReader.nextDouble();
        }
        if (r1 == 2) {
            jsonReader.beginArray();
            float fNextDouble = (float) jsonReader.nextDouble();
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            jsonReader.endArray();
            return fNextDouble;
        }
        throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(jsonTokenPeek)));
    }
}
