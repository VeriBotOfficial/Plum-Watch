package io.agora.meta;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MetaBundleInfo {
    public String mAssets;
    public String mBundleCode;
    public long mBundleId;
    public String mBundleName;
    public String mBundlePath;
    public long mBundleSize;
    public int mBundleType;
    public String mDescription;
    public String mExtraInfo;
    public long mSceneId;
    public String mThumbnailPath;

    public static class BundleType {
        public static final int BUNDLE_TYPE_ASSET_MANIFEST = 3;
        public static final int BUNDLE_TYPE_AVATAR = 2;
        public static final int BUNDLE_TYPE_OTHER = 3;
        public static final int BUNDLE_TYPE_SCENE = 1;

        private BundleType() {
        }
    }

    public MetaBundleInfo() {
        this.mBundleId = 0L;
        this.mSceneId = 0L;
        this.mBundleType = 1;
        this.mBundleCode = "";
        this.mBundleName = "";
        this.mDescription = "";
        this.mBundlePath = "";
        this.mThumbnailPath = "";
        this.mAssets = "";
        this.mExtraInfo = "";
        this.mBundleSize = 0L;
    }

    public MetaBundleInfo(long bundleId, long sceneId, int bundleType, String bundleCode, String bundleName, String descript, String bundlePath, String thumbnailPath, String assets, String extraInfo, long bundleSize) {
        this.mBundleId = bundleId;
        this.mSceneId = sceneId;
        this.mBundleType = bundleType;
        this.mBundleCode = bundleCode;
        this.mBundleName = bundleName;
        this.mDescription = descript;
        this.mBundlePath = bundlePath;
        this.mThumbnailPath = thumbnailPath;
        this.mAssets = assets;
        this.mExtraInfo = extraInfo;
        this.mBundleSize = bundleSize;
    }

    public String getAssets() {
        return this.mAssets;
    }

    public String getBundleCode() {
        return this.mBundleCode;
    }

    public long getBundleId() {
        return this.mBundleId;
    }

    public String getBundleName() {
        return this.mBundleName;
    }

    public String getBundlePath() {
        return this.mBundlePath;
    }

    public long getBundleSize() {
        return this.mBundleSize;
    }

    public int getBundleType() {
        return this.mBundleType;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getExtraInfo() {
        return this.mExtraInfo;
    }

    public long getSceneId() {
        return this.mSceneId;
    }

    public String getThumbnailPath() {
        return this.mThumbnailPath;
    }

    public String toString() {
        return "MetaBundleInfo{mBundleId=" + this.mBundleId + ", mSceneId=" + this.mSceneId + ", mBundleType=" + this.mBundleType + ", mBundleCode='" + this.mBundleCode + "', mBundleName='" + this.mBundleName + "', mDescription='" + this.mDescription + "', mBundlePath='" + this.mBundlePath + "', mThumbnailPath='" + this.mThumbnailPath + "', mAssets='" + this.mAssets + "', mExtraInfo='" + this.mExtraInfo + "', mBundleSize=" + this.mBundleSize + AbstractJsonLexerKt.END_OBJ;
    }
}
