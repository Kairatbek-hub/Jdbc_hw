package com.peaksoft.dao;

public interface LeaderDao {
    void addLeader(String name, int age, String position);
    void printLeaders();
}
