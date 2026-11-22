package com.wakeup.common.logger.core.impl;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ims.AuthorizationHeaderIms;
import com.wakeup.common.logger.core.constants.GLogStrs;
import com.wakeup.common.logger.core.entity.GLogEntity;
import com.wakeup.common.logger.core.util.GLogPrinter;
import com.wakeup.common.logger.core.util.GLogUtil;
import java.io.StringReader;
import java.io.StringWriter;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;

/* loaded from: classes2.dex */
public class XmlLogImpl {
    public static void printXml(GLogEntity entity, String tag, String xml, String headString) {
        String str;
        DefaultLogImpl.printDefault(entity, entity.getJsonLevel(), tag, headString + xml);
        if (entity.isFormatJson()) {
            if (xml != null) {
                str = headString + "\n" + formatXML(xml);
            } else {
                str = headString + "Log with null object";
            }
            GLogUtil.printLine(entity.getJsonLevel(), tag, true);
            if (GLogStrs.LINE_SEPARATOR != null) {
                for (String str2 : str.split(GLogStrs.LINE_SEPARATOR)) {
                    if (!GLogUtil.isEmpty(str2)) {
                        GLogPrinter.printSub(entity.getJsonLevel(), tag, "║ " + str2);
                    }
                }
            }
            GLogUtil.printLine(entity.getJsonLevel(), tag, false);
        }
    }

    private static String formatXML(String inputXML) {
        try {
            StreamSource streamSource = new StreamSource(new StringReader(inputXML));
            StreamResult streamResult = new StreamResult(new StringWriter());
            Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
            newTransformer.setOutputProperty("indent", AuthorizationHeaderIms.YES);
            newTransformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            newTransformer.transform(streamSource, streamResult);
            return streamResult.getWriter().toString().replaceFirst(Separators.GREATER_THAN, ">\n");
        } catch (Exception e) {
            e.printStackTrace();
            return inputXML;
        }
    }
}
