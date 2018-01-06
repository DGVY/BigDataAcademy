package com.swjtu.bigdataacademy.Respond;

public class ScrollNewsRespond {

    private String scrollList;

    public ScrollNewsRespond(String scrollList){
        this.scrollList = scrollList;
    }

    public String getTitle() {
        return scrollList;
    }

    public void setScrollList(String title) {
        this.scrollList = title;
    }
}
