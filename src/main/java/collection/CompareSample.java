package collection;

import java.util.*;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2018-11-14 下午8:39
 **/
public class CompareSample implements Comparable<CompareSample> {
    int score;
    int average;

    public CompareSample(int score, int average) {
        this.score = score;
        this.average = average;
    }

    @Override
    public int compareTo(CompareSample o) {
        if (this.score != o.score) {
            return this.score > o.score ? 1 : -1;
        } else {
            return this.average >= o.average ? 1 : -1;
        }
//        return 0;
    }

    public static void main(String[] args) {
        CompareSample compareSample1 = new CompareSample(1, 2);
        CompareSample compareSample2 = new CompareSample(2, 2);
        CompareSample compareSample3 = new CompareSample(6, 2);
        CompareSample compareSample4 = new CompareSample(2, 1);
        CompareSample compareSample5 = new CompareSample(-1, 2);
        List<CompareSample> compareSamplesList = new ArrayList<>();
        compareSamplesList.add(compareSample1);
        compareSamplesList.add(compareSample2);
        compareSamplesList.add(compareSample3);
        compareSamplesList.add(compareSample4);
        compareSamplesList.add(compareSample5);
        CompareSample[] compareSamples = new CompareSample[5];
        compareSamplesList.toArray(compareSamples);

//        Arrays.sort(compareSamplesList, CompareSample);
//        compareSamplesList.sort();
//        Arrays.sort(compareSamplesList);
        Collections.sort(compareSamplesList);
        Arrays.sort(compareSamples, new Comparator<CompareSample>() {
            @Override
            public int compare(CompareSample o1, CompareSample o2) {
                if (o1.score != o2.score) {
                    return o1.score > o2.score ? 1 : -1;
                } else {
                    return o1.average >= o2.average ? 1 : -1;
                }
            }
        });

        for (int i = 0; i < compareSamplesList.size(); i++) {
            System.out.println("====score is:" + compareSamplesList.get(i).score + ", average is :" + compareSamplesList.get(i).average);
        }
    }


}
