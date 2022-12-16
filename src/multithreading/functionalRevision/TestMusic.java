package multithreading.functionalRevision;

public class TestMusic {
    public static void main(String[] args) {
        //way 1: traditional way
        MusicService musicService = new MusicService1();

        //way 2: anonymous class way
        MusicService anon = new MusicService() {
            @Override
            public void playMusic() {
                System.out.println("playing anon");
            }
        };

        //lambda way
        MusicService lambda = ()-> System.out.println("playing lambda");

        acceptMusicService(musicService);
        acceptMusicService(anon);
        acceptMusicService(lambda);
        acceptMusicService(()-> System.out.println("playing lambda"));
    }

    private static void acceptMusicService(MusicService musicService) {
        musicService.playMusic();
    }
}
class MusicService1 implements MusicService{
    @Override
    public void playMusic() {
        System.out.println("playing traditional class");
    }
}
