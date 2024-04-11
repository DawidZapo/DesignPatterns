package dawidzapo.structural.bridge.interfaces;

import dawidzapo.structural.bridge.abstracts.Keyboard;

public class KeyboardController implements Controller{
    Keyboard keyboard;

    public KeyboardController(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    public void power() {
        if(keyboard.isEnabled()){
            System.out.println("Shutting down...");
            keyboard.disable();
        }
        else{
            System.out.println("Starting up...");
            keyboard.enable();
        }
    }

    @Override
    public void pitchUp() {
        System.out.println("Pitch up");
        keyboard.setPitch(keyboard.getPitch() + 1);
    }

    @Override
    public void pitchDown() {
        System.out.println("Pitch down");
        keyboard.setPitch(keyboard.getPitch() - 1);
    }

    @Override
    public void transposeUp() {
        System.out.println("Transpose up");
        keyboard.setTranspose(keyboard.getTranspose() + 1);
    }

    @Override
    public void transposeDown() {
        System.out.println("Transpose down");
        keyboard.setTranspose(keyboard.getTranspose() - 1);
    }

    @Override
    public void volumeUp() {
        System.out.println("Volume up");
        keyboard.setVolume(keyboard.getVolume() + 1);
    }

    @Override
    public void volumeDown() {
        System.out.println("Volume down");
        keyboard.setVolume(keyboard.getVolume() - 1);
    }
}
