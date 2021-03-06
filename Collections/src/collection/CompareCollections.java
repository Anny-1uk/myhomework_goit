package collection;

import java.util.*;

public class CompareCollections {
    public static void main(String[] args) throws Exception {

        int[] options = {100, 1000, 10000}; // массив для вариантов  колличества прогонов
        double[] resultList = new double[42];//массив для показателей после рассчетов по массивам Лист
        double[] resultSet = new double[24]; // массив для показателей после рассчетов по массивам Сет
        int step = 0;
        List arrayList = new ArrayList();
        List linkedList = new LinkedList();
        HashSet hashSet = new HashSet();
        TreeSet treeSet = new TreeSet();

        TestTime testTime = new TestTime();

        for (int i = 0; i < options.length; i++) {

            resultList[i + step] = testTime.testTimeAdd(arrayList, options[i]);
            resultList[i + 1 + step] = testTime.testTimeGetList(arrayList, options[i]);
            resultList[i + 2 + step] = testTime.testTimeRemove(arrayList, options[i]);
            resultList[i + 3 + step] = testTime.testTimeContains(arrayList, options[i]);
            resultList[i + 4 + step] = testTime.testTimePopulate(arrayList, options[i]);
            resultList[i + 5 + step] = testTime.testTimeIteratorAdd(arrayList, options[i]);
            resultList[i + 6 + step] = testTime.testTimeIteratorRemove(arrayList, options[i]);

            resultList[i + 7 + step] = testTime.testTimeAdd(linkedList, options[i]);
            resultList[i + 8 + step] = testTime.testTimeGetList(linkedList, options[i]);
            resultList[i + 9 + step] = testTime.testTimeRemove(linkedList, options[i]);
            resultList[i + 10 + step] = testTime.testTimeContains(linkedList, options[i]);
            resultList[i + 11 + step] = testTime.testTimePopulate(linkedList, options[i]);
            resultList[i + 12 + step] = testTime.testTimeIteratorAdd(linkedList, options[i]);
            resultList[i + 13 + step] = testTime.testTimeIteratorRemove(linkedList, options[i]);

            if (i == 2) {
                step = 27;
            } else
                step += 13;
        }

        step = 0;

        for (int i = 0; i < options.length; i++) {

            resultSet[i + step] = testTime.testTimeAddSet(hashSet, options[i]);
            resultSet[i + 1 + step] = testTime.testTimeRemove(hashSet, options[i]);
            resultSet[i + 2 + step] = testTime.testTimeContains(hashSet, options[i]);
            resultSet[i + 3 + step] = testTime.testTimePopulate(hashSet, options[i]);
            resultSet[i + 4 + step] = testTime.testTimeAddSet(treeSet, options[i]);
            resultSet[i + 5 + step] = testTime.testTimeRemove(treeSet, options[i]);
            resultSet[i + 6 + step] = testTime.testTimeContains(treeSet, options[i]);
            resultSet[i + 7 + step] = testTime.testTimePopulate(treeSet, options[i]);

            if (i == 2) {
                step = 13;
            } else
                step += 7;

        }
        TablePrint tablePrint = new TablePrint();
        tablePrint.entryPrintTable(resultList, resultSet, options);
        tablePrint.entryInFileTable(resultList, resultSet, options);

    }


}


