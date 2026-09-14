// Title: Count Primes
            // Difficulty: Medium
            // Language: Java
            // Link: https://leetcode.com/problems/count-primes/

        // isPrime[i] indicates whether i is prime

        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        // Sieve of Eratosthenes
        for (int i = 2; (long) i * i < n; i++) {
            if (isPrime[i]) {
