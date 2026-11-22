package com.xmly.businesssdk.player.util;

import com.xmly.businesssdk.a;
import com.xmly.businesssdk.c;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.utils.Logger;

/* loaded from: classes3.dex */
public class PlayableMetadataHelper {
    private static final String[] METADATA_KEYS = {"listenPackageId", "original_track_duration", "url_duration", "fzs_preview_mode"};
    private static final String TAG = "PlayableMetadataHelper";

    public static void clearMetadata(Playable playable) {
        if (playable == null) {
            return;
        }
        for (String str : METADATA_KEYS) {
            try {
                if ("fzs_preview_mode".equals(str)) {
                    boolean extraBoolean = playable.getExtraBoolean(str);
                    if (extraBoolean) {
                        Logger.d(TAG, "发现元数据 " + str + ": " + extraBoolean);
                    }
                } else {
                    if (!"original_track_duration".equals(str) && !"url_duration".equals(str)) {
                        String extraString = playable.getExtraString(str);
                        if (extraString != null && !extraString.isEmpty()) {
                            Logger.d(TAG, "发现元数据 " + str + ": " + extraString);
                        }
                    }
                    int extraInt = playable.getExtraInt(str);
                    if (extraInt > 0) {
                        Logger.d(TAG, "发现元数据 " + str + ": " + extraInt);
                    }
                }
            } catch (Exception e) {
                a.a(e, new StringBuilder("检查元数据失败 ").append(str).append(": "), TAG);
            }
        }
    }

    public static void transferMetadata(Playable playable, Playable playable2) {
        if (playable == null || playable2 == null) {
            return;
        }
        Logger.d(TAG, c.a("传递元数据: 从[").append(playable.getId()).append("]到[").append(playable2.getId()).append("]").toString());
        for (String str : METADATA_KEYS) {
            try {
                if ("fzs_preview_mode".equals(str)) {
                    boolean extraBoolean = playable.getExtraBoolean(str);
                    boolean extraBoolean2 = playable2.getExtraBoolean(str);
                    if (extraBoolean && !extraBoolean2) {
                        playable2.putExtraBoolean(str, extraBoolean);
                        Logger.d(TAG, "传递布尔型元数据 " + str + ": " + extraBoolean);
                    }
                } else {
                    if (!"original_track_duration".equals(str) && !"url_duration".equals(str)) {
                        String extraString = playable.getExtraString(str);
                        String extraString2 = playable2.getExtraString(str);
                        if (extraString != null && !extraString.isEmpty() && (extraString2 == null || extraString2.isEmpty())) {
                            playable2.putExtraString(str, extraString);
                            Logger.d(TAG, "传递字符串元数据 " + str + ": " + extraString);
                        }
                    }
                    int extraInt = playable.getExtraInt(str);
                    int extraInt2 = playable2.getExtraInt(str);
                    if (extraInt > 0 && extraInt2 == 0) {
                        playable2.putExtraInt(str, extraInt);
                        Logger.d(TAG, "传递整型元数据 " + str + ": " + extraInt);
                    }
                }
            } catch (Exception e) {
                a.a(e, new StringBuilder("传递元数据失败 ").append(str).append(": "), TAG);
            }
        }
    }
}
