package patterns.behavioral.state.states;

import patterns.behavioral.state.ui.Player;

public class ReadyState extends State {
    public ReadyState(Player player) {
        super(player);
    }

    @Override
    public String onLock() {
        player.changeState(new LockedState(player));
        return "Блокировка...";
    }

    @Override
    public String onPlay() {
        String action = player.startPlayback();
        player.changeState(new PlayingState(player));
        return action;
    }

    @Override
    public String onNext() {
        return "Блокировка...";
    }

    @Override
    public String onPrevious() {
        return "Блокировка...";
    }
}
