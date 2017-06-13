package game.classes.combinations.three.impl;

import game.classes.combinations.three.CombinationsThreeByThree;
import game.classes.combinations.three.combination.impl.CombinationImpl;
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
    private CombinationImpl eighth;
    @Resource(name = "fifth")
    private CombinationImpl fifth;
    @Resource(name = "first")
    private CombinationImpl first;
    @Resource(name = "fourth")
    private CombinationImpl fourth;
    @Resource(name = "second")
    private CombinationImpl second;
    @Resource(name = "seventh")
    private CombinationImpl seventh;
    @Resource(name = "sixth")
    private CombinationImpl sixth;
    @Resource(name = "third")
    private CombinationImpl third;
    @Resource(name = "roleSolverSb")
    private RoleSolver sb;

    private List<String> filledPositionsX = new ArrayList<>();
    private List<String> filledPositionsO = new ArrayList<>();
    private List<String> filledPositions = new ArrayList<>();
    private List<List<String>> combinationsFilledList = new ArrayList<>();

    private String role;

    public List<List<String>> getCombinationsFilledList() {
        return combinationsFilledList;
    }

    public void setCombinationsFilledList(List<List<String>> combinationsFilledList) {
        this.combinationsFilledList = combinationsFilledList;
    }

    @Override
    public String getRole() {
        return role;
    }

    private void initCombinationList() {

        combinationsFilledList.add(eighth.getCombinationList());
        combinationsFilledList.add(fifth.getCombinationList());
        combinationsFilledList.add(first.getCombinationList());
        combinationsFilledList.add(fourth.getCombinationList());
        combinationsFilledList.add(second.getCombinationList());
        combinationsFilledList.add(seventh.getCombinationList());
        combinationsFilledList.add(sixth.getCombinationList());
        combinationsFilledList.add(third.getCombinationList());
    }


    @Override
    public boolean isCombination(List<String> allFilledCells) {
        //initCombinationList();
        for (List<String> combinationList : combinationsFilledList) {
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

