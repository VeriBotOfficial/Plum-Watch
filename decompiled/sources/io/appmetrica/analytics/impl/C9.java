package io.appmetrica.analytics.impl;

import com.heytap.mcssdk.constant.MessageConstant;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes6.dex */
public abstract class C9 {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f17794a;
    public static final EnumSet b;
    public static final EnumSet c;
    public static final EnumSet d;
    public static final EnumSet e;
    public static final EnumSet f;
    public static final EnumSet g;
    public static final EnumSet h;
    public static final List i;
    public static final List j;

    static {
        EnumC3271hb enumC3271hb = EnumC3271hb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        EnumC3271hb enumC3271hb2 = EnumC3271hb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        EnumC3271hb enumC3271hb3 = EnumC3271hb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        EnumC3271hb enumC3271hb4 = EnumC3271hb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        EnumC3271hb enumC3271hb5 = EnumC3271hb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_INTENT;
        EnumC3271hb enumC3271hb6 = EnumC3271hb.EVENT_TYPE_ANR;
        f17794a = CollectionUtils.unmodifiableSetOf(5892, 5896, 5891, 5889, 5890, 5968);
        EnumC3271hb enumC3271hb7 = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        EnumC3271hb enumC3271hb8 = EnumC3271hb.EVENT_TYPE_PURGE_BUFFER;
        EnumC3271hb enumC3271hb9 = EnumC3271hb.EVENT_TYPE_SEND_REFERRER;
        EnumC3271hb enumC3271hb10 = EnumC3271hb.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        EnumC3271hb enumC3271hb11 = EnumC3271hb.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        EnumC3271hb enumC3271hb12 = EnumC3271hb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        EnumC3271hb enumC3271hb13 = EnumC3271hb.EVENT_TYPE_SET_SESSION_EXTRA;
        b = EnumSet.of(enumC3271hb7, enumC3271hb8, enumC3271hb9, enumC3271hb10, enumC3271hb11, EnumC3271hb.EVENT_TYPE_ACTIVATION, enumC3271hb12, enumC3271hb13);
        c = EnumSet.of(EnumC3271hb.EVENT_TYPE_UPDATE_FOREGROUND_TIME, enumC3271hb4);
        EnumC3271hb enumC3271hb14 = EnumC3271hb.EVENT_TYPE_REGULAR;
        d = EnumSet.of(enumC3271hb4, enumC3271hb5, enumC3271hb3, enumC3271hb, enumC3271hb2, EnumC3271hb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, enumC3271hb12, enumC3271hb14, EnumC3271hb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, EnumC3271hb.EVENT_TYPE_SEND_ECOMMERCE_EVENT, EnumC3271hb.EVENT_TYPE_SEND_REVENUE_EVENT, EnumC3271hb.EVENT_TYPE_SEND_AD_REVENUE_EVENT, enumC3271hb8, EnumC3271hb.EVENT_TYPE_INIT, EnumC3271hb.EVENT_TYPE_SEND_USER_PROFILE, EnumC3271hb.EVENT_TYPE_SET_USER_PROFILE_ID, enumC3271hb9, enumC3271hb10, enumC3271hb11, EnumC3271hb.EVENT_TYPE_FIRST_ACTIVATION, EnumC3271hb.EVENT_TYPE_START, EnumC3271hb.EVENT_TYPE_APP_OPEN, EnumC3271hb.EVENT_TYPE_APP_UPDATE, enumC3271hb6);
        e = EnumSet.of(enumC3271hb14);
        f = EnumSet.of(enumC3271hb14);
        g = EnumSet.of(enumC3271hb12);
        h = EnumSet.of(EnumC3271hb.EVENT_TYPE_ALIVE, enumC3271hb8, enumC3271hb13);
        i = Arrays.asList(0, 6145, 4097, 8224);
        EnumC3271hb enumC3271hb15 = EnumC3271hb.EVENT_TYPE_UNDEFINED;
        j = Arrays.asList(Integer.valueOf(MessageConstant.CommandId.COMMAND_UNREGISTER));
    }
}
