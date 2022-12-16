package multithreading.functionalRevision;

public class MusicServiceImpl implements MusicService{

    @Override
    public void playMusic() {
        System.out.println("playing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("stopping the music");
    }
}
