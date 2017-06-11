package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("third")
public class Third implements Combination {
    private List<String> thirdCombinationList = new ArrayList<>();

    {
        thirdCombinationList.add(CombinationConstats.G);
        thirdCombinationList.add(CombinationConstats.H);
        thirdCombinationList.add(CombinationConstats.I);
    }

    @Override
    public List<String> getCombination() {
        return thirdCombinationList;
    }
}
