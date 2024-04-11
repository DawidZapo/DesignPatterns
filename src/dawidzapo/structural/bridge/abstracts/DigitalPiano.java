package dawidzapo.structural.bridge.abstracts;

public class DigitalPiano implements Keyboard{
    private boolean on = false;
    private int volume = 50;
    private double pitch = 440;
    private int transpose = 0;
    @Override
    public boolean isEnabled() {
        return on;
    }

    @Override
    public void enable() {
        on = true;
    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public double getPitch() {
        return pitch;
    }

    @Override
    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    @Override
    public int getTranspose() {
        return transpose;
    }

    @Override
    public void setTranspose(int transpose) {
        this.transpose = transpose;
    }
}
