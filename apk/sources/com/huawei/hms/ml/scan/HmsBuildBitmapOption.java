package com.huawei.hms.ml.scan;

import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes11.dex */
public class HmsBuildBitmapOption {
    public static final String TYPE_BUILD_BITMAP_BACKCOLOR = "BitmapBackColor";
    public static final String TYPE_BUILD_BITMAP_COLOR = "BitmapColor";
    public static final String TYPE_BUILD_BITMAP_CONTENT = "BitmapContent";
    public static final String TYPE_BUILD_BITMAP_FOTMAT = "BitmapFormat";
    public static final String TYPE_BUILD_BITMAP_HEIGHT = "BitmapHeight";
    public static final String TYPE_BUILD_BITMAP_MARGIN = "BitmapMargin";
    public static final String TYPE_BUILD_BITMAP_WIDTH = "BitmapWidth";
    public final ErrorCorrectionLevel QRErrorCorrection;
    public final int bimapColor;
    public final int bitmapBackgroundColor;
    public final Bitmap logoBitmap;
    public final int margin;

    public static class Creator {
        private Bitmap logobitmap;
        private int margin = 1;
        private int bimapBackgroundColor = -1;
        private int bimapColor = -1;
        private ErrorCorrectionLevel QRErrorCorrection = ErrorCorrectionLevel.L;

        public HmsBuildBitmapOption create() {
            return new HmsBuildBitmapOption(this.margin, this.bimapColor, this.bimapBackgroundColor, this.QRErrorCorrection, this.logobitmap);
        }

        public Creator setBitmapBackgroundColor(int r1) {
            this.bimapBackgroundColor = r1;
            return this;
        }

        public Creator setBitmapColor(int r1) {
            this.bimapColor = r1;
            return this;
        }

        public Creator setBitmapMargin(int r1) {
            this.margin = r1;
            return this;
        }

        public Creator setQRErrorCorrection(ErrorCorrectionLevel errorCorrectionLevel) {
            this.QRErrorCorrection = errorCorrectionLevel;
            return this;
        }

        public Creator setQRLogoBitmap(Bitmap bitmap) {
            this.logobitmap = bitmap;
            return this;
        }
    }

    public enum ErrorCorrectionLevel {
        L(TokenNames.L),
        M("M"),
        Q("Q"),
        H("H");

        public final String value;

        ErrorCorrectionLevel(String str) {
            this.value = str;
        }
    }

    public String toString() {
        return "{margin:" + this.margin + ";bitmapBackgroundColor:" + this.bitmapBackgroundColor + ";bimapColor:" + this.bimapColor + "}";
    }

    private HmsBuildBitmapOption(int r1, int r2, int r3, ErrorCorrectionLevel errorCorrectionLevel, Bitmap bitmap) {
        this.margin = r1;
        this.bitmapBackgroundColor = r3;
        this.bimapColor = r2;
        this.QRErrorCorrection = errorCorrectionLevel;
        this.logoBitmap = bitmap;
    }
}
