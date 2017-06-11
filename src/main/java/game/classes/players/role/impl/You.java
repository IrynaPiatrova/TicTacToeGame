package game.classes.players.role.impl;

import game.classes.players.role.Role;
import org.springframework.stereotype.Component;

/**
 * Created by John on 11.06.2017.
 */
@Component("you")
public class You implements Role {
    private String role = "x";

    @Override
    public String getRole() {
        return role;
    }
}
