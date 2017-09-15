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

        System.out.println();
        System.out.println("Testing value of: ");
        MyString string = MyString.valueOf(128439234);
        System.out.println(string);

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
        int x;
        while(scanner.hasNext()){
            x = scanner.nextInt();
            switch(x){
                case 0:
                    a[c] = '0';
                    break;
                case 1:
                    a[c] = '1';
                    break;
                case 2:
                    a[c] = '2';
                    break;
                case 3:
                    a[c] = '3';
                    break;
                case 4:
                    a[c] = '4';
                    break;
                case 5:
                    a[c] = '5';
                    break;
                case 6:
                    a[c] = '6';
                    break;
                case 7:
                    a[c] = '7';
                    break;
                case 8:
                    a[c] = '8';
                    break;
                case 9:
                    a[c] = '9';
                    break;
            }
            c++;
        }
        MyString string = new MyString(a);
        return string;
    }
}
