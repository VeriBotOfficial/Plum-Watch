package com.wakeup.module.gpt;

import android.content.Context;
import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.Constants;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.common.storage.DeviceDao;
import com.wakeup.commponent.ServiceManager;
import com.wakeup.commponent.api.GptService;
import com.wakeup.commponent.module.device.DeviceManagerService;
import com.wakeup.module.gpt.entity.ChatGptEntity;
import com.wakeup.module.gpt.order.GptOrder;
import com.wakeup.module.gpt.order.WatchGptAnalyzer;
import com.wakeup.module.gpt.utils.ChatGptCacheMgr;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GptServiceImpl.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/wakeup/module/gpt/GptServiceImpl;", "Lcom/wakeup/commponent/api/GptService;", "<init>", "()V", "TAG", "", "init", "", "context", "Landroid/content/Context;", "sendNotesToDevice", "feature-gpt_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GptServiceImpl implements GptService {
    private final String TAG = "GptServiceImpl";

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
        ServiceManager.getDeviceService().addAnalyzer(new WatchGptAnalyzer());
    }

    @Override // com.wakeup.commponent.api.GptService
    public void sendNotesToDevice() {
        String question;
        String answer;
        DeviceManagerService deviceService = ServiceManager.getDeviceService();
        if (!deviceService.isConnected()) {
            LogUtils.i(this.TAG, "sendNotesToDevice device is not connect");
            return;
        }
        if (!DeviceDao.isSupport(133) || !CacheManager.INSTANCE.getBoolean(Constants.SPKey.CHAT_GPT_SWITCH)) {
            LogUtils.i(this.TAG, "sendNotesToDevice is not support");
            return;
        }
        List<ChatGptEntity> notes = ChatGptCacheMgr.INSTANCE.getNotes();
        deviceService.sendData(GptOrder.clearGptTodo());
        if (CollectionUtils.isEmpty(notes)) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        ArrayList arrayList = new ArrayList();
        for (Object obj : notes) {
            if (((ChatGptEntity) obj).getTodoTime() > currentTimeMillis) {
                arrayList.add(obj);
            }
        }
        List<ChatGptEntity> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (mutableList.size() > 5) {
            mutableList = mutableList.subList(0, 5);
        }
        for (ChatGptEntity chatGptEntity : mutableList) {
            if (!TextUtils.isEmpty(chatGptEntity.getQuestion()) && chatGptEntity.getQuestion().length() > 30) {
                question = chatGptEntity.getQuestion().substring(0, 30);
                Intrinsics.checkNotNullExpressionValue(question, "substring(...)");
            } else {
                question = chatGptEntity.getQuestion();
            }
            if (!TextUtils.isEmpty(chatGptEntity.getAnswer())) {
                String answer2 = chatGptEntity.getAnswer();
                Intrinsics.checkNotNull(answer2);
                if (answer2.length() > 300) {
                    String answer3 = chatGptEntity.getAnswer();
                    Intrinsics.checkNotNull(answer3);
                    answer = answer3.substring(0, 300);
                    Intrinsics.checkNotNullExpressionValue(answer, "substring(...)");
                    LogUtils.i(this.TAG, "sendData 备忘录 " + question);
                    deviceService.sendData(GptOrder.sendGptTodo(chatGptEntity.getTodoTime(), question, answer, chatGptEntity.getId()));
                }
            }
            answer = chatGptEntity.getAnswer();
            if (answer == null) {
                answer = "";
            }
            LogUtils.i(this.TAG, "sendData 备忘录 " + question);
            deviceService.sendData(GptOrder.sendGptTodo(chatGptEntity.getTodoTime(), question, answer, chatGptEntity.getId()));
        }
    }
}
