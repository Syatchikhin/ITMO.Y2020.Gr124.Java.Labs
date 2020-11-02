package com.company;

public class Box extends SolidOfRevolution {

    public double available;

    Box(double vol) {
        super(vol);
        this.available = vol;
        this.volume = vol;
    }

    public boolean add(Shape shape) {
        if (available >= shape.getVolume()) {

            available -= shape.getVolume();
            System.out.println("volume is: " + available);
            return true;

        } else {
            System.out.println("volume is: " + available);
            return false;
        }
    }

    @Override
    public double getVolume() {
        return volume;
    }

}





//package com.company;
//
//public class Box extends SolidOfRevolution {
//
//    public double available;
//
//    Box(double vol) {
//        super(vol);
//        this.available = vol;
//        this.volume = vol;
//    }
//
//    public boolean add(Shape shape) {
//        if (available >= shape.getVolume()) {
//
//            available -= shape.getVolume();
//            System.out.println("volume is: " + available);
//            return true;
//
//        } else {
//            System.out.println("volume is: " + available);
//            return false;
//        }
//    }
//
//    @Override
//    public double getVolume() {
//        return volume;
//    }
//
//}
