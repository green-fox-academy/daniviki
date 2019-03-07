package com.greenfoxacademy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class BlueColor implements MyColor {

    Printer printer;

    @Autowired
    public BlueColor(Printer printer) {
        this.printer = printer;
    }


    @Override
    public void printColor() {
        printer.log("This is blue.");
    }
}
