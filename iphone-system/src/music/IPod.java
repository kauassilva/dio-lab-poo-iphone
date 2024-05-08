package music;

import java.util.ArrayList;
import java.util.List;

public class IPod implements MusicPlayer {

    private List<Music> musicList = new ArrayList<>();

    @Override
    public void play() {
        System.out.println("Playing the current music.");
    }

    @Override
    public void pause() {
        System.out.println("Pausing the current music.");
    }

    @Override
    public void selectMusic(Music music) {
        System.out.println("Playing the music: " + music.getTitle() + " by " + music.getArtist() + ".");
    }

    public List<Music> getMusicList() {
        return musicList;
    }

}
