package patterns.behavioral.state.states;

import patterns.behavioral.state.ui.Player;

public class LockedState extends State {
    LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Остановка проигрывания";
        } else {
            return "Блокировка...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Готов";
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
