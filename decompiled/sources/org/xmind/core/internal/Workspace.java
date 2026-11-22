package org.xmind.core.internal;

import java.io.File;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmind.core.Core;
import org.xmind.core.IWorkspace;
import org.xmind.core.util.FileUtils;

/* loaded from: classes7.dex */
public class Workspace implements IWorkspace {
    private static final Pattern EXPANSION_PATTERN = Pattern.compile("\\$\\{([^\\}]+)\\}");
    private static final String P_APPLIED_WORKSPACE = "org.xmind.core.workspace.applied";
    private static final String P_WORKSPACE = "org.xmind.core.workspace";
    private String workingDirectory = null;
    private String defaultWorkingDirectory = null;

    @Override // org.xmind.core.IWorkspace
    public String getWorkingDirectory() {
        String str = this.workingDirectory;
        if (str != null) {
            return str;
        }
        String property = System.getProperty(P_WORKSPACE);
        if (property != null && !"".equals(property)) {
            String expandProperties = expandProperties(property, System.getProperties());
            this.workingDirectory = expandProperties;
            System.setProperty(P_APPLIED_WORKSPACE, expandProperties);
            return this.workingDirectory;
        }
        return getDefaultWorkingDirectory();
    }

    public void setDefaultWorkingDirectory(String str) {
        this.defaultWorkingDirectory = str;
        if (this.workingDirectory == null && System.getProperty(P_WORKSPACE) == null) {
            System.setProperty(P_APPLIED_WORKSPACE, str);
        }
    }

    private String getDefaultWorkingDirectory() {
        if (this.defaultWorkingDirectory == null) {
            String calculateDefaultWorkingDirectory = calculateDefaultWorkingDirectory();
            this.defaultWorkingDirectory = calculateDefaultWorkingDirectory;
            System.setProperty(P_APPLIED_WORKSPACE, calculateDefaultWorkingDirectory);
        }
        return this.defaultWorkingDirectory;
    }

    @Override // org.xmind.core.IWorkspace
    public void setWorkingDirectory(String str) {
        this.workingDirectory = str;
        System.setProperty(P_APPLIED_WORKSPACE, str);
    }

    @Override // org.xmind.core.IWorkspace
    public String getAbsolutePath(String str) {
        if (str == null) {
            return null;
        }
        return new File(getWorkingDirectory(), str).getAbsolutePath();
    }

    @Override // org.xmind.core.IWorkspace
    public String getTempDir() {
        return getAbsolutePath(IWorkspace.DIR_TEMP);
    }

    @Override // org.xmind.core.IWorkspace
    public String getTempDir(String str) {
        return FileUtils.ensureDirectory(new File(getTempDir(), str)).getAbsolutePath();
    }

    @Override // org.xmind.core.IWorkspace
    public String getTempFile(String str) {
        return FileUtils.ensureFileParent(new File(getTempDir(), str)).getAbsolutePath();
    }

    @Override // org.xmind.core.IWorkspace
    public synchronized File createTempFile(String str, String str2, String str3) {
        File file;
        String tempDir = getTempDir(str);
        do {
            file = new File(tempDir, String.valueOf(str2) + Core.getIdFactory().createId() + str3);
        } while (file.exists());
        return file;
    }

    private static String calculateDefaultWorkingDirectory() {
        String property = System.getProperty("user.home");
        if (property == null) {
            return ".xmind";
        }
        return new File(property, ".xmind").getAbsolutePath();
    }

    private static String expandProperties(String str, Properties properties) {
        StringBuffer stringBuffer = new StringBuffer(str.length());
        Matcher matcher = EXPANSION_PATTERN.matcher(str);
        while (matcher.find()) {
            String property = properties.getProperty(matcher.group(1));
            if (property == null) {
                property = matcher.group();
            }
            matcher.appendReplacement(stringBuffer, property.replaceAll("([\\\\\\$])", "\\\\$1"));
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
