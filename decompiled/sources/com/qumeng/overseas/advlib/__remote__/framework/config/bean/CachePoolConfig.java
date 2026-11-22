package com.qumeng.overseas.advlib.__remote__.framework.config.bean;

import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
public class CachePoolConfig extends CachePoolEntity {
    public Map<String, CachePoolEntity> adslots;
    public List<Integer> type_black_list;
    public int total_ad_limit = 0;
    public String adslot_white_list = "";
}
