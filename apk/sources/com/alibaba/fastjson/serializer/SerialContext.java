package com.alibaba.fastjson.serializer;

import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class SerialContext {
    public final int features;
    public final Object fieldName;
    public final Object object;
    public final SerialContext parent;

    public SerialContext(SerialContext serialContext, Object obj, Object obj2, int r4, int r5) {
        this.parent = serialContext;
        this.object = obj;
        this.fieldName = obj2;
        this.features = r4;
    }

    public String toString() {
        if (this.parent == null) {
            return "$";
        }
        StringBuilder sb = new StringBuilder();
        toString(sb);
        return sb.toString();
    }

    protected void toString(StringBuilder sb) {
        SerialContext serialContext = this.parent;
        if (serialContext == null) {
            sb.append(Typography.dollar);
            return;
        }
        serialContext.toString(sb);
        Object obj = this.fieldName;
        if (obj == null) {
            sb.append(".null");
            return;
        }
        if (obj instanceof Integer) {
            sb.append(AbstractJsonLexerKt.BEGIN_LIST);
            sb.append(((Integer) this.fieldName).intValue());
            sb.append(AbstractJsonLexerKt.END_LIST);
            return;
        }
        sb.append('.');
        String string = this.fieldName.toString();
        for (int r2 = 0; r2 < string.length(); r2++) {
            char cCharAt = string.charAt(r2);
            if ((cCharAt < '0' || cCharAt > '9') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt < 'a' || cCharAt > 'z') && cCharAt <= 128))) {
                for (int r1 = 0; r1 < string.length(); r1++) {
                    char cCharAt2 = string.charAt(r1);
                    if (cCharAt2 == '\\') {
                        sb.append(AbstractJsonLexerKt.STRING_ESC);
                        sb.append(AbstractJsonLexerKt.STRING_ESC);
                        sb.append(AbstractJsonLexerKt.STRING_ESC);
                    } else {
                        if ((cCharAt2 >= '0' && cCharAt2 <= '9') || ((cCharAt2 >= 'A' && cCharAt2 <= 'Z') || ((cCharAt2 >= 'a' && cCharAt2 <= 'z') || cCharAt2 > 128))) {
                            sb.append(cCharAt2);
                        } else if (cCharAt2 == '\"') {
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                        } else {
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                            sb.append(AbstractJsonLexerKt.STRING_ESC);
                        }
                    }
                    sb.append(cCharAt2);
                }
                return;
            }
        }
        sb.append(string);
    }

    public SerialContext getParent() {
        return this.parent;
    }

    public Object getObject() {
        return this.object;
    }

    public Object getFieldName() {
        return this.fieldName;
    }

    public String getPath() {
        return toString();
    }
}
