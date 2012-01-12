#!/usr/bin/python
# -*- coding: utf-8 -*-
# author : Arnaud Gourlay

def calculation():
    result = 0
    for i in range (1,1000):
        if ( i%3 == 0 ) or ( i%5 == 0 ):
            result = result + i
    print "The sum of all the multiples of 3 or 5 below 1000 is %s" %result


if __name__ == '__main__':
    calculation()
