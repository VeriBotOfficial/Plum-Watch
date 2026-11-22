package io.agora.musiccontentcenter;

import io.agora.mediaplayer.IMediaPlayer;

/* loaded from: classes6.dex */
public interface IAgoraMusicPlayer extends IMediaPlayer {

    public enum MusicPlayMode {
        MUSIC_PLAY_MODE_ORIGINAL(0),
        MUSIC_PLAY_MODE_ACCOMPANY(1),
        MUSIC_PLAY_MODE_LEAD_SING(2);

        private final int value;

        MusicPlayMode(int value) {
            this.value = value;
        }

        public static MusicPlayMode valueOf(int value) {
            if (value == 0) {
                return MUSIC_PLAY_MODE_ORIGINAL;
            }
            if (value == 1) {
                return MUSIC_PLAY_MODE_ACCOMPANY;
            }
            if (value != 2) {
                return null;
            }
            return MUSIC_PLAY_MODE_LEAD_SING;
        }

        public int getValue() {
            return this.value;
        }
    }

    @Override // io.agora.mediaplayer.IMediaPlayer
    @Deprecated
    int destroy();

    @Override // io.agora.mediaplayer.IMediaPlayer
    String getPlaySrc();

    int open(long songCode, long startPos);

    @Override // io.agora.mediaplayer.IMediaPlayer
    int open(String url, long startPos);

    int setPlayMode(MusicPlayMode mode);

    @Override // io.agora.mediaplayer.IMediaPlayer
    int stop();
}
