package springTutorials.springDemo.sortingExample;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary // to let spring take this first as chosenSortingAlgorithm , even if we specify the exact name of the sorting algorithm
@Qualifier(value = "quick") // we could choose qualifier instead of primary annotation
public class QuickSortAlgorithm implements SortAlgorithmInterface {
    @Override
    public int[] sortArray(int[] arr){
        return arr;
    }


}
