/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ThinkPro
 */
public class ClassRoom {
    String code;
    String name;
    int seats;

    public ClassRoom() {
    }

    public ClassRoom(String code, String name, int seats) {
        this.code = code;
        this.name = name;
        this.seats = seats;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public String toString() {
        return code + "\t" + name + "\t" + seats;
    }
    
    
}
