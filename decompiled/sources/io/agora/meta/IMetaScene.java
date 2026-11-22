package io.agora.meta;

import android.view.TextureView;
import io.agora.base.VideoFrame;
import io.agora.rtc2.video.AgoraVideoFrame;

/* loaded from: classes6.dex */
public abstract class IMetaScene {
    public abstract int addEventHandler(IMetaSceneEventHandler eventHandler);

    public abstract int addSceneView(TextureView view, SceneDisplayConfig config);

    public abstract int enableFaceCapture(boolean enable);

    public abstract int enableSceneVideoCapture(TextureView view, boolean enable);

    public abstract int enableVideoDisplay(String displayId, boolean enable);

    public abstract int enterScene(EnterSceneConfig config);

    public abstract ILocalUserAvatar getLocalUserAvatar();

    public abstract int leaveScene();

    public abstract int pushVideoFrameToDisplay(String displayId, VideoFrame frame);

    public abstract int pushVideoFrameToDisplay(String displayId, AgoraVideoFrame frame);

    public abstract int release();

    public abstract int removeEventHandler(IMetaSceneEventHandler eventHandler);

    public abstract int removeSceneView(TextureView view);

    public abstract int sendSceneMessage(byte[] message);

    public abstract int setSceneParameters(String jsonParam);
}
