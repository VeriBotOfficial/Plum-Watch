package com.wakeup.common.network.entity.other;

import com.wakeup.common.storage.model.IntegralTask;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class IntegralListModel {
    private List<IntegralTask> everyDayTaskList;
    private List<IntegralTask> newUserTaskList;
    private List<IntegralTask> otherTaskList;
    private List<IntegralTask> sginTaskList;
    private int userId;

    public int getUserId() {
        return this.userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public List<IntegralTask> getEveryDayTaskList() {
        return this.everyDayTaskList;
    }

    public void setEveryDayTaskList(List<IntegralTask> everyDayTaskList) {
        this.everyDayTaskList = everyDayTaskList;
    }

    public List<IntegralTask> getNewUserTaskList() {
        return this.newUserTaskList;
    }

    public void setNewUserTaskList(List<IntegralTask> newUserTaskList) {
        this.newUserTaskList = newUserTaskList;
    }

    public List<IntegralTask> getOtherTaskList() {
        return this.otherTaskList;
    }

    public void setOtherTaskList(List<IntegralTask> otherTaskList) {
        this.otherTaskList = otherTaskList;
    }

    public List<IntegralTask> getSginTaskList() {
        return this.sginTaskList;
    }

    public void setSginTaskList(List<IntegralTask> sginTaskList) {
        this.sginTaskList = sginTaskList;
    }

    public void addNewUserTaskList(IntegralTask model) {
        if (this.newUserTaskList == null) {
            this.newUserTaskList = new ArrayList();
        }
        this.newUserTaskList.add(model);
    }

    public void addEveryDayTaskList(IntegralTask model) {
        if (this.everyDayTaskList == null) {
            this.everyDayTaskList = new ArrayList();
        }
        this.everyDayTaskList.add(model);
    }

    public void addOtherTaskList(IntegralTask model) {
        if (this.otherTaskList == null) {
            this.otherTaskList = new ArrayList();
        }
        this.otherTaskList.add(model);
    }

    public void addSginTaskList(IntegralTask model) {
        if (this.sginTaskList == null) {
            this.sginTaskList = new ArrayList();
        }
        this.sginTaskList.add(model);
    }
}
