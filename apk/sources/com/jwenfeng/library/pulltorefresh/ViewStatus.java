package com.jwenfeng.library.pulltorefresh;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes2.dex */
public class ViewStatus {
    public static final int CONTENT_STATUS = 0;
    public static final int EMPTY_STATUS = 2;
    public static final int ERROR_STATUS = 3;
    public static final int LOADING_STATUS = 1;

    @Retention(RetentionPolicy.SOURCE)
    public @interface VIEW_STATUS {
    }
}
