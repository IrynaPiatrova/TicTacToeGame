package game.classes.players.role.Solver.impl;

import game.classes.players.role.Role;
import game.classes.players.role.Solver.RoleSolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by John on 12.06.2017.
 */
@Component("roleSolverSb")
public class RoleSolverSb implements RoleSolver {
    @Resource(name = "you")
    private Role you;
    @Resource(name = "someBody")
    private Role someBody;


    @Override
    public String getRole(int sizeFilled) {
        return sizeFilled == 0 || sizeFilled % 2 == 0 ? you.getRole() : someBody.getRole();
    }
}
