package com.wakeup.common.logger.core;

import com.wakeup.common.logger.GLog;
import com.wakeup.common.logger.core.entity.GLogEntity;
import com.wakeup.common.logger.core.impl.DefaultLogImpl;
import com.wakeup.common.logger.core.impl.FileLogImpl;
import com.wakeup.common.logger.core.impl.JsonLogImpl;
import com.wakeup.common.logger.core.impl.TraceLogImpl;
import com.wakeup.common.logger.core.impl.XmlLogImpl;
import com.wakeup.common.logger.core.util.GLogWrapper;
import java.io.File;

/* loaded from: classes2.dex */
public class GLogExcutor {
    private final GLogEntity entity;

    public GLogExcutor(GLogEntity entity) {
        GLoggerSettingsManager.getEntities().add(entity);
        this.entity = entity;
    }

    public void print() {
        GLogEntity gLogEntity = this.entity;
        if (gLogEntity == null) {
            v();
        } else {
            printLog(gLogEntity.getDefaultLevel(), null, "execute");
        }
    }

    public void print(Object msg) {
        GLogEntity gLogEntity = this.entity;
        if (gLogEntity == null) {
            v(msg);
        } else {
            printLog(gLogEntity.getDefaultLevel(), null, msg);
        }
    }

    public void print(String tag, Object... objects) {
        GLogEntity gLogEntity = this.entity;
        if (gLogEntity == null) {
            v(tag, objects);
        } else {
            printLog(gLogEntity.getDefaultLevel(), tag, objects);
        }
    }

    public void v() {
        printLog(1, null, "execute");
    }

    public void v(Object msg) {
        printLog(1, null, msg);
    }

    public void v(String tag, Object... objects) {
        printLog(1, tag, objects);
    }

    public void d() {
        printLog(2, null, "execute");
    }

    public void d(Object msg) {
        printLog(2, null, msg);
    }

    public void d(String tag, Object... objects) {
        printLog(2, tag, objects);
    }

    public void i() {
        printLog(3, null, "execute");
    }

    public void i(Object msg) {
        printLog(3, null, msg);
    }

    public void i(String tag, Object... objects) {
        printLog(3, tag, objects);
    }

    public void w() {
        printLog(4, null, "execute");
    }

    public void w(Object msg) {
        printLog(4, null, msg);
    }

    public void w(String tag, Object... objects) {
        printLog(4, tag, objects);
    }

    public void e() {
        printLog(5, null, "execute");
    }

    public void e(Object msg) {
        printLog(5, null, msg);
    }

    public void e(String tag, Object... objects) {
        printLog(5, tag, objects);
    }

    public void a() {
        printLog(6, null, "execute");
    }

    public void a(Object msg) {
        printLog(6, null, msg);
    }

    public void a(String tag, Object... objects) {
        printLog(6, tag, objects);
    }

    public void json(String jsonFormat) {
        printLog(7, null, jsonFormat);
    }

    public void json(String tag, String jsonFormat) {
        printLog(7, tag, jsonFormat);
    }

    public void json(Object object) {
        try {
            printLog(7, null, GLog.getgLogInterface().objectToString(object));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void json(String tag, Object object) {
        try {
            printLog(7, tag, GLog.getgLogInterface().objectToString(object));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void xml(String xml) {
        printLog(8, null, xml);
    }

    public void xml(String tag, String xml) {
        printLog(8, tag, xml);
    }

    public void file(File targetDirectory, Object msg) {
        FileLogImpl.printFile(this.entity, (String) null, targetDirectory, (String) null, msg);
    }

    public void file(String tag, File targetDirectory, Object msg) {
        FileLogImpl.printFile(this.entity, tag, targetDirectory, (String) null, msg);
    }

    public void file(String tag, File targetDirectory, String fileName, Object msg) {
        FileLogImpl.printFile(this.entity, tag, targetDirectory, fileName, msg);
    }

    public void trace() {
        TraceLogImpl.printStackTrace(this.entity);
    }

    private void printLog(int type, String tagStr, Object... objects) {
        if (this.entity.isForceShow() || GLogConfig.IS_SHOW_LOG) {
            String[] wrapperContent = GLogWrapper.wrapperContent(this.entity, tagStr, objects);
            String str = wrapperContent[0];
            String str2 = wrapperContent[1];
            String str3 = wrapperContent[2];
            switch (type) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    DefaultLogImpl.printDefault(this.entity, type, str, str3 + str2);
                    break;
                case 7:
                    JsonLogImpl.printJson(this.entity, str, str2, str3);
                    break;
                case 8:
                    XmlLogImpl.printXml(this.entity, str, str2, str3);
                    break;
            }
        }
    }
}
