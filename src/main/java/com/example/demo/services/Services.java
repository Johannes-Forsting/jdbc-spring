package com.example.demo.services;

public class Services {
    public String whatIsIt(int time){
        if(time >= 6 && time <= 12){
            return "morning";
        }
        if(time >= 13 && time <= 16){
            return "afternoon";
        }
        if(time >= 17 && time <= 22){
            return "evening";
        }
        if (time > 24 || time < 0) {
            return "error";
        }
        return "night";
    }

    public boolean isDepartmentNumberValid(int departmentNumber){
        if(departmentNumber > 999 || departmentNumber < 10){
            return false;
        }
        else if (!(departmentNumber % 10 == 0)){
            return false;
        }
        return true;
    }



}