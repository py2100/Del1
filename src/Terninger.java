//Class for terninger
public class Terninger {
    int terningSum;
    int sum;
    int temp1;
    int temp2;

    int temp1playersum =0;
    int temp2playersum = 0;
    //Her laves en konstrukter og gør det object.
    Terninger(int sum) {
    this.sum = terningSum;
    this.temp1 = temp1playersum;
    this.temp2 = temp2playersum;
    }
    public void rafelBaeger(int terningSum) {
            //temp1 = temp1playersum;
            sum = terningSum;
            int size = 6; //Størrelsen af vores random interval, Indeholder 0-5, hermed 6 cifre, hvori der består 0.

            int terning1 = (int) (Math.random()*size+1); //(+1) afrykker vores interval et tal over, så det er fra 1-6
            int terning2 = (int) (Math.random()*size+1);
            sum= terning1 + terning2;

        //temp1playersum = temp1 + terningSum;

        //System.out.println(temp1playersum);
          //  System.out.println(sum);

        //System.out.println(Temp1Sum);
        }


        public void player1 (int temp1playersum){
        temp1 += temp1playersum + sum;

            System.out.println(temp1);

        }
    public void player2 (int temp2playersum){
        temp2 += temp2playersum + sum;

        System.out.println(temp2);
    }
    }

