package io.agora.musiccontentcenter;

/* loaded from: classes6.dex */
public interface IMusicContentCenterEventHandler {
    void onLyricResult(String requestId, long songCode, String lyricUrl, int reason);

    void onMusicChartsResult(String requestId, MusicChartInfo[] list, int reason);

    void onMusicCollectionResult(String requestId, int page, int pageSize, int total, Music[] list, int reason);

    void onPreLoadEvent(String requestId, long songCode, int percent, String lyricUrl, int state, int reason);

    void onSongSimpleInfoResult(String requestId, long songCode, String simpleInfo, int reason);
}
