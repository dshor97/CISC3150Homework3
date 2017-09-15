import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String s1 = new String("Phone");
        String s2 = new String("House");
        String s3 = new String("TELEPHONE");

        MyString one = new MyString(s1.toCharArray());
        MyString two = new MyString(s2.toCharArray());
        MyString three = new MyString(s3.toCharArray());

        System.out.println("MyString one is: " + one);
        System.out.println("MyString two is: " + two);
        System.out.println("MyString three is: " + three);

        System.out.println();

        one = one.toLowerCase();
        two = two.toUpperCase();
        three = three.toLowerCase();

        System.out.println("Changing MyString one to lower case: ");
        System.out.println(one);
        System.out.println();

        System.out.println("Changing MyString two to upper case: ");
        System.out.println(two);
        System.out.println();

        System.out.println("Changing MyString three to lower case: ");
        System.out.println(three);
        System.out.println();

        System.out.println("MyString three before substring(4,8): ");
        System.out.println(three);

        three = three.substring(4,8);
        System.out.println();

        System.out.println("MyString three after substring(4,8): ");
        System.out.println(three);

        System.out.println();

        System.out.println("Test MyString equals function: ");
        boolean test1 = three.equals(one);
        boolean test2 = one.equals(two);

        if(test1){
            System.out.println(one + " and " + three + " are equal.");
        }else{
            System.out.println(one + " and " + three + " are not equal.");
        }
        if(test2){
            System.out.println(one + " and " + two + " are equal.");

        }else{
            System.out.println(one + " and " + two + " are not equal.");
        }

        System.out.println();
        System.out.println("Testing charAt() function: ");

        for(int i =0; i < one.length(); i++){
            System.out.println("Char at " + i + " is: " + one.charAt(i));
        }

        System.out.println();
        System.out.println("Testing getMyString(): ");
        MyString four = three.getMyString();
        System.out.println(four);

        MyString string = MyString.valueOf(12342);

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

    public static MyString valueOf(int i){
        char[] a = new char[Integer.toString(i).length()];
        Scanner scanner = new Scanner(Integer.toString(i)).useDelimiter("");
        int c = 0;
        while(scanner.hasNext()){
            a[c] = (char)scanner.nextInt();
            System.out.println(a[c]);
            c++;
        }
        MyString string = new MyString(a);
        return string;
    }

}
