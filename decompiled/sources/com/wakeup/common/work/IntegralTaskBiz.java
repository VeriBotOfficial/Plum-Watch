package com.wakeup.common.work;

import com.wakeup.common.network.BaseObserver;
import com.wakeup.common.network.NetworkScheduler;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.network.entity.user.SaveBatchIntegralRecordModel;
import com.wakeup.common.storage.IntegralTaskDao;
import com.wakeup.common.storage.UserDao;
import com.wakeup.common.storage.model.IntegralTask;
import com.wakeup.common.storage.model.UserModel;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class IntegralTaskBiz {
    public static final int TASK_EVERYDAY_3KM = 6;
    public static final int TASK_EVERYDAY_3LIKE = 10;
    public static final int TASK_EVERYDAY_8000_STEP = 7;
    public static final int TASK_EVERYDAY_FAMILY_HEALTH = 12;
    public static final int TASK_EVERYDAY_LEARN_COURSE = 8;
    public static final int TASK_EVERYDAY_LOOK_AD = 11;
    public static final int TASK_EVERYDAY_LOOK_AD_VIDEO = 30;
    public static final int TASK_EVERYDAY_SHARE = 9;
    public static final int TASK_FIRST_BIND_DEVICE = 2;
    public static final int TASK_FIRST_LEARN_COURSE = 4;
    public static final int TASK_FIRST_SHARE = 3;
    public static final int TASK_OTHER_INSTALL_DIAL = 13;
    public static final int TASK_OTHER_MEDAL = 15;
    public static final int TASK_OTHER_USER_GRADE = 16;
    public static final int TASK_OTHER_VIP = 14;
    public static final int TASK_USER_INFO = 1;
    public static final int TASK_VIP = 5;

    public static void integralTaskDone(int taskId) {
        integralTaskDone(taskId, 1.0f, 0);
    }

    public static void integralTaskDone(int taskId, float value, int type) {
        IntegralTask findTask = IntegralTaskDao.findTask(taskId);
        if (findTask == null || findTask.isOver() == 1 || findTask.getCurrentValue() >= findTask.getComparingValue()) {
            return;
        }
        if (type == 0) {
            findTask.addCurrentValue(value);
        } else {
            findTask.setCurrentValue(value);
        }
        IntegralTaskDao.setTask(findTask);
        if (taskId == 14 || taskId == 13) {
            final ArrayList arrayList = new ArrayList();
            arrayList.add(new SaveBatchIntegralRecordModel(System.currentTimeMillis() / 1000, findTask.getId(), findTask.getTaskScore()));
            RetrofitManager.getInstance().getApiUser().saveBatchIntegralRecord(arrayList).compose(NetworkScheduler.INSTANCE.compose()).subscribe(new BaseObserver<Object>() { // from class: com.wakeup.common.work.IntegralTaskBiz.1
                @Override // com.wakeup.common.network.BaseObserver
                public void onSuccess(Object data) {
                    IntegralTaskBiz.saveLocalScore(arrayList);
                }
            });
        }
    }

    public static int getSignIntegral(int count) {
        List<IntegralTask> findTasks = IntegralTaskDao.findTasks(4);
        if (findTasks.isEmpty()) {
            return 0;
        }
        if (count < 0) {
            count = 0;
        } else if (count + 1 > findTasks.size()) {
            count = findTasks.size() - 1;
        }
        return findTasks.get(count).getTaskScore();
    }

    public static void saveLocalScore(List<SaveBatchIntegralRecordModel> recordList) {
        int i = 0;
        for (SaveBatchIntegralRecordModel saveBatchIntegralRecordModel : recordList) {
            i += saveBatchIntegralRecordModel.getTaskScore();
            IntegralTask findTask = IntegralTaskDao.findTask(saveBatchIntegralRecordModel.getTaskId());
            if (findTask != null) {
                findTask.setOver(1);
                IntegralTaskDao.setTask(findTask);
            }
        }
        UserModel user = UserDao.getUser();
        if (user != null) {
            user.setIntegralScore(user.getIntegralScore() + i);
            UserDao.editUser(user);
        }
    }
}
