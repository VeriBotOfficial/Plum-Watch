package com.baidu.ar.face;

import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public interface FaceListener {
    void onFaceResult(Object obj);

    void onStickerLoadingFinished(List<String> list);

    void onTriggerFired(String str);
}
