package com.wakeup.common;

import com.wakeup.common.config.AppBuildConfigManager;

/* loaded from: classes2.dex */
public class Constants {
    public static final String APP_NOTICE_CALL = "Call";
    public static final String APP_NOTICE_CHAT_GPT = "ChatGpt";
    public static final String APP_NOTICE_OTHER = "Other";
    public static final String APP_NOTICE_SMS = "Messages";
    public static final String LENOVO_LOGIN = "LENOVO_LOGIN";
    public static final String LENOVO_LOGOFF = "LENOVO_LOGOFF";
    public static final String LENOVO_USER_ID = "LENOVO_USER_ID";
    public static final String MARKET_APPLICATION = "market_application";
    public static final String PACKAGE_NAME_GAODE = "com.autonavi.minimap";
    public static final String PACKAGE_NAME_QUICK_REPLY = "com.google.android.projection.gearhead";
    public static final String PUSH_PARAMS_EXTENDINFO = "extendInfo";
    public static final String PUSH_PARAMS_JUMP_INFO = "jumpInfo";
    public static final String PUSH_PARAMS_JUMP_TYPE = "jumpType";
    public static final String SHARE_URL_DOWNLOAD_SCHEME = "wearfitprocn";
    public static final String SHARE_URL_FRIEND_HOST = "iwhop.com";
    public static final String SHARE_URL_OVERSEAS_SCHEME = "wearfitpro";
    public static final String SHARE_URL_PARAMS_JUMP_MAC_ID = "macId";
    public static final String SHARE_URL_PARAMS_JUMP_SOURCE_ID = "sourceId";
    public static final String SHARE_URL_PARAMS_JUMP_TYPE = "jumpType";
    public static final String SHARE_URL_PARAMS_JUMP_USER_ID = "userId";
    public static final String SHARE_URL_PARAMS_SCENE_ID = "sceneId";
    public static final String SHARE_URL_PARAMS_TRACE_ID = "traceId";
    public static final String SHARE_URL_PARAMS_USER_ID = "userId";
    public static final String SHARE_URL_PARAMS_VIDEO_TOKEN = "videoToken";
    public static final String SHARE_URL_VIDEO_HOST = "wearfit.com";
    public static final String TYPE_SHARE_URL_PARAMS_JUMP_DOWNLOAD = "Download";
    public static final String APP_ID_WX = AppBuildConfigManager.INSTANCE.getWxAppId();
    public static final String APP_SECRET_WX = AppBuildConfigManager.INSTANCE.getWxAppSecret();
    public static final String APP_UM_APP_KEY = AppBuildConfigManager.INSTANCE.getUmengAppKey(true);
    public static final String QQ_LOGIN_APP_ID = AppBuildConfigManager.INSTANCE.getQqLoginAppId();

    public static class BundleKey {
        public static final String ACCOUNT = "account";
        public static final String BEAN = "bean";
        public static final String BIRTHDAY = "birthday";
        public static final String CODE = "code";
        public static final String FROM = "from";
        public static final String FROM_OTHER_SETTING = "from_other_setting";
        public static final String GENDER = "gender";
        public static final String GRADE = "grade";
        public static final String HEALTH_REPORT = "health_report";
        public static final String HEIGHT = "height";
        public static final String ID = "id";
        public static final String KCAL = "kcal";
        public static final String MINUTE = "minute";
        public static final String NICKNAME = "nickName";
        public static final String NUM = "num";
        public static final String PARAM_1 = "param_1";
        public static final String PARAM_2 = "param_2";
        public static final String PARAM_3 = "param_3";
        public static final String PARAM_4 = "param_4";
        public static final String PARAM_5 = "param_5";
        public static final String PARAM_6 = "param_6";
        public static final String PATH = "path";
        public static final String RESULT = "result";
        public static final String TEXT = "text";
        public static final String TIMESTAMP = "timeStamp";
        public static final String TITLE = "title";
        public static final String TYPE = "type";
        public static final String URL = "url";
        public static final String WEIGHT = "weight";
    }

    public static class SPKey {
        public static final String ANDROID_FIND_SWITCHES = "android_find_switches";
        public static final String ANDROID_TRACKING_NUMBER = "android_tracking_number";
        public static final String ANNUAL_REPORTS_URL = "annual_reports_url";
        public static final String ANNUAL_REPORT_SWITCH = "annual_report_switch";
        public static final String BAIDU_MAP_KEY = "baidu_map_key";
        public static final String BAIDU_NAVI_SEARCH_HISTORY = "BaiduNavi_search_history";
        public static final String BREATH_BACKGROUND_SOUND = "background_sound_%s";
        public static final String BREATH_SHARE_COVER_URL = "breath_share_cover_url";
        public static final String CACHE_SPORT_DATA = "CACHE_SPORT_DATA";
        public static final String CHAT_GPT_NOTIFY_SWITCH = "chat_gpt_notify_switch";
        public static final String CHAT_GPT_SWITCH = "chat_gpt_switch";
        public static final String DEVICE_COURSE_VERSION = "device_course_version";
        public static final String DEVICE_FN = "device_fn_";
        public static final String DEVICE_GPT_SN = "device_gpt_sn";
        public static final String DEVICE_MTU = "device_mtu";
        public static final String DEVICE_SN = "device_sn_";
        public static final String DEVICE_SN_PRE = "device_sn_pre_";
        public static final String GAME_ENTRY_SWITCH = "game_entry_switch";
        public static final String JACKET_ONE_TRANS_DISPLAY_SWITCH = "jacket_one_trans_display_switch";
        public static final String JACKET_ONE_TRANS_MUTUAL_TRNAS_SWITCH = "jacket_one_trans_mutual_trans_switch";
        public static final String JACKET_ONE_TRANS_SWITCH = "jacket_one_trans_switch";
        public static final String JACKET_ONE_TRANS_WINDOW_SWITCH = "jacket_one_trans_window_switch";
        public static final String LOCAL_RING_FILE = "local_ring_file";
        public static final String LOGIN_USER_FIRST = "LOGIN_USER_FIRST";
        public static final String MET_DATA_GOAL = "met_data_goal";
        public static final String NETWORK_SHARE_SWITCH = "network_share_switch";
        public static final String NUCLEIC_ACID_CODE = "NucleicAcidCode";
        public static final String ONE_TRANS_BROADCAST_SWITCH = "one_trans_broadcast_switch";
        public static final String PAGE_EVENT_CACHE = "PAGE_EVENT_CACHE";
        public static final String RUN_COURSE_ACTION_LIST = "run_course_action_list";
        public static final String RUN_COURSE_BROADCAST_LIST = "run_course_broadcast_list";
        public static final String SELECT_ENERGY_UNIT = "select_energy_unit";
        public static final String SHORT_VIDEO_LIKE_NUM_KEY = "short_video_num_like_key";
        public static final String SOUND_ONE_TRANS_BROADCAST_SWITCH = "sound_one_trans_broadcast_switch";
        public static final String TEMPERATURE_UNIT_KEY = "temperature_unit_key_";
        public static final String WSH_SWITCH = "wsh_switch";
    }

    public static class ShareTypeKey {
        public static final int CONTENT_TYPE_BITMAP = 2;
        public static final int CONTENT_TYPE_MP3 = 3;
        public static final int CONTENT_TYPE_MP4 = 4;
        public static final int CONTENT_TYPE_TEXT = 1;
        public static final int CONTENT_TYPE_URL = 5;
    }

    public static class SwitchesInfo {
        public static final int ANDROID_TRACKING_NUMBER = 10;
    }
}
