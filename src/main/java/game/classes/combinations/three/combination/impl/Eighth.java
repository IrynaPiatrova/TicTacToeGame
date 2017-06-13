package game.classes.combinations.three.combination.impl;

import game.classes.combinations.three.combination.Combination;
import game.classes.constants.CombinationConstats;

import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
//@Component("eighth")
public class Eighth  extends AbstractCombination implements Combination{

    @Override
    public List<String> getCombination() {
        fPosition = CombinationConstats.C;
        sPosition = CombinationConstats.F;
        tPosition = CombinationConstats.I;;
        return super.getCombination();
    }
}