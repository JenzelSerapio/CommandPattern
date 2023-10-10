package commandPattern;

public class PlayMusic implements Command {
    private MusicPlayer musicPlayer;

    public PlayMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.play();
        musicPlayer.Playlist("Top 50 Local Songs");
    }

}
