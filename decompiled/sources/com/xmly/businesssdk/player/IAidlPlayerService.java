package com.xmly.businesssdk.player;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.xmly.businesssdk.player.IAIDLInterceptor;
import com.xmly.businesssdk.player.IAidlPlayerListener;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaybackMode;
import com.xmly.businesssdk.player.entity.PlaylistPage;
import com.xmly.businesssdk.player.entity.SleepPlayInfo;
import java.util.List;

/* loaded from: classes3.dex */
public interface IAidlPlayerService extends IInterface {

    public static class Default implements IAidlPlayerService {
        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void addMediaSource(SleepPlayInfo sleepPlayInfo) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void addPlaylist(boolean z, List<Playable> list) throws RemoteException {
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public int getAudioSessionId() throws RemoteException {
            return 0;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public String getCurrentAlbumTag() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public int getCurrentPlayDuration() throws RemoteException {
            return 0;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public int getCurrentPlayProgress() throws RemoteException {
            return 0;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public Playable getCurrentPlayable() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public PlaylistPage getCurrentPlaylistPage() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public int getCurrentPosition() throws RemoteException {
            return 0;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public byte getCurrentType() throws RemoteException {
            return (byte) 0;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public Playable getNextPlayable() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public PlaybackMode getPlaybackMode() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public List<Playable> getPlaylist() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public int getPlaylistSize() throws RemoteException {
            return 0;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public Playable getPrePlayable() throws RemoteException {
            return null;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public float getSpeed() throws RemoteException {
            return 0.0f;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public float getVolume() throws RemoteException {
            return 0.0f;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public float getVolumeWithIndex(int i) throws RemoteException {
            return 0.0f;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public boolean isDeviceMuted() throws RemoteException {
            return false;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public boolean isPlayDuration() throws RemoteException {
            return false;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public boolean isPlaying() throws RemoteException {
            return false;
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void next() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void pause() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void play() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void prev() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void releasePlayer() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void removeAllMediaSource() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void removeMediaSource(int i) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void seekTo(int i) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setDeviceMuted(boolean z) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setIInterceptor(IAIDLInterceptor iAIDLInterceptor) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setListener(IAidlPlayerListener iAidlPlayerListener) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setPlaybackMode(PlaybackMode playbackMode) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setPlaylist(List<Playable> list, PlaylistPage playlistPage, String str, byte b) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setPlaylistOnly(List<Playable> list) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setSpeed(float f) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setSpeedWithSetting(float f, boolean z) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setVolume(float f, float f2) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void setVolumeWithIndex(int i, float f, float f2) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void skipTo(int i, boolean z) throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public void stop() throws RemoteException {
        }

        @Override // com.xmly.businesssdk.player.IAidlPlayerService
        public boolean toggle() throws RemoteException {
            return false;
        }
    }

    public static abstract class Stub extends Binder implements IAidlPlayerService {
        private static final String DESCRIPTOR = "com.xmly.businesssdk.player.IAidlPlayerService";
        public static final int TRANSACTION_addMediaSource = 36;
        public static final int TRANSACTION_addPlaylist = 4;
        public static final int TRANSACTION_getAudioSessionId = 1;
        public static final int TRANSACTION_getCurrentAlbumTag = 33;
        public static final int TRANSACTION_getCurrentPlayDuration = 31;
        public static final int TRANSACTION_getCurrentPlayProgress = 30;
        public static final int TRANSACTION_getCurrentPlayable = 25;
        public static final int TRANSACTION_getCurrentPlaylistPage = 34;
        public static final int TRANSACTION_getCurrentPosition = 29;
        public static final int TRANSACTION_getCurrentType = 32;
        public static final int TRANSACTION_getNextPlayable = 26;
        public static final int TRANSACTION_getPlaybackMode = 24;
        public static final int TRANSACTION_getPlaylist = 5;
        public static final int TRANSACTION_getPlaylistSize = 28;
        public static final int TRANSACTION_getPrePlayable = 27;
        public static final int TRANSACTION_getSpeed = 20;
        public static final int TRANSACTION_getVolume = 21;
        public static final int TRANSACTION_getVolumeWithIndex = 40;
        public static final int TRANSACTION_isDeviceMuted = 41;
        public static final int TRANSACTION_isPlayDuration = 8;
        public static final int TRANSACTION_isPlaying = 7;
        public static final int TRANSACTION_next = 13;
        public static final int TRANSACTION_pause = 11;
        public static final int TRANSACTION_play = 6;
        public static final int TRANSACTION_prev = 14;
        public static final int TRANSACTION_releasePlayer = 10;
        public static final int TRANSACTION_removeAllMediaSource = 38;
        public static final int TRANSACTION_removeMediaSource = 37;
        public static final int TRANSACTION_seekTo = 15;
        public static final int TRANSACTION_setDeviceMuted = 42;
        public static final int TRANSACTION_setIInterceptor = 35;
        public static final int TRANSACTION_setListener = 22;
        public static final int TRANSACTION_setPlaybackMode = 23;
        public static final int TRANSACTION_setPlaylist = 2;
        public static final int TRANSACTION_setPlaylistOnly = 3;
        public static final int TRANSACTION_setSpeed = 18;
        public static final int TRANSACTION_setSpeedWithSetting = 19;
        public static final int TRANSACTION_setVolume = 17;
        public static final int TRANSACTION_setVolumeWithIndex = 39;
        public static final int TRANSACTION_skipTo = 16;
        public static final int TRANSACTION_stop = 9;
        public static final int TRANSACTION_toggle = 12;

        public static class Proxy implements IAidlPlayerService {
            public static IAidlPlayerService sDefaultImpl;
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void addMediaSource(SleepPlayInfo sleepPlayInfo) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (sleepPlayInfo != null) {
                        obtain.writeInt(1);
                        sleepPlayInfo.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(36, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().addMediaSource(sleepPlayInfo);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void addPlaylist(boolean z, List<Playable> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(4, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().addPlaylist(z, list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public int getAudioSessionId() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(1, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getAudioSessionId();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public String getCurrentAlbumTag() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(33, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentAlbumTag();
                    }
                    obtain2.readException();
                    return obtain2.readString();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public int getCurrentPlayDuration() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(31, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentPlayDuration();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public int getCurrentPlayProgress() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(30, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentPlayProgress();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public Playable getCurrentPlayable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(25, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentPlayable();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Playable.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public PlaylistPage getCurrentPlaylistPage() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(34, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentPlaylistPage();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaylistPage.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public int getCurrentPosition() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(29, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentPosition();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public byte getCurrentType() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(32, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getCurrentType();
                    }
                    obtain2.readException();
                    return obtain2.readByte();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public Playable getNextPlayable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(26, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getNextPlayable();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Playable.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public PlaybackMode getPlaybackMode() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(24, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlaybackMode();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? PlaybackMode.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public List<Playable> getPlaylist() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(5, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlaylist();
                    }
                    obtain2.readException();
                    return obtain2.createTypedArrayList(Playable.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public int getPlaylistSize() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(28, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPlaylistSize();
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public Playable getPrePlayable() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(27, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getPrePlayable();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? Playable.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public float getSpeed() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(20, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getSpeed();
                    }
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public float getVolume() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(21, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVolume();
                    }
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public float getVolumeWithIndex(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (!this.mRemote.transact(40, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().getVolumeWithIndex(i);
                    }
                    obtain2.readException();
                    return obtain2.readFloat();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public boolean isDeviceMuted() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(41, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isDeviceMuted();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public boolean isPlayDuration() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(8, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isPlayDuration();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public boolean isPlaying() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(7, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().isPlaying();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void next() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(13, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().next();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void pause() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(11, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().pause();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void play() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(6, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().play();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void prev() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(14, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().prev();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void releasePlayer() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(10, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().releasePlayer();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void removeAllMediaSource() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(38, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().removeAllMediaSource();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void removeMediaSource(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(37, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().removeMediaSource(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void seekTo(int i) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    if (this.mRemote.transact(15, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().seekTo(i);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setDeviceMuted(boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(42, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setDeviceMuted(z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setIInterceptor(IAIDLInterceptor iAIDLInterceptor) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iAIDLInterceptor != null ? iAIDLInterceptor.asBinder() : null);
                    if (this.mRemote.transact(35, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setIInterceptor(iAIDLInterceptor);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setListener(IAidlPlayerListener iAidlPlayerListener) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeStrongBinder(iAidlPlayerListener != null ? iAidlPlayerListener.asBinder() : null);
                    if (this.mRemote.transact(22, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setListener(iAidlPlayerListener);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setPlaybackMode(PlaybackMode playbackMode) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (playbackMode != null) {
                        obtain.writeInt(1);
                        playbackMode.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (this.mRemote.transact(23, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPlaybackMode(playbackMode);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setPlaylist(List<Playable> list, PlaylistPage playlistPage, String str, byte b) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (playlistPage != null) {
                        obtain.writeInt(1);
                        playlistPage.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeString(str);
                    obtain.writeByte(b);
                    if (this.mRemote.transact(2, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPlaylist(list, playlistPage, str, b);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setPlaylistOnly(List<Playable> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeTypedList(list);
                    if (this.mRemote.transact(3, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setPlaylistOnly(list);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setSpeed(float f) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    if (this.mRemote.transact(18, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setSpeed(f);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setSpeedWithSetting(float f, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(19, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setSpeedWithSetting(f, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setVolume(float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    if (this.mRemote.transact(17, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setVolume(f, f2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void setVolumeWithIndex(int i, float f, float f2) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeFloat(f);
                    obtain.writeFloat(f2);
                    if (this.mRemote.transact(39, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().setVolumeWithIndex(i, f, f2);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void skipTo(int i, boolean z) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    obtain.writeInt(i);
                    obtain.writeInt(z ? 1 : 0);
                    if (this.mRemote.transact(16, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().skipTo(i, z);
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public void stop() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (this.mRemote.transact(9, obtain, obtain2, 0) || Stub.getDefaultImpl() == null) {
                        obtain2.readException();
                    } else {
                        Stub.getDefaultImpl().stop();
                    }
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            @Override // com.xmly.businesssdk.player.IAidlPlayerService
            public boolean toggle() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    if (!this.mRemote.transact(12, obtain, obtain2, 0) && Stub.getDefaultImpl() != null) {
                        return Stub.getDefaultImpl().toggle();
                    }
                    obtain2.readException();
                    return obtain2.readInt() != 0;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IAidlPlayerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IAidlPlayerService)) ? new Proxy(iBinder) : (IAidlPlayerService) queryLocalInterface;
        }

        public static IAidlPlayerService getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IAidlPlayerService iAidlPlayerService) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iAidlPlayerService == null) {
                return false;
            }
            Proxy.sDefaultImpl = iAidlPlayerService;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    int audioSessionId = getAudioSessionId();
                    parcel2.writeNoException();
                    parcel2.writeInt(audioSessionId);
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlaylist(parcel.createTypedArrayList(Playable.CREATOR), parcel.readInt() != 0 ? PlaylistPage.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readByte());
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlaylistOnly(parcel.createTypedArrayList(Playable.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    addPlaylist(parcel.readInt() != 0, parcel.createTypedArrayList(Playable.CREATOR));
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    List<Playable> playlist = getPlaylist();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(playlist);
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    play();
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isPlaying = isPlaying();
                    parcel2.writeNoException();
                    parcel2.writeInt(isPlaying ? 1 : 0);
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isPlayDuration = isPlayDuration();
                    parcel2.writeNoException();
                    parcel2.writeInt(isPlayDuration ? 1 : 0);
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    stop();
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    releasePlayer();
                    parcel2.writeNoException();
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    pause();
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean z = toggle();
                    parcel2.writeNoException();
                    parcel2.writeInt(z ? 1 : 0);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    next();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    prev();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    seekTo(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    skipTo(parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolume(parcel.readFloat(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    setSpeed(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    setSpeedWithSetting(parcel.readFloat(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    float speed = getSpeed();
                    parcel2.writeNoException();
                    parcel2.writeFloat(speed);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    float volume = getVolume();
                    parcel2.writeNoException();
                    parcel2.writeFloat(volume);
                    return true;
                case 22:
                    parcel.enforceInterface(DESCRIPTOR);
                    setListener(IAidlPlayerListener.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(DESCRIPTOR);
                    setPlaybackMode(parcel.readInt() != 0 ? PlaybackMode.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(DESCRIPTOR);
                    PlaybackMode playbackMode = getPlaybackMode();
                    parcel2.writeNoException();
                    if (playbackMode != null) {
                        parcel2.writeInt(1);
                        playbackMode.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 25:
                    parcel.enforceInterface(DESCRIPTOR);
                    Playable currentPlayable = getCurrentPlayable();
                    parcel2.writeNoException();
                    if (currentPlayable != null) {
                        parcel2.writeInt(1);
                        currentPlayable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 26:
                    parcel.enforceInterface(DESCRIPTOR);
                    Playable nextPlayable = getNextPlayable();
                    parcel2.writeNoException();
                    if (nextPlayable != null) {
                        parcel2.writeInt(1);
                        nextPlayable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 27:
                    parcel.enforceInterface(DESCRIPTOR);
                    Playable prePlayable = getPrePlayable();
                    parcel2.writeNoException();
                    if (prePlayable != null) {
                        parcel2.writeInt(1);
                        prePlayable.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface(DESCRIPTOR);
                    int playlistSize = getPlaylistSize();
                    parcel2.writeNoException();
                    parcel2.writeInt(playlistSize);
                    return true;
                case 29:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currentPosition = getCurrentPosition();
                    parcel2.writeNoException();
                    parcel2.writeInt(currentPosition);
                    return true;
                case 30:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currentPlayProgress = getCurrentPlayProgress();
                    parcel2.writeNoException();
                    parcel2.writeInt(currentPlayProgress);
                    return true;
                case 31:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currentPlayDuration = getCurrentPlayDuration();
                    parcel2.writeNoException();
                    parcel2.writeInt(currentPlayDuration);
                    return true;
                case 32:
                    parcel.enforceInterface(DESCRIPTOR);
                    byte currentType = getCurrentType();
                    parcel2.writeNoException();
                    parcel2.writeByte(currentType);
                    return true;
                case 33:
                    parcel.enforceInterface(DESCRIPTOR);
                    String currentAlbumTag = getCurrentAlbumTag();
                    parcel2.writeNoException();
                    parcel2.writeString(currentAlbumTag);
                    return true;
                case 34:
                    parcel.enforceInterface(DESCRIPTOR);
                    PlaylistPage currentPlaylistPage = getCurrentPlaylistPage();
                    parcel2.writeNoException();
                    if (currentPlaylistPage != null) {
                        parcel2.writeInt(1);
                        currentPlaylistPage.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 35:
                    parcel.enforceInterface(DESCRIPTOR);
                    setIInterceptor(IAIDLInterceptor.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(DESCRIPTOR);
                    addMediaSource(parcel.readInt() != 0 ? SleepPlayInfo.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeMediaSource(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 38:
                    parcel.enforceInterface(DESCRIPTOR);
                    removeAllMediaSource();
                    parcel2.writeNoException();
                    return true;
                case 39:
                    parcel.enforceInterface(DESCRIPTOR);
                    setVolumeWithIndex(parcel.readInt(), parcel.readFloat(), parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(DESCRIPTOR);
                    float volumeWithIndex = getVolumeWithIndex(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeFloat(volumeWithIndex);
                    return true;
                case 41:
                    parcel.enforceInterface(DESCRIPTOR);
                    boolean isDeviceMuted = isDeviceMuted();
                    parcel2.writeNoException();
                    parcel2.writeInt(isDeviceMuted ? 1 : 0);
                    return true;
                case 42:
                    parcel.enforceInterface(DESCRIPTOR);
                    setDeviceMuted(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    void addMediaSource(SleepPlayInfo sleepPlayInfo) throws RemoteException;

    void addPlaylist(boolean z, List<Playable> list) throws RemoteException;

    int getAudioSessionId() throws RemoteException;

    String getCurrentAlbumTag() throws RemoteException;

    int getCurrentPlayDuration() throws RemoteException;

    int getCurrentPlayProgress() throws RemoteException;

    Playable getCurrentPlayable() throws RemoteException;

    PlaylistPage getCurrentPlaylistPage() throws RemoteException;

    int getCurrentPosition() throws RemoteException;

    byte getCurrentType() throws RemoteException;

    Playable getNextPlayable() throws RemoteException;

    PlaybackMode getPlaybackMode() throws RemoteException;

    List<Playable> getPlaylist() throws RemoteException;

    int getPlaylistSize() throws RemoteException;

    Playable getPrePlayable() throws RemoteException;

    float getSpeed() throws RemoteException;

    float getVolume() throws RemoteException;

    float getVolumeWithIndex(int i) throws RemoteException;

    boolean isDeviceMuted() throws RemoteException;

    boolean isPlayDuration() throws RemoteException;

    boolean isPlaying() throws RemoteException;

    void next() throws RemoteException;

    void pause() throws RemoteException;

    void play() throws RemoteException;

    void prev() throws RemoteException;

    void releasePlayer() throws RemoteException;

    void removeAllMediaSource() throws RemoteException;

    void removeMediaSource(int i) throws RemoteException;

    void seekTo(int i) throws RemoteException;

    void setDeviceMuted(boolean z) throws RemoteException;

    void setIInterceptor(IAIDLInterceptor iAIDLInterceptor) throws RemoteException;

    void setListener(IAidlPlayerListener iAidlPlayerListener) throws RemoteException;

    void setPlaybackMode(PlaybackMode playbackMode) throws RemoteException;

    void setPlaylist(List<Playable> list, PlaylistPage playlistPage, String str, byte b) throws RemoteException;

    void setPlaylistOnly(List<Playable> list) throws RemoteException;

    void setSpeed(float f) throws RemoteException;

    void setSpeedWithSetting(float f, boolean z) throws RemoteException;

    void setVolume(float f, float f2) throws RemoteException;

    void setVolumeWithIndex(int i, float f, float f2) throws RemoteException;

    void skipTo(int i, boolean z) throws RemoteException;

    void stop() throws RemoteException;

    boolean toggle() throws RemoteException;
}
