package com.company;

public class Button  {

    private String title;
    private IOnClickListener onClickListener;

    public Button(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setOnClickListener(IOnClickListener onClickListener) {

        this.onClickListener = onClickListener;
    }

    public void onClick() {

        this.onClickListener.onClick(this.title);
    }

    public interface IOnClickListener{
        public void onClick(String title);
    }
}
