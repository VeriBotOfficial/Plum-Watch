package com.hjq.gson.factory.data;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes12.dex */
public class DoubleTypeAdapter extends TypeAdapter<Double> {

    /* renamed from: com.hjq.gson.factory.data.DoubleTypeAdapter$1, reason: invalid class name */
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
    public Double read2(JsonReader jsonReader) throws IOException {
        int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
        if (i == 1) {
            return Double.valueOf(jsonReader.nextDouble());
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
            return Double.valueOf(0.0d);
        }
        return Double.valueOf(Double.parseDouble(nextString));
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, Double d) throws IOException {
        jsonWriter.value(d);
    }
}
