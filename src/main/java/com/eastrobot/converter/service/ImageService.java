package com.eastrobot.converter.service;

import com.eastrobot.converter.model.ParseResult;
import com.eastrobot.converter.model.aitype.OCR;

/**
 * ImageService
 *
 * @author <a href="yogurt_lei@foxmail.com">Yogurt_lei</a>
 * @version v1.0 , 2018-03-26 15:14
 */
public interface ImageService {
    /**
     * 解析图片 生成文本
     */
    ParseResult<OCR> handle(String imageFilePath);
}
