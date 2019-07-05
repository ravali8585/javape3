package com.stackroute.junitpe3;

/*
My Chess Board
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
*/
public class Chess {

    public String generateBoard(){
        StringBuffer result=new StringBuffer("");
        for(int i=1;i<=8;i+=2){
            for(int j=1;j<=8;j++){
                if(j%2==1){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");
            for(int j=1;j<=8;j++){
                if(j%2==0){
                    result.append("WW");
                }else {
                    result.append("BB");
                }

                result.append("|");
            }
            result.append("\n");

        }
        return result.substring(0,result.length()-1);
    }
}
