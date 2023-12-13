package com.chainofresponsibility.pattern;

public class DebugLogProcessor extends LogProcessor {

    public DebugLogProcessor(LogProcessor nextLogProcessor) {
        super(nextLogProcessor);
    }

    public void log(int logLevel, String message) {
        // added for the code flow
        System.out.print("Debug -> ");

        if(logLevel == DEBUG) {
            System.out.println("DEBUG: " + message );
        } else {
            super.log(logLevel, message);
        }
    }
}
