package com.wakeup.feature.user;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: GradeImgUtils.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/wakeup/feature/user/GradeImgUtils;", "", "<init>", "()V", "getUserGradImg", "", "level", "feature-user_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GradeImgUtils {
    public static final GradeImgUtils INSTANCE = new GradeImgUtils();

    private GradeImgUtils() {
    }

    @JvmStatic
    public static final int getUserGradImg(int level) {
        switch (level) {
            case 1:
                return R.drawable.ic_user_lv1;
            case 2:
                return R.drawable.ic_user_lv2;
            case 3:
                return R.drawable.ic_user_lv3;
            case 4:
                return R.drawable.ic_user_lv4;
            case 5:
                return R.drawable.ic_user_lv5;
            case 6:
                return R.drawable.ic_user_lv6;
            case 7:
                return R.drawable.ic_user_lv7;
            case 8:
                return R.drawable.ic_user_lv8;
            case 9:
                return R.drawable.ic_user_lv9;
            case 10:
                return R.drawable.ic_user_lv10;
            case 11:
                return R.drawable.ic_user_lv11;
            case 12:
                return R.drawable.ic_user_lv12;
            case 13:
                return R.drawable.ic_user_lv13;
            case 14:
                return R.drawable.ic_user_lv14;
            case 15:
                return R.drawable.ic_user_lv15;
            case 16:
                return R.drawable.ic_user_lv16;
            case 17:
                return R.drawable.ic_user_lv17;
            case 18:
                return R.drawable.ic_user_lv18;
            default:
                return R.drawable.ic_user_lv1;
        }
    }
}
