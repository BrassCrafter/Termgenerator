public class Termgenerator{
    public String Termgenerator(){
        String s = "";
        switch (Zufallsgenerator.generate(0, 9)){
            case 0:
                s += "0" + r1();

        }
        //switch(Zufallsgenerator.generate(1, 10))
        return "";
    }
    private String r1(){
        String s = "";
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
                }
            case 1:
                switch (Zufallsgenerator.generate(0, 3)){

                }

        }
    }
    private String r2(){

    }
}