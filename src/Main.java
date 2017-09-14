public class Main {
    public static void main(String[] args){

    }
}

class MyString{
    private char[] charStr;

    public MyString(char[] chars){

    }
    public char charAt(int index){
        char tmp = charStr[index];
        return tmp;
    }
    public int length(){
        return charStr.length;
    }
    public MyString substring(int begin, int end){
        char[] tmp = new char[end - begin];

        for(int i = 0; i<(end - begin); i++){
            tmp[i] = charStr[begin + i];
        }

        MyString myStr = new MyString(tmp);

        return myStr;
    }
    /*

    public MyString toLowerCase(){
        char[] temp = new char[charStr.length];

    }
    public MyString toUpperCase(){

    }
    public boolean equals(MyString s){

    }
    public MyString getMyString(){

    }
    public String toString(){

    }
    public static MyString valueOf(int i){

    }

    */



}
