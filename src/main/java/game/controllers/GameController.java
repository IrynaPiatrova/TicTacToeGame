package game.controllers;

import game.classes.combinations.three.CombinationsThreeByThree;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static game.classes.constants.SVConstants.GAME;

/**
 * Created by John on 12.06.2017.
 */
@Controller
public class GameController {
    @Resource(name = "combTBT")
    private CombinationsThreeByThree tbt;

   // private String role = tbt.getRole();

    @RequestMapping(value = "/start", method = RequestMethod.POST)
    public String startGame(HttpServletRequest request) {
        return GAME;
    }

    @RequestMapping(value = "/{value}", method = RequestMethod.GET)
    public String choiceA(HttpServletRequest request, @PathVariable("value") String value) {
        //boolean isCombination = isCombination(value);
        request.setAttribute("value", value);
        return GAME;
    }

    private boolean isCombination(String combination) {
        List<String> filledPositions = tbt.addFilledPosition(combination);
        return tbt.isCombination(filledPositions);
    }
}
