package com.hjq.gson.factory.data;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes12.dex */
public class FloatTypeAdapter extends TypeAdapter<Float> {

    /* renamed from: com.hjq.gson.factory.data.FloatTypeAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.STRING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.gson.TypeAdapter
    /* renamed from: read */
    public Float read2(JsonReader jsonReader) throws IOException {
        int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
        if (i == 1) {
            return Float.valueOf((float) jsonReader.nextDouble());
        }
        if (i != 2) {
            if (i == 3) {
                jsonReader.nextNull();
                return null;
            }
            jsonReader.skipValue();
            throw new IllegalArgumentException();
        }
        String nextString = jsonReader.nextString();
        if (nextString == null || "".equals(nextString)) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Float.parseFloat(nextString));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Float f) throws IOException {
        jsonWriter.value(f);
    }
}
