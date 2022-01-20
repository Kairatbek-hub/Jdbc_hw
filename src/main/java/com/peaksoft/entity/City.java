package com.peaksoft.entity;

public class City {
    private int id;
    private String name;
    private int leader_id;
    private int country_id;

    public City() {
    }

    public City(int id, String name, int leader_id, int country_id) {
        this.id = id;
        this.name = name;
        this.leader_id = leader_id;
        this.country_id = country_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLeader_id() {
        return leader_id;
    }

    public void setLeader_id(int leader_id) {
        this.leader_id = leader_id;
    }

    public int getCountry_id() {
        return country_id;
    }

    public void setCountry_id(int country_id) {
        this.country_id = country_id;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", leader_id=" + leader_id +
                ", country_id=" + country_id +
                '}';
    }
}
