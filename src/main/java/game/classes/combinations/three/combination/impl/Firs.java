package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("first")
public class Firs implements Combination {

    @Override
    public List<String> getCombination() {
        List<String> firstCombinationList = new ArrayList<>();
        firstCombinationList.add(CombinationConstats.A);
        firstCombinationList.add(CombinationConstats.B);
        firstCombinationList.add(CombinationConstats.C);
        return firstCombinationList;
    }
}
