package io.nats.client.support;

import io.livekit.android.room.util.MediaConstraintKeys;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class JsonParser {
    private char current;
    private int idx;
    private final char[] json;
    private final boolean keepNulls;
    private final int len;
    private char next;
    private int nextIdx;
    private char previous;

    enum Option {
        KEEP_NULLS
    }

    public static JsonValue parse(char[] cArr) throws JsonParseException {
        return new JsonParser(cArr, 0, new Option[0]).parse();
    }

    public static JsonValue parse(char[] cArr, int i) throws JsonParseException {
        return new JsonParser(cArr, i, new Option[0]).parse();
    }

    public static JsonValue parse(char[] cArr, Option... optionArr) throws JsonParseException {
        return new JsonParser(cArr, 0, optionArr).parse();
    }

    public static JsonValue parse(char[] cArr, int i, Option... optionArr) throws JsonParseException {
        return new JsonParser(cArr, i, optionArr).parse();
    }

    public static JsonValue parse(String str) throws JsonParseException {
        return new JsonParser(str.toCharArray(), 0, new Option[0]).parse();
    }

    public static JsonValue parse(String str, int i) throws JsonParseException {
        return new JsonParser(str.toCharArray(), i, new Option[0]).parse();
    }

    public static JsonValue parse(String str, Option... optionArr) throws JsonParseException {
        return new JsonParser(str.toCharArray(), 0, optionArr).parse();
    }

    public static JsonValue parse(String str, int i, Option... optionArr) throws JsonParseException {
        return new JsonParser(str.toCharArray(), i, optionArr).parse();
    }

    public static JsonValue parse(byte[] bArr) throws JsonParseException {
        return new JsonParser(new String(bArr, StandardCharsets.UTF_8).toCharArray(), 0, new Option[0]).parse();
    }

    public static JsonValue parse(byte[] bArr, Option... optionArr) throws JsonParseException {
        return new JsonParser(new String(bArr, StandardCharsets.UTF_8).toCharArray(), 0, optionArr).parse();
    }

    public static JsonValue parseUnchecked(char[] cArr) {
        try {
            return parse(cArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(char[] cArr, int i) {
        try {
            return parse(cArr, i);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(char[] cArr, Option... optionArr) {
        try {
            return parse(cArr, optionArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(char[] cArr, int i, Option... optionArr) {
        try {
            return parse(cArr, i, optionArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(String str) {
        try {
            return parse(str);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(String str, int i) {
        try {
            return parse(str, i);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(String str, Option... optionArr) {
        try {
            return parse(str, optionArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(String str, int i, Option... optionArr) {
        try {
            return parse(str, i, optionArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(byte[] bArr) {
        try {
            return parse(bArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public static JsonValue parseUnchecked(byte[] bArr, Option... optionArr) {
        try {
            return parse(bArr, optionArr);
        } catch (JsonParseException e) {
            throw new RuntimeException(e);
        }
    }

    public JsonParser(char[] cArr) {
        this(cArr, 0, new Option[0]);
    }

    public JsonParser(char[] cArr, Option... optionArr) {
        this(cArr, 0, optionArr);
    }

    public JsonParser(char[] cArr, int i, Option... optionArr) {
        boolean z;
        this.json = cArr;
        int length = optionArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            } else {
                if (optionArr[i2] == Option.KEEP_NULLS) {
                    z = true;
                    break;
                }
                i2++;
            }
        }
        this.keepNulls = z;
        this.len = cArr == null ? 0 : cArr.length;
        this.idx = i;
        if (i < 0) {
            throw new IllegalArgumentException("Invalid start index.");
        }
        this.nextIdx = -1;
        this.previous = (char) 0;
        this.current = (char) 0;
        this.next = (char) 0;
    }

    public JsonValue parse() throws JsonParseException {
        if (peekToken() == 0) {
            return JsonValue.NULL;
        }
        return nextValue();
    }

    private JsonValue nextValue() throws JsonParseException {
        char peekToken = peekToken();
        if (peekToken == 0) {
            throw new JsonParseException("Unexpected end of data.");
        }
        if (peekToken == '\"') {
            nextToken();
            return new JsonValue(nextString());
        }
        if (peekToken == '{') {
            nextToken();
            return new JsonValue(nextObject());
        }
        if (peekToken == '[') {
            nextToken();
            return new JsonValue(nextArray());
        }
        return nextPrimitiveValue();
    }

    private List<JsonValue> nextArray() throws JsonParseException {
        ArrayList arrayList = new ArrayList();
        char peekToken = peekToken();
        while (peekToken != ']') {
            if (peekToken == ',') {
                nextToken();
            } else {
                arrayList.add(nextValue());
            }
            peekToken = peekToken();
        }
        nextToken();
        return arrayList;
    }

    private JsonValue nextPrimitiveValue() throws JsonParseException {
        StringBuilder sb = new StringBuilder();
        char peekToken = peekToken();
        while (peekToken >= ' ' && ",:]}/\\\"[{;=#".indexOf(peekToken) < 0) {
            sb.append(nextToken());
            peekToken = peekToken();
        }
        String sb2 = sb.toString();
        if (MediaConstraintKeys.TRUE.equalsIgnoreCase(sb2)) {
            return new JsonValue(Boolean.TRUE);
        }
        if ("false".equalsIgnoreCase(sb2)) {
            return new JsonValue(Boolean.FALSE);
        }
        if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(sb2)) {
            return JsonValue.NULL;
        }
        try {
            return asNumber(sb2);
        } catch (Exception unused) {
            throw new JsonParseException("Invalid value.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0050, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.util.Map<java.lang.String, io.nats.client.support.JsonValue> nextObject() throws io.nats.client.support.JsonParseException {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L5:
            char r1 = r5.nextToken()
            if (r1 == 0) goto L61
            r2 = 91
            r3 = 123(0x7b, float:1.72E-43)
            r4 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L18
            if (r1 == r3) goto L18
            if (r1 == r4) goto L50
            goto L1c
        L18:
            char r1 = r5.previous
            if (r1 == r3) goto L59
        L1c:
            java.lang.String r1 = r5.nextString()
            char r2 = r5.nextToken()
            r3 = 58
            if (r2 != r3) goto L51
            io.nats.client.support.JsonValue r2 = r5.nextValue()
            io.nats.client.support.JsonValue r3 = io.nats.client.support.JsonValue.NULL
            if (r2 != r3) goto L34
            boolean r3 = r5.keepNulls
            if (r3 == 0) goto L37
        L34:
            r0.put(r1, r2)
        L37:
            char r1 = r5.nextToken()
            r2 = 44
            if (r1 == r2) goto L4a
            if (r1 != r4) goto L42
            goto L50
        L42:
            io.nats.client.support.JsonParseException r0 = new io.nats.client.support.JsonParseException
            java.lang.String r1 = "Expected a ',' or '}'."
            r0.<init>(r1)
            throw r0
        L4a:
            char r1 = r5.peekToken()
            if (r1 != r4) goto L5
        L50:
            return r0
        L51:
            io.nats.client.support.JsonParseException r0 = new io.nats.client.support.JsonParseException
            java.lang.String r1 = "Expected a ':' after a key."
            r0.<init>(r1)
            throw r0
        L59:
            io.nats.client.support.JsonParseException r0 = new io.nats.client.support.JsonParseException
            java.lang.String r1 = "Cannot directly nest another Object or Array."
            r0.<init>(r1)
            throw r0
        L61:
            io.nats.client.support.JsonParseException r0 = new io.nats.client.support.JsonParseException
            java.lang.String r1 = "Text must end with '}'"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nats.client.support.JsonParser.nextObject():java.util.Map");
    }

    private char nextToken() {
        peekToken();
        this.idx = this.nextIdx;
        this.nextIdx = -1;
        this.previous = this.current;
        char c = this.next;
        this.current = c;
        this.next = (char) 0;
        return c;
    }

    private char nextChar() {
        this.previous = this.current;
        int i = this.idx;
        if (i == this.len) {
            this.current = (char) 0;
        } else {
            char[] cArr = this.json;
            this.idx = i + 1;
            this.current = cArr[i];
        }
        this.next = (char) 0;
        this.nextIdx = -1;
        return this.current;
    }

    private char peekToken() {
        if (this.nextIdx == -1) {
            this.nextIdx = this.idx;
            this.next = (char) 0;
            while (true) {
                int i = this.nextIdx;
                if (i >= this.len) {
                    break;
                }
                char[] cArr = this.json;
                this.nextIdx = i + 1;
                char c = cArr[i];
                if (c != '\t' && c != '\n' && c != '\r' && c != ' ') {
                    this.next = c;
                    return c;
                }
            }
        }
        return this.next;
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0081, code lost:
    
        throw new io.nats.client.support.JsonParseException("Unterminated string.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String nextString() throws io.nats.client.support.JsonParseException {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
        L5:
            char r1 = r6.nextChar()
            if (r1 == 0) goto L7a
            r2 = 10
            if (r1 == r2) goto L7a
            r3 = 13
            if (r1 == r3) goto L7a
            r4 = 34
            r5 = 92
            if (r1 == r5) goto L24
            if (r1 != r4) goto L20
            java.lang.String r0 = r0.toString()
            return r0
        L20:
            r0.append(r1)
            goto L5
        L24:
            char r1 = r6.nextChar()
            if (r1 == r4) goto L76
            r4 = 39
            if (r1 == r4) goto L76
            r4 = 47
            if (r1 == r4) goto L76
            if (r1 == r5) goto L76
            r4 = 98
            if (r1 == r4) goto L70
            r4 = 102(0x66, float:1.43E-43)
            if (r1 == r4) goto L6a
            r4 = 110(0x6e, float:1.54E-43)
            if (r1 == r4) goto L66
            r2 = 114(0x72, float:1.6E-43)
            if (r1 == r2) goto L62
            r2 = 116(0x74, float:1.63E-43)
            if (r1 == r2) goto L5c
            r2 = 117(0x75, float:1.64E-43)
            if (r1 != r2) goto L54
            char[] r1 = r6.parseU()
            r0.append(r1)
            goto L5
        L54:
            io.nats.client.support.JsonParseException r0 = new io.nats.client.support.JsonParseException
            java.lang.String r1 = "Illegal escape."
            r0.<init>(r1)
            throw r0
        L5c:
            r1 = 9
            r0.append(r1)
            goto L5
        L62:
            r0.append(r3)
            goto L5
        L66:
            r0.append(r2)
            goto L5
        L6a:
            r1 = 12
            r0.append(r1)
            goto L5
        L70:
            r1 = 8
            r0.append(r1)
            goto L5
        L76:
            r0.append(r1)
            goto L5
        L7a:
            io.nats.client.support.JsonParseException r0 = new io.nats.client.support.JsonParseException
            java.lang.String r1 = "Unterminated string."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.nats.client.support.JsonParser.nextString():java.lang.String");
    }

    private char[] parseU() throws JsonParseException {
        char[] cArr = new char[4];
        for (int i = 0; i < 4; i++) {
            char nextToken = nextToken();
            cArr[i] = nextToken;
            if (nextToken == 0) {
                throw new JsonParseException("Illegal escape.");
            }
        }
        try {
            return Character.toChars(Integer.parseInt("" + cArr[0] + cArr[1] + cArr[2] + cArr[3], 16));
        } catch (RuntimeException e) {
            throw new JsonParseException("Illegal escape.", e);
        }
    }

    private JsonValue asNumber(String str) throws JsonParseException {
        char charAt = str.charAt(0);
        if ((charAt >= '0' && charAt <= '9') || charAt == '-') {
            if (isDecimalNotation(str)) {
                try {
                    try {
                        BigDecimal bigDecimal = new BigDecimal(str);
                        if (charAt == '-' && BigDecimal.ZERO.compareTo(bigDecimal) == 0) {
                            return new JsonValue(-0.0d);
                        }
                        return new JsonValue(bigDecimal);
                    } catch (NumberFormatException unused) {
                        throw new JsonParseException("val [" + str + "] is not a valid number.");
                    }
                } catch (NumberFormatException unused2) {
                    double parseDouble = Double.parseDouble(str);
                    if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                        throw new JsonParseException("val [" + str + "] is not a valid number.");
                    }
                    return new JsonValue(parseDouble);
                }
            }
            if (charAt == '0' && str.length() > 1) {
                char charAt2 = str.charAt(1);
                if (charAt2 >= '0' && charAt2 <= '9') {
                    throw new JsonParseException("val [" + str + "] is not a valid number.");
                }
            } else if (charAt == '-' && str.length() > 2) {
                char charAt3 = str.charAt(1);
                char charAt4 = str.charAt(2);
                if (charAt3 == '0' && charAt4 >= '0' && charAt4 <= '9') {
                    throw new JsonParseException("val [" + str + "] is not a valid number.");
                }
            }
            BigInteger bigInteger = new BigInteger(str);
            if (bigInteger.bitLength() <= 31) {
                return new JsonValue(bigInteger.intValue());
            }
            if (bigInteger.bitLength() <= 63) {
                return new JsonValue(bigInteger.longValue());
            }
            return new JsonValue(bigInteger);
        }
        throw new JsonParseException("val [" + str + "] is not a valid number.");
    }

    private boolean isDecimalNotation(String str) {
        return str.indexOf(46) > -1 || str.indexOf(101) > -1 || str.indexOf(69) > -1 || "-0".equals(str);
    }
}
