package api.cucumber.hooks;

import cucumber.api.java.After;
import cucumber.api.java.Before;


public class CucumberHooks {
    @Before
    public void setUp(){

        System.out.println("-----Before hook----");
    }
    @After
    public void tearDown(){

        System.out.println("-----After hook---");
    }

/*    @BeforeStep
    public void setUpSteps(){
        System.out.println("---BeforeStep Hook---");
    }
    @AfterStep
    public void tearDownStep(){
        System.out.println("---AfterStep Hook---");
    }*/
}
