package com.example.imagetest;

import javafx.scene.image.Image;

import java.nio.file.Paths;

public class ConcreteAggregate implements
        Aggregate{
    private String filetopic;
    @Override
    public Iterator getIterator() {
        return new ImageIterator();
    }
    public ConcreteAggregate(String filetopic)
    {
        this.filetopic = filetopic;
    }
    public class ImageIterator implements Iterator{
        private int current = 0;
        private String getImage(int i){

            return Paths.get( filetopic
                    + i +".png").toUri().toString();
        }
        @Override
        public boolean hasNext() {
            return !new Image(getImage(current + 1)).isError();
        }
        @Override
        public boolean hasPreview() {
            return !new Image(getImage(current - 1)).isError();
        }

        @Override
        public Image next() {
            return new Image(getImage(++current));
        }

        @Override
        public Image preview()  {
            return new Image(getImage(--current));
        }
    }
}
