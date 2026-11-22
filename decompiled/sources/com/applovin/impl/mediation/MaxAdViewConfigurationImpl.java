package com.applovin.impl.mediation;

import android.gov.nist.core.Separators;
import com.applovin.impl.sdk.o;
import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: classes12.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f6344a;
    private final int b;
    private final int c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f6345a = MaxAdViewConfiguration.AdaptiveType.NONE;
        private int b = -1;
        private int c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f6345a;
        }

        public int getAdaptiveWidth() {
            return this.b;
        }

        public int getInlineMaximumHeight() {
            return this.c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + Separators.RPAREN);
            this.f6345a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i) {
            o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i + Separators.RPAREN);
            this.b = i;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i) {
            o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i + Separators.RPAREN);
            this.c = i;
            return this;
        }

        public String toString() {
            return "MaxAdViewConfiguration.Builder{adaptiveType=" + this.f6345a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f6344a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.c;
    }

    public String toString() {
        return "MaxAdViewConfiguration{adaptiveType=" + this.f6344a + ", adaptiveWidth=" + this.b + ", inlineMaximumHeight=" + this.c + "}";
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f6344a = builderImpl.f6345a;
        this.b = builderImpl.b;
        this.c = builderImpl.c;
    }
}
