package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.util.Map;

/* loaded from: classes17.dex */
public class DownloadEntity extends JSONBeanFrm {

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_ACTIVATION_URL = "MAP_KEY_ACTIVATION_URL";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_COIN = "MAP_KEY_COIN";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_COIN_TYPE = "MAP_KEY_COIN_TYPE";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_DOWNLOAD_START_SOURCE = "MAP_KEY_DOWNLOAD_START_SOURCE";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_FEATURE_ID = "MAP_KEY_FEATURE_ID";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_IDEA_ID = "MAP_KEY_IDEA_ID";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_INSTALL_ATTR = "MAP_KEY_INSTALL_ATTR";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_MEMBER_ID = "MAP_KEY_MEMBER_ID";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_PLAY_TYPE = "MAP_KEY_PLAY_TYPE";

    @JSONBeanFrm.a(marshallable = false)
    public static final String MAP_KEY_SEARCH_ID = "MAP_KEY_SEARCH_ID";
    public String appName;
    public long contentLength;
    public Map<?, ?> customMap;
    public String downloadKey;
    public String downloadUrl;
    public String fileName;
    public long lastTimeMillis;
    public String logoUrl;
    public String md5;
    public String packageName;
    public int status;
    public String storagePath;
}
