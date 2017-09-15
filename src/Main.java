import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String s1 = new String("House");
        String s2 = new String("Phone");
        String s3 = new String("TELEPHONE");

        MyString one = new MyString(s1.toCharArray());
        MyString two = new MyString(s2.toCharArray());
        MyString three = new MyString(s3.toCharArray());

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        System.out.println();

        one = one.toLowerCase();
        two = two.toUpperCase();
        three = three.toLowerCase();

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

    }
}

class MyString{
    private char[] charStr;

    public MyString(char[] chars){
        charStr = new char[chars.length];
        for(int i = 0; i < chars.length; i++){
            charStr[i] = chars[i];
        }
    }

    public char charAt(int index){
        char tmp = charStr[index];
        return tmp;
    }

    public int length(){
        int temp = charStr.length;
        return temp;
    }

    public MyString substring(int begin, int end){
        char[] tmp = new char[end - begin + 1];
        for(int i = 0; i< tmp.length; i++){
            tmp[i] = charStr[begin + i];
        }
        MyString myStr = new MyString(tmp);
        return myStr;
    }

    public MyString toLowerCase(){
        char[] temp = new char[charStr.length];
        for(int i = 0; i < charStr.length;i++){
            if((int)charStr[i] >= 65 && (int)charStr[i] <= 90){
                temp[i] = (char)((int)charStr[i] + 32);
            }else{
                temp[i] = charStr[i];
            }
        }
        MyString myStr = new MyString(temp);
        return myStr;
    }

    public MyString toUpperCase(){
        char[] temp = new char[charStr.length];
        for(int i = 0; i < charStr.length;i++){
            if((int)charStr[i] >= 97 && (int)charStr[i] <= 122){
                temp[i] = (char)((int)charStr[i] - 32);
            }else{
                temp[i] = charStr[i];
            }
        }
        MyString myStr = new MyString(temp);
        return myStr;
    }

    public boolean equals(MyString s){
        if(charStr.length != s.charStr.length){
            return false;
        }else {
            for (int i = 0; i < charStr.length; i++){
                if(charStr[i] != s.charStr[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public MyString getMyString(){
        char[] temp = new char[charStr.length];
        for(int i = 0;i<charStr.length;i++){
            temp[i] = charStr[i];
        }
        MyString myStr = new MyString(temp);
        return myStr;
    }

    public String toString(){
        String temp = new String(charStr);
        return temp;
    }

    //still do
    public static MyString valueOf(int i){
        char[] temp = new char[Integer.toString(i).length()];
        Scanner scanner = new Scanner(Integer.toString(i));
        scanner.useDelimiter("");
        int count = 0;
        while(scanner.hasNext()){
            temp[count] = (char)(scanner.nextByte(i));
            count++;
        }
        MyString tmp = new MyString(temp);
        return tmp;
    }

}
