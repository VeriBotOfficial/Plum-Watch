package com.wakeup.common.storage.model;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class DeviceAdvEntity {
    private Map<String, Entity> map;

    public Map<String, Entity> getMap() {
        return this.map;
    }

    public void setMap(Map<String, Entity> map) {
        this.map = map;
    }

    public static class Entity {

        /* renamed from: id, reason: collision with root package name */
        String f14276id = "";
        String title = "";
        String img = "";
        String jumpType = "";
        String url = "";
        int pageId = 0;
        int popFrequency = 0;

        public String getId() {
            return this.f14276id;
        }

        public void setId(String id2) {
            this.f14276id = id2;
        }

        public String getTitle() {
            return this.title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImg() {
            return this.img;
        }

        public void setImg(String img) {
            this.img = img;
        }

        public String getJumpType() {
            return this.jumpType;
        }

        public void setJumpType(String jumpType) {
            this.jumpType = jumpType;
        }

        public String getUrl() {
            return this.url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public int getPageId() {
            return this.pageId;
        }

        public void setPageId(int pageId) {
            this.pageId = pageId;
        }

        public int getPopFrequency() {
            return this.popFrequency;
        }

        public void setPopFrequency(int popFrequency) {
            this.popFrequency = popFrequency;
        }

        public String toString() {
            return "Entity{id='" + this.f14276id + "', title='" + this.title + "', img='" + this.img + "', jumpType='" + this.jumpType + "', url='" + this.url + "', pageId=" + this.pageId + ", popFrequency=" + this.popFrequency + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
