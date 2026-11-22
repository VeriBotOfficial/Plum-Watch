package io.agora.meta;

import android.view.TextureView;
import io.agora.base.VideoFrame;

/* loaded from: classes6.dex */
public interface IMetaSceneEventHandler {
    void onAddSceneViewResult(TextureView view, int errorCode);

    void onEnterSceneResult(int errorCode);

    void onLeaveSceneResult(int errorCode);

    void onReleasedScene(int status);

    void onRemoveSceneViewResult(TextureView view, int errorCode);

    void onSceneMessageReceived(byte[] message);

    void onSceneVideoFrameCaptured(TextureView view, VideoFrame videoFrame);

    void onUserPositionChanged(String uid, MetaUserPositionInfo posInfo);
}
