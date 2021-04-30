package com.bu543169.assignment;

public class Category {
    private int imgCategory;
    private String txtCategoryName;
    private String txtCategoryDetails;

    public Category(int imgCategory, String txtCategoryName, String txtCategoryDetails) {
        this.imgCategory = imgCategory;
        this.txtCategoryName = txtCategoryName;
        this.txtCategoryDetails = txtCategoryDetails;
    }

    public int getImgCategory() {
        return imgCategory;
    }

    public void setImgCategory(int imgCategory) {
        this.imgCategory = imgCategory;
    }

    public String getTxtCategoryName() {
        return txtCategoryName;
    }

    public void setTxtCategoryName(String txtCategoryName) {
        this.txtCategoryName = txtCategoryName;
    }

    public String getTxtCategoryDetails() {
        return txtCategoryDetails;
    }

    public void setTxtCategoryDetails(String txtCategoryDetails) {
        this.txtCategoryDetails = txtCategoryDetails;
    }
}