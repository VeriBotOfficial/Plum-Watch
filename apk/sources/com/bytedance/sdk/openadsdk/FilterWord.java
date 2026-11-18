package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class FilterWord {
    private String fxn;
    private boolean gff;
    private List<FilterWord> hm;
    private String kg;

    public FilterWord(String str, String str2) {
        this.fxn = str;
        this.kg = str2;
    }

    public FilterWord() {
    }

    public String getId() {
        return this.fxn;
    }

    public void setId(String str) {
        this.fxn = str;
    }

    public String getName() {
        return this.kg;
    }

    public void setName(String str) {
        this.kg = str;
    }

    public boolean getIsSelected() {
        return this.gff;
    }

    public void setIsSelected(boolean z) {
        this.gff = z;
    }

    public List<FilterWord> getOptions() {
        return this.hm;
    }

    public void addOption(FilterWord filterWord) {
        if (filterWord == null) {
            return;
        }
        if (this.hm == null) {
            this.hm = new ArrayList();
        }
        this.hm.add(filterWord);
    }

    public boolean isValid() {
        return (TextUtils.isEmpty(this.fxn) || TextUtils.isEmpty(this.kg)) ? false : true;
    }

    public boolean hasSecondOptions() {
        List<FilterWord> list = this.hm;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof FilterWord)) {
            return false;
        }
        FilterWord filterWord = (FilterWord) obj;
        return filterWord.getId().equals(getId()) && filterWord.getName().equals(getName());
    }
}
