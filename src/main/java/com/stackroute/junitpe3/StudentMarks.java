package com.stackroute.junitpe3;

public class StudentMarks {

        private int numOfStudents;
        private  int [] stuGrades;

        public StudentMarks(int numOfStudents, int[] stuGrades) {
            this.numOfStudents = numOfStudents;
            this.stuGrades = stuGrades;
        }

        public boolean checkGrades(){
            for (int element: stuGrades) {
                if(element < 0 || element >100)//to check student grades in between 0 to 100
                    {
                    return false;
                }
            }
            return true;
        }
}
