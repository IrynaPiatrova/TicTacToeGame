package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("fifth")
public class Fifth implements Combination {

    @Override
    public List<String> getCombination() {
        List<String> fifthCombinationList = new ArrayList<>();
        fifthCombinationList.add(CombinationConstats.G);
        fifthCombinationList.add(CombinationConstats.E);
        fifthCombinationList.add(CombinationConstats.C);
        return fifthCombinationList;
    }
}

