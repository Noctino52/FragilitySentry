import org.apache.commons.math3.stat.StatUtils;

import java.util.ArrayList;
import java.util.List;

public class PointBiserialCorrelationCoefficient {


    static List<Boolean> dichotomous=new ArrayList<>();
    static List<Double> continius=new ArrayList<>();

    static List<Boolean> dichotomousFalse=new ArrayList<>();
    static List<Double> continiusFalse=new ArrayList<>();

    static List<Boolean> dichotomousTrue=new ArrayList<>();
    static List<Double> continiusTrue=new ArrayList<>();


    private static void setLists(List<Test> testJudged) {

        for (Test test:testJudged) {
            System.out.println(test);
            Double score=test.getTestScore();
            Boolean dichotomousValue=test.isLaterGetSuccess();

            continius.add(score);
            dichotomous.add(dichotomousValue);

            if(dichotomousValue){
                dichotomousTrue.add(dichotomousValue);
                continiusTrue.add(score);
            }
            else{
                dichotomousFalse.add(dichotomousValue);
                continiusFalse.add(score);
            }
        }
    }

    private static double getStandardDeviation(List<Double> continius) {
        double mean = continius.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0.0);

        double squaredDiffSum = continius.stream()
                .mapToDouble(num -> Math.pow(num - mean, 2))
                .sum();

        double variance = squaredDiffSum / continius.size();
        return Math.sqrt(variance);
    }

    public static double getCorrelation(List<Test> testJudged){

        setLists(testJudged);

        double meanContiniusFalse = StatUtils.mean(
                continiusFalse.stream().mapToDouble(Double::doubleValue).toArray()
        );
        double meanContiniusTrue = StatUtils.mean(
                continiusTrue.stream().mapToDouble(Double::doubleValue).toArray()
        );

        double standardDeviation=getStandardDeviation(continius);

        int n0=dichotomousTrue.size();
        int n1=dichotomousFalse.size();
        int n=dichotomous.size();

        double squarePart=Math.sqrt((n0*n1)/Math.pow(n,2));

        double numerator=(meanContiniusTrue-meanContiniusFalse)*squarePart;
        double result=numerator/standardDeviation;
        System.out.println("Il coefficiente di correlazione è : "+result);

        return result;
    }

}
