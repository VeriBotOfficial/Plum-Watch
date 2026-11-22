package com.hjq.gson.factory.data;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* loaded from: classes12.dex */
public class StringTypeAdapter extends TypeAdapter<String> {

    /* renamed from: com.hjq.gson.factory.data.StringTypeAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$gson$stream$JsonToken;

        static {
            int[] iArr = new int[JsonToken.values().length];
            $SwitchMap$com$google$gson$stream$JsonToken = iArr;
            try {
                iArr[JsonToken.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.BOOLEAN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$gson$stream$JsonToken[JsonToken.NULL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: read, reason: avoid collision after fix types in other method */
    public String read2(JsonReader jsonReader) throws IOException {
        int i = AnonymousClass1.$SwitchMap$com$google$gson$stream$JsonToken[jsonReader.peek().ordinal()];
        if (i == 1 || i == 2) {
            return jsonReader.nextString();
        }
        if (i == 3) {
            return Boolean.toString(jsonReader.nextBoolean());
        }
        if (i == 4) {
            jsonReader.nextNull();
            return null;
        }
        jsonReader.skipValue();
        throw new IllegalArgumentException();
    }

    @Override // com.google.gson.TypeAdapter
    public void write(JsonWriter jsonWriter, String str) throws IOException {
        jsonWriter.value(str);
    }
}
