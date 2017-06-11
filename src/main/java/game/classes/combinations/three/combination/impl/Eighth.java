package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component("eighth")
public class Eighth implements Combination {
    private List<String> eighthCombinationList = new ArrayList<>();

    @Override
    public List<String> getCombination() {
        eighthCombinationList.add(CombinationConstats.C);
        eighthCombinationList.add(CombinationConstats.F);
        eighthCombinationList.add(CombinationConstats.I);
        return eighthCombinationList;
    }
}