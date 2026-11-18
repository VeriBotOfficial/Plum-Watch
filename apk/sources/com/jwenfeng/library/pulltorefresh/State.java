package com.jwenfeng.library.pulltorefresh;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class State {
    public static final int LOADMORE = 11;
    public static final int REFRESH = 10;

    @Retention(RetentionPolicy.SOURCE)
    public @interface REFRESH_STATE {
    }
}
