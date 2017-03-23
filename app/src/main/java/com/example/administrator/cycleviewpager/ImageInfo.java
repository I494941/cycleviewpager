package com.example.administrator.cycleviewpager;

import java.util.List;

/**
 * Created by 王金飞 on 2017/3/21 0021.
 */

public class ImageInfo {
    private String imgDate;
    private String imgId;
    private String imgPath;
    private int imgTime;
    private String imgDesc;
    private String actionsPath;

    public ImageInfo() {
        // TODO Auto-generated constructor stub
    }

    public ImageInfo(String respCode, String respDesc, List<ImageInfo> imageInfo, String imgDate, String imgId, String imgPath, int imgTime, String imgDesc, String actionsPath) {
        super();
        this.respCode = respCode;
        this.respDesc = respDesc;
        this.imageInfo = imageInfo;
        this.imgDate = imgDate;
        this.imgId = imgId;
        this.imgPath = imgPath;
        this.imgTime = imgTime;
        this.imgDesc = imgDesc;
        this.actionsPath = actionsPath;
    }

    public String getImgDate() {
        return imgDate;
    }

    public void setImgDate(String imgDate) {
        this.imgDate = imgDate;
    }

    public String getImgId() {
        return imgId;
    }

    public void setImgId(String imgId) {
        this.imgId = imgId;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public int getImgTime() {
        return imgTime;
    }

    public void setImgTime(int imgTime) {
        this.imgTime = imgTime;
    }

    public String getImgDesc() {
        return imgDesc;
    }

    public void setImgDesc(String imgDesc) {
        this.imgDesc = imgDesc;
    }

    public String getActionsPath() {
        return actionsPath;
    }

    public void setActionsPath(String actionsPath) {
        this.actionsPath = actionsPath;
    }


    private String respCode;
    private String respDesc;
    private List<ImageInfo> imageInfo;

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespDesc() {
        return respDesc;
    }

    public void setRespDesc(String respDesc) {
        this.respDesc = respDesc;
    }

    public List<ImageInfo> getImageInfo() {
        return imageInfo;
    }

    public void setImageInfo(List<ImageInfo> imageInfo) {
        this.imageInfo = imageInfo;
    }
}