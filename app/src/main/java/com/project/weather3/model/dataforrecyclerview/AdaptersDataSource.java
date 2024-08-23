package com.project.weather3.model.dataforrecyclerview;

public class AdaptersDataSource {
    private int ImageSource;
    private String Text;

    public AdaptersDataSource(int imageSource, String text) {
        ImageSource = imageSource;
        Text = text;
    }

    public int getImageSource() {
        return ImageSource;
    }

    public void setImageSource(int imageSource) {
        ImageSource = imageSource;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }
}
