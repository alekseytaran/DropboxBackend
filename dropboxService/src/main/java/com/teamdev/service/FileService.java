package com.teamdev.service;

import com.teamdev.dto.FileDto;
import com.teamdev.dto.FolderDto;

public interface FileService {

    FileDto load(String accessToken, FileDto fileDto);

    FileDto get(String accessToken, FileDto fileDto);

    void update(String accessToken, FileDto currentFileDto, FileDto updatedFileDto);

    void delete(String accessToken, FileDto fileDto);

    void move(String accessToken, FileDto fileDto, FolderDto destinationFolder);

    void copy(String accessToken, FileDto fileDto, FileDto newFileName);

}
