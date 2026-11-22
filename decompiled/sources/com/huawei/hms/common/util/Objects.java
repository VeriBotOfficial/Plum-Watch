package com.huawei.hms.common.util;

import com.huawei.hms.common.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes14.dex */
public final class Objects {

    public static final class ToStringHelper {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f10319a;
        private final Object b;

        private ToStringHelper(Object obj) {
            this.b = Preconditions.checkNotNull(obj);
            this.f10319a = new ArrayList();
        }

        /* synthetic */ ToStringHelper(Object obj, byte b) {
            this(obj);
        }

        public final ToStringHelper add(String str, Object obj) {
            this.f10319a.add(((String) Preconditions.checkNotNull(str)) + "=" + String.valueOf(obj));
            return this;
        }

        public final String toString() {
            StringBuilder append = new StringBuilder(100).append(this.b.getClass().getSimpleName()).append(AbstractJsonLexerKt.BEGIN_OBJ);
            int size = this.f10319a.size();
            for (int i = 0; i < size; i++) {
                append.append(this.f10319a.get(i));
                if (i < size - 1) {
                    append.append(", ");
                }
            }
            return append.append(AbstractJsonLexerKt.END_OBJ).toString();
        }
    }

    private Objects() {
        throw new AssertionError("illegal argument");
    }

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static int hashCode(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj, (byte) 0);
    }
}
