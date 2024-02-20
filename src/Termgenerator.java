public class Termgenerator{
    public static void main(String args[]){
        Termgenerator gen = new Termgenerator();
        while(true)
            System.out.println(gen.generate());
    }
    public Termgenerator(){

    }
    public String generate(){
        String s = "";
        switch (Zufallsgenerator.generate(0, 9)){
            case 0:
                s += "0" + r1();
                break;
            case 1:
                s += "1" + r1();
                break;
            case 2:
                s += "2" + r1();
                break;
            case 3:
                s += "3" + r1();
                break;
            case 4:
                s += "4" + r1();
                break;
            case 5:
                s += "5" + r1();
                break;
            case 6:
                s += "6" + r1();
                break;
            case 7:
                s += "7" + r1();
                break;
            case 8:
                s += "8" + r1();
                break;
            case 9:
                s += "9" + r1();
                break;
            default:
                break;
        }
        //switch(Zufallsgenerator.generate(1, 10))
        return s;
    }
    private String r1(){
        String s = "";
        //s += "(r1)";
        switch (Zufallsgenerator.generate(0, 1)){
            case 0:
                switch (Zufallsgenerator.generate(0, 9)){
                    case 0:
                        s += "0" + r1();
                        break;
                    case 1:
                        s += "1" + r1();
                        break;
                    case 2:
                        s += "2" + r1();
                        break;
                    case 3:
                        s += "3" + r1();
                        break;
                    case 4:
                        s += "4" + r1();
                        break;
                    case 5:
                        s += "5" + r1();
                        break;
                    case 6:
                        s += "6" + r1();
                        break;
                    case 7:
                        s += "7" + r1();
                        break;
                    case 8:
                        s += "8" + r1();
                        break;
                    case 9:
                        s += "9" + r1();
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (Zufallsgenerator.generate(0, 3)){
                    case 0:
                        s += " + " + r2();
                        break;
                    case 1:
                        s += " - " + r2();
                        break;
                    case 2:
                        s += " * " + r2();
                        break;
                    case 3:
                        s += " / " + r2();
                        break;
                    default:
                        break;
                }
            default:
                break;
        }
        return s;
    }
    private String r2(){
        String s = "";
        //s += "(r2)";
        switch (Zufallsgenerator.generate(0, 1)){
            case 0:
                switch (Zufallsgenerator.generate(0, 9)){
                    case 0:
                        s += "0" + r3();
                        break;
                    case 1:
                        s += "1" + r3();
                        break;
                    case 2:
                        s += "2" + r3();
                        break;
                    case 3:
                        s += "3" + r3();
                        break;
                    case 4:
                        s += "4" + r3();
                        break;
                    case 5:
                        s += "5" + r3();
                        break;
                    case 6:
                        s += "6" + r3();
                        break;
                    case 7:
                        s += "7" + r3();
                        break;
                    case 8:
                        s += "8" + r3();
                        break;
                    case 9:
                        s += "9" + r3();
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (Zufallsgenerator.generate(0, 9)){
                    case 0:
                        s += "0";
                        break;
                    case 1:
                        s += "1";
                        break;
                    case 2:
                        s += "2";
                        break;
                    case 3:
                        s += "3";
                        break;
                    case 4:
                        s += "4";
                        break;
                    case 5:
                        s += "5";
                        break;
                    case 6:
                        s += "6";
                        break;
                    case 7:
                        s += "7";
                        break;
                    case 8:
                        s += "8";
                        break;
                    case 9:
                        s += "9";
                        break;
                    default:
                        break;
                }
                break;
        }
        return s;
    }
    private String r3(){
        String s = "";
        //s += "(r3)";
        switch (Zufallsgenerator.generate(0, 2)){
            case 0:
                switch (Zufallsgenerator.generate(0, 9)){
                    case 0:
                        s += "0" + r3();
                        break;
                    case 1:
                        s += "1" + r3();
                        break;
                    case 2:
                        s += "2" + r3();
                        break;
                    case 3:
                        s += "3" + r3();
                        break;
                    case 4:
                        s += "4" + r3();
                        break;
                    case 5:
                        s += "5" + r3();
                        break;
                    case 6:
                        s += "6" + r3();
                        break;
                    case 7:
                        s += "7" + r3();
                        break;
                    case 8:
                        s += "8" + r3();
                        break;
                    case 9:
                        s += "9" + r3();
                        break;
                    default:
                        break;
                }
                break;
            case 1:
                switch (Zufallsgenerator.generate(0, 9)){
                    case 0:
                        s += "0";
                        break;
                    case 1:
                        s += "1";
                        break;
                    case 2:
                        s += "2";
                        break;
                    case 3:
                        s += "3";
                        break;
                    case 4:
                        s += "4";
                        break;
                    case 5:
                        s += "5";
                        break;
                    case 6:
                        s += "6";
                        break;
                    case 7:
                        s += "7";
                        break;
                    case 8:
                        s += "8";
                        break;
                    case 9:
                        s += "9";
                        break;
                    default:
                        break;
                }
                break;
            case 2:
                switch (Zufallsgenerator.generate(0, 3)){
                    case 0:
                        s += " + " + r2();
                        break;
                    case 1:
                        s += " - " + r2();
                        break;
                    case 2:
                        s += " * " + r2();
                        break;
                    case 3:
                        s += " / " + r2();
                        break;
                    default:
                        break;
                }
                break;
            default:
                break;
        }
        return s;
    }
}