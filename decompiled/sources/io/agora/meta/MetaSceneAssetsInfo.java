package io.agora.meta;

import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MetaSceneAssetsInfo {
    public MetaBundleInfo[] mBundles;
    public String mDescription;
    public String mExtraInfo;
    public String mParentScenePath;
    public String mSceneConfig;
    public long mSceneId;
    public String mSceneLocalVersion;
    public String mSceneName;
    public String mScenePath;
    public String mSceneVersion;
    public String mThumbnailPath;
    public long mTotalSize;

    public MetaSceneAssetsInfo() {
        this.mSceneId = 0L;
        this.mSceneName = "";
        this.mThumbnailPath = "";
        this.mScenePath = "";
        this.mParentScenePath = "";
        this.mDescription = "";
        this.mSceneConfig = "";
        this.mExtraInfo = "";
        this.mBundles = new MetaBundleInfo[0];
        this.mSceneVersion = "";
        this.mSceneLocalVersion = "";
        this.mTotalSize = 0L;
    }

    public MetaSceneAssetsInfo(long sceneId, String sceneName, String thumbnailPath, String scenePath, String parentScenePath, String description, String sceneConfig, String extraInfo, MetaBundleInfo[] bundles, String sceneVersion, String sceneLocalVersion, long totalSize) {
        this.mSceneId = sceneId;
        this.mSceneName = sceneName;
        this.mThumbnailPath = thumbnailPath;
        this.mScenePath = scenePath;
        this.mParentScenePath = parentScenePath;
        this.mDescription = description;
        this.mSceneConfig = sceneConfig;
        this.mExtraInfo = extraInfo;
        this.mBundles = bundles;
        this.mSceneVersion = sceneVersion;
        this.mSceneLocalVersion = sceneLocalVersion;
        this.mTotalSize = totalSize;
    }

    public MetaBundleInfo[] getBundles() {
        return this.mBundles;
    }

    public String getDescription() {
        return this.mDescription;
    }

    public String getExtraInfo() {
        return this.mExtraInfo;
    }

    public String getParentScenePath() {
        return this.mParentScenePath;
    }

    public String getSceneConfig() {
        return this.mSceneConfig;
    }

    public long getSceneId() {
        return this.mSceneId;
    }

    public String getSceneLocalVersion() {
        return this.mSceneLocalVersion;
    }

    public String getSceneName() {
        return this.mSceneName;
    }

    public String getScenePath() {
        return this.mScenePath;
    }

    public String getSceneVersion() {
        return this.mSceneVersion;
    }

    public String getThumbnailPath() {
        return this.mThumbnailPath;
    }

    public long getTotalSize() {
        return this.mTotalSize;
    }

    public String toString() {
        return "MetaSceneAssetsInfo{mSceneId=" + this.mSceneId + ", mSceneName='" + this.mSceneName + "', mThumbnailPath='" + this.mThumbnailPath + "', mScenePath='" + this.mScenePath + "', mParentScenePath='" + this.mParentScenePath + "', mDescription='" + this.mDescription + "', mSceneConfig='" + this.mSceneConfig + "', mExtraInfo='" + this.mExtraInfo + "', mBundles=" + Arrays.toString(this.mBundles) + ", mSceneVersion='" + this.mSceneVersion + "', mSceneLocalVersion='" + this.mSceneLocalVersion + "', mTotalSize=" + this.mTotalSize + AbstractJsonLexerKt.END_OBJ;
    }
}
