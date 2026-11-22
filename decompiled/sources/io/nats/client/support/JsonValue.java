package io.nats.client.support;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes6.dex */
public class JsonValue implements JsonSerializable {
    private static final char COMMA = ',';
    private static final String NULL_STR = "null";
    private static final char QUOTE = '\"';
    public final List<JsonValue> array;
    public final BigDecimal bd;
    public final BigInteger bi;
    public final Boolean bool;
    public final Double d;
    public final Float f;
    public final Integer i;
    public final Long l;
    public final Map<String, JsonValue> map;
    public final Number number;
    public final Object object;
    public final String string;
    public final Type type;
    public static final JsonValue NULL = new JsonValue();
    public static final JsonValue TRUE = new JsonValue((Boolean) true);
    public static final JsonValue FALSE = new JsonValue((Boolean) false);
    public static final JsonValue EMPTY_MAP = new JsonValue((Map<String, JsonValue>) Collections.unmodifiableMap(new HashMap()));
    public static final JsonValue EMPTY_ARRAY = new JsonValue((List<JsonValue>) Collections.unmodifiableList(new ArrayList()));

    public enum Type {
        STRING,
        BOOL,
        INTEGER,
        LONG,
        DOUBLE,
        FLOAT,
        BIG_DECIMAL,
        BIG_INTEGER,
        MAP,
        ARRAY,
        NULL
    }

    @Override // io.nats.client.support.JsonSerializable
    public JsonValue toJsonValue() {
        return this;
    }

    public JsonValue() {
        this(null, null, null, null, null, null, null, null, null, null);
    }

    public JsonValue(String str) {
        this(str, null, null, null, null, null, null, null, null, null);
    }

    public JsonValue(char c) {
        this("" + c, null, null, null, null, null, null, null, null, null);
    }

    public JsonValue(Boolean bool) {
        this(null, bool, null, null, null, null, null, null, null, null);
    }

    public JsonValue(int i) {
        this(null, null, Integer.valueOf(i), null, null, null, null, null, null, null);
    }

    public JsonValue(long j) {
        this(null, null, null, Long.valueOf(j), null, null, null, null, null, null);
    }

    public JsonValue(double d) {
        this(null, null, null, null, Double.valueOf(d), null, null, null, null, null);
    }

    public JsonValue(float f) {
        this(null, null, null, null, null, Float.valueOf(f), null, null, null, null);
    }

    public JsonValue(BigDecimal bigDecimal) {
        this(null, null, null, null, null, null, bigDecimal, null, null, null);
    }

    public JsonValue(BigInteger bigInteger) {
        this(null, null, null, null, null, null, null, bigInteger, null, null);
    }

    public JsonValue(Map<String, JsonValue> map) {
        this(null, null, null, null, null, null, null, null, map, null);
    }

    public JsonValue(List<JsonValue> list) {
        this(null, null, null, null, null, null, null, null, null, list);
    }

    public JsonValue(JsonValue[] jsonValueArr) {
        this(null, null, null, null, null, null, null, null, null, jsonValueArr == null ? null : Arrays.asList(jsonValueArr));
    }

    private JsonValue(String str, Boolean bool, Integer num, Long l, Double d, Float f, BigDecimal bigDecimal, BigInteger bigInteger, Map<String, JsonValue> map, List<JsonValue> list) {
        this.map = map;
        this.array = list;
        this.string = str;
        this.bool = bool;
        this.i = num;
        this.l = l;
        this.d = d;
        this.f = f;
        this.bd = bigDecimal;
        this.bi = bigInteger;
        if (num != null) {
            this.type = Type.INTEGER;
            this.number = num;
            this.object = num;
            return;
        }
        if (l != null) {
            this.type = Type.LONG;
            this.number = l;
            this.object = l;
            return;
        }
        if (d != null) {
            this.type = Type.DOUBLE;
            this.number = d;
            this.object = d;
            return;
        }
        if (f != null) {
            this.type = Type.FLOAT;
            this.number = f;
            this.object = f;
            return;
        }
        if (bigDecimal != null) {
            this.type = Type.BIG_DECIMAL;
            this.number = bigDecimal;
            this.object = bigDecimal;
            return;
        }
        if (bigInteger != null) {
            this.type = Type.BIG_INTEGER;
            this.number = bigInteger;
            this.object = bigInteger;
            return;
        }
        this.number = null;
        if (map != null) {
            this.type = Type.MAP;
            this.object = map;
            return;
        }
        if (str != null) {
            this.type = Type.STRING;
            this.object = str;
        } else if (bool != null) {
            this.type = Type.BOOL;
            this.object = bool;
        } else if (list != null) {
            this.type = Type.ARRAY;
            this.object = list;
        } else {
            this.type = Type.NULL;
            this.object = null;
        }
    }

