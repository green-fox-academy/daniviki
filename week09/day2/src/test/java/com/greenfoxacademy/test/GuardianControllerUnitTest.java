package com.greenfoxacademy.test;

import com.greenfoxacademy.test.controller.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerUnitTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


    @Autowired
    MockMvc mockMvc;

    @Test
    public void translateReceivedMessageIntoGrootTest_ResultSring() throws Exception{

        mockMvc.perform(get("/groot/{message}", "jashjsaj"))
                .andExpect(jsonPath("$.translated", is("I am Groot!")));

    }

    @Test
    public void calculateSpeedOfArrowTest_ResultDouble() throws Exception{

        mockMvc.perform(get("/yondu?distance=100.0&time=10.0"))
                .andExpect(jsonPath("$.speed", is(10.0)));

    }
}
