from typing import List

import dividend as dividend


def UserInput(name):
    name = input("Give me your name: ")
    print("Your name is " + name)


def isEven(num):
    if num % 2 == 0:
        print(num)
    else:
        print("this is odd")


def less_than_five(ltl):
    for x in ltl:
        if x < 5:
            print(x)
        elif x > 5:
            print(" this number does not belong in the list")
        else:
            print("void")


def divisor(lst):
    x = 10

    for i in lst:
        if i % x == 0:
            print("is a factor of x ")

        else:
            print(i)


#lst = [20, 30, 40, 66, 10, 11, 19, 100]
#divisor(lst)


def twoLists(lst1, lst2):
    target_one = []
    target_two = []
    for i in lst1:
        if i in lst2 and lst1:
            target_one.append(i)
        else:
            target_two.append(i)
    print(target_one)


lst1 = [1, 2, 3, 4, 5, 6, 77, 88, 99]
lst2 = [1, 3, 4, 5, 5, 9, 77, 88, 66]

twoLists(lst1, lst2)



