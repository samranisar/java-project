package arith.com;

    public class Main{
    public static void main(String[] args) {
        // write your code here
        int result = 1 + 2;
        System.out.println("result: " + result);
        int originalresult =result;
        System.out.println("original result: "+originalresult);

        result = result-1;
        System.out.println("result: "+result);
        originalresult=result;
        System.out.println("originalresult: "+originalresult);

        result= result*2;
        System.out.println("result: "+result);
        originalresult=result;
        System.out.println("original result: "+originalresult);

        result =result/2;
        System.out.println("result/2: "+result);
        originalresult=result;
        System.out.println("original result: "+originalresult);

        result=result+8;
        System.out.println("result+2: "+result);
        originalresult=result;
        System.out.println("original result:"+originalresult);

        result= result%7;
        System.out.println("result: "+result);
        originalresult=result;
        System.out.println("original result: "+originalresult);


    }
    }
