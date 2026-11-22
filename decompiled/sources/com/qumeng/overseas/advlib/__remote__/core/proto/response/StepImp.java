package com.qumeng.overseas.advlib.__remote__.core.proto.response;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public class StepImp extends JSONBeanFrm {
    public static String EVENT_COMPLETE = "complete";
    public static String EVENT_EXIT = "exit";
    public static String EVENT_PAUSE = "pause";
    public static String EVENT_START = "start";
    public String event;
    public List<String> imp_url;
    public int time;

    public StepImp() {
        this.imp_url = Collections.EMPTY_LIST;
    }

    public String getEvent() {
        return this.event;
    }

    public List<String> getImp_url() {
        return this.imp_url;
    }

    public int getTime() {
        return this.time;
    }

    public void setEvent(String str) {
        this.event = str;
    }

    public void setImp_url(List<String> list) {
        this.imp_url = list;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public StepImp(int i, List<String> list) {
        List list2 = Collections.EMPTY_LIST;
        this.time = i;
        this.imp_url = list;
    }
}
