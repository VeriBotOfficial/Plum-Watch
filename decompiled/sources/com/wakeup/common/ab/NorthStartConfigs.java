package com.wakeup.common.ab;

import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NorthStartConfigs.kt */
@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0003\b\u0081\u0001\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0005H\u0007J\u000e\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fJ\t\u0010\u009a\u0001\u001a\u00020\u0005H\u0007J\t\u0010\u009b\u0001\u001a\u00020\u0005H\u0007J\t\u0010\u009c\u0001\u001a\u00020\u0005H\u0007J\t\u0010\u009d\u0001\u001a\u00020\u0005H\u0007J\t\u0010\u009e\u0001\u001a\u00020\u0005H\u0007J\t\u0010\u009f\u0001\u001a\u00020\u0005H\u0007J\u0012\u0010£\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010¤\u0001\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0087\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0088\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0089\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008a\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008b\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008c\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008d\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008e\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0092\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0093\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0094\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0095\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0096\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0097\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0098\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0099\u0001\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u001c\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010¢\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001f0¡\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006¥\u0001"}, d2 = {"Lcom/wakeup/common/ab/NorthStartConfigs;", "", "<init>", "()V", "ENABLE_MINI_MUSIC", "", "ENABLE_I18N_PRECISION", "ENABLE_DIAL_MARKET_REVAMP", "ENABLE_DIAL_MARKET_REVAMP_OVERSEAS", "ENABLE_DIAL_MARKET_ADD_MEMBER", "ENABLE_APM_PUSH", "APM_MONITOR_UIDS", "ENABLE_FEEDBACK_LOG_REPORT", "ENABLE_COMMENT", "ENABLE_HOT_SEARCH", "ENABLE_AD_UNLOCK_DIAL", "ENABLE_AD_UNLOCK_DIAL_OVERSEAS", "AD_UNLOCK_DIAL_CONFIG", "AD_UNLOCK_DIAL_CONFIG_OVERSEAS", "ENABLE_RN_SEARCH", "ENABLE_MEDAL", "ENABLE_NEW_MINE_UI", "ENABLE_NEW_MINE_UI_OVERSEAS", "newMineUiKey", "ENABLE_DIAL_LADDER_DISCOUNT", "ENABLE_OVERSEAS_HOMEPAGE_CONFIG", "ENABLE_OVERSEAS_HOMEPAGE_FUNCTION_CONFIG", "ENABLE_WEAK_NETWORK_P0", "ENABLE_WEAK_NETWORK_P0_OVERSEAS", "weakNetworkP0Key", "isOverseas", "", "ENABLE_FEED_VIDEO_AD", "ENABLE_VIDEO_SHARE", "ENABLE_VIDEO_SHARE_2", "ENABLE_FULL_SPEED", "ENABLE_BLACK_VIDEO_AD", "ENABLE_VIDEO_DETAIL_AD", "ENABLE_AI_APPLET_TWO", "ENABLE_AI_APPLET_ONE", "ENABLE_NOVEL_POP", "ENABLE_MAIN_BOTTOM_NOVEL", "ENABLE_NOVEL_TAB", "ENABLE_HOME_FEED_VIDEO_RATIO", "ENABLE_MENU_HOMEPAGE_CONFIG", "ENABLE_MENU_HOMEPAGE_FUNCTION_CONFIG", "ENABLE_MENU_HOMEPAGE", "ENABLE_HTTP_DNS", "ENABLE_DIET_ENTRY", "ENABLE_NEWS_BLOG", "ENABLE_NEWS_BLOG_TOP_ENTRY", "ENABLE_NEWS_BLOG_PANEL", "ENABLE_OVERSEAD_DIAL_PAYMENT", "ENABLE_HEILIUYOUHUA", "ENABLE_CLEAR_UNREAD_RED", "ENABLE_OVERSEA_CLEAR_UNREAD_RED", "ENABLE_FOLLOW_PUBLISHER_LIST", "OVERSEAS_ENABLE_FOLLOW_PUBLISHER_LIST", "ENABLE_FOLLOW_FOCUS", "ENABLE_OVERSEAS_TAKU", "ENABLE_UNIFIED_DOMAIN", "ENABLE_OVERSEAS_MEMBERS", "ENABLE_OVERSEAS_SPEEDUP", "ENABLE_SHORT_TV", "ENABLE_SHORT_TV_TAB", "ENABLE_SHORT_TV_CHANGE", "ENABLE_SHORT_TV_NEW", "ENABLE_GIFT_REWARD", "ENABLE_IMAGE_TEXT", "ENABLE_PUBLISH_IMAGE_TEXT", "ENABLE_EXPRESS_AD", "ENABLE_SHOU_YE_YOU_XI", "ENABLE_MY_YOU_XI", "ENABLE_AB_FLUSH_BULK_SIZE", "ENABLE_AB_FLUSH_INTERVAL", "ENABLE_NORDIC_BLE_STACK", "ENABLE_BLUETOOTH_SCAN", "ENABLE_WATCH_TIP", "ENABLE_WATCH_MULTIPLE", "ENABLE_WATCH_MULTIPLE_OVERSEA", "ENABLE_FOLLOW", "ENABLE_SUPER_APP_AI_PAGE_CONFIG", "ENABLE_BIAOPAN_SEARCH", "ENABLE_BLIND_BOX", "ENABLE_AI_BIAOPAN", "ENABLE_WATCH_CONNECT", "ENABLE_WATCH_CONNECT_OVERSEA", "ENABLE_CONNECTION_POOL_KEEP_ALIVE", "ENABLE_PLAYER_OPTIMIZE", "ENABLE_QUMENG_AD", "ENABLE_BANNER_DIAL_DETAIL", "ENABLE_BANNER_DIAL_LIST", "ENABLE_BANNER_DIAL_MAIN", "ENABLE_BANNER_MINE", "ENABLE_BANNER_DEF_DEVICE", "ENABLE_BANNER_WATCH_DEVICE", "ENABLE_BANNER_WATCH_DEVICE_PAGE", "ENABLE_BANNER_HEALTH_DASH", "ENABLE_AIMUSICADSBANNER", "HOME_SLOT_CONFIG", "HOME_SLOT_CONFIG_PLATFORM", "ENABLE_WATCH_RECOVERY_A", "ENABLE_WATCH_RECOVERY_B", "ENABLE_HEALTH_SCENE", "ENABLE_AI_INSIGHT", "ENABLE_CHECKIN_BAR", "ENABLE_RETURN_USER_CARD", "ENABLE_STEP_CHALLENGE", "ENABLE_DESKTOP_WIDGET", "ENABLE_HEALTH_DIARY", "ENABLE_DAILY_PLAN", "ENABLE_DAILY_PLAN_TAB", "ENABLE_AI_MUSIC_ENTRY", "ENABLE_AI_MUSIC_ENTRY_OVERSEAS", "ENABLE_MUSIC_RECOMMEND", "ENABLE_OVERSEAS_MUSIC_RECOMMEND", "ENABLE_AI_ANALYSIS_FAB", "ENABLE_DIAL_VIP", "ENABLE_MAIDIAN_REFACTOR", "ENABLE_OVERSEAS_MAIDIAN_REFACTOR", "ENABLE_BI_BRIDGE_TO_BURYPOINT", "ENABLE_WANGMAI", "ENABLE_YUEDONG", "ENABLE_BOT_CHAT", "ENABLE_DIABETES_MOE_AGI", "ENABLE_BENEFITS", "ENABLE_BENEFITS2", "FULI_REWARD_AD_CONFIG", "ENABLE_APP_STARTUP_OPTIMIZATION", "ENABLE_DEVICE_PERF_OPT", "ENABLE_DEVICE_PERF_OPT_OVERSEAS", "LOW_END_MEM_THRESHOLD_GB", "LOW_END_MEM_THRESHOLD_GB_OVERSEAS", "ENABLE_HOT_AD", "ENABLE_HOT_INTERVAL", "ENABLE_HOT_SPLASH_CACHE", "ENABLE_SPLASH_LIVE", "ENABLE_SPLASH_LIVE_TIME_INTERVAL", "ANDROID_IOS_REQI_ADS_TIME", "ENABLE_BIND_INTER_AD", "ENABLE_AD_SDK_PRE", "ENABLE_AD_WEIXIN", "ENABLE_OFFLINE_VIDEO", "ENABLE_PUSH_SPLASH_AD", "ENABLE_PUSH_SPLASH_AD_OVERSEAS", "ENABLE_SKIP_NOTIFICATION", "ENABLE_NOTICE_RICH_TEXT", "ENABLE_NOTICE_PERSISTENT", "ENABLE_NOTICE_JUMP_MAIN_PAGE", "ENABLE_OVERSEA_TAKU_HOT_CACHE", "ENABLE_HOT_CACHE_FILL", "ENABLE_HOT_CACHE_TIME_INTERVAL", "ENABLE_FEED_AD_REFRESH", "ENABLE_NATIVE_DIAL_MAIN", "pushSplashAdKey", "adUnlockDialKey", "adUnlockDialConfigKey", "aiMusicEntryKey", "devicePerfOptKey", "lowEndMemThresholdGbKey", "defaultConfigs", "", "overSeaDefaultConfigs", "getDefaultConfig", "key", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NorthStartConfigs {
    public static final String AD_UNLOCK_DIAL_CONFIG = "superAppSocialPageConfig/adUnlockDialConfig";
    public static final String AD_UNLOCK_DIAL_CONFIG_OVERSEAS = "superAppVideoPageConfig/adUnlockDialConfig";
    public static final String ANDROID_IOS_REQI_ADS_TIME = "superAppAIPageConfig/androidIosReqiAdsTime";
    public static final String APM_MONITOR_UIDS = "superAppServiceConfig/apmMonitorUids";
    public static final String ENABLE_AB_FLUSH_BULK_SIZE = "superAppDevicePageConfig/flushBulkSize";
    public static final String ENABLE_AB_FLUSH_INTERVAL = "superAppDevicePageConfig/flushInterval";
    public static final String ENABLE_AD_SDK_PRE = "superAppGamePageConfig/celuoneizhi";
    public static final String ENABLE_AD_UNLOCK_DIAL = "superAppSocialPageConfig/enableAdUnlockDial";
    public static final String ENABLE_AD_UNLOCK_DIAL_OVERSEAS = "superAppVideoPageConfig/enableAdUnlockDial";
    public static final String ENABLE_AD_WEIXIN = "superAppGamePageConfig/adsxiaochengxu";
    public static final String ENABLE_AIMUSICADSBANNER = "superAppVideoPageConfig/AImusicadsbanner";
    public static final String ENABLE_AI_ANALYSIS_FAB = "superAppSocialPageConfig/enableAiAnalysisFab";
    public static final String ENABLE_AI_APPLET_ONE = "superAppAIPageConfig/enableAIToolsOne";
    public static final String ENABLE_AI_APPLET_TWO = "superAppAIPageConfig/enableAITools";
    public static final String ENABLE_AI_BIAOPAN = "superAppAIPageConfig/aibiaopan";
    public static final String ENABLE_AI_INSIGHT = "superAppFirstPageConfig/enableAiInsight";
    public static final String ENABLE_AI_MUSIC_ENTRY = "superAppSocialPageConfig/enableAiMusicEntry";
    public static final String ENABLE_AI_MUSIC_ENTRY_OVERSEAS = "superAppDevicePageConfig/enableAiMusicEntry";
    public static final String ENABLE_APP_STARTUP_OPTIMIZATION = "superAppFirstPageConfig/appStartupOptimization";
    public static final String ENABLE_BANNER_DEF_DEVICE = "superAppXPageConfig/androidBannerDefDevice";
    public static final String ENABLE_BANNER_DIAL_DETAIL = "superAppXPageConfig/androidBannerDialDetail";
    public static final String ENABLE_BANNER_DIAL_LIST = "superAppXPageConfig/androidBannerDialList";
    public static final String ENABLE_BANNER_DIAL_MAIN = "superAppXPageConfig/androidBannerDialMain";
    public static final String ENABLE_BANNER_HEALTH_DASH = "superAppXPageConfig/androidBannerHealthDash";
    public static final String ENABLE_BANNER_MINE = "superAppXPageConfig/androidBannerMine";
    public static final String ENABLE_BANNER_WATCH_DEVICE = "superAppXPageConfig/androidBannerWatchDevice";
    public static final String ENABLE_BANNER_WATCH_DEVICE_PAGE = "superAppXPageConfig/androidBannerWatchPage";
    public static final String ENABLE_BENEFITS = "superAppSocialPageConfig/isfuli";
    public static final String ENABLE_BENEFITS2 = "superAppPushConfig/isfuli";
    public static final String ENABLE_BIND_INTER_AD = "superAppGamePageConfig/shouciquchaping";
    public static final String ENABLE_BI_BRIDGE_TO_BURYPOINT = "superAppMyPageConfig/enableBiBridgeToBuryPoint";
    public static final String ENABLE_BLACK_VIDEO_AD = "superAppXPageConfig/blackAds1";
    public static final String ENABLE_BLIND_BOX = "superAppOtherPageConfig/blindbox";
    public static final String ENABLE_BLUETOOTH_SCAN = "superAppXPageConfig/autobluetoothscan";
    public static final String ENABLE_BOT_CHAT = "superAppOtherPageConfig/enableBotChat";
    public static final String ENABLE_CHECKIN_BAR = "superAppSocialPageConfig/enableCheckinBar";
    public static final String ENABLE_CONNECTION_POOL_KEEP_ALIVE = "superAppMyPageConfig/connectionpoolkeepalive";
    public static final String ENABLE_DAILY_PLAN = "superAppFirstPageConfig/enableDailyPlan";
    public static final String ENABLE_DAILY_PLAN_TAB = "superAppSocialPageConfig/enableDailyPlan";
    public static final String ENABLE_DESKTOP_WIDGET = "superAppServiceConfig/enableDesktopWidget";
    public static final String ENABLE_DEVICE_PERF_OPT = "superAppAIPageConfig/enableDevicePerfOpt";
    public static final String ENABLE_DEVICE_PERF_OPT_OVERSEAS = "superAppDevicePageConfig/enableDevicePerfOpt";
    public static final String ENABLE_DIABETES_MOE_AGI = "superAppOtherPageConfig/enableDiabetesMoeAgi";
    public static final String ENABLE_DIAL_LADDER_DISCOUNT = "superAppShoppingPageConfig/biaopanzhekou";
    public static final String ENABLE_DIAL_MARKET_ADD_MEMBER = "superAppFirstPageConfig/biaopanshichangADDhuiyuan";
    public static final String ENABLE_DIAL_MARKET_REVAMP = "superAppSocialPageConfig/enableDialMarketRevamp";
    public static final String ENABLE_DIAL_MARKET_REVAMP_OVERSEAS = "superAppOtherPageConfig/enableDialMarketRevamp";
    public static final String ENABLE_DIAL_VIP = "superAppXPageConfig/dial_vip_price";
    public static final String ENABLE_DIET_ENTRY = "superAppMyPageConfig/enableDietEntry";
    public static final String ENABLE_EXPRESS_AD = "superAppXPageConfig/feed4csj";
    public static final String ENABLE_FEEDBACK_LOG_REPORT = "superAppVideoPageConfig/enableFeedbackLogReport";
    public static final String ENABLE_FEED_AD_REFRESH = "superAppAIPageConfig/feedAdRefresh";
    public static final String ENABLE_FEED_VIDEO_AD = "superAppXPageConfig/enableAdssigmob";
    public static final String ENABLE_FOLLOW_FOCUS = "superAppXPageConfig/superAppFocus";
    public static final String ENABLE_GIFT_REWARD = "superAppGamePageConfig/enableGiftReward";
    public static final String ENABLE_HEALTH_DIARY = "superAppFirstPageConfig/enableHealthDiary";
    public static final String ENABLE_HEALTH_SCENE = "superAppFirstPageConfig/enableHealthScene";
    public static final String ENABLE_HEILIUYOUHUA = "superAppServiceConfig/Heiliuyouhua";
    public static final String ENABLE_HOT_AD = "superAppXPageConfig/reqikaiping";
    public static final String ENABLE_HOT_CACHE_FILL = "superAppOtherPageConfig/androidHotCacheFill";
    public static final String ENABLE_HOT_CACHE_TIME_INTERVAL = "superAppOtherPageConfig/androidHotCacheTimeInterval";
    public static final String ENABLE_HOT_INTERVAL = "superAppXPageConfig/jiangeshijian";
    public static final String ENABLE_HOT_SPLASH_CACHE = "superAppAIPageConfig/androidreqihuancun";
    public static final String ENABLE_HTTP_DNS = "superAppMyPageConfig/enableHttpDns";
    public static final String ENABLE_I18N_PRECISION = "superAppMyPageConfig/enableI18nPrecision";
    public static final String ENABLE_IMAGE_TEXT = "superAppShoppingPageConfig/enableImageText";
    public static final String ENABLE_MAIDIAN_REFACTOR = "superAppXPageConfig/maidianRefactor";
    public static final String ENABLE_MAIN_BOTTOM_NOVEL = "superAppServiceConfig/xiaoShuoTab";
    public static final String ENABLE_MEDAL = "superAppMyPageConfig/enableMyMedal";
    public static final String ENABLE_MENU_HOMEPAGE = "superAppServiceOptimizeConfig/feed2";
    public static final String ENABLE_MENU_HOMEPAGE_CONFIG = "superAppServiceOptimizeConfig/homepage";
    public static final String ENABLE_MENU_HOMEPAGE_FUNCTION_CONFIG = "superAppServiceOptimizeConfig/homeContainer";
    public static final String ENABLE_MINI_MUSIC = "superAppDevicePageConfig/enableMiniMusic";
    public static final String ENABLE_MUSIC_RECOMMEND = "superAppSocialPageConfig/enableMusicRecommend";
    public static final String ENABLE_MY_YOU_XI = "superAppFirstPageConfig/myyouxi";
    public static final String ENABLE_NATIVE_DIAL_MAIN = "superAppSocialPageConfig/androidDialMainAd";
    public static final String ENABLE_NEWS_BLOG = "superAppMyPageConfig/newsblogEnable";
    public static final String ENABLE_NEWS_BLOG_PANEL = "superAppMyPageConfig/newsblogPanelEnable";
    public static final String ENABLE_NEWS_BLOG_TOP_ENTRY = "superAppMyPageConfig/newsblogTopEntryEnable";
    public static final String ENABLE_NEW_MINE_UI = "superAppGamePageConfig/newMineUi";
    public static final String ENABLE_NEW_MINE_UI_OVERSEAS = "superAppXPageConfig/newMineUi";
    public static final String ENABLE_NORDIC_BLE_STACK = "superAppServiceOptimizeConfig/enableNordicBleStack";
    public static final String ENABLE_NOTICE_JUMP_MAIN_PAGE = "superAppShoppingPageConfig/noticeConfig/enableJumpMainPage";
    public static final String ENABLE_NOTICE_PERSISTENT = "superAppShoppingPageConfig/noticeConfig/enablePersistentNotice";
    public static final String ENABLE_NOTICE_RICH_TEXT = "superAppShoppingPageConfig/noticeConfig/enableRichText";
    public static final String ENABLE_NOVEL_POP = "superAppAIPageConfig/enableAITools";
    public static final String ENABLE_OFFLINE_VIDEO = "superAppMyPageConfig/removeVideoModule";
    public static final String ENABLE_OVERSEAD_DIAL_PAYMENT = "superAppServiceOptimizeConfig/Biaopan";
    public static final String ENABLE_OVERSEAS_HOMEPAGE_CONFIG = "superAppShoppingPageConfig/homepage";
    public static final String ENABLE_OVERSEAS_HOMEPAGE_FUNCTION_CONFIG = "superAppShoppingPageConfig/homeContainer";
    public static final String ENABLE_OVERSEAS_MAIDIAN_REFACTOR = "superAppAIPageConfig/maidianRefactor";
    public static final String ENABLE_OVERSEAS_MUSIC_RECOMMEND = "superAppFirstPageConfig/enableMusicRecommend";
    public static final String ENABLE_OVERSEAS_SPEEDUP = "superAppOtherPageConfig/speedup";
    public static final String ENABLE_OVERSEAS_TAKU = "superAppShoppingPageConfig/enableTaKuConfigure";
    public static final String ENABLE_OVERSEA_TAKU_HOT_CACHE = "superAppShoppingPageConfig/androidTakuHotCache";
    public static final String ENABLE_PLAYER_OPTIMIZE = "superAppVideoPageConfig/enableVideoOptimizing";
    public static final String ENABLE_PUBLISH_IMAGE_TEXT = "superAppShoppingPageConfig/enablePublishImageText";
    public static final String ENABLE_PUSH_SPLASH_AD = "superAppSocialPageConfig/isHavePushAd";
    public static final String ENABLE_PUSH_SPLASH_AD_OVERSEAS = "superAppVideoPageConfig/isHavePushAd";
    public static final String ENABLE_QUMENG_AD = "superAppAIPageConfig/qumengGD";
    public static final String ENABLE_RETURN_USER_CARD = "superAppSocialPageConfig/enableReturnUserCard";
    public static final String ENABLE_RN_SEARCH = "superAppVideoPageConfig/newsearch";
    public static final String ENABLE_SHORT_TV = "superAppGamePageConfig/shorttv";
    public static final String ENABLE_SHORT_TV_CHANGE = "superAppGamePageConfig/shorttvchange";
    public static final String ENABLE_SHOU_YE_YOU_XI = "superAppFirstPageConfig/shouyeyouxi";
    public static final String ENABLE_SKIP_NOTIFICATION = "superAppShoppingPageConfig/isSkipNotify";
    public static final String ENABLE_SPLASH_LIVE = "superAppAIPageConfig/androidSplashLive";
    public static final String ENABLE_SPLASH_LIVE_TIME_INTERVAL = "superAppAIPageConfig/androidSplashLiveTimeInterval";
    public static final String ENABLE_STEP_CHALLENGE = "superAppSocialPageConfig/enableStepChallenge";
    public static final String ENABLE_SUPER_APP_AI_PAGE_CONFIG = "superAppAIPageConfig";
    public static final String ENABLE_VIDEO_DETAIL_AD = "superAppSocialPageConfig/blackAds";
    public static final String ENABLE_VIDEO_SHARE = "superAppOtherPageConfig/enableShare";
    public static final String ENABLE_VIDEO_SHARE_2 = "superAppOtherPageConfig/enableShare2";
    public static final String ENABLE_WANGMAI = "superAppAIPageConfig/wangmai";
    public static final String ENABLE_WATCH_CONNECT = "superAppServiceOptimizeConfig/duanliangoumai";
    public static final String ENABLE_WATCH_CONNECT_OVERSEA = "superAppOtherPageConfig/duanliangoumai";
    public static final String ENABLE_WATCH_MULTIPLE = "superAppServiceConfig/biaopanchange";
    public static final String ENABLE_WATCH_MULTIPLE_OVERSEA = "superAppAIPageConfig/biaopanchange";
    public static final String ENABLE_WATCH_RECOVERY_A = "superAppSocialPageConfig/enablewatchrecoveryA";
    public static final String ENABLE_WATCH_RECOVERY_B = "superAppSocialPageConfig/enablewatchrecoveryB";
    public static final String ENABLE_WATCH_TIP = "superAppVideoPageConfig/newBlueTooth";
    public static final String ENABLE_WEAK_NETWORK_P0 = "superAppVideoPageConfig/weakNetworkP0";
    public static final String ENABLE_WEAK_NETWORK_P0_OVERSEAS = "superAppDevicePageConfig/weakNetworkP0";
    public static final String ENABLE_YUEDONG = "superAppAIPageConfig/shuziyuedong";
    public static final String FULI_REWARD_AD_CONFIG = "superAppSocialPageConfig/fuliRewardAdConfig";
    public static final String HOME_SLOT_CONFIG = "superAppSocialPageConfig/homeSlotConfig";
    public static final String HOME_SLOT_CONFIG_PLATFORM = "superAppSocialPageConfig/homeSlotConfigPlatform";
    public static final String LOW_END_MEM_THRESHOLD_GB = "superAppAIPageConfig/lowEndMemThresholdGb";
    public static final String LOW_END_MEM_THRESHOLD_GB_OVERSEAS = "superAppDevicePageConfig/lowEndMemThresholdGb";
    public static final String OVERSEAS_ENABLE_FOLLOW_PUBLISHER_LIST = "superAppVideoPageConfig/enableFollowPublisherList";
    public static final NorthStartConfigs INSTANCE = new NorthStartConfigs();
    public static final String ENABLE_BIAOPAN_SEARCH = "superAppAIPageConfig/biaopansearch";
    public static final String ENABLE_HOT_SEARCH = "superAppDevicePageConfig/enableSearchTrendAndGuide";
    public static final String ENABLE_UNIFIED_DOMAIN = "superAppServiceOptimizeConfig/timeConsuming";
    public static final String ENABLE_APM_PUSH = "superAppServiceConfig/enableApmLogPush";
    public static final String ENABLE_FOLLOW_PUBLISHER_LIST = "superAppServiceConfig/enableFollowPublisherList";
    public static final String ENABLE_FULL_SPEED = "superAppSocialPageConfig/enableFullandSpeed";
    public static final String ENABLE_SHORT_TV_TAB = "superAppGamePageConfig/shorttvtab";
    public static final String ENABLE_SHORT_TV_NEW = "superAppGamePageConfig/shorttvnew";
    public static final String ENABLE_CLEAR_UNREAD_RED = "superAppVideoPageConfig/clearUnreadRed";
    public static final String ENABLE_HOME_FEED_VIDEO_RATIO = "superAppVideoPageConfig/biCardResize";
    public static final String ENABLE_COMMENT = "superAppVideoPageConfig/enableComment";
    public static final String ENABLE_NOVEL_TAB = "superAppFirstPageConfig/NovelTab";
    public static final String ENABLE_FOLLOW = "superAppFirstPageConfig/enableFollow";
    private static final Map<String, Boolean> defaultConfigs = MapsKt.mapOf(TuplesKt.to(ENABLE_BIAOPAN_SEARCH, true), TuplesKt.to(ENABLE_HOT_SEARCH, true), TuplesKt.to(ENABLE_UNIFIED_DOMAIN, true), TuplesKt.to(ENABLE_APM_PUSH, false), TuplesKt.to(ENABLE_FOLLOW_PUBLISHER_LIST, true), TuplesKt.to(ENABLE_FULL_SPEED, false), TuplesKt.to(ENABLE_SHORT_TV_TAB, true), TuplesKt.to(ENABLE_SHORT_TV_NEW, true), TuplesKt.to(ENABLE_CLEAR_UNREAD_RED, true), TuplesKt.to(ENABLE_HOME_FEED_VIDEO_RATIO, true), TuplesKt.to(ENABLE_COMMENT, true), TuplesKt.to(ENABLE_NOVEL_TAB, true), TuplesKt.to(ENABLE_FOLLOW, true));
    public static final String ENABLE_OVERSEAS_MEMBERS = "superAppOtherPageConfig/overseasmembers";
    public static final String ENABLE_OVERSEA_CLEAR_UNREAD_RED = "superAppMyPageConfig/clearUnreadRed";
    private static final Map<String, Boolean> overSeaDefaultConfigs = MapsKt.mapOf(TuplesKt.to(ENABLE_BIAOPAN_SEARCH, true), TuplesKt.to(ENABLE_UNIFIED_DOMAIN, true), TuplesKt.to(ENABLE_APM_PUSH, false), TuplesKt.to(ENABLE_OVERSEAS_MEMBERS, true), TuplesKt.to(ENABLE_FULL_SPEED, false), TuplesKt.to(ENABLE_OVERSEA_CLEAR_UNREAD_RED, true), TuplesKt.to(ENABLE_COMMENT, true), TuplesKt.to(ENABLE_HOME_FEED_VIDEO_RATIO, true));

    private NorthStartConfigs() {
    }

    @JvmStatic
    public static final String newMineUiKey() {
        return ENABLE_NEW_MINE_UI_OVERSEAS;
    }

    public final String weakNetworkP0Key(boolean isOverseas) {
        return isOverseas ? ENABLE_WEAK_NETWORK_P0_OVERSEAS : ENABLE_WEAK_NETWORK_P0;
    }

    @JvmStatic
    public static final String pushSplashAdKey() {
        return ENABLE_PUSH_SPLASH_AD_OVERSEAS;
    }

    @JvmStatic
    public static final String adUnlockDialKey() {
        return ENABLE_AD_UNLOCK_DIAL_OVERSEAS;
    }

    @JvmStatic
    public static final String adUnlockDialConfigKey() {
        return AD_UNLOCK_DIAL_CONFIG_OVERSEAS;
    }

    @JvmStatic
    public static final String aiMusicEntryKey() {
        return ENABLE_AI_MUSIC_ENTRY_OVERSEAS;
    }

    @JvmStatic
    public static final String devicePerfOptKey() {
        return ENABLE_DEVICE_PERF_OPT_OVERSEAS;
    }

    @JvmStatic
    public static final String lowEndMemThresholdGbKey() {
        return LOW_END_MEM_THRESHOLD_GB_OVERSEAS;
    }

    public final Object getDefaultConfig(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return overSeaDefaultConfigs.get(key);
    }
}
