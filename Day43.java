//Techfest and the Queue
//A Techfest is underway, and each participant is given a ticket with a unique number. Organizers decide to award prize points to everyone who has a ticket ID between a and b (inclusive). The points given to a participant with ticket number x will be the sum of powers of the prime factors of x.
//For instance, if points are to be awarded to a participant with ticket number 12, the amount of points given out will be equal to the sum of powers in the prime factorization of 12 (2^2 × 3^1), which will be 2 + 1 = 3.

//Given a and b, determine the sum of all the points that will be awarded to the participants with ticket numbers between a and b (inclusive).

class Solution {
    public static long sumOfPowers(long a, long b) {
        // code here
        long sum = 0;
        for(long i = a; i<=b; i++) {
            sum+=findPrime(i, 0);
        }
        return sum;
    }
     
    public static long findPrime(long a, long temp) {
        long i = 2;
        while (i*i<=a && a>1) {
            if(a%i==0){
                a=a/i;
                temp++;
            }
            if(a%i!=0){
                i++;
            }
        }
        if(a!=1) {
            temp++;
        }
        return temp;
    }
}
