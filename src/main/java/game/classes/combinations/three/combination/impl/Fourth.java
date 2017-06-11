package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("fourth")
public class Fourth implements Combination {

    @Override
    public List<String> getCombination() {
        List<String> fourthCombinationList = new ArrayList<>();
        fourthCombinationList.add(CombinationConstats.A);
        fourthCombinationList.add(CombinationConstats.E);
        fourthCombinationList.add(CombinationConstats.I);
        return fourthCombinationList;
    }
}
