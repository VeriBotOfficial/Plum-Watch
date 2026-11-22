package org.xmind.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.xmind.core.io.IInputSource;
import org.xmind.core.io.IStorage;

/* loaded from: classes7.dex */
public interface IWorkbookBuilder {
    IWorkbook createWorkbook();

    IWorkbook createWorkbook(String str);

    IWorkbook createWorkbook(IStorage iStorage);

    IWorkbook createWorkbookOnTemp(String str);

    IWorkbook loadFromFile(File file) throws IOException, CoreException;

    IWorkbook loadFromFile(File file, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromFile(File file, IStorage iStorage, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromInputSource(IInputSource iInputSource) throws IOException, CoreException;

    IWorkbook loadFromInputSource(IInputSource iInputSource, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromInputSource(IInputSource iInputSource, IStorage iStorage, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromPath(String str) throws IOException, CoreException;

    IWorkbook loadFromPath(String str, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromPath(String str, IStorage iStorage, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromStorage(IStorage iStorage) throws IOException, CoreException;

    IWorkbook loadFromStream(InputStream inputStream, String str) throws IOException, CoreException;

    IWorkbook loadFromStream(InputStream inputStream, String str, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromStream(InputStream inputStream, IStorage iStorage) throws IOException, CoreException;

    IWorkbook loadFromStream(InputStream inputStream, IStorage iStorage, IEncryptionHandler iEncryptionHandler) throws IOException, CoreException;

    IWorkbook loadFromTempLocation(String str) throws IOException, CoreException;

    void setCreator(String str, String str2);

    void setDefaultEncryptionHandler(IEncryptionHandler iEncryptionHandler);
}
