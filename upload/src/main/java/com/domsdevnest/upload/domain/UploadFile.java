package com.domsdevnest.upload.domain;

import lombok.Data;

@Data
public class UploadFile {

    private String uploadFileName;
    private String storeFileName;

    public UploadFile(String uploadFileName, String storeFilename) {
        this.uploadFileName = uploadFileName;
        this.storeFileName = storeFilename;
    }
}
