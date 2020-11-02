package com.company;

import java.util.Comparator;

public class DigitAmountSort implements Comparator<String> {

        public int HowManyDigits(String st) {
            int sum = 0;
            char[] character = st.toCharArray();
            for (int i = 0; i < st.length(); i++){
                if (character[i] >= '0' && character[i] <= '9') {
                    sum++;
                }
            }
            return sum;


        }


        @Override
        public int compare(String st1, String st2){
            if (HowManyDigits(st1) > HowManyDigits(st2)) {
                return 1;
            }else
                { if(HowManyDigits(st1) < HowManyDigits(st2) )
                {
                    return -1;

                }else
                    {
                        return 0;
                    }
                }

        }

    }


