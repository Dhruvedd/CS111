public class ReverseArray {
    public static void main(String[] args)
    {
        int temp = 0;
        int[] a = {1,2,3};
        int b = a.length - 1;
        for(int i = a.length - 1; i>=0;i--)
        {
            temp = a[i];
            a[i] = a[b-i];
            a[b-i] = temp;
            System.out.println(a[b-i]);

        }
        for(int j = 0; j<a.length;j++)
        {
            //System.out.println(a[j]);
        }
    }

    
}
