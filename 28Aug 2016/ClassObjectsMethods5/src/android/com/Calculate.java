package android.com;

/**
 * Created by Samra on 22-Sep-16.
 */
public class Calculate {


    public int Add(int a,int b){

        return a+b;
    }

    public double Add(double c,double d){

        return c+d;
    }

    public  char Add(char e,char f){
        if((e+f)<=255 && (e+f)>=0)
            return (char)(e+f);
        else
            return (char)(' ');
    }

    public int Subtract(int m,int n){
        return m-n;
    }

    public double Subtract(double o,double p){
        return o-p;
    }

    public char Subtract(char q,char r){

        if(q>r &&  (q+r)<=255 && (q+r)>=0)
            return (char)(q-r);
        else
            return (char)(' ');

    }

  /*  public char charCheck(char s,char t)
    {
        if(s>t &&  (s+t)<=255 && (s+t)>=0)
          return (char)(s-t);
    }*/
}
