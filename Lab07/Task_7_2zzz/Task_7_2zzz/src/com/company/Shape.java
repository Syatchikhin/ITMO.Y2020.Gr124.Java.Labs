package com.company;

    public class Shape implements Comparable<Shape> {
        public double volume;
        
            public Shape (double vol)
            {
                this.volume = vol;
            }

            public double getVolume(){
                return volume;

            }

       @Override
        public int compareTo( Shape shapes){
                if (this.volume == shapes.volume){
                    return 0;
                }
                else {
                    if (this.volume < shapes.volume) {
                        return -1;
                    } else {
                        return 1;
                    }


                }

       }


    }

