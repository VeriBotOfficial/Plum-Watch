package com.applovin.mediation;

import com.anythink.core.express.b.a;
import com.applovin.impl.mediation.MaxAdViewConfigurationImpl;

/* loaded from: classes12.dex */
public abstract class MaxAdViewConfiguration {

    public enum AdaptiveType {
        NONE("none"),
        ANCHORED("anchored"),
        INLINE(a.k);


        /* renamed from: a, reason: collision with root package name */
        private final String f6630a;

        AdaptiveType(String str) {
            this.f6630a = str;
        }

        @Override // java.lang.Enum
        public String toString() {
            return this.f6630a;
        }
    }

    public interface Builder {
        MaxAdViewConfiguration build();

        Builder setAdaptiveType(AdaptiveType adaptiveType);

        Builder setAdaptiveWidth(int i);

        Builder setInlineMaximumHeight(int i);
    }

    public static Builder builder() {
        return new MaxAdViewConfigurationImpl.BuilderImpl();
    }

    public abstract AdaptiveType getAdaptiveType();

    public abstract int getAdaptiveWidth();

    public abstract int getInlineMaximumHeight();
}
