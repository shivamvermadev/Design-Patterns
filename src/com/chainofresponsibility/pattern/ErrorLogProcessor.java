package com.chainofresponsibility.pattern;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        // added for the code flow
        System.out.print("Error -> ");

        if(logLevel == ERROR) {
            System.out.println("ERROR: " + message );
        } else {
            super.log(logLevel, message);
        }
    }
}