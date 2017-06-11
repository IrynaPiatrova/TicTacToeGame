package game.classes.players;

import game.classes.players.role.Role;

/**
 * Created by John on 11.06.2017.
 */
public interface Players {
    Role getYou();

    Role getComputer();

    Role getSomeBody();
}
