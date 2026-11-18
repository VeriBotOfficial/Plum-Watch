package com.baidu.platform.comapi.map;

import androidx.camera.video.AudioStats;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes15.dex */
public class MapStatus implements Serializable {
    public float adapterZoomUnits;
    public int animationTime;
    public int animationType;
    public boolean bOverlookSpringback;
    public boolean bfpp;
    public double centerPtX;
    public double centerPtY;
    public double centerPtZ;
    public GeoBound geoRound;
    public int hasAnimation;
    public boolean isBirdEye;
    public float level;
    public int minOverlooking;
    public double overlooking;
    public String panoId;
    public float roadOffsetX;
    public float roadOffsetY;
    public int rotation;
    public int streetExt;
    public float streetIndicateAngle;
    public WinRound winRound;
    public float xOffset;
    public float xScreenOffset;
    public float yOffset;
    public float yScreenOffset;

    public static class GeoBound implements Serializable {
        public long left = 0;
        public long right = 0;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        public long f8601top = 0;
        public long bottom = 0;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof GeoBound)) {
                return false;
            }
            GeoBound geoBound = (GeoBound) obj;
            return this.bottom == geoBound.bottom && this.left == geoBound.left && this.right == geoBound.right && this.f8601top == geoBound.f8601top;
        }

        public int hashCode() {
            long j = this.bottom;
            long j2 = this.left;
            int r0 = (((((int) (j ^ (j >>> 32))) + 31) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.right;
            int r1 = (r0 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f8601top;
            return r1 + ((int) ((j4 >>> 32) ^ j4));
        }
    }

    public static class WinRound implements Serializable {
        public int left = 0;
        public int right = 0;

        /* JADX INFO: renamed from: top, reason: collision with root package name */
        public int f8602top = 0;
        public int bottom = 0;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof WinRound)) {
                return false;
            }
            WinRound winRound = (WinRound) obj;
            return this.bottom == winRound.bottom && this.left == winRound.left && this.right == winRound.right && this.f8602top == winRound.f8602top;
        }

        public int hashCode() {
            return ((((((this.bottom + 31) * 31) + this.left) * 31) + this.right) * 31) + this.f8602top;
        }
    }

    public MapStatus() {
        this.animationType = 0;
        this.level = -1.0f;
        this.rotation = -1;
        this.overlooking = -1.0d;
        this.centerPtX = -1.0d;
        this.centerPtY = -1.0d;
        this.centerPtZ = AudioStats.AUDIO_AMPLITUDE_NONE;
        this.xOffset = 0.0f;
        this.yOffset = 0.0f;
        this.winRound = new WinRound();
        this.geoRound = new GeoBound();
        this.bfpp = false;
        this.panoId = "";
        this.streetIndicateAngle = 0.0f;
        this.isBirdEye = false;
        this.streetExt = 0;
        this.roadOffsetX = 0.0f;
        this.roadOffsetY = 0.0f;
        this.bOverlookSpringback = false;
        this.minOverlooking = -1;
        this.xScreenOffset = 0.0f;
        this.yScreenOffset = 0.0f;
        this.adapterZoomUnits = 0.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof MapStatus)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        MapStatus mapStatus = (MapStatus) obj;
        if (this.centerPtX != mapStatus.centerPtX || this.centerPtY != mapStatus.centerPtY || this.centerPtZ != mapStatus.centerPtZ || this.bfpp != mapStatus.bfpp) {
            return false;
        }
        GeoBound geoBound = this.geoRound;
        if (geoBound == null) {
            if (mapStatus.geoRound != null) {
                return false;
            }
        } else if (!geoBound.equals(mapStatus.geoRound)) {
            return false;
        }
        if (Float.floatToIntBits(this.level) != Float.floatToIntBits(mapStatus.level) || Double.doubleToLongBits(this.overlooking) != Double.doubleToLongBits(mapStatus.overlooking) || this.rotation != mapStatus.rotation || this.yOffset != mapStatus.yOffset || this.xOffset != mapStatus.xOffset || this.xScreenOffset != mapStatus.xScreenOffset || this.yScreenOffset != mapStatus.yScreenOffset || this.adapterZoomUnits != mapStatus.adapterZoomUnits) {
            return false;
        }
        WinRound winRound = this.winRound;
        if (winRound == null) {
            if (mapStatus.winRound != null) {
                return false;
            }
        } else if (!winRound.equals(mapStatus.winRound)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        double d = (((((((this.centerPtX + 31.0d) * 31.0d) + this.centerPtY) * 31.0d) + this.centerPtZ) * 31.0d) + (this.bfpp ? 1.0d : 0.0d)) * 31.0d;
        GeoBound geoBound = this.geoRound;
        double dHashCode = (((((((d + ((double) (geoBound == null ? 0 : geoBound.hashCode()))) * 31.0d) + ((double) Float.floatToIntBits(this.level))) * 31.0d) + this.overlooking) * 31.0d) + ((double) this.rotation)) * 31.0d;
        WinRound winRound = this.winRound;
        return (int) (dHashCode + ((double) (winRound != null ? winRound.hashCode() : 0)));
    }

    public String toString() {
        return "MapStatus{level=" + this.level + ", rotation=" + this.rotation + ", overlooking=" + this.overlooking + ", centerPtX=" + this.centerPtX + ", centerPtY=" + this.centerPtY + ", centerPtZ=" + this.centerPtZ + ", winRound=" + this.winRound + ", geoRound=" + this.geoRound + ", xOffset=" + this.xOffset + ", yOffset=" + this.yOffset + ", bfpp=" + this.bfpp + ", panoId='" + this.panoId + "', streetIndicateAngle=" + this.streetIndicateAngle + ", isBirdEye=" + this.isBirdEye + ", streetExt=" + this.streetExt + ", roadOffsetX=" + this.roadOffsetX + ", roadOffsetY=" + this.roadOffsetY + ", xScreenOffset=" + this.xScreenOffset + ", yScreenOffset=" + this.yScreenOffset + ", adapterZoomUnits=" + this.adapterZoomUnits + AbstractJsonLexerKt.END_OBJ;
    }

    public MapStatus(MapStatus mapStatus) {
        this.animationType = 0;
        this.level = mapStatus.level;
        this.rotation = mapStatus.rotation;
        this.overlooking = mapStatus.overlooking;
        this.centerPtX = mapStatus.centerPtX;
        this.centerPtY = mapStatus.centerPtY;
        this.centerPtZ = mapStatus.centerPtZ;
        this.xOffset = mapStatus.xOffset;
        this.yOffset = mapStatus.yOffset;
        this.winRound = mapStatus.winRound;
        this.geoRound = mapStatus.geoRound;
        this.bfpp = mapStatus.bfpp;
        this.panoId = mapStatus.panoId;
        this.streetIndicateAngle = mapStatus.streetIndicateAngle;
        this.isBirdEye = mapStatus.isBirdEye;
        this.streetExt = mapStatus.streetExt;
        this.roadOffsetX = mapStatus.roadOffsetX;
        this.roadOffsetY = mapStatus.roadOffsetY;
        this.bOverlookSpringback = mapStatus.bOverlookSpringback;
        this.minOverlooking = mapStatus.minOverlooking;
        this.xScreenOffset = mapStatus.xScreenOffset;
        this.yScreenOffset = mapStatus.yScreenOffset;
        this.adapterZoomUnits = mapStatus.adapterZoomUnits;
    }
}
