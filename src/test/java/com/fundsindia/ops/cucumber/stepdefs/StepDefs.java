package com.fundsindia.ops.cucumber.stepdefs;

import com.fundsindia.ops.OpsconsoleApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = OpsconsoleApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
