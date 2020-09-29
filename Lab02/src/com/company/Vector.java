package com.company;

import java.util.Random;

    public class Vector {

        double x;
        double y;
        double z;

        Vector(double x, double y, double z){
            this.x=x;
            this.y=y;
            this.z=z;
        }

        public double vectorLength () {
            double length;
            length = Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));
            return length;
        }

        @Override
        public String toString(){
            return "Vector ("+ x +", "+ y +", "+ z +")";

        }

         public double scalarMultiply ( Vector Second){
            double  vScalar;
            vScalar = this.x * Second.x + this.y * Second.y + this.z * Second.z;
             return vScalar;
         }

          static Vector vectorMultiply (Vector First, Vector Second){
              final Vector vectorMultiply;

               // double x  = First.y * Second.z - First.z * Second.y;
               // double y  = First.z * Second.x - First.x * Second.z;
               // double z = First.x * Second.y - First.y * Second.x;
                //final Vector myVector;
               // Vector vectorMultiply = new Vector (x ,y, z);
                //return myVector;
              vectorMultiply = new Vector (First.y * Second.z - First.z * Second.y,
                      First.z * Second.x - First.x * Second.z, First.x * Second.y - First.y * Second.x );
                return vectorMultiply;
          }

        static double vectorAngle (Vector First, Vector Second) {
            double angle;
            double scalar;
            double module1;
            double module2;
            double modules;
            scalar = First.scalarMultiply (Second);
            module1 = Math.abs(First.vectorLength());
            module2 = Math.abs(Second.vectorLength());
            modules = module1 * module2;
            angle = Math.toDegrees(Math.acos(scalar / modules));
            //for 90 deg
            // angle = Math.toDegrees(Math.acos(0));
            //out
            //System.out.println("scalar= " + scalar);
            //System.out.println("module1= " + module1);
            //System.out.println("module2= " + module2);
            //System.out.println("modules= " + modules);
            //System.out.println("angle= " + angle);

            return angle;
        }

        static  Vector Sub (Vector First, Vector Second){
            final Vector Sub;
            Sub = new Vector (First.x - Second.x, First.y-Second.y, First.z-Second.z);
            return Sub;
        }

        static Vector Add (Vector First, Vector Second){
            final Vector Add;
            Add = new Vector (First.x + Second.x, First.y+Second.y, First.z+Second.z);
            return Add;
        }

        // статический метод
        static Vector[] ArrayVectors (int n){
            final Vector[] vectors = new Vector [n];
            for (int i=0; i<n; i++){
                vectors[i] = new Vector (
                        (int)(30*Math.random()),
                        (int)(30*Math.random()),
                        (int)(30*Math.random()));
            }
            return vectors;
        }

    }
