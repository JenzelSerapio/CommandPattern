package commandPattern;

public class StopMusic implements Command {
    private MusicPlayer musicPlayer;

    public StopMusic(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    @Override
    public void execute() {
        musicPlayer.stop(); {

}
    }
}
