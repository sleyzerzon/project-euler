#!/usr/bin/python
# -*- coding: utf-8 -*-
# author : Arnaud Gourlay

def fibonaci(n):
    if (n <= 1):
        return 1
    else:
    	return fibonaci (n-1) + fibonaci (n-2)


def calculation():
    result = 0;
    n = 0;
    fib = 0;
    while(fib < 4000000):
        if (fib % 2 == 1):
            result = result + fib
        fib = fibonaci(n)
        n = n+1
        print "The sum of the even-valued terms considering the terms in the Fibonacci sequence whose values do not exceed four million is %s" %result

if __name__ == '__main__':
    calculation()
