package ohtu;

import java.util.ArrayList;
import java.util.List;

public class Submission {

    private String student_number;
    private String week;
    private String hours;
    private String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
    private List<String> tehdytTehtävät;

    public String getStudent_number() {
        return student_number;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    public void setA10(String a10) {
        this.a10 = a10;
    }

    public void setA11(String a11) {
        this.a11 = a11;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        this.tehdytTehtävät = new ArrayList<String>();
        this.tehdytTehtävät.add(a1);
        this.tehdytTehtävät.add(a2);
        this.tehdytTehtävät.add(a3);
        this.tehdytTehtävät.add(a4);
        this.tehdytTehtävät.add(a5);
        this.tehdytTehtävät.add(a6);
        this.tehdytTehtävät.add(a7);
        this.tehdytTehtävät.add(a8);
        this.tehdytTehtävät.add(a9);
        this.tehdytTehtävät.add(a10);
        this.tehdytTehtävät.add(a11);
        int done = tehdytTehtavat();
        String tehdyt = makeTehdyt();
        return "viikko " + week + " tehtyjä tehtäviä yhteensä: " + done + ", aikaa kului: " + hours + " tuntia, tehdyt tehtävät: " + tehdyt;

    }

    public int tehdytTehtavat() {
        int done = 0;
        for (String x : this.tehdytTehtävät) {
            if ("true".equals(x)) {
                done++;
            }
        }
        return done;
    }

    public String makeTehdyt() {
        int i = 1;
        String r = "";
        for (String x : this.tehdytTehtävät) {
            if ("true".equals(x)) {
                r += i + " ";
            }
            i++;
        }
        return r;
    }

}
