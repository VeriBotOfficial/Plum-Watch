package io.nats.client.support;

import com.autonavi.aps.amapapi.config.Const;
import io.livekit.android.room.util.MediaConstraintKeys;
import io.nats.client.impl.Headers;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class JsonUtils {
    private static final String AFTER_FIELD_RE = "\"\\s*:\\s*";
    private static final String BEFORE_FIELD_RE = "\"";
    private static final String BOOLEAN_RE = "(true|false)";
    public static final String CLOSE = "}";
    private static final String COMMA = ",";
    public static final String EMPTY_JSON = "{}";
    private static final String INDENT = "                                        ";
    private static final String INTEGER_RE = "(-?\\d+)";
    private static final String NUMBER_ARRAY_RE = "\\[\\s*(.+?)\\s*\\]";
    public static final String OPENQ = "{\"";
    private static final String Q = "\"";
    private static final String QCOLON = "\":";
    private static final String QCOLONQ = "\":\"";
    private static final String QCOMMA = "\",";
    private static final String STRING_ARRAY_RE = "\\[\\s*(\".+?\")\\s*\\]";
    private static final String STRING_RE = "\"(.+?)\"";

    interface ListAdder<T> {
        void append(StringBuilder sb, T t);
    }

    private JsonUtils() {
    }

    public static StringBuilder beginJson() {
        return new StringBuilder(Const.STR_MART_JSON_BEGIN);
    }

    public static StringBuilder beginArray() {
        return new StringBuilder("[");
    }

    public static StringBuilder beginJsonPrefixed(String str) {
        if (str == null) {
            return beginJson();
        }
        return new StringBuilder(str).append(AbstractJsonLexerKt.BEGIN_OBJ);
    }

    public static StringBuilder endJson(StringBuilder sb) {
        int length = sb.length() - 1;
        if (sb.charAt(length) == ',') {
            sb.setCharAt(length, AbstractJsonLexerKt.END_OBJ);
            return sb;
        }
        sb.append("}");
        return sb;
    }

    public static StringBuilder endArray(StringBuilder sb) {
        int length = sb.length() - 1;
        if (sb.charAt(length) == ',') {
            sb.setCharAt(length, AbstractJsonLexerKt.END_LIST);
            return sb;
        }
        sb.append("]");
        return sb;
    }

    public static StringBuilder beginFormattedJson() {
        return new StringBuilder("{\n    ");
    }

    public static String endFormattedJson(StringBuilder sb) {
        sb.setLength(sb.length() - 1);
        sb.append("\n}");
        return sb.toString().replaceAll(",", ",\n    ");
    }

    public static void addRawJson(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON);
        sb.append(str2);
        sb.append(",");
    }

    public static void addField(StringBuilder sb, String str, String str2) {
        if (str2 == null || str2.length() <= 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLONQ);
        Encoding.jsonEncode(sb, str2);
        sb.append(QCOMMA);
    }

    public static void addFieldEvenEmpty(StringBuilder sb, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLONQ);
        Encoding.jsonEncode(sb, str2);
        sb.append(QCOMMA);
    }

    public static void addField(StringBuilder sb, String str, Boolean bool) {
        if (bool != null) {
            sb.append("\"");
            Encoding.jsonEncode(sb, str);
            sb.append(QCOLON).append(bool.booleanValue() ? MediaConstraintKeys.TRUE : "false").append(",");
        }
    }

    public static void addFldWhenTrue(StringBuilder sb, String str, Boolean bool) {
        if (bool == null || !bool.booleanValue()) {
            return;
        }
        addField(sb, str, (Boolean) true);
    }

    public static void addField(StringBuilder sb, String str, Integer num) {
        if (num == null || num.intValue() < 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON).append(num).append(",");
    }

    public static void addFieldWhenGtZero(StringBuilder sb, String str, Integer num) {
        if (num == null || num.intValue() <= 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON).append(num).append(",");
    }

    public static void addField(StringBuilder sb, String str, Long l) {
        if (l == null || l.longValue() < 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON).append(l).append(",");
    }

    public static void addFieldWhenGtZero(StringBuilder sb, String str, Long l) {
        if (l == null || l.longValue() <= 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON).append(l).append(",");
    }

    public static void addFieldWhenGteMinusOne(StringBuilder sb, String str, Long l) {
        if (l == null || l.longValue() < -1) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON).append(l).append(",");
    }

    public static void addFieldAsNanos(StringBuilder sb, String str, Duration duration) {
        if (duration == null || duration.isZero() || duration.isNegative()) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLON).append(duration.toNanos()).append(",");
    }

    public static void addField(StringBuilder sb, String str, JsonSerializable jsonSerializable) {
        if (jsonSerializable != null) {
            sb.append("\"");
            Encoding.jsonEncode(sb, str);
            sb.append(QCOLON).append(jsonSerializable.toJson()).append(",");
        }
    }

    public static void addField(StringBuilder sb, String str, Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        addField(sb, str, JsonValueUtils.instance(map));
    }

    public static <T> void _addList(StringBuilder sb, String str, List<T> list, ListAdder<T> listAdder) {
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append("\":[");
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append(",");
            }
            listAdder.append(sb, list.get(i));
        }
        sb.append("],");
    }

    public static void addStrings(StringBuilder sb, String str, String[] strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        _addStrings(sb, str, Arrays.asList(strArr));
    }

    public static void addStrings(StringBuilder sb, String str, List<String> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        _addStrings(sb, str, list);
    }

    private static void _addStrings(final StringBuilder sb, String str, List<String> list) {
        _addList(sb, str, list, new ListAdder() { // from class: io.nats.client.support.JsonUtils$$ExternalSyntheticLambda0
            @Override // io.nats.client.support.JsonUtils.ListAdder
            public final void append(StringBuilder sb2, Object obj) {
                JsonUtils.lambda$_addStrings$0(sb, sb2, (String) obj);
            }
        });
    }

    static /* synthetic */ void lambda$_addStrings$0(StringBuilder sb, StringBuilder sb2, String str) {
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append("\"");
    }

    public static void addJsons(StringBuilder sb, String str, List<? extends JsonSerializable> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        _addList(sb, str, list, new ListAdder() { // from class: io.nats.client.support.JsonUtils$$ExternalSyntheticLambda2
            @Override // io.nats.client.support.JsonUtils.ListAdder
            public final void append(StringBuilder sb2, Object obj) {
                sb2.append(((JsonSerializable) obj).toJson());
            }
        });
    }

    public static void addDurations(StringBuilder sb, String str, List<Duration> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        _addList(sb, str, list, new ListAdder() { // from class: io.nats.client.support.JsonUtils$$ExternalSyntheticLambda1
            @Override // io.nats.client.support.JsonUtils.ListAdder
            public final void append(StringBuilder sb2, Object obj) {
                sb2.append(((Duration) obj).toNanos());
            }
        });
    }

    public static void addField(StringBuilder sb, String str, ZonedDateTime zonedDateTime) {
        if (zonedDateTime == null || DateTimeUtils.DEFAULT_TIME.equals(zonedDateTime)) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append(QCOLONQ).append(DateTimeUtils.toRfc3339(zonedDateTime)).append(QCOMMA);
    }

    public static void addField(StringBuilder sb, String str, Headers headers) {
        if (headers == null || headers.size() <= 0) {
            return;
        }
        sb.append("\"");
        Encoding.jsonEncode(sb, str);
        sb.append("\":{");
        for (Map.Entry<String, List<String>> entry : headers.entrySet()) {
            addStrings(sb, entry.getKey(), entry.getValue());
        }
        endJson(sb);
        sb.append(",");
    }

    @Deprecated
    public static String normalize(String str) {
        return Character.toString(str.charAt(0)).toUpperCase() + str.substring(1).toLowerCase();
    }

    public static String toKey(Class<?> cls) {
        return "\"" + cls.getSimpleName() + QCOLON;
    }

    @Deprecated
    public static String objectString(String str, Object obj) {
        if (obj == null) {
            return str + "=null";
        }
        return obj.toString();
    }

    private static String indent(int i) {
        return i == 0 ? "" : INDENT.substring(0, i * 4);
    }

    public static String getFormatted(Object obj) {
        StringBuilder sb = new StringBuilder();
        String obj2 = obj.toString();
        String str = "";
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (int i3 = 0; i3 < obj2.length(); i3++) {
            char charAt = obj2.charAt(i3);
            if (charAt == '{') {
                if (i > 0 && z) {
                    sb.append(str);
                }
                sb.append(charAt).append('\n');
                i2++;
                str = indent(i2);
                z = false;
            } else {
                if (charAt == '}') {
                    i2--;
                    str = indent(i2);
                    sb.append('\n').append(str).append(charAt);
                } else if (charAt == ',') {
                    sb.append(",\n");
                } else {
                    if (charAt == '[') {
                        i++;
                    } else if (charAt == ']') {
                        i--;
                    }
                    if (!z2) {
                        sb.append(charAt);
                    } else if (charAt != ' ') {
                        sb.append(str).append(charAt);
                        z2 = false;
                    }
                    if (!z || !Character.isWhitespace(charAt)) {
                        z = false;
                    }
                }
                z = true;
            }
            z2 = true;
        }
        return sb.toString();
    }

    public static void printFormatted(Object obj) {
        System.out.println(getFormatted(obj));
    }

    public static Long safeParseLong(String str) {
        try {
            try {
                return Long.valueOf(Long.parseLong(str));
            } catch (Exception unused) {
                return Long.valueOf(Long.parseUnsignedLong(str));
            }
        } catch (Exception unused2) {
            return null;
        }
    }

    public static long safeParseLong(String str, long j) {
        Long safeParseLong = safeParseLong(str);
        return safeParseLong == null ? j : safeParseLong.longValue();
    }

    @Deprecated
    public enum FieldType {
        jsonString(JsonUtils.STRING_RE),
        jsonBoolean(JsonUtils.BOOLEAN_RE),
        jsonInteger(JsonUtils.INTEGER_RE),
        jsonNumber(JsonUtils.INTEGER_RE),
        jsonStringArray(JsonUtils.STRING_ARRAY_RE);

        final String re;

        FieldType(String str) {
            this.re = str;
        }
    }

    @Deprecated
    public static Pattern string_pattern(String str) {
        return buildPattern(str, STRING_RE);
    }

    @Deprecated
    public static Pattern number_pattern(String str) {
        return integer_pattern(str);
    }

    @Deprecated
    public static Pattern integer_pattern(String str) {
        return buildPattern(str, INTEGER_RE);
    }

    @Deprecated
    public static Pattern boolean_pattern(String str) {
        return buildPattern(str, BOOLEAN_RE);
    }

    @Deprecated
    public static Pattern string_array_pattern(String str) {
        return buildPattern(str, STRING_ARRAY_RE);
    }

    @Deprecated
    public static Pattern number_array_pattern(String str) {
        return buildPattern(str, NUMBER_ARRAY_RE);
    }

    @Deprecated
    public static Pattern buildPattern(String str, FieldType fieldType) {
        return buildPattern(str, fieldType.re);
    }

    @Deprecated
    public static Pattern buildPattern(String str, String str2) {
        return Pattern.compile("\"" + str + AFTER_FIELD_RE + str2, 2);
    }

    @Deprecated
    public static String getJsonObject(String str, String str2) {
        return getJsonObject(str, str2, "{}");
    }

    @Deprecated
    public static String getJsonObject(String str, String str2, String str3) {
        int[] bracketIndexes = getBracketIndexes(str, str2, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ, 0);
        return bracketIndexes == null ? str3 : str2.substring(bracketIndexes[0], bracketIndexes[1] + 1);
    }

    @Deprecated
    public static String removeObject(String str, String str2) {
        int[] bracketIndexes = getBracketIndexes(str2, str, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ, 0);
        return bracketIndexes != null ? str.substring(0, bracketIndexes[0]) + "\"rmvd" + str2.hashCode() + "\":\"\"" + str.substring(bracketIndexes[1] + 1) : str;
    }

    @Deprecated
    public static List<String> getObjectList(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        int[] bracketIndexes = getBracketIndexes(str, str2, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, -1);
        if (bracketIndexes != null) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (int i2 = bracketIndexes[0] + 1; i2 < bracketIndexes[1]; i2++) {
                char charAt = str2.charAt(i2);
                if (charAt == '{') {
                    sb.append(charAt);
                    i++;
                } else if (charAt == '}') {
                    sb.append(charAt);
                    i--;
                    if (i == 0) {
                        arrayList.add(sb.toString());
                        sb.setLength(0);
                    }
                } else if (i > 0) {
                    sb.append(charAt);
                }
            }
        }
        return arrayList;
    }

    private static int[] getBracketIndexes(String str, String str2, char c, char c2, int i) {
        int indexOf;
        int[] iArr = {-1, -1};
        int indexOf2 = str2.indexOf("\"" + str + "\"", i);
        if (indexOf2 == -1) {
            return null;
        }
        if (i != -1) {
            int indexOf3 = str2.indexOf(58, indexOf2) + 1;
            indexOf = str2.indexOf(c, indexOf3);
            for (int i2 = indexOf3; i2 < indexOf; i2++) {
                if (!Character.isWhitespace(str2.charAt(i2))) {
                    return getBracketIndexes(str, str2, c, c2, indexOf3);
                }
            }
        } else {
            indexOf = str2.indexOf(c, indexOf2);
        }
        int i3 = 1;
        for (int i4 = indexOf + 1; i4 < str2.length(); i4++) {
            char charAt = str2.charAt(i4);
            if (charAt == c) {
                i3++;
            } else if (charAt == c2 && i3 - 1 == 0) {
                iArr[0] = indexOf;
                iArr[1] = i4;
                return iArr;
            }
        }
        return null;
    }

    @Deprecated
    public static Map<String, String> getMapOfObjects(String str) {
        HashMap hashMap = new HashMap();
        int indexOf = str.indexOf(34);
        while (indexOf != -1) {
            int i = indexOf + 1;
            String trim = str.substring(i, str.indexOf(34, i)).trim();
            int[] bracketIndexes = getBracketIndexes(trim, str, AbstractJsonLexerKt.BEGIN_OBJ, AbstractJsonLexerKt.END_OBJ, indexOf);
            if (bracketIndexes != null) {
                hashMap.put(trim, str.substring(bracketIndexes[0], bracketIndexes[1] + 1));
                indexOf = str.indexOf(34, bracketIndexes[1]);
            } else {
                indexOf = -1;
            }
        }
        return hashMap;
    }

    @Deprecated
    public static Map<String, List<String>> getMapOfLists(String str) {
        HashMap hashMap = new HashMap();
        int indexOf = str.indexOf(34);
        while (indexOf != -1) {
            int i = indexOf + 1;
            String trim = str.substring(i, str.indexOf(34, i)).trim();
            int[] bracketIndexes = getBracketIndexes(trim, str, AbstractJsonLexerKt.BEGIN_LIST, AbstractJsonLexerKt.END_LIST, indexOf);
            if (bracketIndexes != null) {
                hashMap.put(trim, toList(str.substring(bracketIndexes[0] + 1, bracketIndexes[1])));
                indexOf = str.indexOf(34, bracketIndexes[1]);
            } else {
                indexOf = -1;
            }
        }
        return hashMap;
    }

    @Deprecated
    public static Map<String, Long> getMapOfLongs(String str) {
        HashMap hashMap = new HashMap();
        int indexOf = str.indexOf(34);
        while (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(34, i);
            int indexOf3 = str.indexOf(58, indexOf2);
            int indexOf4 = str.indexOf(44, indexOf2);
            if (indexOf4 == -1) {
                indexOf4 = str.indexOf(125, indexOf2);
            }
            hashMap.put(str.substring(i, indexOf2).trim(), Long.valueOf(safeParseLong(str.substring(indexOf3 + 1, indexOf4).trim(), 0L)));
            indexOf = str.indexOf(34, indexOf4);
        }
        return hashMap;
    }

    @Deprecated
    public static List<String> getStringList(String str, String str2) {
        Matcher matcher = string_array_pattern(str).matcher(str2.replaceAll("\r", "").replaceAll("\n", ""));
        if (matcher.find()) {
            return toList(matcher.group(1));
        }
        return new ArrayList();
    }

    private static List<String> toList(String str) {
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String replace = str2.trim().replace("\"", "");
            if (replace.length() > 0) {
                arrayList.add(Encoding.jsonDecode(replace));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static List<Long> getLongList(String str, String str2) {
        String replaceAll = str2.replaceAll("\r", "").replaceAll("\n", "");
        ArrayList arrayList = new ArrayList();
        Matcher matcher = number_array_pattern(str).matcher(replaceAll);
        if (matcher.find()) {
            for (String str3 : matcher.group(1).split(",")) {
                arrayList.add(safeParseLong(str3.trim()));
            }
        }
        return arrayList;
    }

    @Deprecated
    public static List<Duration> getDurationList(String str, String str2) {
        List<Long> longList = getLongList(str, str2);
        ArrayList arrayList = new ArrayList(longList.size());
        Iterator<Long> it = longList.iterator();
        while (it.hasNext()) {
            arrayList.add(Duration.ofNanos(it.next().longValue()));
        }
        return arrayList;
    }

    @Deprecated
    public static byte[] simpleMessageBody(String str, Number number) {
        return (OPENQ + str + QCOLON + number + "}").getBytes();
    }

    @Deprecated
    public static byte[] simpleMessageBody(String str, String str2) {
        return (OPENQ + str + QCOLONQ + str2 + "\"}").getBytes();
    }

    @Deprecated
    public static String readString(String str, Pattern pattern) {
        return readString(str, pattern, null);
    }

    @Deprecated
    public static String readString(String str, Pattern pattern, String str2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Encoding.jsonDecode(matcher.group(1)) : str2;
    }

    @Deprecated
    public static String readStringMayHaveQuotes(String str, String str2, String str3) {
        String str4 = "\"" + str2 + "\"";
        int indexOf = str.indexOf(str4);
        if (indexOf == -1) {
            return str3;
        }
        int indexOf2 = str.indexOf(34, indexOf + str4.length());
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = indexOf2 + 1;
            char charAt = str.charAt(i);
            if (charAt == '\\') {
                indexOf2 += 2;
                char charAt2 = str.charAt(indexOf2);
                if (charAt2 == '\"') {
                    sb.append('\"');
                } else {
                    sb.append(charAt);
                    sb.append(charAt2);
                }
            } else if (charAt != '\"') {
                sb.append(charAt);
                indexOf2 = i;
            } else {
                return Encoding.jsonDecode(sb.toString());
            }
        }
    }

    @Deprecated
    public static byte[] readBytes(String str, Pattern pattern) {
        String readString = readString(str, pattern, null);
        if (readString == null) {
            return null;
        }
        return readString.getBytes(StandardCharsets.US_ASCII);
    }

    @Deprecated
    public static byte[] readBase64(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        String group = matcher.find() ? matcher.group(1) : null;
        if (group == null) {
            return null;
        }
        return Base64.getDecoder().decode(group);
    }

    @Deprecated
    public static boolean readBoolean(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() && Boolean.parseBoolean(matcher.group(1));
    }

    @Deprecated
    public static Boolean readBoolean(String str, Pattern pattern, Boolean bool) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Boolean.valueOf(Boolean.parseBoolean(matcher.group(1))) : bool;
    }

    @Deprecated
    public static Integer readInteger(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    @Deprecated
    public static int readInt(String str, Pattern pattern, int i) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt(matcher.group(1)) : i;
    }

    @Deprecated
    public static void readInt(String str, Pattern pattern, IntConsumer intConsumer) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            intConsumer.accept(Integer.parseInt(matcher.group(1)));
        }
    }

    @Deprecated
    public static Long readLong(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return safeParseLong(matcher.group(1));
        }
        return null;
    }

    @Deprecated
    public static long readLong(String str, Pattern pattern, long j) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? safeParseLong(matcher.group(1), j) : j;
    }

    @Deprecated
    public static void readLong(String str, Pattern pattern, LongConsumer longConsumer) {
        Long safeParseLong;
        Matcher matcher = pattern.matcher(str);
        if (!matcher.find() || (safeParseLong = safeParseLong(matcher.group(1))) == null) {
            return;
        }
        longConsumer.accept(safeParseLong.longValue());
    }

    @Deprecated
    public static ZonedDateTime readDate(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return DateTimeUtils.parseDateTime(matcher.group(1));
        }
        return null;
    }

    @Deprecated
    public static Duration readNanos(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return Duration.ofNanos(Long.parseLong(matcher.group(1)));
        }
        return null;
    }

    @Deprecated
    public static Duration readNanos(String str, Pattern pattern, Duration duration) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Duration.ofNanos(Long.parseLong(matcher.group(1))) : duration;
    }

    @Deprecated
    public static void readNanos(String str, Pattern pattern, Consumer<Duration> consumer) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            consumer.accept(Duration.ofNanos(Long.parseLong(matcher.group(1))));
        }
    }

    public static <T> boolean listEquals(List<T> list, List<T> list2) {
        if (list == null) {
            return list2 == null;
        }
        if (list2 == null) {
            return false;
        }
        return list.equals(list2);
    }

    public static boolean mapEquals(Map<String, String> map, Map<String, String> map2) {
        if (map == null) {
            return map2 == null;
        }
        if (map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (String str : map.keySet()) {
            if (!Objects.equals(map.get(str), map2.get(str))) {
                return false;
            }
        }
        return true;
    }
}
