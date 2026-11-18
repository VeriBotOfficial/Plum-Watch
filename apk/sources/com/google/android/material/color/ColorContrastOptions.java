package com.google.android.material.color;

/* JADX INFO: loaded from: classes3.dex */
public class ColorContrastOptions {
    private final int highContrastThemeOverlayResourceId;
    private final int mediumContrastThemeOverlayResourceId;

    private ColorContrastOptions(Builder builder) {
        this.mediumContrastThemeOverlayResourceId = builder.mediumContrastThemeOverlayResourceId;
        this.highContrastThemeOverlayResourceId = builder.highContrastThemeOverlayResourceId;
    }

    public int getMediumContrastThemeOverlay() {
        return this.mediumContrastThemeOverlayResourceId;
    }

    public int getHighContrastThemeOverlay() {
        return this.highContrastThemeOverlayResourceId;
    }

    public static class Builder {
        private int highContrastThemeOverlayResourceId;
        private int mediumContrastThemeOverlayResourceId;

        public Builder setMediumContrastThemeOverlay(int r1) {
            this.mediumContrastThemeOverlayResourceId = r1;
            return this;
        }

        public Builder setHighContrastThemeOverlay(int r1) {
            this.highContrastThemeOverlayResourceId = r1;
            return this;
        }

        public ColorContrastOptions build() {
            return new ColorContrastOptions(this);
        }
    }
}
