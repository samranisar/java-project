package android.com;

/**
 * Created by Samra on 21-Sep-16.
 */
public class Math {
    int minimum;
    int maximum;
    int absolute;
    double ceiling;

    public int min(int k,int l)
    {
        return (k<l)? k : l ;

    }

    public int max(int m,int n)
    {
        return (m>n) ? m : n;
    }

    public int abs(int absolute)
    {
      return (absolute<0) ? -absolute : absolute ;
    }

    public double ceil(double ceiling)
    {
        return (ceiling==(int)(ceiling))?ceiling :(ceiling=ceiling+1)  ;
    }
}
