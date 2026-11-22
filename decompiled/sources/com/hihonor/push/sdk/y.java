package com.hihonor.push.sdk;

import android.text.TextUtils;
import java.util.Arrays;

/* loaded from: classes11.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    public final String f10167a;
    public final int b;

    public y(String str) {
        String a2 = a(str);
        this.f10167a = a2;
        this.b = a(a2);
    }

    public static int a(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static y b(String str) {
        return new y(str);
    }

    public final String a(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "up_msg_turn_on_push":
            case "up_msg_query_push_status":
            case "up_msg_request_push_token":
            case "up_msg_turn_off_push":
            case "up_msg_unregister_push_token":
                return "push_type_default";
            default:
                return str;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        return TextUtils.equals(this.f10167a, ((y) obj).f10167a);
    }

    public final int hashCode() {
        return this.b;
    }
}
