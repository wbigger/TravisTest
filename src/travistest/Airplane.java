/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travistest;

/**
 *
 * @author claudio
 */
public class Airplane {

    private int people = 0;
    private String name = "Airbus";

    Airplane(int people) {
        this.people = people;
    }

    public int getPeople() {
        return this.people;
    }

    public String getName() {
        return this.name;
    }
}
