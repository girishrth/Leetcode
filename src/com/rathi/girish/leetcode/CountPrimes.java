package com.rathi.girish.leetcode;

public class CountPrimes {

	public static void main(String[] args) {
		System.out.println(countPrimes(1000000));
	}
	
	public static int countPrimes(int n) {
        boolean[] primes = new boolean[n +1];
        
        for(int i = 0 ; i <= n ; i++) {
        	primes[i] = true;
        }
        
        primes[0] = false;
        primes[1] = false;
        
        for(int i = 2 ; i * i <= n ; i++) {
        	if(primes[i]) {
        		for(int j = i ; i * j <= n ; j++) {
        			primes[j * i ] = false;
        		}
        	}	
        }
        
        int primeCounts = 0;
        for(int i = 2 ; i <= n ; i++) {
        	if(primes[i]) {
        		primeCounts++;
        	}
        }
        
        return primeCounts;
    }

}
