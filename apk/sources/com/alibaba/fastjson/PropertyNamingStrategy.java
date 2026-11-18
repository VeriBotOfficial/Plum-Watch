package com.alibaba.fastjson;

/* JADX INFO: loaded from: classes7.dex */
public enum PropertyNamingStrategy {
    CamelCase,
    PascalCase,
    SnakeCase,
    KebabCase,
    NoChange,
    NeverUseThisValueExceptDefaultValue;

    /* JADX INFO: renamed from: com.alibaba.fastjson.PropertyNamingStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy;

        static {
            int[] r0 = new int[PropertyNamingStrategy.values().length];
            $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy = r0;
            try {
                r0[PropertyNamingStrategy.SnakeCase.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.KebabCase.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.PascalCase.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.CamelCase.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.NoChange.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[PropertyNamingStrategy.NeverUseThisValueExceptDefaultValue.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public String translate(String str) {
        char cCharAt;
        int r0 = AnonymousClass1.$SwitchMap$com$alibaba$fastjson$PropertyNamingStrategy[ordinal()];
        int r4 = 0;
        if (r0 == 1) {
            StringBuilder sb = new StringBuilder();
            while (r4 < str.length()) {
                char cCharAt2 = str.charAt(r4);
                if (cCharAt2 >= 'A' && cCharAt2 <= 'Z') {
                    char c = (char) (cCharAt2 + ' ');
                    if (r4 > 0) {
                        sb.append('_');
                    }
                    sb.append(c);
                } else {
                    sb.append(cCharAt2);
                }
                r4++;
            }
            return sb.toString();
        }
        if (r0 == 2) {
            StringBuilder sb2 = new StringBuilder();
            while (r4 < str.length()) {
                char cCharAt3 = str.charAt(r4);
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z') {
                    char c2 = (char) (cCharAt3 + ' ');
                    if (r4 > 0) {
                        sb2.append('-');
                    }
                    sb2.append(c2);
                } else {
                    sb2.append(cCharAt3);
                }
                r4++;
            }
            return sb2.toString();
        }
        if (r0 != 3) {
            if (r0 != 4 || (cCharAt = str.charAt(0)) < 'A' || cCharAt > 'Z') {
                return str;
            }
            char[] charArray = str.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            return new String(charArray);
        }
        char cCharAt4 = str.charAt(0);
        if (cCharAt4 < 'a' || cCharAt4 > 'z') {
            return str;
        }
        char[] charArray2 = str.toCharArray();
        charArray2[0] = (char) (charArray2[0] - ' ');
        return new String(charArray2);
    }
}
