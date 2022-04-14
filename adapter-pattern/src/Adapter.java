import adapter.AudioPlayer;

public class Adapter {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far a away.vlc");
    }
}
