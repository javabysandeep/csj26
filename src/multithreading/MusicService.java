package multithreading;

@FunctionalInterface
public interface MusicService {
    // it supports multiple inheritance
    //achieve 100% abstraction
    // fully unimplemented class means only abstract methods
    // we can't have IV, IM, CON, IB, SB, IC
    // by default variables are : public static final
    // by default methods are : public abstract
    // from java 8 : we can have: DM, SM
    //from java 9 : private SM, private DM
    void playMusic();
    default void stopMusic(){}

}
