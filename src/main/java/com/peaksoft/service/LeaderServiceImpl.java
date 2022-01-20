package com.peaksoft.service;

import com.peaksoft.dao.LeaderDao;
import com.peaksoft.dao.LeaderDaoImpl;

public class LeaderServiceImpl implements LeaderService {
    LeaderDao leaderDao = new LeaderDaoImpl();
    @Override
    public void addLeader(String name, int age, String position) {
        leaderDao.addLeader(name, age, position);
    }

    @Override
    public void printLeaders() {
        leaderDao.printLeaders();
    }
}
