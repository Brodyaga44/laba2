package com.example.imagetest;

import javafx.scene.image.Image;

public interface Iterator {
    public boolean hasNext();
    public boolean hasPreview();
    public Image next();
    public Image preview();
}
