package com.wakeup.commponent.module.device;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: EventType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\bN\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bN¨\u0006O"}, d2 = {"Lcom/wakeup/commponent/module/device/EventType;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_DEVICE_SCAN", "TYPE_DEVICE_STATE", "TYPE_SICHE_SETTING_CHANGE", "TYPE_SICHE_LOG", "TYPE_DEVICE_BATTERY", "TYPE_DEVICE_VOLUME", "TYPE_DEVICE_TAKE", "TYPE_DEVICE_SET_QR", "TYPE_DEVICE_WRITE", "TYPE_DEVICE_MTU", "TYPE_DEVICE_DIAL_TRANSFER", "TYPE_DEVICE_ALBUM_DIAL_TRANSFER", "TYPE_DEVICE_MAP_NAVI_STATUS", "TYPE_DEVICE_MAP_NAVI_END", "TYPE_AVAILABLE_MEMORY", "TYPE_APP_PACKAGE_NAME", "TYPE_SYNC_OVER", "TYPE_LOCAL_MUSIC_LIST", "TYPE_WATCH_SHAKE_PHOTO", "TYPE_WATCH_SWITCH_CAMERA", "TYPE_RECORDING_OPERATE", "TYPE_DEVICE_GALLERY", "TYPE_RECEIVE_FILE", "TYPE_RECEIVE_STREAM_START", "TYPE_RECEIVE_STREAM", "TYPE_RECEIVE_STREAM_END", "TYPE_RECEIVE_STREAM_FAIL", "TYPE_RECEIVE_OPT", "TYPE_DEVICE_SPORT", "TYPE_PAIR_AUDIO", "TYPE_SINGLE_DATA", "TYPE_EQ_MODE", "TYPE_PUSH_RESP", "TYPE_DEVICE_BARRAGE_TRANSFER", "TYPE_VIDEO_PIXEL_SIZE", "TYPE_RECEIVE_LOG", "TYPE_TRANSFER_PICTURE_INFO", "TYPE_DEVICE_THUMB", "TYPE_DEVICE_SWITCH", "TYPE_STOP_STREAM_TEXT", "BT_CONNECT_STATE", "TYPE_BLUETOOTH_ASSISTANT_KEY", "TYPE_NETWORK_SHARE_SWITCH", "TYPE_WRITE_NOISE", "TYPE_AI_LANGUAGE", "TYPE_GLASSES_DATA_UPDATE", "TYPE_GLASSES_WIFI_STATE", "TYPE_GLASSES_SET_WIFI_RESULT", "TYPE_GLASSES_HOTSPOT_OPEN", "TYPE_GLASSES_MUSIC_STATE", "TYPE_DEVICE_SCHEDULE", "TYPE_NET_FTP_OTA_RESULT", "TYPE_NET_FTP_OTA_PROGRESS", "TYPE_NET_FTP_OTA_END_RESULT", "TYPE_NET_FTP_OTA_CONFIRM", "TYPE_WECHAT_REPLY", "TYPE_WHATSAPP", "TYPE_HEADSET_ANC_MODE", "TYPE_GLASSES_GUIDE_KEY", "TYPE_GLASSES_SCAN_WIFI", "TYPE_DEVICE_WEAR", "TYPE_DEVICE_WEAR_SWITCH", "TYPE_DEVICE_BT_STATUS", "TYPE_DEVICE_SCAN_AND_CONNECT", "TYPE_GLASSES_OPEN_WIFI_P2P", "TYPE_GLASSES_VIDEO_DURATION_CONFIG", "TYPE_GLASSES_MEMORY_TIP", "TYPE_WATCH_BLE_REQUEST", "TYPE_CONNECT_STATE", "TYPE_GLASSES_CALL_RECORD", "TYPE_AUDIO_RECORD", "TYPE_SLEEP_SOUND_MUSIC", "AUTO_SHUTDOWN_DURATION", "TYPE_DEVICE_LICENSE", "FILE_TRANSFER_NUMBER", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ EventType[] $VALUES;
    public static final EventType TYPE_DEVICE_SCAN = new EventType("TYPE_DEVICE_SCAN", 0);
    public static final EventType TYPE_DEVICE_STATE = new EventType("TYPE_DEVICE_STATE", 1);
    public static final EventType TYPE_SICHE_SETTING_CHANGE = new EventType("TYPE_SICHE_SETTING_CHANGE", 2);
    public static final EventType TYPE_SICHE_LOG = new EventType("TYPE_SICHE_LOG", 3);
    public static final EventType TYPE_DEVICE_BATTERY = new EventType("TYPE_DEVICE_BATTERY", 4);
    public static final EventType TYPE_DEVICE_VOLUME = new EventType("TYPE_DEVICE_VOLUME", 5);
    public static final EventType TYPE_DEVICE_TAKE = new EventType("TYPE_DEVICE_TAKE", 6);
    public static final EventType TYPE_DEVICE_SET_QR = new EventType("TYPE_DEVICE_SET_QR", 7);
    public static final EventType TYPE_DEVICE_WRITE = new EventType("TYPE_DEVICE_WRITE", 8);
    public static final EventType TYPE_DEVICE_MTU = new EventType("TYPE_DEVICE_MTU", 9);
    public static final EventType TYPE_DEVICE_DIAL_TRANSFER = new EventType("TYPE_DEVICE_DIAL_TRANSFER", 10);
    public static final EventType TYPE_DEVICE_ALBUM_DIAL_TRANSFER = new EventType("TYPE_DEVICE_ALBUM_DIAL_TRANSFER", 11);
    public static final EventType TYPE_DEVICE_MAP_NAVI_STATUS = new EventType("TYPE_DEVICE_MAP_NAVI_STATUS", 12);
    public static final EventType TYPE_DEVICE_MAP_NAVI_END = new EventType("TYPE_DEVICE_MAP_NAVI_END", 13);
    public static final EventType TYPE_AVAILABLE_MEMORY = new EventType("TYPE_AVAILABLE_MEMORY", 14);
    public static final EventType TYPE_APP_PACKAGE_NAME = new EventType("TYPE_APP_PACKAGE_NAME", 15);
    public static final EventType TYPE_SYNC_OVER = new EventType("TYPE_SYNC_OVER", 16);
    public static final EventType TYPE_LOCAL_MUSIC_LIST = new EventType("TYPE_LOCAL_MUSIC_LIST", 17);
    public static final EventType TYPE_WATCH_SHAKE_PHOTO = new EventType("TYPE_WATCH_SHAKE_PHOTO", 18);
    public static final EventType TYPE_WATCH_SWITCH_CAMERA = new EventType("TYPE_WATCH_SWITCH_CAMERA", 19);
    public static final EventType TYPE_RECORDING_OPERATE = new EventType("TYPE_RECORDING_OPERATE", 20);
    public static final EventType TYPE_DEVICE_GALLERY = new EventType("TYPE_DEVICE_GALLERY", 21);
    public static final EventType TYPE_RECEIVE_FILE = new EventType("TYPE_RECEIVE_FILE", 22);
    public static final EventType TYPE_RECEIVE_STREAM_START = new EventType("TYPE_RECEIVE_STREAM_START", 23);
    public static final EventType TYPE_RECEIVE_STREAM = new EventType("TYPE_RECEIVE_STREAM", 24);
    public static final EventType TYPE_RECEIVE_STREAM_END = new EventType("TYPE_RECEIVE_STREAM_END", 25);
    public static final EventType TYPE_RECEIVE_STREAM_FAIL = new EventType("TYPE_RECEIVE_STREAM_FAIL", 26);
    public static final EventType TYPE_RECEIVE_OPT = new EventType("TYPE_RECEIVE_OPT", 27);
    public static final EventType TYPE_DEVICE_SPORT = new EventType("TYPE_DEVICE_SPORT", 28);
    public static final EventType TYPE_PAIR_AUDIO = new EventType("TYPE_PAIR_AUDIO", 29);
    public static final EventType TYPE_SINGLE_DATA = new EventType("TYPE_SINGLE_DATA", 30);
    public static final EventType TYPE_EQ_MODE = new EventType("TYPE_EQ_MODE", 31);
    public static final EventType TYPE_PUSH_RESP = new EventType("TYPE_PUSH_RESP", 32);
    public static final EventType TYPE_DEVICE_BARRAGE_TRANSFER = new EventType("TYPE_DEVICE_BARRAGE_TRANSFER", 33);
    public static final EventType TYPE_VIDEO_PIXEL_SIZE = new EventType("TYPE_VIDEO_PIXEL_SIZE", 34);
    public static final EventType TYPE_RECEIVE_LOG = new EventType("TYPE_RECEIVE_LOG", 35);
    public static final EventType TYPE_TRANSFER_PICTURE_INFO = new EventType("TYPE_TRANSFER_PICTURE_INFO", 36);
    public static final EventType TYPE_DEVICE_THUMB = new EventType("TYPE_DEVICE_THUMB", 37);
    public static final EventType TYPE_DEVICE_SWITCH = new EventType("TYPE_DEVICE_SWITCH", 38);
    public static final EventType TYPE_STOP_STREAM_TEXT = new EventType("TYPE_STOP_STREAM_TEXT", 39);
    public static final EventType BT_CONNECT_STATE = new EventType("BT_CONNECT_STATE", 40);
    public static final EventType TYPE_BLUETOOTH_ASSISTANT_KEY = new EventType("TYPE_BLUETOOTH_ASSISTANT_KEY", 41);
    public static final EventType TYPE_NETWORK_SHARE_SWITCH = new EventType("TYPE_NETWORK_SHARE_SWITCH", 42);
    public static final EventType TYPE_WRITE_NOISE = new EventType("TYPE_WRITE_NOISE", 43);
    public static final EventType TYPE_AI_LANGUAGE = new EventType("TYPE_AI_LANGUAGE", 44);
    public static final EventType TYPE_GLASSES_DATA_UPDATE = new EventType("TYPE_GLASSES_DATA_UPDATE", 45);
    public static final EventType TYPE_GLASSES_WIFI_STATE = new EventType("TYPE_GLASSES_WIFI_STATE", 46);
    public static final EventType TYPE_GLASSES_SET_WIFI_RESULT = new EventType("TYPE_GLASSES_SET_WIFI_RESULT", 47);
    public static final EventType TYPE_GLASSES_HOTSPOT_OPEN = new EventType("TYPE_GLASSES_HOTSPOT_OPEN", 48);
    public static final EventType TYPE_GLASSES_MUSIC_STATE = new EventType("TYPE_GLASSES_MUSIC_STATE", 49);
    public static final EventType TYPE_DEVICE_SCHEDULE = new EventType("TYPE_DEVICE_SCHEDULE", 50);
    public static final EventType TYPE_NET_FTP_OTA_RESULT = new EventType("TYPE_NET_FTP_OTA_RESULT", 51);
    public static final EventType TYPE_NET_FTP_OTA_PROGRESS = new EventType("TYPE_NET_FTP_OTA_PROGRESS", 52);
    public static final EventType TYPE_NET_FTP_OTA_END_RESULT = new EventType("TYPE_NET_FTP_OTA_END_RESULT", 53);
    public static final EventType TYPE_NET_FTP_OTA_CONFIRM = new EventType("TYPE_NET_FTP_OTA_CONFIRM", 54);
    public static final EventType TYPE_WECHAT_REPLY = new EventType("TYPE_WECHAT_REPLY", 55);
    public static final EventType TYPE_WHATSAPP = new EventType("TYPE_WHATSAPP", 56);
    public static final EventType TYPE_HEADSET_ANC_MODE = new EventType("TYPE_HEADSET_ANC_MODE", 57);
    public static final EventType TYPE_GLASSES_GUIDE_KEY = new EventType("TYPE_GLASSES_GUIDE_KEY", 58);
    public static final EventType TYPE_GLASSES_SCAN_WIFI = new EventType("TYPE_GLASSES_SCAN_WIFI", 59);
    public static final EventType TYPE_DEVICE_WEAR = new EventType("TYPE_DEVICE_WEAR", 60);
    public static final EventType TYPE_DEVICE_WEAR_SWITCH = new EventType("TYPE_DEVICE_WEAR_SWITCH", 61);
    public static final EventType TYPE_DEVICE_BT_STATUS = new EventType("TYPE_DEVICE_BT_STATUS", 62);
    public static final EventType TYPE_DEVICE_SCAN_AND_CONNECT = new EventType("TYPE_DEVICE_SCAN_AND_CONNECT", 63);
    public static final EventType TYPE_GLASSES_OPEN_WIFI_P2P = new EventType("TYPE_GLASSES_OPEN_WIFI_P2P", 64);
    public static final EventType TYPE_GLASSES_VIDEO_DURATION_CONFIG = new EventType("TYPE_GLASSES_VIDEO_DURATION_CONFIG", 65);
    public static final EventType TYPE_GLASSES_MEMORY_TIP = new EventType("TYPE_GLASSES_MEMORY_TIP", 66);
    public static final EventType TYPE_WATCH_BLE_REQUEST = new EventType("TYPE_WATCH_BLE_REQUEST", 67);
    public static final EventType TYPE_CONNECT_STATE = new EventType("TYPE_CONNECT_STATE", 68);
    public static final EventType TYPE_GLASSES_CALL_RECORD = new EventType("TYPE_GLASSES_CALL_RECORD", 69);
    public static final EventType TYPE_AUDIO_RECORD = new EventType("TYPE_AUDIO_RECORD", 70);
    public static final EventType TYPE_SLEEP_SOUND_MUSIC = new EventType("TYPE_SLEEP_SOUND_MUSIC", 71);
    public static final EventType AUTO_SHUTDOWN_DURATION = new EventType("AUTO_SHUTDOWN_DURATION", 72);
    public static final EventType TYPE_DEVICE_LICENSE = new EventType("TYPE_DEVICE_LICENSE", 73);
    public static final EventType FILE_TRANSFER_NUMBER = new EventType("FILE_TRANSFER_NUMBER", 74);

    private static final /* synthetic */ EventType[] $values() {
        return new EventType[]{TYPE_DEVICE_SCAN, TYPE_DEVICE_STATE, TYPE_SICHE_SETTING_CHANGE, TYPE_SICHE_LOG, TYPE_DEVICE_BATTERY, TYPE_DEVICE_VOLUME, TYPE_DEVICE_TAKE, TYPE_DEVICE_SET_QR, TYPE_DEVICE_WRITE, TYPE_DEVICE_MTU, TYPE_DEVICE_DIAL_TRANSFER, TYPE_DEVICE_ALBUM_DIAL_TRANSFER, TYPE_DEVICE_MAP_NAVI_STATUS, TYPE_DEVICE_MAP_NAVI_END, TYPE_AVAILABLE_MEMORY, TYPE_APP_PACKAGE_NAME, TYPE_SYNC_OVER, TYPE_LOCAL_MUSIC_LIST, TYPE_WATCH_SHAKE_PHOTO, TYPE_WATCH_SWITCH_CAMERA, TYPE_RECORDING_OPERATE, TYPE_DEVICE_GALLERY, TYPE_RECEIVE_FILE, TYPE_RECEIVE_STREAM_START, TYPE_RECEIVE_STREAM, TYPE_RECEIVE_STREAM_END, TYPE_RECEIVE_STREAM_FAIL, TYPE_RECEIVE_OPT, TYPE_DEVICE_SPORT, TYPE_PAIR_AUDIO, TYPE_SINGLE_DATA, TYPE_EQ_MODE, TYPE_PUSH_RESP, TYPE_DEVICE_BARRAGE_TRANSFER, TYPE_VIDEO_PIXEL_SIZE, TYPE_RECEIVE_LOG, TYPE_TRANSFER_PICTURE_INFO, TYPE_DEVICE_THUMB, TYPE_DEVICE_SWITCH, TYPE_STOP_STREAM_TEXT, BT_CONNECT_STATE, TYPE_BLUETOOTH_ASSISTANT_KEY, TYPE_NETWORK_SHARE_SWITCH, TYPE_WRITE_NOISE, TYPE_AI_LANGUAGE, TYPE_GLASSES_DATA_UPDATE, TYPE_GLASSES_WIFI_STATE, TYPE_GLASSES_SET_WIFI_RESULT, TYPE_GLASSES_HOTSPOT_OPEN, TYPE_GLASSES_MUSIC_STATE, TYPE_DEVICE_SCHEDULE, TYPE_NET_FTP_OTA_RESULT, TYPE_NET_FTP_OTA_PROGRESS, TYPE_NET_FTP_OTA_END_RESULT, TYPE_NET_FTP_OTA_CONFIRM, TYPE_WECHAT_REPLY, TYPE_WHATSAPP, TYPE_HEADSET_ANC_MODE, TYPE_GLASSES_GUIDE_KEY, TYPE_GLASSES_SCAN_WIFI, TYPE_DEVICE_WEAR, TYPE_DEVICE_WEAR_SWITCH, TYPE_DEVICE_BT_STATUS, TYPE_DEVICE_SCAN_AND_CONNECT, TYPE_GLASSES_OPEN_WIFI_P2P, TYPE_GLASSES_VIDEO_DURATION_CONFIG, TYPE_GLASSES_MEMORY_TIP, TYPE_WATCH_BLE_REQUEST, TYPE_CONNECT_STATE, TYPE_GLASSES_CALL_RECORD, TYPE_AUDIO_RECORD, TYPE_SLEEP_SOUND_MUSIC, AUTO_SHUTDOWN_DURATION, TYPE_DEVICE_LICENSE, FILE_TRANSFER_NUMBER};
    }

    public static EnumEntries<EventType> getEntries() {
        return $ENTRIES;
    }

    private EventType(String str, int i) {
    }

    static {
        EventType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static EventType valueOf(String str) {
        return (EventType) Enum.valueOf(EventType.class, str);
    }

    public static EventType[] values() {
        return (EventType[]) $VALUES.clone();
    }
}
