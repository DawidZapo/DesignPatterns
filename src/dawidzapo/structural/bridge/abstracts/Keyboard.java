package dawidzapo.structural.bridge.abstracts;

public interface Keyboard {
    boolean isEnabled();
    void enable();
    void disable();
    int getVolume();
    void setVolume(int volume);
    double getPitch();
    void setPitch(double pitch);
    int getTranspose();
    void setTranspose(int transpose);
}
