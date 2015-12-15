package com.teamdev.service;

import com.teamdev.dto.FileDto;
import com.teamdev.dto.FolderDto;

import java.util.Set;

public interface FolderService {

    FolderDto create(String accessToken, String folderName);

    FolderDto get(String accessToken, String folderName);

    void delete(String accessToken, String folderName);

    void move(String accessToken, String folderName, String destinationFolder);

    void copy(String accessToken, String folderName, String newFolderName);

    Set<FileDto> getFilesFromFolder(String accessToken, String folderName);

    Set<FolderDto> getFoldersFromFolder(String accessToken, String folderName);
}
