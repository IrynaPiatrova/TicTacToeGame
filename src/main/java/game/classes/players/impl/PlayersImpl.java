package game.classes.players.impl;

import game.classes.players.Players;
import game.classes.players.role.Role;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by John on 11.06.2017.
 */
@Component
public class PlayersImpl implements Players {
    @Resource(name = "you")
    private Role you;
    @Resource(name = "computer")
    private Role computer;
    @Resource(name = "someBody")
    private Role someBody;

    @Override
    public Role getYou() {
        return you;
    }

    @Override
    public Role getComputer() {
        return computer;
    }

    @Override
    public Role getSomeBody() {
        return someBody;
    }
}
