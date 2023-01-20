import java.util.Scanner;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);
        int n, r, c,n2=1,r2=1,cik = 1,toplm;
        out.print("Kombinasyon bulma programı.\nKombinasyon formülü C(n,r) = n! / (r! * (n-r)!)\nN kümesinin eleman sayısını giriniz : ");
        n = input.nextInt();
        out.print("R eleman sayısını giriniz : ");
        r = input.nextInt();
        for (int i=1 ; i <= n; i++) n2 *= i;
        for (int o=1 ; o <= r; o++) r2 *= o;
        for (int u=1 ; u <= (n-r); u++) cik *= u;
        c=n2/(r2*cik);
        out.print("C("+n+","+r+") Kombinasyonun cevabı : "+c);

    }
}
