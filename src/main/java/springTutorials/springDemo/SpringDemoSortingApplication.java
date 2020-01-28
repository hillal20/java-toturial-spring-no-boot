package springTutorials.springDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springTutorials.springDemo.sortingExample.BinarySearchImpl;

import javax.annotation.PreDestroy;



@Configuration
@ComponentScan("springTutorials.springDemo")
public class SpringDemoSortingApplication {


	public static void main(String[] args) {
		////////////////////////////////////////////////////////////////////////////
		ApplicationContext applicationContext =  new AnnotationConfigApplicationContext(SpringDemoSortingApplication.class) {
		};


		/* the code bellow  is telling spring to take the passed class and create an instance of it , and since
		the passed class need a parameter of quickSortAlgorithm, we have to go to BinarySearchImpl class and
		we type @autowire  at the sortAlgorithmInterface. And we have to write @Component on the top of the
		chosen class, at this case we are choosing quickSortAlgorithm
		 */
		BinarySearchImpl binarySearchImp  = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImp1  = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println("binarySearchImp  ===> " + binarySearchImp);  // not the same scope
		System.out.println("binarySearchImp 1  ===> " + binarySearchImp1); // not  the same scope because we recommended "prototype"







		///////////////////////////////////////////////////////////////////////////////

        int result;
		int[] arr = {1, 3,4, 6,7 };
        result =  binarySearchImp.binarySearchFn( arr, 3);
		System.out.println("result ===> "+ result);



		/////////////////// app is working
		System.out.println("<========= Spring  Application ==============>");

	}



}
