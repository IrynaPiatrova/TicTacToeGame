package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
//@Component("third")
public class Third implements Combination {

    @Override
    public List<String> getCombination() {
        List<String> thirdCombinationList = new ArrayList<>();
        thirdCombinationList.add(CombinationConstats.G);
        thirdCombinationList.add(CombinationConstats.H);
        thirdCombinationList.add(CombinationConstats.I);
        return thirdCombinationList;
    }
}
