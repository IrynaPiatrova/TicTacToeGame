package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("sixth")
public class Sixth implements Combination {
    private List<String> sixthCombinationList = new ArrayList<>();

    {
        sixthCombinationList.add(CombinationConstats.A);
        sixthCombinationList.add(CombinationConstats.D);
        sixthCombinationList.add(CombinationConstats.G);
    }

    @Override
    public List<String> getCombination() {
        return sixthCombinationList;
    }
}