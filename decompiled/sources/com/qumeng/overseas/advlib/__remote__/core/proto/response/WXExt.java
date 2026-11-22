package com.qumeng.overseas.advlib.__remote__.core.proto.response;

import com.qumeng.overseas.advlib.__remote__.utils.JSONBeanFrm;

/* loaded from: classes17.dex */
public class WXExt extends JSONBeanFrm {
    public String binded_app;
    public String program_id;
    public String program_path;
    public int release_type;

    public String getBinded_app() {
        return this.binded_app;
    }

    public String getProgram_id() {
        return this.program_id;
    }

    public String getProgram_path() {
        return this.program_path;
    }

    public int getRelease_type() {
        return this.release_type;
    }

    public void setBinded_app(String str) {
        this.binded_app = str;
    }

    public void setProgram_id(String str) {
        this.program_id = str;
    }

    public void setProgram_path(String str) {
        this.program_path = str;
    }

    public void setRelease_type(int i) {
        this.release_type = i;
    }
}
