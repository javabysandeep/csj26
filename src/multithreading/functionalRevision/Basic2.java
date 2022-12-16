package multithreading.functionalRevision;

public class Basic2 {
    public static void main(String[] args) {
        //way 1: to implement interface: traditional way : create separate subclass
        MusicService musicService = new MusicServiceImpl();
        musicService.playMusic();
        musicService.stopMusic();

        //way 2: using anonymous class
        MusicService anon = new MusicService() {
            @Override
            public void playMusic() {
                System.out.println("anon playing music");
            }

            @Override
            public void stopMusic() {
                System.out.println("anon stopping the music");
            }
        };
        anon.playMusic();
        anon.stopMusic();

        //way 3: lambda expression is not supported here because interface is not FI

        MusicService lambda = ()->{
            System.out.println("playing the lambda");
        };
        lambda.playMusic();
        lambda.stopMusic();
    }
}
