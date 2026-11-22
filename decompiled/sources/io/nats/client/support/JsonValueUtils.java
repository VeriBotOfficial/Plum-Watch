package io.nats.client.support;

import io.nats.client.support.JsonValue;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* loaded from: classes6.dex */
public abstract class JsonValueUtils {

    public interface JsonValueSupplier<T> {
        T get(JsonValue jsonValue);
    }

    static /* synthetic */ JsonValue lambda$readValue$0(JsonValue jsonValue) {
        return jsonValue;
    }

    private JsonValueUtils() {
    }

    public static <T> T read(JsonValue jsonValue, String str, JsonValueSupplier<T> jsonValueSupplier) {
        return jsonValueSupplier.get((jsonValue == null || jsonValue.map == null) ? null : jsonValue.map.get(str));
    }

    public static JsonValue readValue(JsonValue jsonValue, String str) {
        return (JsonValue) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda3
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readValue$0(jsonValue2);
            }
        });
    }

    static /* synthetic */ JsonValue lambda$readObject$1(JsonValue jsonValue) {
        return jsonValue == null ? JsonValue.EMPTY_MAP : jsonValue;
    }

    public static JsonValue readObject(JsonValue jsonValue, String str) {
        return (JsonValue) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda17
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readObject$1(jsonValue2);
            }
        });
    }

    static /* synthetic */ List lambda$readArray$2(JsonValue jsonValue) {
        return jsonValue == null ? JsonValue.EMPTY_ARRAY.array : jsonValue.array;
    }

    public static List<JsonValue> readArray(JsonValue jsonValue, String str) {
        return (List) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda11
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readArray$2(jsonValue2);
            }
        });
    }

    public static Map<String, String> readStringStringMap(JsonValue jsonValue, String str) {
        JsonValue readObject = readObject(jsonValue, str);
        if (readObject.type != JsonValue.Type.MAP || readObject.map.size() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str2 : readObject.map.keySet()) {
            String readString = readString(readObject, str2);
            if (readString != null) {
                hashMap.put(str2, readString);
            }
        }
        if (hashMap.isEmpty()) {
            return null;
        }
        return hashMap;
    }

    static /* synthetic */ String lambda$readString$3(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return jsonValue.string;
    }

    public static String readString(JsonValue jsonValue, String str) {
        return (String) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda1
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readString$3(jsonValue2);
            }
        });
    }

    static /* synthetic */ String lambda$readString$4(String str, JsonValue jsonValue) {
        return jsonValue == null ? str : jsonValue.string;
    }

    public static String readString(JsonValue jsonValue, String str, final String str2) {
        return (String) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda14
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readString$4(str2, jsonValue2);
            }
        });
    }

    public static ZonedDateTime readDate(JsonValue jsonValue, String str) {
        return (ZonedDateTime) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda18
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readDate$5(jsonValue2);
            }
        });
    }

    static /* synthetic */ ZonedDateTime lambda$readDate$5(JsonValue jsonValue) {
        if (jsonValue == null || jsonValue.string == null) {
            return null;
        }
        return DateTimeUtils.parseDateTimeThrowParseError(jsonValue.string);
    }

    static /* synthetic */ Integer lambda$readInteger$6(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return getInteger(jsonValue);
    }

    public static Integer readInteger(JsonValue jsonValue, String str) {
        return (Integer) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda13
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readInteger$6(jsonValue2);
            }
        });
    }

    public static int readInteger(JsonValue jsonValue, String str, final int i) {
        return ((Integer) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda2
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readInteger$7(i, jsonValue2);
            }
        })).intValue();
    }

    static /* synthetic */ Integer lambda$readInteger$7(int i, JsonValue jsonValue) {
        Integer integer;
        return (jsonValue == null || (integer = getInteger(jsonValue)) == null) ? Integer.valueOf(i) : integer;
    }

    static /* synthetic */ Long lambda$readLong$8(JsonValue jsonValue) {
        if (jsonValue == null) {
            return null;
        }
        return getLong(jsonValue);
    }

    public static Long readLong(JsonValue jsonValue, String str) {
        return (Long) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda8
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readLong$8(jsonValue2);
            }
        });
    }

    public static long readLong(JsonValue jsonValue, String str, final long j) {
        return ((Long) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda6
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readLong$9(j, jsonValue2);
            }
        })).longValue();
    }

    static /* synthetic */ Long lambda$readLong$9(long j, JsonValue jsonValue) {
        Long l;
        return (jsonValue == null || (l = getLong(jsonValue)) == null) ? Long.valueOf(j) : l;
    }

    public static boolean readBoolean(JsonValue jsonValue, String str) {
        return readBoolean(jsonValue, str, false).booleanValue();
    }

    public static Boolean readBoolean(JsonValue jsonValue, String str, final Boolean bool) {
        return (Boolean) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda0
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                return JsonValueUtils.lambda$readBoolean$10(bool, jsonValue2);
            }
        });
    }

    static /* synthetic */ Boolean lambda$readBoolean$10(Boolean bool, JsonValue jsonValue) {
        return (jsonValue == null || jsonValue.bool == null) ? bool : jsonValue.bool;
    }

    public static Duration readNanos(JsonValue jsonValue, String str) {
        Long readLong = readLong(jsonValue, str);
        if (readLong == null) {
            return null;
        }
        return Duration.ofNanos(readLong.longValue());
    }

    public static Duration readNanos(JsonValue jsonValue, String str, Duration duration) {
        Long readLong = readLong(jsonValue, str);
        return readLong == null ? duration : Duration.ofNanos(readLong.longValue());
    }

    public static <T> List<T> listOf(JsonValue jsonValue, Function<JsonValue, T> function) {
        ArrayList arrayList = new ArrayList();
        if (jsonValue != null && jsonValue.array != null) {
            Iterator<JsonValue> it = jsonValue.array.iterator();
            while (it.hasNext()) {
                T apply = function.apply(it.next());
                if (apply != null) {
                    arrayList.add(apply);
                }
            }
        }
        return arrayList;
    }

    public static <T> List<T> optionalListOf(JsonValue jsonValue, Function<JsonValue, T> function) {
        List<T> listOf = listOf(jsonValue, function);
        if (listOf.size() == 0) {
            return null;
        }
        return listOf;
    }

    public static List<String> readStringList(JsonValue jsonValue, String str) {
        return (List) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda7
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                List listOf;
                listOf = JsonValueUtils.listOf(jsonValue2, new Function() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda15
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str2;
                        str2 = ((JsonValue) obj).string;
                        return str2;
                    }
                });
                return listOf;
            }
        });
    }

    public static List<String> readStringListIgnoreEmpty(JsonValue jsonValue, String str) {
        return (List) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda9
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                List listOf;
                listOf = JsonValueUtils.listOf(jsonValue2, new Function() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda16
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return JsonValueUtils.lambda$null$13((JsonValue) obj);
                    }
                });
                return listOf;
            }
        });
    }

    static /* synthetic */ String lambda$null$13(JsonValue jsonValue) {
        if (jsonValue.string == null) {
            return null;
        }
        String trim = jsonValue.string.trim();
        if (trim.length() > 0) {
            return trim;
        }
        return null;
    }

    public static List<String> readOptionalStringList(JsonValue jsonValue, String str) {
        return (List) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda19
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                List optionalListOf;
                optionalListOf = JsonValueUtils.optionalListOf(jsonValue2, new Function() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda20
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        String str2;
                        str2 = ((JsonValue) obj).string;
                        return str2;
                    }
                });
                return optionalListOf;
            }
        });
    }

    public static List<Long> readLongList(JsonValue jsonValue, String str) {
        return (List) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda5
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                List listOf;
                listOf = JsonValueUtils.listOf(jsonValue2, new Function() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda12
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return JsonValueUtils.getLong((JsonValue) obj);
                    }
                });
                return listOf;
            }
        });
    }

    public static List<Duration> readNanosList(JsonValue jsonValue, String str) {
        return readNanosList(jsonValue, str, false);
    }

    public static List<Duration> readNanosList(JsonValue jsonValue, String str, boolean z) {
        List<Duration> list = (List) read(jsonValue, str, new JsonValueSupplier() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda4
            @Override // io.nats.client.support.JsonValueUtils.JsonValueSupplier
            public final Object get(JsonValue jsonValue2) {
                List listOf;
                listOf = JsonValueUtils.listOf(jsonValue2, new Function() { // from class: io.nats.client.support.JsonValueUtils$$ExternalSyntheticLambda10
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return JsonValueUtils.lambda$null$18((JsonValue) obj);
                    }
                });
                return listOf;
            }
        });
        if (list.size() == 0 && z) {
            return null;
        }
        return list;
    }

    static /* synthetic */ Duration lambda$null$18(JsonValue jsonValue) {
        Long l = getLong(jsonValue);
        if (l == null) {
            return null;
        }
        return Duration.ofNanos(l.longValue());
    }

    public static byte[] readBytes(JsonValue jsonValue, String str) {
        String readString = readString(jsonValue, str);
        if (readString == null) {
            return null;
        }
        return readString.getBytes(StandardCharsets.US_ASCII);
    }

    public static byte[] readBase64(JsonValue jsonValue, String str) {
        String readString = readString(jsonValue, str);
        if (readString == null) {
            return null;
        }
        return Base64.getDecoder().decode(readString);
    }

    public static Integer getInteger(JsonValue jsonValue) {
        if (jsonValue.i != null) {
            return jsonValue.i;
        }
        if (jsonValue.l == null || jsonValue.l.longValue() > 2147483647L || jsonValue.l.longValue() < -2147483648L) {
            return null;
        }
        return Integer.valueOf(jsonValue.l.intValue());
    }

    public static Long getLong(JsonValue jsonValue) {
        if (jsonValue.l != null) {
            return jsonValue.l;
        }
        if (jsonValue.i != null) {
            return Long.valueOf(jsonValue.i.intValue());
        }
        return null;
    }

    public static long getLong(JsonValue jsonValue, long j) {
        return jsonValue.l != null ? jsonValue.l.longValue() : jsonValue.i != null ? jsonValue.i.intValue() : j;
    }

    public static JsonValue instance(Duration duration) {
        return new JsonValue(duration.toNanos());
    }

    public static JsonValue instance(Collection collection) {
        JsonValue jsonValue = new JsonValue(new ArrayList());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            jsonValue.array.add(toJsonValue(it.next()));
        }
        return jsonValue;
    }

    public static JsonValue instance(Map map) {
        JsonValue jsonValue = new JsonValue(new HashMap());
        for (Object obj : map.keySet()) {
            jsonValue.map.put(obj.toString(), toJsonValue(map.get(obj)));
        }
        return jsonValue;
    }

    public static JsonValue toJsonValue(Object obj) {
        if (obj == null) {
            return JsonValue.NULL;
        }
        if (obj instanceof JsonValue) {
            return (JsonValue) obj;
        }
        if (obj instanceof JsonSerializable) {
            return ((JsonSerializable) obj).toJsonValue();
        }
        if (obj instanceof Map) {
            return new JsonValue((Map<String, JsonValue>) obj);
        }
        if (obj instanceof List) {
            return new JsonValue((List<JsonValue>) obj);
        }
        if (obj instanceof Set) {
            return new JsonValue(new ArrayList((Set) obj));
        }
        if (obj instanceof String) {
            String trim = ((String) obj).trim();
            return trim.length() == 0 ? new JsonValue() : new JsonValue(trim);
        }
        if (obj instanceof Boolean) {
            return new JsonValue((Boolean) obj);
        }
        if (obj instanceof Integer) {
            return new JsonValue(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            return new JsonValue(((Long) obj).longValue());
        }
        if (obj instanceof Double) {
            return new JsonValue(((Double) obj).doubleValue());
        }
        if (obj instanceof Float) {
            return new JsonValue(((Float) obj).floatValue());
        }
        if (obj instanceof BigDecimal) {
            return new JsonValue((BigDecimal) obj);
        }
        if (obj instanceof BigInteger) {
            return new JsonValue((BigInteger) obj);
        }
        return new JsonValue(obj.toString());
    }

    public static MapBuilder mapBuilder() {
        return new MapBuilder();
    }

    public static class MapBuilder implements JsonSerializable {
        public JsonValue jv = new JsonValue(new HashMap());

        public MapBuilder put(String str, Object obj) {
            JsonValue jsonValue = JsonValueUtils.toJsonValue(obj);
            if (jsonValue.type != JsonValue.Type.NULL) {
                this.jv.map.put(str, jsonValue);
            }
            return this;
        }

        @Override // io.nats.client.support.JsonSerializable
        public String toJson() {
            return this.jv.toJson();
        }

        @Override // io.nats.client.support.JsonSerializable
        public JsonValue toJsonValue() {
            return this.jv;
        }

        @Deprecated
        public JsonValue getJsonValue() {
            return this.jv;
        }
    }

    public static ArrayBuilder arrayBuilder() {
        return new ArrayBuilder();
    }

    public static class ArrayBuilder implements JsonSerializable {
        public JsonValue jv = new JsonValue(new ArrayList());

        public ArrayBuilder add(Object obj) {
            if (JsonValueUtils.toJsonValue(obj).type != JsonValue.Type.NULL) {
                this.jv.array.add(JsonValueUtils.toJsonValue(obj));
            }
            return this;
        }

        @Override // io.nats.client.support.JsonSerializable
        public String toJson() {
            return this.jv.toJson();
        }

        @Override // io.nats.client.support.JsonSerializable
        public JsonValue toJsonValue() {
            return this.jv;
        }

        @Deprecated
        public JsonValue getJsonValue() {
            return this.jv;
        }
    }
}