    public String toString(Class<?> cls) {
        return toString(cls.getSimpleName());
    }

    public String toString(String str) {
        return "\"" + str + "\":" + toJson();
    }

    public String toString() {
        return toJson();
    }

    /* renamed from: io.nats.client.support.JsonValue$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$nats$client$support$JsonValue$Type;

        static {
            int[] iArr = new int[Type.values().length];
            $SwitchMap$io$nats$client$support$JsonValue$Type = iArr;
            try {
                iArr[Type.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.MAP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.ARRAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.INTEGER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.LONG.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.FLOAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.BIG_DECIMAL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$nats$client$support$JsonValue$Type[Type.BIG_INTEGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    @Override // io.nats.client.support.JsonSerializable
    public String toJson() {
        switch (AnonymousClass1.$SwitchMap$io$nats$client$support$JsonValue$Type[this.type.ordinal()]) {
            case 1:
                return valueString(this.string);
            case 2:
                return valueString(this.bool.booleanValue());
            case 3:
                return valueString(this.map);
            case 4:
                return valueString(this.array);
            case 5:
                return this.i.toString();
            case 6:
                return this.l.toString();
            case 7:
                return this.d.toString();
            case 8:
                return this.f.toString();
            case 9:
                return this.bd.toString();
            case 10:
                return this.bi.toString();
            default:
                return "null";
        }
    }

    private String valueString(String str) {
        return "\"" + Encoding.jsonEncode(str) + '\"';
    }

    private String valueString(boolean z) {
        return Boolean.toString(z).toLowerCase();
    }

    private String valueString(Map<String, JsonValue> map) {
        StringBuilder beginJson = JsonUtils.beginJson();
        for (String str : map.keySet()) {
            JsonUtils.addField(beginJson, str, map.get(str));
        }
        return JsonUtils.endJson(beginJson).toString();
    }

    private String valueString(List<JsonValue> list) {
        StringBuilder beginArray = JsonUtils.beginArray();
        Iterator<JsonValue> it = list.iterator();
        while (it.hasNext()) {
            beginArray.append(it.next().toJson());
            beginArray.append(',');
        }
        return JsonUtils.endArray(beginArray).toString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JsonValue jsonValue = (JsonValue) obj;
        if (this.type == jsonValue.type && Objects.equals(this.map, jsonValue.map) && Objects.equals(this.array, jsonValue.array) && Objects.equals(this.string, jsonValue.string) && Objects.equals(this.bool, jsonValue.bool) && Objects.equals(this.i, jsonValue.i) && Objects.equals(this.l, jsonValue.l) && Objects.equals(this.d, jsonValue.d) && Objects.equals(this.f, jsonValue.f) && Objects.equals(this.bd, jsonValue.bd)) {
            return Objects.equals(this.bi, jsonValue.bi);
        }
        return false;
    }

    public int hashCode() {
        Map<String, JsonValue> map = this.map;
        int hashCode = (map != null ? map.hashCode() : 0) * 31;
        List<JsonValue> list = this.array;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.string;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Boolean bool = this.bool;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num = this.i;
        int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Long l = this.l;
        int hashCode6 = (hashCode5 + (l != null ? l.hashCode() : 0)) * 31;
        Double d = this.d;
        int hashCode7 = (hashCode6 + (d != null ? d.hashCode() : 0)) * 31;
        Float f = this.f;
        int hashCode8 = (hashCode7 + (f != null ? f.hashCode() : 0)) * 31;
        BigDecimal bigDecimal = this.bd;
        int hashCode9 = (hashCode8 + (bigDecimal != null ? bigDecimal.hashCode() : 0)) * 31;
        BigInteger bigInteger = this.bi;
        int hashCode10 = (hashCode9 + (bigInteger != null ? bigInteger.hashCode() : 0)) * 31;
        Type type = this.type;
        return hashCode10 + (type != null ? type.hashCode() : 0);
    }
}
