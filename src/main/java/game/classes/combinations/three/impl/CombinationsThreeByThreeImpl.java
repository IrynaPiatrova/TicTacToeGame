package game.classes.combinations.three.impl;

import game.classes.combinations.three.CombinationsThreeByThree;
import game.classes.combinations.three.combination.Combination;
import game.classes.constants.SVConstants;
import game.classes.players.role.Solver.RoleSolver;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by John on 11.06.2017.
 */
@Component
public class CombinationsThreeByThreeImpl implements CombinationsThreeByThree {

    @Resource(name = "eighth")
    private Combination eighth;
    @Resource(name = "fifth")
    private Combination fifth;
    @Resource(name = "first")
    private Combination first;
    @Resource(name = "fourth")
    private Combination fourth;
    @Resource(name = "second")
    private Combination second;
    @Resource(name = "seventh")
    private Combination seventh;
    @Resource(name = "sixth")
    private Combination sixth;
    @Resource(name = "third")
    private Combination third;
    @Resource(name = "roleSolverSb")
    private RoleSolver sb;

    private List<String> filledPositionsX = new ArrayList<>();
    private List<String> filledPositionsO = new ArrayList<>();
    private List<String> filledPositions = new ArrayList<>();
    private List<List<String>> combinationsList;

    private String role;

    @Override
    public String getRole() {
        return role;
    }

    private void initCombinationList() {
        combinationsList = new ArrayList<>();
        combinationsList.add(eighth.getCombination());
        combinationsList.add(fifth.getCombination());
        combinationsList.add(first.getCombination());
        combinationsList.add(fourth.getCombination());
        combinationsList.add(second.getCombination());
        combinationsList.add(seventh.getCombination());
        combinationsList.add(sixth.getCombination());
        combinationsList.add(third.getCombination());
    }


    @Override
    public boolean isCombination(List<String> allFilledCells) {
        initCombinationList();
        for (List<String> combinationList : combinationsList) {
            if (allFilledCells != null && allFilledCells.contains(combinationList)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<String> addFilledPosition(String position) {
        int sizeFilled = filledPositions.size();
        String role = sb.getRole(sizeFilled);
        filledPositions.add(position);
        if (role.equals(SVConstants.X)) {
            filledPositionsX.add(position);
            return filledPositionsX;
        } else {
            filledPositionsO.add(position);
            return filledPositionsO;
        }
    }

    @Override
    public void deletedFilledPositions() {
        filledPositions.clear();
        filledPositionsX.clear();
        filledPositionsO.clear();
    }

}

