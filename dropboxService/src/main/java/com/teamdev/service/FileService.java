package com.teamdev.service;

import com.teamdev.dto.FileDto;
import com.teamdev.dto.FolderDto;

public interface FileService {

    FileDto load(String accessToken, FileDto fileDto);

    FileDto get(String accessToken, String fileName);

    void update(String accessToken, String fileName);

    void delete(String accessToken, String fileName);

//    need to correct params
    void move(String accessToken, String fileName, String destinationFolder);

    void copy(String accessToken, String fileName, String newFileName);

}
