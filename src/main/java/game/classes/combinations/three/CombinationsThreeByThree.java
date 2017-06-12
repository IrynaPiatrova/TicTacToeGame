package game.classes.combinations.three;

import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
public interface CombinationsThreeByThree {
    boolean isCombination(List<String> allFilledCells);

    List<String> addFilledPosition(String position);

    void deletedFilledPositions();

    String getRole();
}
