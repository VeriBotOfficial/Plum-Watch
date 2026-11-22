package com.qumeng.overseas.advlib.__remote__.framework.DownloadManUtils.db.salvage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes17.dex */
public class SalvageConfigBean implements Serializable {
    public String db_name;
    public String fix_url;
    public List<TableBean> table;

    public static class TableBean implements Serializable {
        public String limit;
        public String order_by;
        public String tab_name;
        public List<String> title;

        public String getLimit() {
            return this.limit;
        }

        public String getOrder_by() {
            return this.order_by;
        }

        public String getTab_name() {
            return this.tab_name;
        }

        public List<String> getTitle() {
            return this.title;
        }

        public void setLimit(String str) {
            this.limit = str;
        }

        public void setOrder_by(String str) {
            this.order_by = str;
        }

        public void setTab_name(String str) {
            this.tab_name = str;
        }

        public void setTitle(List<String> list) {
            this.title = list;
        }
    }

    public String getDb_name() {
        return this.db_name;
    }

    public String getFix_url() {
        return this.fix_url;
    }

    public List<TableBean> getTable() {
        return this.table;
    }

    public void setDb_name(String str) {
        this.db_name = str;
    }

    public void setFix_url(String str) {
        this.fix_url = str;
    }

    public void setTable(List<TableBean> list) {
        this.table = list;
    }
}
