package patterns.behavioral.state;

import patterns.behavioral.state.ui.Player;
import patterns.behavioral.state.ui.UI;

public class StateApplication {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
