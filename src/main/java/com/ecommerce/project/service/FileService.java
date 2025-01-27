package com.ecommerce.project.service;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

/**
 * Author: dhhaval thakkar
 * Date:2025-01-23
 */
public interface FileService {
    String uploadImage(String path, MultipartFile file) throws IOException;
}
