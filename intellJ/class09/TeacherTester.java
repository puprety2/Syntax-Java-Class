package com.syntax.intellJ.class09;

public class TeacherTester {
    public static void main(String[] args) {
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher();
        chemistryTeacher.degree="Phd in chemistry";
        chemistryTeacher.hasAPeriodicTablePoster=true;
        chemistryTeacher.print();
    }
}
