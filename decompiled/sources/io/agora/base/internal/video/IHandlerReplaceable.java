package io.agora.base.internal.video;

import android.os.Handler;
import io.agora.base.VideoFrame;

/* loaded from: classes6.dex */
public interface IHandlerReplaceable {
    VideoFrame.Buffer applyNewI420Handler(Handler handler, YuvConverter yuvConverter);

    Handler getToI420Handler();

    YuvConverter getYuvConverter();
}
