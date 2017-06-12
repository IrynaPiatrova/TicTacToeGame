package game.classes.players.role.impl;

import game.classes.constants.SVConstants;
import game.classes.players.role.Role;
import org.springframework.stereotype.Component;

/**
 * Created by John on 11.06.2017.
 */
@Component("someBody")
public class SomeBody implements Role {
    private String role = SVConstants.O;

    @Override
    public String getRole() {
        return role;
    }
}
