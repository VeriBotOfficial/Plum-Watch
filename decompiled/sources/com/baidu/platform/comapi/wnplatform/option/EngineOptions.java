package com.baidu.platform.comapi.wnplatform.option;

import android.graphics.Bitmap;
import com.baidu.mapapi.map.MapLanguage;

/* loaded from: classes13.dex */
public class EngineOptions {
    private Bitmap compassCustomBitmap;
    private Bitmap endPointCustomBitmap;
    private Bitmap facilityForbiddenCustomBitmap;
    private Bitmap facilityRetrogradeCustomBitmap;
    private MapLanguage languageType;
    private Bitmap lightAttentionCustomBitmap;
    private Bitmap lightPassCustomBitmap;
    private Bitmap lightWaitCustomBitmap;
    private int routeCustomWidth;
    private Bitmap routeNormalCustomBitmap;
    private Bitmap routePassedCustomBitmap;

    public static class Builder {
        private Bitmap compassCustomBitmap;
        private Bitmap endPointCustomBitmap;
        private Bitmap facilityForbiddenCustomBitmap;
        private Bitmap facilityRetrogradeCustomBitmap;
        private MapLanguage languageType;
        private Bitmap lightAttentionCustomBitmap;
        private Bitmap lightPassCustomBitmap;
        private Bitmap lightWaitCustomBitmap;
        private int routeCustomWidth;
        private Bitmap routeNormalCustomBitmap;
        private Bitmap routePassedCustomBitmap;

        public Builder() {
        }

        public EngineOptions build() {
            return new EngineOptions(this.languageType, this.compassCustomBitmap, this.endPointCustomBitmap, this.routeCustomWidth, this.routeNormalCustomBitmap, this.routePassedCustomBitmap, this.facilityForbiddenCustomBitmap, this.facilityRetrogradeCustomBitmap, this.lightWaitCustomBitmap, this.lightAttentionCustomBitmap, this.lightPassCustomBitmap);
        }

        public Builder setCompassCustomBitmap(Bitmap bitmap) {
            this.compassCustomBitmap = bitmap;
            return this;
        }

        public Builder setEndPointCustomBitmap(Bitmap bitmap) {
            this.endPointCustomBitmap = bitmap;
            return this;
        }

        public Builder setFacilityForbiddenCustomBitmap(Bitmap bitmap) {
            this.facilityForbiddenCustomBitmap = bitmap;
            return this;
        }

        public Builder setFacilityRetrogradeCustomBitmap(Bitmap bitmap) {
            this.facilityRetrogradeCustomBitmap = bitmap;
            return this;
        }

        public Builder setLanguageType(MapLanguage mapLanguage) {
            this.languageType = mapLanguage;
            return this;
        }

        public Builder setLightAttentionCustomBitmap(Bitmap bitmap) {
            this.lightAttentionCustomBitmap = bitmap;
            return this;
        }

        public Builder setLightPassCustomBitmap(Bitmap bitmap) {
            this.lightPassCustomBitmap = bitmap;
            return this;
        }

        public Builder setLightWaitCustomBitmap(Bitmap bitmap) {
            this.lightWaitCustomBitmap = bitmap;
            return this;
        }

        public Builder setRouteCustomWidth(int i) {
            this.routeCustomWidth = i;
            return this;
        }

        public Builder setRouteNormalCustomBitmap(Bitmap bitmap) {
            this.routeNormalCustomBitmap = bitmap;
            return this;
        }

        public Builder setRoutePassedCustomBitmap(Bitmap bitmap) {
            this.routePassedCustomBitmap = bitmap;
            return this;
        }

        public Builder(EngineOptions engineOptions) {
            if (engineOptions != null) {
                this.languageType = engineOptions.languageType;
                this.routeCustomWidth = engineOptions.routeCustomWidth;
                this.compassCustomBitmap = engineOptions.compassCustomBitmap;
                this.endPointCustomBitmap = engineOptions.endPointCustomBitmap;
                this.routeNormalCustomBitmap = engineOptions.routeNormalCustomBitmap;
                this.routePassedCustomBitmap = engineOptions.routePassedCustomBitmap;
                this.facilityForbiddenCustomBitmap = engineOptions.facilityForbiddenCustomBitmap;
                this.facilityRetrogradeCustomBitmap = engineOptions.facilityRetrogradeCustomBitmap;
                this.lightWaitCustomBitmap = engineOptions.lightWaitCustomBitmap;
                this.lightAttentionCustomBitmap = engineOptions.lightAttentionCustomBitmap;
                this.lightPassCustomBitmap = engineOptions.lightPassCustomBitmap;
            }
        }
    }

    public Bitmap getCompassCustomBitmap() {
        return this.compassCustomBitmap;
    }

    public Bitmap getEndPointCustomBitmap() {
        return this.endPointCustomBitmap;
    }

    public Bitmap getFacilityForbiddenCustomBitmap() {
        return this.facilityForbiddenCustomBitmap;
    }

    public Bitmap getFacilityRetrogradeCustomBitmap() {
        return this.facilityRetrogradeCustomBitmap;
    }

    public MapLanguage getLanguageType() {
        return this.languageType;
    }

    public Bitmap getLightAttentionCustomBitmap() {
        return this.lightAttentionCustomBitmap;
    }

    public Bitmap getLightPassCustomBitmap() {
        return this.lightPassCustomBitmap;
    }

    public Bitmap getLightWaitCustomBitmap() {
        return this.lightWaitCustomBitmap;
    }

    public int getRouteCustomWidth() {
        return this.routeCustomWidth;
    }

    public Bitmap getRouteNormalCustomBitmap() {
        return this.routeNormalCustomBitmap;
    }

    public Bitmap getRoutePassedCustomBitmap() {
        return this.routePassedCustomBitmap;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    private EngineOptions() {
    }

    private EngineOptions(MapLanguage mapLanguage, Bitmap bitmap, Bitmap bitmap2, int i, Bitmap bitmap3, Bitmap bitmap4, Bitmap bitmap5, Bitmap bitmap6, Bitmap bitmap7, Bitmap bitmap8, Bitmap bitmap9) {
        this.languageType = mapLanguage;
        this.compassCustomBitmap = bitmap;
        this.endPointCustomBitmap = bitmap2;
        this.routeCustomWidth = i;
        this.routeNormalCustomBitmap = bitmap3;
        this.routePassedCustomBitmap = bitmap4;
        this.facilityForbiddenCustomBitmap = bitmap5;
        this.facilityRetrogradeCustomBitmap = bitmap6;
        this.lightWaitCustomBitmap = bitmap7;
        this.lightAttentionCustomBitmap = bitmap8;
        this.lightPassCustomBitmap = bitmap9;
    }
}
