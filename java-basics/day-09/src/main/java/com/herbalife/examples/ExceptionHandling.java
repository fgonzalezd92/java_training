package com.herbalife.examples;

public class ExceptionHandling {
    static boolean switchPosition = false;
    public static void main(String[] args) throws Exception {
        //2 Types of exceptions -> checked and unchecked

        turnOnSwitch();

//        try {
//            turnOffSwitch();
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }

        turnOffSwitch();
    }

    static void turnOnSwitch(){
        if(switchPosition)
            throw new SwitchAlreadyOnException("Switch is already on");

        switchPosition = true;
    }
    static void turnOffSwitch() throws Exception{
//        try {
//            if(!switchPosition)
//                throw new Exception("Switch is already off");
//            switchPosition = false;
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        if(!switchPosition)
            throw new Exception("Switch is already off");

        switchPosition = false;
    }

    static class SwitchAlreadyOnException extends RuntimeException {
        public SwitchAlreadyOnException(String message) {
            super(message);
        }
    }
}
