package model;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playMp4(String fileName) {
        System.out.println("mo bang mp4: "+ fileName);
    }

    @Override
    public void playVlc(String fileName) {

    }
}
