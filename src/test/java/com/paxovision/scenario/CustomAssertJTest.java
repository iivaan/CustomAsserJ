package com.paxovision.scenario;

import com.paxovision.model.MyModel;
import com.paxovision.model.MyModelAssert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomAssertJTest {
    MyModel myModel;

    @BeforeEach
    public void beforeEach(){
        myModel = new MyModel();
        myModel.setId(1);
        myModel.setName("Iftekhar Ivaan");
        myModel.setAddress("397 plainfield Ave, Floral park, NY 11001");
        myModel.setActive(true);
    }

    @Test
    public void test1(){
       MyModelAssert.assertThat(myModel)
                .hasId(1)
                .id().isNotZero()
                .and().hasName("Iftekhar Ivaan")
                .and().name().containsIgnoringCase("ivaan")
                .and().as("Address verify1").hasAddress("397 plainfield Ave, Floral park, NY 11001")
           ;
    }

    @AfterEach
    public void afterEach(){

    }


}
