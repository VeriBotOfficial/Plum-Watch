package com.xmly.businesssdk.utils;

import com.xmly.businesssdk.network.bean.album.Album;

/* loaded from: classes3.dex */
public class PayUtils {
    public static final int BOUGHT_TYPE_ALL_ALBUM = 2;
    public static final int BOUGHT_TYPE_SINGLE_TRACK = 1;
    public static final int PAID_TYPE_BOUGHT_ALL_ALBUM = 1;
    public static final int PAID_TYPE_FREE = 0;
    public static final int PAID_TYPE_VIP = 2;
    public static final int PAID_TYPE_VIP_FREE = 3;

    public static boolean isBoughtAlbum(boolean z, boolean z2, boolean z3) {
        return (!z || z2 || z3) ? false : true;
    }

    public static boolean isBoughtAllAlbum(boolean z, boolean z2, boolean z3, int i) {
        return isBoughtAlbum(z, z2, z3) && i == 2;
    }

    public static boolean isBoughtSingleTrack(boolean z, boolean z2, boolean z3, int i) {
        return isBoughtAlbum(z, z2, z3) && i == 1;
    }

    public static boolean isFreeAlbum(Album album) {
        if (album != null) {
            return album.isFreeAlbum();
        }
        return false;
    }

    public static boolean isFreeAlbum(boolean z, boolean z2, boolean z3) {
        return (z || z2 || z3) ? false : true;
    }

    public static boolean isVipAlbum(Album album) {
        if (album != null) {
            return album.isVipAlbum();
        }
        return false;
    }

    public static boolean isVipAlbum(boolean z, boolean z2, boolean z3) {
        return z && !z2 && z3;
    }

    public static boolean isVipOrBoughtAlbum(boolean z, boolean z2, boolean z3) {
        return z && z2 && !z3;
    }
}
