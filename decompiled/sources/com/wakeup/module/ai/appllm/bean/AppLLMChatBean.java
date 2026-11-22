package com.wakeup.module.ai.appllm.bean;

import com.blankj.utilcode.util.GsonUtils;
import com.chad.library.adapter.base.entity.MultiItemEntity;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLLMChatBean.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001b\u001a\u00020\u001cR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/module/ai/appllm/bean/AppLLMChatBean;", "Lcom/chad/library/adapter/base/entity/MultiItemEntity;", "id", "", "data", "itemType", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getData", "setData", "(Ljava/lang/String;)V", "getItemType", "()I", "isSelect", "", "()Z", "setSelect", "(Z)V", "isPlay", "setPlay", "getText", "updateText", "", "text", "getMusicInfo", "Lcom/wakeup/module/ai/appllm/bean/MusicData;", "Companion", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public class AppLLMChatBean implements MultiItemEntity {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int QUERY_IMG = 1;
    public static final int QUERY_TEXT = 0;
    public static final int RESULT_MUSIC = 1001;
    public static final int RESULT_TEXT = 1000;
    private String data;
    private final String id;
    private transient boolean isPlay;
    private transient boolean isSelect;
    private final int itemType;

    public AppLLMChatBean(String id2, String data, int i) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = id2;
        this.data = data;
        this.itemType = i;
    }

    public final String getId() {
        return this.id;
    }

    public final String getData() {
        return this.data;
    }

    public final void setData(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }

    /* compiled from: AppLLMChatBean.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nJ\u000e\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nJ\u001e\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/module/ai/appllm/bean/AppLLMChatBean$Companion;", "", "<init>", "()V", "QUERY_TEXT", "", "QUERY_IMG", "RESULT_TEXT", "RESULT_MUSIC", "generateId", "", "createQueryText", "Lcom/wakeup/module/ai/appllm/bean/AppLLMChatBean;", "text", "createQueryImg", "imgPath", "createResultText", "createResultMusic", "name", "singer", "path", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final String generateId() {
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            return uuid;
        }

        public final AppLLMChatBean createQueryText(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            String json = GsonUtils.getGson().toJson(new StringData(text));
            String generateId = generateId();
            Intrinsics.checkNotNull(json);
            return new AppLLMChatBean(generateId, json, 0);
        }

        public final AppLLMChatBean createQueryImg(String imgPath) {
            Intrinsics.checkNotNullParameter(imgPath, "imgPath");
            String json = GsonUtils.getGson().toJson(new StringData(imgPath));
            String generateId = generateId();
            Intrinsics.checkNotNull(json);
            return new AppLLMChatBean(generateId, json, 1);
        }

        public final AppLLMChatBean createResultText(String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            String json = GsonUtils.getGson().toJson(new StringData(text));
            String generateId = generateId();
            Intrinsics.checkNotNull(json);
            return new AppLLMChatBean(generateId, json, 1000);
        }

        public final AppLLMChatBean createResultMusic(String name, String singer, String path) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(singer, "singer");
            Intrinsics.checkNotNullParameter(path, "path");
            String json = GsonUtils.getGson().toJson(new MusicData(name, singer, path));
            String generateId = generateId();
            Intrinsics.checkNotNull(json);
            return new AppLLMChatBean(generateId, json, 1001);
        }
    }

    /* renamed from: isSelect, reason: from getter */
    public final boolean getIsSelect() {
        return this.isSelect;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    /* renamed from: isPlay, reason: from getter */
    public final boolean getIsPlay() {
        return this.isPlay;
    }

    public final void setPlay(boolean z) {
        this.isPlay = z;
    }

    public final String getText() {
        return ((StringData) GsonUtils.getGson().fromJson(this.data, StringData.class)).getText();
    }

    public final void updateText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        StringData stringData = (StringData) GsonUtils.getGson().fromJson(this.data, StringData.class);
        stringData.setText(text);
        this.data = GsonUtils.getGson().toJson(stringData);
    }

    public final MusicData getMusicInfo() {
        Object fromJson = GsonUtils.getGson().fromJson(this.data, (Class<Object>) MusicData.class);
        Intrinsics.checkNotNullExpressionValue(fromJson, "fromJson(...)");
        return (MusicData) fromJson;
    }
}
