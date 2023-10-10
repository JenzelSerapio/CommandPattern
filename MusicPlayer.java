package commandPattern;

public class MusicPlayer {
	private boolean isPlaying = false;
    private String playlist = "";

    public void play() {
        isPlaying = true;
        System.out.println("Music is playing (" + playlist + ")");
        System.out.println();

    }

    public void stop() {
        isPlaying = false;
        System.out.println("Music is stopped");
        System.out.println();

    }

    public void Playlist(String playlist) {
        this.playlist = playlist;
        System.out.println("Playlist set to: " + playlist);
        System.out.println();

    }
}
