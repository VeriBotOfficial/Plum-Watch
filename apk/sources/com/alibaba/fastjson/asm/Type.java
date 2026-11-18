package com.alibaba.fastjson.asm;

/* JADX INFO: loaded from: classes7.dex */
public class Type {
    private final char[] buf;
    private final int len;
    private final int off;
    protected final int sort;
    public static final Type VOID_TYPE = new Type(0, null, 1443168256, 1);
    public static final Type BOOLEAN_TYPE = new Type(1, null, 1509950721, 1);
    public static final Type CHAR_TYPE = new Type(2, null, 1124075009, 1);
    public static final Type BYTE_TYPE = new Type(3, null, 1107297537, 1);
    public static final Type SHORT_TYPE = new Type(4, null, 1392510721, 1);
    public static final Type INT_TYPE = new Type(5, null, 1224736769, 1);
    public static final Type FLOAT_TYPE = new Type(6, null, 1174536705, 1);
    public static final Type LONG_TYPE = new Type(7, null, 1241579778, 1);
    public static final Type DOUBLE_TYPE = new Type(8, null, 1141048066, 1);

    private Type(int r1, char[] cArr, int r3, int r4) {
        this.sort = r1;
        this.buf = cArr;
        this.off = r3;
        this.len = r4;
    }

    public static Type getType(String str) {
        return getType(str.toCharArray(), 0);
    }

    public static int getArgumentsAndReturnSizes(String str) {
        int r3;
        int r0 = 1;
        int r1 = 1;
        int r2 = 1;
        while (true) {
            r3 = r1 + 1;
            char cCharAt = str.charAt(r1);
            if (cCharAt == ')') {
                break;
            }
            if (cCharAt == 'L') {
                while (true) {
                    r1 = r3 + 1;
                    if (str.charAt(r3) == ';') {
                        break;
                    }
                    r3 = r1;
                }
                r2++;
            } else {
                r2 = (cCharAt == 'D' || cCharAt == 'J') ? r2 + 2 : r2 + 1;
                r1 = r3;
            }
        }
        char cCharAt2 = str.charAt(r3);
        int r4 = r2 << 2;
        if (cCharAt2 == 'V') {
            r0 = 0;
        } else if (cCharAt2 == 'D' || cCharAt2 == 'J') {
            r0 = 2;
        }
        return r4 | r0;
    }

    private static Type getType(char[] cArr, int r6) {
        char c;
        char c2 = cArr[r6];
        if (c2 == 'F') {
            return FLOAT_TYPE;
        }
        if (c2 == 'S') {
            return SHORT_TYPE;
        }
        if (c2 == 'V') {
            return VOID_TYPE;
        }
        if (c2 == 'I') {
            return INT_TYPE;
        }
        if (c2 == 'J') {
            return LONG_TYPE;
        }
        if (c2 == 'Z') {
            return BOOLEAN_TYPE;
        }
        if (c2 != '[') {
            switch (c2) {
                case 'B':
                    return BYTE_TYPE;
                case 'C':
                    return CHAR_TYPE;
                case 'D':
                    return DOUBLE_TYPE;
                default:
                    int r0 = 1;
                    while (cArr[r6 + r0] != ';') {
                        r0++;
                    }
                    return new Type(10, cArr, r6 + 1, r0 - 1);
            }
        }
        int r1 = 1;
        while (true) {
            c = cArr[r6 + r1];
            if (c != '[') {
                break;
            }
            r1++;
        }
        if (c == 'L') {
            do {
                r1++;
            } while (cArr[r6 + r1] != ';');
        }
        return new Type(9, cArr, r6, r1 + 1);
    }

    public String getInternalName() {
        return new String(this.buf, this.off, this.len);
    }

    String getDescriptor() {
        return new String(this.buf, this.off, this.len);
    }

    private int getDimensions() {
        int r0 = 1;
        while (this.buf[this.off + r0] == '[') {
            r0++;
        }
        return r0;
    }

    static Type[] getArgumentTypes(String str) {
        char[] charArray = str.toCharArray();
        int r0 = 1;
        int r2 = 1;
        int r3 = 0;
        while (true) {
            int r4 = r2 + 1;
            char c = charArray[r2];
            if (c == ')') {
                break;
            }
            if (c == 'L') {
                while (true) {
                    r2 = r4 + 1;
                    if (charArray[r4] == ';') {
                        break;
                    }
                    r4 = r2;
                }
                r3++;
            } else {
                if (c != '[') {
                    r3++;
                }
                r2 = r4;
            }
        }
        Type[] typeArr = new Type[r3];
        int r5 = 0;
        while (charArray[r0] != ')') {
            Type type = getType(charArray, r0);
            typeArr[r5] = type;
            r0 += type.len + (type.sort == 10 ? 2 : 0);
            r5++;
        }
        return typeArr;
    }

    protected String getClassName() {
        switch (this.sort) {
            case 0:
                return "void";
            case 1:
                return "boolean";
            case 2:
                return "char";
            case 3:
                return "byte";
            case 4:
                return "short";
            case 5:
                return "int";
            case 6:
                return "float";
            case 7:
                return "long";
            case 8:
                return "double";
            case 9:
                StringBuilder sb = new StringBuilder(getType(this.buf, this.off + getDimensions()).getClassName());
                for (int dimensions = getDimensions(); dimensions > 0; dimensions--) {
                    sb.append("[]");
                }
                return sb.toString();
            default:
                return new String(this.buf, this.off, this.len).replace('/', '.');
        }
    }
}
