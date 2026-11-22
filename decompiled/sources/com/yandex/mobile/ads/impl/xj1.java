package com.yandex.mobile.ads.impl;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class xj1 {
    public static <T> wj1<T> a(wj1<? super T> wj1Var, wj1<? super T> wj1Var2) {
        wj1Var.getClass();
        wj1Var2.getClass();
        return new a(Arrays.asList(wj1Var, wj1Var2));
    }

    private static class a<T> implements wj1<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final List<? extends wj1<? super T>> b;

        private a(List<? extends wj1<? super T>> list) {
            this.b = list;
        }

        @Override // com.yandex.mobile.ads.impl.wj1
        public final boolean apply(T t) {
            for (int i = 0; i < this.b.size(); i++) {
                if (!this.b.get(i).apply(t)) {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode() {
            return this.b.hashCode() + 306654252;
        }

        public final boolean equals(@CheckForNull Object obj) {
            if (obj instanceof a) {
                return this.b.equals(((a) obj).b);
            }
            return false;
        }

        public final String toString() {
            List<? extends wj1<? super T>> list = this.b;
            StringBuilder sb = new StringBuilder("Predicates.and(");
            boolean z = true;
            for (T t : list) {
                if (!z) {
                    sb.append(AbstractJsonLexerKt.COMMA);
                }
                sb.append(t);
                z = false;
            }
            return sb.append(')').toString();
        }
    }
}
