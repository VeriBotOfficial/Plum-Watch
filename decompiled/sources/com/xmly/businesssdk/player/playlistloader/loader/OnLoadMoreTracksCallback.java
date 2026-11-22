package com.xmly.businesssdk.player.playlistloader.loader;

import java.util.List;

/* loaded from: classes3.dex */
public interface OnLoadMoreTracksCallback<T> {
    void onLoadMoreFailure();

    void onLoadMoreSuccess(List<T> list);
}
