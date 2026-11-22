package com.xmly.businesssdk.player.entity;

import java.io.Serializable;

/* loaded from: classes3.dex */
public class PlayerExtra implements Serializable {
    public static final String TAG_SPLIT = "___";
    public static final byte TYPE_ALBUM = 1;
    public static final byte TYPE_NULL = -1;
    public static final byte TYPE_PAY_ALBUM = 6;
    public static final byte TYPE_SEARCH = 2;
    public static final byte TYPE_SLEEP_HOME_CHANNEL = 7;
    private static final long serialVersionUID = -1888824405301823845L;
    public final Serializable data;
    public final PlaylistPage playlistPage;
    private final String tag;
    public final byte type;

    public PlayerExtra(Serializable serializable, String str, byte b) {
        this(serializable, new PlaylistPage(), str, b);
    }

    public String getTag() {
        return this.tag;
    }

    public PlayerExtra(Serializable serializable, PlaylistPage playlistPage, String str, byte b) {
        this.data = serializable;
        this.playlistPage = playlistPage;
        this.type = b;
        this.tag = ((int) b) + TAG_SPLIT + str;
    }

    public static String getTag(String str, byte b) {
        return ((int) b) + TAG_SPLIT + str;
    }
}
