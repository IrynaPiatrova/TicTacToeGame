package game.controllers;

import game.classes.combinations.three.CombinationsThreeByThree;
import game.classes.constants.CombinationConstats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static game.classes.constants.SVConstants.GAME;

/**
 * Created by John on 12.06.2017.
 */
@Controller
public class GameController {
    @Autowired
    private CombinationsThreeByThree tbt;

    private String role = tbt.getRole();

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public String startGame(HttpServletRequest request) {
        return GAME;
    }

    @RequestMapping(value = "/A", method = RequestMethod.GET)
    public String choiceA(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.A);
        return GAME;
    }

    @RequestMapping(value = "/B", method = RequestMethod.GET)
    public String choiceB(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.B);
        return GAME;
    }

    @RequestMapping(value = "/C", method = RequestMethod.GET)
    public String choiceC(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.C);
        return GAME;
    }

    @RequestMapping(value = "/D", method = RequestMethod.GET)
    public String choiceD(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.D);
        return GAME;
    }

    @RequestMapping(value = "/E", method = RequestMethod.GET)
    public String choiceE(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.E);
        return GAME;
    }

    @RequestMapping(value = "/F", method = RequestMethod.GET)
    public String choiceF(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.F);
        return GAME;
    }

    @RequestMapping(value = "/G", method = RequestMethod.GET)
    public String choiceG(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.G);
        return GAME;
    }

    @RequestMapping(value = "/H", method = RequestMethod.GET)
    public String choiceH(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.H);
        return GAME;
    }

    @RequestMapping(value = "/I", method = RequestMethod.GET)
    public String choiceI(HttpServletRequest request) {
        boolean isCombination = isCombination(CombinationConstats.I);
        return GAME;
    }

    private boolean isCombination(String combination) {
        List<String> filledPositions = tbt.addFilledPosition(combination);
        return tbt.isCombination(filledPositions);
    }
}
