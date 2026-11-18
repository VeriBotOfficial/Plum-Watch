package com.qumeng.overseas.advlib.__remote__.framework.config.bean;

import com.qumeng.overseas.advlib.__remote__.ui.elements.j;
import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class BlockFeature implements Serializable {
    public static final List<String> DEFAULT_FEATURES = Arrays.asList(j.o, j.B, j.f13114q, j.d0, j.H, j.I);
    public List<String> features;
    public List<String> survey_app_list;
    public int enable = 1;
    public int is_only_qm = 0;
}
