package com.teamdev.service;

import com.teamdev.dto.FileDto;
import com.teamdev.dto.FolderDto;

import java.util.Set;

public interface FolderService {

    FolderDto create(String accessToken, FolderDto folderDto);

    FolderDto get(String accessToken, FolderDto folderDto);

    void delete(String accessToken, FolderDto folderDto);

    void move(String accessToken, FolderDto folderDto, String destinationFolder);

    void copy(String accessToken, FolderDto folderDto, String newFolderName);

    Set<FileDto> getFilesFromFolder(String accessToken, FolderDto folderDto);

    Set<FolderDto> getFoldersFromFolder(String accessToken, FolderDto folderName);
}
