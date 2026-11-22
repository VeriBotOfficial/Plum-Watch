package com.otaliastudios.cameraview.video.encoding;

import com.otaliastudios.cameraview.internal.Pool;

/* loaded from: classes17.dex */
class InputBufferPool extends Pool<InputBuffer> {
    InputBufferPool() {
        super(Integer.MAX_VALUE, new Pool.Factory<InputBuffer>() { // from class: com.otaliastudios.cameraview.video.encoding.InputBufferPool.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.otaliastudios.cameraview.internal.Pool.Factory
            public InputBuffer create() {
                return new InputBuffer();
            }
        });
    }
}
