package com.xmly.businesssdk.player.util;

import com.xmly.businesssdk.network.bean.track.Track;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class TrackUtils {
    public static final String KEY_SELECT_RECOMMEND_TAB_ID = "key_select_recommend_tab_id";
    public static final String KEY_SELECT_RECOMMEND_TAB_NAME = "key_select_recommend_tab_name";
    private static final String TAG = "TrackUtils";

    public static int getPositionByTrackId(List<Track> list, long j) {
        if (CommonUtils.isNullOrEmpty(list)) {
            return 0;
        }
        for (int i = 0; i < list.size(); i++) {
            Track track = list.get(i);
            if (track != null && track.getDataId() == j) {
                return i;
            }
        }
        return 0;
    }

    public static String getTrackIds(List<Track> list) {
        if (list != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            Iterator<Track> it = list.iterator();
            while (it.hasNext()) {
                sb.append(it.next().getDataId()).append(",");
            }
            if (sb.length() > 1) {
                return sb.substring(0, sb.length() - 1);
            }
        }
        return "";
    }
}
