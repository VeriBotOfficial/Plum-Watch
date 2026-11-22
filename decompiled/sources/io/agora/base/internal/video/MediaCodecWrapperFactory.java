package io.agora.base.internal.video;

import java.io.IOException;

/* loaded from: classes6.dex */
interface MediaCodecWrapperFactory {
    MediaCodecWrapper createByCodecName(String str) throws IOException;
}
