package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("second")
public class Second implements Combination {

    @Override
    public List<String> getCombination() {
        List<String> secondCombinationList = new ArrayList<>();
        secondCombinationList.add(CombinationConstats.D);
        secondCombinationList.add(CombinationConstats.E);
        secondCombinationList.add(CombinationConstats.F);
        return secondCombinationList;
    }
}
