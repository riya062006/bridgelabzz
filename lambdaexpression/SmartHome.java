import java.util.*;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHome {
    public static void main(String[] args) {
        
        LightAction motionTrigger = () -> System.out.println(" Motion detected → Turning on hallway lights.");
        LightAction timeTrigger = () -> System.out.println(" Evening time → Activating warm ambient lights.");
        LightAction voiceTrigger = () -> System.out.println(" Voice command → Switching on living room lights.");


        List<LightAction> triggers = Arrays.asList(motionTrigger, timeTrigger, voiceTrigger);

        System.out.println("=== Smart Home Light Triggers ===");
        for (LightAction action : triggers) {
            action.activate();
        }
    }
}
