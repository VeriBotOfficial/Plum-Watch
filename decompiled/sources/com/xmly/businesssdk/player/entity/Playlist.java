package com.xmly.businesssdk.player.entity;

import com.baidu.mapapi.http.HttpClient;
import com.xmly.businesssdk.utils.Logger;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class Playlist implements Serializable {
    private static final String TAG = "Playlist";
    private static final long serialVersionUID = 1;
    private PlaybackMode mPlaybackMode;
    public ArrayList<Playable> playlist;
    private ArrayList<Integer> mPlayOrder = new ArrayList<>();
    public int selected = -1;

    /* renamed from: com.xmly.businesssdk.player.entity.Playlist$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode;

        static {
            int[] iArr = new int[PlaybackMode.values().length];
            $SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode = iArr;
            try {
                iArr[PlaybackMode.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode[PlaybackMode.SINGLE_REPEAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode[PlaybackMode.REVERSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode[PlaybackMode.LIST_COMPLETE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode[PlaybackMode.SHUFFLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public Playlist(ArrayList<Playable> arrayList, PlaybackMode playbackMode) {
        this.mPlaybackMode = PlaybackMode.NORMAL;
        ArrayList<Playable> arrayList2 = new ArrayList<>();
        this.playlist = arrayList2;
        arrayList2.addAll(arrayList);
        if (playbackMode != null) {
            this.mPlaybackMode = playbackMode;
        } else {
            Logger.w("Playlist constructor playbackMode is null.");
        }
        calculateOrder(true);
    }

    private void calculateOrder(boolean z) {
        int i;
        if (this.mPlayOrder.isEmpty() || z) {
            if (this.mPlayOrder.isEmpty()) {
                i = 0;
            } else {
                i = this.mPlayOrder.get(this.selected).intValue();
                this.mPlayOrder.clear();
            }
            for (int i2 = 0; i2 < size(); i2++) {
                this.mPlayOrder.add(i2, Integer.valueOf(i2));
            }
            if (this.mPlaybackMode == null) {
                this.mPlaybackMode = PlaybackMode.NORMAL;
            }
            int i3 = AnonymousClass1.$SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode[this.mPlaybackMode.ordinal()];
            if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                this.selected = i;
            } else {
                if (i3 != 5) {
                    return;
                }
                Collections.shuffle(this.mPlayOrder);
                this.selected = this.mPlayOrder.indexOf(Integer.valueOf(this.selected));
            }
        }
    }

    private int getIndex() {
        if (isEmpty()) {
            this.selected = -1;
        }
        if (this.selected == -1 && !isEmpty()) {
            this.selected = 0;
        }
        return this.selected;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        if (this.mPlayOrder == null) {
            this.mPlayOrder = new ArrayList<>();
            calculateOrder(true);
        }
    }

    public synchronized void addPlaylistEntry(Playable playable) {
        if (playable != null) {
            this.playlist.add(playable);
            this.mPlayOrder.add(Integer.valueOf(size() - 1));
        }
    }

    public synchronized void addTrack(Playable playable) {
        this.playlist.add(playable);
        this.mPlayOrder.add(Integer.valueOf(size() - 1));
    }

    public synchronized void addTracks(boolean z, List<Playable> list) {
        if (z) {
            int size = list.size() + getIndex();
            this.playlist.addAll(0, list);
            calculateOrder(true);
            this.selected = size;
        } else {
            int size2 = this.playlist.size();
            Iterator<Playable> it = list.iterator();
            while (it.hasNext()) {
                this.playlist.add(it.next());
                this.mPlayOrder.add(Integer.valueOf(size2));
                size2++;
            }
        }
    }

    public List<Playable> getAllTrackList() {
        return this.playlist;
    }

    public Playable[] getAllTracks() {
        Playable[] playableArr = new Playable[this.playlist.size()];
        this.playlist.toArray(playableArr);
        return playableArr;
    }

    public PlaybackMode getPlaylistPlaybackMode() {
        return this.mPlaybackMode;
    }

    public synchronized int getSelectedIndex() {
        int index = getIndex();
        if (index == -1) {
            return index;
        }
        return this.mPlayOrder.get(index).intValue();
    }

    public synchronized Playable getSelectedTrack() {
        int index = getIndex();
        if (index == -1) {
            return null;
        }
        int intValue = this.mPlayOrder.get(index).intValue();
        if (intValue == -1) {
            return null;
        }
        return this.playlist.get(intValue);
    }

    public Playable getTrack(int i) {
        return this.playlist.get(i);
    }

    public boolean isEmpty() {
        return this.playlist.size() == 0;
    }

    public boolean isFirstTrackOnList() {
        return this.selected == 0;
    }

    public boolean isLastTrackOnList() {
        return this.selected == size() - 1;
    }

    public void remove(int i) {
        ArrayList<Playable> arrayList = this.playlist;
        if (arrayList == null || i >= arrayList.size() || i < 0) {
            return;
        }
        int i2 = this.selected;
        if (i2 >= i) {
            this.selected = i2 - 1;
        }
        this.playlist.remove(i);
        this.mPlayOrder.remove(i);
    }

    public synchronized void select(int i) {
        if (!isEmpty()) {
            if (i < 0 || i >= this.playlist.size()) {
                Logger.d(TAG, "Playlist select() " + i + HttpClient.ENDFLAG + this.playlist.size());
            } else {
                this.selected = this.mPlayOrder.indexOf(Integer.valueOf(i));
            }
        }
    }

    public synchronized void selectNext() {
        if (!isEmpty()) {
            int i = this.selected + 1;
            this.selected = i;
            this.selected = i % this.playlist.size();
        }
    }

    public synchronized void selectOrAdd(Playable playable) {
        for (int i = 0; i < this.playlist.size(); i++) {
            if (this.playlist.get(i).getId().equals(playable.getId())) {
                select(i);
                return;
            }
        }
        addTrack(playable);
        select(this.playlist.size() - 1);
    }

    public synchronized void selectPrev() {
        if (!isEmpty()) {
            int i = this.selected - 1;
            this.selected = i;
            if (i < 0) {
                this.selected = this.playlist.size() - 1;
            }
        }
    }

    public synchronized void setPlaylistPlaybackMode(PlaybackMode playbackMode) {
        int i = AnonymousClass1.$SwitchMap$com$xmly$businesssdk$player$entity$PlaybackMode[playbackMode.ordinal()];
        boolean z = true;
        if (i == 1 || i == 2 || i == 3 || i == 4) {
            if (this.mPlaybackMode == PlaybackMode.SHUFFLE) {
                this.mPlaybackMode = playbackMode;
                calculateOrder(z);
            }
            z = false;
            this.mPlaybackMode = playbackMode;
            calculateOrder(z);
        } else {
            if (i == 5) {
                PlaybackMode playbackMode2 = this.mPlaybackMode;
                if (playbackMode2 != PlaybackMode.NORMAL) {
                    if (playbackMode2 != PlaybackMode.SINGLE_REPEAT) {
                        if (playbackMode2 != PlaybackMode.REVERSE) {
                            if (playbackMode2 == PlaybackMode.LIST_COMPLETE) {
                            }
                        }
                    }
                }
                this.mPlaybackMode = playbackMode;
                calculateOrder(z);
            }
            z = false;
            this.mPlaybackMode = playbackMode;
            calculateOrder(z);
        }
    }

    public int size() {
        ArrayList<Playable> arrayList = this.playlist;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }
}
