package com.wakeup.common.logger.core.impl;

import com.wakeup.common.logger.core.GLogConfig;
import com.wakeup.common.logger.core.entity.GLogEntity;
import com.wakeup.common.logger.core.util.GLogPrinter;
import com.wakeup.common.logger.core.util.GLogUtil;
import com.wakeup.common.logger.core.util.GLogWrapper;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

/* loaded from: classes2.dex */
public class FileLogImpl {
    public static void printFile(GLogEntity entity, String tagStr, File targetDirectory, String fileName, Object objectMsg) {
        if (entity.isForceShow() || GLogConfig.IS_SHOW_LOG) {
            String[] wrapperContent = GLogWrapper.wrapperContent(entity, tagStr, objectMsg);
            printFile(wrapperContent[0], targetDirectory, fileName, wrapperContent[2], wrapperContent[1]);
        }
    }

    private static void printFile(String tagStr, File targetDirectory, String fileName, String headString, String msg) {
        if (fileName == null) {
            fileName = GLogUtil.getFileName();
        }
        if (save(targetDirectory, fileName, msg)) {
            GLogPrinter.printSub(2, tagStr, headString + " save log success ! location is >>>" + targetDirectory.getAbsolutePath() + "/" + fileName);
        } else {
            GLogPrinter.printSub(5, tagStr, headString + "save log fails !");
        }
    }

    private static boolean save(File dic, String fileName, String msg) {
        if (!dic.exists()) {
            dic.mkdirs();
        }
        File file = new File(dic, fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
                try {
                    outputStreamWriter.write(msg);
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    fileOutputStream.close();
                    return true;
                } finally {
                }
            } finally {
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            return false;
        }
    }
}
