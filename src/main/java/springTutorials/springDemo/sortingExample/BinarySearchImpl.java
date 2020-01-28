package springTutorials.springDemo.sortingExample;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope(value="prototype") // we hard coded the scope
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) // most used
public class BinarySearchImpl {

       ////////////// LOGGER ///////////////////////////////////////////////////////////////////////////////////////////
      private   Logger LOOGER = LoggerFactory.getLogger(this.getClass());
      ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // initiating a variable for the class which holds the " DEPENDENCY "
   @Autowired
   @Qualifier(value = "quick") //  precising the correct implementation
   private SortAlgorithmInterface chosenSortingAlgorithm; // the interface
    /////////////////////// important ,///////////// spring can generate the generate the constructor or the setter automatically because it is autowired
   /// 1 -  via  constructor
//   BinarySearchImpl(SortAlgorithmInterface passedSortAlgorithm) {
//        super();
//        this.passedSortAlgorithm = passedSortAlgorithm;
//    }

    /// 2 - via setter :  spring can also use a setter to set the sort algorithm instead of using the constructor
//    public void setPassedSortAlgorithm(SortAlgorithmInterface passedSortAlgorithm) {
//        this.passedSortAlgorithm = passedSortAlgorithm;
//    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////




    // a function take an array and sort it via binary search then search for a number within the array
    public int binarySearchFn(int[] arr, int number){
              int[] sortedArray;
         sortedArray =   this.chosenSortingAlgorithm.sortArray(arr);
        return 8;
    };

  //////////////////////////////////////////////////////     post constructing the bean just after the dependencies populated  //////////////////////////////
   @PostConstruct
    public void postConstructFn (){
       LOOGER.info(" ==== post constructor of  the bean  ====> {}:");
   }
   ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////     pre  destroying the bean    ////////////////////////////// //////////////////////////////
    @PreDestroy
    public void perDestroyFn (){
        LOOGER.info(" ==== pre  destroy the bean   ====> {}:");
    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



}
