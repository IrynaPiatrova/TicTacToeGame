package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("seventh")
public class Seventh implements Combination {

    @Override
    public List<String> getCombination() {
        List<String> seventhCombinationList = new ArrayList<>();
        seventhCombinationList.add(CombinationConstats.B);
        seventhCombinationList.add(CombinationConstats.E);
        seventhCombinationList.add(CombinationConstats.H);
        return seventhCombinationList;
    }
}
