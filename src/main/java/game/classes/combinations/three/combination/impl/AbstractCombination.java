package game.classes.combinations.three.combination.impl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 13.06.2017.
 */
public abstract class AbstractCombination {
    protected String fPosition;
    protected String sPosition;
    protected String tPosition;
    protected List<String> combinationList = new ArrayList<>();

    protected List<String> getCombination(){
        combinationList.clear();
        combinationList.add(fPosition);
        combinationList.add(sPosition);
        combinationList.add(tPosition);
        return combinationList;
    }
}
