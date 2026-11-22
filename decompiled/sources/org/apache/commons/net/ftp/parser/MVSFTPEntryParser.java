package org.apache.commons.net.ftp.parser;

import java.text.ParseException;
import java.util.List;
import org.apache.commons.net.ftp.FTPClientConfig;
import org.apache.commons.net.ftp.FTPFile;

/* loaded from: classes8.dex */
public class MVSFTPEntryParser extends ConfigurableFTPFileEntryParserImpl {
    static final String DEFAULT_DATE_FORMAT = "yyyy/MM/dd HH:mm";
    static final String FILE_LIST_REGEX = "\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s+(?:\\S+\\s+)?\\S+\\s+\\S+\\s+\\S+\\s+(PS|PO|PO-E)\\s+(\\S+)\\s*";
    static final int FILE_LIST_TYPE = 0;
    static final String JES_LEVEL_1_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s*";
    static final int JES_LEVEL_1_LIST_TYPE = 3;
    static final String JES_LEVEL_2_LIST_REGEX = "(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+)\\s+(\\S+).*";
    static final int JES_LEVEL_2_LIST_TYPE = 4;
    static final String MEMBER_LIST_REGEX = "(\\S+)\\s+\\S+\\s+\\S+\\s+(\\S+)\\s+(\\S+)\\s+\\S+\\s+\\S+\\s+\\S+\\s+\\S+\\s*";
    static final int MEMBER_LIST_TYPE = 1;
    static final int UNIX_LIST_TYPE = 2;
    static final int UNKNOWN_LIST_TYPE = -1;
    private int isType;
    private UnixFTPEntryParser unixFTPEntryParser;

    public MVSFTPEntryParser() {
        super("");
        this.isType = -1;
        super.configure(null);
    }

    @Override // org.apache.commons.net.ftp.parser.ConfigurableFTPFileEntryParserImpl
    protected FTPClientConfig getDefaultConfiguration() {
        return new FTPClientConfig(FTPClientConfig.SYST_MVS, DEFAULT_DATE_FORMAT, null);
    }

    private FTPFile parseFileList(String str) {
        if (matches(str)) {
            FTPFile fTPFile = new FTPFile();
            fTPFile.setRawListing(str);
            String group = group(2);
            String group2 = group(1);
            fTPFile.setName(group);
            if ("PS".equals(group2)) {
                fTPFile.setType(0);
                return fTPFile;
            }
            if (!"PO".equals(group2) && !"PO-E".equals(group2)) {
                return null;
            }
            fTPFile.setType(1);
            return fTPFile;
        }
        boolean startsWith = str.startsWith("Migrated");
        if (!startsWith && !str.startsWith("ARCIVE")) {
            return null;
        }
        FTPFile fTPFile2 = new FTPFile();
        fTPFile2.setRawListing(str);
        fTPFile2.setType(3);
        fTPFile2.setName(str.split("\\s+")[startsWith ? (char) 1 : (char) 5]);
        return fTPFile2;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParser
    public FTPFile parseFTPEntry(String str) {
        int i = this.isType;
        if (i == 0) {
            return parseFileList(str);
        }
        if (i == 1) {
            return parseMemberList(str);
        }
        if (i == 2) {
            return this.unixFTPEntryParser.parseFTPEntry(str);
        }
        if (i == 3) {
            return parseJeslevel1List(str);
        }
        if (i != 4) {
            return null;
        }
        return parseJeslevel2List(str);
    }

    private FTPFile parseJeslevel1List(String str) {
        return parseJeslevelList(str, 3);
    }

    private FTPFile parseJeslevel2List(String str) {
        return parseJeslevelList(str, 4);
    }

    private FTPFile parseJeslevelList(String str, int i) {
        if (!matches(str)) {
            return null;
        }
        FTPFile fTPFile = new FTPFile();
        if (!group(i).equalsIgnoreCase("OUTPUT")) {
            return null;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(group(2));
        fTPFile.setType(0);
        return fTPFile;
    }

    private FTPFile parseMemberList(String str) {
        FTPFile fTPFile = new FTPFile();
        if (matches(str)) {
            fTPFile.setRawListing(str);
            String group = group(1);
            String str2 = group(2) + " " + group(3);
            fTPFile.setName(group);
            fTPFile.setType(0);
            try {
                fTPFile.setTimestamp(super.parseTimestamp(str2));
            } catch (ParseException unused) {
            }
            return fTPFile;
        }
        if (str == null || str.trim().isEmpty()) {
            return null;
        }
        fTPFile.setRawListing(str);
        fTPFile.setName(str.split(" ")[0]);
        fTPFile.setType(0);
        return fTPFile;
    }

    @Override // org.apache.commons.net.ftp.FTPFileEntryParserImpl, org.apache.commons.net.ftp.FTPFileEntryParser
    public List<String> preParse(List<String> list) {
        if (list != null && !list.isEmpty()) {
            String str = list.get(0);
            if (str.contains("Volume") && str.contains("Dsname")) {
                setType(0);
                super.setRegex(FILE_LIST_REGEX);
            } else if (str.contains("Name") && str.contains("Id")) {
                setType(1);
                super.setRegex(MEMBER_LIST_REGEX);
            } else if (str.startsWith("total")) {
                setType(2);
                this.unixFTPEntryParser = new UnixFTPEntryParser();
            } else if (str.indexOf("Spool Files") >= 30) {
                setType(3);
                super.setRegex(JES_LEVEL_1_LIST_REGEX);
            } else if (str.startsWith("JOBNAME") && str.indexOf("JOBID") > 8) {
                setType(4);
                super.setRegex(JES_LEVEL_2_LIST_REGEX);
            } else {
                setType(-1);
            }
            if (this.isType != 3) {
                list.remove(0);
            }
        }
        return list;
    }

    void setType(int i) {
        this.isType = i;
    }
}
