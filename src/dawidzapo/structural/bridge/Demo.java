package dawidzapo.structural.bridge;

import dawidzapo.structural.bridge.abstracts.DigitalPiano;
import dawidzapo.structural.bridge.abstracts.Synthesizer;
import dawidzapo.structural.bridge.interfaces.Controller;
import dawidzapo.structural.bridge.interfaces.KeyboardController;

public class Demo {
    public static void main(String[] args) {
        Controller digitalPianoController = new KeyboardController(new DigitalPiano());
        digitalPianoController.power();
        digitalPianoController.transposeUp();
        digitalPianoController.power();

        Controller synthesizerController = new KeyboardController(new Synthesizer());
        synthesizerController.power();
        synthesizerController.volumeDown();
        synthesizerController.power();
    }
}
