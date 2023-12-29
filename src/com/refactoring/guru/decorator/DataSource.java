package com.refactoring.guru.decorator;

public interface DataSource {
    void writeData(String data);

    String readData();
}
