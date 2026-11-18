package com.qumeng.overseas.advlib.__remote__.framework.config.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public class CachePoolEntity implements Serializable {
    public int enable = 0;
    public int ad_limit = 0;
    public int adslot_cache_limit = 3;
    public int show_callback_time = 1800;
    public int cache_expire_time = 1800;
    public int no_content_freq = 2;
    public int no_content_cache_expire_time = 300;
}
