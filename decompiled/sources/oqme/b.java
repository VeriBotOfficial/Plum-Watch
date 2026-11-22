package oqme;

import com.qumeng.overseas.advlib.__remote__.framework.videoplayer.MediaStateChangeListener;

/* loaded from: classes8.dex */
public interface b {
    @Deprecated
    void addMediaStateChangeListener(MediaStateChangeListener mediaStateChangeListener);

    boolean isPlaying();

    void pause();

    void play();

    void recycle();

    @Deprecated
    void removeMediaStateChangeListener(MediaStateChangeListener mediaStateChangeListener);

    void reset();

    @Deprecated
    void resume();

    void stop();
}
