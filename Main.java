import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số phần tử của mảng :");
        int number;
        int index=0;
        Scanner sc = new Scanner(System.in);
        int input =sc.nextInt();
        int[] arrayInteger = new int[input];
        for (int i=0;i<input;i++)
        {
            System.out.print("Hãy nhập phần tử thứ"+" "+(i+1));
            arrayInteger[i]=sc.nextInt();
        }
        for(int j=0;j<arrayInteger.length;j++)
        {
            System.out.println(arrayInteger[j]);
        }
        System.out.println("Hãy nhập phần tử cần xóa");
        number=sc.nextInt();
        for(int i=0;i<arrayInteger.length;i++)
        {
            if(arrayInteger[i]==number)
            {
                index=i;
                System.out.println("Vị trí cần xóa là : " +" " +index);
            }
        }
        for (int j=index;j<arrayInteger.length;j++)
        {
            if(j==arrayInteger.length-1)
            {
                arrayInteger[j]=0;
            }else
                arrayInteger[j]=arrayInteger[j+1];
        }
        int[] newArray =new int[arrayInteger.length-1];
        for(int j=0;j<newArray.length;j++)
        {
            newArray[j]=arrayInteger[j];
        }
        System.out.println("Mảng sau khi xóa là :");
        for(int j=0;j<newArray.length;j++)
        {
            System.out.println(newArray[j]);
        }

    }
}
