package io.agora.meta;

import android.view.TextureView;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class EnterSceneConfig {
    public String mRoomName = "";
    public TextureView mSceneView = null;
    public long mSceneId = 0;
    public String mScenePath = "";
    public byte[] mExtraInfo = null;

    public byte[] getExtraInfo() {
        return this.mExtraInfo;
    }

    public String getRoomName() {
        return this.mRoomName;
    }

    public long getSceneId() {
        return this.mSceneId;
    }

    public String getScenePath() {
        return this.mScenePath;
    }

    public TextureView getSceneView() {
        return this.mSceneView;
    }

    public String toString() {
        return "EnterSceneConfig{mRoomName='" + this.mRoomName + "', mSceneView=" + this.mSceneView + ", mSceneId=" + this.mSceneId + ", mScenePath='" + this.mScenePath + "', mExtraCustomInfo=" + Arrays.toString(this.mExtraInfo) + AbstractJsonLexerKt.END_OBJ;
    }
}
